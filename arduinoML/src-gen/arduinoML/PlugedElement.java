/**
 */
package arduinoML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pluged Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.PlugedElement#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getPlugedElement()
 * @model abstract="true"
 * @generated
 */
public interface PlugedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see arduinoML.ArduinoMLPackage#getPlugedElement_Pin()
	 * @model required="true"
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link arduinoML.PlugedElement#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

} // PlugedElement
