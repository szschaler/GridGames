/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.kcl.inf.zschaler.gridgames.services.GridGameGrammarAccess;

public class GridGameParser extends AbstractContentAssistParser {
	
	@Inject
	private GridGameGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser createParser() {
		uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser result = new uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOptionSpecificationAccess().getAlternatives(), "rule__OptionSpecification__Alternatives");
					put(grammarAccess.getGridGameAccess().getGroup(), "rule__GridGame__Group__0");
					put(grammarAccess.getFieldSpecificationAccess().getGroup(), "rule__FieldSpecification__Group__0");
					put(grammarAccess.getCellSpecificationAccess().getGroup(), "rule__CellSpecification__Group__0");
					put(grammarAccess.getGameSpecificationAccess().getGroup(), "rule__GameSpecification__Group__0");
					put(grammarAccess.getAllowRestartMenuAccess().getGroup(), "rule__AllowRestartMenu__Group__0");
					put(grammarAccess.getStartFieldDeclarationAccess().getGroup(), "rule__StartFieldDeclaration__Group__0");
					put(grammarAccess.getGridGameAccess().getFieldsAssignment_0(), "rule__GridGame__FieldsAssignment_0");
					put(grammarAccess.getGridGameAccess().getCellsAssignment_1(), "rule__GridGame__CellsAssignment_1");
					put(grammarAccess.getGridGameAccess().getField_initialisationAssignment_2(), "rule__GridGame__Field_initialisationAssignment_2");
					put(grammarAccess.getGridGameAccess().getGameAssignment_3(), "rule__GridGame__GameAssignment_3");
					put(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1(), "rule__FieldSpecification__NameAssignment_1");
					put(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5(), "rule__FieldSpecification__WidthAssignment_5");
					put(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_9(), "rule__FieldSpecification__HeightAssignment_9");
					put(grammarAccess.getCellSpecificationAccess().getNameAssignment_1(), "rule__CellSpecification__NameAssignment_1");
					put(grammarAccess.getGameSpecificationAccess().getOptionsAssignment_2(), "rule__GameSpecification__OptionsAssignment_2");
					put(grammarAccess.getStartFieldDeclarationAccess().getField_nameAssignment_2(), "rule__StartFieldDeclaration__Field_nameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser typedParser = (uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser) parser;
			typedParser.entryRuleGridGame();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GridGameGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GridGameGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}