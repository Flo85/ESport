/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.Group;
import eSport.GroupStage;
import eSport.Match;
import eSport.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.GroupImpl#getGroupstage <em>Groupstage</em>}</li>
 *   <li>{@link eSport.impl.GroupImpl#getMatchs <em>Matchs</em>}</li>
 *   <li>{@link eSport.impl.GroupImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
	/**
	 * The cached value of the '{@link #getMatchs() <em>Matchs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchs;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupStage getGroupstage() {
		if (eContainerFeatureID() != ESportPackage.GROUP__GROUPSTAGE) return null;
		return (GroupStage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupstage(GroupStage newGroupstage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroupstage, ESportPackage.GROUP__GROUPSTAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupstage(GroupStage newGroupstage) {
		if (newGroupstage != eInternalContainer() || (eContainerFeatureID() != ESportPackage.GROUP__GROUPSTAGE && newGroupstage != null)) {
			if (EcoreUtil.isAncestor(this, newGroupstage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroupstage != null)
				msgs = ((InternalEObject)newGroupstage).eInverseAdd(this, ESportPackage.GROUP_STAGE__GROUPS, GroupStage.class, msgs);
			msgs = basicSetGroupstage(newGroupstage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.GROUP__GROUPSTAGE, newGroupstage, newGroupstage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchs() {
		if (matchs == null) {
			matchs = new EObjectWithInverseResolvingEList<Match>(Match.class, this, ESportPackage.GROUP__MATCHS, ESportPackage.MATCH__GROUP);
		}
		return matchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectWithInverseResolvingEList.ManyInverse<Team>(Team.class, this, ESportPackage.GROUP__TEAMS, ESportPackage.TEAM__GROUPS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESportPackage.GROUP__GROUPSTAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroupstage((GroupStage)otherEnd, msgs);
			case ESportPackage.GROUP__MATCHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatchs()).basicAdd(otherEnd, msgs);
			case ESportPackage.GROUP__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
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
			case ESportPackage.GROUP__GROUPSTAGE:
				return basicSetGroupstage(null, msgs);
			case ESportPackage.GROUP__MATCHS:
				return ((InternalEList<?>)getMatchs()).basicRemove(otherEnd, msgs);
			case ESportPackage.GROUP__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
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
			case ESportPackage.GROUP__GROUPSTAGE:
				return eInternalContainer().eInverseRemove(this, ESportPackage.GROUP_STAGE__GROUPS, GroupStage.class, msgs);
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
			case ESportPackage.GROUP__GROUPSTAGE:
				return getGroupstage();
			case ESportPackage.GROUP__MATCHS:
				return getMatchs();
			case ESportPackage.GROUP__TEAMS:
				return getTeams();
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
			case ESportPackage.GROUP__GROUPSTAGE:
				setGroupstage((GroupStage)newValue);
				return;
			case ESportPackage.GROUP__MATCHS:
				getMatchs().clear();
				getMatchs().addAll((Collection<? extends Match>)newValue);
				return;
			case ESportPackage.GROUP__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
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
			case ESportPackage.GROUP__GROUPSTAGE:
				setGroupstage((GroupStage)null);
				return;
			case ESportPackage.GROUP__MATCHS:
				getMatchs().clear();
				return;
			case ESportPackage.GROUP__TEAMS:
				getTeams().clear();
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
			case ESportPackage.GROUP__GROUPSTAGE:
				return getGroupstage() != null;
			case ESportPackage.GROUP__MATCHS:
				return matchs != null && !matchs.isEmpty();
			case ESportPackage.GROUP__TEAMS:
				return teams != null && !teams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
