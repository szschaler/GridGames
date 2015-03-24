/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.zschaler.gridgames.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GridGameGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GridGameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GridGame");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFieldsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFieldsFieldSpecificationParserRuleCall_0_0 = (RuleCall)cFieldsAssignment_0.eContents().get(0);
		private final Assignment cCellsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCellsCellSpecificationParserRuleCall_1_0 = (RuleCall)cCellsAssignment_1.eContents().get(0);
		private final Assignment cField_initialisationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cField_initialisationFieldInitialisationSpecificationParserRuleCall_2_0 = (RuleCall)cField_initialisationAssignment_2.eContents().get(0);
		private final Assignment cGameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGameGameSpecificationParserRuleCall_3_0 = (RuleCall)cGameAssignment_3.eContents().get(0);
		
		/// * 
		// * This language is meant to serve as a high-level modelling language for arcade-style games with a grid playing field
		// * 
		// * Just a bit of fun, really :-)
		// * 
		// * Initially, the main goal is to use this as a source for code generation, generating a complete implementation from a model-level description
		// * / GridGame:
		//	fields+=FieldSpecification+ cells+=CellSpecification+ field_initialisation= // Possibly cleverly tie this in with the field spec above?
		//	FieldInitialisationSpecification game=GameSpecification;
		@Override public ParserRule getRule() { return rule; }

		//fields+=FieldSpecification+ cells+=CellSpecification+ field_initialisation= // Possibly cleverly tie this in with the field spec above?
		//FieldInitialisationSpecification game=GameSpecification
		public Group getGroup() { return cGroup; }

		//fields+=FieldSpecification+
		public Assignment getFieldsAssignment_0() { return cFieldsAssignment_0; }

		//FieldSpecification
		public RuleCall getFieldsFieldSpecificationParserRuleCall_0_0() { return cFieldsFieldSpecificationParserRuleCall_0_0; }

		//cells+=CellSpecification+
		public Assignment getCellsAssignment_1() { return cCellsAssignment_1; }

		//CellSpecification
		public RuleCall getCellsCellSpecificationParserRuleCall_1_0() { return cCellsCellSpecificationParserRuleCall_1_0; }

		//field_initialisation= // Possibly cleverly tie this in with the field spec above?
		//FieldInitialisationSpecification
		public Assignment getField_initialisationAssignment_2() { return cField_initialisationAssignment_2; }

		//// Possibly cleverly tie this in with the field spec above?
		//FieldInitialisationSpecification
		public RuleCall getField_initialisationFieldInitialisationSpecificationParserRuleCall_2_0() { return cField_initialisationFieldInitialisationSpecificationParserRuleCall_2_0; }

		//game=GameSpecification
		public Assignment getGameAssignment_3() { return cGameAssignment_3; }

		//GameSpecification
		public RuleCall getGameGameSpecificationParserRuleCall_3_0() { return cGameGameSpecificationParserRuleCall_3_0; }
	}

	public class FieldSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FieldSpecification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cField_typeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cWidthKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cWidthAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cWidthINTTerminalRuleCall_5_0 = (RuleCall)cWidthAssignment_5.eContents().get(0);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cHeightKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cHeightAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cHeightINTTerminalRuleCall_9_0 = (RuleCall)cHeightAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//FieldSpecification:
		//	"field_type" name=ID "{" "width" "=" width=INT "," "height" "=" height=INT "}";
		@Override public ParserRule getRule() { return rule; }

		//"field_type" name=ID "{" "width" "=" width=INT "," "height" "=" height=INT "}"
		public Group getGroup() { return cGroup; }

		//"field_type"
		public Keyword getField_typeKeyword_0() { return cField_typeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"width"
		public Keyword getWidthKeyword_3() { return cWidthKeyword_3; }

		//"="
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }

		//width=INT
		public Assignment getWidthAssignment_5() { return cWidthAssignment_5; }

		//INT
		public RuleCall getWidthINTTerminalRuleCall_5_0() { return cWidthINTTerminalRuleCall_5_0; }

		//","
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }

		//"height"
		public Keyword getHeightKeyword_7() { return cHeightKeyword_7; }

		//"="
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }

		//height=INT
		public Assignment getHeightAssignment_9() { return cHeightAssignment_9; }

		//INT
		public RuleCall getHeightINTTerminalRuleCall_9_0() { return cHeightINTTerminalRuleCall_9_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class CellSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CellSpecification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCell_typeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CellSpecification:
		//	"cell_type" name=ID "{" //                         Provide cell type properties here...
		//	"}";
		@Override public ParserRule getRule() { return rule; }

		//"cell_type" name=ID "{" //                         Provide cell type properties here...
		//"}"
		public Group getGroup() { return cGroup; }

		//"cell_type"
		public Keyword getCell_typeKeyword_0() { return cCell_typeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		////                         Provide cell type properties here...
		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class GameSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GameSpecification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cOptionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOptionsOptionSpecificationParserRuleCall_2_0 = (RuleCall)cOptionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//GameSpecification:
		//	"game" "{" options+=OptionSpecification+ "}";
		@Override public ParserRule getRule() { return rule; }

		//"game" "{" options+=OptionSpecification+ "}"
		public Group getGroup() { return cGroup; }

		//"game"
		public Keyword getGameKeyword_0() { return cGameKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//options+=OptionSpecification+
		public Assignment getOptionsAssignment_2() { return cOptionsAssignment_2; }

		//OptionSpecification
		public RuleCall getOptionsOptionSpecificationParserRuleCall_2_0() { return cOptionsOptionSpecificationParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class OptionSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OptionSpecification");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStartFieldDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAllowRestartMenuParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//OptionSpecification:
		//	StartFieldDeclaration | AllowRestartMenu;
		@Override public ParserRule getRule() { return rule; }

		//StartFieldDeclaration | AllowRestartMenu
		public Alternatives getAlternatives() { return cAlternatives; }

		//StartFieldDeclaration
		public RuleCall getStartFieldDeclarationParserRuleCall_0() { return cStartFieldDeclarationParserRuleCall_0; }

		//AllowRestartMenu
		public RuleCall getAllowRestartMenuParserRuleCall_1() { return cAllowRestartMenuParserRuleCall_1; }
	}

	public class AllowRestartMenuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AllowRestartMenu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAllow_restartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cAllowRestartMenuAction_1 = (Action)cGroup.eContents().get(1);
		
		//AllowRestartMenu:
		//	"allow_restart" {AllowRestartMenu};
		@Override public ParserRule getRule() { return rule; }

		//"allow_restart" {AllowRestartMenu}
		public Group getGroup() { return cGroup; }

		//"allow_restart"
		public Keyword getAllow_restartKeyword_0() { return cAllow_restartKeyword_0; }

		//{AllowRestartMenu}
		public Action getAllowRestartMenuAction_1() { return cAllowRestartMenuAction_1; }
	}

	public class StartFieldDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StartFieldDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cField_nameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cField_nameIDTerminalRuleCall_2_0 = (RuleCall)cField_nameAssignment_2.eContents().get(0);
		
		//StartFieldDeclaration:
		//	"start" "=" field_name=ID;
		@Override public ParserRule getRule() { return rule; }

		//"start" "=" field_name=ID
		public Group getGroup() { return cGroup; }

		//"start"
		public Keyword getStartKeyword_0() { return cStartKeyword_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//field_name=ID
		public Assignment getField_nameAssignment_2() { return cField_nameAssignment_2; }

		//ID
		public RuleCall getField_nameIDTerminalRuleCall_2_0() { return cField_nameIDTerminalRuleCall_2_0; }
	}

	public class FieldInitialisationSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FieldInitialisationSpecification");
		private final Keyword cINITKeyword = (Keyword)rule.eContents().get(1);
		
		//FieldInitialisationSpecification:
		//	"INIT";
		@Override public ParserRule getRule() { return rule; }

		//"INIT"
		public Keyword getINITKeyword() { return cINITKeyword; }
	}
	
	
	private final GridGameElements pGridGame;
	private final FieldSpecificationElements pFieldSpecification;
	private final CellSpecificationElements pCellSpecification;
	private final GameSpecificationElements pGameSpecification;
	private final OptionSpecificationElements pOptionSpecification;
	private final AllowRestartMenuElements pAllowRestartMenu;
	private final StartFieldDeclarationElements pStartFieldDeclaration;
	private final FieldInitialisationSpecificationElements pFieldInitialisationSpecification;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GridGameGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGridGame = new GridGameElements();
		this.pFieldSpecification = new FieldSpecificationElements();
		this.pCellSpecification = new CellSpecificationElements();
		this.pGameSpecification = new GameSpecificationElements();
		this.pOptionSpecification = new OptionSpecificationElements();
		this.pAllowRestartMenu = new AllowRestartMenuElements();
		this.pStartFieldDeclaration = new StartFieldDeclarationElements();
		this.pFieldInitialisationSpecification = new FieldInitialisationSpecificationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.inf.zschaler.gridgames.GridGame".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// * 
	// * This language is meant to serve as a high-level modelling language for arcade-style games with a grid playing field
	// * 
	// * Just a bit of fun, really :-)
	// * 
	// * Initially, the main goal is to use this as a source for code generation, generating a complete implementation from a model-level description
	// * / GridGame:
	//	fields+=FieldSpecification+ cells+=CellSpecification+ field_initialisation= // Possibly cleverly tie this in with the field spec above?
	//	FieldInitialisationSpecification game=GameSpecification;
	public GridGameElements getGridGameAccess() {
		return pGridGame;
	}
	
	public ParserRule getGridGameRule() {
		return getGridGameAccess().getRule();
	}

	//FieldSpecification:
	//	"field_type" name=ID "{" "width" "=" width=INT "," "height" "=" height=INT "}";
	public FieldSpecificationElements getFieldSpecificationAccess() {
		return pFieldSpecification;
	}
	
	public ParserRule getFieldSpecificationRule() {
		return getFieldSpecificationAccess().getRule();
	}

	//CellSpecification:
	//	"cell_type" name=ID "{" //                         Provide cell type properties here...
	//	"}";
	public CellSpecificationElements getCellSpecificationAccess() {
		return pCellSpecification;
	}
	
	public ParserRule getCellSpecificationRule() {
		return getCellSpecificationAccess().getRule();
	}

	//GameSpecification:
	//	"game" "{" options+=OptionSpecification+ "}";
	public GameSpecificationElements getGameSpecificationAccess() {
		return pGameSpecification;
	}
	
	public ParserRule getGameSpecificationRule() {
		return getGameSpecificationAccess().getRule();
	}

	//OptionSpecification:
	//	StartFieldDeclaration | AllowRestartMenu;
	public OptionSpecificationElements getOptionSpecificationAccess() {
		return pOptionSpecification;
	}
	
	public ParserRule getOptionSpecificationRule() {
		return getOptionSpecificationAccess().getRule();
	}

	//AllowRestartMenu:
	//	"allow_restart" {AllowRestartMenu};
	public AllowRestartMenuElements getAllowRestartMenuAccess() {
		return pAllowRestartMenu;
	}
	
	public ParserRule getAllowRestartMenuRule() {
		return getAllowRestartMenuAccess().getRule();
	}

	//StartFieldDeclaration:
	//	"start" "=" field_name=ID;
	public StartFieldDeclarationElements getStartFieldDeclarationAccess() {
		return pStartFieldDeclaration;
	}
	
	public ParserRule getStartFieldDeclarationRule() {
		return getStartFieldDeclarationAccess().getRule();
	}

	//FieldInitialisationSpecification:
	//	"INIT";
	public FieldInitialisationSpecificationElements getFieldInitialisationSpecificationAccess() {
		return pFieldInitialisationSpecification;
	}
	
	public ParserRule getFieldInitialisationSpecificationRule() {
		return getFieldInitialisationSpecificationAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}