package polytech.dsl.spaceteam.internal.spaml;

public class Main {
	public static void main(String[] args) {
		/*
		// ########### SCENARIO 1 ###########
		Program.create()
			.setName("very_simple_alarm")
			.addPluggedElement(Actuator.create().setPin(3).setName("red_led"))
			.addPluggedElement(Actuator.create().setPin(4).setName("buzzer"))
			.addPluggedElement(SensorDigital.create().setPin(2).setName("button"))
			.setInitialState(State.create().setName("off"))
			.addState(State.create().setName("off")
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("red_led"))
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("buzzer"))
					.addTransition(Transition.create().setNext("on")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button"))
					)
			)
			.addState(State.create().setName("on")
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("red_led"))
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("buzzer"))
					.addTransition(Transition.create().setNext("off")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.LOW).setSensor("button"))
					)
			).generateArduinoCode();
		*/
			
		/*
		// ########### SCENARIO 2 ###########
		Program.create()
			.setName("dual_check_alarm")
			.addPluggedElement(Actuator.create().setPin(4).setName("red_led"))
			.addPluggedElement(Actuator.create().setPin(5).setName("buzzer"))
			.addPluggedElement(SensorDigital.create().setPin(2).setName("button"))
			.addPluggedElement(SensorDigital.create().setPin(3).setName("button2"))
			.setInitialState(State.create().setName("off"))
			.addState(State.create().setName("off")
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("red_led"))
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("buzzer"))
					.addTransition(Transition.create().setNext("on")
							.setOperation(OPERATION.AND)
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button"))
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button2"))
					)
			)
			.addState(State.create().setName("on")
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("red_led"))
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("buzzer"))
					.addTransition(Transition.create().setNext("off")
							.setOperation(OPERATION.OR)
							.addCondition(LogicalCondition.create().setValue(SIGNAL.LOW).setSensor("button"))
							.addCondition(LogicalCondition.create().setValue(SIGNAL.LOW).setSensor("button2"))
					)
			).generateArduinoCode();
		*/
		
		/*
		// ########### SCENARIO 3 ###########
		Program.create()
			.setName("state_based_alarm")
			.addPluggedElement(Actuator.create().setPin(4).setName("red_led"))
			.addPluggedElement(SensorDigital.create().setPin(2).setName("button"))
			.setInitialState(State.create().setName("off"))
			.addState(State.create().setName("off")
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("red_led"))
					.addTransition(Transition.create().setNext("on")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button"))
					)
			)
			.addState(State.create().setName("on")
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("red_led"))
					.addTransition(Transition.create().setNext("off")
							.setOperation(OPERATION.OR)
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button"))
					)
			).generateArduinoCode();
		*/
		
		/*
		// ########### SCENARIO 4 ###########
		Program.create()
			.setName("multi_state_alarm")
			.addPluggedElement(Actuator.create().setPin(3).setName("red_led"))
			.addPluggedElement(Actuator.create().setPin(4).setName("buzzer"))
			.addPluggedElement(SensorDigital.create().setPin(2).setName("button"))
			.setInitialState(State.create().setName("initial"))
			.addState(State.create().setName("initial")
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("red_led"))
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("buzzer"))
					.addTransition(Transition.create().setNext("noiseon")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button"))
					)
			)
			.addState(State.create().setName("noiseon")
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("red_led"))
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("buzzer"))
					.addTransition(Transition.create().setNext("ledon")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button"))
					)
			)
			.addState(State.create().setName("ledon")
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("red_led"))
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("buzzer"))
					.addTransition(Transition.create().setNext("initial")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("button"))
					)
			).generateArduinoCode();
		*/
		
		/*
		// ########### SCENARIO TEMPORAL ###########
		Program.create()
			.setName("temporal_transition")
			.addPluggedElement(Actuator.create().setPin(4).setName("LED1"))
			.addPluggedElement(Actuator.create().setPin(5).setName("LED2"))
			.addPluggedElement(SensorDigital.create().setPin(2).setName("B1"))
			.addPluggedElement(SensorDigital.create().setPin(3).setName("B2"))
			.setInitialState(State.create().setName("off"))
			.addState(State.create().setName("off")
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("LED1"))
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("LED2"))
					.addTransition(Transition.create().setNext("on")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("B1"))
					)
			)
			.addState(State.create().setName("on")
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("LED1"))
					.addAction(Action.create().setValue(SIGNAL.LOW).setActuator("LED2"))
					.addTransition(Transition.create().setNext("off")
							.setOperation(OPERATION.AND)
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("B1"))
							.addCondition(TemporalCondition.create().setDelay(4000))
					)
					.addTransition(Transition.create().setNext("other")
							.addCondition(LogicalCondition.create().setValue(SIGNAL.HIGH).setSensor("B2"))
					)
			)
			.addState(State.create().setName("other")
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("LED1"))
					.addAction(Action.create().setValue(SIGNAL.HIGH).setActuator("LED2"))
					.addTransition(Transition.create().setNext("off")
							.addCondition(TemporalCondition.create().setDelay(3000))
					)
			).generateArduinoCode();
			*/
	}

}
