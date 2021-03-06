/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.gridgames.validation

import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellState
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.ContextTrigger
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GenerationalContexts
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GlobalCellStateSpec
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GridGamePackage
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.LocalCellStateSpec
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.TransitionSpec

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GridGameValidator extends AbstractGridGameValidator {

	@Check(NORMAL)
	def checkNoUnreachableStates(LocalCellStateSpec statesSpec) {
		checkReachability(statesSpec.start, statesSpec.states)
	}

	@Check(NORMAL)
	def checkNoUnreachableStates(GlobalCellStateSpec statesSpec) {
		checkReachability(statesSpec.start, statesSpec.states)
	}

	private def checkReachability(CellState startState, List<CellState> states) {
		val reachableFrom = new HashMap<CellState, Set<CellState>>

		states.forEach [ s1 |
			reachableFrom.put(s1, states.filter[s2|s2.transitions.exists[target === s1]].toSet)
		]

		val transitiveReachable = reachableFrom.computeTransitiveClosure()

		transitiveReachable.filter[s, canReachFrom|(s !== startState) && !canReachFrom.contains(startState)].forEach [ s, reachFrom |
			warning("This state " + s.name + " cannot be reached", startState.eContainer, startState.eContainingFeature,
				(startState.eContainer.eGet(startState.eContainingFeature) as List<CellState>).indexOf(s),
				"unreachable_state_warning")
		]
	}

	private def computeTransitiveClosure(Map<CellState, Set<CellState>> reachableFrom) {
		var result = new HashMap(reachableFrom)
		var current = reachableFrom

		do {
			current = new HashMap(result)
			val cur = current
			result.values.forEach [ srcSet |
				srcSet.addAll(new HashSet(srcSet.flatMap[s2|cur.get(s2)].toSet))
			]
		} while (!current.equals(result))

		result
	}

	@Check
	def checkRecursiveContextTriggers(TransitionSpec ts) {
		if (!ts.eResource.allContents.exists[o|o instanceof GenerationalContexts]) {
			// Check for potential recursive transitions
			// TODO This is a very simplistic heuristic. Really should do full transitive closure cycle analysis
			// TODO This doesn't work well with parametrised states
			if (ts.trigger instanceof ContextTrigger) {
				if (ts.target.transitions.exists [ t |
					(t.trigger instanceof ContextTrigger) && (t.target == (ts.eContainer as CellState))
				]) {
					warning("You may need to check for potential recursive context triggers.",
						GridGamePackage.Literals.TRANSITION_SPEC__TRIGGER, "recursiveContextTrigger")
				}
			}
		}
	}
}
