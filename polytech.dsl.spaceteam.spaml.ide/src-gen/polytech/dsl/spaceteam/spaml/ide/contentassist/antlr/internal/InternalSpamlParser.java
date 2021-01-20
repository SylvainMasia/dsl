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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pluggedElements'", "'pluggedElements:'", "'states'", "'states:'", "'='", "'setTo'", "'&&'", "'and'", "'->'", "'then'", "'is'", "'LOW'", "'HIGH'", "'Program'", "'initialState'", "'{'", "'}'", "'onPin'", "'-'", "'Sensor'", "'Actuator'", "'when'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


    // $ANTLR start "rule__Program__Alternatives_5"
    // InternalSpaml.g:318:1: rule__Program__Alternatives_5 : ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) );
    public final void rule__Program__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:322:1: ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) )
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
                    // InternalSpaml.g:323:2: ( 'pluggedElements' )
                    {
                    // InternalSpaml.g:323:2: ( 'pluggedElements' )
                    // InternalSpaml.g:324:3: 'pluggedElements'
                    {
                     before(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:329:2: ( 'pluggedElements:' )
                    {
                    // InternalSpaml.g:329:2: ( 'pluggedElements:' )
                    // InternalSpaml.g:330:3: 'pluggedElements:'
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
    // InternalSpaml.g:339:1: rule__Program__Alternatives_7 : ( ( 'states' ) | ( 'states:' ) );
    public final void rule__Program__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:343:1: ( ( 'states' ) | ( 'states:' ) )
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
                    // InternalSpaml.g:344:2: ( 'states' )
                    {
                    // InternalSpaml.g:344:2: ( 'states' )
                    // InternalSpaml.g:345:3: 'states'
                    {
                     before(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:350:2: ( 'states:' )
                    {
                    // InternalSpaml.g:350:2: ( 'states:' )
                    // InternalSpaml.g:351:3: 'states:'
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
    // InternalSpaml.g:360:1: rule__PluggedElement__Alternatives_0 : ( ( ruleActuator ) | ( ruleSensor ) );
    public final void rule__PluggedElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:364:1: ( ( ruleActuator ) | ( ruleSensor ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpaml.g:365:2: ( ruleActuator )
                    {
                    // InternalSpaml.g:365:2: ( ruleActuator )
                    // InternalSpaml.g:366:3: ruleActuator
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
                    // InternalSpaml.g:371:2: ( ruleSensor )
                    {
                    // InternalSpaml.g:371:2: ( ruleSensor )
                    // InternalSpaml.g:372:3: ruleSensor
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
    // InternalSpaml.g:381:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:385:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSpaml.g:386:2: ( RULE_STRING )
                    {
                    // InternalSpaml.g:386:2: ( RULE_STRING )
                    // InternalSpaml.g:387:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:392:2: ( RULE_ID )
                    {
                    // InternalSpaml.g:392:2: ( RULE_ID )
                    // InternalSpaml.g:393:3: RULE_ID
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
    // InternalSpaml.g:402:1: rule__Action__Alternatives_1 : ( ( '=' ) | ( 'setTo' ) );
    public final void rule__Action__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:406:1: ( ( '=' ) | ( 'setTo' ) )
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
                    // InternalSpaml.g:407:2: ( '=' )
                    {
                    // InternalSpaml.g:407:2: ( '=' )
                    // InternalSpaml.g:408:3: '='
                    {
                     before(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:413:2: ( 'setTo' )
                    {
                    // InternalSpaml.g:413:2: ( 'setTo' )
                    // InternalSpaml.g:414:3: 'setTo'
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
    // InternalSpaml.g:423:1: rule__Transition__Alternatives_2_0 : ( ( '&&' ) | ( 'and' ) );
    public final void rule__Transition__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:427:1: ( ( '&&' ) | ( 'and' ) )
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
                    // InternalSpaml.g:428:2: ( '&&' )
                    {
                    // InternalSpaml.g:428:2: ( '&&' )
                    // InternalSpaml.g:429:3: '&&'
                    {
                     before(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_2_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:434:2: ( 'and' )
                    {
                    // InternalSpaml.g:434:2: ( 'and' )
                    // InternalSpaml.g:435:3: 'and'
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
    // InternalSpaml.g:444:1: rule__Transition__Alternatives_3 : ( ( '->' ) | ( 'then' ) );
    public final void rule__Transition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:448:1: ( ( '->' ) | ( 'then' ) )
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
                    // InternalSpaml.g:449:2: ( '->' )
                    {
                    // InternalSpaml.g:449:2: ( '->' )
                    // InternalSpaml.g:450:3: '->'
                    {
                     before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:455:2: ( 'then' )
                    {
                    // InternalSpaml.g:455:2: ( 'then' )
                    // InternalSpaml.g:456:3: 'then'
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


    // $ANTLR start "rule__TransitionHandler__Alternatives_1"
    // InternalSpaml.g:465:1: rule__TransitionHandler__Alternatives_1 : ( ( '=' ) | ( 'is' ) );
    public final void rule__TransitionHandler__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:469:1: ( ( '=' ) | ( 'is' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpaml.g:470:2: ( '=' )
                    {
                    // InternalSpaml.g:470:2: ( '=' )
                    // InternalSpaml.g:471:3: '='
                    {
                     before(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:476:2: ( 'is' )
                    {
                    // InternalSpaml.g:476:2: ( 'is' )
                    // InternalSpaml.g:477:3: 'is'
                    {
                     before(grammarAccess.getTransitionHandlerAccess().getIsKeyword_1_1()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalSpaml.g:486:1: rule__SIGNAL__Alternatives : ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) );
    public final void rule__SIGNAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:490:1: ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
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
                    // InternalSpaml.g:491:2: ( ( 'LOW' ) )
                    {
                    // InternalSpaml.g:491:2: ( ( 'LOW' ) )
                    // InternalSpaml.g:492:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:493:3: ( 'LOW' )
                    // InternalSpaml.g:493:4: 'LOW'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:497:2: ( ( 'HIGH' ) )
                    {
                    // InternalSpaml.g:497:2: ( ( 'HIGH' ) )
                    // InternalSpaml.g:498:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:499:3: ( 'HIGH' )
                    // InternalSpaml.g:499:4: 'HIGH'
                    {
                    match(input,23,FOLLOW_2); 

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


    // $ANTLR start "rule__Program__Group__0"
    // InternalSpaml.g:507:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:511:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSpaml.g:512:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalSpaml.g:519:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:523:1: ( ( 'Program' ) )
            // InternalSpaml.g:524:1: ( 'Program' )
            {
            // InternalSpaml.g:524:1: ( 'Program' )
            // InternalSpaml.g:525:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSpaml.g:534:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:538:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSpaml.g:539:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalSpaml.g:546:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:550:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSpaml.g:551:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSpaml.g:551:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSpaml.g:552:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSpaml.g:553:2: ( rule__Program__NameAssignment_1 )
            // InternalSpaml.g:553:3: rule__Program__NameAssignment_1
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
    // InternalSpaml.g:561:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:565:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSpaml.g:566:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalSpaml.g:573:1: rule__Program__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:577:1: ( ( 'initialState' ) )
            // InternalSpaml.g:578:1: ( 'initialState' )
            {
            // InternalSpaml.g:578:1: ( 'initialState' )
            // InternalSpaml.g:579:2: 'initialState'
            {
             before(grammarAccess.getProgramAccess().getInitialStateKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSpaml.g:588:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:592:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSpaml.g:593:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalSpaml.g:600:1: rule__Program__Group__3__Impl : ( ( rule__Program__InitialStateAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:604:1: ( ( ( rule__Program__InitialStateAssignment_3 ) ) )
            // InternalSpaml.g:605:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            {
            // InternalSpaml.g:605:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            // InternalSpaml.g:606:2: ( rule__Program__InitialStateAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getInitialStateAssignment_3()); 
            // InternalSpaml.g:607:2: ( rule__Program__InitialStateAssignment_3 )
            // InternalSpaml.g:607:3: rule__Program__InitialStateAssignment_3
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
    // InternalSpaml.g:615:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:619:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalSpaml.g:620:2: rule__Program__Group__4__Impl rule__Program__Group__5
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
    // InternalSpaml.g:627:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:631:1: ( ( '{' ) )
            // InternalSpaml.g:632:1: ( '{' )
            {
            // InternalSpaml.g:632:1: ( '{' )
            // InternalSpaml.g:633:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSpaml.g:642:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:646:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalSpaml.g:647:2: rule__Program__Group__5__Impl rule__Program__Group__6
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
    // InternalSpaml.g:654:1: rule__Program__Group__5__Impl : ( ( rule__Program__Alternatives_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:658:1: ( ( ( rule__Program__Alternatives_5 ) ) )
            // InternalSpaml.g:659:1: ( ( rule__Program__Alternatives_5 ) )
            {
            // InternalSpaml.g:659:1: ( ( rule__Program__Alternatives_5 ) )
            // InternalSpaml.g:660:2: ( rule__Program__Alternatives_5 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_5()); 
            // InternalSpaml.g:661:2: ( rule__Program__Alternatives_5 )
            // InternalSpaml.g:661:3: rule__Program__Alternatives_5
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
    // InternalSpaml.g:669:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:673:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalSpaml.g:674:2: rule__Program__Group__6__Impl rule__Program__Group__7
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
    // InternalSpaml.g:681:1: rule__Program__Group__6__Impl : ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:685:1: ( ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) )
            // InternalSpaml.g:686:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            {
            // InternalSpaml.g:686:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            // InternalSpaml.g:687:2: ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* )
            {
            // InternalSpaml.g:687:2: ( ( rule__Program__PluggedElementsAssignment_6 ) )
            // InternalSpaml.g:688:3: ( rule__Program__PluggedElementsAssignment_6 )
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:689:3: ( rule__Program__PluggedElementsAssignment_6 )
            // InternalSpaml.g:689:4: rule__Program__PluggedElementsAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__Program__PluggedElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 

            }

            // InternalSpaml.g:692:2: ( ( rule__Program__PluggedElementsAssignment_6 )* )
            // InternalSpaml.g:693:3: ( rule__Program__PluggedElementsAssignment_6 )*
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:694:3: ( rule__Program__PluggedElementsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=30 && LA10_0<=31)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSpaml.g:694:4: rule__Program__PluggedElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__PluggedElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSpaml.g:703:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:707:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalSpaml.g:708:2: rule__Program__Group__7__Impl rule__Program__Group__8
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
    // InternalSpaml.g:715:1: rule__Program__Group__7__Impl : ( ( rule__Program__Alternatives_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:719:1: ( ( ( rule__Program__Alternatives_7 ) ) )
            // InternalSpaml.g:720:1: ( ( rule__Program__Alternatives_7 ) )
            {
            // InternalSpaml.g:720:1: ( ( rule__Program__Alternatives_7 ) )
            // InternalSpaml.g:721:2: ( rule__Program__Alternatives_7 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_7()); 
            // InternalSpaml.g:722:2: ( rule__Program__Alternatives_7 )
            // InternalSpaml.g:722:3: rule__Program__Alternatives_7
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
    // InternalSpaml.g:730:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:734:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalSpaml.g:735:2: rule__Program__Group__8__Impl rule__Program__Group__9
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
    // InternalSpaml.g:742:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:746:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // InternalSpaml.g:747:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // InternalSpaml.g:747:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // InternalSpaml.g:748:2: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // InternalSpaml.g:748:2: ( ( rule__Program__StatesAssignment_8 ) )
            // InternalSpaml.g:749:3: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:750:3: ( rule__Program__StatesAssignment_8 )
            // InternalSpaml.g:750:4: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__Program__StatesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // InternalSpaml.g:753:2: ( ( rule__Program__StatesAssignment_8 )* )
            // InternalSpaml.g:754:3: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:755:3: ( rule__Program__StatesAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpaml.g:755:4: rule__Program__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Program__StatesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSpaml.g:764:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:768:1: ( rule__Program__Group__9__Impl )
            // InternalSpaml.g:769:2: rule__Program__Group__9__Impl
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
    // InternalSpaml.g:775:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:779:1: ( ( '}' ) )
            // InternalSpaml.g:780:1: ( '}' )
            {
            // InternalSpaml.g:780:1: ( '}' )
            // InternalSpaml.g:781:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSpaml.g:791:1: rule__PluggedElement__Group__0 : rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 ;
    public final void rule__PluggedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:795:1: ( rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 )
            // InternalSpaml.g:796:2: rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1
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
    // InternalSpaml.g:803:1: rule__PluggedElement__Group__0__Impl : ( ( rule__PluggedElement__Alternatives_0 ) ) ;
    public final void rule__PluggedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:807:1: ( ( ( rule__PluggedElement__Alternatives_0 ) ) )
            // InternalSpaml.g:808:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            {
            // InternalSpaml.g:808:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            // InternalSpaml.g:809:2: ( rule__PluggedElement__Alternatives_0 )
            {
             before(grammarAccess.getPluggedElementAccess().getAlternatives_0()); 
            // InternalSpaml.g:810:2: ( rule__PluggedElement__Alternatives_0 )
            // InternalSpaml.g:810:3: rule__PluggedElement__Alternatives_0
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
    // InternalSpaml.g:818:1: rule__PluggedElement__Group__1 : rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 ;
    public final void rule__PluggedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:822:1: ( rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 )
            // InternalSpaml.g:823:2: rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2
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
    // InternalSpaml.g:830:1: rule__PluggedElement__Group__1__Impl : ( ( rule__PluggedElement__NameAssignment_1 ) ) ;
    public final void rule__PluggedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:834:1: ( ( ( rule__PluggedElement__NameAssignment_1 ) ) )
            // InternalSpaml.g:835:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            {
            // InternalSpaml.g:835:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            // InternalSpaml.g:836:2: ( rule__PluggedElement__NameAssignment_1 )
            {
             before(grammarAccess.getPluggedElementAccess().getNameAssignment_1()); 
            // InternalSpaml.g:837:2: ( rule__PluggedElement__NameAssignment_1 )
            // InternalSpaml.g:837:3: rule__PluggedElement__NameAssignment_1
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
    // InternalSpaml.g:845:1: rule__PluggedElement__Group__2 : rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 ;
    public final void rule__PluggedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:849:1: ( rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 )
            // InternalSpaml.g:850:2: rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3
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
    // InternalSpaml.g:857:1: rule__PluggedElement__Group__2__Impl : ( ( 'onPin' )? ) ;
    public final void rule__PluggedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:861:1: ( ( ( 'onPin' )? ) )
            // InternalSpaml.g:862:1: ( ( 'onPin' )? )
            {
            // InternalSpaml.g:862:1: ( ( 'onPin' )? )
            // InternalSpaml.g:863:2: ( 'onPin' )?
            {
             before(grammarAccess.getPluggedElementAccess().getOnPinKeyword_2()); 
            // InternalSpaml.g:864:2: ( 'onPin' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpaml.g:864:3: 'onPin'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalSpaml.g:872:1: rule__PluggedElement__Group__3 : rule__PluggedElement__Group__3__Impl ;
    public final void rule__PluggedElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:876:1: ( rule__PluggedElement__Group__3__Impl )
            // InternalSpaml.g:877:2: rule__PluggedElement__Group__3__Impl
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
    // InternalSpaml.g:883:1: rule__PluggedElement__Group__3__Impl : ( ( rule__PluggedElement__PinAssignment_3 ) ) ;
    public final void rule__PluggedElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:887:1: ( ( ( rule__PluggedElement__PinAssignment_3 ) ) )
            // InternalSpaml.g:888:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            {
            // InternalSpaml.g:888:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            // InternalSpaml.g:889:2: ( rule__PluggedElement__PinAssignment_3 )
            {
             before(grammarAccess.getPluggedElementAccess().getPinAssignment_3()); 
            // InternalSpaml.g:890:2: ( rule__PluggedElement__PinAssignment_3 )
            // InternalSpaml.g:890:3: rule__PluggedElement__PinAssignment_3
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
    // InternalSpaml.g:899:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:903:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSpaml.g:904:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalSpaml.g:911:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:915:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalSpaml.g:916:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalSpaml.g:916:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalSpaml.g:917:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalSpaml.g:918:2: ( rule__State__NameAssignment_0 )
            // InternalSpaml.g:918:3: rule__State__NameAssignment_0
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
    // InternalSpaml.g:926:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:930:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSpaml.g:931:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalSpaml.g:938:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:942:1: ( ( '{' ) )
            // InternalSpaml.g:943:1: ( '{' )
            {
            // InternalSpaml.g:943:1: ( '{' )
            // InternalSpaml.g:944:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSpaml.g:953:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:957:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSpaml.g:958:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalSpaml.g:965:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:969:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalSpaml.g:970:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalSpaml.g:970:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalSpaml.g:971:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalSpaml.g:972:2: ( rule__State__ActionsAssignment_2 )
            // InternalSpaml.g:972:3: rule__State__ActionsAssignment_2
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
    // InternalSpaml.g:980:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:984:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSpaml.g:985:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalSpaml.g:992:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:996:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalSpaml.g:997:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalSpaml.g:997:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalSpaml.g:998:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalSpaml.g:999:2: ( rule__State__ActionsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==15) ) {
                        int LA13_4 = input.LA(3);

                        if ( (LA13_4==22) ) {
                            int LA13_5 = input.LA(4);

                            if ( ((LA13_5>=RULE_STRING && LA13_5<=RULE_ID)||LA13_5==32) ) {
                                alt13=1;
                            }


                        }
                        else if ( (LA13_4==23) ) {
                            int LA13_6 = input.LA(4);

                            if ( ((LA13_6>=RULE_STRING && LA13_6<=RULE_ID)||LA13_6==32) ) {
                                alt13=1;
                            }


                        }


                    }
                    else if ( (LA13_2==16) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpaml.g:999:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSpaml.g:1007:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1011:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalSpaml.g:1012:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalSpaml.g:1019:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1023:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalSpaml.g:1024:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalSpaml.g:1024:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalSpaml.g:1025:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalSpaml.g:1026:2: ( rule__State__TransitionAssignment_4 )
            // InternalSpaml.g:1026:3: rule__State__TransitionAssignment_4
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
    // InternalSpaml.g:1034:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1038:1: ( rule__State__Group__5__Impl )
            // InternalSpaml.g:1039:2: rule__State__Group__5__Impl
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
    // InternalSpaml.g:1045:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1049:1: ( ( '}' ) )
            // InternalSpaml.g:1050:1: ( '}' )
            {
            // InternalSpaml.g:1050:1: ( '}' )
            // InternalSpaml.g:1051:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSpaml.g:1061:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1065:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSpaml.g:1066:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSpaml.g:1073:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1077:1: ( ( ( '-' )? ) )
            // InternalSpaml.g:1078:1: ( ( '-' )? )
            {
            // InternalSpaml.g:1078:1: ( ( '-' )? )
            // InternalSpaml.g:1079:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSpaml.g:1080:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpaml.g:1080:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalSpaml.g:1088:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1092:1: ( rule__EInt__Group__1__Impl )
            // InternalSpaml.g:1093:2: rule__EInt__Group__1__Impl
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
    // InternalSpaml.g:1099:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1103:1: ( ( RULE_INT ) )
            // InternalSpaml.g:1104:1: ( RULE_INT )
            {
            // InternalSpaml.g:1104:1: ( RULE_INT )
            // InternalSpaml.g:1105:2: RULE_INT
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
    // InternalSpaml.g:1115:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1119:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSpaml.g:1120:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
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
    // InternalSpaml.g:1127:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1131:1: ( ( () ) )
            // InternalSpaml.g:1132:1: ( () )
            {
            // InternalSpaml.g:1132:1: ( () )
            // InternalSpaml.g:1133:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSpaml.g:1134:2: ()
            // InternalSpaml.g:1134:3: 
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
    // InternalSpaml.g:1142:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1146:1: ( rule__Sensor__Group__1__Impl )
            // InternalSpaml.g:1147:2: rule__Sensor__Group__1__Impl
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
    // InternalSpaml.g:1153:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1157:1: ( ( 'Sensor' ) )
            // InternalSpaml.g:1158:1: ( 'Sensor' )
            {
            // InternalSpaml.g:1158:1: ( 'Sensor' )
            // InternalSpaml.g:1159:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSpaml.g:1169:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1173:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalSpaml.g:1174:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
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
    // InternalSpaml.g:1181:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1185:1: ( ( () ) )
            // InternalSpaml.g:1186:1: ( () )
            {
            // InternalSpaml.g:1186:1: ( () )
            // InternalSpaml.g:1187:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalSpaml.g:1188:2: ()
            // InternalSpaml.g:1188:3: 
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
    // InternalSpaml.g:1196:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1200:1: ( rule__Actuator__Group__1__Impl )
            // InternalSpaml.g:1201:2: rule__Actuator__Group__1__Impl
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
    // InternalSpaml.g:1207:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1211:1: ( ( 'Actuator' ) )
            // InternalSpaml.g:1212:1: ( 'Actuator' )
            {
            // InternalSpaml.g:1212:1: ( 'Actuator' )
            // InternalSpaml.g:1213:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSpaml.g:1223:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1227:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSpaml.g:1228:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalSpaml.g:1235:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1239:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalSpaml.g:1240:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalSpaml.g:1240:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalSpaml.g:1241:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalSpaml.g:1242:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalSpaml.g:1242:3: rule__Action__ActuatorAssignment_0
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
    // InternalSpaml.g:1250:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1254:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSpaml.g:1255:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // InternalSpaml.g:1262:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1266:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalSpaml.g:1267:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalSpaml.g:1267:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalSpaml.g:1268:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1269:2: ( rule__Action__Alternatives_1 )
            // InternalSpaml.g:1269:3: rule__Action__Alternatives_1
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
    // InternalSpaml.g:1277:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1281:1: ( rule__Action__Group__2__Impl )
            // InternalSpaml.g:1282:2: rule__Action__Group__2__Impl
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
    // InternalSpaml.g:1288:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1292:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1293:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1293:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalSpaml.g:1294:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1295:2: ( rule__Action__ValueAssignment_2 )
            // InternalSpaml.g:1295:3: rule__Action__ValueAssignment_2
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
    // InternalSpaml.g:1304:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1308:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSpaml.g:1309:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalSpaml.g:1316:1: rule__Transition__Group__0__Impl : ( ( 'when' )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1320:1: ( ( ( 'when' )? ) )
            // InternalSpaml.g:1321:1: ( ( 'when' )? )
            {
            // InternalSpaml.g:1321:1: ( ( 'when' )? )
            // InternalSpaml.g:1322:2: ( 'when' )?
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0()); 
            // InternalSpaml.g:1323:2: ( 'when' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpaml.g:1323:3: 'when'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalSpaml.g:1331:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1335:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSpaml.g:1336:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalSpaml.g:1343:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__HandlersAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1347:1: ( ( ( rule__Transition__HandlersAssignment_1 ) ) )
            // InternalSpaml.g:1348:1: ( ( rule__Transition__HandlersAssignment_1 ) )
            {
            // InternalSpaml.g:1348:1: ( ( rule__Transition__HandlersAssignment_1 ) )
            // InternalSpaml.g:1349:2: ( rule__Transition__HandlersAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_1()); 
            // InternalSpaml.g:1350:2: ( rule__Transition__HandlersAssignment_1 )
            // InternalSpaml.g:1350:3: rule__Transition__HandlersAssignment_1
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
    // InternalSpaml.g:1358:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1362:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalSpaml.g:1363:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalSpaml.g:1370:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )* ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1374:1: ( ( ( rule__Transition__Group_2__0 )* ) )
            // InternalSpaml.g:1375:1: ( ( rule__Transition__Group_2__0 )* )
            {
            // InternalSpaml.g:1375:1: ( ( rule__Transition__Group_2__0 )* )
            // InternalSpaml.g:1376:2: ( rule__Transition__Group_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalSpaml.g:1377:2: ( rule__Transition__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=17 && LA16_0<=18)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSpaml.g:1377:3: rule__Transition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Transition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSpaml.g:1385:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1389:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalSpaml.g:1390:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
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
    // InternalSpaml.g:1397:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Alternatives_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1401:1: ( ( ( rule__Transition__Alternatives_3 ) ) )
            // InternalSpaml.g:1402:1: ( ( rule__Transition__Alternatives_3 ) )
            {
            // InternalSpaml.g:1402:1: ( ( rule__Transition__Alternatives_3 ) )
            // InternalSpaml.g:1403:2: ( rule__Transition__Alternatives_3 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_3()); 
            // InternalSpaml.g:1404:2: ( rule__Transition__Alternatives_3 )
            // InternalSpaml.g:1404:3: rule__Transition__Alternatives_3
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
    // InternalSpaml.g:1412:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1416:1: ( rule__Transition__Group__4__Impl )
            // InternalSpaml.g:1417:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSpaml.g:1423:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__NextAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1427:1: ( ( ( rule__Transition__NextAssignment_4 ) ) )
            // InternalSpaml.g:1428:1: ( ( rule__Transition__NextAssignment_4 ) )
            {
            // InternalSpaml.g:1428:1: ( ( rule__Transition__NextAssignment_4 ) )
            // InternalSpaml.g:1429:2: ( rule__Transition__NextAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_4()); 
            // InternalSpaml.g:1430:2: ( rule__Transition__NextAssignment_4 )
            // InternalSpaml.g:1430:3: rule__Transition__NextAssignment_4
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


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalSpaml.g:1439:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1443:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalSpaml.g:1444:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
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
    // InternalSpaml.g:1451:1: rule__Transition__Group_2__0__Impl : ( ( rule__Transition__Alternatives_2_0 ) ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1455:1: ( ( ( rule__Transition__Alternatives_2_0 ) ) )
            // InternalSpaml.g:1456:1: ( ( rule__Transition__Alternatives_2_0 ) )
            {
            // InternalSpaml.g:1456:1: ( ( rule__Transition__Alternatives_2_0 ) )
            // InternalSpaml.g:1457:2: ( rule__Transition__Alternatives_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_2_0()); 
            // InternalSpaml.g:1458:2: ( rule__Transition__Alternatives_2_0 )
            // InternalSpaml.g:1458:3: rule__Transition__Alternatives_2_0
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
    // InternalSpaml.g:1466:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1470:1: ( rule__Transition__Group_2__1__Impl )
            // InternalSpaml.g:1471:2: rule__Transition__Group_2__1__Impl
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
    // InternalSpaml.g:1477:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__HandlersAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1481:1: ( ( ( rule__Transition__HandlersAssignment_2_1 ) ) )
            // InternalSpaml.g:1482:1: ( ( rule__Transition__HandlersAssignment_2_1 ) )
            {
            // InternalSpaml.g:1482:1: ( ( rule__Transition__HandlersAssignment_2_1 ) )
            // InternalSpaml.g:1483:2: ( rule__Transition__HandlersAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_2_1()); 
            // InternalSpaml.g:1484:2: ( rule__Transition__HandlersAssignment_2_1 )
            // InternalSpaml.g:1484:3: rule__Transition__HandlersAssignment_2_1
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


    // $ANTLR start "rule__TransitionHandler__Group__0"
    // InternalSpaml.g:1493:1: rule__TransitionHandler__Group__0 : rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 ;
    public final void rule__TransitionHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1497:1: ( rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 )
            // InternalSpaml.g:1498:2: rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpaml.g:1505:1: rule__TransitionHandler__Group__0__Impl : ( ( rule__TransitionHandler__SensorAssignment_0 ) ) ;
    public final void rule__TransitionHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1509:1: ( ( ( rule__TransitionHandler__SensorAssignment_0 ) ) )
            // InternalSpaml.g:1510:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            {
            // InternalSpaml.g:1510:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            // InternalSpaml.g:1511:2: ( rule__TransitionHandler__SensorAssignment_0 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorAssignment_0()); 
            // InternalSpaml.g:1512:2: ( rule__TransitionHandler__SensorAssignment_0 )
            // InternalSpaml.g:1512:3: rule__TransitionHandler__SensorAssignment_0
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
    // InternalSpaml.g:1520:1: rule__TransitionHandler__Group__1 : rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 ;
    public final void rule__TransitionHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1524:1: ( rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 )
            // InternalSpaml.g:1525:2: rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2
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
    // InternalSpaml.g:1532:1: rule__TransitionHandler__Group__1__Impl : ( ( rule__TransitionHandler__Alternatives_1 ) ) ;
    public final void rule__TransitionHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1536:1: ( ( ( rule__TransitionHandler__Alternatives_1 ) ) )
            // InternalSpaml.g:1537:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            {
            // InternalSpaml.g:1537:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            // InternalSpaml.g:1538:2: ( rule__TransitionHandler__Alternatives_1 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getAlternatives_1()); 
            // InternalSpaml.g:1539:2: ( rule__TransitionHandler__Alternatives_1 )
            // InternalSpaml.g:1539:3: rule__TransitionHandler__Alternatives_1
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
    // InternalSpaml.g:1547:1: rule__TransitionHandler__Group__2 : rule__TransitionHandler__Group__2__Impl ;
    public final void rule__TransitionHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1551:1: ( rule__TransitionHandler__Group__2__Impl )
            // InternalSpaml.g:1552:2: rule__TransitionHandler__Group__2__Impl
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
    // InternalSpaml.g:1558:1: rule__TransitionHandler__Group__2__Impl : ( ( rule__TransitionHandler__ValueAssignment_2 ) ) ;
    public final void rule__TransitionHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1562:1: ( ( ( rule__TransitionHandler__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1563:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1563:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            // InternalSpaml.g:1564:2: ( rule__TransitionHandler__ValueAssignment_2 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1565:2: ( rule__TransitionHandler__ValueAssignment_2 )
            // InternalSpaml.g:1565:3: rule__TransitionHandler__ValueAssignment_2
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
    // InternalSpaml.g:1574:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1578:1: ( ( ruleEString ) )
            // InternalSpaml.g:1579:2: ( ruleEString )
            {
            // InternalSpaml.g:1579:2: ( ruleEString )
            // InternalSpaml.g:1580:3: ruleEString
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
    // InternalSpaml.g:1589:1: rule__Program__InitialStateAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Program__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1593:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1594:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1594:2: ( ( ruleEString ) )
            // InternalSpaml.g:1595:3: ( ruleEString )
            {
             before(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0()); 
            // InternalSpaml.g:1596:3: ( ruleEString )
            // InternalSpaml.g:1597:4: ruleEString
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
    // InternalSpaml.g:1608:1: rule__Program__PluggedElementsAssignment_6 : ( rulePluggedElement ) ;
    public final void rule__Program__PluggedElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1612:1: ( ( rulePluggedElement ) )
            // InternalSpaml.g:1613:2: ( rulePluggedElement )
            {
            // InternalSpaml.g:1613:2: ( rulePluggedElement )
            // InternalSpaml.g:1614:3: rulePluggedElement
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
    // InternalSpaml.g:1623:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1627:1: ( ( ruleState ) )
            // InternalSpaml.g:1628:2: ( ruleState )
            {
            // InternalSpaml.g:1628:2: ( ruleState )
            // InternalSpaml.g:1629:3: ruleState
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
    // InternalSpaml.g:1638:1: rule__PluggedElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PluggedElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1642:1: ( ( ruleEString ) )
            // InternalSpaml.g:1643:2: ( ruleEString )
            {
            // InternalSpaml.g:1643:2: ( ruleEString )
            // InternalSpaml.g:1644:3: ruleEString
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
    // InternalSpaml.g:1653:1: rule__PluggedElement__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__PluggedElement__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1657:1: ( ( ruleEInt ) )
            // InternalSpaml.g:1658:2: ( ruleEInt )
            {
            // InternalSpaml.g:1658:2: ( ruleEInt )
            // InternalSpaml.g:1659:3: ruleEInt
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
    // InternalSpaml.g:1668:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1672:1: ( ( ruleEString ) )
            // InternalSpaml.g:1673:2: ( ruleEString )
            {
            // InternalSpaml.g:1673:2: ( ruleEString )
            // InternalSpaml.g:1674:3: ruleEString
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
    // InternalSpaml.g:1683:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1687:1: ( ( ruleAction ) )
            // InternalSpaml.g:1688:2: ( ruleAction )
            {
            // InternalSpaml.g:1688:2: ( ruleAction )
            // InternalSpaml.g:1689:3: ruleAction
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
    // InternalSpaml.g:1698:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1702:1: ( ( ruleAction ) )
            // InternalSpaml.g:1703:2: ( ruleAction )
            {
            // InternalSpaml.g:1703:2: ( ruleAction )
            // InternalSpaml.g:1704:3: ruleAction
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
    // InternalSpaml.g:1713:1: rule__State__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1717:1: ( ( ruleTransition ) )
            // InternalSpaml.g:1718:2: ( ruleTransition )
            {
            // InternalSpaml.g:1718:2: ( ruleTransition )
            // InternalSpaml.g:1719:3: ruleTransition
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
    // InternalSpaml.g:1728:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1732:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1733:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1733:2: ( ( ruleEString ) )
            // InternalSpaml.g:1734:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalSpaml.g:1735:3: ( ruleEString )
            // InternalSpaml.g:1736:4: ruleEString
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
    // InternalSpaml.g:1747:1: rule__Action__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1751:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:1752:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:1752:2: ( ruleSIGNAL )
            // InternalSpaml.g:1753:3: ruleSIGNAL
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
    // InternalSpaml.g:1762:1: rule__Transition__HandlersAssignment_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1766:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:1767:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:1767:2: ( ruleTransitionHandler )
            // InternalSpaml.g:1768:3: ruleTransitionHandler
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
    // InternalSpaml.g:1777:1: rule__Transition__HandlersAssignment_2_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1781:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:1782:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:1782:2: ( ruleTransitionHandler )
            // InternalSpaml.g:1783:3: ruleTransitionHandler
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
    // InternalSpaml.g:1792:1: rule__Transition__NextAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1796:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1797:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1797:2: ( ( ruleEString ) )
            // InternalSpaml.g:1798:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_4_0()); 
            // InternalSpaml.g:1799:3: ( ruleEString )
            // InternalSpaml.g:1800:4: ruleEString
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


    // $ANTLR start "rule__TransitionHandler__SensorAssignment_0"
    // InternalSpaml.g:1811:1: rule__TransitionHandler__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionHandler__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1815:1: ( ( ( RULE_ID ) ) )
            // InternalSpaml.g:1816:2: ( ( RULE_ID ) )
            {
            // InternalSpaml.g:1816:2: ( ( RULE_ID ) )
            // InternalSpaml.g:1817:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorSensorCrossReference_0_0()); 
            // InternalSpaml.g:1818:3: ( RULE_ID )
            // InternalSpaml.g:1819:4: RULE_ID
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
    // InternalSpaml.g:1830:1: rule__TransitionHandler__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__TransitionHandler__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1834:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:1835:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:1835:2: ( ruleSIGNAL )
            // InternalSpaml.g:1836:3: ruleSIGNAL
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000208000L});

}