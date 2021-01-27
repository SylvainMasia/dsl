/**
 */
package arduinoML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see arduinoML.ArduinoMLFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/arduinoML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoMLPackage eINSTANCE = arduinoML.impl.ArduinoMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoML.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.NamedElementImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.ProgramImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Plugged Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PLUGGED_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INITIAL_STATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.PluggedElementImpl <em>Plugged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.PluggedElementImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getPluggedElement()
	 * @generated
	 */
	int PLUGGED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGGED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGGED_ELEMENT__PIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plugged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGGED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plugged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGGED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.SensorImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = PLUGGED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PIN = PLUGGED_ELEMENT__PIN;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = PLUGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = PLUGGED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.ActuatorImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = PLUGGED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PIN = PLUGGED_ELEMENT__PIN;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = PLUGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = PLUGGED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.StateImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.ActionImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTUATOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.TransitionImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.ConditionImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.SensorAnalogImpl <em>Sensor Analog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.SensorAnalogImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getSensorAnalog()
	 * @generated
	 */
	int SENSOR_ANALOG = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ANALOG__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ANALOG__PIN = SENSOR__PIN;

	/**
	 * The number of structural features of the '<em>Sensor Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ANALOG_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_ANALOG_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.SensorDigitalImpl <em>Sensor Digital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.SensorDigitalImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getSensorDigital()
	 * @generated
	 */
	int SENSOR_DIGITAL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DIGITAL__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DIGITAL__PIN = SENSOR__PIN;

	/**
	 * The number of structural features of the '<em>Sensor Digital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DIGITAL_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Digital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_DIGITAL_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.TemporalConditionImpl <em>Temporal Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.TemporalConditionImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getTemporalCondition()
	 * @generated
	 */
	int TEMPORAL_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONDITION__DELAY = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temporal Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.impl.LogicalConditionImpl
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getLogicalCondition()
	 * @generated
	 */
	int LOGICAL_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoML.SIGNAL <em>SIGNAL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.SIGNAL
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getSIGNAL()
	 * @generated
	 */
	int SIGNAL = 13;

	/**
	 * The meta object id for the '{@link arduinoML.OPERATION <em>OPERATION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoML.OPERATION
	 * @see arduinoML.impl.ArduinoMLPackageImpl#getOPERATION()
	 * @generated
	 */
	int OPERATION = 14;

	/**
	 * Returns the meta object for class '{@link arduinoML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see arduinoML.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link arduinoML.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoML.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link arduinoML.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see arduinoML.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoML.Program#getPluggedElements <em>Plugged Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugged Elements</em>'.
	 * @see arduinoML.Program#getPluggedElements()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_PluggedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoML.Program#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see arduinoML.Program#getStates()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_States();

	/**
	 * Returns the meta object for the reference '{@link arduinoML.Program#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see arduinoML.Program#getInitialState()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_InitialState();

	/**
	 * Returns the meta object for class '{@link arduinoML.PluggedElement <em>Plugged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugged Element</em>'.
	 * @see arduinoML.PluggedElement
	 * @generated
	 */
	EClass getPluggedElement();

	/**
	 * Returns the meta object for the attribute '{@link arduinoML.PluggedElement#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see arduinoML.PluggedElement#getPin()
	 * @see #getPluggedElement()
	 * @generated
	 */
	EAttribute getPluggedElement_Pin();

	/**
	 * Returns the meta object for class '{@link arduinoML.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see arduinoML.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link arduinoML.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see arduinoML.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link arduinoML.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see arduinoML.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoML.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see arduinoML.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoML.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see arduinoML.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for class '{@link arduinoML.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see arduinoML.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link arduinoML.Action#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see arduinoML.Action#getActuator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actuator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoML.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoML.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for class '{@link arduinoML.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see arduinoML.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link arduinoML.Transition#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see arduinoML.Transition#getNext()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoML.Transition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see arduinoML.Transition#getConditions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoML.Transition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoML.Transition#getOperation()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoML.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see arduinoML.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link arduinoML.SensorAnalog <em>Sensor Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Analog</em>'.
	 * @see arduinoML.SensorAnalog
	 * @generated
	 */
	EClass getSensorAnalog();

	/**
	 * Returns the meta object for class '{@link arduinoML.SensorDigital <em>Sensor Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Digital</em>'.
	 * @see arduinoML.SensorDigital
	 * @generated
	 */
	EClass getSensorDigital();

	/**
	 * Returns the meta object for class '{@link arduinoML.TemporalCondition <em>Temporal Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Condition</em>'.
	 * @see arduinoML.TemporalCondition
	 * @generated
	 */
	EClass getTemporalCondition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoML.TemporalCondition#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see arduinoML.TemporalCondition#getDelay()
	 * @see #getTemporalCondition()
	 * @generated
	 */
	EAttribute getTemporalCondition_Delay();

	/**
	 * Returns the meta object for class '{@link arduinoML.LogicalCondition <em>Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Condition</em>'.
	 * @see arduinoML.LogicalCondition
	 * @generated
	 */
	EClass getLogicalCondition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoML.LogicalCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoML.LogicalCondition#getValue()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EAttribute getLogicalCondition_Value();

	/**
	 * Returns the meta object for the reference '{@link arduinoML.LogicalCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see arduinoML.LogicalCondition#getSensor()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EReference getLogicalCondition_Sensor();

	/**
	 * Returns the meta object for enum '{@link arduinoML.SIGNAL <em>SIGNAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIGNAL</em>'.
	 * @see arduinoML.SIGNAL
	 * @generated
	 */
	EEnum getSIGNAL();

	/**
	 * Returns the meta object for enum '{@link arduinoML.OPERATION <em>OPERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OPERATION</em>'.
	 * @see arduinoML.OPERATION
	 * @generated
	 */
	EEnum getOPERATION();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoMLFactory getArduinoMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link arduinoML.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.NamedElementImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.ProgramImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Plugged Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PLUGGED_ELEMENTS = eINSTANCE.getProgram_PluggedElements();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATES = eINSTANCE.getProgram_States();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__INITIAL_STATE = eINSTANCE.getProgram_InitialState();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.PluggedElementImpl <em>Plugged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.PluggedElementImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getPluggedElement()
		 * @generated
		 */
		EClass PLUGGED_ELEMENT = eINSTANCE.getPluggedElement();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGGED_ELEMENT__PIN = eINSTANCE.getPluggedElement_Pin();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.SensorImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.ActuatorImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.StateImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.ActionImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTUATOR = eINSTANCE.getAction_Actuator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.TransitionImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__NEXT = eINSTANCE.getTransition_Next();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITIONS = eINSTANCE.getTransition_Conditions();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OPERATION = eINSTANCE.getTransition_Operation();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.ConditionImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.SensorAnalogImpl <em>Sensor Analog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.SensorAnalogImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getSensorAnalog()
		 * @generated
		 */
		EClass SENSOR_ANALOG = eINSTANCE.getSensorAnalog();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.SensorDigitalImpl <em>Sensor Digital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.SensorDigitalImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getSensorDigital()
		 * @generated
		 */
		EClass SENSOR_DIGITAL = eINSTANCE.getSensorDigital();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.TemporalConditionImpl <em>Temporal Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.TemporalConditionImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getTemporalCondition()
		 * @generated
		 */
		EClass TEMPORAL_CONDITION = eINSTANCE.getTemporalCondition();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_CONDITION__DELAY = eINSTANCE.getTemporalCondition_Delay();

		/**
		 * The meta object literal for the '{@link arduinoML.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.impl.LogicalConditionImpl
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getLogicalCondition()
		 * @generated
		 */
		EClass LOGICAL_CONDITION = eINSTANCE.getLogicalCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CONDITION__VALUE = eINSTANCE.getLogicalCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CONDITION__SENSOR = eINSTANCE.getLogicalCondition_Sensor();

		/**
		 * The meta object literal for the '{@link arduinoML.SIGNAL <em>SIGNAL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.SIGNAL
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getSIGNAL()
		 * @generated
		 */
		EEnum SIGNAL = eINSTANCE.getSIGNAL();

		/**
		 * The meta object literal for the '{@link arduinoML.OPERATION <em>OPERATION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoML.OPERATION
		 * @see arduinoML.impl.ArduinoMLPackageImpl#getOPERATION()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getOPERATION();

	}

} //ArduinoMLPackage
