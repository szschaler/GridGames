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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'{'", "'}'", "'cell'", "'display'", "'as'", "'label'", "'button'", "'text'", "'field'", "'width'", "'='", "'height'", "'allow_restart'", "'start'", "'init'", "'default'", "':'", "'random'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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

                if ( (LA2_0==20) ) {
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

                if ( ((LA3_0>=24 && LA3_0<=25)) ) {
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:181:1: ruleCellSpecification returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'display' otherlv_4= '{' otherlv_5= 'as' ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) ) otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleCellSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_display_type_6_1=null;
        Token lv_display_type_6_2=null;
        Token otherlv_7=null;
        Token lv_text_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:184:28: ( (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'display' otherlv_4= '{' otherlv_5= 'as' ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) ) otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'display' otherlv_4= '{' otherlv_5= 'as' ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) ) otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:1: (otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'display' otherlv_4= '{' otherlv_5= 'as' ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) ) otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )? otherlv_10= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:185:3: otherlv_0= 'cell' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'display' otherlv_4= '{' otherlv_5= 'as' ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) ) otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )? otherlv_10= '}'
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
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:211:1: (otherlv_3= 'display' otherlv_4= '{' otherlv_5= 'as' ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) ) otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:211:3: otherlv_3= 'display' otherlv_4= '{' otherlv_5= 'as' ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) ) otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCellSpecification364); 

                        	newLeafNode(otherlv_3, grammarAccess.getCellSpecificationAccess().getDisplayKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleCellSpecification376); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCellSpecification388); 

                        	newLeafNode(otherlv_5, grammarAccess.getCellSpecificationAccess().getAsKeyword_3_2());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:223:1: ( ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:224:1: ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:224:1: ( (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:225:1: (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:225:1: (lv_display_type_6_1= 'label' | lv_display_type_6_2= 'button' )
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
                            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:226:3: lv_display_type_6_1= 'label'
                            {
                            lv_display_type_6_1=(Token)match(input,17,FOLLOW_17_in_ruleCellSpecification408); 

                                    newLeafNode(lv_display_type_6_1, grammarAccess.getCellSpecificationAccess().getDisplay_typeLabelKeyword_3_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCellSpecificationRule());
                            	        }
                                   		setWithLastConsumed(current, "display_type", lv_display_type_6_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:238:8: lv_display_type_6_2= 'button'
                            {
                            lv_display_type_6_2=(Token)match(input,18,FOLLOW_18_in_ruleCellSpecification437); 

                                    newLeafNode(lv_display_type_6_2, grammarAccess.getCellSpecificationAccess().getDisplay_typeButtonKeyword_3_3_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCellSpecificationRule());
                            	        }
                                   		setWithLastConsumed(current, "display_type", lv_display_type_6_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleCellSpecification465); 

                        	newLeafNode(otherlv_7, grammarAccess.getCellSpecificationAccess().getTextKeyword_3_4());
                        
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:257:1: ( (lv_text_8_0= RULE_STRING ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:258:1: (lv_text_8_0= RULE_STRING )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:258:1: (lv_text_8_0= RULE_STRING )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:259:3: lv_text_8_0= RULE_STRING
                    {
                    lv_text_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCellSpecification482); 

                    			newLeafNode(lv_text_8_0, grammarAccess.getCellSpecificationAccess().getTextSTRINGTerminalRuleCall_3_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCellSpecificationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleCellSpecification499); 

                        	newLeafNode(otherlv_9, grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_3_6());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleCellSpecification513); 

                	newLeafNode(otherlv_10, grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:291:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:292:2: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:293:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
            {
             newCompositeNode(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification549);
            iv_ruleFieldSpecification=ruleFieldSpecification();

            state._fsp--;

             current =iv_ruleFieldSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldSpecification559); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:300:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) ;
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
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:303:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:304:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:304:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:304:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'width' otherlv_4= '=' ( (lv_width_5_0= RULE_INT ) ) otherlv_6= 'height' otherlv_7= '=' ( (lv_height_8_0= RULE_INT ) ) ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleFieldSpecification596); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:309:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:309:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldSpecification613); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFieldSpecification630); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFieldSpecification642); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3());
                
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleFieldSpecification654); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:338:1: ( (lv_width_5_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:339:1: (lv_width_5_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:339:1: (lv_width_5_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:340:3: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification671); 

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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleFieldSpecification688); 

                	newLeafNode(otherlv_6, grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6());
                
            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFieldSpecification700); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:364:1: ( (lv_height_8_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:365:1: (lv_height_8_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:365:1: (lv_height_8_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:366:3: lv_height_8_0= RULE_INT
            {
            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFieldSpecification717); 

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

            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:382:2: ( (lv_field_initialisation_9_0= ruleFieldInitialisations ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:383:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:383:1: (lv_field_initialisation_9_0= ruleFieldInitialisations )
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:384:3: lv_field_initialisation_9_0= ruleFieldInitialisations
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification743);
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

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleFieldSpecification756); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:412:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:413:2: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:414:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification792);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSpecification802); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:421:1: ruleOptionSpecification returns [EObject current=null] : (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StartFieldDeclaration_0 = null;

        EObject this_AllowRestartMenu_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:424:28: ( (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:425:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:425:1: (this_StartFieldDeclaration_0= ruleStartFieldDeclaration | this_AllowRestartMenu_1= ruleAllowRestartMenu )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:426:5: this_StartFieldDeclaration_0= ruleStartFieldDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification849);
                    this_StartFieldDeclaration_0=ruleStartFieldDeclaration();

                    state._fsp--;

                     
                            current = this_StartFieldDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:436:5: this_AllowRestartMenu_1= ruleAllowRestartMenu
                    {
                     
                            newCompositeNode(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification876);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:452:1: entryRuleAllowRestartMenu returns [EObject current=null] : iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF ;
    public final EObject entryRuleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowRestartMenu = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:453:2: (iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:454:2: iv_ruleAllowRestartMenu= ruleAllowRestartMenu EOF
            {
             newCompositeNode(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu911);
            iv_ruleAllowRestartMenu=ruleAllowRestartMenu();

            state._fsp--;

             current =iv_ruleAllowRestartMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowRestartMenu921); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:461:1: ruleAllowRestartMenu returns [EObject current=null] : (otherlv_0= 'allow_restart' () ) ;
    public final EObject ruleAllowRestartMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:464:28: ( (otherlv_0= 'allow_restart' () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:465:1: (otherlv_0= 'allow_restart' () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:465:1: (otherlv_0= 'allow_restart' () )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:465:3: otherlv_0= 'allow_restart' ()
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAllowRestartMenu958); 

                	newLeafNode(otherlv_0, grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:469:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:470:5: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:483:1: entryRuleStartFieldDeclaration returns [EObject current=null] : iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF ;
    public final EObject entryRuleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartFieldDeclaration = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:484:2: (iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:485:2: iv_ruleStartFieldDeclaration= ruleStartFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration1003);
            iv_ruleStartFieldDeclaration=ruleStartFieldDeclaration();

            state._fsp--;

             current =iv_ruleStartFieldDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartFieldDeclaration1013); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:492:1: ruleStartFieldDeclaration returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStartFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_field_name_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:495:28: ( (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:496:1: (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:496:1: (otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:496:3: otherlv_0= 'start' otherlv_1= '=' ( (lv_field_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStartFieldDeclaration1050); 

                	newLeafNode(otherlv_0, grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleStartFieldDeclaration1062); 

                	newLeafNode(otherlv_1, grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:504:1: ( (lv_field_name_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:505:1: (lv_field_name_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:505:1: (lv_field_name_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:506:3: lv_field_name_2_0= RULE_ID
            {
            lv_field_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartFieldDeclaration1079); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:530:1: entryRuleFieldInitialisations returns [EObject current=null] : iv_ruleFieldInitialisations= ruleFieldInitialisations EOF ;
    public final EObject entryRuleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisations = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:531:2: (iv_ruleFieldInitialisations= ruleFieldInitialisations EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:532:2: iv_ruleFieldInitialisations= ruleFieldInitialisations EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations1120);
            iv_ruleFieldInitialisations=ruleFieldInitialisations();

            state._fsp--;

             current =iv_ruleFieldInitialisations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisations1130); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:539:1: ruleFieldInitialisations returns [EObject current=null] : (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ ) ;
    public final EObject ruleFieldInitialisations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_initialisations_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:542:28: ( (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:543:1: (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:543:1: (otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+ )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:543:3: otherlv_0= 'init' ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFieldInitialisations1167); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:547:1: ( (lv_initialisations_1_0= ruleFieldInitialisation ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:548:1: (lv_initialisations_1_0= ruleFieldInitialisation )
            	    {
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:548:1: (lv_initialisations_1_0= ruleFieldInitialisation )
            	    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:549:3: lv_initialisations_1_0= ruleFieldInitialisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations1188);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:573:1: entryRuleFieldInitialisation returns [EObject current=null] : iv_ruleFieldInitialisation= ruleFieldInitialisation EOF ;
    public final EObject entryRuleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:574:2: (iv_ruleFieldInitialisation= ruleFieldInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:575:2: iv_ruleFieldInitialisation= ruleFieldInitialisation EOF
            {
             newCompositeNode(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1225);
            iv_ruleFieldInitialisation=ruleFieldInitialisation();

            state._fsp--;

             current =iv_ruleFieldInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisation1235); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:582:1: ruleFieldInitialisation returns [EObject current=null] : (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation ) ;
    public final EObject ruleFieldInitialisation() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultInitialisation_0 = null;

        EObject this_RandomInitialisation_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:585:28: ( (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:586:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:586:1: (this_DefaultInitialisation_0= ruleDefaultInitialisation | this_RandomInitialisation_1= ruleRandomInitialisation )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:587:5: this_DefaultInitialisation_0= ruleDefaultInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation1282);
                    this_DefaultInitialisation_0=ruleDefaultInitialisation();

                    state._fsp--;

                     
                            current = this_DefaultInitialisation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:597:5: this_RandomInitialisation_1= ruleRandomInitialisation
                    {
                     
                            newCompositeNode(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation1309);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:613:1: entryRuleDefaultInitialisation returns [EObject current=null] : iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF ;
    public final EObject entryRuleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:614:2: (iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:615:2: iv_ruleDefaultInitialisation= ruleDefaultInitialisation EOF
            {
             newCompositeNode(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1344);
            iv_ruleDefaultInitialisation=ruleDefaultInitialisation();

            state._fsp--;

             current =iv_ruleDefaultInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultInitialisation1354); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:622:1: ruleDefaultInitialisation returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDefaultInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cell_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:625:28: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:626:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:626:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:626:3: otherlv_0= 'default' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDefaultInitialisation1391); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleDefaultInitialisation1403); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:634:1: ( (lv_cell_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:635:1: (lv_cell_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:635:1: (lv_cell_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:636:3: lv_cell_2_0= RULE_ID
            {
            lv_cell_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefaultInitialisation1420); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:660:1: entryRuleRandomInitialisation returns [EObject current=null] : iv_ruleRandomInitialisation= ruleRandomInitialisation EOF ;
    public final EObject entryRuleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomInitialisation = null;


        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:661:2: (iv_ruleRandomInitialisation= ruleRandomInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:662:2: iv_ruleRandomInitialisation= ruleRandomInitialisation EOF
            {
             newCompositeNode(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1461);
            iv_ruleRandomInitialisation=ruleRandomInitialisation();

            state._fsp--;

             current =iv_ruleRandomInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRandomInitialisation1471); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:669:1: ruleRandomInitialisation returns [EObject current=null] : (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRandomInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cell_2_0=null;
        Token otherlv_3=null;
        Token lv_count_4_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:672:28: ( (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:673:1: (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:673:1: (otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:673:3: otherlv_0= 'random' otherlv_1= ':' ( (lv_cell_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_count_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleRandomInitialisation1508); 

                	newLeafNode(otherlv_0, grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleRandomInitialisation1520); 

                	newLeafNode(otherlv_1, grammarAccess.getRandomInitialisationAccess().getColonKeyword_1());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:681:1: ( (lv_cell_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:682:1: (lv_cell_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:682:1: (lv_cell_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:683:3: lv_cell_2_0= RULE_ID
            {
            lv_cell_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRandomInitialisation1537); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleRandomInitialisation1554); 

                	newLeafNode(otherlv_3, grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3());
                
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:703:1: ( (lv_count_4_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:704:1: (lv_count_4_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:704:1: (lv_count_4_0= RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames/src-gen/uk/ac/kcl/inf/zschaler/gridgames/parser/antlr/internal/InternalGridGame.g:705:3: lv_count_4_0= RULE_INT
            {
            lv_count_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRandomInitialisation1571); 

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
    public static final BitSet FOLLOW_ruleCellSpecification_in_ruleGridGame177 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_ruleGridGame199 = new BitSet(new long[]{0x0000000003102000L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_ruleGridGame221 = new BitSet(new long[]{0x0000000003002000L});
    public static final BitSet FOLLOW_13_in_ruleGridGame234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellSpecification280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCellSpecification317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCellSpecification334 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellSpecification351 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleCellSpecification364 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCellSpecification376 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCellSpecification388 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCellSpecification408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleCellSpecification437 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCellSpecification465 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCellSpecification482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellSpecification499 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCellSpecification513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldSpecification559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFieldSpecification596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldSpecification613 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldSpecification630 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFieldSpecification642 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFieldSpecification654 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification671 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFieldSpecification688 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFieldSpecification700 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFieldSpecification717 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_ruleFieldSpecification743 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFieldSpecification756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSpecification802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_ruleOptionSpecification849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_ruleOptionSpecification876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowRestartMenu921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAllowRestartMenu958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartFieldDeclaration1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStartFieldDeclaration1050 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStartFieldDeclaration1062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartFieldDeclaration1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations1120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisations1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFieldInitialisations1167 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_ruleFieldInitialisations1188 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisation1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_ruleFieldInitialisation1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_ruleFieldInitialisation1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultInitialisation1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDefaultInitialisation1391 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDefaultInitialisation1403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefaultInitialisation1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRandomInitialisation1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRandomInitialisation1508 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRandomInitialisation1520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRandomInitialisation1537 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRandomInitialisation1554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRandomInitialisation1571 = new BitSet(new long[]{0x0000000000000002L});

}