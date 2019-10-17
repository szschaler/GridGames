/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.gridgames.scoping

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellState
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GridGamePackage
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.StateFilterExpression

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class GridGameScopeProvider extends AbstractDeclarativeScopeProvider {
	override IScope getScope(EObject context, EReference reference) {
		if (reference.EReferenceType == GridGamePackage.Literals.CELL_SPECIFICATION) {
			// All references to cell specifications, no matter where, always see all the cell specifications in the model
			var EObject rootElement = EcoreUtil2.getRootContainer(context);
			var List<? extends EObject> candidates = EcoreUtil2.getAllContentsOfType(rootElement, CellSpecification);
			return Scopes.scopeFor(candidates);
		} else {
			return super.getScope(context, reference);
		}
	}

	def IScope scope_StateFilterExpression_cell_state(StateFilterExpression sfe, EReference reference) {
		var EObject rootElement = EcoreUtil2.getRootContainer(sfe);
		var List<? extends EObject> candidates = EcoreUtil2.getAllContentsOfType(rootElement, CellState);
		return Scopes.scopeFor(candidates);
	}
}