/*
 * generated by Xtext 2.14.0
 */
package polytech.dsl.spaceteam.spaml.formatting2

import arduinoML.Program
import arduinoML.State
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import polytech.dsl.spaceteam.spaml.services.SpamlGrammarAccess

class SpamlFormatter extends AbstractFormatter2 {
	
	@Inject extension SpamlGrammarAccess

	def dispatch void format(Program program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (pluggedElement : program.pluggedElements) {
			pluggedElement.format
		}
		for (state : program.states) {
			state.format
		}
	}

	def dispatch void format(State state, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (action : state.actions) {
			action.format
		}
		for (transition : state.transitions) {
			transition.format
		}
	}
	
	// TODO: implement for 
}
