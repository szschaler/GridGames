/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.gridgames.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.szschaler.gridgames.services.GridGameGrammarAccess

class GridGameFormatter extends AbstractFormatter2 {
	
	@Inject extension GridGameGrammarAccess

	def dispatch void format(GridGame gridGame, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (globalCellStateSpec : gridGame.states) {
			globalCellStateSpec.format
		}
		for (cellSpecification : gridGame.cells) {
			cellSpecification.format
		}
		for (globalAction : gridGame.globalActions) {
			globalAction.format
		}
		for (globalFieldInitialisation : gridGame.inits) {
			globalFieldInitialisation.format
		}
		for (fieldSpecification : gridGame.fields) {
			fieldSpecification.format
		}
		for (optionSpecification : gridGame.options) {
			optionSpecification.format
		}
	}

	def dispatch void format(CellSpecification cellSpecification, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (cellMember : cellSpecification.members) {
			cellMember.format
		}
	}
	
	// TODO: implement for GlobalCellStateSpec, LocalCellStateSpec, CellStateSpecReference, CellState, TransitionSpec, ContextTrigger, GlobalAction, FieldSpecification, GlobalFieldInitialisation, FieldInitialisationsRef, LocalFieldInitialisations, ContextInitialisation, ContextExpression
}
