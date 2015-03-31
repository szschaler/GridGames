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


    // $ANTLR start "entryRuleGlobalCellStateSpec"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:200:1: entryRuleGlobalCellStateSpec : ruleGlobalCellStateSpec EOF ;
    public final void entryRuleGlobalCellStateSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:201:1: ( ruleGlobalCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:202:1: ruleGlobalCellStateSpec EOF
            {
             before(grammarAccess.getGlobalCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleGlobalCellStateSpec_in_entryRuleGlobalCellStateSpec361);
            ruleGlobalCellStateSpec();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalCellStateSpec368); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:209:1: ruleGlobalCellStateSpec : ( ( rule__GlobalCellStateSpec__Group__0 ) ) ;
    public final void ruleGlobalCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:213:2: ( ( ( rule__GlobalCellStateSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:214:1: ( ( rule__GlobalCellStateSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:214:1: ( ( rule__GlobalCellStateSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:215:1: ( rule__GlobalCellStateSpec__Group__0 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:216:1: ( rule__GlobalCellStateSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:216:2: rule__GlobalCellStateSpec__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__0_in_ruleGlobalCellStateSpec394);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:228:1: entryRuleStateParamSpec : ruleStateParamSpec EOF ;
    public final void entryRuleStateParamSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:229:1: ( ruleStateParamSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:230:1: ruleStateParamSpec EOF
            {
             before(grammarAccess.getStateParamSpecRule()); 
            pushFollow(FOLLOW_ruleStateParamSpec_in_entryRuleStateParamSpec421);
            ruleStateParamSpec();

            state._fsp--;

             after(grammarAccess.getStateParamSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateParamSpec428); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:237:1: ruleStateParamSpec : ( ( rule__StateParamSpec__Group__0 ) ) ;
    public final void ruleStateParamSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:241:2: ( ( ( rule__StateParamSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:242:1: ( ( rule__StateParamSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:242:1: ( ( rule__StateParamSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:243:1: ( rule__StateParamSpec__Group__0 )
            {
             before(grammarAccess.getStateParamSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:244:1: ( rule__StateParamSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:244:2: rule__StateParamSpec__Group__0
            {
            pushFollow(FOLLOW_rule__StateParamSpec__Group__0_in_ruleStateParamSpec454);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:256:1: entryRuleCellStateSpec : ruleCellStateSpec EOF ;
    public final void entryRuleCellStateSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:257:1: ( ruleCellStateSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:258:1: ruleCellStateSpec EOF
            {
             before(grammarAccess.getCellStateSpecRule()); 
            pushFollow(FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec481);
            ruleCellStateSpec();

            state._fsp--;

             after(grammarAccess.getCellStateSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellStateSpec488); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:265:1: ruleCellStateSpec : ( ( rule__CellStateSpec__Group__0 ) ) ;
    public final void ruleCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:269:2: ( ( ( rule__CellStateSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:270:1: ( ( rule__CellStateSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:270:1: ( ( rule__CellStateSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:271:1: ( rule__CellStateSpec__Group__0 )
            {
             before(grammarAccess.getCellStateSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:272:1: ( rule__CellStateSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:272:2: rule__CellStateSpec__Group__0
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__0_in_ruleCellStateSpec514);
            rule__CellStateSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCellState"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:284:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:285:1: ( ruleCellState EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:286:1: ruleCellState EOF
            {
             before(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_ruleCellState_in_entryRuleCellState541);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getCellStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellState548); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:293:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:297:2: ( ( ( rule__CellState__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:298:1: ( ( rule__CellState__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:298:1: ( ( rule__CellState__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:299:1: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:300:1: ( rule__CellState__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:300:2: rule__CellState__Group__0
            {
            pushFollow(FOLLOW_rule__CellState__Group__0_in_ruleCellState574);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:312:1: entryRuleTransitionSpec : ruleTransitionSpec EOF ;
    public final void entryRuleTransitionSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:313:1: ( ruleTransitionSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:314:1: ruleTransitionSpec EOF
            {
             before(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec601);
            ruleTransitionSpec();

            state._fsp--;

             after(grammarAccess.getTransitionSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpec608); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:321:1: ruleTransitionSpec : ( ( rule__TransitionSpec__Group__0 ) ) ;
    public final void ruleTransitionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:325:2: ( ( ( rule__TransitionSpec__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:326:1: ( ( rule__TransitionSpec__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:326:1: ( ( rule__TransitionSpec__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:327:1: ( rule__TransitionSpec__Group__0 )
            {
             before(grammarAccess.getTransitionSpecAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:328:1: ( rule__TransitionSpec__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:328:2: rule__TransitionSpec__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__0_in_ruleTransitionSpec634);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:340:1: entryRuleTransitionTriggerSpec : ruleTransitionTriggerSpec EOF ;
    public final void entryRuleTransitionTriggerSpec() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:341:1: ( ruleTransitionTriggerSpec EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:342:1: ruleTransitionTriggerSpec EOF
            {
             before(grammarAccess.getTransitionTriggerSpecRule()); 
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec661);
            ruleTransitionTriggerSpec();

            state._fsp--;

             after(grammarAccess.getTransitionTriggerSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionTriggerSpec668); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:349:1: ruleTransitionTriggerSpec : ( ( rule__TransitionTriggerSpec__Alternatives ) ) ;
    public final void ruleTransitionTriggerSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:353:2: ( ( ( rule__TransitionTriggerSpec__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:354:1: ( ( rule__TransitionTriggerSpec__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:354:1: ( ( rule__TransitionTriggerSpec__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:355:1: ( rule__TransitionTriggerSpec__Alternatives )
            {
             before(grammarAccess.getTransitionTriggerSpecAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:356:1: ( rule__TransitionTriggerSpec__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:356:2: rule__TransitionTriggerSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__TransitionTriggerSpec__Alternatives_in_ruleTransitionTriggerSpec694);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:368:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:369:1: ( ruleFieldSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:370:1: ruleFieldSpecification EOF
            {
             before(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification721);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldSpecification728); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:377:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:381:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:382:1: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:382:1: ( ( rule__FieldSpecification__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:383:1: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:384:1: ( rule__FieldSpecification__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:384:2: rule__FieldSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__0_in_ruleFieldSpecification754);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:396:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:397:1: ( ruleOptionSpecification EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:398:1: ruleOptionSpecification EOF
            {
             before(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification781);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionSpecification788); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:405:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:409:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:410:1: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:410:1: ( ( rule__OptionSpecification__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:411:1: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:412:1: ( rule__OptionSpecification__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:412:2: rule__OptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__OptionSpecification__Alternatives_in_ruleOptionSpecification814);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:424:1: entryRuleAllowRestartMenu : ruleAllowRestartMenu EOF ;
    public final void entryRuleAllowRestartMenu() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:425:1: ( ruleAllowRestartMenu EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:426:1: ruleAllowRestartMenu EOF
            {
             before(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu841);
            ruleAllowRestartMenu();

            state._fsp--;

             after(grammarAccess.getAllowRestartMenuRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowRestartMenu848); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:433:1: ruleAllowRestartMenu : ( ( rule__AllowRestartMenu__Group__0 ) ) ;
    public final void ruleAllowRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:437:2: ( ( ( rule__AllowRestartMenu__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:438:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:438:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:439:1: ( rule__AllowRestartMenu__Group__0 )
            {
             before(grammarAccess.getAllowRestartMenuAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:440:1: ( rule__AllowRestartMenu__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:440:2: rule__AllowRestartMenu__Group__0
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__0_in_ruleAllowRestartMenu874);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:452:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:453:1: ( ruleStartFieldDeclaration EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:454:1: ruleStartFieldDeclaration EOF
            {
             before(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration901);
            ruleStartFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getStartFieldDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartFieldDeclaration908); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:461:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:465:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:466:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:466:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:467:1: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:468:1: ( rule__StartFieldDeclaration__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:468:2: rule__StartFieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__0_in_ruleStartFieldDeclaration934);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:480:1: entryRuleFieldInitialisations : ruleFieldInitialisations EOF ;
    public final void entryRuleFieldInitialisations() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:481:1: ( ruleFieldInitialisations EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:482:1: ruleFieldInitialisations EOF
            {
             before(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations961);
            ruleFieldInitialisations();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisations968); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:489:1: ruleFieldInitialisations : ( ( rule__FieldInitialisations__Group__0 ) ) ;
    public final void ruleFieldInitialisations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:493:2: ( ( ( rule__FieldInitialisations__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:494:1: ( ( rule__FieldInitialisations__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:494:1: ( ( rule__FieldInitialisations__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:495:1: ( rule__FieldInitialisations__Group__0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:496:1: ( rule__FieldInitialisations__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:496:2: rule__FieldInitialisations__Group__0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__0_in_ruleFieldInitialisations994);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:508:1: entryRuleFieldInitialisation : ruleFieldInitialisation EOF ;
    public final void entryRuleFieldInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:509:1: ( ruleFieldInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:510:1: ruleFieldInitialisation EOF
            {
             before(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1021);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldInitialisation1028); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:517:1: ruleFieldInitialisation : ( ( rule__FieldInitialisation__Alternatives ) ) ;
    public final void ruleFieldInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:521:2: ( ( ( rule__FieldInitialisation__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:522:1: ( ( rule__FieldInitialisation__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:522:1: ( ( rule__FieldInitialisation__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:523:1: ( rule__FieldInitialisation__Alternatives )
            {
             before(grammarAccess.getFieldInitialisationAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:524:1: ( rule__FieldInitialisation__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:524:2: rule__FieldInitialisation__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldInitialisation__Alternatives_in_ruleFieldInitialisation1054);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:536:1: entryRuleDefaultInitialisation : ruleDefaultInitialisation EOF ;
    public final void entryRuleDefaultInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:537:1: ( ruleDefaultInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:538:1: ruleDefaultInitialisation EOF
            {
             before(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1081);
            ruleDefaultInitialisation();

            state._fsp--;

             after(grammarAccess.getDefaultInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultInitialisation1088); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:545:1: ruleDefaultInitialisation : ( ( rule__DefaultInitialisation__Group__0 ) ) ;
    public final void ruleDefaultInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:549:2: ( ( ( rule__DefaultInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:550:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:550:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:551:1: ( rule__DefaultInitialisation__Group__0 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:552:1: ( rule__DefaultInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:552:2: rule__DefaultInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__0_in_ruleDefaultInitialisation1114);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:564:1: entryRuleRandomInitialisation : ruleRandomInitialisation EOF ;
    public final void entryRuleRandomInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:565:1: ( ruleRandomInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:566:1: ruleRandomInitialisation EOF
            {
             before(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1141);
            ruleRandomInitialisation();

            state._fsp--;

             after(grammarAccess.getRandomInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRandomInitialisation1148); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:573:1: ruleRandomInitialisation : ( ( rule__RandomInitialisation__Group__0 ) ) ;
    public final void ruleRandomInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:577:2: ( ( ( rule__RandomInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:578:1: ( ( rule__RandomInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:578:1: ( ( rule__RandomInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:579:1: ( rule__RandomInitialisation__Group__0 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:580:1: ( rule__RandomInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:580:2: rule__RandomInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__0_in_ruleRandomInitialisation1174);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:592:1: entryRuleContextInitialisation : ruleContextInitialisation EOF ;
    public final void entryRuleContextInitialisation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:593:1: ( ruleContextInitialisation EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:594:1: ruleContextInitialisation EOF
            {
             before(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation1201);
            ruleContextInitialisation();

            state._fsp--;

             after(grammarAccess.getContextInitialisationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextInitialisation1208); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:601:1: ruleContextInitialisation : ( ( rule__ContextInitialisation__Group__0 ) ) ;
    public final void ruleContextInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:605:2: ( ( ( rule__ContextInitialisation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:606:1: ( ( rule__ContextInitialisation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:606:1: ( ( rule__ContextInitialisation__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:607:1: ( rule__ContextInitialisation__Group__0 )
            {
             before(grammarAccess.getContextInitialisationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:608:1: ( rule__ContextInitialisation__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:608:2: rule__ContextInitialisation__Group__0
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__0_in_ruleContextInitialisation1234);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:620:1: entryRuleContextExpression : ruleContextExpression EOF ;
    public final void entryRuleContextExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:621:1: ( ruleContextExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:622:1: ruleContextExpression EOF
            {
             before(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_ruleContextExpression_in_entryRuleContextExpression1261);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContextExpression1268); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:629:1: ruleContextExpression : ( ( rule__ContextExpression__Group__0 ) ) ;
    public final void ruleContextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:633:2: ( ( ( rule__ContextExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:634:1: ( ( rule__ContextExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:634:1: ( ( rule__ContextExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:635:1: ( rule__ContextExpression__Group__0 )
            {
             before(grammarAccess.getContextExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:636:1: ( rule__ContextExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:636:2: rule__ContextExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__0_in_ruleContextExpression1294);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:648:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:649:1: ( ruleAtomicExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:650:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1321);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression1328); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:657:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:661:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:662:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:662:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:663:1: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:664:1: ( rule__AtomicExpression__Alternatives )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:664:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1354);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:676:1: entryRuleFilterExpression : ruleFilterExpression EOF ;
    public final void entryRuleFilterExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:677:1: ( ruleFilterExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:678:1: ruleFilterExpression EOF
            {
             before(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression1381);
            ruleFilterExpression();

            state._fsp--;

             after(grammarAccess.getFilterExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterExpression1388); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:685:1: ruleFilterExpression : ( ( rule__FilterExpression__Group__0 ) ) ;
    public final void ruleFilterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:689:2: ( ( ( rule__FilterExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:690:1: ( ( rule__FilterExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:690:1: ( ( rule__FilterExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:691:1: ( rule__FilterExpression__Group__0 )
            {
             before(grammarAccess.getFilterExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:692:1: ( rule__FilterExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:692:2: rule__FilterExpression__Group__0
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__0_in_ruleFilterExpression1414);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:704:1: entryRuleCountExpression : ruleCountExpression EOF ;
    public final void entryRuleCountExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:705:1: ( ruleCountExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:706:1: ruleCountExpression EOF
            {
             before(grammarAccess.getCountExpressionRule()); 
            pushFollow(FOLLOW_ruleCountExpression_in_entryRuleCountExpression1441);
            ruleCountExpression();

            state._fsp--;

             after(grammarAccess.getCountExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountExpression1448); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:713:1: ruleCountExpression : ( ( rule__CountExpression__Group__0 ) ) ;
    public final void ruleCountExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:717:2: ( ( ( rule__CountExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:718:1: ( ( rule__CountExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:718:1: ( ( rule__CountExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:719:1: ( rule__CountExpression__Group__0 )
            {
             before(grammarAccess.getCountExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:720:1: ( rule__CountExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:720:2: rule__CountExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__0_in_ruleCountExpression1474);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:732:1: entryRuleNotEmptyExpression : ruleNotEmptyExpression EOF ;
    public final void entryRuleNotEmptyExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:733:1: ( ruleNotEmptyExpression EOF )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:734:1: ruleNotEmptyExpression EOF
            {
             before(grammarAccess.getNotEmptyExpressionRule()); 
            pushFollow(FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression1501);
            ruleNotEmptyExpression();

            state._fsp--;

             after(grammarAccess.getNotEmptyExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEmptyExpression1508); 

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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:741:1: ruleNotEmptyExpression : ( ( rule__NotEmptyExpression__Group__0 ) ) ;
    public final void ruleNotEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:745:2: ( ( ( rule__NotEmptyExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:746:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:746:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:747:1: ( rule__NotEmptyExpression__Group__0 )
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:748:1: ( rule__NotEmptyExpression__Group__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:748:2: rule__NotEmptyExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__0_in_ruleNotEmptyExpression1534);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:760:1: rule__CellMember__Alternatives : ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) | ( ruleCellStateSpec ) );
    public final void rule__CellMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:764:1: ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) | ( ruleCellStateSpec ) )
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:765:1: ( ruleCellDisplaySpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:765:1: ( ruleCellDisplaySpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:766:1: ruleCellDisplaySpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCellDisplaySpec_in_rule__CellMember__Alternatives1570);
                    ruleCellDisplaySpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:771:6: ( ruleCellVarSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:771:6: ( ruleCellVarSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:772:1: ruleCellVarSpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCellVarSpec_in_rule__CellMember__Alternatives1587);
                    ruleCellVarSpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:777:6: ( ruleCellStateSpec )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:777:6: ( ruleCellStateSpec )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:778:1: ruleCellStateSpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellStateSpecParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCellStateSpec_in_rule__CellMember__Alternatives1604);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:788:1: rule__CellDisplaySpec__Display_typeAlternatives_3_0 : ( ( 'label' ) | ( 'button' ) );
    public final void rule__CellDisplaySpec__Display_typeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:792:1: ( ( 'label' ) | ( 'button' ) )
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:793:1: ( 'label' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:793:1: ( 'label' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:794:1: 'label'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01637); 
                     after(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:801:6: ( 'button' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:801:6: ( 'button' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:802:1: 'button'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeButtonKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01657); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:814:1: rule__CellDisplaySpec__Alternatives_4 : ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) );
    public final void rule__CellDisplaySpec__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:818:1: ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) )
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:819:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:819:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:820:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:821:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:821:2: rule__CellDisplaySpec__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__0_in_rule__CellDisplaySpec__Alternatives_41691);
                    rule__CellDisplaySpec__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:825:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:825:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:826:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_1()); 
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:827:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:827:2: rule__CellDisplaySpec__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__0_in_rule__CellDisplaySpec__Alternatives_41709);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:836:1: rule__CellVarSpec__TypeAlternatives_1_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__CellVarSpec__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:840:1: ( ( 'int' ) | ( 'String' ) )
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:841:1: ( 'int' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:841:1: ( 'int' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:842:1: 'int'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_01743); 
                     after(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:849:6: ( 'String' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:849:6: ( 'String' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:850:1: 'String'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeStringKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_01763); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:862:1: rule__StateParamSpec__TypeAlternatives_0_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__StateParamSpec__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:866:1: ( ( 'int' ) | ( 'String' ) )
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:867:1: ( 'int' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:867:1: ( 'int' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:868:1: 'int'
                    {
                     before(grammarAccess.getStateParamSpecAccess().getTypeIntKeyword_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__StateParamSpec__TypeAlternatives_0_01798); 
                     after(grammarAccess.getStateParamSpecAccess().getTypeIntKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:875:6: ( 'String' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:875:6: ( 'String' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:876:1: 'String'
                    {
                     before(grammarAccess.getStateParamSpecAccess().getTypeStringKeyword_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__StateParamSpec__TypeAlternatives_0_01818); 
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


    // $ANTLR start "rule__TransitionTriggerSpec__Alternatives"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:888:1: rule__TransitionTriggerSpec__Alternatives : ( ( 'mouse-left' ) | ( 'mouse-right' ) );
    public final void rule__TransitionTriggerSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:892:1: ( ( 'mouse-left' ) | ( 'mouse-right' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:893:1: ( 'mouse-left' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:893:1: ( 'mouse-left' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:894:1: 'mouse-left'
                    {
                     before(grammarAccess.getTransitionTriggerSpecAccess().getMouseLeftKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__TransitionTriggerSpec__Alternatives1853); 
                     after(grammarAccess.getTransitionTriggerSpecAccess().getMouseLeftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:901:6: ( 'mouse-right' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:901:6: ( 'mouse-right' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:902:1: 'mouse-right'
                    {
                     before(grammarAccess.getTransitionTriggerSpecAccess().getMouseRightKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__TransitionTriggerSpec__Alternatives1873); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:914:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:918:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:919:1: ( ruleStartFieldDeclaration )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:919:1: ( ruleStartFieldDeclaration )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:920:1: ruleStartFieldDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives1907);
                    ruleStartFieldDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:925:6: ( ruleAllowRestartMenu )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:925:6: ( ruleAllowRestartMenu )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:926:1: ruleAllowRestartMenu
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives1924);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:936:1: rule__FieldInitialisation__Alternatives : ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) );
    public final void rule__FieldInitialisation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:940:1: ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt8=1;
                }
                break;
            case 42:
                {
                alt8=2;
                }
                break;
            case 43:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:941:1: ( ruleDefaultInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:941:1: ( ruleDefaultInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:942:1: ruleDefaultInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives1956);
                    ruleDefaultInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:947:6: ( ruleRandomInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:947:6: ( ruleRandomInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:948:1: ruleRandomInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives1973);
                    ruleRandomInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:953:6: ( ruleContextInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:953:6: ( ruleContextInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:954:1: ruleContextInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives1990);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:964:1: rule__AtomicExpression__Alternatives : ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:968:1: ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt9=1;
                }
                break;
            case 48:
                {
                alt9=2;
                }
                break;
            case 49:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:969:1: ( ruleFilterExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:969:1: ( ruleFilterExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:970:1: ruleFilterExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives2022);
                    ruleFilterExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:975:6: ( ruleCountExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:975:6: ( ruleCountExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:976:1: ruleCountExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives2039);
                    ruleCountExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:981:6: ( ruleNotEmptyExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:981:6: ( ruleNotEmptyExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:982:1: ruleNotEmptyExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives2056);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:994:1: rule__GridGame__Group__0 : rule__GridGame__Group__0__Impl rule__GridGame__Group__1 ;
    public final void rule__GridGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:998:1: ( rule__GridGame__Group__0__Impl rule__GridGame__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:999:2: rule__GridGame__Group__0__Impl rule__GridGame__Group__1
            {
            pushFollow(FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__02086);
            rule__GridGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__02089);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1006:1: rule__GridGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__GridGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1010:1: ( ( 'game' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1011:1: ( 'game' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1011:1: ( 'game' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1012:1: 'game'
            {
             before(grammarAccess.getGridGameAccess().getGameKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__GridGame__Group__0__Impl2117); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1025:1: rule__GridGame__Group__1 : rule__GridGame__Group__1__Impl rule__GridGame__Group__2 ;
    public final void rule__GridGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1029:1: ( rule__GridGame__Group__1__Impl rule__GridGame__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1030:2: rule__GridGame__Group__1__Impl rule__GridGame__Group__2
            {
            pushFollow(FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__12148);
            rule__GridGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__12151);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1037:1: rule__GridGame__Group__1__Impl : ( ( rule__GridGame__NameAssignment_1 ) ) ;
    public final void rule__GridGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1041:1: ( ( ( rule__GridGame__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1042:1: ( ( rule__GridGame__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1042:1: ( ( rule__GridGame__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1043:1: ( rule__GridGame__NameAssignment_1 )
            {
             before(grammarAccess.getGridGameAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1044:1: ( rule__GridGame__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1044:2: rule__GridGame__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl2178);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1054:1: rule__GridGame__Group__2 : rule__GridGame__Group__2__Impl rule__GridGame__Group__3 ;
    public final void rule__GridGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1058:1: ( rule__GridGame__Group__2__Impl rule__GridGame__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1059:2: rule__GridGame__Group__2__Impl rule__GridGame__Group__3
            {
            pushFollow(FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__22208);
            rule__GridGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__22211);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1066:1: rule__GridGame__Group__2__Impl : ( '{' ) ;
    public final void rule__GridGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1070:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1071:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1071:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1072:1: '{'
            {
             before(grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__GridGame__Group__2__Impl2239); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1085:1: rule__GridGame__Group__3 : rule__GridGame__Group__3__Impl rule__GridGame__Group__4 ;
    public final void rule__GridGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1089:1: ( rule__GridGame__Group__3__Impl rule__GridGame__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1090:2: rule__GridGame__Group__3__Impl rule__GridGame__Group__4
            {
            pushFollow(FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__32270);
            rule__GridGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__32273);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1097:1: rule__GridGame__Group__3__Impl : ( ( rule__GridGame__StatesAssignment_3 )? ) ;
    public final void rule__GridGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1101:1: ( ( ( rule__GridGame__StatesAssignment_3 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1102:1: ( ( rule__GridGame__StatesAssignment_3 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1102:1: ( ( rule__GridGame__StatesAssignment_3 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1103:1: ( rule__GridGame__StatesAssignment_3 )?
            {
             before(grammarAccess.getGridGameAccess().getStatesAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1104:1: ( rule__GridGame__StatesAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1104:2: rule__GridGame__StatesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__GridGame__StatesAssignment_3_in_rule__GridGame__Group__3__Impl2300);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1114:1: rule__GridGame__Group__4 : rule__GridGame__Group__4__Impl rule__GridGame__Group__5 ;
    public final void rule__GridGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1118:1: ( rule__GridGame__Group__4__Impl rule__GridGame__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1119:2: rule__GridGame__Group__4__Impl rule__GridGame__Group__5
            {
            pushFollow(FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__42331);
            rule__GridGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__42334);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1126:1: rule__GridGame__Group__4__Impl : ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) ) ;
    public final void rule__GridGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1130:1: ( ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1131:1: ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1131:1: ( ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1132:1: ( ( rule__GridGame__CellsAssignment_4 ) ) ( ( rule__GridGame__CellsAssignment_4 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1132:1: ( ( rule__GridGame__CellsAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1133:1: ( rule__GridGame__CellsAssignment_4 )
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1134:1: ( rule__GridGame__CellsAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1134:2: rule__GridGame__CellsAssignment_4
            {
            pushFollow(FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2363);
            rule__GridGame__CellsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getCellsAssignment_4()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1137:1: ( ( rule__GridGame__CellsAssignment_4 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1138:1: ( rule__GridGame__CellsAssignment_4 )*
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1139:1: ( rule__GridGame__CellsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1139:2: rule__GridGame__CellsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2375);
            	    rule__GridGame__CellsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1150:1: rule__GridGame__Group__5 : rule__GridGame__Group__5__Impl rule__GridGame__Group__6 ;
    public final void rule__GridGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1154:1: ( rule__GridGame__Group__5__Impl rule__GridGame__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1155:2: rule__GridGame__Group__5__Impl rule__GridGame__Group__6
            {
            pushFollow(FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__52408);
            rule__GridGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__52411);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1162:1: rule__GridGame__Group__5__Impl : ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) ) ;
    public final void rule__GridGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1166:1: ( ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1167:1: ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1167:1: ( ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1168:1: ( ( rule__GridGame__FieldsAssignment_5 ) ) ( ( rule__GridGame__FieldsAssignment_5 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1168:1: ( ( rule__GridGame__FieldsAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1169:1: ( rule__GridGame__FieldsAssignment_5 )
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1170:1: ( rule__GridGame__FieldsAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1170:2: rule__GridGame__FieldsAssignment_5
            {
            pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2440);
            rule__GridGame__FieldsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getFieldsAssignment_5()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1173:1: ( ( rule__GridGame__FieldsAssignment_5 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1174:1: ( rule__GridGame__FieldsAssignment_5 )*
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1175:1: ( rule__GridGame__FieldsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1175:2: rule__GridGame__FieldsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2452);
            	    rule__GridGame__FieldsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1186:1: rule__GridGame__Group__6 : rule__GridGame__Group__6__Impl rule__GridGame__Group__7 ;
    public final void rule__GridGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1190:1: ( rule__GridGame__Group__6__Impl rule__GridGame__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1191:2: rule__GridGame__Group__6__Impl rule__GridGame__Group__7
            {
            pushFollow(FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__62485);
            rule__GridGame__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__7_in_rule__GridGame__Group__62488);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1198:1: rule__GridGame__Group__6__Impl : ( ( rule__GridGame__OptionsAssignment_6 )* ) ;
    public final void rule__GridGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1202:1: ( ( ( rule__GridGame__OptionsAssignment_6 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1203:1: ( ( rule__GridGame__OptionsAssignment_6 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1203:1: ( ( rule__GridGame__OptionsAssignment_6 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1204:1: ( rule__GridGame__OptionsAssignment_6 )*
            {
             before(grammarAccess.getGridGameAccess().getOptionsAssignment_6()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1205:1: ( rule__GridGame__OptionsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26||LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1205:2: rule__GridGame__OptionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__OptionsAssignment_6_in_rule__GridGame__Group__6__Impl2515);
            	    rule__GridGame__OptionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1215:1: rule__GridGame__Group__7 : rule__GridGame__Group__7__Impl ;
    public final void rule__GridGame__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1219:1: ( rule__GridGame__Group__7__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1220:2: rule__GridGame__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GridGame__Group__7__Impl_in_rule__GridGame__Group__72546);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1226:1: rule__GridGame__Group__7__Impl : ( '}' ) ;
    public final void rule__GridGame__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1230:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1231:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1231:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1232:1: '}'
            {
             before(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__GridGame__Group__7__Impl2574); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1261:1: rule__CellSpecification__Group__0 : rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 ;
    public final void rule__CellSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1265:1: ( rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1266:2: rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__02621);
            rule__CellSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__02624);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1273:1: rule__CellSpecification__Group__0__Impl : ( 'cell' ) ;
    public final void rule__CellSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1277:1: ( ( 'cell' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1278:1: ( 'cell' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1278:1: ( 'cell' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1279:1: 'cell'
            {
             before(grammarAccess.getCellSpecificationAccess().getCellKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__CellSpecification__Group__0__Impl2652); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1292:1: rule__CellSpecification__Group__1 : rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 ;
    public final void rule__CellSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1296:1: ( rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1297:2: rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__12683);
            rule__CellSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__12686);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1304:1: rule__CellSpecification__Group__1__Impl : ( ( rule__CellSpecification__NameAssignment_1 ) ) ;
    public final void rule__CellSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1308:1: ( ( ( rule__CellSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1309:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1309:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1310:1: ( rule__CellSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getCellSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1311:1: ( rule__CellSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1311:2: rule__CellSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl2713);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1321:1: rule__CellSpecification__Group__2 : rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 ;
    public final void rule__CellSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1325:1: ( rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1326:2: rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__22743);
            rule__CellSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__22746);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1333:1: rule__CellSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__CellSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1337:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1338:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1338:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1339:1: '{'
            {
             before(grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__CellSpecification__Group__2__Impl2774); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1352:1: rule__CellSpecification__Group__3 : rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 ;
    public final void rule__CellSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1356:1: ( rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1357:2: rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__32805);
            rule__CellSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__32808);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1364:1: rule__CellSpecification__Group__3__Impl : ( ( rule__CellSpecification__MembersAssignment_3 )* ) ;
    public final void rule__CellSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1368:1: ( ( ( rule__CellSpecification__MembersAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1369:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1369:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1370:1: ( rule__CellSpecification__MembersAssignment_3 )*
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1371:1: ( rule__CellSpecification__MembersAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21||(LA14_0>=24 && LA14_0<=25)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1371:2: rule__CellSpecification__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl2835);
            	    rule__CellSpecification__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1381:1: rule__CellSpecification__Group__4 : rule__CellSpecification__Group__4__Impl ;
    public final void rule__CellSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1385:1: ( rule__CellSpecification__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1386:2: rule__CellSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__42866);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1392:1: rule__CellSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__CellSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1396:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1397:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1397:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1398:1: '}'
            {
             before(grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__CellSpecification__Group__4__Impl2894); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1421:1: rule__CellDisplaySpec__Group__0 : rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 ;
    public final void rule__CellDisplaySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1425:1: ( rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1426:2: rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__02935);
            rule__CellDisplaySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__02938);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1433:1: rule__CellDisplaySpec__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplaySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1437:1: ( ( 'display' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1438:1: ( 'display' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1438:1: ( 'display' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1439:1: 'display'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__CellDisplaySpec__Group__0__Impl2966); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1452:1: rule__CellDisplaySpec__Group__1 : rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 ;
    public final void rule__CellDisplaySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1456:1: ( rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1457:2: rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__12997);
            rule__CellDisplaySpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__13000);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1464:1: rule__CellDisplaySpec__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplaySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1468:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1469:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1469:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1470:1: '{'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__CellDisplaySpec__Group__1__Impl3028); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1483:1: rule__CellDisplaySpec__Group__2 : rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 ;
    public final void rule__CellDisplaySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1487:1: ( rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1488:2: rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__23059);
            rule__CellDisplaySpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__23062);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1495:1: rule__CellDisplaySpec__Group__2__Impl : ( 'as' ) ;
    public final void rule__CellDisplaySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1499:1: ( ( 'as' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1500:1: ( 'as' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1500:1: ( 'as' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1501:1: 'as'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__CellDisplaySpec__Group__2__Impl3090); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1514:1: rule__CellDisplaySpec__Group__3 : rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 ;
    public final void rule__CellDisplaySpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1518:1: ( rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1519:2: rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__33121);
            rule__CellDisplaySpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__33124);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1526:1: rule__CellDisplaySpec__Group__3__Impl : ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) ;
    public final void rule__CellDisplaySpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1530:1: ( ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1531:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1531:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1532:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1533:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1533:2: rule__CellDisplaySpec__Display_typeAssignment_3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl3151);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1543:1: rule__CellDisplaySpec__Group__4 : rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 ;
    public final void rule__CellDisplaySpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1547:1: ( rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1548:2: rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__43181);
            rule__CellDisplaySpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__43184);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1555:1: rule__CellDisplaySpec__Group__4__Impl : ( ( rule__CellDisplaySpec__Alternatives_4 ) ) ;
    public final void rule__CellDisplaySpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1559:1: ( ( ( rule__CellDisplaySpec__Alternatives_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1560:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1560:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1561:1: ( rule__CellDisplaySpec__Alternatives_4 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAlternatives_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1562:1: ( rule__CellDisplaySpec__Alternatives_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1562:2: rule__CellDisplaySpec__Alternatives_4
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Alternatives_4_in_rule__CellDisplaySpec__Group__4__Impl3211);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1572:1: rule__CellDisplaySpec__Group__5 : rule__CellDisplaySpec__Group__5__Impl ;
    public final void rule__CellDisplaySpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1576:1: ( rule__CellDisplaySpec__Group__5__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1577:2: rule__CellDisplaySpec__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__53241);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1583:1: rule__CellDisplaySpec__Group__5__Impl : ( '}' ) ;
    public final void rule__CellDisplaySpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1587:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1588:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1588:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1589:1: '}'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__CellDisplaySpec__Group__5__Impl3269); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1614:1: rule__CellDisplaySpec__Group_4_0__0 : rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 ;
    public final void rule__CellDisplaySpec__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1618:1: ( rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1619:2: rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__0__Impl_in_rule__CellDisplaySpec__Group_4_0__03312);
            rule__CellDisplaySpec__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__1_in_rule__CellDisplaySpec__Group_4_0__03315);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1626:1: rule__CellDisplaySpec__Group_4_0__0__Impl : ( 'text' ) ;
    public final void rule__CellDisplaySpec__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1630:1: ( ( 'text' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1631:1: ( 'text' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1631:1: ( 'text' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1632:1: 'text'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0()); 
            match(input,23,FOLLOW_23_in_rule__CellDisplaySpec__Group_4_0__0__Impl3343); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1645:1: rule__CellDisplaySpec__Group_4_0__1 : rule__CellDisplaySpec__Group_4_0__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1649:1: ( rule__CellDisplaySpec__Group_4_0__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1650:2: rule__CellDisplaySpec__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__1__Impl_in_rule__CellDisplaySpec__Group_4_0__13374);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1656:1: rule__CellDisplaySpec__Group_4_0__1__Impl : ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1660:1: ( ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1661:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1661:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1662:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_4_0_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1663:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1663:2: rule__CellDisplaySpec__TextAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__TextAssignment_4_0_1_in_rule__CellDisplaySpec__Group_4_0__1__Impl3401);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1677:1: rule__CellDisplaySpec__Group_4_1__0 : rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 ;
    public final void rule__CellDisplaySpec__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1681:1: ( rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1682:2: rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__0__Impl_in_rule__CellDisplaySpec__Group_4_1__03435);
            rule__CellDisplaySpec__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__1_in_rule__CellDisplaySpec__Group_4_1__03438);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1689:1: rule__CellDisplaySpec__Group_4_1__0__Impl : ( 'var' ) ;
    public final void rule__CellDisplaySpec__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1693:1: ( ( 'var' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1694:1: ( 'var' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1694:1: ( 'var' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1695:1: 'var'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0()); 
            match(input,24,FOLLOW_24_in_rule__CellDisplaySpec__Group_4_1__0__Impl3466); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1708:1: rule__CellDisplaySpec__Group_4_1__1 : rule__CellDisplaySpec__Group_4_1__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1712:1: ( rule__CellDisplaySpec__Group_4_1__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1713:2: rule__CellDisplaySpec__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__1__Impl_in_rule__CellDisplaySpec__Group_4_1__13497);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1719:1: rule__CellDisplaySpec__Group_4_1__1__Impl : ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1723:1: ( ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1724:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1724:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1725:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarAssignment_4_1_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1726:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1726:2: rule__CellDisplaySpec__VarAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__VarAssignment_4_1_1_in_rule__CellDisplaySpec__Group_4_1__1__Impl3524);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1740:1: rule__CellVarSpec__Group__0 : rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 ;
    public final void rule__CellVarSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1744:1: ( rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1745:2: rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__03558);
            rule__CellVarSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__03561);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1752:1: rule__CellVarSpec__Group__0__Impl : ( 'var' ) ;
    public final void rule__CellVarSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1756:1: ( ( 'var' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1757:1: ( 'var' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1757:1: ( 'var' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1758:1: 'var'
            {
             before(grammarAccess.getCellVarSpecAccess().getVarKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__CellVarSpec__Group__0__Impl3589); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1771:1: rule__CellVarSpec__Group__1 : rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 ;
    public final void rule__CellVarSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1775:1: ( rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1776:2: rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__13620);
            rule__CellVarSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__13623);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1783:1: rule__CellVarSpec__Group__1__Impl : ( ( rule__CellVarSpec__TypeAssignment_1 ) ) ;
    public final void rule__CellVarSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1787:1: ( ( ( rule__CellVarSpec__TypeAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1788:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1788:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1789:1: ( rule__CellVarSpec__TypeAssignment_1 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1790:1: ( rule__CellVarSpec__TypeAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1790:2: rule__CellVarSpec__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl3650);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1800:1: rule__CellVarSpec__Group__2 : rule__CellVarSpec__Group__2__Impl ;
    public final void rule__CellVarSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1804:1: ( rule__CellVarSpec__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1805:2: rule__CellVarSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__23680);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1811:1: rule__CellVarSpec__Group__2__Impl : ( ( rule__CellVarSpec__NameAssignment_2 ) ) ;
    public final void rule__CellVarSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1815:1: ( ( ( rule__CellVarSpec__NameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1816:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1816:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1817:1: ( rule__CellVarSpec__NameAssignment_2 )
            {
             before(grammarAccess.getCellVarSpecAccess().getNameAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1818:1: ( rule__CellVarSpec__NameAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1818:2: rule__CellVarSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl3707);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1834:1: rule__GlobalCellStateSpec__Group__0 : rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1 ;
    public final void rule__GlobalCellStateSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1838:1: ( rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1839:2: rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__0__Impl_in_rule__GlobalCellStateSpec__Group__03743);
            rule__GlobalCellStateSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__1_in_rule__GlobalCellStateSpec__Group__03746);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1846:1: rule__GlobalCellStateSpec__Group__0__Impl : ( 'states' ) ;
    public final void rule__GlobalCellStateSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1850:1: ( ( 'states' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1851:1: ( 'states' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1851:1: ( 'states' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1852:1: 'states'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__GlobalCellStateSpec__Group__0__Impl3774); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1865:1: rule__GlobalCellStateSpec__Group__1 : rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2 ;
    public final void rule__GlobalCellStateSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1869:1: ( rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1870:2: rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__1__Impl_in_rule__GlobalCellStateSpec__Group__13805);
            rule__GlobalCellStateSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__2_in_rule__GlobalCellStateSpec__Group__13808);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1877:1: rule__GlobalCellStateSpec__Group__1__Impl : ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1881:1: ( ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1882:1: ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1882:1: ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1883:1: ( rule__GlobalCellStateSpec__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1884:1: ( rule__GlobalCellStateSpec__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1884:2: rule__GlobalCellStateSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__NameAssignment_1_in_rule__GlobalCellStateSpec__Group__1__Impl3835);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1894:1: rule__GlobalCellStateSpec__Group__2 : rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3 ;
    public final void rule__GlobalCellStateSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1898:1: ( rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1899:2: rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__2__Impl_in_rule__GlobalCellStateSpec__Group__23865);
            rule__GlobalCellStateSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__3_in_rule__GlobalCellStateSpec__Group__23868);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1906:1: rule__GlobalCellStateSpec__Group__2__Impl : ( ( rule__GlobalCellStateSpec__Group_2__0 )? ) ;
    public final void rule__GlobalCellStateSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1910:1: ( ( ( rule__GlobalCellStateSpec__Group_2__0 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1911:1: ( ( rule__GlobalCellStateSpec__Group_2__0 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1911:1: ( ( rule__GlobalCellStateSpec__Group_2__0 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1912:1: ( rule__GlobalCellStateSpec__Group_2__0 )?
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1913:1: ( rule__GlobalCellStateSpec__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1913:2: rule__GlobalCellStateSpec__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__0_in_rule__GlobalCellStateSpec__Group__2__Impl3895);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1923:1: rule__GlobalCellStateSpec__Group__3 : rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4 ;
    public final void rule__GlobalCellStateSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1927:1: ( rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1928:2: rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__3__Impl_in_rule__GlobalCellStateSpec__Group__33926);
            rule__GlobalCellStateSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__4_in_rule__GlobalCellStateSpec__Group__33929);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1935:1: rule__GlobalCellStateSpec__Group__3__Impl : ( '{' ) ;
    public final void rule__GlobalCellStateSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1939:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1940:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1940:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1941:1: '{'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__GlobalCellStateSpec__Group__3__Impl3957); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1954:1: rule__GlobalCellStateSpec__Group__4 : rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5 ;
    public final void rule__GlobalCellStateSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1958:1: ( rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1959:2: rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__4__Impl_in_rule__GlobalCellStateSpec__Group__43988);
            rule__GlobalCellStateSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__5_in_rule__GlobalCellStateSpec__Group__43991);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1966:1: rule__GlobalCellStateSpec__Group__4__Impl : ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) ) ;
    public final void rule__GlobalCellStateSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1970:1: ( ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1971:1: ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1971:1: ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1972:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1972:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1973:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1974:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1974:2: rule__GlobalCellStateSpec__StatesAssignment_4
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4020);
            rule__GlobalCellStateSpec__StatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1977:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1978:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )*
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1979:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1979:2: rule__GlobalCellStateSpec__StatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4032);
            	    rule__GlobalCellStateSpec__StatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1990:1: rule__GlobalCellStateSpec__Group__5 : rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6 ;
    public final void rule__GlobalCellStateSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1994:1: ( rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1995:2: rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__5__Impl_in_rule__GlobalCellStateSpec__Group__54065);
            rule__GlobalCellStateSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__6_in_rule__GlobalCellStateSpec__Group__54068);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2002:1: rule__GlobalCellStateSpec__Group__5__Impl : ( 'start' ) ;
    public final void rule__GlobalCellStateSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2006:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2007:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2007:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2008:1: 'start'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__GlobalCellStateSpec__Group__5__Impl4096); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2021:1: rule__GlobalCellStateSpec__Group__6 : rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7 ;
    public final void rule__GlobalCellStateSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2025:1: ( rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2026:2: rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__6__Impl_in_rule__GlobalCellStateSpec__Group__64127);
            rule__GlobalCellStateSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__7_in_rule__GlobalCellStateSpec__Group__64130);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2033:1: rule__GlobalCellStateSpec__Group__6__Impl : ( '=' ) ;
    public final void rule__GlobalCellStateSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2037:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2038:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2038:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2039:1: '='
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getEqualsSignKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__GlobalCellStateSpec__Group__6__Impl4158); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2052:1: rule__GlobalCellStateSpec__Group__7 : rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8 ;
    public final void rule__GlobalCellStateSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2056:1: ( rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2057:2: rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__7__Impl_in_rule__GlobalCellStateSpec__Group__74189);
            rule__GlobalCellStateSpec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__8_in_rule__GlobalCellStateSpec__Group__74192);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2064:1: rule__GlobalCellStateSpec__Group__7__Impl : ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) ) ;
    public final void rule__GlobalCellStateSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2068:1: ( ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2069:1: ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2069:1: ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2070:1: ( rule__GlobalCellStateSpec__StartAssignment_7 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartAssignment_7()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2071:1: ( rule__GlobalCellStateSpec__StartAssignment_7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2071:2: rule__GlobalCellStateSpec__StartAssignment_7
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__StartAssignment_7_in_rule__GlobalCellStateSpec__Group__7__Impl4219);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2081:1: rule__GlobalCellStateSpec__Group__8 : rule__GlobalCellStateSpec__Group__8__Impl ;
    public final void rule__GlobalCellStateSpec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2085:1: ( rule__GlobalCellStateSpec__Group__8__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2086:2: rule__GlobalCellStateSpec__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group__8__Impl_in_rule__GlobalCellStateSpec__Group__84249);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2092:1: rule__GlobalCellStateSpec__Group__8__Impl : ( '}' ) ;
    public final void rule__GlobalCellStateSpec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2096:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2097:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2097:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2098:1: '}'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__GlobalCellStateSpec__Group__8__Impl4277); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2129:1: rule__GlobalCellStateSpec__Group_2__0 : rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1 ;
    public final void rule__GlobalCellStateSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2133:1: ( rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2134:2: rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2__04326);
            rule__GlobalCellStateSpec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__1_in_rule__GlobalCellStateSpec__Group_2__04329);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2141:1: rule__GlobalCellStateSpec__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GlobalCellStateSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2145:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2146:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2146:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2147:1: '('
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__GlobalCellStateSpec__Group_2__0__Impl4357); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2160:1: rule__GlobalCellStateSpec__Group_2__1 : rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2 ;
    public final void rule__GlobalCellStateSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2164:1: ( rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2165:2: rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2__14388);
            rule__GlobalCellStateSpec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__2_in_rule__GlobalCellStateSpec__Group_2__14391);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2172:1: rule__GlobalCellStateSpec__Group_2__1__Impl : ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2176:1: ( ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2177:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2177:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2178:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2179:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2179:2: rule__GlobalCellStateSpec__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_1_in_rule__GlobalCellStateSpec__Group_2__1__Impl4418);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2189:1: rule__GlobalCellStateSpec__Group_2__2 : rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3 ;
    public final void rule__GlobalCellStateSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2193:1: ( rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2194:2: rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__2__Impl_in_rule__GlobalCellStateSpec__Group_2__24448);
            rule__GlobalCellStateSpec__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__3_in_rule__GlobalCellStateSpec__Group_2__24451);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2201:1: rule__GlobalCellStateSpec__Group_2__2__Impl : ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* ) ;
    public final void rule__GlobalCellStateSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2205:1: ( ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2206:1: ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2206:1: ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2207:1: ( rule__GlobalCellStateSpec__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2208:1: ( rule__GlobalCellStateSpec__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2208:2: rule__GlobalCellStateSpec__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0_in_rule__GlobalCellStateSpec__Group_2__2__Impl4478);
            	    rule__GlobalCellStateSpec__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2218:1: rule__GlobalCellStateSpec__Group_2__3 : rule__GlobalCellStateSpec__Group_2__3__Impl ;
    public final void rule__GlobalCellStateSpec__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2222:1: ( rule__GlobalCellStateSpec__Group_2__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2223:2: rule__GlobalCellStateSpec__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2__3__Impl_in_rule__GlobalCellStateSpec__Group_2__34509);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2229:1: rule__GlobalCellStateSpec__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GlobalCellStateSpec__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2233:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2234:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2234:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2235:1: ')'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getRightParenthesisKeyword_2_3()); 
            match(input,29,FOLLOW_29_in_rule__GlobalCellStateSpec__Group_2__3__Impl4537); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2256:1: rule__GlobalCellStateSpec__Group_2_2__0 : rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1 ;
    public final void rule__GlobalCellStateSpec__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2260:1: ( rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2261:2: rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2_2__04576);
            rule__GlobalCellStateSpec__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1_in_rule__GlobalCellStateSpec__Group_2_2__04579);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2268:1: rule__GlobalCellStateSpec__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GlobalCellStateSpec__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2272:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2273:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2273:1: ( ',' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2274:1: ','
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getCommaKeyword_2_2_0()); 
            match(input,30,FOLLOW_30_in_rule__GlobalCellStateSpec__Group_2_2__0__Impl4607); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2287:1: rule__GlobalCellStateSpec__Group_2_2__1 : rule__GlobalCellStateSpec__Group_2_2__1__Impl ;
    public final void rule__GlobalCellStateSpec__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2291:1: ( rule__GlobalCellStateSpec__Group_2_2__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2292:2: rule__GlobalCellStateSpec__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2_2__14638);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2298:1: rule__GlobalCellStateSpec__Group_2_2__1__Impl : ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2302:1: ( ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2303:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2303:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2304:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_2_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2305:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2305:2: rule__GlobalCellStateSpec__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_2_1_in_rule__GlobalCellStateSpec__Group_2_2__1__Impl4665);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2319:1: rule__StateParamSpec__Group__0 : rule__StateParamSpec__Group__0__Impl rule__StateParamSpec__Group__1 ;
    public final void rule__StateParamSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2323:1: ( rule__StateParamSpec__Group__0__Impl rule__StateParamSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2324:2: rule__StateParamSpec__Group__0__Impl rule__StateParamSpec__Group__1
            {
            pushFollow(FOLLOW_rule__StateParamSpec__Group__0__Impl_in_rule__StateParamSpec__Group__04699);
            rule__StateParamSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateParamSpec__Group__1_in_rule__StateParamSpec__Group__04702);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2331:1: rule__StateParamSpec__Group__0__Impl : ( ( rule__StateParamSpec__TypeAssignment_0 ) ) ;
    public final void rule__StateParamSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2335:1: ( ( ( rule__StateParamSpec__TypeAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2336:1: ( ( rule__StateParamSpec__TypeAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2336:1: ( ( rule__StateParamSpec__TypeAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2337:1: ( rule__StateParamSpec__TypeAssignment_0 )
            {
             before(grammarAccess.getStateParamSpecAccess().getTypeAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2338:1: ( rule__StateParamSpec__TypeAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2338:2: rule__StateParamSpec__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StateParamSpec__TypeAssignment_0_in_rule__StateParamSpec__Group__0__Impl4729);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2348:1: rule__StateParamSpec__Group__1 : rule__StateParamSpec__Group__1__Impl ;
    public final void rule__StateParamSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2352:1: ( rule__StateParamSpec__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2353:2: rule__StateParamSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StateParamSpec__Group__1__Impl_in_rule__StateParamSpec__Group__14759);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2359:1: rule__StateParamSpec__Group__1__Impl : ( ( rule__StateParamSpec__NameAssignment_1 ) ) ;
    public final void rule__StateParamSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2363:1: ( ( ( rule__StateParamSpec__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2364:1: ( ( rule__StateParamSpec__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2364:1: ( ( rule__StateParamSpec__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2365:1: ( rule__StateParamSpec__NameAssignment_1 )
            {
             before(grammarAccess.getStateParamSpecAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2366:1: ( rule__StateParamSpec__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2366:2: rule__StateParamSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StateParamSpec__NameAssignment_1_in_rule__StateParamSpec__Group__1__Impl4786);
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


    // $ANTLR start "rule__CellStateSpec__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2380:1: rule__CellStateSpec__Group__0 : rule__CellStateSpec__Group__0__Impl rule__CellStateSpec__Group__1 ;
    public final void rule__CellStateSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2384:1: ( rule__CellStateSpec__Group__0__Impl rule__CellStateSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2385:2: rule__CellStateSpec__Group__0__Impl rule__CellStateSpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__0__Impl_in_rule__CellStateSpec__Group__04820);
            rule__CellStateSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpec__Group__1_in_rule__CellStateSpec__Group__04823);
            rule__CellStateSpec__Group__1();

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
    // $ANTLR end "rule__CellStateSpec__Group__0"


    // $ANTLR start "rule__CellStateSpec__Group__0__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2392:1: rule__CellStateSpec__Group__0__Impl : ( 'states' ) ;
    public final void rule__CellStateSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2396:1: ( ( 'states' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2397:1: ( 'states' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2397:1: ( 'states' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2398:1: 'states'
            {
             before(grammarAccess.getCellStateSpecAccess().getStatesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__CellStateSpec__Group__0__Impl4851); 
             after(grammarAccess.getCellStateSpecAccess().getStatesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__Group__0__Impl"


    // $ANTLR start "rule__CellStateSpec__Group__1"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2411:1: rule__CellStateSpec__Group__1 : rule__CellStateSpec__Group__1__Impl rule__CellStateSpec__Group__2 ;
    public final void rule__CellStateSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2415:1: ( rule__CellStateSpec__Group__1__Impl rule__CellStateSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2416:2: rule__CellStateSpec__Group__1__Impl rule__CellStateSpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__1__Impl_in_rule__CellStateSpec__Group__14882);
            rule__CellStateSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpec__Group__2_in_rule__CellStateSpec__Group__14885);
            rule__CellStateSpec__Group__2();

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
    // $ANTLR end "rule__CellStateSpec__Group__1"


    // $ANTLR start "rule__CellStateSpec__Group__1__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2423:1: rule__CellStateSpec__Group__1__Impl : ( '{' ) ;
    public final void rule__CellStateSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2427:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2428:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2428:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2429:1: '{'
            {
             before(grammarAccess.getCellStateSpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__CellStateSpec__Group__1__Impl4913); 
             after(grammarAccess.getCellStateSpecAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__Group__1__Impl"


    // $ANTLR start "rule__CellStateSpec__Group__2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2442:1: rule__CellStateSpec__Group__2 : rule__CellStateSpec__Group__2__Impl rule__CellStateSpec__Group__3 ;
    public final void rule__CellStateSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2446:1: ( rule__CellStateSpec__Group__2__Impl rule__CellStateSpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2447:2: rule__CellStateSpec__Group__2__Impl rule__CellStateSpec__Group__3
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__2__Impl_in_rule__CellStateSpec__Group__24944);
            rule__CellStateSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpec__Group__3_in_rule__CellStateSpec__Group__24947);
            rule__CellStateSpec__Group__3();

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
    // $ANTLR end "rule__CellStateSpec__Group__2"


    // $ANTLR start "rule__CellStateSpec__Group__2__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2454:1: rule__CellStateSpec__Group__2__Impl : ( ( ( rule__CellStateSpec__StatesAssignment_2 ) ) ( ( rule__CellStateSpec__StatesAssignment_2 )* ) ) ;
    public final void rule__CellStateSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2458:1: ( ( ( ( rule__CellStateSpec__StatesAssignment_2 ) ) ( ( rule__CellStateSpec__StatesAssignment_2 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2459:1: ( ( ( rule__CellStateSpec__StatesAssignment_2 ) ) ( ( rule__CellStateSpec__StatesAssignment_2 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2459:1: ( ( ( rule__CellStateSpec__StatesAssignment_2 ) ) ( ( rule__CellStateSpec__StatesAssignment_2 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2460:1: ( ( rule__CellStateSpec__StatesAssignment_2 ) ) ( ( rule__CellStateSpec__StatesAssignment_2 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2460:1: ( ( rule__CellStateSpec__StatesAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2461:1: ( rule__CellStateSpec__StatesAssignment_2 )
            {
             before(grammarAccess.getCellStateSpecAccess().getStatesAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2462:1: ( rule__CellStateSpec__StatesAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2462:2: rule__CellStateSpec__StatesAssignment_2
            {
            pushFollow(FOLLOW_rule__CellStateSpec__StatesAssignment_2_in_rule__CellStateSpec__Group__2__Impl4976);
            rule__CellStateSpec__StatesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecAccess().getStatesAssignment_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2465:1: ( ( rule__CellStateSpec__StatesAssignment_2 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2466:1: ( rule__CellStateSpec__StatesAssignment_2 )*
            {
             before(grammarAccess.getCellStateSpecAccess().getStatesAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2467:1: ( rule__CellStateSpec__StatesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2467:2: rule__CellStateSpec__StatesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__CellStateSpec__StatesAssignment_2_in_rule__CellStateSpec__Group__2__Impl4988);
            	    rule__CellStateSpec__StatesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCellStateSpecAccess().getStatesAssignment_2()); 

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
    // $ANTLR end "rule__CellStateSpec__Group__2__Impl"


    // $ANTLR start "rule__CellStateSpec__Group__3"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2478:1: rule__CellStateSpec__Group__3 : rule__CellStateSpec__Group__3__Impl rule__CellStateSpec__Group__4 ;
    public final void rule__CellStateSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2482:1: ( rule__CellStateSpec__Group__3__Impl rule__CellStateSpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2483:2: rule__CellStateSpec__Group__3__Impl rule__CellStateSpec__Group__4
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__3__Impl_in_rule__CellStateSpec__Group__35021);
            rule__CellStateSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpec__Group__4_in_rule__CellStateSpec__Group__35024);
            rule__CellStateSpec__Group__4();

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
    // $ANTLR end "rule__CellStateSpec__Group__3"


    // $ANTLR start "rule__CellStateSpec__Group__3__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2490:1: rule__CellStateSpec__Group__3__Impl : ( 'start' ) ;
    public final void rule__CellStateSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2494:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2495:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2495:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2496:1: 'start'
            {
             before(grammarAccess.getCellStateSpecAccess().getStartKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__CellStateSpec__Group__3__Impl5052); 
             after(grammarAccess.getCellStateSpecAccess().getStartKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__Group__3__Impl"


    // $ANTLR start "rule__CellStateSpec__Group__4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2509:1: rule__CellStateSpec__Group__4 : rule__CellStateSpec__Group__4__Impl rule__CellStateSpec__Group__5 ;
    public final void rule__CellStateSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2513:1: ( rule__CellStateSpec__Group__4__Impl rule__CellStateSpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2514:2: rule__CellStateSpec__Group__4__Impl rule__CellStateSpec__Group__5
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__4__Impl_in_rule__CellStateSpec__Group__45083);
            rule__CellStateSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpec__Group__5_in_rule__CellStateSpec__Group__45086);
            rule__CellStateSpec__Group__5();

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
    // $ANTLR end "rule__CellStateSpec__Group__4"


    // $ANTLR start "rule__CellStateSpec__Group__4__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2521:1: rule__CellStateSpec__Group__4__Impl : ( '=' ) ;
    public final void rule__CellStateSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2525:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2526:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2526:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2527:1: '='
            {
             before(grammarAccess.getCellStateSpecAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__CellStateSpec__Group__4__Impl5114); 
             after(grammarAccess.getCellStateSpecAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__Group__4__Impl"


    // $ANTLR start "rule__CellStateSpec__Group__5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2540:1: rule__CellStateSpec__Group__5 : rule__CellStateSpec__Group__5__Impl rule__CellStateSpec__Group__6 ;
    public final void rule__CellStateSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2544:1: ( rule__CellStateSpec__Group__5__Impl rule__CellStateSpec__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2545:2: rule__CellStateSpec__Group__5__Impl rule__CellStateSpec__Group__6
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__5__Impl_in_rule__CellStateSpec__Group__55145);
            rule__CellStateSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellStateSpec__Group__6_in_rule__CellStateSpec__Group__55148);
            rule__CellStateSpec__Group__6();

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
    // $ANTLR end "rule__CellStateSpec__Group__5"


    // $ANTLR start "rule__CellStateSpec__Group__5__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2552:1: rule__CellStateSpec__Group__5__Impl : ( ( rule__CellStateSpec__StartAssignment_5 ) ) ;
    public final void rule__CellStateSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2556:1: ( ( ( rule__CellStateSpec__StartAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2557:1: ( ( rule__CellStateSpec__StartAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2557:1: ( ( rule__CellStateSpec__StartAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2558:1: ( rule__CellStateSpec__StartAssignment_5 )
            {
             before(grammarAccess.getCellStateSpecAccess().getStartAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2559:1: ( rule__CellStateSpec__StartAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2559:2: rule__CellStateSpec__StartAssignment_5
            {
            pushFollow(FOLLOW_rule__CellStateSpec__StartAssignment_5_in_rule__CellStateSpec__Group__5__Impl5175);
            rule__CellStateSpec__StartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCellStateSpecAccess().getStartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__Group__5__Impl"


    // $ANTLR start "rule__CellStateSpec__Group__6"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2569:1: rule__CellStateSpec__Group__6 : rule__CellStateSpec__Group__6__Impl ;
    public final void rule__CellStateSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2573:1: ( rule__CellStateSpec__Group__6__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2574:2: rule__CellStateSpec__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CellStateSpec__Group__6__Impl_in_rule__CellStateSpec__Group__65205);
            rule__CellStateSpec__Group__6__Impl();

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
    // $ANTLR end "rule__CellStateSpec__Group__6"


    // $ANTLR start "rule__CellStateSpec__Group__6__Impl"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2580:1: rule__CellStateSpec__Group__6__Impl : ( '}' ) ;
    public final void rule__CellStateSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2584:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2585:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2585:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2586:1: '}'
            {
             before(grammarAccess.getCellStateSpecAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__CellStateSpec__Group__6__Impl5233); 
             after(grammarAccess.getCellStateSpecAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__Group__6__Impl"


    // $ANTLR start "rule__CellState__Group__0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2613:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2617:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2618:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_rule__CellState__Group__0__Impl_in_rule__CellState__Group__05278);
            rule__CellState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__1_in_rule__CellState__Group__05281);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2625:1: rule__CellState__Group__0__Impl : ( ( rule__CellState__NameAssignment_0 ) ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2629:1: ( ( ( rule__CellState__NameAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2630:1: ( ( rule__CellState__NameAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2630:1: ( ( rule__CellState__NameAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2631:1: ( rule__CellState__NameAssignment_0 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2632:1: ( rule__CellState__NameAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2632:2: rule__CellState__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CellState__NameAssignment_0_in_rule__CellState__Group__0__Impl5308);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2642:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl rule__CellState__Group__2 ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2646:1: ( rule__CellState__Group__1__Impl rule__CellState__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2647:2: rule__CellState__Group__1__Impl rule__CellState__Group__2
            {
            pushFollow(FOLLOW_rule__CellState__Group__1__Impl_in_rule__CellState__Group__15338);
            rule__CellState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__2_in_rule__CellState__Group__15341);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2654:1: rule__CellState__Group__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2658:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2659:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2659:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2660:1: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__CellState__Group__1__Impl5369); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2673:1: rule__CellState__Group__2 : rule__CellState__Group__2__Impl rule__CellState__Group__3 ;
    public final void rule__CellState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2677:1: ( rule__CellState__Group__2__Impl rule__CellState__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2678:2: rule__CellState__Group__2__Impl rule__CellState__Group__3
            {
            pushFollow(FOLLOW_rule__CellState__Group__2__Impl_in_rule__CellState__Group__25400);
            rule__CellState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__3_in_rule__CellState__Group__25403);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2685:1: rule__CellState__Group__2__Impl : ( ( rule__CellState__DisplayAssignment_2 ) ) ;
    public final void rule__CellState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2689:1: ( ( ( rule__CellState__DisplayAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2690:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2690:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2691:1: ( rule__CellState__DisplayAssignment_2 )
            {
             before(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2692:1: ( rule__CellState__DisplayAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2692:2: rule__CellState__DisplayAssignment_2
            {
            pushFollow(FOLLOW_rule__CellState__DisplayAssignment_2_in_rule__CellState__Group__2__Impl5430);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2702:1: rule__CellState__Group__3 : rule__CellState__Group__3__Impl rule__CellState__Group__4 ;
    public final void rule__CellState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2706:1: ( rule__CellState__Group__3__Impl rule__CellState__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2707:2: rule__CellState__Group__3__Impl rule__CellState__Group__4
            {
            pushFollow(FOLLOW_rule__CellState__Group__3__Impl_in_rule__CellState__Group__35460);
            rule__CellState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group__4_in_rule__CellState__Group__35463);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2714:1: rule__CellState__Group__3__Impl : ( ( rule__CellState__Group_3__0 )? ) ;
    public final void rule__CellState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2718:1: ( ( ( rule__CellState__Group_3__0 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2719:1: ( ( rule__CellState__Group_3__0 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2719:1: ( ( rule__CellState__Group_3__0 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2720:1: ( rule__CellState__Group_3__0 )?
            {
             before(grammarAccess.getCellStateAccess().getGroup_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2721:1: ( rule__CellState__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2721:2: rule__CellState__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CellState__Group_3__0_in_rule__CellState__Group__3__Impl5490);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2731:1: rule__CellState__Group__4 : rule__CellState__Group__4__Impl ;
    public final void rule__CellState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2735:1: ( rule__CellState__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2736:2: rule__CellState__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CellState__Group__4__Impl_in_rule__CellState__Group__45521);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2742:1: rule__CellState__Group__4__Impl : ( '}' ) ;
    public final void rule__CellState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2746:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2747:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2747:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2748:1: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__CellState__Group__4__Impl5549); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2771:1: rule__CellState__Group_3__0 : rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 ;
    public final void rule__CellState__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2775:1: ( rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2776:2: rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__0__Impl_in_rule__CellState__Group_3__05590);
            rule__CellState__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group_3__1_in_rule__CellState__Group_3__05593);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2783:1: rule__CellState__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__CellState__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2787:1: ( ( 'transitions' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2788:1: ( 'transitions' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2788:1: ( 'transitions' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2789:1: 'transitions'
            {
             before(grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__CellState__Group_3__0__Impl5621); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2802:1: rule__CellState__Group_3__1 : rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 ;
    public final void rule__CellState__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2806:1: ( rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2807:2: rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__1__Impl_in_rule__CellState__Group_3__15652);
            rule__CellState__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group_3__2_in_rule__CellState__Group_3__15655);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2814:1: rule__CellState__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2818:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2819:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2819:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2820:1: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,18,FOLLOW_18_in_rule__CellState__Group_3__1__Impl5683); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2833:1: rule__CellState__Group_3__2 : rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 ;
    public final void rule__CellState__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2837:1: ( rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2838:2: rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__2__Impl_in_rule__CellState__Group_3__25714);
            rule__CellState__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellState__Group_3__3_in_rule__CellState__Group_3__25717);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2845:1: rule__CellState__Group_3__2__Impl : ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) ;
    public final void rule__CellState__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2849:1: ( ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2850:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2850:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2851:1: ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2851:1: ( ( rule__CellState__TransitionsAssignment_3_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2852:1: ( rule__CellState__TransitionsAssignment_3_2 )
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2853:1: ( rule__CellState__TransitionsAssignment_3_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2853:2: rule__CellState__TransitionsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl5746);
            rule__CellState__TransitionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2856:1: ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2857:1: ( rule__CellState__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2858:1: ( rule__CellState__TransitionsAssignment_3_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2858:2: rule__CellState__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl5758);
            	    rule__CellState__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2869:1: rule__CellState__Group_3__3 : rule__CellState__Group_3__3__Impl ;
    public final void rule__CellState__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2873:1: ( rule__CellState__Group_3__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2874:2: rule__CellState__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__CellState__Group_3__3__Impl_in_rule__CellState__Group_3__35791);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2880:1: rule__CellState__Group_3__3__Impl : ( '}' ) ;
    public final void rule__CellState__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2884:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2885:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2885:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2886:1: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,19,FOLLOW_19_in_rule__CellState__Group_3__3__Impl5819); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2907:1: rule__TransitionSpec__Group__0 : rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 ;
    public final void rule__TransitionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2911:1: ( rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2912:2: rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__0__Impl_in_rule__TransitionSpec__Group__05858);
            rule__TransitionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransitionSpec__Group__1_in_rule__TransitionSpec__Group__05861);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2919:1: rule__TransitionSpec__Group__0__Impl : ( 'on' ) ;
    public final void rule__TransitionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2923:1: ( ( 'on' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2924:1: ( 'on' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2924:1: ( 'on' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2925:1: 'on'
            {
             before(grammarAccess.getTransitionSpecAccess().getOnKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__TransitionSpec__Group__0__Impl5889); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2938:1: rule__TransitionSpec__Group__1 : rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 ;
    public final void rule__TransitionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2942:1: ( rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2943:2: rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__1__Impl_in_rule__TransitionSpec__Group__15920);
            rule__TransitionSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransitionSpec__Group__2_in_rule__TransitionSpec__Group__15923);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2950:1: rule__TransitionSpec__Group__1__Impl : ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) ;
    public final void rule__TransitionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2954:1: ( ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2955:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2955:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2956:1: ( rule__TransitionSpec__TriggerAssignment_1 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2957:1: ( rule__TransitionSpec__TriggerAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2957:2: rule__TransitionSpec__TriggerAssignment_1
            {
            pushFollow(FOLLOW_rule__TransitionSpec__TriggerAssignment_1_in_rule__TransitionSpec__Group__1__Impl5950);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2967:1: rule__TransitionSpec__Group__2 : rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 ;
    public final void rule__TransitionSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2971:1: ( rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2972:2: rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__2__Impl_in_rule__TransitionSpec__Group__25980);
            rule__TransitionSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransitionSpec__Group__3_in_rule__TransitionSpec__Group__25983);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2979:1: rule__TransitionSpec__Group__2__Impl : ( 'goto' ) ;
    public final void rule__TransitionSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2983:1: ( ( 'goto' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2984:1: ( 'goto' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2984:1: ( 'goto' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2985:1: 'goto'
            {
             before(grammarAccess.getTransitionSpecAccess().getGotoKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__TransitionSpec__Group__2__Impl6011); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2998:1: rule__TransitionSpec__Group__3 : rule__TransitionSpec__Group__3__Impl ;
    public final void rule__TransitionSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3002:1: ( rule__TransitionSpec__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3003:2: rule__TransitionSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TransitionSpec__Group__3__Impl_in_rule__TransitionSpec__Group__36042);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3009:1: rule__TransitionSpec__Group__3__Impl : ( ( rule__TransitionSpec__TargetAssignment_3 ) ) ;
    public final void rule__TransitionSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3013:1: ( ( ( rule__TransitionSpec__TargetAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3014:1: ( ( rule__TransitionSpec__TargetAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3014:1: ( ( rule__TransitionSpec__TargetAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3015:1: ( rule__TransitionSpec__TargetAssignment_3 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3016:1: ( rule__TransitionSpec__TargetAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3016:2: rule__TransitionSpec__TargetAssignment_3
            {
            pushFollow(FOLLOW_rule__TransitionSpec__TargetAssignment_3_in_rule__TransitionSpec__Group__3__Impl6069);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3034:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3038:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3039:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__06107);
            rule__FieldSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__06110);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3046:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3050:1: ( ( 'field' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3051:1: ( 'field' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3051:1: ( 'field' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3052:1: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FieldSpecification__Group__0__Impl6138); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3065:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3069:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3070:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__16169);
            rule__FieldSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__16172);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3077:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3081:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3082:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3082:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3083:1: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3084:1: ( rule__FieldSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3084:2: rule__FieldSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl6199);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3094:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3098:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3099:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__26229);
            rule__FieldSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__26232);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3106:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3110:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3111:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3111:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3112:1: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__FieldSpecification__Group__2__Impl6260); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3125:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3129:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3130:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__36291);
            rule__FieldSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__36294);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3137:1: rule__FieldSpecification__Group__3__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3141:1: ( ( 'width' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3142:1: ( 'width' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3142:1: ( 'width' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3143:1: 'width'
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__FieldSpecification__Group__3__Impl6322); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3156:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3160:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3161:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__46353);
            rule__FieldSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__46356);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3168:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3172:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3173:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3173:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3174:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__FieldSpecification__Group__4__Impl6384); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3187:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3191:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3192:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__56415);
            rule__FieldSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__56418);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3199:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__WidthAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3203:1: ( ( ( rule__FieldSpecification__WidthAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3204:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3204:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3205:1: ( rule__FieldSpecification__WidthAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3206:1: ( rule__FieldSpecification__WidthAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3206:2: rule__FieldSpecification__WidthAssignment_5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl6445);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3216:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3220:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3221:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__66475);
            rule__FieldSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__66478);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3228:1: rule__FieldSpecification__Group__6__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3232:1: ( ( 'height' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3233:1: ( 'height' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3233:1: ( 'height' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3234:1: 'height'
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6()); 
            match(input,36,FOLLOW_36_in_rule__FieldSpecification__Group__6__Impl6506); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3247:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3251:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3252:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__76537);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__76540);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3259:1: rule__FieldSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3263:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3264:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3264:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3265:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__FieldSpecification__Group__7__Impl6568); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3278:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3282:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3283:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__86599);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__86602);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3290:1: rule__FieldSpecification__Group__8__Impl : ( ( rule__FieldSpecification__HeightAssignment_8 ) ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3294:1: ( ( ( rule__FieldSpecification__HeightAssignment_8 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3295:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3295:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3296:1: ( rule__FieldSpecification__HeightAssignment_8 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_8()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3297:1: ( rule__FieldSpecification__HeightAssignment_8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3297:2: rule__FieldSpecification__HeightAssignment_8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl6629);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3307:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3311:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3312:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__96659);
            rule__FieldSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__96662);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3319:1: rule__FieldSpecification__Group__9__Impl : ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3323:1: ( ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3324:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3324:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3325:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationAssignment_9()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3326:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3326:2: rule__FieldSpecification__Field_initialisationAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl6689);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3336:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3340:1: ( rule__FieldSpecification__Group__10__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3341:2: rule__FieldSpecification__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__106720);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3347:1: rule__FieldSpecification__Group__10__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3351:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3352:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3352:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3353:1: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_19_in_rule__FieldSpecification__Group__10__Impl6748); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3388:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3392:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3393:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__06801);
            rule__AllowRestartMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__06804);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3400:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allow_restart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3404:1: ( ( 'allow_restart' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3405:1: ( 'allow_restart' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3405:1: ( 'allow_restart' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3406:1: 'allow_restart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__AllowRestartMenu__Group__0__Impl6832); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3419:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3423:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3424:2: rule__AllowRestartMenu__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__16863);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3430:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3434:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3435:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3435:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3436:1: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3437:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3439:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3453:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3457:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3458:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__06925);
            rule__StartFieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__06928);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3465:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3469:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3470:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3470:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3471:1: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__StartFieldDeclaration__Group__0__Impl6956); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3484:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3488:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3489:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__16987);
            rule__StartFieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__16990);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3496:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3500:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3501:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3501:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3502:1: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__StartFieldDeclaration__Group__1__Impl7018); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3515:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3519:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3520:2: rule__StartFieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__27049);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3526:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3530:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3531:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3531:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3532:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3533:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3533:2: rule__StartFieldDeclaration__FieldAssignment_2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__FieldAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl7076);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3549:1: rule__FieldInitialisations__Group__0 : rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 ;
    public final void rule__FieldInitialisations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3553:1: ( rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3554:2: rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__07112);
            rule__FieldInitialisations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__07115);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3561:1: rule__FieldInitialisations__Group__0__Impl : ( 'init' ) ;
    public final void rule__FieldInitialisations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3565:1: ( ( 'init' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3566:1: ( 'init' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3566:1: ( 'init' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3567:1: 'init'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__FieldInitialisations__Group__0__Impl7143); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3580:1: rule__FieldInitialisations__Group__1 : rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 ;
    public final void rule__FieldInitialisations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3584:1: ( rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3585:2: rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__17174);
            rule__FieldInitialisations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__17177);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3592:1: rule__FieldInitialisations__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldInitialisations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3596:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3597:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3597:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3598:1: '{'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__FieldInitialisations__Group__1__Impl7205); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3611:1: rule__FieldInitialisations__Group__2 : rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 ;
    public final void rule__FieldInitialisations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3615:1: ( rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3616:2: rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__27236);
            rule__FieldInitialisations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__27239);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3623:1: rule__FieldInitialisations__Group__2__Impl : ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) ;
    public final void rule__FieldInitialisations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3627:1: ( ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3628:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3628:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3629:1: ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3629:1: ( ( rule__FieldInitialisations__Group_2__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3630:1: ( rule__FieldInitialisations__Group_2__0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3631:1: ( rule__FieldInitialisations__Group_2__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3631:2: rule__FieldInitialisations__Group_2__0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl7268);
            rule__FieldInitialisations__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3634:1: ( ( rule__FieldInitialisations__Group_2__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3635:1: ( rule__FieldInitialisations__Group_2__0 )*
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3636:1: ( rule__FieldInitialisations__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40||(LA22_0>=42 && LA22_0<=43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3636:2: rule__FieldInitialisations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl7280);
            	    rule__FieldInitialisations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3647:1: rule__FieldInitialisations__Group__3 : rule__FieldInitialisations__Group__3__Impl ;
    public final void rule__FieldInitialisations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3651:1: ( rule__FieldInitialisations__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3652:2: rule__FieldInitialisations__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__37313);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3658:1: rule__FieldInitialisations__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldInitialisations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3662:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3663:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3663:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3664:1: '}'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__FieldInitialisations__Group__3__Impl7341); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3685:1: rule__FieldInitialisations__Group_2__0 : rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 ;
    public final void rule__FieldInitialisations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3689:1: ( rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3690:2: rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__07380);
            rule__FieldInitialisations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__07383);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3697:1: rule__FieldInitialisations__Group_2__0__Impl : ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) ;
    public final void rule__FieldInitialisations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3701:1: ( ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3702:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3702:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3703:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3704:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3704:2: rule__FieldInitialisations__InitialisationsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl7410);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3714:1: rule__FieldInitialisations__Group_2__1 : rule__FieldInitialisations__Group_2__1__Impl ;
    public final void rule__FieldInitialisations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3718:1: ( rule__FieldInitialisations__Group_2__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3719:2: rule__FieldInitialisations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__17440);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3725:1: rule__FieldInitialisations__Group_2__1__Impl : ( ';' ) ;
    public final void rule__FieldInitialisations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3729:1: ( ( ';' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3730:1: ( ';' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3730:1: ( ';' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3731:1: ';'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 
            match(input,39,FOLLOW_39_in_rule__FieldInitialisations__Group_2__1__Impl7468); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3748:1: rule__DefaultInitialisation__Group__0 : rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 ;
    public final void rule__DefaultInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3752:1: ( rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3753:2: rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__07503);
            rule__DefaultInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__07506);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3760:1: rule__DefaultInitialisation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3764:1: ( ( 'default' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3765:1: ( 'default' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3765:1: ( 'default' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3766:1: 'default'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__DefaultInitialisation__Group__0__Impl7534); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3779:1: rule__DefaultInitialisation__Group__1 : rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 ;
    public final void rule__DefaultInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3783:1: ( rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3784:2: rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__17565);
            rule__DefaultInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__17568);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3791:1: rule__DefaultInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3795:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3796:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3796:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3797:1: ':'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__DefaultInitialisation__Group__1__Impl7596); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3810:1: rule__DefaultInitialisation__Group__2 : rule__DefaultInitialisation__Group__2__Impl ;
    public final void rule__DefaultInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3814:1: ( rule__DefaultInitialisation__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3815:2: rule__DefaultInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__27627);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3821:1: rule__DefaultInitialisation__Group__2__Impl : ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) ;
    public final void rule__DefaultInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3825:1: ( ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3826:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3826:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3827:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3828:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3828:2: rule__DefaultInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl7654);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3844:1: rule__RandomInitialisation__Group__0 : rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 ;
    public final void rule__RandomInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3848:1: ( rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3849:2: rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__07690);
            rule__RandomInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__07693);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3856:1: rule__RandomInitialisation__Group__0__Impl : ( 'random' ) ;
    public final void rule__RandomInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3860:1: ( ( 'random' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3861:1: ( 'random' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3861:1: ( 'random' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3862:1: 'random'
            {
             before(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__RandomInitialisation__Group__0__Impl7721); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3875:1: rule__RandomInitialisation__Group__1 : rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 ;
    public final void rule__RandomInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3879:1: ( rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3880:2: rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__17752);
            rule__RandomInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__17755);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3887:1: rule__RandomInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__RandomInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3891:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3892:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3892:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3893:1: ':'
            {
             before(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__RandomInitialisation__Group__1__Impl7783); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3906:1: rule__RandomInitialisation__Group__2 : rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 ;
    public final void rule__RandomInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3910:1: ( rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3911:2: rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__27814);
            rule__RandomInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__27817);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3918:1: rule__RandomInitialisation__Group__2__Impl : ( ( rule__RandomInitialisation__CellAssignment_2 ) ) ;
    public final void rule__RandomInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3922:1: ( ( ( rule__RandomInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3923:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3923:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3924:1: ( rule__RandomInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3925:1: ( rule__RandomInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3925:2: rule__RandomInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl7844);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3935:1: rule__RandomInitialisation__Group__3 : rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 ;
    public final void rule__RandomInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3939:1: ( rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3940:2: rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__37874);
            rule__RandomInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__37877);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3947:1: rule__RandomInitialisation__Group__3__Impl : ( '=' ) ;
    public final void rule__RandomInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3951:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3952:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3952:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3953:1: '='
            {
             before(grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__RandomInitialisation__Group__3__Impl7905); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3966:1: rule__RandomInitialisation__Group__4 : rule__RandomInitialisation__Group__4__Impl ;
    public final void rule__RandomInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3970:1: ( rule__RandomInitialisation__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3971:2: rule__RandomInitialisation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__47936);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3977:1: rule__RandomInitialisation__Group__4__Impl : ( ( rule__RandomInitialisation__CountAssignment_4 ) ) ;
    public final void rule__RandomInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3981:1: ( ( ( rule__RandomInitialisation__CountAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3982:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3982:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3983:1: ( rule__RandomInitialisation__CountAssignment_4 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3984:1: ( rule__RandomInitialisation__CountAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3984:2: rule__RandomInitialisation__CountAssignment_4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl7963);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4004:1: rule__ContextInitialisation__Group__0 : rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 ;
    public final void rule__ContextInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4008:1: ( rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4009:2: rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__08003);
            rule__ContextInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__08006);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4016:1: rule__ContextInitialisation__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4020:1: ( ( 'context' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4021:1: ( 'context' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4021:1: ( 'context' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4022:1: 'context'
            {
             before(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__ContextInitialisation__Group__0__Impl8034); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4035:1: rule__ContextInitialisation__Group__1 : rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 ;
    public final void rule__ContextInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4039:1: ( rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4040:2: rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__18065);
            rule__ContextInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__18068);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4047:1: rule__ContextInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__ContextInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4051:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4052:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4052:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4053:1: ':'
            {
             before(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ContextInitialisation__Group__1__Impl8096); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4066:1: rule__ContextInitialisation__Group__2 : rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 ;
    public final void rule__ContextInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4070:1: ( rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4071:2: rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__28127);
            rule__ContextInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__28130);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4078:1: rule__ContextInitialisation__Group__2__Impl : ( ( rule__ContextInitialisation__CellAssignment_2 ) ) ;
    public final void rule__ContextInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4082:1: ( ( ( rule__ContextInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4083:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4083:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4084:1: ( rule__ContextInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4085:1: ( rule__ContextInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4085:2: rule__ContextInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl8157);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4095:1: rule__ContextInitialisation__Group__3 : rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 ;
    public final void rule__ContextInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4099:1: ( rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4100:2: rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__38187);
            rule__ContextInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__38190);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4107:1: rule__ContextInitialisation__Group__3__Impl : ( 'check' ) ;
    public final void rule__ContextInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4111:1: ( ( 'check' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4112:1: ( 'check' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4112:1: ( 'check' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4113:1: 'check'
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__ContextInitialisation__Group__3__Impl8218); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4126:1: rule__ContextInitialisation__Group__4 : rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 ;
    public final void rule__ContextInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4130:1: ( rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4131:2: rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__48249);
            rule__ContextInitialisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__48252);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4138:1: rule__ContextInitialisation__Group__4__Impl : ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) ;
    public final void rule__ContextInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4142:1: ( ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4143:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4143:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4144:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4145:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4145:2: rule__ContextInitialisation__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl8279);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4155:1: rule__ContextInitialisation__Group__5 : rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 ;
    public final void rule__ContextInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4159:1: ( rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4160:2: rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__58309);
            rule__ContextInitialisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__58312);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4167:1: rule__ContextInitialisation__Group__5__Impl : ( 'value' ) ;
    public final void rule__ContextInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4171:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4172:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4172:1: ( 'value' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4173:1: 'value'
            {
             before(grammarAccess.getContextInitialisationAccess().getValueKeyword_5()); 
            match(input,45,FOLLOW_45_in_rule__ContextInitialisation__Group__5__Impl8340); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4186:1: rule__ContextInitialisation__Group__6 : rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 ;
    public final void rule__ContextInitialisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4190:1: ( rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4191:2: rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__68371);
            rule__ContextInitialisation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__68374);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4198:1: rule__ContextInitialisation__Group__6__Impl : ( '=' ) ;
    public final void rule__ContextInitialisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4202:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4203:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4203:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4204:1: '='
            {
             before(grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__ContextInitialisation__Group__6__Impl8402); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4217:1: rule__ContextInitialisation__Group__7 : rule__ContextInitialisation__Group__7__Impl ;
    public final void rule__ContextInitialisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4221:1: ( rule__ContextInitialisation__Group__7__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4222:2: rule__ContextInitialisation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__78433);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4228:1: rule__ContextInitialisation__Group__7__Impl : ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) ;
    public final void rule__ContextInitialisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4232:1: ( ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4233:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4233:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4234:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            {
             before(grammarAccess.getContextInitialisationAccess().getExpAssignment_7()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4235:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4235:2: rule__ContextInitialisation__ExpAssignment_7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl8460);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4261:1: rule__ContextExpression__Group__0 : rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 ;
    public final void rule__ContextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4265:1: ( rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4266:2: rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__08506);
            rule__ContextExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__08509);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4273:1: rule__ContextExpression__Group__0__Impl : ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) ;
    public final void rule__ContextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4277:1: ( ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4278:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4278:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4279:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4280:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4280:2: rule__ContextExpression__Sub_expAssignment_0
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl8536);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4290:1: rule__ContextExpression__Group__1 : rule__ContextExpression__Group__1__Impl ;
    public final void rule__ContextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4294:1: ( rule__ContextExpression__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4295:2: rule__ContextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__18566);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4301:1: rule__ContextExpression__Group__1__Impl : ( ( rule__ContextExpression__Group_1__0 )* ) ;
    public final void rule__ContextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4305:1: ( ( ( rule__ContextExpression__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4306:1: ( ( rule__ContextExpression__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4306:1: ( ( rule__ContextExpression__Group_1__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4307:1: ( rule__ContextExpression__Group_1__0 )*
            {
             before(grammarAccess.getContextExpressionAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4308:1: ( rule__ContextExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==46) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4308:2: rule__ContextExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl8593);
            	    rule__ContextExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4322:1: rule__ContextExpression__Group_1__0 : rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 ;
    public final void rule__ContextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4326:1: ( rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4327:2: rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__08628);
            rule__ContextExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__08631);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4334:1: rule__ContextExpression__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ContextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4338:1: ( ( '.' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4339:1: ( '.' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4339:1: ( '.' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4340:1: '.'
            {
             before(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__ContextExpression__Group_1__0__Impl8659); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4353:1: rule__ContextExpression__Group_1__1 : rule__ContextExpression__Group_1__1__Impl ;
    public final void rule__ContextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4357:1: ( rule__ContextExpression__Group_1__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4358:2: rule__ContextExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__18690);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4364:1: rule__ContextExpression__Group_1__1__Impl : ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) ;
    public final void rule__ContextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4368:1: ( ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4369:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4369:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4370:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_1_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4371:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4371:2: rule__ContextExpression__Sub_expAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl8717);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4385:1: rule__FilterExpression__Group__0 : rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 ;
    public final void rule__FilterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4389:1: ( rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4390:2: rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__08751);
            rule__FilterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__08754);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4397:1: rule__FilterExpression__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4401:1: ( ( 'filter' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4402:1: ( 'filter' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4402:1: ( 'filter' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4403:1: 'filter'
            {
             before(grammarAccess.getFilterExpressionAccess().getFilterKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__FilterExpression__Group__0__Impl8782); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4416:1: rule__FilterExpression__Group__1 : rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 ;
    public final void rule__FilterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4420:1: ( rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4421:2: rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__18813);
            rule__FilterExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__18816);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4428:1: rule__FilterExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__FilterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4432:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4433:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4433:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4434:1: '('
            {
             before(grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__FilterExpression__Group__1__Impl8844); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4447:1: rule__FilterExpression__Group__2 : rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 ;
    public final void rule__FilterExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4451:1: ( rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4452:2: rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__28875);
            rule__FilterExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__28878);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4459:1: rule__FilterExpression__Group__2__Impl : ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) ;
    public final void rule__FilterExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4463:1: ( ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4464:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4464:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4465:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4466:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4466:2: rule__FilterExpression__Cell_typeAssignment_2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl8905);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4476:1: rule__FilterExpression__Group__3 : rule__FilterExpression__Group__3__Impl ;
    public final void rule__FilterExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4480:1: ( rule__FilterExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4481:2: rule__FilterExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__38935);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4487:1: rule__FilterExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4491:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4492:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4492:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4493:1: ')'
            {
             before(grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__FilterExpression__Group__3__Impl8963); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4514:1: rule__CountExpression__Group__0 : rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 ;
    public final void rule__CountExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4518:1: ( rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4519:2: rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__09002);
            rule__CountExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__09005);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4526:1: rule__CountExpression__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4530:1: ( ( 'count' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4531:1: ( 'count' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4531:1: ( 'count' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4532:1: 'count'
            {
             before(grammarAccess.getCountExpressionAccess().getCountKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__CountExpression__Group__0__Impl9033); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4545:1: rule__CountExpression__Group__1 : rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 ;
    public final void rule__CountExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4549:1: ( rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4550:2: rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__19064);
            rule__CountExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__19067);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4557:1: rule__CountExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__CountExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4561:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4562:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4562:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4563:1: '('
            {
             before(grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__CountExpression__Group__1__Impl9095); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4576:1: rule__CountExpression__Group__2 : rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 ;
    public final void rule__CountExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4580:1: ( rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4581:2: rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__29126);
            rule__CountExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__29129);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4588:1: rule__CountExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__CountExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4592:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4593:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4593:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4594:1: ')'
            {
             before(grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__CountExpression__Group__2__Impl9157); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4607:1: rule__CountExpression__Group__3 : rule__CountExpression__Group__3__Impl ;
    public final void rule__CountExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4611:1: ( rule__CountExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4612:2: rule__CountExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__39188);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4618:1: rule__CountExpression__Group__3__Impl : ( () ) ;
    public final void rule__CountExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4622:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4623:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4623:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4624:1: ()
            {
             before(grammarAccess.getCountExpressionAccess().getCountExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4625:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4627:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4645:1: rule__NotEmptyExpression__Group__0 : rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 ;
    public final void rule__NotEmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4649:1: ( rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4650:2: rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__09254);
            rule__NotEmptyExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__09257);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4657:1: rule__NotEmptyExpression__Group__0__Impl : ( 'notEmpty' ) ;
    public final void rule__NotEmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4661:1: ( ( 'notEmpty' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4662:1: ( 'notEmpty' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4662:1: ( 'notEmpty' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4663:1: 'notEmpty'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__NotEmptyExpression__Group__0__Impl9285); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4676:1: rule__NotEmptyExpression__Group__1 : rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 ;
    public final void rule__NotEmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4680:1: ( rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4681:2: rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__19316);
            rule__NotEmptyExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__19319);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4688:1: rule__NotEmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__NotEmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4692:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4693:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4693:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4694:1: '('
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__NotEmptyExpression__Group__1__Impl9347); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4707:1: rule__NotEmptyExpression__Group__2 : rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 ;
    public final void rule__NotEmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4711:1: ( rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4712:2: rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__29378);
            rule__NotEmptyExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__29381);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4719:1: rule__NotEmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__NotEmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4723:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4724:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4724:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4725:1: ')'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__NotEmptyExpression__Group__2__Impl9409); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4738:1: rule__NotEmptyExpression__Group__3 : rule__NotEmptyExpression__Group__3__Impl ;
    public final void rule__NotEmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4742:1: ( rule__NotEmptyExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4743:2: rule__NotEmptyExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__39440);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4749:1: rule__NotEmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__NotEmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4753:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4754:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4754:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4755:1: ()
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4756:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4758:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4777:1: rule__GridGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GridGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4781:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4782:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4782:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4783:1: RULE_ID
            {
             before(grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_19511); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4792:1: rule__GridGame__StatesAssignment_3 : ( ruleGlobalCellStateSpec ) ;
    public final void rule__GridGame__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4796:1: ( ( ruleGlobalCellStateSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4797:1: ( ruleGlobalCellStateSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4797:1: ( ruleGlobalCellStateSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4798:1: ruleGlobalCellStateSpec
            {
             before(grammarAccess.getGridGameAccess().getStatesGlobalCellStateSpecParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGlobalCellStateSpec_in_rule__GridGame__StatesAssignment_39542);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4807:1: rule__GridGame__CellsAssignment_4 : ( ruleCellSpecification ) ;
    public final void rule__GridGame__CellsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4811:1: ( ( ruleCellSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4812:1: ( ruleCellSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4812:1: ( ruleCellSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4813:1: ruleCellSpecification
            {
             before(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_49573);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4822:1: rule__GridGame__FieldsAssignment_5 : ( ruleFieldSpecification ) ;
    public final void rule__GridGame__FieldsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4826:1: ( ( ruleFieldSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4827:1: ( ruleFieldSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4827:1: ( ruleFieldSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4828:1: ruleFieldSpecification
            {
             before(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_59604);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4837:1: rule__GridGame__OptionsAssignment_6 : ( ruleOptionSpecification ) ;
    public final void rule__GridGame__OptionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4841:1: ( ( ruleOptionSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4842:1: ( ruleOptionSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4842:1: ( ruleOptionSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4843:1: ruleOptionSpecification
            {
             before(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_69635);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4852:1: rule__CellSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CellSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4856:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4857:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4857:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4858:1: RULE_ID
            {
             before(grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_19666); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4867:1: rule__CellSpecification__MembersAssignment_3 : ( ruleCellMember ) ;
    public final void rule__CellSpecification__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4871:1: ( ( ruleCellMember ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4872:1: ( ruleCellMember )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4872:1: ( ruleCellMember )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4873:1: ruleCellMember
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_39697);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4882:1: rule__CellDisplaySpec__Display_typeAssignment_3 : ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) ;
    public final void rule__CellDisplaySpec__Display_typeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4886:1: ( ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4887:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4887:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4888:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAlternatives_3_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4889:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4889:2: rule__CellDisplaySpec__Display_typeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_39728);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4898:1: rule__CellDisplaySpec__TextAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__CellDisplaySpec__TextAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4902:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4903:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4903:1: ( RULE_STRING )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4904:1: RULE_STRING
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_4_0_19761); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4913:1: rule__CellDisplaySpec__VarAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CellDisplaySpec__VarAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4917:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4918:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4918:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4919:1: ( RULE_ID )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarCellVarSpecCrossReference_4_1_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4920:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4921:1: RULE_ID
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarCellVarSpecIDTerminalRuleCall_4_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellDisplaySpec__VarAssignment_4_1_19796); 
             after(grammarAccess.getCellDisplaySpecAccess().getVarCellVarSpecIDTerminalRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getCellDisplaySpecAccess().getVarCellVarSpecCrossReference_4_1_1_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4932:1: rule__CellVarSpec__TypeAssignment_1 : ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) ;
    public final void rule__CellVarSpec__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4936:1: ( ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4937:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4937:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4938:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAlternatives_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4939:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4939:2: rule__CellVarSpec__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_19831);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4948:1: rule__CellVarSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CellVarSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4952:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4953:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4953:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4954:1: RULE_ID
            {
             before(grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_29864); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4963:1: rule__GlobalCellStateSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalCellStateSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4967:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4968:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4968:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4969:1: RULE_ID
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__NameAssignment_19895); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4978:1: rule__GlobalCellStateSpec__ParamsAssignment_2_1 : ( ruleStateParamSpec ) ;
    public final void rule__GlobalCellStateSpec__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4982:1: ( ( ruleStateParamSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4983:1: ( ruleStateParamSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4983:1: ( ruleStateParamSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4984:1: ruleStateParamSpec
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_19926);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4993:1: rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 : ( ruleStateParamSpec ) ;
    public final void rule__GlobalCellStateSpec__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4997:1: ( ( ruleStateParamSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4998:1: ( ruleStateParamSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4998:1: ( ruleStateParamSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:4999:1: ruleStateParamSpec
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsStateParamSpecParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_2_19957);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5008:1: rule__GlobalCellStateSpec__StatesAssignment_4 : ( ruleCellState ) ;
    public final void rule__GlobalCellStateSpec__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5012:1: ( ( ruleCellState ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5013:1: ( ruleCellState )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5013:1: ( ruleCellState )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5014:1: ruleCellState
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesCellStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCellState_in_rule__GlobalCellStateSpec__StatesAssignment_49988);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5023:1: rule__GlobalCellStateSpec__StartAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__GlobalCellStateSpec__StartAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5027:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5028:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5028:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5029:1: ( RULE_ID )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateCrossReference_7_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5030:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5031:1: RULE_ID
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__StartAssignment_710023); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5042:1: rule__StateParamSpec__TypeAssignment_0 : ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) ) ;
    public final void rule__StateParamSpec__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5046:1: ( ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5047:1: ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5047:1: ( ( rule__StateParamSpec__TypeAlternatives_0_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5048:1: ( rule__StateParamSpec__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getStateParamSpecAccess().getTypeAlternatives_0_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5049:1: ( rule__StateParamSpec__TypeAlternatives_0_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5049:2: rule__StateParamSpec__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__StateParamSpec__TypeAlternatives_0_0_in_rule__StateParamSpec__TypeAssignment_010058);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5058:1: rule__StateParamSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateParamSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5062:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5063:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5063:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5064:1: RULE_ID
            {
             before(grammarAccess.getStateParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateParamSpec__NameAssignment_110091); 
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


    // $ANTLR start "rule__CellStateSpec__StatesAssignment_2"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5073:1: rule__CellStateSpec__StatesAssignment_2 : ( ruleCellState ) ;
    public final void rule__CellStateSpec__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5077:1: ( ( ruleCellState ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5078:1: ( ruleCellState )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5078:1: ( ruleCellState )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5079:1: ruleCellState
            {
             before(grammarAccess.getCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCellState_in_rule__CellStateSpec__StatesAssignment_210122);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__StatesAssignment_2"


    // $ANTLR start "rule__CellStateSpec__StartAssignment_5"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5088:1: rule__CellStateSpec__StartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CellStateSpec__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5092:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5093:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5093:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5094:1: ( RULE_ID )
            {
             before(grammarAccess.getCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5095:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5096:1: RULE_ID
            {
             before(grammarAccess.getCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellStateSpec__StartAssignment_510157); 
             after(grammarAccess.getCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellStateSpec__StartAssignment_5"


    // $ANTLR start "rule__CellState__NameAssignment_0"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5107:1: rule__CellState__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CellState__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5111:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5112:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5112:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5113:1: RULE_ID
            {
             before(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellState__NameAssignment_010192); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5122:1: rule__CellState__DisplayAssignment_2 : ( ruleCellDisplaySpec ) ;
    public final void rule__CellState__DisplayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5126:1: ( ( ruleCellDisplaySpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5127:1: ( ruleCellDisplaySpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5127:1: ( ruleCellDisplaySpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5128:1: ruleCellDisplaySpec
            {
             before(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCellDisplaySpec_in_rule__CellState__DisplayAssignment_210223);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5137:1: rule__CellState__TransitionsAssignment_3_2 : ( ruleTransitionSpec ) ;
    public final void rule__CellState__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5141:1: ( ( ruleTransitionSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5142:1: ( ruleTransitionSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5142:1: ( ruleTransitionSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5143:1: ruleTransitionSpec
            {
             before(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleTransitionSpec_in_rule__CellState__TransitionsAssignment_3_210254);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5152:1: rule__TransitionSpec__TriggerAssignment_1 : ( ruleTransitionTriggerSpec ) ;
    public final void rule__TransitionSpec__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5156:1: ( ( ruleTransitionTriggerSpec ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5157:1: ( ruleTransitionTriggerSpec )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5157:1: ( ruleTransitionTriggerSpec )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5158:1: ruleTransitionTriggerSpec
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTransitionTriggerSpec_in_rule__TransitionSpec__TriggerAssignment_110285);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5167:1: rule__TransitionSpec__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionSpec__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5171:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5172:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5172:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5173:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_3_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5174:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5175:1: RULE_ID
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TransitionSpec__TargetAssignment_310320); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5186:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5190:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5191:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5191:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5192:1: RULE_ID
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_110355); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5201:1: rule__FieldSpecification__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5205:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5206:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5206:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5207:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_510386); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5216:1: rule__FieldSpecification__HeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5220:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5221:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5221:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5222:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_810417); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5231:1: rule__FieldSpecification__Field_initialisationAssignment_9 : ( ruleFieldInitialisations ) ;
    public final void rule__FieldSpecification__Field_initialisationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5235:1: ( ( ruleFieldInitialisations ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5236:1: ( ruleFieldInitialisations )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5236:1: ( ruleFieldInitialisations )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5237:1: ruleFieldInitialisations
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_910448);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5246:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5250:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5251:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5251:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5252:1: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5253:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5254:1: RULE_ID
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__FieldAssignment_210483); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5265:1: rule__FieldInitialisations__InitialisationsAssignment_2_0 : ( ruleFieldInitialisation ) ;
    public final void rule__FieldInitialisations__InitialisationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5269:1: ( ( ruleFieldInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5270:1: ( ruleFieldInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5270:1: ( ruleFieldInitialisation )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5271:1: ruleFieldInitialisation
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_010518);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5280:1: rule__DefaultInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefaultInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5284:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5285:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5285:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5286:1: ( RULE_ID )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5287:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5288:1: RULE_ID
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_210553); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5299:1: rule__RandomInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RandomInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5303:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5304:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5304:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5305:1: ( RULE_ID )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5306:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5307:1: RULE_ID
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_210592); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5318:1: rule__RandomInitialisation__CountAssignment_4 : ( RULE_INT ) ;
    public final void rule__RandomInitialisation__CountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5322:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5323:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5323:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5324:1: RULE_INT
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_410627); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5333:1: rule__ContextInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ContextInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5337:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5338:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5338:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5339:1: ( RULE_ID )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5340:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5341:1: RULE_ID
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_210662); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5352:1: rule__ContextInitialisation__CheckAssignment_4 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5356:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5357:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5357:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5358:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_410697);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5367:1: rule__ContextInitialisation__ExpAssignment_7 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__ExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5371:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5372:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5372:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5373:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_710728);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5382:1: rule__ContextExpression__Sub_expAssignment_0 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5386:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5387:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5387:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5388:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_010759);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5397:1: rule__ContextExpression__Sub_expAssignment_1_1 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5401:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5402:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5402:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5403:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_110790);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5412:1: rule__FilterExpression__Cell_typeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FilterExpression__Cell_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5416:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5417:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5417:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5418:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5419:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:5420:1: RULE_ID
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_210825); 
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
    public static final BitSet FOLLOW_ruleCellVarSpec_in_entryRuleCellVarSpec301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellVarSpec308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__0_in_ruleCellVarSpec334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalCellStateSpec_in_entryRuleGlobalCellStateSpec361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalCellStateSpec368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__0_in_ruleGlobalCellStateSpec394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_entryRuleStateParamSpec421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateParamSpec428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__0_in_ruleStateParamSpec454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_entryRuleCellStateSpec481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellStateSpec488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__0_in_ruleCellStateSpec514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_entryRuleCellState541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellState548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__0_in_ruleCellState574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_entryRuleTransitionSpec601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpec608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__0_in_ruleTransitionSpec634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_entryRuleTransitionTriggerSpec661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionTriggerSpec668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionTriggerSpec__Alternatives_in_ruleTransitionTriggerSpec694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_entryRuleFieldSpecification721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldSpecification728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__0_in_ruleFieldSpecification754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_entryRuleOptionSpecification781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionSpecification788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionSpecification__Alternatives_in_ruleOptionSpecification814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_entryRuleAllowRestartMenu841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowRestartMenu848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__0_in_ruleAllowRestartMenu874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_entryRuleStartFieldDeclaration901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartFieldDeclaration908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__0_in_ruleStartFieldDeclaration934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_entryRuleFieldInitialisations961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisations968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__0_in_ruleFieldInitialisations994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_entryRuleFieldInitialisation1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldInitialisation1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisation__Alternatives_in_ruleFieldInitialisation1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_entryRuleDefaultInitialisation1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultInitialisation1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__0_in_ruleDefaultInitialisation1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_entryRuleRandomInitialisation1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRandomInitialisation1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__0_in_ruleRandomInitialisation1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_entryRuleContextInitialisation1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextInitialisation1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__0_in_ruleContextInitialisation1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_entryRuleContextExpression1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContextExpression1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__0_in_ruleContextExpression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_entryRuleFilterExpression1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterExpression1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__0_in_ruleFilterExpression1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_entryRuleCountExpression1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__0_in_ruleCountExpression1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_entryRuleNotEmptyExpression1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEmptyExpression1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__0_in_ruleNotEmptyExpression1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_rule__CellMember__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellVarSpec_in_rule__CellMember__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellStateSpec_in_rule__CellMember__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CellDisplaySpec__Display_typeAlternatives_3_01657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__0_in_rule__CellDisplaySpec__Alternatives_41691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__0_in_rule__CellDisplaySpec__Alternatives_41709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_01743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_01763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateParamSpec__TypeAlternatives_0_01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateParamSpec__TypeAlternatives_0_01818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TransitionTriggerSpec__Alternatives1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TransitionTriggerSpec__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__02086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__02089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GridGame__Group__0__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__12148 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__22208 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__22211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GridGame__Group__2__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__32270 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__32273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__StatesAssignment_3_in_rule__GridGame__Group__3__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__42331 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__42334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2363 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_4_in_rule__GridGame__Group__4__Impl2375 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__52408 = new BitSet(new long[]{0x0000002004080000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__52411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2440 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_5_in_rule__GridGame__Group__5__Impl2452 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__62485 = new BitSet(new long[]{0x0000002004080000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__7_in_rule__GridGame__Group__62488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__OptionsAssignment_6_in_rule__GridGame__Group__6__Impl2515 = new BitSet(new long[]{0x0000002004000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__7__Impl_in_rule__GridGame__Group__72546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GridGame__Group__7__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__02621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__02624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CellSpecification__Group__0__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__12683 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__22743 = new BitSet(new long[]{0x0000000003280000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__22746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellSpecification__Group__2__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__32805 = new BitSet(new long[]{0x0000000003280000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__32808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl2835 = new BitSet(new long[]{0x0000000003200002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__42866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellSpecification__Group__4__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__02935 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__02938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CellDisplaySpec__Group__0__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__12997 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__13000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellDisplaySpec__Group__1__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__23059 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__23062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CellDisplaySpec__Group__2__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__33121 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__33124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__43181 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__43184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Alternatives_4_in_rule__CellDisplaySpec__Group__4__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__53241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellDisplaySpec__Group__5__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__0__Impl_in_rule__CellDisplaySpec__Group_4_0__03312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__1_in_rule__CellDisplaySpec__Group_4_0__03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CellDisplaySpec__Group_4_0__0__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__1__Impl_in_rule__CellDisplaySpec__Group_4_0__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__TextAssignment_4_0_1_in_rule__CellDisplaySpec__Group_4_0__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__0__Impl_in_rule__CellDisplaySpec__Group_4_1__03435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__1_in_rule__CellDisplaySpec__Group_4_1__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CellDisplaySpec__Group_4_1__0__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__1__Impl_in_rule__CellDisplaySpec__Group_4_1__13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__VarAssignment_4_1_1_in_rule__CellDisplaySpec__Group_4_1__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__03558 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__03561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CellVarSpec__Group__0__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__13620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__13623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__23680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__0__Impl_in_rule__GlobalCellStateSpec__Group__03743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__1_in_rule__GlobalCellStateSpec__Group__03746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GlobalCellStateSpec__Group__0__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__1__Impl_in_rule__GlobalCellStateSpec__Group__13805 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__2_in_rule__GlobalCellStateSpec__Group__13808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__NameAssignment_1_in_rule__GlobalCellStateSpec__Group__1__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__2__Impl_in_rule__GlobalCellStateSpec__Group__23865 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__3_in_rule__GlobalCellStateSpec__Group__23868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__0_in_rule__GlobalCellStateSpec__Group__2__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__3__Impl_in_rule__GlobalCellStateSpec__Group__33926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__4_in_rule__GlobalCellStateSpec__Group__33929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GlobalCellStateSpec__Group__3__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__4__Impl_in_rule__GlobalCellStateSpec__Group__43988 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__5_in_rule__GlobalCellStateSpec__Group__43991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4020 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__StatesAssignment_4_in_rule__GlobalCellStateSpec__Group__4__Impl4032 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__5__Impl_in_rule__GlobalCellStateSpec__Group__54065 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__6_in_rule__GlobalCellStateSpec__Group__54068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GlobalCellStateSpec__Group__5__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__6__Impl_in_rule__GlobalCellStateSpec__Group__64127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__7_in_rule__GlobalCellStateSpec__Group__64130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GlobalCellStateSpec__Group__6__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__7__Impl_in_rule__GlobalCellStateSpec__Group__74189 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__8_in_rule__GlobalCellStateSpec__Group__74192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__StartAssignment_7_in_rule__GlobalCellStateSpec__Group__7__Impl4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group__8__Impl_in_rule__GlobalCellStateSpec__Group__84249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GlobalCellStateSpec__Group__8__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2__04326 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__1_in_rule__GlobalCellStateSpec__Group_2__04329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GlobalCellStateSpec__Group_2__0__Impl4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2__14388 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__2_in_rule__GlobalCellStateSpec__Group_2__14391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_1_in_rule__GlobalCellStateSpec__Group_2__1__Impl4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__2__Impl_in_rule__GlobalCellStateSpec__Group_2__24448 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__3_in_rule__GlobalCellStateSpec__Group_2__24451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0_in_rule__GlobalCellStateSpec__Group_2__2__Impl4478 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2__3__Impl_in_rule__GlobalCellStateSpec__Group_2__34509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GlobalCellStateSpec__Group_2__3__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__0__Impl_in_rule__GlobalCellStateSpec__Group_2_2__04576 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1_in_rule__GlobalCellStateSpec__Group_2_2__04579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GlobalCellStateSpec__Group_2_2__0__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__Group_2_2__1__Impl_in_rule__GlobalCellStateSpec__Group_2_2__14638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalCellStateSpec__ParamsAssignment_2_2_1_in_rule__GlobalCellStateSpec__Group_2_2__1__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__0__Impl_in_rule__StateParamSpec__Group__04699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__1_in_rule__StateParamSpec__Group__04702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__TypeAssignment_0_in_rule__StateParamSpec__Group__0__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__Group__1__Impl_in_rule__StateParamSpec__Group__14759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__NameAssignment_1_in_rule__StateParamSpec__Group__1__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__0__Impl_in_rule__CellStateSpec__Group__04820 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__1_in_rule__CellStateSpec__Group__04823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CellStateSpec__Group__0__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__1__Impl_in_rule__CellStateSpec__Group__14882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__2_in_rule__CellStateSpec__Group__14885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellStateSpec__Group__1__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__2__Impl_in_rule__CellStateSpec__Group__24944 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__3_in_rule__CellStateSpec__Group__24947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__StatesAssignment_2_in_rule__CellStateSpec__Group__2__Impl4976 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CellStateSpec__StatesAssignment_2_in_rule__CellStateSpec__Group__2__Impl4988 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__3__Impl_in_rule__CellStateSpec__Group__35021 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__4_in_rule__CellStateSpec__Group__35024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CellStateSpec__Group__3__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__4__Impl_in_rule__CellStateSpec__Group__45083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__5_in_rule__CellStateSpec__Group__45086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CellStateSpec__Group__4__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__5__Impl_in_rule__CellStateSpec__Group__55145 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__6_in_rule__CellStateSpec__Group__55148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__StartAssignment_5_in_rule__CellStateSpec__Group__5__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellStateSpec__Group__6__Impl_in_rule__CellStateSpec__Group__65205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellStateSpec__Group__6__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__0__Impl_in_rule__CellState__Group__05278 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellState__Group__1_in_rule__CellState__Group__05281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__NameAssignment_0_in_rule__CellState__Group__0__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__1__Impl_in_rule__CellState__Group__15338 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CellState__Group__2_in_rule__CellState__Group__15341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellState__Group__1__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__2__Impl_in_rule__CellState__Group__25400 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_rule__CellState__Group__3_in_rule__CellState__Group__25403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__DisplayAssignment_2_in_rule__CellState__Group__2__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__3__Impl_in_rule__CellState__Group__35460 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_rule__CellState__Group__4_in_rule__CellState__Group__35463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__0_in_rule__CellState__Group__3__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group__4__Impl_in_rule__CellState__Group__45521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellState__Group__4__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__0__Impl_in_rule__CellState__Group_3__05590 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__1_in_rule__CellState__Group_3__05593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CellState__Group_3__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__1__Impl_in_rule__CellState__Group_3__15652 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__2_in_rule__CellState__Group_3__15655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellState__Group_3__1__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__2__Impl_in_rule__CellState__Group_3__25714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__3_in_rule__CellState__Group_3__25717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl5746 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__CellState__TransitionsAssignment_3_2_in_rule__CellState__Group_3__2__Impl5758 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__CellState__Group_3__3__Impl_in_rule__CellState__Group_3__35791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellState__Group_3__3__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__0__Impl_in_rule__TransitionSpec__Group__05858 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__1_in_rule__TransitionSpec__Group__05861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TransitionSpec__Group__0__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__1__Impl_in_rule__TransitionSpec__Group__15920 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__2_in_rule__TransitionSpec__Group__15923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__TriggerAssignment_1_in_rule__TransitionSpec__Group__1__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__2__Impl_in_rule__TransitionSpec__Group__25980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__3_in_rule__TransitionSpec__Group__25983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TransitionSpec__Group__2__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__Group__3__Impl_in_rule__TransitionSpec__Group__36042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionSpec__TargetAssignment_3_in_rule__TransitionSpec__Group__3__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__06107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__06110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FieldSpecification__Group__0__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__16169 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__16172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__26229 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__26232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldSpecification__Group__2__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__36291 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__36294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FieldSpecification__Group__3__Impl6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__46353 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__46356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldSpecification__Group__4__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__56415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__56418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__66475 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__66478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FieldSpecification__Group__6__Impl6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__76537 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__76540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FieldSpecification__Group__7__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__86599 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__86602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__96659 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__96662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__106720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldSpecification__Group__10__Impl6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__06801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__06804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AllowRestartMenu__Group__0__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__16863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__06925 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__06928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StartFieldDeclaration__Group__0__Impl6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__16987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__16990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StartFieldDeclaration__Group__1__Impl7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__27049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__FieldAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__07112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__07115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FieldInitialisations__Group__0__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__17174 = new BitSet(new long[]{0x00000D0000000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__17177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldInitialisations__Group__1__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__27236 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__27239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl7268 = new BitSet(new long[]{0x00000D0000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl7280 = new BitSet(new long[]{0x00000D0000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__37313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldInitialisations__Group__3__Impl7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__07380 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__07383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__17440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FieldInitialisations__Group_2__1__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__07503 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__07506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DefaultInitialisation__Group__0__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__17565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__17568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DefaultInitialisation__Group__1__Impl7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__27627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__07690 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__07693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__RandomInitialisation__Group__0__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__17752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__17755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RandomInitialisation__Group__1__Impl7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__27814 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__27817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__37874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__37877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RandomInitialisation__Group__3__Impl7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__47936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__08003 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__08006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ContextInitialisation__Group__0__Impl8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__18065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__18068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ContextInitialisation__Group__1__Impl8096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__28127 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__28130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__38187 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__38190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ContextInitialisation__Group__3__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__48249 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__48252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__58309 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__58312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ContextInitialisation__Group__5__Impl8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__68371 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__68374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ContextInitialisation__Group__6__Impl8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__78433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__08506 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__08509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__18566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl8593 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__08628 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__08631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ContextExpression__Group_1__0__Impl8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__18690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__08751 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__08754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FilterExpression__Group__0__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__18813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__18816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FilterExpression__Group__1__Impl8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__28875 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__28878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__38935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FilterExpression__Group__3__Impl8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__09002 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__09005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CountExpression__Group__0__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__19064 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__19067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CountExpression__Group__1__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__29126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__29129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CountExpression__Group__2__Impl9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__39188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__09254 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__09257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NotEmptyExpression__Group__0__Impl9285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__19316 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__19319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NotEmptyExpression__Group__1__Impl9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__29378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__29381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NotEmptyExpression__Group__2__Impl9409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__39440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_19511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalCellStateSpec_in_rule__GridGame__StatesAssignment_39542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_49573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_59604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_69635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_19666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_39697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_39728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_4_0_19761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellDisplaySpec__VarAssignment_4_1_19796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_19831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_29864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__NameAssignment_19895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_19926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateParamSpec_in_rule__GlobalCellStateSpec__ParamsAssignment_2_2_19957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_rule__GlobalCellStateSpec__StatesAssignment_49988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalCellStateSpec__StartAssignment_710023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateParamSpec__TypeAlternatives_0_0_in_rule__StateParamSpec__TypeAssignment_010058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateParamSpec__NameAssignment_110091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellState_in_rule__CellStateSpec__StatesAssignment_210122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellStateSpec__StartAssignment_510157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellState__NameAssignment_010192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellDisplaySpec_in_rule__CellState__DisplayAssignment_210223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpec_in_rule__CellState__TransitionsAssignment_3_210254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionTriggerSpec_in_rule__TransitionSpec__TriggerAssignment_110285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TransitionSpec__TargetAssignment_310320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_110355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_510386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_810417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_910448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__FieldAssignment_210483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_010518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_210553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_210592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_410627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_210662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_410697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_710728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_010759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_110790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_210825 = new BitSet(new long[]{0x0000000000000002L});

}