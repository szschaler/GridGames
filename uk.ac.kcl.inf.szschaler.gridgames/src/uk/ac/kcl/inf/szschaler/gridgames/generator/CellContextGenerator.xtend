package uk.ac.kcl.inf.szschaler.gridgames.generator

import java.util.Set
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.ContextInitialisation
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.ContextTrigger
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CountExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.EmptyExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.FilterExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.NotEmptyExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.StateFilterExpression

class CellContextGenerator extends CommonGenerator {

	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	def generateCellContext() {		
		if (needContextGeneration) {
			// Generate helper functions for context initialisation
			'''
				private CellContext getContextAt (int x, int y) {
					return new LocalCellContext(x, y);
				}
				
				public CellContext getGlobalContext() {
					return new GlobalCellContext();
				}
				
				«generateCellContextIntf»
				
				«generateAbstractCellContext»
				
				«generateLocalCellContext»
				
				«generateGlobalCellContext»
			'''
		}
	}
	
	def generateCellContextIntf() '''
		public interface CellContext extends Iterable<CellContext.ContextElement> {
			public interface ContextElement {
				public Cell getCell();
				public CellContext getContextHere();
				public int getRow();
				public int getCol();
			}
			
			/*
			 * Not ideal, should really be defined in AbstractCellContext, but Java won't let me do that...
			 */
			public interface ContextCreationStrategy {
				public List<ContextElement> getContextElements(CellContext context);
			}
			
			«
			// Need to convert to string so that comparison in toSet works correctly
			gg.contextExpInvocations.map[e | e.generateSignature.toString].toSet.join("\n")»
		}
	'''
	
	def generateAbstractCellContext() '''
		public abstract class AbstractCellContext implements CellContext {
			private List<CellContext.ContextElement> al;
			
			public AbstractCellContext (ContextCreationStrategy ccs) {
				this.al = ccs.getContextElements(this);
			}
			
			public Iterator<CellContext.ContextElement> iterator() {
				return al.iterator();
			}
			
			« // Slightly annoyingly have to convert the CharSequences into Strings here to make sure the equality check in toSet works
			 gg.contextExpInvocations.map[e | e.generateImplementation.toString].toSet.join(" ")»
		}
	'''
	
	def generateLocalCellContext() '''
		public class LocalCellContext extends AbstractCellContext {
			public class ContextElement implements CellContext.ContextElement {
				private Cell cell;
				private int x, y;
				
				public ContextElement (int x, int y, Cell cell) {
					this.x = x; this.y = y;
					this.cell = cell;
				}
				
				@Override
				public Cell getCell() {
					return cell;
				}
				
				@Override
				public CellContext getContextHere() {
					return getContextAt (x, y);
				}
				
				@Override
				public int getRow() {
					return y;
				}
				
				@Override
				public int getCol() {
					return x;
				}
			}
			
			public LocalCellContext (final int x, final int y) {
				super (new ContextCreationStrategy() {
					
					@Override
					public List<CellContext.ContextElement> getContextElements(CellContext context) {
						ArrayList<CellContext.ContextElement> al = new ArrayList<>(8);
						
						for (int dx = -1; dx <= 1; dx ++) {
							for (int dy = -1; dy <= 1; dy++) {
								if (((dx != 0) || (dy != 0)) && 
								    ((x + dx >= 0) && (x + dx < width)) &&
								    ((y + dy >= 0) && (y + dy < height)) &&
								    (field[x + dx][y + dy] != null)) {
									al.add (((LocalCellContext) context).new ContextElement (x + dx, y + dy, field[x + dx][y + dy]));
								}
							}
						}
						
						return al;
					}
				});
			}
		}
	'''

	def generateGlobalCellContext() '''
		public class GlobalCellContext extends AbstractCellContext {
			public class ContextElement implements CellContext.ContextElement {
				private Cell cell;
				private int x, y;
				
				public ContextElement (int x, int y, Cell cell) {
					this.x = x; this.y = y;
					this.cell = cell;
				}
				
				@Override
				public Cell getCell() {
					return cell;
				}
				
				@Override
				public CellContext getContextHere() {
					return getContextAt (x, y);
				}
				
				@Override
				public int getRow() {
					return y;
				}
				
				@Override
				public int getCol() {
					return x;
				}
			}
			
			public GlobalCellContext() {
				super (new ContextCreationStrategy() {
					
					@Override
					public List<CellContext.ContextElement> getContextElements(CellContext context) {
						ArrayList<CellContext.ContextElement> al = new ArrayList<>(width * height);
						
						for (int x = 0; x < width; x ++) {
							for (int y = 0; y < height; y++) {
								al.add (((GlobalCellContext) context).new ContextElement (x, y, field[x][y]));
							}
						}
						
						return al;
					}
				});
			}
		}
	'''

	private def needContextGeneration() {
		(gg.fields.exists[f|mpp.allInitialisations(f).exists[i|i.value instanceof ContextInitialisation]]) ||
		(!mpp.allStatesWithContextTriggers.empty) ||
		(!gg.globalActions.empty)
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

		contextExpInvs.addAll(gg.globalActions.map [ga | 
			ga.trigger.sub_exp
		].flatten)

		contextExpInvs
	}
	
	def dispatch generateImplementation(FilterExpression fe) '''
		@Override
		public CellContext «fe.generateMethodName»() {
			ArrayList<CellContext.ContextElement> newAL = new ArrayList<>();
			
			for (CellContext.ContextElement c : al) {
				if («fe.cell_type.join ("||", [ct | '''(c.getCell().is«ct.name.toFirstUpper»())'''])») {
					newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
	'''

	def dispatch generateImplementation(StateFilterExpression sfe) '''
		@Override
		public CellContext «sfe.generateMethodName»() {
			ArrayList<CellContext.ContextElement> newAL = new ArrayList<>();
			
			for (CellContext.ContextElement c : al) {
				switch (c.getCell().getState().getStateID()) {
					«mpp.allCellStates.filter[cpp | sfe.cell_state.contains(cpp.key)].join ("\n", [cpp | '''case «cpp.value.key»: '''])»
						newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
	'''

	def dispatch generateImplementation(NotEmptyExpression nee) '''
		@Override
		public boolean notEmpty() {
			return al.size() > 0;
		}
	'''

	def dispatch generateImplementation(EmptyExpression nee) '''
		@Override
		public boolean empty() {
			return al.size() == 0;
		}
	'''

	def dispatch generateImplementation(CountExpression ce) '''
		@Override
		public int size() {
			return al.size();
		}
	'''
	
	def dispatch generateSignature(FilterExpression fe) '''public CellContext «fe.generateMethodName»();'''

	def dispatch generateSignature(StateFilterExpression sfe) '''public CellContext «sfe.generateMethodName»();'''

	def dispatch generateSignature(NotEmptyExpression nee) '''public boolean notEmpty();'''

	def dispatch generateSignature(EmptyExpression nee) '''public boolean empty();'''

	def dispatch generateSignature(CountExpression ce) '''public int size();'''

	/**
	 * Add required imports to the set given
	 */
	def addImports(Set<String> imports) {
		if (needContextGeneration) {
			imports.add("java.util.ArrayList")
			imports.add("java.util.List")
			imports.add("java.util.Iterator")
		}
	}
	
}
