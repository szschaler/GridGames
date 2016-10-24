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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nop'", "'label'", "'button'", "'black'", "'white'", "'yellow'", "'red'", "'green'", "'int'", "'String'", "'Behaviour'", "'=='", "'>'", "'<'", "'game'", "'{'", "'}'", "'cell'", "'display'", "'as'", "'text'", "'var'", "'color'", "'states'", "'start'", "'='", "'('", "')'", "','", "'transitions'", "'onEnter'", "'on'", "'goto'", "'mouse-right'", "'context'", "'end-game'", "'action'", "'when'", "'do'", "'field'", "'width'", "'height'", "'allow_restart'", "'contextsTriggerGenerationally'", "'init'", "';'", "'default'", "':'", "'random'", "'check'", "'value'", "'.'", "'filter'", "'inState'", "'count'", "'notEmpty'", "'empty'", "'mouse-left'"
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
    // InternalGridGame.g:60:1: entryRuleGridGame : ruleGridGame EOF ;
    public final void entryRuleGridGame() throws RecognitionException {
        try {
            // InternalGridGame.g:61:1: ( ruleGridGame EOF )
            // InternalGridGame.g:62:1: ruleGridGame EOF
            {
             before(grammarAccess.getGridGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGridGame();

            state._fsp--;

             after(grammarAccess.getGridGameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:69:1: ruleGridGame : ( ( rule__GridGame__Group__0 ) ) ;
    public final void ruleGridGame() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:73:2: ( ( ( rule__GridGame__Group__0 ) ) )
            // InternalGridGame.g:74:1: ( ( rule__GridGame__Group__0 ) )
            {
            // InternalGridGame.g:74:1: ( ( rule__GridGame__Group__0 ) )
            // InternalGridGame.g:75:1: ( rule__GridGame__Group__0 )
            {
             before(grammarAccess.getGridGameAccess().getGroup()); 
            // InternalGridGame.g:76:1: ( rule__GridGame__Group__0 )
            // InternalGridGame.g:76:2: rule__GridGame__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:88:1: entryRuleCellSpecification : ruleCellSpecification EOF ;
    public final void entryRuleCellSpecification() throws RecognitionException {
        try {
            // InternalGridGame.g:89:1: ( ruleCellSpecification EOF )
            // InternalGridGame.g:90:1: ruleCellSpecification EOF
            {
             before(grammarAccess.getCellSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleCellSpecification();

            state._fsp--;

             after(grammarAccess.getCellSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:97:1: ruleCellSpecification : ( ( rule__CellSpecification__Group__0 ) ) ;
    public final void ruleCellSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:101:2: ( ( ( rule__CellSpecification__Group__0 ) ) )
            // InternalGridGame.g:102:1: ( ( rule__CellSpecification__Group__0 ) )
            {
            // InternalGridGame.g:102:1: ( ( rule__CellSpecification__Group__0 ) )
            // InternalGridGame.g:103:1: ( rule__CellSpecification__Group__0 )
            {
             before(grammarAccess.getCellSpecificationAccess().getGroup()); 
            // InternalGridGame.g:104:1: ( rule__CellSpecification__Group__0 )
            // InternalGridGame.g:104:2: rule__CellSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:116:1: entryRuleCellMember : ruleCellMember EOF ;
    public final void entryRuleCellMember() throws RecognitionException {
        try {
            // InternalGridGame.g:117:1: ( ruleCellMember EOF )
            // InternalGridGame.g:118:1: ruleCellMember EOF
            {
             before(grammarAccess.getCellMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleCellMember();

            state._fsp--;

             after(grammarAccess.getCellMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:125:1: ruleCellMember : ( ( rule__CellMember__Alternatives ) ) ;
    public final void ruleCellMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:129:2: ( ( ( rule__CellMember__Alternatives ) ) )
            // InternalGridGame.g:130:1: ( ( rule__CellMember__Alternatives ) )
            {
            // InternalGridGame.g:130:1: ( ( rule__CellMember__Alternatives ) )
            // InternalGridGame.g:131:1: ( rule__CellMember__Alternatives )
            {
             before(grammarAccess.getCellMemberAccess().getAlternatives()); 
            // InternalGridGame.g:132:1: ( rule__CellMember__Alternatives )
            // InternalGridGame.g:132:2: rule__CellMember__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:144:1: entryRuleCellDisplaySpec : ruleCellDisplaySpec EOF ;
    public final void entryRuleCellDisplaySpec() throws RecognitionException {
        try {
            // InternalGridGame.g:145:1: ( ruleCellDisplaySpec EOF )
            // InternalGridGame.g:146:1: ruleCellDisplaySpec EOF
            {
             before(grammarAccess.getCellDisplaySpecRule()); 
            pushFollow(FOLLOW_1);
            ruleCellDisplaySpec();

            state._fsp--;

             after(grammarAccess.getCellDisplaySpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:153:1: ruleCellDisplaySpec : ( ( rule__CellDisplaySpec__Group__0 ) ) ;
    public final void ruleCellDisplaySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:157:2: ( ( ( rule__CellDisplaySpec__Group__0 ) ) )
            // InternalGridGame.g:158:1: ( ( rule__CellDisplaySpec__Group__0 ) )
            {
            // InternalGridGame.g:158:1: ( ( rule__CellDisplaySpec__Group__0 ) )
            // InternalGridGame.g:159:1: ( rule__CellDisplaySpec__Group__0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getGroup()); 
            // InternalGridGame.g:160:1: ( rule__CellDisplaySpec__Group__0 )
            // InternalGridGame.g:160:2: rule__CellDisplaySpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:174:1: entryRuleCellVarSpec : ruleCellVarSpec EOF ;
    public final void entryRuleCellVarSpec() throws RecognitionException {
        try {
            // InternalGridGame.g:175:1: ( ruleCellVarSpec EOF )
            // InternalGridGame.g:176:1: ruleCellVarSpec EOF
            {
             before(grammarAccess.getCellVarSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleCellVarSpec();

            state._fsp--;

             after(grammarAccess.getCellVarSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:183:1: ruleCellVarSpec : ( ( rule__CellVarSpec__Group__0 ) ) ;
    public final void ruleCellVarSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:187:2: ( ( ( rule__CellVarSpec__Group__0 ) ) )
            // InternalGridGame.g:188:1: ( ( rule__CellVarSpec__Group__0 ) )
            {
            // InternalGridGame.g:188:1: ( ( rule__CellVarSpec__Group__0 ) )
            // InternalGridGame.g:189:1: ( rule__CellVarSpec__Group__0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getGroup()); 
            // InternalGridGame.g:190:1: ( rule__CellVarSpec__Group__0 )
            // InternalGridGame.g:190:2: rule__CellVarSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:202:1: entryRuleGlobalCellStateSpec : ruleGlobalCellStateSpec EOF ;
    public final void entryRuleGlobalCellStateSpec() throws RecognitionException {
        try {
            // InternalGridGame.g:203:1: ( ruleGlobalCellStateSpec EOF )
            // InternalGridGame.g:204:1: ruleGlobalCellStateSpec EOF
            {
             before(grammarAccess.getGlobalCellStateSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalCellStateSpec();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:211:1: ruleGlobalCellStateSpec : ( ( rule__GlobalCellStateSpec__Group__0 ) ) ;
    public final void ruleGlobalCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:215:2: ( ( ( rule__GlobalCellStateSpec__Group__0 ) ) )
            // InternalGridGame.g:216:1: ( ( rule__GlobalCellStateSpec__Group__0 ) )
            {
            // InternalGridGame.g:216:1: ( ( rule__GlobalCellStateSpec__Group__0 ) )
            // InternalGridGame.g:217:1: ( rule__GlobalCellStateSpec__Group__0 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup()); 
            // InternalGridGame.g:218:1: ( rule__GlobalCellStateSpec__Group__0 )
            // InternalGridGame.g:218:2: rule__GlobalCellStateSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleParamSpec"
    // InternalGridGame.g:230:1: entryRuleParamSpec : ruleParamSpec EOF ;
    public final void entryRuleParamSpec() throws RecognitionException {
        try {
            // InternalGridGame.g:231:1: ( ruleParamSpec EOF )
            // InternalGridGame.g:232:1: ruleParamSpec EOF
            {
             before(grammarAccess.getParamSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleParamSpec();

            state._fsp--;

             after(grammarAccess.getParamSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParamSpec"


    // $ANTLR start "ruleParamSpec"
    // InternalGridGame.g:239:1: ruleParamSpec : ( ( rule__ParamSpec__Group__0 ) ) ;
    public final void ruleParamSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:243:2: ( ( ( rule__ParamSpec__Group__0 ) ) )
            // InternalGridGame.g:244:1: ( ( rule__ParamSpec__Group__0 ) )
            {
            // InternalGridGame.g:244:1: ( ( rule__ParamSpec__Group__0 ) )
            // InternalGridGame.g:245:1: ( rule__ParamSpec__Group__0 )
            {
             before(grammarAccess.getParamSpecAccess().getGroup()); 
            // InternalGridGame.g:246:1: ( rule__ParamSpec__Group__0 )
            // InternalGridGame.g:246:2: rule__ParamSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamSpec"


    // $ANTLR start "entryRuleCellStateSpec"
    // InternalGridGame.g:258:1: entryRuleCellStateSpec : ruleCellStateSpec EOF ;
    public final void entryRuleCellStateSpec() throws RecognitionException {
        try {
            // InternalGridGame.g:259:1: ( ruleCellStateSpec EOF )
            // InternalGridGame.g:260:1: ruleCellStateSpec EOF
            {
             before(grammarAccess.getCellStateSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleCellStateSpec();

            state._fsp--;

             after(grammarAccess.getCellStateSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:267:1: ruleCellStateSpec : ( ( rule__CellStateSpec__Alternatives ) ) ;
    public final void ruleCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:271:2: ( ( ( rule__CellStateSpec__Alternatives ) ) )
            // InternalGridGame.g:272:1: ( ( rule__CellStateSpec__Alternatives ) )
            {
            // InternalGridGame.g:272:1: ( ( rule__CellStateSpec__Alternatives ) )
            // InternalGridGame.g:273:1: ( rule__CellStateSpec__Alternatives )
            {
             before(grammarAccess.getCellStateSpecAccess().getAlternatives()); 
            // InternalGridGame.g:274:1: ( rule__CellStateSpec__Alternatives )
            // InternalGridGame.g:274:2: rule__CellStateSpec__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:286:1: entryRuleLocalCellStateSpec : ruleLocalCellStateSpec EOF ;
    public final void entryRuleLocalCellStateSpec() throws RecognitionException {
        try {
            // InternalGridGame.g:287:1: ( ruleLocalCellStateSpec EOF )
            // InternalGridGame.g:288:1: ruleLocalCellStateSpec EOF
            {
             before(grammarAccess.getLocalCellStateSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalCellStateSpec();

            state._fsp--;

             after(grammarAccess.getLocalCellStateSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:295:1: ruleLocalCellStateSpec : ( ( rule__LocalCellStateSpec__Group__0 ) ) ;
    public final void ruleLocalCellStateSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:299:2: ( ( ( rule__LocalCellStateSpec__Group__0 ) ) )
            // InternalGridGame.g:300:1: ( ( rule__LocalCellStateSpec__Group__0 ) )
            {
            // InternalGridGame.g:300:1: ( ( rule__LocalCellStateSpec__Group__0 ) )
            // InternalGridGame.g:301:1: ( rule__LocalCellStateSpec__Group__0 )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getGroup()); 
            // InternalGridGame.g:302:1: ( rule__LocalCellStateSpec__Group__0 )
            // InternalGridGame.g:302:2: rule__LocalCellStateSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:314:1: entryRuleCellStateSpecReference : ruleCellStateSpecReference EOF ;
    public final void entryRuleCellStateSpecReference() throws RecognitionException {
        try {
            // InternalGridGame.g:315:1: ( ruleCellStateSpecReference EOF )
            // InternalGridGame.g:316:1: ruleCellStateSpecReference EOF
            {
             before(grammarAccess.getCellStateSpecReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCellStateSpecReference();

            state._fsp--;

             after(grammarAccess.getCellStateSpecReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:323:1: ruleCellStateSpecReference : ( ( rule__CellStateSpecReference__Group__0 ) ) ;
    public final void ruleCellStateSpecReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:327:2: ( ( ( rule__CellStateSpecReference__Group__0 ) ) )
            // InternalGridGame.g:328:1: ( ( rule__CellStateSpecReference__Group__0 ) )
            {
            // InternalGridGame.g:328:1: ( ( rule__CellStateSpecReference__Group__0 ) )
            // InternalGridGame.g:329:1: ( rule__CellStateSpecReference__Group__0 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getGroup()); 
            // InternalGridGame.g:330:1: ( rule__CellStateSpecReference__Group__0 )
            // InternalGridGame.g:330:2: rule__CellStateSpecReference__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:342:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGridGame.g:343:1: ( ruleValue EOF )
            // InternalGridGame.g:344:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:351:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:355:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGridGame.g:356:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalGridGame.g:356:1: ( ( rule__Value__Alternatives ) )
            // InternalGridGame.g:357:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalGridGame.g:358:1: ( rule__Value__Alternatives )
            // InternalGridGame.g:358:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:370:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGridGame.g:371:1: ( ruleStringValue EOF )
            // InternalGridGame.g:372:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:379:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:383:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGridGame.g:384:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGridGame.g:384:1: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGridGame.g:385:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalGridGame.g:386:1: ( rule__StringValue__ValueAssignment )
            // InternalGridGame.g:386:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:398:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalGridGame.g:399:1: ( ruleIntValue EOF )
            // InternalGridGame.g:400:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:407:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:411:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalGridGame.g:412:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalGridGame.g:412:1: ( ( rule__IntValue__ValueAssignment ) )
            // InternalGridGame.g:413:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalGridGame.g:414:1: ( rule__IntValue__ValueAssignment )
            // InternalGridGame.g:414:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:426:1: entryRuleVarRefValue : ruleVarRefValue EOF ;
    public final void entryRuleVarRefValue() throws RecognitionException {
        try {
            // InternalGridGame.g:427:1: ( ruleVarRefValue EOF )
            // InternalGridGame.g:428:1: ruleVarRefValue EOF
            {
             before(grammarAccess.getVarRefValueRule()); 
            pushFollow(FOLLOW_1);
            ruleVarRefValue();

            state._fsp--;

             after(grammarAccess.getVarRefValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:435:1: ruleVarRefValue : ( ( rule__VarRefValue__RefAssignment ) ) ;
    public final void ruleVarRefValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:439:2: ( ( ( rule__VarRefValue__RefAssignment ) ) )
            // InternalGridGame.g:440:1: ( ( rule__VarRefValue__RefAssignment ) )
            {
            // InternalGridGame.g:440:1: ( ( rule__VarRefValue__RefAssignment ) )
            // InternalGridGame.g:441:1: ( rule__VarRefValue__RefAssignment )
            {
             before(grammarAccess.getVarRefValueAccess().getRefAssignment()); 
            // InternalGridGame.g:442:1: ( rule__VarRefValue__RefAssignment )
            // InternalGridGame.g:442:2: rule__VarRefValue__RefAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:454:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // InternalGridGame.g:455:1: ( ruleCellState EOF )
            // InternalGridGame.g:456:1: ruleCellState EOF
            {
             before(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_1);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getCellStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:463:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:467:2: ( ( ( rule__CellState__Group__0 ) ) )
            // InternalGridGame.g:468:1: ( ( rule__CellState__Group__0 ) )
            {
            // InternalGridGame.g:468:1: ( ( rule__CellState__Group__0 ) )
            // InternalGridGame.g:469:1: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // InternalGridGame.g:470:1: ( rule__CellState__Group__0 )
            // InternalGridGame.g:470:2: rule__CellState__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:482:1: entryRuleTransitionSpec : ruleTransitionSpec EOF ;
    public final void entryRuleTransitionSpec() throws RecognitionException {
        try {
            // InternalGridGame.g:483:1: ( ruleTransitionSpec EOF )
            // InternalGridGame.g:484:1: ruleTransitionSpec EOF
            {
             before(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionSpec();

            state._fsp--;

             after(grammarAccess.getTransitionSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:491:1: ruleTransitionSpec : ( ( rule__TransitionSpec__Group__0 ) ) ;
    public final void ruleTransitionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:495:2: ( ( ( rule__TransitionSpec__Group__0 ) ) )
            // InternalGridGame.g:496:1: ( ( rule__TransitionSpec__Group__0 ) )
            {
            // InternalGridGame.g:496:1: ( ( rule__TransitionSpec__Group__0 ) )
            // InternalGridGame.g:497:1: ( rule__TransitionSpec__Group__0 )
            {
             before(grammarAccess.getTransitionSpecAccess().getGroup()); 
            // InternalGridGame.g:498:1: ( rule__TransitionSpec__Group__0 )
            // InternalGridGame.g:498:2: rule__TransitionSpec__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:510:1: entryRuleTransitionTriggerSpec : ruleTransitionTriggerSpec EOF ;
    public final void entryRuleTransitionTriggerSpec() throws RecognitionException {
        try {
            // InternalGridGame.g:511:1: ( ruleTransitionTriggerSpec EOF )
            // InternalGridGame.g:512:1: ruleTransitionTriggerSpec EOF
            {
             before(grammarAccess.getTransitionTriggerSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionTriggerSpec();

            state._fsp--;

             after(grammarAccess.getTransitionTriggerSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:519:1: ruleTransitionTriggerSpec : ( ( rule__TransitionTriggerSpec__Alternatives ) ) ;
    public final void ruleTransitionTriggerSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:523:2: ( ( ( rule__TransitionTriggerSpec__Alternatives ) ) )
            // InternalGridGame.g:524:1: ( ( rule__TransitionTriggerSpec__Alternatives ) )
            {
            // InternalGridGame.g:524:1: ( ( rule__TransitionTriggerSpec__Alternatives ) )
            // InternalGridGame.g:525:1: ( rule__TransitionTriggerSpec__Alternatives )
            {
             before(grammarAccess.getTransitionTriggerSpecAccess().getAlternatives()); 
            // InternalGridGame.g:526:1: ( rule__TransitionTriggerSpec__Alternatives )
            // InternalGridGame.g:526:2: rule__TransitionTriggerSpec__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleMouseTrigger"
    // InternalGridGame.g:538:1: entryRuleMouseTrigger : ruleMouseTrigger EOF ;
    public final void entryRuleMouseTrigger() throws RecognitionException {
        try {
            // InternalGridGame.g:539:1: ( ruleMouseTrigger EOF )
            // InternalGridGame.g:540:1: ruleMouseTrigger EOF
            {
             before(grammarAccess.getMouseTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleMouseTrigger();

            state._fsp--;

             after(grammarAccess.getMouseTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMouseTrigger"


    // $ANTLR start "ruleMouseTrigger"
    // InternalGridGame.g:547:1: ruleMouseTrigger : ( ( rule__MouseTrigger__Alternatives ) ) ;
    public final void ruleMouseTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:551:2: ( ( ( rule__MouseTrigger__Alternatives ) ) )
            // InternalGridGame.g:552:1: ( ( rule__MouseTrigger__Alternatives ) )
            {
            // InternalGridGame.g:552:1: ( ( rule__MouseTrigger__Alternatives ) )
            // InternalGridGame.g:553:1: ( rule__MouseTrigger__Alternatives )
            {
             before(grammarAccess.getMouseTriggerAccess().getAlternatives()); 
            // InternalGridGame.g:554:1: ( rule__MouseTrigger__Alternatives )
            // InternalGridGame.g:554:2: rule__MouseTrigger__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MouseTrigger__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMouseTriggerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMouseTrigger"


    // $ANTLR start "entryRuleContextTrigger"
    // InternalGridGame.g:566:1: entryRuleContextTrigger : ruleContextTrigger EOF ;
    public final void entryRuleContextTrigger() throws RecognitionException {
        try {
            // InternalGridGame.g:567:1: ( ruleContextTrigger EOF )
            // InternalGridGame.g:568:1: ruleContextTrigger EOF
            {
             before(grammarAccess.getContextTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleContextTrigger();

            state._fsp--;

             after(grammarAccess.getContextTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextTrigger"


    // $ANTLR start "ruleContextTrigger"
    // InternalGridGame.g:575:1: ruleContextTrigger : ( ( rule__ContextTrigger__Group__0 ) ) ;
    public final void ruleContextTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:579:2: ( ( ( rule__ContextTrigger__Group__0 ) ) )
            // InternalGridGame.g:580:1: ( ( rule__ContextTrigger__Group__0 ) )
            {
            // InternalGridGame.g:580:1: ( ( rule__ContextTrigger__Group__0 ) )
            // InternalGridGame.g:581:1: ( rule__ContextTrigger__Group__0 )
            {
             before(grammarAccess.getContextTriggerAccess().getGroup()); 
            // InternalGridGame.g:582:1: ( rule__ContextTrigger__Group__0 )
            // InternalGridGame.g:582:2: rule__ContextTrigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextTrigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextTrigger"


    // $ANTLR start "entryRuleCellStateBehaviour"
    // InternalGridGame.g:594:1: entryRuleCellStateBehaviour : ruleCellStateBehaviour EOF ;
    public final void entryRuleCellStateBehaviour() throws RecognitionException {
        try {
            // InternalGridGame.g:595:1: ( ruleCellStateBehaviour EOF )
            // InternalGridGame.g:596:1: ruleCellStateBehaviour EOF
            {
             before(grammarAccess.getCellStateBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleCellStateBehaviour();

            state._fsp--;

             after(grammarAccess.getCellStateBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCellStateBehaviour"


    // $ANTLR start "ruleCellStateBehaviour"
    // InternalGridGame.g:603:1: ruleCellStateBehaviour : ( ( rule__CellStateBehaviour__Alternatives ) ) ;
    public final void ruleCellStateBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:607:2: ( ( ( rule__CellStateBehaviour__Alternatives ) ) )
            // InternalGridGame.g:608:1: ( ( rule__CellStateBehaviour__Alternatives ) )
            {
            // InternalGridGame.g:608:1: ( ( rule__CellStateBehaviour__Alternatives ) )
            // InternalGridGame.g:609:1: ( rule__CellStateBehaviour__Alternatives )
            {
             before(grammarAccess.getCellStateBehaviourAccess().getAlternatives()); 
            // InternalGridGame.g:610:1: ( rule__CellStateBehaviour__Alternatives )
            // InternalGridGame.g:610:2: rule__CellStateBehaviour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CellStateBehaviour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellStateBehaviourAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellStateBehaviour"


    // $ANTLR start "entryRuleBehaviourReference"
    // InternalGridGame.g:622:1: entryRuleBehaviourReference : ruleBehaviourReference EOF ;
    public final void entryRuleBehaviourReference() throws RecognitionException {
        try {
            // InternalGridGame.g:623:1: ( ruleBehaviourReference EOF )
            // InternalGridGame.g:624:1: ruleBehaviourReference EOF
            {
             before(grammarAccess.getBehaviourReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviourReference();

            state._fsp--;

             after(grammarAccess.getBehaviourReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBehaviourReference"


    // $ANTLR start "ruleBehaviourReference"
    // InternalGridGame.g:631:1: ruleBehaviourReference : ( ( rule__BehaviourReference__RefAssignment ) ) ;
    public final void ruleBehaviourReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:635:2: ( ( ( rule__BehaviourReference__RefAssignment ) ) )
            // InternalGridGame.g:636:1: ( ( rule__BehaviourReference__RefAssignment ) )
            {
            // InternalGridGame.g:636:1: ( ( rule__BehaviourReference__RefAssignment ) )
            // InternalGridGame.g:637:1: ( rule__BehaviourReference__RefAssignment )
            {
             before(grammarAccess.getBehaviourReferenceAccess().getRefAssignment()); 
            // InternalGridGame.g:638:1: ( rule__BehaviourReference__RefAssignment )
            // InternalGridGame.g:638:2: rule__BehaviourReference__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourReference__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourReferenceAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourReference"


    // $ANTLR start "entryRuleDirectBehaviour"
    // InternalGridGame.g:650:1: entryRuleDirectBehaviour : ruleDirectBehaviour EOF ;
    public final void entryRuleDirectBehaviour() throws RecognitionException {
        try {
            // InternalGridGame.g:651:1: ( ruleDirectBehaviour EOF )
            // InternalGridGame.g:652:1: ruleDirectBehaviour EOF
            {
             before(grammarAccess.getDirectBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectBehaviour();

            state._fsp--;

             after(grammarAccess.getDirectBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDirectBehaviour"


    // $ANTLR start "ruleDirectBehaviour"
    // InternalGridGame.g:659:1: ruleDirectBehaviour : ( ( rule__DirectBehaviour__Alternatives ) ) ;
    public final void ruleDirectBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:663:2: ( ( ( rule__DirectBehaviour__Alternatives ) ) )
            // InternalGridGame.g:664:1: ( ( rule__DirectBehaviour__Alternatives ) )
            {
            // InternalGridGame.g:664:1: ( ( rule__DirectBehaviour__Alternatives ) )
            // InternalGridGame.g:665:1: ( rule__DirectBehaviour__Alternatives )
            {
             before(grammarAccess.getDirectBehaviourAccess().getAlternatives()); 
            // InternalGridGame.g:666:1: ( rule__DirectBehaviour__Alternatives )
            // InternalGridGame.g:666:2: rule__DirectBehaviour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DirectBehaviour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectBehaviourAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectBehaviour"


    // $ANTLR start "entryRuleEndGameBehaviour"
    // InternalGridGame.g:678:1: entryRuleEndGameBehaviour : ruleEndGameBehaviour EOF ;
    public final void entryRuleEndGameBehaviour() throws RecognitionException {
        try {
            // InternalGridGame.g:679:1: ( ruleEndGameBehaviour EOF )
            // InternalGridGame.g:680:1: ruleEndGameBehaviour EOF
            {
             before(grammarAccess.getEndGameBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleEndGameBehaviour();

            state._fsp--;

             after(grammarAccess.getEndGameBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEndGameBehaviour"


    // $ANTLR start "ruleEndGameBehaviour"
    // InternalGridGame.g:687:1: ruleEndGameBehaviour : ( ( rule__EndGameBehaviour__Group__0 ) ) ;
    public final void ruleEndGameBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:691:2: ( ( ( rule__EndGameBehaviour__Group__0 ) ) )
            // InternalGridGame.g:692:1: ( ( rule__EndGameBehaviour__Group__0 ) )
            {
            // InternalGridGame.g:692:1: ( ( rule__EndGameBehaviour__Group__0 ) )
            // InternalGridGame.g:693:1: ( rule__EndGameBehaviour__Group__0 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getGroup()); 
            // InternalGridGame.g:694:1: ( rule__EndGameBehaviour__Group__0 )
            // InternalGridGame.g:694:2: rule__EndGameBehaviour__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndGameBehaviourAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndGameBehaviour"


    // $ANTLR start "entryRuleNoOpBehaviour"
    // InternalGridGame.g:706:1: entryRuleNoOpBehaviour : ruleNoOpBehaviour EOF ;
    public final void entryRuleNoOpBehaviour() throws RecognitionException {
        try {
            // InternalGridGame.g:707:1: ( ruleNoOpBehaviour EOF )
            // InternalGridGame.g:708:1: ruleNoOpBehaviour EOF
            {
             before(grammarAccess.getNoOpBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleNoOpBehaviour();

            state._fsp--;

             after(grammarAccess.getNoOpBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNoOpBehaviour"


    // $ANTLR start "ruleNoOpBehaviour"
    // InternalGridGame.g:715:1: ruleNoOpBehaviour : ( 'nop' ) ;
    public final void ruleNoOpBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:719:2: ( ( 'nop' ) )
            // InternalGridGame.g:720:1: ( 'nop' )
            {
            // InternalGridGame.g:720:1: ( 'nop' )
            // InternalGridGame.g:721:1: 'nop'
            {
             before(grammarAccess.getNoOpBehaviourAccess().getNopKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNoOpBehaviourAccess().getNopKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoOpBehaviour"


    // $ANTLR start "entryRuleGlobalAction"
    // InternalGridGame.g:736:1: entryRuleGlobalAction : ruleGlobalAction EOF ;
    public final void entryRuleGlobalAction() throws RecognitionException {
        try {
            // InternalGridGame.g:737:1: ( ruleGlobalAction EOF )
            // InternalGridGame.g:738:1: ruleGlobalAction EOF
            {
             before(grammarAccess.getGlobalActionRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalAction();

            state._fsp--;

             after(grammarAccess.getGlobalActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGlobalAction"


    // $ANTLR start "ruleGlobalAction"
    // InternalGridGame.g:745:1: ruleGlobalAction : ( ( rule__GlobalAction__Group__0 ) ) ;
    public final void ruleGlobalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:749:2: ( ( ( rule__GlobalAction__Group__0 ) ) )
            // InternalGridGame.g:750:1: ( ( rule__GlobalAction__Group__0 ) )
            {
            // InternalGridGame.g:750:1: ( ( rule__GlobalAction__Group__0 ) )
            // InternalGridGame.g:751:1: ( rule__GlobalAction__Group__0 )
            {
             before(grammarAccess.getGlobalActionAccess().getGroup()); 
            // InternalGridGame.g:752:1: ( rule__GlobalAction__Group__0 )
            // InternalGridGame.g:752:2: rule__GlobalAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalAction"


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalGridGame.g:764:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // InternalGridGame.g:765:1: ( ruleFieldSpecification EOF )
            // InternalGridGame.g:766:1: ruleFieldSpecification EOF
            {
             before(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:773:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:777:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // InternalGridGame.g:778:1: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // InternalGridGame.g:778:1: ( ( rule__FieldSpecification__Group__0 ) )
            // InternalGridGame.g:779:1: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // InternalGridGame.g:780:1: ( rule__FieldSpecification__Group__0 )
            // InternalGridGame.g:780:2: rule__FieldSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:792:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalGridGame.g:793:1: ( ruleOptionSpecification EOF )
            // InternalGridGame.g:794:1: ruleOptionSpecification EOF
            {
             before(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:801:1: ruleOptionSpecification : ( ( rule__OptionSpecification__Alternatives ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:805:2: ( ( ( rule__OptionSpecification__Alternatives ) ) )
            // InternalGridGame.g:806:1: ( ( rule__OptionSpecification__Alternatives ) )
            {
            // InternalGridGame.g:806:1: ( ( rule__OptionSpecification__Alternatives ) )
            // InternalGridGame.g:807:1: ( rule__OptionSpecification__Alternatives )
            {
             before(grammarAccess.getOptionSpecificationAccess().getAlternatives()); 
            // InternalGridGame.g:808:1: ( rule__OptionSpecification__Alternatives )
            // InternalGridGame.g:808:2: rule__OptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:820:1: entryRuleAllowRestartMenu : ruleAllowRestartMenu EOF ;
    public final void entryRuleAllowRestartMenu() throws RecognitionException {
        try {
            // InternalGridGame.g:821:1: ( ruleAllowRestartMenu EOF )
            // InternalGridGame.g:822:1: ruleAllowRestartMenu EOF
            {
             before(grammarAccess.getAllowRestartMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleAllowRestartMenu();

            state._fsp--;

             after(grammarAccess.getAllowRestartMenuRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:829:1: ruleAllowRestartMenu : ( ( rule__AllowRestartMenu__Group__0 ) ) ;
    public final void ruleAllowRestartMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:833:2: ( ( ( rule__AllowRestartMenu__Group__0 ) ) )
            // InternalGridGame.g:834:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            {
            // InternalGridGame.g:834:1: ( ( rule__AllowRestartMenu__Group__0 ) )
            // InternalGridGame.g:835:1: ( rule__AllowRestartMenu__Group__0 )
            {
             before(grammarAccess.getAllowRestartMenuAccess().getGroup()); 
            // InternalGridGame.g:836:1: ( rule__AllowRestartMenu__Group__0 )
            // InternalGridGame.g:836:2: rule__AllowRestartMenu__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:848:1: entryRuleStartFieldDeclaration : ruleStartFieldDeclaration EOF ;
    public final void entryRuleStartFieldDeclaration() throws RecognitionException {
        try {
            // InternalGridGame.g:849:1: ( ruleStartFieldDeclaration EOF )
            // InternalGridGame.g:850:1: ruleStartFieldDeclaration EOF
            {
             before(grammarAccess.getStartFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStartFieldDeclaration();

            state._fsp--;

             after(grammarAccess.getStartFieldDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:857:1: ruleStartFieldDeclaration : ( ( rule__StartFieldDeclaration__Group__0 ) ) ;
    public final void ruleStartFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:861:2: ( ( ( rule__StartFieldDeclaration__Group__0 ) ) )
            // InternalGridGame.g:862:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            {
            // InternalGridGame.g:862:1: ( ( rule__StartFieldDeclaration__Group__0 ) )
            // InternalGridGame.g:863:1: ( rule__StartFieldDeclaration__Group__0 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getGroup()); 
            // InternalGridGame.g:864:1: ( rule__StartFieldDeclaration__Group__0 )
            // InternalGridGame.g:864:2: rule__StartFieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleGenerationalContexts"
    // InternalGridGame.g:876:1: entryRuleGenerationalContexts : ruleGenerationalContexts EOF ;
    public final void entryRuleGenerationalContexts() throws RecognitionException {
        try {
            // InternalGridGame.g:877:1: ( ruleGenerationalContexts EOF )
            // InternalGridGame.g:878:1: ruleGenerationalContexts EOF
            {
             before(grammarAccess.getGenerationalContextsRule()); 
            pushFollow(FOLLOW_1);
            ruleGenerationalContexts();

            state._fsp--;

             after(grammarAccess.getGenerationalContextsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenerationalContexts"


    // $ANTLR start "ruleGenerationalContexts"
    // InternalGridGame.g:885:1: ruleGenerationalContexts : ( ( rule__GenerationalContexts__Group__0 ) ) ;
    public final void ruleGenerationalContexts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:889:2: ( ( ( rule__GenerationalContexts__Group__0 ) ) )
            // InternalGridGame.g:890:1: ( ( rule__GenerationalContexts__Group__0 ) )
            {
            // InternalGridGame.g:890:1: ( ( rule__GenerationalContexts__Group__0 ) )
            // InternalGridGame.g:891:1: ( rule__GenerationalContexts__Group__0 )
            {
             before(grammarAccess.getGenerationalContextsAccess().getGroup()); 
            // InternalGridGame.g:892:1: ( rule__GenerationalContexts__Group__0 )
            // InternalGridGame.g:892:2: rule__GenerationalContexts__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenerationalContexts__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenerationalContextsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerationalContexts"


    // $ANTLR start "entryRuleGlobalFieldInitialisation"
    // InternalGridGame.g:904:1: entryRuleGlobalFieldInitialisation : ruleGlobalFieldInitialisation EOF ;
    public final void entryRuleGlobalFieldInitialisation() throws RecognitionException {
        try {
            // InternalGridGame.g:905:1: ( ruleGlobalFieldInitialisation EOF )
            // InternalGridGame.g:906:1: ruleGlobalFieldInitialisation EOF
            {
             before(grammarAccess.getGlobalFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getGlobalFieldInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGlobalFieldInitialisation"


    // $ANTLR start "ruleGlobalFieldInitialisation"
    // InternalGridGame.g:913:1: ruleGlobalFieldInitialisation : ( ( rule__GlobalFieldInitialisation__Group__0 ) ) ;
    public final void ruleGlobalFieldInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:917:2: ( ( ( rule__GlobalFieldInitialisation__Group__0 ) ) )
            // InternalGridGame.g:918:1: ( ( rule__GlobalFieldInitialisation__Group__0 ) )
            {
            // InternalGridGame.g:918:1: ( ( rule__GlobalFieldInitialisation__Group__0 ) )
            // InternalGridGame.g:919:1: ( rule__GlobalFieldInitialisation__Group__0 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getGroup()); 
            // InternalGridGame.g:920:1: ( rule__GlobalFieldInitialisation__Group__0 )
            // InternalGridGame.g:920:2: rule__GlobalFieldInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalFieldInitialisation"


    // $ANTLR start "entryRuleFieldInitialisations"
    // InternalGridGame.g:932:1: entryRuleFieldInitialisations : ruleFieldInitialisations EOF ;
    public final void entryRuleFieldInitialisations() throws RecognitionException {
        try {
            // InternalGridGame.g:933:1: ( ruleFieldInitialisations EOF )
            // InternalGridGame.g:934:1: ruleFieldInitialisations EOF
            {
             before(grammarAccess.getFieldInitialisationsRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldInitialisations();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:941:1: ruleFieldInitialisations : ( ( rule__FieldInitialisations__Alternatives ) ) ;
    public final void ruleFieldInitialisations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:945:2: ( ( ( rule__FieldInitialisations__Alternatives ) ) )
            // InternalGridGame.g:946:1: ( ( rule__FieldInitialisations__Alternatives ) )
            {
            // InternalGridGame.g:946:1: ( ( rule__FieldInitialisations__Alternatives ) )
            // InternalGridGame.g:947:1: ( rule__FieldInitialisations__Alternatives )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getAlternatives()); 
            // InternalGridGame.g:948:1: ( rule__FieldInitialisations__Alternatives )
            // InternalGridGame.g:948:2: rule__FieldInitialisations__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFieldInitialisationsRef"
    // InternalGridGame.g:960:1: entryRuleFieldInitialisationsRef : ruleFieldInitialisationsRef EOF ;
    public final void entryRuleFieldInitialisationsRef() throws RecognitionException {
        try {
            // InternalGridGame.g:961:1: ( ruleFieldInitialisationsRef EOF )
            // InternalGridGame.g:962:1: ruleFieldInitialisationsRef EOF
            {
             before(grammarAccess.getFieldInitialisationsRefRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldInitialisationsRef();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldInitialisationsRef"


    // $ANTLR start "ruleFieldInitialisationsRef"
    // InternalGridGame.g:969:1: ruleFieldInitialisationsRef : ( ( rule__FieldInitialisationsRef__Group__0 ) ) ;
    public final void ruleFieldInitialisationsRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:973:2: ( ( ( rule__FieldInitialisationsRef__Group__0 ) ) )
            // InternalGridGame.g:974:1: ( ( rule__FieldInitialisationsRef__Group__0 ) )
            {
            // InternalGridGame.g:974:1: ( ( rule__FieldInitialisationsRef__Group__0 ) )
            // InternalGridGame.g:975:1: ( rule__FieldInitialisationsRef__Group__0 )
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getGroup()); 
            // InternalGridGame.g:976:1: ( rule__FieldInitialisationsRef__Group__0 )
            // InternalGridGame.g:976:2: rule__FieldInitialisationsRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldInitialisationsRef"


    // $ANTLR start "entryRuleLocalFieldInitialisations"
    // InternalGridGame.g:988:1: entryRuleLocalFieldInitialisations : ruleLocalFieldInitialisations EOF ;
    public final void entryRuleLocalFieldInitialisations() throws RecognitionException {
        try {
            // InternalGridGame.g:989:1: ( ruleLocalFieldInitialisations EOF )
            // InternalGridGame.g:990:1: ruleLocalFieldInitialisations EOF
            {
             before(grammarAccess.getLocalFieldInitialisationsRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalFieldInitialisations();

            state._fsp--;

             after(grammarAccess.getLocalFieldInitialisationsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLocalFieldInitialisations"


    // $ANTLR start "ruleLocalFieldInitialisations"
    // InternalGridGame.g:997:1: ruleLocalFieldInitialisations : ( ( rule__LocalFieldInitialisations__Group__0 ) ) ;
    public final void ruleLocalFieldInitialisations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1001:2: ( ( ( rule__LocalFieldInitialisations__Group__0 ) ) )
            // InternalGridGame.g:1002:1: ( ( rule__LocalFieldInitialisations__Group__0 ) )
            {
            // InternalGridGame.g:1002:1: ( ( rule__LocalFieldInitialisations__Group__0 ) )
            // InternalGridGame.g:1003:1: ( rule__LocalFieldInitialisations__Group__0 )
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getGroup()); 
            // InternalGridGame.g:1004:1: ( rule__LocalFieldInitialisations__Group__0 )
            // InternalGridGame.g:1004:2: rule__LocalFieldInitialisations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalFieldInitialisationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalFieldInitialisations"


    // $ANTLR start "entryRuleFieldInitialisation"
    // InternalGridGame.g:1016:1: entryRuleFieldInitialisation : ruleFieldInitialisation EOF ;
    public final void entryRuleFieldInitialisation() throws RecognitionException {
        try {
            // InternalGridGame.g:1017:1: ( ruleFieldInitialisation EOF )
            // InternalGridGame.g:1018:1: ruleFieldInitialisation EOF
            {
             before(grammarAccess.getFieldInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1025:1: ruleFieldInitialisation : ( ( rule__FieldInitialisation__Alternatives ) ) ;
    public final void ruleFieldInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1029:2: ( ( ( rule__FieldInitialisation__Alternatives ) ) )
            // InternalGridGame.g:1030:1: ( ( rule__FieldInitialisation__Alternatives ) )
            {
            // InternalGridGame.g:1030:1: ( ( rule__FieldInitialisation__Alternatives ) )
            // InternalGridGame.g:1031:1: ( rule__FieldInitialisation__Alternatives )
            {
             before(grammarAccess.getFieldInitialisationAccess().getAlternatives()); 
            // InternalGridGame.g:1032:1: ( rule__FieldInitialisation__Alternatives )
            // InternalGridGame.g:1032:2: rule__FieldInitialisation__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1044:1: entryRuleDefaultInitialisation : ruleDefaultInitialisation EOF ;
    public final void entryRuleDefaultInitialisation() throws RecognitionException {
        try {
            // InternalGridGame.g:1045:1: ( ruleDefaultInitialisation EOF )
            // InternalGridGame.g:1046:1: ruleDefaultInitialisation EOF
            {
             before(grammarAccess.getDefaultInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultInitialisation();

            state._fsp--;

             after(grammarAccess.getDefaultInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1053:1: ruleDefaultInitialisation : ( ( rule__DefaultInitialisation__Group__0 ) ) ;
    public final void ruleDefaultInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1057:2: ( ( ( rule__DefaultInitialisation__Group__0 ) ) )
            // InternalGridGame.g:1058:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            {
            // InternalGridGame.g:1058:1: ( ( rule__DefaultInitialisation__Group__0 ) )
            // InternalGridGame.g:1059:1: ( rule__DefaultInitialisation__Group__0 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getGroup()); 
            // InternalGridGame.g:1060:1: ( rule__DefaultInitialisation__Group__0 )
            // InternalGridGame.g:1060:2: rule__DefaultInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1072:1: entryRuleRandomInitialisation : ruleRandomInitialisation EOF ;
    public final void entryRuleRandomInitialisation() throws RecognitionException {
        try {
            // InternalGridGame.g:1073:1: ( ruleRandomInitialisation EOF )
            // InternalGridGame.g:1074:1: ruleRandomInitialisation EOF
            {
             before(grammarAccess.getRandomInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleRandomInitialisation();

            state._fsp--;

             after(grammarAccess.getRandomInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1081:1: ruleRandomInitialisation : ( ( rule__RandomInitialisation__Group__0 ) ) ;
    public final void ruleRandomInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1085:2: ( ( ( rule__RandomInitialisation__Group__0 ) ) )
            // InternalGridGame.g:1086:1: ( ( rule__RandomInitialisation__Group__0 ) )
            {
            // InternalGridGame.g:1086:1: ( ( rule__RandomInitialisation__Group__0 ) )
            // InternalGridGame.g:1087:1: ( rule__RandomInitialisation__Group__0 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getGroup()); 
            // InternalGridGame.g:1088:1: ( rule__RandomInitialisation__Group__0 )
            // InternalGridGame.g:1088:2: rule__RandomInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1100:1: entryRuleContextInitialisation : ruleContextInitialisation EOF ;
    public final void entryRuleContextInitialisation() throws RecognitionException {
        try {
            // InternalGridGame.g:1101:1: ( ruleContextInitialisation EOF )
            // InternalGridGame.g:1102:1: ruleContextInitialisation EOF
            {
             before(grammarAccess.getContextInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleContextInitialisation();

            state._fsp--;

             after(grammarAccess.getContextInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1109:1: ruleContextInitialisation : ( ( rule__ContextInitialisation__Group__0 ) ) ;
    public final void ruleContextInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1113:2: ( ( ( rule__ContextInitialisation__Group__0 ) ) )
            // InternalGridGame.g:1114:1: ( ( rule__ContextInitialisation__Group__0 ) )
            {
            // InternalGridGame.g:1114:1: ( ( rule__ContextInitialisation__Group__0 ) )
            // InternalGridGame.g:1115:1: ( rule__ContextInitialisation__Group__0 )
            {
             before(grammarAccess.getContextInitialisationAccess().getGroup()); 
            // InternalGridGame.g:1116:1: ( rule__ContextInitialisation__Group__0 )
            // InternalGridGame.g:1116:2: rule__ContextInitialisation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1128:1: entryRuleContextExpression : ruleContextExpression EOF ;
    public final void entryRuleContextExpression() throws RecognitionException {
        try {
            // InternalGridGame.g:1129:1: ( ruleContextExpression EOF )
            // InternalGridGame.g:1130:1: ruleContextExpression EOF
            {
             before(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1137:1: ruleContextExpression : ( ( rule__ContextExpression__Group__0 ) ) ;
    public final void ruleContextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1141:2: ( ( ( rule__ContextExpression__Group__0 ) ) )
            // InternalGridGame.g:1142:1: ( ( rule__ContextExpression__Group__0 ) )
            {
            // InternalGridGame.g:1142:1: ( ( rule__ContextExpression__Group__0 ) )
            // InternalGridGame.g:1143:1: ( rule__ContextExpression__Group__0 )
            {
             before(grammarAccess.getContextExpressionAccess().getGroup()); 
            // InternalGridGame.g:1144:1: ( rule__ContextExpression__Group__0 )
            // InternalGridGame.g:1144:2: rule__ContextExpression__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1156:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalGridGame.g:1157:1: ( ruleAtomicExpression EOF )
            // InternalGridGame.g:1158:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1165:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1169:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalGridGame.g:1170:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalGridGame.g:1170:1: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalGridGame.g:1171:1: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalGridGame.g:1172:1: ( rule__AtomicExpression__Alternatives )
            // InternalGridGame.g:1172:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1184:1: entryRuleFilterExpression : ruleFilterExpression EOF ;
    public final void entryRuleFilterExpression() throws RecognitionException {
        try {
            // InternalGridGame.g:1185:1: ( ruleFilterExpression EOF )
            // InternalGridGame.g:1186:1: ruleFilterExpression EOF
            {
             before(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterExpression();

            state._fsp--;

             after(grammarAccess.getFilterExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1193:1: ruleFilterExpression : ( ( rule__FilterExpression__Group__0 ) ) ;
    public final void ruleFilterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1197:2: ( ( ( rule__FilterExpression__Group__0 ) ) )
            // InternalGridGame.g:1198:1: ( ( rule__FilterExpression__Group__0 ) )
            {
            // InternalGridGame.g:1198:1: ( ( rule__FilterExpression__Group__0 ) )
            // InternalGridGame.g:1199:1: ( rule__FilterExpression__Group__0 )
            {
             before(grammarAccess.getFilterExpressionAccess().getGroup()); 
            // InternalGridGame.g:1200:1: ( rule__FilterExpression__Group__0 )
            // InternalGridGame.g:1200:2: rule__FilterExpression__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleStateFilterExpression"
    // InternalGridGame.g:1212:1: entryRuleStateFilterExpression : ruleStateFilterExpression EOF ;
    public final void entryRuleStateFilterExpression() throws RecognitionException {
        try {
            // InternalGridGame.g:1213:1: ( ruleStateFilterExpression EOF )
            // InternalGridGame.g:1214:1: ruleStateFilterExpression EOF
            {
             before(grammarAccess.getStateFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStateFilterExpression();

            state._fsp--;

             after(grammarAccess.getStateFilterExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateFilterExpression"


    // $ANTLR start "ruleStateFilterExpression"
    // InternalGridGame.g:1221:1: ruleStateFilterExpression : ( ( rule__StateFilterExpression__Group__0 ) ) ;
    public final void ruleStateFilterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1225:2: ( ( ( rule__StateFilterExpression__Group__0 ) ) )
            // InternalGridGame.g:1226:1: ( ( rule__StateFilterExpression__Group__0 ) )
            {
            // InternalGridGame.g:1226:1: ( ( rule__StateFilterExpression__Group__0 ) )
            // InternalGridGame.g:1227:1: ( rule__StateFilterExpression__Group__0 )
            {
             before(grammarAccess.getStateFilterExpressionAccess().getGroup()); 
            // InternalGridGame.g:1228:1: ( rule__StateFilterExpression__Group__0 )
            // InternalGridGame.g:1228:2: rule__StateFilterExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateFilterExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateFilterExpression"


    // $ANTLR start "entryRuleCountExpression"
    // InternalGridGame.g:1240:1: entryRuleCountExpression : ruleCountExpression EOF ;
    public final void entryRuleCountExpression() throws RecognitionException {
        try {
            // InternalGridGame.g:1241:1: ( ruleCountExpression EOF )
            // InternalGridGame.g:1242:1: ruleCountExpression EOF
            {
             before(grammarAccess.getCountExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleCountExpression();

            state._fsp--;

             after(grammarAccess.getCountExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1249:1: ruleCountExpression : ( ( rule__CountExpression__Group__0 ) ) ;
    public final void ruleCountExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1253:2: ( ( ( rule__CountExpression__Group__0 ) ) )
            // InternalGridGame.g:1254:1: ( ( rule__CountExpression__Group__0 ) )
            {
            // InternalGridGame.g:1254:1: ( ( rule__CountExpression__Group__0 ) )
            // InternalGridGame.g:1255:1: ( rule__CountExpression__Group__0 )
            {
             before(grammarAccess.getCountExpressionAccess().getGroup()); 
            // InternalGridGame.g:1256:1: ( rule__CountExpression__Group__0 )
            // InternalGridGame.g:1256:2: rule__CountExpression__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1268:1: entryRuleNotEmptyExpression : ruleNotEmptyExpression EOF ;
    public final void entryRuleNotEmptyExpression() throws RecognitionException {
        try {
            // InternalGridGame.g:1269:1: ( ruleNotEmptyExpression EOF )
            // InternalGridGame.g:1270:1: ruleNotEmptyExpression EOF
            {
             before(grammarAccess.getNotEmptyExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotEmptyExpression();

            state._fsp--;

             after(grammarAccess.getNotEmptyExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGridGame.g:1277:1: ruleNotEmptyExpression : ( ( rule__NotEmptyExpression__Group__0 ) ) ;
    public final void ruleNotEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1281:2: ( ( ( rule__NotEmptyExpression__Group__0 ) ) )
            // InternalGridGame.g:1282:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            {
            // InternalGridGame.g:1282:1: ( ( rule__NotEmptyExpression__Group__0 ) )
            // InternalGridGame.g:1283:1: ( rule__NotEmptyExpression__Group__0 )
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getGroup()); 
            // InternalGridGame.g:1284:1: ( rule__NotEmptyExpression__Group__0 )
            // InternalGridGame.g:1284:2: rule__NotEmptyExpression__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEmptyExpression"
    // InternalGridGame.g:1296:1: entryRuleEmptyExpression : ruleEmptyExpression EOF ;
    public final void entryRuleEmptyExpression() throws RecognitionException {
        try {
            // InternalGridGame.g:1297:1: ( ruleEmptyExpression EOF )
            // InternalGridGame.g:1298:1: ruleEmptyExpression EOF
            {
             before(grammarAccess.getEmptyExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyExpression();

            state._fsp--;

             after(grammarAccess.getEmptyExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEmptyExpression"


    // $ANTLR start "ruleEmptyExpression"
    // InternalGridGame.g:1305:1: ruleEmptyExpression : ( ( rule__EmptyExpression__Group__0 ) ) ;
    public final void ruleEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1309:2: ( ( ( rule__EmptyExpression__Group__0 ) ) )
            // InternalGridGame.g:1310:1: ( ( rule__EmptyExpression__Group__0 ) )
            {
            // InternalGridGame.g:1310:1: ( ( rule__EmptyExpression__Group__0 ) )
            // InternalGridGame.g:1311:1: ( rule__EmptyExpression__Group__0 )
            {
             before(grammarAccess.getEmptyExpressionAccess().getGroup()); 
            // InternalGridGame.g:1312:1: ( rule__EmptyExpression__Group__0 )
            // InternalGridGame.g:1312:2: rule__EmptyExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptyExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyExpression"


    // $ANTLR start "rule__GridGame__Alternatives_3"
    // InternalGridGame.g:1324:1: rule__GridGame__Alternatives_3 : ( ( ( rule__GridGame__StatesAssignment_3_0 ) ) | ( ( rule__GridGame__CellsAssignment_3_1 ) ) | ( ( rule__GridGame__GlobalActionsAssignment_3_2 ) ) | ( ( rule__GridGame__InitsAssignment_3_3 ) ) | ( ( rule__GridGame__FieldsAssignment_3_4 ) ) | ( ( rule__GridGame__OptionsAssignment_3_5 ) ) );
    public final void rule__GridGame__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1328:1: ( ( ( rule__GridGame__StatesAssignment_3_0 ) ) | ( ( rule__GridGame__CellsAssignment_3_1 ) ) | ( ( rule__GridGame__GlobalActionsAssignment_3_2 ) ) | ( ( rule__GridGame__InitsAssignment_3_3 ) ) | ( ( rule__GridGame__FieldsAssignment_3_4 ) ) | ( ( rule__GridGame__OptionsAssignment_3_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 55:
                {
                alt1=4;
                }
                break;
            case 50:
                {
                alt1=5;
                }
                break;
            case 35:
            case 53:
            case 54:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGridGame.g:1329:1: ( ( rule__GridGame__StatesAssignment_3_0 ) )
                    {
                    // InternalGridGame.g:1329:1: ( ( rule__GridGame__StatesAssignment_3_0 ) )
                    // InternalGridGame.g:1330:1: ( rule__GridGame__StatesAssignment_3_0 )
                    {
                     before(grammarAccess.getGridGameAccess().getStatesAssignment_3_0()); 
                    // InternalGridGame.g:1331:1: ( rule__GridGame__StatesAssignment_3_0 )
                    // InternalGridGame.g:1331:2: rule__GridGame__StatesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GridGame__StatesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGridGameAccess().getStatesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1335:6: ( ( rule__GridGame__CellsAssignment_3_1 ) )
                    {
                    // InternalGridGame.g:1335:6: ( ( rule__GridGame__CellsAssignment_3_1 ) )
                    // InternalGridGame.g:1336:1: ( rule__GridGame__CellsAssignment_3_1 )
                    {
                     before(grammarAccess.getGridGameAccess().getCellsAssignment_3_1()); 
                    // InternalGridGame.g:1337:1: ( rule__GridGame__CellsAssignment_3_1 )
                    // InternalGridGame.g:1337:2: rule__GridGame__CellsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GridGame__CellsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGridGameAccess().getCellsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1341:6: ( ( rule__GridGame__GlobalActionsAssignment_3_2 ) )
                    {
                    // InternalGridGame.g:1341:6: ( ( rule__GridGame__GlobalActionsAssignment_3_2 ) )
                    // InternalGridGame.g:1342:1: ( rule__GridGame__GlobalActionsAssignment_3_2 )
                    {
                     before(grammarAccess.getGridGameAccess().getGlobalActionsAssignment_3_2()); 
                    // InternalGridGame.g:1343:1: ( rule__GridGame__GlobalActionsAssignment_3_2 )
                    // InternalGridGame.g:1343:2: rule__GridGame__GlobalActionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GridGame__GlobalActionsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getGridGameAccess().getGlobalActionsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGridGame.g:1347:6: ( ( rule__GridGame__InitsAssignment_3_3 ) )
                    {
                    // InternalGridGame.g:1347:6: ( ( rule__GridGame__InitsAssignment_3_3 ) )
                    // InternalGridGame.g:1348:1: ( rule__GridGame__InitsAssignment_3_3 )
                    {
                     before(grammarAccess.getGridGameAccess().getInitsAssignment_3_3()); 
                    // InternalGridGame.g:1349:1: ( rule__GridGame__InitsAssignment_3_3 )
                    // InternalGridGame.g:1349:2: rule__GridGame__InitsAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__GridGame__InitsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getGridGameAccess().getInitsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGridGame.g:1353:6: ( ( rule__GridGame__FieldsAssignment_3_4 ) )
                    {
                    // InternalGridGame.g:1353:6: ( ( rule__GridGame__FieldsAssignment_3_4 ) )
                    // InternalGridGame.g:1354:1: ( rule__GridGame__FieldsAssignment_3_4 )
                    {
                     before(grammarAccess.getGridGameAccess().getFieldsAssignment_3_4()); 
                    // InternalGridGame.g:1355:1: ( rule__GridGame__FieldsAssignment_3_4 )
                    // InternalGridGame.g:1355:2: rule__GridGame__FieldsAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__GridGame__FieldsAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getGridGameAccess().getFieldsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGridGame.g:1359:6: ( ( rule__GridGame__OptionsAssignment_3_5 ) )
                    {
                    // InternalGridGame.g:1359:6: ( ( rule__GridGame__OptionsAssignment_3_5 ) )
                    // InternalGridGame.g:1360:1: ( rule__GridGame__OptionsAssignment_3_5 )
                    {
                     before(grammarAccess.getGridGameAccess().getOptionsAssignment_3_5()); 
                    // InternalGridGame.g:1361:1: ( rule__GridGame__OptionsAssignment_3_5 )
                    // InternalGridGame.g:1361:2: rule__GridGame__OptionsAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__GridGame__OptionsAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getGridGameAccess().getOptionsAssignment_3_5()); 

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
    // $ANTLR end "rule__GridGame__Alternatives_3"


    // $ANTLR start "rule__CellMember__Alternatives"
    // InternalGridGame.g:1370:1: rule__CellMember__Alternatives : ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) | ( ruleCellStateSpec ) );
    public final void rule__CellMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1374:1: ( ( ruleCellDisplaySpec ) | ( ruleCellVarSpec ) | ( ruleCellStateSpec ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGridGame.g:1375:1: ( ruleCellDisplaySpec )
                    {
                    // InternalGridGame.g:1375:1: ( ruleCellDisplaySpec )
                    // InternalGridGame.g:1376:1: ruleCellDisplaySpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCellDisplaySpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellDisplaySpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1381:6: ( ruleCellVarSpec )
                    {
                    // InternalGridGame.g:1381:6: ( ruleCellVarSpec )
                    // InternalGridGame.g:1382:1: ruleCellVarSpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCellVarSpec();

                    state._fsp--;

                     after(grammarAccess.getCellMemberAccess().getCellVarSpecParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1387:6: ( ruleCellStateSpec )
                    {
                    // InternalGridGame.g:1387:6: ( ruleCellStateSpec )
                    // InternalGridGame.g:1388:1: ruleCellStateSpec
                    {
                     before(grammarAccess.getCellMemberAccess().getCellStateSpecParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1398:1: rule__CellDisplaySpec__Display_typeAlternatives_3_0 : ( ( 'label' ) | ( 'button' ) );
    public final void rule__CellDisplaySpec__Display_typeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1402:1: ( ( 'label' ) | ( 'button' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGridGame.g:1403:1: ( 'label' )
                    {
                    // InternalGridGame.g:1403:1: ( 'label' )
                    // InternalGridGame.g:1404:1: 'label'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeLabelKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1411:6: ( 'button' )
                    {
                    // InternalGridGame.g:1411:6: ( 'button' )
                    // InternalGridGame.g:1412:1: 'button'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeButtonKeyword_3_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalGridGame.g:1424:1: rule__CellDisplaySpec__Alternatives_4 : ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_2__0 ) ) );
    public final void rule__CellDisplaySpec__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1428:1: ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGridGame.g:1429:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    {
                    // InternalGridGame.g:1429:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    // InternalGridGame.g:1430:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 
                    // InternalGridGame.g:1431:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    // InternalGridGame.g:1431:2: rule__CellDisplaySpec__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDisplaySpec__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1435:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    {
                    // InternalGridGame.g:1435:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    // InternalGridGame.g:1436:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_1()); 
                    // InternalGridGame.g:1437:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    // InternalGridGame.g:1437:2: rule__CellDisplaySpec__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDisplaySpec__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1441:6: ( ( rule__CellDisplaySpec__Group_4_2__0 ) )
                    {
                    // InternalGridGame.g:1441:6: ( ( rule__CellDisplaySpec__Group_4_2__0 ) )
                    // InternalGridGame.g:1442:1: ( rule__CellDisplaySpec__Group_4_2__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_2()); 
                    // InternalGridGame.g:1443:1: ( rule__CellDisplaySpec__Group_4_2__0 )
                    // InternalGridGame.g:1443:2: rule__CellDisplaySpec__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDisplaySpec__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_4_2()); 

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


    // $ANTLR start "rule__CellDisplaySpec__ColorAlternatives_4_2_1_0"
    // InternalGridGame.g:1452:1: rule__CellDisplaySpec__ColorAlternatives_4_2_1_0 : ( ( 'black' ) | ( 'white' ) | ( 'yellow' ) | ( 'red' ) | ( 'green' ) );
    public final void rule__CellDisplaySpec__ColorAlternatives_4_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1456:1: ( ( 'black' ) | ( 'white' ) | ( 'yellow' ) | ( 'red' ) | ( 'green' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
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
                    // InternalGridGame.g:1457:1: ( 'black' )
                    {
                    // InternalGridGame.g:1457:1: ( 'black' )
                    // InternalGridGame.g:1458:1: 'black'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getColorBlackKeyword_4_2_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getColorBlackKeyword_4_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1465:6: ( 'white' )
                    {
                    // InternalGridGame.g:1465:6: ( 'white' )
                    // InternalGridGame.g:1466:1: 'white'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getColorWhiteKeyword_4_2_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getColorWhiteKeyword_4_2_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1473:6: ( 'yellow' )
                    {
                    // InternalGridGame.g:1473:6: ( 'yellow' )
                    // InternalGridGame.g:1474:1: 'yellow'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getColorYellowKeyword_4_2_1_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getColorYellowKeyword_4_2_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGridGame.g:1481:6: ( 'red' )
                    {
                    // InternalGridGame.g:1481:6: ( 'red' )
                    // InternalGridGame.g:1482:1: 'red'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getColorRedKeyword_4_2_1_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getColorRedKeyword_4_2_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGridGame.g:1489:6: ( 'green' )
                    {
                    // InternalGridGame.g:1489:6: ( 'green' )
                    // InternalGridGame.g:1490:1: 'green'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getColorGreenKeyword_4_2_1_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getColorGreenKeyword_4_2_1_0_4()); 

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
    // $ANTLR end "rule__CellDisplaySpec__ColorAlternatives_4_2_1_0"


    // $ANTLR start "rule__CellVarSpec__TypeAlternatives_1_0"
    // InternalGridGame.g:1503:1: rule__CellVarSpec__TypeAlternatives_1_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__CellVarSpec__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1507:1: ( ( 'int' ) | ( 'String' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGridGame.g:1508:1: ( 'int' )
                    {
                    // InternalGridGame.g:1508:1: ( 'int' )
                    // InternalGridGame.g:1509:1: 'int'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1516:6: ( 'String' )
                    {
                    // InternalGridGame.g:1516:6: ( 'String' )
                    // InternalGridGame.g:1517:1: 'String'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeStringKeyword_1_0_1()); 
                    match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__ParamSpec__TypeAlternatives_0_0"
    // InternalGridGame.g:1529:1: rule__ParamSpec__TypeAlternatives_0_0 : ( ( 'int' ) | ( 'String' ) | ( 'Behaviour' ) );
    public final void rule__ParamSpec__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1533:1: ( ( 'int' ) | ( 'String' ) | ( 'Behaviour' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
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
                    // InternalGridGame.g:1534:1: ( 'int' )
                    {
                    // InternalGridGame.g:1534:1: ( 'int' )
                    // InternalGridGame.g:1535:1: 'int'
                    {
                     before(grammarAccess.getParamSpecAccess().getTypeIntKeyword_0_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getParamSpecAccess().getTypeIntKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1542:6: ( 'String' )
                    {
                    // InternalGridGame.g:1542:6: ( 'String' )
                    // InternalGridGame.g:1543:1: 'String'
                    {
                     before(grammarAccess.getParamSpecAccess().getTypeStringKeyword_0_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getParamSpecAccess().getTypeStringKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1550:6: ( 'Behaviour' )
                    {
                    // InternalGridGame.g:1550:6: ( 'Behaviour' )
                    // InternalGridGame.g:1551:1: 'Behaviour'
                    {
                     before(grammarAccess.getParamSpecAccess().getTypeBehaviourKeyword_0_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getParamSpecAccess().getTypeBehaviourKeyword_0_0_2()); 

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
    // $ANTLR end "rule__ParamSpec__TypeAlternatives_0_0"


    // $ANTLR start "rule__CellStateSpec__Alternatives"
    // InternalGridGame.g:1563:1: rule__CellStateSpec__Alternatives : ( ( ruleLocalCellStateSpec ) | ( ruleCellStateSpecReference ) );
    public final void rule__CellStateSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1567:1: ( ( ruleLocalCellStateSpec ) | ( ruleCellStateSpecReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else if ( (LA8_1==26) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGridGame.g:1568:1: ( ruleLocalCellStateSpec )
                    {
                    // InternalGridGame.g:1568:1: ( ruleLocalCellStateSpec )
                    // InternalGridGame.g:1569:1: ruleLocalCellStateSpec
                    {
                     before(grammarAccess.getCellStateSpecAccess().getLocalCellStateSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocalCellStateSpec();

                    state._fsp--;

                     after(grammarAccess.getCellStateSpecAccess().getLocalCellStateSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1574:6: ( ruleCellStateSpecReference )
                    {
                    // InternalGridGame.g:1574:6: ( ruleCellStateSpecReference )
                    // InternalGridGame.g:1575:1: ruleCellStateSpecReference
                    {
                     before(grammarAccess.getCellStateSpecAccess().getCellStateSpecReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1585:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleDirectBehaviour ) | ( ruleVarRefValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1589:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleDirectBehaviour ) | ( ruleVarRefValue ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case 11:
            case 46:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGridGame.g:1590:1: ( ruleStringValue )
                    {
                    // InternalGridGame.g:1590:1: ( ruleStringValue )
                    // InternalGridGame.g:1591:1: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1596:6: ( ruleIntValue )
                    {
                    // InternalGridGame.g:1596:6: ( ruleIntValue )
                    // InternalGridGame.g:1597:1: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1602:6: ( ruleDirectBehaviour )
                    {
                    // InternalGridGame.g:1602:6: ( ruleDirectBehaviour )
                    // InternalGridGame.g:1603:1: ruleDirectBehaviour
                    {
                     before(grammarAccess.getValueAccess().getDirectBehaviourParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectBehaviour();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDirectBehaviourParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGridGame.g:1608:6: ( ruleVarRefValue )
                    {
                    // InternalGridGame.g:1608:6: ( ruleVarRefValue )
                    // InternalGridGame.g:1609:1: ruleVarRefValue
                    {
                     before(grammarAccess.getValueAccess().getVarRefValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRefValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getVarRefValueParserRuleCall_3()); 

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
    // InternalGridGame.g:1619:1: rule__TransitionTriggerSpec__Alternatives : ( ( ruleMouseTrigger ) | ( ruleContextTrigger ) );
    public final void rule__TransitionTriggerSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1623:1: ( ( ruleMouseTrigger ) | ( ruleContextTrigger ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44||LA10_0==68) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGridGame.g:1624:1: ( ruleMouseTrigger )
                    {
                    // InternalGridGame.g:1624:1: ( ruleMouseTrigger )
                    // InternalGridGame.g:1625:1: ruleMouseTrigger
                    {
                     before(grammarAccess.getTransitionTriggerSpecAccess().getMouseTriggerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMouseTrigger();

                    state._fsp--;

                     after(grammarAccess.getTransitionTriggerSpecAccess().getMouseTriggerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1630:6: ( ruleContextTrigger )
                    {
                    // InternalGridGame.g:1630:6: ( ruleContextTrigger )
                    // InternalGridGame.g:1631:1: ruleContextTrigger
                    {
                     before(grammarAccess.getTransitionTriggerSpecAccess().getContextTriggerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContextTrigger();

                    state._fsp--;

                     after(grammarAccess.getTransitionTriggerSpecAccess().getContextTriggerParserRuleCall_1()); 

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


    // $ANTLR start "rule__MouseTrigger__Alternatives"
    // InternalGridGame.g:1641:1: rule__MouseTrigger__Alternatives : ( ( ( rule__MouseTrigger__LeftAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) );
    public final void rule__MouseTrigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1645:1: ( ( ( rule__MouseTrigger__LeftAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==68) ) {
                alt11=1;
            }
            else if ( (LA11_0==44) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGridGame.g:1646:1: ( ( rule__MouseTrigger__LeftAssignment_0 ) )
                    {
                    // InternalGridGame.g:1646:1: ( ( rule__MouseTrigger__LeftAssignment_0 ) )
                    // InternalGridGame.g:1647:1: ( rule__MouseTrigger__LeftAssignment_0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getLeftAssignment_0()); 
                    // InternalGridGame.g:1648:1: ( rule__MouseTrigger__LeftAssignment_0 )
                    // InternalGridGame.g:1648:2: rule__MouseTrigger__LeftAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MouseTrigger__LeftAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMouseTriggerAccess().getLeftAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1652:6: ( ( rule__MouseTrigger__Group_1__0 ) )
                    {
                    // InternalGridGame.g:1652:6: ( ( rule__MouseTrigger__Group_1__0 ) )
                    // InternalGridGame.g:1653:1: ( rule__MouseTrigger__Group_1__0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getGroup_1()); 
                    // InternalGridGame.g:1654:1: ( rule__MouseTrigger__Group_1__0 )
                    // InternalGridGame.g:1654:2: rule__MouseTrigger__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MouseTrigger__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMouseTriggerAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MouseTrigger__Alternatives"


    // $ANTLR start "rule__CellStateBehaviour__Alternatives"
    // InternalGridGame.g:1663:1: rule__CellStateBehaviour__Alternatives : ( ( ruleDirectBehaviour ) | ( ruleBehaviourReference ) );
    public final void rule__CellStateBehaviour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1667:1: ( ( ruleDirectBehaviour ) | ( ruleBehaviourReference ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11||LA12_0==46) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGridGame.g:1668:1: ( ruleDirectBehaviour )
                    {
                    // InternalGridGame.g:1668:1: ( ruleDirectBehaviour )
                    // InternalGridGame.g:1669:1: ruleDirectBehaviour
                    {
                     before(grammarAccess.getCellStateBehaviourAccess().getDirectBehaviourParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectBehaviour();

                    state._fsp--;

                     after(grammarAccess.getCellStateBehaviourAccess().getDirectBehaviourParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1674:6: ( ruleBehaviourReference )
                    {
                    // InternalGridGame.g:1674:6: ( ruleBehaviourReference )
                    // InternalGridGame.g:1675:1: ruleBehaviourReference
                    {
                     before(grammarAccess.getCellStateBehaviourAccess().getBehaviourReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBehaviourReference();

                    state._fsp--;

                     after(grammarAccess.getCellStateBehaviourAccess().getBehaviourReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__CellStateBehaviour__Alternatives"


    // $ANTLR start "rule__DirectBehaviour__Alternatives"
    // InternalGridGame.g:1685:1: rule__DirectBehaviour__Alternatives : ( ( ruleEndGameBehaviour ) | ( ( rule__DirectBehaviour__Group_1__0 ) ) );
    public final void rule__DirectBehaviour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1689:1: ( ( ruleEndGameBehaviour ) | ( ( rule__DirectBehaviour__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            else if ( (LA13_0==11) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGridGame.g:1690:1: ( ruleEndGameBehaviour )
                    {
                    // InternalGridGame.g:1690:1: ( ruleEndGameBehaviour )
                    // InternalGridGame.g:1691:1: ruleEndGameBehaviour
                    {
                     before(grammarAccess.getDirectBehaviourAccess().getEndGameBehaviourParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEndGameBehaviour();

                    state._fsp--;

                     after(grammarAccess.getDirectBehaviourAccess().getEndGameBehaviourParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1696:6: ( ( rule__DirectBehaviour__Group_1__0 ) )
                    {
                    // InternalGridGame.g:1696:6: ( ( rule__DirectBehaviour__Group_1__0 ) )
                    // InternalGridGame.g:1697:1: ( rule__DirectBehaviour__Group_1__0 )
                    {
                     before(grammarAccess.getDirectBehaviourAccess().getGroup_1()); 
                    // InternalGridGame.g:1698:1: ( rule__DirectBehaviour__Group_1__0 )
                    // InternalGridGame.g:1698:2: rule__DirectBehaviour__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectBehaviour__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectBehaviourAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DirectBehaviour__Alternatives"


    // $ANTLR start "rule__OptionSpecification__Alternatives"
    // InternalGridGame.g:1707:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleGenerationalContexts ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1711:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) | ( ruleGenerationalContexts ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case 53:
                {
                alt14=2;
                }
                break;
            case 54:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalGridGame.g:1712:1: ( ruleStartFieldDeclaration )
                    {
                    // InternalGridGame.g:1712:1: ( ruleStartFieldDeclaration )
                    // InternalGridGame.g:1713:1: ruleStartFieldDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStartFieldDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1718:6: ( ruleAllowRestartMenu )
                    {
                    // InternalGridGame.g:1718:6: ( ruleAllowRestartMenu )
                    // InternalGridGame.g:1719:1: ruleAllowRestartMenu
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAllowRestartMenu();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1724:6: ( ruleGenerationalContexts )
                    {
                    // InternalGridGame.g:1724:6: ( ruleGenerationalContexts )
                    // InternalGridGame.g:1725:1: ruleGenerationalContexts
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getGenerationalContextsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGenerationalContexts();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getGenerationalContextsParserRuleCall_2()); 

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


    // $ANTLR start "rule__FieldInitialisations__Alternatives"
    // InternalGridGame.g:1735:1: rule__FieldInitialisations__Alternatives : ( ( ruleLocalFieldInitialisations ) | ( ruleFieldInitialisationsRef ) );
    public final void rule__FieldInitialisations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1739:1: ( ( ruleLocalFieldInitialisations ) | ( ruleFieldInitialisationsRef ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==55) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    alt15=2;
                }
                else if ( (LA15_1==26) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGridGame.g:1740:1: ( ruleLocalFieldInitialisations )
                    {
                    // InternalGridGame.g:1740:1: ( ruleLocalFieldInitialisations )
                    // InternalGridGame.g:1741:1: ruleLocalFieldInitialisations
                    {
                     before(grammarAccess.getFieldInitialisationsAccess().getLocalFieldInitialisationsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocalFieldInitialisations();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationsAccess().getLocalFieldInitialisationsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1746:6: ( ruleFieldInitialisationsRef )
                    {
                    // InternalGridGame.g:1746:6: ( ruleFieldInitialisationsRef )
                    // InternalGridGame.g:1747:1: ruleFieldInitialisationsRef
                    {
                     before(grammarAccess.getFieldInitialisationsAccess().getFieldInitialisationsRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldInitialisationsRef();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationsAccess().getFieldInitialisationsRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__FieldInitialisations__Alternatives"


    // $ANTLR start "rule__FieldInitialisation__Alternatives"
    // InternalGridGame.g:1757:1: rule__FieldInitialisation__Alternatives : ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) );
    public final void rule__FieldInitialisation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1761:1: ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt16=1;
                }
                break;
            case 59:
                {
                alt16=2;
                }
                break;
            case 45:
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
                    // InternalGridGame.g:1762:1: ( ruleDefaultInitialisation )
                    {
                    // InternalGridGame.g:1762:1: ( ruleDefaultInitialisation )
                    // InternalGridGame.g:1763:1: ruleDefaultInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1768:6: ( ruleRandomInitialisation )
                    {
                    // InternalGridGame.g:1768:6: ( ruleRandomInitialisation )
                    // InternalGridGame.g:1769:1: ruleRandomInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRandomInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1774:6: ( ruleContextInitialisation )
                    {
                    // InternalGridGame.g:1774:6: ( ruleContextInitialisation )
                    // InternalGridGame.g:1775:1: ruleContextInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__RandomInitialisation__Alternatives_4"
    // InternalGridGame.g:1785:1: rule__RandomInitialisation__Alternatives_4 : ( ( ( rule__RandomInitialisation__CountAssignment_4_0 ) ) | ( ( rule__RandomInitialisation__VarAssignment_4_1 ) ) );
    public final void rule__RandomInitialisation__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1789:1: ( ( ( rule__RandomInitialisation__CountAssignment_4_0 ) ) | ( ( rule__RandomInitialisation__VarAssignment_4_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGridGame.g:1790:1: ( ( rule__RandomInitialisation__CountAssignment_4_0 ) )
                    {
                    // InternalGridGame.g:1790:1: ( ( rule__RandomInitialisation__CountAssignment_4_0 ) )
                    // InternalGridGame.g:1791:1: ( rule__RandomInitialisation__CountAssignment_4_0 )
                    {
                     before(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4_0()); 
                    // InternalGridGame.g:1792:1: ( rule__RandomInitialisation__CountAssignment_4_0 )
                    // InternalGridGame.g:1792:2: rule__RandomInitialisation__CountAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RandomInitialisation__CountAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1796:6: ( ( rule__RandomInitialisation__VarAssignment_4_1 ) )
                    {
                    // InternalGridGame.g:1796:6: ( ( rule__RandomInitialisation__VarAssignment_4_1 ) )
                    // InternalGridGame.g:1797:1: ( rule__RandomInitialisation__VarAssignment_4_1 )
                    {
                     before(grammarAccess.getRandomInitialisationAccess().getVarAssignment_4_1()); 
                    // InternalGridGame.g:1798:1: ( rule__RandomInitialisation__VarAssignment_4_1 )
                    // InternalGridGame.g:1798:2: rule__RandomInitialisation__VarAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RandomInitialisation__VarAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRandomInitialisationAccess().getVarAssignment_4_1()); 

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
    // $ANTLR end "rule__RandomInitialisation__Alternatives_4"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalGridGame.g:1807:1: rule__AtomicExpression__Alternatives : ( ( ruleFilterExpression ) | ( ruleStateFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) | ( ruleEmptyExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1811:1: ( ( ruleFilterExpression ) | ( ruleStateFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) | ( ruleEmptyExpression ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt18=1;
                }
                break;
            case 64:
                {
                alt18=2;
                }
                break;
            case 65:
                {
                alt18=3;
                }
                break;
            case 66:
                {
                alt18=4;
                }
                break;
            case 67:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGridGame.g:1812:1: ( ruleFilterExpression )
                    {
                    // InternalGridGame.g:1812:1: ( ruleFilterExpression )
                    // InternalGridGame.g:1813:1: ruleFilterExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1818:6: ( ruleStateFilterExpression )
                    {
                    // InternalGridGame.g:1818:6: ( ruleStateFilterExpression )
                    // InternalGridGame.g:1819:1: ruleStateFilterExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getStateFilterExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStateFilterExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getStateFilterExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1824:6: ( ruleCountExpression )
                    {
                    // InternalGridGame.g:1824:6: ( ruleCountExpression )
                    // InternalGridGame.g:1825:1: ruleCountExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCountExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGridGame.g:1830:6: ( ruleNotEmptyExpression )
                    {
                    // InternalGridGame.g:1830:6: ( ruleNotEmptyExpression )
                    // InternalGridGame.g:1831:1: ruleNotEmptyExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNotEmptyExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGridGame.g:1836:6: ( ruleEmptyExpression )
                    {
                    // InternalGridGame.g:1836:6: ( ruleEmptyExpression )
                    // InternalGridGame.g:1837:1: ruleEmptyExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getEmptyExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getEmptyExpressionParserRuleCall_4()); 

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


    // $ANTLR start "rule__CountExpression__OpAlternatives_4_0_0"
    // InternalGridGame.g:1847:1: rule__CountExpression__OpAlternatives_4_0_0 : ( ( '==' ) | ( '>' ) | ( '<' ) );
    public final void rule__CountExpression__OpAlternatives_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1851:1: ( ( '==' ) | ( '>' ) | ( '<' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt19=1;
                }
                break;
            case 23:
                {
                alt19=2;
                }
                break;
            case 24:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGridGame.g:1852:1: ( '==' )
                    {
                    // InternalGridGame.g:1852:1: ( '==' )
                    // InternalGridGame.g:1853:1: '=='
                    {
                     before(grammarAccess.getCountExpressionAccess().getOpEqualsSignEqualsSignKeyword_4_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCountExpressionAccess().getOpEqualsSignEqualsSignKeyword_4_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGridGame.g:1860:6: ( '>' )
                    {
                    // InternalGridGame.g:1860:6: ( '>' )
                    // InternalGridGame.g:1861:1: '>'
                    {
                     before(grammarAccess.getCountExpressionAccess().getOpGreaterThanSignKeyword_4_0_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCountExpressionAccess().getOpGreaterThanSignKeyword_4_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGridGame.g:1868:6: ( '<' )
                    {
                    // InternalGridGame.g:1868:6: ( '<' )
                    // InternalGridGame.g:1869:1: '<'
                    {
                     before(grammarAccess.getCountExpressionAccess().getOpLessThanSignKeyword_4_0_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCountExpressionAccess().getOpLessThanSignKeyword_4_0_0_2()); 

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
    // $ANTLR end "rule__CountExpression__OpAlternatives_4_0_0"


    // $ANTLR start "rule__GridGame__Group__0"
    // InternalGridGame.g:1883:1: rule__GridGame__Group__0 : rule__GridGame__Group__0__Impl rule__GridGame__Group__1 ;
    public final void rule__GridGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1887:1: ( rule__GridGame__Group__0__Impl rule__GridGame__Group__1 )
            // InternalGridGame.g:1888:2: rule__GridGame__Group__0__Impl rule__GridGame__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GridGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1895:1: rule__GridGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__GridGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1899:1: ( ( 'game' ) )
            // InternalGridGame.g:1900:1: ( 'game' )
            {
            // InternalGridGame.g:1900:1: ( 'game' )
            // InternalGridGame.g:1901:1: 'game'
            {
             before(grammarAccess.getGridGameAccess().getGameKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGridGame.g:1914:1: rule__GridGame__Group__1 : rule__GridGame__Group__1__Impl rule__GridGame__Group__2 ;
    public final void rule__GridGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1918:1: ( rule__GridGame__Group__1__Impl rule__GridGame__Group__2 )
            // InternalGridGame.g:1919:2: rule__GridGame__Group__1__Impl rule__GridGame__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GridGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1926:1: rule__GridGame__Group__1__Impl : ( ( rule__GridGame__NameAssignment_1 ) ) ;
    public final void rule__GridGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1930:1: ( ( ( rule__GridGame__NameAssignment_1 ) ) )
            // InternalGridGame.g:1931:1: ( ( rule__GridGame__NameAssignment_1 ) )
            {
            // InternalGridGame.g:1931:1: ( ( rule__GridGame__NameAssignment_1 ) )
            // InternalGridGame.g:1932:1: ( rule__GridGame__NameAssignment_1 )
            {
             before(grammarAccess.getGridGameAccess().getNameAssignment_1()); 
            // InternalGridGame.g:1933:1: ( rule__GridGame__NameAssignment_1 )
            // InternalGridGame.g:1933:2: rule__GridGame__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1943:1: rule__GridGame__Group__2 : rule__GridGame__Group__2__Impl rule__GridGame__Group__3 ;
    public final void rule__GridGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1947:1: ( rule__GridGame__Group__2__Impl rule__GridGame__Group__3 )
            // InternalGridGame.g:1948:2: rule__GridGame__Group__2__Impl rule__GridGame__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GridGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1955:1: rule__GridGame__Group__2__Impl : ( '{' ) ;
    public final void rule__GridGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1959:1: ( ( '{' ) )
            // InternalGridGame.g:1960:1: ( '{' )
            {
            // InternalGridGame.g:1960:1: ( '{' )
            // InternalGridGame.g:1961:1: '{'
            {
             before(grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:1974:1: rule__GridGame__Group__3 : rule__GridGame__Group__3__Impl rule__GridGame__Group__4 ;
    public final void rule__GridGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1978:1: ( rule__GridGame__Group__3__Impl rule__GridGame__Group__4 )
            // InternalGridGame.g:1979:2: rule__GridGame__Group__3__Impl rule__GridGame__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__GridGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:1986:1: rule__GridGame__Group__3__Impl : ( ( ( rule__GridGame__Alternatives_3 ) ) ( ( rule__GridGame__Alternatives_3 )* ) ) ;
    public final void rule__GridGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:1990:1: ( ( ( ( rule__GridGame__Alternatives_3 ) ) ( ( rule__GridGame__Alternatives_3 )* ) ) )
            // InternalGridGame.g:1991:1: ( ( ( rule__GridGame__Alternatives_3 ) ) ( ( rule__GridGame__Alternatives_3 )* ) )
            {
            // InternalGridGame.g:1991:1: ( ( ( rule__GridGame__Alternatives_3 ) ) ( ( rule__GridGame__Alternatives_3 )* ) )
            // InternalGridGame.g:1992:1: ( ( rule__GridGame__Alternatives_3 ) ) ( ( rule__GridGame__Alternatives_3 )* )
            {
            // InternalGridGame.g:1992:1: ( ( rule__GridGame__Alternatives_3 ) )
            // InternalGridGame.g:1993:1: ( rule__GridGame__Alternatives_3 )
            {
             before(grammarAccess.getGridGameAccess().getAlternatives_3()); 
            // InternalGridGame.g:1994:1: ( rule__GridGame__Alternatives_3 )
            // InternalGridGame.g:1994:2: rule__GridGame__Alternatives_3
            {
            pushFollow(FOLLOW_7);
            rule__GridGame__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getAlternatives_3()); 

            }

            // InternalGridGame.g:1997:1: ( ( rule__GridGame__Alternatives_3 )* )
            // InternalGridGame.g:1998:1: ( rule__GridGame__Alternatives_3 )*
            {
             before(grammarAccess.getGridGameAccess().getAlternatives_3()); 
            // InternalGridGame.g:1999:1: ( rule__GridGame__Alternatives_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28||(LA20_0>=34 && LA20_0<=35)||LA20_0==47||LA20_0==50||(LA20_0>=53 && LA20_0<=55)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGridGame.g:1999:2: rule__GridGame__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GridGame__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getGridGameAccess().getAlternatives_3()); 

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
    // InternalGridGame.g:2010:1: rule__GridGame__Group__4 : rule__GridGame__Group__4__Impl ;
    public final void rule__GridGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2014:1: ( rule__GridGame__Group__4__Impl )
            // InternalGridGame.g:2015:2: rule__GridGame__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GridGame__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalGridGame.g:2021:1: rule__GridGame__Group__4__Impl : ( '}' ) ;
    public final void rule__GridGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2025:1: ( ( '}' ) )
            // InternalGridGame.g:2026:1: ( '}' )
            {
            // InternalGridGame.g:2026:1: ( '}' )
            // InternalGridGame.g:2027:1: '}'
            {
             before(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__CellSpecification__Group__0"
    // InternalGridGame.g:2050:1: rule__CellSpecification__Group__0 : rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 ;
    public final void rule__CellSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2054:1: ( rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 )
            // InternalGridGame.g:2055:2: rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CellSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2062:1: rule__CellSpecification__Group__0__Impl : ( 'cell' ) ;
    public final void rule__CellSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2066:1: ( ( 'cell' ) )
            // InternalGridGame.g:2067:1: ( 'cell' )
            {
            // InternalGridGame.g:2067:1: ( 'cell' )
            // InternalGridGame.g:2068:1: 'cell'
            {
             before(grammarAccess.getCellSpecificationAccess().getCellKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGridGame.g:2081:1: rule__CellSpecification__Group__1 : rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 ;
    public final void rule__CellSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2085:1: ( rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 )
            // InternalGridGame.g:2086:2: rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CellSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2093:1: rule__CellSpecification__Group__1__Impl : ( ( rule__CellSpecification__NameAssignment_1 ) ) ;
    public final void rule__CellSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2097:1: ( ( ( rule__CellSpecification__NameAssignment_1 ) ) )
            // InternalGridGame.g:2098:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            {
            // InternalGridGame.g:2098:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            // InternalGridGame.g:2099:1: ( rule__CellSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getCellSpecificationAccess().getNameAssignment_1()); 
            // InternalGridGame.g:2100:1: ( rule__CellSpecification__NameAssignment_1 )
            // InternalGridGame.g:2100:2: rule__CellSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2110:1: rule__CellSpecification__Group__2 : rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 ;
    public final void rule__CellSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2114:1: ( rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 )
            // InternalGridGame.g:2115:2: rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CellSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2122:1: rule__CellSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__CellSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2126:1: ( ( '{' ) )
            // InternalGridGame.g:2127:1: ( '{' )
            {
            // InternalGridGame.g:2127:1: ( '{' )
            // InternalGridGame.g:2128:1: '{'
            {
             before(grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:2141:1: rule__CellSpecification__Group__3 : rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 ;
    public final void rule__CellSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2145:1: ( rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 )
            // InternalGridGame.g:2146:2: rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__CellSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2153:1: rule__CellSpecification__Group__3__Impl : ( ( rule__CellSpecification__MembersAssignment_3 )* ) ;
    public final void rule__CellSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2157:1: ( ( ( rule__CellSpecification__MembersAssignment_3 )* ) )
            // InternalGridGame.g:2158:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            {
            // InternalGridGame.g:2158:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            // InternalGridGame.g:2159:1: ( rule__CellSpecification__MembersAssignment_3 )*
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersAssignment_3()); 
            // InternalGridGame.g:2160:1: ( rule__CellSpecification__MembersAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29||LA21_0==32||LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGridGame.g:2160:2: rule__CellSpecification__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CellSpecification__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalGridGame.g:2170:1: rule__CellSpecification__Group__4 : rule__CellSpecification__Group__4__Impl ;
    public final void rule__CellSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2174:1: ( rule__CellSpecification__Group__4__Impl )
            // InternalGridGame.g:2175:2: rule__CellSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2181:1: rule__CellSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__CellSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2185:1: ( ( '}' ) )
            // InternalGridGame.g:2186:1: ( '}' )
            {
            // InternalGridGame.g:2186:1: ( '}' )
            // InternalGridGame.g:2187:1: '}'
            {
             before(grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGridGame.g:2210:1: rule__CellDisplaySpec__Group__0 : rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 ;
    public final void rule__CellDisplaySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2214:1: ( rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 )
            // InternalGridGame.g:2215:2: rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CellDisplaySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2222:1: rule__CellDisplaySpec__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplaySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2226:1: ( ( 'display' ) )
            // InternalGridGame.g:2227:1: ( 'display' )
            {
            // InternalGridGame.g:2227:1: ( 'display' )
            // InternalGridGame.g:2228:1: 'display'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGridGame.g:2241:1: rule__CellDisplaySpec__Group__1 : rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 ;
    public final void rule__CellDisplaySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2245:1: ( rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 )
            // InternalGridGame.g:2246:2: rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CellDisplaySpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2253:1: rule__CellDisplaySpec__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplaySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2257:1: ( ( '{' ) )
            // InternalGridGame.g:2258:1: ( '{' )
            {
            // InternalGridGame.g:2258:1: ( '{' )
            // InternalGridGame.g:2259:1: '{'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:2272:1: rule__CellDisplaySpec__Group__2 : rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 ;
    public final void rule__CellDisplaySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2276:1: ( rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 )
            // InternalGridGame.g:2277:2: rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CellDisplaySpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2284:1: rule__CellDisplaySpec__Group__2__Impl : ( 'as' ) ;
    public final void rule__CellDisplaySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2288:1: ( ( 'as' ) )
            // InternalGridGame.g:2289:1: ( 'as' )
            {
            // InternalGridGame.g:2289:1: ( 'as' )
            // InternalGridGame.g:2290:1: 'as'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGridGame.g:2303:1: rule__CellDisplaySpec__Group__3 : rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 ;
    public final void rule__CellDisplaySpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2307:1: ( rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 )
            // InternalGridGame.g:2308:2: rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__CellDisplaySpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2315:1: rule__CellDisplaySpec__Group__3__Impl : ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) ;
    public final void rule__CellDisplaySpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2319:1: ( ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) )
            // InternalGridGame.g:2320:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            {
            // InternalGridGame.g:2320:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            // InternalGridGame.g:2321:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAssignment_3()); 
            // InternalGridGame.g:2322:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            // InternalGridGame.g:2322:2: rule__CellDisplaySpec__Display_typeAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2332:1: rule__CellDisplaySpec__Group__4 : rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 ;
    public final void rule__CellDisplaySpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2336:1: ( rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 )
            // InternalGridGame.g:2337:2: rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CellDisplaySpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2344:1: rule__CellDisplaySpec__Group__4__Impl : ( ( rule__CellDisplaySpec__Alternatives_4 ) ) ;
    public final void rule__CellDisplaySpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2348:1: ( ( ( rule__CellDisplaySpec__Alternatives_4 ) ) )
            // InternalGridGame.g:2349:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            {
            // InternalGridGame.g:2349:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            // InternalGridGame.g:2350:1: ( rule__CellDisplaySpec__Alternatives_4 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAlternatives_4()); 
            // InternalGridGame.g:2351:1: ( rule__CellDisplaySpec__Alternatives_4 )
            // InternalGridGame.g:2351:2: rule__CellDisplaySpec__Alternatives_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2361:1: rule__CellDisplaySpec__Group__5 : rule__CellDisplaySpec__Group__5__Impl ;
    public final void rule__CellDisplaySpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2365:1: ( rule__CellDisplaySpec__Group__5__Impl )
            // InternalGridGame.g:2366:2: rule__CellDisplaySpec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2372:1: rule__CellDisplaySpec__Group__5__Impl : ( '}' ) ;
    public final void rule__CellDisplaySpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2376:1: ( ( '}' ) )
            // InternalGridGame.g:2377:1: ( '}' )
            {
            // InternalGridGame.g:2377:1: ( '}' )
            // InternalGridGame.g:2378:1: '}'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGridGame.g:2403:1: rule__CellDisplaySpec__Group_4_0__0 : rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 ;
    public final void rule__CellDisplaySpec__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2407:1: ( rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 )
            // InternalGridGame.g:2408:2: rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1
            {
            pushFollow(FOLLOW_13);
            rule__CellDisplaySpec__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2415:1: rule__CellDisplaySpec__Group_4_0__0__Impl : ( 'text' ) ;
    public final void rule__CellDisplaySpec__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2419:1: ( ( 'text' ) )
            // InternalGridGame.g:2420:1: ( 'text' )
            {
            // InternalGridGame.g:2420:1: ( 'text' )
            // InternalGridGame.g:2421:1: 'text'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGridGame.g:2434:1: rule__CellDisplaySpec__Group_4_0__1 : rule__CellDisplaySpec__Group_4_0__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2438:1: ( rule__CellDisplaySpec__Group_4_0__1__Impl )
            // InternalGridGame.g:2439:2: rule__CellDisplaySpec__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2445:1: rule__CellDisplaySpec__Group_4_0__1__Impl : ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2449:1: ( ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) )
            // InternalGridGame.g:2450:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            {
            // InternalGridGame.g:2450:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            // InternalGridGame.g:2451:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_4_0_1()); 
            // InternalGridGame.g:2452:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            // InternalGridGame.g:2452:2: rule__CellDisplaySpec__TextAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2466:1: rule__CellDisplaySpec__Group_4_1__0 : rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 ;
    public final void rule__CellDisplaySpec__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2470:1: ( rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 )
            // InternalGridGame.g:2471:2: rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__CellDisplaySpec__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2478:1: rule__CellDisplaySpec__Group_4_1__0__Impl : ( 'var' ) ;
    public final void rule__CellDisplaySpec__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2482:1: ( ( 'var' ) )
            // InternalGridGame.g:2483:1: ( 'var' )
            {
            // InternalGridGame.g:2483:1: ( 'var' )
            // InternalGridGame.g:2484:1: 'var'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGridGame.g:2497:1: rule__CellDisplaySpec__Group_4_1__1 : rule__CellDisplaySpec__Group_4_1__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2501:1: ( rule__CellDisplaySpec__Group_4_1__1__Impl )
            // InternalGridGame.g:2502:2: rule__CellDisplaySpec__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2508:1: rule__CellDisplaySpec__Group_4_1__1__Impl : ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2512:1: ( ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) )
            // InternalGridGame.g:2513:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            {
            // InternalGridGame.g:2513:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            // InternalGridGame.g:2514:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarAssignment_4_1_1()); 
            // InternalGridGame.g:2515:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            // InternalGridGame.g:2515:2: rule__CellDisplaySpec__VarAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__CellDisplaySpec__Group_4_2__0"
    // InternalGridGame.g:2529:1: rule__CellDisplaySpec__Group_4_2__0 : rule__CellDisplaySpec__Group_4_2__0__Impl rule__CellDisplaySpec__Group_4_2__1 ;
    public final void rule__CellDisplaySpec__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2533:1: ( rule__CellDisplaySpec__Group_4_2__0__Impl rule__CellDisplaySpec__Group_4_2__1 )
            // InternalGridGame.g:2534:2: rule__CellDisplaySpec__Group_4_2__0__Impl rule__CellDisplaySpec__Group_4_2__1
            {
            pushFollow(FOLLOW_14);
            rule__CellDisplaySpec__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group_4_2__0"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_2__0__Impl"
    // InternalGridGame.g:2541:1: rule__CellDisplaySpec__Group_4_2__0__Impl : ( 'color' ) ;
    public final void rule__CellDisplaySpec__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2545:1: ( ( 'color' ) )
            // InternalGridGame.g:2546:1: ( 'color' )
            {
            // InternalGridGame.g:2546:1: ( 'color' )
            // InternalGridGame.g:2547:1: 'color'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getColorKeyword_4_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getColorKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group_4_2__0__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_2__1"
    // InternalGridGame.g:2560:1: rule__CellDisplaySpec__Group_4_2__1 : rule__CellDisplaySpec__Group_4_2__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2564:1: ( rule__CellDisplaySpec__Group_4_2__1__Impl )
            // InternalGridGame.g:2565:2: rule__CellDisplaySpec__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group_4_2__1"


    // $ANTLR start "rule__CellDisplaySpec__Group_4_2__1__Impl"
    // InternalGridGame.g:2571:1: rule__CellDisplaySpec__Group_4_2__1__Impl : ( ( rule__CellDisplaySpec__ColorAssignment_4_2_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2575:1: ( ( ( rule__CellDisplaySpec__ColorAssignment_4_2_1 ) ) )
            // InternalGridGame.g:2576:1: ( ( rule__CellDisplaySpec__ColorAssignment_4_2_1 ) )
            {
            // InternalGridGame.g:2576:1: ( ( rule__CellDisplaySpec__ColorAssignment_4_2_1 ) )
            // InternalGridGame.g:2577:1: ( rule__CellDisplaySpec__ColorAssignment_4_2_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getColorAssignment_4_2_1()); 
            // InternalGridGame.g:2578:1: ( rule__CellDisplaySpec__ColorAssignment_4_2_1 )
            // InternalGridGame.g:2578:2: rule__CellDisplaySpec__ColorAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__ColorAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getColorAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__Group_4_2__1__Impl"


    // $ANTLR start "rule__CellVarSpec__Group__0"
    // InternalGridGame.g:2592:1: rule__CellVarSpec__Group__0 : rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 ;
    public final void rule__CellVarSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2596:1: ( rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 )
            // InternalGridGame.g:2597:2: rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CellVarSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2604:1: rule__CellVarSpec__Group__0__Impl : ( 'var' ) ;
    public final void rule__CellVarSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2608:1: ( ( 'var' ) )
            // InternalGridGame.g:2609:1: ( 'var' )
            {
            // InternalGridGame.g:2609:1: ( 'var' )
            // InternalGridGame.g:2610:1: 'var'
            {
             before(grammarAccess.getCellVarSpecAccess().getVarKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGridGame.g:2623:1: rule__CellVarSpec__Group__1 : rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 ;
    public final void rule__CellVarSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2627:1: ( rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 )
            // InternalGridGame.g:2628:2: rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CellVarSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2635:1: rule__CellVarSpec__Group__1__Impl : ( ( rule__CellVarSpec__TypeAssignment_1 ) ) ;
    public final void rule__CellVarSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2639:1: ( ( ( rule__CellVarSpec__TypeAssignment_1 ) ) )
            // InternalGridGame.g:2640:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            {
            // InternalGridGame.g:2640:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            // InternalGridGame.g:2641:1: ( rule__CellVarSpec__TypeAssignment_1 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAssignment_1()); 
            // InternalGridGame.g:2642:1: ( rule__CellVarSpec__TypeAssignment_1 )
            // InternalGridGame.g:2642:2: rule__CellVarSpec__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2652:1: rule__CellVarSpec__Group__2 : rule__CellVarSpec__Group__2__Impl ;
    public final void rule__CellVarSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2656:1: ( rule__CellVarSpec__Group__2__Impl )
            // InternalGridGame.g:2657:2: rule__CellVarSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2663:1: rule__CellVarSpec__Group__2__Impl : ( ( rule__CellVarSpec__NameAssignment_2 ) ) ;
    public final void rule__CellVarSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2667:1: ( ( ( rule__CellVarSpec__NameAssignment_2 ) ) )
            // InternalGridGame.g:2668:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            {
            // InternalGridGame.g:2668:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            // InternalGridGame.g:2669:1: ( rule__CellVarSpec__NameAssignment_2 )
            {
             before(grammarAccess.getCellVarSpecAccess().getNameAssignment_2()); 
            // InternalGridGame.g:2670:1: ( rule__CellVarSpec__NameAssignment_2 )
            // InternalGridGame.g:2670:2: rule__CellVarSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2686:1: rule__GlobalCellStateSpec__Group__0 : rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1 ;
    public final void rule__GlobalCellStateSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2690:1: ( rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1 )
            // InternalGridGame.g:2691:2: rule__GlobalCellStateSpec__Group__0__Impl rule__GlobalCellStateSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GlobalCellStateSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2698:1: rule__GlobalCellStateSpec__Group__0__Impl : ( 'states' ) ;
    public final void rule__GlobalCellStateSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2702:1: ( ( 'states' ) )
            // InternalGridGame.g:2703:1: ( 'states' )
            {
            // InternalGridGame.g:2703:1: ( 'states' )
            // InternalGridGame.g:2704:1: 'states'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGridGame.g:2717:1: rule__GlobalCellStateSpec__Group__1 : rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2 ;
    public final void rule__GlobalCellStateSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2721:1: ( rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2 )
            // InternalGridGame.g:2722:2: rule__GlobalCellStateSpec__Group__1__Impl rule__GlobalCellStateSpec__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__GlobalCellStateSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2729:1: rule__GlobalCellStateSpec__Group__1__Impl : ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2733:1: ( ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) ) )
            // InternalGridGame.g:2734:1: ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) )
            {
            // InternalGridGame.g:2734:1: ( ( rule__GlobalCellStateSpec__NameAssignment_1 ) )
            // InternalGridGame.g:2735:1: ( rule__GlobalCellStateSpec__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getNameAssignment_1()); 
            // InternalGridGame.g:2736:1: ( rule__GlobalCellStateSpec__NameAssignment_1 )
            // InternalGridGame.g:2736:2: rule__GlobalCellStateSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2746:1: rule__GlobalCellStateSpec__Group__2 : rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3 ;
    public final void rule__GlobalCellStateSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2750:1: ( rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3 )
            // InternalGridGame.g:2751:2: rule__GlobalCellStateSpec__Group__2__Impl rule__GlobalCellStateSpec__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__GlobalCellStateSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2758:1: rule__GlobalCellStateSpec__Group__2__Impl : ( ( rule__GlobalCellStateSpec__Group_2__0 )? ) ;
    public final void rule__GlobalCellStateSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2762:1: ( ( ( rule__GlobalCellStateSpec__Group_2__0 )? ) )
            // InternalGridGame.g:2763:1: ( ( rule__GlobalCellStateSpec__Group_2__0 )? )
            {
            // InternalGridGame.g:2763:1: ( ( rule__GlobalCellStateSpec__Group_2__0 )? )
            // InternalGridGame.g:2764:1: ( rule__GlobalCellStateSpec__Group_2__0 )?
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2()); 
            // InternalGridGame.g:2765:1: ( rule__GlobalCellStateSpec__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGridGame.g:2765:2: rule__GlobalCellStateSpec__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2775:1: rule__GlobalCellStateSpec__Group__3 : rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4 ;
    public final void rule__GlobalCellStateSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2779:1: ( rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4 )
            // InternalGridGame.g:2780:2: rule__GlobalCellStateSpec__Group__3__Impl rule__GlobalCellStateSpec__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__GlobalCellStateSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2787:1: rule__GlobalCellStateSpec__Group__3__Impl : ( '{' ) ;
    public final void rule__GlobalCellStateSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2791:1: ( ( '{' ) )
            // InternalGridGame.g:2792:1: ( '{' )
            {
            // InternalGridGame.g:2792:1: ( '{' )
            // InternalGridGame.g:2793:1: '{'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:2806:1: rule__GlobalCellStateSpec__Group__4 : rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5 ;
    public final void rule__GlobalCellStateSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2810:1: ( rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5 )
            // InternalGridGame.g:2811:2: rule__GlobalCellStateSpec__Group__4__Impl rule__GlobalCellStateSpec__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__GlobalCellStateSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2818:1: rule__GlobalCellStateSpec__Group__4__Impl : ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) ) ;
    public final void rule__GlobalCellStateSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2822:1: ( ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) ) )
            // InternalGridGame.g:2823:1: ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) )
            {
            // InternalGridGame.g:2823:1: ( ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* ) )
            // InternalGridGame.g:2824:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) ) ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* )
            {
            // InternalGridGame.g:2824:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 ) )
            // InternalGridGame.g:2825:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 
            // InternalGridGame.g:2826:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )
            // InternalGridGame.g:2826:2: rule__GlobalCellStateSpec__StatesAssignment_4
            {
            pushFollow(FOLLOW_18);
            rule__GlobalCellStateSpec__StatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 

            }

            // InternalGridGame.g:2829:1: ( ( rule__GlobalCellStateSpec__StatesAssignment_4 )* )
            // InternalGridGame.g:2830:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )*
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesAssignment_4()); 
            // InternalGridGame.g:2831:1: ( rule__GlobalCellStateSpec__StatesAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGridGame.g:2831:2: rule__GlobalCellStateSpec__StatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GlobalCellStateSpec__StatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalGridGame.g:2842:1: rule__GlobalCellStateSpec__Group__5 : rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6 ;
    public final void rule__GlobalCellStateSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2846:1: ( rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6 )
            // InternalGridGame.g:2847:2: rule__GlobalCellStateSpec__Group__5__Impl rule__GlobalCellStateSpec__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__GlobalCellStateSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2854:1: rule__GlobalCellStateSpec__Group__5__Impl : ( 'start' ) ;
    public final void rule__GlobalCellStateSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2858:1: ( ( 'start' ) )
            // InternalGridGame.g:2859:1: ( 'start' )
            {
            // InternalGridGame.g:2859:1: ( 'start' )
            // InternalGridGame.g:2860:1: 'start'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGridGame.g:2873:1: rule__GlobalCellStateSpec__Group__6 : rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7 ;
    public final void rule__GlobalCellStateSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2877:1: ( rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7 )
            // InternalGridGame.g:2878:2: rule__GlobalCellStateSpec__Group__6__Impl rule__GlobalCellStateSpec__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__GlobalCellStateSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2885:1: rule__GlobalCellStateSpec__Group__6__Impl : ( '=' ) ;
    public final void rule__GlobalCellStateSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2889:1: ( ( '=' ) )
            // InternalGridGame.g:2890:1: ( '=' )
            {
            // InternalGridGame.g:2890:1: ( '=' )
            // InternalGridGame.g:2891:1: '='
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getEqualsSignKeyword_6()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGridGame.g:2904:1: rule__GlobalCellStateSpec__Group__7 : rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8 ;
    public final void rule__GlobalCellStateSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2908:1: ( rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8 )
            // InternalGridGame.g:2909:2: rule__GlobalCellStateSpec__Group__7__Impl rule__GlobalCellStateSpec__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__GlobalCellStateSpec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2916:1: rule__GlobalCellStateSpec__Group__7__Impl : ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) ) ;
    public final void rule__GlobalCellStateSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2920:1: ( ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) ) )
            // InternalGridGame.g:2921:1: ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) )
            {
            // InternalGridGame.g:2921:1: ( ( rule__GlobalCellStateSpec__StartAssignment_7 ) )
            // InternalGridGame.g:2922:1: ( rule__GlobalCellStateSpec__StartAssignment_7 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartAssignment_7()); 
            // InternalGridGame.g:2923:1: ( rule__GlobalCellStateSpec__StartAssignment_7 )
            // InternalGridGame.g:2923:2: rule__GlobalCellStateSpec__StartAssignment_7
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2933:1: rule__GlobalCellStateSpec__Group__8 : rule__GlobalCellStateSpec__Group__8__Impl ;
    public final void rule__GlobalCellStateSpec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2937:1: ( rule__GlobalCellStateSpec__Group__8__Impl )
            // InternalGridGame.g:2938:2: rule__GlobalCellStateSpec__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2944:1: rule__GlobalCellStateSpec__Group__8__Impl : ( '}' ) ;
    public final void rule__GlobalCellStateSpec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2948:1: ( ( '}' ) )
            // InternalGridGame.g:2949:1: ( '}' )
            {
            // InternalGridGame.g:2949:1: ( '}' )
            // InternalGridGame.g:2950:1: '}'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGridGame.g:2981:1: rule__GlobalCellStateSpec__Group_2__0 : rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1 ;
    public final void rule__GlobalCellStateSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2985:1: ( rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1 )
            // InternalGridGame.g:2986:2: rule__GlobalCellStateSpec__Group_2__0__Impl rule__GlobalCellStateSpec__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GlobalCellStateSpec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:2993:1: rule__GlobalCellStateSpec__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GlobalCellStateSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:2997:1: ( ( '(' ) )
            // InternalGridGame.g:2998:1: ( '(' )
            {
            // InternalGridGame.g:2998:1: ( '(' )
            // InternalGridGame.g:2999:1: '('
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGridGame.g:3012:1: rule__GlobalCellStateSpec__Group_2__1 : rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2 ;
    public final void rule__GlobalCellStateSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3016:1: ( rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2 )
            // InternalGridGame.g:3017:2: rule__GlobalCellStateSpec__Group_2__1__Impl rule__GlobalCellStateSpec__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__GlobalCellStateSpec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3024:1: rule__GlobalCellStateSpec__Group_2__1__Impl : ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3028:1: ( ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) ) )
            // InternalGridGame.g:3029:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) )
            {
            // InternalGridGame.g:3029:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 ) )
            // InternalGridGame.g:3030:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_1()); 
            // InternalGridGame.g:3031:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_1 )
            // InternalGridGame.g:3031:2: rule__GlobalCellStateSpec__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3041:1: rule__GlobalCellStateSpec__Group_2__2 : rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3 ;
    public final void rule__GlobalCellStateSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3045:1: ( rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3 )
            // InternalGridGame.g:3046:2: rule__GlobalCellStateSpec__Group_2__2__Impl rule__GlobalCellStateSpec__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__GlobalCellStateSpec__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3053:1: rule__GlobalCellStateSpec__Group_2__2__Impl : ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* ) ;
    public final void rule__GlobalCellStateSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3057:1: ( ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* ) )
            // InternalGridGame.g:3058:1: ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* )
            {
            // InternalGridGame.g:3058:1: ( ( rule__GlobalCellStateSpec__Group_2_2__0 )* )
            // InternalGridGame.g:3059:1: ( rule__GlobalCellStateSpec__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getGroup_2_2()); 
            // InternalGridGame.g:3060:1: ( rule__GlobalCellStateSpec__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGridGame.g:3060:2: rule__GlobalCellStateSpec__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__GlobalCellStateSpec__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalGridGame.g:3070:1: rule__GlobalCellStateSpec__Group_2__3 : rule__GlobalCellStateSpec__Group_2__3__Impl ;
    public final void rule__GlobalCellStateSpec__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3074:1: ( rule__GlobalCellStateSpec__Group_2__3__Impl )
            // InternalGridGame.g:3075:2: rule__GlobalCellStateSpec__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3081:1: rule__GlobalCellStateSpec__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GlobalCellStateSpec__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3085:1: ( ( ')' ) )
            // InternalGridGame.g:3086:1: ( ')' )
            {
            // InternalGridGame.g:3086:1: ( ')' )
            // InternalGridGame.g:3087:1: ')'
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getRightParenthesisKeyword_2_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGridGame.g:3108:1: rule__GlobalCellStateSpec__Group_2_2__0 : rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1 ;
    public final void rule__GlobalCellStateSpec__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3112:1: ( rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1 )
            // InternalGridGame.g:3113:2: rule__GlobalCellStateSpec__Group_2_2__0__Impl rule__GlobalCellStateSpec__Group_2_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GlobalCellStateSpec__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3120:1: rule__GlobalCellStateSpec__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GlobalCellStateSpec__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3124:1: ( ( ',' ) )
            // InternalGridGame.g:3125:1: ( ',' )
            {
            // InternalGridGame.g:3125:1: ( ',' )
            // InternalGridGame.g:3126:1: ','
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getCommaKeyword_2_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGridGame.g:3139:1: rule__GlobalCellStateSpec__Group_2_2__1 : rule__GlobalCellStateSpec__Group_2_2__1__Impl ;
    public final void rule__GlobalCellStateSpec__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3143:1: ( rule__GlobalCellStateSpec__Group_2_2__1__Impl )
            // InternalGridGame.g:3144:2: rule__GlobalCellStateSpec__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3150:1: rule__GlobalCellStateSpec__Group_2_2__1__Impl : ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalCellStateSpec__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3154:1: ( ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) ) )
            // InternalGridGame.g:3155:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) )
            {
            // InternalGridGame.g:3155:1: ( ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 ) )
            // InternalGridGame.g:3156:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsAssignment_2_2_1()); 
            // InternalGridGame.g:3157:1: ( rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 )
            // InternalGridGame.g:3157:2: rule__GlobalCellStateSpec__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__ParamSpec__Group__0"
    // InternalGridGame.g:3171:1: rule__ParamSpec__Group__0 : rule__ParamSpec__Group__0__Impl rule__ParamSpec__Group__1 ;
    public final void rule__ParamSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3175:1: ( rule__ParamSpec__Group__0__Impl rule__ParamSpec__Group__1 )
            // InternalGridGame.g:3176:2: rule__ParamSpec__Group__0__Impl rule__ParamSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParamSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__0"


    // $ANTLR start "rule__ParamSpec__Group__0__Impl"
    // InternalGridGame.g:3183:1: rule__ParamSpec__Group__0__Impl : ( ( rule__ParamSpec__TypeAssignment_0 ) ) ;
    public final void rule__ParamSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3187:1: ( ( ( rule__ParamSpec__TypeAssignment_0 ) ) )
            // InternalGridGame.g:3188:1: ( ( rule__ParamSpec__TypeAssignment_0 ) )
            {
            // InternalGridGame.g:3188:1: ( ( rule__ParamSpec__TypeAssignment_0 ) )
            // InternalGridGame.g:3189:1: ( rule__ParamSpec__TypeAssignment_0 )
            {
             before(grammarAccess.getParamSpecAccess().getTypeAssignment_0()); 
            // InternalGridGame.g:3190:1: ( rule__ParamSpec__TypeAssignment_0 )
            // InternalGridGame.g:3190:2: rule__ParamSpec__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__0__Impl"


    // $ANTLR start "rule__ParamSpec__Group__1"
    // InternalGridGame.g:3200:1: rule__ParamSpec__Group__1 : rule__ParamSpec__Group__1__Impl ;
    public final void rule__ParamSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3204:1: ( rule__ParamSpec__Group__1__Impl )
            // InternalGridGame.g:3205:2: rule__ParamSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__1"


    // $ANTLR start "rule__ParamSpec__Group__1__Impl"
    // InternalGridGame.g:3211:1: rule__ParamSpec__Group__1__Impl : ( ( rule__ParamSpec__NameAssignment_1 ) ) ;
    public final void rule__ParamSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3215:1: ( ( ( rule__ParamSpec__NameAssignment_1 ) ) )
            // InternalGridGame.g:3216:1: ( ( rule__ParamSpec__NameAssignment_1 ) )
            {
            // InternalGridGame.g:3216:1: ( ( rule__ParamSpec__NameAssignment_1 ) )
            // InternalGridGame.g:3217:1: ( rule__ParamSpec__NameAssignment_1 )
            {
             before(grammarAccess.getParamSpecAccess().getNameAssignment_1()); 
            // InternalGridGame.g:3218:1: ( rule__ParamSpec__NameAssignment_1 )
            // InternalGridGame.g:3218:2: rule__ParamSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__Group__1__Impl"


    // $ANTLR start "rule__LocalCellStateSpec__Group__0"
    // InternalGridGame.g:3232:1: rule__LocalCellStateSpec__Group__0 : rule__LocalCellStateSpec__Group__0__Impl rule__LocalCellStateSpec__Group__1 ;
    public final void rule__LocalCellStateSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3236:1: ( rule__LocalCellStateSpec__Group__0__Impl rule__LocalCellStateSpec__Group__1 )
            // InternalGridGame.g:3237:2: rule__LocalCellStateSpec__Group__0__Impl rule__LocalCellStateSpec__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LocalCellStateSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3244:1: rule__LocalCellStateSpec__Group__0__Impl : ( 'states' ) ;
    public final void rule__LocalCellStateSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3248:1: ( ( 'states' ) )
            // InternalGridGame.g:3249:1: ( 'states' )
            {
            // InternalGridGame.g:3249:1: ( 'states' )
            // InternalGridGame.g:3250:1: 'states'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGridGame.g:3263:1: rule__LocalCellStateSpec__Group__1 : rule__LocalCellStateSpec__Group__1__Impl rule__LocalCellStateSpec__Group__2 ;
    public final void rule__LocalCellStateSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3267:1: ( rule__LocalCellStateSpec__Group__1__Impl rule__LocalCellStateSpec__Group__2 )
            // InternalGridGame.g:3268:2: rule__LocalCellStateSpec__Group__1__Impl rule__LocalCellStateSpec__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LocalCellStateSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3275:1: rule__LocalCellStateSpec__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalCellStateSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3279:1: ( ( '{' ) )
            // InternalGridGame.g:3280:1: ( '{' )
            {
            // InternalGridGame.g:3280:1: ( '{' )
            // InternalGridGame.g:3281:1: '{'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:3294:1: rule__LocalCellStateSpec__Group__2 : rule__LocalCellStateSpec__Group__2__Impl rule__LocalCellStateSpec__Group__3 ;
    public final void rule__LocalCellStateSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3298:1: ( rule__LocalCellStateSpec__Group__2__Impl rule__LocalCellStateSpec__Group__3 )
            // InternalGridGame.g:3299:2: rule__LocalCellStateSpec__Group__2__Impl rule__LocalCellStateSpec__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__LocalCellStateSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3306:1: rule__LocalCellStateSpec__Group__2__Impl : ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) ) ;
    public final void rule__LocalCellStateSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3310:1: ( ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) ) )
            // InternalGridGame.g:3311:1: ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) )
            {
            // InternalGridGame.g:3311:1: ( ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* ) )
            // InternalGridGame.g:3312:1: ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) ) ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* )
            {
            // InternalGridGame.g:3312:1: ( ( rule__LocalCellStateSpec__StatesAssignment_2 ) )
            // InternalGridGame.g:3313:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesAssignment_2()); 
            // InternalGridGame.g:3314:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )
            // InternalGridGame.g:3314:2: rule__LocalCellStateSpec__StatesAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__LocalCellStateSpec__StatesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalCellStateSpecAccess().getStatesAssignment_2()); 

            }

            // InternalGridGame.g:3317:1: ( ( rule__LocalCellStateSpec__StatesAssignment_2 )* )
            // InternalGridGame.g:3318:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )*
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesAssignment_2()); 
            // InternalGridGame.g:3319:1: ( rule__LocalCellStateSpec__StatesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGridGame.g:3319:2: rule__LocalCellStateSpec__StatesAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__LocalCellStateSpec__StatesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalGridGame.g:3330:1: rule__LocalCellStateSpec__Group__3 : rule__LocalCellStateSpec__Group__3__Impl rule__LocalCellStateSpec__Group__4 ;
    public final void rule__LocalCellStateSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3334:1: ( rule__LocalCellStateSpec__Group__3__Impl rule__LocalCellStateSpec__Group__4 )
            // InternalGridGame.g:3335:2: rule__LocalCellStateSpec__Group__3__Impl rule__LocalCellStateSpec__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__LocalCellStateSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3342:1: rule__LocalCellStateSpec__Group__3__Impl : ( 'start' ) ;
    public final void rule__LocalCellStateSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3346:1: ( ( 'start' ) )
            // InternalGridGame.g:3347:1: ( 'start' )
            {
            // InternalGridGame.g:3347:1: ( 'start' )
            // InternalGridGame.g:3348:1: 'start'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGridGame.g:3361:1: rule__LocalCellStateSpec__Group__4 : rule__LocalCellStateSpec__Group__4__Impl rule__LocalCellStateSpec__Group__5 ;
    public final void rule__LocalCellStateSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3365:1: ( rule__LocalCellStateSpec__Group__4__Impl rule__LocalCellStateSpec__Group__5 )
            // InternalGridGame.g:3366:2: rule__LocalCellStateSpec__Group__4__Impl rule__LocalCellStateSpec__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__LocalCellStateSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3373:1: rule__LocalCellStateSpec__Group__4__Impl : ( '=' ) ;
    public final void rule__LocalCellStateSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3377:1: ( ( '=' ) )
            // InternalGridGame.g:3378:1: ( '=' )
            {
            // InternalGridGame.g:3378:1: ( '=' )
            // InternalGridGame.g:3379:1: '='
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getEqualsSignKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGridGame.g:3392:1: rule__LocalCellStateSpec__Group__5 : rule__LocalCellStateSpec__Group__5__Impl rule__LocalCellStateSpec__Group__6 ;
    public final void rule__LocalCellStateSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3396:1: ( rule__LocalCellStateSpec__Group__5__Impl rule__LocalCellStateSpec__Group__6 )
            // InternalGridGame.g:3397:2: rule__LocalCellStateSpec__Group__5__Impl rule__LocalCellStateSpec__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__LocalCellStateSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3404:1: rule__LocalCellStateSpec__Group__5__Impl : ( ( rule__LocalCellStateSpec__StartAssignment_5 ) ) ;
    public final void rule__LocalCellStateSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3408:1: ( ( ( rule__LocalCellStateSpec__StartAssignment_5 ) ) )
            // InternalGridGame.g:3409:1: ( ( rule__LocalCellStateSpec__StartAssignment_5 ) )
            {
            // InternalGridGame.g:3409:1: ( ( rule__LocalCellStateSpec__StartAssignment_5 ) )
            // InternalGridGame.g:3410:1: ( rule__LocalCellStateSpec__StartAssignment_5 )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartAssignment_5()); 
            // InternalGridGame.g:3411:1: ( rule__LocalCellStateSpec__StartAssignment_5 )
            // InternalGridGame.g:3411:2: rule__LocalCellStateSpec__StartAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3421:1: rule__LocalCellStateSpec__Group__6 : rule__LocalCellStateSpec__Group__6__Impl ;
    public final void rule__LocalCellStateSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3425:1: ( rule__LocalCellStateSpec__Group__6__Impl )
            // InternalGridGame.g:3426:2: rule__LocalCellStateSpec__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3432:1: rule__LocalCellStateSpec__Group__6__Impl : ( '}' ) ;
    public final void rule__LocalCellStateSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3436:1: ( ( '}' ) )
            // InternalGridGame.g:3437:1: ( '}' )
            {
            // InternalGridGame.g:3437:1: ( '}' )
            // InternalGridGame.g:3438:1: '}'
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGridGame.g:3465:1: rule__CellStateSpecReference__Group__0 : rule__CellStateSpecReference__Group__0__Impl rule__CellStateSpecReference__Group__1 ;
    public final void rule__CellStateSpecReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3469:1: ( rule__CellStateSpecReference__Group__0__Impl rule__CellStateSpecReference__Group__1 )
            // InternalGridGame.g:3470:2: rule__CellStateSpecReference__Group__0__Impl rule__CellStateSpecReference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CellStateSpecReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3477:1: rule__CellStateSpecReference__Group__0__Impl : ( 'states' ) ;
    public final void rule__CellStateSpecReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3481:1: ( ( 'states' ) )
            // InternalGridGame.g:3482:1: ( 'states' )
            {
            // InternalGridGame.g:3482:1: ( 'states' )
            // InternalGridGame.g:3483:1: 'states'
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStatesKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGridGame.g:3496:1: rule__CellStateSpecReference__Group__1 : rule__CellStateSpecReference__Group__1__Impl rule__CellStateSpecReference__Group__2 ;
    public final void rule__CellStateSpecReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3500:1: ( rule__CellStateSpecReference__Group__1__Impl rule__CellStateSpecReference__Group__2 )
            // InternalGridGame.g:3501:2: rule__CellStateSpecReference__Group__1__Impl rule__CellStateSpecReference__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CellStateSpecReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3508:1: rule__CellStateSpecReference__Group__1__Impl : ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) ) ;
    public final void rule__CellStateSpecReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3512:1: ( ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) ) )
            // InternalGridGame.g:3513:1: ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) )
            {
            // InternalGridGame.g:3513:1: ( ( rule__CellStateSpecReference__StateSpecAssignment_1 ) )
            // InternalGridGame.g:3514:1: ( rule__CellStateSpecReference__StateSpecAssignment_1 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecAssignment_1()); 
            // InternalGridGame.g:3515:1: ( rule__CellStateSpecReference__StateSpecAssignment_1 )
            // InternalGridGame.g:3515:2: rule__CellStateSpecReference__StateSpecAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3525:1: rule__CellStateSpecReference__Group__2 : rule__CellStateSpecReference__Group__2__Impl ;
    public final void rule__CellStateSpecReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3529:1: ( rule__CellStateSpecReference__Group__2__Impl )
            // InternalGridGame.g:3530:2: rule__CellStateSpecReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3536:1: rule__CellStateSpecReference__Group__2__Impl : ( ( rule__CellStateSpecReference__Group_2__0 )? ) ;
    public final void rule__CellStateSpecReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3540:1: ( ( ( rule__CellStateSpecReference__Group_2__0 )? ) )
            // InternalGridGame.g:3541:1: ( ( rule__CellStateSpecReference__Group_2__0 )? )
            {
            // InternalGridGame.g:3541:1: ( ( rule__CellStateSpecReference__Group_2__0 )? )
            // InternalGridGame.g:3542:1: ( rule__CellStateSpecReference__Group_2__0 )?
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getGroup_2()); 
            // InternalGridGame.g:3543:1: ( rule__CellStateSpecReference__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGridGame.g:3543:2: rule__CellStateSpecReference__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3559:1: rule__CellStateSpecReference__Group_2__0 : rule__CellStateSpecReference__Group_2__0__Impl rule__CellStateSpecReference__Group_2__1 ;
    public final void rule__CellStateSpecReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3563:1: ( rule__CellStateSpecReference__Group_2__0__Impl rule__CellStateSpecReference__Group_2__1 )
            // InternalGridGame.g:3564:2: rule__CellStateSpecReference__Group_2__0__Impl rule__CellStateSpecReference__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__CellStateSpecReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3571:1: rule__CellStateSpecReference__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CellStateSpecReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3575:1: ( ( '(' ) )
            // InternalGridGame.g:3576:1: ( '(' )
            {
            // InternalGridGame.g:3576:1: ( '(' )
            // InternalGridGame.g:3577:1: '('
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGridGame.g:3590:1: rule__CellStateSpecReference__Group_2__1 : rule__CellStateSpecReference__Group_2__1__Impl rule__CellStateSpecReference__Group_2__2 ;
    public final void rule__CellStateSpecReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3594:1: ( rule__CellStateSpecReference__Group_2__1__Impl rule__CellStateSpecReference__Group_2__2 )
            // InternalGridGame.g:3595:2: rule__CellStateSpecReference__Group_2__1__Impl rule__CellStateSpecReference__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__CellStateSpecReference__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3602:1: rule__CellStateSpecReference__Group_2__1__Impl : ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) ) ;
    public final void rule__CellStateSpecReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3606:1: ( ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) ) )
            // InternalGridGame.g:3607:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) )
            {
            // InternalGridGame.g:3607:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_1 ) )
            // InternalGridGame.g:3608:1: ( rule__CellStateSpecReference__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsAssignment_2_1()); 
            // InternalGridGame.g:3609:1: ( rule__CellStateSpecReference__ParamsAssignment_2_1 )
            // InternalGridGame.g:3609:2: rule__CellStateSpecReference__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3619:1: rule__CellStateSpecReference__Group_2__2 : rule__CellStateSpecReference__Group_2__2__Impl rule__CellStateSpecReference__Group_2__3 ;
    public final void rule__CellStateSpecReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3623:1: ( rule__CellStateSpecReference__Group_2__2__Impl rule__CellStateSpecReference__Group_2__3 )
            // InternalGridGame.g:3624:2: rule__CellStateSpecReference__Group_2__2__Impl rule__CellStateSpecReference__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__CellStateSpecReference__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3631:1: rule__CellStateSpecReference__Group_2__2__Impl : ( ( rule__CellStateSpecReference__Group_2_2__0 )* ) ;
    public final void rule__CellStateSpecReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3635:1: ( ( ( rule__CellStateSpecReference__Group_2_2__0 )* ) )
            // InternalGridGame.g:3636:1: ( ( rule__CellStateSpecReference__Group_2_2__0 )* )
            {
            // InternalGridGame.g:3636:1: ( ( rule__CellStateSpecReference__Group_2_2__0 )* )
            // InternalGridGame.g:3637:1: ( rule__CellStateSpecReference__Group_2_2__0 )*
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getGroup_2_2()); 
            // InternalGridGame.g:3638:1: ( rule__CellStateSpecReference__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGridGame.g:3638:2: rule__CellStateSpecReference__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__CellStateSpecReference__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalGridGame.g:3648:1: rule__CellStateSpecReference__Group_2__3 : rule__CellStateSpecReference__Group_2__3__Impl ;
    public final void rule__CellStateSpecReference__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3652:1: ( rule__CellStateSpecReference__Group_2__3__Impl )
            // InternalGridGame.g:3653:2: rule__CellStateSpecReference__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3659:1: rule__CellStateSpecReference__Group_2__3__Impl : ( ')' ) ;
    public final void rule__CellStateSpecReference__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3663:1: ( ( ')' ) )
            // InternalGridGame.g:3664:1: ( ')' )
            {
            // InternalGridGame.g:3664:1: ( ')' )
            // InternalGridGame.g:3665:1: ')'
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getRightParenthesisKeyword_2_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGridGame.g:3686:1: rule__CellStateSpecReference__Group_2_2__0 : rule__CellStateSpecReference__Group_2_2__0__Impl rule__CellStateSpecReference__Group_2_2__1 ;
    public final void rule__CellStateSpecReference__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3690:1: ( rule__CellStateSpecReference__Group_2_2__0__Impl rule__CellStateSpecReference__Group_2_2__1 )
            // InternalGridGame.g:3691:2: rule__CellStateSpecReference__Group_2_2__0__Impl rule__CellStateSpecReference__Group_2_2__1
            {
            pushFollow(FOLLOW_24);
            rule__CellStateSpecReference__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3698:1: rule__CellStateSpecReference__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__CellStateSpecReference__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3702:1: ( ( ',' ) )
            // InternalGridGame.g:3703:1: ( ',' )
            {
            // InternalGridGame.g:3703:1: ( ',' )
            // InternalGridGame.g:3704:1: ','
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getCommaKeyword_2_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalGridGame.g:3717:1: rule__CellStateSpecReference__Group_2_2__1 : rule__CellStateSpecReference__Group_2_2__1__Impl ;
    public final void rule__CellStateSpecReference__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3721:1: ( rule__CellStateSpecReference__Group_2_2__1__Impl )
            // InternalGridGame.g:3722:2: rule__CellStateSpecReference__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3728:1: rule__CellStateSpecReference__Group_2_2__1__Impl : ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__CellStateSpecReference__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3732:1: ( ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) ) )
            // InternalGridGame.g:3733:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) )
            {
            // InternalGridGame.g:3733:1: ( ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 ) )
            // InternalGridGame.g:3734:1: ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsAssignment_2_2_1()); 
            // InternalGridGame.g:3735:1: ( rule__CellStateSpecReference__ParamsAssignment_2_2_1 )
            // InternalGridGame.g:3735:2: rule__CellStateSpecReference__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3749:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3753:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalGridGame.g:3754:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CellState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3761:1: rule__CellState__Group__0__Impl : ( ( rule__CellState__NameAssignment_0 ) ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3765:1: ( ( ( rule__CellState__NameAssignment_0 ) ) )
            // InternalGridGame.g:3766:1: ( ( rule__CellState__NameAssignment_0 ) )
            {
            // InternalGridGame.g:3766:1: ( ( rule__CellState__NameAssignment_0 ) )
            // InternalGridGame.g:3767:1: ( rule__CellState__NameAssignment_0 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_0()); 
            // InternalGridGame.g:3768:1: ( rule__CellState__NameAssignment_0 )
            // InternalGridGame.g:3768:2: rule__CellState__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3778:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl rule__CellState__Group__2 ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3782:1: ( rule__CellState__Group__1__Impl rule__CellState__Group__2 )
            // InternalGridGame.g:3783:2: rule__CellState__Group__1__Impl rule__CellState__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__CellState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3790:1: rule__CellState__Group__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3794:1: ( ( '{' ) )
            // InternalGridGame.g:3795:1: ( '{' )
            {
            // InternalGridGame.g:3795:1: ( '{' )
            // InternalGridGame.g:3796:1: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:3809:1: rule__CellState__Group__2 : rule__CellState__Group__2__Impl rule__CellState__Group__3 ;
    public final void rule__CellState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3813:1: ( rule__CellState__Group__2__Impl rule__CellState__Group__3 )
            // InternalGridGame.g:3814:2: rule__CellState__Group__2__Impl rule__CellState__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__CellState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3821:1: rule__CellState__Group__2__Impl : ( ( rule__CellState__DisplayAssignment_2 ) ) ;
    public final void rule__CellState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3825:1: ( ( ( rule__CellState__DisplayAssignment_2 ) ) )
            // InternalGridGame.g:3826:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            {
            // InternalGridGame.g:3826:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            // InternalGridGame.g:3827:1: ( rule__CellState__DisplayAssignment_2 )
            {
             before(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 
            // InternalGridGame.g:3828:1: ( rule__CellState__DisplayAssignment_2 )
            // InternalGridGame.g:3828:2: rule__CellState__DisplayAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3838:1: rule__CellState__Group__3 : rule__CellState__Group__3__Impl rule__CellState__Group__4 ;
    public final void rule__CellState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3842:1: ( rule__CellState__Group__3__Impl rule__CellState__Group__4 )
            // InternalGridGame.g:3843:2: rule__CellState__Group__3__Impl rule__CellState__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__CellState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3850:1: rule__CellState__Group__3__Impl : ( ( rule__CellState__Group_3__0 )? ) ;
    public final void rule__CellState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3854:1: ( ( ( rule__CellState__Group_3__0 )? ) )
            // InternalGridGame.g:3855:1: ( ( rule__CellState__Group_3__0 )? )
            {
            // InternalGridGame.g:3855:1: ( ( rule__CellState__Group_3__0 )? )
            // InternalGridGame.g:3856:1: ( rule__CellState__Group_3__0 )?
            {
             before(grammarAccess.getCellStateAccess().getGroup_3()); 
            // InternalGridGame.g:3857:1: ( rule__CellState__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGridGame.g:3857:2: rule__CellState__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3867:1: rule__CellState__Group__4 : rule__CellState__Group__4__Impl rule__CellState__Group__5 ;
    public final void rule__CellState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3871:1: ( rule__CellState__Group__4__Impl rule__CellState__Group__5 )
            // InternalGridGame.g:3872:2: rule__CellState__Group__4__Impl rule__CellState__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__CellState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group__5();

            state._fsp--;


            }

        }
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
    // InternalGridGame.g:3879:1: rule__CellState__Group__4__Impl : ( ( rule__CellState__Group_4__0 )? ) ;
    public final void rule__CellState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3883:1: ( ( ( rule__CellState__Group_4__0 )? ) )
            // InternalGridGame.g:3884:1: ( ( rule__CellState__Group_4__0 )? )
            {
            // InternalGridGame.g:3884:1: ( ( rule__CellState__Group_4__0 )? )
            // InternalGridGame.g:3885:1: ( rule__CellState__Group_4__0 )?
            {
             before(grammarAccess.getCellStateAccess().getGroup_4()); 
            // InternalGridGame.g:3886:1: ( rule__CellState__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGridGame.g:3886:2: rule__CellState__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellState__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellStateAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__CellState__Group__5"
    // InternalGridGame.g:3896:1: rule__CellState__Group__5 : rule__CellState__Group__5__Impl ;
    public final void rule__CellState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3900:1: ( rule__CellState__Group__5__Impl )
            // InternalGridGame.g:3901:2: rule__CellState__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__5"


    // $ANTLR start "rule__CellState__Group__5__Impl"
    // InternalGridGame.g:3907:1: rule__CellState__Group__5__Impl : ( '}' ) ;
    public final void rule__CellState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3911:1: ( ( '}' ) )
            // InternalGridGame.g:3912:1: ( '}' )
            {
            // InternalGridGame.g:3912:1: ( '}' )
            // InternalGridGame.g:3913:1: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__5__Impl"


    // $ANTLR start "rule__CellState__Group_3__0"
    // InternalGridGame.g:3938:1: rule__CellState__Group_3__0 : rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 ;
    public final void rule__CellState__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3942:1: ( rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 )
            // InternalGridGame.g:3943:2: rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__CellState__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3950:1: rule__CellState__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__CellState__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3954:1: ( ( 'transitions' ) )
            // InternalGridGame.g:3955:1: ( 'transitions' )
            {
            // InternalGridGame.g:3955:1: ( 'transitions' )
            // InternalGridGame.g:3956:1: 'transitions'
            {
             before(grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalGridGame.g:3969:1: rule__CellState__Group_3__1 : rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 ;
    public final void rule__CellState__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3973:1: ( rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 )
            // InternalGridGame.g:3974:2: rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__CellState__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:3981:1: rule__CellState__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:3985:1: ( ( '{' ) )
            // InternalGridGame.g:3986:1: ( '{' )
            {
            // InternalGridGame.g:3986:1: ( '{' )
            // InternalGridGame.g:3987:1: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:4000:1: rule__CellState__Group_3__2 : rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 ;
    public final void rule__CellState__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4004:1: ( rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 )
            // InternalGridGame.g:4005:2: rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__CellState__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:4012:1: rule__CellState__Group_3__2__Impl : ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) ;
    public final void rule__CellState__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4016:1: ( ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) )
            // InternalGridGame.g:4017:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            {
            // InternalGridGame.g:4017:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            // InternalGridGame.g:4018:1: ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            {
            // InternalGridGame.g:4018:1: ( ( rule__CellState__TransitionsAssignment_3_2 ) )
            // InternalGridGame.g:4019:1: ( rule__CellState__TransitionsAssignment_3_2 )
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalGridGame.g:4020:1: ( rule__CellState__TransitionsAssignment_3_2 )
            // InternalGridGame.g:4020:2: rule__CellState__TransitionsAssignment_3_2
            {
            pushFollow(FOLLOW_28);
            rule__CellState__TransitionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

            }

            // InternalGridGame.g:4023:1: ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            // InternalGridGame.g:4024:1: ( rule__CellState__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalGridGame.g:4025:1: ( rule__CellState__TransitionsAssignment_3_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGridGame.g:4025:2: rule__CellState__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__CellState__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalGridGame.g:4036:1: rule__CellState__Group_3__3 : rule__CellState__Group_3__3__Impl ;
    public final void rule__CellState__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4040:1: ( rule__CellState__Group_3__3__Impl )
            // InternalGridGame.g:4041:2: rule__CellState__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:4047:1: rule__CellState__Group_3__3__Impl : ( '}' ) ;
    public final void rule__CellState__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4051:1: ( ( '}' ) )
            // InternalGridGame.g:4052:1: ( '}' )
            {
            // InternalGridGame.g:4052:1: ( '}' )
            // InternalGridGame.g:4053:1: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__CellState__Group_4__0"
    // InternalGridGame.g:4074:1: rule__CellState__Group_4__0 : rule__CellState__Group_4__0__Impl rule__CellState__Group_4__1 ;
    public final void rule__CellState__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4078:1: ( rule__CellState__Group_4__0__Impl rule__CellState__Group_4__1 )
            // InternalGridGame.g:4079:2: rule__CellState__Group_4__0__Impl rule__CellState__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__CellState__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__0"


    // $ANTLR start "rule__CellState__Group_4__0__Impl"
    // InternalGridGame.g:4086:1: rule__CellState__Group_4__0__Impl : ( 'onEnter' ) ;
    public final void rule__CellState__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4090:1: ( ( 'onEnter' ) )
            // InternalGridGame.g:4091:1: ( 'onEnter' )
            {
            // InternalGridGame.g:4091:1: ( 'onEnter' )
            // InternalGridGame.g:4092:1: 'onEnter'
            {
             before(grammarAccess.getCellStateAccess().getOnEnterKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getOnEnterKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__0__Impl"


    // $ANTLR start "rule__CellState__Group_4__1"
    // InternalGridGame.g:4105:1: rule__CellState__Group_4__1 : rule__CellState__Group_4__1__Impl rule__CellState__Group_4__2 ;
    public final void rule__CellState__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4109:1: ( rule__CellState__Group_4__1__Impl rule__CellState__Group_4__2 )
            // InternalGridGame.g:4110:2: rule__CellState__Group_4__1__Impl rule__CellState__Group_4__2
            {
            pushFollow(FOLLOW_29);
            rule__CellState__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__1"


    // $ANTLR start "rule__CellState__Group_4__1__Impl"
    // InternalGridGame.g:4117:1: rule__CellState__Group_4__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4121:1: ( ( '{' ) )
            // InternalGridGame.g:4122:1: ( '{' )
            {
            // InternalGridGame.g:4122:1: ( '{' )
            // InternalGridGame.g:4123:1: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__1__Impl"


    // $ANTLR start "rule__CellState__Group_4__2"
    // InternalGridGame.g:4136:1: rule__CellState__Group_4__2 : rule__CellState__Group_4__2__Impl rule__CellState__Group_4__3 ;
    public final void rule__CellState__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4140:1: ( rule__CellState__Group_4__2__Impl rule__CellState__Group_4__3 )
            // InternalGridGame.g:4141:2: rule__CellState__Group_4__2__Impl rule__CellState__Group_4__3
            {
            pushFollow(FOLLOW_30);
            rule__CellState__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__2"


    // $ANTLR start "rule__CellState__Group_4__2__Impl"
    // InternalGridGame.g:4148:1: rule__CellState__Group_4__2__Impl : ( ( rule__CellState__OnEnterAssignment_4_2 ) ) ;
    public final void rule__CellState__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4152:1: ( ( ( rule__CellState__OnEnterAssignment_4_2 ) ) )
            // InternalGridGame.g:4153:1: ( ( rule__CellState__OnEnterAssignment_4_2 ) )
            {
            // InternalGridGame.g:4153:1: ( ( rule__CellState__OnEnterAssignment_4_2 ) )
            // InternalGridGame.g:4154:1: ( rule__CellState__OnEnterAssignment_4_2 )
            {
             before(grammarAccess.getCellStateAccess().getOnEnterAssignment_4_2()); 
            // InternalGridGame.g:4155:1: ( rule__CellState__OnEnterAssignment_4_2 )
            // InternalGridGame.g:4155:2: rule__CellState__OnEnterAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__CellState__OnEnterAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getOnEnterAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__2__Impl"


    // $ANTLR start "rule__CellState__Group_4__3"
    // InternalGridGame.g:4165:1: rule__CellState__Group_4__3 : rule__CellState__Group_4__3__Impl rule__CellState__Group_4__4 ;
    public final void rule__CellState__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4169:1: ( rule__CellState__Group_4__3__Impl rule__CellState__Group_4__4 )
            // InternalGridGame.g:4170:2: rule__CellState__Group_4__3__Impl rule__CellState__Group_4__4
            {
            pushFollow(FOLLOW_30);
            rule__CellState__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__3"


    // $ANTLR start "rule__CellState__Group_4__3__Impl"
    // InternalGridGame.g:4177:1: rule__CellState__Group_4__3__Impl : ( ( rule__CellState__Group_4_3__0 )* ) ;
    public final void rule__CellState__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4181:1: ( ( ( rule__CellState__Group_4_3__0 )* ) )
            // InternalGridGame.g:4182:1: ( ( rule__CellState__Group_4_3__0 )* )
            {
            // InternalGridGame.g:4182:1: ( ( rule__CellState__Group_4_3__0 )* )
            // InternalGridGame.g:4183:1: ( rule__CellState__Group_4_3__0 )*
            {
             before(grammarAccess.getCellStateAccess().getGroup_4_3()); 
            // InternalGridGame.g:4184:1: ( rule__CellState__Group_4_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGridGame.g:4184:2: rule__CellState__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__CellState__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCellStateAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__3__Impl"


    // $ANTLR start "rule__CellState__Group_4__4"
    // InternalGridGame.g:4194:1: rule__CellState__Group_4__4 : rule__CellState__Group_4__4__Impl ;
    public final void rule__CellState__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4198:1: ( rule__CellState__Group_4__4__Impl )
            // InternalGridGame.g:4199:2: rule__CellState__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__4"


    // $ANTLR start "rule__CellState__Group_4__4__Impl"
    // InternalGridGame.g:4205:1: rule__CellState__Group_4__4__Impl : ( '}' ) ;
    public final void rule__CellState__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4209:1: ( ( '}' ) )
            // InternalGridGame.g:4210:1: ( '}' )
            {
            // InternalGridGame.g:4210:1: ( '}' )
            // InternalGridGame.g:4211:1: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4__4__Impl"


    // $ANTLR start "rule__CellState__Group_4_3__0"
    // InternalGridGame.g:4234:1: rule__CellState__Group_4_3__0 : rule__CellState__Group_4_3__0__Impl rule__CellState__Group_4_3__1 ;
    public final void rule__CellState__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4238:1: ( rule__CellState__Group_4_3__0__Impl rule__CellState__Group_4_3__1 )
            // InternalGridGame.g:4239:2: rule__CellState__Group_4_3__0__Impl rule__CellState__Group_4_3__1
            {
            pushFollow(FOLLOW_29);
            rule__CellState__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4_3__0"


    // $ANTLR start "rule__CellState__Group_4_3__0__Impl"
    // InternalGridGame.g:4246:1: rule__CellState__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__CellState__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4250:1: ( ( ',' ) )
            // InternalGridGame.g:4251:1: ( ',' )
            {
            // InternalGridGame.g:4251:1: ( ',' )
            // InternalGridGame.g:4252:1: ','
            {
             before(grammarAccess.getCellStateAccess().getCommaKeyword_4_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4_3__0__Impl"


    // $ANTLR start "rule__CellState__Group_4_3__1"
    // InternalGridGame.g:4265:1: rule__CellState__Group_4_3__1 : rule__CellState__Group_4_3__1__Impl ;
    public final void rule__CellState__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4269:1: ( rule__CellState__Group_4_3__1__Impl )
            // InternalGridGame.g:4270:2: rule__CellState__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4_3__1"


    // $ANTLR start "rule__CellState__Group_4_3__1__Impl"
    // InternalGridGame.g:4276:1: rule__CellState__Group_4_3__1__Impl : ( ( rule__CellState__OnEnterAssignment_4_3_1 ) ) ;
    public final void rule__CellState__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4280:1: ( ( ( rule__CellState__OnEnterAssignment_4_3_1 ) ) )
            // InternalGridGame.g:4281:1: ( ( rule__CellState__OnEnterAssignment_4_3_1 ) )
            {
            // InternalGridGame.g:4281:1: ( ( rule__CellState__OnEnterAssignment_4_3_1 ) )
            // InternalGridGame.g:4282:1: ( rule__CellState__OnEnterAssignment_4_3_1 )
            {
             before(grammarAccess.getCellStateAccess().getOnEnterAssignment_4_3_1()); 
            // InternalGridGame.g:4283:1: ( rule__CellState__OnEnterAssignment_4_3_1 )
            // InternalGridGame.g:4283:2: rule__CellState__OnEnterAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CellState__OnEnterAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getOnEnterAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_4_3__1__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__0"
    // InternalGridGame.g:4297:1: rule__TransitionSpec__Group__0 : rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 ;
    public final void rule__TransitionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4301:1: ( rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 )
            // InternalGridGame.g:4302:2: rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TransitionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:4309:1: rule__TransitionSpec__Group__0__Impl : ( 'on' ) ;
    public final void rule__TransitionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4313:1: ( ( 'on' ) )
            // InternalGridGame.g:4314:1: ( 'on' )
            {
            // InternalGridGame.g:4314:1: ( 'on' )
            // InternalGridGame.g:4315:1: 'on'
            {
             before(grammarAccess.getTransitionSpecAccess().getOnKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalGridGame.g:4328:1: rule__TransitionSpec__Group__1 : rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 ;
    public final void rule__TransitionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4332:1: ( rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 )
            // InternalGridGame.g:4333:2: rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__TransitionSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:4340:1: rule__TransitionSpec__Group__1__Impl : ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) ;
    public final void rule__TransitionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4344:1: ( ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) )
            // InternalGridGame.g:4345:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            {
            // InternalGridGame.g:4345:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            // InternalGridGame.g:4346:1: ( rule__TransitionSpec__TriggerAssignment_1 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerAssignment_1()); 
            // InternalGridGame.g:4347:1: ( rule__TransitionSpec__TriggerAssignment_1 )
            // InternalGridGame.g:4347:2: rule__TransitionSpec__TriggerAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:4357:1: rule__TransitionSpec__Group__2 : rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 ;
    public final void rule__TransitionSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4361:1: ( rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 )
            // InternalGridGame.g:4362:2: rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TransitionSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:4369:1: rule__TransitionSpec__Group__2__Impl : ( 'goto' ) ;
    public final void rule__TransitionSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4373:1: ( ( 'goto' ) )
            // InternalGridGame.g:4374:1: ( 'goto' )
            {
            // InternalGridGame.g:4374:1: ( 'goto' )
            // InternalGridGame.g:4375:1: 'goto'
            {
             before(grammarAccess.getTransitionSpecAccess().getGotoKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalGridGame.g:4388:1: rule__TransitionSpec__Group__3 : rule__TransitionSpec__Group__3__Impl ;
    public final void rule__TransitionSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4392:1: ( rule__TransitionSpec__Group__3__Impl )
            // InternalGridGame.g:4393:2: rule__TransitionSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:4399:1: rule__TransitionSpec__Group__3__Impl : ( ( rule__TransitionSpec__TargetAssignment_3 ) ) ;
    public final void rule__TransitionSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4403:1: ( ( ( rule__TransitionSpec__TargetAssignment_3 ) ) )
            // InternalGridGame.g:4404:1: ( ( rule__TransitionSpec__TargetAssignment_3 ) )
            {
            // InternalGridGame.g:4404:1: ( ( rule__TransitionSpec__TargetAssignment_3 ) )
            // InternalGridGame.g:4405:1: ( rule__TransitionSpec__TargetAssignment_3 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetAssignment_3()); 
            // InternalGridGame.g:4406:1: ( rule__TransitionSpec__TargetAssignment_3 )
            // InternalGridGame.g:4406:2: rule__TransitionSpec__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__MouseTrigger__Group_1__0"
    // InternalGridGame.g:4424:1: rule__MouseTrigger__Group_1__0 : rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 ;
    public final void rule__MouseTrigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4428:1: ( rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 )
            // InternalGridGame.g:4429:2: rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__MouseTrigger__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MouseTrigger__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__0"


    // $ANTLR start "rule__MouseTrigger__Group_1__0__Impl"
    // InternalGridGame.g:4436:1: rule__MouseTrigger__Group_1__0__Impl : ( 'mouse-right' ) ;
    public final void rule__MouseTrigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4440:1: ( ( 'mouse-right' ) )
            // InternalGridGame.g:4441:1: ( 'mouse-right' )
            {
            // InternalGridGame.g:4441:1: ( 'mouse-right' )
            // InternalGridGame.g:4442:1: 'mouse-right'
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__0__Impl"


    // $ANTLR start "rule__MouseTrigger__Group_1__1"
    // InternalGridGame.g:4455:1: rule__MouseTrigger__Group_1__1 : rule__MouseTrigger__Group_1__1__Impl ;
    public final void rule__MouseTrigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4459:1: ( rule__MouseTrigger__Group_1__1__Impl )
            // InternalGridGame.g:4460:2: rule__MouseTrigger__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MouseTrigger__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__1"


    // $ANTLR start "rule__MouseTrigger__Group_1__1__Impl"
    // InternalGridGame.g:4466:1: rule__MouseTrigger__Group_1__1__Impl : ( () ) ;
    public final void rule__MouseTrigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4470:1: ( ( () ) )
            // InternalGridGame.g:4471:1: ( () )
            {
            // InternalGridGame.g:4471:1: ( () )
            // InternalGridGame.g:4472:1: ()
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1()); 
            // InternalGridGame.g:4473:1: ()
            // InternalGridGame.g:4475:1: 
            {
            }

             after(grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__1__Impl"


    // $ANTLR start "rule__ContextTrigger__Group__0"
    // InternalGridGame.g:4489:1: rule__ContextTrigger__Group__0 : rule__ContextTrigger__Group__0__Impl rule__ContextTrigger__Group__1 ;
    public final void rule__ContextTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4493:1: ( rule__ContextTrigger__Group__0__Impl rule__ContextTrigger__Group__1 )
            // InternalGridGame.g:4494:2: rule__ContextTrigger__Group__0__Impl rule__ContextTrigger__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ContextTrigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextTrigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__0"


    // $ANTLR start "rule__ContextTrigger__Group__0__Impl"
    // InternalGridGame.g:4501:1: rule__ContextTrigger__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4505:1: ( ( 'context' ) )
            // InternalGridGame.g:4506:1: ( 'context' )
            {
            // InternalGridGame.g:4506:1: ( 'context' )
            // InternalGridGame.g:4507:1: 'context'
            {
             before(grammarAccess.getContextTriggerAccess().getContextKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getContextTriggerAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__0__Impl"


    // $ANTLR start "rule__ContextTrigger__Group__1"
    // InternalGridGame.g:4520:1: rule__ContextTrigger__Group__1 : rule__ContextTrigger__Group__1__Impl rule__ContextTrigger__Group__2 ;
    public final void rule__ContextTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4524:1: ( rule__ContextTrigger__Group__1__Impl rule__ContextTrigger__Group__2 )
            // InternalGridGame.g:4525:2: rule__ContextTrigger__Group__1__Impl rule__ContextTrigger__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ContextTrigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextTrigger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__1"


    // $ANTLR start "rule__ContextTrigger__Group__1__Impl"
    // InternalGridGame.g:4532:1: rule__ContextTrigger__Group__1__Impl : ( '(' ) ;
    public final void rule__ContextTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4536:1: ( ( '(' ) )
            // InternalGridGame.g:4537:1: ( '(' )
            {
            // InternalGridGame.g:4537:1: ( '(' )
            // InternalGridGame.g:4538:1: '('
            {
             before(grammarAccess.getContextTriggerAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getContextTriggerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__1__Impl"


    // $ANTLR start "rule__ContextTrigger__Group__2"
    // InternalGridGame.g:4551:1: rule__ContextTrigger__Group__2 : rule__ContextTrigger__Group__2__Impl rule__ContextTrigger__Group__3 ;
    public final void rule__ContextTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4555:1: ( rule__ContextTrigger__Group__2__Impl rule__ContextTrigger__Group__3 )
            // InternalGridGame.g:4556:2: rule__ContextTrigger__Group__2__Impl rule__ContextTrigger__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ContextTrigger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextTrigger__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__2"


    // $ANTLR start "rule__ContextTrigger__Group__2__Impl"
    // InternalGridGame.g:4563:1: rule__ContextTrigger__Group__2__Impl : ( ( rule__ContextTrigger__ExpAssignment_2 ) ) ;
    public final void rule__ContextTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4567:1: ( ( ( rule__ContextTrigger__ExpAssignment_2 ) ) )
            // InternalGridGame.g:4568:1: ( ( rule__ContextTrigger__ExpAssignment_2 ) )
            {
            // InternalGridGame.g:4568:1: ( ( rule__ContextTrigger__ExpAssignment_2 ) )
            // InternalGridGame.g:4569:1: ( rule__ContextTrigger__ExpAssignment_2 )
            {
             before(grammarAccess.getContextTriggerAccess().getExpAssignment_2()); 
            // InternalGridGame.g:4570:1: ( rule__ContextTrigger__ExpAssignment_2 )
            // InternalGridGame.g:4570:2: rule__ContextTrigger__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContextTrigger__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextTriggerAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__2__Impl"


    // $ANTLR start "rule__ContextTrigger__Group__3"
    // InternalGridGame.g:4580:1: rule__ContextTrigger__Group__3 : rule__ContextTrigger__Group__3__Impl ;
    public final void rule__ContextTrigger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4584:1: ( rule__ContextTrigger__Group__3__Impl )
            // InternalGridGame.g:4585:2: rule__ContextTrigger__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextTrigger__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__3"


    // $ANTLR start "rule__ContextTrigger__Group__3__Impl"
    // InternalGridGame.g:4591:1: rule__ContextTrigger__Group__3__Impl : ( ')' ) ;
    public final void rule__ContextTrigger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4595:1: ( ( ')' ) )
            // InternalGridGame.g:4596:1: ( ')' )
            {
            // InternalGridGame.g:4596:1: ( ')' )
            // InternalGridGame.g:4597:1: ')'
            {
             before(grammarAccess.getContextTriggerAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContextTriggerAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__Group__3__Impl"


    // $ANTLR start "rule__DirectBehaviour__Group_1__0"
    // InternalGridGame.g:4618:1: rule__DirectBehaviour__Group_1__0 : rule__DirectBehaviour__Group_1__0__Impl rule__DirectBehaviour__Group_1__1 ;
    public final void rule__DirectBehaviour__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4622:1: ( rule__DirectBehaviour__Group_1__0__Impl rule__DirectBehaviour__Group_1__1 )
            // InternalGridGame.g:4623:2: rule__DirectBehaviour__Group_1__0__Impl rule__DirectBehaviour__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__DirectBehaviour__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectBehaviour__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__0"


    // $ANTLR start "rule__DirectBehaviour__Group_1__0__Impl"
    // InternalGridGame.g:4630:1: rule__DirectBehaviour__Group_1__0__Impl : ( ruleNoOpBehaviour ) ;
    public final void rule__DirectBehaviour__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4634:1: ( ( ruleNoOpBehaviour ) )
            // InternalGridGame.g:4635:1: ( ruleNoOpBehaviour )
            {
            // InternalGridGame.g:4635:1: ( ruleNoOpBehaviour )
            // InternalGridGame.g:4636:1: ruleNoOpBehaviour
            {
             before(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoOpBehaviour();

            state._fsp--;

             after(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__0__Impl"


    // $ANTLR start "rule__DirectBehaviour__Group_1__1"
    // InternalGridGame.g:4647:1: rule__DirectBehaviour__Group_1__1 : rule__DirectBehaviour__Group_1__1__Impl ;
    public final void rule__DirectBehaviour__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4651:1: ( rule__DirectBehaviour__Group_1__1__Impl )
            // InternalGridGame.g:4652:2: rule__DirectBehaviour__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectBehaviour__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__1"


    // $ANTLR start "rule__DirectBehaviour__Group_1__1__Impl"
    // InternalGridGame.g:4658:1: rule__DirectBehaviour__Group_1__1__Impl : ( () ) ;
    public final void rule__DirectBehaviour__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4662:1: ( ( () ) )
            // InternalGridGame.g:4663:1: ( () )
            {
            // InternalGridGame.g:4663:1: ( () )
            // InternalGridGame.g:4664:1: ()
            {
             before(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourAction_1_1()); 
            // InternalGridGame.g:4665:1: ()
            // InternalGridGame.g:4667:1: 
            {
            }

             after(grammarAccess.getDirectBehaviourAccess().getNoOpBehaviourAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectBehaviour__Group_1__1__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__0"
    // InternalGridGame.g:4681:1: rule__EndGameBehaviour__Group__0 : rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 ;
    public final void rule__EndGameBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4685:1: ( rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1 )
            // InternalGridGame.g:4686:2: rule__EndGameBehaviour__Group__0__Impl rule__EndGameBehaviour__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__EndGameBehaviour__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__0"


    // $ANTLR start "rule__EndGameBehaviour__Group__0__Impl"
    // InternalGridGame.g:4693:1: rule__EndGameBehaviour__Group__0__Impl : ( 'end-game' ) ;
    public final void rule__EndGameBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4697:1: ( ( 'end-game' ) )
            // InternalGridGame.g:4698:1: ( 'end-game' )
            {
            // InternalGridGame.g:4698:1: ( 'end-game' )
            // InternalGridGame.g:4699:1: 'end-game'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getEndGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__0__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__1"
    // InternalGridGame.g:4712:1: rule__EndGameBehaviour__Group__1 : rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 ;
    public final void rule__EndGameBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4716:1: ( rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2 )
            // InternalGridGame.g:4717:2: rule__EndGameBehaviour__Group__1__Impl rule__EndGameBehaviour__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__EndGameBehaviour__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__1"


    // $ANTLR start "rule__EndGameBehaviour__Group__1__Impl"
    // InternalGridGame.g:4724:1: rule__EndGameBehaviour__Group__1__Impl : ( '(' ) ;
    public final void rule__EndGameBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4728:1: ( ( '(' ) )
            // InternalGridGame.g:4729:1: ( '(' )
            {
            // InternalGridGame.g:4729:1: ( '(' )
            // InternalGridGame.g:4730:1: '('
            {
             before(grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__1__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__2"
    // InternalGridGame.g:4743:1: rule__EndGameBehaviour__Group__2 : rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 ;
    public final void rule__EndGameBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4747:1: ( rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3 )
            // InternalGridGame.g:4748:2: rule__EndGameBehaviour__Group__2__Impl rule__EndGameBehaviour__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__EndGameBehaviour__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__2"


    // $ANTLR start "rule__EndGameBehaviour__Group__2__Impl"
    // InternalGridGame.g:4755:1: rule__EndGameBehaviour__Group__2__Impl : ( ( rule__EndGameBehaviour__MessageAssignment_2 ) ) ;
    public final void rule__EndGameBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4759:1: ( ( ( rule__EndGameBehaviour__MessageAssignment_2 ) ) )
            // InternalGridGame.g:4760:1: ( ( rule__EndGameBehaviour__MessageAssignment_2 ) )
            {
            // InternalGridGame.g:4760:1: ( ( rule__EndGameBehaviour__MessageAssignment_2 ) )
            // InternalGridGame.g:4761:1: ( rule__EndGameBehaviour__MessageAssignment_2 )
            {
             before(grammarAccess.getEndGameBehaviourAccess().getMessageAssignment_2()); 
            // InternalGridGame.g:4762:1: ( rule__EndGameBehaviour__MessageAssignment_2 )
            // InternalGridGame.g:4762:2: rule__EndGameBehaviour__MessageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndGameBehaviourAccess().getMessageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__2__Impl"


    // $ANTLR start "rule__EndGameBehaviour__Group__3"
    // InternalGridGame.g:4772:1: rule__EndGameBehaviour__Group__3 : rule__EndGameBehaviour__Group__3__Impl ;
    public final void rule__EndGameBehaviour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4776:1: ( rule__EndGameBehaviour__Group__3__Impl )
            // InternalGridGame.g:4777:2: rule__EndGameBehaviour__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndGameBehaviour__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__3"


    // $ANTLR start "rule__EndGameBehaviour__Group__3__Impl"
    // InternalGridGame.g:4783:1: rule__EndGameBehaviour__Group__3__Impl : ( ')' ) ;
    public final void rule__EndGameBehaviour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4787:1: ( ( ')' ) )
            // InternalGridGame.g:4788:1: ( ')' )
            {
            // InternalGridGame.g:4788:1: ( ')' )
            // InternalGridGame.g:4789:1: ')'
            {
             before(grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__Group__3__Impl"


    // $ANTLR start "rule__GlobalAction__Group__0"
    // InternalGridGame.g:4810:1: rule__GlobalAction__Group__0 : rule__GlobalAction__Group__0__Impl rule__GlobalAction__Group__1 ;
    public final void rule__GlobalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4814:1: ( rule__GlobalAction__Group__0__Impl rule__GlobalAction__Group__1 )
            // InternalGridGame.g:4815:2: rule__GlobalAction__Group__0__Impl rule__GlobalAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GlobalAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__0"


    // $ANTLR start "rule__GlobalAction__Group__0__Impl"
    // InternalGridGame.g:4822:1: rule__GlobalAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__GlobalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4826:1: ( ( 'action' ) )
            // InternalGridGame.g:4827:1: ( 'action' )
            {
            // InternalGridGame.g:4827:1: ( 'action' )
            // InternalGridGame.g:4828:1: 'action'
            {
             before(grammarAccess.getGlobalActionAccess().getActionKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getGlobalActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__0__Impl"


    // $ANTLR start "rule__GlobalAction__Group__1"
    // InternalGridGame.g:4841:1: rule__GlobalAction__Group__1 : rule__GlobalAction__Group__1__Impl rule__GlobalAction__Group__2 ;
    public final void rule__GlobalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4845:1: ( rule__GlobalAction__Group__1__Impl rule__GlobalAction__Group__2 )
            // InternalGridGame.g:4846:2: rule__GlobalAction__Group__1__Impl rule__GlobalAction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GlobalAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__1"


    // $ANTLR start "rule__GlobalAction__Group__1__Impl"
    // InternalGridGame.g:4853:1: rule__GlobalAction__Group__1__Impl : ( ( rule__GlobalAction__NameAssignment_1 ) ) ;
    public final void rule__GlobalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4857:1: ( ( ( rule__GlobalAction__NameAssignment_1 ) ) )
            // InternalGridGame.g:4858:1: ( ( rule__GlobalAction__NameAssignment_1 ) )
            {
            // InternalGridGame.g:4858:1: ( ( rule__GlobalAction__NameAssignment_1 ) )
            // InternalGridGame.g:4859:1: ( rule__GlobalAction__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalActionAccess().getNameAssignment_1()); 
            // InternalGridGame.g:4860:1: ( rule__GlobalAction__NameAssignment_1 )
            // InternalGridGame.g:4860:2: rule__GlobalAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__1__Impl"


    // $ANTLR start "rule__GlobalAction__Group__2"
    // InternalGridGame.g:4870:1: rule__GlobalAction__Group__2 : rule__GlobalAction__Group__2__Impl rule__GlobalAction__Group__3 ;
    public final void rule__GlobalAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4874:1: ( rule__GlobalAction__Group__2__Impl rule__GlobalAction__Group__3 )
            // InternalGridGame.g:4875:2: rule__GlobalAction__Group__2__Impl rule__GlobalAction__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__GlobalAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__2"


    // $ANTLR start "rule__GlobalAction__Group__2__Impl"
    // InternalGridGame.g:4882:1: rule__GlobalAction__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4886:1: ( ( '{' ) )
            // InternalGridGame.g:4887:1: ( '{' )
            {
            // InternalGridGame.g:4887:1: ( '{' )
            // InternalGridGame.g:4888:1: '{'
            {
             before(grammarAccess.getGlobalActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGlobalActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__2__Impl"


    // $ANTLR start "rule__GlobalAction__Group__3"
    // InternalGridGame.g:4901:1: rule__GlobalAction__Group__3 : rule__GlobalAction__Group__3__Impl rule__GlobalAction__Group__4 ;
    public final void rule__GlobalAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4905:1: ( rule__GlobalAction__Group__3__Impl rule__GlobalAction__Group__4 )
            // InternalGridGame.g:4906:2: rule__GlobalAction__Group__3__Impl rule__GlobalAction__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__GlobalAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__3"


    // $ANTLR start "rule__GlobalAction__Group__3__Impl"
    // InternalGridGame.g:4913:1: rule__GlobalAction__Group__3__Impl : ( 'when' ) ;
    public final void rule__GlobalAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4917:1: ( ( 'when' ) )
            // InternalGridGame.g:4918:1: ( 'when' )
            {
            // InternalGridGame.g:4918:1: ( 'when' )
            // InternalGridGame.g:4919:1: 'when'
            {
             before(grammarAccess.getGlobalActionAccess().getWhenKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGlobalActionAccess().getWhenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__3__Impl"


    // $ANTLR start "rule__GlobalAction__Group__4"
    // InternalGridGame.g:4932:1: rule__GlobalAction__Group__4 : rule__GlobalAction__Group__4__Impl rule__GlobalAction__Group__5 ;
    public final void rule__GlobalAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4936:1: ( rule__GlobalAction__Group__4__Impl rule__GlobalAction__Group__5 )
            // InternalGridGame.g:4937:2: rule__GlobalAction__Group__4__Impl rule__GlobalAction__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__GlobalAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__4"


    // $ANTLR start "rule__GlobalAction__Group__4__Impl"
    // InternalGridGame.g:4944:1: rule__GlobalAction__Group__4__Impl : ( ( rule__GlobalAction__TriggerAssignment_4 ) ) ;
    public final void rule__GlobalAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4948:1: ( ( ( rule__GlobalAction__TriggerAssignment_4 ) ) )
            // InternalGridGame.g:4949:1: ( ( rule__GlobalAction__TriggerAssignment_4 ) )
            {
            // InternalGridGame.g:4949:1: ( ( rule__GlobalAction__TriggerAssignment_4 ) )
            // InternalGridGame.g:4950:1: ( rule__GlobalAction__TriggerAssignment_4 )
            {
             before(grammarAccess.getGlobalActionAccess().getTriggerAssignment_4()); 
            // InternalGridGame.g:4951:1: ( rule__GlobalAction__TriggerAssignment_4 )
            // InternalGridGame.g:4951:2: rule__GlobalAction__TriggerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GlobalAction__TriggerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalActionAccess().getTriggerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__4__Impl"


    // $ANTLR start "rule__GlobalAction__Group__5"
    // InternalGridGame.g:4961:1: rule__GlobalAction__Group__5 : rule__GlobalAction__Group__5__Impl rule__GlobalAction__Group__6 ;
    public final void rule__GlobalAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4965:1: ( rule__GlobalAction__Group__5__Impl rule__GlobalAction__Group__6 )
            // InternalGridGame.g:4966:2: rule__GlobalAction__Group__5__Impl rule__GlobalAction__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__GlobalAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__5"


    // $ANTLR start "rule__GlobalAction__Group__5__Impl"
    // InternalGridGame.g:4973:1: rule__GlobalAction__Group__5__Impl : ( 'do' ) ;
    public final void rule__GlobalAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4977:1: ( ( 'do' ) )
            // InternalGridGame.g:4978:1: ( 'do' )
            {
            // InternalGridGame.g:4978:1: ( 'do' )
            // InternalGridGame.g:4979:1: 'do'
            {
             before(grammarAccess.getGlobalActionAccess().getDoKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGlobalActionAccess().getDoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__5__Impl"


    // $ANTLR start "rule__GlobalAction__Group__6"
    // InternalGridGame.g:4992:1: rule__GlobalAction__Group__6 : rule__GlobalAction__Group__6__Impl rule__GlobalAction__Group__7 ;
    public final void rule__GlobalAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:4996:1: ( rule__GlobalAction__Group__6__Impl rule__GlobalAction__Group__7 )
            // InternalGridGame.g:4997:2: rule__GlobalAction__Group__6__Impl rule__GlobalAction__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__GlobalAction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__6"


    // $ANTLR start "rule__GlobalAction__Group__6__Impl"
    // InternalGridGame.g:5004:1: rule__GlobalAction__Group__6__Impl : ( ( rule__GlobalAction__BehaviourAssignment_6 ) ) ;
    public final void rule__GlobalAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5008:1: ( ( ( rule__GlobalAction__BehaviourAssignment_6 ) ) )
            // InternalGridGame.g:5009:1: ( ( rule__GlobalAction__BehaviourAssignment_6 ) )
            {
            // InternalGridGame.g:5009:1: ( ( rule__GlobalAction__BehaviourAssignment_6 ) )
            // InternalGridGame.g:5010:1: ( rule__GlobalAction__BehaviourAssignment_6 )
            {
             before(grammarAccess.getGlobalActionAccess().getBehaviourAssignment_6()); 
            // InternalGridGame.g:5011:1: ( rule__GlobalAction__BehaviourAssignment_6 )
            // InternalGridGame.g:5011:2: rule__GlobalAction__BehaviourAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GlobalAction__BehaviourAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGlobalActionAccess().getBehaviourAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__6__Impl"


    // $ANTLR start "rule__GlobalAction__Group__7"
    // InternalGridGame.g:5021:1: rule__GlobalAction__Group__7 : rule__GlobalAction__Group__7__Impl ;
    public final void rule__GlobalAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5025:1: ( rule__GlobalAction__Group__7__Impl )
            // InternalGridGame.g:5026:2: rule__GlobalAction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalAction__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__7"


    // $ANTLR start "rule__GlobalAction__Group__7__Impl"
    // InternalGridGame.g:5032:1: rule__GlobalAction__Group__7__Impl : ( '}' ) ;
    public final void rule__GlobalAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5036:1: ( ( '}' ) )
            // InternalGridGame.g:5037:1: ( '}' )
            {
            // InternalGridGame.g:5037:1: ( '}' )
            // InternalGridGame.g:5038:1: '}'
            {
             before(grammarAccess.getGlobalActionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGlobalActionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__Group__7__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__0"
    // InternalGridGame.g:5067:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5071:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // InternalGridGame.g:5072:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FieldSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5079:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5083:1: ( ( 'field' ) )
            // InternalGridGame.g:5084:1: ( 'field' )
            {
            // InternalGridGame.g:5084:1: ( 'field' )
            // InternalGridGame.g:5085:1: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalGridGame.g:5098:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5102:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // InternalGridGame.g:5103:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FieldSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5110:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5114:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // InternalGridGame.g:5115:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // InternalGridGame.g:5115:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // InternalGridGame.g:5116:1: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // InternalGridGame.g:5117:1: ( rule__FieldSpecification__NameAssignment_1 )
            // InternalGridGame.g:5117:2: rule__FieldSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5127:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5131:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // InternalGridGame.g:5132:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__FieldSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5139:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5143:1: ( ( '{' ) )
            // InternalGridGame.g:5144:1: ( '{' )
            {
            // InternalGridGame.g:5144:1: ( '{' )
            // InternalGridGame.g:5145:1: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGridGame.g:5158:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5162:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // InternalGridGame.g:5163:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__FieldSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5170:1: rule__FieldSpecification__Group__3__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5174:1: ( ( 'width' ) )
            // InternalGridGame.g:5175:1: ( 'width' )
            {
            // InternalGridGame.g:5175:1: ( 'width' )
            // InternalGridGame.g:5176:1: 'width'
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalGridGame.g:5189:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5193:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // InternalGridGame.g:5194:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__FieldSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5201:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5205:1: ( ( '=' ) )
            // InternalGridGame.g:5206:1: ( '=' )
            {
            // InternalGridGame.g:5206:1: ( '=' )
            // InternalGridGame.g:5207:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGridGame.g:5220:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5224:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // InternalGridGame.g:5225:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__FieldSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5232:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__WidthAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5236:1: ( ( ( rule__FieldSpecification__WidthAssignment_5 ) ) )
            // InternalGridGame.g:5237:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            {
            // InternalGridGame.g:5237:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            // InternalGridGame.g:5238:1: ( rule__FieldSpecification__WidthAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5()); 
            // InternalGridGame.g:5239:1: ( rule__FieldSpecification__WidthAssignment_5 )
            // InternalGridGame.g:5239:2: rule__FieldSpecification__WidthAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5249:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5253:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // InternalGridGame.g:5254:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__FieldSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5261:1: rule__FieldSpecification__Group__6__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5265:1: ( ( 'height' ) )
            // InternalGridGame.g:5266:1: ( 'height' )
            {
            // InternalGridGame.g:5266:1: ( 'height' )
            // InternalGridGame.g:5267:1: 'height'
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6()); 
            match(input,52,FOLLOW_2); 
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
    // InternalGridGame.g:5280:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5284:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // InternalGridGame.g:5285:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5292:1: rule__FieldSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5296:1: ( ( '=' ) )
            // InternalGridGame.g:5297:1: ( '=' )
            {
            // InternalGridGame.g:5297:1: ( '=' )
            // InternalGridGame.g:5298:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGridGame.g:5311:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5315:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // InternalGridGame.g:5316:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
            {
            pushFollow(FOLLOW_41);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5323:1: rule__FieldSpecification__Group__8__Impl : ( ( rule__FieldSpecification__HeightAssignment_8 ) ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5327:1: ( ( ( rule__FieldSpecification__HeightAssignment_8 ) ) )
            // InternalGridGame.g:5328:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            {
            // InternalGridGame.g:5328:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            // InternalGridGame.g:5329:1: ( rule__FieldSpecification__HeightAssignment_8 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_8()); 
            // InternalGridGame.g:5330:1: ( rule__FieldSpecification__HeightAssignment_8 )
            // InternalGridGame.g:5330:2: rule__FieldSpecification__HeightAssignment_8
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5340:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5344:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // InternalGridGame.g:5345:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
            {
            pushFollow(FOLLOW_41);
            rule__FieldSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5352:1: rule__FieldSpecification__Group__9__Impl : ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5356:1: ( ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) )
            // InternalGridGame.g:5357:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            {
            // InternalGridGame.g:5357:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            // InternalGridGame.g:5358:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationAssignment_9()); 
            // InternalGridGame.g:5359:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGridGame.g:5359:2: rule__FieldSpecification__Field_initialisationAssignment_9
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5369:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5373:1: ( rule__FieldSpecification__Group__10__Impl )
            // InternalGridGame.g:5374:2: rule__FieldSpecification__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5380:1: rule__FieldSpecification__Group__10__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5384:1: ( ( '}' ) )
            // InternalGridGame.g:5385:1: ( '}' )
            {
            // InternalGridGame.g:5385:1: ( '}' )
            // InternalGridGame.g:5386:1: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGridGame.g:5421:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5425:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // InternalGridGame.g:5426:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__AllowRestartMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5433:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allow_restart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5437:1: ( ( 'allow_restart' ) )
            // InternalGridGame.g:5438:1: ( 'allow_restart' )
            {
            // InternalGridGame.g:5438:1: ( 'allow_restart' )
            // InternalGridGame.g:5439:1: 'allow_restart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalGridGame.g:5452:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5456:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // InternalGridGame.g:5457:2: rule__AllowRestartMenu__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5463:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5467:1: ( ( () ) )
            // InternalGridGame.g:5468:1: ( () )
            {
            // InternalGridGame.g:5468:1: ( () )
            // InternalGridGame.g:5469:1: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // InternalGridGame.g:5470:1: ()
            // InternalGridGame.g:5472:1: 
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
    // InternalGridGame.g:5486:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5490:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // InternalGridGame.g:5491:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__StartFieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5498:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5502:1: ( ( 'start' ) )
            // InternalGridGame.g:5503:1: ( 'start' )
            {
            // InternalGridGame.g:5503:1: ( 'start' )
            // InternalGridGame.g:5504:1: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGridGame.g:5517:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5521:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // InternalGridGame.g:5522:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StartFieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5529:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5533:1: ( ( '=' ) )
            // InternalGridGame.g:5534:1: ( '=' )
            {
            // InternalGridGame.g:5534:1: ( '=' )
            // InternalGridGame.g:5535:1: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGridGame.g:5548:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5552:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // InternalGridGame.g:5553:2: rule__StartFieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:5559:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5563:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // InternalGridGame.g:5564:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // InternalGridGame.g:5564:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // InternalGridGame.g:5565:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // InternalGridGame.g:5566:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // InternalGridGame.g:5566:2: rule__StartFieldDeclaration__FieldAssignment_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__GenerationalContexts__Group__0"
    // InternalGridGame.g:5582:1: rule__GenerationalContexts__Group__0 : rule__GenerationalContexts__Group__0__Impl rule__GenerationalContexts__Group__1 ;
    public final void rule__GenerationalContexts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5586:1: ( rule__GenerationalContexts__Group__0__Impl rule__GenerationalContexts__Group__1 )
            // InternalGridGame.g:5587:2: rule__GenerationalContexts__Group__0__Impl rule__GenerationalContexts__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__GenerationalContexts__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenerationalContexts__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationalContexts__Group__0"


    // $ANTLR start "rule__GenerationalContexts__Group__0__Impl"
    // InternalGridGame.g:5594:1: rule__GenerationalContexts__Group__0__Impl : ( 'contextsTriggerGenerationally' ) ;
    public final void rule__GenerationalContexts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5598:1: ( ( 'contextsTriggerGenerationally' ) )
            // InternalGridGame.g:5599:1: ( 'contextsTriggerGenerationally' )
            {
            // InternalGridGame.g:5599:1: ( 'contextsTriggerGenerationally' )
            // InternalGridGame.g:5600:1: 'contextsTriggerGenerationally'
            {
             before(grammarAccess.getGenerationalContextsAccess().getContextsTriggerGenerationallyKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGenerationalContextsAccess().getContextsTriggerGenerationallyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationalContexts__Group__0__Impl"


    // $ANTLR start "rule__GenerationalContexts__Group__1"
    // InternalGridGame.g:5613:1: rule__GenerationalContexts__Group__1 : rule__GenerationalContexts__Group__1__Impl ;
    public final void rule__GenerationalContexts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5617:1: ( rule__GenerationalContexts__Group__1__Impl )
            // InternalGridGame.g:5618:2: rule__GenerationalContexts__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenerationalContexts__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationalContexts__Group__1"


    // $ANTLR start "rule__GenerationalContexts__Group__1__Impl"
    // InternalGridGame.g:5624:1: rule__GenerationalContexts__Group__1__Impl : ( () ) ;
    public final void rule__GenerationalContexts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5628:1: ( ( () ) )
            // InternalGridGame.g:5629:1: ( () )
            {
            // InternalGridGame.g:5629:1: ( () )
            // InternalGridGame.g:5630:1: ()
            {
             before(grammarAccess.getGenerationalContextsAccess().getGenerationalContextsAction_1()); 
            // InternalGridGame.g:5631:1: ()
            // InternalGridGame.g:5633:1: 
            {
            }

             after(grammarAccess.getGenerationalContextsAccess().getGenerationalContextsAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenerationalContexts__Group__1__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__0"
    // InternalGridGame.g:5647:1: rule__GlobalFieldInitialisation__Group__0 : rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1 ;
    public final void rule__GlobalFieldInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5651:1: ( rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1 )
            // InternalGridGame.g:5652:2: rule__GlobalFieldInitialisation__Group__0__Impl rule__GlobalFieldInitialisation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GlobalFieldInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__0"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__0__Impl"
    // InternalGridGame.g:5659:1: rule__GlobalFieldInitialisation__Group__0__Impl : ( 'init' ) ;
    public final void rule__GlobalFieldInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5663:1: ( ( 'init' ) )
            // InternalGridGame.g:5664:1: ( 'init' )
            {
            // InternalGridGame.g:5664:1: ( 'init' )
            // InternalGridGame.g:5665:1: 'init'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getInitKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__0__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__1"
    // InternalGridGame.g:5678:1: rule__GlobalFieldInitialisation__Group__1 : rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2 ;
    public final void rule__GlobalFieldInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5682:1: ( rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2 )
            // InternalGridGame.g:5683:2: rule__GlobalFieldInitialisation__Group__1__Impl rule__GlobalFieldInitialisation__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__GlobalFieldInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__1"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__1__Impl"
    // InternalGridGame.g:5690:1: rule__GlobalFieldInitialisation__Group__1__Impl : ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5694:1: ( ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) ) )
            // InternalGridGame.g:5695:1: ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) )
            {
            // InternalGridGame.g:5695:1: ( ( rule__GlobalFieldInitialisation__NameAssignment_1 ) )
            // InternalGridGame.g:5696:1: ( rule__GlobalFieldInitialisation__NameAssignment_1 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getNameAssignment_1()); 
            // InternalGridGame.g:5697:1: ( rule__GlobalFieldInitialisation__NameAssignment_1 )
            // InternalGridGame.g:5697:2: rule__GlobalFieldInitialisation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__1__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__2"
    // InternalGridGame.g:5707:1: rule__GlobalFieldInitialisation__Group__2 : rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3 ;
    public final void rule__GlobalFieldInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5711:1: ( rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3 )
            // InternalGridGame.g:5712:2: rule__GlobalFieldInitialisation__Group__2__Impl rule__GlobalFieldInitialisation__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__GlobalFieldInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__2"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__2__Impl"
    // InternalGridGame.g:5719:1: rule__GlobalFieldInitialisation__Group__2__Impl : ( ( rule__GlobalFieldInitialisation__Group_2__0 )? ) ;
    public final void rule__GlobalFieldInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5723:1: ( ( ( rule__GlobalFieldInitialisation__Group_2__0 )? ) )
            // InternalGridGame.g:5724:1: ( ( rule__GlobalFieldInitialisation__Group_2__0 )? )
            {
            // InternalGridGame.g:5724:1: ( ( rule__GlobalFieldInitialisation__Group_2__0 )? )
            // InternalGridGame.g:5725:1: ( rule__GlobalFieldInitialisation__Group_2__0 )?
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_2()); 
            // InternalGridGame.g:5726:1: ( rule__GlobalFieldInitialisation__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGridGame.g:5726:2: rule__GlobalFieldInitialisation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalFieldInitialisation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__2__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__3"
    // InternalGridGame.g:5736:1: rule__GlobalFieldInitialisation__Group__3 : rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4 ;
    public final void rule__GlobalFieldInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5740:1: ( rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4 )
            // InternalGridGame.g:5741:2: rule__GlobalFieldInitialisation__Group__3__Impl rule__GlobalFieldInitialisation__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__GlobalFieldInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__3"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__3__Impl"
    // InternalGridGame.g:5748:1: rule__GlobalFieldInitialisation__Group__3__Impl : ( '{' ) ;
    public final void rule__GlobalFieldInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5752:1: ( ( '{' ) )
            // InternalGridGame.g:5753:1: ( '{' )
            {
            // InternalGridGame.g:5753:1: ( '{' )
            // InternalGridGame.g:5754:1: '{'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__3__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__4"
    // InternalGridGame.g:5767:1: rule__GlobalFieldInitialisation__Group__4 : rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5 ;
    public final void rule__GlobalFieldInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5771:1: ( rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5 )
            // InternalGridGame.g:5772:2: rule__GlobalFieldInitialisation__Group__4__Impl rule__GlobalFieldInitialisation__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__GlobalFieldInitialisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__4"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__4__Impl"
    // InternalGridGame.g:5779:1: rule__GlobalFieldInitialisation__Group__4__Impl : ( ( ( rule__GlobalFieldInitialisation__Group_4__0 ) ) ( ( rule__GlobalFieldInitialisation__Group_4__0 )* ) ) ;
    public final void rule__GlobalFieldInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5783:1: ( ( ( ( rule__GlobalFieldInitialisation__Group_4__0 ) ) ( ( rule__GlobalFieldInitialisation__Group_4__0 )* ) ) )
            // InternalGridGame.g:5784:1: ( ( ( rule__GlobalFieldInitialisation__Group_4__0 ) ) ( ( rule__GlobalFieldInitialisation__Group_4__0 )* ) )
            {
            // InternalGridGame.g:5784:1: ( ( ( rule__GlobalFieldInitialisation__Group_4__0 ) ) ( ( rule__GlobalFieldInitialisation__Group_4__0 )* ) )
            // InternalGridGame.g:5785:1: ( ( rule__GlobalFieldInitialisation__Group_4__0 ) ) ( ( rule__GlobalFieldInitialisation__Group_4__0 )* )
            {
            // InternalGridGame.g:5785:1: ( ( rule__GlobalFieldInitialisation__Group_4__0 ) )
            // InternalGridGame.g:5786:1: ( rule__GlobalFieldInitialisation__Group_4__0 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_4()); 
            // InternalGridGame.g:5787:1: ( rule__GlobalFieldInitialisation__Group_4__0 )
            // InternalGridGame.g:5787:2: rule__GlobalFieldInitialisation__Group_4__0
            {
            pushFollow(FOLLOW_43);
            rule__GlobalFieldInitialisation__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_4()); 

            }

            // InternalGridGame.g:5790:1: ( ( rule__GlobalFieldInitialisation__Group_4__0 )* )
            // InternalGridGame.g:5791:1: ( rule__GlobalFieldInitialisation__Group_4__0 )*
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_4()); 
            // InternalGridGame.g:5792:1: ( rule__GlobalFieldInitialisation__Group_4__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==45||LA34_0==57||LA34_0==59) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGridGame.g:5792:2: rule__GlobalFieldInitialisation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__GlobalFieldInitialisation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__4__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__5"
    // InternalGridGame.g:5803:1: rule__GlobalFieldInitialisation__Group__5 : rule__GlobalFieldInitialisation__Group__5__Impl ;
    public final void rule__GlobalFieldInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5807:1: ( rule__GlobalFieldInitialisation__Group__5__Impl )
            // InternalGridGame.g:5808:2: rule__GlobalFieldInitialisation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__5"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group__5__Impl"
    // InternalGridGame.g:5814:1: rule__GlobalFieldInitialisation__Group__5__Impl : ( '}' ) ;
    public final void rule__GlobalFieldInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5818:1: ( ( '}' ) )
            // InternalGridGame.g:5819:1: ( '}' )
            {
            // InternalGridGame.g:5819:1: ( '}' )
            // InternalGridGame.g:5820:1: '}'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group__5__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__0"
    // InternalGridGame.g:5845:1: rule__GlobalFieldInitialisation__Group_2__0 : rule__GlobalFieldInitialisation__Group_2__0__Impl rule__GlobalFieldInitialisation__Group_2__1 ;
    public final void rule__GlobalFieldInitialisation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5849:1: ( rule__GlobalFieldInitialisation__Group_2__0__Impl rule__GlobalFieldInitialisation__Group_2__1 )
            // InternalGridGame.g:5850:2: rule__GlobalFieldInitialisation__Group_2__0__Impl rule__GlobalFieldInitialisation__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GlobalFieldInitialisation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__0"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__0__Impl"
    // InternalGridGame.g:5857:1: rule__GlobalFieldInitialisation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__GlobalFieldInitialisation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5861:1: ( ( '(' ) )
            // InternalGridGame.g:5862:1: ( '(' )
            {
            // InternalGridGame.g:5862:1: ( '(' )
            // InternalGridGame.g:5863:1: '('
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__0__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__1"
    // InternalGridGame.g:5876:1: rule__GlobalFieldInitialisation__Group_2__1 : rule__GlobalFieldInitialisation__Group_2__1__Impl rule__GlobalFieldInitialisation__Group_2__2 ;
    public final void rule__GlobalFieldInitialisation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5880:1: ( rule__GlobalFieldInitialisation__Group_2__1__Impl rule__GlobalFieldInitialisation__Group_2__2 )
            // InternalGridGame.g:5881:2: rule__GlobalFieldInitialisation__Group_2__1__Impl rule__GlobalFieldInitialisation__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__GlobalFieldInitialisation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__1"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__1__Impl"
    // InternalGridGame.g:5888:1: rule__GlobalFieldInitialisation__Group_2__1__Impl : ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_1 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5892:1: ( ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_1 ) ) )
            // InternalGridGame.g:5893:1: ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_1 ) )
            {
            // InternalGridGame.g:5893:1: ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_1 ) )
            // InternalGridGame.g:5894:1: ( rule__GlobalFieldInitialisation__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getParamsAssignment_2_1()); 
            // InternalGridGame.g:5895:1: ( rule__GlobalFieldInitialisation__ParamsAssignment_2_1 )
            // InternalGridGame.g:5895:2: rule__GlobalFieldInitialisation__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__1__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__2"
    // InternalGridGame.g:5905:1: rule__GlobalFieldInitialisation__Group_2__2 : rule__GlobalFieldInitialisation__Group_2__2__Impl rule__GlobalFieldInitialisation__Group_2__3 ;
    public final void rule__GlobalFieldInitialisation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5909:1: ( rule__GlobalFieldInitialisation__Group_2__2__Impl rule__GlobalFieldInitialisation__Group_2__3 )
            // InternalGridGame.g:5910:2: rule__GlobalFieldInitialisation__Group_2__2__Impl rule__GlobalFieldInitialisation__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__GlobalFieldInitialisation__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__2"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__2__Impl"
    // InternalGridGame.g:5917:1: rule__GlobalFieldInitialisation__Group_2__2__Impl : ( ( rule__GlobalFieldInitialisation__Group_2_2__0 )* ) ;
    public final void rule__GlobalFieldInitialisation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5921:1: ( ( ( rule__GlobalFieldInitialisation__Group_2_2__0 )* ) )
            // InternalGridGame.g:5922:1: ( ( rule__GlobalFieldInitialisation__Group_2_2__0 )* )
            {
            // InternalGridGame.g:5922:1: ( ( rule__GlobalFieldInitialisation__Group_2_2__0 )* )
            // InternalGridGame.g:5923:1: ( rule__GlobalFieldInitialisation__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_2_2()); 
            // InternalGridGame.g:5924:1: ( rule__GlobalFieldInitialisation__Group_2_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==39) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGridGame.g:5924:2: rule__GlobalFieldInitialisation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__GlobalFieldInitialisation__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getGlobalFieldInitialisationAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__2__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__3"
    // InternalGridGame.g:5934:1: rule__GlobalFieldInitialisation__Group_2__3 : rule__GlobalFieldInitialisation__Group_2__3__Impl ;
    public final void rule__GlobalFieldInitialisation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5938:1: ( rule__GlobalFieldInitialisation__Group_2__3__Impl )
            // InternalGridGame.g:5939:2: rule__GlobalFieldInitialisation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__3"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2__3__Impl"
    // InternalGridGame.g:5945:1: rule__GlobalFieldInitialisation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__GlobalFieldInitialisation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5949:1: ( ( ')' ) )
            // InternalGridGame.g:5950:1: ( ')' )
            {
            // InternalGridGame.g:5950:1: ( ')' )
            // InternalGridGame.g:5951:1: ')'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getRightParenthesisKeyword_2_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2__3__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2_2__0"
    // InternalGridGame.g:5972:1: rule__GlobalFieldInitialisation__Group_2_2__0 : rule__GlobalFieldInitialisation__Group_2_2__0__Impl rule__GlobalFieldInitialisation__Group_2_2__1 ;
    public final void rule__GlobalFieldInitialisation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5976:1: ( rule__GlobalFieldInitialisation__Group_2_2__0__Impl rule__GlobalFieldInitialisation__Group_2_2__1 )
            // InternalGridGame.g:5977:2: rule__GlobalFieldInitialisation__Group_2_2__0__Impl rule__GlobalFieldInitialisation__Group_2_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GlobalFieldInitialisation__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2_2__0"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2_2__0__Impl"
    // InternalGridGame.g:5984:1: rule__GlobalFieldInitialisation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__GlobalFieldInitialisation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:5988:1: ( ( ',' ) )
            // InternalGridGame.g:5989:1: ( ',' )
            {
            // InternalGridGame.g:5989:1: ( ',' )
            // InternalGridGame.g:5990:1: ','
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getCommaKeyword_2_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2_2__0__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2_2__1"
    // InternalGridGame.g:6003:1: rule__GlobalFieldInitialisation__Group_2_2__1 : rule__GlobalFieldInitialisation__Group_2_2__1__Impl ;
    public final void rule__GlobalFieldInitialisation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6007:1: ( rule__GlobalFieldInitialisation__Group_2_2__1__Impl )
            // InternalGridGame.g:6008:2: rule__GlobalFieldInitialisation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2_2__1"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_2_2__1__Impl"
    // InternalGridGame.g:6014:1: rule__GlobalFieldInitialisation__Group_2_2__1__Impl : ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6018:1: ( ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1 ) ) )
            // InternalGridGame.g:6019:1: ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1 ) )
            {
            // InternalGridGame.g:6019:1: ( ( rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1 ) )
            // InternalGridGame.g:6020:1: ( rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getParamsAssignment_2_2_1()); 
            // InternalGridGame.g:6021:1: ( rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1 )
            // InternalGridGame.g:6021:2: rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_2_2__1__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_4__0"
    // InternalGridGame.g:6035:1: rule__GlobalFieldInitialisation__Group_4__0 : rule__GlobalFieldInitialisation__Group_4__0__Impl rule__GlobalFieldInitialisation__Group_4__1 ;
    public final void rule__GlobalFieldInitialisation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6039:1: ( rule__GlobalFieldInitialisation__Group_4__0__Impl rule__GlobalFieldInitialisation__Group_4__1 )
            // InternalGridGame.g:6040:2: rule__GlobalFieldInitialisation__Group_4__0__Impl rule__GlobalFieldInitialisation__Group_4__1
            {
            pushFollow(FOLLOW_44);
            rule__GlobalFieldInitialisation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_4__0"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_4__0__Impl"
    // InternalGridGame.g:6047:1: rule__GlobalFieldInitialisation__Group_4__0__Impl : ( ( rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0 ) ) ;
    public final void rule__GlobalFieldInitialisation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6051:1: ( ( ( rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0 ) ) )
            // InternalGridGame.g:6052:1: ( ( rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0 ) )
            {
            // InternalGridGame.g:6052:1: ( ( rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0 ) )
            // InternalGridGame.g:6053:1: ( rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0 )
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getInitialisationsAssignment_4_0()); 
            // InternalGridGame.g:6054:1: ( rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0 )
            // InternalGridGame.g:6054:2: rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalFieldInitialisationAccess().getInitialisationsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_4__0__Impl"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_4__1"
    // InternalGridGame.g:6064:1: rule__GlobalFieldInitialisation__Group_4__1 : rule__GlobalFieldInitialisation__Group_4__1__Impl ;
    public final void rule__GlobalFieldInitialisation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6068:1: ( rule__GlobalFieldInitialisation__Group_4__1__Impl )
            // InternalGridGame.g:6069:2: rule__GlobalFieldInitialisation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalFieldInitialisation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_4__1"


    // $ANTLR start "rule__GlobalFieldInitialisation__Group_4__1__Impl"
    // InternalGridGame.g:6075:1: rule__GlobalFieldInitialisation__Group_4__1__Impl : ( ';' ) ;
    public final void rule__GlobalFieldInitialisation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6079:1: ( ( ';' ) )
            // InternalGridGame.g:6080:1: ( ';' )
            {
            // InternalGridGame.g:6080:1: ( ';' )
            // InternalGridGame.g:6081:1: ';'
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getSemicolonKeyword_4_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__Group_4__1__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group__0"
    // InternalGridGame.g:6098:1: rule__FieldInitialisationsRef__Group__0 : rule__FieldInitialisationsRef__Group__0__Impl rule__FieldInitialisationsRef__Group__1 ;
    public final void rule__FieldInitialisationsRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6102:1: ( rule__FieldInitialisationsRef__Group__0__Impl rule__FieldInitialisationsRef__Group__1 )
            // InternalGridGame.g:6103:2: rule__FieldInitialisationsRef__Group__0__Impl rule__FieldInitialisationsRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FieldInitialisationsRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group__0"


    // $ANTLR start "rule__FieldInitialisationsRef__Group__0__Impl"
    // InternalGridGame.g:6110:1: rule__FieldInitialisationsRef__Group__0__Impl : ( 'init' ) ;
    public final void rule__FieldInitialisationsRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6114:1: ( ( 'init' ) )
            // InternalGridGame.g:6115:1: ( 'init' )
            {
            // InternalGridGame.g:6115:1: ( 'init' )
            // InternalGridGame.g:6116:1: 'init'
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getInitKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFieldInitialisationsRefAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group__0__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group__1"
    // InternalGridGame.g:6129:1: rule__FieldInitialisationsRef__Group__1 : rule__FieldInitialisationsRef__Group__1__Impl rule__FieldInitialisationsRef__Group__2 ;
    public final void rule__FieldInitialisationsRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6133:1: ( rule__FieldInitialisationsRef__Group__1__Impl rule__FieldInitialisationsRef__Group__2 )
            // InternalGridGame.g:6134:2: rule__FieldInitialisationsRef__Group__1__Impl rule__FieldInitialisationsRef__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__FieldInitialisationsRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group__1"


    // $ANTLR start "rule__FieldInitialisationsRef__Group__1__Impl"
    // InternalGridGame.g:6141:1: rule__FieldInitialisationsRef__Group__1__Impl : ( ( rule__FieldInitialisationsRef__RefAssignment_1 ) ) ;
    public final void rule__FieldInitialisationsRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6145:1: ( ( ( rule__FieldInitialisationsRef__RefAssignment_1 ) ) )
            // InternalGridGame.g:6146:1: ( ( rule__FieldInitialisationsRef__RefAssignment_1 ) )
            {
            // InternalGridGame.g:6146:1: ( ( rule__FieldInitialisationsRef__RefAssignment_1 ) )
            // InternalGridGame.g:6147:1: ( rule__FieldInitialisationsRef__RefAssignment_1 )
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getRefAssignment_1()); 
            // InternalGridGame.g:6148:1: ( rule__FieldInitialisationsRef__RefAssignment_1 )
            // InternalGridGame.g:6148:2: rule__FieldInitialisationsRef__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsRefAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group__1__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group__2"
    // InternalGridGame.g:6158:1: rule__FieldInitialisationsRef__Group__2 : rule__FieldInitialisationsRef__Group__2__Impl ;
    public final void rule__FieldInitialisationsRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6162:1: ( rule__FieldInitialisationsRef__Group__2__Impl )
            // InternalGridGame.g:6163:2: rule__FieldInitialisationsRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group__2"


    // $ANTLR start "rule__FieldInitialisationsRef__Group__2__Impl"
    // InternalGridGame.g:6169:1: rule__FieldInitialisationsRef__Group__2__Impl : ( ( rule__FieldInitialisationsRef__Group_2__0 )? ) ;
    public final void rule__FieldInitialisationsRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6173:1: ( ( ( rule__FieldInitialisationsRef__Group_2__0 )? ) )
            // InternalGridGame.g:6174:1: ( ( rule__FieldInitialisationsRef__Group_2__0 )? )
            {
            // InternalGridGame.g:6174:1: ( ( rule__FieldInitialisationsRef__Group_2__0 )? )
            // InternalGridGame.g:6175:1: ( rule__FieldInitialisationsRef__Group_2__0 )?
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getGroup_2()); 
            // InternalGridGame.g:6176:1: ( rule__FieldInitialisationsRef__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGridGame.g:6176:2: rule__FieldInitialisationsRef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInitialisationsRef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInitialisationsRefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group__2__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__0"
    // InternalGridGame.g:6192:1: rule__FieldInitialisationsRef__Group_2__0 : rule__FieldInitialisationsRef__Group_2__0__Impl rule__FieldInitialisationsRef__Group_2__1 ;
    public final void rule__FieldInitialisationsRef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6196:1: ( rule__FieldInitialisationsRef__Group_2__0__Impl rule__FieldInitialisationsRef__Group_2__1 )
            // InternalGridGame.g:6197:2: rule__FieldInitialisationsRef__Group_2__0__Impl rule__FieldInitialisationsRef__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__FieldInitialisationsRef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__0"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__0__Impl"
    // InternalGridGame.g:6204:1: rule__FieldInitialisationsRef__Group_2__0__Impl : ( '(' ) ;
    public final void rule__FieldInitialisationsRef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6208:1: ( ( '(' ) )
            // InternalGridGame.g:6209:1: ( '(' )
            {
            // InternalGridGame.g:6209:1: ( '(' )
            // InternalGridGame.g:6210:1: '('
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFieldInitialisationsRefAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__0__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__1"
    // InternalGridGame.g:6223:1: rule__FieldInitialisationsRef__Group_2__1 : rule__FieldInitialisationsRef__Group_2__1__Impl rule__FieldInitialisationsRef__Group_2__2 ;
    public final void rule__FieldInitialisationsRef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6227:1: ( rule__FieldInitialisationsRef__Group_2__1__Impl rule__FieldInitialisationsRef__Group_2__2 )
            // InternalGridGame.g:6228:2: rule__FieldInitialisationsRef__Group_2__1__Impl rule__FieldInitialisationsRef__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__FieldInitialisationsRef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__1"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__1__Impl"
    // InternalGridGame.g:6235:1: rule__FieldInitialisationsRef__Group_2__1__Impl : ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_1 ) ) ;
    public final void rule__FieldInitialisationsRef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6239:1: ( ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_1 ) ) )
            // InternalGridGame.g:6240:1: ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_1 ) )
            {
            // InternalGridGame.g:6240:1: ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_1 ) )
            // InternalGridGame.g:6241:1: ( rule__FieldInitialisationsRef__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getParamsAssignment_2_1()); 
            // InternalGridGame.g:6242:1: ( rule__FieldInitialisationsRef__ParamsAssignment_2_1 )
            // InternalGridGame.g:6242:2: rule__FieldInitialisationsRef__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsRefAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__1__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__2"
    // InternalGridGame.g:6252:1: rule__FieldInitialisationsRef__Group_2__2 : rule__FieldInitialisationsRef__Group_2__2__Impl rule__FieldInitialisationsRef__Group_2__3 ;
    public final void rule__FieldInitialisationsRef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6256:1: ( rule__FieldInitialisationsRef__Group_2__2__Impl rule__FieldInitialisationsRef__Group_2__3 )
            // InternalGridGame.g:6257:2: rule__FieldInitialisationsRef__Group_2__2__Impl rule__FieldInitialisationsRef__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__FieldInitialisationsRef__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__2"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__2__Impl"
    // InternalGridGame.g:6264:1: rule__FieldInitialisationsRef__Group_2__2__Impl : ( ( rule__FieldInitialisationsRef__Group_2_2__0 )* ) ;
    public final void rule__FieldInitialisationsRef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6268:1: ( ( ( rule__FieldInitialisationsRef__Group_2_2__0 )* ) )
            // InternalGridGame.g:6269:1: ( ( rule__FieldInitialisationsRef__Group_2_2__0 )* )
            {
            // InternalGridGame.g:6269:1: ( ( rule__FieldInitialisationsRef__Group_2_2__0 )* )
            // InternalGridGame.g:6270:1: ( rule__FieldInitialisationsRef__Group_2_2__0 )*
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getGroup_2_2()); 
            // InternalGridGame.g:6271:1: ( rule__FieldInitialisationsRef__Group_2_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGridGame.g:6271:2: rule__FieldInitialisationsRef__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FieldInitialisationsRef__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getFieldInitialisationsRefAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__2__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__3"
    // InternalGridGame.g:6281:1: rule__FieldInitialisationsRef__Group_2__3 : rule__FieldInitialisationsRef__Group_2__3__Impl ;
    public final void rule__FieldInitialisationsRef__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6285:1: ( rule__FieldInitialisationsRef__Group_2__3__Impl )
            // InternalGridGame.g:6286:2: rule__FieldInitialisationsRef__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__3"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2__3__Impl"
    // InternalGridGame.g:6292:1: rule__FieldInitialisationsRef__Group_2__3__Impl : ( ')' ) ;
    public final void rule__FieldInitialisationsRef__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6296:1: ( ( ')' ) )
            // InternalGridGame.g:6297:1: ( ')' )
            {
            // InternalGridGame.g:6297:1: ( ')' )
            // InternalGridGame.g:6298:1: ')'
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getRightParenthesisKeyword_2_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFieldInitialisationsRefAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2__3__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2_2__0"
    // InternalGridGame.g:6319:1: rule__FieldInitialisationsRef__Group_2_2__0 : rule__FieldInitialisationsRef__Group_2_2__0__Impl rule__FieldInitialisationsRef__Group_2_2__1 ;
    public final void rule__FieldInitialisationsRef__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6323:1: ( rule__FieldInitialisationsRef__Group_2_2__0__Impl rule__FieldInitialisationsRef__Group_2_2__1 )
            // InternalGridGame.g:6324:2: rule__FieldInitialisationsRef__Group_2_2__0__Impl rule__FieldInitialisationsRef__Group_2_2__1
            {
            pushFollow(FOLLOW_24);
            rule__FieldInitialisationsRef__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2_2__0"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2_2__0__Impl"
    // InternalGridGame.g:6331:1: rule__FieldInitialisationsRef__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FieldInitialisationsRef__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6335:1: ( ( ',' ) )
            // InternalGridGame.g:6336:1: ( ',' )
            {
            // InternalGridGame.g:6336:1: ( ',' )
            // InternalGridGame.g:6337:1: ','
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getCommaKeyword_2_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFieldInitialisationsRefAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2_2__0__Impl"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2_2__1"
    // InternalGridGame.g:6350:1: rule__FieldInitialisationsRef__Group_2_2__1 : rule__FieldInitialisationsRef__Group_2_2__1__Impl ;
    public final void rule__FieldInitialisationsRef__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6354:1: ( rule__FieldInitialisationsRef__Group_2_2__1__Impl )
            // InternalGridGame.g:6355:2: rule__FieldInitialisationsRef__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2_2__1"


    // $ANTLR start "rule__FieldInitialisationsRef__Group_2_2__1__Impl"
    // InternalGridGame.g:6361:1: rule__FieldInitialisationsRef__Group_2_2__1__Impl : ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__FieldInitialisationsRef__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6365:1: ( ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_2_1 ) ) )
            // InternalGridGame.g:6366:1: ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_2_1 ) )
            {
            // InternalGridGame.g:6366:1: ( ( rule__FieldInitialisationsRef__ParamsAssignment_2_2_1 ) )
            // InternalGridGame.g:6367:1: ( rule__FieldInitialisationsRef__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getParamsAssignment_2_2_1()); 
            // InternalGridGame.g:6368:1: ( rule__FieldInitialisationsRef__ParamsAssignment_2_2_1 )
            // InternalGridGame.g:6368:2: rule__FieldInitialisationsRef__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInitialisationsRef__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsRefAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__Group_2_2__1__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__0"
    // InternalGridGame.g:6382:1: rule__LocalFieldInitialisations__Group__0 : rule__LocalFieldInitialisations__Group__0__Impl rule__LocalFieldInitialisations__Group__1 ;
    public final void rule__LocalFieldInitialisations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6386:1: ( rule__LocalFieldInitialisations__Group__0__Impl rule__LocalFieldInitialisations__Group__1 )
            // InternalGridGame.g:6387:2: rule__LocalFieldInitialisations__Group__0__Impl rule__LocalFieldInitialisations__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LocalFieldInitialisations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__0"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__0__Impl"
    // InternalGridGame.g:6394:1: rule__LocalFieldInitialisations__Group__0__Impl : ( 'init' ) ;
    public final void rule__LocalFieldInitialisations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6398:1: ( ( 'init' ) )
            // InternalGridGame.g:6399:1: ( 'init' )
            {
            // InternalGridGame.g:6399:1: ( 'init' )
            // InternalGridGame.g:6400:1: 'init'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getInitKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__0__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__1"
    // InternalGridGame.g:6413:1: rule__LocalFieldInitialisations__Group__1 : rule__LocalFieldInitialisations__Group__1__Impl rule__LocalFieldInitialisations__Group__2 ;
    public final void rule__LocalFieldInitialisations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6417:1: ( rule__LocalFieldInitialisations__Group__1__Impl rule__LocalFieldInitialisations__Group__2 )
            // InternalGridGame.g:6418:2: rule__LocalFieldInitialisations__Group__1__Impl rule__LocalFieldInitialisations__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__LocalFieldInitialisations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__1"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__1__Impl"
    // InternalGridGame.g:6425:1: rule__LocalFieldInitialisations__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalFieldInitialisations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6429:1: ( ( '{' ) )
            // InternalGridGame.g:6430:1: ( '{' )
            {
            // InternalGridGame.g:6430:1: ( '{' )
            // InternalGridGame.g:6431:1: '{'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__1__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__2"
    // InternalGridGame.g:6444:1: rule__LocalFieldInitialisations__Group__2 : rule__LocalFieldInitialisations__Group__2__Impl rule__LocalFieldInitialisations__Group__3 ;
    public final void rule__LocalFieldInitialisations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6448:1: ( rule__LocalFieldInitialisations__Group__2__Impl rule__LocalFieldInitialisations__Group__3 )
            // InternalGridGame.g:6449:2: rule__LocalFieldInitialisations__Group__2__Impl rule__LocalFieldInitialisations__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LocalFieldInitialisations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__2"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__2__Impl"
    // InternalGridGame.g:6456:1: rule__LocalFieldInitialisations__Group__2__Impl : ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) ) ;
    public final void rule__LocalFieldInitialisations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6460:1: ( ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) ) )
            // InternalGridGame.g:6461:1: ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) )
            {
            // InternalGridGame.g:6461:1: ( ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* ) )
            // InternalGridGame.g:6462:1: ( ( rule__LocalFieldInitialisations__Group_2__0 ) ) ( ( rule__LocalFieldInitialisations__Group_2__0 )* )
            {
            // InternalGridGame.g:6462:1: ( ( rule__LocalFieldInitialisations__Group_2__0 ) )
            // InternalGridGame.g:6463:1: ( rule__LocalFieldInitialisations__Group_2__0 )
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 
            // InternalGridGame.g:6464:1: ( rule__LocalFieldInitialisations__Group_2__0 )
            // InternalGridGame.g:6464:2: rule__LocalFieldInitialisations__Group_2__0
            {
            pushFollow(FOLLOW_43);
            rule__LocalFieldInitialisations__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 

            }

            // InternalGridGame.g:6467:1: ( ( rule__LocalFieldInitialisations__Group_2__0 )* )
            // InternalGridGame.g:6468:1: ( rule__LocalFieldInitialisations__Group_2__0 )*
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 
            // InternalGridGame.g:6469:1: ( rule__LocalFieldInitialisations__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==45||LA38_0==57||LA38_0==59) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGridGame.g:6469:2: rule__LocalFieldInitialisations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__LocalFieldInitialisations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getLocalFieldInitialisationsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__LocalFieldInitialisations__Group__2__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__3"
    // InternalGridGame.g:6480:1: rule__LocalFieldInitialisations__Group__3 : rule__LocalFieldInitialisations__Group__3__Impl ;
    public final void rule__LocalFieldInitialisations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6484:1: ( rule__LocalFieldInitialisations__Group__3__Impl )
            // InternalGridGame.g:6485:2: rule__LocalFieldInitialisations__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__3"


    // $ANTLR start "rule__LocalFieldInitialisations__Group__3__Impl"
    // InternalGridGame.g:6491:1: rule__LocalFieldInitialisations__Group__3__Impl : ( '}' ) ;
    public final void rule__LocalFieldInitialisations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6495:1: ( ( '}' ) )
            // InternalGridGame.g:6496:1: ( '}' )
            {
            // InternalGridGame.g:6496:1: ( '}' )
            // InternalGridGame.g:6497:1: '}'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group__3__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__0"
    // InternalGridGame.g:6518:1: rule__LocalFieldInitialisations__Group_2__0 : rule__LocalFieldInitialisations__Group_2__0__Impl rule__LocalFieldInitialisations__Group_2__1 ;
    public final void rule__LocalFieldInitialisations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6522:1: ( rule__LocalFieldInitialisations__Group_2__0__Impl rule__LocalFieldInitialisations__Group_2__1 )
            // InternalGridGame.g:6523:2: rule__LocalFieldInitialisations__Group_2__0__Impl rule__LocalFieldInitialisations__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__LocalFieldInitialisations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__0"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__0__Impl"
    // InternalGridGame.g:6530:1: rule__LocalFieldInitialisations__Group_2__0__Impl : ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) ) ;
    public final void rule__LocalFieldInitialisations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6534:1: ( ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) ) )
            // InternalGridGame.g:6535:1: ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) )
            {
            // InternalGridGame.g:6535:1: ( ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 ) )
            // InternalGridGame.g:6536:1: ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 )
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 
            // InternalGridGame.g:6537:1: ( rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 )
            // InternalGridGame.g:6537:2: rule__LocalFieldInitialisations__InitialisationsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__InitialisationsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__0__Impl"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__1"
    // InternalGridGame.g:6547:1: rule__LocalFieldInitialisations__Group_2__1 : rule__LocalFieldInitialisations__Group_2__1__Impl ;
    public final void rule__LocalFieldInitialisations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6551:1: ( rule__LocalFieldInitialisations__Group_2__1__Impl )
            // InternalGridGame.g:6552:2: rule__LocalFieldInitialisations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalFieldInitialisations__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__1"


    // $ANTLR start "rule__LocalFieldInitialisations__Group_2__1__Impl"
    // InternalGridGame.g:6558:1: rule__LocalFieldInitialisations__Group_2__1__Impl : ( ';' ) ;
    public final void rule__LocalFieldInitialisations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6562:1: ( ( ';' ) )
            // InternalGridGame.g:6563:1: ( ';' )
            {
            // InternalGridGame.g:6563:1: ( ';' )
            // InternalGridGame.g:6564:1: ';'
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLocalFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__Group_2__1__Impl"


    // $ANTLR start "rule__DefaultInitialisation__Group__0"
    // InternalGridGame.g:6581:1: rule__DefaultInitialisation__Group__0 : rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 ;
    public final void rule__DefaultInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6585:1: ( rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 )
            // InternalGridGame.g:6586:2: rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__DefaultInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6593:1: rule__DefaultInitialisation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6597:1: ( ( 'default' ) )
            // InternalGridGame.g:6598:1: ( 'default' )
            {
            // InternalGridGame.g:6598:1: ( 'default' )
            // InternalGridGame.g:6599:1: 'default'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalGridGame.g:6612:1: rule__DefaultInitialisation__Group__1 : rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 ;
    public final void rule__DefaultInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6616:1: ( rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 )
            // InternalGridGame.g:6617:2: rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DefaultInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6624:1: rule__DefaultInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6628:1: ( ( ':' ) )
            // InternalGridGame.g:6629:1: ( ':' )
            {
            // InternalGridGame.g:6629:1: ( ':' )
            // InternalGridGame.g:6630:1: ':'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalGridGame.g:6643:1: rule__DefaultInitialisation__Group__2 : rule__DefaultInitialisation__Group__2__Impl ;
    public final void rule__DefaultInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6647:1: ( rule__DefaultInitialisation__Group__2__Impl )
            // InternalGridGame.g:6648:2: rule__DefaultInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6654:1: rule__DefaultInitialisation__Group__2__Impl : ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) ;
    public final void rule__DefaultInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6658:1: ( ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) )
            // InternalGridGame.g:6659:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            {
            // InternalGridGame.g:6659:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            // InternalGridGame.g:6660:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellAssignment_2()); 
            // InternalGridGame.g:6661:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            // InternalGridGame.g:6661:2: rule__DefaultInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6677:1: rule__RandomInitialisation__Group__0 : rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 ;
    public final void rule__RandomInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6681:1: ( rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 )
            // InternalGridGame.g:6682:2: rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__RandomInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6689:1: rule__RandomInitialisation__Group__0__Impl : ( 'random' ) ;
    public final void rule__RandomInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6693:1: ( ( 'random' ) )
            // InternalGridGame.g:6694:1: ( 'random' )
            {
            // InternalGridGame.g:6694:1: ( 'random' )
            // InternalGridGame.g:6695:1: 'random'
            {
             before(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalGridGame.g:6708:1: rule__RandomInitialisation__Group__1 : rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 ;
    public final void rule__RandomInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6712:1: ( rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 )
            // InternalGridGame.g:6713:2: rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RandomInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6720:1: rule__RandomInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__RandomInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6724:1: ( ( ':' ) )
            // InternalGridGame.g:6725:1: ( ':' )
            {
            // InternalGridGame.g:6725:1: ( ':' )
            // InternalGridGame.g:6726:1: ':'
            {
             before(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalGridGame.g:6739:1: rule__RandomInitialisation__Group__2 : rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 ;
    public final void rule__RandomInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6743:1: ( rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 )
            // InternalGridGame.g:6744:2: rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__RandomInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6751:1: rule__RandomInitialisation__Group__2__Impl : ( ( rule__RandomInitialisation__CellAssignment_2 ) ) ;
    public final void rule__RandomInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6755:1: ( ( ( rule__RandomInitialisation__CellAssignment_2 ) ) )
            // InternalGridGame.g:6756:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            {
            // InternalGridGame.g:6756:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            // InternalGridGame.g:6757:1: ( rule__RandomInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellAssignment_2()); 
            // InternalGridGame.g:6758:1: ( rule__RandomInitialisation__CellAssignment_2 )
            // InternalGridGame.g:6758:2: rule__RandomInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6768:1: rule__RandomInitialisation__Group__3 : rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 ;
    public final void rule__RandomInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6772:1: ( rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 )
            // InternalGridGame.g:6773:2: rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__RandomInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6780:1: rule__RandomInitialisation__Group__3__Impl : ( '=' ) ;
    public final void rule__RandomInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6784:1: ( ( '=' ) )
            // InternalGridGame.g:6785:1: ( '=' )
            {
            // InternalGridGame.g:6785:1: ( '=' )
            // InternalGridGame.g:6786:1: '='
            {
             before(grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGridGame.g:6799:1: rule__RandomInitialisation__Group__4 : rule__RandomInitialisation__Group__4__Impl ;
    public final void rule__RandomInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6803:1: ( rule__RandomInitialisation__Group__4__Impl )
            // InternalGridGame.g:6804:2: rule__RandomInitialisation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6810:1: rule__RandomInitialisation__Group__4__Impl : ( ( rule__RandomInitialisation__Alternatives_4 ) ) ;
    public final void rule__RandomInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6814:1: ( ( ( rule__RandomInitialisation__Alternatives_4 ) ) )
            // InternalGridGame.g:6815:1: ( ( rule__RandomInitialisation__Alternatives_4 ) )
            {
            // InternalGridGame.g:6815:1: ( ( rule__RandomInitialisation__Alternatives_4 ) )
            // InternalGridGame.g:6816:1: ( rule__RandomInitialisation__Alternatives_4 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getAlternatives_4()); 
            // InternalGridGame.g:6817:1: ( rule__RandomInitialisation__Alternatives_4 )
            // InternalGridGame.g:6817:2: rule__RandomInitialisation__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__RandomInitialisation__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRandomInitialisationAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalGridGame.g:6837:1: rule__ContextInitialisation__Group__0 : rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 ;
    public final void rule__ContextInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6841:1: ( rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 )
            // InternalGridGame.g:6842:2: rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__ContextInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6849:1: rule__ContextInitialisation__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6853:1: ( ( 'context' ) )
            // InternalGridGame.g:6854:1: ( 'context' )
            {
            // InternalGridGame.g:6854:1: ( 'context' )
            // InternalGridGame.g:6855:1: 'context'
            {
             before(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalGridGame.g:6868:1: rule__ContextInitialisation__Group__1 : rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 ;
    public final void rule__ContextInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6872:1: ( rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 )
            // InternalGridGame.g:6873:2: rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ContextInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6880:1: rule__ContextInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__ContextInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6884:1: ( ( ':' ) )
            // InternalGridGame.g:6885:1: ( ':' )
            {
            // InternalGridGame.g:6885:1: ( ':' )
            // InternalGridGame.g:6886:1: ':'
            {
             before(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalGridGame.g:6899:1: rule__ContextInitialisation__Group__2 : rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 ;
    public final void rule__ContextInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6903:1: ( rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 )
            // InternalGridGame.g:6904:2: rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__ContextInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6911:1: rule__ContextInitialisation__Group__2__Impl : ( ( rule__ContextInitialisation__CellAssignment_2 ) ) ;
    public final void rule__ContextInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6915:1: ( ( ( rule__ContextInitialisation__CellAssignment_2 ) ) )
            // InternalGridGame.g:6916:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            {
            // InternalGridGame.g:6916:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            // InternalGridGame.g:6917:1: ( rule__ContextInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellAssignment_2()); 
            // InternalGridGame.g:6918:1: ( rule__ContextInitialisation__CellAssignment_2 )
            // InternalGridGame.g:6918:2: rule__ContextInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6928:1: rule__ContextInitialisation__Group__3 : rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 ;
    public final void rule__ContextInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6932:1: ( rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 )
            // InternalGridGame.g:6933:2: rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__ContextInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6940:1: rule__ContextInitialisation__Group__3__Impl : ( 'check' ) ;
    public final void rule__ContextInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6944:1: ( ( 'check' ) )
            // InternalGridGame.g:6945:1: ( 'check' )
            {
            // InternalGridGame.g:6945:1: ( 'check' )
            // InternalGridGame.g:6946:1: 'check'
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckKeyword_3()); 
            match(input,60,FOLLOW_2); 
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
    // InternalGridGame.g:6959:1: rule__ContextInitialisation__Group__4 : rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 ;
    public final void rule__ContextInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6963:1: ( rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 )
            // InternalGridGame.g:6964:2: rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__ContextInitialisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6971:1: rule__ContextInitialisation__Group__4__Impl : ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) ;
    public final void rule__ContextInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6975:1: ( ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) )
            // InternalGridGame.g:6976:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            {
            // InternalGridGame.g:6976:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            // InternalGridGame.g:6977:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckAssignment_4()); 
            // InternalGridGame.g:6978:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            // InternalGridGame.g:6978:2: rule__ContextInitialisation__CheckAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:6988:1: rule__ContextInitialisation__Group__5 : rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 ;
    public final void rule__ContextInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:6992:1: ( rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 )
            // InternalGridGame.g:6993:2: rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__ContextInitialisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7000:1: rule__ContextInitialisation__Group__5__Impl : ( 'value' ) ;
    public final void rule__ContextInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7004:1: ( ( 'value' ) )
            // InternalGridGame.g:7005:1: ( 'value' )
            {
            // InternalGridGame.g:7005:1: ( 'value' )
            // InternalGridGame.g:7006:1: 'value'
            {
             before(grammarAccess.getContextInitialisationAccess().getValueKeyword_5()); 
            match(input,61,FOLLOW_2); 
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
    // InternalGridGame.g:7019:1: rule__ContextInitialisation__Group__6 : rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 ;
    public final void rule__ContextInitialisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7023:1: ( rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 )
            // InternalGridGame.g:7024:2: rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__ContextInitialisation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7031:1: rule__ContextInitialisation__Group__6__Impl : ( '=' ) ;
    public final void rule__ContextInitialisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7035:1: ( ( '=' ) )
            // InternalGridGame.g:7036:1: ( '=' )
            {
            // InternalGridGame.g:7036:1: ( '=' )
            // InternalGridGame.g:7037:1: '='
            {
             before(grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGridGame.g:7050:1: rule__ContextInitialisation__Group__7 : rule__ContextInitialisation__Group__7__Impl ;
    public final void rule__ContextInitialisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7054:1: ( rule__ContextInitialisation__Group__7__Impl )
            // InternalGridGame.g:7055:2: rule__ContextInitialisation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7061:1: rule__ContextInitialisation__Group__7__Impl : ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) ;
    public final void rule__ContextInitialisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7065:1: ( ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) )
            // InternalGridGame.g:7066:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            {
            // InternalGridGame.g:7066:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            // InternalGridGame.g:7067:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            {
             before(grammarAccess.getContextInitialisationAccess().getExpAssignment_7()); 
            // InternalGridGame.g:7068:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            // InternalGridGame.g:7068:2: rule__ContextInitialisation__ExpAssignment_7
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7094:1: rule__ContextExpression__Group__0 : rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 ;
    public final void rule__ContextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7098:1: ( rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 )
            // InternalGridGame.g:7099:2: rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__ContextExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7106:1: rule__ContextExpression__Group__0__Impl : ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) ;
    public final void rule__ContextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7110:1: ( ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) )
            // InternalGridGame.g:7111:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            {
            // InternalGridGame.g:7111:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            // InternalGridGame.g:7112:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 
            // InternalGridGame.g:7113:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            // InternalGridGame.g:7113:2: rule__ContextExpression__Sub_expAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7123:1: rule__ContextExpression__Group__1 : rule__ContextExpression__Group__1__Impl ;
    public final void rule__ContextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7127:1: ( rule__ContextExpression__Group__1__Impl )
            // InternalGridGame.g:7128:2: rule__ContextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7134:1: rule__ContextExpression__Group__1__Impl : ( ( rule__ContextExpression__Group_1__0 )* ) ;
    public final void rule__ContextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7138:1: ( ( ( rule__ContextExpression__Group_1__0 )* ) )
            // InternalGridGame.g:7139:1: ( ( rule__ContextExpression__Group_1__0 )* )
            {
            // InternalGridGame.g:7139:1: ( ( rule__ContextExpression__Group_1__0 )* )
            // InternalGridGame.g:7140:1: ( rule__ContextExpression__Group_1__0 )*
            {
             before(grammarAccess.getContextExpressionAccess().getGroup_1()); 
            // InternalGridGame.g:7141:1: ( rule__ContextExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==62) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGridGame.g:7141:2: rule__ContextExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__ContextExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalGridGame.g:7155:1: rule__ContextExpression__Group_1__0 : rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 ;
    public final void rule__ContextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7159:1: ( rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 )
            // InternalGridGame.g:7160:2: rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__ContextExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7167:1: rule__ContextExpression__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ContextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7171:1: ( ( '.' ) )
            // InternalGridGame.g:7172:1: ( '.' )
            {
            // InternalGridGame.g:7172:1: ( '.' )
            // InternalGridGame.g:7173:1: '.'
            {
             before(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalGridGame.g:7186:1: rule__ContextExpression__Group_1__1 : rule__ContextExpression__Group_1__1__Impl ;
    public final void rule__ContextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7190:1: ( rule__ContextExpression__Group_1__1__Impl )
            // InternalGridGame.g:7191:2: rule__ContextExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7197:1: rule__ContextExpression__Group_1__1__Impl : ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) ;
    public final void rule__ContextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7201:1: ( ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) )
            // InternalGridGame.g:7202:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            {
            // InternalGridGame.g:7202:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            // InternalGridGame.g:7203:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_1_1()); 
            // InternalGridGame.g:7204:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            // InternalGridGame.g:7204:2: rule__ContextExpression__Sub_expAssignment_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7218:1: rule__FilterExpression__Group__0 : rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 ;
    public final void rule__FilterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7222:1: ( rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 )
            // InternalGridGame.g:7223:2: rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__FilterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7230:1: rule__FilterExpression__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7234:1: ( ( 'filter' ) )
            // InternalGridGame.g:7235:1: ( 'filter' )
            {
            // InternalGridGame.g:7235:1: ( 'filter' )
            // InternalGridGame.g:7236:1: 'filter'
            {
             before(grammarAccess.getFilterExpressionAccess().getFilterKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalGridGame.g:7249:1: rule__FilterExpression__Group__1 : rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 ;
    public final void rule__FilterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7253:1: ( rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 )
            // InternalGridGame.g:7254:2: rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__FilterExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7261:1: rule__FilterExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__FilterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7265:1: ( ( '(' ) )
            // InternalGridGame.g:7266:1: ( '(' )
            {
            // InternalGridGame.g:7266:1: ( '(' )
            // InternalGridGame.g:7267:1: '('
            {
             before(grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGridGame.g:7280:1: rule__FilterExpression__Group__2 : rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 ;
    public final void rule__FilterExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7284:1: ( rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 )
            // InternalGridGame.g:7285:2: rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__FilterExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7292:1: rule__FilterExpression__Group__2__Impl : ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) ;
    public final void rule__FilterExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7296:1: ( ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) )
            // InternalGridGame.g:7297:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            {
            // InternalGridGame.g:7297:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            // InternalGridGame.g:7298:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeAssignment_2()); 
            // InternalGridGame.g:7299:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            // InternalGridGame.g:7299:2: rule__FilterExpression__Cell_typeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7309:1: rule__FilterExpression__Group__3 : rule__FilterExpression__Group__3__Impl ;
    public final void rule__FilterExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7313:1: ( rule__FilterExpression__Group__3__Impl )
            // InternalGridGame.g:7314:2: rule__FilterExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7320:1: rule__FilterExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7324:1: ( ( ')' ) )
            // InternalGridGame.g:7325:1: ( ')' )
            {
            // InternalGridGame.g:7325:1: ( ')' )
            // InternalGridGame.g:7326:1: ')'
            {
             before(grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__StateFilterExpression__Group__0"
    // InternalGridGame.g:7347:1: rule__StateFilterExpression__Group__0 : rule__StateFilterExpression__Group__0__Impl rule__StateFilterExpression__Group__1 ;
    public final void rule__StateFilterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7351:1: ( rule__StateFilterExpression__Group__0__Impl rule__StateFilterExpression__Group__1 )
            // InternalGridGame.g:7352:2: rule__StateFilterExpression__Group__0__Impl rule__StateFilterExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__StateFilterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__0"


    // $ANTLR start "rule__StateFilterExpression__Group__0__Impl"
    // InternalGridGame.g:7359:1: rule__StateFilterExpression__Group__0__Impl : ( 'inState' ) ;
    public final void rule__StateFilterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7363:1: ( ( 'inState' ) )
            // InternalGridGame.g:7364:1: ( 'inState' )
            {
            // InternalGridGame.g:7364:1: ( 'inState' )
            // InternalGridGame.g:7365:1: 'inState'
            {
             before(grammarAccess.getStateFilterExpressionAccess().getInStateKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getInStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__0__Impl"


    // $ANTLR start "rule__StateFilterExpression__Group__1"
    // InternalGridGame.g:7378:1: rule__StateFilterExpression__Group__1 : rule__StateFilterExpression__Group__1__Impl rule__StateFilterExpression__Group__2 ;
    public final void rule__StateFilterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7382:1: ( rule__StateFilterExpression__Group__1__Impl rule__StateFilterExpression__Group__2 )
            // InternalGridGame.g:7383:2: rule__StateFilterExpression__Group__1__Impl rule__StateFilterExpression__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StateFilterExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__1"


    // $ANTLR start "rule__StateFilterExpression__Group__1__Impl"
    // InternalGridGame.g:7390:1: rule__StateFilterExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__StateFilterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7394:1: ( ( '(' ) )
            // InternalGridGame.g:7395:1: ( '(' )
            {
            // InternalGridGame.g:7395:1: ( '(' )
            // InternalGridGame.g:7396:1: '('
            {
             before(grammarAccess.getStateFilterExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__1__Impl"


    // $ANTLR start "rule__StateFilterExpression__Group__2"
    // InternalGridGame.g:7409:1: rule__StateFilterExpression__Group__2 : rule__StateFilterExpression__Group__2__Impl rule__StateFilterExpression__Group__3 ;
    public final void rule__StateFilterExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7413:1: ( rule__StateFilterExpression__Group__2__Impl rule__StateFilterExpression__Group__3 )
            // InternalGridGame.g:7414:2: rule__StateFilterExpression__Group__2__Impl rule__StateFilterExpression__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__StateFilterExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__2"


    // $ANTLR start "rule__StateFilterExpression__Group__2__Impl"
    // InternalGridGame.g:7421:1: rule__StateFilterExpression__Group__2__Impl : ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) ) ;
    public final void rule__StateFilterExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7425:1: ( ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) ) )
            // InternalGridGame.g:7426:1: ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) )
            {
            // InternalGridGame.g:7426:1: ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) )
            // InternalGridGame.g:7427:1: ( rule__StateFilterExpression__Cell_stateAssignment_2 )
            {
             before(grammarAccess.getStateFilterExpressionAccess().getCell_stateAssignment_2()); 
            // InternalGridGame.g:7428:1: ( rule__StateFilterExpression__Cell_stateAssignment_2 )
            // InternalGridGame.g:7428:2: rule__StateFilterExpression__Cell_stateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Cell_stateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateFilterExpressionAccess().getCell_stateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__2__Impl"


    // $ANTLR start "rule__StateFilterExpression__Group__3"
    // InternalGridGame.g:7438:1: rule__StateFilterExpression__Group__3 : rule__StateFilterExpression__Group__3__Impl ;
    public final void rule__StateFilterExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7442:1: ( rule__StateFilterExpression__Group__3__Impl )
            // InternalGridGame.g:7443:2: rule__StateFilterExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__3"


    // $ANTLR start "rule__StateFilterExpression__Group__3__Impl"
    // InternalGridGame.g:7449:1: rule__StateFilterExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__StateFilterExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7453:1: ( ( ')' ) )
            // InternalGridGame.g:7454:1: ( ')' )
            {
            // InternalGridGame.g:7454:1: ( ')' )
            // InternalGridGame.g:7455:1: ')'
            {
             before(grammarAccess.getStateFilterExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Group__3__Impl"


    // $ANTLR start "rule__CountExpression__Group__0"
    // InternalGridGame.g:7476:1: rule__CountExpression__Group__0 : rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 ;
    public final void rule__CountExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7480:1: ( rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 )
            // InternalGridGame.g:7481:2: rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CountExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7488:1: rule__CountExpression__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7492:1: ( ( 'count' ) )
            // InternalGridGame.g:7493:1: ( 'count' )
            {
            // InternalGridGame.g:7493:1: ( 'count' )
            // InternalGridGame.g:7494:1: 'count'
            {
             before(grammarAccess.getCountExpressionAccess().getCountKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalGridGame.g:7507:1: rule__CountExpression__Group__1 : rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 ;
    public final void rule__CountExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7511:1: ( rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 )
            // InternalGridGame.g:7512:2: rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__CountExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7519:1: rule__CountExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__CountExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7523:1: ( ( '(' ) )
            // InternalGridGame.g:7524:1: ( '(' )
            {
            // InternalGridGame.g:7524:1: ( '(' )
            // InternalGridGame.g:7525:1: '('
            {
             before(grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGridGame.g:7538:1: rule__CountExpression__Group__2 : rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 ;
    public final void rule__CountExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7542:1: ( rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 )
            // InternalGridGame.g:7543:2: rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__CountExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7550:1: rule__CountExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__CountExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7554:1: ( ( ')' ) )
            // InternalGridGame.g:7555:1: ( ')' )
            {
            // InternalGridGame.g:7555:1: ( ')' )
            // InternalGridGame.g:7556:1: ')'
            {
             before(grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGridGame.g:7569:1: rule__CountExpression__Group__3 : rule__CountExpression__Group__3__Impl rule__CountExpression__Group__4 ;
    public final void rule__CountExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7573:1: ( rule__CountExpression__Group__3__Impl rule__CountExpression__Group__4 )
            // InternalGridGame.g:7574:2: rule__CountExpression__Group__3__Impl rule__CountExpression__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__CountExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountExpression__Group__4();

            state._fsp--;


            }

        }
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
    // InternalGridGame.g:7581:1: rule__CountExpression__Group__3__Impl : ( () ) ;
    public final void rule__CountExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7585:1: ( ( () ) )
            // InternalGridGame.g:7586:1: ( () )
            {
            // InternalGridGame.g:7586:1: ( () )
            // InternalGridGame.g:7587:1: ()
            {
             before(grammarAccess.getCountExpressionAccess().getCountExpressionAction_3()); 
            // InternalGridGame.g:7588:1: ()
            // InternalGridGame.g:7590:1: 
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


    // $ANTLR start "rule__CountExpression__Group__4"
    // InternalGridGame.g:7600:1: rule__CountExpression__Group__4 : rule__CountExpression__Group__4__Impl ;
    public final void rule__CountExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7604:1: ( rule__CountExpression__Group__4__Impl )
            // InternalGridGame.g:7605:2: rule__CountExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__4"


    // $ANTLR start "rule__CountExpression__Group__4__Impl"
    // InternalGridGame.g:7611:1: rule__CountExpression__Group__4__Impl : ( ( rule__CountExpression__Group_4__0 )? ) ;
    public final void rule__CountExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7615:1: ( ( ( rule__CountExpression__Group_4__0 )? ) )
            // InternalGridGame.g:7616:1: ( ( rule__CountExpression__Group_4__0 )? )
            {
            // InternalGridGame.g:7616:1: ( ( rule__CountExpression__Group_4__0 )? )
            // InternalGridGame.g:7617:1: ( rule__CountExpression__Group_4__0 )?
            {
             before(grammarAccess.getCountExpressionAccess().getGroup_4()); 
            // InternalGridGame.g:7618:1: ( rule__CountExpression__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=22 && LA40_0<=24)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGridGame.g:7618:2: rule__CountExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CountExpression__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCountExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group__4__Impl"


    // $ANTLR start "rule__CountExpression__Group_4__0"
    // InternalGridGame.g:7638:1: rule__CountExpression__Group_4__0 : rule__CountExpression__Group_4__0__Impl rule__CountExpression__Group_4__1 ;
    public final void rule__CountExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7642:1: ( rule__CountExpression__Group_4__0__Impl rule__CountExpression__Group_4__1 )
            // InternalGridGame.g:7643:2: rule__CountExpression__Group_4__0__Impl rule__CountExpression__Group_4__1
            {
            pushFollow(FOLLOW_39);
            rule__CountExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group_4__0"


    // $ANTLR start "rule__CountExpression__Group_4__0__Impl"
    // InternalGridGame.g:7650:1: rule__CountExpression__Group_4__0__Impl : ( ( rule__CountExpression__OpAssignment_4_0 ) ) ;
    public final void rule__CountExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7654:1: ( ( ( rule__CountExpression__OpAssignment_4_0 ) ) )
            // InternalGridGame.g:7655:1: ( ( rule__CountExpression__OpAssignment_4_0 ) )
            {
            // InternalGridGame.g:7655:1: ( ( rule__CountExpression__OpAssignment_4_0 ) )
            // InternalGridGame.g:7656:1: ( rule__CountExpression__OpAssignment_4_0 )
            {
             before(grammarAccess.getCountExpressionAccess().getOpAssignment_4_0()); 
            // InternalGridGame.g:7657:1: ( rule__CountExpression__OpAssignment_4_0 )
            // InternalGridGame.g:7657:2: rule__CountExpression__OpAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__CountExpression__OpAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCountExpressionAccess().getOpAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group_4__0__Impl"


    // $ANTLR start "rule__CountExpression__Group_4__1"
    // InternalGridGame.g:7667:1: rule__CountExpression__Group_4__1 : rule__CountExpression__Group_4__1__Impl ;
    public final void rule__CountExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7671:1: ( rule__CountExpression__Group_4__1__Impl )
            // InternalGridGame.g:7672:2: rule__CountExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountExpression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group_4__1"


    // $ANTLR start "rule__CountExpression__Group_4__1__Impl"
    // InternalGridGame.g:7678:1: rule__CountExpression__Group_4__1__Impl : ( ( rule__CountExpression__CmpValAssignment_4_1 ) ) ;
    public final void rule__CountExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7682:1: ( ( ( rule__CountExpression__CmpValAssignment_4_1 ) ) )
            // InternalGridGame.g:7683:1: ( ( rule__CountExpression__CmpValAssignment_4_1 ) )
            {
            // InternalGridGame.g:7683:1: ( ( rule__CountExpression__CmpValAssignment_4_1 ) )
            // InternalGridGame.g:7684:1: ( rule__CountExpression__CmpValAssignment_4_1 )
            {
             before(grammarAccess.getCountExpressionAccess().getCmpValAssignment_4_1()); 
            // InternalGridGame.g:7685:1: ( rule__CountExpression__CmpValAssignment_4_1 )
            // InternalGridGame.g:7685:2: rule__CountExpression__CmpValAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CountExpression__CmpValAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCountExpressionAccess().getCmpValAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__Group_4__1__Impl"


    // $ANTLR start "rule__NotEmptyExpression__Group__0"
    // InternalGridGame.g:7699:1: rule__NotEmptyExpression__Group__0 : rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 ;
    public final void rule__NotEmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7703:1: ( rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 )
            // InternalGridGame.g:7704:2: rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__NotEmptyExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7711:1: rule__NotEmptyExpression__Group__0__Impl : ( 'notEmpty' ) ;
    public final void rule__NotEmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7715:1: ( ( 'notEmpty' ) )
            // InternalGridGame.g:7716:1: ( 'notEmpty' )
            {
            // InternalGridGame.g:7716:1: ( 'notEmpty' )
            // InternalGridGame.g:7717:1: 'notEmpty'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalGridGame.g:7730:1: rule__NotEmptyExpression__Group__1 : rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 ;
    public final void rule__NotEmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7734:1: ( rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 )
            // InternalGridGame.g:7735:2: rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__NotEmptyExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7742:1: rule__NotEmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__NotEmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7746:1: ( ( '(' ) )
            // InternalGridGame.g:7747:1: ( '(' )
            {
            // InternalGridGame.g:7747:1: ( '(' )
            // InternalGridGame.g:7748:1: '('
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalGridGame.g:7761:1: rule__NotEmptyExpression__Group__2 : rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 ;
    public final void rule__NotEmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7765:1: ( rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 )
            // InternalGridGame.g:7766:2: rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3
            {
            pushFollow(FOLLOW_1);
            rule__NotEmptyExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7773:1: rule__NotEmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__NotEmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7777:1: ( ( ')' ) )
            // InternalGridGame.g:7778:1: ( ')' )
            {
            // InternalGridGame.g:7778:1: ( ')' )
            // InternalGridGame.g:7779:1: ')'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalGridGame.g:7792:1: rule__NotEmptyExpression__Group__3 : rule__NotEmptyExpression__Group__3__Impl ;
    public final void rule__NotEmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7796:1: ( rule__NotEmptyExpression__Group__3__Impl )
            // InternalGridGame.g:7797:2: rule__NotEmptyExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:7803:1: rule__NotEmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__NotEmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7807:1: ( ( () ) )
            // InternalGridGame.g:7808:1: ( () )
            {
            // InternalGridGame.g:7808:1: ( () )
            // InternalGridGame.g:7809:1: ()
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyExpressionAction_3()); 
            // InternalGridGame.g:7810:1: ()
            // InternalGridGame.g:7812:1: 
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


    // $ANTLR start "rule__EmptyExpression__Group__0"
    // InternalGridGame.g:7830:1: rule__EmptyExpression__Group__0 : rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 ;
    public final void rule__EmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7834:1: ( rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 )
            // InternalGridGame.g:7835:2: rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__EmptyExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__0"


    // $ANTLR start "rule__EmptyExpression__Group__0__Impl"
    // InternalGridGame.g:7842:1: rule__EmptyExpression__Group__0__Impl : ( 'empty' ) ;
    public final void rule__EmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7846:1: ( ( 'empty' ) )
            // InternalGridGame.g:7847:1: ( 'empty' )
            {
            // InternalGridGame.g:7847:1: ( 'empty' )
            // InternalGridGame.g:7848:1: 'empty'
            {
             before(grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__0__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__1"
    // InternalGridGame.g:7861:1: rule__EmptyExpression__Group__1 : rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 ;
    public final void rule__EmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7865:1: ( rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 )
            // InternalGridGame.g:7866:2: rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__EmptyExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__1"


    // $ANTLR start "rule__EmptyExpression__Group__1__Impl"
    // InternalGridGame.g:7873:1: rule__EmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__EmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7877:1: ( ( '(' ) )
            // InternalGridGame.g:7878:1: ( '(' )
            {
            // InternalGridGame.g:7878:1: ( '(' )
            // InternalGridGame.g:7879:1: '('
            {
             before(grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__1__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__2"
    // InternalGridGame.g:7892:1: rule__EmptyExpression__Group__2 : rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 ;
    public final void rule__EmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7896:1: ( rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 )
            // InternalGridGame.g:7897:2: rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3
            {
            pushFollow(FOLLOW_1);
            rule__EmptyExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__2"


    // $ANTLR start "rule__EmptyExpression__Group__2__Impl"
    // InternalGridGame.g:7904:1: rule__EmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__EmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7908:1: ( ( ')' ) )
            // InternalGridGame.g:7909:1: ( ')' )
            {
            // InternalGridGame.g:7909:1: ( ')' )
            // InternalGridGame.g:7910:1: ')'
            {
             before(grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__2__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__3"
    // InternalGridGame.g:7923:1: rule__EmptyExpression__Group__3 : rule__EmptyExpression__Group__3__Impl ;
    public final void rule__EmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7927:1: ( rule__EmptyExpression__Group__3__Impl )
            // InternalGridGame.g:7928:2: rule__EmptyExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__3"


    // $ANTLR start "rule__EmptyExpression__Group__3__Impl"
    // InternalGridGame.g:7934:1: rule__EmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__EmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7938:1: ( ( () ) )
            // InternalGridGame.g:7939:1: ( () )
            {
            // InternalGridGame.g:7939:1: ( () )
            // InternalGridGame.g:7940:1: ()
            {
             before(grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3()); 
            // InternalGridGame.g:7941:1: ()
            // InternalGridGame.g:7943:1: 
            {
            }

             after(grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__3__Impl"


    // $ANTLR start "rule__GridGame__NameAssignment_1"
    // InternalGridGame.g:7962:1: rule__GridGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GridGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7966:1: ( ( RULE_ID ) )
            // InternalGridGame.g:7967:1: ( RULE_ID )
            {
            // InternalGridGame.g:7967:1: ( RULE_ID )
            // InternalGridGame.g:7968:1: RULE_ID
            {
             before(grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__GridGame__StatesAssignment_3_0"
    // InternalGridGame.g:7977:1: rule__GridGame__StatesAssignment_3_0 : ( ruleGlobalCellStateSpec ) ;
    public final void rule__GridGame__StatesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7981:1: ( ( ruleGlobalCellStateSpec ) )
            // InternalGridGame.g:7982:1: ( ruleGlobalCellStateSpec )
            {
            // InternalGridGame.g:7982:1: ( ruleGlobalCellStateSpec )
            // InternalGridGame.g:7983:1: ruleGlobalCellStateSpec
            {
             before(grammarAccess.getGridGameAccess().getStatesGlobalCellStateSpecParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalCellStateSpec();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getStatesGlobalCellStateSpecParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__StatesAssignment_3_0"


    // $ANTLR start "rule__GridGame__CellsAssignment_3_1"
    // InternalGridGame.g:7992:1: rule__GridGame__CellsAssignment_3_1 : ( ruleCellSpecification ) ;
    public final void rule__GridGame__CellsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:7996:1: ( ( ruleCellSpecification ) )
            // InternalGridGame.g:7997:1: ( ruleCellSpecification )
            {
            // InternalGridGame.g:7997:1: ( ruleCellSpecification )
            // InternalGridGame.g:7998:1: ruleCellSpecification
            {
             before(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__CellsAssignment_3_1"


    // $ANTLR start "rule__GridGame__GlobalActionsAssignment_3_2"
    // InternalGridGame.g:8007:1: rule__GridGame__GlobalActionsAssignment_3_2 : ( ruleGlobalAction ) ;
    public final void rule__GridGame__GlobalActionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8011:1: ( ( ruleGlobalAction ) )
            // InternalGridGame.g:8012:1: ( ruleGlobalAction )
            {
            // InternalGridGame.g:8012:1: ( ruleGlobalAction )
            // InternalGridGame.g:8013:1: ruleGlobalAction
            {
             before(grammarAccess.getGridGameAccess().getGlobalActionsGlobalActionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalAction();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getGlobalActionsGlobalActionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__GlobalActionsAssignment_3_2"


    // $ANTLR start "rule__GridGame__InitsAssignment_3_3"
    // InternalGridGame.g:8022:1: rule__GridGame__InitsAssignment_3_3 : ( ruleGlobalFieldInitialisation ) ;
    public final void rule__GridGame__InitsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8026:1: ( ( ruleGlobalFieldInitialisation ) )
            // InternalGridGame.g:8027:1: ( ruleGlobalFieldInitialisation )
            {
            // InternalGridGame.g:8027:1: ( ruleGlobalFieldInitialisation )
            // InternalGridGame.g:8028:1: ruleGlobalFieldInitialisation
            {
             before(grammarAccess.getGridGameAccess().getInitsGlobalFieldInitialisationParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getInitsGlobalFieldInitialisationParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__InitsAssignment_3_3"


    // $ANTLR start "rule__GridGame__FieldsAssignment_3_4"
    // InternalGridGame.g:8037:1: rule__GridGame__FieldsAssignment_3_4 : ( ruleFieldSpecification ) ;
    public final void rule__GridGame__FieldsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8041:1: ( ( ruleFieldSpecification ) )
            // InternalGridGame.g:8042:1: ( ruleFieldSpecification )
            {
            // InternalGridGame.g:8042:1: ( ruleFieldSpecification )
            // InternalGridGame.g:8043:1: ruleFieldSpecification
            {
             before(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__FieldsAssignment_3_4"


    // $ANTLR start "rule__GridGame__OptionsAssignment_3_5"
    // InternalGridGame.g:8052:1: rule__GridGame__OptionsAssignment_3_5 : ( ruleOptionSpecification ) ;
    public final void rule__GridGame__OptionsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8056:1: ( ( ruleOptionSpecification ) )
            // InternalGridGame.g:8057:1: ( ruleOptionSpecification )
            {
            // InternalGridGame.g:8057:1: ( ruleOptionSpecification )
            // InternalGridGame.g:8058:1: ruleOptionSpecification
            {
             before(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridGame__OptionsAssignment_3_5"


    // $ANTLR start "rule__CellSpecification__NameAssignment_1"
    // InternalGridGame.g:8067:1: rule__CellSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CellSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8071:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8072:1: ( RULE_ID )
            {
            // InternalGridGame.g:8072:1: ( RULE_ID )
            // InternalGridGame.g:8073:1: RULE_ID
            {
             before(grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8082:1: rule__CellSpecification__MembersAssignment_3 : ( ruleCellMember ) ;
    public final void rule__CellSpecification__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8086:1: ( ( ruleCellMember ) )
            // InternalGridGame.g:8087:1: ( ruleCellMember )
            {
            // InternalGridGame.g:8087:1: ( ruleCellMember )
            // InternalGridGame.g:8088:1: ruleCellMember
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8097:1: rule__CellDisplaySpec__Display_typeAssignment_3 : ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) ;
    public final void rule__CellDisplaySpec__Display_typeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8101:1: ( ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) )
            // InternalGridGame.g:8102:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            {
            // InternalGridGame.g:8102:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            // InternalGridGame.g:8103:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAlternatives_3_0()); 
            // InternalGridGame.g:8104:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            // InternalGridGame.g:8104:2: rule__CellDisplaySpec__Display_typeAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8113:1: rule__CellDisplaySpec__TextAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__CellDisplaySpec__TextAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8117:1: ( ( RULE_STRING ) )
            // InternalGridGame.g:8118:1: ( RULE_STRING )
            {
            // InternalGridGame.g:8118:1: ( RULE_STRING )
            // InternalGridGame.g:8119:1: RULE_STRING
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalGridGame.g:8128:1: rule__CellDisplaySpec__VarAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CellDisplaySpec__VarAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8132:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8133:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8133:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8134:1: ( RULE_ID )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarVarSpecCrossReference_4_1_1_0()); 
            // InternalGridGame.g:8135:1: ( RULE_ID )
            // InternalGridGame.g:8136:1: RULE_ID
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarVarSpecIDTerminalRuleCall_4_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__CellDisplaySpec__ColorAssignment_4_2_1"
    // InternalGridGame.g:8147:1: rule__CellDisplaySpec__ColorAssignment_4_2_1 : ( ( rule__CellDisplaySpec__ColorAlternatives_4_2_1_0 ) ) ;
    public final void rule__CellDisplaySpec__ColorAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8151:1: ( ( ( rule__CellDisplaySpec__ColorAlternatives_4_2_1_0 ) ) )
            // InternalGridGame.g:8152:1: ( ( rule__CellDisplaySpec__ColorAlternatives_4_2_1_0 ) )
            {
            // InternalGridGame.g:8152:1: ( ( rule__CellDisplaySpec__ColorAlternatives_4_2_1_0 ) )
            // InternalGridGame.g:8153:1: ( rule__CellDisplaySpec__ColorAlternatives_4_2_1_0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getColorAlternatives_4_2_1_0()); 
            // InternalGridGame.g:8154:1: ( rule__CellDisplaySpec__ColorAlternatives_4_2_1_0 )
            // InternalGridGame.g:8154:2: rule__CellDisplaySpec__ColorAlternatives_4_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__ColorAlternatives_4_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getColorAlternatives_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplaySpec__ColorAssignment_4_2_1"


    // $ANTLR start "rule__CellVarSpec__TypeAssignment_1"
    // InternalGridGame.g:8163:1: rule__CellVarSpec__TypeAssignment_1 : ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) ;
    public final void rule__CellVarSpec__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8167:1: ( ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) )
            // InternalGridGame.g:8168:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            {
            // InternalGridGame.g:8168:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            // InternalGridGame.g:8169:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAlternatives_1_0()); 
            // InternalGridGame.g:8170:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            // InternalGridGame.g:8170:2: rule__CellVarSpec__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8179:1: rule__CellVarSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CellVarSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8183:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8184:1: ( RULE_ID )
            {
            // InternalGridGame.g:8184:1: ( RULE_ID )
            // InternalGridGame.g:8185:1: RULE_ID
            {
             before(grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8194:1: rule__GlobalCellStateSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalCellStateSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8198:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8199:1: ( RULE_ID )
            {
            // InternalGridGame.g:8199:1: ( RULE_ID )
            // InternalGridGame.g:8200:1: RULE_ID
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8209:1: rule__GlobalCellStateSpec__ParamsAssignment_2_1 : ( ruleParamSpec ) ;
    public final void rule__GlobalCellStateSpec__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8213:1: ( ( ruleParamSpec ) )
            // InternalGridGame.g:8214:1: ( ruleParamSpec )
            {
            // InternalGridGame.g:8214:1: ( ruleParamSpec )
            // InternalGridGame.g:8215:1: ruleParamSpec
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsParamSpecParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParamSpec();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecAccess().getParamsParamSpecParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalGridGame.g:8224:1: rule__GlobalCellStateSpec__ParamsAssignment_2_2_1 : ( ruleParamSpec ) ;
    public final void rule__GlobalCellStateSpec__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8228:1: ( ( ruleParamSpec ) )
            // InternalGridGame.g:8229:1: ( ruleParamSpec )
            {
            // InternalGridGame.g:8229:1: ( ruleParamSpec )
            // InternalGridGame.g:8230:1: ruleParamSpec
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getParamsParamSpecParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParamSpec();

            state._fsp--;

             after(grammarAccess.getGlobalCellStateSpecAccess().getParamsParamSpecParserRuleCall_2_2_1_0()); 

            }


            }

        }
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
    // InternalGridGame.g:8239:1: rule__GlobalCellStateSpec__StatesAssignment_4 : ( ruleCellState ) ;
    public final void rule__GlobalCellStateSpec__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8243:1: ( ( ruleCellState ) )
            // InternalGridGame.g:8244:1: ( ruleCellState )
            {
            // InternalGridGame.g:8244:1: ( ruleCellState )
            // InternalGridGame.g:8245:1: ruleCellState
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStatesCellStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8254:1: rule__GlobalCellStateSpec__StartAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__GlobalCellStateSpec__StartAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8258:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8259:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8259:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8260:1: ( RULE_ID )
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateCrossReference_7_0()); 
            // InternalGridGame.g:8261:1: ( RULE_ID )
            // InternalGridGame.g:8262:1: RULE_ID
            {
             before(grammarAccess.getGlobalCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__ParamSpec__TypeAssignment_0"
    // InternalGridGame.g:8273:1: rule__ParamSpec__TypeAssignment_0 : ( ( rule__ParamSpec__TypeAlternatives_0_0 ) ) ;
    public final void rule__ParamSpec__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8277:1: ( ( ( rule__ParamSpec__TypeAlternatives_0_0 ) ) )
            // InternalGridGame.g:8278:1: ( ( rule__ParamSpec__TypeAlternatives_0_0 ) )
            {
            // InternalGridGame.g:8278:1: ( ( rule__ParamSpec__TypeAlternatives_0_0 ) )
            // InternalGridGame.g:8279:1: ( rule__ParamSpec__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getParamSpecAccess().getTypeAlternatives_0_0()); 
            // InternalGridGame.g:8280:1: ( rule__ParamSpec__TypeAlternatives_0_0 )
            // InternalGridGame.g:8280:2: rule__ParamSpec__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamSpec__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParamSpecAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__TypeAssignment_0"


    // $ANTLR start "rule__ParamSpec__NameAssignment_1"
    // InternalGridGame.g:8289:1: rule__ParamSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParamSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8293:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8294:1: ( RULE_ID )
            {
            // InternalGridGame.g:8294:1: ( RULE_ID )
            // InternalGridGame.g:8295:1: RULE_ID
            {
             before(grammarAccess.getParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamSpec__NameAssignment_1"


    // $ANTLR start "rule__LocalCellStateSpec__StatesAssignment_2"
    // InternalGridGame.g:8304:1: rule__LocalCellStateSpec__StatesAssignment_2 : ( ruleCellState ) ;
    public final void rule__LocalCellStateSpec__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8308:1: ( ( ruleCellState ) )
            // InternalGridGame.g:8309:1: ( ruleCellState )
            {
            // InternalGridGame.g:8309:1: ( ruleCellState )
            // InternalGridGame.g:8310:1: ruleCellState
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStatesCellStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8319:1: rule__LocalCellStateSpec__StartAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__LocalCellStateSpec__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8323:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8324:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8324:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8325:1: ( RULE_ID )
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartCellStateCrossReference_5_0()); 
            // InternalGridGame.g:8326:1: ( RULE_ID )
            // InternalGridGame.g:8327:1: RULE_ID
            {
             before(grammarAccess.getLocalCellStateSpecAccess().getStartCellStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8338:1: rule__CellStateSpecReference__StateSpecAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CellStateSpecReference__StateSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8342:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8343:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8343:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8344:1: ( RULE_ID )
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecCrossReference_1_0()); 
            // InternalGridGame.g:8345:1: ( RULE_ID )
            // InternalGridGame.g:8346:1: RULE_ID
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getStateSpecGlobalCellStateSpecIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8357:1: rule__CellStateSpecReference__ParamsAssignment_2_1 : ( ruleValue ) ;
    public final void rule__CellStateSpecReference__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8361:1: ( ( ruleValue ) )
            // InternalGridGame.g:8362:1: ( ruleValue )
            {
            // InternalGridGame.g:8362:1: ( ruleValue )
            // InternalGridGame.g:8363:1: ruleValue
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8372:1: rule__CellStateSpecReference__ParamsAssignment_2_2_1 : ( ruleValue ) ;
    public final void rule__CellStateSpecReference__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8376:1: ( ( ruleValue ) )
            // InternalGridGame.g:8377:1: ( ruleValue )
            {
            // InternalGridGame.g:8377:1: ( ruleValue )
            // InternalGridGame.g:8378:1: ruleValue
            {
             before(grammarAccess.getCellStateSpecReferenceAccess().getParamsValueParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8387:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8391:1: ( ( RULE_STRING ) )
            // InternalGridGame.g:8392:1: ( RULE_STRING )
            {
            // InternalGridGame.g:8392:1: ( RULE_STRING )
            // InternalGridGame.g:8393:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalGridGame.g:8402:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8406:1: ( ( RULE_INT ) )
            // InternalGridGame.g:8407:1: ( RULE_INT )
            {
            // InternalGridGame.g:8407:1: ( RULE_INT )
            // InternalGridGame.g:8408:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalGridGame.g:8417:1: rule__VarRefValue__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarRefValue__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8421:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8422:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8422:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8423:1: ( RULE_ID )
            {
             before(grammarAccess.getVarRefValueAccess().getRefCellVarSpecCrossReference_0()); 
            // InternalGridGame.g:8424:1: ( RULE_ID )
            // InternalGridGame.g:8425:1: RULE_ID
            {
             before(grammarAccess.getVarRefValueAccess().getRefCellVarSpecIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8436:1: rule__CellState__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CellState__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8440:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8441:1: ( RULE_ID )
            {
            // InternalGridGame.g:8441:1: ( RULE_ID )
            // InternalGridGame.g:8442:1: RULE_ID
            {
             before(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8451:1: rule__CellState__DisplayAssignment_2 : ( ruleCellDisplaySpec ) ;
    public final void rule__CellState__DisplayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8455:1: ( ( ruleCellDisplaySpec ) )
            // InternalGridGame.g:8456:1: ( ruleCellDisplaySpec )
            {
            // InternalGridGame.g:8456:1: ( ruleCellDisplaySpec )
            // InternalGridGame.g:8457:1: ruleCellDisplaySpec
            {
             before(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8466:1: rule__CellState__TransitionsAssignment_3_2 : ( ruleTransitionSpec ) ;
    public final void rule__CellState__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8470:1: ( ( ruleTransitionSpec ) )
            // InternalGridGame.g:8471:1: ( ruleTransitionSpec )
            {
            // InternalGridGame.g:8471:1: ( ruleTransitionSpec )
            // InternalGridGame.g:8472:1: ruleTransitionSpec
            {
             before(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__CellState__OnEnterAssignment_4_2"
    // InternalGridGame.g:8481:1: rule__CellState__OnEnterAssignment_4_2 : ( ruleCellStateBehaviour ) ;
    public final void rule__CellState__OnEnterAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8485:1: ( ( ruleCellStateBehaviour ) )
            // InternalGridGame.g:8486:1: ( ruleCellStateBehaviour )
            {
            // InternalGridGame.g:8486:1: ( ruleCellStateBehaviour )
            // InternalGridGame.g:8487:1: ruleCellStateBehaviour
            {
             before(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCellStateBehaviour();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__OnEnterAssignment_4_2"


    // $ANTLR start "rule__CellState__OnEnterAssignment_4_3_1"
    // InternalGridGame.g:8496:1: rule__CellState__OnEnterAssignment_4_3_1 : ( ruleCellStateBehaviour ) ;
    public final void rule__CellState__OnEnterAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8500:1: ( ( ruleCellStateBehaviour ) )
            // InternalGridGame.g:8501:1: ( ruleCellStateBehaviour )
            {
            // InternalGridGame.g:8501:1: ( ruleCellStateBehaviour )
            // InternalGridGame.g:8502:1: ruleCellStateBehaviour
            {
             before(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellStateBehaviour();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getOnEnterCellStateBehaviourParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__OnEnterAssignment_4_3_1"


    // $ANTLR start "rule__TransitionSpec__TriggerAssignment_1"
    // InternalGridGame.g:8511:1: rule__TransitionSpec__TriggerAssignment_1 : ( ruleTransitionTriggerSpec ) ;
    public final void rule__TransitionSpec__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8515:1: ( ( ruleTransitionTriggerSpec ) )
            // InternalGridGame.g:8516:1: ( ruleTransitionTriggerSpec )
            {
            // InternalGridGame.g:8516:1: ( ruleTransitionTriggerSpec )
            // InternalGridGame.g:8517:1: ruleTransitionTriggerSpec
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8526:1: rule__TransitionSpec__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionSpec__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8530:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8531:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8531:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8532:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_3_0()); 
            // InternalGridGame.g:8533:1: ( RULE_ID )
            // InternalGridGame.g:8534:1: RULE_ID
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__MouseTrigger__LeftAssignment_0"
    // InternalGridGame.g:8545:1: rule__MouseTrigger__LeftAssignment_0 : ( ( 'mouse-left' ) ) ;
    public final void rule__MouseTrigger__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8549:1: ( ( ( 'mouse-left' ) ) )
            // InternalGridGame.g:8550:1: ( ( 'mouse-left' ) )
            {
            // InternalGridGame.g:8550:1: ( ( 'mouse-left' ) )
            // InternalGridGame.g:8551:1: ( 'mouse-left' )
            {
             before(grammarAccess.getMouseTriggerAccess().getLeftMouseLeftKeyword_0_0()); 
            // InternalGridGame.g:8552:1: ( 'mouse-left' )
            // InternalGridGame.g:8553:1: 'mouse-left'
            {
             before(grammarAccess.getMouseTriggerAccess().getLeftMouseLeftKeyword_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMouseTriggerAccess().getLeftMouseLeftKeyword_0_0()); 

            }

             after(grammarAccess.getMouseTriggerAccess().getLeftMouseLeftKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__LeftAssignment_0"


    // $ANTLR start "rule__ContextTrigger__ExpAssignment_2"
    // InternalGridGame.g:8568:1: rule__ContextTrigger__ExpAssignment_2 : ( ruleContextExpression ) ;
    public final void rule__ContextTrigger__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8572:1: ( ( ruleContextExpression ) )
            // InternalGridGame.g:8573:1: ( ruleContextExpression )
            {
            // InternalGridGame.g:8573:1: ( ruleContextExpression )
            // InternalGridGame.g:8574:1: ruleContextExpression
            {
             before(grammarAccess.getContextTriggerAccess().getExpContextExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextTriggerAccess().getExpContextExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextTrigger__ExpAssignment_2"


    // $ANTLR start "rule__BehaviourReference__RefAssignment"
    // InternalGridGame.g:8583:1: rule__BehaviourReference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BehaviourReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8587:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8588:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8588:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8589:1: ( RULE_ID )
            {
             before(grammarAccess.getBehaviourReferenceAccess().getRefVarSpecCrossReference_0()); 
            // InternalGridGame.g:8590:1: ( RULE_ID )
            // InternalGridGame.g:8591:1: RULE_ID
            {
             before(grammarAccess.getBehaviourReferenceAccess().getRefVarSpecIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBehaviourReferenceAccess().getRefVarSpecIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getBehaviourReferenceAccess().getRefVarSpecCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourReference__RefAssignment"


    // $ANTLR start "rule__EndGameBehaviour__MessageAssignment_2"
    // InternalGridGame.g:8602:1: rule__EndGameBehaviour__MessageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EndGameBehaviour__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8606:1: ( ( RULE_STRING ) )
            // InternalGridGame.g:8607:1: ( RULE_STRING )
            {
            // InternalGridGame.g:8607:1: ( RULE_STRING )
            // InternalGridGame.g:8608:1: RULE_STRING
            {
             before(grammarAccess.getEndGameBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEndGameBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndGameBehaviour__MessageAssignment_2"


    // $ANTLR start "rule__GlobalAction__NameAssignment_1"
    // InternalGridGame.g:8617:1: rule__GlobalAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8621:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8622:1: ( RULE_ID )
            {
            // InternalGridGame.g:8622:1: ( RULE_ID )
            // InternalGridGame.g:8623:1: RULE_ID
            {
             before(grammarAccess.getGlobalActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGlobalActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__NameAssignment_1"


    // $ANTLR start "rule__GlobalAction__TriggerAssignment_4"
    // InternalGridGame.g:8632:1: rule__GlobalAction__TriggerAssignment_4 : ( ruleContextExpression ) ;
    public final void rule__GlobalAction__TriggerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8636:1: ( ( ruleContextExpression ) )
            // InternalGridGame.g:8637:1: ( ruleContextExpression )
            {
            // InternalGridGame.g:8637:1: ( ruleContextExpression )
            // InternalGridGame.g:8638:1: ruleContextExpression
            {
             before(grammarAccess.getGlobalActionAccess().getTriggerContextExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getGlobalActionAccess().getTriggerContextExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__TriggerAssignment_4"


    // $ANTLR start "rule__GlobalAction__BehaviourAssignment_6"
    // InternalGridGame.g:8647:1: rule__GlobalAction__BehaviourAssignment_6 : ( ruleDirectBehaviour ) ;
    public final void rule__GlobalAction__BehaviourAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8651:1: ( ( ruleDirectBehaviour ) )
            // InternalGridGame.g:8652:1: ( ruleDirectBehaviour )
            {
            // InternalGridGame.g:8652:1: ( ruleDirectBehaviour )
            // InternalGridGame.g:8653:1: ruleDirectBehaviour
            {
             before(grammarAccess.getGlobalActionAccess().getBehaviourDirectBehaviourParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectBehaviour();

            state._fsp--;

             after(grammarAccess.getGlobalActionAccess().getBehaviourDirectBehaviourParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalAction__BehaviourAssignment_6"


    // $ANTLR start "rule__FieldSpecification__NameAssignment_1"
    // InternalGridGame.g:8662:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8666:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8667:1: ( RULE_ID )
            {
            // InternalGridGame.g:8667:1: ( RULE_ID )
            // InternalGridGame.g:8668:1: RULE_ID
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8677:1: rule__FieldSpecification__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8681:1: ( ( RULE_INT ) )
            // InternalGridGame.g:8682:1: ( RULE_INT )
            {
            // InternalGridGame.g:8682:1: ( RULE_INT )
            // InternalGridGame.g:8683:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalGridGame.g:8692:1: rule__FieldSpecification__HeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8696:1: ( ( RULE_INT ) )
            // InternalGridGame.g:8697:1: ( RULE_INT )
            {
            // InternalGridGame.g:8697:1: ( RULE_INT )
            // InternalGridGame.g:8698:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalGridGame.g:8707:1: rule__FieldSpecification__Field_initialisationAssignment_9 : ( ruleFieldInitialisations ) ;
    public final void rule__FieldSpecification__Field_initialisationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8711:1: ( ( ruleFieldInitialisations ) )
            // InternalGridGame.g:8712:1: ( ruleFieldInitialisations )
            {
            // InternalGridGame.g:8712:1: ( ruleFieldInitialisations )
            // InternalGridGame.g:8713:1: ruleFieldInitialisations
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8722:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8726:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8727:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8727:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8728:1: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            // InternalGridGame.g:8729:1: ( RULE_ID )
            // InternalGridGame.g:8730:1: RULE_ID
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__GlobalFieldInitialisation__NameAssignment_1"
    // InternalGridGame.g:8741:1: rule__GlobalFieldInitialisation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalFieldInitialisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8745:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8746:1: ( RULE_ID )
            {
            // InternalGridGame.g:8746:1: ( RULE_ID )
            // InternalGridGame.g:8747:1: RULE_ID
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGlobalFieldInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__NameAssignment_1"


    // $ANTLR start "rule__GlobalFieldInitialisation__ParamsAssignment_2_1"
    // InternalGridGame.g:8756:1: rule__GlobalFieldInitialisation__ParamsAssignment_2_1 : ( ruleParamSpec ) ;
    public final void rule__GlobalFieldInitialisation__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8760:1: ( ( ruleParamSpec ) )
            // InternalGridGame.g:8761:1: ( ruleParamSpec )
            {
            // InternalGridGame.g:8761:1: ( ruleParamSpec )
            // InternalGridGame.g:8762:1: ruleParamSpec
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getParamsParamSpecParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParamSpec();

            state._fsp--;

             after(grammarAccess.getGlobalFieldInitialisationAccess().getParamsParamSpecParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__ParamsAssignment_2_1"


    // $ANTLR start "rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1"
    // InternalGridGame.g:8771:1: rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1 : ( ruleParamSpec ) ;
    public final void rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8775:1: ( ( ruleParamSpec ) )
            // InternalGridGame.g:8776:1: ( ruleParamSpec )
            {
            // InternalGridGame.g:8776:1: ( ruleParamSpec )
            // InternalGridGame.g:8777:1: ruleParamSpec
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getParamsParamSpecParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParamSpec();

            state._fsp--;

             after(grammarAccess.getGlobalFieldInitialisationAccess().getParamsParamSpecParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0"
    // InternalGridGame.g:8786:1: rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0 : ( ruleFieldInitialisation ) ;
    public final void rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8790:1: ( ( ruleFieldInitialisation ) )
            // InternalGridGame.g:8791:1: ( ruleFieldInitialisation )
            {
            // InternalGridGame.g:8791:1: ( ruleFieldInitialisation )
            // InternalGridGame.g:8792:1: ruleFieldInitialisation
            {
             before(grammarAccess.getGlobalFieldInitialisationAccess().getInitialisationsFieldInitialisationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getGlobalFieldInitialisationAccess().getInitialisationsFieldInitialisationParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalFieldInitialisation__InitialisationsAssignment_4_0"


    // $ANTLR start "rule__FieldInitialisationsRef__RefAssignment_1"
    // InternalGridGame.g:8801:1: rule__FieldInitialisationsRef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FieldInitialisationsRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8805:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8806:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8806:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8807:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getRefGlobalFieldInitialisationCrossReference_1_0()); 
            // InternalGridGame.g:8808:1: ( RULE_ID )
            // InternalGridGame.g:8809:1: RULE_ID
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getRefGlobalFieldInitialisationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldInitialisationsRefAccess().getRefGlobalFieldInitialisationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFieldInitialisationsRefAccess().getRefGlobalFieldInitialisationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__RefAssignment_1"


    // $ANTLR start "rule__FieldInitialisationsRef__ParamsAssignment_2_1"
    // InternalGridGame.g:8820:1: rule__FieldInitialisationsRef__ParamsAssignment_2_1 : ( ruleValue ) ;
    public final void rule__FieldInitialisationsRef__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8824:1: ( ( ruleValue ) )
            // InternalGridGame.g:8825:1: ( ruleValue )
            {
            // InternalGridGame.g:8825:1: ( ruleValue )
            // InternalGridGame.g:8826:1: ruleValue
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getParamsValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsRefAccess().getParamsValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__ParamsAssignment_2_1"


    // $ANTLR start "rule__FieldInitialisationsRef__ParamsAssignment_2_2_1"
    // InternalGridGame.g:8835:1: rule__FieldInitialisationsRef__ParamsAssignment_2_2_1 : ( ruleValue ) ;
    public final void rule__FieldInitialisationsRef__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8839:1: ( ( ruleValue ) )
            // InternalGridGame.g:8840:1: ( ruleValue )
            {
            // InternalGridGame.g:8840:1: ( ruleValue )
            // InternalGridGame.g:8841:1: ruleValue
            {
             before(grammarAccess.getFieldInitialisationsRefAccess().getParamsValueParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFieldInitialisationsRefAccess().getParamsValueParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInitialisationsRef__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__LocalFieldInitialisations__InitialisationsAssignment_2_0"
    // InternalGridGame.g:8850:1: rule__LocalFieldInitialisations__InitialisationsAssignment_2_0 : ( ruleFieldInitialisation ) ;
    public final void rule__LocalFieldInitialisations__InitialisationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8854:1: ( ( ruleFieldInitialisation ) )
            // InternalGridGame.g:8855:1: ( ruleFieldInitialisation )
            {
            // InternalGridGame.g:8855:1: ( ruleFieldInitialisation )
            // InternalGridGame.g:8856:1: ruleFieldInitialisation
            {
             before(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldInitialisation();

            state._fsp--;

             after(grammarAccess.getLocalFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFieldInitialisations__InitialisationsAssignment_2_0"


    // $ANTLR start "rule__DefaultInitialisation__CellAssignment_2"
    // InternalGridGame.g:8865:1: rule__DefaultInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefaultInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8869:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8870:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8870:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8871:1: ( RULE_ID )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // InternalGridGame.g:8872:1: ( RULE_ID )
            // InternalGridGame.g:8873:1: RULE_ID
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8884:1: rule__RandomInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RandomInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8888:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8889:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8889:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8890:1: ( RULE_ID )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // InternalGridGame.g:8891:1: ( RULE_ID )
            // InternalGridGame.g:8892:1: RULE_ID
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__RandomInitialisation__CountAssignment_4_0"
    // InternalGridGame.g:8903:1: rule__RandomInitialisation__CountAssignment_4_0 : ( RULE_INT ) ;
    public final void rule__RandomInitialisation__CountAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8907:1: ( ( RULE_INT ) )
            // InternalGridGame.g:8908:1: ( RULE_INT )
            {
            // InternalGridGame.g:8908:1: ( RULE_INT )
            // InternalGridGame.g:8909:1: RULE_INT
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__CountAssignment_4_0"


    // $ANTLR start "rule__RandomInitialisation__VarAssignment_4_1"
    // InternalGridGame.g:8918:1: rule__RandomInitialisation__VarAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__RandomInitialisation__VarAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8922:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8923:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8923:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8924:1: ( RULE_ID )
            {
             before(grammarAccess.getRandomInitialisationAccess().getVarVarSpecCrossReference_4_1_0()); 
            // InternalGridGame.g:8925:1: ( RULE_ID )
            // InternalGridGame.g:8926:1: RULE_ID
            {
             before(grammarAccess.getRandomInitialisationAccess().getVarVarSpecIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRandomInitialisationAccess().getVarVarSpecIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRandomInitialisationAccess().getVarVarSpecCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomInitialisation__VarAssignment_4_1"


    // $ANTLR start "rule__ContextInitialisation__CellAssignment_2"
    // InternalGridGame.g:8937:1: rule__ContextInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ContextInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8941:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:8942:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:8942:1: ( ( RULE_ID ) )
            // InternalGridGame.g:8943:1: ( RULE_ID )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // InternalGridGame.g:8944:1: ( RULE_ID )
            // InternalGridGame.g:8945:1: RULE_ID
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalGridGame.g:8956:1: rule__ContextInitialisation__CheckAssignment_4 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8960:1: ( ( ruleContextExpression ) )
            // InternalGridGame.g:8961:1: ( ruleContextExpression )
            {
            // InternalGridGame.g:8961:1: ( ruleContextExpression )
            // InternalGridGame.g:8962:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8971:1: rule__ContextInitialisation__ExpAssignment_7 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__ExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8975:1: ( ( ruleContextExpression ) )
            // InternalGridGame.g:8976:1: ( ruleContextExpression )
            {
            // InternalGridGame.g:8976:1: ( ruleContextExpression )
            // InternalGridGame.g:8977:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:8986:1: rule__ContextExpression__Sub_expAssignment_0 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:8990:1: ( ( ruleAtomicExpression ) )
            // InternalGridGame.g:8991:1: ( ruleAtomicExpression )
            {
            // InternalGridGame.g:8991:1: ( ruleAtomicExpression )
            // InternalGridGame.g:8992:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:9001:1: rule__ContextExpression__Sub_expAssignment_1_1 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:9005:1: ( ( ruleAtomicExpression ) )
            // InternalGridGame.g:9006:1: ( ruleAtomicExpression )
            {
            // InternalGridGame.g:9006:1: ( ruleAtomicExpression )
            // InternalGridGame.g:9007:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalGridGame.g:9016:1: rule__FilterExpression__Cell_typeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FilterExpression__Cell_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:9020:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:9021:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:9021:1: ( ( RULE_ID ) )
            // InternalGridGame.g:9022:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 
            // InternalGridGame.g:9023:1: ( RULE_ID )
            // InternalGridGame.g:9024:1: RULE_ID
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__StateFilterExpression__Cell_stateAssignment_2"
    // InternalGridGame.g:9035:1: rule__StateFilterExpression__Cell_stateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StateFilterExpression__Cell_stateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:9039:1: ( ( ( RULE_ID ) ) )
            // InternalGridGame.g:9040:1: ( ( RULE_ID ) )
            {
            // InternalGridGame.g:9040:1: ( ( RULE_ID ) )
            // InternalGridGame.g:9041:1: ( RULE_ID )
            {
             before(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateCrossReference_2_0()); 
            // InternalGridGame.g:9042:1: ( RULE_ID )
            // InternalGridGame.g:9043:1: RULE_ID
            {
             before(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFilterExpression__Cell_stateAssignment_2"


    // $ANTLR start "rule__CountExpression__OpAssignment_4_0"
    // InternalGridGame.g:9054:1: rule__CountExpression__OpAssignment_4_0 : ( ( rule__CountExpression__OpAlternatives_4_0_0 ) ) ;
    public final void rule__CountExpression__OpAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:9058:1: ( ( ( rule__CountExpression__OpAlternatives_4_0_0 ) ) )
            // InternalGridGame.g:9059:1: ( ( rule__CountExpression__OpAlternatives_4_0_0 ) )
            {
            // InternalGridGame.g:9059:1: ( ( rule__CountExpression__OpAlternatives_4_0_0 ) )
            // InternalGridGame.g:9060:1: ( rule__CountExpression__OpAlternatives_4_0_0 )
            {
             before(grammarAccess.getCountExpressionAccess().getOpAlternatives_4_0_0()); 
            // InternalGridGame.g:9061:1: ( rule__CountExpression__OpAlternatives_4_0_0 )
            // InternalGridGame.g:9061:2: rule__CountExpression__OpAlternatives_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CountExpression__OpAlternatives_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCountExpressionAccess().getOpAlternatives_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__OpAssignment_4_0"


    // $ANTLR start "rule__CountExpression__CmpValAssignment_4_1"
    // InternalGridGame.g:9070:1: rule__CountExpression__CmpValAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__CountExpression__CmpValAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalGridGame.g:9074:1: ( ( RULE_INT ) )
            // InternalGridGame.g:9075:1: ( RULE_INT )
            {
            // InternalGridGame.g:9075:1: ( RULE_INT )
            // InternalGridGame.g:9076:1: RULE_INT
            {
             before(grammarAccess.getCountExpressionAccess().getCmpValINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCountExpressionAccess().getCmpValINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountExpression__CmpValAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00E4800C10000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00E4800C10000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000528000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000520000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000870L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000030008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000810L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000008000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0A00200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0A00200000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000001C00000L});

}