/**
 */
package arduinoML.impl;

import arduinoML.ArduinoMLPackage;
import arduinoML.PluggedElement;
import arduinoML.Program;
import arduinoML.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.ProgramImpl#getPluggedElements <em>Plugged Elements</em>}</li>
 *   <li>{@link arduinoML.impl.ProgramImpl#getStates <em>States</em>}</li>
 *   <li>{@link arduinoML.impl.ProgramImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends NamedElementImpl implements Program {
	/**
	 * The cached value of the '{@link #getPluggedElements() <em>Plugged Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluggedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PluggedElement> pluggedElements;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PluggedElement> getPluggedElements() {
		if (pluggedElements == null) {
			pluggedElements = new EObjectContainmentEList<PluggedElement>(PluggedElement.class, this,
					ArduinoMLPackage.PROGRAM__PLUGGED_ELEMENTS);
		}
		return pluggedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ArduinoMLPackage.PROGRAM__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject) initialState;
			initialState = (State) eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.PROGRAM__INITIAL_STATE,
							oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.PROGRAM__INITIAL_STATE,
					oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArduinoMLPackage.PROGRAM__PLUGGED_ELEMENTS:
			return ((InternalEList<?>) getPluggedElements()).basicRemove(otherEnd, msgs);
		case ArduinoMLPackage.PROGRAM__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoMLPackage.PROGRAM__PLUGGED_ELEMENTS:
			return getPluggedElements();
		case ArduinoMLPackage.PROGRAM__STATES:
			return getStates();
		case ArduinoMLPackage.PROGRAM__INITIAL_STATE:
			if (resolve)
				return getInitialState();
			return basicGetInitialState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArduinoMLPackage.PROGRAM__PLUGGED_ELEMENTS:
			getPluggedElements().clear();
			getPluggedElements().addAll((Collection<? extends PluggedElement>) newValue);
			return;
		case ArduinoMLPackage.PROGRAM__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case ArduinoMLPackage.PROGRAM__INITIAL_STATE:
			setInitialState((State) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArduinoMLPackage.PROGRAM__PLUGGED_ELEMENTS:
			getPluggedElements().clear();
			return;
		case ArduinoMLPackage.PROGRAM__STATES:
			getStates().clear();
			return;
		case ArduinoMLPackage.PROGRAM__INITIAL_STATE:
			setInitialState((State) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArduinoMLPackage.PROGRAM__PLUGGED_ELEMENTS:
			return pluggedElements != null && !pluggedElements.isEmpty();
		case ArduinoMLPackage.PROGRAM__STATES:
			return states != null && !states.isEmpty();
		case ArduinoMLPackage.PROGRAM__INITIAL_STATE:
			return initialState != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
