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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pluggedElements'", "'pluggedElements:'", "'states'", "'states:'", "'='", "'setTo'", "'&&'", "'and'", "'<-'", "'associate'", "'->'", "'then'", "'is'", "'LOW'", "'HIGH'", "'AND'", "'OR'", "'Program'", "'initialState'", "'{'", "'}'", "'onPin'", "'-'", "'SensorDigital'", "'SensorAnalog'", "'Actuator'", "'when'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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


    // $ANTLR start "entryRuleTransitionHandler"
    // InternalSpaml.g:328:1: entryRuleTransitionHandler : ruleTransitionHandler EOF ;
    public final void entryRuleTransitionHandler() throws RecognitionException {
        try {
            // InternalSpaml.g:329:1: ( ruleTransitionHandler EOF )
            // InternalSpaml.g:330:1: ruleTransitionHandler EOF
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
    // InternalSpaml.g:337:1: ruleTransitionHandler : ( ( rule__TransitionHandler__Group__0 ) ) ;
    public final void ruleTransitionHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:341:2: ( ( ( rule__TransitionHandler__Group__0 ) ) )
            // InternalSpaml.g:342:2: ( ( rule__TransitionHandler__Group__0 ) )
            {
            // InternalSpaml.g:342:2: ( ( rule__TransitionHandler__Group__0 ) )
            // InternalSpaml.g:343:3: ( rule__TransitionHandler__Group__0 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getGroup()); 
            // InternalSpaml.g:344:3: ( rule__TransitionHandler__Group__0 )
            // InternalSpaml.g:344:4: rule__TransitionHandler__Group__0
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

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=34 && LA3_0<=35)) ) {
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

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
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

            if ( (LA7_0==RULE_ID||LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT||LA7_0==33) ) {
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


    // $ANTLR start "rule__Transition__Alternatives_0_0_2_0"
    // InternalSpaml.g:531:1: rule__Transition__Alternatives_0_0_2_0 : ( ( '&&' ) | ( 'and' ) );
    public final void rule__Transition__Alternatives_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:535:1: ( ( '&&' ) | ( 'and' ) )
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
                    // InternalSpaml.g:536:2: ( '&&' )
                    {
                    // InternalSpaml.g:536:2: ( '&&' )
                    // InternalSpaml.g:537:3: '&&'
                    {
                     before(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_0_0_2_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_0_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:542:2: ( 'and' )
                    {
                    // InternalSpaml.g:542:2: ( 'and' )
                    // InternalSpaml.g:543:3: 'and'
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
    // InternalSpaml.g:552:1: rule__Transition__Alternatives_0_0_3_0 : ( ( '<-' ) | ( 'associate' ) );
    public final void rule__Transition__Alternatives_0_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:556:1: ( ( '<-' ) | ( 'associate' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpaml.g:557:2: ( '<-' )
                    {
                    // InternalSpaml.g:557:2: ( '<-' )
                    // InternalSpaml.g:558:3: '<-'
                    {
                     before(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_0_0_3_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_0_0_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:563:2: ( 'associate' )
                    {
                    // InternalSpaml.g:563:2: ( 'associate' )
                    // InternalSpaml.g:564:3: 'associate'
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
    // InternalSpaml.g:573:1: rule__Transition__Alternatives_1 : ( ( '->' ) | ( 'then' ) );
    public final void rule__Transition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:577:1: ( ( '->' ) | ( 'then' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpaml.g:578:2: ( '->' )
                    {
                    // InternalSpaml.g:578:2: ( '->' )
                    // InternalSpaml.g:579:3: '->'
                    {
                     before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:584:2: ( 'then' )
                    {
                    // InternalSpaml.g:584:2: ( 'then' )
                    // InternalSpaml.g:585:3: 'then'
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
    // InternalSpaml.g:594:1: rule__TransitionHandler__Alternatives_1 : ( ( '=' ) | ( 'is' ) );
    public final void rule__TransitionHandler__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:598:1: ( ( '=' ) | ( 'is' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpaml.g:599:2: ( '=' )
                    {
                    // InternalSpaml.g:599:2: ( '=' )
                    // InternalSpaml.g:600:3: '='
                    {
                     before(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:605:2: ( 'is' )
                    {
                    // InternalSpaml.g:605:2: ( 'is' )
                    // InternalSpaml.g:606:3: 'is'
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
    // InternalSpaml.g:615:1: rule__SIGNAL__Alternatives : ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) );
    public final void rule__SIGNAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:619:1: ( ( ( 'LOW' ) ) | ( ( 'HIGH' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpaml.g:620:2: ( ( 'LOW' ) )
                    {
                    // InternalSpaml.g:620:2: ( ( 'LOW' ) )
                    // InternalSpaml.g:621:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:622:3: ( 'LOW' )
                    // InternalSpaml.g:622:4: 'LOW'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:626:2: ( ( 'HIGH' ) )
                    {
                    // InternalSpaml.g:626:2: ( ( 'HIGH' ) )
                    // InternalSpaml.g:627:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:628:3: ( 'HIGH' )
                    // InternalSpaml.g:628:4: 'HIGH'
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
    // InternalSpaml.g:636:1: rule__OPERATION__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__OPERATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:640:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpaml.g:641:2: ( ( 'AND' ) )
                    {
                    // InternalSpaml.g:641:2: ( ( 'AND' ) )
                    // InternalSpaml.g:642:3: ( 'AND' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSpaml.g:643:3: ( 'AND' )
                    // InternalSpaml.g:643:4: 'AND'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:647:2: ( ( 'OR' ) )
                    {
                    // InternalSpaml.g:647:2: ( ( 'OR' ) )
                    // InternalSpaml.g:648:3: ( 'OR' )
                    {
                     before(grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSpaml.g:649:3: ( 'OR' )
                    // InternalSpaml.g:649:4: 'OR'
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
    // InternalSpaml.g:657:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:661:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSpaml.g:662:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalSpaml.g:669:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:673:1: ( ( 'Program' ) )
            // InternalSpaml.g:674:1: ( 'Program' )
            {
            // InternalSpaml.g:674:1: ( 'Program' )
            // InternalSpaml.g:675:2: 'Program'
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
    // InternalSpaml.g:684:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:688:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSpaml.g:689:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalSpaml.g:696:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:700:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSpaml.g:701:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSpaml.g:701:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSpaml.g:702:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSpaml.g:703:2: ( rule__Program__NameAssignment_1 )
            // InternalSpaml.g:703:3: rule__Program__NameAssignment_1
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
    // InternalSpaml.g:711:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:715:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSpaml.g:716:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalSpaml.g:723:1: rule__Program__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:727:1: ( ( 'initialState' ) )
            // InternalSpaml.g:728:1: ( 'initialState' )
            {
            // InternalSpaml.g:728:1: ( 'initialState' )
            // InternalSpaml.g:729:2: 'initialState'
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
    // InternalSpaml.g:738:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:742:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSpaml.g:743:2: rule__Program__Group__3__Impl rule__Program__Group__4
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
    // InternalSpaml.g:750:1: rule__Program__Group__3__Impl : ( ( rule__Program__InitialStateAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:754:1: ( ( ( rule__Program__InitialStateAssignment_3 ) ) )
            // InternalSpaml.g:755:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            {
            // InternalSpaml.g:755:1: ( ( rule__Program__InitialStateAssignment_3 ) )
            // InternalSpaml.g:756:2: ( rule__Program__InitialStateAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getInitialStateAssignment_3()); 
            // InternalSpaml.g:757:2: ( rule__Program__InitialStateAssignment_3 )
            // InternalSpaml.g:757:3: rule__Program__InitialStateAssignment_3
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
    // InternalSpaml.g:765:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:769:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalSpaml.g:770:2: rule__Program__Group__4__Impl rule__Program__Group__5
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
    // InternalSpaml.g:777:1: rule__Program__Group__4__Impl : ( '{' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:781:1: ( ( '{' ) )
            // InternalSpaml.g:782:1: ( '{' )
            {
            // InternalSpaml.g:782:1: ( '{' )
            // InternalSpaml.g:783:2: '{'
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
    // InternalSpaml.g:792:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:796:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalSpaml.g:797:2: rule__Program__Group__5__Impl rule__Program__Group__6
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
    // InternalSpaml.g:804:1: rule__Program__Group__5__Impl : ( ( rule__Program__Alternatives_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:808:1: ( ( ( rule__Program__Alternatives_5 ) ) )
            // InternalSpaml.g:809:1: ( ( rule__Program__Alternatives_5 ) )
            {
            // InternalSpaml.g:809:1: ( ( rule__Program__Alternatives_5 ) )
            // InternalSpaml.g:810:2: ( rule__Program__Alternatives_5 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_5()); 
            // InternalSpaml.g:811:2: ( rule__Program__Alternatives_5 )
            // InternalSpaml.g:811:3: rule__Program__Alternatives_5
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
    // InternalSpaml.g:819:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:823:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalSpaml.g:824:2: rule__Program__Group__6__Impl rule__Program__Group__7
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
    // InternalSpaml.g:831:1: rule__Program__Group__6__Impl : ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:835:1: ( ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) ) )
            // InternalSpaml.g:836:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            {
            // InternalSpaml.g:836:1: ( ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* ) )
            // InternalSpaml.g:837:2: ( ( rule__Program__PluggedElementsAssignment_6 ) ) ( ( rule__Program__PluggedElementsAssignment_6 )* )
            {
            // InternalSpaml.g:837:2: ( ( rule__Program__PluggedElementsAssignment_6 ) )
            // InternalSpaml.g:838:3: ( rule__Program__PluggedElementsAssignment_6 )
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:839:3: ( rule__Program__PluggedElementsAssignment_6 )
            // InternalSpaml.g:839:4: rule__Program__PluggedElementsAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__Program__PluggedElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 

            }

            // InternalSpaml.g:842:2: ( ( rule__Program__PluggedElementsAssignment_6 )* )
            // InternalSpaml.g:843:3: ( rule__Program__PluggedElementsAssignment_6 )*
            {
             before(grammarAccess.getProgramAccess().getPluggedElementsAssignment_6()); 
            // InternalSpaml.g:844:3: ( rule__Program__PluggedElementsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=34 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSpaml.g:844:4: rule__Program__PluggedElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__PluggedElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSpaml.g:853:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:857:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalSpaml.g:858:2: rule__Program__Group__7__Impl rule__Program__Group__8
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
    // InternalSpaml.g:865:1: rule__Program__Group__7__Impl : ( ( rule__Program__Alternatives_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:869:1: ( ( ( rule__Program__Alternatives_7 ) ) )
            // InternalSpaml.g:870:1: ( ( rule__Program__Alternatives_7 ) )
            {
            // InternalSpaml.g:870:1: ( ( rule__Program__Alternatives_7 ) )
            // InternalSpaml.g:871:2: ( rule__Program__Alternatives_7 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_7()); 
            // InternalSpaml.g:872:2: ( rule__Program__Alternatives_7 )
            // InternalSpaml.g:872:3: rule__Program__Alternatives_7
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
    // InternalSpaml.g:880:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:884:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalSpaml.g:885:2: rule__Program__Group__8__Impl rule__Program__Group__9
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
    // InternalSpaml.g:892:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:896:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // InternalSpaml.g:897:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // InternalSpaml.g:897:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // InternalSpaml.g:898:2: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // InternalSpaml.g:898:2: ( ( rule__Program__StatesAssignment_8 ) )
            // InternalSpaml.g:899:3: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:900:3: ( rule__Program__StatesAssignment_8 )
            // InternalSpaml.g:900:4: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__Program__StatesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // InternalSpaml.g:903:2: ( ( rule__Program__StatesAssignment_8 )* )
            // InternalSpaml.g:904:3: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // InternalSpaml.g:905:3: ( rule__Program__StatesAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSpaml.g:905:4: rule__Program__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Program__StatesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSpaml.g:914:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:918:1: ( rule__Program__Group__9__Impl )
            // InternalSpaml.g:919:2: rule__Program__Group__9__Impl
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
    // InternalSpaml.g:925:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:929:1: ( ( '}' ) )
            // InternalSpaml.g:930:1: ( '}' )
            {
            // InternalSpaml.g:930:1: ( '}' )
            // InternalSpaml.g:931:2: '}'
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
    // InternalSpaml.g:941:1: rule__PluggedElement__Group__0 : rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 ;
    public final void rule__PluggedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:945:1: ( rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1 )
            // InternalSpaml.g:946:2: rule__PluggedElement__Group__0__Impl rule__PluggedElement__Group__1
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
    // InternalSpaml.g:953:1: rule__PluggedElement__Group__0__Impl : ( ( rule__PluggedElement__Alternatives_0 ) ) ;
    public final void rule__PluggedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:957:1: ( ( ( rule__PluggedElement__Alternatives_0 ) ) )
            // InternalSpaml.g:958:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            {
            // InternalSpaml.g:958:1: ( ( rule__PluggedElement__Alternatives_0 ) )
            // InternalSpaml.g:959:2: ( rule__PluggedElement__Alternatives_0 )
            {
             before(grammarAccess.getPluggedElementAccess().getAlternatives_0()); 
            // InternalSpaml.g:960:2: ( rule__PluggedElement__Alternatives_0 )
            // InternalSpaml.g:960:3: rule__PluggedElement__Alternatives_0
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
    // InternalSpaml.g:968:1: rule__PluggedElement__Group__1 : rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 ;
    public final void rule__PluggedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:972:1: ( rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2 )
            // InternalSpaml.g:973:2: rule__PluggedElement__Group__1__Impl rule__PluggedElement__Group__2
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
    // InternalSpaml.g:980:1: rule__PluggedElement__Group__1__Impl : ( ( rule__PluggedElement__NameAssignment_1 ) ) ;
    public final void rule__PluggedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:984:1: ( ( ( rule__PluggedElement__NameAssignment_1 ) ) )
            // InternalSpaml.g:985:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            {
            // InternalSpaml.g:985:1: ( ( rule__PluggedElement__NameAssignment_1 ) )
            // InternalSpaml.g:986:2: ( rule__PluggedElement__NameAssignment_1 )
            {
             before(grammarAccess.getPluggedElementAccess().getNameAssignment_1()); 
            // InternalSpaml.g:987:2: ( rule__PluggedElement__NameAssignment_1 )
            // InternalSpaml.g:987:3: rule__PluggedElement__NameAssignment_1
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
    // InternalSpaml.g:995:1: rule__PluggedElement__Group__2 : rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 ;
    public final void rule__PluggedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:999:1: ( rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3 )
            // InternalSpaml.g:1000:2: rule__PluggedElement__Group__2__Impl rule__PluggedElement__Group__3
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
    // InternalSpaml.g:1007:1: rule__PluggedElement__Group__2__Impl : ( ( 'onPin' )? ) ;
    public final void rule__PluggedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1011:1: ( ( ( 'onPin' )? ) )
            // InternalSpaml.g:1012:1: ( ( 'onPin' )? )
            {
            // InternalSpaml.g:1012:1: ( ( 'onPin' )? )
            // InternalSpaml.g:1013:2: ( 'onPin' )?
            {
             before(grammarAccess.getPluggedElementAccess().getOnPinKeyword_2()); 
            // InternalSpaml.g:1014:2: ( 'onPin' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpaml.g:1014:3: 'onPin'
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
    // InternalSpaml.g:1022:1: rule__PluggedElement__Group__3 : rule__PluggedElement__Group__3__Impl ;
    public final void rule__PluggedElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1026:1: ( rule__PluggedElement__Group__3__Impl )
            // InternalSpaml.g:1027:2: rule__PluggedElement__Group__3__Impl
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
    // InternalSpaml.g:1033:1: rule__PluggedElement__Group__3__Impl : ( ( rule__PluggedElement__PinAssignment_3 ) ) ;
    public final void rule__PluggedElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1037:1: ( ( ( rule__PluggedElement__PinAssignment_3 ) ) )
            // InternalSpaml.g:1038:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            {
            // InternalSpaml.g:1038:1: ( ( rule__PluggedElement__PinAssignment_3 ) )
            // InternalSpaml.g:1039:2: ( rule__PluggedElement__PinAssignment_3 )
            {
             before(grammarAccess.getPluggedElementAccess().getPinAssignment_3()); 
            // InternalSpaml.g:1040:2: ( rule__PluggedElement__PinAssignment_3 )
            // InternalSpaml.g:1040:3: rule__PluggedElement__PinAssignment_3
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
    // InternalSpaml.g:1049:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1053:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSpaml.g:1054:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalSpaml.g:1061:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1065:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalSpaml.g:1066:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalSpaml.g:1066:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalSpaml.g:1067:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalSpaml.g:1068:2: ( rule__State__NameAssignment_0 )
            // InternalSpaml.g:1068:3: rule__State__NameAssignment_0
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
    // InternalSpaml.g:1076:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1080:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSpaml.g:1081:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalSpaml.g:1088:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1092:1: ( ( '{' ) )
            // InternalSpaml.g:1093:1: ( '{' )
            {
            // InternalSpaml.g:1093:1: ( '{' )
            // InternalSpaml.g:1094:2: '{'
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
    // InternalSpaml.g:1103:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1107:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSpaml.g:1108:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalSpaml.g:1115:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1119:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalSpaml.g:1120:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalSpaml.g:1120:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalSpaml.g:1121:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalSpaml.g:1122:2: ( rule__State__ActionsAssignment_2 )
            // InternalSpaml.g:1122:3: rule__State__ActionsAssignment_2
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
    // InternalSpaml.g:1130:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1134:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSpaml.g:1135:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalSpaml.g:1142:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1146:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalSpaml.g:1147:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalSpaml.g:1147:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalSpaml.g:1148:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalSpaml.g:1149:2: ( rule__State__ActionsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==15) ) {
                        int LA17_4 = input.LA(3);

                        if ( (LA17_4==24) ) {
                            int LA17_5 = input.LA(4);

                            if ( ((LA17_5>=RULE_STRING && LA17_5<=RULE_INT)||LA17_5==33||LA17_5==37) ) {
                                alt17=1;
                            }


                        }
                        else if ( (LA17_4==25) ) {
                            int LA17_6 = input.LA(4);

                            if ( ((LA17_6>=RULE_STRING && LA17_6<=RULE_INT)||LA17_6==33||LA17_6==37) ) {
                                alt17=1;
                            }


                        }


                    }
                    else if ( (LA17_2==16) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSpaml.g:1149:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalSpaml.g:1157:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1161:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalSpaml.g:1162:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalSpaml.g:1169:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1173:1: ( ( ( rule__State__TransitionAssignment_4 ) ) )
            // InternalSpaml.g:1174:1: ( ( rule__State__TransitionAssignment_4 ) )
            {
            // InternalSpaml.g:1174:1: ( ( rule__State__TransitionAssignment_4 ) )
            // InternalSpaml.g:1175:2: ( rule__State__TransitionAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionAssignment_4()); 
            // InternalSpaml.g:1176:2: ( rule__State__TransitionAssignment_4 )
            // InternalSpaml.g:1176:3: rule__State__TransitionAssignment_4
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
    // InternalSpaml.g:1184:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1188:1: ( rule__State__Group__5__Impl )
            // InternalSpaml.g:1189:2: rule__State__Group__5__Impl
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
    // InternalSpaml.g:1195:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1199:1: ( ( '}' ) )
            // InternalSpaml.g:1200:1: ( '}' )
            {
            // InternalSpaml.g:1200:1: ( '}' )
            // InternalSpaml.g:1201:2: '}'
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
    // InternalSpaml.g:1211:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1215:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSpaml.g:1216:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSpaml.g:1223:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1227:1: ( ( ( '-' )? ) )
            // InternalSpaml.g:1228:1: ( ( '-' )? )
            {
            // InternalSpaml.g:1228:1: ( ( '-' )? )
            // InternalSpaml.g:1229:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSpaml.g:1230:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpaml.g:1230:3: '-'
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
    // InternalSpaml.g:1238:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1242:1: ( rule__EInt__Group__1__Impl )
            // InternalSpaml.g:1243:2: rule__EInt__Group__1__Impl
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
    // InternalSpaml.g:1249:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1253:1: ( ( RULE_INT ) )
            // InternalSpaml.g:1254:1: ( RULE_INT )
            {
            // InternalSpaml.g:1254:1: ( RULE_INT )
            // InternalSpaml.g:1255:2: RULE_INT
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
    // InternalSpaml.g:1265:1: rule__SensorDigital__Group__0 : rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1 ;
    public final void rule__SensorDigital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1269:1: ( rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1 )
            // InternalSpaml.g:1270:2: rule__SensorDigital__Group__0__Impl rule__SensorDigital__Group__1
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
    // InternalSpaml.g:1277:1: rule__SensorDigital__Group__0__Impl : ( () ) ;
    public final void rule__SensorDigital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1281:1: ( ( () ) )
            // InternalSpaml.g:1282:1: ( () )
            {
            // InternalSpaml.g:1282:1: ( () )
            // InternalSpaml.g:1283:2: ()
            {
             before(grammarAccess.getSensorDigitalAccess().getSensorDigitalAction_0()); 
            // InternalSpaml.g:1284:2: ()
            // InternalSpaml.g:1284:3: 
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
    // InternalSpaml.g:1292:1: rule__SensorDigital__Group__1 : rule__SensorDigital__Group__1__Impl ;
    public final void rule__SensorDigital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1296:1: ( rule__SensorDigital__Group__1__Impl )
            // InternalSpaml.g:1297:2: rule__SensorDigital__Group__1__Impl
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
    // InternalSpaml.g:1303:1: rule__SensorDigital__Group__1__Impl : ( 'SensorDigital' ) ;
    public final void rule__SensorDigital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1307:1: ( ( 'SensorDigital' ) )
            // InternalSpaml.g:1308:1: ( 'SensorDigital' )
            {
            // InternalSpaml.g:1308:1: ( 'SensorDigital' )
            // InternalSpaml.g:1309:2: 'SensorDigital'
            {
             before(grammarAccess.getSensorDigitalAccess().getSensorDigitalKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSpaml.g:1319:1: rule__SensorAnalog__Group__0 : rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1 ;
    public final void rule__SensorAnalog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1323:1: ( rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1 )
            // InternalSpaml.g:1324:2: rule__SensorAnalog__Group__0__Impl rule__SensorAnalog__Group__1
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
    // InternalSpaml.g:1331:1: rule__SensorAnalog__Group__0__Impl : ( () ) ;
    public final void rule__SensorAnalog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1335:1: ( ( () ) )
            // InternalSpaml.g:1336:1: ( () )
            {
            // InternalSpaml.g:1336:1: ( () )
            // InternalSpaml.g:1337:2: ()
            {
             before(grammarAccess.getSensorAnalogAccess().getSensorAnalogAction_0()); 
            // InternalSpaml.g:1338:2: ()
            // InternalSpaml.g:1338:3: 
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
    // InternalSpaml.g:1346:1: rule__SensorAnalog__Group__1 : rule__SensorAnalog__Group__1__Impl ;
    public final void rule__SensorAnalog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1350:1: ( rule__SensorAnalog__Group__1__Impl )
            // InternalSpaml.g:1351:2: rule__SensorAnalog__Group__1__Impl
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
    // InternalSpaml.g:1357:1: rule__SensorAnalog__Group__1__Impl : ( 'SensorAnalog' ) ;
    public final void rule__SensorAnalog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1361:1: ( ( 'SensorAnalog' ) )
            // InternalSpaml.g:1362:1: ( 'SensorAnalog' )
            {
            // InternalSpaml.g:1362:1: ( 'SensorAnalog' )
            // InternalSpaml.g:1363:2: 'SensorAnalog'
            {
             before(grammarAccess.getSensorAnalogAccess().getSensorAnalogKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSpaml.g:1373:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1377:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalSpaml.g:1378:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
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
    // InternalSpaml.g:1385:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1389:1: ( ( () ) )
            // InternalSpaml.g:1390:1: ( () )
            {
            // InternalSpaml.g:1390:1: ( () )
            // InternalSpaml.g:1391:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalSpaml.g:1392:2: ()
            // InternalSpaml.g:1392:3: 
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
    // InternalSpaml.g:1400:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1404:1: ( rule__Actuator__Group__1__Impl )
            // InternalSpaml.g:1405:2: rule__Actuator__Group__1__Impl
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
    // InternalSpaml.g:1411:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1415:1: ( ( 'Actuator' ) )
            // InternalSpaml.g:1416:1: ( 'Actuator' )
            {
            // InternalSpaml.g:1416:1: ( 'Actuator' )
            // InternalSpaml.g:1417:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSpaml.g:1427:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1431:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSpaml.g:1432:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalSpaml.g:1439:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1443:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalSpaml.g:1444:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalSpaml.g:1444:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalSpaml.g:1445:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalSpaml.g:1446:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalSpaml.g:1446:3: rule__Action__ActuatorAssignment_0
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
    // InternalSpaml.g:1454:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1458:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSpaml.g:1459:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // InternalSpaml.g:1466:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1470:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalSpaml.g:1471:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalSpaml.g:1471:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalSpaml.g:1472:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1473:2: ( rule__Action__Alternatives_1 )
            // InternalSpaml.g:1473:3: rule__Action__Alternatives_1
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
    // InternalSpaml.g:1481:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1485:1: ( rule__Action__Group__2__Impl )
            // InternalSpaml.g:1486:2: rule__Action__Group__2__Impl
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
    // InternalSpaml.g:1492:1: rule__Action__Group__2__Impl : ( ( rule__Action__ValueAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1496:1: ( ( ( rule__Action__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1497:1: ( ( rule__Action__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1497:1: ( ( rule__Action__ValueAssignment_2 ) )
            // InternalSpaml.g:1498:2: ( rule__Action__ValueAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1499:2: ( rule__Action__ValueAssignment_2 )
            // InternalSpaml.g:1499:3: rule__Action__ValueAssignment_2
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
    // InternalSpaml.g:1508:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1512:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalSpaml.g:1513:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalSpaml.g:1520:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1524:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalSpaml.g:1525:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalSpaml.g:1525:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalSpaml.g:1526:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalSpaml.g:1527:2: ( rule__Transition__Alternatives_0 )
            // InternalSpaml.g:1527:3: rule__Transition__Alternatives_0
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
    // InternalSpaml.g:1535:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1539:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalSpaml.g:1540:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalSpaml.g:1547:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Alternatives_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1551:1: ( ( ( rule__Transition__Alternatives_1 ) ) )
            // InternalSpaml.g:1552:1: ( ( rule__Transition__Alternatives_1 ) )
            {
            // InternalSpaml.g:1552:1: ( ( rule__Transition__Alternatives_1 ) )
            // InternalSpaml.g:1553:2: ( rule__Transition__Alternatives_1 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_1()); 
            // InternalSpaml.g:1554:2: ( rule__Transition__Alternatives_1 )
            // InternalSpaml.g:1554:3: rule__Transition__Alternatives_1
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
    // InternalSpaml.g:1562:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1566:1: ( rule__Transition__Group__2__Impl )
            // InternalSpaml.g:1567:2: rule__Transition__Group__2__Impl
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
    // InternalSpaml.g:1573:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NextAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1577:1: ( ( ( rule__Transition__NextAssignment_2 ) ) )
            // InternalSpaml.g:1578:1: ( ( rule__Transition__NextAssignment_2 ) )
            {
            // InternalSpaml.g:1578:1: ( ( rule__Transition__NextAssignment_2 ) )
            // InternalSpaml.g:1579:2: ( rule__Transition__NextAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_2()); 
            // InternalSpaml.g:1580:2: ( rule__Transition__NextAssignment_2 )
            // InternalSpaml.g:1580:3: rule__Transition__NextAssignment_2
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
    // InternalSpaml.g:1589:1: rule__Transition__Group_0_0__0 : rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 ;
    public final void rule__Transition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1593:1: ( rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 )
            // InternalSpaml.g:1594:2: rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1
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
    // InternalSpaml.g:1601:1: rule__Transition__Group_0_0__0__Impl : ( ( 'when' )? ) ;
    public final void rule__Transition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1605:1: ( ( ( 'when' )? ) )
            // InternalSpaml.g:1606:1: ( ( 'when' )? )
            {
            // InternalSpaml.g:1606:1: ( ( 'when' )? )
            // InternalSpaml.g:1607:2: ( 'when' )?
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0()); 
            // InternalSpaml.g:1608:2: ( 'when' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpaml.g:1608:3: 'when'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalSpaml.g:1616:1: rule__Transition__Group_0_0__1 : rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2 ;
    public final void rule__Transition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1620:1: ( rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2 )
            // InternalSpaml.g:1621:2: rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpaml.g:1628:1: rule__Transition__Group_0_0__1__Impl : ( ( rule__Transition__HandlersAssignment_0_0_1 ) ) ;
    public final void rule__Transition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1632:1: ( ( ( rule__Transition__HandlersAssignment_0_0_1 ) ) )
            // InternalSpaml.g:1633:1: ( ( rule__Transition__HandlersAssignment_0_0_1 ) )
            {
            // InternalSpaml.g:1633:1: ( ( rule__Transition__HandlersAssignment_0_0_1 ) )
            // InternalSpaml.g:1634:2: ( rule__Transition__HandlersAssignment_0_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_0_0_1()); 
            // InternalSpaml.g:1635:2: ( rule__Transition__HandlersAssignment_0_0_1 )
            // InternalSpaml.g:1635:3: rule__Transition__HandlersAssignment_0_0_1
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
    // InternalSpaml.g:1643:1: rule__Transition__Group_0_0__2 : rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3 ;
    public final void rule__Transition__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1647:1: ( rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3 )
            // InternalSpaml.g:1648:2: rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSpaml.g:1655:1: rule__Transition__Group_0_0__2__Impl : ( ( rule__Transition__Group_0_0_2__0 )* ) ;
    public final void rule__Transition__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1659:1: ( ( ( rule__Transition__Group_0_0_2__0 )* ) )
            // InternalSpaml.g:1660:1: ( ( rule__Transition__Group_0_0_2__0 )* )
            {
            // InternalSpaml.g:1660:1: ( ( rule__Transition__Group_0_0_2__0 )* )
            // InternalSpaml.g:1661:2: ( rule__Transition__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_2()); 
            // InternalSpaml.g:1662:2: ( rule__Transition__Group_0_0_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=17 && LA20_0<=18)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSpaml.g:1662:3: rule__Transition__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Transition__Group_0_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalSpaml.g:1670:1: rule__Transition__Group_0_0__3 : rule__Transition__Group_0_0__3__Impl ;
    public final void rule__Transition__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1674:1: ( rule__Transition__Group_0_0__3__Impl )
            // InternalSpaml.g:1675:2: rule__Transition__Group_0_0__3__Impl
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
    // InternalSpaml.g:1681:1: rule__Transition__Group_0_0__3__Impl : ( ( rule__Transition__Group_0_0_3__0 )? ) ;
    public final void rule__Transition__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1685:1: ( ( ( rule__Transition__Group_0_0_3__0 )? ) )
            // InternalSpaml.g:1686:1: ( ( rule__Transition__Group_0_0_3__0 )? )
            {
            // InternalSpaml.g:1686:1: ( ( rule__Transition__Group_0_0_3__0 )? )
            // InternalSpaml.g:1687:2: ( rule__Transition__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_3()); 
            // InternalSpaml.g:1688:2: ( rule__Transition__Group_0_0_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=19 && LA21_0<=20)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSpaml.g:1688:3: rule__Transition__Group_0_0_3__0
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
    // InternalSpaml.g:1697:1: rule__Transition__Group_0_0_2__0 : rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1 ;
    public final void rule__Transition__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1701:1: ( rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1 )
            // InternalSpaml.g:1702:2: rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSpaml.g:1709:1: rule__Transition__Group_0_0_2__0__Impl : ( ( rule__Transition__Alternatives_0_0_2_0 ) ) ;
    public final void rule__Transition__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1713:1: ( ( ( rule__Transition__Alternatives_0_0_2_0 ) ) )
            // InternalSpaml.g:1714:1: ( ( rule__Transition__Alternatives_0_0_2_0 ) )
            {
            // InternalSpaml.g:1714:1: ( ( rule__Transition__Alternatives_0_0_2_0 ) )
            // InternalSpaml.g:1715:2: ( rule__Transition__Alternatives_0_0_2_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0_0_2_0()); 
            // InternalSpaml.g:1716:2: ( rule__Transition__Alternatives_0_0_2_0 )
            // InternalSpaml.g:1716:3: rule__Transition__Alternatives_0_0_2_0
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
    // InternalSpaml.g:1724:1: rule__Transition__Group_0_0_2__1 : rule__Transition__Group_0_0_2__1__Impl ;
    public final void rule__Transition__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1728:1: ( rule__Transition__Group_0_0_2__1__Impl )
            // InternalSpaml.g:1729:2: rule__Transition__Group_0_0_2__1__Impl
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
    // InternalSpaml.g:1735:1: rule__Transition__Group_0_0_2__1__Impl : ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) ) ;
    public final void rule__Transition__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1739:1: ( ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) ) )
            // InternalSpaml.g:1740:1: ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) )
            {
            // InternalSpaml.g:1740:1: ( ( rule__Transition__HandlersAssignment_0_0_2_1 ) )
            // InternalSpaml.g:1741:2: ( rule__Transition__HandlersAssignment_0_0_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getHandlersAssignment_0_0_2_1()); 
            // InternalSpaml.g:1742:2: ( rule__Transition__HandlersAssignment_0_0_2_1 )
            // InternalSpaml.g:1742:3: rule__Transition__HandlersAssignment_0_0_2_1
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
    // InternalSpaml.g:1751:1: rule__Transition__Group_0_0_3__0 : rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1 ;
    public final void rule__Transition__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1755:1: ( rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1 )
            // InternalSpaml.g:1756:2: rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSpaml.g:1763:1: rule__Transition__Group_0_0_3__0__Impl : ( ( rule__Transition__Alternatives_0_0_3_0 ) ) ;
    public final void rule__Transition__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1767:1: ( ( ( rule__Transition__Alternatives_0_0_3_0 ) ) )
            // InternalSpaml.g:1768:1: ( ( rule__Transition__Alternatives_0_0_3_0 ) )
            {
            // InternalSpaml.g:1768:1: ( ( rule__Transition__Alternatives_0_0_3_0 ) )
            // InternalSpaml.g:1769:2: ( rule__Transition__Alternatives_0_0_3_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0_0_3_0()); 
            // InternalSpaml.g:1770:2: ( rule__Transition__Alternatives_0_0_3_0 )
            // InternalSpaml.g:1770:3: rule__Transition__Alternatives_0_0_3_0
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
    // InternalSpaml.g:1778:1: rule__Transition__Group_0_0_3__1 : rule__Transition__Group_0_0_3__1__Impl ;
    public final void rule__Transition__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1782:1: ( rule__Transition__Group_0_0_3__1__Impl )
            // InternalSpaml.g:1783:2: rule__Transition__Group_0_0_3__1__Impl
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
    // InternalSpaml.g:1789:1: rule__Transition__Group_0_0_3__1__Impl : ( ( rule__Transition__OperationAssignment_0_0_3_1 ) ) ;
    public final void rule__Transition__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1793:1: ( ( ( rule__Transition__OperationAssignment_0_0_3_1 ) ) )
            // InternalSpaml.g:1794:1: ( ( rule__Transition__OperationAssignment_0_0_3_1 ) )
            {
            // InternalSpaml.g:1794:1: ( ( rule__Transition__OperationAssignment_0_0_3_1 ) )
            // InternalSpaml.g:1795:2: ( rule__Transition__OperationAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getOperationAssignment_0_0_3_1()); 
            // InternalSpaml.g:1796:2: ( rule__Transition__OperationAssignment_0_0_3_1 )
            // InternalSpaml.g:1796:3: rule__Transition__OperationAssignment_0_0_3_1
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
    // InternalSpaml.g:1805:1: rule__TransitionHandler__Group__0 : rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 ;
    public final void rule__TransitionHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1809:1: ( rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1 )
            // InternalSpaml.g:1810:2: rule__TransitionHandler__Group__0__Impl rule__TransitionHandler__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSpaml.g:1817:1: rule__TransitionHandler__Group__0__Impl : ( ( rule__TransitionHandler__SensorAssignment_0 ) ) ;
    public final void rule__TransitionHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1821:1: ( ( ( rule__TransitionHandler__SensorAssignment_0 ) ) )
            // InternalSpaml.g:1822:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            {
            // InternalSpaml.g:1822:1: ( ( rule__TransitionHandler__SensorAssignment_0 ) )
            // InternalSpaml.g:1823:2: ( rule__TransitionHandler__SensorAssignment_0 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorAssignment_0()); 
            // InternalSpaml.g:1824:2: ( rule__TransitionHandler__SensorAssignment_0 )
            // InternalSpaml.g:1824:3: rule__TransitionHandler__SensorAssignment_0
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
    // InternalSpaml.g:1832:1: rule__TransitionHandler__Group__1 : rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 ;
    public final void rule__TransitionHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1836:1: ( rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2 )
            // InternalSpaml.g:1837:2: rule__TransitionHandler__Group__1__Impl rule__TransitionHandler__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSpaml.g:1844:1: rule__TransitionHandler__Group__1__Impl : ( ( rule__TransitionHandler__Alternatives_1 ) ) ;
    public final void rule__TransitionHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1848:1: ( ( ( rule__TransitionHandler__Alternatives_1 ) ) )
            // InternalSpaml.g:1849:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            {
            // InternalSpaml.g:1849:1: ( ( rule__TransitionHandler__Alternatives_1 ) )
            // InternalSpaml.g:1850:2: ( rule__TransitionHandler__Alternatives_1 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getAlternatives_1()); 
            // InternalSpaml.g:1851:2: ( rule__TransitionHandler__Alternatives_1 )
            // InternalSpaml.g:1851:3: rule__TransitionHandler__Alternatives_1
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
    // InternalSpaml.g:1859:1: rule__TransitionHandler__Group__2 : rule__TransitionHandler__Group__2__Impl ;
    public final void rule__TransitionHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1863:1: ( rule__TransitionHandler__Group__2__Impl )
            // InternalSpaml.g:1864:2: rule__TransitionHandler__Group__2__Impl
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
    // InternalSpaml.g:1870:1: rule__TransitionHandler__Group__2__Impl : ( ( rule__TransitionHandler__ValueAssignment_2 ) ) ;
    public final void rule__TransitionHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1874:1: ( ( ( rule__TransitionHandler__ValueAssignment_2 ) ) )
            // InternalSpaml.g:1875:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            {
            // InternalSpaml.g:1875:1: ( ( rule__TransitionHandler__ValueAssignment_2 ) )
            // InternalSpaml.g:1876:2: ( rule__TransitionHandler__ValueAssignment_2 )
            {
             before(grammarAccess.getTransitionHandlerAccess().getValueAssignment_2()); 
            // InternalSpaml.g:1877:2: ( rule__TransitionHandler__ValueAssignment_2 )
            // InternalSpaml.g:1877:3: rule__TransitionHandler__ValueAssignment_2
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
    // InternalSpaml.g:1886:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1890:1: ( ( ruleEString ) )
            // InternalSpaml.g:1891:2: ( ruleEString )
            {
            // InternalSpaml.g:1891:2: ( ruleEString )
            // InternalSpaml.g:1892:3: ruleEString
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
    // InternalSpaml.g:1901:1: rule__Program__InitialStateAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Program__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1905:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:1906:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:1906:2: ( ( ruleEString ) )
            // InternalSpaml.g:1907:3: ( ruleEString )
            {
             before(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0()); 
            // InternalSpaml.g:1908:3: ( ruleEString )
            // InternalSpaml.g:1909:4: ruleEString
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
    // InternalSpaml.g:1920:1: rule__Program__PluggedElementsAssignment_6 : ( rulePluggedElement ) ;
    public final void rule__Program__PluggedElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1924:1: ( ( rulePluggedElement ) )
            // InternalSpaml.g:1925:2: ( rulePluggedElement )
            {
            // InternalSpaml.g:1925:2: ( rulePluggedElement )
            // InternalSpaml.g:1926:3: rulePluggedElement
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
    // InternalSpaml.g:1935:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1939:1: ( ( ruleState ) )
            // InternalSpaml.g:1940:2: ( ruleState )
            {
            // InternalSpaml.g:1940:2: ( ruleState )
            // InternalSpaml.g:1941:3: ruleState
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
    // InternalSpaml.g:1950:1: rule__PluggedElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PluggedElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1954:1: ( ( ruleEString ) )
            // InternalSpaml.g:1955:2: ( ruleEString )
            {
            // InternalSpaml.g:1955:2: ( ruleEString )
            // InternalSpaml.g:1956:3: ruleEString
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
    // InternalSpaml.g:1965:1: rule__PluggedElement__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__PluggedElement__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1969:1: ( ( ruleEInt ) )
            // InternalSpaml.g:1970:2: ( ruleEInt )
            {
            // InternalSpaml.g:1970:2: ( ruleEInt )
            // InternalSpaml.g:1971:3: ruleEInt
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
    // InternalSpaml.g:1980:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1984:1: ( ( ruleEString ) )
            // InternalSpaml.g:1985:2: ( ruleEString )
            {
            // InternalSpaml.g:1985:2: ( ruleEString )
            // InternalSpaml.g:1986:3: ruleEString
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
    // InternalSpaml.g:1995:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:1999:1: ( ( ruleAction ) )
            // InternalSpaml.g:2000:2: ( ruleAction )
            {
            // InternalSpaml.g:2000:2: ( ruleAction )
            // InternalSpaml.g:2001:3: ruleAction
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
    // InternalSpaml.g:2010:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2014:1: ( ( ruleAction ) )
            // InternalSpaml.g:2015:2: ( ruleAction )
            {
            // InternalSpaml.g:2015:2: ( ruleAction )
            // InternalSpaml.g:2016:3: ruleAction
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
    // InternalSpaml.g:2025:1: rule__State__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2029:1: ( ( ruleTransition ) )
            // InternalSpaml.g:2030:2: ( ruleTransition )
            {
            // InternalSpaml.g:2030:2: ( ruleTransition )
            // InternalSpaml.g:2031:3: ruleTransition
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
    // InternalSpaml.g:2040:1: rule__Action__ActuatorAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2044:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2045:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2045:2: ( ( ruleEString ) )
            // InternalSpaml.g:2046:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
            // InternalSpaml.g:2047:3: ( ruleEString )
            // InternalSpaml.g:2048:4: ruleEString
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
    // InternalSpaml.g:2059:1: rule__Action__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__Action__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2063:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:2064:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:2064:2: ( ruleSIGNAL )
            // InternalSpaml.g:2065:3: ruleSIGNAL
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
    // InternalSpaml.g:2074:1: rule__Transition__HandlersAssignment_0_0_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2078:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:2079:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:2079:2: ( ruleTransitionHandler )
            // InternalSpaml.g:2080:3: ruleTransitionHandler
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
    // InternalSpaml.g:2089:1: rule__Transition__HandlersAssignment_0_0_2_1 : ( ruleTransitionHandler ) ;
    public final void rule__Transition__HandlersAssignment_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2093:1: ( ( ruleTransitionHandler ) )
            // InternalSpaml.g:2094:2: ( ruleTransitionHandler )
            {
            // InternalSpaml.g:2094:2: ( ruleTransitionHandler )
            // InternalSpaml.g:2095:3: ruleTransitionHandler
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
    // InternalSpaml.g:2104:1: rule__Transition__OperationAssignment_0_0_3_1 : ( ruleOPERATION ) ;
    public final void rule__Transition__OperationAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2108:1: ( ( ruleOPERATION ) )
            // InternalSpaml.g:2109:2: ( ruleOPERATION )
            {
            // InternalSpaml.g:2109:2: ( ruleOPERATION )
            // InternalSpaml.g:2110:3: ruleOPERATION
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
    // InternalSpaml.g:2119:1: rule__Transition__DelayAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__Transition__DelayAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2123:1: ( ( ruleEInt ) )
            // InternalSpaml.g:2124:2: ( ruleEInt )
            {
            // InternalSpaml.g:2124:2: ( ruleEInt )
            // InternalSpaml.g:2125:3: ruleEInt
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
    // InternalSpaml.g:2134:1: rule__Transition__NextAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2138:1: ( ( ( ruleEString ) ) )
            // InternalSpaml.g:2139:2: ( ( ruleEString ) )
            {
            // InternalSpaml.g:2139:2: ( ( ruleEString ) )
            // InternalSpaml.g:2140:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_2_0()); 
            // InternalSpaml.g:2141:3: ( ruleEString )
            // InternalSpaml.g:2142:4: ruleEString
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
    // InternalSpaml.g:2153:1: rule__TransitionHandler__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionHandler__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2157:1: ( ( ( RULE_ID ) ) )
            // InternalSpaml.g:2158:2: ( ( RULE_ID ) )
            {
            // InternalSpaml.g:2158:2: ( ( RULE_ID ) )
            // InternalSpaml.g:2159:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionHandlerAccess().getSensorSensorCrossReference_0_0()); 
            // InternalSpaml.g:2160:3: ( RULE_ID )
            // InternalSpaml.g:2161:4: RULE_ID
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
    // InternalSpaml.g:2172:1: rule__TransitionHandler__ValueAssignment_2 : ( ruleSIGNAL ) ;
    public final void rule__TransitionHandler__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpaml.g:2176:1: ( ( ruleSIGNAL ) )
            // InternalSpaml.g:2177:2: ( ruleSIGNAL )
            {
            // InternalSpaml.g:2177:2: ( ruleSIGNAL )
            // InternalSpaml.g:2178:3: ruleSIGNAL
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000300000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002300000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000808000L});

}