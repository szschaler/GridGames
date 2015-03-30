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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'cell'", "'display'", "'as'", "'label'", "'button'", "'text'", "'var'", "'int'", "'String'", "'states'", "'start'", "'='", "'transitions'", "'on'", "'goto'", "'mouse-left'", "'mouse-right'", "'field'", "'width'", "'height'", "'allow_restart'", "'init'", "';'", "'default'", "':'", "'random'", "'context'", "'check'", "'value'", "'.'", "'filter'", "'('", "')'", "'count'", "'notEmpty'"
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
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:76:1: ruleGridGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cells_3_0= ruleCellSpecification ) )+ ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )* otherlv_6= '}' ) ;
    public final EObject ruleGridGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_cells_3_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_options_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:79:28: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cells_3_0= ruleCellSpecification ) )+ ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )* otherlv_6= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cells_3_0= ruleCellSpecification ) )+ ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )* otherlv_6= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cells_3_0= ruleCellSpecification ) )+ ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )* otherlv_6= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:80:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cells_3_0= ruleCellSpecification ) )+ ( (lv_fields_4_0= ruleFieldSpecification ) )+ ( (lv_options_5_0= ruleOptionSpecification ) )* otherlv_6= '}'
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
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:106:1: ( (lv_cells_3_0= ruleCellSpecification ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:107:1: (lv_cells_3_0= ruleCellSpecification )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:107:1: (lv_cells_3_0= ruleCellSpecification )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:108:3: lv_cells_3_0= ruleCellSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellSpecification_in_ruleGridGame177);
            	    lv_cells_3_0=ruleCellSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cells",
            	            		lv_cells_3_0, 
            	            		"CellSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:124:3: ( (lv_fields_4_0= ruleFieldSpecification ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:125:1: (lv_fields_4_0= ruleFieldSpecification )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:125:1: (lv_fields_4_0= ruleFieldSpecification )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:126:3: lv_fields_4_0= ruleFieldSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldSpecification_in_ruleGridGame199);
            	    lv_fields_4_0=ruleFieldSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_4_0, 
            	            		"FieldSpecification");
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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:142:3: ( (lv_options_5_0= ruleOptionSpecification ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24||LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:143:1: (lv_options_5_0= ruleOptionSpecification )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:143:1: (lv_options_5_0= ruleOptionSpecification )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:144:3: lv_options_5_0= ruleOptionSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionSpecification_in_ruleGridGame221);
            	    lv_options_5_0=ruleOptionSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_5_0, 
            	            		"OptionSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleGridGame234); 

                	newLeafNode(otherlv_6, grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:172:1: entryRuleCellSpecification returns [EObject current=null] : iv_ruleCellSpecification= ruleCellSpecification EOF ;
    public final EObject entryRuleCellSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:173:2: (iv_ruleCellSpecification= ruleCellSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:174:2: iv_ruleCellSpecification= ruleCellSpecification EOF
            {
             newCompositeNode(grammarAccess.getCellSpecificationRule()); 
            pushFollow(FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification270);
            iv_ruleCellSpecification=ruleCellSpecification();

            state._fsp--;

             current =iv_ruleCellSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellSpecification280); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:181:1: ruleCellSpecification returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleCellSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:184:28: ( (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:3: otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleCellMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleCellSpecification317); 

                	newLeafNode(otherlv_0, grammarAccess.getCellSpecificationAccess().getCellKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:189:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:190:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:190:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:191:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellSpecification334); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCellSpecification351); 

                	newLeafNode(otherlv_2, grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:211:1: ( (lv_members_3_0= ruleCellMember ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==20||LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:212:1: (lv_members_3_0= ruleCellMember )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:212:1: (lv_members_3_0= ruleCellMember )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:213:3: lv_members_3_0= ruleCellMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellMember_in_ruleCellSpecification372);
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCellSpecification385); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:241:1: entryRuleCellMember returns [EObject current=null] : iv_ruleCellMember= ruleCellMember EOF ;
    public final EObject entryRuleCellMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellMember = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:242:2: (iv_ruleCellMember= ruleCellMember EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:243:2: iv_ruleCellMember= ruleCellMember EOF
            {
             newCompositeNode(grammarAccess.getCellMemberRule()); 
            pushFollow(FOLLOW_ruleCellMember_in_entryRuleCellMember421);
            iv_ruleCellMember=ruleCellMember();

            state._fsp--;

             current =iv_ruleCellMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellMember431); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:250:1: ruleCellMember returns [EObject current=null] : (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec ) ;
    public final EObject ruleCellMember() throws RecognitionException {
        EObject current = null;

        EObject this_CellDisplaySpec_0 = null;

        EObject this_CellVarSpec_1 = null;

        EObject this_CellStateSpec_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:253:28: ( (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:254:1: (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:254:1: (this_CellDisplaySpec_0= ruleCellDisplaySpec | this_CellVarSpec_1= ruleCellVarSpec | this_CellStateSpec_2= ruleCellStateSpec )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:255:5: this_CellDisplaySpec_0= ruleCellDisplaySpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCellDisplaySpec_in_ruleCellMember478);
                    this_CellDisplaySpec_0=ruleCellDisplaySpec();

                    state._fsp--;

                     
                            current = this_CellDisplaySpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:265:5: this_CellVarSpec_1= ruleCellVarSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCellVarSpec_in_ruleCellMember505);
                    this_CellVarSpec_1=ruleCellVarSpec();

                    state._fsp--;

                     
                            current = this_CellVarSpec_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:275:5: this_CellStateSpec_2= ruleCellStateSpec
                    {
                     
                            newCompositeNode(grammarAccess.getCellMemberAccess().getCellStateSpecParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCellStateSpec_in_ruleCellMember532);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:291:1: entryRuleCellDisplaySpec returns [EObject current=null] : iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF ;
    public final EObject entryRuleCellDisplaySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDisplaySpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:292:2: (iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:293:2: iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF
            {
             newCompositeNode(grammarAccess.getCellDisplaySpecRule()); 
            pushFollow(FOLLOW_ruleCellDisplaySpec_in_entryRuleCellDisplaySpec567);
            iv_ruleCellDisplaySpec=ruleCellDisplaySpec();

            state._fsp--;

             current =iv_ruleCellDisplaySpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellDisplaySpec577); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:300:1: ruleCellDisplaySpec returns [EObject current=null] : (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:303:28: ( (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:304:1: (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:304:1: (otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:304:3: otherlv_0= 'display' otherlv_1= '{' otherlv_2= 'as' ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) ) ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleCellDisplaySpec614); 

                	newLeafNode(otherlv_0, grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCellDisplaySpec626); 

                	newLeafNode(otherlv_1, grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCellDisplaySpec638); 

                	newLeafNode(otherlv_2, grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:316:1: ( ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:317:1: ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:317:1: ( (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:318:1: (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:318:1: (lv_display_type_3_1= 'label' | lv_display_type_3_2= 'button' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:319:3: lv_display_type_3_1= 'label'
                    {
                    lv_display_type_3_1=(Token)match(input,17,FOLLOW_17_in_ruleCellDisplaySpec658); 

                            newLeafNode(lv_display_type_3_1, grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                           		setWithLastConsumed(current, "display_type", lv_display_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:331:8: lv_display_type_3_2= 'button'
                    {
                    lv_display_type_3_2=(Token)match(input,18,FOLLOW_18_in_ruleCellDisplaySpec687); 

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:346:2: ( (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) ) | (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:346:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:346:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:346:5: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleCellDisplaySpec717); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:350:1: ( (lv_text_5_0= RULE_STRING ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:351:1: (lv_text_5_0= RULE_STRING )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:351:1: (lv_text_5_0= RULE_STRING )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:352:3: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCellDisplaySpec734); 

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
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:369:6: (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:369:6: (otherlv_6= 'var' ( (otherlv_7= RULE_ID ) ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:369:8: otherlv_6= 'var' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleCellDisplaySpec759); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:373:1: ( (otherlv_7= RULE_ID ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:374:1: (otherlv_7= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:374:1: (otherlv_7= RULE_ID )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:375:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellDisplaySpec779); 

                    		newLeafNode(otherlv_7, grammarAccess.getCellDisplaySpecAccess().getVarCellVarSpecCrossReference_4_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleCellDisplaySpec793); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:398:1: entryRuleCellVarSpec returns [EObject current=null] : iv_ruleCellVarSpec= ruleCellVarSpec EOF ;
    public final EObject entryRuleCellVarSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellVarSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:399:2: (iv_ruleCellVarSpec= ruleCellVarSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:400:2: iv_ruleCellVarSpec= ruleCellVarSpec EOF
            {
             newCompositeNode(grammarAccess.getCellVarSpecRule()); 
            pushFollow(FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec829);
            iv_ruleCellVarSpec=ruleCellVarSpec();

            state._fsp--;

             current =iv_ruleCellVarSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellVarSpec839); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:407:1: ruleCellVarSpec returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCellVarSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:410:28: ( (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:411:1: (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:411:1: (otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:411:3: otherlv_0= 'var' ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCellVarSpec876); 

                	newLeafNode(otherlv_0, grammarAccess.getCellVarSpecAccess().getVarKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:415:1: ( ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:416:1: ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:416:1: ( (lv_type_1_1= 'int' | lv_type_1_2= 'String' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:417:1: (lv_type_1_1= 'int' | lv_type_1_2= 'String' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:417:1: (lv_type_1_1= 'int' | lv_type_1_2= 'String' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:418:3: lv_type_1_1= 'int'
                    {
                    lv_type_1_1=(Token)match(input,21,FOLLOW_21_in_ruleCellVarSpec896); 

                            newLeafNode(lv_type_1_1, grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellVarSpecRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:430:8: lv_type_1_2= 'String'
                    {
                    lv_type_1_2=(Token)match(input,22,FOLLOW_22_in_ruleCellVarSpec925); 

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:445:2: ( (lv_name_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:446:1: (lv_name_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:446:1: (lv_name_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:447:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellVarSpec958); 

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


    // $ANTLR start "entryRuleCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:471:1: entryRuleCellStateSpec returns [EObject current=null] : iv_ruleCellStateSpec= ruleCellStateSpec EOF ;
    public final EObject entryRuleCellStateSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellStateSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:472:2: (iv_ruleCellStateSpec= ruleCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:473:2: iv_ruleCellStateSpec= ruleCellStateSpec EOF
            {
             newCompositeNode(grammarAccess.getCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec999);
            iv_ruleCellStateSpec=ruleCellStateSpec();

            state._fsp--;

             current =iv_ruleCellStateSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellStateSpec1009); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:480:1: ruleCellStateSpec returns [EObject current=null] : (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleCellStateSpec() throws RecognitionException {
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:483:28: ( (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:484:1: (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:484:1: (otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:484:3: otherlv_0= 'states' otherlv_1= '{' ( (lv_states_2_0= ruleCellState ) )+ otherlv_3= 'start' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleCellStateSpec1046); 

                	newLeafNode(otherlv_0, grammarAccess.getCellStateSpecAccess().getStatesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCellStateSpec1058); 

                	newLeafNode(otherlv_1, grammarAccess.getCellStateSpecAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:492:1: ( (lv_states_2_0= ruleCellState ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:493:1: (lv_states_2_0= ruleCellState )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:493:1: (lv_states_2_0= ruleCellState )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:494:3: lv_states_2_0= ruleCellState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellState_in_ruleCellStateSpec1079);
            	    lv_states_2_0=ruleCellState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellStateSpecRule());
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleCellStateSpec1092); 

                	newLeafNode(otherlv_3, grammarAccess.getCellStateSpecAccess().getStartKeyword_3());
                
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleCellStateSpec1104); 

                	newLeafNode(otherlv_4, grammarAccess.getCellStateSpecAccess().getEqualsSignKeyword_4());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:518:1: ( (otherlv_5= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:519:1: (otherlv_5= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:519:1: (otherlv_5= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:520:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCellStateSpecRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellStateSpec1124); 

            		newLeafNode(otherlv_5, grammarAccess.getCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleCellStateSpec1136); 

                	newLeafNode(otherlv_6, grammarAccess.getCellStateSpecAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleCellState"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:543:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:544:2: (iv_ruleCellState= ruleCellState EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:545:2: iv_ruleCellState= ruleCellState EOF
            {
             newCompositeNode(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_ruleCellState_in_entryRuleCellState1172);
            iv_ruleCellState=ruleCellState();

            state._fsp--;

             current =iv_ruleCellState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellState1182); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:552:1: ruleCellState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_display_2_0 = null;

        EObject lv_transitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:555:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:556:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:556:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:556:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}'
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:557:1: (lv_name_0_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:557:1: (lv_name_0_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:558:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCellState1224); 

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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCellState1241); 

                	newLeafNode(otherlv_1, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:578:1: ( (lv_display_2_0= ruleCellDisplaySpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:579:1: (lv_display_2_0= ruleCellDisplaySpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:579:1: (lv_display_2_0= ruleCellDisplaySpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:580:3: lv_display_2_0= ruleCellDisplaySpec
            {
             
            	        newCompositeNode(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCellDisplaySpec_in_ruleCellState1262);
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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:596:2: (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:596:4: otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleCellState1275); 

                        	newLeafNode(otherlv_3, grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleCellState1287); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:604:1: ( (lv_transitions_5_0= ruleTransitionSpec ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:605:1: (lv_transitions_5_0= ruleTransitionSpec )
                    	    {
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:605:1: (lv_transitions_5_0= ruleTransitionSpec )
                    	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:606:3: lv_transitions_5_0= ruleTransitionSpec
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransitionSpec_in_ruleCellState1308);
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleCellState1321); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleCellState1335); 

                	newLeafNode(otherlv_7, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:638:1: entryRuleTransitionSpec returns [EObject current=null] : iv_ruleTransitionSpec= ruleTransitionSpec EOF ;
    public final EObject entryRuleTransitionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:639:2: (iv_ruleTransitionSpec= ruleTransitionSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:640:2: iv_ruleTransitionSpec= ruleTransitionSpec EOF
            {
             newCompositeNode(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec1371);
            iv_ruleTransitionSpec=ruleTransitionSpec();

            state._fsp--;

             current =iv_ruleTransitionSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpec1381); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:647:1: ruleTransitionSpec returns [EObject current=null] : (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_trigger_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:650:28: ( (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:651:1: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:651:1: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:651:3: otherlv_0= 'on' ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) ) otherlv_2= 'goto' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleTransitionSpec1418); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionSpecAccess().getOnKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:655:1: ( (lv_trigger_1_0= ruleTransitionTriggerSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:656:1: (lv_trigger_1_0= ruleTransitionTriggerSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:656:1: (lv_trigger_1_0= ruleTransitionTriggerSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:657:3: lv_trigger_1_0= ruleTransitionTriggerSpec
            {
             
            	        newCompositeNode(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_ruleTransitionSpec1439);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleTransitionSpec1451); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionSpecAccess().getGotoKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:677:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:678:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:678:1: (otherlv_3= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:679:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionSpecRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionSpec1471); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:698:1: entryRuleTransitionTriggerSpec returns [String current=null] : iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF ;
    public final String entryRuleTransitionTriggerSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTransitionTriggerSpec = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:699:2: (iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:700:2: iv_ruleTransitionTriggerSpec= ruleTransitionTriggerSpec EOF
            {
             newCompositeNode(grammarAccess.getTransitionTriggerSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec1508);
            iv_ruleTransitionTriggerSpec=ruleTransitionTriggerSpec();

            state._fsp--;

             current =iv_ruleTransitionTriggerSpec.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionTriggerSpec1519); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:707:1: ruleTransitionTriggerSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mouse-left' | kw= 'mouse-right' ) ;
    public final AntlrDatatypeRuleToken ruleTransitionTriggerSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:710:28: ( (kw= 'mouse-left' | kw= 'mouse-right' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:711:1: (kw= 'mouse-left' | kw= 'mouse-right' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:711:1: (kw= 'mouse-left' | kw= 'mouse-right' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:712:2: kw= 'mouse-left'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleTransitionTriggerSpec1557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTransitionTriggerSpecAccess().getMouseLeftKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:719:2: kw= 'mouse-right'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleTransitionTriggerSpec1576); 

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


    // $ANTLR start "entryRuleFieldSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:732:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:733:2: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:734:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
            {
             newCompositeNode(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification1616);
            iv_ruleFieldSpecification=ruleFieldSpecification();

            state._fsp--;

             current =iv_ruleFieldSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldSpecification1626); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:741:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:744:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:745:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:745:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:745:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleFieldSpecification1663); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:749:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:750:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:750:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:751:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldSpecification1680); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFieldSpecification1697); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleFieldSpecification1709); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3());
                
            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleFieldSpecification1721); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:779:1: ( (lv_width_5_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:780:1: (lv_width_5_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:780:1: (lv_width_5_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:781:3: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification1738); 

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

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleFieldSpecification1755); 

                	newLeafNode(otherlv_6, grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6());
                
            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleFieldSpecification1767); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:805:1: ( (lv_height_8_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:806:1: (lv_height_8_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:806:1: (lv_height_8_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:807:3: lv_height_8_0= RULE_INT
            {
            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification1784); 

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:823:2: ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:824:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:824:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:825:3: lv_field_initialisation_9_0= ruleFieldInitialisations
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification1810);
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

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleFieldSpecification1823); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:853:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:854:2: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:855:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification1859);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSpecification1869); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:862:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_AllowRestartMenu_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:865:28: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:866:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:866:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:867:5: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification1916);
                    this_StartFieldDeclaration_0=ruleStartFieldDeclaration();

                    state._fsp--;

                     
                            current = this_StartFieldDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:877:5: this_AllowRestartMenu_1= ruleAllowRestartMenu
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification1943);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:893:1: entryRuleAllowRestartMenu returns [EObject current=null] : iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF ;
    public final EObject entryRuleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowRestartMenu = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:894:2: (iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:895:2: iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF
            {
             newCompositeNode(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu1978);
            iv_ruleAllowRestartMenu=ruleAllowRestartMenu();

            state._fsp--;

             current =iv_ruleAllowRestartMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowRestartMenu1988); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:902:1: ruleAllowRestartMenu returns [EObject current=null] : (otherlv_0= 'allow_restart' () ) ;
    public final EObject ruleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:905:28: ( (otherlv_0= 'allow_restart' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:906:1: (otherlv_0= 'allow_restart' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:906:1: (otherlv_0= 'allow_restart' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:906:3: otherlv_0= 'allow_restart' ()
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleAllowRestartMenu2025); 

                	newLeafNode(otherlv_0, grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:910:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:911:5: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:924:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:925:2: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:926:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration2070);
            iv_ruleStartFieldDeclaration=ruleStartFieldDeclaration();

            state._fsp--;

             current =iv_ruleStartFieldDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartFieldDeclaration2080); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:933:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:936:28: ( (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:937:1: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:937:1: (otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:937:3: otherlv_0= 'start' otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleStartFieldDeclaration2117); 

                	newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleStartFieldDeclaration2129); 

                	newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:945:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:946:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:946:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:947:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStartFieldDeclarationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartFieldDeclaration2149); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:966:1: entryRuleFieldInitialisations returns [EObject current=null] : iv_ruleFieldInitialisations= ruleFieldInitialisations EOF ;
    public final EObject entryRuleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisations = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:967:2: (iv_ruleFieldInitialisations= ruleFieldInitialisations EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:968:2: iv_ruleFieldInitialisations= ruleFieldInitialisations EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations2185);
            iv_ruleFieldInitialisations=ruleFieldInitialisations();

            state._fsp--;

             current =iv_ruleFieldInitialisations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisations2195); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:975:1: ruleFieldInitialisations returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_initialisations_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:978:28: ( (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:979:1: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:979:1: (otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:979:3: otherlv_0= 'init' otherlv_1= '{' ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleFieldInitialisations2232); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFieldInitialisations2244); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:987:1: ( ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37||(LA15_0>=39 && LA15_0<=40)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:987:2: ( (lv_initialisations_2_0= ruleFieldInitialisation ) ) otherlv_3= ';'
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:987:2: ( (lv_initialisations_2_0= ruleFieldInitialisation ) )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:988:1: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:988:1: (lv_initialisations_2_0= ruleFieldInitialisation )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:989:3: lv_initialisations_2_0= ruleFieldInitialisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations2266);
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

            	    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleFieldInitialisations2278); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFieldInitialisationsAccess().getSemicolonKeyword_2_1());
            	        

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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleFieldInitialisations2292); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1021:1: entryRuleFieldInitialisation returns [EObject current=null] : iv_ruleFieldInitialisation= ruleFieldInitialisation EOF ;
    public final EObject entryRuleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1022:2: (iv_ruleFieldInitialisation= ruleFieldInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1023:2: iv_ruleFieldInitialisation= ruleFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation2328);
            iv_ruleFieldInitialisation=ruleFieldInitialisation();

            state._fsp--;

             current =iv_ruleFieldInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisation2338); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1030:1: ruleFieldInitialisation returns [EObject current=null] : (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) ;
    public final EObject ruleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultInitialisation_0 = null;

        EObject this_RandomInitialisation_1 = null;

        EObject this_ContextInitialisation_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1033:28: ( (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1034:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1034:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation | this_ContextInitialisation_2= ruleContextInitialisation )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 40:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1035:5: this_DefaultInitialisation_0= ruleDefaultInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation2385);
                    this_DefaultInitialisation_0=ruleDefaultInitialisation();

                    state._fsp--;

                     
                            current = this_DefaultInitialisation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1045:5: this_RandomInitialisation_1= ruleRandomInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation2412);
                    this_RandomInitialisation_1=ruleRandomInitialisation();

                    state._fsp--;

                     
                            current = this_RandomInitialisation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1055:5: this_ContextInitialisation_2= ruleContextInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleContextInitialisation_in_ruleFieldInitialisation2439);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1071:1: entryRuleDefaultInitialisation returns [EObject current=null] : iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF ;
    public final EObject entryRuleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1072:2: (iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1073:2: iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF
            {
             newCompositeNode(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation2474);
            iv_ruleDefaultInitialisation=ruleDefaultInitialisation();

            state._fsp--;

             current =iv_ruleDefaultInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultInitialisation2484); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1080:1: ruleDefaultInitialisation returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1083:28: ( (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1084:1: (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1084:1: (otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1084:3: otherlv_0= 'default' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleDefaultInitialisation2521); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleDefaultInitialisation2533); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1092:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1093:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1093:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1094:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefaultInitialisation2553); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1113:1: entryRuleRandomInitialisation returns [EObject current=null] : iv_ruleRandomInitialisation= ruleRandomInitialisation EOF ;
    public final EObject entryRuleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1114:2: (iv_ruleRandomInitialisation= ruleRandomInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1115:2: iv_ruleRandomInitialisation= ruleRandomInitialisation EOF
            {
             newCompositeNode(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation2589);
            iv_ruleRandomInitialisation=ruleRandomInitialisation();

            state._fsp--;

             current =iv_ruleRandomInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRandomInitialisation2599); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1122:1: ruleRandomInitialisation returns [EObject current=null] : (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_count_4_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1125:28: ( (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1126:1: (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1126:1: (otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1126:3: otherlv_0= 'random' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleRandomInitialisation2636); 

                	newLeafNode(otherlv_0, grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleRandomInitialisation2648); 

                	newLeafNode(otherlv_1, grammarAccess.getRandomInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1134:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1135:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1135:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1136:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRandomInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRandomInitialisation2668); 

            		newLeafNode(otherlv_2, grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleRandomInitialisation2680); 

                	newLeafNode(otherlv_3, grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1151:1: ( (lv_count_4_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1152:1: (lv_count_4_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1152:1: (lv_count_4_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1153:3: lv_count_4_0= RULE_INT
            {
            lv_count_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRandomInitialisation2697); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1177:1: entryRuleContextInitialisation returns [EObject current=null] : iv_ruleContextInitialisation= ruleContextInitialisation EOF ;
    public final EObject entryRuleContextInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1178:2: (iv_ruleContextInitialisation= ruleContextInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1179:2: iv_ruleContextInitialisation= ruleContextInitialisation EOF
            {
             newCompositeNode(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation2738);
            iv_ruleContextInitialisation=ruleContextInitialisation();

            state._fsp--;

             current =iv_ruleContextInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextInitialisation2748); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1186:1: ruleContextInitialisation returns [EObject current=null] : (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1189:28: ( (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1190:1: (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1190:1: (otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1190:3: otherlv_0= 'context' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'check' ( (lv_check_4_0= ruleContextExpression ) ) otherlv_5= 'value' otherlv_6= '=' ( (lv_exp_7_0= ruleContextExpression ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleContextInitialisation2785); 

                	newLeafNode(otherlv_0, grammarAccess.getContextInitialisationAccess().getContextKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleContextInitialisation2797); 

                	newLeafNode(otherlv_1, grammarAccess.getContextInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1198:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1199:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1199:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1200:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContextInitialisationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContextInitialisation2817); 

            		newLeafNode(otherlv_2, grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleContextInitialisation2829); 

                	newLeafNode(otherlv_3, grammarAccess.getContextInitialisationAccess().getCheckKeyword_3());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1215:1: ( (lv_check_4_0= ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1216:1: (lv_check_4_0= ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1216:1: (lv_check_4_0= ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1217:3: lv_check_4_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleContextExpression_in_ruleContextInitialisation2850);
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

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleContextInitialisation2862); 

                	newLeafNode(otherlv_5, grammarAccess.getContextInitialisationAccess().getValueKeyword_5());
                
            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleContextInitialisation2874); 

                	newLeafNode(otherlv_6, grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1241:1: ( (lv_exp_7_0= ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1242:1: (lv_exp_7_0= ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1242:1: (lv_exp_7_0= ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1243:3: lv_exp_7_0= ruleContextExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleContextExpression_in_ruleContextInitialisation2895);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1267:1: entryRuleContextExpression returns [EObject current=null] : iv_ruleContextExpression= ruleContextExpression EOF ;
    public final EObject entryRuleContextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1268:2: (iv_ruleContextExpression= ruleContextExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1269:2: iv_ruleContextExpression= ruleContextExpression EOF
            {
             newCompositeNode(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_ruleContextExpression_in_entryRuleContextExpression2931);
            iv_ruleContextExpression=ruleContextExpression();

            state._fsp--;

             current =iv_ruleContextExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextExpression2941); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1276:1: ruleContextExpression returns [EObject current=null] : ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* ) ;
    public final EObject ruleContextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sub_exp_0_0 = null;

        EObject lv_sub_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1279:28: ( ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1280:1: ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1280:1: ( ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1280:2: ( (lv_sub_exp_0_0= ruleAtomicExpression ) ) (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )*
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1280:2: ( (lv_sub_exp_0_0= ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1281:1: (lv_sub_exp_0_0= ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1281:1: (lv_sub_exp_0_0= ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1282:3: lv_sub_exp_0_0= ruleAtomicExpression
            {
             
            	        newCompositeNode(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicExpression_in_ruleContextExpression2987);
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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1298:2: (otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1298:4: otherlv_1= '.' ( (lv_sub_exp_2_0= ruleAtomicExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleContextExpression3000); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1302:1: ( (lv_sub_exp_2_0= ruleAtomicExpression ) )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1303:1: (lv_sub_exp_2_0= ruleAtomicExpression )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1303:1: (lv_sub_exp_2_0= ruleAtomicExpression )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1304:3: lv_sub_exp_2_0= ruleAtomicExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleContextExpression3021);
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
            	    break loop17;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1328:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1329:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1330:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3059);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression3069); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1337:1: ruleAtomicExpression returns [EObject current=null] : (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FilterExpression_0 = null;

        EObject this_CountExpression_1 = null;

        EObject this_NotEmptyExpression_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1340:28: ( (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1341:1: (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1341:1: (this_FilterExpression_0= ruleFilterExpression | this_CountExpression_1= ruleCountExpression | this_NotEmptyExpression_2= ruleNotEmptyExpression )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt18=1;
                }
                break;
            case 47:
                {
                alt18=2;
                }
                break;
            case 48:
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1342:5: this_FilterExpression_0= ruleFilterExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFilterExpression_in_ruleAtomicExpression3116);
                    this_FilterExpression_0=ruleFilterExpression();

                    state._fsp--;

                     
                            current = this_FilterExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1352:5: this_CountExpression_1= ruleCountExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCountExpression_in_ruleAtomicExpression3143);
                    this_CountExpression_1=ruleCountExpression();

                    state._fsp--;

                     
                            current = this_CountExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1362:5: this_NotEmptyExpression_2= ruleNotEmptyExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNotEmptyExpression_in_ruleAtomicExpression3170);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1378:1: entryRuleFilterExpression returns [EObject current=null] : iv_ruleFilterExpression= ruleFilterExpression EOF ;
    public final EObject entryRuleFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1379:2: (iv_ruleFilterExpression= ruleFilterExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1380:2: iv_ruleFilterExpression= ruleFilterExpression EOF
            {
             newCompositeNode(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression3205);
            iv_ruleFilterExpression=ruleFilterExpression();

            state._fsp--;

             current =iv_ruleFilterExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterExpression3215); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1387:1: ruleFilterExpression returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFilterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1390:28: ( (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1391:1: (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1391:1: (otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1391:3: otherlv_0= 'filter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleFilterExpression3252); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterExpressionAccess().getFilterKeyword_0());
                
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleFilterExpression3264); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1399:1: ( (otherlv_2= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1400:1: (otherlv_2= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1400:1: (otherlv_2= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1401:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterExpression3284); 

            		newLeafNode(otherlv_2, grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleFilterExpression3296); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1424:1: entryRuleCountExpression returns [EObject current=null] : iv_ruleCountExpression= ruleCountExpression EOF ;
    public final EObject entryRuleCountExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1425:2: (iv_ruleCountExpression= ruleCountExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1426:2: iv_ruleCountExpression= ruleCountExpression EOF
            {
             newCompositeNode(grammarAccess.getCountExpressionRule()); 
            pushFollow(FOLLOW_ruleCountExpression_in_entryRuleCountExpression3332);
            iv_ruleCountExpression=ruleCountExpression();

            state._fsp--;

             current =iv_ruleCountExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountExpression3342); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1433:1: ruleCountExpression returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleCountExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1436:28: ( (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1437:1: (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1437:1: (otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1437:3: otherlv_0= 'count' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleCountExpression3379); 

                	newLeafNode(otherlv_0, grammarAccess.getCountExpressionAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleCountExpression3391); 

                	newLeafNode(otherlv_1, grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleCountExpression3403); 

                	newLeafNode(otherlv_2, grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1449:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1450:5: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1463:1: entryRuleNotEmptyExpression returns [EObject current=null] : iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF ;
    public final EObject entryRuleNotEmptyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEmptyExpression = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1464:2: (iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1465:2: iv_ruleNotEmptyExpression= ruleNotEmptyExpression EOF
            {
             newCompositeNode(grammarAccess.getNotEmptyExpressionRule()); 
            pushFollow(FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression3448);
            iv_ruleNotEmptyExpression=ruleNotEmptyExpression();

            state._fsp--;

             current =iv_ruleNotEmptyExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyExpression3458); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1472:1: ruleNotEmptyExpression returns [EObject current=null] : (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleNotEmptyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1475:28: ( (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1476:1: (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1476:1: (otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1476:3: otherlv_0= 'notEmpty' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleNotEmptyExpression3495); 

                	newLeafNode(otherlv_0, grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0());
                
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleNotEmptyExpression3507); 

                	newLeafNode(otherlv_1, grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleNotEmptyExpression3519); 

                	newLeafNode(otherlv_2, grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1488:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:1489:5: 
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
    public static final BitSet FOLLOW_12_in_ruleGridGame156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_ruleGridGame177 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_ruleGridGame199 = new BitSet(new long[]{0x0000000481002000L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_ruleGridGame221 = new BitSet(new long[]{0x0000000401002000L});
    public static final BitSet FOLLOW_13_in_ruleGridGame234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellSpecification280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCellSpecification317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellSpecification334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellSpecification351 = new BitSet(new long[]{0x000000000090A000L});
    public static final BitSet FOLLOW_ruleCellMember_in_ruleCellSpecification372 = new BitSet(new long[]{0x000000000090A000L});
    public static final BitSet FOLLOW_13_in_ruleCellSpecification385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellMember_in_entryRuleCellMember421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellMember431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_ruleCellMember478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_ruleCellMember505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_ruleCellMember532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_entryRuleCellDisplaySpec567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellDisplaySpec577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCellDisplaySpec614 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellDisplaySpec626 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCellDisplaySpec638 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCellDisplaySpec658 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_18_in_ruleCellDisplaySpec687 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleCellDisplaySpec717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCellDisplaySpec734 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20_in_ruleCellDisplaySpec759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellDisplaySpec779 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellDisplaySpec793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellVarSpec839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCellVarSpec876 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCellVarSpec896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleCellVarSpec925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellVarSpec958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellStateSpec1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCellStateSpec1046 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellStateSpec1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCellState_in_ruleCellStateSpec1079 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleCellStateSpec1092 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCellStateSpec1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellStateSpec1124 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellStateSpec1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_entryRuleCellState1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellState1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellState1224 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellState1241 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_ruleCellState1262 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_26_in_ruleCellState1275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellState1287 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_ruleCellState1308 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_13_in_ruleCellState1321 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellState1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec1371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpec1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTransitionSpec1418 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_ruleTransitionSpec1439 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransitionSpec1451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionSpec1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionTriggerSpec1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTransitionTriggerSpec1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTransitionTriggerSpec1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldSpecification1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFieldSpecification1663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldSpecification1680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldSpecification1697 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFieldSpecification1709 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFieldSpecification1721 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification1738 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFieldSpecification1755 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFieldSpecification1767 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification1784 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification1810 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFieldSpecification1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification1859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSpecification1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu1978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowRestartMenu1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAllowRestartMenu2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration2070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartFieldDeclaration2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStartFieldDeclaration2117 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStartFieldDeclaration2129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartFieldDeclaration2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations2185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisations2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFieldInitialisations2232 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldInitialisations2244 = new BitSet(new long[]{0x000001A000000000L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations2266 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFieldInitialisations2278 = new BitSet(new long[]{0x000001A000002000L});
    public static final BitSet FOLLOW_13_in_ruleFieldInitialisations2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisation2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_ruleFieldInitialisation2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation2474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultInitialisation2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDefaultInitialisation2521 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDefaultInitialisation2533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefaultInitialisation2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRandomInitialisation2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRandomInitialisation2636 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRandomInitialisation2648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRandomInitialisation2668 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRandomInitialisation2680 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRandomInitialisation2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextInitialisation2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleContextInitialisation2785 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleContextInitialisation2797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContextInitialisation2817 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleContextInitialisation2829 = new BitSet(new long[]{0x0001900000000000L});
    public static final BitSet FOLLOW_ruleContextExpression_in_ruleContextInitialisation2850 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleContextInitialisation2862 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContextInitialisation2874 = new BitSet(new long[]{0x0001900000000000L});
    public static final BitSet FOLLOW_ruleContextExpression_in_ruleContextInitialisation2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_entryRuleContextExpression2931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextExpression2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleContextExpression2987 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleContextExpression3000 = new BitSet(new long[]{0x0001900000000000L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleContextExpression3021 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_ruleAtomicExpression3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_ruleAtomicExpression3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_ruleAtomicExpression3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression3205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterExpression3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFilterExpression3252 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleFilterExpression3264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterExpression3284 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFilterExpression3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_entryRuleCountExpression3332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountExpression3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCountExpression3379 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCountExpression3391 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCountExpression3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression3448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyExpression3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNotEmptyExpression3495 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleNotEmptyExpression3507 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleNotEmptyExpression3519 = new BitSet(new long[]{0x0000000000000002L});

}