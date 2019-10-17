package uk.ac.kcl.inf.zschaler.gridgames.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.zschaler.gridgames.services.GridGameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGridGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'cell'", "'display'", "'as'", "'label'", "'button'", "'text'", "'var'", "'color'", "'black'", "'white'", "'yellow'", "'red'", "'green'", "'int'", "'String'", "'states'", "'('", "','", "')'", "'start'", "'='", "'Behaviour'", "'transitions'", "'onEnter'", "'on'", "'goto'", "'mouse-left'", "'mouse-right'", "'context'", "'end-game'", "'nop'", "'action'", "'when'", "'do'", "'field'", "'width'", "'height'", "'allow_restart'", "'contextsTriggerGenerationally'", "'init'", "';'", "'default'", "':'", "'random'", "'check'", "'value'", "'.'", "'filter'", "'|'", "'inState'", "'count'", "'=='", "'>'", "'<'", "'notEmpty'", "'empty'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGridGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGridGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGridGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGridGame.g"; }



     	private GridGameGrammarAccess grammarAccess;
     	
        public InternalGridGameParser(TokenStream input, GridGameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GridGame";	
       	}
       	
       	@Override
       	protected GridGameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGridGame"
    // InternalGridGame.g:67:1: entryRuleGridGame returns [EObject current=null] : iv_ruleGridGame= ruleGridGame EOF ;
    public final EObject entryRuleGridGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridGame = null;


        try {
            // InternalGridGame.g:68:2: (iv_ruleGridGame= ruleGridGame EOF )
            // InternalGridGame.g:69:2: iv_ruleGridGame= ruleGridGame EOF
            {
             newCompositeNode(grammarAccess.getGridGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGridGame=ruleGridGame();

            state._fsp--;

             current =iv_ruleGridGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGridGame"


    // $ANTLR start "ruleGridGame"
    // InternalGridGame.g:76:1: ruleGridGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleGlobalCellStateSpec ) ) | ( (lv_cells_4_0= ruleCellSpecification ) ) | ( (lv_globalActions_5_0= ruleGlobalAction ) ) | ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) ) | ( (lv_fields_7_0= ruleFieldSpecification ) ) | ( (lv_options_8_0= ruleOptionSpecification ) ) )+ otherlv_9= '}' ) ;
    public final EObject ruleGridGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_states_3_0 = null;

        EObject lv_cells_4_0 = null;

        EObject lv_globalActions_5_0 = null;

        EObject lv_inits_6_0 = null;

        EObject lv_fields_7_0 = null;

        EObject lv_options_8_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:79:28: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleGlobalCellStateSpec ) ) | ( (lv_cells_4_0= ruleCellSpecification ) ) | ( (lv_globalActions_5_0= ruleGlobalAction ) ) | ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) ) | ( (lv_fields_7_0= ruleFieldSpecification ) ) | ( (lv_options_8_0= ruleOptionSpecification ) ) )+ otherlv_9= '}' ) )
            // InternalGridGame.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleGlobalCellStateSpec ) ) | ( (lv_cells_4_0= ruleCellSpecification ) ) | ( (lv_globalActions_5_0= ruleGlobalAction ) ) | ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) ) | ( (lv_fields_7_0= ruleFieldSpecification ) ) | ( (lv_options_8_0= ruleOptionSpecification ) ) )+ otherlv_9= '}' )
            {
            // InternalGridGame.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleGlobalCellStateSpec ) ) | ( (lv_cells_4_0= ruleCellSpecification ) ) | ( (lv_globalActions_5_0= ruleGlobalAction ) ) | ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) ) | ( (lv_fields_7_0= ruleFieldSpecification ) ) | ( (lv_options_8_0= ruleOptionSpecification ) ) )+ otherlv_9= '}' )
            // InternalGridGame.g:80:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_states_3_0= ruleGlobalCellStateSpec ) ) | ( (lv_cells_4_0= ruleCellSpecification ) ) | ( (lv_globalActions_5_0= ruleGlobalAction ) ) | ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) ) | ( (lv_fields_7_0= ruleFieldSpecification ) ) | ( (lv_options_8_0= ruleOptionSpecification ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getGridGameAccess().getGameKeyword_0());
                
            // InternalGridGame.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalGridGame.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGridGame.g:85:1: (lv_name_1_0= RULE_ID )
            // InternalGridGame.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGridGameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalGridGame.g:106:1: ( ( (lv_states_3_0= ruleGlobalCellStateSpec ) ) | ( (lv_cells_4_0= ruleCellSpecification ) ) | ( (lv_globalActions_5_0= ruleGlobalAction ) ) | ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) ) | ( (lv_fields_7_0= ruleFieldSpecification ) ) | ( (lv_options_8_0= ruleOptionSpecification ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 45:
                    {
                    alt1=3;
                    }
                    break;
                case 53:
                    {
                    alt1=4;
                    }
                    break;
                case 48:
                    {
                    alt1=5;
                    }
                    break;
                case 33:
                case 51:
                case 52:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalGridGame.g:106:2: ( (lv_states_3_0= ruleGlobalCellStateSpec ) )
            	    {
            	    // InternalGridGame.g:106:2: ( (lv_states_3_0= ruleGlobalCellStateSpec ) )
            	    // InternalGridGame.g:107:1: (lv_states_3_0= ruleGlobalCellStateSpec )
            	    {
            	    // InternalGridGame.g:107:1: (lv_states_3_0= ruleGlobalCellStateSpec )
            	    // InternalGridGame.g:108:3: lv_states_3_0= ruleGlobalCellStateSpec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getStatesGlobalCellStateSpecParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_states_3_0=ruleGlobalCellStateSpec();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_3_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.GlobalCellStateSpec");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGridGame.g:125:6: ( (lv_cells_4_0= ruleCellSpecification ) )
            	    {
            	    // InternalGridGame.g:125:6: ( (lv_cells_4_0= ruleCellSpecification ) )
            	    // InternalGridGame.g:126:1: (lv_cells_4_0= ruleCellSpecification )
            	    {
            	    // InternalGridGame.g:126:1: (lv_cells_4_0= ruleCellSpecification )
            	    // InternalGridGame.g:127:3: lv_cells_4_0= ruleCellSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_cells_4_0=ruleCellSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cells",
            	            		lv_cells_4_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.CellSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGridGame.g:144:6: ( (lv_globalActions_5_0= ruleGlobalAction ) )
            	    {
            	    // InternalGridGame.g:144:6: ( (lv_globalActions_5_0= ruleGlobalAction ) )
            	    // InternalGridGame.g:145:1: (lv_globalActions_5_0= ruleGlobalAction )
            	    {
            	    // InternalGridGame.g:145:1: (lv_globalActions_5_0= ruleGlobalAction )
            	    // InternalGridGame.g:146:3: lv_globalActions_5_0= ruleGlobalAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getGlobalActionsGlobalActionParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_globalActions_5_0=ruleGlobalAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"globalActions",
            	            		lv_globalActions_5_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.GlobalAction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGridGame.g:163:6: ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) )
            	    {
            	    // InternalGridGame.g:163:6: ( (lv_inits_6_0= ruleGlobalFieldInitialisation ) )
            	    // InternalGridGame.g:164:1: (lv_inits_6_0= ruleGlobalFieldInitialisation )
            	    {
            	    // InternalGridGame.g:164:1: (lv_inits_6_0= ruleGlobalFieldInitialisation )
            	    // InternalGridGame.g:165:3: lv_inits_6_0= ruleGlobalFieldInitialisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getInitsGlobalFieldInitialisationParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_inits_6_0=ruleGlobalFieldInitialisation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inits",
            	            		lv_inits_6_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.GlobalFieldInitialisation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalGridGame.g:182:6: ( (lv_fields_7_0= ruleFieldSpecification ) )
            	    {
            	    // InternalGridGame.g:182:6: ( (lv_fields_7_0= ruleFieldSpecification ) )
            	    // InternalGridGame.g:183:1: (lv_fields_7_0= ruleFieldSpecification )
            	    {
            	    // InternalGridGame.g:183:1: (lv_fields_7_0= ruleFieldSpecification )
            	    // InternalGridGame.g:184:3: lv_fields_7_0= ruleFieldSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_fields_7_0=ruleFieldSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_7_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.FieldSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalGridGame.g:201:6: ( (lv_options_8_0= ruleOptionSpecification ) )
            	    {
            	    // InternalGridGame.g:201:6: ( (lv_options_8_0= ruleOptionSpecification ) )
            	    // InternalGridGame.g:202:1: (lv_options_8_0= ruleOptionSpecification )
            	    {
            	    // InternalGridGame.g:202:1: (lv_options_8_0= ruleOptionSpecification )
            	    // InternalGridGame.g:203:3: lv_options_8_0= ruleOptionSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_3_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_options_8_0=ruleOptionSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_8_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.OptionSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGridGame"


    // $ANTLR start "entryRuleCellSpecification"
    // InternalGridGame.g:231:1: entryRuleCellSpecification returns [EObject current=null] : iv_ruleCellSpecification= ruleCellSpecification EOF ;
    public final EObject entryRuleCellSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellSpecification = null;


        try {
            // InternalGridGame.g:232:2: (iv_ruleCellSpecification= ruleCellSpecification EOF )
            // InternalGridGame.g:233:2: iv_ruleCellSpecification= ruleCellSpecification EOF
            {
             newCompositeNode(grammarAccess.getCellSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellSpecification=ruleCellSpecification();

            state._fsp--;

             current =iv_ruleCellSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellSpecification"


    // $ANTLR start "ruleCellSpecification"
    // InternalGridGame.g:240:1: ruleCellSpecification returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleCellSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:243:28: ( (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' ) )
            // InternalGridGame.g:244:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' )
            {
            // InternalGridGame.g:244:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' )
            // InternalGridGame.g:244:3: otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getCellSpecificationAccess().getCellKeyword_0());
                
            // InternalGridGame.g:248:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalGridGame.g:249:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGridGame.g:249:1: (lv_name_1_0= RULE_ID )
            // InternalGridGame.g:250:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCellSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalGridGame.g:270:1: ( (lv_members_3_0= ruleCellMember ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==20||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGridGame.g:271:1: (lv_members_3_0= ruleCellMember )
            	    {
            	    // InternalGridGame.g:271:1: (lv_members_3_0= ruleCellMember )
            	    // InternalGridGame.g:272:3: lv_members_3_0= ruleCellMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_7);
            	    lv_members_3_0=ruleCellMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.CellMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellSpecification"


    // $ANTLR start "entryRuleCellMember"
    // InternalGridGame.g:300:1: entryRuleCellMember returns [EObject current=null] : iv_ruleCellMember= ruleCellMember EOF ;
    public final EObject entryRuleCellMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellMember = null;


        try {
            // InternalGridGame.g:301:2: (iv_ruleCellMember= ruleCellMember EOF )
            // InternalGridGame.g:302:2: iv_ruleCellMember= ruleCellMember EOF
            {
             newCompositeNode(grammarAccess.getCellMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellMember=ruleCellMember();

            state._fsp--;

             current =iv_ruleCellMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellMember"


    // $ANTLR start "ruleCellMember"
    // InternalGridGame.g:309:1: ruleCellMember returns [EObject current=null] : (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec ) ;
    public final EObject ruleCellMember() throws RecognitionException {
        EObject current = null;

        EObject this_CellDisplaySpec_0 = null;

        EObject this_CellVarSpec_1 = null;

        EObject this_CellStateSpec_2 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:312:28: ( (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec ) )
            // InternalGridGame.g:313:1: (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec )
            {
            // InternalGridGame.g:313:1: (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGridGame.g:314:5: this_CellDisplaySpec_0= ruleCellDisplaySpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CellDisplaySpec_0=ruleCellDisplaySpec();

                    state._fsp--;

                     
                            current = this_CellDisplaySpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:324:5: this_CellVarSpec_1= ruleCellVarSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CellVarSpec_1=ruleCellVarSpec();

                    state._fsp--;

                     
                            current = this_CellVarSpec_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalGridGame.g:334:5: this_CellStateSpec_2= ruleCellStateSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellStateSpecParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CellStateSpec_2=ruleCellStateSpec();

                    state._fsp--;

                     
                            current = this_CellStateSpec_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellMember"


    // $ANTLR start "entryRuleCellDisplaySpec"
    // InternalGridGame.g:350:1: entryRuleCellDisplaySpec returns [EObject current=null] : iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF ;
    public final EObject entryRuleCellDisplaySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDisplaySpec = null;


        try {
            // InternalGridGame.g:351:2: (iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF )
            // InternalGridGame.g:352:2: iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF
            {
             newCompositeNode(grammarAccess.getCellDisplaySpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellDisplaySpec=ruleCellDisplaySpec();

            state._fsp--;

             current =iv_ruleCellDisplaySpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellDisplaySpec"


    // $ANTLR start "ruleCellDisplaySpec"
    // InternalGridGame.g:359:1: ruleCellDisplaySpec returns [EObject current=null] : (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleCellDisplaySpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_display_type_3_1=null;
        Token lv_display_type_3_2=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_color_9_1=null;
        Token lv_color_9_2=null;
        Token lv_color_9_3=null;
        Token lv_color_9_4=null;
        Token lv_color_9_5=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:362:28: ( (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) ) ) otherlv_10= '}' ) )
            // InternalGridGame.g:363:1: (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) ) ) otherlv_10= '}' )
            {
            // InternalGridGame.g:363:1: (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) ) ) otherlv_10= '}' )
            // InternalGridGame.g:363:3: otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

                	newLeafNode(otherlv_1, grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

                	newLeafNode(otherlv_2, grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2());
                
            // InternalGridGame.g:375:1: ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) )
            // InternalGridGame.g:376:1: ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) )
            {
            // InternalGridGame.g:376:1: ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) )
            // InternalGridGame.g:377:1: (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' )
            {
            // InternalGridGame.g:377:1: (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGridGame.g:378:3: lv_display_type_3_1= 'label'
                    {
                    lv_display_type_3_1=(Token)match(input,17,FOLLOW_10); 

                            newLeafNode(lv_display_type_3_1, grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                           		setWithLastConsumed(current, "display_type", lv_display_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:390:8: lv_display_type_3_2= 'button'
                    {
                    lv_display_type_3_2=(Token)match(input,18,FOLLOW_10); 

                            newLeafNode(lv_display_type_3_2, grammarAccess.getCellDisplaySpecAccess().getDisplay_typeButtonKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                           		setWithLastConsumed(current, "display_type", lv_display_type_3_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalGridGame.g:405:2: ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGridGame.g:405:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )
                    {
                    // InternalGridGame.g:405:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )
                    // InternalGridGame.g:405:5: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_11); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0());
                        
                    // InternalGridGame.g:409:1: ( (lv_text_5_0= RULE_STRING ) )
                    // InternalGridGame.g:410:1: (lv_text_5_0= RULE_STRING )
                    {
                    // InternalGridGame.g:410:1: (lv_text_5_0= RULE_STRING )
                    // InternalGridGame.g:411:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_4_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:428:6: (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalGridGame.g:428:6: (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) )
                    // InternalGridGame.g:428:8: otherlv_6= 'var' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0());
                        
                    // InternalGridGame.g:432:1: ( (otherlv_7= RULE_ID ) )
                    // InternalGridGame.g:433:1: (otherlv_7= RULE_ID )
                    {
                    // InternalGridGame.g:433:1: (otherlv_7= RULE_ID )
                    // InternalGridGame.g:434:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

                    		newLeafNode(otherlv_7, grammarAccess.getCellDisplaySpecAccess().getVarVarSpecCrossReference_4_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:446:6: (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) )
                    {
                    // InternalGridGame.g:446:6: (otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) ) )
                    // InternalGridGame.g:446:8: otherlv_8= 'color' ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_13); 

                        	newLeafNode(otherlv_8, grammarAccess.getCellDisplaySpecAccess().getColorKeyword_4_2_0());
                        
                    // InternalGridGame.g:450:1: ( ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) ) )
                    // InternalGridGame.g:451:1: ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) )
                    {
                    // InternalGridGame.g:451:1: ( (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' ) )
                    // InternalGridGame.g:452:1: (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' )
                    {
                    // InternalGridGame.g:452:1: (lv_color_9_1= 'black' | lv_color_9_2= 'white' | lv_color_9_3= 'yellow' | lv_color_9_4= 'red' | lv_color_9_5= 'green' )
                    int alt5=5;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt5=1;
                        }
                        break;
                    case 23:
                        {
                        alt5=2;
                        }
                        break;
                    case 24:
                        {
                        alt5=3;
                        }
                        break;
                    case 25:
                        {
                        alt5=4;
                        }
                        break;
                    case 26:
                        {
                        alt5=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // InternalGridGame.g:453:3: lv_color_9_1= 'black'
                            {
                            lv_color_9_1=(Token)match(input,22,FOLLOW_12); 

                                    newLeafNode(lv_color_9_1, grammarAccess.getCellDisplaySpecAccess().getColorBlackKeyword_4_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                            	        }
                                   		setWithLastConsumed(current, "color", lv_color_9_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // InternalGridGame.g:465:8: lv_color_9_2= 'white'
                            {
                            lv_color_9_2=(Token)match(input,23,FOLLOW_12); 

                                    newLeafNode(lv_color_9_2, grammarAccess.getCellDisplaySpecAccess().getColorWhiteKeyword_4_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                            	        }
                                   		setWithLastConsumed(current, "color", lv_color_9_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // InternalGridGame.g:477:8: lv_color_9_3= 'yellow'
                            {
                            lv_color_9_3=(Token)match(input,24,FOLLOW_12); 

                                    newLeafNode(lv_color_9_3, grammarAccess.getCellDisplaySpecAccess().getColorYellowKeyword_4_2_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                            	        }
                                   		setWithLastConsumed(current, "color", lv_color_9_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // InternalGridGame.g:489:8: lv_color_9_4= 'red'
                            {
                            lv_color_9_4=(Token)match(input,25,FOLLOW_12); 

                                    newLeafNode(lv_color_9_4, grammarAccess.getCellDisplaySpecAccess().getColorRedKeyword_4_2_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                            	        }
                                   		setWithLastConsumed(current, "color", lv_color_9_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // InternalGridGame.g:501:8: lv_color_9_5= 'green'
                            {
                            lv_color_9_5=(Token)match(input,26,FOLLOW_12); 

                                    newLeafNode(lv_color_9_5, grammarAccess.getCellDisplaySpecAccess().getColorGreenKeyword_4_2_1_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                            	        }
                                   		setWithLastConsumed(current, "color", lv_color_9_5, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellDisplaySpec"


    // $ANTLR start "entryRuleCellVarSpec"
    // InternalGridGame.g:530:1: entryRuleCellVarSpec returns [EObject current=null] : iv_ruleCellVarSpec= ruleCellVarSpec EOF ;
    public final EObject entryRuleCellVarSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellVarSpec = null;


        try {
            // InternalGridGame.g:531:2: (iv_ruleCellVarSpec= ruleCellVarSpec EOF )
            // InternalGridGame.g:532:2: iv_ruleCellVarSpec= ruleCellVarSpec EOF
            {
             newCompositeNode(grammarAccess.getCellVarSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellVarSpec=ruleCellVarSpec();

            state._fsp--;

             current =iv_ruleCellVarSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellVarSpec"


    // $ANTLR start "ruleCellVarSpec"
    // InternalGridGame.g:539:1: ruleCellVarSpec returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCellVarSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:542:28: ( (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalGridGame.g:543:1: (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalGridGame.g:543:1: (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalGridGame.g:543:3: otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getCellVarSpecAccess().getVarKeyword_0());
                
            // InternalGridGame.g:547:1: ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) )
            // InternalGridGame.g:548:1: ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) )
            {
            // InternalGridGame.g:548:1: ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) )
            // InternalGridGame.g:549:1: (lv_type_1_1= 'int' | lv_type_1_2= 'String' )
            {
            // InternalGridGame.g:549:1: (lv_type_1_1= 'int' | lv_type_1_2= 'String' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGridGame.g:550:3: lv_type_1_1= 'int'
                    {
                    lv_type_1_1=(Token)match(input,27,FOLLOW_3); 

                            newLeafNode(lv_type_1_1, grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellVarSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:562:8: lv_type_1_2= 'String'
                    {
                    lv_type_1_2=(Token)match(input,28,FOLLOW_3); 

                            newLeafNode(lv_type_1_2, grammarAccess.getCellVarSpecAccess().getTypeStringKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellVarSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalGridGame.g:577:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalGridGame.g:578:1: (lv_name_2_0= RULE_ID )
            {
            // InternalGridGame.g:578:1: (lv_name_2_0= RULE_ID )
            // InternalGridGame.g:579:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCellVarSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellVarSpec"


    // $ANTLR start "entryRuleGlobalCellStateSpec"
    // InternalGridGame.g:603:1: entryRuleGlobalCellStateSpec returns [EObject current=null] : iv_ruleGlobalCellStateSpec= ruleGlobalCellStateSpec EOF ;
    public final EObject entryRuleGlobalCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalCellStateSpec = null;


        try {
            // InternalGridGame.g:604:2: (iv_ruleGlobalCellStateSpec= ruleGlobalCellStateSpec EOF )
            // InternalGridGame.g:605:2: iv_ruleGlobalCellStateSpec= ruleGlobalCellStateSpec EOF
            {
             newCompositeNode(grammarAccess.getGlobalCellStateSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalCellStateSpec=ruleGlobalCellStateSpec();

            state._fsp--;

             current =iv_ruleGlobalCellStateSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalCellStateSpec"


    // $ANTLR start "ruleGlobalCellStateSpec"
    // InternalGridGame.g:612:1: ruleGlobalCellStateSpec returns [EObject current=null] : (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleGlobalCellStateSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_states_8_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:615:28: ( (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalGridGame.g:616:1: (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalGridGame.g:616:1: (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // InternalGridGame.g:616:3: otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalCellStateSpecAccess().getStatesKeyword_0());
                
            // InternalGridGame.g:620:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalGridGame.g:621:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGridGame.g:621:1: (lv_name_1_0= RULE_ID )
            // InternalGridGame.g:622:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGlobalCellStateSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalCellStateSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalGridGame.g:638:2: (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGridGame.g:638:4: otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_16); 

                        	newLeafNode(otherlv_2, grammarAccess.getGlobalCellStateSpecAccess().getLeftParenthesisKeyword_2_0());
                        
                    // InternalGridGame.g:642:1: ( (lv_params_3_0= ruleParamSpec ) )
                    // InternalGridGame.g:643:1: (lv_params_3_0= ruleParamSpec )
                    {
                    // InternalGridGame.g:643:1: (lv_params_3_0= ruleParamSpec )
                    // InternalGridGame.g:644:3: lv_params_3_0= ruleParamSpec
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalCellStateSpecAccess().getParamsParamSpecParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    lv_params_3_0=ruleParamSpec();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalCellStateSpecRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ParamSpec");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalGridGame.g:660:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==31) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGridGame.g:660:4: otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_16); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getGlobalCellStateSpecAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // InternalGridGame.g:664:1: ( (lv_params_5_0= ruleParamSpec ) )
                    	    // InternalGridGame.g:665:1: (lv_params_5_0= ruleParamSpec )
                    	    {
                    	    // InternalGridGame.g:665:1: (lv_params_5_0= ruleParamSpec )
                    	    // InternalGridGame.g:666:3: lv_params_5_0= ruleParamSpec
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGlobalCellStateSpecAccess().getParamsParamSpecParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    lv_params_5_0=ruleParamSpec();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGlobalCellStateSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ParamSpec");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_4); 

                        	newLeafNode(otherlv_6, grammarAccess.getGlobalCellStateSpecAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_3); 

                	newLeafNode(otherlv_7, grammarAccess.getGlobalCellStateSpecAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalGridGame.g:690:1: ( (lv_states_8_0= ruleCellState ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGridGame.g:691:1: (lv_states_8_0= ruleCellState )
            	    {
            	    // InternalGridGame.g:691:1: (lv_states_8_0= ruleCellState )
            	    // InternalGridGame.g:692:3: lv_states_8_0= ruleCellState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalCellStateSpecAccess().getStatesCellStateParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
            	    lv_states_8_0=ruleCellState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalCellStateSpecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_8_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.CellState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_9=(Token)match(input,33,FOLLOW_19); 

                	newLeafNode(otherlv_9, grammarAccess.getGlobalCellStateSpecAccess().getStartKeyword_5());
                
            otherlv_10=(Token)match(input,34,FOLLOW_3); 

                	newLeafNode(otherlv_10, grammarAccess.getGlobalCellStateSpecAccess().getEqualsSignKeyword_6());
                
            // InternalGridGame.g:716:1: ( (otherlv_11= RULE_ID ) )
            // InternalGridGame.g:717:1: (otherlv_11= RULE_ID )
            {
            // InternalGridGame.g:717:1: (otherlv_11= RULE_ID )
            // InternalGridGame.g:718:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalCellStateSpecRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_12); 

            		newLeafNode(otherlv_11, grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getGlobalCellStateSpecAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalCellStateSpec"


    // $ANTLR start "entryRuleParamSpec"
    // InternalGridGame.g:741:1: entryRuleParamSpec returns [EObject current=null] : iv_ruleParamSpec= ruleParamSpec EOF ;
    public final EObject entryRuleParamSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamSpec = null;


        try {
            // InternalGridGame.g:742:2: (iv_ruleParamSpec= ruleParamSpec EOF )
            // InternalGridGame.g:743:2: iv_ruleParamSpec= ruleParamSpec EOF
            {
             newCompositeNode(grammarAccess.getParamSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamSpec=ruleParamSpec();

            state._fsp--;

             current =iv_ruleParamSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamSpec"


    // $ANTLR start "ruleParamSpec"
    // InternalGridGame.g:750:1: ruleParamSpec returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParamSpec() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:753:28: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGridGame.g:754:1: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGridGame.g:754:1: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGridGame.g:754:2: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGridGame.g:754:2: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) ) )
            // InternalGridGame.g:755:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) )
            {
            // InternalGridGame.g:755:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' ) )
            // InternalGridGame.g:756:1: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' )
            {
            // InternalGridGame.g:756:1: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'Behaviour' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGridGame.g:757:3: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,27,FOLLOW_3); 

                            newLeafNode(lv_type_0_1, grammarAccess.getParamSpecAccess().getTypeIntKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:769:8: lv_type_0_2= 'String'
                    {
                    lv_type_0_2=(Token)match(input,28,FOLLOW_3); 

                            newLeafNode(lv_type_0_2, grammarAccess.getParamSpecAccess().getTypeStringKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalGridGame.g:781:8: lv_type_0_3= 'Behaviour'
                    {
                    lv_type_0_3=(Token)match(input,35,FOLLOW_3); 

                            newLeafNode(lv_type_0_3, grammarAccess.getParamSpecAccess().getTypeBehaviourKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalGridGame.g:796:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalGridGame.g:797:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGridGame.g:797:1: (lv_name_1_0= RULE_ID )
            // InternalGridGame.g:798:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamSpec"


    // $ANTLR start "entryRuleCellStateSpec"
    // InternalGridGame.g:822:1: entryRuleCellStateSpec returns [EObject current=null] : iv_ruleCellStateSpec= ruleCellStateSpec EOF ;
    public final EObject entryRuleCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStateSpec = null;


        try {
            // InternalGridGame.g:823:2: (iv_ruleCellStateSpec= ruleCellStateSpec EOF )
            // InternalGridGame.g:824:2: iv_ruleCellStateSpec= ruleCellStateSpec EOF
            {
             newCompositeNode(grammarAccess.getCellStateSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellStateSpec=ruleCellStateSpec();

            state._fsp--;

             current =iv_ruleCellStateSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellStateSpec"


    // $ANTLR start "ruleCellStateSpec"
    // InternalGridGame.g:831:1: ruleCellStateSpec returns [EObject current=null] : (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference ) ;
    public final EObject ruleCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject this_LocalCellStateSpec_0 = null;

        EObject this_CellStateSpecReference_1 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:834:28: ( (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference ) )
            // InternalGridGame.g:835:1: (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference )
            {
            // InternalGridGame.g:835:1: (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==12) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_ID) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGridGame.g:836:5: this_LocalCellStateSpec_0= ruleLocalCellStateSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellStateSpecAccess().getLocalCellStateSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LocalCellStateSpec_0=ruleLocalCellStateSpec();

                    state._fsp--;

                     
                            current = this_LocalCellStateSpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:846:5: this_CellStateSpecReference_1= ruleCellStateSpecReference
                    {
                     
                            newCompositeNode(grammarAccess.getCellStateSpecAccess().getCellStateSpecReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CellStateSpecReference_1=ruleCellStateSpecReference();

                    state._fsp--;

                     
                            current = this_CellStateSpecReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellStateSpec"


    // $ANTLR start "entryRuleLocalCellStateSpec"
    // InternalGridGame.g:862:1: entryRuleLocalCellStateSpec returns [EObject current=null] : iv_ruleLocalCellStateSpec= ruleLocalCellStateSpec EOF ;
    public final EObject entryRuleLocalCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalCellStateSpec = null;


        try {
            // InternalGridGame.g:863:2: (iv_ruleLocalCellStateSpec= ruleLocalCellStateSpec EOF )
            // InternalGridGame.g:864:2: iv_ruleLocalCellStateSpec= ruleLocalCellStateSpec EOF
            {
             newCompositeNode(grammarAccess.getLocalCellStateSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalCellStateSpec=ruleLocalCellStateSpec();

            state._fsp--;

             current =iv_ruleLocalCellStateSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalCellStateSpec"


    // $ANTLR start "ruleLocalCellStateSpec"
    // InternalGridGame.g:871:1: ruleLocalCellStateSpec returns [EObject current=null] : (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleLocalCellStateSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_states_2_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:874:28: ( (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalGridGame.g:875:1: (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalGridGame.g:875:1: (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalGridGame.g:875:3: otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalCellStateSpecAccess().getStatesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalCellStateSpecAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalGridGame.g:883:1: ( (lv_states_2_0= ruleCellState ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGridGame.g:884:1: (lv_states_2_0= ruleCellState )
            	    {
            	    // InternalGridGame.g:884:1: (lv_states_2_0= ruleCellState )
            	    // InternalGridGame.g:885:3: lv_states_2_0= ruleCellState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLocalCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
            	    lv_states_2_0=ruleCellState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLocalCellStateSpecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_2_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.CellState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_19); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalCellStateSpecAccess().getStartKeyword_3());
                
            otherlv_4=(Token)match(input,34,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getLocalCellStateSpecAccess().getEqualsSignKeyword_4());
                
            // InternalGridGame.g:909:1: ( (otherlv_5= RULE_ID ) )
            // InternalGridGame.g:910:1: (otherlv_5= RULE_ID )
            {
            // InternalGridGame.g:910:1: (otherlv_5= RULE_ID )
            // InternalGridGame.g:911:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalCellStateSpecRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            		newLeafNode(otherlv_5, grammarAccess.getLocalCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getLocalCellStateSpecAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalCellStateSpec"


    // $ANTLR start "entryRuleCellStateSpecReference"
    // InternalGridGame.g:934:1: entryRuleCellStateSpecReference returns [EObject current=null] : iv_ruleCellStateSpecReference= ruleCellStateSpecReference EOF ;
    public final EObject entryRuleCellStateSpecReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStateSpecReference = null;


        try {
            // InternalGridGame.g:935:2: (iv_ruleCellStateSpecReference= ruleCellStateSpecReference EOF )
            // InternalGridGame.g:936:2: iv_ruleCellStateSpecReference= ruleCellStateSpecReference EOF
            {
             newCompositeNode(grammarAccess.getCellStateSpecReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellStateSpecReference=ruleCellStateSpecReference();

            state._fsp--;

             current =iv_ruleCellStateSpecReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellStateSpecReference"


    // $ANTLR start "ruleCellStateSpecReference"
    // InternalGridGame.g:943:1: ruleCellStateSpecReference returns [EObject current=null] : (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleCellStateSpecReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:946:28: ( (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? ) )
            // InternalGridGame.g:947:1: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? )
            {
            // InternalGridGame.g:947:1: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? )
            // InternalGridGame.g:947:3: otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getCellStateSpecReferenceAccess().getStatesKeyword_0());
                
            // InternalGridGame.g:951:1: ( (otherlv_1= RULE_ID ) )
            // InternalGridGame.g:952:1: (otherlv_1= RULE_ID )
            {
            // InternalGridGame.g:952:1: (otherlv_1= RULE_ID )
            // InternalGridGame.g:953:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCellStateSpecReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            		newLeafNode(otherlv_1, grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecCrossReference_1_0()); 
            	

            }


            }

            // InternalGridGame.g:964:2: (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGridGame.g:964:4: otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_21); 

                        	newLeafNode(otherlv_2, grammarAccess.getCellStateSpecReferenceAccess().getLeftParenthesisKeyword_2_0());
                        
                    // InternalGridGame.g:968:1: ( (lv_params_3_0= ruleValue ) )
                    // InternalGridGame.g:969:1: (lv_params_3_0= ruleValue )
                    {
                    // InternalGridGame.g:969:1: (lv_params_3_0= ruleValue )
                    // InternalGridGame.g:970:3: lv_params_3_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    lv_params_3_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellStateSpecReferenceRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalGridGame.g:986:2: (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==31) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGridGame.g:986:4: otherlv_4= ',' ( (lv_params_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_21); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCellStateSpecReferenceAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // InternalGridGame.g:990:1: ( (lv_params_5_0= ruleValue ) )
                    	    // InternalGridGame.g:991:1: (lv_params_5_0= ruleValue )
                    	    {
                    	    // InternalGridGame.g:991:1: (lv_params_5_0= ruleValue )
                    	    // InternalGridGame.g:992:3: lv_params_5_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    lv_params_5_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCellStateSpecReferenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellStateSpecReferenceAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellStateSpecReference"


    // $ANTLR start "entryRuleValue"
    // InternalGridGame.g:1020:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGridGame.g:1021:2: (iv_ruleValue= ruleValue EOF )
            // InternalGridGame.g:1022:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGridGame.g:1029:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_DirectBehaviour_2= ruleDirectBehaviour | this_VarRefValue_3= ruleVarRefValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_DirectBehaviour_2 = null;

        EObject this_VarRefValue_3 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1032:28: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_DirectBehaviour_2= ruleDirectBehaviour | this_VarRefValue_3= ruleVarRefValue ) )
            // InternalGridGame.g:1033:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_DirectBehaviour_2= ruleDirectBehaviour | this_VarRefValue_3= ruleVarRefValue )
            {
            // InternalGridGame.g:1033:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_DirectBehaviour_2= ruleDirectBehaviour | this_VarRefValue_3= ruleVarRefValue )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt16=1;
                }
                break;
            case RULE_INT:
                {
                alt16=2;
                }
                break;
            case 43:
            case 44:
                {
                alt16=3;
                }
                break;
            case RULE_ID:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalGridGame.g:1034:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1044:5: this_IntValue_1= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IntValue_1=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1054:5: this_DirectBehaviour_2= ruleDirectBehaviour
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDirectBehaviourParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DirectBehaviour_2=ruleDirectBehaviour();

                    state._fsp--;

                     
                            current = this_DirectBehaviour_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalGridGame.g:1064:5: this_VarRefValue_3= ruleVarRefValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getVarRefValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_VarRefValue_3=ruleVarRefValue();

                    state._fsp--;

                     
                            current = this_VarRefValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalGridGame.g:1080:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGridGame.g:1081:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGridGame.g:1082:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalGridGame.g:1089:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:1092:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalGridGame.g:1093:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalGridGame.g:1093:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalGridGame.g:1094:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalGridGame.g:1094:1: (lv_value_0_0= RULE_STRING )
            // InternalGridGame.g:1095:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalGridGame.g:1119:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalGridGame.g:1120:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalGridGame.g:1121:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalGridGame.g:1128:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:1131:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalGridGame.g:1132:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalGridGame.g:1132:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalGridGame.g:1133:1: (lv_value_0_0= RULE_INT )
            {
            // InternalGridGame.g:1133:1: (lv_value_0_0= RULE_INT )
            // InternalGridGame.g:1134:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleVarRefValue"
    // InternalGridGame.g:1158:1: entryRuleVarRefValue returns [EObject current=null] : iv_ruleVarRefValue= ruleVarRefValue EOF ;
    public final EObject entryRuleVarRefValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefValue = null;


        try {
            // InternalGridGame.g:1159:2: (iv_ruleVarRefValue= ruleVarRefValue EOF )
            // InternalGridGame.g:1160:2: iv_ruleVarRefValue= ruleVarRefValue EOF
            {
             newCompositeNode(grammarAccess.getVarRefValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarRefValue=ruleVarRefValue();

            state._fsp--;

             current =iv_ruleVarRefValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarRefValue"


    // $ANTLR start "ruleVarRefValue"
    // InternalGridGame.g:1167:1: ruleVarRefValue returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarRefValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:1170:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalGridGame.g:1171:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalGridGame.g:1171:1: ( (otherlv_0= RULE_ID ) )
            // InternalGridGame.g:1172:1: (otherlv_0= RULE_ID )
            {
            // InternalGridGame.g:1172:1: (otherlv_0= RULE_ID )
            // InternalGridGame.g:1173:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVarRefValueRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getVarRefValueAccess().getRefCellVarSpecCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarRefValue"


    // $ANTLR start "entryRuleCellState"
    // InternalGridGame.g:1192:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalGridGame.g:1193:2: (iv_ruleCellState= ruleCellState EOF )
            // InternalGridGame.g:1194:2: iv_ruleCellState= ruleCellState EOF
            {
             newCompositeNode(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellState=ruleCellState();

            state._fsp--;

             current =iv_ruleCellState; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellState"


    // $ANTLR start "ruleCellState"
    // InternalGridGame.g:1201:1: ruleCellState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_display_2_0 = null;

        EObject lv_transitions_5_0 = null;

        EObject lv_onEnter_9_0 = null;

        EObject lv_onEnter_11_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1204:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalGridGame.g:1205:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalGridGame.g:1205:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalGridGame.g:1205:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalGridGame.g:1205:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGridGame.g:1206:1: (lv_name_0_0= RULE_ID )
            {
            // InternalGridGame.g:1206:1: (lv_name_0_0= RULE_ID )
            // InternalGridGame.g:1207:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCellStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalGridGame.g:1227:1: ( (lv_display_2_0= ruleCellDisplaySpec ) )
            // InternalGridGame.g:1228:1: (lv_display_2_0= ruleCellDisplaySpec )
            {
            // InternalGridGame.g:1228:1: (lv_display_2_0= ruleCellDisplaySpec )
            // InternalGridGame.g:1229:3: lv_display_2_0= ruleCellDisplaySpec
            {
             
            	        newCompositeNode(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_23);
            lv_display_2_0=ruleCellDisplaySpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCellStateRule());
            	        }
                   		set(
                   			current, 
                   			"display",
                    		lv_display_2_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.CellDisplaySpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGridGame.g:1245:2: (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGridGame.g:1245:4: otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_4); 

                        	newLeafNode(otherlv_3, grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_24); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalGridGame.g:1253:1: ( (lv_transitions_5_0= ruleTransitionSpec ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==38) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGridGame.g:1254:1: (lv_transitions_5_0= ruleTransitionSpec )
                    	    {
                    	    // InternalGridGame.g:1254:1: (lv_transitions_5_0= ruleTransitionSpec )
                    	    // InternalGridGame.g:1255:3: lv_transitions_5_0= ruleTransitionSpec
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_25);
                    	    lv_transitions_5_0=ruleTransitionSpec();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_5_0, 
                    	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.TransitionSpec");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_26); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalGridGame.g:1275:3: (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGridGame.g:1275:5: otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_4); 

                        	newLeafNode(otherlv_7, grammarAccess.getCellStateAccess().getOnEnterKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,12,FOLLOW_27); 

                        	newLeafNode(otherlv_8, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // InternalGridGame.g:1283:1: ( (lv_onEnter_9_0= ruleCellStateBehaviour ) )
                    // InternalGridGame.g:1284:1: (lv_onEnter_9_0= ruleCellStateBehaviour )
                    {
                    // InternalGridGame.g:1284:1: (lv_onEnter_9_0= ruleCellStateBehaviour )
                    // InternalGridGame.g:1285:3: lv_onEnter_9_0= ruleCellStateBehaviour
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_28);
                    lv_onEnter_9_0=ruleCellStateBehaviour();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	        }
                           		add(
                           			current, 
                           			"onEnter",
                            		lv_onEnter_9_0, 
                            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.CellStateBehaviour");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalGridGame.g:1301:2: (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==31) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGridGame.g:1301:4: otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) )
                    	    {
                    	    otherlv_10=(Token)match(input,31,FOLLOW_27); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getCellStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalGridGame.g:1305:1: ( (lv_onEnter_11_0= ruleCellStateBehaviour ) )
                    	    // InternalGridGame.g:1306:1: (lv_onEnter_11_0= ruleCellStateBehaviour )
                    	    {
                    	    // InternalGridGame.g:1306:1: (lv_onEnter_11_0= ruleCellStateBehaviour )
                    	    // InternalGridGame.g:1307:3: lv_onEnter_11_0= ruleCellStateBehaviour
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_28);
                    	    lv_onEnter_11_0=ruleCellStateBehaviour();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"onEnter",
                    	            		lv_onEnter_11_0, 
                    	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.CellStateBehaviour");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_12); 

                        	newLeafNode(otherlv_12, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_13, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellState"


    // $ANTLR start "entryRuleTransitionSpec"
    // InternalGridGame.g:1339:1: entryRuleTransitionSpec returns [EObject current=null] : iv_ruleTransitionSpec= ruleTransitionSpec EOF ;
    public final EObject entryRuleTransitionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpec = null;


        try {
            // InternalGridGame.g:1340:2: (iv_ruleTransitionSpec= ruleTransitionSpec EOF )
            // InternalGridGame.g:1341:2: iv_ruleTransitionSpec= ruleTransitionSpec EOF
            {
             newCompositeNode(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionSpec=ruleTransitionSpec();

            state._fsp--;

             current =iv_ruleTransitionSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionSpec"


    // $ANTLR start "ruleTransitionSpec"
    // InternalGridGame.g:1348:1: ruleTransitionSpec returns [EObject current=null] : (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_trigger_1_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1351:28: ( (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalGridGame.g:1352:1: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalGridGame.g:1352:1: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            // InternalGridGame.g:1352:3: otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_29); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionSpecAccess().getOnKeyword_0());
                
            // InternalGridGame.g:1356:1: ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) )
            // InternalGridGame.g:1357:1: (lv_trigger_1_0= ruleTransitionTriggerSpec )
            {
            // InternalGridGame.g:1357:1: (lv_trigger_1_0= ruleTransitionTriggerSpec )
            // InternalGridGame.g:1358:3: lv_trigger_1_0= ruleTransitionTriggerSpec
            {
             
            	        newCompositeNode(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_30);
            lv_trigger_1_0=ruleTransitionTriggerSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionSpecRule());
            	        }
                   		set(
                   			current, 
                   			"trigger",
                    		lv_trigger_1_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.TransitionTriggerSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionSpecAccess().getGotoKeyword_2());
                
            // InternalGridGame.g:1378:1: ( (otherlv_3= RULE_ID ) )
            // InternalGridGame.g:1379:1: (otherlv_3= RULE_ID )
            {
            // InternalGridGame.g:1379:1: (otherlv_3= RULE_ID )
            // InternalGridGame.g:1380:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionSpecRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_3, grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionSpec"


    // $ANTLR start "entryRuleTransitionTriggerSpec"
    // InternalGridGame.g:1399:1: entryRuleTransitionTriggerSpec returns [EObject current=null] : iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF ;
    public final EObject entryRuleTransitionTriggerSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionTriggerSpec = null;


        try {
            // InternalGridGame.g:1400:2: (iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF )
            // InternalGridGame.g:1401:2: iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF
            {
             newCompositeNode(grammarAccess.getTransitionTriggerSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionTriggerSpec=ruleTransitionTriggerSpec();

            state._fsp--;

             current =iv_ruleTransitionTriggerSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionTriggerSpec"


    // $ANTLR start "ruleTransitionTriggerSpec"
    // InternalGridGame.g:1408:1: ruleTransitionTriggerSpec returns [EObject current=null] : (this_MouseTrigger_0= ruleMouseTrigger | this_ContextTrigger_1= ruleContextTrigger ) ;
    public final EObject ruleTransitionTriggerSpec() throws RecognitionException {
        EObject current = null;

        EObject this_MouseTrigger_0 = null;

        EObject this_ContextTrigger_1 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1411:28: ( (this_MouseTrigger_0= ruleMouseTrigger | this_ContextTrigger_1= ruleContextTrigger ) )
            // InternalGridGame.g:1412:1: (this_MouseTrigger_0= ruleMouseTrigger | this_ContextTrigger_1= ruleContextTrigger )
            {
            // InternalGridGame.g:1412:1: (this_MouseTrigger_0= ruleMouseTrigger | this_ContextTrigger_1= ruleContextTrigger )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=40 && LA21_0<=41)) ) {
                alt21=1;
            }
            else if ( (LA21_0==42) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGridGame.g:1413:5: this_MouseTrigger_0= ruleMouseTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionTriggerSpecAccess().getMouseTriggerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_MouseTrigger_0=ruleMouseTrigger();

                    state._fsp--;

                     
                            current = this_MouseTrigger_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1423:5: this_ContextTrigger_1= ruleContextTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionTriggerSpecAccess().getContextTriggerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ContextTrigger_1=ruleContextTrigger();

                    state._fsp--;

                     
                            current = this_ContextTrigger_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionTriggerSpec"


    // $ANTLR start "entryRuleMouseTrigger"
    // InternalGridGame.g:1439:1: entryRuleMouseTrigger returns [EObject current=null] : iv_ruleMouseTrigger= ruleMouseTrigger EOF ;
    public final EObject entryRuleMouseTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMouseTrigger = null;


        try {
            // InternalGridGame.g:1440:2: (iv_ruleMouseTrigger= ruleMouseTrigger EOF )
            // InternalGridGame.g:1441:2: iv_ruleMouseTrigger= ruleMouseTrigger EOF
            {
             newCompositeNode(grammarAccess.getMouseTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMouseTrigger=ruleMouseTrigger();

            state._fsp--;

             current =iv_ruleMouseTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMouseTrigger"


    // $ANTLR start "ruleMouseTrigger"
    // InternalGridGame.g:1448:1: ruleMouseTrigger returns [EObject current=null] : ( ( (lv_left_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) ;
    public final EObject ruleMouseTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:1451:28: ( ( ( (lv_left_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) )
            // InternalGridGame.g:1452:1: ( ( (lv_left_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            {
            // InternalGridGame.g:1452:1: ( ( (lv_left_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGridGame.g:1452:2: ( (lv_left_0_0= 'mouse-left' ) )
                    {
                    // InternalGridGame.g:1452:2: ( (lv_left_0_0= 'mouse-left' ) )
                    // InternalGridGame.g:1453:1: (lv_left_0_0= 'mouse-left' )
                    {
                    // InternalGridGame.g:1453:1: (lv_left_0_0= 'mouse-left' )
                    // InternalGridGame.g:1454:3: lv_left_0_0= 'mouse-left'
                    {
                    lv_left_0_0=(Token)match(input,40,FOLLOW_2); 

                            newLeafNode(lv_left_0_0, grammarAccess.getMouseTriggerAccess().getLeftMouseLeftKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMouseTriggerRule());
                    	        }
                           		setWithLastConsumed(current, "left", true, "mouse-left");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1468:6: (otherlv_1= 'mouse-right' () )
                    {
                    // InternalGridGame.g:1468:6: (otherlv_1= 'mouse-right' () )
                    // InternalGridGame.g:1468:8: otherlv_1= 'mouse-right' ()
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_2); 

                        	newLeafNode(otherlv_1, grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0());
                        
                    // InternalGridGame.g:1472:1: ()
                    // InternalGridGame.g:1473:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMouseTrigger"


    // $ANTLR start "entryRuleContextTrigger"
    // InternalGridGame.g:1486:1: entryRuleContextTrigger returns [EObject current=null] : iv_ruleContextTrigger= ruleContextTrigger EOF ;
    public final EObject entryRuleContextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextTrigger = null;


        try {
            // InternalGridGame.g:1487:2: (iv_ruleContextTrigger= ruleContextTrigger EOF )
            // InternalGridGame.g:1488:2: iv_ruleContextTrigger= ruleContextTrigger EOF
            {
             newCompositeNode(grammarAccess.getContextTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextTrigger=ruleContextTrigger();

            state._fsp--;

             current =iv_ruleContextTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextTrigger"


    // $ANTLR start "ruleContextTrigger"
    // InternalGridGame.g:1495:1: ruleContextTrigger returns [EObject current=null] : (otherlv_0= 'context' otherlv_1= '(' ( (lv_exp_2_0= ruleContextExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleContextTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1498:28: ( (otherlv_0= 'context' otherlv_1= '(' ( (lv_exp_2_0= ruleContextExpression ) ) otherlv_3= ')' ) )
            // InternalGridGame.g:1499:1: (otherlv_0= 'context' otherlv_1= '(' ( (lv_exp_2_0= ruleContextExpression ) ) otherlv_3= ')' )
            {
            // InternalGridGame.g:1499:1: (otherlv_0= 'context' otherlv_1= '(' ( (lv_exp_2_0= ruleContextExpression ) ) otherlv_3= ')' )
            // InternalGridGame.g:1499:3: otherlv_0= 'context' otherlv_1= '(' ( (lv_exp_2_0= ruleContextExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getContextTriggerAccess().getContextKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_32); 

                	newLeafNode(otherlv_1, grammarAccess.getContextTriggerAccess().getLeftParenthesisKeyword_1());
                
            // InternalGridGame.g:1507:1: ( (lv_exp_2_0= ruleContextExpression ) )
            // InternalGridGame.g:1508:1: (lv_exp_2_0= ruleContextExpression )
            {
            // InternalGridGame.g:1508:1: (lv_exp_2_0= ruleContextExpression )
            // InternalGridGame.g:1509:3: lv_exp_2_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextTriggerAccess().getExpContextExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_33);
            lv_exp_2_0=ruleContextExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextTriggerRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ContextExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getContextTriggerAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextTrigger"


    // $ANTLR start "entryRuleCellStateBehaviour"
    // InternalGridGame.g:1537:1: entryRuleCellStateBehaviour returns [EObject current=null] : iv_ruleCellStateBehaviour= ruleCellStateBehaviour EOF ;
    public final EObject entryRuleCellStateBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStateBehaviour = null;


        try {
            // InternalGridGame.g:1538:2: (iv_ruleCellStateBehaviour= ruleCellStateBehaviour EOF )
            // InternalGridGame.g:1539:2: iv_ruleCellStateBehaviour= ruleCellStateBehaviour EOF
            {
             newCompositeNode(grammarAccess.getCellStateBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellStateBehaviour=ruleCellStateBehaviour();

            state._fsp--;

             current =iv_ruleCellStateBehaviour; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellStateBehaviour"


    // $ANTLR start "ruleCellStateBehaviour"
    // InternalGridGame.g:1546:1: ruleCellStateBehaviour returns [EObject current=null] : (this_DirectBehaviour_0= ruleDirectBehaviour | this_BehaviourReference_1= ruleBehaviourReference ) ;
    public final EObject ruleCellStateBehaviour() throws RecognitionException {
        EObject current = null;

        EObject this_DirectBehaviour_0 = null;

        EObject this_BehaviourReference_1 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1549:28: ( (this_DirectBehaviour_0= ruleDirectBehaviour | this_BehaviourReference_1= ruleBehaviourReference ) )
            // InternalGridGame.g:1550:1: (this_DirectBehaviour_0= ruleDirectBehaviour | this_BehaviourReference_1= ruleBehaviourReference )
            {
            // InternalGridGame.g:1550:1: (this_DirectBehaviour_0= ruleDirectBehaviour | this_BehaviourReference_1= ruleBehaviourReference )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=43 && LA23_0<=44)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGridGame.g:1551:5: this_DirectBehaviour_0= ruleDirectBehaviour
                    {
                     
                            newCompositeNode(grammarAccess.getCellStateBehaviourAccess().getDirectBehaviourParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DirectBehaviour_0=ruleDirectBehaviour();

                    state._fsp--;

                     
                            current = this_DirectBehaviour_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1561:5: this_BehaviourReference_1= ruleBehaviourReference
                    {
                     
                            newCompositeNode(grammarAccess.getCellStateBehaviourAccess().getBehaviourReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BehaviourReference_1=ruleBehaviourReference();

                    state._fsp--;

                     
                            current = this_BehaviourReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellStateBehaviour"


    // $ANTLR start "entryRuleBehaviourReference"
    // InternalGridGame.g:1577:1: entryRuleBehaviourReference returns [EObject current=null] : iv_ruleBehaviourReference= ruleBehaviourReference EOF ;
    public final EObject entryRuleBehaviourReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourReference = null;


        try {
            // InternalGridGame.g:1578:2: (iv_ruleBehaviourReference= ruleBehaviourReference EOF )
            // InternalGridGame.g:1579:2: iv_ruleBehaviourReference= ruleBehaviourReference EOF
            {
             newCompositeNode(grammarAccess.getBehaviourReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourReference=ruleBehaviourReference();

            state._fsp--;

             current =iv_ruleBehaviourReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviourReference"


    // $ANTLR start "ruleBehaviourReference"
    // InternalGridGame.g:1586:1: ruleBehaviourReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleBehaviourReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:1589:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalGridGame.g:1590:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalGridGame.g:1590:1: ( (otherlv_0= RULE_ID ) )
            // InternalGridGame.g:1591:1: (otherlv_0= RULE_ID )
            {
            // InternalGridGame.g:1591:1: (otherlv_0= RULE_ID )
            // InternalGridGame.g:1592:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviourReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getBehaviourReferenceAccess().getRefVarSpecCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviourReference"


    // $ANTLR start "entryRuleDirectBehaviour"
    // InternalGridGame.g:1611:1: entryRuleDirectBehaviour returns [EObject current=null] : iv_ruleDirectBehaviour= ruleDirectBehaviour EOF ;
    public final EObject entryRuleDirectBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectBehaviour = null;


        try {
            // InternalGridGame.g:1612:2: (iv_ruleDirectBehaviour= ruleDirectBehaviour EOF )
            // InternalGridGame.g:1613:2: iv_ruleDirectBehaviour= ruleDirectBehaviour EOF
            {
             newCompositeNode(grammarAccess.getDirectBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectBehaviour=ruleDirectBehaviour();

            state._fsp--;

             current =iv_ruleDirectBehaviour; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectBehaviour"


    // $ANTLR start "ruleDirectBehaviour"
    // InternalGridGame.g:1620:1: ruleDirectBehaviour returns [EObject current=null] : (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) ) ;
    public final EObject ruleDirectBehaviour() throws RecognitionException {
        EObject current = null;

        EObject this_EndGameBehaviour_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1623:28: ( (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) ) )
            // InternalGridGame.g:1624:1: (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) )
            {
            // InternalGridGame.g:1624:1: (this_EndGameBehaviour_0= ruleEndGameBehaviour | ( ruleNoOpBehaviour () ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            else if ( (LA24_0==44) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGridGame.g:1625:5: this_EndGameBehaviour_0= ruleEndGameBehaviour
                    {
                     
                            newCompositeNode(grammarAccess.getDirectBehaviourAccess().getEndGameBehaviourParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EndGameBehaviour_0=ruleEndGameBehaviour();

                    state._fsp--;

                     
                            current = this_EndGameBehaviour_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1634:6: ( ruleNoOpBehaviour () )
                    {
                    // InternalGridGame.g:1634:6: ( ruleNoOpBehaviour () )
                    // InternalGridGame.g:1635:5: ruleNoOpBehaviour ()
                    {
                     
                            newCompositeNode(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_2);
                    ruleNoOpBehaviour();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // InternalGridGame.g:1642:1: ()
                    // InternalGridGame.g:1643:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourAction_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectBehaviour"


    // $ANTLR start "entryRuleEndGameBehaviour"
    // InternalGridGame.g:1656:1: entryRuleEndGameBehaviour returns [EObject current=null] : iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF ;
    public final EObject entryRuleEndGameBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndGameBehaviour = null;


        try {
            // InternalGridGame.g:1657:2: (iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF )
            // InternalGridGame.g:1658:2: iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF
            {
             newCompositeNode(grammarAccess.getEndGameBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndGameBehaviour=ruleEndGameBehaviour();

            state._fsp--;

             current =iv_ruleEndGameBehaviour; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndGameBehaviour"


    // $ANTLR start "ruleEndGameBehaviour"
    // InternalGridGame.g:1665:1: ruleEndGameBehaviour returns [EObject current=null] : (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleEndGameBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_message_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:1668:28: ( (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalGridGame.g:1669:1: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalGridGame.g:1669:1: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalGridGame.g:1669:3: otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1());
                
            // InternalGridGame.g:1677:1: ( (lv_message_2_0= RULE_STRING ) )
            // InternalGridGame.g:1678:1: (lv_message_2_0= RULE_STRING )
            {
            // InternalGridGame.g:1678:1: (lv_message_2_0= RULE_STRING )
            // InternalGridGame.g:1679:3: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            			newLeafNode(lv_message_2_0, grammarAccess.getEndGameBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEndGameBehaviourRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndGameBehaviour"


    // $ANTLR start "entryRuleNoOpBehaviour"
    // InternalGridGame.g:1707:1: entryRuleNoOpBehaviour returns [String current=null] : iv_ruleNoOpBehaviour= ruleNoOpBehaviour EOF ;
    public final String entryRuleNoOpBehaviour() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoOpBehaviour = null;


        try {
            // InternalGridGame.g:1708:2: (iv_ruleNoOpBehaviour= ruleNoOpBehaviour EOF )
            // InternalGridGame.g:1709:2: iv_ruleNoOpBehaviour= ruleNoOpBehaviour EOF
            {
             newCompositeNode(grammarAccess.getNoOpBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoOpBehaviour=ruleNoOpBehaviour();

            state._fsp--;

             current =iv_ruleNoOpBehaviour.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoOpBehaviour"


    // $ANTLR start "ruleNoOpBehaviour"
    // InternalGridGame.g:1716:1: ruleNoOpBehaviour returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'nop' ;
    public final AntlrDatatypeRuleToken ruleNoOpBehaviour() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:1719:28: (kw= 'nop' )
            // InternalGridGame.g:1721:2: kw= 'nop'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoOpBehaviourAccess().getNopKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoOpBehaviour"


    // $ANTLR start "entryRuleGlobalAction"
    // InternalGridGame.g:1734:1: entryRuleGlobalAction returns [EObject current=null] : iv_ruleGlobalAction= ruleGlobalAction EOF ;
    public final EObject entryRuleGlobalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalAction = null;


        try {
            // InternalGridGame.g:1735:2: (iv_ruleGlobalAction= ruleGlobalAction EOF )
            // InternalGridGame.g:1736:2: iv_ruleGlobalAction= ruleGlobalAction EOF
            {
             newCompositeNode(grammarAccess.getGlobalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalAction=ruleGlobalAction();

            state._fsp--;

             current =iv_ruleGlobalAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalAction"


    // $ANTLR start "ruleGlobalAction"
    // InternalGridGame.g:1743:1: ruleGlobalAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_trigger_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleDirectBehaviour ) ) otherlv_7= '}' ) ;
    public final EObject ruleGlobalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_4_0 = null;

        EObject lv_behaviour_6_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1746:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_trigger_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleDirectBehaviour ) ) otherlv_7= '}' ) )
            // InternalGridGame.g:1747:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_trigger_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleDirectBehaviour ) ) otherlv_7= '}' )
            {
            // InternalGridGame.g:1747:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_trigger_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleDirectBehaviour ) ) otherlv_7= '}' )
            // InternalGridGame.g:1747:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_trigger_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleDirectBehaviour ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalActionAccess().getActionKeyword_0());
                
            // InternalGridGame.g:1751:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalGridGame.g:1752:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGridGame.g:1752:1: (lv_name_1_0= RULE_ID )
            // InternalGridGame.g:1753:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGlobalActionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

                	newLeafNode(otherlv_2, grammarAccess.getGlobalActionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,46,FOLLOW_32); 

                	newLeafNode(otherlv_3, grammarAccess.getGlobalActionAccess().getWhenKeyword_3());
                
            // InternalGridGame.g:1777:1: ( (lv_trigger_4_0= ruleContextExpression ) )
            // InternalGridGame.g:1778:1: (lv_trigger_4_0= ruleContextExpression )
            {
            // InternalGridGame.g:1778:1: (lv_trigger_4_0= ruleContextExpression )
            // InternalGridGame.g:1779:3: lv_trigger_4_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getGlobalActionAccess().getTriggerContextExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_35);
            lv_trigger_4_0=ruleContextExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlobalActionRule());
            	        }
                   		set(
                   			current, 
                   			"trigger",
                    		lv_trigger_4_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ContextExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_36); 

                	newLeafNode(otherlv_5, grammarAccess.getGlobalActionAccess().getDoKeyword_5());
                
            // InternalGridGame.g:1799:1: ( (lv_behaviour_6_0= ruleDirectBehaviour ) )
            // InternalGridGame.g:1800:1: (lv_behaviour_6_0= ruleDirectBehaviour )
            {
            // InternalGridGame.g:1800:1: (lv_behaviour_6_0= ruleDirectBehaviour )
            // InternalGridGame.g:1801:3: lv_behaviour_6_0= ruleDirectBehaviour
            {
             
            	        newCompositeNode(grammarAccess.getGlobalActionAccess().getBehaviourDirectBehaviourParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_12);
            lv_behaviour_6_0=ruleDirectBehaviour();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlobalActionRule());
            	        }
                   		set(
                   			current, 
                   			"behaviour",
                    		lv_behaviour_6_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.DirectBehaviour");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getGlobalActionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalAction"


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalGridGame.g:1829:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // InternalGridGame.g:1830:2: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // InternalGridGame.g:1831:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
            {
             newCompositeNode(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSpecification=ruleFieldSpecification();

            state._fsp--;

             current =iv_ruleFieldSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldSpecification"


    // $ANTLR start "ruleFieldSpecification"
    // InternalGridGame.g:1838:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) ;
    public final EObject ruleFieldSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_width_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_height_8_0=null;
        Token otherlv_10=null;
        EObject lv_field_initialisation_9_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1841:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) )
            // InternalGridGame.g:1842:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            {
            // InternalGridGame.g:1842:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            // InternalGridGame.g:1842:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
                
            // InternalGridGame.g:1846:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalGridGame.g:1847:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGridGame.g:1847:1: (lv_name_1_0= RULE_ID )
            // InternalGridGame.g:1848:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,49,FOLLOW_19); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3());
                
            otherlv_4=(Token)match(input,34,FOLLOW_38); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4());
                
            // InternalGridGame.g:1876:1: ( (lv_width_5_0= RULE_INT ) )
            // InternalGridGame.g:1877:1: (lv_width_5_0= RULE_INT )
            {
            // InternalGridGame.g:1877:1: (lv_width_5_0= RULE_INT )
            // InternalGridGame.g:1878:3: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            			newLeafNode(lv_width_5_0, grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_5_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,50,FOLLOW_19); 

                	newLeafNode(otherlv_6, grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6());
                
            otherlv_7=(Token)match(input,34,FOLLOW_38); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7());
                
            // InternalGridGame.g:1902:1: ( (lv_height_8_0= RULE_INT ) )
            // InternalGridGame.g:1903:1: (lv_height_8_0= RULE_INT )
            {
            // InternalGridGame.g:1903:1: (lv_height_8_0= RULE_INT )
            // InternalGridGame.g:1904:3: lv_height_8_0= RULE_INT
            {
            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            			newLeafNode(lv_height_8_0, grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_8_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalGridGame.g:1920:2: ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==53) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGridGame.g:1921:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    {
                    // InternalGridGame.g:1921:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    // InternalGridGame.g:1922:3: lv_field_initialisation_9_0= ruleFieldInitialisations
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_12);
                    lv_field_initialisation_9_0=ruleFieldInitialisations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldSpecificationRule());
                    	        }
                           		set(
                           			current, 
                           			"field_initialisation",
                            		lv_field_initialisation_9_0, 
                            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.FieldInitialisations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldSpecification"


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalGridGame.g:1950:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // InternalGridGame.g:1951:2: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // InternalGridGame.g:1952:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // InternalGridGame.g:1959:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_GenerationalContexts_2= ruleGenerationalContexts ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_AllowRestartMenu_1 = null;

        EObject this_GenerationalContexts_2 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:1962:28: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_GenerationalContexts_2= ruleGenerationalContexts ) )
            // InternalGridGame.g:1963:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_GenerationalContexts_2= ruleGenerationalContexts )
            {
            // InternalGridGame.g:1963:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu | this_GenerationalContexts_2= ruleGenerationalContexts )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt26=1;
                }
                break;
            case 51:
                {
                alt26=2;
                }
                break;
            case 52:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalGridGame.g:1964:5: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_StartFieldDeclaration_0=ruleStartFieldDeclaration();

                    state._fsp--;

                     
                            current = this_StartFieldDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1974:5: this_AllowRestartMenu_1= ruleAllowRestartMenu
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AllowRestartMenu_1=ruleAllowRestartMenu();

                    state._fsp--;

                     
                            current = this_AllowRestartMenu_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1984:5: this_GenerationalContexts_2= ruleGenerationalContexts
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getGenerationalContextsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_GenerationalContexts_2=ruleGenerationalContexts();

                    state._fsp--;

                     
                            current = this_GenerationalContexts_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleAllowRestartMenu"
    // InternalGridGame.g:2000:1: entryRuleAllowRestartMenu returns [EObject current=null] : iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF ;
    public final EObject entryRuleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowRestartMenu = null;


        try {
            // InternalGridGame.g:2001:2: (iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF )
            // InternalGridGame.g:2002:2: iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF
            {
             newCompositeNode(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowRestartMenu=ruleAllowRestartMenu();

            state._fsp--;

             current =iv_ruleAllowRestartMenu; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllowRestartMenu"


    // $ANTLR start "ruleAllowRestartMenu"
    // InternalGridGame.g:2009:1: ruleAllowRestartMenu returns [EObject current=null] : (otherlv_0= 'allow_restart' () ) ;
    public final EObject ruleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2012:28: ( (otherlv_0= 'allow_restart' () ) )
            // InternalGridGame.g:2013:1: (otherlv_0= 'allow_restart' () )
            {
            // InternalGridGame.g:2013:1: (otherlv_0= 'allow_restart' () )
            // InternalGridGame.g:2013:3: otherlv_0= 'allow_restart' ()
            {
            otherlv_0=(Token)match(input,51,FOLLOW_2); 

                	newLeafNode(otherlv_0, grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0());
                
            // InternalGridGame.g:2017:1: ()
            // InternalGridGame.g:2018:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllowRestartMenu"


    // $ANTLR start "entryRuleStartFieldDeclaration"
    // InternalGridGame.g:2031:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // InternalGridGame.g:2032:2: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // InternalGridGame.g:2033:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartFieldDeclaration=ruleStartFieldDeclaration();

            state._fsp--;

             current =iv_ruleStartFieldDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartFieldDeclaration"


    // $ANTLR start "ruleStartFieldDeclaration"
    // InternalGridGame.g:2040:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2043:28: ( (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGridGame.g:2044:1: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalGridGame.g:2044:1: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalGridGame.g:2044:3: otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

                	newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
                
            // InternalGridGame.g:2052:1: ( (otherlv_2= RULE_ID ) )
            // InternalGridGame.g:2053:1: (otherlv_2= RULE_ID )
            {
            // InternalGridGame.g:2053:1: (otherlv_2= RULE_ID )
            // InternalGridGame.g:2054:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStartFieldDeclarationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_2, grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartFieldDeclaration"


    // $ANTLR start "entryRuleGenerationalContexts"
    // InternalGridGame.g:2073:1: entryRuleGenerationalContexts returns [EObject current=null] : iv_ruleGenerationalContexts= ruleGenerationalContexts EOF ;
    public final EObject entryRuleGenerationalContexts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationalContexts = null;


        try {
            // InternalGridGame.g:2074:2: (iv_ruleGenerationalContexts= ruleGenerationalContexts EOF )
            // InternalGridGame.g:2075:2: iv_ruleGenerationalContexts= ruleGenerationalContexts EOF
            {
             newCompositeNode(grammarAccess.getGenerationalContextsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerationalContexts=ruleGenerationalContexts();

            state._fsp--;

             current =iv_ruleGenerationalContexts; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerationalContexts"


    // $ANTLR start "ruleGenerationalContexts"
    // InternalGridGame.g:2082:1: ruleGenerationalContexts returns [EObject current=null] : (otherlv_0= 'contextsTriggerGenerationally' () ) ;
    public final EObject ruleGenerationalContexts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2085:28: ( (otherlv_0= 'contextsTriggerGenerationally' () ) )
            // InternalGridGame.g:2086:1: (otherlv_0= 'contextsTriggerGenerationally' () )
            {
            // InternalGridGame.g:2086:1: (otherlv_0= 'contextsTriggerGenerationally' () )
            // InternalGridGame.g:2086:3: otherlv_0= 'contextsTriggerGenerationally' ()
            {
            otherlv_0=(Token)match(input,52,FOLLOW_2); 

                	newLeafNode(otherlv_0, grammarAccess.getGenerationalContextsAccess().getContextsTriggerGenerationallyKeyword_0());
                
            // InternalGridGame.g:2090:1: ()
            // InternalGridGame.g:2091:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGenerationalContextsAccess().getGenerationalContextsAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerationalContexts"


    // $ANTLR start "entryRuleGlobalFieldInitialisation"
    // InternalGridGame.g:2104:1: entryRuleGlobalFieldInitialisation returns [EObject current=null] : iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF ;
    public final EObject entryRuleGlobalFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalFieldInitialisation = null;


        try {
            // InternalGridGame.g:2105:2: (iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF )
            // InternalGridGame.g:2106:2: iv_ruleGlobalFieldInitialisation= ruleGlobalFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getGlobalFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalFieldInitialisation=ruleGlobalFieldInitialisation();

            state._fsp--;

             current =iv_ruleGlobalFieldInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalFieldInitialisation"


    // $ANTLR start "ruleGlobalFieldInitialisation"
    // InternalGridGame.g:2113:1: ruleGlobalFieldInitialisation returns [EObject current=null] : (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_initialisations_8_0= ruleFieldInitialisation ) ) otherlv_9= ';' )+ otherlv_10= '}' ) ;
    public final EObject ruleGlobalFieldInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_initialisations_8_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2116:28: ( (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_initialisations_8_0= ruleFieldInitialisation ) ) otherlv_9= ';' )+ otherlv_10= '}' ) )
            // InternalGridGame.g:2117:1: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_initialisations_8_0= ruleFieldInitialisation ) ) otherlv_9= ';' )+ otherlv_10= '}' )
            {
            // InternalGridGame.g:2117:1: (otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_initialisations_8_0= ruleFieldInitialisation ) ) otherlv_9= ';' )+ otherlv_10= '}' )
            // InternalGridGame.g:2117:3: otherlv_0= 'init' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_initialisations_8_0= ruleFieldInitialisation ) ) otherlv_9= ';' )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalFieldInitialisationAccess().getInitKeyword_0());
                
            // InternalGridGame.g:2121:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalGridGame.g:2122:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGridGame.g:2122:1: (lv_name_1_0= RULE_ID )
            // InternalGridGame.g:2123:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGlobalFieldInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalFieldInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalGridGame.g:2139:2: (otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGridGame.g:2139:4: otherlv_2= '(' ( (lv_params_3_0= ruleParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_16); 

                        	newLeafNode(otherlv_2, grammarAccess.getGlobalFieldInitialisationAccess().getLeftParenthesisKeyword_2_0());
                        
                    // InternalGridGame.g:2143:1: ( (lv_params_3_0= ruleParamSpec ) )
                    // InternalGridGame.g:2144:1: (lv_params_3_0= ruleParamSpec )
                    {
                    // InternalGridGame.g:2144:1: (lv_params_3_0= ruleParamSpec )
                    // InternalGridGame.g:2145:3: lv_params_3_0= ruleParamSpec
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalFieldInitialisationAccess().getParamsParamSpecParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    lv_params_3_0=ruleParamSpec();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalFieldInitialisationRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ParamSpec");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalGridGame.g:2161:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==31) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGridGame.g:2161:4: otherlv_4= ',' ( (lv_params_5_0= ruleParamSpec ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_16); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getGlobalFieldInitialisationAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // InternalGridGame.g:2165:1: ( (lv_params_5_0= ruleParamSpec ) )
                    	    // InternalGridGame.g:2166:1: (lv_params_5_0= ruleParamSpec )
                    	    {
                    	    // InternalGridGame.g:2166:1: (lv_params_5_0= ruleParamSpec )
                    	    // InternalGridGame.g:2167:3: lv_params_5_0= ruleParamSpec
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGlobalFieldInitialisationAccess().getParamsParamSpecParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    lv_params_5_0=ruleParamSpec();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGlobalFieldInitialisationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ParamSpec");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_4); 

                        	newLeafNode(otherlv_6, grammarAccess.getGlobalFieldInitialisationAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_41); 

                	newLeafNode(otherlv_7, grammarAccess.getGlobalFieldInitialisationAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalGridGame.g:2191:1: ( ( (lv_initialisations_8_0= ruleFieldInitialisation ) ) otherlv_9= ';' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42||LA29_0==55||LA29_0==57) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGridGame.g:2191:2: ( (lv_initialisations_8_0= ruleFieldInitialisation ) ) otherlv_9= ';'
            	    {
            	    // InternalGridGame.g:2191:2: ( (lv_initialisations_8_0= ruleFieldInitialisation ) )
            	    // InternalGridGame.g:2192:1: (lv_initialisations_8_0= ruleFieldInitialisation )
            	    {
            	    // InternalGridGame.g:2192:1: (lv_initialisations_8_0= ruleFieldInitialisation )
            	    // InternalGridGame.g:2193:3: lv_initialisations_8_0= ruleFieldInitialisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalFieldInitialisationAccess().getInitialisationsFieldInitialisationParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_42);
            	    lv_initialisations_8_0=ruleFieldInitialisation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalFieldInitialisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initialisations",
            	            		lv_initialisations_8_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.FieldInitialisation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,54,FOLLOW_43); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGlobalFieldInitialisationAccess().getSemicolonKeyword_4_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getGlobalFieldInitialisationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalFieldInitialisation"


    // $ANTLR start "entryRuleFieldInitialisations"
    // InternalGridGame.g:2225:1: entryRuleFieldInitialisations returns [EObject current=null] : iv_ruleFieldInitialisations= ruleFieldInitialisations EOF ;
    public final EObject entryRuleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisations = null;


        try {
            // InternalGridGame.g:2226:2: (iv_ruleFieldInitialisations= ruleFieldInitialisations EOF )
            // InternalGridGame.g:2227:2: iv_ruleFieldInitialisations= ruleFieldInitialisations EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInitialisations=ruleFieldInitialisations();

            state._fsp--;

             current =iv_ruleFieldInitialisations; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldInitialisations"


    // $ANTLR start "ruleFieldInitialisations"
    // InternalGridGame.g:2234:1: ruleFieldInitialisations returns [EObject current=null] : (this_LocalFieldInitialisations_0= ruleLocalFieldInitialisations | this_FieldInitialisationsRef_1= ruleFieldInitialisationsRef ) ;
    public final EObject ruleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject this_LocalFieldInitialisations_0 = null;

        EObject this_FieldInitialisationsRef_1 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2237:28: ( (this_LocalFieldInitialisations_0= ruleLocalFieldInitialisations | this_FieldInitialisationsRef_1= ruleFieldInitialisationsRef ) )
            // InternalGridGame.g:2238:1: (this_LocalFieldInitialisations_0= ruleLocalFieldInitialisations | this_FieldInitialisationsRef_1= ruleFieldInitialisationsRef )
            {
            // InternalGridGame.g:2238:1: (this_LocalFieldInitialisations_0= ruleLocalFieldInitialisations | this_FieldInitialisationsRef_1= ruleFieldInitialisationsRef )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==12) ) {
                    alt30=1;
                }
                else if ( (LA30_1==RULE_ID) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalGridGame.g:2239:5: this_LocalFieldInitialisations_0= ruleLocalFieldInitialisations
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationsAccess().getLocalFieldInitialisationsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LocalFieldInitialisations_0=ruleLocalFieldInitialisations();

                    state._fsp--;

                     
                            current = this_LocalFieldInitialisations_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:2249:5: this_FieldInitialisationsRef_1= ruleFieldInitialisationsRef
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationsAccess().getFieldInitialisationsRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_FieldInitialisationsRef_1=ruleFieldInitialisationsRef();

                    state._fsp--;

                     
                            current = this_FieldInitialisationsRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldInitialisations"


    // $ANTLR start "entryRuleFieldInitialisationsRef"
    // InternalGridGame.g:2265:1: entryRuleFieldInitialisationsRef returns [EObject current=null] : iv_ruleFieldInitialisationsRef= ruleFieldInitialisationsRef EOF ;
    public final EObject entryRuleFieldInitialisationsRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisationsRef = null;


        try {
            // InternalGridGame.g:2266:2: (iv_ruleFieldInitialisationsRef= ruleFieldInitialisationsRef EOF )
            // InternalGridGame.g:2267:2: iv_ruleFieldInitialisationsRef= ruleFieldInitialisationsRef EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationsRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInitialisationsRef=ruleFieldInitialisationsRef();

            state._fsp--;

             current =iv_ruleFieldInitialisationsRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldInitialisationsRef"


    // $ANTLR start "ruleFieldInitialisationsRef"
    // InternalGridGame.g:2274:1: ruleFieldInitialisationsRef returns [EObject current=null] : (otherlv_0= 'init' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleFieldInitialisationsRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2277:28: ( (otherlv_0= 'init' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? ) )
            // InternalGridGame.g:2278:1: (otherlv_0= 'init' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? )
            {
            // InternalGridGame.g:2278:1: (otherlv_0= 'init' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? )
            // InternalGridGame.g:2278:3: otherlv_0= 'init' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldInitialisationsRefAccess().getInitKeyword_0());
                
            // InternalGridGame.g:2282:1: ( (otherlv_1= RULE_ID ) )
            // InternalGridGame.g:2283:1: (otherlv_1= RULE_ID )
            {
            // InternalGridGame.g:2283:1: (otherlv_1= RULE_ID )
            // InternalGridGame.g:2284:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldInitialisationsRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            		newLeafNode(otherlv_1, grammarAccess.getFieldInitialisationsRefAccess().getRefGlobalFieldInitialisationCrossReference_1_0()); 
            	

            }


            }

            // InternalGridGame.g:2295:2: (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGridGame.g:2295:4: otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_21); 

                        	newLeafNode(otherlv_2, grammarAccess.getFieldInitialisationsRefAccess().getLeftParenthesisKeyword_2_0());
                        
                    // InternalGridGame.g:2299:1: ( (lv_params_3_0= ruleValue ) )
                    // InternalGridGame.g:2300:1: (lv_params_3_0= ruleValue )
                    {
                    // InternalGridGame.g:2300:1: (lv_params_3_0= ruleValue )
                    // InternalGridGame.g:2301:3: lv_params_3_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldInitialisationsRefAccess().getParamsValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_17);
                    lv_params_3_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldInitialisationsRefRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalGridGame.g:2317:2: (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==31) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGridGame.g:2317:4: otherlv_4= ',' ( (lv_params_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_21); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFieldInitialisationsRefAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // InternalGridGame.g:2321:1: ( (lv_params_5_0= ruleValue ) )
                    	    // InternalGridGame.g:2322:1: (lv_params_5_0= ruleValue )
                    	    {
                    	    // InternalGridGame.g:2322:1: (lv_params_5_0= ruleValue )
                    	    // InternalGridGame.g:2323:3: lv_params_5_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldInitialisationsRefAccess().getParamsValueParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_17);
                    	    lv_params_5_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldInitialisationsRefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getFieldInitialisationsRefAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldInitialisationsRef"


    // $ANTLR start "entryRuleLocalFieldInitialisations"
    // InternalGridGame.g:2351:1: entryRuleLocalFieldInitialisations returns [EObject current=null] : iv_ruleLocalFieldInitialisations= ruleLocalFieldInitialisations EOF ;
    public final EObject entryRuleLocalFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalFieldInitialisations = null;


        try {
            // InternalGridGame.g:2352:2: (iv_ruleLocalFieldInitialisations= ruleLocalFieldInitialisations EOF )
            // InternalGridGame.g:2353:2: iv_ruleLocalFieldInitialisations= ruleLocalFieldInitialisations EOF
            {
             newCompositeNode(grammarAccess.getLocalFieldInitialisationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalFieldInitialisations=ruleLocalFieldInitialisations();

            state._fsp--;

             current =iv_ruleLocalFieldInitialisations; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalFieldInitialisations"


    // $ANTLR start "ruleLocalFieldInitialisations"
    // InternalGridGame.g:2360:1: ruleLocalFieldInitialisations returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleLocalFieldInitialisations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_initialisations_2_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2363:28: ( (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // InternalGridGame.g:2364:1: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // InternalGridGame.g:2364:1: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // InternalGridGame.g:2364:3: otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalFieldInitialisationsAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalGridGame.g:2372:1: ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==42||LA33_0==55||LA33_0==57) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGridGame.g:2372:2: ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';'
            	    {
            	    // InternalGridGame.g:2372:2: ( (lv_initialisations_2_0= ruleFieldInitialisation ) )
            	    // InternalGridGame.g:2373:1: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    {
            	    // InternalGridGame.g:2373:1: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    // InternalGridGame.g:2374:3: lv_initialisations_2_0= ruleFieldInitialisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_42);
            	    lv_initialisations_2_0=ruleFieldInitialisation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLocalFieldInitialisationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initialisations",
            	            		lv_initialisations_2_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.FieldInitialisation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,54,FOLLOW_43); 

            	        	newLeafNode(otherlv_3, grammarAccess.getLocalFieldInitialisationsAccess().getSemicolonKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getLocalFieldInitialisationsAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalFieldInitialisations"


    // $ANTLR start "entryRuleFieldInitialisation"
    // InternalGridGame.g:2406:1: entryRuleFieldInitialisation returns [EObject current=null] : iv_ruleFieldInitialisation= ruleFieldInitialisation EOF ;
    public final EObject entryRuleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisation = null;


        try {
            // InternalGridGame.g:2407:2: (iv_ruleFieldInitialisation= ruleFieldInitialisation EOF )
            // InternalGridGame.g:2408:2: iv_ruleFieldInitialisation= ruleFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInitialisation=ruleFieldInitialisation();

            state._fsp--;

             current =iv_ruleFieldInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldInitialisation"


    // $ANTLR start "ruleFieldInitialisation"
    // InternalGridGame.g:2415:1: ruleFieldInitialisation returns [EObject current=null] : (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) ;
    public final EObject ruleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultInitialisation_0 = null;

        EObject this_RandomInitialisation_1 = null;

        EObject this_ContextInitialisation_2 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2418:28: ( (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) )
            // InternalGridGame.g:2419:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            {
            // InternalGridGame.g:2419:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt34=1;
                }
                break;
            case 57:
                {
                alt34=2;
                }
                break;
            case 42:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalGridGame.g:2420:5: this_DefaultInitialisation_0= ruleDefaultInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefaultInitialisation_0=ruleDefaultInitialisation();

                    state._fsp--;

                     
                            current = this_DefaultInitialisation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:2430:5: this_RandomInitialisation_1= ruleRandomInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RandomInitialisation_1=ruleRandomInitialisation();

                    state._fsp--;

                     
                            current = this_RandomInitialisation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalGridGame.g:2440:5: this_ContextInitialisation_2= ruleContextInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ContextInitialisation_2=ruleContextInitialisation();

                    state._fsp--;

                     
                            current = this_ContextInitialisation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldInitialisation"


    // $ANTLR start "entryRuleDefaultInitialisation"
    // InternalGridGame.g:2456:1: entryRuleDefaultInitialisation returns [EObject current=null] : iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF ;
    public final EObject entryRuleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInitialisation = null;


        try {
            // InternalGridGame.g:2457:2: (iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF )
            // InternalGridGame.g:2458:2: iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF
            {
             newCompositeNode(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultInitialisation=ruleDefaultInitialisation();

            state._fsp--;

             current =iv_ruleDefaultInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultInitialisation"


    // $ANTLR start "ruleDefaultInitialisation"
    // InternalGridGame.g:2465:1: ruleDefaultInitialisation returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2468:28: ( (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGridGame.g:2469:1: (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalGridGame.g:2469:1: (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalGridGame.g:2469:3: otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_44); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1());
                
            // InternalGridGame.g:2477:1: ( (otherlv_2= RULE_ID ) )
            // InternalGridGame.g:2478:1: (otherlv_2= RULE_ID )
            {
            // InternalGridGame.g:2478:1: (otherlv_2= RULE_ID )
            // InternalGridGame.g:2479:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_2, grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultInitialisation"


    // $ANTLR start "entryRuleRandomInitialisation"
    // InternalGridGame.g:2498:1: entryRuleRandomInitialisation returns [EObject current=null] : iv_ruleRandomInitialisation= ruleRandomInitialisation EOF ;
    public final EObject entryRuleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomInitialisation = null;


        try {
            // InternalGridGame.g:2499:2: (iv_ruleRandomInitialisation= ruleRandomInitialisation EOF )
            // InternalGridGame.g:2500:2: iv_ruleRandomInitialisation= ruleRandomInitialisation EOF
            {
             newCompositeNode(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandomInitialisation=ruleRandomInitialisation();

            state._fsp--;

             current =iv_ruleRandomInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandomInitialisation"


    // $ANTLR start "ruleRandomInitialisation"
    // InternalGridGame.g:2507:1: ruleRandomInitialisation returns [EObject current=null] : (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (lv_count_4_0= RULE_INT ) ) | ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_count_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2510:28: ( (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (lv_count_4_0= RULE_INT ) ) | ( (otherlv_5= RULE_ID ) ) ) ) )
            // InternalGridGame.g:2511:1: (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (lv_count_4_0= RULE_INT ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            {
            // InternalGridGame.g:2511:1: (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (lv_count_4_0= RULE_INT ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            // InternalGridGame.g:2511:3: otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( ( (lv_count_4_0= RULE_INT ) ) | ( (otherlv_5= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_44); 

                	newLeafNode(otherlv_0, grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getRandomInitialisationAccess().getColonKeyword_1());
                
            // InternalGridGame.g:2519:1: ( (otherlv_2= RULE_ID ) )
            // InternalGridGame.g:2520:1: (otherlv_2= RULE_ID )
            {
            // InternalGridGame.g:2520:1: (otherlv_2= RULE_ID )
            // InternalGridGame.g:2521:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRandomInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            		newLeafNode(otherlv_2, grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_45); 

                	newLeafNode(otherlv_3, grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3());
                
            // InternalGridGame.g:2536:1: ( ( (lv_count_4_0= RULE_INT ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalGridGame.g:2536:2: ( (lv_count_4_0= RULE_INT ) )
                    {
                    // InternalGridGame.g:2536:2: ( (lv_count_4_0= RULE_INT ) )
                    // InternalGridGame.g:2537:1: (lv_count_4_0= RULE_INT )
                    {
                    // InternalGridGame.g:2537:1: (lv_count_4_0= RULE_INT )
                    // InternalGridGame.g:2538:3: lv_count_4_0= RULE_INT
                    {
                    lv_count_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_count_4_0, grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRandomInitialisationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"count",
                            		lv_count_4_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:2555:6: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalGridGame.g:2555:6: ( (otherlv_5= RULE_ID ) )
                    // InternalGridGame.g:2556:1: (otherlv_5= RULE_ID )
                    {
                    // InternalGridGame.g:2556:1: (otherlv_5= RULE_ID )
                    // InternalGridGame.g:2557:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRandomInitialisationRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_5, grammarAccess.getRandomInitialisationAccess().getVarVarSpecCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandomInitialisation"


    // $ANTLR start "entryRuleContextInitialisation"
    // InternalGridGame.g:2576:1: entryRuleContextInitialisation returns [EObject current=null] : iv_ruleContextInitialisation= ruleContextInitialisation EOF ;
    public final EObject entryRuleContextInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextInitialisation = null;


        try {
            // InternalGridGame.g:2577:2: (iv_ruleContextInitialisation= ruleContextInitialisation EOF )
            // InternalGridGame.g:2578:2: iv_ruleContextInitialisation= ruleContextInitialisation EOF
            {
             newCompositeNode(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextInitialisation=ruleContextInitialisation();

            state._fsp--;

             current =iv_ruleContextInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextInitialisation"


    // $ANTLR start "ruleContextInitialisation"
    // InternalGridGame.g:2585:1: ruleContextInitialisation returns [EObject current=null] : (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) ) ;
    public final EObject ruleContextInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_check_4_0 = null;

        EObject lv_exp_7_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2588:28: ( (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) ) )
            // InternalGridGame.g:2589:1: (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) )
            {
            // InternalGridGame.g:2589:1: (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) )
            // InternalGridGame.g:2589:3: otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_44); 

                	newLeafNode(otherlv_0, grammarAccess.getContextInitialisationAccess().getContextKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getContextInitialisationAccess().getColonKeyword_1());
                
            // InternalGridGame.g:2597:1: ( (otherlv_2= RULE_ID ) )
            // InternalGridGame.g:2598:1: (otherlv_2= RULE_ID )
            {
            // InternalGridGame.g:2598:1: (otherlv_2= RULE_ID )
            // InternalGridGame.g:2599:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContextInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_46); 

            		newLeafNode(otherlv_2, grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,58,FOLLOW_32); 

                	newLeafNode(otherlv_3, grammarAccess.getContextInitialisationAccess().getCheckKeyword_3());
                
            // InternalGridGame.g:2614:1: ( (lv_check_4_0= ruleContextExpression ) )
            // InternalGridGame.g:2615:1: (lv_check_4_0= ruleContextExpression )
            {
            // InternalGridGame.g:2615:1: (lv_check_4_0= ruleContextExpression )
            // InternalGridGame.g:2616:3: lv_check_4_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_47);
            lv_check_4_0=ruleContextExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextInitialisationRule());
            	        }
                   		set(
                   			current, 
                   			"check",
                    		lv_check_4_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ContextExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,59,FOLLOW_19); 

                	newLeafNode(otherlv_5, grammarAccess.getContextInitialisationAccess().getValueKeyword_5());
                
            otherlv_6=(Token)match(input,34,FOLLOW_32); 

                	newLeafNode(otherlv_6, grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6());
                
            // InternalGridGame.g:2640:1: ( (lv_exp_7_0= ruleContextExpression ) )
            // InternalGridGame.g:2641:1: (lv_exp_7_0= ruleContextExpression )
            {
            // InternalGridGame.g:2641:1: (lv_exp_7_0= ruleContextExpression )
            // InternalGridGame.g:2642:3: lv_exp_7_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_exp_7_0=ruleContextExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextInitialisationRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_7_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.ContextExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextInitialisation"


    // $ANTLR start "entryRuleContextExpression"
    // InternalGridGame.g:2666:1: entryRuleContextExpression returns [EObject current=null] : iv_ruleContextExpression= ruleContextExpression EOF ;
    public final EObject entryRuleContextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextExpression = null;


        try {
            // InternalGridGame.g:2667:2: (iv_ruleContextExpression= ruleContextExpression EOF )
            // InternalGridGame.g:2668:2: iv_ruleContextExpression= ruleContextExpression EOF
            {
             newCompositeNode(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextExpression=ruleContextExpression();

            state._fsp--;

             current =iv_ruleContextExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextExpression"


    // $ANTLR start "ruleContextExpression"
    // InternalGridGame.g:2675:1: ruleContextExpression returns [EObject current=null] : ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* ) ;
    public final EObject ruleContextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sub_exp_0_0 = null;

        EObject lv_sub_exp_2_0 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2678:28: ( ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* ) )
            // InternalGridGame.g:2679:1: ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* )
            {
            // InternalGridGame.g:2679:1: ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* )
            // InternalGridGame.g:2679:2: ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )*
            {
            // InternalGridGame.g:2679:2: ( (lv_sub_exp_0_0= ruleAtomicExpression ) )
            // InternalGridGame.g:2680:1: (lv_sub_exp_0_0= ruleAtomicExpression )
            {
            // InternalGridGame.g:2680:1: (lv_sub_exp_0_0= ruleAtomicExpression )
            // InternalGridGame.g:2681:3: lv_sub_exp_0_0= ruleAtomicExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_48);
            lv_sub_exp_0_0=ruleAtomicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"sub_exp",
                    		lv_sub_exp_0_0, 
                    		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.AtomicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGridGame.g:2697:2: (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==60) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGridGame.g:2697:4: otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_32); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // InternalGridGame.g:2701:1: ( (lv_sub_exp_2_0= ruleAtomicExpression ) )
            	    // InternalGridGame.g:2702:1: (lv_sub_exp_2_0= ruleAtomicExpression )
            	    {
            	    // InternalGridGame.g:2702:1: (lv_sub_exp_2_0= ruleAtomicExpression )
            	    // InternalGridGame.g:2703:3: lv_sub_exp_2_0= ruleAtomicExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_48);
            	    lv_sub_exp_2_0=ruleAtomicExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sub_exp",
            	            		lv_sub_exp_2_0, 
            	            		"uk.ac.kcl.inf.zschaler.gridgames.GridGame.AtomicExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalGridGame.g:2727:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalGridGame.g:2728:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalGridGame.g:2729:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalGridGame.g:2736:1: ruleAtomicExpression returns [EObject current=null] : (this_FilterExpression_0= ruleFilterExpression | this_StateFilterExpression_1= ruleStateFilterExpression | this_CountExpression_2= ruleCountExpression | this_NotEmptyExpression_3= ruleNotEmptyExpression | this_EmptyExpression_4= ruleEmptyExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FilterExpression_0 = null;

        EObject this_StateFilterExpression_1 = null;

        EObject this_CountExpression_2 = null;

        EObject this_NotEmptyExpression_3 = null;

        EObject this_EmptyExpression_4 = null;


         enterRule(); 
            
        try {
            // InternalGridGame.g:2739:28: ( (this_FilterExpression_0= ruleFilterExpression | this_StateFilterExpression_1= ruleStateFilterExpression | this_CountExpression_2= ruleCountExpression | this_NotEmptyExpression_3= ruleNotEmptyExpression | this_EmptyExpression_4= ruleEmptyExpression ) )
            // InternalGridGame.g:2740:1: (this_FilterExpression_0= ruleFilterExpression | this_StateFilterExpression_1= ruleStateFilterExpression | this_CountExpression_2= ruleCountExpression | this_NotEmptyExpression_3= ruleNotEmptyExpression | this_EmptyExpression_4= ruleEmptyExpression )
            {
            // InternalGridGame.g:2740:1: (this_FilterExpression_0= ruleFilterExpression | this_StateFilterExpression_1= ruleStateFilterExpression | this_CountExpression_2= ruleCountExpression | this_NotEmptyExpression_3= ruleNotEmptyExpression | this_EmptyExpression_4= ruleEmptyExpression )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt37=1;
                }
                break;
            case 63:
                {
                alt37=2;
                }
                break;
            case 64:
                {
                alt37=3;
                }
                break;
            case 68:
                {
                alt37=4;
                }
                break;
            case 69:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalGridGame.g:2741:5: this_FilterExpression_0= ruleFilterExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_FilterExpression_0=ruleFilterExpression();

                    state._fsp--;

                     
                            current = this_FilterExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalGridGame.g:2751:5: this_StateFilterExpression_1= ruleStateFilterExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getStateFilterExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_StateFilterExpression_1=ruleStateFilterExpression();

                    state._fsp--;

                     
                            current = this_StateFilterExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalGridGame.g:2761:5: this_CountExpression_2= ruleCountExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CountExpression_2=ruleCountExpression();

                    state._fsp--;

                     
                            current = this_CountExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalGridGame.g:2771:5: this_NotEmptyExpression_3= ruleNotEmptyExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_NotEmptyExpression_3=ruleNotEmptyExpression();

                    state._fsp--;

                     
                            current = this_NotEmptyExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalGridGame.g:2781:5: this_EmptyExpression_4= ruleEmptyExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getEmptyExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EmptyExpression_4=ruleEmptyExpression();

                    state._fsp--;

                     
                            current = this_EmptyExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleFilterExpression"
    // InternalGridGame.g:2797:1: entryRuleFilterExpression returns [EObject current=null] : iv_ruleFilterExpression= ruleFilterExpression EOF ;
    public final EObject entryRuleFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpression = null;


        try {
            // InternalGridGame.g:2798:2: (iv_ruleFilterExpression= ruleFilterExpression EOF )
            // InternalGridGame.g:2799:2: iv_ruleFilterExpression= ruleFilterExpression EOF
            {
             newCompositeNode(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterExpression=ruleFilterExpression();

            state._fsp--;

             current =iv_ruleFilterExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterExpression"


    // $ANTLR start "ruleFilterExpression"
    // InternalGridGame.g:2806:1: ruleFilterExpression returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFilterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2809:28: ( (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) )
            // InternalGridGame.g:2810:1: (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
            {
            // InternalGridGame.g:2810:1: (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
            // InternalGridGame.g:2810:3: otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterExpressionAccess().getFilterKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1());
                
            // InternalGridGame.g:2818:1: ( (otherlv_2= RULE_ID ) )
            // InternalGridGame.g:2819:1: (otherlv_2= RULE_ID )
            {
            // InternalGridGame.g:2819:1: (otherlv_2= RULE_ID )
            // InternalGridGame.g:2820:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_49); 

            		newLeafNode(otherlv_2, grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            // InternalGridGame.g:2831:2: (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==62) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGridGame.g:2831:4: otherlv_3= '|' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,62,FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFilterExpressionAccess().getVerticalLineKeyword_3_0());
            	        
            	    // InternalGridGame.g:2835:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalGridGame.g:2836:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalGridGame.g:2836:1: (otherlv_4= RULE_ID )
            	    // InternalGridGame.g:2837:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFilterExpressionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    		newLeafNode(otherlv_4, grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterExpression"


    // $ANTLR start "entryRuleStateFilterExpression"
    // InternalGridGame.g:2860:1: entryRuleStateFilterExpression returns [EObject current=null] : iv_ruleStateFilterExpression= ruleStateFilterExpression EOF ;
    public final EObject entryRuleStateFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFilterExpression = null;


        try {
            // InternalGridGame.g:2861:2: (iv_ruleStateFilterExpression= ruleStateFilterExpression EOF )
            // InternalGridGame.g:2862:2: iv_ruleStateFilterExpression= ruleStateFilterExpression EOF
            {
             newCompositeNode(grammarAccess.getStateFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateFilterExpression=ruleStateFilterExpression();

            state._fsp--;

             current =iv_ruleStateFilterExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateFilterExpression"


    // $ANTLR start "ruleStateFilterExpression"
    // InternalGridGame.g:2869:1: ruleStateFilterExpression returns [EObject current=null] : (otherlv_0= 'inState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleStateFilterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2872:28: ( (otherlv_0= 'inState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) )
            // InternalGridGame.g:2873:1: (otherlv_0= 'inState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
            {
            // InternalGridGame.g:2873:1: (otherlv_0= 'inState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
            // InternalGridGame.g:2873:3: otherlv_0= 'inState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getStateFilterExpressionAccess().getInStateKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getStateFilterExpressionAccess().getLeftParenthesisKeyword_1());
                
            // InternalGridGame.g:2881:1: ( (otherlv_2= RULE_ID ) )
            // InternalGridGame.g:2882:1: (otherlv_2= RULE_ID )
            {
            // InternalGridGame.g:2882:1: (otherlv_2= RULE_ID )
            // InternalGridGame.g:2883:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateFilterExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_49); 

            		newLeafNode(otherlv_2, grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateCrossReference_2_0()); 
            	

            }


            }

            // InternalGridGame.g:2894:2: (otherlv_3= '|' ( (otherlv_4= RULE_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==62) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGridGame.g:2894:4: otherlv_3= '|' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,62,FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getStateFilterExpressionAccess().getVerticalLineKeyword_3_0());
            	        
            	    // InternalGridGame.g:2898:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalGridGame.g:2899:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalGridGame.g:2899:1: (otherlv_4= RULE_ID )
            	    // InternalGridGame.g:2900:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStateFilterExpressionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    		newLeafNode(otherlv_4, grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getStateFilterExpressionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateFilterExpression"


    // $ANTLR start "entryRuleCountExpression"
    // InternalGridGame.g:2923:1: entryRuleCountExpression returns [EObject current=null] : iv_ruleCountExpression= ruleCountExpression EOF ;
    public final EObject entryRuleCountExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountExpression = null;


        try {
            // InternalGridGame.g:2924:2: (iv_ruleCountExpression= ruleCountExpression EOF )
            // InternalGridGame.g:2925:2: iv_ruleCountExpression= ruleCountExpression EOF
            {
             newCompositeNode(grammarAccess.getCountExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountExpression=ruleCountExpression();

            state._fsp--;

             current =iv_ruleCountExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountExpression"


    // $ANTLR start "ruleCountExpression"
    // InternalGridGame.g:2932:1: ruleCountExpression returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ( ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) ) ( (lv_cmpVal_5_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCountExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_op_4_1=null;
        Token lv_op_4_2=null;
        Token lv_op_4_3=null;
        Token lv_cmpVal_5_0=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:2935:28: ( (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ( ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) ) ( (lv_cmpVal_5_0= RULE_INT ) ) )? ) )
            // InternalGridGame.g:2936:1: (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ( ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) ) ( (lv_cmpVal_5_0= RULE_INT ) ) )? )
            {
            // InternalGridGame.g:2936:1: (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ( ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) ) ( (lv_cmpVal_5_0= RULE_INT ) ) )? )
            // InternalGridGame.g:2936:3: otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ( ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) ) ( (lv_cmpVal_5_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getCountExpressionAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_33); 

                	newLeafNode(otherlv_1, grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_50); 

                	newLeafNode(otherlv_2, grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2());
                
            // InternalGridGame.g:2948:1: ()
            // InternalGridGame.g:2949:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCountExpressionAccess().getCountExpressionAction_3(),
                        current);
                

            }

            // InternalGridGame.g:2954:2: ( ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) ) ( (lv_cmpVal_5_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=65 && LA41_0<=67)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGridGame.g:2954:3: ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) ) ( (lv_cmpVal_5_0= RULE_INT ) )
                    {
                    // InternalGridGame.g:2954:3: ( ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) ) )
                    // InternalGridGame.g:2955:1: ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) )
                    {
                    // InternalGridGame.g:2955:1: ( (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' ) )
                    // InternalGridGame.g:2956:1: (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' )
                    {
                    // InternalGridGame.g:2956:1: (lv_op_4_1= '==' | lv_op_4_2= '>' | lv_op_4_3= '<' )
                    int alt40=3;
                    switch ( input.LA(1) ) {
                    case 65:
                        {
                        alt40=1;
                        }
                        break;
                    case 66:
                        {
                        alt40=2;
                        }
                        break;
                    case 67:
                        {
                        alt40=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // InternalGridGame.g:2957:3: lv_op_4_1= '=='
                            {
                            lv_op_4_1=(Token)match(input,65,FOLLOW_38); 

                                    newLeafNode(lv_op_4_1, grammarAccess.getCountExpressionAccess().getOpEqualsSignEqualsSignKeyword_4_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCountExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // InternalGridGame.g:2969:8: lv_op_4_2= '>'
                            {
                            lv_op_4_2=(Token)match(input,66,FOLLOW_38); 

                                    newLeafNode(lv_op_4_2, grammarAccess.getCountExpressionAccess().getOpGreaterThanSignKeyword_4_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCountExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_4_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // InternalGridGame.g:2981:8: lv_op_4_3= '<'
                            {
                            lv_op_4_3=(Token)match(input,67,FOLLOW_38); 

                                    newLeafNode(lv_op_4_3, grammarAccess.getCountExpressionAccess().getOpLessThanSignKeyword_4_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCountExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_4_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // InternalGridGame.g:2996:2: ( (lv_cmpVal_5_0= RULE_INT ) )
                    // InternalGridGame.g:2997:1: (lv_cmpVal_5_0= RULE_INT )
                    {
                    // InternalGridGame.g:2997:1: (lv_cmpVal_5_0= RULE_INT )
                    // InternalGridGame.g:2998:3: lv_cmpVal_5_0= RULE_INT
                    {
                    lv_cmpVal_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_cmpVal_5_0, grammarAccess.getCountExpressionAccess().getCmpValINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCountExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cmpVal",
                            		lv_cmpVal_5_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountExpression"


    // $ANTLR start "entryRuleNotEmptyExpression"
    // InternalGridGame.g:3022:1: entryRuleNotEmptyExpression returns [EObject current=null] : iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF ;
    public final EObject entryRuleNotEmptyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEmptyExpression = null;


        try {
            // InternalGridGame.g:3023:2: (iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF )
            // InternalGridGame.g:3024:2: iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF
            {
             newCompositeNode(grammarAccess.getNotEmptyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotEmptyExpression=ruleNotEmptyExpression();

            state._fsp--;

             current =iv_ruleNotEmptyExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotEmptyExpression"


    // $ANTLR start "ruleNotEmptyExpression"
    // InternalGridGame.g:3031:1: ruleNotEmptyExpression returns [EObject current=null] : (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleNotEmptyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:3034:28: ( (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () ) )
            // InternalGridGame.g:3035:1: (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () )
            {
            // InternalGridGame.g:3035:1: (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () )
            // InternalGridGame.g:3035:3: otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,68,FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_33); 

                	newLeafNode(otherlv_1, grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2());
                
            // InternalGridGame.g:3047:1: ()
            // InternalGridGame.g:3048:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNotEmptyExpressionAccess().getNotEmptyExpressionAction_3(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotEmptyExpression"


    // $ANTLR start "entryRuleEmptyExpression"
    // InternalGridGame.g:3061:1: entryRuleEmptyExpression returns [EObject current=null] : iv_ruleEmptyExpression= ruleEmptyExpression EOF ;
    public final EObject entryRuleEmptyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyExpression = null;


        try {
            // InternalGridGame.g:3062:2: (iv_ruleEmptyExpression= ruleEmptyExpression EOF )
            // InternalGridGame.g:3063:2: iv_ruleEmptyExpression= ruleEmptyExpression EOF
            {
             newCompositeNode(grammarAccess.getEmptyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyExpression=ruleEmptyExpression();

            state._fsp--;

             current =iv_ruleEmptyExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyExpression"


    // $ANTLR start "ruleEmptyExpression"
    // InternalGridGame.g:3070:1: ruleEmptyExpression returns [EObject current=null] : (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleEmptyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalGridGame.g:3073:28: ( (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) )
            // InternalGridGame.g:3074:1: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            {
            // InternalGridGame.g:3074:1: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            // InternalGridGame.g:3074:3: otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,69,FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_33); 

                	newLeafNode(otherlv_1, grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2());
                
            // InternalGridGame.g:3086:1: ()
            // InternalGridGame.g:3087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0039200220004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0039200220006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000002010A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000818000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000180000000070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000180000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xA000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0280040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0280040000002000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000100000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});

}