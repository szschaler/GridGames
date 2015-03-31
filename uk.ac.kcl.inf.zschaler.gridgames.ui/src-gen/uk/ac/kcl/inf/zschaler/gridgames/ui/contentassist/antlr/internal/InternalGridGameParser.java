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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'label'", "'button'", "'int'", "'String'", "'mouse-left'", "'mouse-right'", "'game'", "'{'", "'}'", "'cell'", "'display'", "'as'", "'text'", "'var'", "'states'", "'start'", "'='", "'('", "')'", "','", "'transitions'", "'on'", "'goto'", "'field'", "'width'", "'height'", "'allow_restart'", "'init'", "';'", "'default'", "':'", "'random'", "'context'", "'check'", "'value'", "'.'", "'filter'", "'count'", "'notEmpty'"
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:174:1: entryRuleCellVarSpec : ruleCellVarSpec EOF ;
    public final void entryRuleCellVarSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:175:1: ( ruleCellVarSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:176:1: ruleCellVarSpec EOF
            {
             before(grammarAccess.getCellVarSpecRule()); 
            pushFollow(FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec303);
            ruleCellVarSpec();

            state._fsp--;

             after(grammarAccess.getCellVarSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellVarSpec310); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:183:1: ruleCellVarSpec : ( ( rule__CellVarSpec__Group__0 ) ) ;
    public final void ruleCellVarSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:187:2: ( ( ( rule__CellVarSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:188:1: ( ( rule__CellVarSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:188:1: ( ( rule__CellVarSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:189:1: ( rule__CellVarSpec__Group__0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:190:1: ( rule__CellVarSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:190:2: rule__CellVarSpec__Group__0
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__0_in_ruleCellVarSpec336);
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


    // $ANTLR start "entryRuleGlobalCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:202:1: entryRuleGlobalCellStateSpec : ruleGlobalCellStateSpec EOF ;
    public final void entryRuleGlobalCellStateSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:203:1: ( ruleGlobalCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:204:1: ruleGlobalCellStateSpec EOF
            {
             before(grammarAccess.getGlobalCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleGlobalCellStateSpec_in_entryRuleGlobalCellStateSpec363);
            ruleGlobalCellStateSpec();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalCellStateSpec370); 

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
    // $ANTLR end "entryRuleGlobalCellStateSpec"


    // $ANTLR start "ruleGlobalCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:211:1: ruleGlobalCellStateSpec : ( ( rule__GlobalCellStateSpec__Group__0 ) ) ;
    public final void ruleGlobalCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:215:2: ( ( ( rule__GlobalCellStateSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:216:1: ( ( rule__GlobalCellStateSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:216:1: ( ( rule__GlobalCellStateSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:217:1: ( rule__GlobalCellStateSpec__Group__0 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:218:1: ( rule__GlobalCellStateSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:218:2: rule__GlobalCellStateSpec__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__0_in_ruleGlobalCellStateSpec396);
            rule__GlobalCellStateSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getGroup()); 

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
    // $ANTLR end "ruleGlobalCellStateSpec"


    // $ANTLR start "entryRuleStateParamSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:230:1: entryRuleStateParamSpec : ruleStateParamSpec EOF ;
    public final void entryRuleStateParamSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:231:1: ( ruleStateParamSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:232:1: ruleStateParamSpec EOF
            {
             before(grammarAccess.getStateParamSpecRule()); 
            pushFollow(FOLLOW_ruleStateParamSpec_in_entryRuleStateParamSpec423);
            ruleStateParamSpec();

            state._fsp--;

             after(grammarAccess.getStateParamSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateParamSpec430); 

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
    // $ANTLR end "entryRuleStateParamSpec"


    // $ANTLR start "ruleStateParamSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:239:1: ruleStateParamSpec : ( ( rule__StateParamSpec__Group__0 ) ) ;
    public final void ruleStateParamSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:243:2: ( ( ( rule__StateParamSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:244:1: ( ( rule__StateParamSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:244:1: ( ( rule__StateParamSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:245:1: ( rule__StateParamSpec__Group__0 )
            {
             before(grammarAccess.getStateParamSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:246:1: ( rule__StateParamSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:246:2: rule__StateParamSpec__Group__0
            {
            pushFollow(FOLLOW_rule__StateParamSpec__Group__0_in_ruleStateParamSpec456);
            rule__StateParamSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateParamSpecAccess().getGroup()); 

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
    // $ANTLR end "ruleStateParamSpec"


    // $ANTLR start "entryRuleCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:258:1: entryRuleCellStateSpec : ruleCellStateSpec EOF ;
    public final void entryRuleCellStateSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:259:1: ( ruleCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:260:1: ruleCellStateSpec EOF
            {
             before(grammarAccess.getCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec483);
            ruleCellStateSpec();

            state._fsp--;

             after(grammarAccess.getCellStateSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellStateSpec490); 

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
    // $ANTLR end "entryRuleCellStateSpec"


    // $ANTLR start "ruleCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:267:1: ruleCellStateSpec : ( ( rule__CellStateSpec__Alternatives ) ) ;
    public final void ruleCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:271:2: ( ( ( rule__CellStateSpec__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:272:1: ( ( rule__CellStateSpec__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:272:1: ( ( rule__CellStateSpec__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:273:1: ( rule__CellStateSpec__Alternatives )
            {
             before(grammarAccess.getCellStateSpecAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:274:1: ( rule__CellStateSpec__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:274:2: rule__CellStateSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Alternatives_in_ruleCellStateSpec516);
            rule__CellStateSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCellStateSpec"


    // $ANTLR start "entryRuleLocalCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:286:1: entryRuleLocalCellStateSpec : ruleLocalCellStateSpec EOF ;
    public final void entryRuleLocalCellStateSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:287:1: ( ruleLocalCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:288:1: ruleLocalCellStateSpec EOF
            {
             before(grammarAccess.getLocalCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleLocalCellStateSpec_in_entryRuleLocalCellStateSpec543);
            ruleLocalCellStateSpec();

            state._fsp--;

             after(grammarAccess.getLocalCellStateSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalCellStateSpec550); 

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
    // $ANTLR end "entryRuleLocalCellStateSpec"


    // $ANTLR start "ruleLocalCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:295:1: ruleLocalCellStateSpec : ( ( rule__LocalCellStateSpec__Group__0 ) ) ;
    public final void ruleLocalCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:299:2: ( ( ( rule__LocalCellStateSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:300:1: ( ( rule__LocalCellStateSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:300:1: ( ( rule__LocalCellStateSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:301:1: ( rule__LocalCellStateSpec__Group__0 )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:302:1: ( rule__LocalCellStateSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:302:2: rule__LocalCellStateSpec__Group__0
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__0_in_ruleLocalCellStateSpec576);
            rule__LocalCellStateSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalCellStateSpecAccess().getGroup()); 

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
    // $ANTLR end "ruleLocalCellStateSpec"


    // $ANTLR start "entryRuleCellStateSpecReference"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:314:1: entryRuleCellStateSpecReference : ruleCellStateSpecReference EOF ;
    public final void entryRuleCellStateSpecReference() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:315:1: ( ruleCellStateSpecReference EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:316:1: ruleCellStateSpecReference EOF
            {
             before(grammarAccess.getCellStateSpecReferenceRule()); 
            pushFollow(FOLLOW_ruleCellStateSpecReference_in_entryRuleCellStateSpecReference603);
            ruleCellStateSpecReference();

            state._fsp--;

             after(grammarAccess.getCellStateSpecReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellStateSpecReference610); 

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
    // $ANTLR end "entryRuleCellStateSpecReference"


    // $ANTLR start "ruleCellStateSpecReference"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:323:1: ruleCellStateSpecReference : ( ( rule__CellStateSpecReference__Group__0 ) ) ;
    public final void ruleCellStateSpecReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:327:2: ( ( ( rule__CellStateSpecReference__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:328:1: ( ( rule__CellStateSpecReference__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:328:1: ( ( rule__CellStateSpecReference__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:329:1: ( rule__CellStateSpecReference__Group__0 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:330:1: ( rule__CellStateSpecReference__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:330:2: rule__CellStateSpecReference__Group__0
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group__0_in_ruleCellStateSpecReference636);
            rule__CellStateSpecReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleCellStateSpecReference"


    // $ANTLR start "entryRuleValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:342:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:343:1: ( ruleValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:344:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue663);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue670); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:351:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:355:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:356:1: ( ( rule__Value__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:356:1: ( ( rule__Value__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:357:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:358:1: ( rule__Value__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:358:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue696);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStringValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:370:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:371:1: ( ruleStringValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:372:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue723);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue730); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:379:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:383:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:384:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:384:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:385:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:386:1: ( rule__StringValue__ValueAssignment )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:386:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue756);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:398:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:399:1: ( ruleIntValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:400:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue783);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue790); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:407:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:411:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:412:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:412:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:413:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:414:1: ( rule__IntValue__ValueAssignment )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:414:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue816);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleVarRefValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:426:1: entryRuleVarRefValue : ruleVarRefValue EOF ;
    public final void entryRuleVarRefValue() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:427:1: ( ruleVarRefValue EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:428:1: ruleVarRefValue EOF
            {
             before(grammarAccess.getVarRefValueRule()); 
            pushFollow(FOLLOW_ruleVarRefValue_in_entryRuleVarRefValue843);
            ruleVarRefValue();

            state._fsp--;

             after(grammarAccess.getVarRefValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRefValue850); 

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
    // $ANTLR end "entryRuleVarRefValue"


    // $ANTLR start "ruleVarRefValue"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:435:1: ruleVarRefValue : ( ( rule__VarRefValue__RefAssignment ) ) ;
    public final void ruleVarRefValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:439:2: ( ( ( rule__VarRefValue__RefAssignment ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:440:1: ( ( rule__VarRefValue__RefAssignment ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:440:1: ( ( rule__VarRefValue__RefAssignment ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:441:1: ( rule__VarRefValue__RefAssignment )
            {
             before(grammarAccess.getVarRefValueAccess().getRefAssignment()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:442:1: ( rule__VarRefValue__RefAssignment )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:442:2: rule__VarRefValue__RefAssignment
            {
            pushFollow(FOLLOW_rule__VarRefValue__RefAssignment_in_ruleVarRefValue876);
            rule__VarRefValue__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarRefValueAccess().getRefAssignment()); 

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
    // $ANTLR end "ruleVarRefValue"


    // $ANTLR start "entryRuleCellState"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:454:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:455:1: ( ruleCellState EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:456:1: ruleCellState EOF
            {
             before(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_ruleCellState_in_entryRuleCellState903);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getCellStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellState910); 

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
    // $ANTLR end "entryRuleCellState"


    // $ANTLR start "ruleCellState"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:463:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:467:2: ( ( ( rule__CellState__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:468:1: ( ( rule__CellState__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:468:1: ( ( rule__CellState__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:469:1: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:470:1: ( rule__CellState__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:470:2: rule__CellState__Group__0
            {
            pushFollow(FOLLOW_rule__CellState__Group__0_in_ruleCellState936);
            rule__CellState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getGroup()); 

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
    // $ANTLR end "ruleCellState"


    // $ANTLR start "entryRuleTransitionSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:482:1: entryRuleTransitionSpec : ruleTransitionSpec EOF ;
    public final void entryRuleTransitionSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:483:1: ( ruleTransitionSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:484:1: ruleTransitionSpec EOF
            {
             before(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec963);
            ruleTransitionSpec();

            state._fsp--;

             after(grammarAccess.getTransitionSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpec970); 

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
    // $ANTLR end "entryRuleTransitionSpec"


    // $ANTLR start "ruleTransitionSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:491:1: ruleTransitionSpec : ( ( rule__TransitionSpec__Group__0 ) ) ;
    public final void ruleTransitionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:495:2: ( ( ( rule__TransitionSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:496:1: ( ( rule__TransitionSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:496:1: ( ( rule__TransitionSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:497:1: ( rule__TransitionSpec__Group__0 )
            {
             before(grammarAccess.getTransitionSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:498:1: ( rule__TransitionSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:498:2: rule__TransitionSpec__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__0_in_ruleTransitionSpec996);
            rule__TransitionSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionSpecAccess().getGroup()); 

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
    // $ANTLR end "ruleTransitionSpec"


    // $ANTLR start "entryRuleTransitionTriggerSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:510:1: entryRuleTransitionTriggerSpec : ruleTransitionTriggerSpec EOF ;
    public final void entryRuleTransitionTriggerSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:511:1: ( ruleTransitionTriggerSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:512:1: ruleTransitionTriggerSpec EOF
            {
             before(grammarAccess.getTransitionTriggerSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec1023);
            ruleTransitionTriggerSpec();

            state._fsp--;

             after(grammarAccess.getTransitionTriggerSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionTriggerSpec1030); 

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
    // $ANTLR end "entryRuleTransitionTriggerSpec"


    // $ANTLR start "ruleTransitionTriggerSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:519:1: ruleTransitionTriggerSpec : ( ( rule__TransitionTriggerSpec__Alternatives ) ) ;
    public final void ruleTransitionTriggerSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:523:2: ( ( ( rule__TransitionTriggerSpec__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:524:1: ( ( rule__TransitionTriggerSpec__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:524:1: ( ( rule__TransitionTriggerSpec__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:525:1: ( rule__TransitionTriggerSpec__Alternatives )
            {
             before(grammarAccess.getTransitionTriggerSpecAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:526:1: ( rule__TransitionTriggerSpec__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:526:2: rule__TransitionTriggerSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__TransitionTriggerSpec__Alternatives_in_ruleTransitionTriggerSpec1056);
            rule__TransitionTriggerSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionTriggerSpecAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTransitionTriggerSpec"


    // $ANTLR start "entryRuleFieldSpecification"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:538:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:539:1: ( ruleFieldSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:540:1: ruleFieldSpecification EOF
            {
             before(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification1083);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldSpecification1090); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:547:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:551:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:552:1: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:552:1: ( ( rule__FieldSpecification__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:553:1: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:554:1: ( rule__FieldSpecification__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:554:2: rule__FieldSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__0_in_ruleFieldSpecification1116);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:566:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:567:1: ( ruleOptionSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:568:1: ruleOptionSpecification EOF
            {
             before(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification1143);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSpecification1150); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:575:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:579:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:580:1: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:580:1: ( ( rule__OptionSpecification__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:581:1: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:582:1: ( rule__OptionSpecification__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:582:2: rule__OptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__OptionSpecification__Alternatives_in_ruleOptionSpecification1176);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:594:1: entryRuleAllowRestartMenu : ruleAllowRestartMenu EOF ;
    public final void entryRuleAllowRestartMenu() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:595:1: ( ruleAllowRestartMenu EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:596:1: ruleAllowRestartMenu EOF
            {
             before(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu1203);
            ruleAllowRestartMenu();

            state._fsp--;

             after(grammarAccess.getAllowRestartMenuRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowRestartMenu1210); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:603:1: ruleAllowRestartMenu : ( ( rule__AllowRestartMenu__Group__0 ) ) ;
    public final void ruleAllowRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:607:2: ( ( ( rule__AllowRestartMenu__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:608:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:608:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:609:1: ( rule__AllowRestartMenu__Group__0 )
            {
             before(grammarAccess.getAllowRestartMenuAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:610:1: ( rule__AllowRestartMenu__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:610:2: rule__AllowRestartMenu__Group__0
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__0_in_ruleAllowRestartMenu1236);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:622:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:623:1: ( ruleStartFieldDeclaration EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:624:1: ruleStartFieldDeclaration EOF
            {
             before(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration1263);
            ruleStartFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getStartFieldDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartFieldDeclaration1270); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:631:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:635:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:636:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:636:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:637:1: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:638:1: ( rule__StartFieldDeclaration__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:638:2: rule__StartFieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__0_in_ruleStartFieldDeclaration1296);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:650:1: entryRuleFieldInitialisations : ruleFieldInitialisations EOF ;
    public final void entryRuleFieldInitialisations() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:651:1: ( ruleFieldInitialisations EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:652:1: ruleFieldInitialisations EOF
            {
             before(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations1323);
            ruleFieldInitialisations();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisations1330); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:659:1: ruleFieldInitialisations : ( ( rule__FieldInitialisations__Group__0 ) ) ;
    public final void ruleFieldInitialisations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:663:2: ( ( ( rule__FieldInitialisations__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:664:1: ( ( rule__FieldInitialisations__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:664:1: ( ( rule__FieldInitialisations__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:665:1: ( rule__FieldInitialisations__Group__0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:666:1: ( rule__FieldInitialisations__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:666:2: rule__FieldInitialisations__Group__0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__0_in_ruleFieldInitialisations1356);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:678:1: entryRuleFieldInitialisation : ruleFieldInitialisation EOF ;
    public final void entryRuleFieldInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:679:1: ( ruleFieldInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:680:1: ruleFieldInitialisation EOF
            {
             before(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1383);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisation1390); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:687:1: ruleFieldInitialisation : ( ( rule__FieldInitialisation__Alternatives ) ) ;
    public final void ruleFieldInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:691:2: ( ( ( rule__FieldInitialisation__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:692:1: ( ( rule__FieldInitialisation__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:692:1: ( ( rule__FieldInitialisation__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:693:1: ( rule__FieldInitialisation__Alternatives )
            {
             before(grammarAccess.getFieldInitialisationAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:694:1: ( rule__FieldInitialisation__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:694:2: rule__FieldInitialisation__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldInitialisation__Alternatives_in_ruleFieldInitialisation1416);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:706:1: entryRuleDefaultInitialisation : ruleDefaultInitialisation EOF ;
    public final void entryRuleDefaultInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:707:1: ( ruleDefaultInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:708:1: ruleDefaultInitialisation EOF
            {
             before(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1443);
            ruleDefaultInitialisation();

            state._fsp--;

             after(grammarAccess.getDefaultInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultInitialisation1450); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:715:1: ruleDefaultInitialisation : ( ( rule__DefaultInitialisation__Group__0 ) ) ;
    public final void ruleDefaultInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:719:2: ( ( ( rule__DefaultInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:720:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:720:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:721:1: ( rule__DefaultInitialisation__Group__0 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:722:1: ( rule__DefaultInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:722:2: rule__DefaultInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__0_in_ruleDefaultInitialisation1476);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:734:1: entryRuleRandomInitialisation : ruleRandomInitialisation EOF ;
    public final void entryRuleRandomInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:735:1: ( ruleRandomInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:736:1: ruleRandomInitialisation EOF
            {
             before(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1503);
            ruleRandomInitialisation();

            state._fsp--;

             after(grammarAccess.getRandomInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRandomInitialisation1510); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:743:1: ruleRandomInitialisation : ( ( rule__RandomInitialisation__Group__0 ) ) ;
    public final void ruleRandomInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:747:2: ( ( ( rule__RandomInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:748:1: ( ( rule__RandomInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:748:1: ( ( rule__RandomInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:749:1: ( rule__RandomInitialisation__Group__0 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:750:1: ( rule__RandomInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:750:2: rule__RandomInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__0_in_ruleRandomInitialisation1536);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:762:1: entryRuleContextInitialisation : ruleContextInitialisation EOF ;
    public final void entryRuleContextInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:763:1: ( ruleContextInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:764:1: ruleContextInitialisation EOF
            {
             before(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation1563);
            ruleContextInitialisation();

            state._fsp--;

             after(grammarAccess.getContextInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextInitialisation1570); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:771:1: ruleContextInitialisation : ( ( rule__ContextInitialisation__Group__0 ) ) ;
    public final void ruleContextInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:775:2: ( ( ( rule__ContextInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:776:1: ( ( rule__ContextInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:776:1: ( ( rule__ContextInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:777:1: ( rule__ContextInitialisation__Group__0 )
            {
             before(grammarAccess.getContextInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:778:1: ( rule__ContextInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:778:2: rule__ContextInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__0_in_ruleContextInitialisation1596);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:790:1: entryRuleContextExpression : ruleContextExpression EOF ;
    public final void entryRuleContextExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:791:1: ( ruleContextExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:792:1: ruleContextExpression EOF
            {
             before(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_ruleContextExpression_in_entryRuleContextExpression1623);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextExpression1630); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:799:1: ruleContextExpression : ( ( rule__ContextExpression__Group__0 ) ) ;
    public final void ruleContextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:803:2: ( ( ( rule__ContextExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:804:1: ( ( rule__ContextExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:804:1: ( ( rule__ContextExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:805:1: ( rule__ContextExpression__Group__0 )
            {
             before(grammarAccess.getContextExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:806:1: ( rule__ContextExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:806:2: rule__ContextExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__0_in_ruleContextExpression1656);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:818:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:819:1: ( ruleAtomicExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:820:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1683);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression1690); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:827:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:831:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:832:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:832:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:833:1: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:834:1: ( rule__AtomicExpression__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:834:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1716);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:846:1: entryRuleFilterExpression : ruleFilterExpression EOF ;
    public final void entryRuleFilterExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:847:1: ( ruleFilterExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:848:1: ruleFilterExpression EOF
            {
             before(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression1743);
            ruleFilterExpression();

            state._fsp--;

             after(grammarAccess.getFilterExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterExpression1750); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:855:1: ruleFilterExpression : ( ( rule__FilterExpression__Group__0 ) ) ;
    public final void ruleFilterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:859:2: ( ( ( rule__FilterExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:860:1: ( ( rule__FilterExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:860:1: ( ( rule__FilterExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:861:1: ( rule__FilterExpression__Group__0 )
            {
             before(grammarAccess.getFilterExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:862:1: ( rule__FilterExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:862:2: rule__FilterExpression__Group__0
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__0_in_ruleFilterExpression1776);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:874:1: entryRuleCountExpression : ruleCountExpression EOF ;
    public final void entryRuleCountExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:875:1: ( ruleCountExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:876:1: ruleCountExpression EOF
            {
             before(grammarAccess.getCountExpressionRule()); 
            pushFollow(FOLLOW_ruleCountExpression_in_entryRuleCountExpression1803);
            ruleCountExpression();

            state._fsp--;

             after(grammarAccess.getCountExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountExpression1810); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:883:1: ruleCountExpression : ( ( rule__CountExpression__Group__0 ) ) ;
    public final void ruleCountExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:887:2: ( ( ( rule__CountExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:888:1: ( ( rule__CountExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:888:1: ( ( rule__CountExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:889:1: ( rule__CountExpression__Group__0 )
            {
             before(grammarAccess.getCountExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:890:1: ( rule__CountExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:890:2: rule__CountExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__0_in_ruleCountExpression1836);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:902:1: entryRuleNotEmptyExpression : ruleNotEmptyExpression EOF ;
    public final void entryRuleNotEmptyExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:903:1: ( ruleNotEmptyExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:904:1: ruleNotEmptyExpression EOF
            {
             before(grammarAccess.getNotEmptyExpressionRule()); 
            pushFollow(FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression1863);
            ruleNotEmptyExpression();

            state._fsp--;

             after(grammarAccess.getNotEmptyExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyExpression1870); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:911:1: ruleNotEmptyExpression : ( ( rule__NotEmptyExpression__Group__0 ) ) ;
    public final void ruleNotEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:915:2: ( ( ( rule__NotEmptyExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:916:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:916:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:917:1: ( rule__NotEmptyExpression__Group__0 )
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:918:1: ( rule__NotEmptyExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:918:2: rule__NotEmptyExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__0_in_ruleNotEmptyExpression1896);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:930:1: rule__CellMember__Alternatives : ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) | ( ruleCellStateSpec ) );
    public final void rule__CellMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:934:1: ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) | ( ruleCellStateSpec ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:935:1: ( ruleCellDisplaySpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:935:1: ( ruleCellDisplaySpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:936:1: ruleCellDisplaySpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCellDisplaySpec_in_rule__CellMember__Alternatives1932);
                    ruleCellDisplaySpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:941:6: ( ruleCellVarSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:941:6: ( ruleCellVarSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:942:1: ruleCellVarSpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCellVarSpec_in_rule__CellMember__Alternatives1949);
                    ruleCellVarSpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:947:6: ( ruleCellStateSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:947:6: ( ruleCellStateSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:948:1: ruleCellStateSpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellStateSpecParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCellStateSpec_in_rule__CellMember__Alternatives1966);
                    ruleCellStateSpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellStateSpecParserRuleCall_2()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:958:1: rule__CellDisplaySpec__Display_typeAlternatives_3_0 : ( ( 'label' ) | ( 'button' ) );
    public final void rule__CellDisplaySpec__Display_typeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:962:1: ( ( 'label' ) | ( 'button' ) )
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:963:1: ( 'label' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:963:1: ( 'label' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:964:1: 'label'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01999); 
                     after(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:971:6: ( 'button' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:971:6: ( 'button' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:972:1: 'button'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeButtonKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__CellDisplaySpec__Display_typeAlternatives_3_02019); 
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


    // $ANTLR start "rule__CellDisplaySpec__Alternatives_4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:984:1: rule__CellDisplaySpec__Alternatives_4 : ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) );
    public final void rule__CellDisplaySpec__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:988:1: ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:989:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:989:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:990:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:991:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:991:2: rule__CellDisplaySpec__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__0_in_rule__CellDisplaySpec__Alternatives_42053);
                    rule__CellDisplaySpec__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:995:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:995:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:996:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_1()); 
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:997:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:997:2: rule__CellDisplaySpec__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__0_in_rule__CellDisplaySpec__Alternatives_42071);
                    rule__CellDisplaySpec__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Alternatives_4"


    // $ANTLR start "rule__CellVarSpec__TypeAlternatives_1_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1007:1: rule__CellVarSpec__TypeAlternatives_1_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__CellVarSpec__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1011:1: ( ( 'int' ) | ( 'String' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1012:1: ( 'int' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1012:1: ( 'int' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1013:1: 'int'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_02106); 
                     after(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1020:6: ( 'String' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1020:6: ( 'String' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1021:1: 'String'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeStringKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_02126); 
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


    // $ANTLR start "rule__StateParamSpec__TypeAlternatives_0_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1033:1: rule__StateParamSpec__TypeAlternatives_0_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__StateParamSpec__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1037:1: ( ( 'int' ) | ( 'String' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1038:1: ( 'int' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1038:1: ( 'int' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1039:1: 'int'
                    {
                     before(grammarAccess.getStateParamSpecAccess().getTypeIntKeyword_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__StateParamSpec__TypeAlternatives_0_02161); 
                     after(grammarAccess.getStateParamSpecAccess().getTypeIntKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1046:6: ( 'String' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1046:6: ( 'String' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1047:1: 'String'
                    {
                     before(grammarAccess.getStateParamSpecAccess().getTypeStringKeyword_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__StateParamSpec__TypeAlternatives_0_02181); 
                     after(grammarAccess.getStateParamSpecAccess().getTypeStringKeyword_0_0_1()); 

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
    // $ANTLR end "rule__StateParamSpec__TypeAlternatives_0_0"


    // $ANTLR start "rule__CellStateSpec__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1059:1: rule__CellStateSpec__Alternatives : ( ( ruleLocalCellStateSpec ) | ( ruleCellStateSpecReference ) );
    public final void rule__CellStateSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1063:1: ( ( ruleLocalCellStateSpec ) | ( ruleCellStateSpecReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=2;
                }
                else if ( (LA6_1==18) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1064:1: ( ruleLocalCellStateSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1064:1: ( ruleLocalCellStateSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1065:1: ruleLocalCellStateSpec
                    {
                     before(grammarAccess.getCellStateSpecAccess().getLocalCellStateSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLocalCellStateSpec_in_rule__CellStateSpec__Alternatives2215);
                    ruleLocalCellStateSpec();

                    state._fsp--;

                     after(grammarAccess.getCellStateSpecAccess().getLocalCellStateSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1070:6: ( ruleCellStateSpecReference )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1070:6: ( ruleCellStateSpecReference )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1071:1: ruleCellStateSpecReference
                    {
                     before(grammarAccess.getCellStateSpecAccess().getCellStateSpecReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCellStateSpecReference_in_rule__CellStateSpec__Alternatives2232);
                    ruleCellStateSpecReference();

                    state._fsp--;

                     after(grammarAccess.getCellStateSpecAccess().getCellStateSpecReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__CellStateSpec__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1081:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleVarRefValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1085:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleVarRefValue ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1086:1: ( ruleStringValue )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1086:1: ( ruleStringValue )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1087:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives2264);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1092:6: ( ruleIntValue )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1092:6: ( ruleIntValue )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1093:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives2281);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1098:6: ( ruleVarRefValue )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1098:6: ( ruleVarRefValue )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1099:1: ruleVarRefValue
                    {
                     before(grammarAccess.getValueAccess().getVarRefValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleVarRefValue_in_rule__Value__Alternatives2298);
                    ruleVarRefValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getVarRefValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__TransitionTriggerSpec__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1109:1: rule__TransitionTriggerSpec__Alternatives : ( ( 'mouse-left' ) | ( 'mouse-right' ) );
    public final void rule__TransitionTriggerSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1113:1: ( ( 'mouse-left' ) | ( 'mouse-right' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1114:1: ( 'mouse-left' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1114:1: ( 'mouse-left' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1115:1: 'mouse-left'
                    {
                     before(grammarAccess.getTransitionTriggerSpecAccess().getMouseLeftKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__TransitionTriggerSpec__Alternatives2331); 
                     after(grammarAccess.getTransitionTriggerSpecAccess().getMouseLeftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1122:6: ( 'mouse-right' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1122:6: ( 'mouse-right' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1123:1: 'mouse-right'
                    {
                     before(grammarAccess.getTransitionTriggerSpecAccess().getMouseRightKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__TransitionTriggerSpec__Alternatives2351); 
                     after(grammarAccess.getTransitionTriggerSpecAccess().getMouseRightKeyword_1()); 

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
    // $ANTLR end "rule__TransitionTriggerSpec__Alternatives"


    // $ANTLR start "rule__OptionSpecification__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1135:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1139:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==37) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1140:1: ( ruleStartFieldDeclaration )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1140:1: ( ruleStartFieldDeclaration )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1141:1: ruleStartFieldDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives2385);
                    ruleStartFieldDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1146:6: ( ruleAllowRestartMenu )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1146:6: ( ruleAllowRestartMenu )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1147:1: ruleAllowRestartMenu
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives2402);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1157:1: rule__FieldInitialisation__Alternatives : ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) );
    public final void rule__FieldInitialisation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1161:1: ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 42:
                {
                alt10=2;
                }
                break;
            case 43:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1162:1: ( ruleDefaultInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1162:1: ( ruleDefaultInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1163:1: ruleDefaultInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives2434);
                    ruleDefaultInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1168:6: ( ruleRandomInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1168:6: ( ruleRandomInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1169:1: ruleRandomInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives2451);
                    ruleRandomInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1174:6: ( ruleContextInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1174:6: ( ruleContextInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1175:1: ruleContextInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives2468);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1185:1: rule__AtomicExpression__Alternatives : ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1189:1: ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt11=1;
                }
                break;
            case 48:
                {
                alt11=2;
                }
                break;
            case 49:
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1190:1: ( ruleFilterExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1190:1: ( ruleFilterExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1191:1: ruleFilterExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives2500);
                    ruleFilterExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1196:6: ( ruleCountExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1196:6: ( ruleCountExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1197:1: ruleCountExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives2517);
                    ruleCountExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1202:6: ( ruleNotEmptyExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1202:6: ( ruleNotEmptyExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1203:1: ruleNotEmptyExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives2534);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1215:1: rule__GridGame__Group__0 : rule__GridGame__Group__0__Impl rule__GridGame__Group__1 ;
    public final void rule__GridGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1219:1: ( rule__GridGame__Group__0__Impl rule__GridGame__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1220:2: rule__GridGame__Group__0__Impl rule__GridGame__Group__1
            {
            pushFollow(FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__02564);
            rule__GridGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__02567);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1227:1: rule__GridGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__GridGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1231:1: ( ( 'game' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1232:1: ( 'game' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1232:1: ( 'game' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1233:1: 'game'
            {
             before(grammarAccess.getGridGameAccess().getGameKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__GridGame__Group__0__Impl2595); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1246:1: rule__GridGame__Group__1 : rule__GridGame__Group__1__Impl rule__GridGame__Group__2 ;
    public final void rule__GridGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1250:1: ( rule__GridGame__Group__1__Impl rule__GridGame__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1251:2: rule__GridGame__Group__1__Impl rule__GridGame__Group__2
            {
            pushFollow(FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__12626);
            rule__GridGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__12629);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1258:1: rule__GridGame__Group__1__Impl : ( ( rule__GridGame__NameAssignment_1 ) ) ;
    public final void rule__GridGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1262:1: ( ( ( rule__GridGame__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1263:1: ( ( rule__GridGame__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1263:1: ( ( rule__GridGame__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1264:1: ( rule__GridGame__NameAssignment_1 )
            {
             before(grammarAccess.getGridGameAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1265:1: ( rule__GridGame__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1265:2: rule__GridGame__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl2656);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1275:1: rule__GridGame__Group__2 : rule__GridGame__Group__2__Impl rule__GridGame__Group__3 ;
    public final void rule__GridGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1279:1: ( rule__GridGame__Group__2__Impl rule__GridGame__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1280:2: rule__GridGame__Group__2__Impl rule__GridGame__Group__3
            {
            pushFollow(FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__22686);
            rule__GridGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__22689);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1287:1: rule__GridGame__Group__2__Impl : ( '{' ) ;
    public final void rule__GridGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1291:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1292:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1292:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1293:1: '{'
            {
             before(grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__GridGame__Group__2__Impl2717); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1306:1: rule__GridGame__Group__3 : rule__GridGame__Group__3__Impl rule__GridGame__Group__4 ;
    public final void rule__GridGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1310:1: ( rule__GridGame__Group__3__Impl rule__GridGame__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1311:2: rule__GridGame__Group__3__Impl rule__GridGame__Group__4
            {
            pushFollow(FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__32748);
            rule__GridGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__32751);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1318:1: rule__GridGame__Group__3__Impl : ( ( rule__GridGame__StatesAssignment_3 )? ) ;
    public final void rule__GridGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1322:1: ( ( ( rule__GridGame__StatesAssignment_3 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1323:1: ( ( rule__GridGame__StatesAssignment_3 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1323:1: ( ( rule__GridGame__StatesAssignment_3 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1324:1: ( rule__GridGame__StatesAssignment_3 )?
            {
             before(grammarAccess.getGridGameAccess().getStatesAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1325:1: ( rule__GridGame__StatesAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1325:2: rule__GridGame__StatesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__GridGame__StatesAssignment_3_in_rule__GridGame__Group__3__Impl2778);
                    rule__GridGame__StatesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGridGameAccess().getStatesAssignment_3()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1335:1: rule__GridGame__Group__4 : rule__GridGame__Group__4__Impl rule__GridGame__Group__5 ;
    public final void rule__GridGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1339:1: ( rule__GridGame__Group__4__Impl rule__GridGame__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1340:2: rule__GridGame__Group__4__Impl rule__GridGame__Group__5
            {
            pushFollow(FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__42809);
            rule__GridGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__42812);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1347:1: rule__GridGame__Group__4__Impl : ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) ) ;
    public final void rule__GridGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1351:1: ( ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1352:1: ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1352:1: ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1353:1: ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1353:1: ( ( rule__GridGame__CellsAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1354:1: ( rule__GridGame__CellsAssignment_4 )
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1355:1: ( rule__GridGame__CellsAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1355:2: rule__GridGame__CellsAssignment_4
            {
            pushFollow(FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2841);
            rule__GridGame__CellsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getCellsAssignment_4()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1358:1: ( ( rule__GridGame__CellsAssignment_4 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1359:1: ( rule__GridGame__CellsAssignment_4 )*
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1360:1: ( rule__GridGame__CellsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1360:2: rule__GridGame__CellsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2853);
            	    rule__GridGame__CellsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGridGameAccess().getCellsAssignment_4()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1371:1: rule__GridGame__Group__5 : rule__GridGame__Group__5__Impl rule__GridGame__Group__6 ;
    public final void rule__GridGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1375:1: ( rule__GridGame__Group__5__Impl rule__GridGame__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1376:2: rule__GridGame__Group__5__Impl rule__GridGame__Group__6
            {
            pushFollow(FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__52886);
            rule__GridGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__52889);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1383:1: rule__GridGame__Group__5__Impl : ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) ) ;
    public final void rule__GridGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1387:1: ( ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1388:1: ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1388:1: ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1389:1: ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1389:1: ( ( rule__GridGame__FieldsAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1390:1: ( rule__GridGame__FieldsAssignment_5 )
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1391:1: ( rule__GridGame__FieldsAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1391:2: rule__GridGame__FieldsAssignment_5
            {
            pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2918);
            rule__GridGame__FieldsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getFieldsAssignment_5()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1394:1: ( ( rule__GridGame__FieldsAssignment_5 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1395:1: ( rule__GridGame__FieldsAssignment_5 )*
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1396:1: ( rule__GridGame__FieldsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1396:2: rule__GridGame__FieldsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2930);
            	    rule__GridGame__FieldsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getGridGameAccess().getFieldsAssignment_5()); 

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
    // $ANTLR end "rule__GridGame__Group__5__Impl"


    // $ANTLR start "rule__GridGame__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1407:1: rule__GridGame__Group__6 : rule__GridGame__Group__6__Impl rule__GridGame__Group__7 ;
    public final void rule__GridGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1411:1: ( rule__GridGame__Group__6__Impl rule__GridGame__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1412:2: rule__GridGame__Group__6__Impl rule__GridGame__Group__7
            {
            pushFollow(FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__62963);
            rule__GridGame__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__7_in_rule__GridGame__Group__62966);
            rule__GridGame__Group__7();

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1419:1: rule__GridGame__Group__6__Impl : ( ( rule__GridGame__OptionsAssignment_6 )* ) ;
    public final void rule__GridGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1423:1: ( ( ( rule__GridGame__OptionsAssignment_6 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1424:1: ( ( rule__GridGame__OptionsAssignment_6 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1424:1: ( ( rule__GridGame__OptionsAssignment_6 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1425:1: ( rule__GridGame__OptionsAssignment_6 )*
            {
             before(grammarAccess.getGridGameAccess().getOptionsAssignment_6()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1426:1: ( rule__GridGame__OptionsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26||LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1426:2: rule__GridGame__OptionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__OptionsAssignment_6_in_rule__GridGame__Group__6__Impl2993);
            	    rule__GridGame__OptionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getGridGameAccess().getOptionsAssignment_6()); 

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


    // $ANTLR start "rule__GridGame__Group__7"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1436:1: rule__GridGame__Group__7 : rule__GridGame__Group__7__Impl ;
    public final void rule__GridGame__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1440:1: ( rule__GridGame__Group__7__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1441:2: rule__GridGame__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GridGame__Group__7__Impl_in_rule__GridGame__Group__73024);
            rule__GridGame__Group__7__Impl();

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
    // $ANTLR end "rule__GridGame__Group__7"


    // $ANTLR start "rule__GridGame__Group__7__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1447:1: rule__GridGame__Group__7__Impl : ( '}' ) ;
    public final void rule__GridGame__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1451:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1452:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1452:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1453:1: '}'
            {
             before(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__GridGame__Group__7__Impl3052); 
             after(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__GridGame__Group__7__Impl"


    // $ANTLR start "rule__CellSpecification__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1482:1: rule__CellSpecification__Group__0 : rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 ;
    public final void rule__CellSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1486:1: ( rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1487:2: rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__03099);
            rule__CellSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__03102);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1494:1: rule__CellSpecification__Group__0__Impl : ( 'cell' ) ;
    public final void rule__CellSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1498:1: ( ( 'cell' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1499:1: ( 'cell' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1499:1: ( 'cell' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1500:1: 'cell'
            {
             before(grammarAccess.getCellSpecificationAccess().getCellKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__CellSpecification__Group__0__Impl3130); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1513:1: rule__CellSpecification__Group__1 : rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 ;
    public final void rule__CellSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1517:1: ( rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1518:2: rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__13161);
            rule__CellSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__13164);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1525:1: rule__CellSpecification__Group__1__Impl : ( ( rule__CellSpecification__NameAssignment_1 ) ) ;
    public final void rule__CellSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1529:1: ( ( ( rule__CellSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1530:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1530:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1531:1: ( rule__CellSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getCellSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1532:1: ( rule__CellSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1532:2: rule__CellSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl3191);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1542:1: rule__CellSpecification__Group__2 : rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 ;
    public final void rule__CellSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1546:1: ( rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1547:2: rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__23221);
            rule__CellSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__23224);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1554:1: rule__CellSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__CellSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1558:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1559:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1559:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1560:1: '{'
            {
             before(grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__CellSpecification__Group__2__Impl3252); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1573:1: rule__CellSpecification__Group__3 : rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 ;
    public final void rule__CellSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1577:1: ( rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1578:2: rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__33283);
            rule__CellSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__33286);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1585:1: rule__CellSpecification__Group__3__Impl : ( ( rule__CellSpecification__MembersAssignment_3 )* ) ;
    public final void rule__CellSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1589:1: ( ( ( rule__CellSpecification__MembersAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1590:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1590:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1591:1: ( rule__CellSpecification__MembersAssignment_3 )*
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1592:1: ( rule__CellSpecification__MembersAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21||(LA16_0>=24 && LA16_0<=25)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1592:2: rule__CellSpecification__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl3313);
            	    rule__CellSpecification__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1602:1: rule__CellSpecification__Group__4 : rule__CellSpecification__Group__4__Impl ;
    public final void rule__CellSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1606:1: ( rule__CellSpecification__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1607:2: rule__CellSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__43344);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1613:1: rule__CellSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__CellSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1617:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1618:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1618:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1619:1: '}'
            {
             before(grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__CellSpecification__Group__4__Impl3372); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1642:1: rule__CellDisplaySpec__Group__0 : rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 ;
    public final void rule__CellDisplaySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1646:1: ( rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1647:2: rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__03413);
            rule__CellDisplaySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__03416);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1654:1: rule__CellDisplaySpec__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplaySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1658:1: ( ( 'display' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1659:1: ( 'display' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1659:1: ( 'display' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1660:1: 'display'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__CellDisplaySpec__Group__0__Impl3444); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1673:1: rule__CellDisplaySpec__Group__1 : rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 ;
    public final void rule__CellDisplaySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1677:1: ( rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1678:2: rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__13475);
            rule__CellDisplaySpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__13478);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1685:1: rule__CellDisplaySpec__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplaySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1689:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1690:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1690:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1691:1: '{'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__CellDisplaySpec__Group__1__Impl3506); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1704:1: rule__CellDisplaySpec__Group__2 : rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 ;
    public final void rule__CellDisplaySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1708:1: ( rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1709:2: rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__23537);
            rule__CellDisplaySpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__23540);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1716:1: rule__CellDisplaySpec__Group__2__Impl : ( 'as' ) ;
    public final void rule__CellDisplaySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1720:1: ( ( 'as' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1721:1: ( 'as' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1721:1: ( 'as' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1722:1: 'as'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__CellDisplaySpec__Group__2__Impl3568); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1735:1: rule__CellDisplaySpec__Group__3 : rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 ;
    public final void rule__CellDisplaySpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1739:1: ( rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1740:2: rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__33599);
            rule__CellDisplaySpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__33602);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1747:1: rule__CellDisplaySpec__Group__3__Impl : ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) ;
    public final void rule__CellDisplaySpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1751:1: ( ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1752:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1752:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1753:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1754:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1754:2: rule__CellDisplaySpec__Display_typeAssignment_3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl3629);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1764:1: rule__CellDisplaySpec__Group__4 : rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 ;
    public final void rule__CellDisplaySpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1768:1: ( rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1769:2: rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__43659);
            rule__CellDisplaySpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__43662);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1776:1: rule__CellDisplaySpec__Group__4__Impl : ( ( rule__CellDisplaySpec__Alternatives_4 ) ) ;
    public final void rule__CellDisplaySpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1780:1: ( ( ( rule__CellDisplaySpec__Alternatives_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1781:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1781:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1782:1: ( rule__CellDisplaySpec__Alternatives_4 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAlternatives_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1783:1: ( rule__CellDisplaySpec__Alternatives_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1783:2: rule__CellDisplaySpec__Alternatives_4
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Alternatives_4_in_rule__CellDisplaySpec__Group__4__Impl3689);
            rule__CellDisplaySpec__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getAlternatives_4()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1793:1: rule__CellDisplaySpec__Group__5 : rule__CellDisplaySpec__Group__5__Impl ;
    public final void rule__CellDisplaySpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1797:1: ( rule__CellDisplaySpec__Group__5__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1798:2: rule__CellDisplaySpec__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__53719);
            rule__CellDisplaySpec__Group__5__Impl();

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1804:1: rule__CellDisplaySpec__Group__5__Impl : ( '}' ) ;
    public final void rule__CellDisplaySpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1808:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1809:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1809:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1810:1: '}'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__CellDisplaySpec__Group__5__Impl3747); 
             after(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__CellDisplaySpec__Group_4_0__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1835:1: rule__CellDisplaySpec__Group_4_0__0 : rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 ;
    public final void rule__CellDisplaySpec__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1839:1: ( rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1840:2: rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__0__Impl_in_rule__CellDisplaySpec__Group_4_0__03790);
            rule__CellDisplaySpec__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__1_in_rule__CellDisplaySpec__Group_4_0__03793);
            rule__CellDisplaySpec__Group_4_0__1();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_0__0"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_0__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1847:1: rule__CellDisplaySpec__Group_4_0__0__Impl : ( 'text' ) ;
    public final void rule__CellDisplaySpec__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1851:1: ( ( 'text' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1852:1: ( 'text' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1852:1: ( 'text' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1853:1: 'text'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0()); 
            match(input,23,FOLLOW_23_in_rule__CellDisplaySpec__Group_4_0__0__Impl3821); 
             after(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_0__0__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_0__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1866:1: rule__CellDisplaySpec__Group_4_0__1 : rule__CellDisplaySpec__Group_4_0__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1870:1: ( rule__CellDisplaySpec__Group_4_0__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1871:2: rule__CellDisplaySpec__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__1__Impl_in_rule__CellDisplaySpec__Group_4_0__13852);
            rule__CellDisplaySpec__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_0__1"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_0__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1877:1: rule__CellDisplaySpec__Group_4_0__1__Impl : ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1881:1: ( ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1882:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1882:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1883:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_4_0_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1884:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1884:2: rule__CellDisplaySpec__TextAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__TextAssignment_4_0_1_in_rule__CellDisplaySpec__Group_4_0__1__Impl3879);
            rule__CellDisplaySpec__TextAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_4_0_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_0__1__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_1__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1898:1: rule__CellDisplaySpec__Group_4_1__0 : rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 ;
    public final void rule__CellDisplaySpec__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1902:1: ( rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1903:2: rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__0__Impl_in_rule__CellDisplaySpec__Group_4_1__03913);
            rule__CellDisplaySpec__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__1_in_rule__CellDisplaySpec__Group_4_1__03916);
            rule__CellDisplaySpec__Group_4_1__1();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_1__0"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_1__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1910:1: rule__CellDisplaySpec__Group_4_1__0__Impl : ( 'var' ) ;
    public final void rule__CellDisplaySpec__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1914:1: ( ( 'var' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1915:1: ( 'var' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1915:1: ( 'var' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1916:1: 'var'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0()); 
            match(input,24,FOLLOW_24_in_rule__CellDisplaySpec__Group_4_1__0__Impl3944); 
             after(grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_1__0__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_1__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1929:1: rule__CellDisplaySpec__Group_4_1__1 : rule__CellDisplaySpec__Group_4_1__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1933:1: ( rule__CellDisplaySpec__Group_4_1__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1934:2: rule__CellDisplaySpec__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__1__Impl_in_rule__CellDisplaySpec__Group_4_1__13975);
            rule__CellDisplaySpec__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_1__1"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_1__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1940:1: rule__CellDisplaySpec__Group_4_1__1__Impl : ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1944:1: ( ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1945:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1945:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1946:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarAssignment_4_1_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1947:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1947:2: rule__CellDisplaySpec__VarAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__VarAssignment_4_1_1_in_rule__CellDisplaySpec__Group_4_1__1__Impl4002);
            rule__CellDisplaySpec__VarAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getVarAssignment_4_1_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_4_1__1__Impl"


    // $ANTLR start "rule__CellVarSpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1961:1: rule__CellVarSpec__Group__0 : rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 ;
    public final void rule__CellVarSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1965:1: ( rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1966:2: rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__04036);
            rule__CellVarSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__04039);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1973:1: rule__CellVarSpec__Group__0__Impl : ( 'var' ) ;
    public final void rule__CellVarSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1977:1: ( ( 'var' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1978:1: ( 'var' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1978:1: ( 'var' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1979:1: 'var'
            {
             before(grammarAccess.getCellVarSpecAccess().getVarKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__CellVarSpec__Group__0__Impl4067); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1992:1: rule__CellVarSpec__Group__1 : rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 ;
    public final void rule__CellVarSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1996:1: ( rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1997:2: rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__14098);
            rule__CellVarSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__14101);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2004:1: rule__CellVarSpec__Group__1__Impl : ( ( rule__CellVarSpec__TypeAssignment_1 ) ) ;
    public final void rule__CellVarSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2008:1: ( ( ( rule__CellVarSpec__TypeAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2009:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2009:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2010:1: ( rule__CellVarSpec__TypeAssignment_1 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2011:1: ( rule__CellVarSpec__TypeAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2011:2: rule__CellVarSpec__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl4128);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2021:1: rule__CellVarSpec__Group__2 : rule__CellVarSpec__Group__2__Impl ;
    public final void rule__CellVarSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2025:1: ( rule__CellVarSpec__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2026:2: rule__CellVarSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__24158);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2032:1: rule__CellVarSpec__Group__2__Impl : ( ( rule__CellVarSpec__NameAssignment_2 ) ) ;
    public final void rule__CellVarSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2036:1: ( ( ( rule__CellVarSpec__NameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2037:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2037:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2038:1: ( rule__CellVarSpec__NameAssignment_2 )
            {
             before(grammarAccess.getCellVarSpecAccess().getNameAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2039:1: ( rule__CellVarSpec__NameAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2039:2: rule__CellVarSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl4185);
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


    // $ANTLR start "rule__GlobalCellStateSpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2055:1: rule__GlobalCellStateSpec__Group__0 : rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1 ;
    public final void rule__GlobalCellStateSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2059:1: ( rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2060:2: rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__0__Impl_in_rule__GlobalCellStateSpec__Group__04221);
            rule__GlobalCellStateSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__1_in_rule__GlobalCellStateSpec__Group__04224);
            rule__GlobalCellStateSpec__Group__1();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__0"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2067:1: rule__GlobalCellStateSpec__Group__0__Impl : ( 'states' ) ;
    public final void rule__GlobalCellStateSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2071:1: ( ( 'states' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2072:1: ( 'states' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2072:1: ( 'states' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2073:1: 'states'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__GlobalCellStateSpec__Group__0__Impl4252); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getStatesKeyword_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__0__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2086:1: rule__GlobalCellStateSpec__Group__1 : rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2 ;
    public final void rule__GlobalCellStateSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2090:1: ( rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2091:2: rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__1__Impl_in_rule__GlobalCellStateSpec__Group__14283);
            rule__GlobalCellStateSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__2_in_rule__GlobalCellStateSpec__Group__14286);
            rule__GlobalCellStateSpec__Group__2();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__1"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2098:1: rule__GlobalCellStateSpec__Group__1__Impl : ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2102:1: ( ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2103:1: ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2103:1: ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2104:1: ( rule__GlobalCellStateSpec__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2105:1: ( rule__GlobalCellStateSpec__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2105:2: rule__GlobalCellStateSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__NameAssignment_1_in_rule__GlobalCellStateSpec__Group__1__Impl4313);
            rule__GlobalCellStateSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__1__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2115:1: rule__GlobalCellStateSpec__Group__2 : rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3 ;
    public final void rule__GlobalCellStateSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2119:1: ( rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2120:2: rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__2__Impl_in_rule__GlobalCellStateSpec__Group__24343);
            rule__GlobalCellStateSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__3_in_rule__GlobalCellStateSpec__Group__24346);
            rule__GlobalCellStateSpec__Group__3();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__2"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2127:1: rule__GlobalCellStateSpec__Group__2__Impl : ( ( rule__GlobalCellStateSpec__Group_2__0 )? ) ;
    public final void rule__GlobalCellStateSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2131:1: ( ( ( rule__GlobalCellStateSpec__Group_2__0 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2132:1: ( ( rule__GlobalCellStateSpec__Group_2__0 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2132:1: ( ( rule__GlobalCellStateSpec__Group_2__0 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2133:1: ( rule__GlobalCellStateSpec__Group_2__0 )?
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2134:1: ( rule__GlobalCellStateSpec__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2134:2: rule__GlobalCellStateSpec__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__0_in_rule__GlobalCellStateSpec__Group__2__Impl4373);
                    rule__GlobalCellStateSpec__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__2__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2144:1: rule__GlobalCellStateSpec__Group__3 : rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4 ;
    public final void rule__GlobalCellStateSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2148:1: ( rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2149:2: rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__3__Impl_in_rule__GlobalCellStateSpec__Group__34404);
            rule__GlobalCellStateSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__4_in_rule__GlobalCellStateSpec__Group__34407);
            rule__GlobalCellStateSpec__Group__4();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__3"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2156:1: rule__GlobalCellStateSpec__Group__3__Impl : ( '{' ) ;
    public final void rule__GlobalCellStateSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2160:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2161:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2161:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2162:1: '{'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__GlobalCellStateSpec__Group__3__Impl4435); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__3__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2175:1: rule__GlobalCellStateSpec__Group__4 : rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5 ;
    public final void rule__GlobalCellStateSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2179:1: ( rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2180:2: rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__4__Impl_in_rule__GlobalCellStateSpec__Group__44466);
            rule__GlobalCellStateSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__5_in_rule__GlobalCellStateSpec__Group__44469);
            rule__GlobalCellStateSpec__Group__5();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__4"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2187:1: rule__GlobalCellStateSpec__Group__4__Impl : ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) ) ;
    public final void rule__GlobalCellStateSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2191:1: ( ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2192:1: ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2192:1: ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2193:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2193:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2194:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2195:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2195:2: rule__GlobalCellStateSpec__StatesAssignment_4
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4498);
            rule__GlobalCellStateSpec__StatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2198:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2199:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )*
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2200:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2200:2: rule__GlobalCellStateSpec__StatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4510);
            	    rule__GlobalCellStateSpec__StatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__4__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2211:1: rule__GlobalCellStateSpec__Group__5 : rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6 ;
    public final void rule__GlobalCellStateSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2215:1: ( rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2216:2: rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__5__Impl_in_rule__GlobalCellStateSpec__Group__54543);
            rule__GlobalCellStateSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__6_in_rule__GlobalCellStateSpec__Group__54546);
            rule__GlobalCellStateSpec__Group__6();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__5"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__5__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2223:1: rule__GlobalCellStateSpec__Group__5__Impl : ( 'start' ) ;
    public final void rule__GlobalCellStateSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2227:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2228:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2228:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2229:1: 'start'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__GlobalCellStateSpec__Group__5__Impl4574); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getStartKeyword_5()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__5__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2242:1: rule__GlobalCellStateSpec__Group__6 : rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7 ;
    public final void rule__GlobalCellStateSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2246:1: ( rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2247:2: rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__6__Impl_in_rule__GlobalCellStateSpec__Group__64605);
            rule__GlobalCellStateSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__7_in_rule__GlobalCellStateSpec__Group__64608);
            rule__GlobalCellStateSpec__Group__7();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__6"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__6__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2254:1: rule__GlobalCellStateSpec__Group__6__Impl : ( '=' ) ;
    public final void rule__GlobalCellStateSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2258:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2259:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2259:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2260:1: '='
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getEqualsSignKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__GlobalCellStateSpec__Group__6__Impl4636); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__6__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__7"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2273:1: rule__GlobalCellStateSpec__Group__7 : rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8 ;
    public final void rule__GlobalCellStateSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2277:1: ( rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2278:2: rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__7__Impl_in_rule__GlobalCellStateSpec__Group__74667);
            rule__GlobalCellStateSpec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__8_in_rule__GlobalCellStateSpec__Group__74670);
            rule__GlobalCellStateSpec__Group__8();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__7"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__7__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2285:1: rule__GlobalCellStateSpec__Group__7__Impl : ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) ) ;
    public final void rule__GlobalCellStateSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2289:1: ( ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2290:1: ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2290:1: ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2291:1: ( rule__GlobalCellStateSpec__StartAssignment_7 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartAssignment_7()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2292:1: ( rule__GlobalCellStateSpec__StartAssignment_7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2292:2: rule__GlobalCellStateSpec__StartAssignment_7
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__StartAssignment_7_in_rule__GlobalCellStateSpec__Group__7__Impl4697);
            rule__GlobalCellStateSpec__StartAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getStartAssignment_7()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__7__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__8"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2302:1: rule__GlobalCellStateSpec__Group__8 : rule__GlobalCellStateSpec__Group__8__Impl ;
    public final void rule__GlobalCellStateSpec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2306:1: ( rule__GlobalCellStateSpec__Group__8__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2307:2: rule__GlobalCellStateSpec__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__8__Impl_in_rule__GlobalCellStateSpec__Group__84727);
            rule__GlobalCellStateSpec__Group__8__Impl();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__8"


    // $ANTLR start "rule__GlobalCellStateSpec__Group__8__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2313:1: rule__GlobalCellStateSpec__Group__8__Impl : ( '}' ) ;
    public final void rule__GlobalCellStateSpec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2317:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2318:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2318:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2319:1: '}'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__GlobalCellStateSpec__Group__8__Impl4755); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group__8__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2350:1: rule__GlobalCellStateSpec__Group_2__0 : rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1 ;
    public final void rule__GlobalCellStateSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2354:1: ( rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2355:2: rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2__04804);
            rule__GlobalCellStateSpec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__1_in_rule__GlobalCellStateSpec__Group_2__04807);
            rule__GlobalCellStateSpec__Group_2__1();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__0"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2362:1: rule__GlobalCellStateSpec__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GlobalCellStateSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2366:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2367:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2367:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2368:1: '('
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__GlobalCellStateSpec__Group_2__0__Impl4835); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__0__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2381:1: rule__GlobalCellStateSpec__Group_2__1 : rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2 ;
    public final void rule__GlobalCellStateSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2385:1: ( rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2386:2: rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2__14866);
            rule__GlobalCellStateSpec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__2_in_rule__GlobalCellStateSpec__Group_2__14869);
            rule__GlobalCellStateSpec__Group_2__2();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__1"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2393:1: rule__GlobalCellStateSpec__Group_2__1__Impl : ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2397:1: ( ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2398:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2398:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2399:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2400:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2400:2: rule__GlobalCellStateSpec__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_1_in_rule__GlobalCellStateSpec__Group_2__1__Impl4896);
            rule__GlobalCellStateSpec__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_1()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__1__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2410:1: rule__GlobalCellStateSpec__Group_2__2 : rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3 ;
    public final void rule__GlobalCellStateSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2414:1: ( rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2415:2: rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__2__Impl_in_rule__GlobalCellStateSpec__Group_2__24926);
            rule__GlobalCellStateSpec__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__3_in_rule__GlobalCellStateSpec__Group_2__24929);
            rule__GlobalCellStateSpec__Group_2__3();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__2"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2422:1: rule__GlobalCellStateSpec__Group_2__2__Impl : ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* ) ;
    public final void rule__GlobalCellStateSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2426:1: ( ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2427:1: ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2427:1: ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2428:1: ( rule__GlobalCellStateSpec__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2429:1: ( rule__GlobalCellStateSpec__Group_2_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2429:2: rule__GlobalCellStateSpec__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0_in_rule__GlobalCellStateSpec__Group_2__2__Impl4956);
            	    rule__GlobalCellStateSpec__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__2__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2439:1: rule__GlobalCellStateSpec__Group_2__3 : rule__GlobalCellStateSpec__Group_2__3__Impl ;
    public final void rule__GlobalCellStateSpec__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2443:1: ( rule__GlobalCellStateSpec__Group_2__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2444:2: rule__GlobalCellStateSpec__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__3__Impl_in_rule__GlobalCellStateSpec__Group_2__34987);
            rule__GlobalCellStateSpec__Group_2__3__Impl();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__3"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2450:1: rule__GlobalCellStateSpec__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GlobalCellStateSpec__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2454:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2455:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2455:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2456:1: ')'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getRightParenthesisKeyword_2_3()); 
            match(input,29,FOLLOW_29_in_rule__GlobalCellStateSpec__Group_2__3__Impl5015); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2__3__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2_2__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2477:1: rule__GlobalCellStateSpec__Group_2_2__0 : rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1 ;
    public final void rule__GlobalCellStateSpec__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2481:1: ( rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2482:2: rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2_2__05054);
            rule__GlobalCellStateSpec__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1_in_rule__GlobalCellStateSpec__Group_2_2__05057);
            rule__GlobalCellStateSpec__Group_2_2__1();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2_2__0"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2_2__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2489:1: rule__GlobalCellStateSpec__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GlobalCellStateSpec__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2493:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2494:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2494:1: ( ',' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2495:1: ','
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getCommaKeyword_2_2_0()); 
            match(input,30,FOLLOW_30_in_rule__GlobalCellStateSpec__Group_2_2__0__Impl5085); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2_2__0__Impl"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2_2__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2508:1: rule__GlobalCellStateSpec__Group_2_2__1 : rule__GlobalCellStateSpec__Group_2_2__1__Impl ;
    public final void rule__GlobalCellStateSpec__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2512:1: ( rule__GlobalCellStateSpec__Group_2_2__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2513:2: rule__GlobalCellStateSpec__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2_2__15116);
            rule__GlobalCellStateSpec__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2_2__1"


    // $ANTLR start "rule__GlobalCellStateSpec__Group_2_2__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2519:1: rule__GlobalCellStateSpec__Group_2_2__1__Impl : ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2523:1: ( ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2524:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2524:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2525:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_2_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2526:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2526:2: rule__GlobalCellStateSpec__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_2_1_in_rule__GlobalCellStateSpec__Group_2_2__1__Impl5143);
            rule__GlobalCellStateSpec__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__Group_2_2__1__Impl"


    // $ANTLR start "rule__StateParamSpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2540:1: rule__StateParamSpec__Group__0 : rule__StateParamSpec__Group__0__Impl rule__StateParamSpec__Group__1 ;
    public final void rule__StateParamSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2544:1: ( rule__StateParamSpec__Group__0__Impl rule__StateParamSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2545:2: rule__StateParamSpec__Group__0__Impl rule__StateParamSpec__Group__1
            {
            pushFollow(FOLLOW_rule__StateParamSpec__Group__0__Impl_in_rule__StateParamSpec__Group__05177);
            rule__StateParamSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateParamSpec__Group__1_in_rule__StateParamSpec__Group__05180);
            rule__StateParamSpec__Group__1();

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
    // $ANTLR end "rule__StateParamSpec__Group__0"


    // $ANTLR start "rule__StateParamSpec__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2552:1: rule__StateParamSpec__Group__0__Impl : ( ( rule__StateParamSpec__TypeAssignment_0 ) ) ;
    public final void rule__StateParamSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2556:1: ( ( ( rule__StateParamSpec__TypeAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2557:1: ( ( rule__StateParamSpec__TypeAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2557:1: ( ( rule__StateParamSpec__TypeAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2558:1: ( rule__StateParamSpec__TypeAssignment_0 )
            {
             before(grammarAccess.getStateParamSpecAccess().getTypeAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2559:1: ( rule__StateParamSpec__TypeAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2559:2: rule__StateParamSpec__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StateParamSpec__TypeAssignment_0_in_rule__StateParamSpec__Group__0__Impl5207);
            rule__StateParamSpec__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateParamSpecAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__StateParamSpec__Group__0__Impl"


    // $ANTLR start "rule__StateParamSpec__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2569:1: rule__StateParamSpec__Group__1 : rule__StateParamSpec__Group__1__Impl ;
    public final void rule__StateParamSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2573:1: ( rule__StateParamSpec__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2574:2: rule__StateParamSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StateParamSpec__Group__1__Impl_in_rule__StateParamSpec__Group__15237);
            rule__StateParamSpec__Group__1__Impl();

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
    // $ANTLR end "rule__StateParamSpec__Group__1"


    // $ANTLR start "rule__StateParamSpec__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2580:1: rule__StateParamSpec__Group__1__Impl : ( ( rule__StateParamSpec__NameAssignment_1 ) ) ;
    public final void rule__StateParamSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2584:1: ( ( ( rule__StateParamSpec__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2585:1: ( ( rule__StateParamSpec__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2585:1: ( ( rule__StateParamSpec__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2586:1: ( rule__StateParamSpec__NameAssignment_1 )
            {
             before(grammarAccess.getStateParamSpecAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2587:1: ( rule__StateParamSpec__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2587:2: rule__StateParamSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StateParamSpec__NameAssignment_1_in_rule__StateParamSpec__Group__1__Impl5264);
            rule__StateParamSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateParamSpecAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StateParamSpec__Group__1__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2601:1: rule__LocalCellStateSpec__Group__0 : rule__LocalCellStateSpec__Group__0__Impl rule__LocalCellStateSpec__Group__1 ;
    public final void rule__LocalCellStateSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2605:1: ( rule__LocalCellStateSpec__Group__0__Impl rule__LocalCellStateSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2606:2: rule__LocalCellStateSpec__Group__0__Impl rule__LocalCellStateSpec__Group__1
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__0__Impl_in_rule__LocalCellStateSpec__Group__05298);
            rule__LocalCellStateSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__1_in_rule__LocalCellStateSpec__Group__05301);
            rule__LocalCellStateSpec__Group__1();

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__0"


    // $ANTLR start "rule__LocalCellStateSpec__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2613:1: rule__LocalCellStateSpec__Group__0__Impl : ( 'states' ) ;
    public final void rule__LocalCellStateSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2617:1: ( ( 'states' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2618:1: ( 'states' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2618:1: ( 'states' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2619:1: 'states'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__LocalCellStateSpec__Group__0__Impl5329); 
             after(grammarAccess.getLocalCellStateSpecAccess().getStatesKeyword_0()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__0__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2632:1: rule__LocalCellStateSpec__Group__1 : rule__LocalCellStateSpec__Group__1__Impl rule__LocalCellStateSpec__Group__2 ;
    public final void rule__LocalCellStateSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2636:1: ( rule__LocalCellStateSpec__Group__1__Impl rule__LocalCellStateSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2637:2: rule__LocalCellStateSpec__Group__1__Impl rule__LocalCellStateSpec__Group__2
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__1__Impl_in_rule__LocalCellStateSpec__Group__15360);
            rule__LocalCellStateSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__2_in_rule__LocalCellStateSpec__Group__15363);
            rule__LocalCellStateSpec__Group__2();

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__1"


    // $ANTLR start "rule__LocalCellStateSpec__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2644:1: rule__LocalCellStateSpec__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalCellStateSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2648:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2649:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2649:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2650:1: '{'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__LocalCellStateSpec__Group__1__Impl5391); 
             after(grammarAccess.getLocalCellStateSpecAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__1__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2663:1: rule__LocalCellStateSpec__Group__2 : rule__LocalCellStateSpec__Group__2__Impl rule__LocalCellStateSpec__Group__3 ;
    public final void rule__LocalCellStateSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2667:1: ( rule__LocalCellStateSpec__Group__2__Impl rule__LocalCellStateSpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2668:2: rule__LocalCellStateSpec__Group__2__Impl rule__LocalCellStateSpec__Group__3
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__2__Impl_in_rule__LocalCellStateSpec__Group__25422);
            rule__LocalCellStateSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__3_in_rule__LocalCellStateSpec__Group__25425);
            rule__LocalCellStateSpec__Group__3();

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__2"


    // $ANTLR start "rule__LocalCellStateSpec__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2675:1: rule__LocalCellStateSpec__Group__2__Impl : ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) ) ;
    public final void rule__LocalCellStateSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2679:1: ( ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2680:1: ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2680:1: ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2681:1: ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2681:1: ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2682:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2683:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2683:2: rule__LocalCellStateSpec__StatesAssignment_2
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__StatesAssignment_2_in_rule__LocalCellStateSpec__Group__2__Impl5454);
            rule__LocalCellStateSpec__StatesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalCellStateSpecAccess().getStatesAssignment_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2686:1: ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2687:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )*
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2688:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2688:2: rule__LocalCellStateSpec__StatesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__LocalCellStateSpec__StatesAssignment_2_in_rule__LocalCellStateSpec__Group__2__Impl5466);
            	    rule__LocalCellStateSpec__StatesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getLocalCellStateSpecAccess().getStatesAssignment_2()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__2__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2699:1: rule__LocalCellStateSpec__Group__3 : rule__LocalCellStateSpec__Group__3__Impl rule__LocalCellStateSpec__Group__4 ;
    public final void rule__LocalCellStateSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2703:1: ( rule__LocalCellStateSpec__Group__3__Impl rule__LocalCellStateSpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2704:2: rule__LocalCellStateSpec__Group__3__Impl rule__LocalCellStateSpec__Group__4
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__3__Impl_in_rule__LocalCellStateSpec__Group__35499);
            rule__LocalCellStateSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__4_in_rule__LocalCellStateSpec__Group__35502);
            rule__LocalCellStateSpec__Group__4();

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__3"


    // $ANTLR start "rule__LocalCellStateSpec__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2711:1: rule__LocalCellStateSpec__Group__3__Impl : ( 'start' ) ;
    public final void rule__LocalCellStateSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2715:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2716:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2716:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2717:1: 'start'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__LocalCellStateSpec__Group__3__Impl5530); 
             after(grammarAccess.getLocalCellStateSpecAccess().getStartKeyword_3()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__3__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2730:1: rule__LocalCellStateSpec__Group__4 : rule__LocalCellStateSpec__Group__4__Impl rule__LocalCellStateSpec__Group__5 ;
    public final void rule__LocalCellStateSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2734:1: ( rule__LocalCellStateSpec__Group__4__Impl rule__LocalCellStateSpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2735:2: rule__LocalCellStateSpec__Group__4__Impl rule__LocalCellStateSpec__Group__5
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__4__Impl_in_rule__LocalCellStateSpec__Group__45561);
            rule__LocalCellStateSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__5_in_rule__LocalCellStateSpec__Group__45564);
            rule__LocalCellStateSpec__Group__5();

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__4"


    // $ANTLR start "rule__LocalCellStateSpec__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2742:1: rule__LocalCellStateSpec__Group__4__Impl : ( '=' ) ;
    public final void rule__LocalCellStateSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2746:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2747:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2747:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2748:1: '='
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__LocalCellStateSpec__Group__4__Impl5592); 
             after(grammarAccess.getLocalCellStateSpecAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__4__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2761:1: rule__LocalCellStateSpec__Group__5 : rule__LocalCellStateSpec__Group__5__Impl rule__LocalCellStateSpec__Group__6 ;
    public final void rule__LocalCellStateSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2765:1: ( rule__LocalCellStateSpec__Group__5__Impl rule__LocalCellStateSpec__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2766:2: rule__LocalCellStateSpec__Group__5__Impl rule__LocalCellStateSpec__Group__6
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__5__Impl_in_rule__LocalCellStateSpec__Group__55623);
            rule__LocalCellStateSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__6_in_rule__LocalCellStateSpec__Group__55626);
            rule__LocalCellStateSpec__Group__6();

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__5"


    // $ANTLR start "rule__LocalCellStateSpec__Group__5__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2773:1: rule__LocalCellStateSpec__Group__5__Impl : ( ( rule__LocalCellStateSpec__StartAssignment_5 ) ) ;
    public final void rule__LocalCellStateSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2777:1: ( ( ( rule__LocalCellStateSpec__StartAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2778:1: ( ( rule__LocalCellStateSpec__StartAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2778:1: ( ( rule__LocalCellStateSpec__StartAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2779:1: ( rule__LocalCellStateSpec__StartAssignment_5 )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2780:1: ( rule__LocalCellStateSpec__StartAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2780:2: rule__LocalCellStateSpec__StartAssignment_5
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__StartAssignment_5_in_rule__LocalCellStateSpec__Group__5__Impl5653);
            rule__LocalCellStateSpec__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLocalCellStateSpecAccess().getStartAssignment_5()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__5__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2790:1: rule__LocalCellStateSpec__Group__6 : rule__LocalCellStateSpec__Group__6__Impl ;
    public final void rule__LocalCellStateSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2794:1: ( rule__LocalCellStateSpec__Group__6__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2795:2: rule__LocalCellStateSpec__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__LocalCellStateSpec__Group__6__Impl_in_rule__LocalCellStateSpec__Group__65683);
            rule__LocalCellStateSpec__Group__6__Impl();

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__6"


    // $ANTLR start "rule__LocalCellStateSpec__Group__6__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2801:1: rule__LocalCellStateSpec__Group__6__Impl : ( '}' ) ;
    public final void rule__LocalCellStateSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2805:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2806:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2806:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2807:1: '}'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__LocalCellStateSpec__Group__6__Impl5711); 
             after(grammarAccess.getLocalCellStateSpecAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__Group__6__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2834:1: rule__CellStateSpecReference__Group__0 : rule__CellStateSpecReference__Group__0__Impl rule__CellStateSpecReference__Group__1 ;
    public final void rule__CellStateSpecReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2838:1: ( rule__CellStateSpecReference__Group__0__Impl rule__CellStateSpecReference__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2839:2: rule__CellStateSpecReference__Group__0__Impl rule__CellStateSpecReference__Group__1
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group__0__Impl_in_rule__CellStateSpecReference__Group__05756);
            rule__CellStateSpecReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpecReference__Group__1_in_rule__CellStateSpecReference__Group__05759);
            rule__CellStateSpecReference__Group__1();

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
    // $ANTLR end "rule__CellStateSpecReference__Group__0"


    // $ANTLR start "rule__CellStateSpecReference__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2846:1: rule__CellStateSpecReference__Group__0__Impl : ( 'states' ) ;
    public final void rule__CellStateSpecReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2850:1: ( ( 'states' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2851:1: ( 'states' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2851:1: ( 'states' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2852:1: 'states'
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStatesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__CellStateSpecReference__Group__0__Impl5787); 
             after(grammarAccess.getCellStateSpecReferenceAccess().getStatesKeyword_0()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group__0__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2865:1: rule__CellStateSpecReference__Group__1 : rule__CellStateSpecReference__Group__1__Impl rule__CellStateSpecReference__Group__2 ;
    public final void rule__CellStateSpecReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2869:1: ( rule__CellStateSpecReference__Group__1__Impl rule__CellStateSpecReference__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2870:2: rule__CellStateSpecReference__Group__1__Impl rule__CellStateSpecReference__Group__2
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group__1__Impl_in_rule__CellStateSpecReference__Group__15818);
            rule__CellStateSpecReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpecReference__Group__2_in_rule__CellStateSpecReference__Group__15821);
            rule__CellStateSpecReference__Group__2();

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
    // $ANTLR end "rule__CellStateSpecReference__Group__1"


    // $ANTLR start "rule__CellStateSpecReference__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2877:1: rule__CellStateSpecReference__Group__1__Impl : ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) ) ;
    public final void rule__CellStateSpecReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2881:1: ( ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2882:1: ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2882:1: ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2883:1: ( rule__CellStateSpecReference__StateSpecAssignment_1 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2884:1: ( rule__CellStateSpecReference__StateSpecAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2884:2: rule__CellStateSpecReference__StateSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__StateSpecAssignment_1_in_rule__CellStateSpecReference__Group__1__Impl5848);
            rule__CellStateSpecReference__StateSpecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecAssignment_1()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group__1__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2894:1: rule__CellStateSpecReference__Group__2 : rule__CellStateSpecReference__Group__2__Impl ;
    public final void rule__CellStateSpecReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2898:1: ( rule__CellStateSpecReference__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2899:2: rule__CellStateSpecReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group__2__Impl_in_rule__CellStateSpecReference__Group__25878);
            rule__CellStateSpecReference__Group__2__Impl();

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
    // $ANTLR end "rule__CellStateSpecReference__Group__2"


    // $ANTLR start "rule__CellStateSpecReference__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2905:1: rule__CellStateSpecReference__Group__2__Impl : ( ( rule__CellStateSpecReference__Group_2__0 )? ) ;
    public final void rule__CellStateSpecReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2909:1: ( ( ( rule__CellStateSpecReference__Group_2__0 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2910:1: ( ( rule__CellStateSpecReference__Group_2__0 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2910:1: ( ( rule__CellStateSpecReference__Group_2__0 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2911:1: ( rule__CellStateSpecReference__Group_2__0 )?
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2912:1: ( rule__CellStateSpecReference__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2912:2: rule__CellStateSpecReference__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__0_in_rule__CellStateSpecReference__Group__2__Impl5905);
                    rule__CellStateSpecReference__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellStateSpecReferenceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group__2__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2928:1: rule__CellStateSpecReference__Group_2__0 : rule__CellStateSpecReference__Group_2__0__Impl rule__CellStateSpecReference__Group_2__1 ;
    public final void rule__CellStateSpecReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2932:1: ( rule__CellStateSpecReference__Group_2__0__Impl rule__CellStateSpecReference__Group_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2933:2: rule__CellStateSpecReference__Group_2__0__Impl rule__CellStateSpecReference__Group_2__1
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__0__Impl_in_rule__CellStateSpecReference__Group_2__05942);
            rule__CellStateSpecReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__1_in_rule__CellStateSpecReference__Group_2__05945);
            rule__CellStateSpecReference__Group_2__1();

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__0"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2940:1: rule__CellStateSpecReference__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CellStateSpecReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2944:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2945:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2945:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2946:1: '('
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__CellStateSpecReference__Group_2__0__Impl5973); 
             after(grammarAccess.getCellStateSpecReferenceAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__0__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2959:1: rule__CellStateSpecReference__Group_2__1 : rule__CellStateSpecReference__Group_2__1__Impl rule__CellStateSpecReference__Group_2__2 ;
    public final void rule__CellStateSpecReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2963:1: ( rule__CellStateSpecReference__Group_2__1__Impl rule__CellStateSpecReference__Group_2__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2964:2: rule__CellStateSpecReference__Group_2__1__Impl rule__CellStateSpecReference__Group_2__2
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__1__Impl_in_rule__CellStateSpecReference__Group_2__16004);
            rule__CellStateSpecReference__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__2_in_rule__CellStateSpecReference__Group_2__16007);
            rule__CellStateSpecReference__Group_2__2();

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__1"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2971:1: rule__CellStateSpecReference__Group_2__1__Impl : ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) ) ;
    public final void rule__CellStateSpecReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2975:1: ( ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2976:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2976:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2977:1: ( rule__CellStateSpecReference__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsAssignment_2_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2978:1: ( rule__CellStateSpecReference__ParamsAssignment_2_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2978:2: rule__CellStateSpecReference__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__ParamsAssignment_2_1_in_rule__CellStateSpecReference__Group_2__1__Impl6034);
            rule__CellStateSpecReference__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecReferenceAccess().getParamsAssignment_2_1()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__1__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2988:1: rule__CellStateSpecReference__Group_2__2 : rule__CellStateSpecReference__Group_2__2__Impl rule__CellStateSpecReference__Group_2__3 ;
    public final void rule__CellStateSpecReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2992:1: ( rule__CellStateSpecReference__Group_2__2__Impl rule__CellStateSpecReference__Group_2__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2993:2: rule__CellStateSpecReference__Group_2__2__Impl rule__CellStateSpecReference__Group_2__3
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__2__Impl_in_rule__CellStateSpecReference__Group_2__26064);
            rule__CellStateSpecReference__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__3_in_rule__CellStateSpecReference__Group_2__26067);
            rule__CellStateSpecReference__Group_2__3();

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__2"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3000:1: rule__CellStateSpecReference__Group_2__2__Impl : ( ( rule__CellStateSpecReference__Group_2_2__0 )* ) ;
    public final void rule__CellStateSpecReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3004:1: ( ( ( rule__CellStateSpecReference__Group_2_2__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3005:1: ( ( rule__CellStateSpecReference__Group_2_2__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3005:1: ( ( rule__CellStateSpecReference__Group_2_2__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3006:1: ( rule__CellStateSpecReference__Group_2_2__0 )*
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getGroup_2_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3007:1: ( rule__CellStateSpecReference__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3007:2: rule__CellStateSpecReference__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2_2__0_in_rule__CellStateSpecReference__Group_2__2__Impl6094);
            	    rule__CellStateSpecReference__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCellStateSpecReferenceAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__2__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3017:1: rule__CellStateSpecReference__Group_2__3 : rule__CellStateSpecReference__Group_2__3__Impl ;
    public final void rule__CellStateSpecReference__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3021:1: ( rule__CellStateSpecReference__Group_2__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3022:2: rule__CellStateSpecReference__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2__3__Impl_in_rule__CellStateSpecReference__Group_2__36125);
            rule__CellStateSpecReference__Group_2__3__Impl();

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__3"


    // $ANTLR start "rule__CellStateSpecReference__Group_2__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3028:1: rule__CellStateSpecReference__Group_2__3__Impl : ( ')' ) ;
    public final void rule__CellStateSpecReference__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3032:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3033:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3033:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3034:1: ')'
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getRightParenthesisKeyword_2_3()); 
            match(input,29,FOLLOW_29_in_rule__CellStateSpecReference__Group_2__3__Impl6153); 
             after(grammarAccess.getCellStateSpecReferenceAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2__3__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group_2_2__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3055:1: rule__CellStateSpecReference__Group_2_2__0 : rule__CellStateSpecReference__Group_2_2__0__Impl rule__CellStateSpecReference__Group_2_2__1 ;
    public final void rule__CellStateSpecReference__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3059:1: ( rule__CellStateSpecReference__Group_2_2__0__Impl rule__CellStateSpecReference__Group_2_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3060:2: rule__CellStateSpecReference__Group_2_2__0__Impl rule__CellStateSpecReference__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2_2__0__Impl_in_rule__CellStateSpecReference__Group_2_2__06192);
            rule__CellStateSpecReference__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2_2__1_in_rule__CellStateSpecReference__Group_2_2__06195);
            rule__CellStateSpecReference__Group_2_2__1();

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2_2__0"


    // $ANTLR start "rule__CellStateSpecReference__Group_2_2__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3067:1: rule__CellStateSpecReference__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__CellStateSpecReference__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3071:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3072:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3072:1: ( ',' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3073:1: ','
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getCommaKeyword_2_2_0()); 
            match(input,30,FOLLOW_30_in_rule__CellStateSpecReference__Group_2_2__0__Impl6223); 
             after(grammarAccess.getCellStateSpecReferenceAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2_2__0__Impl"


    // $ANTLR start "rule__CellStateSpecReference__Group_2_2__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3086:1: rule__CellStateSpecReference__Group_2_2__1 : rule__CellStateSpecReference__Group_2_2__1__Impl ;
    public final void rule__CellStateSpecReference__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3090:1: ( rule__CellStateSpecReference__Group_2_2__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3091:2: rule__CellStateSpecReference__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__Group_2_2__1__Impl_in_rule__CellStateSpecReference__Group_2_2__16254);
            rule__CellStateSpecReference__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2_2__1"


    // $ANTLR start "rule__CellStateSpecReference__Group_2_2__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3097:1: rule__CellStateSpecReference__Group_2_2__1__Impl : ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__CellStateSpecReference__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3101:1: ( ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3102:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3102:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3103:1: ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsAssignment_2_2_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3104:1: ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3104:2: rule__CellStateSpecReference__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__CellStateSpecReference__ParamsAssignment_2_2_1_in_rule__CellStateSpecReference__Group_2_2__1__Impl6281);
            rule__CellStateSpecReference__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecReferenceAccess().getParamsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__CellStateSpecReference__Group_2_2__1__Impl"


    // $ANTLR start "rule__CellState__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3118:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3122:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3123:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_rule__CellState__Group__0__Impl_in_rule__CellState__Group__06315);
            rule__CellState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__1_in_rule__CellState__Group__06318);
            rule__CellState__Group__1();

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
    // $ANTLR end "rule__CellState__Group__0"


    // $ANTLR start "rule__CellState__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3130:1: rule__CellState__Group__0__Impl : ( ( rule__CellState__NameAssignment_0 ) ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3134:1: ( ( ( rule__CellState__NameAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3135:1: ( ( rule__CellState__NameAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3135:1: ( ( rule__CellState__NameAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3136:1: ( rule__CellState__NameAssignment_0 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3137:1: ( rule__CellState__NameAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3137:2: rule__CellState__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CellState__NameAssignment_0_in_rule__CellState__Group__0__Impl6345);
            rule__CellState__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__CellState__Group__0__Impl"


    // $ANTLR start "rule__CellState__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3147:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl rule__CellState__Group__2 ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3151:1: ( rule__CellState__Group__1__Impl rule__CellState__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3152:2: rule__CellState__Group__1__Impl rule__CellState__Group__2
            {
            pushFollow(FOLLOW_rule__CellState__Group__1__Impl_in_rule__CellState__Group__16375);
            rule__CellState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__2_in_rule__CellState__Group__16378);
            rule__CellState__Group__2();

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
    // $ANTLR end "rule__CellState__Group__1"


    // $ANTLR start "rule__CellState__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3159:1: rule__CellState__Group__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3163:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3164:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3164:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3165:1: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__CellState__Group__1__Impl6406); 
             after(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CellState__Group__1__Impl"


    // $ANTLR start "rule__CellState__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3178:1: rule__CellState__Group__2 : rule__CellState__Group__2__Impl rule__CellState__Group__3 ;
    public final void rule__CellState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3182:1: ( rule__CellState__Group__2__Impl rule__CellState__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3183:2: rule__CellState__Group__2__Impl rule__CellState__Group__3
            {
            pushFollow(FOLLOW_rule__CellState__Group__2__Impl_in_rule__CellState__Group__26437);
            rule__CellState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__3_in_rule__CellState__Group__26440);
            rule__CellState__Group__3();

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
    // $ANTLR end "rule__CellState__Group__2"


    // $ANTLR start "rule__CellState__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3190:1: rule__CellState__Group__2__Impl : ( ( rule__CellState__DisplayAssignment_2 ) ) ;
    public final void rule__CellState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3194:1: ( ( ( rule__CellState__DisplayAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3195:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3195:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3196:1: ( rule__CellState__DisplayAssignment_2 )
            {
             before(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3197:1: ( rule__CellState__DisplayAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3197:2: rule__CellState__DisplayAssignment_2
            {
            pushFollow(FOLLOW_rule__CellState__DisplayAssignment_2_in_rule__CellState__Group__2__Impl6467);
            rule__CellState__DisplayAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 

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
    // $ANTLR end "rule__CellState__Group__2__Impl"


    // $ANTLR start "rule__CellState__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3207:1: rule__CellState__Group__3 : rule__CellState__Group__3__Impl rule__CellState__Group__4 ;
    public final void rule__CellState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3211:1: ( rule__CellState__Group__3__Impl rule__CellState__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3212:2: rule__CellState__Group__3__Impl rule__CellState__Group__4
            {
            pushFollow(FOLLOW_rule__CellState__Group__3__Impl_in_rule__CellState__Group__36497);
            rule__CellState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__4_in_rule__CellState__Group__36500);
            rule__CellState__Group__4();

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
    // $ANTLR end "rule__CellState__Group__3"


    // $ANTLR start "rule__CellState__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3219:1: rule__CellState__Group__3__Impl : ( ( rule__CellState__Group_3__0 )? ) ;
    public final void rule__CellState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3223:1: ( ( ( rule__CellState__Group_3__0 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3224:1: ( ( rule__CellState__Group_3__0 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3224:1: ( ( rule__CellState__Group_3__0 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3225:1: ( rule__CellState__Group_3__0 )?
            {
             before(grammarAccess.getCellStateAccess().getGroup_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3226:1: ( rule__CellState__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3226:2: rule__CellState__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CellState__Group_3__0_in_rule__CellState__Group__3__Impl6527);
                    rule__CellState__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellStateAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CellState__Group__3__Impl"


    // $ANTLR start "rule__CellState__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3236:1: rule__CellState__Group__4 : rule__CellState__Group__4__Impl ;
    public final void rule__CellState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3240:1: ( rule__CellState__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3241:2: rule__CellState__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CellState__Group__4__Impl_in_rule__CellState__Group__46558);
            rule__CellState__Group__4__Impl();

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
    // $ANTLR end "rule__CellState__Group__4"


    // $ANTLR start "rule__CellState__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3247:1: rule__CellState__Group__4__Impl : ( '}' ) ;
    public final void rule__CellState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3251:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3252:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3252:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3253:1: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__CellState__Group__4__Impl6586); 
             after(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__CellState__Group__4__Impl"


    // $ANTLR start "rule__CellState__Group_3__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3276:1: rule__CellState__Group_3__0 : rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 ;
    public final void rule__CellState__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3280:1: ( rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3281:2: rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__0__Impl_in_rule__CellState__Group_3__06627);
            rule__CellState__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group_3__1_in_rule__CellState__Group_3__06630);
            rule__CellState__Group_3__1();

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
    // $ANTLR end "rule__CellState__Group_3__0"


    // $ANTLR start "rule__CellState__Group_3__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3288:1: rule__CellState__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__CellState__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3292:1: ( ( 'transitions' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3293:1: ( 'transitions' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3293:1: ( 'transitions' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3294:1: 'transitions'
            {
             before(grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__CellState__Group_3__0__Impl6658); 
             after(grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0()); 

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
    // $ANTLR end "rule__CellState__Group_3__0__Impl"


    // $ANTLR start "rule__CellState__Group_3__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3307:1: rule__CellState__Group_3__1 : rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 ;
    public final void rule__CellState__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3311:1: ( rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3312:2: rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__1__Impl_in_rule__CellState__Group_3__16689);
            rule__CellState__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group_3__2_in_rule__CellState__Group_3__16692);
            rule__CellState__Group_3__2();

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
    // $ANTLR end "rule__CellState__Group_3__1"


    // $ANTLR start "rule__CellState__Group_3__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3319:1: rule__CellState__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3323:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3324:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3324:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3325:1: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,18,FOLLOW_18_in_rule__CellState__Group_3__1__Impl6720); 
             after(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__CellState__Group_3__1__Impl"


    // $ANTLR start "rule__CellState__Group_3__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3338:1: rule__CellState__Group_3__2 : rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 ;
    public final void rule__CellState__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3342:1: ( rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3343:2: rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__2__Impl_in_rule__CellState__Group_3__26751);
            rule__CellState__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group_3__3_in_rule__CellState__Group_3__26754);
            rule__CellState__Group_3__3();

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
    // $ANTLR end "rule__CellState__Group_3__2"


    // $ANTLR start "rule__CellState__Group_3__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3350:1: rule__CellState__Group_3__2__Impl : ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) ;
    public final void rule__CellState__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3354:1: ( ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3355:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3355:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3356:1: ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3356:1: ( ( rule__CellState__TransitionsAssignment_3_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3357:1: ( rule__CellState__TransitionsAssignment_3_2 )
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3358:1: ( rule__CellState__TransitionsAssignment_3_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3358:2: rule__CellState__TransitionsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl6783);
            rule__CellState__TransitionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3361:1: ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3362:1: ( rule__CellState__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3363:1: ( rule__CellState__TransitionsAssignment_3_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3363:2: rule__CellState__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl6795);
            	    rule__CellState__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

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
    // $ANTLR end "rule__CellState__Group_3__2__Impl"


    // $ANTLR start "rule__CellState__Group_3__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3374:1: rule__CellState__Group_3__3 : rule__CellState__Group_3__3__Impl ;
    public final void rule__CellState__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3378:1: ( rule__CellState__Group_3__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3379:2: rule__CellState__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__3__Impl_in_rule__CellState__Group_3__36828);
            rule__CellState__Group_3__3__Impl();

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
    // $ANTLR end "rule__CellState__Group_3__3"


    // $ANTLR start "rule__CellState__Group_3__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3385:1: rule__CellState__Group_3__3__Impl : ( '}' ) ;
    public final void rule__CellState__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3389:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3390:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3390:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3391:1: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,19,FOLLOW_19_in_rule__CellState__Group_3__3__Impl6856); 
             after(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__CellState__Group_3__3__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3412:1: rule__TransitionSpec__Group__0 : rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 ;
    public final void rule__TransitionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3416:1: ( rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3417:2: rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__0__Impl_in_rule__TransitionSpec__Group__06895);
            rule__TransitionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransitionSpec__Group__1_in_rule__TransitionSpec__Group__06898);
            rule__TransitionSpec__Group__1();

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
    // $ANTLR end "rule__TransitionSpec__Group__0"


    // $ANTLR start "rule__TransitionSpec__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3424:1: rule__TransitionSpec__Group__0__Impl : ( 'on' ) ;
    public final void rule__TransitionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3428:1: ( ( 'on' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3429:1: ( 'on' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3429:1: ( 'on' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3430:1: 'on'
            {
             before(grammarAccess.getTransitionSpecAccess().getOnKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__TransitionSpec__Group__0__Impl6926); 
             after(grammarAccess.getTransitionSpecAccess().getOnKeyword_0()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__0__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3443:1: rule__TransitionSpec__Group__1 : rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 ;
    public final void rule__TransitionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3447:1: ( rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3448:2: rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__1__Impl_in_rule__TransitionSpec__Group__16957);
            rule__TransitionSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransitionSpec__Group__2_in_rule__TransitionSpec__Group__16960);
            rule__TransitionSpec__Group__2();

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
    // $ANTLR end "rule__TransitionSpec__Group__1"


    // $ANTLR start "rule__TransitionSpec__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3455:1: rule__TransitionSpec__Group__1__Impl : ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) ;
    public final void rule__TransitionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3459:1: ( ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3460:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3460:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3461:1: ( rule__TransitionSpec__TriggerAssignment_1 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3462:1: ( rule__TransitionSpec__TriggerAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3462:2: rule__TransitionSpec__TriggerAssignment_1
            {
            pushFollow(FOLLOW_rule__TransitionSpec__TriggerAssignment_1_in_rule__TransitionSpec__Group__1__Impl6987);
            rule__TransitionSpec__TriggerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionSpecAccess().getTriggerAssignment_1()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__1__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3472:1: rule__TransitionSpec__Group__2 : rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 ;
    public final void rule__TransitionSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3476:1: ( rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3477:2: rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__2__Impl_in_rule__TransitionSpec__Group__27017);
            rule__TransitionSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransitionSpec__Group__3_in_rule__TransitionSpec__Group__27020);
            rule__TransitionSpec__Group__3();

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
    // $ANTLR end "rule__TransitionSpec__Group__2"


    // $ANTLR start "rule__TransitionSpec__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3484:1: rule__TransitionSpec__Group__2__Impl : ( 'goto' ) ;
    public final void rule__TransitionSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3488:1: ( ( 'goto' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3489:1: ( 'goto' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3489:1: ( 'goto' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3490:1: 'goto'
            {
             before(grammarAccess.getTransitionSpecAccess().getGotoKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__TransitionSpec__Group__2__Impl7048); 
             after(grammarAccess.getTransitionSpecAccess().getGotoKeyword_2()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__2__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3503:1: rule__TransitionSpec__Group__3 : rule__TransitionSpec__Group__3__Impl ;
    public final void rule__TransitionSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3507:1: ( rule__TransitionSpec__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3508:2: rule__TransitionSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__3__Impl_in_rule__TransitionSpec__Group__37079);
            rule__TransitionSpec__Group__3__Impl();

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
    // $ANTLR end "rule__TransitionSpec__Group__3"


    // $ANTLR start "rule__TransitionSpec__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3514:1: rule__TransitionSpec__Group__3__Impl : ( ( rule__TransitionSpec__TargetAssignment_3 ) ) ;
    public final void rule__TransitionSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3518:1: ( ( ( rule__TransitionSpec__TargetAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3519:1: ( ( rule__TransitionSpec__TargetAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3519:1: ( ( rule__TransitionSpec__TargetAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3520:1: ( rule__TransitionSpec__TargetAssignment_3 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3521:1: ( rule__TransitionSpec__TargetAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3521:2: rule__TransitionSpec__TargetAssignment_3
            {
            pushFollow(FOLLOW_rule__TransitionSpec__TargetAssignment_3_in_rule__TransitionSpec__Group__3__Impl7106);
            rule__TransitionSpec__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionSpecAccess().getTargetAssignment_3()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__3__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3539:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3543:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3544:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__07144);
            rule__FieldSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__07147);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3551:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3555:1: ( ( 'field' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3556:1: ( 'field' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3556:1: ( 'field' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3557:1: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FieldSpecification__Group__0__Impl7175); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3570:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3574:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3575:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__17206);
            rule__FieldSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__17209);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3582:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3586:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3587:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3587:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3588:1: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3589:1: ( rule__FieldSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3589:2: rule__FieldSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl7236);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3599:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3603:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3604:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__27266);
            rule__FieldSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__27269);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3611:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3615:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3616:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3616:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3617:1: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__FieldSpecification__Group__2__Impl7297); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3630:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3634:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3635:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__37328);
            rule__FieldSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__37331);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3642:1: rule__FieldSpecification__Group__3__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3646:1: ( ( 'width' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3647:1: ( 'width' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3647:1: ( 'width' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3648:1: 'width'
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__FieldSpecification__Group__3__Impl7359); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3661:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3665:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3666:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__47390);
            rule__FieldSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__47393);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3673:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3677:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3678:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3678:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3679:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__FieldSpecification__Group__4__Impl7421); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3692:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3696:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3697:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__57452);
            rule__FieldSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__57455);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3704:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__WidthAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3708:1: ( ( ( rule__FieldSpecification__WidthAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3709:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3709:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3710:1: ( rule__FieldSpecification__WidthAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3711:1: ( rule__FieldSpecification__WidthAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3711:2: rule__FieldSpecification__WidthAssignment_5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl7482);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3721:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3725:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3726:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__67512);
            rule__FieldSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__67515);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3733:1: rule__FieldSpecification__Group__6__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3737:1: ( ( 'height' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3738:1: ( 'height' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3738:1: ( 'height' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3739:1: 'height'
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6()); 
            match(input,36,FOLLOW_36_in_rule__FieldSpecification__Group__6__Impl7543); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3752:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3756:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3757:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__77574);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__77577);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3764:1: rule__FieldSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3768:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3769:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3769:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3770:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__FieldSpecification__Group__7__Impl7605); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3783:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3787:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3788:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__87636);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__87639);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3795:1: rule__FieldSpecification__Group__8__Impl : ( ( rule__FieldSpecification__HeightAssignment_8 ) ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3799:1: ( ( ( rule__FieldSpecification__HeightAssignment_8 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3800:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3800:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3801:1: ( rule__FieldSpecification__HeightAssignment_8 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_8()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3802:1: ( rule__FieldSpecification__HeightAssignment_8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3802:2: rule__FieldSpecification__HeightAssignment_8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl7666);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3812:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3816:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3817:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__97696);
            rule__FieldSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__97699);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3824:1: rule__FieldSpecification__Group__9__Impl : ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3828:1: ( ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3829:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3829:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3830:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationAssignment_9()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3831:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3831:2: rule__FieldSpecification__Field_initialisationAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl7726);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3841:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3845:1: ( rule__FieldSpecification__Group__10__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3846:2: rule__FieldSpecification__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__107757);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3852:1: rule__FieldSpecification__Group__10__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3856:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3857:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3857:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3858:1: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_19_in_rule__FieldSpecification__Group__10__Impl7785); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3893:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3897:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3898:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__07838);
            rule__AllowRestartMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__07841);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3905:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allow_restart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3909:1: ( ( 'allow_restart' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3910:1: ( 'allow_restart' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3910:1: ( 'allow_restart' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3911:1: 'allow_restart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__AllowRestartMenu__Group__0__Impl7869); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3924:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3928:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3929:2: rule__AllowRestartMenu__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__17900);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3935:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3939:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3940:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3940:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3941:1: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3942:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3944:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3958:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3962:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3963:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__07962);
            rule__StartFieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__07965);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3970:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3974:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3975:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3975:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3976:1: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__StartFieldDeclaration__Group__0__Impl7993); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3989:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3993:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3994:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__18024);
            rule__StartFieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__18027);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4001:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4005:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4006:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4006:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4007:1: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__StartFieldDeclaration__Group__1__Impl8055); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4020:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4024:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4025:2: rule__StartFieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__28086);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4031:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4035:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4036:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4036:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4037:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4038:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4038:2: rule__StartFieldDeclaration__FieldAssignment_2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__FieldAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl8113);
            rule__StartFieldDeclaration__FieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4054:1: rule__FieldInitialisations__Group__0 : rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 ;
    public final void rule__FieldInitialisations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4058:1: ( rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4059:2: rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__08149);
            rule__FieldInitialisations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__08152);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4066:1: rule__FieldInitialisations__Group__0__Impl : ( 'init' ) ;
    public final void rule__FieldInitialisations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4070:1: ( ( 'init' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4071:1: ( 'init' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4071:1: ( 'init' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4072:1: 'init'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__FieldInitialisations__Group__0__Impl8180); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4085:1: rule__FieldInitialisations__Group__1 : rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 ;
    public final void rule__FieldInitialisations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4089:1: ( rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4090:2: rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__18211);
            rule__FieldInitialisations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__18214);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4097:1: rule__FieldInitialisations__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldInitialisations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4101:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4102:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4102:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4103:1: '{'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__FieldInitialisations__Group__1__Impl8242); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4116:1: rule__FieldInitialisations__Group__2 : rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 ;
    public final void rule__FieldInitialisations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4120:1: ( rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4121:2: rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__28273);
            rule__FieldInitialisations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__28276);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4128:1: rule__FieldInitialisations__Group__2__Impl : ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) ;
    public final void rule__FieldInitialisations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4132:1: ( ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4133:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4133:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4134:1: ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4134:1: ( ( rule__FieldInitialisations__Group_2__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4135:1: ( rule__FieldInitialisations__Group_2__0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4136:1: ( rule__FieldInitialisations__Group_2__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4136:2: rule__FieldInitialisations__Group_2__0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl8305);
            rule__FieldInitialisations__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4139:1: ( ( rule__FieldInitialisations__Group_2__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4140:1: ( rule__FieldInitialisations__Group_2__0 )*
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4141:1: ( rule__FieldInitialisations__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40||(LA26_0>=42 && LA26_0<=43)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4141:2: rule__FieldInitialisations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl8317);
            	    rule__FieldInitialisations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4152:1: rule__FieldInitialisations__Group__3 : rule__FieldInitialisations__Group__3__Impl ;
    public final void rule__FieldInitialisations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4156:1: ( rule__FieldInitialisations__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4157:2: rule__FieldInitialisations__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__38350);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4163:1: rule__FieldInitialisations__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldInitialisations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4167:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4168:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4168:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4169:1: '}'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__FieldInitialisations__Group__3__Impl8378); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4190:1: rule__FieldInitialisations__Group_2__0 : rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 ;
    public final void rule__FieldInitialisations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4194:1: ( rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4195:2: rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__08417);
            rule__FieldInitialisations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__08420);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4202:1: rule__FieldInitialisations__Group_2__0__Impl : ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) ;
    public final void rule__FieldInitialisations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4206:1: ( ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4207:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4207:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4208:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4209:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4209:2: rule__FieldInitialisations__InitialisationsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl8447);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4219:1: rule__FieldInitialisations__Group_2__1 : rule__FieldInitialisations__Group_2__1__Impl ;
    public final void rule__FieldInitialisations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4223:1: ( rule__FieldInitialisations__Group_2__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4224:2: rule__FieldInitialisations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__18477);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4230:1: rule__FieldInitialisations__Group_2__1__Impl : ( ';' ) ;
    public final void rule__FieldInitialisations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4234:1: ( ( ';' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4235:1: ( ';' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4235:1: ( ';' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4236:1: ';'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 
            match(input,39,FOLLOW_39_in_rule__FieldInitialisations__Group_2__1__Impl8505); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4253:1: rule__DefaultInitialisation__Group__0 : rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 ;
    public final void rule__DefaultInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4257:1: ( rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4258:2: rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__08540);
            rule__DefaultInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__08543);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4265:1: rule__DefaultInitialisation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4269:1: ( ( 'default' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4270:1: ( 'default' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4270:1: ( 'default' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4271:1: 'default'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__DefaultInitialisation__Group__0__Impl8571); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4284:1: rule__DefaultInitialisation__Group__1 : rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 ;
    public final void rule__DefaultInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4288:1: ( rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4289:2: rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__18602);
            rule__DefaultInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__18605);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4296:1: rule__DefaultInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4300:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4301:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4301:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4302:1: ':'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__DefaultInitialisation__Group__1__Impl8633); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4315:1: rule__DefaultInitialisation__Group__2 : rule__DefaultInitialisation__Group__2__Impl ;
    public final void rule__DefaultInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4319:1: ( rule__DefaultInitialisation__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4320:2: rule__DefaultInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__28664);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4326:1: rule__DefaultInitialisation__Group__2__Impl : ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) ;
    public final void rule__DefaultInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4330:1: ( ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4331:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4331:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4332:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4333:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4333:2: rule__DefaultInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl8691);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4349:1: rule__RandomInitialisation__Group__0 : rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 ;
    public final void rule__RandomInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4353:1: ( rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4354:2: rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__08727);
            rule__RandomInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__08730);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4361:1: rule__RandomInitialisation__Group__0__Impl : ( 'random' ) ;
    public final void rule__RandomInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4365:1: ( ( 'random' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4366:1: ( 'random' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4366:1: ( 'random' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4367:1: 'random'
            {
             before(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__RandomInitialisation__Group__0__Impl8758); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4380:1: rule__RandomInitialisation__Group__1 : rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 ;
    public final void rule__RandomInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4384:1: ( rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4385:2: rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__18789);
            rule__RandomInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__18792);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4392:1: rule__RandomInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__RandomInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4396:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4397:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4397:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4398:1: ':'
            {
             before(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__RandomInitialisation__Group__1__Impl8820); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4411:1: rule__RandomInitialisation__Group__2 : rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 ;
    public final void rule__RandomInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4415:1: ( rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4416:2: rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__28851);
            rule__RandomInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__28854);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4423:1: rule__RandomInitialisation__Group__2__Impl : ( ( rule__RandomInitialisation__CellAssignment_2 ) ) ;
    public final void rule__RandomInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4427:1: ( ( ( rule__RandomInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4428:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4428:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4429:1: ( rule__RandomInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4430:1: ( rule__RandomInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4430:2: rule__RandomInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl8881);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4440:1: rule__RandomInitialisation__Group__3 : rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 ;
    public final void rule__RandomInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4444:1: ( rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4445:2: rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__38911);
            rule__RandomInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__38914);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4452:1: rule__RandomInitialisation__Group__3__Impl : ( '=' ) ;
    public final void rule__RandomInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4456:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4457:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4457:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4458:1: '='
            {
             before(grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__RandomInitialisation__Group__3__Impl8942); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4471:1: rule__RandomInitialisation__Group__4 : rule__RandomInitialisation__Group__4__Impl ;
    public final void rule__RandomInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4475:1: ( rule__RandomInitialisation__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4476:2: rule__RandomInitialisation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__48973);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4482:1: rule__RandomInitialisation__Group__4__Impl : ( ( rule__RandomInitialisation__CountAssignment_4 ) ) ;
    public final void rule__RandomInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4486:1: ( ( ( rule__RandomInitialisation__CountAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4487:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4487:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4488:1: ( rule__RandomInitialisation__CountAssignment_4 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4489:1: ( rule__RandomInitialisation__CountAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4489:2: rule__RandomInitialisation__CountAssignment_4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl9000);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4509:1: rule__ContextInitialisation__Group__0 : rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 ;
    public final void rule__ContextInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4513:1: ( rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4514:2: rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__09040);
            rule__ContextInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__09043);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4521:1: rule__ContextInitialisation__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4525:1: ( ( 'context' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4526:1: ( 'context' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4526:1: ( 'context' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4527:1: 'context'
            {
             before(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__ContextInitialisation__Group__0__Impl9071); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4540:1: rule__ContextInitialisation__Group__1 : rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 ;
    public final void rule__ContextInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4544:1: ( rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4545:2: rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__19102);
            rule__ContextInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__19105);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4552:1: rule__ContextInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__ContextInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4556:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4557:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4557:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4558:1: ':'
            {
             before(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ContextInitialisation__Group__1__Impl9133); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4571:1: rule__ContextInitialisation__Group__2 : rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 ;
    public final void rule__ContextInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4575:1: ( rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4576:2: rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__29164);
            rule__ContextInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__29167);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4583:1: rule__ContextInitialisation__Group__2__Impl : ( ( rule__ContextInitialisation__CellAssignment_2 ) ) ;
    public final void rule__ContextInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4587:1: ( ( ( rule__ContextInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4588:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4588:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4589:1: ( rule__ContextInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4590:1: ( rule__ContextInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4590:2: rule__ContextInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl9194);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4600:1: rule__ContextInitialisation__Group__3 : rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 ;
    public final void rule__ContextInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4604:1: ( rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4605:2: rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__39224);
            rule__ContextInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__39227);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4612:1: rule__ContextInitialisation__Group__3__Impl : ( 'check' ) ;
    public final void rule__ContextInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4616:1: ( ( 'check' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4617:1: ( 'check' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4617:1: ( 'check' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4618:1: 'check'
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__ContextInitialisation__Group__3__Impl9255); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4631:1: rule__ContextInitialisation__Group__4 : rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 ;
    public final void rule__ContextInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4635:1: ( rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4636:2: rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__49286);
            rule__ContextInitialisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__49289);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4643:1: rule__ContextInitialisation__Group__4__Impl : ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) ;
    public final void rule__ContextInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4647:1: ( ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4648:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4648:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4649:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4650:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4650:2: rule__ContextInitialisation__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl9316);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4660:1: rule__ContextInitialisation__Group__5 : rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 ;
    public final void rule__ContextInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4664:1: ( rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4665:2: rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__59346);
            rule__ContextInitialisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__59349);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4672:1: rule__ContextInitialisation__Group__5__Impl : ( 'value' ) ;
    public final void rule__ContextInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4676:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4677:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4677:1: ( 'value' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4678:1: 'value'
            {
             before(grammarAccess.getContextInitialisationAccess().getValueKeyword_5()); 
            match(input,45,FOLLOW_45_in_rule__ContextInitialisation__Group__5__Impl9377); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4691:1: rule__ContextInitialisation__Group__6 : rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 ;
    public final void rule__ContextInitialisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4695:1: ( rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4696:2: rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__69408);
            rule__ContextInitialisation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__69411);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4703:1: rule__ContextInitialisation__Group__6__Impl : ( '=' ) ;
    public final void rule__ContextInitialisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4707:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4708:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4708:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4709:1: '='
            {
             before(grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__ContextInitialisation__Group__6__Impl9439); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4722:1: rule__ContextInitialisation__Group__7 : rule__ContextInitialisation__Group__7__Impl ;
    public final void rule__ContextInitialisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4726:1: ( rule__ContextInitialisation__Group__7__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4727:2: rule__ContextInitialisation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__79470);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4733:1: rule__ContextInitialisation__Group__7__Impl : ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) ;
    public final void rule__ContextInitialisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4737:1: ( ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4738:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4738:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4739:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            {
             before(grammarAccess.getContextInitialisationAccess().getExpAssignment_7()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4740:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4740:2: rule__ContextInitialisation__ExpAssignment_7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl9497);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4766:1: rule__ContextExpression__Group__0 : rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 ;
    public final void rule__ContextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4770:1: ( rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4771:2: rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__09543);
            rule__ContextExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__09546);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4778:1: rule__ContextExpression__Group__0__Impl : ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) ;
    public final void rule__ContextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4782:1: ( ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4783:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4783:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4784:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4785:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4785:2: rule__ContextExpression__Sub_expAssignment_0
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl9573);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4795:1: rule__ContextExpression__Group__1 : rule__ContextExpression__Group__1__Impl ;
    public final void rule__ContextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4799:1: ( rule__ContextExpression__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4800:2: rule__ContextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__19603);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4806:1: rule__ContextExpression__Group__1__Impl : ( ( rule__ContextExpression__Group_1__0 )* ) ;
    public final void rule__ContextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4810:1: ( ( ( rule__ContextExpression__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4811:1: ( ( rule__ContextExpression__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4811:1: ( ( rule__ContextExpression__Group_1__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4812:1: ( rule__ContextExpression__Group_1__0 )*
            {
             before(grammarAccess.getContextExpressionAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4813:1: ( rule__ContextExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4813:2: rule__ContextExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl9630);
            	    rule__ContextExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4827:1: rule__ContextExpression__Group_1__0 : rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 ;
    public final void rule__ContextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4831:1: ( rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4832:2: rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__09665);
            rule__ContextExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__09668);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4839:1: rule__ContextExpression__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ContextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4843:1: ( ( '.' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4844:1: ( '.' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4844:1: ( '.' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4845:1: '.'
            {
             before(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__ContextExpression__Group_1__0__Impl9696); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4858:1: rule__ContextExpression__Group_1__1 : rule__ContextExpression__Group_1__1__Impl ;
    public final void rule__ContextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4862:1: ( rule__ContextExpression__Group_1__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4863:2: rule__ContextExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__19727);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4869:1: rule__ContextExpression__Group_1__1__Impl : ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) ;
    public final void rule__ContextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4873:1: ( ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4874:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4874:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4875:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_1_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4876:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4876:2: rule__ContextExpression__Sub_expAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl9754);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4890:1: rule__FilterExpression__Group__0 : rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 ;
    public final void rule__FilterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4894:1: ( rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4895:2: rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__09788);
            rule__FilterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__09791);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4902:1: rule__FilterExpression__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4906:1: ( ( 'filter' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4907:1: ( 'filter' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4907:1: ( 'filter' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4908:1: 'filter'
            {
             before(grammarAccess.getFilterExpressionAccess().getFilterKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__FilterExpression__Group__0__Impl9819); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4921:1: rule__FilterExpression__Group__1 : rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 ;
    public final void rule__FilterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4925:1: ( rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4926:2: rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__19850);
            rule__FilterExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__19853);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4933:1: rule__FilterExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__FilterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4937:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4938:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4938:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4939:1: '('
            {
             before(grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__FilterExpression__Group__1__Impl9881); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4952:1: rule__FilterExpression__Group__2 : rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 ;
    public final void rule__FilterExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4956:1: ( rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4957:2: rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__29912);
            rule__FilterExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__29915);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4964:1: rule__FilterExpression__Group__2__Impl : ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) ;
    public final void rule__FilterExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4968:1: ( ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4969:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4969:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4970:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4971:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4971:2: rule__FilterExpression__Cell_typeAssignment_2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl9942);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4981:1: rule__FilterExpression__Group__3 : rule__FilterExpression__Group__3__Impl ;
    public final void rule__FilterExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4985:1: ( rule__FilterExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4986:2: rule__FilterExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__39972);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4992:1: rule__FilterExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4996:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4997:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4997:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4998:1: ')'
            {
             before(grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__FilterExpression__Group__3__Impl10000); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5019:1: rule__CountExpression__Group__0 : rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 ;
    public final void rule__CountExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5023:1: ( rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5024:2: rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__010039);
            rule__CountExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__010042);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5031:1: rule__CountExpression__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5035:1: ( ( 'count' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5036:1: ( 'count' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5036:1: ( 'count' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5037:1: 'count'
            {
             before(grammarAccess.getCountExpressionAccess().getCountKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__CountExpression__Group__0__Impl10070); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5050:1: rule__CountExpression__Group__1 : rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 ;
    public final void rule__CountExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5054:1: ( rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5055:2: rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__110101);
            rule__CountExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__110104);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5062:1: rule__CountExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__CountExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5066:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5067:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5067:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5068:1: '('
            {
             before(grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__CountExpression__Group__1__Impl10132); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5081:1: rule__CountExpression__Group__2 : rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 ;
    public final void rule__CountExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5085:1: ( rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5086:2: rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__210163);
            rule__CountExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__210166);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5093:1: rule__CountExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__CountExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5097:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5098:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5098:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5099:1: ')'
            {
             before(grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__CountExpression__Group__2__Impl10194); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5112:1: rule__CountExpression__Group__3 : rule__CountExpression__Group__3__Impl ;
    public final void rule__CountExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5116:1: ( rule__CountExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5117:2: rule__CountExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__310225);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5123:1: rule__CountExpression__Group__3__Impl : ( () ) ;
    public final void rule__CountExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5127:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5128:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5128:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5129:1: ()
            {
             before(grammarAccess.getCountExpressionAccess().getCountExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5130:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5132:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5150:1: rule__NotEmptyExpression__Group__0 : rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 ;
    public final void rule__NotEmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5154:1: ( rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5155:2: rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__010291);
            rule__NotEmptyExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__010294);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5162:1: rule__NotEmptyExpression__Group__0__Impl : ( 'notEmpty' ) ;
    public final void rule__NotEmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5166:1: ( ( 'notEmpty' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5167:1: ( 'notEmpty' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5167:1: ( 'notEmpty' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5168:1: 'notEmpty'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__NotEmptyExpression__Group__0__Impl10322); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5181:1: rule__NotEmptyExpression__Group__1 : rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 ;
    public final void rule__NotEmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5185:1: ( rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5186:2: rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__110353);
            rule__NotEmptyExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__110356);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5193:1: rule__NotEmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__NotEmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5197:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5198:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5198:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5199:1: '('
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__NotEmptyExpression__Group__1__Impl10384); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5212:1: rule__NotEmptyExpression__Group__2 : rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 ;
    public final void rule__NotEmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5216:1: ( rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5217:2: rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__210415);
            rule__NotEmptyExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__210418);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5224:1: rule__NotEmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__NotEmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5228:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5229:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5229:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5230:1: ')'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__NotEmptyExpression__Group__2__Impl10446); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5243:1: rule__NotEmptyExpression__Group__3 : rule__NotEmptyExpression__Group__3__Impl ;
    public final void rule__NotEmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5247:1: ( rule__NotEmptyExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5248:2: rule__NotEmptyExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__310477);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5254:1: rule__NotEmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__NotEmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5258:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5259:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5259:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5260:1: ()
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5261:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5263:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5282:1: rule__GridGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GridGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5286:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5287:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5287:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5288:1: RULE_ID
            {
             before(grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_110548); 
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


    // $ANTLR start "rule__GridGame__StatesAssignment_3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5297:1: rule__GridGame__StatesAssignment_3 : ( ruleGlobalCellStateSpec ) ;
    public final void rule__GridGame__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5301:1: ( ( ruleGlobalCellStateSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5302:1: ( ruleGlobalCellStateSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5302:1: ( ruleGlobalCellStateSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5303:1: ruleGlobalCellStateSpec
            {
             before(grammarAccess.getGridGameAccess().getStatesGlobalCellStateSpecParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGlobalCellStateSpec_in_rule__GridGame__StatesAssignment_310579);
            ruleGlobalCellStateSpec();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getStatesGlobalCellStateSpecParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GridGame__StatesAssignment_3"


    // $ANTLR start "rule__GridGame__CellsAssignment_4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5312:1: rule__GridGame__CellsAssignment_4 : ( ruleCellSpecification ) ;
    public final void rule__GridGame__CellsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5316:1: ( ( ruleCellSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5317:1: ( ruleCellSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5317:1: ( ruleCellSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5318:1: ruleCellSpecification
            {
             before(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_410610);
            ruleCellSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GridGame__CellsAssignment_4"


    // $ANTLR start "rule__GridGame__FieldsAssignment_5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5327:1: rule__GridGame__FieldsAssignment_5 : ( ruleFieldSpecification ) ;
    public final void rule__GridGame__FieldsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5331:1: ( ( ruleFieldSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5332:1: ( ruleFieldSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5332:1: ( ruleFieldSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5333:1: ruleFieldSpecification
            {
             before(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_510641);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GridGame__FieldsAssignment_5"


    // $ANTLR start "rule__GridGame__OptionsAssignment_6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5342:1: rule__GridGame__OptionsAssignment_6 : ( ruleOptionSpecification ) ;
    public final void rule__GridGame__OptionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5346:1: ( ( ruleOptionSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5347:1: ( ruleOptionSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5347:1: ( ruleOptionSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5348:1: ruleOptionSpecification
            {
             before(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_610672);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__GridGame__OptionsAssignment_6"


    // $ANTLR start "rule__CellSpecification__NameAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5357:1: rule__CellSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CellSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5361:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5362:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5362:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5363:1: RULE_ID
            {
             before(grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_110703); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5372:1: rule__CellSpecification__MembersAssignment_3 : ( ruleCellMember ) ;
    public final void rule__CellSpecification__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5376:1: ( ( ruleCellMember ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5377:1: ( ruleCellMember )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5377:1: ( ruleCellMember )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5378:1: ruleCellMember
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_310734);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5387:1: rule__CellDisplaySpec__Display_typeAssignment_3 : ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) ;
    public final void rule__CellDisplaySpec__Display_typeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5391:1: ( ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5392:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5392:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5393:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAlternatives_3_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5394:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5394:2: rule__CellDisplaySpec__Display_typeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_310765);
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


    // $ANTLR start "rule__CellDisplaySpec__TextAssignment_4_0_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5403:1: rule__CellDisplaySpec__TextAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__CellDisplaySpec__TextAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5407:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5408:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5408:1: ( RULE_STRING )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5409:1: RULE_STRING
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_4_0_110798); 
             after(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_4_0_1_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__TextAssignment_4_0_1"


    // $ANTLR start "rule__CellDisplaySpec__VarAssignment_4_1_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5418:1: rule__CellDisplaySpec__VarAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CellDisplaySpec__VarAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5422:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5423:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5423:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5424:1: ( RULE_ID )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarVarSpecCrossReference_4_1_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5425:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5426:1: RULE_ID
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarVarSpecIDTerminalRuleCall_4_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellDisplaySpec__VarAssignment_4_1_110833); 
             after(grammarAccess.getCellDisplaySpecAccess().getVarVarSpecIDTerminalRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getCellDisplaySpecAccess().getVarVarSpecCrossReference_4_1_1_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__VarAssignment_4_1_1"


    // $ANTLR start "rule__CellVarSpec__TypeAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5437:1: rule__CellVarSpec__TypeAssignment_1 : ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) ;
    public final void rule__CellVarSpec__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5441:1: ( ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5442:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5442:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5443:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAlternatives_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5444:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5444:2: rule__CellVarSpec__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_110868);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5453:1: rule__CellVarSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CellVarSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5457:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5458:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5458:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5459:1: RULE_ID
            {
             before(grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_210901); 
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


    // $ANTLR start "rule__GlobalCellStateSpec__NameAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5468:1: rule__GlobalCellStateSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalCellStateSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5472:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5473:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5473:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5474:1: RULE_ID
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__NameAssignment_110932); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__NameAssignment_1"


    // $ANTLR start "rule__GlobalCellStateSpec__ParamsAssignment_2_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5483:1: rule__GlobalCellStateSpec__ParamsAssignment_2_1 : ( ruleStateParamSpec ) ;
    public final void rule__GlobalCellStateSpec__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5487:1: ( ( ruleStateParamSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5488:1: ( ruleStateParamSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5488:1: ( ruleStateParamSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5489:1: ruleStateParamSpec
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_110963);
            ruleStateParamSpec();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__ParamsAssignment_2_1"


    // $ANTLR start "rule__GlobalCellStateSpec__ParamsAssignment_2_2_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5498:1: rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 : ( ruleStateParamSpec ) ;
    public final void rule__GlobalCellStateSpec__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5502:1: ( ( ruleStateParamSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5503:1: ( ruleStateParamSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5503:1: ( ruleStateParamSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5504:1: ruleStateParamSpec
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_2_110994);
            ruleStateParamSpec();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__GlobalCellStateSpec__StatesAssignment_4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5513:1: rule__GlobalCellStateSpec__StatesAssignment_4 : ( ruleCellState ) ;
    public final void rule__GlobalCellStateSpec__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5517:1: ( ( ruleCellState ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5518:1: ( ruleCellState )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5518:1: ( ruleCellState )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5519:1: ruleCellState
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesCellStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCellState_in_rule__GlobalCellStateSpec__StatesAssignment_411025);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecAccess().getStatesCellStateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__StatesAssignment_4"


    // $ANTLR start "rule__GlobalCellStateSpec__StartAssignment_7"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5528:1: rule__GlobalCellStateSpec__StartAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__GlobalCellStateSpec__StartAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5532:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5533:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5533:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5534:1: ( RULE_ID )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateCrossReference_7_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5535:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5536:1: RULE_ID
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__StartAssignment_711060); 
             after(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateCrossReference_7_0()); 

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
    // $ANTLR end "rule__GlobalCellStateSpec__StartAssignment_7"


    // $ANTLR start "rule__StateParamSpec__TypeAssignment_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5547:1: rule__StateParamSpec__TypeAssignment_0 : ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) ) ;
    public final void rule__StateParamSpec__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5551:1: ( ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5552:1: ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5552:1: ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5553:1: ( rule__StateParamSpec__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getStateParamSpecAccess().getTypeAlternatives_0_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5554:1: ( rule__StateParamSpec__TypeAlternatives_0_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5554:2: rule__StateParamSpec__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__StateParamSpec__TypeAlternatives_0_0_in_rule__StateParamSpec__TypeAssignment_011095);
            rule__StateParamSpec__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStateParamSpecAccess().getTypeAlternatives_0_0()); 

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
    // $ANTLR end "rule__StateParamSpec__TypeAssignment_0"


    // $ANTLR start "rule__StateParamSpec__NameAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5563:1: rule__StateParamSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateParamSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5567:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5568:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5568:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5569:1: RULE_ID
            {
             before(grammarAccess.getStateParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateParamSpec__NameAssignment_111128); 
             after(grammarAccess.getStateParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StateParamSpec__NameAssignment_1"


    // $ANTLR start "rule__LocalCellStateSpec__StatesAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5578:1: rule__LocalCellStateSpec__StatesAssignment_2 : ( ruleCellState ) ;
    public final void rule__LocalCellStateSpec__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5582:1: ( ( ruleCellState ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5583:1: ( ruleCellState )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5583:1: ( ruleCellState )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5584:1: ruleCellState
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCellState_in_rule__LocalCellStateSpec__StatesAssignment_211159);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getLocalCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__StatesAssignment_2"


    // $ANTLR start "rule__LocalCellStateSpec__StartAssignment_5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5593:1: rule__LocalCellStateSpec__StartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__LocalCellStateSpec__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5597:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5598:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5598:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5599:1: ( RULE_ID )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5600:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5601:1: RULE_ID
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalCellStateSpec__StartAssignment_511194); 
             after(grammarAccess.getLocalCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLocalCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 

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
    // $ANTLR end "rule__LocalCellStateSpec__StartAssignment_5"


    // $ANTLR start "rule__CellStateSpecReference__StateSpecAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5612:1: rule__CellStateSpecReference__StateSpecAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CellStateSpecReference__StateSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5616:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5617:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5617:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5618:1: ( RULE_ID )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecCrossReference_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5619:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5620:1: RULE_ID
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellStateSpecReference__StateSpecAssignment_111233); 
             after(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecCrossReference_1_0()); 

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
    // $ANTLR end "rule__CellStateSpecReference__StateSpecAssignment_1"


    // $ANTLR start "rule__CellStateSpecReference__ParamsAssignment_2_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5631:1: rule__CellStateSpecReference__ParamsAssignment_2_1 : ( ruleValue ) ;
    public final void rule__CellStateSpecReference__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5635:1: ( ( ruleValue ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5636:1: ( ruleValue )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5636:1: ( ruleValue )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5637:1: ruleValue
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__CellStateSpecReference__ParamsAssignment_2_111268);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__CellStateSpecReference__ParamsAssignment_2_1"


    // $ANTLR start "rule__CellStateSpecReference__ParamsAssignment_2_2_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5646:1: rule__CellStateSpecReference__ParamsAssignment_2_2_1 : ( ruleValue ) ;
    public final void rule__CellStateSpecReference__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5650:1: ( ( ruleValue ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5651:1: ( ruleValue )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5651:1: ( ruleValue )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5652:1: ruleValue
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__CellStateSpecReference__ParamsAssignment_2_2_111299);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__CellStateSpecReference__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5661:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5665:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5666:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5666:1: ( RULE_STRING )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5667:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11330); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5676:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5680:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5681:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5681:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5682:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11361); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__VarRefValue__RefAssignment"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5691:1: rule__VarRefValue__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarRefValue__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5695:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5696:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5696:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5697:1: ( RULE_ID )
            {
             before(grammarAccess.getVarRefValueAccess().getRefCellVarSpecCrossReference_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5698:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5699:1: RULE_ID
            {
             before(grammarAccess.getVarRefValueAccess().getRefCellVarSpecIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarRefValue__RefAssignment11396); 
             after(grammarAccess.getVarRefValueAccess().getRefCellVarSpecIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVarRefValueAccess().getRefCellVarSpecCrossReference_0()); 

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
    // $ANTLR end "rule__VarRefValue__RefAssignment"


    // $ANTLR start "rule__CellState__NameAssignment_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5710:1: rule__CellState__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CellState__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5714:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5715:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5715:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5716:1: RULE_ID
            {
             before(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellState__NameAssignment_011431); 
             after(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CellState__NameAssignment_0"


    // $ANTLR start "rule__CellState__DisplayAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5725:1: rule__CellState__DisplayAssignment_2 : ( ruleCellDisplaySpec ) ;
    public final void rule__CellState__DisplayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5729:1: ( ( ruleCellDisplaySpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5730:1: ( ruleCellDisplaySpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5730:1: ( ruleCellDisplaySpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5731:1: ruleCellDisplaySpec
            {
             before(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCellDisplaySpec_in_rule__CellState__DisplayAssignment_211462);
            ruleCellDisplaySpec();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CellState__DisplayAssignment_2"


    // $ANTLR start "rule__CellState__TransitionsAssignment_3_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5740:1: rule__CellState__TransitionsAssignment_3_2 : ( ruleTransitionSpec ) ;
    public final void rule__CellState__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5744:1: ( ( ruleTransitionSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5745:1: ( ruleTransitionSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5745:1: ( ruleTransitionSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5746:1: ruleTransitionSpec
            {
             before(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleTransitionSpec_in_rule__CellState__TransitionsAssignment_3_211493);
            ruleTransitionSpec();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__CellState__TransitionsAssignment_3_2"


    // $ANTLR start "rule__TransitionSpec__TriggerAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5755:1: rule__TransitionSpec__TriggerAssignment_1 : ( ruleTransitionTriggerSpec ) ;
    public final void rule__TransitionSpec__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5759:1: ( ( ruleTransitionTriggerSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5760:1: ( ruleTransitionTriggerSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5760:1: ( ruleTransitionTriggerSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5761:1: ruleTransitionTriggerSpec
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_rule__TransitionSpec__TriggerAssignment_111524);
            ruleTransitionTriggerSpec();

            state._fsp--;

             after(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TransitionSpec__TriggerAssignment_1"


    // $ANTLR start "rule__TransitionSpec__TargetAssignment_3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5770:1: rule__TransitionSpec__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionSpec__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5774:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5775:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5775:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5776:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_3_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5777:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5778:1: RULE_ID
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TransitionSpec__TargetAssignment_311559); 
             after(grammarAccess.getTransitionSpecAccess().getTargetCellStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_3_0()); 

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
    // $ANTLR end "rule__TransitionSpec__TargetAssignment_3"


    // $ANTLR start "rule__FieldSpecification__NameAssignment_1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5789:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5793:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5794:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5794:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5795:1: RULE_ID
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_111594); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5804:1: rule__FieldSpecification__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5808:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5809:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5809:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5810:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_511625); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5819:1: rule__FieldSpecification__HeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5823:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5824:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5824:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5825:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_811656); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5834:1: rule__FieldSpecification__Field_initialisationAssignment_9 : ( ruleFieldInitialisations ) ;
    public final void rule__FieldSpecification__Field_initialisationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5838:1: ( ( ruleFieldInitialisations ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5839:1: ( ruleFieldInitialisations )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5839:1: ( ruleFieldInitialisations )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5840:1: ruleFieldInitialisations
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_911687);
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


    // $ANTLR start "rule__StartFieldDeclaration__FieldAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5849:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5853:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5854:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5854:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5855:1: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5856:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5857:1: RULE_ID
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__FieldAssignment_211722); 
             after(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 

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
    // $ANTLR end "rule__StartFieldDeclaration__FieldAssignment_2"


    // $ANTLR start "rule__FieldInitialisations__InitialisationsAssignment_2_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5868:1: rule__FieldInitialisations__InitialisationsAssignment_2_0 : ( ruleFieldInitialisation ) ;
    public final void rule__FieldInitialisations__InitialisationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5872:1: ( ( ruleFieldInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5873:1: ( ruleFieldInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5873:1: ( ruleFieldInitialisation )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5874:1: ruleFieldInitialisation
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_011757);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5883:1: rule__DefaultInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefaultInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5887:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5888:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5888:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5889:1: ( RULE_ID )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5890:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5891:1: RULE_ID
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_211792); 
             after(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5902:1: rule__RandomInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RandomInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5906:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5907:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5907:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5908:1: ( RULE_ID )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5909:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5910:1: RULE_ID
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_211831); 
             after(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5921:1: rule__RandomInitialisation__CountAssignment_4 : ( RULE_INT ) ;
    public final void rule__RandomInitialisation__CountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5925:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5926:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5926:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5927:1: RULE_INT
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_411866); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5936:1: rule__ContextInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ContextInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5940:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5941:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5941:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5942:1: ( RULE_ID )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5943:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5944:1: RULE_ID
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_211901); 
             after(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5955:1: rule__ContextInitialisation__CheckAssignment_4 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5959:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5960:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5960:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5961:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_411936);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5970:1: rule__ContextInitialisation__ExpAssignment_7 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__ExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5974:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5975:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5975:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5976:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_711967);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5985:1: rule__ContextExpression__Sub_expAssignment_0 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5989:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5990:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5990:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5991:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_011998);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6000:1: rule__ContextExpression__Sub_expAssignment_1_1 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6004:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6005:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6005:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6006:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_112029);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6015:1: rule__FilterExpression__Cell_typeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FilterExpression__Cell_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6019:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6020:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6020:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6021:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6022:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:6023:1: RULE_ID
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_212064); 
             after(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 

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
    public static final BitSet FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellVarSpec310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__0_in_ruleCellVarSpec336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalCellStateSpec_in_entryRuleGlobalCellStateSpec363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalCellStateSpec370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__0_in_ruleGlobalCellStateSpec396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_entryRuleStateParamSpec423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateParamSpec430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__0_in_ruleStateParamSpec456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellStateSpec490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Alternatives_in_ruleCellStateSpec516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalCellStateSpec_in_entryRuleLocalCellStateSpec543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalCellStateSpec550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__0_in_ruleLocalCellStateSpec576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpecReference_in_entryRuleCellStateSpecReference603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellStateSpecReference610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group__0_in_ruleCellStateSpecReference636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefValue_in_entryRuleVarRefValue843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRefValue850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRefValue__RefAssignment_in_ruleVarRefValue876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_entryRuleCellState903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellState910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__0_in_ruleCellState936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpec970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__0_in_ruleTransitionSpec996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionTriggerSpec1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionTriggerSpec__Alternatives_in_ruleTransitionTriggerSpec1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldSpecification1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__0_in_ruleFieldSpecification1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSpecification1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSpecification__Alternatives_in_ruleOptionSpecification1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowRestartMenu1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__0_in_ruleAllowRestartMenu1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartFieldDeclaration1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__0_in_ruleStartFieldDeclaration1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisations1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__0_in_ruleFieldInitialisations1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisation1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisation__Alternatives_in_ruleFieldInitialisation1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultInitialisation1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__0_in_ruleDefaultInitialisation1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRandomInitialisation1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__0_in_ruleRandomInitialisation1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextInitialisation1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__0_in_ruleContextInitialisation1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_entryRuleContextExpression1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextExpression1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__0_in_ruleContextExpression1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterExpression1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__0_in_ruleFilterExpression1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_entryRuleCountExpression1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountExpression1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__0_in_ruleCountExpression1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyExpression1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__0_in_ruleNotEmptyExpression1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_rule__CellMember__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_rule__CellMember__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_rule__CellMember__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CellDisplaySpec__Display_typeAlternatives_3_02019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__0_in_rule__CellDisplaySpec__Alternatives_42053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__0_in_rule__CellDisplaySpec__Alternatives_42071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_02106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_02126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateParamSpec__TypeAlternatives_0_02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateParamSpec__TypeAlternatives_0_02181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalCellStateSpec_in_rule__CellStateSpec__Alternatives2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpecReference_in_rule__CellStateSpec__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRefValue_in_rule__Value__Alternatives2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TransitionTriggerSpec__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TransitionTriggerSpec__Alternatives2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__02564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__02567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GridGame__Group__0__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__12626 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__22686 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__22689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GridGame__Group__2__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__32748 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__32751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__StatesAssignment_3_in_rule__GridGame__Group__3__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__42809 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__42812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2841 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2853 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__52886 = new BitSet(new long[]{0x0000002004080000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__52889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2918 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2930 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__62963 = new BitSet(new long[]{0x0000002004080000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__7_in_rule__GridGame__Group__62966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__OptionsAssignment_6_in_rule__GridGame__Group__6__Impl2993 = new BitSet(new long[]{0x0000002004000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__7__Impl_in_rule__GridGame__Group__73024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GridGame__Group__7__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__03099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__03102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CellSpecification__Group__0__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__13161 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__13164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__23221 = new BitSet(new long[]{0x0000000003280000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__23224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellSpecification__Group__2__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__33283 = new BitSet(new long[]{0x0000000003280000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__33286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl3313 = new BitSet(new long[]{0x0000000003200002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__43344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellSpecification__Group__4__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__03413 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__03416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CellDisplaySpec__Group__0__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__13475 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellDisplaySpec__Group__1__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__23537 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__23540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CellDisplaySpec__Group__2__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__33599 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__33602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__43659 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__43662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Alternatives_4_in_rule__CellDisplaySpec__Group__4__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__53719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellDisplaySpec__Group__5__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__0__Impl_in_rule__CellDisplaySpec__Group_4_0__03790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__1_in_rule__CellDisplaySpec__Group_4_0__03793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CellDisplaySpec__Group_4_0__0__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__1__Impl_in_rule__CellDisplaySpec__Group_4_0__13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__TextAssignment_4_0_1_in_rule__CellDisplaySpec__Group_4_0__1__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__0__Impl_in_rule__CellDisplaySpec__Group_4_1__03913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__1_in_rule__CellDisplaySpec__Group_4_1__03916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CellDisplaySpec__Group_4_1__0__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__1__Impl_in_rule__CellDisplaySpec__Group_4_1__13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__VarAssignment_4_1_1_in_rule__CellDisplaySpec__Group_4_1__1__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__04036 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CellVarSpec__Group__0__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__14098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__24158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__0__Impl_in_rule__GlobalCellStateSpec__Group__04221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__1_in_rule__GlobalCellStateSpec__Group__04224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GlobalCellStateSpec__Group__0__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__1__Impl_in_rule__GlobalCellStateSpec__Group__14283 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__2_in_rule__GlobalCellStateSpec__Group__14286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__NameAssignment_1_in_rule__GlobalCellStateSpec__Group__1__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__2__Impl_in_rule__GlobalCellStateSpec__Group__24343 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__3_in_rule__GlobalCellStateSpec__Group__24346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__0_in_rule__GlobalCellStateSpec__Group__2__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__3__Impl_in_rule__GlobalCellStateSpec__Group__34404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__4_in_rule__GlobalCellStateSpec__Group__34407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GlobalCellStateSpec__Group__3__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__4__Impl_in_rule__GlobalCellStateSpec__Group__44466 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__5_in_rule__GlobalCellStateSpec__Group__44469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4498 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4510 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__5__Impl_in_rule__GlobalCellStateSpec__Group__54543 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__6_in_rule__GlobalCellStateSpec__Group__54546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GlobalCellStateSpec__Group__5__Impl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__6__Impl_in_rule__GlobalCellStateSpec__Group__64605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__7_in_rule__GlobalCellStateSpec__Group__64608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GlobalCellStateSpec__Group__6__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__7__Impl_in_rule__GlobalCellStateSpec__Group__74667 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__8_in_rule__GlobalCellStateSpec__Group__74670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__StartAssignment_7_in_rule__GlobalCellStateSpec__Group__7__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__8__Impl_in_rule__GlobalCellStateSpec__Group__84727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GlobalCellStateSpec__Group__8__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2__04804 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__1_in_rule__GlobalCellStateSpec__Group_2__04807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GlobalCellStateSpec__Group_2__0__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2__14866 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__2_in_rule__GlobalCellStateSpec__Group_2__14869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_1_in_rule__GlobalCellStateSpec__Group_2__1__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__2__Impl_in_rule__GlobalCellStateSpec__Group_2__24926 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__3_in_rule__GlobalCellStateSpec__Group_2__24929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0_in_rule__GlobalCellStateSpec__Group_2__2__Impl4956 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__3__Impl_in_rule__GlobalCellStateSpec__Group_2__34987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GlobalCellStateSpec__Group_2__3__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2_2__05054 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1_in_rule__GlobalCellStateSpec__Group_2_2__05057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GlobalCellStateSpec__Group_2_2__0__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2_2__15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_2_1_in_rule__GlobalCellStateSpec__Group_2_2__1__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__0__Impl_in_rule__StateParamSpec__Group__05177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__1_in_rule__StateParamSpec__Group__05180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__TypeAssignment_0_in_rule__StateParamSpec__Group__0__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__1__Impl_in_rule__StateParamSpec__Group__15237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__NameAssignment_1_in_rule__StateParamSpec__Group__1__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__0__Impl_in_rule__LocalCellStateSpec__Group__05298 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__1_in_rule__LocalCellStateSpec__Group__05301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LocalCellStateSpec__Group__0__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__1__Impl_in_rule__LocalCellStateSpec__Group__15360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__2_in_rule__LocalCellStateSpec__Group__15363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LocalCellStateSpec__Group__1__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__2__Impl_in_rule__LocalCellStateSpec__Group__25422 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__3_in_rule__LocalCellStateSpec__Group__25425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__StatesAssignment_2_in_rule__LocalCellStateSpec__Group__2__Impl5454 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__StatesAssignment_2_in_rule__LocalCellStateSpec__Group__2__Impl5466 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__3__Impl_in_rule__LocalCellStateSpec__Group__35499 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__4_in_rule__LocalCellStateSpec__Group__35502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LocalCellStateSpec__Group__3__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__4__Impl_in_rule__LocalCellStateSpec__Group__45561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__5_in_rule__LocalCellStateSpec__Group__45564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LocalCellStateSpec__Group__4__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__5__Impl_in_rule__LocalCellStateSpec__Group__55623 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__6_in_rule__LocalCellStateSpec__Group__55626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__StartAssignment_5_in_rule__LocalCellStateSpec__Group__5__Impl5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalCellStateSpec__Group__6__Impl_in_rule__LocalCellStateSpec__Group__65683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LocalCellStateSpec__Group__6__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group__0__Impl_in_rule__CellStateSpecReference__Group__05756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group__1_in_rule__CellStateSpecReference__Group__05759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CellStateSpecReference__Group__0__Impl5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group__1__Impl_in_rule__CellStateSpecReference__Group__15818 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group__2_in_rule__CellStateSpecReference__Group__15821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__StateSpecAssignment_1_in_rule__CellStateSpecReference__Group__1__Impl5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group__2__Impl_in_rule__CellStateSpecReference__Group__25878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__0_in_rule__CellStateSpecReference__Group__2__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__0__Impl_in_rule__CellStateSpecReference__Group_2__05942 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__1_in_rule__CellStateSpecReference__Group_2__05945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CellStateSpecReference__Group_2__0__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__1__Impl_in_rule__CellStateSpecReference__Group_2__16004 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__2_in_rule__CellStateSpecReference__Group_2__16007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__ParamsAssignment_2_1_in_rule__CellStateSpecReference__Group_2__1__Impl6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__2__Impl_in_rule__CellStateSpecReference__Group_2__26064 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__3_in_rule__CellStateSpecReference__Group_2__26067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2_2__0_in_rule__CellStateSpecReference__Group_2__2__Impl6094 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2__3__Impl_in_rule__CellStateSpecReference__Group_2__36125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CellStateSpecReference__Group_2__3__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2_2__0__Impl_in_rule__CellStateSpecReference__Group_2_2__06192 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2_2__1_in_rule__CellStateSpecReference__Group_2_2__06195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CellStateSpecReference__Group_2_2__0__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__Group_2_2__1__Impl_in_rule__CellStateSpecReference__Group_2_2__16254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpecReference__ParamsAssignment_2_2_1_in_rule__CellStateSpecReference__Group_2_2__1__Impl6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__0__Impl_in_rule__CellState__Group__06315 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellState__Group__1_in_rule__CellState__Group__06318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__NameAssignment_0_in_rule__CellState__Group__0__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__1__Impl_in_rule__CellState__Group__16375 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CellState__Group__2_in_rule__CellState__Group__16378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellState__Group__1__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__2__Impl_in_rule__CellState__Group__26437 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_rule__CellState__Group__3_in_rule__CellState__Group__26440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__DisplayAssignment_2_in_rule__CellState__Group__2__Impl6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__3__Impl_in_rule__CellState__Group__36497 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_rule__CellState__Group__4_in_rule__CellState__Group__36500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__0_in_rule__CellState__Group__3__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__4__Impl_in_rule__CellState__Group__46558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellState__Group__4__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__0__Impl_in_rule__CellState__Group_3__06627 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__1_in_rule__CellState__Group_3__06630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CellState__Group_3__0__Impl6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__1__Impl_in_rule__CellState__Group_3__16689 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__2_in_rule__CellState__Group_3__16692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellState__Group_3__1__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__2__Impl_in_rule__CellState__Group_3__26751 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__3_in_rule__CellState__Group_3__26754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl6783 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl6795 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__3__Impl_in_rule__CellState__Group_3__36828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellState__Group_3__3__Impl6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__0__Impl_in_rule__TransitionSpec__Group__06895 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__1_in_rule__TransitionSpec__Group__06898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TransitionSpec__Group__0__Impl6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__1__Impl_in_rule__TransitionSpec__Group__16957 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__2_in_rule__TransitionSpec__Group__16960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__TriggerAssignment_1_in_rule__TransitionSpec__Group__1__Impl6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__2__Impl_in_rule__TransitionSpec__Group__27017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__3_in_rule__TransitionSpec__Group__27020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TransitionSpec__Group__2__Impl7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__3__Impl_in_rule__TransitionSpec__Group__37079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__TargetAssignment_3_in_rule__TransitionSpec__Group__3__Impl7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__07144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__07147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FieldSpecification__Group__0__Impl7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__17206 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__17209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__27266 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__27269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldSpecification__Group__2__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__37328 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__37331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FieldSpecification__Group__3__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__47390 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__47393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldSpecification__Group__4__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__57452 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__57455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__67512 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__67515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FieldSpecification__Group__6__Impl7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__77574 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__77577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldSpecification__Group__7__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__87636 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__87639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__97696 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__97699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__107757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldSpecification__Group__10__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__07838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__07841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AllowRestartMenu__Group__0__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__17900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__07962 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__07965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StartFieldDeclaration__Group__0__Impl7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__18024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__18027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StartFieldDeclaration__Group__1__Impl8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__28086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__FieldAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__08149 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__08152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FieldInitialisations__Group__0__Impl8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__18211 = new BitSet(new long[]{0x00000D0000000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__18214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldInitialisations__Group__1__Impl8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__28273 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__28276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl8305 = new BitSet(new long[]{0x00000D0000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl8317 = new BitSet(new long[]{0x00000D0000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__38350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldInitialisations__Group__3__Impl8378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__08417 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__08420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__18477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FieldInitialisations__Group_2__1__Impl8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__08540 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__08543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DefaultInitialisation__Group__0__Impl8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__18602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__18605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DefaultInitialisation__Group__1__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__28664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl8691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__08727 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__08730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__RandomInitialisation__Group__0__Impl8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__18789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__18792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RandomInitialisation__Group__1__Impl8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__28851 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__28854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__38911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__38914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RandomInitialisation__Group__3__Impl8942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__48973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__09040 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__09043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ContextInitialisation__Group__0__Impl9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__19102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__19105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ContextInitialisation__Group__1__Impl9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__29164 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__29167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__39224 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__39227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ContextInitialisation__Group__3__Impl9255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__49286 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__49289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__59346 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__59349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ContextInitialisation__Group__5__Impl9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__69408 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__69411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ContextInitialisation__Group__6__Impl9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__79470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl9497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__09543 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__09546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__19603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl9630 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__09665 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__09668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ContextExpression__Group_1__0__Impl9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__19727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__09788 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__09791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FilterExpression__Group__0__Impl9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__19850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__19853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FilterExpression__Group__1__Impl9881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__29912 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__29915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__39972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FilterExpression__Group__3__Impl10000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__010039 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__010042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CountExpression__Group__0__Impl10070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__110101 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__110104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CountExpression__Group__1__Impl10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__210163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__210166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CountExpression__Group__2__Impl10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__310225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__010291 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__010294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NotEmptyExpression__Group__0__Impl10322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__110353 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__110356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NotEmptyExpression__Group__1__Impl10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__210415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__210418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NotEmptyExpression__Group__2__Impl10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__310477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_110548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalCellStateSpec_in_rule__GridGame__StatesAssignment_310579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_410610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_510641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_610672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_110703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_310734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_310765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_4_0_110798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellDisplaySpec__VarAssignment_4_1_110833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_110868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_210901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__NameAssignment_110932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_110963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_2_110994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_rule__GlobalCellStateSpec__StatesAssignment_411025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__StartAssignment_711060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__TypeAlternatives_0_0_in_rule__StateParamSpec__TypeAssignment_011095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateParamSpec__NameAssignment_111128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_rule__LocalCellStateSpec__StatesAssignment_211159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalCellStateSpec__StartAssignment_511194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellStateSpecReference__StateSpecAssignment_111233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__CellStateSpecReference__ParamsAssignment_2_111268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__CellStateSpecReference__ParamsAssignment_2_2_111299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarRefValue__RefAssignment11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellState__NameAssignment_011431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_rule__CellState__DisplayAssignment_211462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_rule__CellState__TransitionsAssignment_3_211493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_rule__TransitionSpec__TriggerAssignment_111524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TransitionSpec__TargetAssignment_311559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_111594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_511625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_811656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_911687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__FieldAssignment_211722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_011757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_211792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_211831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_411866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_211901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_411936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_711967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_011998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_112029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_212064 = new BitSet(new long[]{0x0000000000000002L});

}