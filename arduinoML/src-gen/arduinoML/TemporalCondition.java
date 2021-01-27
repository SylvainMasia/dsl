/**
 */
package arduinoML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.TemporalCondition#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getTemporalCondition()
 * @model
 * @generated
 */
public interface TemporalCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see arduinoML.ArduinoMLPackage#getTemporalCondition_Delay()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link arduinoML.TemporalCondition#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

} // TemporalCondition
