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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pluggedElements'", "'pluggedElements:'", "'states'", "'states:'", "'='", "'setTo'", "'&&'", "'and'", "'->'", "'then'", "'<-'", "'associate'", "'is'", "'LOW'", "'HIGH'", "'AND'", "'OR'", "'Program'", "'initialState'", "'{'", "'}'", "'onPin'", "'-'", "'Sensor'", "'Actuator'", "'when'"
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


    // $ANTLR start "rule__Transition__Alternatives_2_0"
    // InternalSpaml.g:439:1: rule__Transition__Alternatives_2_0 : ( ( '&&' ) | ( 'and' ) );
    public final void rule__Transition__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:443:1: ( ( '&&' ) | ( 'and' ) )
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
                    // InternalSpaml.g:444:2: ( '&&' )
                    {
                    // InternalSpaml.g:444:2: ( '&&' )
                    // InternalSpaml.g:445:3: '&&'
                    {
                     before(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_2_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:450:2: ( 'and' )
                    {
                    // InternalSpaml.g:450:2: ( 'and' )
                    // InternalSpaml.g:451:3: 'and'
                    {
                     before(grammarAccess.getTransitionAccess().getAndKeyword_2_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAndKeyword_2_0_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_2_0"


    // $ANTLR start "rule__Transition__Alternatives_3"
    // InternalSpaml.g:460:1: rule__Transition__Alternatives_3 : ( ( '->' ) | ( 'then' ) );
    public final void rule__Transition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:464:1: ( ( '->' ) | ( 'then' ) )
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
                    // InternalSpaml.g:465:2: ( '->' )
                    {
                    // InternalSpaml.g:465:2: ( '->' )
                    // InternalSpaml.g:466:3: '->'
                    {
                     before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:471:2: ( 'then' )
                    {
                    // InternalSpaml.g:471:2: ( 'then' )
                    // InternalSpaml.g:472:3: 'then'
                    {
                     before(grammarAccess.getTransitionAccess().getThenKeyword_3_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getThenKeyword_3_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_3"


    // $ANTLR start "rule__Transition__Alternatives_5_0"
    // InternalSpaml.g:481:1: rule__Transition__Alternatives_5_0 : ( ( '<-' ) | ( 'associate' ) );
    public final void rule__Transition__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:485:1: ( ( '<-' ) | ( 'associate' ) )
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
                    // InternalSpaml.g:486:2: ( '<-' )
                    {
                    // InternalSpaml.g:486:2: ( '<-' )
                    // InternalSpaml.g:487:3: '<-'
                    {
                     before(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_5_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:492:2: ( 'associate' )
                    {
                    // InternalSpaml.g:492:2: ( 'associate' )
                    // InternalSpaml.g:493:3: 'associate'
                    {
                     before(grammarAccess.getTransitionAccess().getAssociateKeyword_5_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAssociateKeyword_5_0_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_5_0"


    // $ANTLR start "rule__TransitionHandler__Alternatives_1"
    // InternalSpaml.g:502:1: rule__TransitionHandler__Alternatives_1 : ( ( '=' ) | ( 'is' ) );
    public final void rule__TransitionHandler__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:506:1: ( ( '=' ) | ( 'is' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpaml.g:507:2: ( '=' )
                    {
                    // InternalSpaml.g:507:2: ( '=' )
                    // InternalSpaml.g:508:3: '='
                    {
                     before(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:513:2: ( 'is' )
                    {
                    // InternalSpaml.g:513:2: ( 'is' )
                    // InternalSpaml.g:514:3: 'is'
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
    // InternalSpaml.g:523:1: rule__SIGNAL__Alternatives : ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) );
    public final void rule__SIGNAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:527:1: ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpaml.g:528:2: ( ( 'LOW' ) )
                    {
                    // InternalSpaml.g:528:2: ( ( 'LOW' ) )
                    // InternalSpaml.g:529:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:530:3: ( 'LOW' )
                    // InternalSpaml.g:530:4: 'LOW'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:534:2: ( ( 'HIGH' ) )
                    {
                    // InternalSpaml.g:534:2: ( ( 'HIGH' ) )
                    // InternalSpaml.g:535:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:536:3: ( 'HIGH' )
                    // InternalSpaml.g:536:4: 'HIGH'
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
    // InternalSpaml.g:544:1: rule__OPERATION__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__OPERATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:548:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpaml.g:549:2: ( ( 'AND' ) )
                    {
                    // InternalSpaml.g:549:2: ( ( 'AND' ) )
                    // InternalSpaml.g:550:3: ( 'AND' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:551:3: ( 'AND' )
                    // InternalSpaml.g:551:4: 'AND'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:555:2: ( ( 'OR' ) )
                    {
                    // InternalSpaml.g:555:2: ( ( 'OR' ) )
                    // InternalSpaml.g:556:3: ( 'OR' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:557:3: ( 'OR' )
                    // InternalSpaml.g:557:4: 'OR'
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
    // InternalSpaml.g:565:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:569:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSpaml.g:570:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalSpaml.g:577:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:581:1: ( ( 'Program' ) )
            // InternalSpaml.g:582:1: ( 'Program' )
            {
            // InternalSpaml.g:582:1: ( 'Program' )
            // InternalSpaml.g:583:2: 'Program'
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
    // InternalSpaml.g:592:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:596:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSpaml.g:597:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalSpaml.g:604:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:608:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSpaml.g:609:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSpaml.g:609:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSpaml.g:610:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSpaml.g:611:2: ( rule__Program__NameAssignment_1 )
            // InternalSpaml.g:611:3: rule__Program__NameAssignment_1
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
    // InternalSpaml.g:619:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:623:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSpaml.g:624:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalSpaml.g:631:1: rule__Program__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:635:1: ( ( 'initialState' ) )
            // InternalSpaml.g:636:1: ( 'initialState' )
            {
            // InternalSpaml.g:636:1: ( 'initialState' )
            // InternalSpaml.g:637:2: 'initialState'
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
    // InternalSpaml.g:646:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:650:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSpaml.g:651:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalSpaml.g:658:1: rule__Program__Group__3__Impl : ( ( rule__Program__InitialStateAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:662:1: ( ( ( rule__Program__InitialStateAssignment_3 ) ) )
            // InternalSpaml.g:663:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            {
            // InternalSpaml.g:663:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            // InternalSpaml.g:664:2: ( rule__Program__InitialStateAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getInitialStateAssignment_3()); 
            // InternalSpaml.g:665:2: ( rule__Program__InitialStateAssignment_3 )
            // InternalSpaml.g:665:3: rule__Program__InitialStateAssignment_3
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
    // InternalSpaml.g:673:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:677:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalSpaml.g:678:2: rule__Program__Group__4__Impl rule__Program__Group__5
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
    // InternalSpaml.g:685:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:689:1: ( ( '{' ) )
            // InternalSpaml.g:690:1: ( '{' )
            {
            // InternalSpaml.g:690:1: ( '{' )
            // InternalSpaml.g:691:2: '{'
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
    // InternalSpaml.g:700:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:704:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalSpaml.g:705:2: rule__Program__Group__5__Impl rule__Program__Group__6
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
    // InternalSpaml.g:712:1: rule__Program__Group__5__Impl : ( ( rule__Program__Alternatives_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:716:1: ( ( ( rule__Program__Alternatives_5 ) ) )
            // InternalSpaml.g:717:1: ( ( rule__Program__Alternatives_5 ) )
            {
            // InternalSpaml.g:717:1: ( ( rule__Program__Alternatives_5 ) )
            // InternalSpaml.g:718:2: ( rule__Program__Alternatives_5 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_5()); 
            // InternalSpaml.g:719:2: ( rule__Program__Alternatives_5 )
            // InternalSpaml.g:719:3: rule__Program__Alternatives_5
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
    // InternalSpaml.g:727:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:731:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalSpaml.g:732:2: rule__Program__Group__6__Impl rule__Program__Group__7
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
    // InternalSpaml.g:739:1: rule__Program__Group__6__Impl : ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:743:1: ( ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) )
            // InternalSpaml.g:744:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            {
            // InternalSpaml.g:744:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            // InternalSpaml.g:745:2: ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* )
            {
            // InternalSpaml.g:745:2: ( ( rule__Program__PluggedElementsAssignment_6 ) )
            // InternalSpaml.g:746:3: ( rule__Program__PluggedElementsAssignment_6 )
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:747:3: ( rule__Program__PluggedElementsAssignment_6 )
            // InternalSpaml.g:747:4: rule__Program__PluggedElementsAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__Program__PluggedElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 

            }

            // InternalSpaml.g:750:2: ( ( rule__Program__PluggedElementsAssignment_6 )* )
            // InternalSpaml.g:751:3: ( rule__Program__PluggedElementsAssignment_6 )*
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:752:3: ( rule__Program__PluggedElementsAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=34 && LA12_0<=35)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSpaml.g:752:4: rule__Program__PluggedElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__PluggedElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSpaml.g:761:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:765:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalSpaml.g:766:2: rule__Program__Group__7__Impl rule__Program__Group__8
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
    // InternalSpaml.g:773:1: rule__Program__Group__7__Impl : ( ( rule__Program__Alternatives_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:777:1: ( ( ( rule__Program__Alternatives_7 ) ) )
            // InternalSpaml.g:778:1: ( ( rule__Program__Alternatives_7 ) )
            {
            // InternalSpaml.g:778:1: ( ( rule__Program__Alternatives_7 ) )
            // InternalSpaml.g:779:2: ( rule__Program__Alternatives_7 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_7()); 
            // InternalSpaml.g:780:2: ( rule__Program__Alternatives_7 )
            // InternalSpaml.g:780:3: rule__Program__Alternatives_7
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
    // InternalSpaml.g:788:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:792:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalSpaml.g:793:2: rule__Program__Group__8__Impl rule__Program__Group__9
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
    // InternalSpaml.g:800:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:804:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // InternalSpaml.g:805:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // InternalSpaml.g:805:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // InternalSpaml.g:806:2: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // InternalSpaml.g:806:2: ( ( rule__Program__StatesAssignment_8 ) )
            // InternalSpaml.g:807:3: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:808:3: ( rule__Program__StatesAssignment_8 )
            // InternalSpaml.g:808:4: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__Program__StatesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // InternalSpaml.g:811:2: ( ( rule__Program__StatesAssignment_8 )* )
            // InternalSpaml.g:812:3: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:813:3: ( rule__Program__StatesAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpaml.g:813:4: rule__Program__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Program__StatesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSpaml.g:822:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:826:1: ( rule__Program__Group__9__Impl )
            // InternalSpaml.g:827:2: rule__Program__Group__9__Impl
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
    // InternalSpaml.g:833:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:837:1: ( ( '}' ) )
            // InternalSpaml.g:838:1: ( '}' )
            {
            // InternalSpaml.g:838:1: ( '}' )
            // InternalSpaml.g:839:2: '}'
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
    // InternalSpaml.g:849:1: rule__PluggedElement__Group__0 : rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 ;
    public final void rule__PluggedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:853:1: ( rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 )
            // InternalSpaml.g:854:2: rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1
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
    // InternalSpaml.g:861:1: rule__PluggedElement__Group__0__Impl : ( ( rule__PluggedElement__Alternatives_0 ) ) ;
    public final void rule__PluggedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:865:1: ( ( ( rule__PluggedElement__Alternatives_0 ) ) )
            // InternalSpaml.g:866:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            {
            // InternalSpaml.g:866:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            // InternalSpaml.g:867:2: ( rule__PluggedElement__Alternatives_0 )
            {
             before(grammarAccess.getPluggedElementAccess().getAlternatives_0()); 
            // InternalSpaml.g:868:2: ( rule__PluggedElement__Alternatives_0 )
            // InternalSpaml.g:868:3: rule__PluggedElement__Alternatives_0
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
    // InternalSpaml.g:876:1: rule__PluggedElement__Group__1 : rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 ;
    public final void rule__PluggedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:880:1: ( rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 )
            // InternalSpaml.g:881:2: rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2
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
    // InternalSpaml.g:888:1: rule__PluggedElement__Group__1__Impl : ( ( rule__PluggedElement__NameAssignment_1 ) ) ;
    public final void rule__PluggedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:892:1: ( ( ( rule__PluggedElement__NameAssignment_1 ) ) )
            // InternalSpaml.g:893:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            {
            // InternalSpaml.g:893:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            // InternalSpaml.g:894:2: ( rule__PluggedElement__NameAssignment_1 )
            {
             before(grammarAccess.getPluggedElementAccess().getNameAssignment_1()); 
            // InternalSpaml.g:895:2: ( rule__PluggedElement__NameAssignment_1 )
            // InternalSpaml.g:895:3: rule__PluggedElement__NameAssignment_1
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
    // InternalSpaml.g:903:1: rule__PluggedElement__Group__2 : rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 ;
    public final void rule__PluggedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:907:1: ( rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 )
            // InternalSpaml.g:908:2: rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3
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
    // InternalSpaml.g:915:1: rule__PluggedElement__Group__2__Impl : ( ( 'onPin' )? ) ;
    public final void rule__PluggedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:919:1: ( ( ( 'onPin' )? ) )
            // InternalSpaml.g:920:1: ( ( 'onPin' )? )
            {
            // InternalSpaml.g:920:1: ( ( 'onPin' )? )
            // InternalSpaml.g:921:2: ( 'onPin' )?
            {
             before(grammarAccess.getPluggedElementAccess().getOnPinKeyword_2()); 
            // InternalSpaml.g:922:2: ( 'onPin' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpaml.g:922:3: 'onPin'
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
    // InternalSpaml.g:930:1: rule__PluggedElement__Group__3 : rule__PluggedElement__Group__3__Impl ;
    public final void rule__PluggedElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:934:1: ( rule__PluggedElement__Group__3__Impl )
            // InternalSpaml.g:935:2: rule__PluggedElement__Group__3__Impl
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
    // InternalSpaml.g:941:1: rule__PluggedElement__Group__3__Impl : ( ( rule__PluggedElement__PinAssignment_3 ) ) ;
    public final void rule__PluggedElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:945:1: ( ( ( rule__PluggedElement__PinAssignment_3 ) ) )
            // InternalSpaml.g:946:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            {
            // InternalSpaml.g:946:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            // InternalSpaml.g:947:2: ( rule__PluggedElement__PinAssignment_3 )
            {
             before(grammarAccess.getPluggedElementAccess().getPinAssignment_3()); 
            // InternalSpaml.g:948:2: ( rule__PluggedElement__PinAssignment_3 )
            // InternalSpaml.g:948:3: rule__PluggedElement__PinAssignment_3
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
    // InternalSpaml.g:957:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:961:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSpaml.g:962:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalSpaml.g:969:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:973:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalSpaml.g:974:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalSpaml.g:974:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalSpaml.g:975:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalSpaml.g:976:2: ( rule__State__NameAssignment_0 )
            // InternalSpaml.g:976:3: rule__State__NameAssignment_0
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
    // InternalSpaml.g:984:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:988:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSpaml.g:989:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalSpaml.g:996:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1000:1: ( ( '{' ) )
            // InternalSpaml.g:1001:1: ( '{' )
            {
            // InternalSpaml.g:1001:1: ( '{' )
            // InternalSpaml.g:1002:2: '{'
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
    // InternalSpaml.g:1011:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1015:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSpaml.g:1016:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalSpaml.g:1023:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1027:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalSpaml.g:1028:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalSpaml.g:1028:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalSpaml.g:1029:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalSpaml.g:1030:2: ( rule__State__ActionsAssignment_2 )
            // InternalSpaml.g:1030:3: rule__State__ActionsAssignment_2
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
    // InternalSpaml.g:1038:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1042:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSpaml.g:1043:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalSpaml.g:1050:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1054:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalSpaml.g:1055:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalSpaml.g:1055:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalSpaml.g:1056:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalSpaml.g:1057:2: ( rule__State__ActionsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==15) ) {
                        int LA15_4 = input.LA(3);

                        if ( (LA15_4==24) ) {
                            int LA15_5 = input.LA(4);

                            if ( ((LA15_5>=RULE_STRING && LA15_5<=RULE_ID)||LA15_5==36) ) {
                                alt15=1;
                            }


                        }
                        else if ( (LA15_4==25) ) {
                            int LA15_6 = input.LA(4);

                            if ( ((LA15_6>=RULE_STRING && LA15_6<=RULE_ID)||LA15_6==36) ) {
                                alt15=1;
                            }


                        }


                    }
                    else if ( (LA15_2==16) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSpaml.g:1057:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSpaml.g:1065:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1069:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalSpaml.g:1070:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalSpaml.g:1077:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1081:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalSpaml.g:1082:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalSpaml.g:1082:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalSpaml.g:1083:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalSpaml.g:1084:2: ( rule__State__TransitionAssignment_4 )
            // InternalSpaml.g:1084:3: rule__State__TransitionAssignment_4
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
    // InternalSpaml.g:1092:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1096:1: ( rule__State__Group__5__Impl )
            // InternalSpaml.g:1097:2: rule__State__Group__5__Impl
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
    // InternalSpaml.g:1103:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1107:1: ( ( '}' ) )
            // InternalSpaml.g:1108:1: ( '}' )
            {
            // InternalSpaml.g:1108:1: ( '}' )
            // InternalSpaml.g:1109:2: '}'
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
    // InternalSpaml.g:1119:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1123:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSpaml.g:1124:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSpaml.g:1131:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1135:1: ( ( ( '-' )? ) )
            // InternalSpaml.g:1136:1: ( ( '-' )? )
            {
            // InternalSpaml.g:1136:1: ( ( '-' )? )
            // InternalSpaml.g:1137:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSpaml.g:1138:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpaml.g:1138:3: '-'
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
    // InternalSpaml.g:1146:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1150:1: ( rule__EInt__Group__1__Impl )
            // InternalSpaml.g:1151:2: rule__EInt__Group__1__Impl
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
    // InternalSpaml.g:1157:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1161:1: ( ( RULE_INT ) )
            // InternalSpaml.g:1162:1: ( RULE_INT )
            {
            // InternalSpaml.g:1162:1: ( RULE_INT )
            // InternalSpaml.g:1163:2: RULE_INT
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
    // InternalSpaml.g:1173:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1177:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSpaml.g:1178:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
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
    // InternalSpaml.g:1185:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1189:1: ( ( () ) )
            // InternalSpaml.g:1190:1: ( () )
            {
            // InternalSpaml.g:1190:1: ( () )
            // InternalSpaml.g:1191:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSpaml.g:1192:2: ()
            // InternalSpaml.g:1192:3: 
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
    // InternalSpaml.g:1200:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1204:1: ( rule__Sensor__Group__1__Impl )
            // InternalSpaml.g:1205:2: rule__Sensor__Group__1__Impl
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
    // InternalSpaml.g:1211:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1215:1: ( ( 'Sensor' ) )
            // InternalSpaml.g:1216:1: ( 'Sensor' )
            {
            // InternalSpaml.g:1216:1: ( 'Sensor' )
            // InternalSpaml.g:1217:2: 'Sensor'
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
    // InternalSpaml.g:1227:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1231:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalSpaml.g:1232:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
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
    // InternalSpaml.g:1239:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1243:1: ( ( () ) )
            // InternalSpaml.g:1244:1: ( () )
            {
            // InternalSpaml.g:1244:1: ( () )
            // InternalSpaml.g:1245:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalSpaml.g:1246:2: ()
            // InternalSpaml.g:1246:3: 
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
    // InternalSpaml.g:1254:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1258:1: ( rule__Actuator__Group__1__Impl )
            // InternalSpaml.g:1259:2: rule__Actuator__Group__1__Impl
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
    // InternalSpaml.g:1265:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1269:1: ( ( 'Actuator' ) )
            // InternalSpaml.g:1270:1: ( 'Actuator' )
            {
            // InternalSpaml.g:1270:1: ( 'Actuator' )
            // InternalSpaml.g:1271:2: 'Actuator'
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
    // InternalSpaml.g:1281:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1285:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSpaml.g:1286:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalSpaml.g:1293:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1297:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalSpaml.g:1298:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalSpaml.g:1298:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalSpaml.g:1299:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalSpaml.g:1300:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalSpaml.g:1300:3: rule__Action__ActuatorAssignment_0
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
    // InternalSpaml.g:1308:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1312:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSpaml.g:1313:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // InternalSpaml.g:1320:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1324:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalSpaml.g:1325:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalSpaml.g:1325:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalSpaml.g:1326:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1327:2: ( rule__Action__Alternatives_1 )
            // InternalSpaml.g:1327:3: rule__Action__Alternatives_1
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
    // InternalSpaml.g:1335:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1339:1: ( rule__Action__Group__2__Impl )
            // InternalSpaml.g:1340:2: rule__Action__Group__2__Impl
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
    // InternalSpaml.g:1346:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1350:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1351:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1351:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalSpaml.g:1352:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1353:2: ( rule__Action__ValueAssignment_2 )
            // InternalSpaml.g:1353:3: rule__Action__ValueAssignment_2
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
    // InternalSpaml.g:1362:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1366:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSpaml.g:1367:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSpaml.g:1374:1: rule__Transition__Group__0__Impl : ( ( 'when' )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1378:1: ( ( ( 'when' )? ) )
            // InternalSpaml.g:1379:1: ( ( 'when' )? )
            {
            // InternalSpaml.g:1379:1: ( ( 'when' )? )
            // InternalSpaml.g:1380:2: ( 'when' )?
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0()); 
            // InternalSpaml.g:1381:2: ( 'when' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpaml.g:1381:3: 'when'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getWhenKeyword_0()); 

            }


            }

        }
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
    // InternalSpaml.g:1389:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1393:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSpaml.g:1394:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSpaml.g:1401:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__HandlersAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1405:1: ( ( ( rule__Transition__HandlersAssignment_1 ) ) )
            // InternalSpaml.g:1406:1: ( ( rule__Transition__HandlersAssignment_1 ) )
            {
            // InternalSpaml.g:1406:1: ( ( rule__Transition__HandlersAssignment_1 ) )
            // InternalSpaml.g:1407:2: ( rule__Transition__HandlersAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_1()); 
            // InternalSpaml.g:1408:2: ( rule__Transition__HandlersAssignment_1 )
            // InternalSpaml.g:1408:3: rule__Transition__HandlersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__HandlersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getHandlersAssignment_1()); 

            }


            }

        }
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
    // InternalSpaml.g:1416:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1420:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalSpaml.g:1421:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSpaml.g:1428:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )* ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1432:1: ( ( ( rule__Transition__Group_2__0 )* ) )
            // InternalSpaml.g:1433:1: ( ( rule__Transition__Group_2__0 )* )
            {
            // InternalSpaml.g:1433:1: ( ( rule__Transition__Group_2__0 )* )
            // InternalSpaml.g:1434:2: ( rule__Transition__Group_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalSpaml.g:1435:2: ( rule__Transition__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=18)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSpaml.g:1435:3: rule__Transition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Transition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group__3"
    // InternalSpaml.g:1443:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1447:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalSpaml.g:1448:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalSpaml.g:1455:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Alternatives_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1459:1: ( ( ( rule__Transition__Alternatives_3 ) ) )
            // InternalSpaml.g:1460:1: ( ( rule__Transition__Alternatives_3 ) )
            {
            // InternalSpaml.g:1460:1: ( ( rule__Transition__Alternatives_3 ) )
            // InternalSpaml.g:1461:2: ( rule__Transition__Alternatives_3 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_3()); 
            // InternalSpaml.g:1462:2: ( rule__Transition__Alternatives_3 )
            // InternalSpaml.g:1462:3: rule__Transition__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalSpaml.g:1470:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1474:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalSpaml.g:1475:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalSpaml.g:1482:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__NextAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1486:1: ( ( ( rule__Transition__NextAssignment_4 ) ) )
            // InternalSpaml.g:1487:1: ( ( rule__Transition__NextAssignment_4 ) )
            {
            // InternalSpaml.g:1487:1: ( ( rule__Transition__NextAssignment_4 ) )
            // InternalSpaml.g:1488:2: ( rule__Transition__NextAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_4()); 
            // InternalSpaml.g:1489:2: ( rule__Transition__NextAssignment_4 )
            // InternalSpaml.g:1489:3: rule__Transition__NextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalSpaml.g:1497:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1501:1: ( rule__Transition__Group__5__Impl )
            // InternalSpaml.g:1502:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalSpaml.g:1508:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1512:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalSpaml.g:1513:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalSpaml.g:1513:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalSpaml.g:1514:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalSpaml.g:1515:2: ( rule__Transition__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=21 && LA19_0<=22)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpaml.g:1515:3: rule__Transition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalSpaml.g:1524:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1528:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalSpaml.g:1529:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // InternalSpaml.g:1536:1: rule__Transition__Group_2__0__Impl : ( ( rule__Transition__Alternatives_2_0 ) ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1540:1: ( ( ( rule__Transition__Alternatives_2_0 ) ) )
            // InternalSpaml.g:1541:1: ( ( rule__Transition__Alternatives_2_0 ) )
            {
            // InternalSpaml.g:1541:1: ( ( rule__Transition__Alternatives_2_0 ) )
            // InternalSpaml.g:1542:2: ( rule__Transition__Alternatives_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_2_0()); 
            // InternalSpaml.g:1543:2: ( rule__Transition__Alternatives_2_0 )
            // InternalSpaml.g:1543:3: rule__Transition__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // InternalSpaml.g:1551:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1555:1: ( rule__Transition__Group_2__1__Impl )
            // InternalSpaml.g:1556:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // InternalSpaml.g:1562:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__HandlersAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1566:1: ( ( ( rule__Transition__HandlersAssignment_2_1 ) ) )
            // InternalSpaml.g:1567:1: ( ( rule__Transition__HandlersAssignment_2_1 ) )
            {
            // InternalSpaml.g:1567:1: ( ( rule__Transition__HandlersAssignment_2_1 ) )
            // InternalSpaml.g:1568:2: ( rule__Transition__HandlersAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_2_1()); 
            // InternalSpaml.g:1569:2: ( rule__Transition__HandlersAssignment_2_1 )
            // InternalSpaml.g:1569:3: rule__Transition__HandlersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__HandlersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getHandlersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // InternalSpaml.g:1578:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1582:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalSpaml.g:1583:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // InternalSpaml.g:1590:1: rule__Transition__Group_5__0__Impl : ( ( rule__Transition__Alternatives_5_0 ) ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1594:1: ( ( ( rule__Transition__Alternatives_5_0 ) ) )
            // InternalSpaml.g:1595:1: ( ( rule__Transition__Alternatives_5_0 ) )
            {
            // InternalSpaml.g:1595:1: ( ( rule__Transition__Alternatives_5_0 ) )
            // InternalSpaml.g:1596:2: ( rule__Transition__Alternatives_5_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_5_0()); 
            // InternalSpaml.g:1597:2: ( rule__Transition__Alternatives_5_0 )
            // InternalSpaml.g:1597:3: rule__Transition__Alternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // InternalSpaml.g:1605:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1609:1: ( rule__Transition__Group_5__1__Impl )
            // InternalSpaml.g:1610:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // InternalSpaml.g:1616:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__OperationAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1620:1: ( ( ( rule__Transition__OperationAssignment_5_1 ) ) )
            // InternalSpaml.g:1621:1: ( ( rule__Transition__OperationAssignment_5_1 ) )
            {
            // InternalSpaml.g:1621:1: ( ( rule__Transition__OperationAssignment_5_1 ) )
            // InternalSpaml.g:1622:2: ( rule__Transition__OperationAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getOperationAssignment_5_1()); 
            // InternalSpaml.g:1623:2: ( rule__Transition__OperationAssignment_5_1 )
            // InternalSpaml.g:1623:3: rule__Transition__OperationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OperationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOperationAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__TransitionHandler__Group__0"
    // InternalSpaml.g:1632:1: rule__TransitionHandler__Group__0 : rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 ;
    public final void rule__TransitionHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1636:1: ( rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 )
            // InternalSpaml.g:1637:2: rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSpaml.g:1644:1: rule__TransitionHandler__Group__0__Impl : ( ( rule__TransitionHandler__SensorAssignment_0 ) ) ;
    public final void rule__TransitionHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1648:1: ( ( ( rule__TransitionHandler__SensorAssignment_0 ) ) )
            // InternalSpaml.g:1649:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            {
            // InternalSpaml.g:1649:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            // InternalSpaml.g:1650:2: ( rule__TransitionHandler__SensorAssignment_0 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorAssignment_0()); 
            // InternalSpaml.g:1651:2: ( rule__TransitionHandler__SensorAssignment_0 )
            // InternalSpaml.g:1651:3: rule__TransitionHandler__SensorAssignment_0
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
    // InternalSpaml.g:1659:1: rule__TransitionHandler__Group__1 : rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 ;
    public final void rule__TransitionHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1663:1: ( rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 )
            // InternalSpaml.g:1664:2: rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2
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
    // InternalSpaml.g:1671:1: rule__TransitionHandler__Group__1__Impl : ( ( rule__TransitionHandler__Alternatives_1 ) ) ;
    public final void rule__TransitionHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1675:1: ( ( ( rule__TransitionHandler__Alternatives_1 ) ) )
            // InternalSpaml.g:1676:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            {
            // InternalSpaml.g:1676:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            // InternalSpaml.g:1677:2: ( rule__TransitionHandler__Alternatives_1 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getAlternatives_1()); 
            // InternalSpaml.g:1678:2: ( rule__TransitionHandler__Alternatives_1 )
            // InternalSpaml.g:1678:3: rule__TransitionHandler__Alternatives_1
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
    // InternalSpaml.g:1686:1: rule__TransitionHandler__Group__2 : rule__TransitionHandler__Group__2__Impl ;
    public final void rule__TransitionHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1690:1: ( rule__TransitionHandler__Group__2__Impl )
            // InternalSpaml.g:1691:2: rule__TransitionHandler__Group__2__Impl
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
    // InternalSpaml.g:1697:1: rule__TransitionHandler__Group__2__Impl : ( ( rule__TransitionHandler__ValueAssignment_2 ) ) ;
    public final void rule__TransitionHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1701:1: ( ( ( rule__TransitionHandler__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1702:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1702:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            // InternalSpaml.g:1703:2: ( rule__TransitionHandler__ValueAssignment_2 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1704:2: ( rule__TransitionHandler__ValueAssignment_2 )
            // InternalSpaml.g:1704:3: rule__TransitionHandler__ValueAssignment_2
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
    // InternalSpaml.g:1713:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1717:1: ( ( ruleEString ) )
            // InternalSpaml.g:1718:2: ( ruleEString )
            {
            // InternalSpaml.g:1718:2: ( ruleEString )
            // InternalSpaml.g:1719:3: ruleEString
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
    // InternalSpaml.g:1728:1: rule__Program__InitialStateAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Program__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1732:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1733:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1733:2: ( ( ruleEString ) )
            // InternalSpaml.g:1734:3: ( ruleEString )
            {
             before(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0()); 
            // InternalSpaml.g:1735:3: ( ruleEString )
            // InternalSpaml.g:1736:4: ruleEString
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
    // InternalSpaml.g:1747:1: rule__Program__PluggedElementsAssignment_6 : ( rulePluggedElement ) ;
    public final void rule__Program__PluggedElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1751:1: ( ( rulePluggedElement ) )
            // InternalSpaml.g:1752:2: ( rulePluggedElement )
            {
            // InternalSpaml.g:1752:2: ( rulePluggedElement )
            // InternalSpaml.g:1753:3: rulePluggedElement
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
    // InternalSpaml.g:1762:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1766:1: ( ( ruleState ) )
            // InternalSpaml.g:1767:2: ( ruleState )
            {
            // InternalSpaml.g:1767:2: ( ruleState )
            // InternalSpaml.g:1768:3: ruleState
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
    // InternalSpaml.g:1777:1: rule__PluggedElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PluggedElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1781:1: ( ( ruleEString ) )
            // InternalSpaml.g:1782:2: ( ruleEString )
            {
            // InternalSpaml.g:1782:2: ( ruleEString )
            // InternalSpaml.g:1783:3: ruleEString
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
    // InternalSpaml.g:1792:1: rule__PluggedElement__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__PluggedElement__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1796:1: ( ( ruleEInt ) )
            // InternalSpaml.g:1797:2: ( ruleEInt )
            {
            // InternalSpaml.g:1797:2: ( ruleEInt )
            // InternalSpaml.g:1798:3: ruleEInt
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
    // InternalSpaml.g:1807:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1811:1: ( ( ruleEString ) )
            // InternalSpaml.g:1812:2: ( ruleEString )
            {
            // InternalSpaml.g:1812:2: ( ruleEString )
            // InternalSpaml.g:1813:3: ruleEString
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
    // InternalSpaml.g:1822:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1826:1: ( ( ruleAction ) )
            // InternalSpaml.g:1827:2: ( ruleAction )
            {
            // InternalSpaml.g:1827:2: ( ruleAction )
            // InternalSpaml.g:1828:3: ruleAction
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
    // InternalSpaml.g:1837:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1841:1: ( ( ruleAction ) )
            // InternalSpaml.g:1842:2: ( ruleAction )
            {
            // InternalSpaml.g:1842:2: ( ruleAction )
            // InternalSpaml.g:1843:3: ruleAction
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
    // InternalSpaml.g:1852:1: rule__State__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1856:1: ( ( ruleTransition ) )
            // InternalSpaml.g:1857:2: ( ruleTransition )
            {
            // InternalSpaml.g:1857:2: ( ruleTransition )
            // InternalSpaml.g:1858:3: ruleTransition
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
    // InternalSpaml.g:1867:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1871:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1872:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1872:2: ( ( ruleEString ) )
            // InternalSpaml.g:1873:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalSpaml.g:1874:3: ( ruleEString )
            // InternalSpaml.g:1875:4: ruleEString
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
    // InternalSpaml.g:1886:1: rule__Action__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1890:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:1891:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:1891:2: ( ruleSIGNAL )
            // InternalSpaml.g:1892:3: ruleSIGNAL
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


    // $ANTLR start "rule__Transition__HandlersAssignment_1"
    // InternalSpaml.g:1901:1: rule__Transition__HandlersAssignment_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1905:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:1906:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:1906:2: ( ruleTransitionHandler )
            // InternalSpaml.g:1907:3: ruleTransitionHandler
            {
             before(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionHandler();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__HandlersAssignment_1"


    // $ANTLR start "rule__Transition__HandlersAssignment_2_1"
    // InternalSpaml.g:1916:1: rule__Transition__HandlersAssignment_2_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1920:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:1921:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:1921:2: ( ruleTransitionHandler )
            // InternalSpaml.g:1922:3: ruleTransitionHandler
            {
             before(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionHandler();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__HandlersAssignment_2_1"


    // $ANTLR start "rule__Transition__NextAssignment_4"
    // InternalSpaml.g:1931:1: rule__Transition__NextAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1935:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1936:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1936:2: ( ( ruleEString ) )
            // InternalSpaml.g:1937:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_4_0()); 
            // InternalSpaml.g:1938:3: ( ruleEString )
            // InternalSpaml.g:1939:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NextAssignment_4"


    // $ANTLR start "rule__Transition__OperationAssignment_5_1"
    // InternalSpaml.g:1950:1: rule__Transition__OperationAssignment_5_1 : ( ruleOPERATION ) ;
    public final void rule__Transition__OperationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1954:1: ( ( ruleOPERATION ) )
            // InternalSpaml.g:1955:2: ( ruleOPERATION )
            {
            // InternalSpaml.g:1955:2: ( ruleOPERATION )
            // InternalSpaml.g:1956:3: ruleOPERATION
            {
             before(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOPERATION();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OperationAssignment_5_1"


    // $ANTLR start "rule__TransitionHandler__SensorAssignment_0"
    // InternalSpaml.g:1965:1: rule__TransitionHandler__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionHandler__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1969:1: ( ( ( RULE_ID ) ) )
            // InternalSpaml.g:1970:2: ( ( RULE_ID ) )
            {
            // InternalSpaml.g:1970:2: ( ( RULE_ID ) )
            // InternalSpaml.g:1971:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorSensorCrossReference_0_0()); 
            // InternalSpaml.g:1972:3: ( RULE_ID )
            // InternalSpaml.g:1973:4: RULE_ID
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
    // InternalSpaml.g:1984:1: rule__TransitionHandler__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__TransitionHandler__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1988:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:1989:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:1989:2: ( ruleSIGNAL )
            // InternalSpaml.g:1990:3: ruleSIGNAL
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000808000L});

}