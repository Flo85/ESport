/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.FinalStage;
import eSport.Group;
import eSport.Match;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.MatchImpl#getMaxNbGames <em>Max Nb Games</em>}</li>
 *   <li>{@link eSport.impl.MatchImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eSport.impl.MatchImpl#getFinalstage <em>Finalstage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getMaxNbGames() <em>Max Nb Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbGames()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NB_GAMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNbGames() <em>Max Nb Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbGames()
	 * @generated
	 * @ordered
	 */
	protected int maxNbGames = MAX_NB_GAMES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getFinalstage() <em>Finalstage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalstage()
	 * @generated
	 * @ordered
	 */
	protected FinalStage finalstage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNbGames() {
		return maxNbGames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNbGames(int newMaxNbGames) {
		int oldMaxNbGames = maxNbGames;
		maxNbGames = newMaxNbGames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__MAX_NB_GAMES, oldMaxNbGames, maxNbGames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (Group)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.MATCH__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, ESportPackage.GROUP__MATCHS, Group.class, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, ESportPackage.GROUP__MATCHS, Group.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStage getFinalstage() {
		if (finalstage != null && finalstage.eIsProxy()) {
			InternalEObject oldFinalstage = (InternalEObject)finalstage;
			finalstage = (FinalStage)eResolveProxy(oldFinalstage);
			if (finalstage != oldFinalstage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.MATCH__FINALSTAGE, oldFinalstage, finalstage));
			}
		}
		return finalstage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStage basicGetFinalstage() {
		return finalstage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalstage(FinalStage newFinalstage, NotificationChain msgs) {
		FinalStage oldFinalstage = finalstage;
		finalstage = newFinalstage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__FINALSTAGE, oldFinalstage, newFinalstage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalstage(FinalStage newFinalstage) {
		if (newFinalstage != finalstage) {
			NotificationChain msgs = null;
			if (finalstage != null)
				msgs = ((InternalEObject)finalstage).eInverseRemove(this, ESportPackage.FINAL_STAGE__MATCHS, FinalStage.class, msgs);
			if (newFinalstage != null)
				msgs = ((InternalEObject)newFinalstage).eInverseAdd(this, ESportPackage.FINAL_STAGE__MATCHS, FinalStage.class, msgs);
			msgs = basicSetFinalstage(newFinalstage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__FINALSTAGE, newFinalstage, newFinalstage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESportPackage.MATCH__GROUP:
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, ESportPackage.GROUP__MATCHS, Group.class, msgs);
				return basicSetGroup((Group)otherEnd, msgs);
			case ESportPackage.MATCH__FINALSTAGE:
				if (finalstage != null)
					msgs = ((InternalEObject)finalstage).eInverseRemove(this, ESportPackage.FINAL_STAGE__MATCHS, FinalStage.class, msgs);
				return basicSetFinalstage((FinalStage)otherEnd, msgs);
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
			case ESportPackage.MATCH__GROUP:
				return basicSetGroup(null, msgs);
			case ESportPackage.MATCH__FINALSTAGE:
				return basicSetFinalstage(null, msgs);
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
			case ESportPackage.MATCH__MAX_NB_GAMES:
				return getMaxNbGames();
			case ESportPackage.MATCH__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case ESportPackage.MATCH__FINALSTAGE:
				if (resolve) return getFinalstage();
				return basicGetFinalstage();
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
			case ESportPackage.MATCH__MAX_NB_GAMES:
				setMaxNbGames((Integer)newValue);
				return;
			case ESportPackage.MATCH__GROUP:
				setGroup((Group)newValue);
				return;
			case ESportPackage.MATCH__FINALSTAGE:
				setFinalstage((FinalStage)newValue);
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
			case ESportPackage.MATCH__MAX_NB_GAMES:
				setMaxNbGames(MAX_NB_GAMES_EDEFAULT);
				return;
			case ESportPackage.MATCH__GROUP:
				setGroup((Group)null);
				return;
			case ESportPackage.MATCH__FINALSTAGE:
				setFinalstage((FinalStage)null);
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
			case ESportPackage.MATCH__MAX_NB_GAMES:
				return maxNbGames != MAX_NB_GAMES_EDEFAULT;
			case ESportPackage.MATCH__GROUP:
				return group != null;
			case ESportPackage.MATCH__FINALSTAGE:
				return finalstage != null;
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
		result.append(" (maxNbGames: ");
		result.append(maxNbGames);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
