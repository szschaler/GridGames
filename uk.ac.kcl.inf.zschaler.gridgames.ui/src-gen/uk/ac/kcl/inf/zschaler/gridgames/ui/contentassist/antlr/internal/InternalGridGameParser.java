package uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.zschaler.gridgames.services.GridGameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGridGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'label'", "'button'", "'int'", "'String'", "'game'", "'{'", "'}'", "'cell'", "'display'", "'as'", "'text'", "'var'", "'field'", "'width'", "'='", "'height'", "'allow_restart'", "'start'", "'init'", "';'", "'default'", "':'", "'random'", "'context'", "'check'", "'value'", "'.'", "'filter'", "'('", "')'", "'count'", "'notEmpty'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g"; }


     
     	private GridGameGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GridGameGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGridGame"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:60:1: entryRuleGridGame : ruleGridGame EOF ;
    public final void entryRuleGridGame() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:61:1: ( ruleGridGame EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:62:1: ruleGridGame EOF
            {
             before(grammarAccess.getGridGameRule()); 
            pushFollow(FOLLOW_ruleGridGame_in_entryRuleGridGame61);
            ruleGridGame();

            state._fsp--;

             after(grammarAccess.getGridGameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGridGame68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGridGame"


    // $ANTLR start "ruleGridGame"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:69:1: ruleGridGame : ( ( rule__GridGame__Group__0 ) ) ;
    public final void ruleGridGame() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:73:2: ( ( ( rule__GridGame__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:74:1: ( ( rule__GridGame__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:74:1: ( ( rule__GridGame__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:75:1: ( rule__GridGame__Group__0 )
            {
             before(grammarAccess.getGridGameAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:76:1: ( rule__GridGame__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:76:2: rule__GridGame__Group__0
            {
            pushFollow(FOLLOW_rule__GridGame__Group__0_in_ruleGridGame94);
            rule__GridGame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridGame"


    // $ANTLR start "entryRuleCellSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:88:1: entryRuleCellSpecification : ruleCellSpecification EOF ;
    public final void entryRuleCellSpecification() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:89:1: ( ruleCellSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:90:1: ruleCellSpecification EOF
            {
             before(grammarAccess.getCellSpecificationRule()); 
            pushFollow(FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification121);
            ruleCellSpecification();

            state._fsp--;

             after(grammarAccess.getCellSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellSpecification128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellSpecification"


    // $ANTLR start "ruleCellSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:97:1: ruleCellSpecification : ( ( rule__CellSpecification__Group__0 ) ) ;
    public final void ruleCellSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:101:2: ( ( ( rule__CellSpecification__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:102:1: ( ( rule__CellSpecification__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:102:1: ( ( rule__CellSpecification__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:103:1: ( rule__CellSpecification__Group__0 )
            {
             before(grammarAccess.getCellSpecificationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:104:1: ( rule__CellSpecification__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:104:2: rule__CellSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__0_in_ruleCellSpecification154);
            rule__CellSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellSpecification"


    // $ANTLR start "entryRuleCellMember"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:116:1: entryRuleCellMember : ruleCellMember EOF ;
    public final void entryRuleCellMember() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:117:1: ( ruleCellMember EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:118:1: ruleCellMember EOF
            {
             before(grammarAccess.getCellMemberRule()); 
            pushFollow(FOLLOW_ruleCellMember_in_entryRuleCellMember181);
            ruleCellMember();

            state._fsp--;

             after(grammarAccess.getCellMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellMember188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellMember"


    // $ANTLR start "ruleCellMember"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:125:1: ruleCellMember : ( ( rule__CellMember__Alternatives ) ) ;
    public final void ruleCellMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:129:2: ( ( ( rule__CellMember__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:130:1: ( ( rule__CellMember__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:130:1: ( ( rule__CellMember__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:131:1: ( rule__CellMember__Alternatives )
            {
             before(grammarAccess.getCellMemberAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:132:1: ( rule__CellMember__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:132:2: rule__CellMember__Alternatives
            {
            pushFollow(FOLLOW_rule__CellMember__Alternatives_in_ruleCellMember214);
            rule__CellMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellMember"


    // $ANTLR start "entryRuleCellDisplaySpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:144:1: entryRuleCellDisplaySpec : ruleCellDisplaySpec EOF ;
    public final void entryRuleCellDisplaySpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:145:1: ( ruleCellDisplaySpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:146:1: ruleCellDisplaySpec EOF
            {
             before(grammarAccess.getCellDisplaySpecRule()); 
            pushFollow(FOLLOW_ruleCellDisplaySpec_in_entryRuleCellDisplaySpec241);
            ruleCellDisplaySpec();

            state._fsp--;

             after(grammarAccess.getCellDisplaySpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellDisplaySpec248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellDisplaySpec"


    // $ANTLR start "ruleCellDisplaySpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:153:1: ruleCellDisplaySpec : ( ( rule__CellDisplaySpec__Group__0 ) ) ;
    public final void ruleCellDisplaySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:157:2: ( ( ( rule__CellDisplaySpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:158:1: ( ( rule__CellDisplaySpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:158:1: ( ( rule__CellDisplaySpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:159:1: ( rule__CellDisplaySpec__Group__0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:160:1: ( rule__CellDisplaySpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:160:2: rule__CellDisplaySpec__Group__0
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__0_in_ruleCellDisplaySpec274);
            rule__CellDisplaySpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellDisplaySpec"


    // $ANTLR start "entryRuleCellVarSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:172:1: entryRuleCellVarSpec : ruleCellVarSpec EOF ;
    public final void entryRuleCellVarSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:173:1: ( ruleCellVarSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:174:1: ruleCellVarSpec EOF
            {
             before(grammarAccess.getCellVarSpecRule()); 
            pushFollow(FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec301);
            ruleCellVarSpec();

            state._fsp--;

             after(grammarAccess.getCellVarSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellVarSpec308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellVarSpec"


    // $ANTLR start "ruleCellVarSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:181:1: ruleCellVarSpec : ( ( rule__CellVarSpec__Group__0 ) ) ;
    public final void ruleCellVarSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:185:2: ( ( ( rule__CellVarSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:186:1: ( ( rule__CellVarSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:186:1: ( ( rule__CellVarSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:187:1: ( rule__CellVarSpec__Group__0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:188:1: ( rule__CellVarSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:188:2: rule__CellVarSpec__Group__0
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__0_in_ruleCellVarSpec334);
            rule__CellVarSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellVarSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellVarSpec"


    // $ANTLR start "entryRuleFieldSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:200:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:201:1: ( ruleFieldSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:202:1: ruleFieldSpecification EOF
            {
             before(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification361);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldSpecification368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldSpecification"


    // $ANTLR start "ruleFieldSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:209:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:213:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:214:1: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:214:1: ( ( rule__FieldSpecification__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:215:1: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:216:1: ( rule__FieldSpecification__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:216:2: rule__FieldSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__0_in_ruleFieldSpecification394);
            rule__FieldSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldSpecification"


    // $ANTLR start "entryRuleOptionSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:228:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:229:1: ( ruleOptionSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:230:1: ruleOptionSpecification EOF
            {
             before(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification421);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSpecification428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:237:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:241:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:242:1: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:242:1: ( ( rule__OptionSpecification__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:243:1: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:244:1: ( rule__OptionSpecification__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:244:2: rule__OptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__OptionSpecification__Alternatives_in_ruleOptionSpecification454);
            rule__OptionSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleAllowRestartMenu"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:256:1: entryRuleAllowRestartMenu : ruleAllowRestartMenu EOF ;
    public final void entryRuleAllowRestartMenu() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:257:1: ( ruleAllowRestartMenu EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:258:1: ruleAllowRestartMenu EOF
            {
             before(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu481);
            ruleAllowRestartMenu();

            state._fsp--;

             after(grammarAccess.getAllowRestartMenuRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowRestartMenu488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllowRestartMenu"


    // $ANTLR start "ruleAllowRestartMenu"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:265:1: ruleAllowRestartMenu : ( ( rule__AllowRestartMenu__Group__0 ) ) ;
    public final void ruleAllowRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:269:2: ( ( ( rule__AllowRestartMenu__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:270:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:270:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:271:1: ( rule__AllowRestartMenu__Group__0 )
            {
             before(grammarAccess.getAllowRestartMenuAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:272:1: ( rule__AllowRestartMenu__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:272:2: rule__AllowRestartMenu__Group__0
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__0_in_ruleAllowRestartMenu514);
            rule__AllowRestartMenu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllowRestartMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllowRestartMenu"


    // $ANTLR start "entryRuleStartFieldDeclaration"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:284:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:285:1: ( ruleStartFieldDeclaration EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:286:1: ruleStartFieldDeclaration EOF
            {
             before(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration541);
            ruleStartFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getStartFieldDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartFieldDeclaration548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartFieldDeclaration"


    // $ANTLR start "ruleStartFieldDeclaration"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:293:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:297:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:298:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:298:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:299:1: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:300:1: ( rule__StartFieldDeclaration__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:300:2: rule__StartFieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__0_in_ruleStartFieldDeclaration574);
            rule__StartFieldDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartFieldDeclaration"


    // $ANTLR start "entryRuleFieldInitialisations"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:312:1: entryRuleFieldInitialisations : ruleFieldInitialisations EOF ;
    public final void entryRuleFieldInitialisations() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:313:1: ( ruleFieldInitialisations EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:314:1: ruleFieldInitialisations EOF
            {
             before(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations601);
            ruleFieldInitialisations();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisations608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldInitialisations"


    // $ANTLR start "ruleFieldInitialisations"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:321:1: ruleFieldInitialisations : ( ( rule__FieldInitialisations__Group__0 ) ) ;
    public final void ruleFieldInitialisations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:325:2: ( ( ( rule__FieldInitialisations__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:326:1: ( ( rule__FieldInitialisations__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:326:1: ( ( rule__FieldInitialisations__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:327:1: ( rule__FieldInitialisations__Group__0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:328:1: ( rule__FieldInitialisations__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:328:2: rule__FieldInitialisations__Group__0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__0_in_ruleFieldInitialisations634);
            rule__FieldInitialisations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldInitialisations"


    // $ANTLR start "entryRuleFieldInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:340:1: entryRuleFieldInitialisation : ruleFieldInitialisation EOF ;
    public final void entryRuleFieldInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:341:1: ( ruleFieldInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:342:1: ruleFieldInitialisation EOF
            {
             before(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation661);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisation668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldInitialisation"


    // $ANTLR start "ruleFieldInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:349:1: ruleFieldInitialisation : ( ( rule__FieldInitialisation__Alternatives ) ) ;
    public final void ruleFieldInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:353:2: ( ( ( rule__FieldInitialisation__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:354:1: ( ( rule__FieldInitialisation__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:354:1: ( ( rule__FieldInitialisation__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:355:1: ( rule__FieldInitialisation__Alternatives )
            {
             before(grammarAccess.getFieldInitialisationAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:356:1: ( rule__FieldInitialisation__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:356:2: rule__FieldInitialisation__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldInitialisation__Alternatives_in_ruleFieldInitialisation694);
            rule__FieldInitialisation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldInitialisation"


    // $ANTLR start "entryRuleDefaultInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:368:1: entryRuleDefaultInitialisation : ruleDefaultInitialisation EOF ;
    public final void entryRuleDefaultInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:369:1: ( ruleDefaultInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:370:1: ruleDefaultInitialisation EOF
            {
             before(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation721);
            ruleDefaultInitialisation();

            state._fsp--;

             after(grammarAccess.getDefaultInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultInitialisation728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultInitialisation"


    // $ANTLR start "ruleDefaultInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:377:1: ruleDefaultInitialisation : ( ( rule__DefaultInitialisation__Group__0 ) ) ;
    public final void ruleDefaultInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:381:2: ( ( ( rule__DefaultInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:382:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:382:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:383:1: ( rule__DefaultInitialisation__Group__0 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:384:1: ( rule__DefaultInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:384:2: rule__DefaultInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__0_in_ruleDefaultInitialisation754);
            rule__DefaultInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultInitialisation"


    // $ANTLR start "entryRuleRandomInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:396:1: entryRuleRandomInitialisation : ruleRandomInitialisation EOF ;
    public final void entryRuleRandomInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:397:1: ( ruleRandomInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:398:1: ruleRandomInitialisation EOF
            {
             before(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation781);
            ruleRandomInitialisation();

            state._fsp--;

             after(grammarAccess.getRandomInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRandomInitialisation788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRandomInitialisation"


    // $ANTLR start "ruleRandomInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:405:1: ruleRandomInitialisation : ( ( rule__RandomInitialisation__Group__0 ) ) ;
    public final void ruleRandomInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:409:2: ( ( ( rule__RandomInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:410:1: ( ( rule__RandomInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:410:1: ( ( rule__RandomInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:411:1: ( rule__RandomInitialisation__Group__0 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:412:1: ( rule__RandomInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:412:2: rule__RandomInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__0_in_ruleRandomInitialisation814);
            rule__RandomInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandomInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRandomInitialisation"


    // $ANTLR start "entryRuleContextInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:424:1: entryRuleContextInitialisation : ruleContextInitialisation EOF ;
    public final void entryRuleContextInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:425:1: ( ruleContextInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:426:1: ruleContextInitialisation EOF
            {
             before(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation841);
            ruleContextInitialisation();

            state._fsp--;

             after(grammarAccess.getContextInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextInitialisation848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextInitialisation"


    // $ANTLR start "ruleContextInitialisation"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:433:1: ruleContextInitialisation : ( ( rule__ContextInitialisation__Group__0 ) ) ;
    public final void ruleContextInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:437:2: ( ( ( rule__ContextInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:438:1: ( ( rule__ContextInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:438:1: ( ( rule__ContextInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:439:1: ( rule__ContextInitialisation__Group__0 )
            {
             before(grammarAccess.getContextInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:440:1: ( rule__ContextInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:440:2: rule__ContextInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__0_in_ruleContextInitialisation874);
            rule__ContextInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextInitialisation"


    // $ANTLR start "entryRuleContextExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:452:1: entryRuleContextExpression : ruleContextExpression EOF ;
    public final void entryRuleContextExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:453:1: ( ruleContextExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:454:1: ruleContextExpression EOF
            {
             before(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_ruleContextExpression_in_entryRuleContextExpression901);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextExpression908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextExpression"


    // $ANTLR start "ruleContextExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:461:1: ruleContextExpression : ( ( rule__ContextExpression__Group__0 ) ) ;
    public final void ruleContextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:465:2: ( ( ( rule__ContextExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:466:1: ( ( rule__ContextExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:466:1: ( ( rule__ContextExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:467:1: ( rule__ContextExpression__Group__0 )
            {
             before(grammarAccess.getContextExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:468:1: ( rule__ContextExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:468:2: rule__ContextExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__0_in_ruleContextExpression934);
            rule__ContextExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:480:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:481:1: ( ruleAtomicExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:482:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression961);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:489:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:493:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:494:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:494:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:495:1: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:496:1: ( rule__AtomicExpression__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:496:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression994);
            rule__AtomicExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleFilterExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:508:1: entryRuleFilterExpression : ruleFilterExpression EOF ;
    public final void entryRuleFilterExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:509:1: ( ruleFilterExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:510:1: ruleFilterExpression EOF
            {
             before(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression1021);
            ruleFilterExpression();

            state._fsp--;

             after(grammarAccess.getFilterExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterExpression1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterExpression"


    // $ANTLR start "ruleFilterExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:517:1: ruleFilterExpression : ( ( rule__FilterExpression__Group__0 ) ) ;
    public final void ruleFilterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:521:2: ( ( ( rule__FilterExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:522:1: ( ( rule__FilterExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:522:1: ( ( rule__FilterExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:523:1: ( rule__FilterExpression__Group__0 )
            {
             before(grammarAccess.getFilterExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:524:1: ( rule__FilterExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:524:2: rule__FilterExpression__Group__0
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__0_in_ruleFilterExpression1054);
            rule__FilterExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterExpression"


    // $ANTLR start "entryRuleCountExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:536:1: entryRuleCountExpression : ruleCountExpression EOF ;
    public final void entryRuleCountExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:537:1: ( ruleCountExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:538:1: ruleCountExpression EOF
            {
             before(grammarAccess.getCountExpressionRule()); 
            pushFollow(FOLLOW_ruleCountExpression_in_entryRuleCountExpression1081);
            ruleCountExpression();

            state._fsp--;

             after(grammarAccess.getCountExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountExpression1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountExpression"


    // $ANTLR start "ruleCountExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:545:1: ruleCountExpression : ( ( rule__CountExpression__Group__0 ) ) ;
    public final void ruleCountExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:549:2: ( ( ( rule__CountExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:550:1: ( ( rule__CountExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:550:1: ( ( rule__CountExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:551:1: ( rule__CountExpression__Group__0 )
            {
             before(grammarAccess.getCountExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:552:1: ( rule__CountExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:552:2: rule__CountExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__0_in_ruleCountExpression1114);
            rule__CountExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountExpression"


    // $ANTLR start "entryRuleNotEmptyExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:564:1: entryRuleNotEmptyExpression : ruleNotEmptyExpression EOF ;
    public final void entryRuleNotEmptyExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:565:1: ( ruleNotEmptyExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:566:1: ruleNotEmptyExpression EOF
            {
             before(grammarAccess.getNotEmptyExpressionRule()); 
            pushFollow(FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression1141);
            ruleNotEmptyExpression();

            state._fsp--;

             after(grammarAccess.getNotEmptyExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyExpression1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotEmptyExpression"


    // $ANTLR start "ruleNotEmptyExpression"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:573:1: ruleNotEmptyExpression : ( ( rule__NotEmptyExpression__Group__0 ) ) ;
    public final void ruleNotEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:577:2: ( ( ( rule__NotEmptyExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:578:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:578:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:579:1: ( rule__NotEmptyExpression__Group__0 )
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:580:1: ( rule__NotEmptyExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:580:2: rule__NotEmptyExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__0_in_ruleNotEmptyExpression1174);
            rule__NotEmptyExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotEmptyExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotEmptyExpression"


    // $ANTLR start "rule__CellMember__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:592:1: rule__CellMember__Alternatives : ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) );
    public final void rule__CellMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:596:1: ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:597:1: ( ruleCellDisplaySpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:597:1: ( ruleCellDisplaySpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:598:1: ruleCellDisplaySpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCellDisplaySpec_in_rule__CellMember__Alternatives1210);
                    ruleCellDisplaySpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:603:6: ( ruleCellVarSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:603:6: ( ruleCellVarSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:604:1: ruleCellVarSpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCellVarSpec_in_rule__CellMember__Alternatives1227);
                    ruleCellVarSpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellMember__Alternatives"


    // $ANTLR start "rule__CellDisplaySpec__Display_typeAlternatives_3_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:614:1: rule__CellDisplaySpec__Display_typeAlternatives_3_0 : ( ( 'label' ) | ( 'button' ) );
    public final void rule__CellDisplaySpec__Display_typeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:618:1: ( ( 'label' ) | ( 'button' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:619:1: ( 'label' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:619:1: ( 'label' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:620:1: 'label'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01260); 
                     after(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:627:6: ( 'button' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:627:6: ( 'button' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:628:1: 'button'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeButtonKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01280); 
                     after(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeButtonKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Display_typeAlternatives_3_0"


    // $ANTLR start "rule__CellVarSpec__TypeAlternatives_1_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:640:1: rule__CellVarSpec__TypeAlternatives_1_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__CellVarSpec__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:644:1: ( ( 'int' ) | ( 'String' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:645:1: ( 'int' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:645:1: ( 'int' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:646:1: 'int'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_01315); 
                     after(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:653:6: ( 'String' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:653:6: ( 'String' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:654:1: 'String'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeStringKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_01335); 
                     after(grammarAccess.getCellVarSpecAccess().getTypeStringKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__TypeAlternatives_1_0"


    // $ANTLR start "rule__OptionSpecification__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:666:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:670:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:671:1: ( ruleStartFieldDeclaration )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:671:1: ( ruleStartFieldDeclaration )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:672:1: ruleStartFieldDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives1369);
                    ruleStartFieldDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:677:6: ( ruleAllowRestartMenu )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:677:6: ( ruleAllowRestartMenu )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:678:1: ruleAllowRestartMenu
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives1386);
                    ruleAllowRestartMenu();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionSpecification__Alternatives"


    // $ANTLR start "rule__FieldInitialisation__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:688:1: rule__FieldInitialisation__Alternatives : ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) );
    public final void rule__FieldInitialisation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:692:1: ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 34:
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:693:1: ( ruleDefaultInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:693:1: ( ruleDefaultInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:694:1: ruleDefaultInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives1418);
                    ruleDefaultInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:699:6: ( ruleRandomInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:699:6: ( ruleRandomInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:700:1: ruleRandomInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives1435);
                    ruleRandomInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:705:6: ( ruleContextInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:705:6: ( ruleContextInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:706:1: ruleContextInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives1452);
                    ruleContextInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisation__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:716:1: rule__AtomicExpression__Alternatives : ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:720:1: ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 42:
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:721:1: ( ruleFilterExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:721:1: ( ruleFilterExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:722:1: ruleFilterExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives1484);
                    ruleFilterExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:727:6: ( ruleCountExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:727:6: ( ruleCountExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:728:1: ruleCountExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives1501);
                    ruleCountExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:733:6: ( ruleNotEmptyExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:733:6: ( ruleNotEmptyExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:734:1: ruleNotEmptyExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives1518);
                    ruleNotEmptyExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Alternatives"


    // $ANTLR start "rule__GridGame__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:746:1: rule__GridGame__Group__0 : rule__GridGame__Group__0__Impl rule__GridGame__Group__1 ;
    public final void rule__GridGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:750:1: ( rule__GridGame__Group__0__Impl rule__GridGame__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:751:2: rule__GridGame__Group__0__Impl rule__GridGame__Group__1
            {
            pushFollow(FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__01548);
            rule__GridGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__01551);
            rule__GridGame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__0"


    // $ANTLR start "rule__GridGame__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:758:1: rule__GridGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__GridGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:762:1: ( ( 'game' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:763:1: ( 'game' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:763:1: ( 'game' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:764:1: 'game'
            {
             before(grammarAccess.getGridGameAccess().getGameKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__GridGame__Group__0__Impl1579); 
             after(grammarAccess.getGridGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__0__Impl"


    // $ANTLR start "rule__GridGame__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:777:1: rule__GridGame__Group__1 : rule__GridGame__Group__1__Impl rule__GridGame__Group__2 ;
    public final void rule__GridGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:781:1: ( rule__GridGame__Group__1__Impl rule__GridGame__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:782:2: rule__GridGame__Group__1__Impl rule__GridGame__Group__2
            {
            pushFollow(FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__11610);
            rule__GridGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__11613);
            rule__GridGame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__1"


    // $ANTLR start "rule__GridGame__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:789:1: rule__GridGame__Group__1__Impl : ( ( rule__GridGame__NameAssignment_1 ) ) ;
    public final void rule__GridGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:793:1: ( ( ( rule__GridGame__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:794:1: ( ( rule__GridGame__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:794:1: ( ( rule__GridGame__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:795:1: ( rule__GridGame__NameAssignment_1 )
            {
             before(grammarAccess.getGridGameAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:796:1: ( rule__GridGame__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:796:2: rule__GridGame__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl1640);
            rule__GridGame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__1__Impl"


    // $ANTLR start "rule__GridGame__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:806:1: rule__GridGame__Group__2 : rule__GridGame__Group__2__Impl rule__GridGame__Group__3 ;
    public final void rule__GridGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:810:1: ( rule__GridGame__Group__2__Impl rule__GridGame__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:811:2: rule__GridGame__Group__2__Impl rule__GridGame__Group__3
            {
            pushFollow(FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__21670);
            rule__GridGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__21673);
            rule__GridGame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__2"


    // $ANTLR start "rule__GridGame__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:818:1: rule__GridGame__Group__2__Impl : ( '{' ) ;
    public final void rule__GridGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:822:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:823:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:823:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:824:1: '{'
            {
             before(grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__GridGame__Group__2__Impl1701); 
             after(grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__2__Impl"


    // $ANTLR start "rule__GridGame__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:837:1: rule__GridGame__Group__3 : rule__GridGame__Group__3__Impl rule__GridGame__Group__4 ;
    public final void rule__GridGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:841:1: ( rule__GridGame__Group__3__Impl rule__GridGame__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:842:2: rule__GridGame__Group__3__Impl rule__GridGame__Group__4
            {
            pushFollow(FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__31732);
            rule__GridGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__31735);
            rule__GridGame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__3"


    // $ANTLR start "rule__GridGame__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:849:1: rule__GridGame__Group__3__Impl : ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) ) ;
    public final void rule__GridGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:853:1: ( ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:854:1: ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:854:1: ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:855:1: ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:855:1: ( ( rule__GridGame__CellsAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:856:1: ( rule__GridGame__CellsAssignment_3 )
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:857:1: ( rule__GridGame__CellsAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:857:2: rule__GridGame__CellsAssignment_3
            {
            pushFollow(FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1764);
            rule__GridGame__CellsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getCellsAssignment_3()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:860:1: ( ( rule__GridGame__CellsAssignment_3 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:861:1: ( rule__GridGame__CellsAssignment_3 )*
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:862:1: ( rule__GridGame__CellsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:862:2: rule__GridGame__CellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1776);
            	    rule__GridGame__CellsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGridGameAccess().getCellsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__3__Impl"


    // $ANTLR start "rule__GridGame__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:873:1: rule__GridGame__Group__4 : rule__GridGame__Group__4__Impl rule__GridGame__Group__5 ;
    public final void rule__GridGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:877:1: ( rule__GridGame__Group__4__Impl rule__GridGame__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:878:2: rule__GridGame__Group__4__Impl rule__GridGame__Group__5
            {
            pushFollow(FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__41809);
            rule__GridGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__41812);
            rule__GridGame__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__4"


    // $ANTLR start "rule__GridGame__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:885:1: rule__GridGame__Group__4__Impl : ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) ) ;
    public final void rule__GridGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:889:1: ( ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:890:1: ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:890:1: ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:891:1: ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:891:1: ( ( rule__GridGame__FieldsAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:892:1: ( rule__GridGame__FieldsAssignment_4 )
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:893:1: ( rule__GridGame__FieldsAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:893:2: rule__GridGame__FieldsAssignment_4
            {
            pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1841);
            rule__GridGame__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getFieldsAssignment_4()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:896:1: ( ( rule__GridGame__FieldsAssignment_4 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:897:1: ( rule__GridGame__FieldsAssignment_4 )*
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:898:1: ( rule__GridGame__FieldsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:898:2: rule__GridGame__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1853);
            	    rule__GridGame__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGridGameAccess().getFieldsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__4__Impl"


    // $ANTLR start "rule__GridGame__Group__5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:909:1: rule__GridGame__Group__5 : rule__GridGame__Group__5__Impl rule__GridGame__Group__6 ;
    public final void rule__GridGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:913:1: ( rule__GridGame__Group__5__Impl rule__GridGame__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:914:2: rule__GridGame__Group__5__Impl rule__GridGame__Group__6
            {
            pushFollow(FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__51886);
            rule__GridGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__51889);
            rule__GridGame__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__5"


    // $ANTLR start "rule__GridGame__Group__5__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:921:1: rule__GridGame__Group__5__Impl : ( ( rule__GridGame__OptionsAssignment_5 )* ) ;
    public final void rule__GridGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:925:1: ( ( ( rule__GridGame__OptionsAssignment_5 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:926:1: ( ( rule__GridGame__OptionsAssignment_5 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:926:1: ( ( rule__GridGame__OptionsAssignment_5 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:927:1: ( rule__GridGame__OptionsAssignment_5 )*
            {
             before(grammarAccess.getGridGameAccess().getOptionsAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:928:1: ( rule__GridGame__OptionsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:928:2: rule__GridGame__OptionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__OptionsAssignment_5_in_rule__GridGame__Group__5__Impl1916);
            	    rule__GridGame__OptionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGridGameAccess().getOptionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__5__Impl"


    // $ANTLR start "rule__GridGame__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:938:1: rule__GridGame__Group__6 : rule__GridGame__Group__6__Impl ;
    public final void rule__GridGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:942:1: ( rule__GridGame__Group__6__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:943:2: rule__GridGame__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__61947);
            rule__GridGame__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__6"


    // $ANTLR start "rule__GridGame__Group__6__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:949:1: rule__GridGame__Group__6__Impl : ( '}' ) ;
    public final void rule__GridGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:953:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:954:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:954:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:955:1: '}'
            {
             before(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__GridGame__Group__6__Impl1975); 
             after(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__Group__6__Impl"


    // $ANTLR start "rule__CellSpecification__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:982:1: rule__CellSpecification__Group__0 : rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 ;
    public final void rule__CellSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:986:1: ( rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:987:2: rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__02020);
            rule__CellSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__02023);
            rule__CellSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__0"


    // $ANTLR start "rule__CellSpecification__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:994:1: rule__CellSpecification__Group__0__Impl : ( 'cell' ) ;
    public final void rule__CellSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:998:1: ( ( 'cell' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:999:1: ( 'cell' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:999:1: ( 'cell' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1000:1: 'cell'
            {
             before(grammarAccess.getCellSpecificationAccess().getCellKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__CellSpecification__Group__0__Impl2051); 
             after(grammarAccess.getCellSpecificationAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__0__Impl"


    // $ANTLR start "rule__CellSpecification__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1013:1: rule__CellSpecification__Group__1 : rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 ;
    public final void rule__CellSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1017:1: ( rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1018:2: rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__12082);
            rule__CellSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__12085);
            rule__CellSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__1"


    // $ANTLR start "rule__CellSpecification__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1025:1: rule__CellSpecification__Group__1__Impl : ( ( rule__CellSpecification__NameAssignment_1 ) ) ;
    public final void rule__CellSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1029:1: ( ( ( rule__CellSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1030:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1030:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1031:1: ( rule__CellSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getCellSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1032:1: ( rule__CellSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1032:2: rule__CellSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl2112);
            rule__CellSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__1__Impl"


    // $ANTLR start "rule__CellSpecification__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1042:1: rule__CellSpecification__Group__2 : rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 ;
    public final void rule__CellSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1046:1: ( rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1047:2: rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__22142);
            rule__CellSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__22145);
            rule__CellSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__2"


    // $ANTLR start "rule__CellSpecification__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1054:1: rule__CellSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__CellSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1058:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1059:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1059:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1060:1: '{'
            {
             before(grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__CellSpecification__Group__2__Impl2173); 
             after(grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__2__Impl"


    // $ANTLR start "rule__CellSpecification__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1073:1: rule__CellSpecification__Group__3 : rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 ;
    public final void rule__CellSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1077:1: ( rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1078:2: rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__32204);
            rule__CellSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__32207);
            rule__CellSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__3"


    // $ANTLR start "rule__CellSpecification__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1085:1: rule__CellSpecification__Group__3__Impl : ( ( rule__CellSpecification__MembersAssignment_3 )* ) ;
    public final void rule__CellSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1089:1: ( ( ( rule__CellSpecification__MembersAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1090:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1090:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1091:1: ( rule__CellSpecification__MembersAssignment_3 )*
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1092:1: ( rule__CellSpecification__MembersAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19||LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1092:2: rule__CellSpecification__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl2234);
            	    rule__CellSpecification__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCellSpecificationAccess().getMembersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__3__Impl"


    // $ANTLR start "rule__CellSpecification__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1102:1: rule__CellSpecification__Group__4 : rule__CellSpecification__Group__4__Impl ;
    public final void rule__CellSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1106:1: ( rule__CellSpecification__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1107:2: rule__CellSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__42265);
            rule__CellSpecification__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__4"


    // $ANTLR start "rule__CellSpecification__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1113:1: rule__CellSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__CellSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1117:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1118:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1118:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1119:1: '}'
            {
             before(grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__CellSpecification__Group__4__Impl2293); 
             after(grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__Group__4__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1142:1: rule__CellDisplaySpec__Group__0 : rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 ;
    public final void rule__CellDisplaySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1146:1: ( rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1147:2: rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__02334);
            rule__CellDisplaySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__02337);
            rule__CellDisplaySpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__0"


    // $ANTLR start "rule__CellDisplaySpec__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1154:1: rule__CellDisplaySpec__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplaySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1158:1: ( ( 'display' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1159:1: ( 'display' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1159:1: ( 'display' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1160:1: 'display'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__CellDisplaySpec__Group__0__Impl2365); 
             after(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__0__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1173:1: rule__CellDisplaySpec__Group__1 : rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 ;
    public final void rule__CellDisplaySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1177:1: ( rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1178:2: rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__12396);
            rule__CellDisplaySpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__12399);
            rule__CellDisplaySpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__1"


    // $ANTLR start "rule__CellDisplaySpec__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1185:1: rule__CellDisplaySpec__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplaySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1189:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1190:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1190:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1191:1: '{'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__CellDisplaySpec__Group__1__Impl2427); 
             after(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__1__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1204:1: rule__CellDisplaySpec__Group__2 : rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 ;
    public final void rule__CellDisplaySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1208:1: ( rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1209:2: rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__22458);
            rule__CellDisplaySpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__22461);
            rule__CellDisplaySpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__2"


    // $ANTLR start "rule__CellDisplaySpec__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1216:1: rule__CellDisplaySpec__Group__2__Impl : ( 'as' ) ;
    public final void rule__CellDisplaySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1220:1: ( ( 'as' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1221:1: ( 'as' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1221:1: ( 'as' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1222:1: 'as'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__CellDisplaySpec__Group__2__Impl2489); 
             after(grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__2__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1235:1: rule__CellDisplaySpec__Group__3 : rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 ;
    public final void rule__CellDisplaySpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1239:1: ( rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1240:2: rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__32520);
            rule__CellDisplaySpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__32523);
            rule__CellDisplaySpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__3"


    // $ANTLR start "rule__CellDisplaySpec__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1247:1: rule__CellDisplaySpec__Group__3__Impl : ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) ;
    public final void rule__CellDisplaySpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1251:1: ( ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1252:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1252:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1253:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1254:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1254:2: rule__CellDisplaySpec__Display_typeAssignment_3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl2550);
            rule__CellDisplaySpec__Display_typeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__3__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1264:1: rule__CellDisplaySpec__Group__4 : rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 ;
    public final void rule__CellDisplaySpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1268:1: ( rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1269:2: rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__42580);
            rule__CellDisplaySpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__42583);
            rule__CellDisplaySpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__4"


    // $ANTLR start "rule__CellDisplaySpec__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1276:1: rule__CellDisplaySpec__Group__4__Impl : ( 'text' ) ;
    public final void rule__CellDisplaySpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1280:1: ( ( 'text' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1281:1: ( 'text' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1281:1: ( 'text' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1282:1: 'text'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__CellDisplaySpec__Group__4__Impl2611); 
             after(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__4__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1295:1: rule__CellDisplaySpec__Group__5 : rule__CellDisplaySpec__Group__5__Impl rule__CellDisplaySpec__Group__6 ;
    public final void rule__CellDisplaySpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1299:1: ( rule__CellDisplaySpec__Group__5__Impl rule__CellDisplaySpec__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1300:2: rule__CellDisplaySpec__Group__5__Impl rule__CellDisplaySpec__Group__6
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__52642);
            rule__CellDisplaySpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__6_in_rule__CellDisplaySpec__Group__52645);
            rule__CellDisplaySpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__5"


    // $ANTLR start "rule__CellDisplaySpec__Group__5__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1307:1: rule__CellDisplaySpec__Group__5__Impl : ( ( rule__CellDisplaySpec__TextAssignment_5 ) ) ;
    public final void rule__CellDisplaySpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1311:1: ( ( ( rule__CellDisplaySpec__TextAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1312:1: ( ( rule__CellDisplaySpec__TextAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1312:1: ( ( rule__CellDisplaySpec__TextAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1313:1: ( rule__CellDisplaySpec__TextAssignment_5 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1314:1: ( rule__CellDisplaySpec__TextAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1314:2: rule__CellDisplaySpec__TextAssignment_5
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__TextAssignment_5_in_rule__CellDisplaySpec__Group__5__Impl2672);
            rule__CellDisplaySpec__TextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__5__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1324:1: rule__CellDisplaySpec__Group__6 : rule__CellDisplaySpec__Group__6__Impl ;
    public final void rule__CellDisplaySpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1328:1: ( rule__CellDisplaySpec__Group__6__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1329:2: rule__CellDisplaySpec__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__6__Impl_in_rule__CellDisplaySpec__Group__62702);
            rule__CellDisplaySpec__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__6"


    // $ANTLR start "rule__CellDisplaySpec__Group__6__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1335:1: rule__CellDisplaySpec__Group__6__Impl : ( '}' ) ;
    public final void rule__CellDisplaySpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1339:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1340:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1340:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1341:1: '}'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__CellDisplaySpec__Group__6__Impl2730); 
             after(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group__6__Impl"


    // $ANTLR start "rule__CellVarSpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1368:1: rule__CellVarSpec__Group__0 : rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 ;
    public final void rule__CellVarSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1372:1: ( rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1373:2: rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__02775);
            rule__CellVarSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__02778);
            rule__CellVarSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__Group__0"


    // $ANTLR start "rule__CellVarSpec__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1380:1: rule__CellVarSpec__Group__0__Impl : ( 'var' ) ;
    public final void rule__CellVarSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1384:1: ( ( 'var' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1385:1: ( 'var' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1385:1: ( 'var' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1386:1: 'var'
            {
             before(grammarAccess.getCellVarSpecAccess().getVarKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__CellVarSpec__Group__0__Impl2806); 
             after(grammarAccess.getCellVarSpecAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__Group__0__Impl"


    // $ANTLR start "rule__CellVarSpec__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1399:1: rule__CellVarSpec__Group__1 : rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 ;
    public final void rule__CellVarSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1403:1: ( rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1404:2: rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__12837);
            rule__CellVarSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__12840);
            rule__CellVarSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__Group__1"


    // $ANTLR start "rule__CellVarSpec__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1411:1: rule__CellVarSpec__Group__1__Impl : ( ( rule__CellVarSpec__TypeAssignment_1 ) ) ;
    public final void rule__CellVarSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1415:1: ( ( ( rule__CellVarSpec__TypeAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1416:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1416:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1417:1: ( rule__CellVarSpec__TypeAssignment_1 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1418:1: ( rule__CellVarSpec__TypeAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1418:2: rule__CellVarSpec__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl2867);
            rule__CellVarSpec__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellVarSpecAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__Group__1__Impl"


    // $ANTLR start "rule__CellVarSpec__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1428:1: rule__CellVarSpec__Group__2 : rule__CellVarSpec__Group__2__Impl ;
    public final void rule__CellVarSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1432:1: ( rule__CellVarSpec__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1433:2: rule__CellVarSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__22897);
            rule__CellVarSpec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__Group__2"


    // $ANTLR start "rule__CellVarSpec__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1439:1: rule__CellVarSpec__Group__2__Impl : ( ( rule__CellVarSpec__NameAssignment_2 ) ) ;
    public final void rule__CellVarSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1443:1: ( ( ( rule__CellVarSpec__NameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1444:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1444:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1445:1: ( rule__CellVarSpec__NameAssignment_2 )
            {
             before(grammarAccess.getCellVarSpecAccess().getNameAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1446:1: ( rule__CellVarSpec__NameAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1446:2: rule__CellVarSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl2924);
            rule__CellVarSpec__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellVarSpecAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__Group__2__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1462:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1466:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1467:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__02960);
            rule__FieldSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__02963);
            rule__FieldSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__0"


    // $ANTLR start "rule__FieldSpecification__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1474:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1478:1: ( ( 'field' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1479:1: ( 'field' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1479:1: ( 'field' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1480:1: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__FieldSpecification__Group__0__Impl2991); 
             after(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__0__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1493:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1497:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1498:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__13022);
            rule__FieldSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__13025);
            rule__FieldSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__1"


    // $ANTLR start "rule__FieldSpecification__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1505:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1509:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1510:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1510:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1511:1: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1512:1: ( rule__FieldSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1512:2: rule__FieldSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl3052);
            rule__FieldSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__1__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1522:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1526:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1527:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__23082);
            rule__FieldSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__23085);
            rule__FieldSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__2"


    // $ANTLR start "rule__FieldSpecification__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1534:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1538:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1539:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1539:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1540:1: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__FieldSpecification__Group__2__Impl3113); 
             after(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__2__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1553:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1557:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1558:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__33144);
            rule__FieldSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__33147);
            rule__FieldSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__3"


    // $ANTLR start "rule__FieldSpecification__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1565:1: rule__FieldSpecification__Group__3__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1569:1: ( ( 'width' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1570:1: ( 'width' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1570:1: ( 'width' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1571:1: 'width'
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__FieldSpecification__Group__3__Impl3175); 
             after(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__3__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1584:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1588:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1589:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__43206);
            rule__FieldSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__43209);
            rule__FieldSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__4"


    // $ANTLR start "rule__FieldSpecification__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1596:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1600:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1601:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1601:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1602:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__FieldSpecification__Group__4__Impl3237); 
             after(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__4__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1615:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1619:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1620:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__53268);
            rule__FieldSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__53271);
            rule__FieldSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__5"


    // $ANTLR start "rule__FieldSpecification__Group__5__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1627:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__WidthAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1631:1: ( ( ( rule__FieldSpecification__WidthAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1632:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1632:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1633:1: ( rule__FieldSpecification__WidthAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1634:1: ( rule__FieldSpecification__WidthAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1634:2: rule__FieldSpecification__WidthAssignment_5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl3298);
            rule__FieldSpecification__WidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__5__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1644:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1648:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1649:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__63328);
            rule__FieldSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__63331);
            rule__FieldSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__6"


    // $ANTLR start "rule__FieldSpecification__Group__6__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1656:1: rule__FieldSpecification__Group__6__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1660:1: ( ( 'height' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1661:1: ( 'height' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1661:1: ( 'height' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1662:1: 'height'
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__FieldSpecification__Group__6__Impl3359); 
             after(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__6__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__7"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1675:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1679:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1680:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__73390);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__73393);
            rule__FieldSpecification__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__7"


    // $ANTLR start "rule__FieldSpecification__Group__7__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1687:1: rule__FieldSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1691:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1692:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1692:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1693:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__FieldSpecification__Group__7__Impl3421); 
             after(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__7__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__8"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1706:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1710:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1711:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__83452);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__83455);
            rule__FieldSpecification__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__8"


    // $ANTLR start "rule__FieldSpecification__Group__8__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1718:1: rule__FieldSpecification__Group__8__Impl : ( ( rule__FieldSpecification__HeightAssignment_8 ) ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1722:1: ( ( ( rule__FieldSpecification__HeightAssignment_8 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1723:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1723:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1724:1: ( rule__FieldSpecification__HeightAssignment_8 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_8()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1725:1: ( rule__FieldSpecification__HeightAssignment_8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1725:2: rule__FieldSpecification__HeightAssignment_8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl3482);
            rule__FieldSpecification__HeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__8__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__9"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1735:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1739:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1740:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__93512);
            rule__FieldSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__93515);
            rule__FieldSpecification__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__9"


    // $ANTLR start "rule__FieldSpecification__Group__9__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1747:1: rule__FieldSpecification__Group__9__Impl : ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1751:1: ( ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1752:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1752:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1753:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationAssignment_9()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1754:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1754:2: rule__FieldSpecification__Field_initialisationAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl3542);
                    rule__FieldSpecification__Field_initialisationAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSpecificationAccess().getField_initialisationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__9__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__10"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1764:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1768:1: ( rule__FieldSpecification__Group__10__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1769:2: rule__FieldSpecification__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__103573);
            rule__FieldSpecification__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__10"


    // $ANTLR start "rule__FieldSpecification__Group__10__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1775:1: rule__FieldSpecification__Group__10__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1779:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1780:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1780:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1781:1: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__FieldSpecification__Group__10__Impl3601); 
             after(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__10__Impl"


    // $ANTLR start "rule__AllowRestartMenu__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1816:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1820:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1821:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__03654);
            rule__AllowRestartMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__03657);
            rule__AllowRestartMenu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__0"


    // $ANTLR start "rule__AllowRestartMenu__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1828:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allow_restart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1832:1: ( ( 'allow_restart' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1833:1: ( 'allow_restart' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1833:1: ( 'allow_restart' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1834:1: 'allow_restart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__AllowRestartMenu__Group__0__Impl3685); 
             after(grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__0__Impl"


    // $ANTLR start "rule__AllowRestartMenu__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1847:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1851:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1852:2: rule__AllowRestartMenu__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__13716);
            rule__AllowRestartMenu__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__1"


    // $ANTLR start "rule__AllowRestartMenu__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1858:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1862:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1863:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1863:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1864:1: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1865:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1867:1: 
            {
            }

             after(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowRestartMenu__Group__1__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1881:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1885:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1886:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__03778);
            rule__StartFieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__03781);
            rule__StartFieldDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__0"


    // $ANTLR start "rule__StartFieldDeclaration__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1893:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1897:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1898:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1898:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1899:1: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__StartFieldDeclaration__Group__0__Impl3809); 
             after(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1912:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1916:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1917:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__13840);
            rule__StartFieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__13843);
            rule__StartFieldDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__1"


    // $ANTLR start "rule__StartFieldDeclaration__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1924:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1928:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1929:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1929:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1930:1: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__StartFieldDeclaration__Group__1__Impl3871); 
             after(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StartFieldDeclaration__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1943:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1947:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1948:2: rule__StartFieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__23902);
            rule__StartFieldDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__2"


    // $ANTLR start "rule__StartFieldDeclaration__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1954:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__Field_nameAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1958:1: ( ( ( rule__StartFieldDeclaration__Field_nameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1959:1: ( ( rule__StartFieldDeclaration__Field_nameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1959:1: ( ( rule__StartFieldDeclaration__Field_nameAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1960:1: ( rule__StartFieldDeclaration__Field_nameAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getField_nameAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1961:1: ( rule__StartFieldDeclaration__Field_nameAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1961:2: rule__StartFieldDeclaration__Field_nameAssignment_2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Field_nameAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl3929);
            rule__StartFieldDeclaration__Field_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartFieldDeclarationAccess().getField_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FieldInitialisations__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1977:1: rule__FieldInitialisations__Group__0 : rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 ;
    public final void rule__FieldInitialisations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1981:1: ( rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1982:2: rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__03965);
            rule__FieldInitialisations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__03968);
            rule__FieldInitialisations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__0"


    // $ANTLR start "rule__FieldInitialisations__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1989:1: rule__FieldInitialisations__Group__0__Impl : ( 'init' ) ;
    public final void rule__FieldInitialisations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1993:1: ( ( 'init' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1994:1: ( 'init' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1994:1: ( 'init' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1995:1: 'init'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__FieldInitialisations__Group__0__Impl3996); 
             after(grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__0__Impl"


    // $ANTLR start "rule__FieldInitialisations__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2008:1: rule__FieldInitialisations__Group__1 : rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 ;
    public final void rule__FieldInitialisations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2012:1: ( rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2013:2: rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__14027);
            rule__FieldInitialisations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__14030);
            rule__FieldInitialisations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__1"


    // $ANTLR start "rule__FieldInitialisations__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2020:1: rule__FieldInitialisations__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldInitialisations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2024:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2025:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2025:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2026:1: '{'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__FieldInitialisations__Group__1__Impl4058); 
             after(grammarAccess.getFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__1__Impl"


    // $ANTLR start "rule__FieldInitialisations__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2039:1: rule__FieldInitialisations__Group__2 : rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 ;
    public final void rule__FieldInitialisations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2043:1: ( rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2044:2: rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__24089);
            rule__FieldInitialisations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__24092);
            rule__FieldInitialisations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__2"


    // $ANTLR start "rule__FieldInitialisations__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2051:1: rule__FieldInitialisations__Group__2__Impl : ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) ;
    public final void rule__FieldInitialisations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2055:1: ( ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2056:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2056:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2057:1: ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2057:1: ( ( rule__FieldInitialisations__Group_2__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2058:1: ( rule__FieldInitialisations__Group_2__0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2059:1: ( rule__FieldInitialisations__Group_2__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2059:2: rule__FieldInitialisations__Group_2__0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4121);
            rule__FieldInitialisations__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2062:1: ( ( rule__FieldInitialisations__Group_2__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2063:1: ( rule__FieldInitialisations__Group_2__0 )*
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2064:1: ( rule__FieldInitialisations__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31||(LA12_0>=33 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2064:2: rule__FieldInitialisations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4133);
            	    rule__FieldInitialisations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__2__Impl"


    // $ANTLR start "rule__FieldInitialisations__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2075:1: rule__FieldInitialisations__Group__3 : rule__FieldInitialisations__Group__3__Impl ;
    public final void rule__FieldInitialisations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2079:1: ( rule__FieldInitialisations__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2080:2: rule__FieldInitialisations__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__34166);
            rule__FieldInitialisations__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__3"


    // $ANTLR start "rule__FieldInitialisations__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2086:1: rule__FieldInitialisations__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldInitialisations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2090:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2091:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2091:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2092:1: '}'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__FieldInitialisations__Group__3__Impl4194); 
             after(grammarAccess.getFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group__3__Impl"


    // $ANTLR start "rule__FieldInitialisations__Group_2__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2113:1: rule__FieldInitialisations__Group_2__0 : rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 ;
    public final void rule__FieldInitialisations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2117:1: ( rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2118:2: rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__04233);
            rule__FieldInitialisations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__04236);
            rule__FieldInitialisations__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group_2__0"


    // $ANTLR start "rule__FieldInitialisations__Group_2__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2125:1: rule__FieldInitialisations__Group_2__0__Impl : ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) ;
    public final void rule__FieldInitialisations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2129:1: ( ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2130:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2130:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2131:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2132:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2132:2: rule__FieldInitialisations__InitialisationsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl4263);
            rule__FieldInitialisations__InitialisationsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group_2__0__Impl"


    // $ANTLR start "rule__FieldInitialisations__Group_2__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2142:1: rule__FieldInitialisations__Group_2__1 : rule__FieldInitialisations__Group_2__1__Impl ;
    public final void rule__FieldInitialisations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2146:1: ( rule__FieldInitialisations__Group_2__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2147:2: rule__FieldInitialisations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__14293);
            rule__FieldInitialisations__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group_2__1"


    // $ANTLR start "rule__FieldInitialisations__Group_2__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2153:1: rule__FieldInitialisations__Group_2__1__Impl : ( ';' ) ;
    public final void rule__FieldInitialisations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2157:1: ( ( ';' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2158:1: ( ';' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2158:1: ( ';' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2159:1: ';'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 
            match(input,30,FOLLOW_30_in_rule__FieldInitialisations__Group_2__1__Impl4321); 
             after(grammarAccess.getFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__Group_2__1__Impl"


    // $ANTLR start "rule__DefaultInitialisation__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2176:1: rule__DefaultInitialisation__Group__0 : rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 ;
    public final void rule__DefaultInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2180:1: ( rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2181:2: rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__04356);
            rule__DefaultInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__04359);
            rule__DefaultInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__0"


    // $ANTLR start "rule__DefaultInitialisation__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2188:1: rule__DefaultInitialisation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2192:1: ( ( 'default' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2193:1: ( 'default' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2193:1: ( 'default' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2194:1: 'default'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__DefaultInitialisation__Group__0__Impl4387); 
             after(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__0__Impl"


    // $ANTLR start "rule__DefaultInitialisation__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2207:1: rule__DefaultInitialisation__Group__1 : rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 ;
    public final void rule__DefaultInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2211:1: ( rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2212:2: rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__14418);
            rule__DefaultInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__14421);
            rule__DefaultInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__1"


    // $ANTLR start "rule__DefaultInitialisation__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2219:1: rule__DefaultInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2223:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2224:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2224:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2225:1: ':'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__DefaultInitialisation__Group__1__Impl4449); 
             after(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__1__Impl"


    // $ANTLR start "rule__DefaultInitialisation__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2238:1: rule__DefaultInitialisation__Group__2 : rule__DefaultInitialisation__Group__2__Impl ;
    public final void rule__DefaultInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2242:1: ( rule__DefaultInitialisation__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2243:2: rule__DefaultInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__24480);
            rule__DefaultInitialisation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__2"


    // $ANTLR start "rule__DefaultInitialisation__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2249:1: rule__DefaultInitialisation__Group__2__Impl : ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) ;
    public final void rule__DefaultInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2253:1: ( ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2254:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2254:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2255:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2256:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2256:2: rule__DefaultInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl4507);
            rule__DefaultInitialisation__CellAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInitialisationAccess().getCellAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__Group__2__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2272:1: rule__RandomInitialisation__Group__0 : rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 ;
    public final void rule__RandomInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2276:1: ( rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2277:2: rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__04543);
            rule__RandomInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__04546);
            rule__RandomInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__0"


    // $ANTLR start "rule__RandomInitialisation__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2284:1: rule__RandomInitialisation__Group__0__Impl : ( 'random' ) ;
    public final void rule__RandomInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2288:1: ( ( 'random' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2289:1: ( 'random' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2289:1: ( 'random' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2290:1: 'random'
            {
             before(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__RandomInitialisation__Group__0__Impl4574); 
             after(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__0__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2303:1: rule__RandomInitialisation__Group__1 : rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 ;
    public final void rule__RandomInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2307:1: ( rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2308:2: rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__14605);
            rule__RandomInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__14608);
            rule__RandomInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__1"


    // $ANTLR start "rule__RandomInitialisation__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2315:1: rule__RandomInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__RandomInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2319:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2320:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2320:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2321:1: ':'
            {
             before(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__RandomInitialisation__Group__1__Impl4636); 
             after(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__1__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2334:1: rule__RandomInitialisation__Group__2 : rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 ;
    public final void rule__RandomInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2338:1: ( rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2339:2: rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__24667);
            rule__RandomInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__24670);
            rule__RandomInitialisation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__2"


    // $ANTLR start "rule__RandomInitialisation__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2346:1: rule__RandomInitialisation__Group__2__Impl : ( ( rule__RandomInitialisation__CellAssignment_2 ) ) ;
    public final void rule__RandomInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2350:1: ( ( ( rule__RandomInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2351:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2351:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2352:1: ( rule__RandomInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2353:1: ( rule__RandomInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2353:2: rule__RandomInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl4697);
            rule__RandomInitialisation__CellAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRandomInitialisationAccess().getCellAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__2__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2363:1: rule__RandomInitialisation__Group__3 : rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 ;
    public final void rule__RandomInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2367:1: ( rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2368:2: rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__34727);
            rule__RandomInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__34730);
            rule__RandomInitialisation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__3"


    // $ANTLR start "rule__RandomInitialisation__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2375:1: rule__RandomInitialisation__Group__3__Impl : ( '=' ) ;
    public final void rule__RandomInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2379:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2380:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2380:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2381:1: '='
            {
             before(grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__RandomInitialisation__Group__3__Impl4758); 
             after(grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__3__Impl"


    // $ANTLR start "rule__RandomInitialisation__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2394:1: rule__RandomInitialisation__Group__4 : rule__RandomInitialisation__Group__4__Impl ;
    public final void rule__RandomInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2398:1: ( rule__RandomInitialisation__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2399:2: rule__RandomInitialisation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__44789);
            rule__RandomInitialisation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__4"


    // $ANTLR start "rule__RandomInitialisation__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2405:1: rule__RandomInitialisation__Group__4__Impl : ( ( rule__RandomInitialisation__CountAssignment_4 ) ) ;
    public final void rule__RandomInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2409:1: ( ( ( rule__RandomInitialisation__CountAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2410:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2410:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2411:1: ( rule__RandomInitialisation__CountAssignment_4 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2412:1: ( rule__RandomInitialisation__CountAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2412:2: rule__RandomInitialisation__CountAssignment_4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl4816);
            rule__RandomInitialisation__CountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__Group__4__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2432:1: rule__ContextInitialisation__Group__0 : rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 ;
    public final void rule__ContextInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2436:1: ( rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2437:2: rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__04856);
            rule__ContextInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__04859);
            rule__ContextInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__0"


    // $ANTLR start "rule__ContextInitialisation__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2444:1: rule__ContextInitialisation__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2448:1: ( ( 'context' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2449:1: ( 'context' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2449:1: ( 'context' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2450:1: 'context'
            {
             before(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ContextInitialisation__Group__0__Impl4887); 
             after(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__0__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2463:1: rule__ContextInitialisation__Group__1 : rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 ;
    public final void rule__ContextInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2467:1: ( rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2468:2: rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__14918);
            rule__ContextInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__14921);
            rule__ContextInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__1"


    // $ANTLR start "rule__ContextInitialisation__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2475:1: rule__ContextInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__ContextInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2479:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2480:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2480:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2481:1: ':'
            {
             before(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__ContextInitialisation__Group__1__Impl4949); 
             after(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__1__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2494:1: rule__ContextInitialisation__Group__2 : rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 ;
    public final void rule__ContextInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2498:1: ( rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2499:2: rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__24980);
            rule__ContextInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__24983);
            rule__ContextInitialisation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__2"


    // $ANTLR start "rule__ContextInitialisation__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2506:1: rule__ContextInitialisation__Group__2__Impl : ( ( rule__ContextInitialisation__CellAssignment_2 ) ) ;
    public final void rule__ContextInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2510:1: ( ( ( rule__ContextInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2511:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2511:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2512:1: ( rule__ContextInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2513:1: ( rule__ContextInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2513:2: rule__ContextInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl5010);
            rule__ContextInitialisation__CellAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextInitialisationAccess().getCellAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__2__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2523:1: rule__ContextInitialisation__Group__3 : rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 ;
    public final void rule__ContextInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2527:1: ( rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2528:2: rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__35040);
            rule__ContextInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__35043);
            rule__ContextInitialisation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__3"


    // $ANTLR start "rule__ContextInitialisation__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2535:1: rule__ContextInitialisation__Group__3__Impl : ( 'check' ) ;
    public final void rule__ContextInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2539:1: ( ( 'check' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2540:1: ( 'check' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2540:1: ( 'check' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2541:1: 'check'
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__ContextInitialisation__Group__3__Impl5071); 
             after(grammarAccess.getContextInitialisationAccess().getCheckKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__3__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2554:1: rule__ContextInitialisation__Group__4 : rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 ;
    public final void rule__ContextInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2558:1: ( rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2559:2: rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__45102);
            rule__ContextInitialisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__45105);
            rule__ContextInitialisation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__4"


    // $ANTLR start "rule__ContextInitialisation__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2566:1: rule__ContextInitialisation__Group__4__Impl : ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) ;
    public final void rule__ContextInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2570:1: ( ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2571:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2571:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2572:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2573:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2573:2: rule__ContextInitialisation__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl5132);
            rule__ContextInitialisation__CheckAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContextInitialisationAccess().getCheckAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__4__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2583:1: rule__ContextInitialisation__Group__5 : rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 ;
    public final void rule__ContextInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2587:1: ( rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2588:2: rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__55162);
            rule__ContextInitialisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__55165);
            rule__ContextInitialisation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__5"


    // $ANTLR start "rule__ContextInitialisation__Group__5__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2595:1: rule__ContextInitialisation__Group__5__Impl : ( 'value' ) ;
    public final void rule__ContextInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2599:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2600:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2600:1: ( 'value' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2601:1: 'value'
            {
             before(grammarAccess.getContextInitialisationAccess().getValueKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__ContextInitialisation__Group__5__Impl5193); 
             after(grammarAccess.getContextInitialisationAccess().getValueKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__5__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2614:1: rule__ContextInitialisation__Group__6 : rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 ;
    public final void rule__ContextInitialisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2618:1: ( rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2619:2: rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__65224);
            rule__ContextInitialisation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__65227);
            rule__ContextInitialisation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__6"


    // $ANTLR start "rule__ContextInitialisation__Group__6__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2626:1: rule__ContextInitialisation__Group__6__Impl : ( '=' ) ;
    public final void rule__ContextInitialisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2630:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2631:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2631:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2632:1: '='
            {
             before(grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__ContextInitialisation__Group__6__Impl5255); 
             after(grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__6__Impl"


    // $ANTLR start "rule__ContextInitialisation__Group__7"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2645:1: rule__ContextInitialisation__Group__7 : rule__ContextInitialisation__Group__7__Impl ;
    public final void rule__ContextInitialisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2649:1: ( rule__ContextInitialisation__Group__7__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2650:2: rule__ContextInitialisation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__75286);
            rule__ContextInitialisation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__7"


    // $ANTLR start "rule__ContextInitialisation__Group__7__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2656:1: rule__ContextInitialisation__Group__7__Impl : ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) ;
    public final void rule__ContextInitialisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2660:1: ( ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2661:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2661:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2662:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            {
             before(grammarAccess.getContextInitialisationAccess().getExpAssignment_7()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2663:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2663:2: rule__ContextInitialisation__ExpAssignment_7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl5313);
            rule__ContextInitialisation__ExpAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getContextInitialisationAccess().getExpAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__Group__7__Impl"


    // $ANTLR start "rule__ContextExpression__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2689:1: rule__ContextExpression__Group__0 : rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 ;
    public final void rule__ContextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2693:1: ( rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2694:2: rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__05359);
            rule__ContextExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__05362);
            rule__ContextExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group__0"


    // $ANTLR start "rule__ContextExpression__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2701:1: rule__ContextExpression__Group__0__Impl : ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) ;
    public final void rule__ContextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2705:1: ( ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2706:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2706:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2707:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2708:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2708:2: rule__ContextExpression__Sub_expAssignment_0
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl5389);
            rule__ContextExpression__Sub_expAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group__0__Impl"


    // $ANTLR start "rule__ContextExpression__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2718:1: rule__ContextExpression__Group__1 : rule__ContextExpression__Group__1__Impl ;
    public final void rule__ContextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2722:1: ( rule__ContextExpression__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2723:2: rule__ContextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__15419);
            rule__ContextExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group__1"


    // $ANTLR start "rule__ContextExpression__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2729:1: rule__ContextExpression__Group__1__Impl : ( ( rule__ContextExpression__Group_1__0 )* ) ;
    public final void rule__ContextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2733:1: ( ( ( rule__ContextExpression__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2734:1: ( ( rule__ContextExpression__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2734:1: ( ( rule__ContextExpression__Group_1__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2735:1: ( rule__ContextExpression__Group_1__0 )*
            {
             before(grammarAccess.getContextExpressionAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2736:1: ( rule__ContextExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2736:2: rule__ContextExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl5446);
            	    rule__ContextExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getContextExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group__1__Impl"


    // $ANTLR start "rule__ContextExpression__Group_1__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2750:1: rule__ContextExpression__Group_1__0 : rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 ;
    public final void rule__ContextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2754:1: ( rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2755:2: rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__05481);
            rule__ContextExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__05484);
            rule__ContextExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group_1__0"


    // $ANTLR start "rule__ContextExpression__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2762:1: rule__ContextExpression__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ContextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2766:1: ( ( '.' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2767:1: ( '.' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2767:1: ( '.' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2768:1: '.'
            {
             before(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__ContextExpression__Group_1__0__Impl5512); 
             after(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ContextExpression__Group_1__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2781:1: rule__ContextExpression__Group_1__1 : rule__ContextExpression__Group_1__1__Impl ;
    public final void rule__ContextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2785:1: ( rule__ContextExpression__Group_1__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2786:2: rule__ContextExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__15543);
            rule__ContextExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group_1__1"


    // $ANTLR start "rule__ContextExpression__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2792:1: rule__ContextExpression__Group_1__1__Impl : ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) ;
    public final void rule__ContextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2796:1: ( ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2797:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2797:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2798:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_1_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2799:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2799:2: rule__ContextExpression__Sub_expAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl5570);
            rule__ContextExpression__Sub_expAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContextExpressionAccess().getSub_expAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Group_1__1__Impl"


    // $ANTLR start "rule__FilterExpression__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2813:1: rule__FilterExpression__Group__0 : rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 ;
    public final void rule__FilterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2817:1: ( rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2818:2: rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__05604);
            rule__FilterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__05607);
            rule__FilterExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__0"


    // $ANTLR start "rule__FilterExpression__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2825:1: rule__FilterExpression__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2829:1: ( ( 'filter' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2830:1: ( 'filter' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2830:1: ( 'filter' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2831:1: 'filter'
            {
             before(grammarAccess.getFilterExpressionAccess().getFilterKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__FilterExpression__Group__0__Impl5635); 
             after(grammarAccess.getFilterExpressionAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__0__Impl"


    // $ANTLR start "rule__FilterExpression__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2844:1: rule__FilterExpression__Group__1 : rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 ;
    public final void rule__FilterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2848:1: ( rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2849:2: rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__15666);
            rule__FilterExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__15669);
            rule__FilterExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__1"


    // $ANTLR start "rule__FilterExpression__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2856:1: rule__FilterExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__FilterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2860:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2861:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2861:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2862:1: '('
            {
             before(grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__FilterExpression__Group__1__Impl5697); 
             after(grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__1__Impl"


    // $ANTLR start "rule__FilterExpression__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2875:1: rule__FilterExpression__Group__2 : rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 ;
    public final void rule__FilterExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2879:1: ( rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2880:2: rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__25728);
            rule__FilterExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__25731);
            rule__FilterExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__2"


    // $ANTLR start "rule__FilterExpression__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2887:1: rule__FilterExpression__Group__2__Impl : ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) ;
    public final void rule__FilterExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2891:1: ( ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2892:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2892:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2893:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2894:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2894:2: rule__FilterExpression__Cell_typeAssignment_2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl5758);
            rule__FilterExpression__Cell_typeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterExpressionAccess().getCell_typeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__2__Impl"


    // $ANTLR start "rule__FilterExpression__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2904:1: rule__FilterExpression__Group__3 : rule__FilterExpression__Group__3__Impl ;
    public final void rule__FilterExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2908:1: ( rule__FilterExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2909:2: rule__FilterExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__35788);
            rule__FilterExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__3"


    // $ANTLR start "rule__FilterExpression__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2915:1: rule__FilterExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2919:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2920:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2920:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2921:1: ')'
            {
             before(grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__FilterExpression__Group__3__Impl5816); 
             after(grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Group__3__Impl"


    // $ANTLR start "rule__CountExpression__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2942:1: rule__CountExpression__Group__0 : rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 ;
    public final void rule__CountExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2946:1: ( rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2947:2: rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__05855);
            rule__CountExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__05858);
            rule__CountExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__0"


    // $ANTLR start "rule__CountExpression__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2954:1: rule__CountExpression__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2958:1: ( ( 'count' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2959:1: ( 'count' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2959:1: ( 'count' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2960:1: 'count'
            {
             before(grammarAccess.getCountExpressionAccess().getCountKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__CountExpression__Group__0__Impl5886); 
             after(grammarAccess.getCountExpressionAccess().getCountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__0__Impl"


    // $ANTLR start "rule__CountExpression__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2973:1: rule__CountExpression__Group__1 : rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 ;
    public final void rule__CountExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2977:1: ( rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2978:2: rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__15917);
            rule__CountExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__15920);
            rule__CountExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__1"


    // $ANTLR start "rule__CountExpression__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2985:1: rule__CountExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__CountExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2989:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2990:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2990:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2991:1: '('
            {
             before(grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__CountExpression__Group__1__Impl5948); 
             after(grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__1__Impl"


    // $ANTLR start "rule__CountExpression__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3004:1: rule__CountExpression__Group__2 : rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 ;
    public final void rule__CountExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3008:1: ( rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3009:2: rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__25979);
            rule__CountExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__25982);
            rule__CountExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__2"


    // $ANTLR start "rule__CountExpression__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3016:1: rule__CountExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__CountExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3020:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3021:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3021:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3022:1: ')'
            {
             before(grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__CountExpression__Group__2__Impl6010); 
             after(grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__2__Impl"


    // $ANTLR start "rule__CountExpression__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3035:1: rule__CountExpression__Group__3 : rule__CountExpression__Group__3__Impl ;
    public final void rule__CountExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3039:1: ( rule__CountExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3040:2: rule__CountExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__36041);
            rule__CountExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__3"


    // $ANTLR start "rule__CountExpression__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3046:1: rule__CountExpression__Group__3__Impl : ( () ) ;
    public final void rule__CountExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3050:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3051:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3051:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3052:1: ()
            {
             before(grammarAccess.getCountExpressionAccess().getCountExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3053:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3055:1: 
            {
            }

             after(grammarAccess.getCountExpressionAccess().getCountExpressionAction_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__3__Impl"


    // $ANTLR start "rule__NotEmptyExpression__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3073:1: rule__NotEmptyExpression__Group__0 : rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 ;
    public final void rule__NotEmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3077:1: ( rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3078:2: rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__06107);
            rule__NotEmptyExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__06110);
            rule__NotEmptyExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__0"


    // $ANTLR start "rule__NotEmptyExpression__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3085:1: rule__NotEmptyExpression__Group__0__Impl : ( 'notEmpty' ) ;
    public final void rule__NotEmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3089:1: ( ( 'notEmpty' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3090:1: ( 'notEmpty' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3090:1: ( 'notEmpty' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3091:1: 'notEmpty'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__NotEmptyExpression__Group__0__Impl6138); 
             after(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__0__Impl"


    // $ANTLR start "rule__NotEmptyExpression__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3104:1: rule__NotEmptyExpression__Group__1 : rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 ;
    public final void rule__NotEmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3108:1: ( rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3109:2: rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__16169);
            rule__NotEmptyExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__16172);
            rule__NotEmptyExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__1"


    // $ANTLR start "rule__NotEmptyExpression__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3116:1: rule__NotEmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__NotEmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3120:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3121:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3121:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3122:1: '('
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__NotEmptyExpression__Group__1__Impl6200); 
             after(grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__1__Impl"


    // $ANTLR start "rule__NotEmptyExpression__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3135:1: rule__NotEmptyExpression__Group__2 : rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 ;
    public final void rule__NotEmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3139:1: ( rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3140:2: rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__26231);
            rule__NotEmptyExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__26234);
            rule__NotEmptyExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__2"


    // $ANTLR start "rule__NotEmptyExpression__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3147:1: rule__NotEmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__NotEmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3151:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3152:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3152:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3153:1: ')'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__NotEmptyExpression__Group__2__Impl6262); 
             after(grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__2__Impl"


    // $ANTLR start "rule__NotEmptyExpression__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3166:1: rule__NotEmptyExpression__Group__3 : rule__NotEmptyExpression__Group__3__Impl ;
    public final void rule__NotEmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3170:1: ( rule__NotEmptyExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3171:2: rule__NotEmptyExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__36293);
            rule__NotEmptyExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__3"


    // $ANTLR start "rule__NotEmptyExpression__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3177:1: rule__NotEmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__NotEmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3181:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3182:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3182:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3183:1: ()
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3184:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3186:1: 
            {
            }

             after(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyExpressionAction_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEmptyExpression__Group__3__Impl"


    // $ANTLR start "rule__GridGame__NameAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3205:1: rule__GridGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GridGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3209:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3210:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3210:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3211:1: RULE_ID
            {
             before(grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_16364); 
             after(grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__NameAssignment_1"


    // $ANTLR start "rule__GridGame__CellsAssignment_3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3220:1: rule__GridGame__CellsAssignment_3 : ( ruleCellSpecification ) ;
    public final void rule__GridGame__CellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3224:1: ( ( ruleCellSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3225:1: ( ruleCellSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3225:1: ( ruleCellSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3226:1: ruleCellSpecification
            {
             before(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_36395);
            ruleCellSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__CellsAssignment_3"


    // $ANTLR start "rule__GridGame__FieldsAssignment_4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3235:1: rule__GridGame__FieldsAssignment_4 : ( ruleFieldSpecification ) ;
    public final void rule__GridGame__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3239:1: ( ( ruleFieldSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3240:1: ( ruleFieldSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3240:1: ( ruleFieldSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3241:1: ruleFieldSpecification
            {
             before(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_46426);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__FieldsAssignment_4"


    // $ANTLR start "rule__GridGame__OptionsAssignment_5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3250:1: rule__GridGame__OptionsAssignment_5 : ( ruleOptionSpecification ) ;
    public final void rule__GridGame__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3254:1: ( ( ruleOptionSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3255:1: ( ruleOptionSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3255:1: ( ruleOptionSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3256:1: ruleOptionSpecification
            {
             before(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_56457);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__OptionsAssignment_5"


    // $ANTLR start "rule__CellSpecification__NameAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3265:1: rule__CellSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CellSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3269:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3270:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3270:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3271:1: RULE_ID
            {
             before(grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_16488); 
             after(grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__NameAssignment_1"


    // $ANTLR start "rule__CellSpecification__MembersAssignment_3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3280:1: rule__CellSpecification__MembersAssignment_3 : ( ruleCellMember ) ;
    public final void rule__CellSpecification__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3284:1: ( ( ruleCellMember ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3285:1: ( ruleCellMember )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3285:1: ( ruleCellMember )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3286:1: ruleCellMember
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_36519);
            ruleCellMember();

            state._fsp--;

             after(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSpecification__MembersAssignment_3"


    // $ANTLR start "rule__CellDisplaySpec__Display_typeAssignment_3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3295:1: rule__CellDisplaySpec__Display_typeAssignment_3 : ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) ;
    public final void rule__CellDisplaySpec__Display_typeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3299:1: ( ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3300:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3300:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3301:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAlternatives_3_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3302:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3302:2: rule__CellDisplaySpec__Display_typeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_36550);
            rule__CellDisplaySpec__Display_typeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Display_typeAssignment_3"


    // $ANTLR start "rule__CellDisplaySpec__TextAssignment_5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3311:1: rule__CellDisplaySpec__TextAssignment_5 : ( RULE_STRING ) ;
    public final void rule__CellDisplaySpec__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3315:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3316:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3316:1: ( RULE_STRING )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3317:1: RULE_STRING
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_56583); 
             after(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__TextAssignment_5"


    // $ANTLR start "rule__CellVarSpec__TypeAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3326:1: rule__CellVarSpec__TypeAssignment_1 : ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) ;
    public final void rule__CellVarSpec__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3330:1: ( ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3331:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3331:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3332:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAlternatives_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3333:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3333:2: rule__CellVarSpec__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_16614);
            rule__CellVarSpec__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCellVarSpecAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__TypeAssignment_1"


    // $ANTLR start "rule__CellVarSpec__NameAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3342:1: rule__CellVarSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CellVarSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3346:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3347:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3347:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3348:1: RULE_ID
            {
             before(grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_26647); 
             after(grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellVarSpec__NameAssignment_2"


    // $ANTLR start "rule__FieldSpecification__NameAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3357:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3361:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3362:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3362:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3363:1: RULE_ID
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_16678); 
             after(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__NameAssignment_1"


    // $ANTLR start "rule__FieldSpecification__WidthAssignment_5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3372:1: rule__FieldSpecification__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3376:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3377:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3377:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3378:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_56709); 
             after(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__WidthAssignment_5"


    // $ANTLR start "rule__FieldSpecification__HeightAssignment_8"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3387:1: rule__FieldSpecification__HeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3391:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3392:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3392:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3393:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_86740); 
             after(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__HeightAssignment_8"


    // $ANTLR start "rule__FieldSpecification__Field_initialisationAssignment_9"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3402:1: rule__FieldSpecification__Field_initialisationAssignment_9 : ( ruleFieldInitialisations ) ;
    public final void rule__FieldSpecification__Field_initialisationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3406:1: ( ( ruleFieldInitialisations ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3407:1: ( ruleFieldInitialisations )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3407:1: ( ruleFieldInitialisations )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3408:1: ruleFieldInitialisations
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_96771);
            ruleFieldInitialisations();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Field_initialisationAssignment_9"


    // $ANTLR start "rule__StartFieldDeclaration__Field_nameAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3417:1: rule__StartFieldDeclaration__Field_nameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StartFieldDeclaration__Field_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3421:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3422:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3422:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3423:1: RULE_ID
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getField_nameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__Field_nameAssignment_26802); 
             after(grammarAccess.getStartFieldDeclarationAccess().getField_nameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartFieldDeclaration__Field_nameAssignment_2"


    // $ANTLR start "rule__FieldInitialisations__InitialisationsAssignment_2_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3432:1: rule__FieldInitialisations__InitialisationsAssignment_2_0 : ( ruleFieldInitialisation ) ;
    public final void rule__FieldInitialisations__InitialisationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3436:1: ( ( ruleFieldInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3437:1: ( ruleFieldInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3437:1: ( ruleFieldInitialisation )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3438:1: ruleFieldInitialisation
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_06833);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisations__InitialisationsAssignment_2_0"


    // $ANTLR start "rule__DefaultInitialisation__CellAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3447:1: rule__DefaultInitialisation__CellAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefaultInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3451:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3452:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3452:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3453:1: RULE_ID
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_26864); 
             after(grammarAccess.getDefaultInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInitialisation__CellAssignment_2"


    // $ANTLR start "rule__RandomInitialisation__CellAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3462:1: rule__RandomInitialisation__CellAssignment_2 : ( RULE_ID ) ;
    public final void rule__RandomInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3466:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3467:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3467:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3468:1: RULE_ID
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_26895); 
             after(grammarAccess.getRandomInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__CellAssignment_2"


    // $ANTLR start "rule__RandomInitialisation__CountAssignment_4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3477:1: rule__RandomInitialisation__CountAssignment_4 : ( RULE_INT ) ;
    public final void rule__RandomInitialisation__CountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3481:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3482:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3482:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3483:1: RULE_INT
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_46926); 
             after(grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__CountAssignment_4"


    // $ANTLR start "rule__ContextInitialisation__CellAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3492:1: rule__ContextInitialisation__CellAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContextInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3496:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3497:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3497:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3498:1: RULE_ID
            {
             before(grammarAccess.getContextInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_26957); 
             after(grammarAccess.getContextInitialisationAccess().getCellIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__CellAssignment_2"


    // $ANTLR start "rule__ContextInitialisation__CheckAssignment_4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3507:1: rule__ContextInitialisation__CheckAssignment_4 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3511:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3512:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3512:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3513:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_46988);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__CheckAssignment_4"


    // $ANTLR start "rule__ContextInitialisation__ExpAssignment_7"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3522:1: rule__ContextInitialisation__ExpAssignment_7 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__ExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3526:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3527:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3527:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3528:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_77019);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextInitialisation__ExpAssignment_7"


    // $ANTLR start "rule__ContextExpression__Sub_expAssignment_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3537:1: rule__ContextExpression__Sub_expAssignment_0 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3541:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3542:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3542:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3543:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_07050);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Sub_expAssignment_0"


    // $ANTLR start "rule__ContextExpression__Sub_expAssignment_1_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3552:1: rule__ContextExpression__Sub_expAssignment_1_1 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3556:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3557:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3557:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3558:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_17081);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextExpression__Sub_expAssignment_1_1"


    // $ANTLR start "rule__FilterExpression__Cell_typeAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3567:1: rule__FilterExpression__Cell_typeAssignment_2 : ( RULE_ID ) ;
    public final void rule__FilterExpression__Cell_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3571:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3572:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3572:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3573:1: RULE_ID
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_27112); 
             after(grammarAccess.getFilterExpressionAccess().getCell_typeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExpression__Cell_typeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGridGame_in_entryRuleGridGame61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridGame68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__0_in_ruleGridGame94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_entryRuleCellSpecification121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellSpecification128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__0_in_ruleCellSpecification154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellMember_in_entryRuleCellMember181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellMember188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellMember__Alternatives_in_ruleCellMember214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_entryRuleCellDisplaySpec241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellDisplaySpec248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__0_in_ruleCellDisplaySpec274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellVarSpec308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__0_in_ruleCellVarSpec334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldSpecification368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__0_in_ruleFieldSpecification394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSpecification428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSpecification__Alternatives_in_ruleOptionSpecification454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowRestartMenu488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__0_in_ruleAllowRestartMenu514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartFieldDeclaration548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__0_in_ruleStartFieldDeclaration574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisations608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__0_in_ruleFieldInitialisations634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisation668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisation__Alternatives_in_ruleFieldInitialisation694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultInitialisation728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__0_in_ruleDefaultInitialisation754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRandomInitialisation788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__0_in_ruleRandomInitialisation814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextInitialisation848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__0_in_ruleContextInitialisation874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_entryRuleContextExpression901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__0_in_ruleContextExpression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterExpression1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__0_in_ruleFilterExpression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_entryRuleCountExpression1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountExpression1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__0_in_ruleCountExpression1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyExpression1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__0_in_ruleNotEmptyExpression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_rule__CellMember__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_rule__CellMember__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_01315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_01335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__01548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__01551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__GridGame__Group__0__Impl1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__11610 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__11613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__21670 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__21673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GridGame__Group__2__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__31732 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__31735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1764 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1776 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__41809 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__41812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1841 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1853 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__51886 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__51889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__OptionsAssignment_5_in_rule__GridGame__Group__5__Impl1916 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__61947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GridGame__Group__6__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__02020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__02023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellSpecification__Group__0__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__12082 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__12085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__22142 = new BitSet(new long[]{0x00000000004A0000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__22145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CellSpecification__Group__2__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__32204 = new BitSet(new long[]{0x00000000004A0000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__32207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl2234 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__42265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CellSpecification__Group__4__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__02334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__02337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellDisplaySpec__Group__0__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__12396 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CellDisplaySpec__Group__1__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__22458 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__22461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CellDisplaySpec__Group__2__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__32520 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__32523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__42580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__42583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CellDisplaySpec__Group__4__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__52642 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__6_in_rule__CellDisplaySpec__Group__52645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__TextAssignment_5_in_rule__CellDisplaySpec__Group__5__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__6__Impl_in_rule__CellDisplaySpec__Group__62702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CellDisplaySpec__Group__6__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__02775 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__02778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CellVarSpec__Group__0__Impl2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__12837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__12840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__22897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__02960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__02963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FieldSpecification__Group__0__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__13022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__13025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__23082 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__23085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldSpecification__Group__2__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__33144 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__33147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FieldSpecification__Group__3__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__43206 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__43209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FieldSpecification__Group__4__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__53268 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__53271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__63328 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__63331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FieldSpecification__Group__6__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__73390 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__73393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FieldSpecification__Group__7__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__83452 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__83455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__93512 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__93515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__103573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldSpecification__Group__10__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__03654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__03657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AllowRestartMenu__Group__0__Impl3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__03778 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StartFieldDeclaration__Group__0__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__13840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__13843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StartFieldDeclaration__Group__1__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__23902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Field_nameAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__03965 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__03968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FieldInitialisations__Group__0__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__14027 = new BitSet(new long[]{0x0000000680000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__14030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldInitialisations__Group__1__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__24089 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__24092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4121 = new BitSet(new long[]{0x0000000680000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4133 = new BitSet(new long[]{0x0000000680000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__34166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldInitialisations__Group__3__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__04233 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__04236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__14293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FieldInitialisations__Group_2__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__04356 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__04359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DefaultInitialisation__Group__0__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__14418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DefaultInitialisation__Group__1__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__24480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__04543 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__04546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RandomInitialisation__Group__0__Impl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__14605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__14608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RandomInitialisation__Group__1__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__24667 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__24670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__34727 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__34730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RandomInitialisation__Group__3__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__44789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__04856 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__04859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ContextInitialisation__Group__0__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__14918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__14921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ContextInitialisation__Group__1__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__24980 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__24983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__35040 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__35043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ContextInitialisation__Group__3__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__45102 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__45105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__55162 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__55165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ContextInitialisation__Group__5__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__65224 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__65227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContextInitialisation__Group__6__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__75286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__05359 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__05362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__15419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl5446 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__05481 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__05484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ContextExpression__Group_1__0__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__15543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__05604 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__05607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FilterExpression__Group__0__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__15666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__15669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FilterExpression__Group__1__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__25728 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__25731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__35788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FilterExpression__Group__3__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__05855 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__05858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__CountExpression__Group__0__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__15917 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__15920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CountExpression__Group__1__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__25979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__25982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__CountExpression__Group__2__Impl6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__36041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__06107 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__06110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NotEmptyExpression__Group__0__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__16169 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__16172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NotEmptyExpression__Group__1__Impl6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__26231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__26234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NotEmptyExpression__Group__2__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__36293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_16364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_36395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_46426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_56457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_16488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_36519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_36550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_56583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_16614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_26647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_16678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_56709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_86740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_96771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__Field_nameAssignment_26802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_06833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_26864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_26895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_46926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_26957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_46988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_77019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_07050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_17081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_27112 = new BitSet(new long[]{0x0000000000000002L});

}