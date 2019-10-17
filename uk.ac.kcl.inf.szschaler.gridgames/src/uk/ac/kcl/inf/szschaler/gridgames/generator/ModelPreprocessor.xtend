package uk.ac.kcl.inf.szschaler.gridgames.generator

import java.util.Collections
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellDisplaySpec
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellState
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellStateSpec
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellStateSpecReference
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.FieldInitialisation
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.FieldInitialisationsRef
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.FieldSpecification
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.LocalCellStateSpec
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.LocalFieldInitialisations
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.Value
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.ContextTrigger
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GenerationalContexts

/**
 * Preprocesses the model, normalising structures and computing helper data such as unique cell state IDs.
 */
class ModelPreprocessor {

	val GridGame gg
	val Map<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> cellStateRegistry = new HashMap<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>()
	var int currentStateID = 0

	new(Resource resource) {
		gg = resource.allContents.filter(GridGame).head		

		preprocess()
	}

	private def preprocess() {
		gg.cells.forEach [ c |
			c.normalizeDisplayAnnotation

			c.extractCellStates.forEach [ cs |
				cs.createUniqueID(c)
			]
		]
	}

	def getGridGame() {
		gg
	}

	/**
	 * Creates a unique ID for the combination of cell and cell state, also enabling future clients to access the symbol table through this.
	 */
	private def createUniqueID(Pair<? extends Map<String, Value>, CellState> stateDef, CellSpecification c) {
		var List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> states = cellStateRegistry.get (c)
		if (states === null) {
			states = new LinkedList<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>()
			cellStateRegistry.put (c, states)
		}
		
		states.add (new Pair(stateDef.value, new Pair<Integer, Map<String, Value>>(currentStateID++, stateDef.key)))
	}

	/**
	 * Normalize display annotations for this cell specification. If there are no states, 
	 * but a display annotation, create an artifical default state moving the display annotation 
	 * over.
	 * 
	 * TODO Eventually might want to enable sharing of display annotations between a number of states.
	 */
	private def void normalizeDisplayAnnotation(CellSpecification c) {
		if ((c.members.filter(CellStateSpec).empty) && (!c.members.filter(CellDisplaySpec).empty)) {
			// Create a new state spec and move the display spec over
			// TODO: There must be a simpler way of doing this
			var stateSpec = gg.eClass.EPackage.EFactoryInstance.create(gg.eClass.EPackage.EClassifiers.findFirst [ ec |
				ec.name.equals("LocalCellStateSpec")
			] as EClass) as LocalCellStateSpec
			var dummyState = gg.eClass.EPackage.EFactoryInstance.create(gg.eClass.EPackage.EClassifiers.findFirst [ ec |
				ec.name.equals("CellState")
			] as EClass) as CellState
			dummyState.name = "default";
			stateSpec.states.add(dummyState)
			c.members.add(stateSpec)
			dummyState.display = c.members.filter(CellDisplaySpec).findFirst[true]
			stateSpec.start = dummyState
		}
	}
	
	/**
	 * Analyse cell state definition and extract a list of cell-state symbol-table mappings for the given cell specification
	 */
	private def extractCellStates(CellSpecification c) {
		c.members.filter(CellStateSpec).map[css|css.allStates].flatten
	}

	private def dispatch List<Pair<? extends Map<String, Value>, CellState>> getAllStates(LocalCellStateSpec lcss) {
		val symbols = Collections.emptyMap;
		lcss.states.map[s|new Pair(symbols, s)]
	}

	private def dispatch List<Pair<? extends Map<String, Value>, CellState>> getAllStates(CellStateSpecReference cssr) {
		val symbols = new HashMap<String, Value>()
		// Put params into symbol table
		val iter = cssr.params.iterator
		cssr.stateSpec.params.forEach [ p |
			// TODO Should do a type check here
			symbols.put(p.name, iter.next)
		]
		cssr.stateSpec.states.map[s|new Pair(symbols, s)]
	}

	// May at some point need to rethink this, depending on how parametrisation continues...
	dispatch def CellState getStartState(CellSpecification c) {
		c.members.filter(CellStateSpec).map[css|css.startState].findFirst[true]
	}

	def dispatch CellState getStartState(LocalCellStateSpec lcss) {
		lcss.start
	}

	def dispatch CellState getStartState(CellStateSpecReference cssr) {
		cssr.stateSpec.start
	}
	
	def Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getCellStates (CellSpecification c) {
		cellStateRegistry.get(c)
	}
	
	def Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getAllCellStates () {
		cellStateRegistry.values.flatten
	}
	
	/**
	 * Find all states with an onEnter action. 
	 * 
	 * TODO Eventually need to take into account parametrisation of behaviours.
	 */
	def getAllStatesWithEnterActions () {
		cellStateRegistry.values.flatten.filter[cpp | ! cpp.key.onEnter.empty]
	}

	/**
	 * Find all states with a transition triggered by context changes
	 */	
	def getAllStatesWithContextTriggers() {
		cellStateRegistry.entrySet.map[pp |
			pp.value.map[p |
				new Pair (pp.key, p)
			]]
		.flatten
		.filter[p |
			p.value.key.transitions.exists[t | t.trigger instanceof ContextTrigger]]
	}
	
	var Map<FieldSpecification, List<Pair<Map<String, Value>, FieldInitialisation>>> fieldInitialisations; 
	
	def List<Pair<Map<String, Value>, FieldInitialisation>> allInitialisations (FieldSpecification fs) {
		if (fieldInitialisations === null) {
			initialiseFieldInitialisations()
		}
		
		fieldInitialisations.get (fs)
	}
	
	private def initialiseFieldInitialisations() {
		fieldInitialisations = new HashMap<FieldSpecification, List<Pair<Map<String, Value>, FieldInitialisation>>>()
		
		gg.fields.forEach[f | fieldInitialisations.put (f, f.field_initialisation.getAllInitialisations)]
	}
	
	private def dispatch List<Pair<Map<String, Value>, FieldInitialisation>> getAllInitialisations (LocalFieldInitialisations lfi) {
		val symbols = Collections.emptyMap
		
		lfi.initialisations.map[i | new Pair (symbols, i)]
	}
	
	private def dispatch List<Pair<Map<String, Value>, FieldInitialisation>> getAllInitialisations (FieldInitialisationsRef fir) {
		val Map<String, Value> symbols = new HashMap<String, Value>()

		// Put params into symbol table		
		fir.ref.params.forEach[p, idx | 
			// TODO Should do a type check here
			symbols.put (p.name, fir.params.get(idx))
		]

		fir.ref.initialisations.map[i | new Pair(symbols, i)]
	}
	
	/**
	 * Return true if generational context updates should be generated rather than incremental, reactive ones
	 */
	def doGenerateGenerationalContexts() {
		return gg.options.exists[o | o instanceof GenerationalContexts]
	}
}
