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
    // InternalSpaml.g:337:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:341:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalSpaml.g:342:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalSpaml.g:342:2: ( ( rule__Condition__Group__0 ) )
            // InternalSpaml.g:343:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalSpaml.g:344:3: ( rule__Condition__Group__0 )
            // InternalSpaml.g:344:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "ruleSIGNAL"
    // InternalSpaml.g:353:1: ruleSIGNAL : ( ( rule__SIGNAL__Alternatives ) ) ;
    public final void ruleSIGNAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:357:1: ( ( ( rule__SIGNAL__Alternatives ) ) )
            // InternalSpaml.g:358:2: ( ( rule__SIGNAL__Alternatives ) )
            {
            // InternalSpaml.g:358:2: ( ( rule__SIGNAL__Alternatives ) )
            // InternalSpaml.g:359:3: ( rule__SIGNAL__Alternatives )
            {
             before(grammarAccess.getSIGNALAccess().getAlternatives()); 
            // InternalSpaml.g:360:3: ( rule__SIGNAL__Alternatives )
            // InternalSpaml.g:360:4: rule__SIGNAL__Alternatives
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
    // InternalSpaml.g:369:1: ruleOPERATION : ( ( rule__OPERATION__Alternatives ) ) ;
    public final void ruleOPERATION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:373:1: ( ( ( rule__OPERATION__Alternatives ) ) )
            // InternalSpaml.g:374:2: ( ( rule__OPERATION__Alternatives ) )
            {
            // InternalSpaml.g:374:2: ( ( rule__OPERATION__Alternatives ) )
            // InternalSpaml.g:375:3: ( rule__OPERATION__Alternatives )
            {
             before(grammarAccess.getOPERATIONAccess().getAlternatives()); 
            // InternalSpaml.g:376:3: ( rule__OPERATION__Alternatives )
            // InternalSpaml.g:376:4: rule__OPERATION__Alternatives
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
    // InternalSpaml.g:384:1: rule__Program__Alternatives_5 : ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) );
    public final void rule__Program__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:388:1: ( ( 'pluggedElements' ) | ( 'pluggedElements:' ) )
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
                    // InternalSpaml.g:389:2: ( 'pluggedElements' )
                    {
                    // InternalSpaml.g:389:2: ( 'pluggedElements' )
                    // InternalSpaml.g:390:3: 'pluggedElements'
                    {
                     before(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:395:2: ( 'pluggedElements:' )
                    {
                    // InternalSpaml.g:395:2: ( 'pluggedElements:' )
                    // InternalSpaml.g:396:3: 'pluggedElements:'
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
    // InternalSpaml.g:405:1: rule__Program__Alternatives_7 : ( ( 'states' ) | ( 'states:' ) );
    public final void rule__Program__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:409:1: ( ( 'states' ) | ( 'states:' ) )
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
                    // InternalSpaml.g:410:2: ( 'states' )
                    {
                    // InternalSpaml.g:410:2: ( 'states' )
                    // InternalSpaml.g:411:3: 'states'
                    {
                     before(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getStatesKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:416:2: ( 'states:' )
                    {
                    // InternalSpaml.g:416:2: ( 'states:' )
                    // InternalSpaml.g:417:3: 'states:'
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
    // InternalSpaml.g:426:1: rule__PluggedElement__Alternatives_0 : ( ( ruleActuator ) | ( ruleSensor ) );
    public final void rule__PluggedElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:430:1: ( ( ruleActuator ) | ( ruleSensor ) )
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
                    // InternalSpaml.g:431:2: ( ruleActuator )
                    {
                    // InternalSpaml.g:431:2: ( ruleActuator )
                    // InternalSpaml.g:432:3: ruleActuator
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
                    // InternalSpaml.g:437:2: ( ruleSensor )
                    {
                    // InternalSpaml.g:437:2: ( ruleSensor )
                    // InternalSpaml.g:438:3: ruleSensor
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
    // InternalSpaml.g:447:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:451:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSpaml.g:452:2: ( RULE_STRING )
                    {
                    // InternalSpaml.g:452:2: ( RULE_STRING )
                    // InternalSpaml.g:453:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:458:2: ( RULE_ID )
                    {
                    // InternalSpaml.g:458:2: ( RULE_ID )
                    // InternalSpaml.g:459:3: RULE_ID
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
    // InternalSpaml.g:468:1: rule__Sensor__Alternatives : ( ( ruleSensorDigital ) | ( ruleSensorAnalog ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:472:1: ( ( ruleSensorDigital ) | ( ruleSensorAnalog ) )
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
                    // InternalSpaml.g:473:2: ( ruleSensorDigital )
                    {
                    // InternalSpaml.g:473:2: ( ruleSensorDigital )
                    // InternalSpaml.g:474:3: ruleSensorDigital
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
                    // InternalSpaml.g:479:2: ( ruleSensorAnalog )
                    {
                    // InternalSpaml.g:479:2: ( ruleSensorAnalog )
                    // InternalSpaml.g:480:3: ruleSensorAnalog
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
    // InternalSpaml.g:489:1: rule__Action__Alternatives_1 : ( ( '=' ) | ( 'setTo' ) );
    public final void rule__Action__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:493:1: ( ( '=' ) | ( 'setTo' ) )
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
                    // InternalSpaml.g:494:2: ( '=' )
                    {
                    // InternalSpaml.g:494:2: ( '=' )
                    // InternalSpaml.g:495:3: '='
                    {
                     before(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:500:2: ( 'setTo' )
                    {
                    // InternalSpaml.g:500:2: ( 'setTo' )
                    // InternalSpaml.g:501:3: 'setTo'
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
    // InternalSpaml.g:510:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__DelayAssignment_0_1 ) ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:514:1: ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__DelayAssignment_0_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=22 && LA7_0<=23)||LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT||LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpaml.g:515:2: ( ( rule__Transition__Group_0_0__0 ) )
                    {
                    // InternalSpaml.g:515:2: ( ( rule__Transition__Group_0_0__0 ) )
                    // InternalSpaml.g:516:3: ( rule__Transition__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0()); 
                    // InternalSpaml.g:517:3: ( rule__Transition__Group_0_0__0 )
                    // InternalSpaml.g:517:4: rule__Transition__Group_0_0__0
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
                    // InternalSpaml.g:521:2: ( ( rule__Transition__DelayAssignment_0_1 ) )
                    {
                    // InternalSpaml.g:521:2: ( ( rule__Transition__DelayAssignment_0_1 ) )
                    // InternalSpaml.g:522:3: ( rule__Transition__DelayAssignment_0_1 )
                    {
                     before(grammarAccess.getTransitionAccess().getDelayAssignment_0_1()); 
                    // InternalSpaml.g:523:3: ( rule__Transition__DelayAssignment_0_1 )
                    // InternalSpaml.g:523:4: rule__Transition__DelayAssignment_0_1
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


    // $ANTLR start "rule__Transition__Alternatives_0_0_1"
    // InternalSpaml.g:531:1: rule__Transition__Alternatives_0_0_1 : ( ( ( rule__Transition__Group_0_0_1_0__0 ) ) | ( ( rule__Transition__Group_0_0_1_1__0 ) ) );
    public final void rule__Transition__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:535:1: ( ( ( rule__Transition__Group_0_0_1_0__0 ) ) | ( ( rule__Transition__Group_0_0_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpaml.g:536:2: ( ( rule__Transition__Group_0_0_1_0__0 ) )
                    {
                    // InternalSpaml.g:536:2: ( ( rule__Transition__Group_0_0_1_0__0 ) )
                    // InternalSpaml.g:537:3: ( rule__Transition__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0_1_0()); 
                    // InternalSpaml.g:538:3: ( rule__Transition__Group_0_0_1_0__0 )
                    // InternalSpaml.g:538:4: rule__Transition__Group_0_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:542:2: ( ( rule__Transition__Group_0_0_1_1__0 ) )
                    {
                    // InternalSpaml.g:542:2: ( ( rule__Transition__Group_0_0_1_1__0 ) )
                    // InternalSpaml.g:543:3: ( rule__Transition__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0_1_1()); 
                    // InternalSpaml.g:544:3: ( rule__Transition__Group_0_0_1_1__0 )
                    // InternalSpaml.g:544:4: rule__Transition__Group_0_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0_1_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_0_0_1"


    // $ANTLR start "rule__Transition__Alternatives_1"
    // InternalSpaml.g:552:1: rule__Transition__Alternatives_1 : ( ( '->' ) | ( 'then' ) );
    public final void rule__Transition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:556:1: ( ( '->' ) | ( 'then' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpaml.g:557:2: ( '->' )
                    {
                    // InternalSpaml.g:557:2: ( '->' )
                    // InternalSpaml.g:558:3: '->'
                    {
                     before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:563:2: ( 'then' )
                    {
                    // InternalSpaml.g:563:2: ( 'then' )
                    // InternalSpaml.g:564:3: 'then'
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


    // $ANTLR start "rule__Condition__Alternatives_1"
    // InternalSpaml.g:573:1: rule__Condition__Alternatives_1 : ( ( '=' ) | ( 'is' ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:577:1: ( ( '=' ) | ( 'is' ) )
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
                    // InternalSpaml.g:578:2: ( '=' )
                    {
                    // InternalSpaml.g:578:2: ( '=' )
                    // InternalSpaml.g:579:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:584:2: ( 'is' )
                    {
                    // InternalSpaml.g:584:2: ( 'is' )
                    // InternalSpaml.g:585:3: 'is'
                    {
                     before(grammarAccess.getConditionAccess().getIsKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIsKeyword_1_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives_1"


    // $ANTLR start "rule__SIGNAL__Alternatives"
    // InternalSpaml.g:594:1: rule__SIGNAL__Alternatives : ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) );
    public final void rule__SIGNAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:598:1: ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) )
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
                    // InternalSpaml.g:599:2: ( ( 'LOW' ) )
                    {
                    // InternalSpaml.g:599:2: ( ( 'LOW' ) )
                    // InternalSpaml.g:600:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:601:3: ( 'LOW' )
                    // InternalSpaml.g:601:4: 'LOW'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:605:2: ( ( 'HIGH' ) )
                    {
                    // InternalSpaml.g:605:2: ( ( 'HIGH' ) )
                    // InternalSpaml.g:606:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:607:3: ( 'HIGH' )
                    // InternalSpaml.g:607:4: 'HIGH'
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
    // InternalSpaml.g:615:1: rule__OPERATION__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__OPERATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:619:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
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
                    // InternalSpaml.g:620:2: ( ( 'AND' ) )
                    {
                    // InternalSpaml.g:620:2: ( ( 'AND' ) )
                    // InternalSpaml.g:621:3: ( 'AND' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:622:3: ( 'AND' )
                    // InternalSpaml.g:622:4: 'AND'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:626:2: ( ( 'OR' ) )
                    {
                    // InternalSpaml.g:626:2: ( ( 'OR' ) )
                    // InternalSpaml.g:627:3: ( 'OR' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:628:3: ( 'OR' )
                    // InternalSpaml.g:628:4: 'OR'
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
    // InternalSpaml.g:636:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:640:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSpaml.g:641:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalSpaml.g:648:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:652:1: ( ( 'Program' ) )
            // InternalSpaml.g:653:1: ( 'Program' )
            {
            // InternalSpaml.g:653:1: ( 'Program' )
            // InternalSpaml.g:654:2: 'Program'
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
    // InternalSpaml.g:663:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:667:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSpaml.g:668:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalSpaml.g:675:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:679:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSpaml.g:680:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSpaml.g:680:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSpaml.g:681:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSpaml.g:682:2: ( rule__Program__NameAssignment_1 )
            // InternalSpaml.g:682:3: rule__Program__NameAssignment_1
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
    // InternalSpaml.g:690:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:694:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSpaml.g:695:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalSpaml.g:702:1: rule__Program__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:706:1: ( ( 'initialState' ) )
            // InternalSpaml.g:707:1: ( 'initialState' )
            {
            // InternalSpaml.g:707:1: ( 'initialState' )
            // InternalSpaml.g:708:2: 'initialState'
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
    // InternalSpaml.g:717:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:721:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSpaml.g:722:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalSpaml.g:729:1: rule__Program__Group__3__Impl : ( ( rule__Program__InitialStateAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:733:1: ( ( ( rule__Program__InitialStateAssignment_3 ) ) )
            // InternalSpaml.g:734:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            {
            // InternalSpaml.g:734:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            // InternalSpaml.g:735:2: ( rule__Program__InitialStateAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getInitialStateAssignment_3()); 
            // InternalSpaml.g:736:2: ( rule__Program__InitialStateAssignment_3 )
            // InternalSpaml.g:736:3: rule__Program__InitialStateAssignment_3
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
    // InternalSpaml.g:744:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:748:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalSpaml.g:749:2: rule__Program__Group__4__Impl rule__Program__Group__5
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
    // InternalSpaml.g:756:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:760:1: ( ( '{' ) )
            // InternalSpaml.g:761:1: ( '{' )
            {
            // InternalSpaml.g:761:1: ( '{' )
            // InternalSpaml.g:762:2: '{'
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
    // InternalSpaml.g:771:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:775:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalSpaml.g:776:2: rule__Program__Group__5__Impl rule__Program__Group__6
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
    // InternalSpaml.g:783:1: rule__Program__Group__5__Impl : ( ( rule__Program__Alternatives_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:787:1: ( ( ( rule__Program__Alternatives_5 ) ) )
            // InternalSpaml.g:788:1: ( ( rule__Program__Alternatives_5 ) )
            {
            // InternalSpaml.g:788:1: ( ( rule__Program__Alternatives_5 ) )
            // InternalSpaml.g:789:2: ( rule__Program__Alternatives_5 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_5()); 
            // InternalSpaml.g:790:2: ( rule__Program__Alternatives_5 )
            // InternalSpaml.g:790:3: rule__Program__Alternatives_5
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
    // InternalSpaml.g:798:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:802:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalSpaml.g:803:2: rule__Program__Group__6__Impl rule__Program__Group__7
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
    // InternalSpaml.g:810:1: rule__Program__Group__6__Impl : ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:814:1: ( ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) )
            // InternalSpaml.g:815:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            {
            // InternalSpaml.g:815:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            // InternalSpaml.g:816:2: ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* )
            {
            // InternalSpaml.g:816:2: ( ( rule__Program__PluggedElementsAssignment_6 ) )
            // InternalSpaml.g:817:3: ( rule__Program__PluggedElementsAssignment_6 )
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:818:3: ( rule__Program__PluggedElementsAssignment_6 )
            // InternalSpaml.g:818:4: rule__Program__PluggedElementsAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__Program__PluggedElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 

            }

            // InternalSpaml.g:821:2: ( ( rule__Program__PluggedElementsAssignment_6 )* )
            // InternalSpaml.g:822:3: ( rule__Program__PluggedElementsAssignment_6 )*
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:823:3: ( rule__Program__PluggedElementsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpaml.g:823:4: rule__Program__PluggedElementsAssignment_6
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
    // InternalSpaml.g:832:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:836:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalSpaml.g:837:2: rule__Program__Group__7__Impl rule__Program__Group__8
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
    // InternalSpaml.g:844:1: rule__Program__Group__7__Impl : ( ( rule__Program__Alternatives_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:848:1: ( ( ( rule__Program__Alternatives_7 ) ) )
            // InternalSpaml.g:849:1: ( ( rule__Program__Alternatives_7 ) )
            {
            // InternalSpaml.g:849:1: ( ( rule__Program__Alternatives_7 ) )
            // InternalSpaml.g:850:2: ( rule__Program__Alternatives_7 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_7()); 
            // InternalSpaml.g:851:2: ( rule__Program__Alternatives_7 )
            // InternalSpaml.g:851:3: rule__Program__Alternatives_7
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
    // InternalSpaml.g:859:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:863:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalSpaml.g:864:2: rule__Program__Group__8__Impl rule__Program__Group__9
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
    // InternalSpaml.g:871:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:875:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // InternalSpaml.g:876:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // InternalSpaml.g:876:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // InternalSpaml.g:877:2: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // InternalSpaml.g:877:2: ( ( rule__Program__StatesAssignment_8 ) )
            // InternalSpaml.g:878:3: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:879:3: ( rule__Program__StatesAssignment_8 )
            // InternalSpaml.g:879:4: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__Program__StatesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // InternalSpaml.g:882:2: ( ( rule__Program__StatesAssignment_8 )* )
            // InternalSpaml.g:883:3: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:884:3: ( rule__Program__StatesAssignment_8 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSpaml.g:884:4: rule__Program__StatesAssignment_8
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
    // InternalSpaml.g:893:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:897:1: ( rule__Program__Group__9__Impl )
            // InternalSpaml.g:898:2: rule__Program__Group__9__Impl
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
    // InternalSpaml.g:904:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:908:1: ( ( '}' ) )
            // InternalSpaml.g:909:1: ( '}' )
            {
            // InternalSpaml.g:909:1: ( '}' )
            // InternalSpaml.g:910:2: '}'
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
    // InternalSpaml.g:920:1: rule__PluggedElement__Group__0 : rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 ;
    public final void rule__PluggedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:924:1: ( rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 )
            // InternalSpaml.g:925:2: rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1
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
    // InternalSpaml.g:932:1: rule__PluggedElement__Group__0__Impl : ( ( rule__PluggedElement__Alternatives_0 ) ) ;
    public final void rule__PluggedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:936:1: ( ( ( rule__PluggedElement__Alternatives_0 ) ) )
            // InternalSpaml.g:937:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            {
            // InternalSpaml.g:937:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            // InternalSpaml.g:938:2: ( rule__PluggedElement__Alternatives_0 )
            {
             before(grammarAccess.getPluggedElementAccess().getAlternatives_0()); 
            // InternalSpaml.g:939:2: ( rule__PluggedElement__Alternatives_0 )
            // InternalSpaml.g:939:3: rule__PluggedElement__Alternatives_0
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
    // InternalSpaml.g:947:1: rule__PluggedElement__Group__1 : rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 ;
    public final void rule__PluggedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:951:1: ( rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 )
            // InternalSpaml.g:952:2: rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2
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
    // InternalSpaml.g:959:1: rule__PluggedElement__Group__1__Impl : ( ( rule__PluggedElement__NameAssignment_1 ) ) ;
    public final void rule__PluggedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:963:1: ( ( ( rule__PluggedElement__NameAssignment_1 ) ) )
            // InternalSpaml.g:964:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            {
            // InternalSpaml.g:964:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            // InternalSpaml.g:965:2: ( rule__PluggedElement__NameAssignment_1 )
            {
             before(grammarAccess.getPluggedElementAccess().getNameAssignment_1()); 
            // InternalSpaml.g:966:2: ( rule__PluggedElement__NameAssignment_1 )
            // InternalSpaml.g:966:3: rule__PluggedElement__NameAssignment_1
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
    // InternalSpaml.g:974:1: rule__PluggedElement__Group__2 : rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 ;
    public final void rule__PluggedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:978:1: ( rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 )
            // InternalSpaml.g:979:2: rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3
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
    // InternalSpaml.g:986:1: rule__PluggedElement__Group__2__Impl : ( ( 'onPin' )? ) ;
    public final void rule__PluggedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:990:1: ( ( ( 'onPin' )? ) )
            // InternalSpaml.g:991:1: ( ( 'onPin' )? )
            {
            // InternalSpaml.g:991:1: ( ( 'onPin' )? )
            // InternalSpaml.g:992:2: ( 'onPin' )?
            {
             before(grammarAccess.getPluggedElementAccess().getOnPinKeyword_2()); 
            // InternalSpaml.g:993:2: ( 'onPin' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpaml.g:993:3: 'onPin'
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
    // InternalSpaml.g:1001:1: rule__PluggedElement__Group__3 : rule__PluggedElement__Group__3__Impl ;
    public final void rule__PluggedElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1005:1: ( rule__PluggedElement__Group__3__Impl )
            // InternalSpaml.g:1006:2: rule__PluggedElement__Group__3__Impl
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
    // InternalSpaml.g:1012:1: rule__PluggedElement__Group__3__Impl : ( ( rule__PluggedElement__PinAssignment_3 ) ) ;
    public final void rule__PluggedElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1016:1: ( ( ( rule__PluggedElement__PinAssignment_3 ) ) )
            // InternalSpaml.g:1017:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            {
            // InternalSpaml.g:1017:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            // InternalSpaml.g:1018:2: ( rule__PluggedElement__PinAssignment_3 )
            {
             before(grammarAccess.getPluggedElementAccess().getPinAssignment_3()); 
            // InternalSpaml.g:1019:2: ( rule__PluggedElement__PinAssignment_3 )
            // InternalSpaml.g:1019:3: rule__PluggedElement__PinAssignment_3
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
    // InternalSpaml.g:1028:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1032:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSpaml.g:1033:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalSpaml.g:1040:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1044:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalSpaml.g:1045:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalSpaml.g:1045:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalSpaml.g:1046:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalSpaml.g:1047:2: ( rule__State__NameAssignment_0 )
            // InternalSpaml.g:1047:3: rule__State__NameAssignment_0
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
    // InternalSpaml.g:1055:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1059:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSpaml.g:1060:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalSpaml.g:1067:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1071:1: ( ( '{' ) )
            // InternalSpaml.g:1072:1: ( '{' )
            {
            // InternalSpaml.g:1072:1: ( '{' )
            // InternalSpaml.g:1073:2: '{'
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
    // InternalSpaml.g:1082:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1086:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSpaml.g:1087:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalSpaml.g:1094:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1098:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalSpaml.g:1099:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalSpaml.g:1099:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalSpaml.g:1100:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalSpaml.g:1101:2: ( rule__State__ActionsAssignment_2 )
            // InternalSpaml.g:1101:3: rule__State__ActionsAssignment_2
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
    // InternalSpaml.g:1109:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1113:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSpaml.g:1114:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalSpaml.g:1121:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1125:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalSpaml.g:1126:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalSpaml.g:1126:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalSpaml.g:1127:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalSpaml.g:1128:2: ( rule__State__ActionsAssignment_3 )*
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
            	    // InternalSpaml.g:1128:3: rule__State__ActionsAssignment_3
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
    // InternalSpaml.g:1136:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1140:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalSpaml.g:1141:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalSpaml.g:1148:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1152:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalSpaml.g:1153:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalSpaml.g:1153:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalSpaml.g:1154:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalSpaml.g:1155:2: ( rule__State__TransitionAssignment_4 )
            // InternalSpaml.g:1155:3: rule__State__TransitionAssignment_4
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
    // InternalSpaml.g:1163:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1167:1: ( rule__State__Group__5__Impl )
            // InternalSpaml.g:1168:2: rule__State__Group__5__Impl
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
    // InternalSpaml.g:1174:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1178:1: ( ( '}' ) )
            // InternalSpaml.g:1179:1: ( '}' )
            {
            // InternalSpaml.g:1179:1: ( '}' )
            // InternalSpaml.g:1180:2: '}'
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
    // InternalSpaml.g:1190:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1194:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSpaml.g:1195:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSpaml.g:1202:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1206:1: ( ( ( '-' )? ) )
            // InternalSpaml.g:1207:1: ( ( '-' )? )
            {
            // InternalSpaml.g:1207:1: ( ( '-' )? )
            // InternalSpaml.g:1208:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSpaml.g:1209:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpaml.g:1209:3: '-'
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
    // InternalSpaml.g:1217:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1221:1: ( rule__EInt__Group__1__Impl )
            // InternalSpaml.g:1222:2: rule__EInt__Group__1__Impl
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
    // InternalSpaml.g:1228:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1232:1: ( ( RULE_INT ) )
            // InternalSpaml.g:1233:1: ( RULE_INT )
            {
            // InternalSpaml.g:1233:1: ( RULE_INT )
            // InternalSpaml.g:1234:2: RULE_INT
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
    // InternalSpaml.g:1244:1: rule__SensorDigital__Group__0 : rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1 ;
    public final void rule__SensorDigital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1248:1: ( rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1 )
            // InternalSpaml.g:1249:2: rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSpaml.g:1256:1: rule__SensorDigital__Group__0__Impl : ( () ) ;
    public final void rule__SensorDigital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1260:1: ( ( () ) )
            // InternalSpaml.g:1261:1: ( () )
            {
            // InternalSpaml.g:1261:1: ( () )
            // InternalSpaml.g:1262:2: ()
            {
             before(grammarAccess.getSensorDigitalAccess().getSensorDigitalAction_0()); 
            // InternalSpaml.g:1263:2: ()
            // InternalSpaml.g:1263:3: 
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
    // InternalSpaml.g:1271:1: rule__SensorDigital__Group__1 : rule__SensorDigital__Group__1__Impl ;
    public final void rule__SensorDigital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1275:1: ( rule__SensorDigital__Group__1__Impl )
            // InternalSpaml.g:1276:2: rule__SensorDigital__Group__1__Impl
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
    // InternalSpaml.g:1282:1: rule__SensorDigital__Group__1__Impl : ( 'SensorDigital' ) ;
    public final void rule__SensorDigital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1286:1: ( ( 'SensorDigital' ) )
            // InternalSpaml.g:1287:1: ( 'SensorDigital' )
            {
            // InternalSpaml.g:1287:1: ( 'SensorDigital' )
            // InternalSpaml.g:1288:2: 'SensorDigital'
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
    // InternalSpaml.g:1298:1: rule__SensorAnalog__Group__0 : rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1 ;
    public final void rule__SensorAnalog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1302:1: ( rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1 )
            // InternalSpaml.g:1303:2: rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1
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
    // InternalSpaml.g:1310:1: rule__SensorAnalog__Group__0__Impl : ( () ) ;
    public final void rule__SensorAnalog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1314:1: ( ( () ) )
            // InternalSpaml.g:1315:1: ( () )
            {
            // InternalSpaml.g:1315:1: ( () )
            // InternalSpaml.g:1316:2: ()
            {
             before(grammarAccess.getSensorAnalogAccess().getSensorAnalogAction_0()); 
            // InternalSpaml.g:1317:2: ()
            // InternalSpaml.g:1317:3: 
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
    // InternalSpaml.g:1325:1: rule__SensorAnalog__Group__1 : rule__SensorAnalog__Group__1__Impl ;
    public final void rule__SensorAnalog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1329:1: ( rule__SensorAnalog__Group__1__Impl )
            // InternalSpaml.g:1330:2: rule__SensorAnalog__Group__1__Impl
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
    // InternalSpaml.g:1336:1: rule__SensorAnalog__Group__1__Impl : ( 'SensorAnalog' ) ;
    public final void rule__SensorAnalog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1340:1: ( ( 'SensorAnalog' ) )
            // InternalSpaml.g:1341:1: ( 'SensorAnalog' )
            {
            // InternalSpaml.g:1341:1: ( 'SensorAnalog' )
            // InternalSpaml.g:1342:2: 'SensorAnalog'
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
    // InternalSpaml.g:1352:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1356:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalSpaml.g:1357:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSpaml.g:1364:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1368:1: ( ( () ) )
            // InternalSpaml.g:1369:1: ( () )
            {
            // InternalSpaml.g:1369:1: ( () )
            // InternalSpaml.g:1370:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalSpaml.g:1371:2: ()
            // InternalSpaml.g:1371:3: 
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
    // InternalSpaml.g:1379:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1383:1: ( rule__Actuator__Group__1__Impl )
            // InternalSpaml.g:1384:2: rule__Actuator__Group__1__Impl
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
    // InternalSpaml.g:1390:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1394:1: ( ( 'Actuator' ) )
            // InternalSpaml.g:1395:1: ( 'Actuator' )
            {
            // InternalSpaml.g:1395:1: ( 'Actuator' )
            // InternalSpaml.g:1396:2: 'Actuator'
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
    // InternalSpaml.g:1406:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1410:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSpaml.g:1411:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSpaml.g:1418:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1422:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalSpaml.g:1423:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalSpaml.g:1423:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalSpaml.g:1424:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalSpaml.g:1425:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalSpaml.g:1425:3: rule__Action__ActuatorAssignment_0
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
    // InternalSpaml.g:1433:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1437:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSpaml.g:1438:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSpaml.g:1445:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1449:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalSpaml.g:1450:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalSpaml.g:1450:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalSpaml.g:1451:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1452:2: ( rule__Action__Alternatives_1 )
            // InternalSpaml.g:1452:3: rule__Action__Alternatives_1
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
    // InternalSpaml.g:1460:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1464:1: ( rule__Action__Group__2__Impl )
            // InternalSpaml.g:1465:2: rule__Action__Group__2__Impl
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
    // InternalSpaml.g:1471:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1475:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1476:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1476:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalSpaml.g:1477:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1478:2: ( rule__Action__ValueAssignment_2 )
            // InternalSpaml.g:1478:3: rule__Action__ValueAssignment_2
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
    // InternalSpaml.g:1487:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1491:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSpaml.g:1492:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSpaml.g:1499:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1503:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalSpaml.g:1504:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalSpaml.g:1504:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalSpaml.g:1505:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalSpaml.g:1506:2: ( rule__Transition__Alternatives_0 )
            // InternalSpaml.g:1506:3: rule__Transition__Alternatives_0
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
    // InternalSpaml.g:1514:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1518:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSpaml.g:1519:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalSpaml.g:1526:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Alternatives_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1530:1: ( ( ( rule__Transition__Alternatives_1 ) ) )
            // InternalSpaml.g:1531:1: ( ( rule__Transition__Alternatives_1 ) )
            {
            // InternalSpaml.g:1531:1: ( ( rule__Transition__Alternatives_1 ) )
            // InternalSpaml.g:1532:2: ( rule__Transition__Alternatives_1 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1533:2: ( rule__Transition__Alternatives_1 )
            // InternalSpaml.g:1533:3: rule__Transition__Alternatives_1
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
    // InternalSpaml.g:1541:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1545:1: ( rule__Transition__Group__2__Impl )
            // InternalSpaml.g:1546:2: rule__Transition__Group__2__Impl
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
    // InternalSpaml.g:1552:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NextAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1556:1: ( ( ( rule__Transition__NextAssignment_2 ) ) )
            // InternalSpaml.g:1557:1: ( ( rule__Transition__NextAssignment_2 ) )
            {
            // InternalSpaml.g:1557:1: ( ( rule__Transition__NextAssignment_2 ) )
            // InternalSpaml.g:1558:2: ( rule__Transition__NextAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_2()); 
            // InternalSpaml.g:1559:2: ( rule__Transition__NextAssignment_2 )
            // InternalSpaml.g:1559:3: rule__Transition__NextAssignment_2
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
    // InternalSpaml.g:1568:1: rule__Transition__Group_0_0__0 : rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 ;
    public final void rule__Transition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1572:1: ( rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 )
            // InternalSpaml.g:1573:2: rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpaml.g:1580:1: rule__Transition__Group_0_0__0__Impl : ( ( 'when' )? ) ;
    public final void rule__Transition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1584:1: ( ( ( 'when' )? ) )
            // InternalSpaml.g:1585:1: ( ( 'when' )? )
            {
            // InternalSpaml.g:1585:1: ( ( 'when' )? )
            // InternalSpaml.g:1586:2: ( 'when' )?
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0()); 
            // InternalSpaml.g:1587:2: ( 'when' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpaml.g:1587:3: 'when'
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
    // InternalSpaml.g:1595:1: rule__Transition__Group_0_0__1 : rule__Transition__Group_0_0__1__Impl ;
    public final void rule__Transition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1599:1: ( rule__Transition__Group_0_0__1__Impl )
            // InternalSpaml.g:1600:2: rule__Transition__Group_0_0__1__Impl
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
    // InternalSpaml.g:1606:1: rule__Transition__Group_0_0__1__Impl : ( ( rule__Transition__Alternatives_0_0_1 ) ) ;
    public final void rule__Transition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1610:1: ( ( ( rule__Transition__Alternatives_0_0_1 ) ) )
            // InternalSpaml.g:1611:1: ( ( rule__Transition__Alternatives_0_0_1 ) )
            {
            // InternalSpaml.g:1611:1: ( ( rule__Transition__Alternatives_0_0_1 ) )
            // InternalSpaml.g:1612:2: ( rule__Transition__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0_0_1()); 
            // InternalSpaml.g:1613:2: ( rule__Transition__Alternatives_0_0_1 )
            // InternalSpaml.g:1613:3: rule__Transition__Alternatives_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_0_0_1_0__0"
    // InternalSpaml.g:1622:1: rule__Transition__Group_0_0_1_0__0 : rule__Transition__Group_0_0_1_0__0__Impl rule__Transition__Group_0_0_1_0__1 ;
    public final void rule__Transition__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1626:1: ( rule__Transition__Group_0_0_1_0__0__Impl rule__Transition__Group_0_0_1_0__1 )
            // InternalSpaml.g:1627:2: rule__Transition__Group_0_0_1_0__0__Impl rule__Transition__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_0_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__0"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__0__Impl"
    // InternalSpaml.g:1634:1: rule__Transition__Group_0_0_1_0__0__Impl : ( ( rule__Transition__ConditionsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__Transition__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1638:1: ( ( ( rule__Transition__ConditionsAssignment_0_0_1_0_0 ) ) )
            // InternalSpaml.g:1639:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_0_0 ) )
            {
            // InternalSpaml.g:1639:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_0_0 ) )
            // InternalSpaml.g:1640:2: ( rule__Transition__ConditionsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_0_0()); 
            // InternalSpaml.g:1641:2: ( rule__Transition__ConditionsAssignment_0_0_1_0_0 )
            // InternalSpaml.g:1641:3: rule__Transition__ConditionsAssignment_0_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__1"
    // InternalSpaml.g:1649:1: rule__Transition__Group_0_0_1_0__1 : rule__Transition__Group_0_0_1_0__1__Impl ;
    public final void rule__Transition__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1653:1: ( rule__Transition__Group_0_0_1_0__1__Impl )
            // InternalSpaml.g:1654:2: rule__Transition__Group_0_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__1"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__1__Impl"
    // InternalSpaml.g:1660:1: rule__Transition__Group_0_0_1_0__1__Impl : ( ( rule__Transition__Group_0_0_1_0_1__0 )* ) ;
    public final void rule__Transition__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1664:1: ( ( ( rule__Transition__Group_0_0_1_0_1__0 )* ) )
            // InternalSpaml.g:1665:1: ( ( rule__Transition__Group_0_0_1_0_1__0 )* )
            {
            // InternalSpaml.g:1665:1: ( ( rule__Transition__Group_0_0_1_0_1__0 )* )
            // InternalSpaml.g:1666:2: ( rule__Transition__Group_0_0_1_0_1__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_1_0_1()); 
            // InternalSpaml.g:1667:2: ( rule__Transition__Group_0_0_1_0_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSpaml.g:1667:3: rule__Transition__Group_0_0_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Transition__Group_0_0_1_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_0_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_0_1__0"
    // InternalSpaml.g:1676:1: rule__Transition__Group_0_0_1_0_1__0 : rule__Transition__Group_0_0_1_0_1__0__Impl rule__Transition__Group_0_0_1_0_1__1 ;
    public final void rule__Transition__Group_0_0_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1680:1: ( rule__Transition__Group_0_0_1_0_1__0__Impl rule__Transition__Group_0_0_1_0_1__1 )
            // InternalSpaml.g:1681:2: rule__Transition__Group_0_0_1_0_1__0__Impl rule__Transition__Group_0_0_1_0_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Transition__Group_0_0_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0_1__0"


    // $ANTLR start "rule__Transition__Group_0_0_1_0_1__0__Impl"
    // InternalSpaml.g:1688:1: rule__Transition__Group_0_0_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_0_0_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1692:1: ( ( ',' ) )
            // InternalSpaml.g:1693:1: ( ',' )
            {
            // InternalSpaml.g:1693:1: ( ',' )
            // InternalSpaml.g:1694:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_0_0_1_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_0_0_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_0_1__1"
    // InternalSpaml.g:1703:1: rule__Transition__Group_0_0_1_0_1__1 : rule__Transition__Group_0_0_1_0_1__1__Impl ;
    public final void rule__Transition__Group_0_0_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1707:1: ( rule__Transition__Group_0_0_1_0_1__1__Impl )
            // InternalSpaml.g:1708:2: rule__Transition__Group_0_0_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0_1__1"


    // $ANTLR start "rule__Transition__Group_0_0_1_0_1__1__Impl"
    // InternalSpaml.g:1714:1: rule__Transition__Group_0_0_1_0_1__1__Impl : ( ( rule__Transition__ConditionsAssignment_0_0_1_0_1_1 ) ) ;
    public final void rule__Transition__Group_0_0_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1718:1: ( ( ( rule__Transition__ConditionsAssignment_0_0_1_0_1_1 ) ) )
            // InternalSpaml.g:1719:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_0_1_1 ) )
            {
            // InternalSpaml.g:1719:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_0_1_1 ) )
            // InternalSpaml.g:1720:2: ( rule__Transition__ConditionsAssignment_0_0_1_0_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_0_1_1()); 
            // InternalSpaml.g:1721:2: ( rule__Transition__ConditionsAssignment_0_0_1_0_1_1 )
            // InternalSpaml.g:1721:3: rule__Transition__ConditionsAssignment_0_0_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_0_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__0"
    // InternalSpaml.g:1730:1: rule__Transition__Group_0_0_1_1__0 : rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1 ;
    public final void rule__Transition__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1734:1: ( rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1 )
            // InternalSpaml.g:1735:2: rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSpaml.g:1742:1: rule__Transition__Group_0_0_1_1__0__Impl : ( ( rule__Transition__OperationAssignment_0_0_1_1_0 ) ) ;
    public final void rule__Transition__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1746:1: ( ( ( rule__Transition__OperationAssignment_0_0_1_1_0 ) ) )
            // InternalSpaml.g:1747:1: ( ( rule__Transition__OperationAssignment_0_0_1_1_0 ) )
            {
            // InternalSpaml.g:1747:1: ( ( rule__Transition__OperationAssignment_0_0_1_1_0 ) )
            // InternalSpaml.g:1748:2: ( rule__Transition__OperationAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getOperationAssignment_0_0_1_1_0()); 
            // InternalSpaml.g:1749:2: ( rule__Transition__OperationAssignment_0_0_1_1_0 )
            // InternalSpaml.g:1749:3: rule__Transition__OperationAssignment_0_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__OperationAssignment_0_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOperationAssignment_0_0_1_1_0()); 

            }


            }

        }
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
    // InternalSpaml.g:1757:1: rule__Transition__Group_0_0_1_1__1 : rule__Transition__Group_0_0_1_1__1__Impl rule__Transition__Group_0_0_1_1__2 ;
    public final void rule__Transition__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1761:1: ( rule__Transition__Group_0_0_1_1__1__Impl rule__Transition__Group_0_0_1_1__2 )
            // InternalSpaml.g:1762:2: rule__Transition__Group_0_0_1_1__1__Impl rule__Transition__Group_0_0_1_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Transition__Group_0_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__2();

            state._fsp--;


            }

        }
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
    // InternalSpaml.g:1769:1: rule__Transition__Group_0_0_1_1__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1773:1: ( ( '(' ) )
            // InternalSpaml.g:1774:1: ( '(' )
            {
            // InternalSpaml.g:1774:1: ( '(' )
            // InternalSpaml.g:1775:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_0_0_1_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_0_0_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_0_0_1_1__2"
    // InternalSpaml.g:1784:1: rule__Transition__Group_0_0_1_1__2 : rule__Transition__Group_0_0_1_1__2__Impl rule__Transition__Group_0_0_1_1__3 ;
    public final void rule__Transition__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1788:1: ( rule__Transition__Group_0_0_1_1__2__Impl rule__Transition__Group_0_0_1_1__3 )
            // InternalSpaml.g:1789:2: rule__Transition__Group_0_0_1_1__2__Impl rule__Transition__Group_0_0_1_1__3
            {
            pushFollow(FOLLOW_24);
            rule__Transition__Group_0_0_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__2"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__2__Impl"
    // InternalSpaml.g:1796:1: rule__Transition__Group_0_0_1_1__2__Impl : ( ( rule__Transition__Group_0_0_1_1_2__0 ) ) ;
    public final void rule__Transition__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1800:1: ( ( ( rule__Transition__Group_0_0_1_1_2__0 ) ) )
            // InternalSpaml.g:1801:1: ( ( rule__Transition__Group_0_0_1_1_2__0 ) )
            {
            // InternalSpaml.g:1801:1: ( ( rule__Transition__Group_0_0_1_1_2__0 ) )
            // InternalSpaml.g:1802:2: ( rule__Transition__Group_0_0_1_1_2__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_1_1_2()); 
            // InternalSpaml.g:1803:2: ( rule__Transition__Group_0_0_1_1_2__0 )
            // InternalSpaml.g:1803:3: rule__Transition__Group_0_0_1_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup_0_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__3"
    // InternalSpaml.g:1811:1: rule__Transition__Group_0_0_1_1__3 : rule__Transition__Group_0_0_1_1__3__Impl ;
    public final void rule__Transition__Group_0_0_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1815:1: ( rule__Transition__Group_0_0_1_1__3__Impl )
            // InternalSpaml.g:1816:2: rule__Transition__Group_0_0_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__3"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__3__Impl"
    // InternalSpaml.g:1822:1: rule__Transition__Group_0_0_1_1__3__Impl : ( ')' ) ;
    public final void rule__Transition__Group_0_0_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1826:1: ( ( ')' ) )
            // InternalSpaml.g:1827:1: ( ')' )
            {
            // InternalSpaml.g:1827:1: ( ')' )
            // InternalSpaml.g:1828:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_0_0_1_1_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_0_0_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__3__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2__0"
    // InternalSpaml.g:1838:1: rule__Transition__Group_0_0_1_1_2__0 : rule__Transition__Group_0_0_1_1_2__0__Impl rule__Transition__Group_0_0_1_1_2__1 ;
    public final void rule__Transition__Group_0_0_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1842:1: ( rule__Transition__Group_0_0_1_1_2__0__Impl rule__Transition__Group_0_0_1_1_2__1 )
            // InternalSpaml.g:1843:2: rule__Transition__Group_0_0_1_1_2__0__Impl rule__Transition__Group_0_0_1_1_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_0_0_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2__0"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2__0__Impl"
    // InternalSpaml.g:1850:1: rule__Transition__Group_0_0_1_1_2__0__Impl : ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_0 ) ) ;
    public final void rule__Transition__Group_0_0_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1854:1: ( ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_0 ) ) )
            // InternalSpaml.g:1855:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_0 ) )
            {
            // InternalSpaml.g:1855:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_0 ) )
            // InternalSpaml.g:1856:2: ( rule__Transition__ConditionsAssignment_0_0_1_1_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_1_2_0()); 
            // InternalSpaml.g:1857:2: ( rule__Transition__ConditionsAssignment_0_0_1_1_2_0 )
            // InternalSpaml.g:1857:3: rule__Transition__ConditionsAssignment_0_0_1_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_0_1_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2__1"
    // InternalSpaml.g:1865:1: rule__Transition__Group_0_0_1_1_2__1 : rule__Transition__Group_0_0_1_1_2__1__Impl ;
    public final void rule__Transition__Group_0_0_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1869:1: ( rule__Transition__Group_0_0_1_1_2__1__Impl )
            // InternalSpaml.g:1870:2: rule__Transition__Group_0_0_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2__1"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2__1__Impl"
    // InternalSpaml.g:1876:1: rule__Transition__Group_0_0_1_1_2__1__Impl : ( ( rule__Transition__Group_0_0_1_1_2_1__0 )* ) ;
    public final void rule__Transition__Group_0_0_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1880:1: ( ( ( rule__Transition__Group_0_0_1_1_2_1__0 )* ) )
            // InternalSpaml.g:1881:1: ( ( rule__Transition__Group_0_0_1_1_2_1__0 )* )
            {
            // InternalSpaml.g:1881:1: ( ( rule__Transition__Group_0_0_1_1_2_1__0 )* )
            // InternalSpaml.g:1882:2: ( rule__Transition__Group_0_0_1_1_2_1__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_1_1_2_1()); 
            // InternalSpaml.g:1883:2: ( rule__Transition__Group_0_0_1_1_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSpaml.g:1883:3: rule__Transition__Group_0_0_1_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Transition__Group_0_0_1_1_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_0_0_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2_1__0"
    // InternalSpaml.g:1892:1: rule__Transition__Group_0_0_1_1_2_1__0 : rule__Transition__Group_0_0_1_1_2_1__0__Impl rule__Transition__Group_0_0_1_1_2_1__1 ;
    public final void rule__Transition__Group_0_0_1_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1896:1: ( rule__Transition__Group_0_0_1_1_2_1__0__Impl rule__Transition__Group_0_0_1_1_2_1__1 )
            // InternalSpaml.g:1897:2: rule__Transition__Group_0_0_1_1_2_1__0__Impl rule__Transition__Group_0_0_1_1_2_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Transition__Group_0_0_1_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2_1__0"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2_1__0__Impl"
    // InternalSpaml.g:1904:1: rule__Transition__Group_0_0_1_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_0_0_1_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1908:1: ( ( ',' ) )
            // InternalSpaml.g:1909:1: ( ',' )
            {
            // InternalSpaml.g:1909:1: ( ',' )
            // InternalSpaml.g:1910:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_0_0_1_1_2_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_0_0_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2_1__1"
    // InternalSpaml.g:1919:1: rule__Transition__Group_0_0_1_1_2_1__1 : rule__Transition__Group_0_0_1_1_2_1__1__Impl ;
    public final void rule__Transition__Group_0_0_1_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1923:1: ( rule__Transition__Group_0_0_1_1_2_1__1__Impl )
            // InternalSpaml.g:1924:2: rule__Transition__Group_0_0_1_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2_1__1"


    // $ANTLR start "rule__Transition__Group_0_0_1_1_2_1__1__Impl"
    // InternalSpaml.g:1930:1: rule__Transition__Group_0_0_1_1_2_1__1__Impl : ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1 ) ) ;
    public final void rule__Transition__Group_0_0_1_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1934:1: ( ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1 ) ) )
            // InternalSpaml.g:1935:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1 ) )
            {
            // InternalSpaml.g:1935:1: ( ( rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1 ) )
            // InternalSpaml.g:1936:2: ( rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_1_2_1_1()); 
            // InternalSpaml.g:1937:2: ( rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1 )
            // InternalSpaml.g:1937:3: rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_0_0_1_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1_2_1__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalSpaml.g:1946:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1950:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalSpaml.g:1951:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalSpaml.g:1958:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__SensorAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1962:1: ( ( ( rule__Condition__SensorAssignment_0 ) ) )
            // InternalSpaml.g:1963:1: ( ( rule__Condition__SensorAssignment_0 ) )
            {
            // InternalSpaml.g:1963:1: ( ( rule__Condition__SensorAssignment_0 ) )
            // InternalSpaml.g:1964:2: ( rule__Condition__SensorAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getSensorAssignment_0()); 
            // InternalSpaml.g:1965:2: ( rule__Condition__SensorAssignment_0 )
            // InternalSpaml.g:1965:3: rule__Condition__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalSpaml.g:1973:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1977:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalSpaml.g:1978:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalSpaml.g:1985:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1989:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // InternalSpaml.g:1990:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // InternalSpaml.g:1990:1: ( ( rule__Condition__Alternatives_1 ) )
            // InternalSpaml.g:1991:2: ( rule__Condition__Alternatives_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1992:2: ( rule__Condition__Alternatives_1 )
            // InternalSpaml.g:1992:3: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalSpaml.g:2000:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2004:1: ( rule__Condition__Group__2__Impl )
            // InternalSpaml.g:2005:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalSpaml.g:2011:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2015:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // InternalSpaml.g:2016:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:2016:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // InternalSpaml.g:2017:2: ( rule__Condition__ValueAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:2018:2: ( rule__Condition__ValueAssignment_2 )
            // InternalSpaml.g:2018:3: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalSpaml.g:2027:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2031:1: ( ( ruleEString ) )
            // InternalSpaml.g:2032:2: ( ruleEString )
            {
            // InternalSpaml.g:2032:2: ( ruleEString )
            // InternalSpaml.g:2033:3: ruleEString
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
    // InternalSpaml.g:2042:1: rule__Program__InitialStateAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Program__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2046:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2047:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2047:2: ( ( ruleEString ) )
            // InternalSpaml.g:2048:3: ( ruleEString )
            {
             before(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0()); 
            // InternalSpaml.g:2049:3: ( ruleEString )
            // InternalSpaml.g:2050:4: ruleEString
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
    // InternalSpaml.g:2061:1: rule__Program__PluggedElementsAssignment_6 : ( rulePluggedElement ) ;
    public final void rule__Program__PluggedElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2065:1: ( ( rulePluggedElement ) )
            // InternalSpaml.g:2066:2: ( rulePluggedElement )
            {
            // InternalSpaml.g:2066:2: ( rulePluggedElement )
            // InternalSpaml.g:2067:3: rulePluggedElement
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
    // InternalSpaml.g:2076:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2080:1: ( ( ruleState ) )
            // InternalSpaml.g:2081:2: ( ruleState )
            {
            // InternalSpaml.g:2081:2: ( ruleState )
            // InternalSpaml.g:2082:3: ruleState
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
    // InternalSpaml.g:2091:1: rule__PluggedElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PluggedElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2095:1: ( ( ruleEString ) )
            // InternalSpaml.g:2096:2: ( ruleEString )
            {
            // InternalSpaml.g:2096:2: ( ruleEString )
            // InternalSpaml.g:2097:3: ruleEString
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
    // InternalSpaml.g:2106:1: rule__PluggedElement__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__PluggedElement__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2110:1: ( ( ruleEInt ) )
            // InternalSpaml.g:2111:2: ( ruleEInt )
            {
            // InternalSpaml.g:2111:2: ( ruleEInt )
            // InternalSpaml.g:2112:3: ruleEInt
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
    // InternalSpaml.g:2121:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2125:1: ( ( ruleEString ) )
            // InternalSpaml.g:2126:2: ( ruleEString )
            {
            // InternalSpaml.g:2126:2: ( ruleEString )
            // InternalSpaml.g:2127:3: ruleEString
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
    // InternalSpaml.g:2136:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2140:1: ( ( ruleAction ) )
            // InternalSpaml.g:2141:2: ( ruleAction )
            {
            // InternalSpaml.g:2141:2: ( ruleAction )
            // InternalSpaml.g:2142:3: ruleAction
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
    // InternalSpaml.g:2151:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2155:1: ( ( ruleAction ) )
            // InternalSpaml.g:2156:2: ( ruleAction )
            {
            // InternalSpaml.g:2156:2: ( ruleAction )
            // InternalSpaml.g:2157:3: ruleAction
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
    // InternalSpaml.g:2166:1: rule__State__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2170:1: ( ( ruleTransition ) )
            // InternalSpaml.g:2171:2: ( ruleTransition )
            {
            // InternalSpaml.g:2171:2: ( ruleTransition )
            // InternalSpaml.g:2172:3: ruleTransition
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
    // InternalSpaml.g:2181:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2185:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2186:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2186:2: ( ( ruleEString ) )
            // InternalSpaml.g:2187:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalSpaml.g:2188:3: ( ruleEString )
            // InternalSpaml.g:2189:4: ruleEString
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
    // InternalSpaml.g:2200:1: rule__Action__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2204:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:2205:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:2205:2: ( ruleSIGNAL )
            // InternalSpaml.g:2206:3: ruleSIGNAL
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


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_0_1_0_0"
    // InternalSpaml.g:2215:1: rule__Transition__ConditionsAssignment_0_0_1_0_0 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2219:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2220:2: ( ruleCondition )
            {
            // InternalSpaml.g:2220:2: ( ruleCondition )
            // InternalSpaml.g:2221:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_0_1_0_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_0_1_0_1_1"
    // InternalSpaml.g:2230:1: rule__Transition__ConditionsAssignment_0_0_1_0_1_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_0_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2234:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2235:2: ( ruleCondition )
            {
            // InternalSpaml.g:2235:2: ( ruleCondition )
            // InternalSpaml.g:2236:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_0_1_0_1_1"


    // $ANTLR start "rule__Transition__OperationAssignment_0_0_1_1_0"
    // InternalSpaml.g:2245:1: rule__Transition__OperationAssignment_0_0_1_1_0 : ( ruleOPERATION ) ;
    public final void rule__Transition__OperationAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2249:1: ( ( ruleOPERATION ) )
            // InternalSpaml.g:2250:2: ( ruleOPERATION )
            {
            // InternalSpaml.g:2250:2: ( ruleOPERATION )
            // InternalSpaml.g:2251:3: ruleOPERATION
            {
             before(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_0_0_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOPERATION();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_0_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__OperationAssignment_0_0_1_1_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_0_1_1_2_0"
    // InternalSpaml.g:2260:1: rule__Transition__ConditionsAssignment_0_0_1_1_2_0 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_0_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2264:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2265:2: ( ruleCondition )
            {
            // InternalSpaml.g:2265:2: ( ruleCondition )
            // InternalSpaml.g:2266:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_0_1_1_2_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1"
    // InternalSpaml.g:2275:1: rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2279:1: ( ( ruleCondition ) )
            // InternalSpaml.g:2280:2: ( ruleCondition )
            {
            // InternalSpaml.g:2280:2: ( ruleCondition )
            // InternalSpaml.g:2281:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_1_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_0_0_1_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_0_0_1_1_2_1_1"


    // $ANTLR start "rule__Transition__DelayAssignment_0_1"
    // InternalSpaml.g:2290:1: rule__Transition__DelayAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__Transition__DelayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2294:1: ( ( ruleEInt ) )
            // InternalSpaml.g:2295:2: ( ruleEInt )
            {
            // InternalSpaml.g:2295:2: ( ruleEInt )
            // InternalSpaml.g:2296:3: ruleEInt
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
    // InternalSpaml.g:2305:1: rule__Transition__NextAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2309:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2310:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2310:2: ( ( ruleEString ) )
            // InternalSpaml.g:2311:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_2_0()); 
            // InternalSpaml.g:2312:3: ( ruleEString )
            // InternalSpaml.g:2313:4: ruleEString
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


    // $ANTLR start "rule__Condition__SensorAssignment_0"
    // InternalSpaml.g:2324:1: rule__Condition__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2328:1: ( ( ( RULE_ID ) ) )
            // InternalSpaml.g:2329:2: ( ( RULE_ID ) )
            {
            // InternalSpaml.g:2329:2: ( ( RULE_ID ) )
            // InternalSpaml.g:2330:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getSensorSensorCrossReference_0_0()); 
            // InternalSpaml.g:2331:3: ( RULE_ID )
            // InternalSpaml.g:2332:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getSensorSensorIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getSensorSensorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SensorAssignment_0"


    // $ANTLR start "rule__Condition__ValueAssignment_2"
    // InternalSpaml.g:2343:1: rule__Condition__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2347:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:2348:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:2348:2: ( ruleSIGNAL )
            // InternalSpaml.g:2349:3: ruleSIGNAL
            {
             before(grammarAccess.getConditionAccess().getValueSIGNALEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNAL();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueSIGNALEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_2"

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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000230C00070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200C00020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000088000L});

}