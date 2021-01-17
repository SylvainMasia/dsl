/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Program#getPluggedElements <em>Plugged Elements</em>}</li>
 *   <li>{@link arduinoML.Program#getStates <em>States</em>}</li>
 *   <li>{@link arduinoML.Program#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Plugged Elements</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.PluggedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugged Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugged Elements</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getProgram_PluggedElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PluggedElement> getPluggedElements();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getProgram_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see arduinoML.ArduinoMLPackage#getProgram_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link arduinoML.Program#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

} // Program
