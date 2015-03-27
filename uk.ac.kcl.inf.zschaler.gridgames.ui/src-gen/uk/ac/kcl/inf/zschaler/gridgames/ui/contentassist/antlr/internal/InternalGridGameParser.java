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


    // $ANTLR start "rule__CellDisplaySpec__Alternatives_4"
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:640:1: rule__CellDisplaySpec__Alternatives_4 : ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) );
    public final void rule__CellDisplaySpec__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:644:1: ( ( ( rule__CellDisplaySpec__Group_4_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_4_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:645:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:645:1: ( ( rule__CellDisplaySpec__Group_4_0__0 ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:646:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:647:1: ( rule__CellDisplaySpec__Group_4_0__0 )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:647:2: rule__CellDisplaySpec__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__0_in_rule__CellDisplaySpec__Alternatives_41314);
                    rule__CellDisplaySpec__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:651:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:651:6: ( ( rule__CellDisplaySpec__Group_4_1__0 ) )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:652:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_4_1()); 
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:653:1: ( rule__CellDisplaySpec__Group_4_1__0 )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:653:2: rule__CellDisplaySpec__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__0_in_rule__CellDisplaySpec__Alternatives_41332);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:662:1: rule__CellVarSpec__TypeAlternatives_1_0 : ( ( 'int' ) | ( 'String' ) );
    public final void rule__CellVarSpec__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:666:1: ( ( 'int' ) | ( 'String' ) )
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:667:1: ( 'int' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:667:1: ( 'int' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:668:1: 'int'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_01366); 
                     after(grammarAccess.getCellVarSpecAccess().getTypeIntKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:675:6: ( 'String' )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:675:6: ( 'String' )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:676:1: 'String'
                    {
                     before(grammarAccess.getCellVarSpecAccess().getTypeStringKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_01386); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:688:1: rule__OptionSpecification__Alternatives : ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) );
    public final void rule__OptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:692:1: ( ( ruleStartFieldDeclaration ) | ( ruleAllowRestartMenu ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:693:1: ( ruleStartFieldDeclaration )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:693:1: ( ruleStartFieldDeclaration )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:694:1: ruleStartFieldDeclaration
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives1420);
                    ruleStartFieldDeclaration();

                    state._fsp--;

                     after(grammarAccess.getOptionSpecificationAccess().getStartFieldDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:699:6: ( ruleAllowRestartMenu )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:699:6: ( ruleAllowRestartMenu )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:700:1: ruleAllowRestartMenu
                    {
                     before(grammarAccess.getOptionSpecificationAccess().getAllowRestartMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives1437);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:710:1: rule__FieldInitialisation__Alternatives : ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) );
    public final void rule__FieldInitialisation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:714:1: ( ( ruleDefaultInitialisation ) | ( ruleRandomInitialisation ) | ( ruleContextInitialisation ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 34:
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:715:1: ( ruleDefaultInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:715:1: ( ruleDefaultInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:716:1: ruleDefaultInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives1469);
                    ruleDefaultInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getDefaultInitialisationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:721:6: ( ruleRandomInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:721:6: ( ruleRandomInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:722:1: ruleRandomInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives1486);
                    ruleRandomInitialisation();

                    state._fsp--;

                     after(grammarAccess.getFieldInitialisationAccess().getRandomInitialisationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:727:6: ( ruleContextInitialisation )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:727:6: ( ruleContextInitialisation )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:728:1: ruleContextInitialisation
                    {
                     before(grammarAccess.getFieldInitialisationAccess().getContextInitialisationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives1503);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:738:1: rule__AtomicExpression__Alternatives : ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:742:1: ( ( ruleFilterExpression ) | ( ruleCountExpression ) | ( ruleNotEmptyExpression ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 42:
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
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:743:1: ( ruleFilterExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:743:1: ( ruleFilterExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:744:1: ruleFilterExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives1535);
                    ruleFilterExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getFilterExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:749:6: ( ruleCountExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:749:6: ( ruleCountExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:750:1: ruleCountExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives1552);
                    ruleCountExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getCountExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:755:6: ( ruleNotEmptyExpression )
                    {
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:755:6: ( ruleNotEmptyExpression )
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:756:1: ruleNotEmptyExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getNotEmptyExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives1569);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:768:1: rule__GridGame__Group__0 : rule__GridGame__Group__0__Impl rule__GridGame__Group__1 ;
    public final void rule__GridGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:772:1: ( rule__GridGame__Group__0__Impl rule__GridGame__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:773:2: rule__GridGame__Group__0__Impl rule__GridGame__Group__1
            {
            pushFollow(FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__01599);
            rule__GridGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__01602);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:780:1: rule__GridGame__Group__0__Impl : ( 'game' ) ;
    public final void rule__GridGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:784:1: ( ( 'game' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:785:1: ( 'game' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:785:1: ( 'game' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:786:1: 'game'
            {
             before(grammarAccess.getGridGameAccess().getGameKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__GridGame__Group__0__Impl1630); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:799:1: rule__GridGame__Group__1 : rule__GridGame__Group__1__Impl rule__GridGame__Group__2 ;
    public final void rule__GridGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:803:1: ( rule__GridGame__Group__1__Impl rule__GridGame__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:804:2: rule__GridGame__Group__1__Impl rule__GridGame__Group__2
            {
            pushFollow(FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__11661);
            rule__GridGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__11664);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:811:1: rule__GridGame__Group__1__Impl : ( ( rule__GridGame__NameAssignment_1 ) ) ;
    public final void rule__GridGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:815:1: ( ( ( rule__GridGame__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:816:1: ( ( rule__GridGame__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:816:1: ( ( rule__GridGame__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:817:1: ( rule__GridGame__NameAssignment_1 )
            {
             before(grammarAccess.getGridGameAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:818:1: ( rule__GridGame__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:818:2: rule__GridGame__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl1691);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:828:1: rule__GridGame__Group__2 : rule__GridGame__Group__2__Impl rule__GridGame__Group__3 ;
    public final void rule__GridGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:832:1: ( rule__GridGame__Group__2__Impl rule__GridGame__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:833:2: rule__GridGame__Group__2__Impl rule__GridGame__Group__3
            {
            pushFollow(FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__21721);
            rule__GridGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__21724);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:840:1: rule__GridGame__Group__2__Impl : ( '{' ) ;
    public final void rule__GridGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:844:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:845:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:845:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:846:1: '{'
            {
             before(grammarAccess.getGridGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__GridGame__Group__2__Impl1752); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:859:1: rule__GridGame__Group__3 : rule__GridGame__Group__3__Impl rule__GridGame__Group__4 ;
    public final void rule__GridGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:863:1: ( rule__GridGame__Group__3__Impl rule__GridGame__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:864:2: rule__GridGame__Group__3__Impl rule__GridGame__Group__4
            {
            pushFollow(FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__31783);
            rule__GridGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__31786);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:871:1: rule__GridGame__Group__3__Impl : ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) ) ;
    public final void rule__GridGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:875:1: ( ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:876:1: ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:876:1: ( ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:877:1: ( ( rule__GridGame__CellsAssignment_3 ) ) ( ( rule__GridGame__CellsAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:877:1: ( ( rule__GridGame__CellsAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:878:1: ( rule__GridGame__CellsAssignment_3 )
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:879:1: ( rule__GridGame__CellsAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:879:2: rule__GridGame__CellsAssignment_3
            {
            pushFollow(FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1815);
            rule__GridGame__CellsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getCellsAssignment_3()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:882:1: ( ( rule__GridGame__CellsAssignment_3 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:883:1: ( rule__GridGame__CellsAssignment_3 )*
            {
             before(grammarAccess.getGridGameAccess().getCellsAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:884:1: ( rule__GridGame__CellsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:884:2: rule__GridGame__CellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1827);
            	    rule__GridGame__CellsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:895:1: rule__GridGame__Group__4 : rule__GridGame__Group__4__Impl rule__GridGame__Group__5 ;
    public final void rule__GridGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:899:1: ( rule__GridGame__Group__4__Impl rule__GridGame__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:900:2: rule__GridGame__Group__4__Impl rule__GridGame__Group__5
            {
            pushFollow(FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__41860);
            rule__GridGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__41863);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:907:1: rule__GridGame__Group__4__Impl : ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) ) ;
    public final void rule__GridGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:911:1: ( ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:912:1: ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:912:1: ( ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:913:1: ( ( rule__GridGame__FieldsAssignment_4 ) ) ( ( rule__GridGame__FieldsAssignment_4 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:913:1: ( ( rule__GridGame__FieldsAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:914:1: ( rule__GridGame__FieldsAssignment_4 )
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:915:1: ( rule__GridGame__FieldsAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:915:2: rule__GridGame__FieldsAssignment_4
            {
            pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1892);
            rule__GridGame__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGridGameAccess().getFieldsAssignment_4()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:918:1: ( ( rule__GridGame__FieldsAssignment_4 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:919:1: ( rule__GridGame__FieldsAssignment_4 )*
            {
             before(grammarAccess.getGridGameAccess().getFieldsAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:920:1: ( rule__GridGame__FieldsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:920:2: rule__GridGame__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1904);
            	    rule__GridGame__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:931:1: rule__GridGame__Group__5 : rule__GridGame__Group__5__Impl rule__GridGame__Group__6 ;
    public final void rule__GridGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:935:1: ( rule__GridGame__Group__5__Impl rule__GridGame__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:936:2: rule__GridGame__Group__5__Impl rule__GridGame__Group__6
            {
            pushFollow(FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__51937);
            rule__GridGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__51940);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:943:1: rule__GridGame__Group__5__Impl : ( ( rule__GridGame__OptionsAssignment_5 )* ) ;
    public final void rule__GridGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:947:1: ( ( ( rule__GridGame__OptionsAssignment_5 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:948:1: ( ( rule__GridGame__OptionsAssignment_5 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:948:1: ( ( rule__GridGame__OptionsAssignment_5 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:949:1: ( rule__GridGame__OptionsAssignment_5 )*
            {
             before(grammarAccess.getGridGameAccess().getOptionsAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:950:1: ( rule__GridGame__OptionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:950:2: rule__GridGame__OptionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__GridGame__OptionsAssignment_5_in_rule__GridGame__Group__5__Impl1967);
            	    rule__GridGame__OptionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:960:1: rule__GridGame__Group__6 : rule__GridGame__Group__6__Impl ;
    public final void rule__GridGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:964:1: ( rule__GridGame__Group__6__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:965:2: rule__GridGame__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__61998);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:971:1: rule__GridGame__Group__6__Impl : ( '}' ) ;
    public final void rule__GridGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:975:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:976:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:976:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:977:1: '}'
            {
             before(grammarAccess.getGridGameAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__GridGame__Group__6__Impl2026); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1004:1: rule__CellSpecification__Group__0 : rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 ;
    public final void rule__CellSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1008:1: ( rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1009:2: rule__CellSpecification__Group__0__Impl rule__CellSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__02071);
            rule__CellSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__02074);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1016:1: rule__CellSpecification__Group__0__Impl : ( 'cell' ) ;
    public final void rule__CellSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1020:1: ( ( 'cell' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1021:1: ( 'cell' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1021:1: ( 'cell' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1022:1: 'cell'
            {
             before(grammarAccess.getCellSpecificationAccess().getCellKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__CellSpecification__Group__0__Impl2102); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1035:1: rule__CellSpecification__Group__1 : rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 ;
    public final void rule__CellSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1039:1: ( rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1040:2: rule__CellSpecification__Group__1__Impl rule__CellSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__12133);
            rule__CellSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__12136);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1047:1: rule__CellSpecification__Group__1__Impl : ( ( rule__CellSpecification__NameAssignment_1 ) ) ;
    public final void rule__CellSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1051:1: ( ( ( rule__CellSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1052:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1052:1: ( ( rule__CellSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1053:1: ( rule__CellSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getCellSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1054:1: ( rule__CellSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1054:2: rule__CellSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl2163);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1064:1: rule__CellSpecification__Group__2 : rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 ;
    public final void rule__CellSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1068:1: ( rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1069:2: rule__CellSpecification__Group__2__Impl rule__CellSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__22193);
            rule__CellSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__22196);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1076:1: rule__CellSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__CellSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1080:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1081:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1081:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1082:1: '{'
            {
             before(grammarAccess.getCellSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__CellSpecification__Group__2__Impl2224); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1095:1: rule__CellSpecification__Group__3 : rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 ;
    public final void rule__CellSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1099:1: ( rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1100:2: rule__CellSpecification__Group__3__Impl rule__CellSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__32255);
            rule__CellSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__32258);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1107:1: rule__CellSpecification__Group__3__Impl : ( ( rule__CellSpecification__MembersAssignment_3 )* ) ;
    public final void rule__CellSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1111:1: ( ( ( rule__CellSpecification__MembersAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1112:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1112:1: ( ( rule__CellSpecification__MembersAssignment_3 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1113:1: ( rule__CellSpecification__MembersAssignment_3 )*
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1114:1: ( rule__CellSpecification__MembersAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1114:2: rule__CellSpecification__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl2285);
            	    rule__CellSpecification__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1124:1: rule__CellSpecification__Group__4 : rule__CellSpecification__Group__4__Impl ;
    public final void rule__CellSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1128:1: ( rule__CellSpecification__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1129:2: rule__CellSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__42316);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1135:1: rule__CellSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__CellSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1139:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1140:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1140:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1141:1: '}'
            {
             before(grammarAccess.getCellSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__CellSpecification__Group__4__Impl2344); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1164:1: rule__CellDisplaySpec__Group__0 : rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 ;
    public final void rule__CellDisplaySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1168:1: ( rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1169:2: rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__02385);
            rule__CellDisplaySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__02388);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1176:1: rule__CellDisplaySpec__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplaySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1180:1: ( ( 'display' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1181:1: ( 'display' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1181:1: ( 'display' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1182:1: 'display'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__CellDisplaySpec__Group__0__Impl2416); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1195:1: rule__CellDisplaySpec__Group__1 : rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 ;
    public final void rule__CellDisplaySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1199:1: ( rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1200:2: rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__12447);
            rule__CellDisplaySpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__12450);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1207:1: rule__CellDisplaySpec__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplaySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1211:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1212:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1212:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1213:1: '{'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__CellDisplaySpec__Group__1__Impl2478); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1226:1: rule__CellDisplaySpec__Group__2 : rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 ;
    public final void rule__CellDisplaySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1230:1: ( rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1231:2: rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__22509);
            rule__CellDisplaySpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__22512);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1238:1: rule__CellDisplaySpec__Group__2__Impl : ( 'as' ) ;
    public final void rule__CellDisplaySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1242:1: ( ( 'as' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1243:1: ( 'as' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1243:1: ( 'as' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1244:1: 'as'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAsKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__CellDisplaySpec__Group__2__Impl2540); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1257:1: rule__CellDisplaySpec__Group__3 : rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 ;
    public final void rule__CellDisplaySpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1261:1: ( rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1262:2: rule__CellDisplaySpec__Group__3__Impl rule__CellDisplaySpec__Group__4
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__32571);
            rule__CellDisplaySpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__32574);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1269:1: rule__CellDisplaySpec__Group__3__Impl : ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) ;
    public final void rule__CellDisplaySpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1273:1: ( ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1274:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1274:1: ( ( rule__CellDisplaySpec__Display_typeAssignment_3 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1275:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAssignment_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1276:1: ( rule__CellDisplaySpec__Display_typeAssignment_3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1276:2: rule__CellDisplaySpec__Display_typeAssignment_3
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl2601);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1286:1: rule__CellDisplaySpec__Group__4 : rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 ;
    public final void rule__CellDisplaySpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1290:1: ( rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1291:2: rule__CellDisplaySpec__Group__4__Impl rule__CellDisplaySpec__Group__5
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__42631);
            rule__CellDisplaySpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__42634);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1298:1: rule__CellDisplaySpec__Group__4__Impl : ( ( rule__CellDisplaySpec__Alternatives_4 ) ) ;
    public final void rule__CellDisplaySpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1302:1: ( ( ( rule__CellDisplaySpec__Alternatives_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1303:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1303:1: ( ( rule__CellDisplaySpec__Alternatives_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1304:1: ( rule__CellDisplaySpec__Alternatives_4 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAlternatives_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1305:1: ( rule__CellDisplaySpec__Alternatives_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1305:2: rule__CellDisplaySpec__Alternatives_4
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Alternatives_4_in_rule__CellDisplaySpec__Group__4__Impl2661);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1315:1: rule__CellDisplaySpec__Group__5 : rule__CellDisplaySpec__Group__5__Impl ;
    public final void rule__CellDisplaySpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1319:1: ( rule__CellDisplaySpec__Group__5__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1320:2: rule__CellDisplaySpec__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__52691);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1326:1: rule__CellDisplaySpec__Group__5__Impl : ( '}' ) ;
    public final void rule__CellDisplaySpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1330:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1331:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1331:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1332:1: '}'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__CellDisplaySpec__Group__5__Impl2719); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1357:1: rule__CellDisplaySpec__Group_4_0__0 : rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 ;
    public final void rule__CellDisplaySpec__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1361:1: ( rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1362:2: rule__CellDisplaySpec__Group_4_0__0__Impl rule__CellDisplaySpec__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__0__Impl_in_rule__CellDisplaySpec__Group_4_0__02762);
            rule__CellDisplaySpec__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__1_in_rule__CellDisplaySpec__Group_4_0__02765);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1369:1: rule__CellDisplaySpec__Group_4_0__0__Impl : ( 'text' ) ;
    public final void rule__CellDisplaySpec__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1373:1: ( ( 'text' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1374:1: ( 'text' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1374:1: ( 'text' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1375:1: 'text'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_4_0_0()); 
            match(input,21,FOLLOW_21_in_rule__CellDisplaySpec__Group_4_0__0__Impl2793); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1388:1: rule__CellDisplaySpec__Group_4_0__1 : rule__CellDisplaySpec__Group_4_0__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1392:1: ( rule__CellDisplaySpec__Group_4_0__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1393:2: rule__CellDisplaySpec__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_0__1__Impl_in_rule__CellDisplaySpec__Group_4_0__12824);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1399:1: rule__CellDisplaySpec__Group_4_0__1__Impl : ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1403:1: ( ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1404:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1404:1: ( ( rule__CellDisplaySpec__TextAssignment_4_0_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1405:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_4_0_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1406:1: ( rule__CellDisplaySpec__TextAssignment_4_0_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1406:2: rule__CellDisplaySpec__TextAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__TextAssignment_4_0_1_in_rule__CellDisplaySpec__Group_4_0__1__Impl2851);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1420:1: rule__CellDisplaySpec__Group_4_1__0 : rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 ;
    public final void rule__CellDisplaySpec__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1424:1: ( rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1425:2: rule__CellDisplaySpec__Group_4_1__0__Impl rule__CellDisplaySpec__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__0__Impl_in_rule__CellDisplaySpec__Group_4_1__02885);
            rule__CellDisplaySpec__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__1_in_rule__CellDisplaySpec__Group_4_1__02888);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1432:1: rule__CellDisplaySpec__Group_4_1__0__Impl : ( 'var' ) ;
    public final void rule__CellDisplaySpec__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1436:1: ( ( 'var' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1437:1: ( 'var' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1437:1: ( 'var' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1438:1: 'var'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarKeyword_4_1_0()); 
            match(input,22,FOLLOW_22_in_rule__CellDisplaySpec__Group_4_1__0__Impl2916); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1451:1: rule__CellDisplaySpec__Group_4_1__1 : rule__CellDisplaySpec__Group_4_1__1__Impl ;
    public final void rule__CellDisplaySpec__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1455:1: ( rule__CellDisplaySpec__Group_4_1__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1456:2: rule__CellDisplaySpec__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Group_4_1__1__Impl_in_rule__CellDisplaySpec__Group_4_1__12947);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1462:1: rule__CellDisplaySpec__Group_4_1__1__Impl : ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) ;
    public final void rule__CellDisplaySpec__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1466:1: ( ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1467:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1467:1: ( ( rule__CellDisplaySpec__VarAssignment_4_1_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1468:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarAssignment_4_1_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1469:1: ( rule__CellDisplaySpec__VarAssignment_4_1_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1469:2: rule__CellDisplaySpec__VarAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__VarAssignment_4_1_1_in_rule__CellDisplaySpec__Group_4_1__1__Impl2974);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1483:1: rule__CellVarSpec__Group__0 : rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 ;
    public final void rule__CellVarSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1487:1: ( rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1488:2: rule__CellVarSpec__Group__0__Impl rule__CellVarSpec__Group__1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__03008);
            rule__CellVarSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__03011);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1495:1: rule__CellVarSpec__Group__0__Impl : ( 'var' ) ;
    public final void rule__CellVarSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1499:1: ( ( 'var' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1500:1: ( 'var' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1500:1: ( 'var' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1501:1: 'var'
            {
             before(grammarAccess.getCellVarSpecAccess().getVarKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__CellVarSpec__Group__0__Impl3039); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1514:1: rule__CellVarSpec__Group__1 : rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 ;
    public final void rule__CellVarSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1518:1: ( rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1519:2: rule__CellVarSpec__Group__1__Impl rule__CellVarSpec__Group__2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__13070);
            rule__CellVarSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__13073);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1526:1: rule__CellVarSpec__Group__1__Impl : ( ( rule__CellVarSpec__TypeAssignment_1 ) ) ;
    public final void rule__CellVarSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1530:1: ( ( ( rule__CellVarSpec__TypeAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1531:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1531:1: ( ( rule__CellVarSpec__TypeAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1532:1: ( rule__CellVarSpec__TypeAssignment_1 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1533:1: ( rule__CellVarSpec__TypeAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1533:2: rule__CellVarSpec__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl3100);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1543:1: rule__CellVarSpec__Group__2 : rule__CellVarSpec__Group__2__Impl ;
    public final void rule__CellVarSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1547:1: ( rule__CellVarSpec__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1548:2: rule__CellVarSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__23130);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1554:1: rule__CellVarSpec__Group__2__Impl : ( ( rule__CellVarSpec__NameAssignment_2 ) ) ;
    public final void rule__CellVarSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1558:1: ( ( ( rule__CellVarSpec__NameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1559:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1559:1: ( ( rule__CellVarSpec__NameAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1560:1: ( rule__CellVarSpec__NameAssignment_2 )
            {
             before(grammarAccess.getCellVarSpecAccess().getNameAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1561:1: ( rule__CellVarSpec__NameAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1561:2: rule__CellVarSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl3157);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1577:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1581:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1582:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__03193);
            rule__FieldSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__03196);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1589:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1593:1: ( ( 'field' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1594:1: ( 'field' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1594:1: ( 'field' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1595:1: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__FieldSpecification__Group__0__Impl3224); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1608:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1612:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1613:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__13255);
            rule__FieldSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__13258);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1620:1: rule__FieldSpecification__Group__1__Impl : ( ( rule__FieldSpecification__NameAssignment_1 ) ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1624:1: ( ( ( rule__FieldSpecification__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1625:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1625:1: ( ( rule__FieldSpecification__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1626:1: ( rule__FieldSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1627:1: ( rule__FieldSpecification__NameAssignment_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1627:2: rule__FieldSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl3285);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1637:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1641:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1642:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__23315);
            rule__FieldSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__23318);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1649:1: rule__FieldSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1653:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1654:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1654:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1655:1: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__FieldSpecification__Group__2__Impl3346); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1668:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1672:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1673:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__33377);
            rule__FieldSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__33380);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1680:1: rule__FieldSpecification__Group__3__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1684:1: ( ( 'width' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1685:1: ( 'width' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1685:1: ( 'width' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1686:1: 'width'
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__FieldSpecification__Group__3__Impl3408); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1699:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1703:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1704:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__43439);
            rule__FieldSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__43442);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1711:1: rule__FieldSpecification__Group__4__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1715:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1716:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1716:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1717:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__FieldSpecification__Group__4__Impl3470); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1730:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1734:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1735:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__53501);
            rule__FieldSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__53504);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1742:1: rule__FieldSpecification__Group__5__Impl : ( ( rule__FieldSpecification__WidthAssignment_5 ) ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1746:1: ( ( ( rule__FieldSpecification__WidthAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1747:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1747:1: ( ( rule__FieldSpecification__WidthAssignment_5 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1748:1: ( rule__FieldSpecification__WidthAssignment_5 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1749:1: ( rule__FieldSpecification__WidthAssignment_5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1749:2: rule__FieldSpecification__WidthAssignment_5
            {
            pushFollow(FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl3531);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1759:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1763:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1764:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__63561);
            rule__FieldSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__63564);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1771:1: rule__FieldSpecification__Group__6__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1775:1: ( ( 'height' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1776:1: ( 'height' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1776:1: ( 'height' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1777:1: 'height'
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__FieldSpecification__Group__6__Impl3592); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1790:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1794:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1795:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__73623);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__73626);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1802:1: rule__FieldSpecification__Group__7__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1806:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1807:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1807:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1808:1: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__FieldSpecification__Group__7__Impl3654); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1821:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1825:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1826:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__83685);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__83688);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1833:1: rule__FieldSpecification__Group__8__Impl : ( ( rule__FieldSpecification__HeightAssignment_8 ) ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1837:1: ( ( ( rule__FieldSpecification__HeightAssignment_8 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1838:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1838:1: ( ( rule__FieldSpecification__HeightAssignment_8 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1839:1: ( rule__FieldSpecification__HeightAssignment_8 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_8()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1840:1: ( rule__FieldSpecification__HeightAssignment_8 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1840:2: rule__FieldSpecification__HeightAssignment_8
            {
            pushFollow(FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl3715);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1850:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1854:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1855:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__93745);
            rule__FieldSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__93748);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1862:1: rule__FieldSpecification__Group__9__Impl : ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1866:1: ( ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1867:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1867:1: ( ( rule__FieldSpecification__Field_initialisationAssignment_9 )? )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1868:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationAssignment_9()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1869:1: ( rule__FieldSpecification__Field_initialisationAssignment_9 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1869:2: rule__FieldSpecification__Field_initialisationAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl3775);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1879:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1883:1: ( rule__FieldSpecification__Group__10__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1884:2: rule__FieldSpecification__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__103806);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1890:1: rule__FieldSpecification__Group__10__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1894:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1895:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1895:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1896:1: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__FieldSpecification__Group__10__Impl3834); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1931:1: rule__AllowRestartMenu__Group__0 : rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 ;
    public final void rule__AllowRestartMenu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1935:1: ( rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1936:2: rule__AllowRestartMenu__Group__0__Impl rule__AllowRestartMenu__Group__1
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__03887);
            rule__AllowRestartMenu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__03890);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1943:1: rule__AllowRestartMenu__Group__0__Impl : ( 'allow_restart' ) ;
    public final void rule__AllowRestartMenu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1947:1: ( ( 'allow_restart' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1948:1: ( 'allow_restart' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1948:1: ( 'allow_restart' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1949:1: 'allow_restart'
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllow_restartKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__AllowRestartMenu__Group__0__Impl3918); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1962:1: rule__AllowRestartMenu__Group__1 : rule__AllowRestartMenu__Group__1__Impl ;
    public final void rule__AllowRestartMenu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1966:1: ( rule__AllowRestartMenu__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1967:2: rule__AllowRestartMenu__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__13949);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1973:1: rule__AllowRestartMenu__Group__1__Impl : ( () ) ;
    public final void rule__AllowRestartMenu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1977:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1978:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1978:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1979:1: ()
            {
             before(grammarAccess.getAllowRestartMenuAccess().getAllowRestartMenuAction_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1980:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1982:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:1996:1: rule__StartFieldDeclaration__Group__0 : rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 ;
    public final void rule__StartFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2000:1: ( rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2001:2: rule__StartFieldDeclaration__Group__0__Impl rule__StartFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__04011);
            rule__StartFieldDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__04014);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2008:1: rule__StartFieldDeclaration__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2012:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2013:1: ( 'start' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2013:1: ( 'start' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2014:1: 'start'
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getStartKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__StartFieldDeclaration__Group__0__Impl4042); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2027:1: rule__StartFieldDeclaration__Group__1 : rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 ;
    public final void rule__StartFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2031:1: ( rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2032:2: rule__StartFieldDeclaration__Group__1__Impl rule__StartFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__14073);
            rule__StartFieldDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__14076);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2039:1: rule__StartFieldDeclaration__Group__1__Impl : ( '=' ) ;
    public final void rule__StartFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2043:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2044:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2044:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2045:1: '='
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__StartFieldDeclaration__Group__1__Impl4104); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2058:1: rule__StartFieldDeclaration__Group__2 : rule__StartFieldDeclaration__Group__2__Impl ;
    public final void rule__StartFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2062:1: ( rule__StartFieldDeclaration__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2063:2: rule__StartFieldDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__24135);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2069:1: rule__StartFieldDeclaration__Group__2__Impl : ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) ;
    public final void rule__StartFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2073:1: ( ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2074:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2074:1: ( ( rule__StartFieldDeclaration__FieldAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2075:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2076:1: ( rule__StartFieldDeclaration__FieldAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2076:2: rule__StartFieldDeclaration__FieldAssignment_2
            {
            pushFollow(FOLLOW_rule__StartFieldDeclaration__FieldAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl4162);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2092:1: rule__FieldInitialisations__Group__0 : rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 ;
    public final void rule__FieldInitialisations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2096:1: ( rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2097:2: rule__FieldInitialisations__Group__0__Impl rule__FieldInitialisations__Group__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__04198);
            rule__FieldInitialisations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__04201);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2104:1: rule__FieldInitialisations__Group__0__Impl : ( 'init' ) ;
    public final void rule__FieldInitialisations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2108:1: ( ( 'init' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2109:1: ( 'init' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2109:1: ( 'init' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2110:1: 'init'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__FieldInitialisations__Group__0__Impl4229); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2123:1: rule__FieldInitialisations__Group__1 : rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 ;
    public final void rule__FieldInitialisations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2127:1: ( rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2128:2: rule__FieldInitialisations__Group__1__Impl rule__FieldInitialisations__Group__2
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__14260);
            rule__FieldInitialisations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__14263);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2135:1: rule__FieldInitialisations__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldInitialisations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2139:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2140:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2140:1: ( '{' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2141:1: '{'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__FieldInitialisations__Group__1__Impl4291); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2154:1: rule__FieldInitialisations__Group__2 : rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 ;
    public final void rule__FieldInitialisations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2158:1: ( rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2159:2: rule__FieldInitialisations__Group__2__Impl rule__FieldInitialisations__Group__3
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__24322);
            rule__FieldInitialisations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__24325);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2166:1: rule__FieldInitialisations__Group__2__Impl : ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) ;
    public final void rule__FieldInitialisations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2170:1: ( ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2171:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2171:1: ( ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2172:1: ( ( rule__FieldInitialisations__Group_2__0 ) ) ( ( rule__FieldInitialisations__Group_2__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2172:1: ( ( rule__FieldInitialisations__Group_2__0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2173:1: ( rule__FieldInitialisations__Group_2__0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2174:1: ( rule__FieldInitialisations__Group_2__0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2174:2: rule__FieldInitialisations__Group_2__0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4354);
            rule__FieldInitialisations__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 

            }

            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2177:1: ( ( rule__FieldInitialisations__Group_2__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2178:1: ( rule__FieldInitialisations__Group_2__0 )*
            {
             before(grammarAccess.getFieldInitialisationsAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2179:1: ( rule__FieldInitialisations__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31||(LA13_0>=33 && LA13_0<=34)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2179:2: rule__FieldInitialisations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4366);
            	    rule__FieldInitialisations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2190:1: rule__FieldInitialisations__Group__3 : rule__FieldInitialisations__Group__3__Impl ;
    public final void rule__FieldInitialisations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2194:1: ( rule__FieldInitialisations__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2195:2: rule__FieldInitialisations__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__34399);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2201:1: rule__FieldInitialisations__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldInitialisations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2205:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2206:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2206:1: ( '}' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2207:1: '}'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__FieldInitialisations__Group__3__Impl4427); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2228:1: rule__FieldInitialisations__Group_2__0 : rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 ;
    public final void rule__FieldInitialisations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2232:1: ( rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2233:2: rule__FieldInitialisations__Group_2__0__Impl rule__FieldInitialisations__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__04466);
            rule__FieldInitialisations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__04469);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2240:1: rule__FieldInitialisations__Group_2__0__Impl : ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) ;
    public final void rule__FieldInitialisations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2244:1: ( ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2245:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2245:1: ( ( rule__FieldInitialisations__InitialisationsAssignment_2_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2246:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsAssignment_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2247:1: ( rule__FieldInitialisations__InitialisationsAssignment_2_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2247:2: rule__FieldInitialisations__InitialisationsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl4496);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2257:1: rule__FieldInitialisations__Group_2__1 : rule__FieldInitialisations__Group_2__1__Impl ;
    public final void rule__FieldInitialisations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2261:1: ( rule__FieldInitialisations__Group_2__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2262:2: rule__FieldInitialisations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__14526);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2268:1: rule__FieldInitialisations__Group_2__1__Impl : ( ';' ) ;
    public final void rule__FieldInitialisations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2272:1: ( ( ';' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2273:1: ( ';' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2273:1: ( ';' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2274:1: ';'
            {
             before(grammarAccess.getFieldInitialisationsAccess().getSemicolonKeyword_2_1()); 
            match(input,30,FOLLOW_30_in_rule__FieldInitialisations__Group_2__1__Impl4554); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2291:1: rule__DefaultInitialisation__Group__0 : rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 ;
    public final void rule__DefaultInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2295:1: ( rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2296:2: rule__DefaultInitialisation__Group__0__Impl rule__DefaultInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__04589);
            rule__DefaultInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__04592);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2303:1: rule__DefaultInitialisation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2307:1: ( ( 'default' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2308:1: ( 'default' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2308:1: ( 'default' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2309:1: 'default'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getDefaultKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__DefaultInitialisation__Group__0__Impl4620); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2322:1: rule__DefaultInitialisation__Group__1 : rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 ;
    public final void rule__DefaultInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2326:1: ( rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2327:2: rule__DefaultInitialisation__Group__1__Impl rule__DefaultInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__14651);
            rule__DefaultInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__14654);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2334:1: rule__DefaultInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2338:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2339:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2339:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2340:1: ':'
            {
             before(grammarAccess.getDefaultInitialisationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__DefaultInitialisation__Group__1__Impl4682); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2353:1: rule__DefaultInitialisation__Group__2 : rule__DefaultInitialisation__Group__2__Impl ;
    public final void rule__DefaultInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2357:1: ( rule__DefaultInitialisation__Group__2__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2358:2: rule__DefaultInitialisation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__24713);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2364:1: rule__DefaultInitialisation__Group__2__Impl : ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) ;
    public final void rule__DefaultInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2368:1: ( ( ( rule__DefaultInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2369:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2369:1: ( ( rule__DefaultInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2370:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2371:1: ( rule__DefaultInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2371:2: rule__DefaultInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl4740);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2387:1: rule__RandomInitialisation__Group__0 : rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 ;
    public final void rule__RandomInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2391:1: ( rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2392:2: rule__RandomInitialisation__Group__0__Impl rule__RandomInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__04776);
            rule__RandomInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__04779);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2399:1: rule__RandomInitialisation__Group__0__Impl : ( 'random' ) ;
    public final void rule__RandomInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2403:1: ( ( 'random' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2404:1: ( 'random' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2404:1: ( 'random' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2405:1: 'random'
            {
             before(grammarAccess.getRandomInitialisationAccess().getRandomKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__RandomInitialisation__Group__0__Impl4807); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2418:1: rule__RandomInitialisation__Group__1 : rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 ;
    public final void rule__RandomInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2422:1: ( rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2423:2: rule__RandomInitialisation__Group__1__Impl rule__RandomInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__14838);
            rule__RandomInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__14841);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2430:1: rule__RandomInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__RandomInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2434:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2435:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2435:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2436:1: ':'
            {
             before(grammarAccess.getRandomInitialisationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__RandomInitialisation__Group__1__Impl4869); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2449:1: rule__RandomInitialisation__Group__2 : rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 ;
    public final void rule__RandomInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2453:1: ( rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2454:2: rule__RandomInitialisation__Group__2__Impl rule__RandomInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__24900);
            rule__RandomInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__24903);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2461:1: rule__RandomInitialisation__Group__2__Impl : ( ( rule__RandomInitialisation__CellAssignment_2 ) ) ;
    public final void rule__RandomInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2465:1: ( ( ( rule__RandomInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2466:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2466:1: ( ( rule__RandomInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2467:1: ( rule__RandomInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2468:1: ( rule__RandomInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2468:2: rule__RandomInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl4930);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2478:1: rule__RandomInitialisation__Group__3 : rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 ;
    public final void rule__RandomInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2482:1: ( rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2483:2: rule__RandomInitialisation__Group__3__Impl rule__RandomInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__34960);
            rule__RandomInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__34963);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2490:1: rule__RandomInitialisation__Group__3__Impl : ( '=' ) ;
    public final void rule__RandomInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2494:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2495:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2495:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2496:1: '='
            {
             before(grammarAccess.getRandomInitialisationAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__RandomInitialisation__Group__3__Impl4991); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2509:1: rule__RandomInitialisation__Group__4 : rule__RandomInitialisation__Group__4__Impl ;
    public final void rule__RandomInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2513:1: ( rule__RandomInitialisation__Group__4__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2514:2: rule__RandomInitialisation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__45022);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2520:1: rule__RandomInitialisation__Group__4__Impl : ( ( rule__RandomInitialisation__CountAssignment_4 ) ) ;
    public final void rule__RandomInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2524:1: ( ( ( rule__RandomInitialisation__CountAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2525:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2525:1: ( ( rule__RandomInitialisation__CountAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2526:1: ( rule__RandomInitialisation__CountAssignment_4 )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2527:1: ( rule__RandomInitialisation__CountAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2527:2: rule__RandomInitialisation__CountAssignment_4
            {
            pushFollow(FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl5049);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2547:1: rule__ContextInitialisation__Group__0 : rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 ;
    public final void rule__ContextInitialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2551:1: ( rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2552:2: rule__ContextInitialisation__Group__0__Impl rule__ContextInitialisation__Group__1
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__05089);
            rule__ContextInitialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__05092);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2559:1: rule__ContextInitialisation__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextInitialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2563:1: ( ( 'context' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2564:1: ( 'context' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2564:1: ( 'context' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2565:1: 'context'
            {
             before(grammarAccess.getContextInitialisationAccess().getContextKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ContextInitialisation__Group__0__Impl5120); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2578:1: rule__ContextInitialisation__Group__1 : rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 ;
    public final void rule__ContextInitialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2582:1: ( rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2583:2: rule__ContextInitialisation__Group__1__Impl rule__ContextInitialisation__Group__2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__15151);
            rule__ContextInitialisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__15154);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2590:1: rule__ContextInitialisation__Group__1__Impl : ( ':' ) ;
    public final void rule__ContextInitialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2594:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2595:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2595:1: ( ':' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2596:1: ':'
            {
             before(grammarAccess.getContextInitialisationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__ContextInitialisation__Group__1__Impl5182); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2609:1: rule__ContextInitialisation__Group__2 : rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 ;
    public final void rule__ContextInitialisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2613:1: ( rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2614:2: rule__ContextInitialisation__Group__2__Impl rule__ContextInitialisation__Group__3
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__25213);
            rule__ContextInitialisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__25216);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2621:1: rule__ContextInitialisation__Group__2__Impl : ( ( rule__ContextInitialisation__CellAssignment_2 ) ) ;
    public final void rule__ContextInitialisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2625:1: ( ( ( rule__ContextInitialisation__CellAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2626:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2626:1: ( ( rule__ContextInitialisation__CellAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2627:1: ( rule__ContextInitialisation__CellAssignment_2 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2628:1: ( rule__ContextInitialisation__CellAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2628:2: rule__ContextInitialisation__CellAssignment_2
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl5243);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2638:1: rule__ContextInitialisation__Group__3 : rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 ;
    public final void rule__ContextInitialisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2642:1: ( rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2643:2: rule__ContextInitialisation__Group__3__Impl rule__ContextInitialisation__Group__4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__35273);
            rule__ContextInitialisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__35276);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2650:1: rule__ContextInitialisation__Group__3__Impl : ( 'check' ) ;
    public final void rule__ContextInitialisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2654:1: ( ( 'check' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2655:1: ( 'check' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2655:1: ( 'check' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2656:1: 'check'
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__ContextInitialisation__Group__3__Impl5304); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2669:1: rule__ContextInitialisation__Group__4 : rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 ;
    public final void rule__ContextInitialisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2673:1: ( rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2674:2: rule__ContextInitialisation__Group__4__Impl rule__ContextInitialisation__Group__5
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__45335);
            rule__ContextInitialisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__45338);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2681:1: rule__ContextInitialisation__Group__4__Impl : ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) ;
    public final void rule__ContextInitialisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2685:1: ( ( ( rule__ContextInitialisation__CheckAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2686:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2686:1: ( ( rule__ContextInitialisation__CheckAssignment_4 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2687:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckAssignment_4()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2688:1: ( rule__ContextInitialisation__CheckAssignment_4 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2688:2: rule__ContextInitialisation__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl5365);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2698:1: rule__ContextInitialisation__Group__5 : rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 ;
    public final void rule__ContextInitialisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2702:1: ( rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2703:2: rule__ContextInitialisation__Group__5__Impl rule__ContextInitialisation__Group__6
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__55395);
            rule__ContextInitialisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__55398);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2710:1: rule__ContextInitialisation__Group__5__Impl : ( 'value' ) ;
    public final void rule__ContextInitialisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2714:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2715:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2715:1: ( 'value' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2716:1: 'value'
            {
             before(grammarAccess.getContextInitialisationAccess().getValueKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__ContextInitialisation__Group__5__Impl5426); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2729:1: rule__ContextInitialisation__Group__6 : rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 ;
    public final void rule__ContextInitialisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2733:1: ( rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2734:2: rule__ContextInitialisation__Group__6__Impl rule__ContextInitialisation__Group__7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__65457);
            rule__ContextInitialisation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__65460);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2741:1: rule__ContextInitialisation__Group__6__Impl : ( '=' ) ;
    public final void rule__ContextInitialisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2745:1: ( ( '=' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2746:1: ( '=' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2746:1: ( '=' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2747:1: '='
            {
             before(grammarAccess.getContextInitialisationAccess().getEqualsSignKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__ContextInitialisation__Group__6__Impl5488); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2760:1: rule__ContextInitialisation__Group__7 : rule__ContextInitialisation__Group__7__Impl ;
    public final void rule__ContextInitialisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2764:1: ( rule__ContextInitialisation__Group__7__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2765:2: rule__ContextInitialisation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__75519);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2771:1: rule__ContextInitialisation__Group__7__Impl : ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) ;
    public final void rule__ContextInitialisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2775:1: ( ( ( rule__ContextInitialisation__ExpAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2776:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2776:1: ( ( rule__ContextInitialisation__ExpAssignment_7 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2777:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            {
             before(grammarAccess.getContextInitialisationAccess().getExpAssignment_7()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2778:1: ( rule__ContextInitialisation__ExpAssignment_7 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2778:2: rule__ContextInitialisation__ExpAssignment_7
            {
            pushFollow(FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl5546);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2804:1: rule__ContextExpression__Group__0 : rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 ;
    public final void rule__ContextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2808:1: ( rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2809:2: rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__05592);
            rule__ContextExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__05595);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2816:1: rule__ContextExpression__Group__0__Impl : ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) ;
    public final void rule__ContextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2820:1: ( ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2821:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2821:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2822:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2823:1: ( rule__ContextExpression__Sub_expAssignment_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2823:2: rule__ContextExpression__Sub_expAssignment_0
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl5622);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2833:1: rule__ContextExpression__Group__1 : rule__ContextExpression__Group__1__Impl ;
    public final void rule__ContextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2837:1: ( rule__ContextExpression__Group__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2838:2: rule__ContextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__15652);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2844:1: rule__ContextExpression__Group__1__Impl : ( ( rule__ContextExpression__Group_1__0 )* ) ;
    public final void rule__ContextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2848:1: ( ( ( rule__ContextExpression__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2849:1: ( ( rule__ContextExpression__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2849:1: ( ( rule__ContextExpression__Group_1__0 )* )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2850:1: ( rule__ContextExpression__Group_1__0 )*
            {
             before(grammarAccess.getContextExpressionAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2851:1: ( rule__ContextExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2851:2: rule__ContextExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl5679);
            	    rule__ContextExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2865:1: rule__ContextExpression__Group_1__0 : rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 ;
    public final void rule__ContextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2869:1: ( rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2870:2: rule__ContextExpression__Group_1__0__Impl rule__ContextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__05714);
            rule__ContextExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__05717);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2877:1: rule__ContextExpression__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ContextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2881:1: ( ( '.' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2882:1: ( '.' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2882:1: ( '.' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2883:1: '.'
            {
             before(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__ContextExpression__Group_1__0__Impl5745); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2896:1: rule__ContextExpression__Group_1__1 : rule__ContextExpression__Group_1__1__Impl ;
    public final void rule__ContextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2900:1: ( rule__ContextExpression__Group_1__1__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2901:2: rule__ContextExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__15776);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2907:1: rule__ContextExpression__Group_1__1__Impl : ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) ;
    public final void rule__ContextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2911:1: ( ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2912:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2912:1: ( ( rule__ContextExpression__Sub_expAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2913:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_1_1()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2914:1: ( rule__ContextExpression__Sub_expAssignment_1_1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2914:2: rule__ContextExpression__Sub_expAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl5803);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2928:1: rule__FilterExpression__Group__0 : rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 ;
    public final void rule__FilterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2932:1: ( rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2933:2: rule__FilterExpression__Group__0__Impl rule__FilterExpression__Group__1
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__05837);
            rule__FilterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__05840);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2940:1: rule__FilterExpression__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2944:1: ( ( 'filter' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2945:1: ( 'filter' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2945:1: ( 'filter' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2946:1: 'filter'
            {
             before(grammarAccess.getFilterExpressionAccess().getFilterKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__FilterExpression__Group__0__Impl5868); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2959:1: rule__FilterExpression__Group__1 : rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 ;
    public final void rule__FilterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2963:1: ( rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2964:2: rule__FilterExpression__Group__1__Impl rule__FilterExpression__Group__2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__15899);
            rule__FilterExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__15902);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2971:1: rule__FilterExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__FilterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2975:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2976:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2976:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2977:1: '('
            {
             before(grammarAccess.getFilterExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__FilterExpression__Group__1__Impl5930); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2990:1: rule__FilterExpression__Group__2 : rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 ;
    public final void rule__FilterExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2994:1: ( rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:2995:2: rule__FilterExpression__Group__2__Impl rule__FilterExpression__Group__3
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__25961);
            rule__FilterExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__25964);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3002:1: rule__FilterExpression__Group__2__Impl : ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) ;
    public final void rule__FilterExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3006:1: ( ( ( rule__FilterExpression__Cell_typeAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3007:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3007:1: ( ( rule__FilterExpression__Cell_typeAssignment_2 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3008:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeAssignment_2()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3009:1: ( rule__FilterExpression__Cell_typeAssignment_2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3009:2: rule__FilterExpression__Cell_typeAssignment_2
            {
            pushFollow(FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl5991);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3019:1: rule__FilterExpression__Group__3 : rule__FilterExpression__Group__3__Impl ;
    public final void rule__FilterExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3023:1: ( rule__FilterExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3024:2: rule__FilterExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__36021);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3030:1: rule__FilterExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3034:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3035:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3035:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3036:1: ')'
            {
             before(grammarAccess.getFilterExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__FilterExpression__Group__3__Impl6049); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3057:1: rule__CountExpression__Group__0 : rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 ;
    public final void rule__CountExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3061:1: ( rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3062:2: rule__CountExpression__Group__0__Impl rule__CountExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__06088);
            rule__CountExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__06091);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3069:1: rule__CountExpression__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3073:1: ( ( 'count' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3074:1: ( 'count' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3074:1: ( 'count' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3075:1: 'count'
            {
             before(grammarAccess.getCountExpressionAccess().getCountKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__CountExpression__Group__0__Impl6119); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3088:1: rule__CountExpression__Group__1 : rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 ;
    public final void rule__CountExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3092:1: ( rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3093:2: rule__CountExpression__Group__1__Impl rule__CountExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__16150);
            rule__CountExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__16153);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3100:1: rule__CountExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__CountExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3104:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3105:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3105:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3106:1: '('
            {
             before(grammarAccess.getCountExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__CountExpression__Group__1__Impl6181); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3119:1: rule__CountExpression__Group__2 : rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 ;
    public final void rule__CountExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3123:1: ( rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3124:2: rule__CountExpression__Group__2__Impl rule__CountExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__26212);
            rule__CountExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__26215);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3131:1: rule__CountExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__CountExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3135:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3136:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3136:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3137:1: ')'
            {
             before(grammarAccess.getCountExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__CountExpression__Group__2__Impl6243); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3150:1: rule__CountExpression__Group__3 : rule__CountExpression__Group__3__Impl ;
    public final void rule__CountExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3154:1: ( rule__CountExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3155:2: rule__CountExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__36274);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3161:1: rule__CountExpression__Group__3__Impl : ( () ) ;
    public final void rule__CountExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3165:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3166:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3166:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3167:1: ()
            {
             before(grammarAccess.getCountExpressionAccess().getCountExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3168:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3170:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3188:1: rule__NotEmptyExpression__Group__0 : rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 ;
    public final void rule__NotEmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3192:1: ( rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3193:2: rule__NotEmptyExpression__Group__0__Impl rule__NotEmptyExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__06340);
            rule__NotEmptyExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__06343);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3200:1: rule__NotEmptyExpression__Group__0__Impl : ( 'notEmpty' ) ;
    public final void rule__NotEmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3204:1: ( ( 'notEmpty' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3205:1: ( 'notEmpty' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3205:1: ( 'notEmpty' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3206:1: 'notEmpty'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__NotEmptyExpression__Group__0__Impl6371); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3219:1: rule__NotEmptyExpression__Group__1 : rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 ;
    public final void rule__NotEmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3223:1: ( rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3224:2: rule__NotEmptyExpression__Group__1__Impl rule__NotEmptyExpression__Group__2
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__16402);
            rule__NotEmptyExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__16405);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3231:1: rule__NotEmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__NotEmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3235:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3236:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3236:1: ( '(' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3237:1: '('
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__NotEmptyExpression__Group__1__Impl6433); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3250:1: rule__NotEmptyExpression__Group__2 : rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 ;
    public final void rule__NotEmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3254:1: ( rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3255:2: rule__NotEmptyExpression__Group__2__Impl rule__NotEmptyExpression__Group__3
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__26464);
            rule__NotEmptyExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__26467);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3262:1: rule__NotEmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__NotEmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3266:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3267:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3267:1: ( ')' )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3268:1: ')'
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__NotEmptyExpression__Group__2__Impl6495); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3281:1: rule__NotEmptyExpression__Group__3 : rule__NotEmptyExpression__Group__3__Impl ;
    public final void rule__NotEmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3285:1: ( rule__NotEmptyExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3286:2: rule__NotEmptyExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__36526);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3292:1: rule__NotEmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__NotEmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3296:1: ( ( () ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3297:1: ( () )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3297:1: ( () )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3298:1: ()
            {
             before(grammarAccess.getNotEmptyExpressionAccess().getNotEmptyExpressionAction_3()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3299:1: ()
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3301:1: 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3320:1: rule__GridGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GridGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3324:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3325:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3325:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3326:1: RULE_ID
            {
             before(grammarAccess.getGridGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_16597); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3335:1: rule__GridGame__CellsAssignment_3 : ( ruleCellSpecification ) ;
    public final void rule__GridGame__CellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3339:1: ( ( ruleCellSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3340:1: ( ruleCellSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3340:1: ( ruleCellSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3341:1: ruleCellSpecification
            {
             before(grammarAccess.getGridGameAccess().getCellsCellSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_36628);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3350:1: rule__GridGame__FieldsAssignment_4 : ( ruleFieldSpecification ) ;
    public final void rule__GridGame__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3354:1: ( ( ruleFieldSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3355:1: ( ruleFieldSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3355:1: ( ruleFieldSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3356:1: ruleFieldSpecification
            {
             before(grammarAccess.getGridGameAccess().getFieldsFieldSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_46659);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3365:1: rule__GridGame__OptionsAssignment_5 : ( ruleOptionSpecification ) ;
    public final void rule__GridGame__OptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3369:1: ( ( ruleOptionSpecification ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3370:1: ( ruleOptionSpecification )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3370:1: ( ruleOptionSpecification )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3371:1: ruleOptionSpecification
            {
             before(grammarAccess.getGridGameAccess().getOptionsOptionSpecificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_56690);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3380:1: rule__CellSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CellSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3384:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3385:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3385:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3386:1: RULE_ID
            {
             before(grammarAccess.getCellSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_16721); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3395:1: rule__CellSpecification__MembersAssignment_3 : ( ruleCellMember ) ;
    public final void rule__CellSpecification__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3399:1: ( ( ruleCellMember ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3400:1: ( ruleCellMember )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3400:1: ( ruleCellMember )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3401:1: ruleCellMember
            {
             before(grammarAccess.getCellSpecificationAccess().getMembersCellMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_36752);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3410:1: rule__CellDisplaySpec__Display_typeAssignment_3 : ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) ;
    public final void rule__CellDisplaySpec__Display_typeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3414:1: ( ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3415:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3415:1: ( ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3416:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAlternatives_3_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3417:1: ( rule__CellDisplaySpec__Display_typeAlternatives_3_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3417:2: rule__CellDisplaySpec__Display_typeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_36783);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3426:1: rule__CellDisplaySpec__TextAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__CellDisplaySpec__TextAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3430:1: ( ( RULE_STRING ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3431:1: ( RULE_STRING )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3431:1: ( RULE_STRING )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3432:1: RULE_STRING
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_4_0_16816); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3441:1: rule__CellDisplaySpec__VarAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CellDisplaySpec__VarAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3445:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3446:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3446:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3447:1: ( RULE_ID )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarCellVarSpecCrossReference_4_1_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3448:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3449:1: RULE_ID
            {
             before(grammarAccess.getCellDisplaySpecAccess().getVarCellVarSpecIDTerminalRuleCall_4_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellDisplaySpec__VarAssignment_4_1_16851); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3460:1: rule__CellVarSpec__TypeAssignment_1 : ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) ;
    public final void rule__CellVarSpec__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3464:1: ( ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3465:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3465:1: ( ( rule__CellVarSpec__TypeAlternatives_1_0 ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3466:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getCellVarSpecAccess().getTypeAlternatives_1_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3467:1: ( rule__CellVarSpec__TypeAlternatives_1_0 )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3467:2: rule__CellVarSpec__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_16886);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3476:1: rule__CellVarSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CellVarSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3480:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3481:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3481:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3482:1: RULE_ID
            {
             before(grammarAccess.getCellVarSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_26919); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3491:1: rule__FieldSpecification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3495:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3496:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3496:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3497:1: RULE_ID
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_16950); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3506:1: rule__FieldSpecification__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3510:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3511:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3511:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3512:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_56981); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3521:1: rule__FieldSpecification__HeightAssignment_8 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3525:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3526:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3526:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3527:1: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_87012); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3536:1: rule__FieldSpecification__Field_initialisationAssignment_9 : ( ruleFieldInitialisations ) ;
    public final void rule__FieldSpecification__Field_initialisationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3540:1: ( ( ruleFieldInitialisations ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3541:1: ( ruleFieldInitialisations )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3541:1: ( ruleFieldInitialisations )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3542:1: ruleFieldInitialisations
            {
             before(grammarAccess.getFieldSpecificationAccess().getField_initialisationFieldInitialisationsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_97043);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3551:1: rule__StartFieldDeclaration__FieldAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartFieldDeclaration__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3555:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3556:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3556:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3557:1: ( RULE_ID )
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3558:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3559:1: RULE_ID
            {
             before(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__FieldAssignment_27078); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3570:1: rule__FieldInitialisations__InitialisationsAssignment_2_0 : ( ruleFieldInitialisation ) ;
    public final void rule__FieldInitialisations__InitialisationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3574:1: ( ( ruleFieldInitialisation ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3575:1: ( ruleFieldInitialisation )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3575:1: ( ruleFieldInitialisation )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3576:1: ruleFieldInitialisation
            {
             before(grammarAccess.getFieldInitialisationsAccess().getInitialisationsFieldInitialisationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_07113);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3585:1: rule__DefaultInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefaultInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3589:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3590:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3590:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3591:1: ( RULE_ID )
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3592:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3593:1: RULE_ID
            {
             before(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_27148); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3604:1: rule__RandomInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RandomInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3608:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3609:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3609:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3610:1: ( RULE_ID )
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3611:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3612:1: RULE_ID
            {
             before(grammarAccess.getRandomInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_27187); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3623:1: rule__RandomInitialisation__CountAssignment_4 : ( RULE_INT ) ;
    public final void rule__RandomInitialisation__CountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3627:1: ( ( RULE_INT ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3628:1: ( RULE_INT )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3628:1: ( RULE_INT )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3629:1: RULE_INT
            {
             before(grammarAccess.getRandomInitialisationAccess().getCountINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_47222); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3638:1: rule__ContextInitialisation__CellAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ContextInitialisation__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3642:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3643:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3643:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3644:1: ( RULE_ID )
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3645:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3646:1: RULE_ID
            {
             before(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_27257); 
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3657:1: rule__ContextInitialisation__CheckAssignment_4 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3661:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3662:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3662:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3663:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_47292);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3672:1: rule__ContextInitialisation__ExpAssignment_7 : ( ruleContextExpression ) ;
    public final void rule__ContextInitialisation__ExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3676:1: ( ( ruleContextExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3677:1: ( ruleContextExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3677:1: ( ruleContextExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3678:1: ruleContextExpression
            {
             before(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_77323);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3687:1: rule__ContextExpression__Sub_expAssignment_0 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3691:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3692:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3692:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3693:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_07354);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3702:1: rule__ContextExpression__Sub_expAssignment_1_1 : ( ruleAtomicExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3706:1: ( ( ruleAtomicExpression ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3707:1: ( ruleAtomicExpression )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3707:1: ( ruleAtomicExpression )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3708:1: ruleAtomicExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAtomicExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_17385);
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
    // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3717:1: rule__FilterExpression__Cell_typeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FilterExpression__Cell_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3721:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3722:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3722:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3723:1: ( RULE_ID )
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationCrossReference_2_0()); 
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3724:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.zschaler.gridgames.ui/src-gen/uk/ac/kcl/inf/zschaler/gridgames/ui/contentassist/antlr/internal/InternalGridGame.g:3725:1: RULE_ID
            {
             before(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_27420); 
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
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__0_in_rule__CellDisplaySpec__Alternatives_41314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__0_in_rule__CellDisplaySpec__Alternatives_41332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellVarSpec__TypeAlternatives_1_01366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellVarSpec__TypeAlternatives_1_01386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartFieldDeclaration_in_rule__OptionSpecification__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowRestartMenu_in_rule__OptionSpecification__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultInitialisation_in_rule__FieldInitialisation__Alternatives1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRandomInitialisation_in_rule__FieldInitialisation__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextInitialisation_in_rule__FieldInitialisation__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpression_in_rule__AtomicExpression__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountExpression_in_rule__AtomicExpression__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEmptyExpression_in_rule__AtomicExpression__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__0__Impl_in_rule__GridGame__Group__01599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1_in_rule__GridGame__Group__01602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__GridGame__Group__0__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__1__Impl_in_rule__GridGame__Group__11661 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2_in_rule__GridGame__Group__11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__NameAssignment_1_in_rule__GridGame__Group__1__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__2__Impl_in_rule__GridGame__Group__21721 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3_in_rule__GridGame__Group__21724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GridGame__Group__2__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__3__Impl_in_rule__GridGame__Group__31783 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4_in_rule__GridGame__Group__31786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1815 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GridGame__CellsAssignment_3_in_rule__GridGame__Group__3__Impl1827 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__4__Impl_in_rule__GridGame__Group__41860 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5_in_rule__GridGame__Group__41863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1892 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__GridGame__FieldsAssignment_4_in_rule__GridGame__Group__4__Impl1904 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__5__Impl_in_rule__GridGame__Group__51937 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6_in_rule__GridGame__Group__51940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GridGame__OptionsAssignment_5_in_rule__GridGame__Group__5__Impl1967 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__GridGame__Group__6__Impl_in_rule__GridGame__Group__61998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GridGame__Group__6__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__0__Impl_in_rule__CellSpecification__Group__02071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1_in_rule__CellSpecification__Group__02074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CellSpecification__Group__0__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__1__Impl_in_rule__CellSpecification__Group__12133 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2_in_rule__CellSpecification__Group__12136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__NameAssignment_1_in_rule__CellSpecification__Group__1__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__2__Impl_in_rule__CellSpecification__Group__22193 = new BitSet(new long[]{0x00000000004A0000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3_in_rule__CellSpecification__Group__22196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CellSpecification__Group__2__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__3__Impl_in_rule__CellSpecification__Group__32255 = new BitSet(new long[]{0x00000000004A0000L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4_in_rule__CellSpecification__Group__32258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellSpecification__MembersAssignment_3_in_rule__CellSpecification__Group__3__Impl2285 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_rule__CellSpecification__Group__4__Impl_in_rule__CellSpecification__Group__42316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CellSpecification__Group__4__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__0__Impl_in_rule__CellDisplaySpec__Group__02385 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1_in_rule__CellDisplaySpec__Group__02388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CellDisplaySpec__Group__0__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__1__Impl_in_rule__CellDisplaySpec__Group__12447 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2_in_rule__CellDisplaySpec__Group__12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CellDisplaySpec__Group__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__2__Impl_in_rule__CellDisplaySpec__Group__22509 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3_in_rule__CellDisplaySpec__Group__22512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CellDisplaySpec__Group__2__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__3__Impl_in_rule__CellDisplaySpec__Group__32571 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4_in_rule__CellDisplaySpec__Group__32574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAssignment_3_in_rule__CellDisplaySpec__Group__3__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__4__Impl_in_rule__CellDisplaySpec__Group__42631 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5_in_rule__CellDisplaySpec__Group__42634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Alternatives_4_in_rule__CellDisplaySpec__Group__4__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group__5__Impl_in_rule__CellDisplaySpec__Group__52691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CellDisplaySpec__Group__5__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__0__Impl_in_rule__CellDisplaySpec__Group_4_0__02762 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__1_in_rule__CellDisplaySpec__Group_4_0__02765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CellDisplaySpec__Group_4_0__0__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_0__1__Impl_in_rule__CellDisplaySpec__Group_4_0__12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__TextAssignment_4_0_1_in_rule__CellDisplaySpec__Group_4_0__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__0__Impl_in_rule__CellDisplaySpec__Group_4_1__02885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__1_in_rule__CellDisplaySpec__Group_4_1__02888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CellDisplaySpec__Group_4_1__0__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Group_4_1__1__Impl_in_rule__CellDisplaySpec__Group_4_1__12947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__VarAssignment_4_1_1_in_rule__CellDisplaySpec__Group_4_1__1__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__0__Impl_in_rule__CellVarSpec__Group__03008 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1_in_rule__CellVarSpec__Group__03011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CellVarSpec__Group__0__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__1__Impl_in_rule__CellVarSpec__Group__13070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2_in_rule__CellVarSpec__Group__13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAssignment_1_in_rule__CellVarSpec__Group__1__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__Group__2__Impl_in_rule__CellVarSpec__Group__23130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__NameAssignment_2_in_rule__CellVarSpec__Group__2__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__0__Impl_in_rule__FieldSpecification__Group__03193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1_in_rule__FieldSpecification__Group__03196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FieldSpecification__Group__0__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__1__Impl_in_rule__FieldSpecification__Group__13255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2_in_rule__FieldSpecification__Group__13258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__NameAssignment_1_in_rule__FieldSpecification__Group__1__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__2__Impl_in_rule__FieldSpecification__Group__23315 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3_in_rule__FieldSpecification__Group__23318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldSpecification__Group__2__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__3__Impl_in_rule__FieldSpecification__Group__33377 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4_in_rule__FieldSpecification__Group__33380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FieldSpecification__Group__3__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__4__Impl_in_rule__FieldSpecification__Group__43439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5_in_rule__FieldSpecification__Group__43442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FieldSpecification__Group__4__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__5__Impl_in_rule__FieldSpecification__Group__53501 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6_in_rule__FieldSpecification__Group__53504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__WidthAssignment_5_in_rule__FieldSpecification__Group__5__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__6__Impl_in_rule__FieldSpecification__Group__63561 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7_in_rule__FieldSpecification__Group__63564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FieldSpecification__Group__6__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__7__Impl_in_rule__FieldSpecification__Group__73623 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8_in_rule__FieldSpecification__Group__73626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FieldSpecification__Group__7__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__8__Impl_in_rule__FieldSpecification__Group__83685 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9_in_rule__FieldSpecification__Group__83688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__HeightAssignment_8_in_rule__FieldSpecification__Group__8__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__9__Impl_in_rule__FieldSpecification__Group__93745 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10_in_rule__FieldSpecification__Group__93748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Field_initialisationAssignment_9_in_rule__FieldSpecification__Group__9__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldSpecification__Group__10__Impl_in_rule__FieldSpecification__Group__103806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldSpecification__Group__10__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__0__Impl_in_rule__AllowRestartMenu__Group__03887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1_in_rule__AllowRestartMenu__Group__03890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AllowRestartMenu__Group__0__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllowRestartMenu__Group__1__Impl_in_rule__AllowRestartMenu__Group__13949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__0__Impl_in_rule__StartFieldDeclaration__Group__04011 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1_in_rule__StartFieldDeclaration__Group__04014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StartFieldDeclaration__Group__0__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__1__Impl_in_rule__StartFieldDeclaration__Group__14073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2_in_rule__StartFieldDeclaration__Group__14076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StartFieldDeclaration__Group__1__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__Group__2__Impl_in_rule__StartFieldDeclaration__Group__24135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartFieldDeclaration__FieldAssignment_2_in_rule__StartFieldDeclaration__Group__2__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__0__Impl_in_rule__FieldInitialisations__Group__04198 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1_in_rule__FieldInitialisations__Group__04201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FieldInitialisations__Group__0__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__1__Impl_in_rule__FieldInitialisations__Group__14260 = new BitSet(new long[]{0x0000000680000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2_in_rule__FieldInitialisations__Group__14263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldInitialisations__Group__1__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__2__Impl_in_rule__FieldInitialisations__Group__24322 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3_in_rule__FieldInitialisations__Group__24325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4354 = new BitSet(new long[]{0x0000000680000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0_in_rule__FieldInitialisations__Group__2__Impl4366 = new BitSet(new long[]{0x0000000680000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group__3__Impl_in_rule__FieldInitialisations__Group__34399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldInitialisations__Group__3__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__0__Impl_in_rule__FieldInitialisations__Group_2__04466 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1_in_rule__FieldInitialisations__Group_2__04469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__InitialisationsAssignment_2_0_in_rule__FieldInitialisations__Group_2__0__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldInitialisations__Group_2__1__Impl_in_rule__FieldInitialisations__Group_2__14526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FieldInitialisations__Group_2__1__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__0__Impl_in_rule__DefaultInitialisation__Group__04589 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1_in_rule__DefaultInitialisation__Group__04592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DefaultInitialisation__Group__0__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__1__Impl_in_rule__DefaultInitialisation__Group__14651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2_in_rule__DefaultInitialisation__Group__14654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DefaultInitialisation__Group__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__Group__2__Impl_in_rule__DefaultInitialisation__Group__24713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultInitialisation__CellAssignment_2_in_rule__DefaultInitialisation__Group__2__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__0__Impl_in_rule__RandomInitialisation__Group__04776 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1_in_rule__RandomInitialisation__Group__04779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RandomInitialisation__Group__0__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__1__Impl_in_rule__RandomInitialisation__Group__14838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2_in_rule__RandomInitialisation__Group__14841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RandomInitialisation__Group__1__Impl4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__2__Impl_in_rule__RandomInitialisation__Group__24900 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3_in_rule__RandomInitialisation__Group__24903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CellAssignment_2_in_rule__RandomInitialisation__Group__2__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__3__Impl_in_rule__RandomInitialisation__Group__34960 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4_in_rule__RandomInitialisation__Group__34963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RandomInitialisation__Group__3__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__Group__4__Impl_in_rule__RandomInitialisation__Group__45022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RandomInitialisation__CountAssignment_4_in_rule__RandomInitialisation__Group__4__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__0__Impl_in_rule__ContextInitialisation__Group__05089 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1_in_rule__ContextInitialisation__Group__05092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ContextInitialisation__Group__0__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__1__Impl_in_rule__ContextInitialisation__Group__15151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2_in_rule__ContextInitialisation__Group__15154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ContextInitialisation__Group__1__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__2__Impl_in_rule__ContextInitialisation__Group__25213 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3_in_rule__ContextInitialisation__Group__25216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CellAssignment_2_in_rule__ContextInitialisation__Group__2__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__3__Impl_in_rule__ContextInitialisation__Group__35273 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4_in_rule__ContextInitialisation__Group__35276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ContextInitialisation__Group__3__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__4__Impl_in_rule__ContextInitialisation__Group__45335 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5_in_rule__ContextInitialisation__Group__45338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__CheckAssignment_4_in_rule__ContextInitialisation__Group__4__Impl5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__5__Impl_in_rule__ContextInitialisation__Group__55395 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6_in_rule__ContextInitialisation__Group__55398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ContextInitialisation__Group__5__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__6__Impl_in_rule__ContextInitialisation__Group__65457 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7_in_rule__ContextInitialisation__Group__65460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContextInitialisation__Group__6__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__Group__7__Impl_in_rule__ContextInitialisation__Group__75519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextInitialisation__ExpAssignment_7_in_rule__ContextInitialisation__Group__7__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__0__Impl_in_rule__ContextExpression__Group__05592 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1_in_rule__ContextExpression__Group__05595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_0_in_rule__ContextExpression__Group__0__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group__1__Impl_in_rule__ContextExpression__Group__15652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0_in_rule__ContextExpression__Group__1__Impl5679 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__0__Impl_in_rule__ContextExpression__Group_1__05714 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1_in_rule__ContextExpression__Group_1__05717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ContextExpression__Group_1__0__Impl5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Group_1__1__Impl_in_rule__ContextExpression__Group_1__15776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContextExpression__Sub_expAssignment_1_1_in_rule__ContextExpression__Group_1__1__Impl5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__0__Impl_in_rule__FilterExpression__Group__05837 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1_in_rule__FilterExpression__Group__05840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FilterExpression__Group__0__Impl5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__1__Impl_in_rule__FilterExpression__Group__15899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2_in_rule__FilterExpression__Group__15902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FilterExpression__Group__1__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__2__Impl_in_rule__FilterExpression__Group__25961 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3_in_rule__FilterExpression__Group__25964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Cell_typeAssignment_2_in_rule__FilterExpression__Group__2__Impl5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterExpression__Group__3__Impl_in_rule__FilterExpression__Group__36021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FilterExpression__Group__3__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__0__Impl_in_rule__CountExpression__Group__06088 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1_in_rule__CountExpression__Group__06091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__CountExpression__Group__0__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__1__Impl_in_rule__CountExpression__Group__16150 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2_in_rule__CountExpression__Group__16153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CountExpression__Group__1__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__2__Impl_in_rule__CountExpression__Group__26212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3_in_rule__CountExpression__Group__26215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__CountExpression__Group__2__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountExpression__Group__3__Impl_in_rule__CountExpression__Group__36274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__0__Impl_in_rule__NotEmptyExpression__Group__06340 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1_in_rule__NotEmptyExpression__Group__06343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NotEmptyExpression__Group__0__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__1__Impl_in_rule__NotEmptyExpression__Group__16402 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2_in_rule__NotEmptyExpression__Group__16405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NotEmptyExpression__Group__1__Impl6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__2__Impl_in_rule__NotEmptyExpression__Group__26464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3_in_rule__NotEmptyExpression__Group__26467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NotEmptyExpression__Group__2__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEmptyExpression__Group__3__Impl_in_rule__NotEmptyExpression__Group__36526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GridGame__NameAssignment_16597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellSpecification_in_rule__GridGame__CellsAssignment_36628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldSpecification_in_rule__GridGame__FieldsAssignment_46659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionSpecification_in_rule__GridGame__OptionsAssignment_56690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellSpecification__NameAssignment_16721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellMember_in_rule__CellSpecification__MembersAssignment_36752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellDisplaySpec__Display_typeAlternatives_3_0_in_rule__CellDisplaySpec__Display_typeAssignment_36783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CellDisplaySpec__TextAssignment_4_0_16816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellDisplaySpec__VarAssignment_4_1_16851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellVarSpec__TypeAlternatives_1_0_in_rule__CellVarSpec__TypeAssignment_16886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CellVarSpec__NameAssignment_26919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldSpecification__NameAssignment_16950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__WidthAssignment_56981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FieldSpecification__HeightAssignment_87012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisations_in_rule__FieldSpecification__Field_initialisationAssignment_97043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartFieldDeclaration__FieldAssignment_27078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldInitialisation_in_rule__FieldInitialisations__InitialisationsAssignment_2_07113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefaultInitialisation__CellAssignment_27148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RandomInitialisation__CellAssignment_27187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RandomInitialisation__CountAssignment_47222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContextInitialisation__CellAssignment_27257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__CheckAssignment_47292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContextExpression_in_rule__ContextInitialisation__ExpAssignment_77323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_07354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__ContextExpression__Sub_expAssignment_1_17385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FilterExpression__Cell_typeAssignment_27420 = new BitSet(new long[]{0x0000000000000002L});

}