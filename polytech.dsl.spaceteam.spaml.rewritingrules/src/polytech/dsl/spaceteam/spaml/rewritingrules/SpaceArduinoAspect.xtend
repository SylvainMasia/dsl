package polytech.dsl.spaceteam.spaml.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import arduinoML.Program
import arduinoML.PluggedElement
import arduinoML.Sensor
import arduinoML.Actuator

import static extension polytech.dsl.spaceteam.spaml.rewritingrules.PluggedElementAspect.*
import arduinoML.State

// ############################ PLUGGED ELEMENTS ########################### //
@Aspect(className=PluggedElement)
abstract class PluggedElementAspect {
	def abstract void init();
}

@Aspect(className=Sensor)
class SensorAspect extends PluggedElementAspect {
	
	@Step
	def void init() {
		
	}
}

@Aspect(className=Actuator)
class ActuatorAspect extends PluggedElementAspect {
	
	@Step
	def void init() {
		
	}
}

// ############################ PLUGGED ELEMENTS ########################### //

// ############################ MAIN ########################### //
@Aspect(className=Program)
class ProgramAspect {
	
	@Main
	def void entryPoint() {
		
	}
}
// ############################ MAIN ########################### //
