/**
 */
package arduinoML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.LogicalCondition#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoML.LogicalCondition#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getLogicalCondition()
 * @model
 * @generated
 */
public interface LogicalCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoML.SIGNAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see arduinoML.SIGNAL
	 * @see #setValue(SIGNAL)
	 * @see arduinoML.ArduinoMLPackage#getLogicalCondition_Value()
	 * @model required="true"
	 * @generated
	 */
	SIGNAL getValue();

	/**
	 * Sets the value of the '{@link arduinoML.LogicalCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see arduinoML.SIGNAL
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SIGNAL value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see arduinoML.ArduinoMLPackage#getLogicalCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link arduinoML.LogicalCondition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // LogicalCondition
