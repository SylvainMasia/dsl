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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pluggedElements'", "'pluggedElements:'", "'states'", "'states:'", "'='", "'setTo'", "'->'", "'then'", "'is'", "'LOW'", "'HIGH'", "'AND'", "'OR'", "'Program'", "'initialState'", "'{'", "'}'", "'onPin'", "'-'", "'SensorDigital'", "'SensorAnalog'", "'Actuator'", "'when'", "','", "'('", "')'"
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
    // InternalSpaml.g:187:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:191:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalSpaml.g:192:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalSpaml.g:192:2: ( ( rule__Sensor__Alternatives ) )
            // InternalSpaml.g:193:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalSpaml.g:194:3: ( rule__Sensor__Alternatives )
            // InternalSpaml.g:194:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSensorDigital"
    // InternalSpaml.g:203:1: entryRuleSensorDigital : ruleSensorDigital EOF ;
    public final void entryRuleSensorDigital() throws RecognitionException {
        try {
            // InternalSpaml.g:204:1: ( ruleSensorDigital EOF )
            // InternalSpaml.g:205:1: ruleSensorDigital EOF
            {
             before(grammarAccess.getSensorDigitalRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorDigital();

            state._fsp--;

             after(grammarAccess.getSensorDigitalRule()); 
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
    // $ANTLR end "entryRuleSensorDigital"


    // $ANTLR start "ruleSensorDigital"
    // InternalSpaml.g:212:1: ruleSensorDigital : ( ( rule__SensorDigital__Group__0 ) ) ;
    public final void ruleSensorDigital() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:216:2: ( ( ( rule__SensorDigital__Group__0 ) ) )
            // InternalSpaml.g:217:2: ( ( rule__SensorDigital__Group__0 ) )
            {
            // InternalSpaml.g:217:2: ( ( rule__SensorDigital__Group__0 ) )
            // InternalSpaml.g:218:3: ( rule__SensorDigital__Group__0 )
            {
             before(grammarAccess.getSensorDigitalAccess().getGroup()); 
            // InternalSpaml.g:219:3: ( rule__SensorDigital__Group__0 )
            // InternalSpaml.g:219:4: rule__SensorDigital__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorDigital__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorDigitalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorDigital"


    // $ANTLR start "entryRuleSensorAnalog"
    // InternalSpaml.g:228:1: entryRuleSensorAnalog : ruleSensorAnalog EOF ;
    public final void entryRuleSensorAnalog() throws RecognitionException {
        try {
            // InternalSpaml.g:229:1: ( ruleSensorAnalog EOF )
            // InternalSpaml.g:230:1: ruleSensorAnalog EOF
            {
             before(grammarAccess.getSensorAnalogRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorAnalog();

            state._fsp--;

             after(grammarAccess.getSensorAnalogRule()); 
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
    // $ANTLR end "entryRuleSensorAnalog"


    // $ANTLR start "ruleSensorAnalog"
    // InternalSpaml.g:237:1: ruleSensorAnalog : ( ( rule__SensorAnalog__Group__0 ) ) ;
    public final void ruleSensorAnalog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:241:2: ( ( ( rule__SensorAnalog__Group__0 ) ) )
            // InternalSpaml.g:242:2: ( ( rule__SensorAnalog__Group__0 ) )
            {
            // InternalSpaml.g:242:2: ( ( rule__SensorAnalog__Group__0 ) )
            // InternalSpaml.g:243:3: ( rule__SensorAnalog__Group__0 )
            {
             before(grammarAccess.getSensorAnalogAccess().getGroup()); 
            // InternalSpaml.g:244:3: ( rule__SensorAnalog__Group__0 )
            // InternalSpaml.g:244:4: rule__SensorAnalog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorAnalog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAnalogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorAnalog"


    // $ANTLR start "entryRuleActuator"
    // InternalSpaml.g:253:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalSpaml.g:254:1: ( ruleActuator EOF )
            // InternalSpaml.g:255:1: ruleActuator EOF
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
    // InternalSpaml.g:262:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:266:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalSpaml.g:267:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalSpaml.g:267:2: ( ( rule__Actuator__Group__0 ) )
            // InternalSpaml.g:268:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalSpaml.g:269:3: ( rule__Actuator__Group__0 )
            // InternalSpaml.g:269:4: rule__Actuator__Group__0
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
    // InternalSpaml.g:278:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalSpaml.g:279:1: ( ruleAction EOF )
            // InternalSpaml.g:280:1: ruleAction EOF
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
    // InternalSpaml.g:287:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:291:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalSpaml.g:292:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalSpaml.g:292:2: ( ( rule__Action__Group__0 ) )
            // InternalSpaml.g:293:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalSpaml.g:294:3: ( rule__Action__Group__0 )
            // InternalSpaml.g:294:4: rule__Action__Group__0
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
    // InternalSpaml.g:303:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalSpaml.g:304:1: ( ruleTransition EOF )
            // InternalSpaml.g:305:1: ruleTransition EOF
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
    // InternalSpaml.g:312:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:316:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalSpaml.g:317:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalSpaml.g:317:2: ( ( rule__Transition__Group__0 ) )
            // InternalSpaml.g:318:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalSpaml.g:319:3: ( rule__Transition__Group__0 )
            // InternalSpaml.g:319:4: rule__Transition__Group__0
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


    // $ANTLR start "entryRuleCondition"
    // InternalSpaml.g:328:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalSpaml.g:329:1: ( ruleCondition EOF )
            // InternalSpaml.g:330:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSpaml.g:337:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:341:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalSpaml.g:342:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalSpaml.g:342:2: ( ( rule__Condition__Alternatives ) )
            // InternalSpaml.g:343:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalSpaml.g:344:3: ( rule__Condition__Alternatives )
            // InternalSpaml.g:344:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTemporalCondition"
    // InternalSpaml.g:353:1: entryRuleTemporalCondition : ruleTemporalCondition EOF ;
    public final void entryRuleTemporalCondition() throws RecognitionException {
        try {
            // InternalSpaml.g:354:1: ( ruleTemporalCondition EOF )
            // InternalSpaml.g:355:1: ruleTemporalCondition EOF
            {
             before(grammarAccess.getTemporalConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleTemporalCondition();

            state._fsp--;

             after(grammarAccess.getTemporalConditionRule()); 
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
    // $ANTLR end "entryRuleTemporalCondition"


    // $ANTLR start "ruleTemporalCondition"
    // InternalSpaml.g:362:1: ruleTemporalCondition : ( ( rule__TemporalCondition__DelayAssignment ) ) ;
    public final void ruleTemporalCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:366:2: ( ( ( rule__TemporalCondition__DelayAssignment ) ) )
            // InternalSpaml.g:367:2: ( ( rule__TemporalCondition__DelayAssignment ) )
            {
            // InternalSpaml.g:367:2: ( ( rule__TemporalCondition__DelayAssignment ) )
            // InternalSpaml.g:368:3: ( rule__TemporalCondition__DelayAssignment )
            {
             before(grammarAccess.getTemporalConditionAccess().getDelayAssignment()); 
            // InternalSpaml.g:369:3: ( rule__TemporalCondition__DelayAssignment )
            // InternalSpaml.g:369:4: rule__TemporalCondition__DelayAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TemporalCondition__DelayAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTemporalConditionAccess().getDelayAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporalCondition"


    // $ANTLR start "entryRuleLogicalCondition"
    // InternalSpaml.g:378:1: entryRuleLogicalCondition : ruleLogicalCondition EOF ;
    public final void entryRuleLogicalCondition() throws RecognitionException {
        try {
            // InternalSpaml.g:379:1: ( ruleLogicalCondition EOF )
            // InternalSpaml.g:380:1: ruleLogicalCondition EOF
            {
             before(grammarAccess.getLogicalConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalCondition();

            state._fsp--;

             after(grammarAccess.getLogicalConditionRule()); 
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
    // $ANTLR end "entryRuleLogicalCondition"


    // $ANTLR start "ruleLogicalCondition"
    // InternalSpaml.g:387:1: ruleLogicalCondition : ( ( rule__LogicalCondition__Group__0 ) ) ;
    public final void ruleLogicalCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:391:2: ( ( ( rule__LogicalCondition__Group__0 ) ) )
            // InternalSpaml.g:392:2: ( ( rule__LogicalCondition__Group__0 ) )
            {
            // InternalSpaml.g:392:2: ( ( rule__LogicalCondition__Group__0 ) )
            // InternalSpaml.g:393:3: ( rule__LogicalCondition__Group__0 )
            {
             before(grammarAccess.getLogicalConditionAccess().getGroup()); 
            // InternalSpaml.g:394:3: ( rule__LogicalCondition__Group__0 )
            // InternalSpaml.g:394:4: rule__LogicalCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalCondition"


    // $ANTLR start "ruleSIGNAL"
    // InternalSpaml.g:403:1: ruleSIGNAL : ( ( rule__SIGNAL__Alternatives ) ) ;
    public final void ruleSIGNAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:407:1: ( ( ( rule__SIGNAL__Alternatives ) ) )
            // InternalSpaml.g:408:2: ( ( rule__SIGNAL__Alternatives ) )
            {
            // InternalSpaml.g:408:2: ( ( rule__SIGNAL__Alternatives ) )
            // InternalSpaml.g:409:3: ( rule__SIGNAL__Alternatives )
            {
             before(grammarAccess.getSIGNALAccess().getAlternatives()); 
            // InternalSpaml.g:410:3: ( rule__SIGNAL__Alternatives )
            // InternalSpaml.g:410:4: rule__SIGNAL__Alternatives
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
    // InternalSpaml.g:419:1: ruleOPERATION : ( ( rule__OPERATION__Alternatives ) ) ;
    public final void ruleOPERATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:423:1: ( ( ( rule__OPERATION__Alternatives ) ) )
            // InternalSpaml.g:424:2: ( ( rule__OPERATION__Alternatives ) )
            {
            // InternalSpaml.g:424:2: ( ( rule__OPERATION__Alternatives ) )
            // InternalSpaml.g:425:3: ( rule__OPERATION__Alternatives )
            {
             before(grammarAccess.getOPERATIONAccess().getAlternatives()); 
            // InternalSpaml.g:426:3: ( rule__OPERATION__Alternatives )
            // InternalSpaml.g:426:4: rule__OPERATION__Alternatives
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
    // InternalSpaml.g:434:1: rule__Program__Alternatives_5 : ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) );
    public final void rule__Program__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:438:1: ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) )
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
                    // InternalSpaml.g:439:2: ( 'pluggedElements' )
                    {
                    // InternalSpaml.g:439:2: ( 'pluggedElements' )
                    // InternalSpaml.g:440:3: 'pluggedElements'
                    {
                     before(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:445:2: ( 'pluggedElements:' )
                    {
                    // InternalSpaml.g:445:2: ( 'pluggedElements:' )
                    // InternalSpaml.g:446:3: 'pluggedElements:'
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
    // InternalSpaml.g:455:1: rule__Program__Alternatives_7 : ( ( 'states' ) | ( 'states:' ) );
    public final void rule__Program__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:459:1: ( ( 'states' ) | ( 'states:' ) )
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
                    // InternalSpaml.g:460:2: ( 'states' )
                    {
                    // InternalSpaml.g:460:2: ( 'states' )
                    // InternalSpaml.g:461:3: 'states'
                    {
                     before(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:466:2: ( 'states:' )
                    {
                    // InternalSpaml.g:466:2: ( 'states:' )
                    // InternalSpaml.g:467:3: 'states:'
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
    // InternalSpaml.g:476:1: rule__PluggedElement__Alternatives_0 : ( ( ruleActuator ) | ( ruleSensor ) );
    public final void rule__PluggedElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:480:1: ( ( ruleActuator ) | ( ruleSensor ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=30 && LA3_0<=31)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpaml.g:481:2: ( ruleActuator )
                    {
                    // InternalSpaml.g:481:2: ( ruleActuator )
                    // InternalSpaml.g:482:3: ruleActuator
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
                    // InternalSpaml.g:487:2: ( ruleSensor )
                    {
                    // InternalSpaml.g:487:2: ( ruleSensor )
                    // InternalSpaml.g:488:3: ruleSensor
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
    // InternalSpaml.g:497:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:501:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSpaml.g:502:2: ( RULE_STRING )
                    {
                    // InternalSpaml.g:502:2: ( RULE_STRING )
                    // InternalSpaml.g:503:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:508:2: ( RULE_ID )
                    {
                    // InternalSpaml.g:508:2: ( RULE_ID )
                    // InternalSpaml.g:509:3: RULE_ID
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


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalSpaml.g:518:1: rule__Sensor__Alternatives : ( ( ruleSensorDigital ) | ( ruleSensorAnalog ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:522:1: ( ( ruleSensorDigital ) | ( ruleSensorAnalog ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpaml.g:523:2: ( ruleSensorDigital )
                    {
                    // InternalSpaml.g:523:2: ( ruleSensorDigital )
                    // InternalSpaml.g:524:3: ruleSensorDigital
                    {
                     before(grammarAccess.getSensorAccess().getSensorDigitalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorDigital();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getSensorDigitalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:529:2: ( ruleSensorAnalog )
                    {
                    // InternalSpaml.g:529:2: ( ruleSensorAnalog )
                    // InternalSpaml.g:530:3: ruleSensorAnalog
                    {
                     before(grammarAccess.getSensorAccess().getSensorAnalogParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorAnalog();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getSensorAnalogParserRuleCall_1()); 

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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Action__Alternatives_1"
    // InternalSpaml.g:539:1: rule__Action__Alternatives_1 : ( ( '=' ) | ( 'setTo' ) );
    public final void rule__Action__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:543:1: ( ( '=' ) | ( 'setTo' ) )
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
                    // InternalSpaml.g:544:2: ( '=' )
                    {
                    // InternalSpaml.g:544:2: ( '=' )
                    // InternalSpaml.g:545:3: '='
                    {
                     before(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:550:2: ( 'setTo' )
                    {
                    // InternalSpaml.g:550:2: ( 'setTo' )
                    // InternalSpaml.g:551:3: 'setTo'
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
    // InternalSpaml.g:560:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__Group_0_1__0 ) ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:564:1: ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==29||LA7_0==33) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=22 && LA7_0<=23)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpaml.g:565:2: ( ( rule__Transition__Group_0_0__0 ) )
                    {
                    // InternalSpaml.g:565:2: ( ( rule__Transition__Group_0_0__0 ) )
                    // InternalSpaml.g:566:3: ( rule__Transition__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0()); 
                    // InternalSpaml.g:567:3: ( rule__Transition__Group_0_0__0 )
                    // InternalSpaml.g:567:4: rule__Transition__Group_0_0__0
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
                    // InternalSpaml.g:571:2: ( ( rule__Transition__Group_0_1__0 ) )
                    {
                    // InternalSpaml.g:571:2: ( ( rule__Transition__Group_0_1__0 ) )
                    // InternalSpaml.g:572:3: ( rule__Transition__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_1()); 
                    // InternalSpaml.g:573:3: ( rule__Transition__Group_0_1__0 )
                    // InternalSpaml.g:573:4: rule__Transition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_1()); 

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


    // $ANTLR start "rule__Transition__Alternatives_1"
    // InternalSpaml.g:581:1: rule__Transition__Alternatives_1 : ( ( '->' ) | ( 'then' ) );
    public final void rule__Transition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:585:1: ( ( '->' ) | ( 'then' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpaml.g:586:2: ( '->' )
                    {
                    // InternalSpaml.g:586:2: ( '->' )
                    // InternalSpaml.g:587:3: '->'
                    {
                     before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:592:2: ( 'then' )
                    {
                    // InternalSpaml.g:592:2: ( 'then' )
                    // InternalSpaml.g:593:3: 'then'
                    {
                     before(grammarAccess.getTransitionAccess().getThenKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalSpaml.g:602:1: rule__Condition__Alternatives : ( ( ruleTemporalCondition ) | ( ruleLogicalCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:606:1: ( ( ruleTemporalCondition ) | ( ruleLogicalCondition ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpaml.g:607:2: ( ruleTemporalCondition )
                    {
                    // InternalSpaml.g:607:2: ( ruleTemporalCondition )
                    // InternalSpaml.g:608:3: ruleTemporalCondition
                    {
                     before(grammarAccess.getConditionAccess().getTemporalConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTemporalCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getTemporalConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:613:2: ( ruleLogicalCondition )
                    {
                    // InternalSpaml.g:613:2: ( ruleLogicalCondition )
                    // InternalSpaml.g:614:3: ruleLogicalCondition
                    {
                     before(grammarAccess.getConditionAccess().getLogicalConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLogicalCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getLogicalConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__LogicalCondition__Alternatives_1"
    // InternalSpaml.g:623:1: rule__LogicalCondition__Alternatives_1 : ( ( '=' ) | ( 'is' ) );
    public final void rule__LogicalCondition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:627:1: ( ( '=' ) | ( 'is' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpaml.g:628:2: ( '=' )
                    {
                    // InternalSpaml.g:628:2: ( '=' )
                    // InternalSpaml.g:629:3: '='
                    {
                     before(grammarAccess.getLogicalConditionAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicalConditionAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:634:2: ( 'is' )
                    {
                    // InternalSpaml.g:634:2: ( 'is' )
                    // InternalSpaml.g:635:3: 'is'
                    {
                     before(grammarAccess.getLogicalConditionAccess().getIsKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLogicalConditionAccess().getIsKeyword_1_1()); 

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
    // $ANTLR end "rule__LogicalCondition__Alternatives_1"


    // $ANTLR start "rule__SIGNAL__Alternatives"
    // InternalSpaml.g:644:1: rule__SIGNAL__Alternatives : ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) );
    public final void rule__SIGNAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:648:1: ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpaml.g:649:2: ( ( 'LOW' ) )
                    {
                    // InternalSpaml.g:649:2: ( ( 'LOW' ) )
                    // InternalSpaml.g:650:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:651:3: ( 'LOW' )
                    // InternalSpaml.g:651:4: 'LOW'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:655:2: ( ( 'HIGH' ) )
                    {
                    // InternalSpaml.g:655:2: ( ( 'HIGH' ) )
                    // InternalSpaml.g:656:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:657:3: ( 'HIGH' )
                    // InternalSpaml.g:657:4: 'HIGH'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalSpaml.g:665:1: rule__OPERATION__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__OPERATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:669:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpaml.g:670:2: ( ( 'AND' ) )
                    {
                    // InternalSpaml.g:670:2: ( ( 'AND' ) )
                    // InternalSpaml.g:671:3: ( 'AND' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:672:3: ( 'AND' )
                    // InternalSpaml.g:672:4: 'AND'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:676:2: ( ( 'OR' ) )
                    {
                    // InternalSpaml.g:676:2: ( ( 'OR' ) )
                    // InternalSpaml.g:677:3: ( 'OR' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:678:3: ( 'OR' )
                    // InternalSpaml.g:678:4: 'OR'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalSpaml.g:686:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:690:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSpaml.g:691:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalSpaml.g:698:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:702:1: ( ( 'Program' ) )
            // InternalSpaml.g:703:1: ( 'Program' )
            {
            // InternalSpaml.g:703:1: ( 'Program' )
            // InternalSpaml.g:704:2: 'Program'
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
    // InternalSpaml.g:713:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:717:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSpaml.g:718:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalSpaml.g:725:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:729:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSpaml.g:730:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSpaml.g:730:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSpaml.g:731:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSpaml.g:732:2: ( rule__Program__NameAssignment_1 )
            // InternalSpaml.g:732:3: rule__Program__NameAssignment_1
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
    // InternalSpaml.g:740:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:744:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSpaml.g:745:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalSpaml.g:752:1: rule__Program__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:756:1: ( ( 'initialState' ) )
            // InternalSpaml.g:757:1: ( 'initialState' )
            {
            // InternalSpaml.g:757:1: ( 'initialState' )
            // InternalSpaml.g:758:2: 'initialState'
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
    // InternalSpaml.g:767:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:771:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSpaml.g:772:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalSpaml.g:779:1: rule__Program__Group__3__Impl : ( ( rule__Program__InitialStateAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:783:1: ( ( ( rule__Program__InitialStateAssignment_3 ) ) )
            // InternalSpaml.g:784:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            {
            // InternalSpaml.g:784:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            // InternalSpaml.g:785:2: ( rule__Program__InitialStateAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getInitialStateAssignment_3()); 
            // InternalSpaml.g:786:2: ( rule__Program__InitialStateAssignment_3 )
            // InternalSpaml.g:786:3: rule__Program__InitialStateAssignment_3
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
    // InternalSpaml.g:794:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:798:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalSpaml.g:799:2: rule__Program__Group__4__Impl rule__Program__Group__5
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
    // InternalSpaml.g:806:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:810:1: ( ( '{' ) )
            // InternalSpaml.g:811:1: ( '{' )
            {
            // InternalSpaml.g:811:1: ( '{' )
            // InternalSpaml.g:812:2: '{'
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
    // InternalSpaml.g:821:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:825:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalSpaml.g:826:2: rule__Program__Group__5__Impl rule__Program__Group__6
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
    // InternalSpaml.g:833:1: rule__Program__Group__5__Impl : ( ( rule__Program__Alternatives_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:837:1: ( ( ( rule__Program__Alternatives_5 ) ) )
            // InternalSpaml.g:838:1: ( ( rule__Program__Alternatives_5 ) )
            {
            // InternalSpaml.g:838:1: ( ( rule__Program__Alternatives_5 ) )
            // InternalSpaml.g:839:2: ( rule__Program__Alternatives_5 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_5()); 
            // InternalSpaml.g:840:2: ( rule__Program__Alternatives_5 )
            // InternalSpaml.g:840:3: rule__Program__Alternatives_5
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
    // InternalSpaml.g:848:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:852:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalSpaml.g:853:2: rule__Program__Group__6__Impl rule__Program__Group__7
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
    // InternalSpaml.g:860:1: rule__Program__Group__6__Impl : ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:864:1: ( ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) )
            // InternalSpaml.g:865:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            {
            // InternalSpaml.g:865:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            // InternalSpaml.g:866:2: ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* )
            {
            // InternalSpaml.g:866:2: ( ( rule__Program__PluggedElementsAssignment_6 ) )
            // InternalSpaml.g:867:3: ( rule__Program__PluggedElementsAssignment_6 )
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:868:3: ( rule__Program__PluggedElementsAssignment_6 )
            // InternalSpaml.g:868:4: rule__Program__PluggedElementsAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__Program__PluggedElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 

            }

            // InternalSpaml.g:871:2: ( ( rule__Program__PluggedElementsAssignment_6 )* )
            // InternalSpaml.g:872:3: ( rule__Program__PluggedElementsAssignment_6 )*
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:873:3: ( rule__Program__PluggedElementsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpaml.g:873:4: rule__Program__PluggedElementsAssignment_6
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
    // InternalSpaml.g:882:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:886:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalSpaml.g:887:2: rule__Program__Group__7__Impl rule__Program__Group__8
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
    // InternalSpaml.g:894:1: rule__Program__Group__7__Impl : ( ( rule__Program__Alternatives_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:898:1: ( ( ( rule__Program__Alternatives_7 ) ) )
            // InternalSpaml.g:899:1: ( ( rule__Program__Alternatives_7 ) )
            {
            // InternalSpaml.g:899:1: ( ( rule__Program__Alternatives_7 ) )
            // InternalSpaml.g:900:2: ( rule__Program__Alternatives_7 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_7()); 
            // InternalSpaml.g:901:2: ( rule__Program__Alternatives_7 )
            // InternalSpaml.g:901:3: rule__Program__Alternatives_7
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
    // InternalSpaml.g:909:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:913:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalSpaml.g:914:2: rule__Program__Group__8__Impl rule__Program__Group__9
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
    // InternalSpaml.g:921:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:925:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // InternalSpaml.g:926:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // InternalSpaml.g:926:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // InternalSpaml.g:927:2: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // InternalSpaml.g:927:2: ( ( rule__Program__StatesAssignment_8 ) )
            // InternalSpaml.g:928:3: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:929:3: ( rule__Program__StatesAssignment_8 )
            // InternalSpaml.g:929:4: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__Program__StatesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // InternalSpaml.g:932:2: ( ( rule__Program__StatesAssignment_8 )* )
            // InternalSpaml.g:933:3: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:934:3: ( rule__Program__StatesAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSpaml.g:934:4: rule__Program__StatesAssignment_8
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
    // InternalSpaml.g:943:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:947:1: ( rule__Program__Group__9__Impl )
            // InternalSpaml.g:948:2: rule__Program__Group__9__Impl
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
    // InternalSpaml.g:954:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:958:1: ( ( '}' ) )
            // InternalSpaml.g:959:1: ( '}' )
            {
            // InternalSpaml.g:959:1: ( '}' )
            // InternalSpaml.g:960:2: '}'
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
    // InternalSpaml.g:970:1: rule__PluggedElement__Group__0 : rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 ;
    public final void rule__PluggedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:974:1: ( rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 )
            // InternalSpaml.g:975:2: rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1
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
    // InternalSpaml.g:982:1: rule__PluggedElement__Group__0__Impl : ( ( rule__PluggedElement__Alternatives_0 ) ) ;
    public final void rule__PluggedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:986:1: ( ( ( rule__PluggedElement__Alternatives_0 ) ) )
            // InternalSpaml.g:987:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            {
            // InternalSpaml.g:987:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            // InternalSpaml.g:988:2: ( rule__PluggedElement__Alternatives_0 )
            {
             before(grammarAccess.getPluggedElementAccess().getAlternatives_0()); 
            // InternalSpaml.g:989:2: ( rule__PluggedElement__Alternatives_0 )
            // InternalSpaml.g:989:3: rule__PluggedElement__Alternatives_0
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
    // InternalSpaml.g:997:1: rule__PluggedElement__Group__1 : rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 ;
    public final void rule__PluggedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1001:1: ( rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 )
            // InternalSpaml.g:1002:2: rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2
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
    // InternalSpaml.g:1009:1: rule__PluggedElement__Group__1__Impl : ( ( rule__PluggedElement__NameAssignment_1 ) ) ;
    public final void rule__PluggedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1013:1: ( ( ( rule__PluggedElement__NameAssignment_1 ) ) )
            // InternalSpaml.g:1014:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            {
            // InternalSpaml.g:1014:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            // InternalSpaml.g:1015:2: ( rule__PluggedElement__NameAssignment_1 )
            {
             before(grammarAccess.getPluggedElementAccess().getNameAssignment_1()); 
            // InternalSpaml.g:1016:2: ( rule__PluggedElement__NameAssignment_1 )
            // InternalSpaml.g:1016:3: rule__PluggedElement__NameAssignment_1
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
    // InternalSpaml.g:1024:1: rule__PluggedElement__Group__2 : rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 ;
    public final void rule__PluggedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1028:1: ( rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 )
            // InternalSpaml.g:1029:2: rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3
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
    // InternalSpaml.g:1036:1: rule__PluggedElement__Group__2__Impl : ( ( 'onPin' )? ) ;
    public final void rule__PluggedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1040:1: ( ( ( 'onPin' )? ) )
            // InternalSpaml.g:1041:1: ( ( 'onPin' )? )
            {
            // InternalSpaml.g:1041:1: ( ( 'onPin' )? )
            // InternalSpaml.g:1042:2: ( 'onPin' )?
            {
             before(grammarAccess.getPluggedElementAccess().getOnPinKeyword_2()); 
            // InternalSpaml.g:1043:2: ( 'onPin' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpaml.g:1043:3: 'onPin'
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
    // InternalSpaml.g:1051:1: rule__PluggedElement__Group__3 : rule__PluggedElement__Group__3__Impl ;
    public final void rule__PluggedElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1055:1: ( rule__PluggedElement__Group__3__Impl )
            // InternalSpaml.g:1056:2: rule__PluggedElement__Group__3__Impl
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
    // InternalSpaml.g:1062:1: rule__PluggedElement__Group__3__Impl : ( ( rule__PluggedElement__PinAssignment_3 ) ) ;
    public final void rule__PluggedElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1066:1: ( ( ( rule__PluggedElement__PinAssignment_3 ) ) )
            // InternalSpaml.g:1067:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            {
            // InternalSpaml.g:1067:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            // InternalSpaml.g:1068:2: ( rule__PluggedElement__PinAssignment_3 )
            {
             before(grammarAccess.getPluggedElementAccess().getPinAssignment_3()); 
            // InternalSpaml.g:1069:2: ( rule__PluggedElement__PinAssignment_3 )
            // InternalSpaml.g:1069:3: rule__PluggedElement__PinAssignment_3
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
    // InternalSpaml.g:1078:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1082:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSpaml.g:1083:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalSpaml.g:1090:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1094:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalSpaml.g:1095:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalSpaml.g:1095:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalSpaml.g:1096:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalSpaml.g:1097:2: ( rule__State__NameAssignment_0 )
            // InternalSpaml.g:1097:3: rule__State__NameAssignment_0
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
    // InternalSpaml.g:1105:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1109:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSpaml.g:1110:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalSpaml.g:1117:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1121:1: ( ( '{' ) )
            // InternalSpaml.g:1122:1: ( '{' )
            {
            // InternalSpaml.g:1122:1: ( '{' )
            // InternalSpaml.g:1123:2: '{'
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
    // InternalSpaml.g:1132:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1136:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSpaml.g:1137:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalSpaml.g:1144:1: rule__State__Group__2__Impl : ( ( ( rule__State__ActionsAssignment_2 ) ) ( ( rule__State__ActionsAssignment_2 )* ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1148:1: ( ( ( ( rule__State__ActionsAssignment_2 ) ) ( ( rule__State__ActionsAssignment_2 )* ) ) )
            // InternalSpaml.g:1149:1: ( ( ( rule__State__ActionsAssignment_2 ) ) ( ( rule__State__ActionsAssignment_2 )* ) )
            {
            // InternalSpaml.g:1149:1: ( ( ( rule__State__ActionsAssignment_2 ) ) ( ( rule__State__ActionsAssignment_2 )* ) )
            // InternalSpaml.g:1150:2: ( ( rule__State__ActionsAssignment_2 ) ) ( ( rule__State__ActionsAssignment_2 )* )
            {
            // InternalSpaml.g:1150:2: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalSpaml.g:1151:3: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalSpaml.g:1152:3: ( rule__State__ActionsAssignment_2 )
            // InternalSpaml.g:1152:4: rule__State__ActionsAssignment_2
            {
            pushFollow(FOLLOW_11);
            rule__State__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_2()); 

            }

            // InternalSpaml.g:1155:2: ( ( rule__State__ActionsAssignment_2 )* )
            // InternalSpaml.g:1156:3: ( rule__State__ActionsAssignment_2 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalSpaml.g:1157:3: ( rule__State__ActionsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==15) ) {
                        int LA16_4 = input.LA(3);

                        if ( (LA16_4==20) ) {
                            int LA16_5 = input.LA(4);

                            if ( ((LA16_5>=RULE_STRING && LA16_5<=RULE_INT)||(LA16_5>=22 && LA16_5<=23)||LA16_5==29||LA16_5==33) ) {
                                alt16=1;
                            }


                        }
                        else if ( (LA16_4==21) ) {
                            int LA16_6 = input.LA(4);

                            if ( ((LA16_6>=RULE_STRING && LA16_6<=RULE_INT)||(LA16_6>=22 && LA16_6<=23)||LA16_6==29||LA16_6==33) ) {
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
            	    // InternalSpaml.g:1157:4: rule__State__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_2()); 

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
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalSpaml.g:1166:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1170:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSpaml.g:1171:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSpaml.g:1178:1: rule__State__Group__3__Impl : ( ( ( rule__State__TransitionsAssignment_3 ) ) ( ( rule__State__TransitionsAssignment_3 )* ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1182:1: ( ( ( ( rule__State__TransitionsAssignment_3 ) ) ( ( rule__State__TransitionsAssignment_3 )* ) ) )
            // InternalSpaml.g:1183:1: ( ( ( rule__State__TransitionsAssignment_3 ) ) ( ( rule__State__TransitionsAssignment_3 )* ) )
            {
            // InternalSpaml.g:1183:1: ( ( ( rule__State__TransitionsAssignment_3 ) ) ( ( rule__State__TransitionsAssignment_3 )* ) )
            // InternalSpaml.g:1184:2: ( ( rule__State__TransitionsAssignment_3 ) ) ( ( rule__State__TransitionsAssignment_3 )* )
            {
            // InternalSpaml.g:1184:2: ( ( rule__State__TransitionsAssignment_3 ) )
            // InternalSpaml.g:1185:3: ( rule__State__TransitionsAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // InternalSpaml.g:1186:3: ( rule__State__TransitionsAssignment_3 )
            // InternalSpaml.g:1186:4: rule__State__TransitionsAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__State__TransitionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 

            }

            // InternalSpaml.g:1189:2: ( ( rule__State__TransitionsAssignment_3 )* )
            // InternalSpaml.g:1190:3: ( rule__State__TransitionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // InternalSpaml.g:1191:3: ( rule__State__TransitionsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||(LA17_0>=22 && LA17_0<=23)||LA17_0==29||LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSpaml.g:1191:4: rule__State__TransitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__State__TransitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 

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
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalSpaml.g:1200:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1204:1: ( rule__State__Group__4__Impl )
            // InternalSpaml.g:1205:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSpaml.g:1211:1: rule__State__Group__4__Impl : ( '}' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1215:1: ( ( '}' ) )
            // InternalSpaml.g:1216:1: ( '}' )
            {
            // InternalSpaml.g:1216:1: ( '}' )
            // InternalSpaml.g:1217:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSpaml.g:1227:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1231:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSpaml.g:1232:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSpaml.g:1239:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1243:1: ( ( ( '-' )? ) )
            // InternalSpaml.g:1244:1: ( ( '-' )? )
            {
            // InternalSpaml.g:1244:1: ( ( '-' )? )
            // InternalSpaml.g:1245:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSpaml.g:1246:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpaml.g:1246:3: '-'
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
    // InternalSpaml.g:1254:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1258:1: ( rule__EInt__Group__1__Impl )
            // InternalSpaml.g:1259:2: rule__EInt__Group__1__Impl
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
    // InternalSpaml.g:1265:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1269:1: ( ( RULE_INT ) )
            // InternalSpaml.g:1270:1: ( RULE_INT )
            {
            // InternalSpaml.g:1270:1: ( RULE_INT )
            // InternalSpaml.g:1271:2: RULE_INT
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


    // $ANTLR start "rule__SensorDigital__Group__0"
    // InternalSpaml.g:1281:1: rule__SensorDigital__Group__0 : rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1 ;
    public final void rule__SensorDigital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1285:1: ( rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1 )
            // InternalSpaml.g:1286:2: rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SensorDigital__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDigital__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDigital__Group__0"


    // $ANTLR start "rule__SensorDigital__Group__0__Impl"
    // InternalSpaml.g:1293:1: rule__SensorDigital__Group__0__Impl : ( () ) ;
    public final void rule__SensorDigital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1297:1: ( ( () ) )
            // InternalSpaml.g:1298:1: ( () )
            {
            // InternalSpaml.g:1298:1: ( () )
            // InternalSpaml.g:1299:2: ()
            {
             before(grammarAccess.getSensorDigitalAccess().getSensorDigitalAction_0()); 
            // InternalSpaml.g:1300:2: ()
            // InternalSpaml.g:1300:3: 
            {
            }

             after(grammarAccess.getSensorDigitalAccess().getSensorDigitalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDigital__Group__0__Impl"


    // $ANTLR start "rule__SensorDigital__Group__1"
    // InternalSpaml.g:1308:1: rule__SensorDigital__Group__1 : rule__SensorDigital__Group__1__Impl ;
    public final void rule__SensorDigital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1312:1: ( rule__SensorDigital__Group__1__Impl )
            // InternalSpaml.g:1313:2: rule__SensorDigital__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorDigital__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDigital__Group__1"


    // $ANTLR start "rule__SensorDigital__Group__1__Impl"
    // InternalSpaml.g:1319:1: rule__SensorDigital__Group__1__Impl : ( 'SensorDigital' ) ;
    public final void rule__SensorDigital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1323:1: ( ( 'SensorDigital' ) )
            // InternalSpaml.g:1324:1: ( 'SensorDigital' )
            {
            // InternalSpaml.g:1324:1: ( 'SensorDigital' )
            // InternalSpaml.g:1325:2: 'SensorDigital'
            {
             before(grammarAccess.getSensorDigitalAccess().getSensorDigitalKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSensorDigitalAccess().getSensorDigitalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDigital__Group__1__Impl"


    // $ANTLR start "rule__SensorAnalog__Group__0"
    // InternalSpaml.g:1335:1: rule__SensorAnalog__Group__0 : rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1 ;
    public final void rule__SensorAnalog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1339:1: ( rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1 )
            // InternalSpaml.g:1340:2: rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SensorAnalog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorAnalog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAnalog__Group__0"


    // $ANTLR start "rule__SensorAnalog__Group__0__Impl"
    // InternalSpaml.g:1347:1: rule__SensorAnalog__Group__0__Impl : ( () ) ;
    public final void rule__SensorAnalog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1351:1: ( ( () ) )
            // InternalSpaml.g:1352:1: ( () )
            {
            // InternalSpaml.g:1352:1: ( () )
            // InternalSpaml.g:1353:2: ()
            {
             before(grammarAccess.getSensorAnalogAccess().getSensorAnalogAction_0()); 
            // InternalSpaml.g:1354:2: ()
            // InternalSpaml.g:1354:3: 
            {
            }

             after(grammarAccess.getSensorAnalogAccess().getSensorAnalogAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAnalog__Group__0__Impl"


    // $ANTLR start "rule__SensorAnalog__Group__1"
    // InternalSpaml.g:1362:1: rule__SensorAnalog__Group__1 : rule__SensorAnalog__Group__1__Impl ;
    public final void rule__SensorAnalog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1366:1: ( rule__SensorAnalog__Group__1__Impl )
            // InternalSpaml.g:1367:2: rule__SensorAnalog__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorAnalog__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAnalog__Group__1"


    // $ANTLR start "rule__SensorAnalog__Group__1__Impl"
    // InternalSpaml.g:1373:1: rule__SensorAnalog__Group__1__Impl : ( 'SensorAnalog' ) ;
    public final void rule__SensorAnalog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1377:1: ( ( 'SensorAnalog' ) )
            // InternalSpaml.g:1378:1: ( 'SensorAnalog' )
            {
            // InternalSpaml.g:1378:1: ( 'SensorAnalog' )
            // InternalSpaml.g:1379:2: 'SensorAnalog'
            {
             before(grammarAccess.getSensorAnalogAccess().getSensorAnalogKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorAnalogAccess().getSensorAnalogKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAnalog__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalSpaml.g:1389:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1393:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalSpaml.g:1394:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSpaml.g:1401:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1405:1: ( ( () ) )
            // InternalSpaml.g:1406:1: ( () )
            {
            // InternalSpaml.g:1406:1: ( () )
            // InternalSpaml.g:1407:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalSpaml.g:1408:2: ()
            // InternalSpaml.g:1408:3: 
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
    // InternalSpaml.g:1416:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1420:1: ( rule__Actuator__Group__1__Impl )
            // InternalSpaml.g:1421:2: rule__Actuator__Group__1__Impl
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
    // InternalSpaml.g:1427:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1431:1: ( ( 'Actuator' ) )
            // InternalSpaml.g:1432:1: ( 'Actuator' )
            {
            // InternalSpaml.g:1432:1: ( 'Actuator' )
            // InternalSpaml.g:1433:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSpaml.g:1443:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1447:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSpaml.g:1448:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSpaml.g:1455:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1459:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalSpaml.g:1460:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalSpaml.g:1460:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalSpaml.g:1461:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalSpaml.g:1462:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalSpaml.g:1462:3: rule__Action__ActuatorAssignment_0
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
    // InternalSpaml.g:1470:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1474:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSpaml.g:1475:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSpaml.g:1482:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1486:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalSpaml.g:1487:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalSpaml.g:1487:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalSpaml.g:1488:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1489:2: ( rule__Action__Alternatives_1 )
            // InternalSpaml.g:1489:3: rule__Action__Alternatives_1
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
    // InternalSpaml.g:1497:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1501:1: ( rule__Action__Group__2__Impl )
            // InternalSpaml.g:1502:2: rule__Action__Group__2__Impl
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
    // InternalSpaml.g:1508:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1512:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1513:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1513:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalSpaml.g:1514:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1515:2: ( rule__Action__ValueAssignment_2 )
            // InternalSpaml.g:1515:3: rule__Action__ValueAssignment_2
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
    // InternalSpaml.g:1524:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1528:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSpaml.g:1529:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpaml.g:1536:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1540:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalSpaml.g:1541:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalSpaml.g:1541:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalSpaml.g:1542:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalSpaml.g:1543:2: ( rule__Transition__Alternatives_0 )
            // InternalSpaml.g:1543:3: rule__Transition__Alternatives_0
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
    // InternalSpaml.g:1551:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1555:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSpaml.g:1556:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalSpaml.g:1563:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Alternatives_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1567:1: ( ( ( rule__Transition__Alternatives_1 ) ) )
            // InternalSpaml.g:1568:1: ( ( rule__Transition__Alternatives_1 ) )
            {
            // InternalSpaml.g:1568:1: ( ( rule__Transition__Alternatives_1 ) )
            // InternalSpaml.g:1569:2: ( rule__Transition__Alternatives_1 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1570:2: ( rule__Transition__Alternatives_1 )
            // InternalSpaml.g:1570:3: rule__Transition__Alternatives_1
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
    // InternalSpaml.g:1578:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1582:1: ( rule__Transition__Group__2__Impl )
            // InternalSpaml.g:1583:2: rule__Transition__Group__2__Impl
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
    // InternalSpaml.g:1589:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NextAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1593:1: ( ( ( rule__Transition__NextAssignment_2 ) ) )
            // InternalSpaml.g:1594:1: ( ( rule__Transition__NextAssignment_2 ) )
            {
            // InternalSpaml.g:1594:1: ( ( rule__Transition__NextAssignment_2 ) )
            // InternalSpaml.g:1595:2: ( rule__Transition__NextAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_2()); 
            // InternalSpaml.g:1596:2: ( rule__Transition__NextAssignment_2 )
            // InternalSpaml.g:1596:3: rule__Transition__NextAssignment_2
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
    // InternalSpaml.g:1605:1: rule__Transition__Group_0_0__0 : rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 ;
    public final void rule__Transition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1609:1: ( rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 )
            // InternalSpaml.g:1610:2: rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpaml.g:1617:1: rule__Transition__Group_0_0__0__Impl : ( ( 'when' )? ) ;
    public final void rule__Transition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1621:1: ( ( ( 'when' )? ) )
            // InternalSpaml.g:1622:1: ( ( 'when' )? )
            {
            // InternalSpaml.g:1622:1: ( ( 'when' )? )
            // InternalSpaml.g:1623:2: ( 'when' )?
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0()); 
            // InternalSpaml.g:1624:2: ( 'when' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpaml.g:1624:3: 'when'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalSpaml.g:1632:1: rule__Transition__Group_0_0__1 : rule__Transition__Group_0_0__1__Impl ;
    public final void rule__Transition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1636:1: ( rule__Transition__Group_0_0__1__Impl )
            // InternalSpaml.g:1637:2: rule__Transition__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSpaml.g:1643:1: rule__Transition__Group_0_0__1__Impl : ( ( rule__Transition__Group_0_0_1__0 ) ) ;
    public final void rule__Transition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1647:1: ( ( ( rule__Transition__Group_0_0_1__0 ) ) )
            // InternalSpaml.g:1648:1: ( ( rule__Transition__Group_0_0_1__0 ) )
            {
            // InternalSpaml.g:1648:1: ( ( rule__Transition__Group_0_0_1__0 ) )
            // InternalSpaml.g:1649:2: ( rule__Transition__Group_0_0_1__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_1()); 
            // InternalSpaml.g:1650:2: ( rule__Transition__Group_0_0_1__0 )
            // InternalSpaml.g:1650:3: rule__Transition__Group_0_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup_0_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_0_0_1__0"
    // InternalSpaml.g:1659:1: rule__Transition__Group_0_0_1__0 : rule__Transition__Group_0_0_1__0__Impl rule__Transition__Group_0_0_1__1 ;
    public final void rule__Transition__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1663:1: ( rule__Transition__Group_0_0_1__0__Impl rule__Transition__Group_0_0_1__1 )
            // InternalSpaml.g:1664:2: rule__Transition__Group_0_0_1__0__Impl rule__Transition__Group_0_0_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Transition__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1__0"


    // $ANTLR start "rule__Transition__Group_0_0_1__0__Impl"
    // InternalSpaml.g:1671:1: rule__Transition__Group_0_0_1__0__Impl : ( ( rule__Transition__ConditionsAssignment_0_0_1_0 ) ) ;
    public final void rule__Transition__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1675:1: ( ( ( rule__Transition__ConditionsAssignment_0_0_1_0 ) ) )
            // InternalSpaml.g:1676:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_0 ) )
            {
            // InternalSpaml.g:1676:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_0 ) )
            // InternalSpaml.g:1677:2: ( rule__Transition__ConditionsAssignment_0_0_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_0()); 
            // InternalSpaml.g:1678:2: ( rule__Transition__ConditionsAssignment_0_0_1_0 )
            // InternalSpaml.g:1678:3: rule__Transition__ConditionsAssignment_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1__1"
    // InternalSpaml.g:1686:1: rule__Transition__Group_0_0_1__1 : rule__Transition__Group_0_0_1__1__Impl ;
    public final void rule__Transition__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1690:1: ( rule__Transition__Group_0_0_1__1__Impl )
            // InternalSpaml.g:1691:2: rule__Transition__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1__1"


    // $ANTLR start "rule__Transition__Group_0_0_1__1__Impl"
    // InternalSpaml.g:1697:1: rule__Transition__Group_0_0_1__1__Impl : ( ( rule__Transition__Group_0_0_1_1__0 )* ) ;
    public final void rule__Transition__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1701:1: ( ( ( rule__Transition__Group_0_0_1_1__0 )* ) )
            // InternalSpaml.g:1702:1: ( ( rule__Transition__Group_0_0_1_1__0 )* )
            {
            // InternalSpaml.g:1702:1: ( ( rule__Transition__Group_0_0_1_1__0 )* )
            // InternalSpaml.g:1703:2: ( rule__Transition__Group_0_0_1_1__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_1_1()); 
            // InternalSpaml.g:1704:2: ( rule__Transition__Group_0_0_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSpaml.g:1704:3: rule__Transition__Group_0_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Transition__Group_0_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__0"
    // InternalSpaml.g:1713:1: rule__Transition__Group_0_0_1_1__0 : rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1 ;
    public final void rule__Transition__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1717:1: ( rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1 )
            // InternalSpaml.g:1718:2: rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_0_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__0"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__0__Impl"
    // InternalSpaml.g:1725:1: rule__Transition__Group_0_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1729:1: ( ( ',' ) )
            // InternalSpaml.g:1730:1: ( ',' )
            {
            // InternalSpaml.g:1730:1: ( ',' )
            // InternalSpaml.g:1731:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_0_0_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__1"
    // InternalSpaml.g:1740:1: rule__Transition__Group_0_0_1_1__1 : rule__Transition__Group_0_0_1_1__1__Impl ;
    public final void rule__Transition__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1744:1: ( rule__Transition__Group_0_0_1_1__1__Impl )
            // InternalSpaml.g:1745:2: rule__Transition__Group_0_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__1"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__1__Impl"
    // InternalSpaml.g:1751:1: rule__Transition__Group_0_0_1_1__1__Impl : ( ( rule__Transition__ConditionsAssignment_0_0_1_1_1 ) ) ;
    public final void rule__Transition__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1755:1: ( ( ( rule__Transition__ConditionsAssignment_0_0_1_1_1 ) ) )
            // InternalSpaml.g:1756:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_1_1 ) )
            {
            // InternalSpaml.g:1756:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_1_1 ) )
            // InternalSpaml.g:1757:2: ( rule__Transition__ConditionsAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_1_1()); 
            // InternalSpaml.g:1758:2: ( rule__Transition__ConditionsAssignment_0_0_1_1_1 )
            // InternalSpaml.g:1758:3: rule__Transition__ConditionsAssignment_0_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__0"
    // InternalSpaml.g:1767:1: rule__Transition__Group_0_1__0 : rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1 ;
    public final void rule__Transition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1771:1: ( rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1 )
            // InternalSpaml.g:1772:2: rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Transition__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__0"


    // $ANTLR start "rule__Transition__Group_0_1__0__Impl"
    // InternalSpaml.g:1779:1: rule__Transition__Group_0_1__0__Impl : ( ( rule__Transition__OperationAssignment_0_1_0 ) ) ;
    public final void rule__Transition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1783:1: ( ( ( rule__Transition__OperationAssignment_0_1_0 ) ) )
            // InternalSpaml.g:1784:1: ( ( rule__Transition__OperationAssignment_0_1_0 ) )
            {
            // InternalSpaml.g:1784:1: ( ( rule__Transition__OperationAssignment_0_1_0 ) )
            // InternalSpaml.g:1785:2: ( rule__Transition__OperationAssignment_0_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getOperationAssignment_0_1_0()); 
            // InternalSpaml.g:1786:2: ( rule__Transition__OperationAssignment_0_1_0 )
            // InternalSpaml.g:1786:3: rule__Transition__OperationAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OperationAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOperationAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__1"
    // InternalSpaml.g:1794:1: rule__Transition__Group_0_1__1 : rule__Transition__Group_0_1__1__Impl rule__Transition__Group_0_1__2 ;
    public final void rule__Transition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1798:1: ( rule__Transition__Group_0_1__1__Impl rule__Transition__Group_0_1__2 )
            // InternalSpaml.g:1799:2: rule__Transition__Group_0_1__1__Impl rule__Transition__Group_0_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__1"


    // $ANTLR start "rule__Transition__Group_0_1__1__Impl"
    // InternalSpaml.g:1806:1: rule__Transition__Group_0_1__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1810:1: ( ( '(' ) )
            // InternalSpaml.g:1811:1: ( '(' )
            {
            // InternalSpaml.g:1811:1: ( '(' )
            // InternalSpaml.g:1812:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_0_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__2"
    // InternalSpaml.g:1821:1: rule__Transition__Group_0_1__2 : rule__Transition__Group_0_1__2__Impl rule__Transition__Group_0_1__3 ;
    public final void rule__Transition__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1825:1: ( rule__Transition__Group_0_1__2__Impl rule__Transition__Group_0_1__3 )
            // InternalSpaml.g:1826:2: rule__Transition__Group_0_1__2__Impl rule__Transition__Group_0_1__3
            {
            pushFollow(FOLLOW_24);
            rule__Transition__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__2"


    // $ANTLR start "rule__Transition__Group_0_1__2__Impl"
    // InternalSpaml.g:1833:1: rule__Transition__Group_0_1__2__Impl : ( ( rule__Transition__Group_0_1_2__0 ) ) ;
    public final void rule__Transition__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1837:1: ( ( ( rule__Transition__Group_0_1_2__0 ) ) )
            // InternalSpaml.g:1838:1: ( ( rule__Transition__Group_0_1_2__0 ) )
            {
            // InternalSpaml.g:1838:1: ( ( rule__Transition__Group_0_1_2__0 ) )
            // InternalSpaml.g:1839:2: ( rule__Transition__Group_0_1_2__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_1_2()); 
            // InternalSpaml.g:1840:2: ( rule__Transition__Group_0_1_2__0 )
            // InternalSpaml.g:1840:3: rule__Transition__Group_0_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__3"
    // InternalSpaml.g:1848:1: rule__Transition__Group_0_1__3 : rule__Transition__Group_0_1__3__Impl ;
    public final void rule__Transition__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1852:1: ( rule__Transition__Group_0_1__3__Impl )
            // InternalSpaml.g:1853:2: rule__Transition__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__3"


    // $ANTLR start "rule__Transition__Group_0_1__3__Impl"
    // InternalSpaml.g:1859:1: rule__Transition__Group_0_1__3__Impl : ( ')' ) ;
    public final void rule__Transition__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1863:1: ( ( ')' ) )
            // InternalSpaml.g:1864:1: ( ')' )
            {
            // InternalSpaml.g:1864:1: ( ')' )
            // InternalSpaml.g:1865:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_0_1_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__3__Impl"


    // $ANTLR start "rule__Transition__Group_0_1_2__0"
    // InternalSpaml.g:1875:1: rule__Transition__Group_0_1_2__0 : rule__Transition__Group_0_1_2__0__Impl rule__Transition__Group_0_1_2__1 ;
    public final void rule__Transition__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1879:1: ( rule__Transition__Group_0_1_2__0__Impl rule__Transition__Group_0_1_2__1 )
            // InternalSpaml.g:1880:2: rule__Transition__Group_0_1_2__0__Impl rule__Transition__Group_0_1_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Transition__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2__0"


    // $ANTLR start "rule__Transition__Group_0_1_2__0__Impl"
    // InternalSpaml.g:1887:1: rule__Transition__Group_0_1_2__0__Impl : ( ( rule__Transition__ConditionsAssignment_0_1_2_0 ) ) ;
    public final void rule__Transition__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1891:1: ( ( ( rule__Transition__ConditionsAssignment_0_1_2_0 ) ) )
            // InternalSpaml.g:1892:1: ( ( rule__Transition__ConditionsAssignment_0_1_2_0 ) )
            {
            // InternalSpaml.g:1892:1: ( ( rule__Transition__ConditionsAssignment_0_1_2_0 ) )
            // InternalSpaml.g:1893:2: ( rule__Transition__ConditionsAssignment_0_1_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_1_2_0()); 
            // InternalSpaml.g:1894:2: ( rule__Transition__ConditionsAssignment_0_1_2_0 )
            // InternalSpaml.g:1894:3: rule__Transition__ConditionsAssignment_0_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_1_2__1"
    // InternalSpaml.g:1902:1: rule__Transition__Group_0_1_2__1 : rule__Transition__Group_0_1_2__1__Impl ;
    public final void rule__Transition__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1906:1: ( rule__Transition__Group_0_1_2__1__Impl )
            // InternalSpaml.g:1907:2: rule__Transition__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2__1"


    // $ANTLR start "rule__Transition__Group_0_1_2__1__Impl"
    // InternalSpaml.g:1913:1: rule__Transition__Group_0_1_2__1__Impl : ( ( rule__Transition__Group_0_1_2_1__0 )* ) ;
    public final void rule__Transition__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1917:1: ( ( ( rule__Transition__Group_0_1_2_1__0 )* ) )
            // InternalSpaml.g:1918:1: ( ( rule__Transition__Group_0_1_2_1__0 )* )
            {
            // InternalSpaml.g:1918:1: ( ( rule__Transition__Group_0_1_2_1__0 )* )
            // InternalSpaml.g:1919:2: ( rule__Transition__Group_0_1_2_1__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_1_2_1()); 
            // InternalSpaml.g:1920:2: ( rule__Transition__Group_0_1_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSpaml.g:1920:3: rule__Transition__Group_0_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Transition__Group_0_1_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_0_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_1_2_1__0"
    // InternalSpaml.g:1929:1: rule__Transition__Group_0_1_2_1__0 : rule__Transition__Group_0_1_2_1__0__Impl rule__Transition__Group_0_1_2_1__1 ;
    public final void rule__Transition__Group_0_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1933:1: ( rule__Transition__Group_0_1_2_1__0__Impl rule__Transition__Group_0_1_2_1__1 )
            // InternalSpaml.g:1934:2: rule__Transition__Group_0_1_2_1__0__Impl rule__Transition__Group_0_1_2_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_0_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2_1__0"


    // $ANTLR start "rule__Transition__Group_0_1_2_1__0__Impl"
    // InternalSpaml.g:1941:1: rule__Transition__Group_0_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_0_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1945:1: ( ( ',' ) )
            // InternalSpaml.g:1946:1: ( ',' )
            {
            // InternalSpaml.g:1946:1: ( ',' )
            // InternalSpaml.g:1947:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_0_1_2_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_0_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_1_2_1__1"
    // InternalSpaml.g:1956:1: rule__Transition__Group_0_1_2_1__1 : rule__Transition__Group_0_1_2_1__1__Impl ;
    public final void rule__Transition__Group_0_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1960:1: ( rule__Transition__Group_0_1_2_1__1__Impl )
            // InternalSpaml.g:1961:2: rule__Transition__Group_0_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2_1__1"


    // $ANTLR start "rule__Transition__Group_0_1_2_1__1__Impl"
    // InternalSpaml.g:1967:1: rule__Transition__Group_0_1_2_1__1__Impl : ( ( rule__Transition__ConditionsAssignment_0_1_2_1_1 ) ) ;
    public final void rule__Transition__Group_0_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1971:1: ( ( ( rule__Transition__ConditionsAssignment_0_1_2_1_1 ) ) )
            // InternalSpaml.g:1972:1: ( ( rule__Transition__ConditionsAssignment_0_1_2_1_1 ) )
            {
            // InternalSpaml.g:1972:1: ( ( rule__Transition__ConditionsAssignment_0_1_2_1_1 ) )
            // InternalSpaml.g:1973:2: ( rule__Transition__ConditionsAssignment_0_1_2_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_1_2_1_1()); 
            // InternalSpaml.g:1974:2: ( rule__Transition__ConditionsAssignment_0_1_2_1_1 )
            // InternalSpaml.g:1974:3: rule__Transition__ConditionsAssignment_0_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1_2_1__1__Impl"


    // $ANTLR start "rule__LogicalCondition__Group__0"
    // InternalSpaml.g:1983:1: rule__LogicalCondition__Group__0 : rule__LogicalCondition__Group__0__Impl rule__LogicalCondition__Group__1 ;
    public final void rule__LogicalCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1987:1: ( rule__LogicalCondition__Group__0__Impl rule__LogicalCondition__Group__1 )
            // InternalSpaml.g:1988:2: rule__LogicalCondition__Group__0__Impl rule__LogicalCondition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__LogicalCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__Group__0"


    // $ANTLR start "rule__LogicalCondition__Group__0__Impl"
    // InternalSpaml.g:1995:1: rule__LogicalCondition__Group__0__Impl : ( ( rule__LogicalCondition__SensorAssignment_0 ) ) ;
    public final void rule__LogicalCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1999:1: ( ( ( rule__LogicalCondition__SensorAssignment_0 ) ) )
            // InternalSpaml.g:2000:1: ( ( rule__LogicalCondition__SensorAssignment_0 ) )
            {
            // InternalSpaml.g:2000:1: ( ( rule__LogicalCondition__SensorAssignment_0 ) )
            // InternalSpaml.g:2001:2: ( rule__LogicalCondition__SensorAssignment_0 )
            {
             before(grammarAccess.getLogicalConditionAccess().getSensorAssignment_0()); 
            // InternalSpaml.g:2002:2: ( rule__LogicalCondition__SensorAssignment_0 )
            // InternalSpaml.g:2002:3: rule__LogicalCondition__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicalCondition__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalConditionAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__Group__0__Impl"


    // $ANTLR start "rule__LogicalCondition__Group__1"
    // InternalSpaml.g:2010:1: rule__LogicalCondition__Group__1 : rule__LogicalCondition__Group__1__Impl rule__LogicalCondition__Group__2 ;
    public final void rule__LogicalCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2014:1: ( rule__LogicalCondition__Group__1__Impl rule__LogicalCondition__Group__2 )
            // InternalSpaml.g:2015:2: rule__LogicalCondition__Group__1__Impl rule__LogicalCondition__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__LogicalCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicalCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__Group__1"


    // $ANTLR start "rule__LogicalCondition__Group__1__Impl"
    // InternalSpaml.g:2022:1: rule__LogicalCondition__Group__1__Impl : ( ( rule__LogicalCondition__Alternatives_1 ) ) ;
    public final void rule__LogicalCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2026:1: ( ( ( rule__LogicalCondition__Alternatives_1 ) ) )
            // InternalSpaml.g:2027:1: ( ( rule__LogicalCondition__Alternatives_1 ) )
            {
            // InternalSpaml.g:2027:1: ( ( rule__LogicalCondition__Alternatives_1 ) )
            // InternalSpaml.g:2028:2: ( rule__LogicalCondition__Alternatives_1 )
            {
             before(grammarAccess.getLogicalConditionAccess().getAlternatives_1()); 
            // InternalSpaml.g:2029:2: ( rule__LogicalCondition__Alternatives_1 )
            // InternalSpaml.g:2029:3: rule__LogicalCondition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalCondition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__Group__1__Impl"


    // $ANTLR start "rule__LogicalCondition__Group__2"
    // InternalSpaml.g:2037:1: rule__LogicalCondition__Group__2 : rule__LogicalCondition__Group__2__Impl ;
    public final void rule__LogicalCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2041:1: ( rule__LogicalCondition__Group__2__Impl )
            // InternalSpaml.g:2042:2: rule__LogicalCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalCondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__Group__2"


    // $ANTLR start "rule__LogicalCondition__Group__2__Impl"
    // InternalSpaml.g:2048:1: rule__LogicalCondition__Group__2__Impl : ( ( rule__LogicalCondition__ValueAssignment_2 ) ) ;
    public final void rule__LogicalCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2052:1: ( ( ( rule__LogicalCondition__ValueAssignment_2 ) ) )
            // InternalSpaml.g:2053:1: ( ( rule__LogicalCondition__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:2053:1: ( ( rule__LogicalCondition__ValueAssignment_2 ) )
            // InternalSpaml.g:2054:2: ( rule__LogicalCondition__ValueAssignment_2 )
            {
             before(grammarAccess.getLogicalConditionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:2055:2: ( rule__LogicalCondition__ValueAssignment_2 )
            // InternalSpaml.g:2055:3: rule__LogicalCondition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalCondition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalConditionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__Group__2__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalSpaml.g:2064:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2068:1: ( ( ruleEString ) )
            // InternalSpaml.g:2069:2: ( ruleEString )
            {
            // InternalSpaml.g:2069:2: ( ruleEString )
            // InternalSpaml.g:2070:3: ruleEString
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
    // InternalSpaml.g:2079:1: rule__Program__InitialStateAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Program__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2083:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2084:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2084:2: ( ( ruleEString ) )
            // InternalSpaml.g:2085:3: ( ruleEString )
            {
             before(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0()); 
            // InternalSpaml.g:2086:3: ( ruleEString )
            // InternalSpaml.g:2087:4: ruleEString
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
    // InternalSpaml.g:2098:1: rule__Program__PluggedElementsAssignment_6 : ( rulePluggedElement ) ;
    public final void rule__Program__PluggedElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2102:1: ( ( rulePluggedElement ) )
            // InternalSpaml.g:2103:2: ( rulePluggedElement )
            {
            // InternalSpaml.g:2103:2: ( rulePluggedElement )
            // InternalSpaml.g:2104:3: rulePluggedElement
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
    // InternalSpaml.g:2113:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2117:1: ( ( ruleState ) )
            // InternalSpaml.g:2118:2: ( ruleState )
            {
            // InternalSpaml.g:2118:2: ( ruleState )
            // InternalSpaml.g:2119:3: ruleState
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
    // InternalSpaml.g:2128:1: rule__PluggedElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PluggedElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2132:1: ( ( ruleEString ) )
            // InternalSpaml.g:2133:2: ( ruleEString )
            {
            // InternalSpaml.g:2133:2: ( ruleEString )
            // InternalSpaml.g:2134:3: ruleEString
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
    // InternalSpaml.g:2143:1: rule__PluggedElement__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__PluggedElement__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2147:1: ( ( ruleEInt ) )
            // InternalSpaml.g:2148:2: ( ruleEInt )
            {
            // InternalSpaml.g:2148:2: ( ruleEInt )
            // InternalSpaml.g:2149:3: ruleEInt
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
    // InternalSpaml.g:2158:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2162:1: ( ( ruleEString ) )
            // InternalSpaml.g:2163:2: ( ruleEString )
            {
            // InternalSpaml.g:2163:2: ( ruleEString )
            // InternalSpaml.g:2164:3: ruleEString
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
    // InternalSpaml.g:2173:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2177:1: ( ( ruleAction ) )
            // InternalSpaml.g:2178:2: ( ruleAction )
            {
            // InternalSpaml.g:2178:2: ( ruleAction )
            // InternalSpaml.g:2179:3: ruleAction
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


    // $ANTLR start "rule__State__TransitionsAssignment_3"
    // InternalSpaml.g:2188:1: rule__State__TransitionsAssignment_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2192:1: ( ( ruleTransition ) )
            // InternalSpaml.g:2193:2: ( ruleTransition )
            {
            // InternalSpaml.g:2193:2: ( ruleTransition )
            // InternalSpaml.g:2194:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_3"


    // $ANTLR start "rule__Action__ActuatorAssignment_0"
    // InternalSpaml.g:2203:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2207:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2208:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2208:2: ( ( ruleEString ) )
            // InternalSpaml.g:2209:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalSpaml.g:2210:3: ( ruleEString )
            // InternalSpaml.g:2211:4: ruleEString
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
    // InternalSpaml.g:2222:1: rule__Action__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2226:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:2227:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:2227:2: ( ruleSIGNAL )
            // InternalSpaml.g:2228:3: ruleSIGNAL
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


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_0_1_0"
    // InternalSpaml.g:2237:1: rule__Transition__ConditionsAssignment_0_0_1_0 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2241:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2242:2: ( ruleCondition )
            {
            // InternalSpaml.g:2242:2: ( ruleCondition )
            // InternalSpaml.g:2243:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_0_1_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_0_1_1_1"
    // InternalSpaml.g:2252:1: rule__Transition__ConditionsAssignment_0_0_1_1_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2256:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2257:2: ( ruleCondition )
            {
            // InternalSpaml.g:2257:2: ( ruleCondition )
            // InternalSpaml.g:2258:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_0_1_1_1"


    // $ANTLR start "rule__Transition__OperationAssignment_0_1_0"
    // InternalSpaml.g:2267:1: rule__Transition__OperationAssignment_0_1_0 : ( ruleOPERATION ) ;
    public final void rule__Transition__OperationAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2271:1: ( ( ruleOPERATION ) )
            // InternalSpaml.g:2272:2: ( ruleOPERATION )
            {
            // InternalSpaml.g:2272:2: ( ruleOPERATION )
            // InternalSpaml.g:2273:3: ruleOPERATION
            {
             before(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOPERATION();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OperationAssignment_0_1_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_1_2_0"
    // InternalSpaml.g:2282:1: rule__Transition__ConditionsAssignment_0_1_2_0 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2286:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2287:2: ( ruleCondition )
            {
            // InternalSpaml.g:2287:2: ( ruleCondition )
            // InternalSpaml.g:2288:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_1_2_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_1_2_1_1"
    // InternalSpaml.g:2297:1: rule__Transition__ConditionsAssignment_0_1_2_1_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2301:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2302:2: ( ruleCondition )
            {
            // InternalSpaml.g:2302:2: ( ruleCondition )
            // InternalSpaml.g:2303:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_1_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_1_2_1_1"


    // $ANTLR start "rule__Transition__NextAssignment_2"
    // InternalSpaml.g:2312:1: rule__Transition__NextAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2316:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2317:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2317:2: ( ( ruleEString ) )
            // InternalSpaml.g:2318:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_2_0()); 
            // InternalSpaml.g:2319:3: ( ruleEString )
            // InternalSpaml.g:2320:4: ruleEString
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


    // $ANTLR start "rule__TemporalCondition__DelayAssignment"
    // InternalSpaml.g:2331:1: rule__TemporalCondition__DelayAssignment : ( ruleEInt ) ;
    public final void rule__TemporalCondition__DelayAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2335:1: ( ( ruleEInt ) )
            // InternalSpaml.g:2336:2: ( ruleEInt )
            {
            // InternalSpaml.g:2336:2: ( ruleEInt )
            // InternalSpaml.g:2337:3: ruleEInt
            {
             before(grammarAccess.getTemporalConditionAccess().getDelayEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTemporalConditionAccess().getDelayEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalCondition__DelayAssignment"


    // $ANTLR start "rule__LogicalCondition__SensorAssignment_0"
    // InternalSpaml.g:2346:1: rule__LogicalCondition__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LogicalCondition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2350:1: ( ( ( RULE_ID ) ) )
            // InternalSpaml.g:2351:2: ( ( RULE_ID ) )
            {
            // InternalSpaml.g:2351:2: ( ( RULE_ID ) )
            // InternalSpaml.g:2352:3: ( RULE_ID )
            {
             before(grammarAccess.getLogicalConditionAccess().getSensorSensorCrossReference_0_0()); 
            // InternalSpaml.g:2353:3: ( RULE_ID )
            // InternalSpaml.g:2354:4: RULE_ID
            {
             before(grammarAccess.getLogicalConditionAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogicalConditionAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLogicalConditionAccess().getSensorSensorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__SensorAssignment_0"


    // $ANTLR start "rule__LogicalCondition__ValueAssignment_2"
    // InternalSpaml.g:2365:1: rule__LogicalCondition__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__LogicalCondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2369:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:2370:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:2370:2: ( ruleSIGNAL )
            // InternalSpaml.g:2371:3: ruleSIGNAL
            {
             before(grammarAccess.getLogicalConditionAccess().getValueSIGNALEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNAL();

            state._fsp--;

             after(grammarAccess.getLogicalConditionAccess().getValueSIGNALEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalCondition__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000230C00060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000230C00062L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000230000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000088000L});

}