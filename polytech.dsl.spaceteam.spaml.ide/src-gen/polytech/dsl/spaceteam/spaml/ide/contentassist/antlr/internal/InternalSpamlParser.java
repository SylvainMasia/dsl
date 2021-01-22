package polytech.dsl.spaceteam.spaml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import polytech.dsl.spaceteam.spaml.services.SpamlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpamlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pluggedElements'", "'pluggedElements:'", "'states'", "'states:'", "'='", "'setTo'", "'&&'", "'and'", "'<-'", "'associate'", "'->'", "'then'", "'is'", "'LOW'", "'HIGH'", "'AND'", "'OR'", "'Program'", "'initialState'", "'{'", "'}'", "'onPin'", "'-'", "'Sensor'", "'Actuator'", "'when'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSpamlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpamlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpamlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpaml.g"; }


    	private SpamlGrammarAccess grammarAccess;

    	public void setGrammarAccess(SpamlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalSpaml.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalSpaml.g:54:1: ( ruleProgram EOF )
            // InternalSpaml.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSpaml.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalSpaml.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalSpaml.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalSpaml.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalSpaml.g:69:3: ( rule__Program__Group__0 )
            // InternalSpaml.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePluggedElement"
    // InternalSpaml.g:78:1: entryRulePluggedElement : rulePluggedElement EOF ;
    public final void entryRulePluggedElement() throws RecognitionException {
        try {
            // InternalSpaml.g:79:1: ( rulePluggedElement EOF )
            // InternalSpaml.g:80:1: rulePluggedElement EOF
            {
             before(grammarAccess.getPluggedElementRule()); 
            pushFollow(FOLLOW_1);
            rulePluggedElement();

            state._fsp--;

             after(grammarAccess.getPluggedElementRule()); 
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
    // $ANTLR end "entryRulePluggedElement"


    // $ANTLR start "rulePluggedElement"
    // InternalSpaml.g:87:1: rulePluggedElement : ( ( rule__PluggedElement__Group__0 ) ) ;
    public final void rulePluggedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:91:2: ( ( ( rule__PluggedElement__Group__0 ) ) )
            // InternalSpaml.g:92:2: ( ( rule__PluggedElement__Group__0 ) )
            {
            // InternalSpaml.g:92:2: ( ( rule__PluggedElement__Group__0 ) )
            // InternalSpaml.g:93:3: ( rule__PluggedElement__Group__0 )
            {
             before(grammarAccess.getPluggedElementAccess().getGroup()); 
            // InternalSpaml.g:94:3: ( rule__PluggedElement__Group__0 )
            // InternalSpaml.g:94:4: rule__PluggedElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PluggedElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPluggedElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePluggedElement"


    // $ANTLR start "entryRuleEString"
    // InternalSpaml.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSpaml.g:104:1: ( ruleEString EOF )
            // InternalSpaml.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSpaml.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSpaml.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSpaml.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSpaml.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSpaml.g:119:3: ( rule__EString__Alternatives )
            // InternalSpaml.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalSpaml.g:128:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalSpaml.g:129:1: ( ruleState EOF )
            // InternalSpaml.g:130:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSpaml.g:137:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:141:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalSpaml.g:142:2: ( ( rule__State__Group__0 ) )
            {
            // InternalSpaml.g:142:2: ( ( rule__State__Group__0 ) )
            // InternalSpaml.g:143:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalSpaml.g:144:3: ( rule__State__Group__0 )
            // InternalSpaml.g:144:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEInt"
    // InternalSpaml.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSpaml.g:154:1: ( ruleEInt EOF )
            // InternalSpaml.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSpaml.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSpaml.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSpaml.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalSpaml.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSpaml.g:169:3: ( rule__EInt__Group__0 )
            // InternalSpaml.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSensor"
    // InternalSpaml.g:178:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSpaml.g:179:1: ( ruleSensor EOF )
            // InternalSpaml.g:180:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSpaml.g:187:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:191:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSpaml.g:192:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSpaml.g:192:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSpaml.g:193:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSpaml.g:194:3: ( rule__Sensor__Group__0 )
            // InternalSpaml.g:194:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalSpaml.g:203:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalSpaml.g:204:1: ( ruleActuator EOF )
            // InternalSpaml.g:205:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalSpaml.g:212:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:216:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalSpaml.g:217:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalSpaml.g:217:2: ( ( rule__Actuator__Group__0 ) )
            // InternalSpaml.g:218:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalSpaml.g:219:3: ( rule__Actuator__Group__0 )
            // InternalSpaml.g:219:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleAction"
    // InternalSpaml.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalSpaml.g:229:1: ( ruleAction EOF )
            // InternalSpaml.g:230:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSpaml.g:237:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:241:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalSpaml.g:242:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalSpaml.g:242:2: ( ( rule__Action__Group__0 ) )
            // InternalSpaml.g:243:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalSpaml.g:244:3: ( rule__Action__Group__0 )
            // InternalSpaml.g:244:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalSpaml.g:253:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalSpaml.g:254:1: ( ruleTransition EOF )
            // InternalSpaml.g:255:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalSpaml.g:262:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:266:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalSpaml.g:267:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalSpaml.g:267:2: ( ( rule__Transition__Group__0 ) )
            // InternalSpaml.g:268:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalSpaml.g:269:3: ( rule__Transition__Group__0 )
            // InternalSpaml.g:269:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTransitionHandler"
    // InternalSpaml.g:278:1: entryRuleTransitionHandler : ruleTransitionHandler EOF ;
    public final void entryRuleTransitionHandler() throws RecognitionException {
        try {
            // InternalSpaml.g:279:1: ( ruleTransitionHandler EOF )
            // InternalSpaml.g:280:1: ruleTransitionHandler EOF
            {
             before(grammarAccess.getTransitionHandlerRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionHandler();

            state._fsp--;

             after(grammarAccess.getTransitionHandlerRule()); 
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
    // $ANTLR end "entryRuleTransitionHandler"


    // $ANTLR start "ruleTransitionHandler"
    // InternalSpaml.g:287:1: ruleTransitionHandler : ( ( rule__TransitionHandler__Group__0 ) ) ;
    public final void ruleTransitionHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:291:2: ( ( ( rule__TransitionHandler__Group__0 ) ) )
            // InternalSpaml.g:292:2: ( ( rule__TransitionHandler__Group__0 ) )
            {
            // InternalSpaml.g:292:2: ( ( rule__TransitionHandler__Group__0 ) )
            // InternalSpaml.g:293:3: ( rule__TransitionHandler__Group__0 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getGroup()); 
            // InternalSpaml.g:294:3: ( rule__TransitionHandler__Group__0 )
            // InternalSpaml.g:294:4: rule__TransitionHandler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionHandler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionHandlerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionHandler"


    // $ANTLR start "ruleSIGNAL"
    // InternalSpaml.g:303:1: ruleSIGNAL : ( ( rule__SIGNAL__Alternatives ) ) ;
    public final void ruleSIGNAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:307:1: ( ( ( rule__SIGNAL__Alternatives ) ) )
            // InternalSpaml.g:308:2: ( ( rule__SIGNAL__Alternatives ) )
            {
            // InternalSpaml.g:308:2: ( ( rule__SIGNAL__Alternatives ) )
            // InternalSpaml.g:309:3: ( rule__SIGNAL__Alternatives )
            {
             before(grammarAccess.getSIGNALAccess().getAlternatives()); 
            // InternalSpaml.g:310:3: ( rule__SIGNAL__Alternatives )
            // InternalSpaml.g:310:4: rule__SIGNAL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SIGNAL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSIGNALAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSIGNAL"


    // $ANTLR start "ruleOPERATION"
    // InternalSpaml.g:319:1: ruleOPERATION : ( ( rule__OPERATION__Alternatives ) ) ;
    public final void ruleOPERATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:323:1: ( ( ( rule__OPERATION__Alternatives ) ) )
            // InternalSpaml.g:324:2: ( ( rule__OPERATION__Alternatives ) )
            {
            // InternalSpaml.g:324:2: ( ( rule__OPERATION__Alternatives ) )
            // InternalSpaml.g:325:3: ( rule__OPERATION__Alternatives )
            {
             before(grammarAccess.getOPERATIONAccess().getAlternatives()); 
            // InternalSpaml.g:326:3: ( rule__OPERATION__Alternatives )
            // InternalSpaml.g:326:4: rule__OPERATION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OPERATION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOPERATIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPERATION"


    // $ANTLR start "rule__Program__Alternatives_5"
    // InternalSpaml.g:334:1: rule__Program__Alternatives_5 : ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) );
    public final void rule__Program__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:338:1: ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpaml.g:339:2: ( 'pluggedElements' )
                    {
                    // InternalSpaml.g:339:2: ( 'pluggedElements' )
                    // InternalSpaml.g:340:3: 'pluggedElements'
                    {
                     before(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:345:2: ( 'pluggedElements:' )
                    {
                    // InternalSpaml.g:345:2: ( 'pluggedElements:' )
                    // InternalSpaml.g:346:3: 'pluggedElements:'
                    {
                     before(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_1()); 

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
    // $ANTLR end "rule__Program__Alternatives_5"


    // $ANTLR start "rule__Program__Alternatives_7"
    // InternalSpaml.g:355:1: rule__Program__Alternatives_7 : ( ( 'states' ) | ( 'states:' ) );
    public final void rule__Program__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:359:1: ( ( 'states' ) | ( 'states:' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpaml.g:360:2: ( 'states' )
                    {
                    // InternalSpaml.g:360:2: ( 'states' )
                    // InternalSpaml.g:361:3: 'states'
                    {
                     before(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:366:2: ( 'states:' )
                    {
                    // InternalSpaml.g:366:2: ( 'states:' )
                    // InternalSpaml.g:367:3: 'states:'
                    {
                     before(grammarAccess.getProgramAccess().getStatesKeyword_7_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getStatesKeyword_7_1()); 

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
    // $ANTLR end "rule__Program__Alternatives_7"


    // $ANTLR start "rule__PluggedElement__Alternatives_0"
    // InternalSpaml.g:376:1: rule__PluggedElement__Alternatives_0 : ( ( ruleActuator ) | ( ruleSensor ) );
    public final void rule__PluggedElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:380:1: ( ( ruleActuator ) | ( ruleSensor ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpaml.g:381:2: ( ruleActuator )
                    {
                    // InternalSpaml.g:381:2: ( ruleActuator )
                    // InternalSpaml.g:382:3: ruleActuator
                    {
                     before(grammarAccess.getPluggedElementAccess().getActuatorParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getPluggedElementAccess().getActuatorParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:387:2: ( ruleSensor )
                    {
                    // InternalSpaml.g:387:2: ( ruleSensor )
                    // InternalSpaml.g:388:3: ruleSensor
                    {
                     before(grammarAccess.getPluggedElementAccess().getSensorParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getPluggedElementAccess().getSensorParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__PluggedElement__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSpaml.g:397:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:401:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpaml.g:402:2: ( RULE_STRING )
                    {
                    // InternalSpaml.g:402:2: ( RULE_STRING )
                    // InternalSpaml.g:403:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:408:2: ( RULE_ID )
                    {
                    // InternalSpaml.g:408:2: ( RULE_ID )
                    // InternalSpaml.g:409:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Action__Alternatives_1"
    // InternalSpaml.g:418:1: rule__Action__Alternatives_1 : ( ( '=' ) | ( 'setTo' ) );
    public final void rule__Action__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:422:1: ( ( '=' ) | ( 'setTo' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpaml.g:423:2: ( '=' )
                    {
                    // InternalSpaml.g:423:2: ( '=' )
                    // InternalSpaml.g:424:3: '='
                    {
                     before(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:429:2: ( 'setTo' )
                    {
                    // InternalSpaml.g:429:2: ( 'setTo' )
                    // InternalSpaml.g:430:3: 'setTo'
                    {
                     before(grammarAccess.getActionAccess().getSetToKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getSetToKeyword_1_1()); 

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
    // $ANTLR end "rule__Action__Alternatives_1"


    // $ANTLR start "rule__Transition__Alternatives_0"
    // InternalSpaml.g:439:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__DelayAssignment_0_1 ) ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:443:1: ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__DelayAssignment_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==36) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT||LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpaml.g:444:2: ( ( rule__Transition__Group_0_0__0 ) )
                    {
                    // InternalSpaml.g:444:2: ( ( rule__Transition__Group_0_0__0 ) )
                    // InternalSpaml.g:445:3: ( rule__Transition__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0()); 
                    // InternalSpaml.g:446:3: ( rule__Transition__Group_0_0__0 )
                    // InternalSpaml.g:446:4: rule__Transition__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:450:2: ( ( rule__Transition__DelayAssignment_0_1 ) )
                    {
                    // InternalSpaml.g:450:2: ( ( rule__Transition__DelayAssignment_0_1 ) )
                    // InternalSpaml.g:451:3: ( rule__Transition__DelayAssignment_0_1 )
                    {
                     before(grammarAccess.getTransitionAccess().getDelayAssignment_0_1()); 
                    // InternalSpaml.g:452:3: ( rule__Transition__DelayAssignment_0_1 )
                    // InternalSpaml.g:452:4: rule__Transition__DelayAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__DelayAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getDelayAssignment_0_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_0"


    // $ANTLR start "rule__Transition__Alternatives_0_0_2_0"
    // InternalSpaml.g:460:1: rule__Transition__Alternatives_0_0_2_0 : ( ( '&&' ) | ( 'and' ) );
    public final void rule__Transition__Alternatives_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:464:1: ( ( '&&' ) | ( 'and' ) )
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
                    // InternalSpaml.g:465:2: ( '&&' )
                    {
                    // InternalSpaml.g:465:2: ( '&&' )
                    // InternalSpaml.g:466:3: '&&'
                    {
                     before(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_0_0_2_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_0_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:471:2: ( 'and' )
                    {
                    // InternalSpaml.g:471:2: ( 'and' )
                    // InternalSpaml.g:472:3: 'and'
                    {
                     before(grammarAccess.getTransitionAccess().getAndKeyword_0_0_2_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAndKeyword_0_0_2_0_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_0_0_2_0"


    // $ANTLR start "rule__Transition__Alternatives_0_0_3_0"
    // InternalSpaml.g:481:1: rule__Transition__Alternatives_0_0_3_0 : ( ( '<-' ) | ( 'associate' ) );
    public final void rule__Transition__Alternatives_0_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:485:1: ( ( '<-' ) | ( 'associate' ) )
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
                    // InternalSpaml.g:486:2: ( '<-' )
                    {
                    // InternalSpaml.g:486:2: ( '<-' )
                    // InternalSpaml.g:487:3: '<-'
                    {
                     before(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_0_0_3_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_0_0_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:492:2: ( 'associate' )
                    {
                    // InternalSpaml.g:492:2: ( 'associate' )
                    // InternalSpaml.g:493:3: 'associate'
                    {
                     before(grammarAccess.getTransitionAccess().getAssociateKeyword_0_0_3_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAssociateKeyword_0_0_3_0_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_0_0_3_0"


    // $ANTLR start "rule__Transition__Alternatives_1"
    // InternalSpaml.g:502:1: rule__Transition__Alternatives_1 : ( ( '->' ) | ( 'then' ) );
    public final void rule__Transition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:506:1: ( ( '->' ) | ( 'then' ) )
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
                    // InternalSpaml.g:507:2: ( '->' )
                    {
                    // InternalSpaml.g:507:2: ( '->' )
                    // InternalSpaml.g:508:3: '->'
                    {
                     before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:513:2: ( 'then' )
                    {
                    // InternalSpaml.g:513:2: ( 'then' )
                    // InternalSpaml.g:514:3: 'then'
                    {
                     before(grammarAccess.getTransitionAccess().getThenKeyword_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getThenKeyword_1_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_1"


    // $ANTLR start "rule__TransitionHandler__Alternatives_1"
    // InternalSpaml.g:523:1: rule__TransitionHandler__Alternatives_1 : ( ( '=' ) | ( 'is' ) );
    public final void rule__TransitionHandler__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:527:1: ( ( '=' ) | ( 'is' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpaml.g:528:2: ( '=' )
                    {
                    // InternalSpaml.g:528:2: ( '=' )
                    // InternalSpaml.g:529:3: '='
                    {
                     before(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:534:2: ( 'is' )
                    {
                    // InternalSpaml.g:534:2: ( 'is' )
                    // InternalSpaml.g:535:3: 'is'
                    {
                     before(grammarAccess.getTransitionHandlerAccess().getIsKeyword_1_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getTransitionHandlerAccess().getIsKeyword_1_1()); 

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
    // $ANTLR end "rule__TransitionHandler__Alternatives_1"


    // $ANTLR start "rule__SIGNAL__Alternatives"
    // InternalSpaml.g:544:1: rule__SIGNAL__Alternatives : ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) );
    public final void rule__SIGNAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:548:1: ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpaml.g:549:2: ( ( 'LOW' ) )
                    {
                    // InternalSpaml.g:549:2: ( ( 'LOW' ) )
                    // InternalSpaml.g:550:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:551:3: ( 'LOW' )
                    // InternalSpaml.g:551:4: 'LOW'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:555:2: ( ( 'HIGH' ) )
                    {
                    // InternalSpaml.g:555:2: ( ( 'HIGH' ) )
                    // InternalSpaml.g:556:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:557:3: ( 'HIGH' )
                    // InternalSpaml.g:557:4: 'HIGH'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SIGNAL__Alternatives"


    // $ANTLR start "rule__OPERATION__Alternatives"
    // InternalSpaml.g:565:1: rule__OPERATION__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__OPERATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:569:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpaml.g:570:2: ( ( 'AND' ) )
                    {
                    // InternalSpaml.g:570:2: ( ( 'AND' ) )
                    // InternalSpaml.g:571:3: ( 'AND' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:572:3: ( 'AND' )
                    // InternalSpaml.g:572:4: 'AND'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:576:2: ( ( 'OR' ) )
                    {
                    // InternalSpaml.g:576:2: ( ( 'OR' ) )
                    // InternalSpaml.g:577:3: ( 'OR' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:578:3: ( 'OR' )
                    // InternalSpaml.g:578:4: 'OR'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__OPERATION__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalSpaml.g:586:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:590:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSpaml.g:591:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalSpaml.g:598:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:602:1: ( ( 'Program' ) )
            // InternalSpaml.g:603:1: ( 'Program' )
            {
            // InternalSpaml.g:603:1: ( 'Program' )
            // InternalSpaml.g:604:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalSpaml.g:613:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:617:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSpaml.g:618:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalSpaml.g:625:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:629:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSpaml.g:630:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSpaml.g:630:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSpaml.g:631:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSpaml.g:632:2: ( rule__Program__NameAssignment_1 )
            // InternalSpaml.g:632:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalSpaml.g:640:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:644:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSpaml.g:645:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalSpaml.g:652:1: rule__Program__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:656:1: ( ( 'initialState' ) )
            // InternalSpaml.g:657:1: ( 'initialState' )
            {
            // InternalSpaml.g:657:1: ( 'initialState' )
            // InternalSpaml.g:658:2: 'initialState'
            {
             before(grammarAccess.getProgramAccess().getInitialStateKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getInitialStateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalSpaml.g:667:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:671:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSpaml.g:672:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalSpaml.g:679:1: rule__Program__Group__3__Impl : ( ( rule__Program__InitialStateAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:683:1: ( ( ( rule__Program__InitialStateAssignment_3 ) ) )
            // InternalSpaml.g:684:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            {
            // InternalSpaml.g:684:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            // InternalSpaml.g:685:2: ( rule__Program__InitialStateAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getInitialStateAssignment_3()); 
            // InternalSpaml.g:686:2: ( rule__Program__InitialStateAssignment_3 )
            // InternalSpaml.g:686:3: rule__Program__InitialStateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Program__InitialStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getInitialStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalSpaml.g:694:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:698:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalSpaml.g:699:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalSpaml.g:706:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:710:1: ( ( '{' ) )
            // InternalSpaml.g:711:1: ( '{' )
            {
            // InternalSpaml.g:711:1: ( '{' )
            // InternalSpaml.g:712:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalSpaml.g:721:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:725:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalSpaml.g:726:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalSpaml.g:733:1: rule__Program__Group__5__Impl : ( ( rule__Program__Alternatives_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:737:1: ( ( ( rule__Program__Alternatives_5 ) ) )
            // InternalSpaml.g:738:1: ( ( rule__Program__Alternatives_5 ) )
            {
            // InternalSpaml.g:738:1: ( ( rule__Program__Alternatives_5 ) )
            // InternalSpaml.g:739:2: ( rule__Program__Alternatives_5 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_5()); 
            // InternalSpaml.g:740:2: ( rule__Program__Alternatives_5 )
            // InternalSpaml.g:740:3: rule__Program__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Program__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // InternalSpaml.g:748:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:752:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalSpaml.g:753:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // InternalSpaml.g:760:1: rule__Program__Group__6__Impl : ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:764:1: ( ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) )
            // InternalSpaml.g:765:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            {
            // InternalSpaml.g:765:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            // InternalSpaml.g:766:2: ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* )
            {
            // InternalSpaml.g:766:2: ( ( rule__Program__PluggedElementsAssignment_6 ) )
            // InternalSpaml.g:767:3: ( rule__Program__PluggedElementsAssignment_6 )
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:768:3: ( rule__Program__PluggedElementsAssignment_6 )
            // InternalSpaml.g:768:4: rule__Program__PluggedElementsAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__Program__PluggedElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 

            }

            // InternalSpaml.g:771:2: ( ( rule__Program__PluggedElementsAssignment_6 )* )
            // InternalSpaml.g:772:3: ( rule__Program__PluggedElementsAssignment_6 )*
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:773:3: ( rule__Program__PluggedElementsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=34 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpaml.g:773:4: rule__Program__PluggedElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__PluggedElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 

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
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Program__Group__7"
    // InternalSpaml.g:782:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:786:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalSpaml.g:787:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7"


    // $ANTLR start "rule__Program__Group__7__Impl"
    // InternalSpaml.g:794:1: rule__Program__Group__7__Impl : ( ( rule__Program__Alternatives_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:798:1: ( ( ( rule__Program__Alternatives_7 ) ) )
            // InternalSpaml.g:799:1: ( ( rule__Program__Alternatives_7 ) )
            {
            // InternalSpaml.g:799:1: ( ( rule__Program__Alternatives_7 ) )
            // InternalSpaml.g:800:2: ( rule__Program__Alternatives_7 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_7()); 
            // InternalSpaml.g:801:2: ( rule__Program__Alternatives_7 )
            // InternalSpaml.g:801:3: rule__Program__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Program__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7__Impl"


    // $ANTLR start "rule__Program__Group__8"
    // InternalSpaml.g:809:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:813:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalSpaml.g:814:2: rule__Program__Group__8__Impl rule__Program__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Program__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8"


    // $ANTLR start "rule__Program__Group__8__Impl"
    // InternalSpaml.g:821:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:825:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // InternalSpaml.g:826:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // InternalSpaml.g:826:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // InternalSpaml.g:827:2: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // InternalSpaml.g:827:2: ( ( rule__Program__StatesAssignment_8 ) )
            // InternalSpaml.g:828:3: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:829:3: ( rule__Program__StatesAssignment_8 )
            // InternalSpaml.g:829:4: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__Program__StatesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // InternalSpaml.g:832:2: ( ( rule__Program__StatesAssignment_8 )* )
            // InternalSpaml.g:833:3: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:834:3: ( rule__Program__StatesAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSpaml.g:834:4: rule__Program__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Program__StatesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

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
    // $ANTLR end "rule__Program__Group__8__Impl"


    // $ANTLR start "rule__Program__Group__9"
    // InternalSpaml.g:843:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:847:1: ( rule__Program__Group__9__Impl )
            // InternalSpaml.g:848:2: rule__Program__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9"


    // $ANTLR start "rule__Program__Group__9__Impl"
    // InternalSpaml.g:854:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:858:1: ( ( '}' ) )
            // InternalSpaml.g:859:1: ( '}' )
            {
            // InternalSpaml.g:859:1: ( '}' )
            // InternalSpaml.g:860:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9__Impl"


    // $ANTLR start "rule__PluggedElement__Group__0"
    // InternalSpaml.g:870:1: rule__PluggedElement__Group__0 : rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 ;
    public final void rule__PluggedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:874:1: ( rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 )
            // InternalSpaml.g:875:2: rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PluggedElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PluggedElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__0"


    // $ANTLR start "rule__PluggedElement__Group__0__Impl"
    // InternalSpaml.g:882:1: rule__PluggedElement__Group__0__Impl : ( ( rule__PluggedElement__Alternatives_0 ) ) ;
    public final void rule__PluggedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:886:1: ( ( ( rule__PluggedElement__Alternatives_0 ) ) )
            // InternalSpaml.g:887:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            {
            // InternalSpaml.g:887:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            // InternalSpaml.g:888:2: ( rule__PluggedElement__Alternatives_0 )
            {
             before(grammarAccess.getPluggedElementAccess().getAlternatives_0()); 
            // InternalSpaml.g:889:2: ( rule__PluggedElement__Alternatives_0 )
            // InternalSpaml.g:889:3: rule__PluggedElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PluggedElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPluggedElementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__0__Impl"


    // $ANTLR start "rule__PluggedElement__Group__1"
    // InternalSpaml.g:897:1: rule__PluggedElement__Group__1 : rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 ;
    public final void rule__PluggedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:901:1: ( rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 )
            // InternalSpaml.g:902:2: rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PluggedElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PluggedElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__1"


    // $ANTLR start "rule__PluggedElement__Group__1__Impl"
    // InternalSpaml.g:909:1: rule__PluggedElement__Group__1__Impl : ( ( rule__PluggedElement__NameAssignment_1 ) ) ;
    public final void rule__PluggedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:913:1: ( ( ( rule__PluggedElement__NameAssignment_1 ) ) )
            // InternalSpaml.g:914:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            {
            // InternalSpaml.g:914:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            // InternalSpaml.g:915:2: ( rule__PluggedElement__NameAssignment_1 )
            {
             before(grammarAccess.getPluggedElementAccess().getNameAssignment_1()); 
            // InternalSpaml.g:916:2: ( rule__PluggedElement__NameAssignment_1 )
            // InternalSpaml.g:916:3: rule__PluggedElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PluggedElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPluggedElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__1__Impl"


    // $ANTLR start "rule__PluggedElement__Group__2"
    // InternalSpaml.g:924:1: rule__PluggedElement__Group__2 : rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 ;
    public final void rule__PluggedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:928:1: ( rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 )
            // InternalSpaml.g:929:2: rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__PluggedElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PluggedElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__2"


    // $ANTLR start "rule__PluggedElement__Group__2__Impl"
    // InternalSpaml.g:936:1: rule__PluggedElement__Group__2__Impl : ( ( 'onPin' )? ) ;
    public final void rule__PluggedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:940:1: ( ( ( 'onPin' )? ) )
            // InternalSpaml.g:941:1: ( ( 'onPin' )? )
            {
            // InternalSpaml.g:941:1: ( ( 'onPin' )? )
            // InternalSpaml.g:942:2: ( 'onPin' )?
            {
             before(grammarAccess.getPluggedElementAccess().getOnPinKeyword_2()); 
            // InternalSpaml.g:943:2: ( 'onPin' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpaml.g:943:3: 'onPin'
                    {
                    match(input,32,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPluggedElementAccess().getOnPinKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__2__Impl"


    // $ANTLR start "rule__PluggedElement__Group__3"
    // InternalSpaml.g:951:1: rule__PluggedElement__Group__3 : rule__PluggedElement__Group__3__Impl ;
    public final void rule__PluggedElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:955:1: ( rule__PluggedElement__Group__3__Impl )
            // InternalSpaml.g:956:2: rule__PluggedElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PluggedElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__3"


    // $ANTLR start "rule__PluggedElement__Group__3__Impl"
    // InternalSpaml.g:962:1: rule__PluggedElement__Group__3__Impl : ( ( rule__PluggedElement__PinAssignment_3 ) ) ;
    public final void rule__PluggedElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:966:1: ( ( ( rule__PluggedElement__PinAssignment_3 ) ) )
            // InternalSpaml.g:967:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            {
            // InternalSpaml.g:967:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            // InternalSpaml.g:968:2: ( rule__PluggedElement__PinAssignment_3 )
            {
             before(grammarAccess.getPluggedElementAccess().getPinAssignment_3()); 
            // InternalSpaml.g:969:2: ( rule__PluggedElement__PinAssignment_3 )
            // InternalSpaml.g:969:3: rule__PluggedElement__PinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PluggedElement__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPluggedElementAccess().getPinAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__Group__3__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalSpaml.g:978:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:982:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSpaml.g:983:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalSpaml.g:990:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:994:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalSpaml.g:995:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalSpaml.g:995:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalSpaml.g:996:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalSpaml.g:997:2: ( rule__State__NameAssignment_0 )
            // InternalSpaml.g:997:3: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalSpaml.g:1005:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1009:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSpaml.g:1010:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalSpaml.g:1017:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1021:1: ( ( '{' ) )
            // InternalSpaml.g:1022:1: ( '{' )
            {
            // InternalSpaml.g:1022:1: ( '{' )
            // InternalSpaml.g:1023:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalSpaml.g:1032:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1036:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSpaml.g:1037:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalSpaml.g:1044:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1048:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalSpaml.g:1049:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalSpaml.g:1049:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalSpaml.g:1050:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalSpaml.g:1051:2: ( rule__State__ActionsAssignment_2 )
            // InternalSpaml.g:1051:3: rule__State__ActionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalSpaml.g:1059:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1063:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSpaml.g:1064:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalSpaml.g:1071:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1075:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalSpaml.g:1076:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalSpaml.g:1076:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalSpaml.g:1077:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalSpaml.g:1078:2: ( rule__State__ActionsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==15) ) {
                        int LA16_4 = input.LA(3);

                        if ( (LA16_4==24) ) {
                            int LA16_5 = input.LA(4);

                            if ( ((LA16_5>=RULE_STRING && LA16_5<=RULE_INT)||LA16_5==33||LA16_5==36) ) {
                                alt16=1;
                            }


                        }
                        else if ( (LA16_4==25) ) {
                            int LA16_6 = input.LA(4);

                            if ( ((LA16_6>=RULE_STRING && LA16_6<=RULE_INT)||LA16_6==33||LA16_6==36) ) {
                                alt16=1;
                            }


                        }


                    }
                    else if ( (LA16_2==16) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSpaml.g:1078:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalSpaml.g:1086:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1090:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalSpaml.g:1091:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalSpaml.g:1098:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1102:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalSpaml.g:1103:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalSpaml.g:1103:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalSpaml.g:1104:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalSpaml.g:1105:2: ( rule__State__TransitionAssignment_4 )
            // InternalSpaml.g:1105:3: rule__State__TransitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalSpaml.g:1113:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1117:1: ( rule__State__Group__5__Impl )
            // InternalSpaml.g:1118:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalSpaml.g:1124:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1128:1: ( ( '}' ) )
            // InternalSpaml.g:1129:1: ( '}' )
            {
            // InternalSpaml.g:1129:1: ( '}' )
            // InternalSpaml.g:1130:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSpaml.g:1140:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1144:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSpaml.g:1145:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSpaml.g:1152:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1156:1: ( ( ( '-' )? ) )
            // InternalSpaml.g:1157:1: ( ( '-' )? )
            {
            // InternalSpaml.g:1157:1: ( ( '-' )? )
            // InternalSpaml.g:1158:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSpaml.g:1159:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpaml.g:1159:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSpaml.g:1167:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1171:1: ( rule__EInt__Group__1__Impl )
            // InternalSpaml.g:1172:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSpaml.g:1178:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1182:1: ( ( RULE_INT ) )
            // InternalSpaml.g:1183:1: ( RULE_INT )
            {
            // InternalSpaml.g:1183:1: ( RULE_INT )
            // InternalSpaml.g:1184:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSpaml.g:1194:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1198:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSpaml.g:1199:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalSpaml.g:1206:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1210:1: ( ( () ) )
            // InternalSpaml.g:1211:1: ( () )
            {
            // InternalSpaml.g:1211:1: ( () )
            // InternalSpaml.g:1212:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSpaml.g:1213:2: ()
            // InternalSpaml.g:1213:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalSpaml.g:1221:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1225:1: ( rule__Sensor__Group__1__Impl )
            // InternalSpaml.g:1226:2: rule__Sensor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalSpaml.g:1232:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1236:1: ( ( 'Sensor' ) )
            // InternalSpaml.g:1237:1: ( 'Sensor' )
            {
            // InternalSpaml.g:1237:1: ( 'Sensor' )
            // InternalSpaml.g:1238:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalSpaml.g:1248:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1252:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalSpaml.g:1253:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalSpaml.g:1260:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1264:1: ( ( () ) )
            // InternalSpaml.g:1265:1: ( () )
            {
            // InternalSpaml.g:1265:1: ( () )
            // InternalSpaml.g:1266:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalSpaml.g:1267:2: ()
            // InternalSpaml.g:1267:3: 
            {
            }

             after(grammarAccess.getActuatorAccess().getActuatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalSpaml.g:1275:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1279:1: ( rule__Actuator__Group__1__Impl )
            // InternalSpaml.g:1280:2: rule__Actuator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalSpaml.g:1286:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1290:1: ( ( 'Actuator' ) )
            // InternalSpaml.g:1291:1: ( 'Actuator' )
            {
            // InternalSpaml.g:1291:1: ( 'Actuator' )
            // InternalSpaml.g:1292:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalSpaml.g:1302:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1306:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSpaml.g:1307:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalSpaml.g:1314:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1318:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalSpaml.g:1319:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalSpaml.g:1319:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalSpaml.g:1320:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalSpaml.g:1321:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalSpaml.g:1321:3: rule__Action__ActuatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActuatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActuatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalSpaml.g:1329:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1333:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSpaml.g:1334:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalSpaml.g:1341:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1345:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalSpaml.g:1346:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalSpaml.g:1346:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalSpaml.g:1347:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1348:2: ( rule__Action__Alternatives_1 )
            // InternalSpaml.g:1348:3: rule__Action__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalSpaml.g:1356:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1360:1: ( rule__Action__Group__2__Impl )
            // InternalSpaml.g:1361:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalSpaml.g:1367:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1371:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1372:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1372:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalSpaml.g:1373:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1374:2: ( rule__Action__ValueAssignment_2 )
            // InternalSpaml.g:1374:3: rule__Action__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalSpaml.g:1383:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1387:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSpaml.g:1388:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalSpaml.g:1395:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1399:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalSpaml.g:1400:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalSpaml.g:1400:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalSpaml.g:1401:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalSpaml.g:1402:2: ( rule__Transition__Alternatives_0 )
            // InternalSpaml.g:1402:3: rule__Transition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalSpaml.g:1410:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1414:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSpaml.g:1415:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalSpaml.g:1422:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Alternatives_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1426:1: ( ( ( rule__Transition__Alternatives_1 ) ) )
            // InternalSpaml.g:1427:1: ( ( rule__Transition__Alternatives_1 ) )
            {
            // InternalSpaml.g:1427:1: ( ( rule__Transition__Alternatives_1 ) )
            // InternalSpaml.g:1428:2: ( rule__Transition__Alternatives_1 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1429:2: ( rule__Transition__Alternatives_1 )
            // InternalSpaml.g:1429:3: rule__Transition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalSpaml.g:1437:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1441:1: ( rule__Transition__Group__2__Impl )
            // InternalSpaml.g:1442:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalSpaml.g:1448:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NextAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1452:1: ( ( ( rule__Transition__NextAssignment_2 ) ) )
            // InternalSpaml.g:1453:1: ( ( rule__Transition__NextAssignment_2 ) )
            {
            // InternalSpaml.g:1453:1: ( ( rule__Transition__NextAssignment_2 ) )
            // InternalSpaml.g:1454:2: ( rule__Transition__NextAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_2()); 
            // InternalSpaml.g:1455:2: ( rule__Transition__NextAssignment_2 )
            // InternalSpaml.g:1455:3: rule__Transition__NextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__0"
    // InternalSpaml.g:1464:1: rule__Transition__Group_0_0__0 : rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 ;
    public final void rule__Transition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1468:1: ( rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 )
            // InternalSpaml.g:1469:2: rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__0"


    // $ANTLR start "rule__Transition__Group_0_0__0__Impl"
    // InternalSpaml.g:1476:1: rule__Transition__Group_0_0__0__Impl : ( ( 'when' )? ) ;
    public final void rule__Transition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1480:1: ( ( ( 'when' )? ) )
            // InternalSpaml.g:1481:1: ( ( 'when' )? )
            {
            // InternalSpaml.g:1481:1: ( ( 'when' )? )
            // InternalSpaml.g:1482:2: ( 'when' )?
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0()); 
            // InternalSpaml.g:1483:2: ( 'when' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpaml.g:1483:3: 'when'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__1"
    // InternalSpaml.g:1491:1: rule__Transition__Group_0_0__1 : rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2 ;
    public final void rule__Transition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1495:1: ( rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2 )
            // InternalSpaml.g:1496:2: rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__1"


    // $ANTLR start "rule__Transition__Group_0_0__1__Impl"
    // InternalSpaml.g:1503:1: rule__Transition__Group_0_0__1__Impl : ( ( rule__Transition__HandlersAssignment_0_0_1 ) ) ;
    public final void rule__Transition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1507:1: ( ( ( rule__Transition__HandlersAssignment_0_0_1 ) ) )
            // InternalSpaml.g:1508:1: ( ( rule__Transition__HandlersAssignment_0_0_1 ) )
            {
            // InternalSpaml.g:1508:1: ( ( rule__Transition__HandlersAssignment_0_0_1 ) )
            // InternalSpaml.g:1509:2: ( rule__Transition__HandlersAssignment_0_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_0_0_1()); 
            // InternalSpaml.g:1510:2: ( rule__Transition__HandlersAssignment_0_0_1 )
            // InternalSpaml.g:1510:3: rule__Transition__HandlersAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__HandlersAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getHandlersAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__2"
    // InternalSpaml.g:1518:1: rule__Transition__Group_0_0__2 : rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3 ;
    public final void rule__Transition__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1522:1: ( rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3 )
            // InternalSpaml.g:1523:2: rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__2"


    // $ANTLR start "rule__Transition__Group_0_0__2__Impl"
    // InternalSpaml.g:1530:1: rule__Transition__Group_0_0__2__Impl : ( ( rule__Transition__Group_0_0_2__0 )* ) ;
    public final void rule__Transition__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1534:1: ( ( ( rule__Transition__Group_0_0_2__0 )* ) )
            // InternalSpaml.g:1535:1: ( ( rule__Transition__Group_0_0_2__0 )* )
            {
            // InternalSpaml.g:1535:1: ( ( rule__Transition__Group_0_0_2__0 )* )
            // InternalSpaml.g:1536:2: ( rule__Transition__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_2()); 
            // InternalSpaml.g:1537:2: ( rule__Transition__Group_0_0_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=17 && LA19_0<=18)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSpaml.g:1537:3: rule__Transition__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Transition__Group_0_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__3"
    // InternalSpaml.g:1545:1: rule__Transition__Group_0_0__3 : rule__Transition__Group_0_0__3__Impl ;
    public final void rule__Transition__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1549:1: ( rule__Transition__Group_0_0__3__Impl )
            // InternalSpaml.g:1550:2: rule__Transition__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__3"


    // $ANTLR start "rule__Transition__Group_0_0__3__Impl"
    // InternalSpaml.g:1556:1: rule__Transition__Group_0_0__3__Impl : ( ( rule__Transition__Group_0_0_3__0 )? ) ;
    public final void rule__Transition__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1560:1: ( ( ( rule__Transition__Group_0_0_3__0 )? ) )
            // InternalSpaml.g:1561:1: ( ( rule__Transition__Group_0_0_3__0 )? )
            {
            // InternalSpaml.g:1561:1: ( ( rule__Transition__Group_0_0_3__0 )? )
            // InternalSpaml.g:1562:2: ( rule__Transition__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_3()); 
            // InternalSpaml.g:1563:2: ( rule__Transition__Group_0_0_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=19 && LA20_0<=20)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpaml.g:1563:3: rule__Transition__Group_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__3__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2__0"
    // InternalSpaml.g:1572:1: rule__Transition__Group_0_0_2__0 : rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1 ;
    public final void rule__Transition__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1576:1: ( rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1 )
            // InternalSpaml.g:1577:2: rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__0"


    // $ANTLR start "rule__Transition__Group_0_0_2__0__Impl"
    // InternalSpaml.g:1584:1: rule__Transition__Group_0_0_2__0__Impl : ( ( rule__Transition__Alternatives_0_0_2_0 ) ) ;
    public final void rule__Transition__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1588:1: ( ( ( rule__Transition__Alternatives_0_0_2_0 ) ) )
            // InternalSpaml.g:1589:1: ( ( rule__Transition__Alternatives_0_0_2_0 ) )
            {
            // InternalSpaml.g:1589:1: ( ( rule__Transition__Alternatives_0_0_2_0 ) )
            // InternalSpaml.g:1590:2: ( rule__Transition__Alternatives_0_0_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0_0_2_0()); 
            // InternalSpaml.g:1591:2: ( rule__Transition__Alternatives_0_0_2_0 )
            // InternalSpaml.g:1591:3: rule__Transition__Alternatives_0_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2__1"
    // InternalSpaml.g:1599:1: rule__Transition__Group_0_0_2__1 : rule__Transition__Group_0_0_2__1__Impl ;
    public final void rule__Transition__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1603:1: ( rule__Transition__Group_0_0_2__1__Impl )
            // InternalSpaml.g:1604:2: rule__Transition__Group_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__1"


    // $ANTLR start "rule__Transition__Group_0_0_2__1__Impl"
    // InternalSpaml.g:1610:1: rule__Transition__Group_0_0_2__1__Impl : ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) ) ;
    public final void rule__Transition__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1614:1: ( ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) ) )
            // InternalSpaml.g:1615:1: ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) )
            {
            // InternalSpaml.g:1615:1: ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) )
            // InternalSpaml.g:1616:2: ( rule__Transition__HandlersAssignment_0_0_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_0_0_2_1()); 
            // InternalSpaml.g:1617:2: ( rule__Transition__HandlersAssignment_0_0_2_1 )
            // InternalSpaml.g:1617:3: rule__Transition__HandlersAssignment_0_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__HandlersAssignment_0_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getHandlersAssignment_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_3__0"
    // InternalSpaml.g:1626:1: rule__Transition__Group_0_0_3__0 : rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1 ;
    public final void rule__Transition__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1630:1: ( rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1 )
            // InternalSpaml.g:1631:2: rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Transition__Group_0_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__0"


    // $ANTLR start "rule__Transition__Group_0_0_3__0__Impl"
    // InternalSpaml.g:1638:1: rule__Transition__Group_0_0_3__0__Impl : ( ( rule__Transition__Alternatives_0_0_3_0 ) ) ;
    public final void rule__Transition__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1642:1: ( ( ( rule__Transition__Alternatives_0_0_3_0 ) ) )
            // InternalSpaml.g:1643:1: ( ( rule__Transition__Alternatives_0_0_3_0 ) )
            {
            // InternalSpaml.g:1643:1: ( ( rule__Transition__Alternatives_0_0_3_0 ) )
            // InternalSpaml.g:1644:2: ( rule__Transition__Alternatives_0_0_3_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0_0_3_0()); 
            // InternalSpaml.g:1645:2: ( rule__Transition__Alternatives_0_0_3_0 )
            // InternalSpaml.g:1645:3: rule__Transition__Alternatives_0_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_3__1"
    // InternalSpaml.g:1653:1: rule__Transition__Group_0_0_3__1 : rule__Transition__Group_0_0_3__1__Impl ;
    public final void rule__Transition__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1657:1: ( rule__Transition__Group_0_0_3__1__Impl )
            // InternalSpaml.g:1658:2: rule__Transition__Group_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__1"


    // $ANTLR start "rule__Transition__Group_0_0_3__1__Impl"
    // InternalSpaml.g:1664:1: rule__Transition__Group_0_0_3__1__Impl : ( ( rule__Transition__OperationAssignment_0_0_3_1 ) ) ;
    public final void rule__Transition__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1668:1: ( ( ( rule__Transition__OperationAssignment_0_0_3_1 ) ) )
            // InternalSpaml.g:1669:1: ( ( rule__Transition__OperationAssignment_0_0_3_1 ) )
            {
            // InternalSpaml.g:1669:1: ( ( rule__Transition__OperationAssignment_0_0_3_1 ) )
            // InternalSpaml.g:1670:2: ( rule__Transition__OperationAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getOperationAssignment_0_0_3_1()); 
            // InternalSpaml.g:1671:2: ( rule__Transition__OperationAssignment_0_0_3_1 )
            // InternalSpaml.g:1671:3: rule__Transition__OperationAssignment_0_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OperationAssignment_0_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOperationAssignment_0_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__1__Impl"


    // $ANTLR start "rule__TransitionHandler__Group__0"
    // InternalSpaml.g:1680:1: rule__TransitionHandler__Group__0 : rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 ;
    public final void rule__TransitionHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1684:1: ( rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 )
            // InternalSpaml.g:1685:2: rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TransitionHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionHandler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__Group__0"


    // $ANTLR start "rule__TransitionHandler__Group__0__Impl"
    // InternalSpaml.g:1692:1: rule__TransitionHandler__Group__0__Impl : ( ( rule__TransitionHandler__SensorAssignment_0 ) ) ;
    public final void rule__TransitionHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1696:1: ( ( ( rule__TransitionHandler__SensorAssignment_0 ) ) )
            // InternalSpaml.g:1697:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            {
            // InternalSpaml.g:1697:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            // InternalSpaml.g:1698:2: ( rule__TransitionHandler__SensorAssignment_0 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorAssignment_0()); 
            // InternalSpaml.g:1699:2: ( rule__TransitionHandler__SensorAssignment_0 )
            // InternalSpaml.g:1699:3: rule__TransitionHandler__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionHandler__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionHandlerAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__Group__0__Impl"


    // $ANTLR start "rule__TransitionHandler__Group__1"
    // InternalSpaml.g:1707:1: rule__TransitionHandler__Group__1 : rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 ;
    public final void rule__TransitionHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1711:1: ( rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 )
            // InternalSpaml.g:1712:2: rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TransitionHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionHandler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__Group__1"


    // $ANTLR start "rule__TransitionHandler__Group__1__Impl"
    // InternalSpaml.g:1719:1: rule__TransitionHandler__Group__1__Impl : ( ( rule__TransitionHandler__Alternatives_1 ) ) ;
    public final void rule__TransitionHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1723:1: ( ( ( rule__TransitionHandler__Alternatives_1 ) ) )
            // InternalSpaml.g:1724:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            {
            // InternalSpaml.g:1724:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            // InternalSpaml.g:1725:2: ( rule__TransitionHandler__Alternatives_1 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getAlternatives_1()); 
            // InternalSpaml.g:1726:2: ( rule__TransitionHandler__Alternatives_1 )
            // InternalSpaml.g:1726:3: rule__TransitionHandler__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionHandler__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionHandlerAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__Group__1__Impl"


    // $ANTLR start "rule__TransitionHandler__Group__2"
    // InternalSpaml.g:1734:1: rule__TransitionHandler__Group__2 : rule__TransitionHandler__Group__2__Impl ;
    public final void rule__TransitionHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1738:1: ( rule__TransitionHandler__Group__2__Impl )
            // InternalSpaml.g:1739:2: rule__TransitionHandler__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionHandler__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__Group__2"


    // $ANTLR start "rule__TransitionHandler__Group__2__Impl"
    // InternalSpaml.g:1745:1: rule__TransitionHandler__Group__2__Impl : ( ( rule__TransitionHandler__ValueAssignment_2 ) ) ;
    public final void rule__TransitionHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1749:1: ( ( ( rule__TransitionHandler__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1750:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1750:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            // InternalSpaml.g:1751:2: ( rule__TransitionHandler__ValueAssignment_2 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1752:2: ( rule__TransitionHandler__ValueAssignment_2 )
            // InternalSpaml.g:1752:3: rule__TransitionHandler__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionHandler__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionHandlerAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__Group__2__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalSpaml.g:1761:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1765:1: ( ( ruleEString ) )
            // InternalSpaml.g:1766:2: ( ruleEString )
            {
            // InternalSpaml.g:1766:2: ( ruleEString )
            // InternalSpaml.g:1767:3: ruleEString
            {
             before(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__InitialStateAssignment_3"
    // InternalSpaml.g:1776:1: rule__Program__InitialStateAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Program__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1780:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1781:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1781:2: ( ( ruleEString ) )
            // InternalSpaml.g:1782:3: ( ruleEString )
            {
             before(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0()); 
            // InternalSpaml.g:1783:3: ( ruleEString )
            // InternalSpaml.g:1784:4: ruleEString
            {
             before(grammarAccess.getProgramAccess().getInitialStateStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInitialStateStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__InitialStateAssignment_3"


    // $ANTLR start "rule__Program__PluggedElementsAssignment_6"
    // InternalSpaml.g:1795:1: rule__Program__PluggedElementsAssignment_6 : ( rulePluggedElement ) ;
    public final void rule__Program__PluggedElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1799:1: ( ( rulePluggedElement ) )
            // InternalSpaml.g:1800:2: ( rulePluggedElement )
            {
            // InternalSpaml.g:1800:2: ( rulePluggedElement )
            // InternalSpaml.g:1801:3: rulePluggedElement
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsPluggedElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePluggedElement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getPluggedElementsPluggedElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__PluggedElementsAssignment_6"


    // $ANTLR start "rule__Program__StatesAssignment_8"
    // InternalSpaml.g:1810:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1814:1: ( ( ruleState ) )
            // InternalSpaml.g:1815:2: ( ruleState )
            {
            // InternalSpaml.g:1815:2: ( ruleState )
            // InternalSpaml.g:1816:3: ruleState
            {
             before(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatesAssignment_8"


    // $ANTLR start "rule__PluggedElement__NameAssignment_1"
    // InternalSpaml.g:1825:1: rule__PluggedElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PluggedElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1829:1: ( ( ruleEString ) )
            // InternalSpaml.g:1830:2: ( ruleEString )
            {
            // InternalSpaml.g:1830:2: ( ruleEString )
            // InternalSpaml.g:1831:3: ruleEString
            {
             before(grammarAccess.getPluggedElementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPluggedElementAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__NameAssignment_1"


    // $ANTLR start "rule__PluggedElement__PinAssignment_3"
    // InternalSpaml.g:1840:1: rule__PluggedElement__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__PluggedElement__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1844:1: ( ( ruleEInt ) )
            // InternalSpaml.g:1845:2: ( ruleEInt )
            {
            // InternalSpaml.g:1845:2: ( ruleEInt )
            // InternalSpaml.g:1846:3: ruleEInt
            {
             before(grammarAccess.getPluggedElementAccess().getPinEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPluggedElementAccess().getPinEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PluggedElement__PinAssignment_3"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalSpaml.g:1855:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1859:1: ( ( ruleEString ) )
            // InternalSpaml.g:1860:2: ( ruleEString )
            {
            // InternalSpaml.g:1860:2: ( ruleEString )
            // InternalSpaml.g:1861:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_0"


    // $ANTLR start "rule__State__ActionsAssignment_2"
    // InternalSpaml.g:1870:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1874:1: ( ( ruleAction ) )
            // InternalSpaml.g:1875:2: ( ruleAction )
            {
            // InternalSpaml.g:1875:2: ( ruleAction )
            // InternalSpaml.g:1876:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_2"


    // $ANTLR start "rule__State__ActionsAssignment_3"
    // InternalSpaml.g:1885:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1889:1: ( ( ruleAction ) )
            // InternalSpaml.g:1890:2: ( ruleAction )
            {
            // InternalSpaml.g:1890:2: ( ruleAction )
            // InternalSpaml.g:1891:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_3"


    // $ANTLR start "rule__State__TransitionAssignment_4"
    // InternalSpaml.g:1900:1: rule__State__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1904:1: ( ( ruleTransition ) )
            // InternalSpaml.g:1905:2: ( ruleTransition )
            {
            // InternalSpaml.g:1905:2: ( ruleTransition )
            // InternalSpaml.g:1906:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionAssignment_4"


    // $ANTLR start "rule__Action__ActuatorAssignment_0"
    // InternalSpaml.g:1915:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1919:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1920:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1920:2: ( ( ruleEString ) )
            // InternalSpaml.g:1921:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalSpaml.g:1922:3: ( ruleEString )
            // InternalSpaml.g:1923:4: ruleEString
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActuatorAssignment_0"


    // $ANTLR start "rule__Action__ValueAssignment_2"
    // InternalSpaml.g:1934:1: rule__Action__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1938:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:1939:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:1939:2: ( ruleSIGNAL )
            // InternalSpaml.g:1940:3: ruleSIGNAL
            {
             before(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNAL();

            state._fsp--;

             after(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ValueAssignment_2"


    // $ANTLR start "rule__Transition__HandlersAssignment_0_0_1"
    // InternalSpaml.g:1949:1: rule__Transition__HandlersAssignment_0_0_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1953:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:1954:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:1954:2: ( ruleTransitionHandler )
            // InternalSpaml.g:1955:3: ruleTransitionHandler
            {
             before(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionHandler();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__HandlersAssignment_0_0_1"


    // $ANTLR start "rule__Transition__HandlersAssignment_0_0_2_1"
    // InternalSpaml.g:1964:1: rule__Transition__HandlersAssignment_0_0_2_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1968:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:1969:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:1969:2: ( ruleTransitionHandler )
            // InternalSpaml.g:1970:3: ruleTransitionHandler
            {
             before(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_0_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionHandler();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_0_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__HandlersAssignment_0_0_2_1"


    // $ANTLR start "rule__Transition__OperationAssignment_0_0_3_1"
    // InternalSpaml.g:1979:1: rule__Transition__OperationAssignment_0_0_3_1 : ( ruleOPERATION ) ;
    public final void rule__Transition__OperationAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1983:1: ( ( ruleOPERATION ) )
            // InternalSpaml.g:1984:2: ( ruleOPERATION )
            {
            // InternalSpaml.g:1984:2: ( ruleOPERATION )
            // InternalSpaml.g:1985:3: ruleOPERATION
            {
             before(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_0_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOPERATION();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_0_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OperationAssignment_0_0_3_1"


    // $ANTLR start "rule__Transition__DelayAssignment_0_1"
    // InternalSpaml.g:1994:1: rule__Transition__DelayAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__Transition__DelayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1998:1: ( ( ruleEInt ) )
            // InternalSpaml.g:1999:2: ( ruleEInt )
            {
            // InternalSpaml.g:1999:2: ( ruleEInt )
            // InternalSpaml.g:2000:3: ruleEInt
            {
             before(grammarAccess.getTransitionAccess().getDelayEIntParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getDelayEIntParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__DelayAssignment_0_1"


    // $ANTLR start "rule__Transition__NextAssignment_2"
    // InternalSpaml.g:2009:1: rule__Transition__NextAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2013:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2014:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2014:2: ( ( ruleEString ) )
            // InternalSpaml.g:2015:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_2_0()); 
            // InternalSpaml.g:2016:3: ( ruleEString )
            // InternalSpaml.g:2017:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NextAssignment_2"


    // $ANTLR start "rule__TransitionHandler__SensorAssignment_0"
    // InternalSpaml.g:2028:1: rule__TransitionHandler__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionHandler__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2032:1: ( ( ( RULE_ID ) ) )
            // InternalSpaml.g:2033:2: ( ( RULE_ID ) )
            {
            // InternalSpaml.g:2033:2: ( ( RULE_ID ) )
            // InternalSpaml.g:2034:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorSensorCrossReference_0_0()); 
            // InternalSpaml.g:2035:3: ( RULE_ID )
            // InternalSpaml.g:2036:4: RULE_ID
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionHandlerAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionHandlerAccess().getSensorSensorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__SensorAssignment_0"


    // $ANTLR start "rule__TransitionHandler__ValueAssignment_2"
    // InternalSpaml.g:2047:1: rule__TransitionHandler__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__TransitionHandler__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2051:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:2052:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:2052:2: ( ruleSIGNAL )
            // InternalSpaml.g:2053:3: ruleSIGNAL
            {
             before(grammarAccess.getTransitionHandlerAccess().getValueSIGNALEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNAL();

            state._fsp--;

             after(grammarAccess.getTransitionHandlerAccess().getValueSIGNALEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionHandler__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000300000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001300000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000808000L});

}