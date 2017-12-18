/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.Player;
import eSport.Position;
import eSport.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.PlayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link eSport.impl.PlayerImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends PersonImpl implements Player {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.ATTACK_DAMAGE_CARRY;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.PLAYER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (eContainerFeatureID() != ESportPackage.PLAYER__TEAM) return null;
		return (Team)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(Team newTeam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTeam, ESportPackage.PLAYER__TEAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		if (newTeam != eInternalContainer() || (eContainerFeatureID() != ESportPackage.PLAYER__TEAM && newTeam != null)) {
			if (EcoreUtil.isAncestor(this, newTeam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTeam != null)
				msgs = ((InternalEObject)newTeam).eInverseAdd(this, ESportPackage.TEAM__PLAYERS, Team.class, msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.PLAYER__TEAM, newTeam, newTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESportPackage.PLAYER__TEAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTeam((Team)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESportPackage.PLAYER__TEAM:
				return basicSetTeam(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ESportPackage.PLAYER__TEAM:
				return eInternalContainer().eInverseRemove(this, ESportPackage.TEAM__PLAYERS, Team.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESportPackage.PLAYER__POSITION:
				return getPosition();
			case ESportPackage.PLAYER__TEAM:
				return getTeam();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ESportPackage.PLAYER__POSITION:
				setPosition((Position)newValue);
				return;
			case ESportPackage.PLAYER__TEAM:
				setTeam((Team)newValue);
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
			case ESportPackage.PLAYER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ESportPackage.PLAYER__TEAM:
				setTeam((Team)null);
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
			case ESportPackage.PLAYER__POSITION:
				return position != POSITION_EDEFAULT;
			case ESportPackage.PLAYER__TEAM:
				return getTeam() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
