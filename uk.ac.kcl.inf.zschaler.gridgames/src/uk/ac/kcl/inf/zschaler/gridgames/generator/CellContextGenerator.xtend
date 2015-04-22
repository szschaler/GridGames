package uk.ac.kcl.inf.zschaler.gridgames.generator

import java.util.Set
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression

class CellContextGenerator extends CommonGenerator {

	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	public def generateCellContext() {		
		if (needContextGeneration) {
			// Generate helper functions for context initialisation
			'''
				private CellContext getContextAt (int x, int y) {
					return new CellContext(x, y);
				}
				
				private class CellContext implements Iterable<CellContext.ContextElement> {
					public class ContextElement {
						private Cell cell;
						private int dx, dy;
						
						public ContextElement (int dx, int dy, Cell cell) {
							this.dx = dx; this.dy = dy;
							this.cell = cell;
						}
						
						public Cell getCell() {
							return cell;
						}
						
						public CellContext getContextHere() {
							return getContextAt (x + dx, y + dy);
						}
						
						public int getRow() {
							return y + dy;
						}
						
						public int getCol() {
							return x + dx;
						}
					}
					
					private ArrayList<ContextElement> al = new ArrayList<> (8);
					private int x, y; 
					
					public CellContext (int x, int y) {
						this.x = x; this.y = y;
						
						for (int dx = -1; dx <= 1; dx ++) {
							for (int dy = -1; dy <= 1; dy++) {
								if (((dx != 0) || (dy != 0)) && 
								    ((x + dx >= 0) && (x + dx < width)) &&
								    ((y + dy >= 0) && (y + dy < height)) &&
								    (field[x + dx][y + dy] != null)) {
									al.add (new ContextElement (dx, dy, field[x + dx][y + dy]));
								}
							}
						}
					}
					
					public Iterator<ContextElement> iterator() {
						return al.iterator();
					}
					
					«// Slightly annoyingly have to convert the CharSequences into Strings here to make
		 					 // sure the equality check in toSet works
					 gg.contextExpInvocations.map[e | e.generateImplementation.toString].toSet.join(" ")»
				}
			'''
		}
	}
	
	private def needContextGeneration() {
		(gg.fields.exists[f|mpp.allInitialisations(f).exists[i|i.value instanceof ContextInitialisation]]) ||
		(!mpp.allStatesWithContextTriggers.empty)
	}

	def getContextExpInvocations(GridGame gg) {
		var contextExpInvs = gg.fields.map [ f |
			mpp.allInitialisations(f).filter[p|p.value instanceof ContextInitialisation].map [ cip |
				val ci = cip.value as ContextInitialisation
				var checkExps = ci.check.sub_exp
				var valExps = ci.exp.sub_exp
				checkExps.toList.addAll(valExps)
				checkExps
			].flatten
		].flatten.toList

		contextExpInvs.addAll(mpp.allCellStates.map [ csp |
			csp.key.transitions.filter[t|t.trigger instanceof ContextTrigger].map [t |
				(t.trigger as ContextTrigger).exp.sub_exp
			].flatten
		].flatten)

		contextExpInvs
	}
	
	def dispatch generateImplementation(FilterExpression fe) '''
		public CellContext filter«fe.cell_type.name.toFirstUpper»() {
			ArrayList<ContextElement> newAL = new ArrayList<>();
			
			for (ContextElement c : al) {
				if (c.getCell().is«fe.cell_type.name.toFirstUpper»()) {
					newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
	'''

	def dispatch generateImplementation(StateFilterExpression sfe) '''
		public CellContext inState«sfe.cell_state.name.toFirstUpper»() {
			ArrayList<ContextElement> newAL = new ArrayList<>();
			
			for (ContextElement c : al) {
				switch (c.getCell().getState().getStateID()) {
					«mpp.allCellStates.filter[cpp | cpp.key == sfe.cell_state].join ("\n", [cpp | '''case «cpp.value.key»: '''])»
						newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
	'''

	def dispatch generateImplementation(NotEmptyExpression nee) '''
		public boolean notEmpty() {
			return al.size() > 0;
		}
	'''

	def dispatch generateImplementation(CountExpression ce) '''
		public int size() {
			return al.size();
		}
	'''
	
	/**
	 * Add required imports to the set given
	 */
	def addImports(Set<String> imports) {
		if (needContextGeneration) {
			imports.add("java.util.ArrayList")
			imports.add("java.util.Iterator")
		}
	}
	
}