package polytech.dsl.spaceteam.spaml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import polytech.dsl.spaceteam.spaml.services.SpamlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpamlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'initialState'", "'{'", "'pluggedElements'", "'pluggedElements:'", "'states'", "'states:'", "'}'", "'onPin'", "'-'", "'Sensor'", "'Actuator'", "'='", "'setTo'", "'when'", "'&&'", "'and'", "'->'", "'then'", "'<-'", "'associate'", "'is'", "'LOW'", "'HIGH'", "'AND'", "'OR'"
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

        public InternalSpamlParser(TokenStream input, SpamlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected SpamlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalSpaml.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSpaml.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalSpaml.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSpaml.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initialState' ( ( ruleEString ) ) otherlv_4= '{' (otherlv_5= 'pluggedElements' | otherlv_6= 'pluggedElements:' ) ( (lv_pluggedElements_7_0= rulePluggedElement ) )+ (otherlv_8= 'states' | otherlv_9= 'states:' ) ( (lv_states_10_0= ruleState ) )+ otherlv_11= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_pluggedElements_7_0 = null;

        EObject lv_states_10_0 = null;



        	enterRule();

        try {
            // InternalSpaml.g:78:2: ( (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initialState' ( ( ruleEString ) ) otherlv_4= '{' (otherlv_5= 'pluggedElements' | otherlv_6= 'pluggedElements:' ) ( (lv_pluggedElements_7_0= rulePluggedElement ) )+ (otherlv_8= 'states' | otherlv_9= 'states:' ) ( (lv_states_10_0= ruleState ) )+ otherlv_11= '}' ) )
            // InternalSpaml.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initialState' ( ( ruleEString ) ) otherlv_4= '{' (otherlv_5= 'pluggedElements' | otherlv_6= 'pluggedElements:' ) ( (lv_pluggedElements_7_0= rulePluggedElement ) )+ (otherlv_8= 'states' | otherlv_9= 'states:' ) ( (lv_states_10_0= ruleState ) )+ otherlv_11= '}' )
            {
            // InternalSpaml.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initialState' ( ( ruleEString ) ) otherlv_4= '{' (otherlv_5= 'pluggedElements' | otherlv_6= 'pluggedElements:' ) ( (lv_pluggedElements_7_0= rulePluggedElement ) )+ (otherlv_8= 'states' | otherlv_9= 'states:' ) ( (lv_states_10_0= ruleState ) )+ otherlv_11= '}' )
            // InternalSpaml.g:80:3: otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initialState' ( ( ruleEString ) ) otherlv_4= '{' (otherlv_5= 'pluggedElements' | otherlv_6= 'pluggedElements:' ) ( (lv_pluggedElements_7_0= rulePluggedElement ) )+ (otherlv_8= 'states' | otherlv_9= 'states:' ) ( (lv_states_10_0= ruleState ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalSpaml.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSpaml.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalSpaml.g:85:4: (lv_name_1_0= ruleEString )
            // InternalSpaml.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getInitialStateKeyword_2());
            		
            // InternalSpaml.g:107:3: ( ( ruleEString ) )
            // InternalSpaml.g:108:4: ( ruleEString )
            {
            // InternalSpaml.g:108:4: ( ruleEString )
            // InternalSpaml.g:109:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProgramAccess().getInitialStateStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSpaml.g:127:3: (otherlv_5= 'pluggedElements' | otherlv_6= 'pluggedElements:' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpaml.g:128:4: otherlv_5= 'pluggedElements'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpaml.g:133:4: otherlv_6= 'pluggedElements:'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getPluggedElementsKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalSpaml.g:138:3: ( (lv_pluggedElements_7_0= rulePluggedElement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=21 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpaml.g:139:4: (lv_pluggedElements_7_0= rulePluggedElement )
            	    {
            	    // InternalSpaml.g:139:4: (lv_pluggedElements_7_0= rulePluggedElement )
            	    // InternalSpaml.g:140:5: lv_pluggedElements_7_0= rulePluggedElement
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getPluggedElementsPluggedElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_pluggedElements_7_0=rulePluggedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pluggedElements",
            	    						lv_pluggedElements_7_0,
            	    						"polytech.dsl.spaceteam.spaml.Spaml.PluggedElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalSpaml.g:157:3: (otherlv_8= 'states' | otherlv_9= 'states:' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpaml.g:158:4: otherlv_8= 'states'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getStatesKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpaml.g:163:4: otherlv_9= 'states:'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getStatesKeyword_7_1());
                    			

                    }
                    break;

            }

            // InternalSpaml.g:168:3: ( (lv_states_10_0= ruleState ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpaml.g:169:4: (lv_states_10_0= ruleState )
            	    {
            	    // InternalSpaml.g:169:4: (lv_states_10_0= ruleState )
            	    // InternalSpaml.g:170:5: lv_states_10_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_10_0,
            	    						"polytech.dsl.spaceteam.spaml.Spaml.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePluggedElement"
    // InternalSpaml.g:195:1: entryRulePluggedElement returns [EObject current=null] : iv_rulePluggedElement= rulePluggedElement EOF ;
    public final EObject entryRulePluggedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluggedElement = null;


        try {
            // InternalSpaml.g:195:55: (iv_rulePluggedElement= rulePluggedElement EOF )
            // InternalSpaml.g:196:2: iv_rulePluggedElement= rulePluggedElement EOF
            {
             newCompositeNode(grammarAccess.getPluggedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePluggedElement=rulePluggedElement();

            state._fsp--;

             current =iv_rulePluggedElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluggedElement"


    // $ANTLR start "rulePluggedElement"
    // InternalSpaml.g:202:1: rulePluggedElement returns [EObject current=null] : ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'onPin' )? ( (lv_pin_4_0= ruleEInt ) ) ) ;
    public final EObject rulePluggedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;



        	enterRule();

        try {
            // InternalSpaml.g:208:2: ( ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'onPin' )? ( (lv_pin_4_0= ruleEInt ) ) ) )
            // InternalSpaml.g:209:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'onPin' )? ( (lv_pin_4_0= ruleEInt ) ) )
            {
            // InternalSpaml.g:209:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'onPin' )? ( (lv_pin_4_0= ruleEInt ) ) )
            // InternalSpaml.g:210:3: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'onPin' )? ( (lv_pin_4_0= ruleEInt ) )
            {
            // InternalSpaml.g:210:3: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpaml.g:211:4: this_Actuator_0= ruleActuator
                    {

                    				newCompositeNode(grammarAccess.getPluggedElementAccess().getActuatorParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_Actuator_0=ruleActuator();

                    state._fsp--;


                    				current = this_Actuator_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSpaml.g:220:4: this_Sensor_1= ruleSensor
                    {

                    				newCompositeNode(grammarAccess.getPluggedElementAccess().getSensorParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_3);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;


                    				current = this_Sensor_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSpaml.g:229:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSpaml.g:230:4: (lv_name_2_0= ruleEString )
            {
            // InternalSpaml.g:230:4: (lv_name_2_0= ruleEString )
            // InternalSpaml.g:231:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPluggedElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPluggedElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpaml.g:248:3: (otherlv_3= 'onPin' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpaml.g:249:4: otherlv_3= 'onPin'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getPluggedElementAccess().getOnPinKeyword_2());
                    			

                    }
                    break;

            }

            // InternalSpaml.g:254:3: ( (lv_pin_4_0= ruleEInt ) )
            // InternalSpaml.g:255:4: (lv_pin_4_0= ruleEInt )
            {
            // InternalSpaml.g:255:4: (lv_pin_4_0= ruleEInt )
            // InternalSpaml.g:256:5: lv_pin_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPluggedElementAccess().getPinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPluggedElementRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_4_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluggedElement"


    // $ANTLR start "entryRuleEString"
    // InternalSpaml.g:277:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSpaml.g:277:47: (iv_ruleEString= ruleEString EOF )
            // InternalSpaml.g:278:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSpaml.g:284:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSpaml.g:290:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSpaml.g:291:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSpaml.g:291:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpaml.g:292:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpaml.g:300:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalSpaml.g:311:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSpaml.g:311:46: (iv_ruleState= ruleState EOF )
            // InternalSpaml.g:312:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSpaml.g:318:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalSpaml.g:324:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' ) )
            // InternalSpaml.g:325:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' )
            {
            // InternalSpaml.g:325:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' )
            // InternalSpaml.g:326:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}'
            {
            // InternalSpaml.g:326:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSpaml.g:327:4: (lv_name_0_0= ruleEString )
            {
            // InternalSpaml.g:327:4: (lv_name_0_0= ruleEString )
            // InternalSpaml.g:328:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpaml.g:349:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalSpaml.g:350:4: (lv_actions_2_0= ruleAction )
            {
            // InternalSpaml.g:350:4: (lv_actions_2_0= ruleAction )
            // InternalSpaml.g:351:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_actions_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpaml.g:368:3: ( (lv_actions_3_0= ruleAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==23) ) {
                        int LA8_4 = input.LA(3);

                        if ( (LA8_4==33) ) {
                            int LA8_5 = input.LA(4);

                            if ( ((LA8_5>=RULE_STRING && LA8_5<=RULE_ID)||LA8_5==25) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_4==34) ) {
                            int LA8_6 = input.LA(4);

                            if ( ((LA8_6>=RULE_STRING && LA8_6<=RULE_ID)||LA8_6==25) ) {
                                alt8=1;
                            }


                        }


                    }
                    else if ( (LA8_2==24) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSpaml.g:369:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalSpaml.g:369:4: (lv_actions_3_0= ruleAction )
            	    // InternalSpaml.g:370:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"polytech.dsl.spaceteam.spaml.Spaml.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSpaml.g:387:3: ( (lv_transition_4_0= ruleTransition ) )
            // InternalSpaml.g:388:4: (lv_transition_4_0= ruleTransition )
            {
            // InternalSpaml.g:388:4: (lv_transition_4_0= ruleTransition )
            // InternalSpaml.g:389:5: lv_transition_4_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_transition_4_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_4_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEInt"
    // InternalSpaml.g:414:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSpaml.g:414:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSpaml.g:415:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSpaml.g:421:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSpaml.g:427:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSpaml.g:428:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSpaml.g:428:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSpaml.g:429:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSpaml.g:429:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpaml.g:430:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSensor"
    // InternalSpaml.g:447:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSpaml.g:447:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSpaml.g:448:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSpaml.g:454:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSpaml.g:460:2: ( ( () otherlv_1= 'Sensor' ) )
            // InternalSpaml.g:461:2: ( () otherlv_1= 'Sensor' )
            {
            // InternalSpaml.g:461:2: ( () otherlv_1= 'Sensor' )
            // InternalSpaml.g:462:3: () otherlv_1= 'Sensor'
            {
            // InternalSpaml.g:462:3: ()
            // InternalSpaml.g:463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalSpaml.g:477:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalSpaml.g:477:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalSpaml.g:478:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalSpaml.g:484:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSpaml.g:490:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalSpaml.g:491:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalSpaml.g:491:2: ( () otherlv_1= 'Actuator' )
            // InternalSpaml.g:492:3: () otherlv_1= 'Actuator'
            {
            // InternalSpaml.g:492:3: ()
            // InternalSpaml.g:493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleAction"
    // InternalSpaml.g:507:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSpaml.g:507:47: (iv_ruleAction= ruleAction EOF )
            // InternalSpaml.g:508:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSpaml.g:514:1: ruleAction returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '=' | otherlv_2= 'setTo' ) ( (lv_value_3_0= ruleSIGNAL ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSpaml.g:520:2: ( ( ( ( ruleEString ) ) (otherlv_1= '=' | otherlv_2= 'setTo' ) ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalSpaml.g:521:2: ( ( ( ruleEString ) ) (otherlv_1= '=' | otherlv_2= 'setTo' ) ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalSpaml.g:521:2: ( ( ( ruleEString ) ) (otherlv_1= '=' | otherlv_2= 'setTo' ) ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalSpaml.g:522:3: ( ( ruleEString ) ) (otherlv_1= '=' | otherlv_2= 'setTo' ) ( (lv_value_3_0= ruleSIGNAL ) )
            {
            // InternalSpaml.g:522:3: ( ( ruleEString ) )
            // InternalSpaml.g:523:4: ( ruleEString )
            {
            // InternalSpaml.g:523:4: ( ruleEString )
            // InternalSpaml.g:524:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpaml.g:538:3: (otherlv_1= '=' | otherlv_2= 'setTo' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpaml.g:539:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpaml.g:544:4: otherlv_2= 'setTo'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getSetToKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSpaml.g:549:3: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalSpaml.g:550:4: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalSpaml.g:550:4: (lv_value_3_0= ruleSIGNAL )
            // InternalSpaml.g:551:5: lv_value_3_0= ruleSIGNAL
            {

            					newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleSIGNAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.SIGNAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalSpaml.g:572:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSpaml.g:572:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalSpaml.g:573:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalSpaml.g:579:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'when' )? ( (lv_handlers_1_0= ruleTransitionHandler ) ) ( (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_handlers_4_0= ruleTransitionHandler ) ) )* (otherlv_5= '->' | otherlv_6= 'then' ) ( ( ruleEString ) ) ( (otherlv_8= '<-' | otherlv_9= 'associate' ) ( (lv_operation_10_0= ruleOPERATION ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_handlers_1_0 = null;

        EObject lv_handlers_4_0 = null;

        Enumerator lv_operation_10_0 = null;



        	enterRule();

        try {
            // InternalSpaml.g:585:2: ( ( (otherlv_0= 'when' )? ( (lv_handlers_1_0= ruleTransitionHandler ) ) ( (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_handlers_4_0= ruleTransitionHandler ) ) )* (otherlv_5= '->' | otherlv_6= 'then' ) ( ( ruleEString ) ) ( (otherlv_8= '<-' | otherlv_9= 'associate' ) ( (lv_operation_10_0= ruleOPERATION ) ) )? ) )
            // InternalSpaml.g:586:2: ( (otherlv_0= 'when' )? ( (lv_handlers_1_0= ruleTransitionHandler ) ) ( (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_handlers_4_0= ruleTransitionHandler ) ) )* (otherlv_5= '->' | otherlv_6= 'then' ) ( ( ruleEString ) ) ( (otherlv_8= '<-' | otherlv_9= 'associate' ) ( (lv_operation_10_0= ruleOPERATION ) ) )? )
            {
            // InternalSpaml.g:586:2: ( (otherlv_0= 'when' )? ( (lv_handlers_1_0= ruleTransitionHandler ) ) ( (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_handlers_4_0= ruleTransitionHandler ) ) )* (otherlv_5= '->' | otherlv_6= 'then' ) ( ( ruleEString ) ) ( (otherlv_8= '<-' | otherlv_9= 'associate' ) ( (lv_operation_10_0= ruleOPERATION ) ) )? )
            // InternalSpaml.g:587:3: (otherlv_0= 'when' )? ( (lv_handlers_1_0= ruleTransitionHandler ) ) ( (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_handlers_4_0= ruleTransitionHandler ) ) )* (otherlv_5= '->' | otherlv_6= 'then' ) ( ( ruleEString ) ) ( (otherlv_8= '<-' | otherlv_9= 'associate' ) ( (lv_operation_10_0= ruleOPERATION ) ) )?
            {
            // InternalSpaml.g:587:3: (otherlv_0= 'when' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpaml.g:588:4: otherlv_0= 'when'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getWhenKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSpaml.g:593:3: ( (lv_handlers_1_0= ruleTransitionHandler ) )
            // InternalSpaml.g:594:4: (lv_handlers_1_0= ruleTransitionHandler )
            {
            // InternalSpaml.g:594:4: (lv_handlers_1_0= ruleTransitionHandler )
            // InternalSpaml.g:595:5: lv_handlers_1_0= ruleTransitionHandler
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_handlers_1_0=ruleTransitionHandler();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					add(
            						current,
            						"handlers",
            						lv_handlers_1_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.TransitionHandler");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpaml.g:612:3: ( (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_handlers_4_0= ruleTransitionHandler ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpaml.g:613:4: (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_handlers_4_0= ruleTransitionHandler ) )
            	    {
            	    // InternalSpaml.g:613:4: (otherlv_2= '&&' | otherlv_3= 'and' )
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
            	            // InternalSpaml.g:614:5: otherlv_2= '&&'
            	            {
            	            otherlv_2=(Token)match(input,26,FOLLOW_11); 

            	            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getAmpersandAmpersandKeyword_2_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalSpaml.g:619:5: otherlv_3= 'and'
            	            {
            	            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            	            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getAndKeyword_2_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSpaml.g:624:4: ( (lv_handlers_4_0= ruleTransitionHandler ) )
            	    // InternalSpaml.g:625:5: (lv_handlers_4_0= ruleTransitionHandler )
            	    {
            	    // InternalSpaml.g:625:5: (lv_handlers_4_0= ruleTransitionHandler )
            	    // InternalSpaml.g:626:6: lv_handlers_4_0= ruleTransitionHandler
            	    {

            	    						newCompositeNode(grammarAccess.getTransitionAccess().getHandlersTransitionHandlerParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_handlers_4_0=ruleTransitionHandler();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"handlers",
            	    							lv_handlers_4_0,
            	    							"polytech.dsl.spaceteam.spaml.Spaml.TransitionHandler");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalSpaml.g:644:3: (otherlv_5= '->' | otherlv_6= 'then' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpaml.g:645:4: otherlv_5= '->'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpaml.g:650:4: otherlv_6= 'then'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getThenKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalSpaml.g:655:3: ( ( ruleEString ) )
            // InternalSpaml.g:656:4: ( ruleEString )
            {
            // InternalSpaml.g:656:4: ( ruleEString )
            // InternalSpaml.g:657:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpaml.g:671:3: ( (otherlv_8= '<-' | otherlv_9= 'associate' ) ( (lv_operation_10_0= ruleOPERATION ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=30 && LA16_0<=31)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpaml.g:672:4: (otherlv_8= '<-' | otherlv_9= 'associate' ) ( (lv_operation_10_0= ruleOPERATION ) )
                    {
                    // InternalSpaml.g:672:4: (otherlv_8= '<-' | otherlv_9= 'associate' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==30) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==31) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSpaml.g:673:5: otherlv_8= '<-'
                            {
                            otherlv_8=(Token)match(input,30,FOLLOW_18); 

                            					newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSpaml.g:678:5: otherlv_9= 'associate'
                            {
                            otherlv_9=(Token)match(input,31,FOLLOW_18); 

                            					newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getAssociateKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSpaml.g:683:4: ( (lv_operation_10_0= ruleOPERATION ) )
                    // InternalSpaml.g:684:5: (lv_operation_10_0= ruleOPERATION )
                    {
                    // InternalSpaml.g:684:5: (lv_operation_10_0= ruleOPERATION )
                    // InternalSpaml.g:685:6: lv_operation_10_0= ruleOPERATION
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOperationOPERATIONEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operation_10_0=ruleOPERATION();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_10_0,
                    							"polytech.dsl.spaceteam.spaml.Spaml.OPERATION");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTransitionHandler"
    // InternalSpaml.g:707:1: entryRuleTransitionHandler returns [EObject current=null] : iv_ruleTransitionHandler= ruleTransitionHandler EOF ;
    public final EObject entryRuleTransitionHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionHandler = null;


        try {
            // InternalSpaml.g:707:58: (iv_ruleTransitionHandler= ruleTransitionHandler EOF )
            // InternalSpaml.g:708:2: iv_ruleTransitionHandler= ruleTransitionHandler EOF
            {
             newCompositeNode(grammarAccess.getTransitionHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionHandler=ruleTransitionHandler();

            state._fsp--;

             current =iv_ruleTransitionHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionHandler"


    // $ANTLR start "ruleTransitionHandler"
    // InternalSpaml.g:714:1: ruleTransitionHandler returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= 'is' ) ( (lv_value_3_0= ruleSIGNAL ) ) ) ;
    public final EObject ruleTransitionHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSpaml.g:720:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= 'is' ) ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalSpaml.g:721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= 'is' ) ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalSpaml.g:721:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= 'is' ) ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalSpaml.g:722:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=' | otherlv_2= 'is' ) ( (lv_value_3_0= ruleSIGNAL ) )
            {
            // InternalSpaml.g:722:3: ( (otherlv_0= RULE_ID ) )
            // InternalSpaml.g:723:4: (otherlv_0= RULE_ID )
            {
            // InternalSpaml.g:723:4: (otherlv_0= RULE_ID )
            // InternalSpaml.g:724:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionHandlerRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionHandlerAccess().getSensorSensorCrossReference_0_0());
            				

            }


            }

            // InternalSpaml.g:735:3: (otherlv_1= '=' | otherlv_2= 'is' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpaml.g:736:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionHandlerAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSpaml.g:741:4: otherlv_2= 'is'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionHandlerAccess().getIsKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSpaml.g:746:3: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalSpaml.g:747:4: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalSpaml.g:747:4: (lv_value_3_0= ruleSIGNAL )
            // InternalSpaml.g:748:5: lv_value_3_0= ruleSIGNAL
            {

            					newCompositeNode(grammarAccess.getTransitionHandlerAccess().getValueSIGNALEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleSIGNAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionHandlerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"polytech.dsl.spaceteam.spaml.Spaml.SIGNAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionHandler"


    // $ANTLR start "ruleSIGNAL"
    // InternalSpaml.g:769:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'HIGH' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSpaml.g:775:2: ( ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'HIGH' ) ) )
            // InternalSpaml.g:776:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'HIGH' ) )
            {
            // InternalSpaml.g:776:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'HIGH' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpaml.g:777:3: (enumLiteral_0= 'LOW' )
                    {
                    // InternalSpaml.g:777:3: (enumLiteral_0= 'LOW' )
                    // InternalSpaml.g:778:4: enumLiteral_0= 'LOW'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:785:3: (enumLiteral_1= 'HIGH' )
                    {
                    // InternalSpaml.g:785:3: (enumLiteral_1= 'HIGH' )
                    // InternalSpaml.g:786:4: enumLiteral_1= 'HIGH'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNAL"


    // $ANTLR start "ruleOPERATION"
    // InternalSpaml.g:796:1: ruleOPERATION returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleOPERATION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSpaml.g:802:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalSpaml.g:803:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalSpaml.g:803:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpaml.g:804:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalSpaml.g:804:3: (enumLiteral_0= 'AND' )
                    // InternalSpaml.g:805:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOPERATIONAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpaml.g:812:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalSpaml.g:812:3: (enumLiteral_1= 'OR' )
                    // InternalSpaml.g:813:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOPERATIONAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPERATION"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000630000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100800000L});

}