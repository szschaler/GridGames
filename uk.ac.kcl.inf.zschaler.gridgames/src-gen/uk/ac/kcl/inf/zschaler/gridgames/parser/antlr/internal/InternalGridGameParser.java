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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'cell'", "'field'", "'width'", "'='", "'height'", "'allow_restart'", "'start'", "'init'", "'default'", "':'", "'random'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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

                if ( (LA2_0==15) ) {
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

                if ( ((LA3_0>=19 && LA3_0<=20)) ) {
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:181:1: ruleCellSpecification returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleCellSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:184:28: ( (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:3: otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
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
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCellSpecification363); 

                	newLeafNode(otherlv_3, grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleFieldSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:223:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:224:2: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:225:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
            {
             newCompositeNode(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification399);
            iv_ruleFieldSpecification=ruleFieldSpecification();

            state._fsp--;

             current =iv_ruleFieldSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldSpecification409); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:232:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:235:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:236:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:236:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:236:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFieldSpecification446); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:240:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:241:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:241:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:242:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldSpecification463); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFieldSpecification480); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFieldSpecification492); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFieldSpecification504); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:270:1: ( (lv_width_5_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:271:1: (lv_width_5_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:271:1: (lv_width_5_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:272:3: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification521); 

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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleFieldSpecification538); 

                	newLeafNode(otherlv_6, grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleFieldSpecification550); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:296:1: ( (lv_height_8_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:297:1: (lv_height_8_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:297:1: (lv_height_8_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:298:3: lv_height_8_0= RULE_INT
            {
            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification567); 

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:314:2: ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:315:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:315:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:316:3: lv_field_initialisation_9_0= ruleFieldInitialisations
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification593);
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

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleFieldSpecification606); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:344:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:345:2: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:346:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification642);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSpecification652); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:353:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_AllowRestartMenu_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:356:28: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:357:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:357:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:358:5: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification699);
                    this_StartFieldDeclaration_0=ruleStartFieldDeclaration();

                    state._fsp--;

                     
                            current = this_StartFieldDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:368:5: this_AllowRestartMenu_1= ruleAllowRestartMenu
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification726);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:384:1: entryRuleAllowRestartMenu returns [EObject current=null] : iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF ;
    public final EObject entryRuleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowRestartMenu = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:385:2: (iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:386:2: iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF
            {
             newCompositeNode(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu761);
            iv_ruleAllowRestartMenu=ruleAllowRestartMenu();

            state._fsp--;

             current =iv_ruleAllowRestartMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowRestartMenu771); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:393:1: ruleAllowRestartMenu returns [EObject current=null] : (otherlv_0= 'allow_restart' () ) ;
    public final EObject ruleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:396:28: ( (otherlv_0= 'allow_restart' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:397:1: (otherlv_0= 'allow_restart' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:397:1: (otherlv_0= 'allow_restart' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:397:3: otherlv_0= 'allow_restart' ()
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAllowRestartMenu808); 

                	newLeafNode(otherlv_0, grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:401:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:402:5: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:415:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:416:2: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:417:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration853);
            iv_ruleStartFieldDeclaration=ruleStartFieldDeclaration();

            state._fsp--;

             current =iv_ruleStartFieldDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartFieldDeclaration863); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:424:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_field_name_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:427:28: ( (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:428:1: (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:428:1: (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:428:3: otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleStartFieldDeclaration900); 

                	newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStartFieldDeclaration912); 

                	newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:436:1: ( (lv_field_name_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:437:1: (lv_field_name_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:437:1: (lv_field_name_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:438:3: lv_field_name_2_0= RULE_ID
            {
            lv_field_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartFieldDeclaration929); 

            			newLeafNode(lv_field_name_2_0, grammarAccess.getStartFieldDeclarationAccess().getField_nameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStartFieldDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"field_name",
                    		lv_field_name_2_0, 
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
    // $ANTLR end "ruleStartFieldDeclaration"


    // $ANTLR start "entryRuleFieldInitialisations"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:462:1: entryRuleFieldInitialisations returns [EObject current=null] : iv_ruleFieldInitialisations= ruleFieldInitialisations EOF ;
    public final EObject entryRuleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisations = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:463:2: (iv_ruleFieldInitialisations= ruleFieldInitialisations EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:464:2: iv_ruleFieldInitialisations= ruleFieldInitialisations EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations970);
            iv_ruleFieldInitialisations=ruleFieldInitialisations();

            state._fsp--;

             current =iv_ruleFieldInitialisations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisations980); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:471:1: ruleFieldInitialisations returns [EObject current=null] : (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ ) ;
    public final EObject ruleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_initialisations_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:474:28: ( (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:475:1: (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:475:1: (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:475:3: otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleFieldInitialisations1017); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:479:1: ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:480:1: (lv_initialisations_1_0= ruleFieldInitialisation )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:480:1: (lv_initialisations_1_0= ruleFieldInitialisation )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:481:3: lv_initialisations_1_0= ruleFieldInitialisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations1038);
            	    lv_initialisations_1_0=ruleFieldInitialisation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldInitialisationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initialisations",
            	            		lv_initialisations_1_0, 
            	            		"FieldInitialisation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleFieldInitialisations"


    // $ANTLR start "entryRuleFieldInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:505:1: entryRuleFieldInitialisation returns [EObject current=null] : iv_ruleFieldInitialisation= ruleFieldInitialisation EOF ;
    public final EObject entryRuleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:506:2: (iv_ruleFieldInitialisation= ruleFieldInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:507:2: iv_ruleFieldInitialisation= ruleFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1075);
            iv_ruleFieldInitialisation=ruleFieldInitialisation();

            state._fsp--;

             current =iv_ruleFieldInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisation1085); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:514:1: ruleFieldInitialisation returns [EObject current=null] : (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation ) ;
    public final EObject ruleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultInitialisation_0 = null;

        EObject this_RandomInitialisation_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:517:28: ( (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:518:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:518:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:519:5: this_DefaultInitialisation_0= ruleDefaultInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation1132);
                    this_DefaultInitialisation_0=ruleDefaultInitialisation();

                    state._fsp--;

                     
                            current = this_DefaultInitialisation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:529:5: this_RandomInitialisation_1= ruleRandomInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation1159);
                    this_RandomInitialisation_1=ruleRandomInitialisation();

                    state._fsp--;

                     
                            current = this_RandomInitialisation_1; 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:545:1: entryRuleDefaultInitialisation returns [EObject current=null] : iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF ;
    public final EObject entryRuleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:546:2: (iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:547:2: iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF
            {
             newCompositeNode(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1194);
            iv_ruleDefaultInitialisation=ruleDefaultInitialisation();

            state._fsp--;

             current =iv_ruleDefaultInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultInitialisation1204); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:554:1: ruleDefaultInitialisation returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cell_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:557:28: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:558:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:558:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:558:3: otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDefaultInitialisation1241); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleDefaultInitialisation1253); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:566:1: ( (lv_cell_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:567:1: (lv_cell_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:567:1: (lv_cell_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:568:3: lv_cell_2_0= RULE_ID
            {
            lv_cell_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefaultInitialisation1270); 

            			newLeafNode(lv_cell_2_0, grammarAccess.getDefaultInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cell",
                    		lv_cell_2_0, 
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
    // $ANTLR end "ruleDefaultInitialisation"


    // $ANTLR start "entryRuleRandomInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:592:1: entryRuleRandomInitialisation returns [EObject current=null] : iv_ruleRandomInitialisation= ruleRandomInitialisation EOF ;
    public final EObject entryRuleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:593:2: (iv_ruleRandomInitialisation= ruleRandomInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:594:2: iv_ruleRandomInitialisation= ruleRandomInitialisation EOF
            {
             newCompositeNode(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1311);
            iv_ruleRandomInitialisation=ruleRandomInitialisation();

            state._fsp--;

             current =iv_ruleRandomInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRandomInitialisation1321); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:601:1: ruleRandomInitialisation returns [EObject current=null] : (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cell_2_0=null;
        Token otherlv_3=null;
        Token lv_count_4_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:604:28: ( (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:605:1: (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:605:1: (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:605:3: otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRandomInitialisation1358); 

                	newLeafNode(otherlv_0, grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleRandomInitialisation1370); 

                	newLeafNode(otherlv_1, grammarAccess.getRandomInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:613:1: ( (lv_cell_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:614:1: (lv_cell_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:614:1: (lv_cell_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:615:3: lv_cell_2_0= RULE_ID
            {
            lv_cell_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRandomInitialisation1387); 

            			newLeafNode(lv_cell_2_0, grammarAccess.getRandomInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRandomInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cell",
                    		lv_cell_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRandomInitialisation1404); 

                	newLeafNode(otherlv_3, grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:635:1: ( (lv_count_4_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:636:1: (lv_count_4_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:636:1: (lv_count_4_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:637:3: lv_count_4_0= RULE_INT
            {
            lv_count_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRandomInitialisation1421); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGridGame_in_entryRuleGridGame75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridGame85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGridGame122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGridGame139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGridGame156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_ruleGridGame177 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_ruleGridGame199 = new BitSet(new long[]{0x000000000018A000L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_ruleGridGame221 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_13_in_ruleGridGame234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellSpecification280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCellSpecification317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellSpecification334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellSpecification351 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellSpecification363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldSpecification409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFieldSpecification446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldSpecification463 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldSpecification480 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFieldSpecification492 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFieldSpecification504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification521 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFieldSpecification538 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFieldSpecification550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification567 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification593 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFieldSpecification606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSpecification652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowRestartMenu771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAllowRestartMenu808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartFieldDeclaration863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStartFieldDeclaration900 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStartFieldDeclaration912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartFieldDeclaration929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisations980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFieldInitialisations1017 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations1038 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisation1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultInitialisation1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDefaultInitialisation1241 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDefaultInitialisation1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefaultInitialisation1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRandomInitialisation1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRandomInitialisation1358 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRandomInitialisation1370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRandomInitialisation1387 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRandomInitialisation1404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRandomInitialisation1421 = new BitSet(new long[]{0x0000000000000002L});

}