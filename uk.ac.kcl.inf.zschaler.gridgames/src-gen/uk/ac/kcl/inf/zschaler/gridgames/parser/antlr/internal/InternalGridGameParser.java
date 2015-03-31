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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'cell'", "'display'", "'as'", "'label'", "'button'", "'text'", "'var'", "'int'", "'String'", "'states'", "'('", "','", "')'", "'start'", "'='", "'transitions'", "'onEnter'", "'on'", "'goto'", "'mouse-left'", "'mouse-right'", "'end-game'", "'field'", "'width'", "'height'", "'allow_restart'", "'init'", "';'", "'default'", "':'", "'random'", "'context'", "'check'", "'value'", "'.'", "'filter'", "'count'", "'notEmpty'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGridGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGridGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGridGameParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g"; }



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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:67:1: entryRuleGridGame returns [EObject current=null] : iv_ruleGridGame= ruleGridGame EOF ;
    public final EObject entryRuleGridGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridGame = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:68:2: (iv_ruleGridGame= ruleGridGame EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:69:2: iv_ruleGridGame= ruleGridGame EOF
            {
             newCompositeNode(grammarAccess.getGridGameRule()); 
            pushFollow(FOLLOW_ruleGridGame_in_entryRuleGridGame75);
            iv_ruleGridGame=ruleGridGame();

            state._fsp--;

             current =iv_ruleGridGame; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGridGame85); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:76:1: ruleGridGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleGlobalCellStateSpec ) )? ( (lv_cells_4_0= ruleCellSpecification ) )+ ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )* otherlv_7= '}' ) ;
    public final EObject ruleGridGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_states_3_0 = null;

        EObject lv_cells_4_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_options_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:79:28: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleGlobalCellStateSpec ) )? ( (lv_cells_4_0= ruleCellSpecification ) )+ ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )* otherlv_7= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleGlobalCellStateSpec ) )? ( (lv_cells_4_0= ruleCellSpecification ) )+ ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )* otherlv_7= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleGlobalCellStateSpec ) )? ( (lv_cells_4_0= ruleCellSpecification ) )+ ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )* otherlv_7= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:80:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleGlobalCellStateSpec ) )? ( (lv_cells_4_0= ruleCellSpecification ) )+ ( (lv_fields_5_0= ruleFieldSpecification ) )+ ( (lv_options_6_0= ruleOptionSpecification ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGridGame122); 

                	newLeafNode(otherlv_0, grammarAccess.getGridGameAccess().getGameKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:85:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGridGame139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGridGameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGridGame156); 

                	newLeafNode(otherlv_2, grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:106:1: ( (lv_states_3_0= ruleGlobalCellStateSpec ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:107:1: (lv_states_3_0= ruleGlobalCellStateSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:107:1: (lv_states_3_0= ruleGlobalCellStateSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:108:3: lv_states_3_0= ruleGlobalCellStateSpec
                    {
                     
                    	        newCompositeNode(grammarAccess.getGridGameAccess().getStatesGlobalCellStateSpecParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGlobalCellStateSpec_in_ruleGridGame177);
                    lv_states_3_0=ruleGlobalCellStateSpec();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
                    	        }
                           		add(
                           			current, 
                           			"states",
                            		lv_states_3_0, 
                            		"GlobalCellStateSpec");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:124:3: ( (lv_cells_4_0= ruleCellSpecification ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:125:1: (lv_cells_4_0= ruleCellSpecification )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:125:1: (lv_cells_4_0= ruleCellSpecification )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:126:3: lv_cells_4_0= ruleCellSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellSpecification_in_ruleGridGame199);
            	    lv_cells_4_0=ruleCellSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cells",
            	            		lv_cells_4_0, 
            	            		"CellSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:142:3: ( (lv_fields_5_0= ruleFieldSpecification ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:143:1: (lv_fields_5_0= ruleFieldSpecification )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:143:1: (lv_fields_5_0= ruleFieldSpecification )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:144:3: lv_fields_5_0= ruleFieldSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldSpecification_in_ruleGridGame221);
            	    lv_fields_5_0=ruleFieldSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_5_0, 
            	            		"FieldSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:160:3: ( (lv_options_6_0= ruleOptionSpecification ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27||LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:161:1: (lv_options_6_0= ruleOptionSpecification )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:161:1: (lv_options_6_0= ruleOptionSpecification )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:162:3: lv_options_6_0= ruleOptionSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionSpecification_in_ruleGridGame243);
            	    lv_options_6_0=ruleOptionSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_6_0, 
            	            		"OptionSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleGridGame256); 

                	newLeafNode(otherlv_7, grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:190:1: entryRuleCellSpecification returns [EObject current=null] : iv_ruleCellSpecification= ruleCellSpecification EOF ;
    public final EObject entryRuleCellSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:191:2: (iv_ruleCellSpecification= ruleCellSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:192:2: iv_ruleCellSpecification= ruleCellSpecification EOF
            {
             newCompositeNode(grammarAccess.getCellSpecificationRule()); 
            pushFollow(FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification292);
            iv_ruleCellSpecification=ruleCellSpecification();

            state._fsp--;

             current =iv_ruleCellSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellSpecification302); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:199:1: ruleCellSpecification returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleCellSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:202:28: ( (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:203:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:203:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:203:3: otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleCellSpecification339); 

                	newLeafNode(otherlv_0, grammarAccess.getCellSpecificationAccess().getCellKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:207:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:208:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:208:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:209:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellSpecification356); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCellSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCellSpecification373); 

                	newLeafNode(otherlv_2, grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:229:1: ( (lv_members_3_0= ruleCellMember ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||LA5_0==20||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:230:1: (lv_members_3_0= ruleCellMember )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:230:1: (lv_members_3_0= ruleCellMember )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:231:3: lv_members_3_0= ruleCellMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellMember_in_ruleCellSpecification394);
            	    lv_members_3_0=ruleCellMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"CellMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCellSpecification407); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:259:1: entryRuleCellMember returns [EObject current=null] : iv_ruleCellMember= ruleCellMember EOF ;
    public final EObject entryRuleCellMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellMember = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:260:2: (iv_ruleCellMember= ruleCellMember EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:261:2: iv_ruleCellMember= ruleCellMember EOF
            {
             newCompositeNode(grammarAccess.getCellMemberRule()); 
            pushFollow(FOLLOW_ruleCellMember_in_entryRuleCellMember443);
            iv_ruleCellMember=ruleCellMember();

            state._fsp--;

             current =iv_ruleCellMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellMember453); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:268:1: ruleCellMember returns [EObject current=null] : (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec ) ;
    public final EObject ruleCellMember() throws RecognitionException {
        EObject current = null;

        EObject this_CellDisplaySpec_0 = null;

        EObject this_CellVarSpec_1 = null;

        EObject this_CellStateSpec_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:271:28: ( (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:272:1: (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:272:1: (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 23:
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:273:5: this_CellDisplaySpec_0= ruleCellDisplaySpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCellDisplaySpec_in_ruleCellMember500);
                    this_CellDisplaySpec_0=ruleCellDisplaySpec();

                    state._fsp--;

                     
                            current = this_CellDisplaySpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:283:5: this_CellVarSpec_1= ruleCellVarSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCellVarSpec_in_ruleCellMember527);
                    this_CellVarSpec_1=ruleCellVarSpec();

                    state._fsp--;

                     
                            current = this_CellVarSpec_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:293:5: this_CellStateSpec_2= ruleCellStateSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellStateSpecParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCellStateSpec_in_ruleCellMember554);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:309:1: entryRuleCellDisplaySpec returns [EObject current=null] : iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF ;
    public final EObject entryRuleCellDisplaySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDisplaySpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:310:2: (iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:311:2: iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF
            {
             newCompositeNode(grammarAccess.getCellDisplaySpecRule()); 
            pushFollow(FOLLOW_ruleCellDisplaySpec_in_entryRuleCellDisplaySpec589);
            iv_ruleCellDisplaySpec=ruleCellDisplaySpec();

            state._fsp--;

             current =iv_ruleCellDisplaySpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellDisplaySpec599); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:318:1: ruleCellDisplaySpec returns [EObject current=null] : (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' ) ;
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

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:321:28: ( (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:322:1: (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:322:1: (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:322:3: otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleCellDisplaySpec636); 

                	newLeafNode(otherlv_0, grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCellDisplaySpec648); 

                	newLeafNode(otherlv_1, grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCellDisplaySpec660); 

                	newLeafNode(otherlv_2, grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:334:1: ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:335:1: ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:335:1: ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:336:1: (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:336:1: (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:337:3: lv_display_type_3_1= 'label'
                    {
                    lv_display_type_3_1=(Token)match(input,17,FOLLOW_17_in_ruleCellDisplaySpec680); 

                            newLeafNode(lv_display_type_3_1, grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                           		setWithLastConsumed(current, "display_type", lv_display_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:349:8: lv_display_type_3_2= 'button'
                    {
                    lv_display_type_3_2=(Token)match(input,18,FOLLOW_18_in_ruleCellDisplaySpec709); 

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:364:2: ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:364:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:364:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:364:5: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleCellDisplaySpec739); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:368:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:369:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:369:1: (lv_text_5_0= RULE_STRING )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:370:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCellDisplaySpec756); 

                    			newLeafNode(lv_text_5_0, grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_4_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:387:6: (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:387:6: (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:387:8: otherlv_6= 'var' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleCellDisplaySpec781); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:391:1: ( (otherlv_7= RULE_ID ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:392:1: (otherlv_7= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:392:1: (otherlv_7= RULE_ID )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:393:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellDisplaySpec801); 

                    		newLeafNode(otherlv_7, grammarAccess.getCellDisplaySpecAccess().getVarVarSpecCrossReference_4_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleCellDisplaySpec815); 

                	newLeafNode(otherlv_8, grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:418:1: entryRuleCellVarSpec returns [EObject current=null] : iv_ruleCellVarSpec= ruleCellVarSpec EOF ;
    public final EObject entryRuleCellVarSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellVarSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:419:2: (iv_ruleCellVarSpec= ruleCellVarSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:420:2: iv_ruleCellVarSpec= ruleCellVarSpec EOF
            {
             newCompositeNode(grammarAccess.getCellVarSpecRule()); 
            pushFollow(FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec853);
            iv_ruleCellVarSpec=ruleCellVarSpec();

            state._fsp--;

             current =iv_ruleCellVarSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellVarSpec863); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:427:1: ruleCellVarSpec returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCellVarSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:430:28: ( (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:431:1: (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:431:1: (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:431:3: otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCellVarSpec900); 

                	newLeafNode(otherlv_0, grammarAccess.getCellVarSpecAccess().getVarKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:435:1: ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:436:1: ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:436:1: ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:437:1: (lv_type_1_1= 'int' | lv_type_1_2= 'String' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:437:1: (lv_type_1_1= 'int' | lv_type_1_2= 'String' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:438:3: lv_type_1_1= 'int'
                    {
                    lv_type_1_1=(Token)match(input,21,FOLLOW_21_in_ruleCellVarSpec920); 

                            newLeafNode(lv_type_1_1, grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellVarSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:450:8: lv_type_1_2= 'String'
                    {
                    lv_type_1_2=(Token)match(input,22,FOLLOW_22_in_ruleCellVarSpec949); 

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:465:2: ( (lv_name_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:466:1: (lv_name_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:466:1: (lv_name_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:467:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellVarSpec982); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCellVarSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:491:1: entryRuleGlobalCellStateSpec returns [EObject current=null] : iv_ruleGlobalCellStateSpec= ruleGlobalCellStateSpec EOF ;
    public final EObject entryRuleGlobalCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalCellStateSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:492:2: (iv_ruleGlobalCellStateSpec= ruleGlobalCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:493:2: iv_ruleGlobalCellStateSpec= ruleGlobalCellStateSpec EOF
            {
             newCompositeNode(grammarAccess.getGlobalCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleGlobalCellStateSpec_in_entryRuleGlobalCellStateSpec1023);
            iv_ruleGlobalCellStateSpec=ruleGlobalCellStateSpec();

            state._fsp--;

             current =iv_ruleGlobalCellStateSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalCellStateSpec1033); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:500:1: ruleGlobalCellStateSpec returns [EObject current=null] : (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleStateParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:503:28: ( (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleStateParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:504:1: (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleStateParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:504:1: (otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleStateParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:504:3: otherlv_0= 'states' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleStateParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_states_8_0= ruleCellState ) )+ otherlv_9= 'start' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleGlobalCellStateSpec1070); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalCellStateSpecAccess().getStatesKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:508:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:509:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:509:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:510:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalCellStateSpec1087); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGlobalCellStateSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalCellStateSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:526:2: (otherlv_2= '(' ( (lv_params_3_0= ruleStateParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )* otherlv_6= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:526:4: otherlv_2= '(' ( (lv_params_3_0= ruleStateParamSpec ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleGlobalCellStateSpec1105); 

                        	newLeafNode(otherlv_2, grammarAccess.getGlobalCellStateSpecAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:530:1: ( (lv_params_3_0= ruleStateParamSpec ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:531:1: (lv_params_3_0= ruleStateParamSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:531:1: (lv_params_3_0= ruleStateParamSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:532:3: lv_params_3_0= ruleStateParamSpec
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateParamSpec_in_ruleGlobalCellStateSpec1126);
                    lv_params_3_0=ruleStateParamSpec();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalCellStateSpecRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"StateParamSpec");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:548:2: (otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==25) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:548:4: otherlv_4= ',' ( (lv_params_5_0= ruleStateParamSpec ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleGlobalCellStateSpec1139); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getGlobalCellStateSpecAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:552:1: ( (lv_params_5_0= ruleStateParamSpec ) )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:553:1: (lv_params_5_0= ruleStateParamSpec )
                    	    {
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:553:1: (lv_params_5_0= ruleStateParamSpec )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:554:3: lv_params_5_0= ruleStateParamSpec
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStateParamSpec_in_ruleGlobalCellStateSpec1160);
                    	    lv_params_5_0=ruleStateParamSpec();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGlobalCellStateSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"StateParamSpec");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleGlobalCellStateSpec1174); 

                        	newLeafNode(otherlv_6, grammarAccess.getGlobalCellStateSpecAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleGlobalCellStateSpec1188); 

                	newLeafNode(otherlv_7, grammarAccess.getGlobalCellStateSpecAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:578:1: ( (lv_states_8_0= ruleCellState ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:579:1: (lv_states_8_0= ruleCellState )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:579:1: (lv_states_8_0= ruleCellState )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:580:3: lv_states_8_0= ruleCellState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalCellStateSpecAccess().getStatesCellStateParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellState_in_ruleGlobalCellStateSpec1209);
            	    lv_states_8_0=ruleCellState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalCellStateSpecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_8_0, 
            	            		"CellState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleGlobalCellStateSpec1222); 

                	newLeafNode(otherlv_9, grammarAccess.getGlobalCellStateSpecAccess().getStartKeyword_5());
                
            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleGlobalCellStateSpec1234); 

                	newLeafNode(otherlv_10, grammarAccess.getGlobalCellStateSpecAccess().getEqualsSignKeyword_6());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:604:1: ( (otherlv_11= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:605:1: (otherlv_11= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:605:1: (otherlv_11= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:606:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalCellStateSpecRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalCellStateSpec1254); 

            		newLeafNode(otherlv_11, grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleGlobalCellStateSpec1266); 

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


    // $ANTLR start "entryRuleStateParamSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:629:1: entryRuleStateParamSpec returns [EObject current=null] : iv_ruleStateParamSpec= ruleStateParamSpec EOF ;
    public final EObject entryRuleStateParamSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateParamSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:630:2: (iv_ruleStateParamSpec= ruleStateParamSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:631:2: iv_ruleStateParamSpec= ruleStateParamSpec EOF
            {
             newCompositeNode(grammarAccess.getStateParamSpecRule()); 
            pushFollow(FOLLOW_ruleStateParamSpec_in_entryRuleStateParamSpec1302);
            iv_ruleStateParamSpec=ruleStateParamSpec();

            state._fsp--;

             current =iv_ruleStateParamSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateParamSpec1312); 

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
    // $ANTLR end "entryRuleStateParamSpec"


    // $ANTLR start "ruleStateParamSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:638:1: ruleStateParamSpec returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStateParamSpec() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:641:28: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:642:1: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:642:1: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:642:2: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:642:2: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:643:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:643:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:644:1: (lv_type_0_1= 'int' | lv_type_0_2= 'String' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:644:1: (lv_type_0_1= 'int' | lv_type_0_2= 'String' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:645:3: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,21,FOLLOW_21_in_ruleStateParamSpec1357); 

                            newLeafNode(lv_type_0_1, grammarAccess.getStateParamSpecAccess().getTypeIntKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateParamSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:657:8: lv_type_0_2= 'String'
                    {
                    lv_type_0_2=(Token)match(input,22,FOLLOW_22_in_ruleStateParamSpec1386); 

                            newLeafNode(lv_type_0_2, grammarAccess.getStateParamSpecAccess().getTypeStringKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateParamSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:672:2: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:673:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:673:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:674:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateParamSpec1419); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateParamSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleStateParamSpec"


    // $ANTLR start "entryRuleCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:698:1: entryRuleCellStateSpec returns [EObject current=null] : iv_ruleCellStateSpec= ruleCellStateSpec EOF ;
    public final EObject entryRuleCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStateSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:699:2: (iv_ruleCellStateSpec= ruleCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:700:2: iv_ruleCellStateSpec= ruleCellStateSpec EOF
            {
             newCompositeNode(grammarAccess.getCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec1460);
            iv_ruleCellStateSpec=ruleCellStateSpec();

            state._fsp--;

             current =iv_ruleCellStateSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellStateSpec1470); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:707:1: ruleCellStateSpec returns [EObject current=null] : (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference ) ;
    public final EObject ruleCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject this_LocalCellStateSpec_0 = null;

        EObject this_CellStateSpecReference_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:710:28: ( (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:711:1: (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:711:1: (this_LocalCellStateSpec_0= ruleLocalCellStateSpec | this_CellStateSpecReference_1= ruleCellStateSpecReference )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==12) ) {
                    alt14=1;
                }
                else if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:712:5: this_LocalCellStateSpec_0= ruleLocalCellStateSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellStateSpecAccess().getLocalCellStateSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLocalCellStateSpec_in_ruleCellStateSpec1517);
                    this_LocalCellStateSpec_0=ruleLocalCellStateSpec();

                    state._fsp--;

                     
                            current = this_LocalCellStateSpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:722:5: this_CellStateSpecReference_1= ruleCellStateSpecReference
                    {
                     
                            newCompositeNode(grammarAccess.getCellStateSpecAccess().getCellStateSpecReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCellStateSpecReference_in_ruleCellStateSpec1544);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:738:1: entryRuleLocalCellStateSpec returns [EObject current=null] : iv_ruleLocalCellStateSpec= ruleLocalCellStateSpec EOF ;
    public final EObject entryRuleLocalCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalCellStateSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:739:2: (iv_ruleLocalCellStateSpec= ruleLocalCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:740:2: iv_ruleLocalCellStateSpec= ruleLocalCellStateSpec EOF
            {
             newCompositeNode(grammarAccess.getLocalCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleLocalCellStateSpec_in_entryRuleLocalCellStateSpec1579);
            iv_ruleLocalCellStateSpec=ruleLocalCellStateSpec();

            state._fsp--;

             current =iv_ruleLocalCellStateSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalCellStateSpec1589); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:747:1: ruleLocalCellStateSpec returns [EObject current=null] : (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:750:28: ( (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:751:1: (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:751:1: (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:751:3: otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleLocalCellStateSpec1626); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalCellStateSpecAccess().getStatesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleLocalCellStateSpec1638); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalCellStateSpecAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:759:1: ( (lv_states_2_0= ruleCellState ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:760:1: (lv_states_2_0= ruleCellState )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:760:1: (lv_states_2_0= ruleCellState )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:761:3: lv_states_2_0= ruleCellState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLocalCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellState_in_ruleLocalCellStateSpec1659);
            	    lv_states_2_0=ruleCellState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLocalCellStateSpecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_2_0, 
            	            		"CellState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleLocalCellStateSpec1672); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalCellStateSpecAccess().getStartKeyword_3());
                
            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleLocalCellStateSpec1684); 

                	newLeafNode(otherlv_4, grammarAccess.getLocalCellStateSpecAccess().getEqualsSignKeyword_4());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:785:1: ( (otherlv_5= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:786:1: (otherlv_5= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:786:1: (otherlv_5= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:787:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalCellStateSpecRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalCellStateSpec1704); 

            		newLeafNode(otherlv_5, grammarAccess.getLocalCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleLocalCellStateSpec1716); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:810:1: entryRuleCellStateSpecReference returns [EObject current=null] : iv_ruleCellStateSpecReference= ruleCellStateSpecReference EOF ;
    public final EObject entryRuleCellStateSpecReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStateSpecReference = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:811:2: (iv_ruleCellStateSpecReference= ruleCellStateSpecReference EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:812:2: iv_ruleCellStateSpecReference= ruleCellStateSpecReference EOF
            {
             newCompositeNode(grammarAccess.getCellStateSpecReferenceRule()); 
            pushFollow(FOLLOW_ruleCellStateSpecReference_in_entryRuleCellStateSpecReference1752);
            iv_ruleCellStateSpecReference=ruleCellStateSpecReference();

            state._fsp--;

             current =iv_ruleCellStateSpecReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellStateSpecReference1762); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:819:1: ruleCellStateSpecReference returns [EObject current=null] : (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:822:28: ( (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:823:1: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:823:1: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:823:3: otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleCellStateSpecReference1799); 

                	newLeafNode(otherlv_0, grammarAccess.getCellStateSpecReferenceAccess().getStatesKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:827:1: ( (otherlv_1= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:828:1: (otherlv_1= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:828:1: (otherlv_1= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:829:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCellStateSpecReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellStateSpecReference1819); 

            		newLeafNode(otherlv_1, grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecCrossReference_1_0()); 
            	

            }


            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:840:2: (otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:840:4: otherlv_2= '(' ( (lv_params_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleCellStateSpecReference1832); 

                        	newLeafNode(otherlv_2, grammarAccess.getCellStateSpecReferenceAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:844:1: ( (lv_params_3_0= ruleValue ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:845:1: (lv_params_3_0= ruleValue )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:845:1: (lv_params_3_0= ruleValue )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:846:3: lv_params_3_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleCellStateSpecReference1853);
                    lv_params_3_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellStateSpecReferenceRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:862:2: (otherlv_4= ',' ( (lv_params_5_0= ruleValue ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==25) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:862:4: otherlv_4= ',' ( (lv_params_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleCellStateSpecReference1866); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCellStateSpecReferenceAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:866:1: ( (lv_params_5_0= ruleValue ) )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:867:1: (lv_params_5_0= ruleValue )
                    	    {
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:867:1: (lv_params_5_0= ruleValue )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:868:3: lv_params_5_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleCellStateSpecReference1887);
                    	    lv_params_5_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCellStateSpecReferenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleCellStateSpecReference1901); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:896:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:897:2: (iv_ruleValue= ruleValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:898:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1939);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1949); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:905:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_VarRefValue_2= ruleVarRefValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_VarRefValue_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:908:28: ( (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_VarRefValue_2= ruleVarRefValue ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:909:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_VarRefValue_2= ruleVarRefValue )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:909:1: (this_StringValue_0= ruleStringValue | this_IntValue_1= ruleIntValue | this_VarRefValue_2= ruleVarRefValue )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:910:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue1996);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:920:5: this_IntValue_1= ruleIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue2023);
                    this_IntValue_1=ruleIntValue();

                    state._fsp--;

                     
                            current = this_IntValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:930:5: this_VarRefValue_2= ruleVarRefValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getVarRefValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVarRefValue_in_ruleValue2050);
                    this_VarRefValue_2=ruleVarRefValue();

                    state._fsp--;

                     
                            current = this_VarRefValue_2; 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:946:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:947:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:948:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2085);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue2095); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:955:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:958:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:959:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:959:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:960:1: (lv_value_0_0= RULE_STRING )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:960:1: (lv_value_0_0= RULE_STRING )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:961:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue2136); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:985:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:986:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:987:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue2176);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue2186); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:994:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:997:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:998:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:998:1: ( (lv_value_0_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:999:1: (lv_value_0_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:999:1: (lv_value_0_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1000:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue2227); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1024:1: entryRuleVarRefValue returns [EObject current=null] : iv_ruleVarRefValue= ruleVarRefValue EOF ;
    public final EObject entryRuleVarRefValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefValue = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1025:2: (iv_ruleVarRefValue= ruleVarRefValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1026:2: iv_ruleVarRefValue= ruleVarRefValue EOF
            {
             newCompositeNode(grammarAccess.getVarRefValueRule()); 
            pushFollow(FOLLOW_ruleVarRefValue_in_entryRuleVarRefValue2267);
            iv_ruleVarRefValue=ruleVarRefValue();

            state._fsp--;

             current =iv_ruleVarRefValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRefValue2277); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1033:1: ruleVarRefValue returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarRefValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1036:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1037:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1037:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1038:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1038:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1039:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVarRefValueRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarRefValue2321); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1058:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1059:2: (iv_ruleCellState= ruleCellState EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1060:2: iv_ruleCellState= ruleCellState EOF
            {
             newCompositeNode(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_ruleCellState_in_entryRuleCellState2356);
            iv_ruleCellState=ruleCellState();

            state._fsp--;

             current =iv_ruleCellState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellState2366); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1067:1: ruleCellState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1070:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1071:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1071:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1071:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1071:2: ( (lv_name_0_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1072:1: (lv_name_0_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1072:1: (lv_name_0_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1073:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellState2408); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCellStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCellState2425); 

                	newLeafNode(otherlv_1, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1093:1: ( (lv_display_2_0= ruleCellDisplaySpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1094:1: (lv_display_2_0= ruleCellDisplaySpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1094:1: (lv_display_2_0= ruleCellDisplaySpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1095:3: lv_display_2_0= ruleCellDisplaySpec
            {
             
            	        newCompositeNode(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCellDisplaySpec_in_ruleCellState2446);
            lv_display_2_0=ruleCellDisplaySpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCellStateRule());
            	        }
                   		set(
                   			current, 
                   			"display",
                    		lv_display_2_0, 
                    		"CellDisplaySpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1111:2: (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1111:4: otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCellState2459); 

                        	newLeafNode(otherlv_3, grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleCellState2471); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1119:1: ( (lv_transitions_5_0= ruleTransitionSpec ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==31) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1120:1: (lv_transitions_5_0= ruleTransitionSpec )
                    	    {
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1120:1: (lv_transitions_5_0= ruleTransitionSpec )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1121:3: lv_transitions_5_0= ruleTransitionSpec
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransitionSpec_in_ruleCellState2492);
                    	    lv_transitions_5_0=ruleTransitionSpec();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_5_0, 
                    	            		"TransitionSpec");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleCellState2505); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1141:3: (otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1141:5: otherlv_7= 'onEnter' otherlv_8= '{' ( (lv_onEnter_9_0= ruleCellStateBehaviour ) ) (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleCellState2520); 

                        	newLeafNode(otherlv_7, grammarAccess.getCellStateAccess().getOnEnterKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleCellState2532); 

                        	newLeafNode(otherlv_8, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1149:1: ( (lv_onEnter_9_0= ruleCellStateBehaviour ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1150:1: (lv_onEnter_9_0= ruleCellStateBehaviour )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1150:1: (lv_onEnter_9_0= ruleCellStateBehaviour )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1151:3: lv_onEnter_9_0= ruleCellStateBehaviour
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCellStateBehaviour_in_ruleCellState2553);
                    lv_onEnter_9_0=ruleCellStateBehaviour();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	        }
                           		add(
                           			current, 
                           			"onEnter",
                            		lv_onEnter_9_0, 
                            		"CellStateBehaviour");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1167:2: (otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==25) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1167:4: otherlv_10= ',' ( (lv_onEnter_11_0= ruleCellStateBehaviour ) )
                    	    {
                    	    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleCellState2566); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getCellStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1171:1: ( (lv_onEnter_11_0= ruleCellStateBehaviour ) )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1172:1: (lv_onEnter_11_0= ruleCellStateBehaviour )
                    	    {
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1172:1: (lv_onEnter_11_0= ruleCellStateBehaviour )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1173:3: lv_onEnter_11_0= ruleCellStateBehaviour
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCellStateBehaviour_in_ruleCellState2587);
                    	    lv_onEnter_11_0=ruleCellStateBehaviour();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"onEnter",
                    	            		lv_onEnter_11_0, 
                    	            		"CellStateBehaviour");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleCellState2601); 

                        	newLeafNode(otherlv_12, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleCellState2615); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1205:1: entryRuleTransitionSpec returns [EObject current=null] : iv_ruleTransitionSpec= ruleTransitionSpec EOF ;
    public final EObject entryRuleTransitionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1206:2: (iv_ruleTransitionSpec= ruleTransitionSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1207:2: iv_ruleTransitionSpec= ruleTransitionSpec EOF
            {
             newCompositeNode(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec2651);
            iv_ruleTransitionSpec=ruleTransitionSpec();

            state._fsp--;

             current =iv_ruleTransitionSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpec2661); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1214:1: ruleTransitionSpec returns [EObject current=null] : (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_trigger_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1217:28: ( (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1218:1: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1218:1: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1218:3: otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTransitionSpec2698); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionSpecAccess().getOnKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1222:1: ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1223:1: (lv_trigger_1_0= ruleTransitionTriggerSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1223:1: (lv_trigger_1_0= ruleTransitionTriggerSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1224:3: lv_trigger_1_0= ruleTransitionTriggerSpec
            {
             
            	        newCompositeNode(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_ruleTransitionSpec2719);
            lv_trigger_1_0=ruleTransitionTriggerSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionSpecRule());
            	        }
                   		set(
                   			current, 
                   			"trigger",
                    		lv_trigger_1_0, 
                    		"TransitionTriggerSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleTransitionSpec2731); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionSpecAccess().getGotoKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1244:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1245:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1245:1: (otherlv_3= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1246:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionSpecRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionSpec2751); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1265:1: entryRuleTransitionTriggerSpec returns [String current=null] : iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF ;
    public final String entryRuleTransitionTriggerSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTransitionTriggerSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1266:2: (iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1267:2: iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF
            {
             newCompositeNode(grammarAccess.getTransitionTriggerSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec2788);
            iv_ruleTransitionTriggerSpec=ruleTransitionTriggerSpec();

            state._fsp--;

             current =iv_ruleTransitionTriggerSpec.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionTriggerSpec2799); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1274:1: ruleTransitionTriggerSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mouse-left' | kw= 'mouse-right' ) ;
    public final AntlrDatatypeRuleToken ruleTransitionTriggerSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1277:28: ( (kw= 'mouse-left' | kw= 'mouse-right' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1278:1: (kw= 'mouse-left' | kw= 'mouse-right' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1278:1: (kw= 'mouse-left' | kw= 'mouse-right' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1279:2: kw= 'mouse-left'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTransitionTriggerSpec2837); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTransitionTriggerSpecAccess().getMouseLeftKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1286:2: kw= 'mouse-right'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleTransitionTriggerSpec2856); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTransitionTriggerSpecAccess().getMouseRightKeyword_1()); 
                        

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


    // $ANTLR start "entryRuleCellStateBehaviour"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1299:1: entryRuleCellStateBehaviour returns [EObject current=null] : iv_ruleCellStateBehaviour= ruleCellStateBehaviour EOF ;
    public final EObject entryRuleCellStateBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStateBehaviour = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1300:2: (iv_ruleCellStateBehaviour= ruleCellStateBehaviour EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1301:2: iv_ruleCellStateBehaviour= ruleCellStateBehaviour EOF
            {
             newCompositeNode(grammarAccess.getCellStateBehaviourRule()); 
            pushFollow(FOLLOW_ruleCellStateBehaviour_in_entryRuleCellStateBehaviour2896);
            iv_ruleCellStateBehaviour=ruleCellStateBehaviour();

            state._fsp--;

             current =iv_ruleCellStateBehaviour; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellStateBehaviour2906); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1308:1: ruleCellStateBehaviour returns [EObject current=null] : this_EndGameBehaviour_0= ruleEndGameBehaviour ;
    public final EObject ruleCellStateBehaviour() throws RecognitionException {
        EObject current = null;

        EObject this_EndGameBehaviour_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1311:28: (this_EndGameBehaviour_0= ruleEndGameBehaviour )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1313:5: this_EndGameBehaviour_0= ruleEndGameBehaviour
            {
             
                    newCompositeNode(grammarAccess.getCellStateBehaviourAccess().getEndGameBehaviourParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleEndGameBehaviour_in_ruleCellStateBehaviour2952);
            this_EndGameBehaviour_0=ruleEndGameBehaviour();

            state._fsp--;

             
                    current = this_EndGameBehaviour_0; 
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleEndGameBehaviour"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1329:1: entryRuleEndGameBehaviour returns [EObject current=null] : iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF ;
    public final EObject entryRuleEndGameBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndGameBehaviour = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1330:2: (iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1331:2: iv_ruleEndGameBehaviour= ruleEndGameBehaviour EOF
            {
             newCompositeNode(grammarAccess.getEndGameBehaviourRule()); 
            pushFollow(FOLLOW_ruleEndGameBehaviour_in_entryRuleEndGameBehaviour2986);
            iv_ruleEndGameBehaviour=ruleEndGameBehaviour();

            state._fsp--;

             current =iv_ruleEndGameBehaviour; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndGameBehaviour2996); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1338:1: ruleEndGameBehaviour returns [EObject current=null] : (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleEndGameBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_message_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1341:28: ( (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1342:1: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1342:1: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1342:3: otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleEndGameBehaviour3033); 

                	newLeafNode(otherlv_0, grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEndGameBehaviour3045); 

                	newLeafNode(otherlv_1, grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1350:1: ( (lv_message_2_0= RULE_STRING ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1351:1: (lv_message_2_0= RULE_STRING )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1351:1: (lv_message_2_0= RULE_STRING )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1352:3: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEndGameBehaviour3062); 

            			newLeafNode(lv_message_2_0, grammarAccess.getEndGameBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEndGameBehaviourRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleEndGameBehaviour3079); 

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


    // $ANTLR start "entryRuleFieldSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1380:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1381:2: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1382:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
            {
             newCompositeNode(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification3115);
            iv_ruleFieldSpecification=ruleFieldSpecification();

            state._fsp--;

             current =iv_ruleFieldSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldSpecification3125); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1389:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1392:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1393:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1393:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1393:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFieldSpecification3162); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1397:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1398:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1398:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1399:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldSpecification3179); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFieldSpecification3196); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleFieldSpecification3208); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3());
                
            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleFieldSpecification3220); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1427:1: ( (lv_width_5_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1428:1: (lv_width_5_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1428:1: (lv_width_5_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1429:3: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification3237); 

            			newLeafNode(lv_width_5_0, grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleFieldSpecification3254); 

                	newLeafNode(otherlv_6, grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6());
                
            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleFieldSpecification3266); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1453:1: ( (lv_height_8_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1454:1: (lv_height_8_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1454:1: (lv_height_8_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1455:3: lv_height_8_0= RULE_INT
            {
            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification3283); 

            			newLeafNode(lv_height_8_0, grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_8_0, 
                    		"INT");
            	    

            }


            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1471:2: ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1472:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1472:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1473:3: lv_field_initialisation_9_0= ruleFieldInitialisations
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification3309);
                    lv_field_initialisation_9_0=ruleFieldInitialisations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldSpecificationRule());
                    	        }
                           		set(
                           			current, 
                           			"field_initialisation",
                            		lv_field_initialisation_9_0, 
                            		"FieldInitialisations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleFieldSpecification3322); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1501:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1502:2: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1503:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification3358);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSpecification3368); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1510:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_AllowRestartMenu_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1513:28: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1514:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1514:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1515:5: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification3415);
                    this_StartFieldDeclaration_0=ruleStartFieldDeclaration();

                    state._fsp--;

                     
                            current = this_StartFieldDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1525:5: this_AllowRestartMenu_1= ruleAllowRestartMenu
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification3442);
                    this_AllowRestartMenu_1=ruleAllowRestartMenu();

                    state._fsp--;

                     
                            current = this_AllowRestartMenu_1; 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1541:1: entryRuleAllowRestartMenu returns [EObject current=null] : iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF ;
    public final EObject entryRuleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowRestartMenu = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1542:2: (iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1543:2: iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF
            {
             newCompositeNode(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu3477);
            iv_ruleAllowRestartMenu=ruleAllowRestartMenu();

            state._fsp--;

             current =iv_ruleAllowRestartMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowRestartMenu3487); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1550:1: ruleAllowRestartMenu returns [EObject current=null] : (otherlv_0= 'allow_restart' () ) ;
    public final EObject ruleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1553:28: ( (otherlv_0= 'allow_restart' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1554:1: (otherlv_0= 'allow_restart' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1554:1: (otherlv_0= 'allow_restart' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1554:3: otherlv_0= 'allow_restart' ()
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleAllowRestartMenu3524); 

                	newLeafNode(otherlv_0, grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1558:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1559:5: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1572:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1573:2: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1574:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration3569);
            iv_ruleStartFieldDeclaration=ruleStartFieldDeclaration();

            state._fsp--;

             current =iv_ruleStartFieldDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartFieldDeclaration3579); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1581:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1584:28: ( (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1585:1: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1585:1: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1585:3: otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleStartFieldDeclaration3616); 

                	newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleStartFieldDeclaration3628); 

                	newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1593:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1594:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1594:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1595:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStartFieldDeclarationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartFieldDeclaration3648); 

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


    // $ANTLR start "entryRuleFieldInitialisations"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1614:1: entryRuleFieldInitialisations returns [EObject current=null] : iv_ruleFieldInitialisations= ruleFieldInitialisations EOF ;
    public final EObject entryRuleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisations = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1615:2: (iv_ruleFieldInitialisations= ruleFieldInitialisations EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1616:2: iv_ruleFieldInitialisations= ruleFieldInitialisations EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations3684);
            iv_ruleFieldInitialisations=ruleFieldInitialisations();

            state._fsp--;

             current =iv_ruleFieldInitialisations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisations3694); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1623:1: ruleFieldInitialisations returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_initialisations_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1626:28: ( (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1627:1: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1627:1: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1627:3: otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleFieldInitialisations3731); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFieldInitialisations3743); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1635:1: ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42||(LA26_0>=44 && LA26_0<=45)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1635:2: ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';'
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1635:2: ( (lv_initialisations_2_0= ruleFieldInitialisation ) )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1636:1: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1636:1: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1637:3: lv_initialisations_2_0= ruleFieldInitialisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations3765);
            	    lv_initialisations_2_0=ruleFieldInitialisation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldInitialisationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initialisations",
            	            		lv_initialisations_2_0, 
            	            		"FieldInitialisation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleFieldInitialisations3777); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFieldInitialisationsAccess().getSemicolonKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleFieldInitialisations3791); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldInitialisationsAccess().getRightCurlyBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleFieldInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1669:1: entryRuleFieldInitialisation returns [EObject current=null] : iv_ruleFieldInitialisation= ruleFieldInitialisation EOF ;
    public final EObject entryRuleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1670:2: (iv_ruleFieldInitialisation= ruleFieldInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1671:2: iv_ruleFieldInitialisation= ruleFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation3827);
            iv_ruleFieldInitialisation=ruleFieldInitialisation();

            state._fsp--;

             current =iv_ruleFieldInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisation3837); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1678:1: ruleFieldInitialisation returns [EObject current=null] : (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) ;
    public final EObject ruleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultInitialisation_0 = null;

        EObject this_RandomInitialisation_1 = null;

        EObject this_ContextInitialisation_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1681:28: ( (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1682:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1682:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt27=1;
                }
                break;
            case 44:
                {
                alt27=2;
                }
                break;
            case 45:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1683:5: this_DefaultInitialisation_0= ruleDefaultInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation3884);
                    this_DefaultInitialisation_0=ruleDefaultInitialisation();

                    state._fsp--;

                     
                            current = this_DefaultInitialisation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1693:5: this_RandomInitialisation_1= ruleRandomInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation3911);
                    this_RandomInitialisation_1=ruleRandomInitialisation();

                    state._fsp--;

                     
                            current = this_RandomInitialisation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1703:5: this_ContextInitialisation_2= ruleContextInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleContextInitialisation_in_ruleFieldInitialisation3938);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1719:1: entryRuleDefaultInitialisation returns [EObject current=null] : iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF ;
    public final EObject entryRuleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1720:2: (iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1721:2: iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF
            {
             newCompositeNode(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation3973);
            iv_ruleDefaultInitialisation=ruleDefaultInitialisation();

            state._fsp--;

             current =iv_ruleDefaultInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultInitialisation3983); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1728:1: ruleDefaultInitialisation returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1731:28: ( (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1732:1: (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1732:1: (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1732:3: otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleDefaultInitialisation4020); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleDefaultInitialisation4032); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1740:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1741:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1741:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1742:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefaultInitialisation4052); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1761:1: entryRuleRandomInitialisation returns [EObject current=null] : iv_ruleRandomInitialisation= ruleRandomInitialisation EOF ;
    public final EObject entryRuleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1762:2: (iv_ruleRandomInitialisation= ruleRandomInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1763:2: iv_ruleRandomInitialisation= ruleRandomInitialisation EOF
            {
             newCompositeNode(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation4088);
            iv_ruleRandomInitialisation=ruleRandomInitialisation();

            state._fsp--;

             current =iv_ruleRandomInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRandomInitialisation4098); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1770:1: ruleRandomInitialisation returns [EObject current=null] : (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_count_4_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1773:28: ( (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1774:1: (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1774:1: (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1774:3: otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleRandomInitialisation4135); 

                	newLeafNode(otherlv_0, grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleRandomInitialisation4147); 

                	newLeafNode(otherlv_1, grammarAccess.getRandomInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1782:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1783:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1783:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1784:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRandomInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRandomInitialisation4167); 

            		newLeafNode(otherlv_2, grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRandomInitialisation4179); 

                	newLeafNode(otherlv_3, grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1799:1: ( (lv_count_4_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1800:1: (lv_count_4_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1800:1: (lv_count_4_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1801:3: lv_count_4_0= RULE_INT
            {
            lv_count_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRandomInitialisation4196); 

            			newLeafNode(lv_count_4_0, grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRandomInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"count",
                    		lv_count_4_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleRandomInitialisation"


    // $ANTLR start "entryRuleContextInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1825:1: entryRuleContextInitialisation returns [EObject current=null] : iv_ruleContextInitialisation= ruleContextInitialisation EOF ;
    public final EObject entryRuleContextInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1826:2: (iv_ruleContextInitialisation= ruleContextInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1827:2: iv_ruleContextInitialisation= ruleContextInitialisation EOF
            {
             newCompositeNode(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation4237);
            iv_ruleContextInitialisation=ruleContextInitialisation();

            state._fsp--;

             current =iv_ruleContextInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextInitialisation4247); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1834:1: ruleContextInitialisation returns [EObject current=null] : (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1837:28: ( (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1838:1: (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1838:1: (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1838:3: otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleContextInitialisation4284); 

                	newLeafNode(otherlv_0, grammarAccess.getContextInitialisationAccess().getContextKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleContextInitialisation4296); 

                	newLeafNode(otherlv_1, grammarAccess.getContextInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1846:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1847:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1847:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1848:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContextInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContextInitialisation4316); 

            		newLeafNode(otherlv_2, grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleContextInitialisation4328); 

                	newLeafNode(otherlv_3, grammarAccess.getContextInitialisationAccess().getCheckKeyword_3());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1863:1: ( (lv_check_4_0= ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1864:1: (lv_check_4_0= ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1864:1: (lv_check_4_0= ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1865:3: lv_check_4_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleContextExpression_in_ruleContextInitialisation4349);
            lv_check_4_0=ruleContextExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextInitialisationRule());
            	        }
                   		set(
                   			current, 
                   			"check",
                    		lv_check_4_0, 
                    		"ContextExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleContextInitialisation4361); 

                	newLeafNode(otherlv_5, grammarAccess.getContextInitialisationAccess().getValueKeyword_5());
                
            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleContextInitialisation4373); 

                	newLeafNode(otherlv_6, grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1889:1: ( (lv_exp_7_0= ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1890:1: (lv_exp_7_0= ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1890:1: (lv_exp_7_0= ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1891:3: lv_exp_7_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleContextExpression_in_ruleContextInitialisation4394);
            lv_exp_7_0=ruleContextExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextInitialisationRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_7_0, 
                    		"ContextExpression");
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1915:1: entryRuleContextExpression returns [EObject current=null] : iv_ruleContextExpression= ruleContextExpression EOF ;
    public final EObject entryRuleContextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1916:2: (iv_ruleContextExpression= ruleContextExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1917:2: iv_ruleContextExpression= ruleContextExpression EOF
            {
             newCompositeNode(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_ruleContextExpression_in_entryRuleContextExpression4430);
            iv_ruleContextExpression=ruleContextExpression();

            state._fsp--;

             current =iv_ruleContextExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextExpression4440); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1924:1: ruleContextExpression returns [EObject current=null] : ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* ) ;
    public final EObject ruleContextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sub_exp_0_0 = null;

        EObject lv_sub_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1927:28: ( ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1928:1: ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1928:1: ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1928:2: ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )*
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1928:2: ( (lv_sub_exp_0_0= ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1929:1: (lv_sub_exp_0_0= ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1929:1: (lv_sub_exp_0_0= ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1930:3: lv_sub_exp_0_0= ruleAtomicExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicExpression_in_ruleContextExpression4486);
            lv_sub_exp_0_0=ruleAtomicExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"sub_exp",
                    		lv_sub_exp_0_0, 
                    		"AtomicExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1946:2: (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1946:4: otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleContextExpression4499); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1950:1: ( (lv_sub_exp_2_0= ruleAtomicExpression ) )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1951:1: (lv_sub_exp_2_0= ruleAtomicExpression )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1951:1: (lv_sub_exp_2_0= ruleAtomicExpression )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1952:3: lv_sub_exp_2_0= ruleAtomicExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleContextExpression4520);
            	    lv_sub_exp_2_0=ruleAtomicExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sub_exp",
            	            		lv_sub_exp_2_0, 
            	            		"AtomicExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1976:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1977:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1978:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4558);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression4568); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1985:1: ruleAtomicExpression returns [EObject current=null] : (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FilterExpression_0 = null;

        EObject this_CountExpression_1 = null;

        EObject this_NotEmptyExpression_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1988:28: ( (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1989:1: (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1989:1: (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt29=1;
                }
                break;
            case 50:
                {
                alt29=2;
                }
                break;
            case 51:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1990:5: this_FilterExpression_0= ruleFilterExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFilterExpression_in_ruleAtomicExpression4615);
                    this_FilterExpression_0=ruleFilterExpression();

                    state._fsp--;

                     
                            current = this_FilterExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2000:5: this_CountExpression_1= ruleCountExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCountExpression_in_ruleAtomicExpression4642);
                    this_CountExpression_1=ruleCountExpression();

                    state._fsp--;

                     
                            current = this_CountExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2010:5: this_NotEmptyExpression_2= ruleNotEmptyExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNotEmptyExpression_in_ruleAtomicExpression4669);
                    this_NotEmptyExpression_2=ruleNotEmptyExpression();

                    state._fsp--;

                     
                            current = this_NotEmptyExpression_2; 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2026:1: entryRuleFilterExpression returns [EObject current=null] : iv_ruleFilterExpression= ruleFilterExpression EOF ;
    public final EObject entryRuleFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2027:2: (iv_ruleFilterExpression= ruleFilterExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2028:2: iv_ruleFilterExpression= ruleFilterExpression EOF
            {
             newCompositeNode(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression4704);
            iv_ruleFilterExpression=ruleFilterExpression();

            state._fsp--;

             current =iv_ruleFilterExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterExpression4714); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2035:1: ruleFilterExpression returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFilterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2038:28: ( (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2039:1: (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2039:1: (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2039:3: otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleFilterExpression4751); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterExpressionAccess().getFilterKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleFilterExpression4763); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2047:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2048:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2048:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2049:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterExpression4783); 

            		newLeafNode(otherlv_2, grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleFilterExpression4795); 

                	newLeafNode(otherlv_3, grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_3());
                

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


    // $ANTLR start "entryRuleCountExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2072:1: entryRuleCountExpression returns [EObject current=null] : iv_ruleCountExpression= ruleCountExpression EOF ;
    public final EObject entryRuleCountExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2073:2: (iv_ruleCountExpression= ruleCountExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2074:2: iv_ruleCountExpression= ruleCountExpression EOF
            {
             newCompositeNode(grammarAccess.getCountExpressionRule()); 
            pushFollow(FOLLOW_ruleCountExpression_in_entryRuleCountExpression4831);
            iv_ruleCountExpression=ruleCountExpression();

            state._fsp--;

             current =iv_ruleCountExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountExpression4841); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2081:1: ruleCountExpression returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleCountExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2084:28: ( (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2085:1: (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2085:1: (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2085:3: otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleCountExpression4878); 

                	newLeafNode(otherlv_0, grammarAccess.getCountExpressionAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCountExpression4890); 

                	newLeafNode(otherlv_1, grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleCountExpression4902); 

                	newLeafNode(otherlv_2, grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2097:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2098:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCountExpressionAccess().getCountExpressionAction_3(),
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
    // $ANTLR end "ruleCountExpression"


    // $ANTLR start "entryRuleNotEmptyExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2111:1: entryRuleNotEmptyExpression returns [EObject current=null] : iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF ;
    public final EObject entryRuleNotEmptyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEmptyExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2112:2: (iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2113:2: iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF
            {
             newCompositeNode(grammarAccess.getNotEmptyExpressionRule()); 
            pushFollow(FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression4947);
            iv_ruleNotEmptyExpression=ruleNotEmptyExpression();

            state._fsp--;

             current =iv_ruleNotEmptyExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyExpression4957); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2120:1: ruleNotEmptyExpression returns [EObject current=null] : (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleNotEmptyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2123:28: ( (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2124:1: (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2124:1: (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2124:3: otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleNotEmptyExpression4994); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleNotEmptyExpression5006); 

                	newLeafNode(otherlv_1, grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleNotEmptyExpression5018); 

                	newLeafNode(otherlv_2, grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2136:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:2137:5: 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGridGame_in_entryRuleGridGame75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridGame85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGridGame122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGridGame139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGridGame156 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleGlobalCellStateSpec_in_ruleGridGame177 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_ruleGridGame199 = new BitSet(new long[]{0x0000001000804000L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_ruleGridGame221 = new BitSet(new long[]{0x0000009008002000L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_ruleGridGame243 = new BitSet(new long[]{0x0000008008002000L});
    public static final BitSet FOLLOW_13_in_ruleGridGame256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellSpecification302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCellSpecification339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellSpecification356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellSpecification373 = new BitSet(new long[]{0x000000000090A000L});
    public static final BitSet FOLLOW_ruleCellMember_in_ruleCellSpecification394 = new BitSet(new long[]{0x000000000090A000L});
    public static final BitSet FOLLOW_13_in_ruleCellSpecification407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellMember_in_entryRuleCellMember443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellMember453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_ruleCellMember500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_ruleCellMember527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_ruleCellMember554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_entryRuleCellDisplaySpec589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellDisplaySpec599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCellDisplaySpec636 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellDisplaySpec648 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCellDisplaySpec660 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCellDisplaySpec680 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_18_in_ruleCellDisplaySpec709 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleCellDisplaySpec739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCellDisplaySpec756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20_in_ruleCellDisplaySpec781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellDisplaySpec801 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellDisplaySpec815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellVarSpec863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCellVarSpec900 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCellVarSpec920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleCellVarSpec949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellVarSpec982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalCellStateSpec_in_entryRuleGlobalCellStateSpec1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalCellStateSpec1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleGlobalCellStateSpec1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalCellStateSpec1087 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_ruleGlobalCellStateSpec1105 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_ruleGlobalCellStateSpec1126 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleGlobalCellStateSpec1139 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_ruleGlobalCellStateSpec1160 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleGlobalCellStateSpec1174 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGlobalCellStateSpec1188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCellState_in_ruleGlobalCellStateSpec1209 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleGlobalCellStateSpec1222 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGlobalCellStateSpec1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalCellStateSpec1254 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGlobalCellStateSpec1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_entryRuleStateParamSpec1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateParamSpec1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStateParamSpec1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleStateParamSpec1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateParamSpec1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellStateSpec1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalCellStateSpec_in_ruleCellStateSpec1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpecReference_in_ruleCellStateSpec1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalCellStateSpec_in_entryRuleLocalCellStateSpec1579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalCellStateSpec1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLocalCellStateSpec1626 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLocalCellStateSpec1638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCellState_in_ruleLocalCellStateSpec1659 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleLocalCellStateSpec1672 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLocalCellStateSpec1684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalCellStateSpec1704 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLocalCellStateSpec1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpecReference_in_entryRuleCellStateSpecReference1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellStateSpecReference1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCellStateSpecReference1799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellStateSpecReference1819 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCellStateSpecReference1832 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCellStateSpecReference1853 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleCellStateSpecReference1866 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCellStateSpecReference1887 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleCellStateSpecReference1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefValue_in_ruleValue2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue2176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefValue_in_entryRuleVarRefValue2267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRefValue2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarRefValue2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_entryRuleCellState2356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellState2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellState2408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellState2425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_ruleCellState2446 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_29_in_ruleCellState2459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellState2471 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_ruleCellState2492 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_13_in_ruleCellState2505 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_30_in_ruleCellState2520 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellState2532 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleCellStateBehaviour_in_ruleCellState2553 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25_in_ruleCellState2566 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleCellStateBehaviour_in_ruleCellState2587 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_13_in_ruleCellState2601 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellState2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpec2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTransitionSpec2698 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_ruleTransitionSpec2719 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTransitionSpec2731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionSpec2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec2788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionTriggerSpec2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTransitionTriggerSpec2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTransitionTriggerSpec2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateBehaviour_in_entryRuleCellStateBehaviour2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellStateBehaviour2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndGameBehaviour_in_ruleCellStateBehaviour2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndGameBehaviour_in_entryRuleEndGameBehaviour2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndGameBehaviour2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEndGameBehaviour3033 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEndGameBehaviour3045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEndGameBehaviour3062 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEndGameBehaviour3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification3115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldSpecification3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFieldSpecification3162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldSpecification3179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldSpecification3196 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFieldSpecification3208 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFieldSpecification3220 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification3237 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFieldSpecification3254 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFieldSpecification3266 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification3283 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification3309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFieldSpecification3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification3358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSpecification3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu3477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowRestartMenu3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAllowRestartMenu3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration3569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartFieldDeclaration3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStartFieldDeclaration3616 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStartFieldDeclaration3628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartFieldDeclaration3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations3684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisations3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFieldInitialisations3731 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldInitialisations3743 = new BitSet(new long[]{0x0000340000000000L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations3765 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFieldInitialisations3777 = new BitSet(new long[]{0x0000340000002000L});
    public static final BitSet FOLLOW_13_in_ruleFieldInitialisations3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation3827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisation3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_ruleFieldInitialisation3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation3973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultInitialisation3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDefaultInitialisation4020 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDefaultInitialisation4032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefaultInitialisation4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation4088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRandomInitialisation4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRandomInitialisation4135 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRandomInitialisation4147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRandomInitialisation4167 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRandomInitialisation4179 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRandomInitialisation4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextInitialisation4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleContextInitialisation4284 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleContextInitialisation4296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContextInitialisation4316 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleContextInitialisation4328 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_ruleContextExpression_in_ruleContextInitialisation4349 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleContextInitialisation4361 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleContextInitialisation4373 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_ruleContextExpression_in_ruleContextInitialisation4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_entryRuleContextExpression4430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextExpression4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleContextExpression4486 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContextExpression4499 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleContextExpression4520 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_ruleAtomicExpression4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_ruleAtomicExpression4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_ruleAtomicExpression4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression4704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterExpression4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFilterExpression4751 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFilterExpression4763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterExpression4783 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFilterExpression4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_entryRuleCountExpression4831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountExpression4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCountExpression4878 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCountExpression4890 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCountExpression4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression4947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyExpression4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNotEmptyExpression4994 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNotEmptyExpression5006 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNotEmptyExpression5018 = new BitSet(new long[]{0x0000000000000002L});

}