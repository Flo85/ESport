/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.Group;
import eSport.GroupStage;
import eSport.GroupStageType;
import eSport.League;
import eSport.Tournament;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.GroupStageImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link eSport.impl.GroupStageImpl#getType <em>Type</em>}</li>
 *   <li>{@link eSport.impl.GroupStageImpl#getTournament <em>Tournament</em>}</li>
 *   <li>{@link eSport.impl.GroupStageImpl#getMaxNbGames <em>Max Nb Games</em>}</li>
 *   <li>{@link eSport.impl.GroupStageImpl#getLeague <em>League</em>}</li>
 *   <li>{@link eSport.impl.GroupStageImpl#getMeetingsInSameGroup <em>Meetings In Same Group</em>}</li>
 *   <li>{@link eSport.impl.GroupStageImpl#getMeetingsWithOtherGroups <em>Meetings With Other Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupStageImpl extends MinimalEObjectImpl.Container implements GroupStage {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GroupStageType TYPE_EDEFAULT = GroupStageType.LEAGUE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GroupStageType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getMeetingsInSameGroup() <em>Meetings In Same Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingsInSameGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int MEETINGS_IN_SAME_GROUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeetingsInSameGroup() <em>Meetings In Same Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingsInSameGroup()
	 * @generated
	 * @ordered
	 */
	protected int meetingsInSameGroup = MEETINGS_IN_SAME_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeetingsWithOtherGroups() <em>Meetings With Other Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingsWithOtherGroups()
	 * @generated
	 * @ordered
	 */
	protected static final int MEETINGS_WITH_OTHER_GROUPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeetingsWithOtherGroups() <em>Meetings With Other Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingsWithOtherGroups()
	 * @generated
	 * @ordered
	 */
	protected int meetingsWithOtherGroups = MEETINGS_WITH_OTHER_GROUPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.GROUP_STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentWithInverseEList<Group>(Group.class, this, ESportPackage.GROUP_STAGE__GROUPS, ESportPackage.GROUP__GROUPSTAGE);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupStageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GroupStageType newType) {
		GroupStageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.GROUP_STAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament getTournament() {
		if (eContainerFeatureID() != ESportPackage.GROUP_STAGE__TOURNAMENT) return null;
		return (Tournament)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournament(Tournament newTournament, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTournament, ESportPackage.GROUP_STAGE__TOURNAMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournament(Tournament newTournament) {
		if (newTournament != eInternalContainer() || (eContainerFeatureID() != ESportPackage.GROUP_STAGE__TOURNAMENT && newTournament != null)) {
			if (EcoreUtil.isAncestor(this, newTournament))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTournament != null)
				msgs = ((InternalEObject)newTournament).eInverseAdd(this, ESportPackage.TOURNAMENT__GROUPSTAGES, Tournament.class, msgs);
			msgs = basicSetTournament(newTournament, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.GROUP_STAGE__TOURNAMENT, newTournament, newTournament));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.GROUP_STAGE__MAX_NB_GAMES, oldMaxNbGames, maxNbGames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League getLeague() {
		if (eContainerFeatureID() != ESportPackage.GROUP_STAGE__LEAGUE) return null;
		return (League)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeague, ESportPackage.GROUP_STAGE__LEAGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeague(League newLeague) {
		if (newLeague != eInternalContainer() || (eContainerFeatureID() != ESportPackage.GROUP_STAGE__LEAGUE && newLeague != null)) {
			if (EcoreUtil.isAncestor(this, newLeague))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, ESportPackage.LEAGUE__GROUPSTAGE, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.GROUP_STAGE__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMeetingsInSameGroup() {
		return meetingsInSameGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeetingsInSameGroup(int newMeetingsInSameGroup) {
		int oldMeetingsInSameGroup = meetingsInSameGroup;
		meetingsInSameGroup = newMeetingsInSameGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.GROUP_STAGE__MEETINGS_IN_SAME_GROUP, oldMeetingsInSameGroup, meetingsInSameGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMeetingsWithOtherGroups() {
		return meetingsWithOtherGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeetingsWithOtherGroups(int newMeetingsWithOtherGroups) {
		int oldMeetingsWithOtherGroups = meetingsWithOtherGroups;
		meetingsWithOtherGroups = newMeetingsWithOtherGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.GROUP_STAGE__MEETINGS_WITH_OTHER_GROUPS, oldMeetingsWithOtherGroups, meetingsWithOtherGroups));
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
			case ESportPackage.GROUP_STAGE__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
			case ESportPackage.GROUP_STAGE__TOURNAMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTournament((Tournament)otherEnd, msgs);
			case ESportPackage.GROUP_STAGE__LEAGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeague((League)otherEnd, msgs);
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
			case ESportPackage.GROUP_STAGE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case ESportPackage.GROUP_STAGE__TOURNAMENT:
				return basicSetTournament(null, msgs);
			case ESportPackage.GROUP_STAGE__LEAGUE:
				return basicSetLeague(null, msgs);
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
			case ESportPackage.GROUP_STAGE__TOURNAMENT:
				return eInternalContainer().eInverseRemove(this, ESportPackage.TOURNAMENT__GROUPSTAGES, Tournament.class, msgs);
			case ESportPackage.GROUP_STAGE__LEAGUE:
				return eInternalContainer().eInverseRemove(this, ESportPackage.LEAGUE__GROUPSTAGE, League.class, msgs);
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
			case ESportPackage.GROUP_STAGE__GROUPS:
				return getGroups();
			case ESportPackage.GROUP_STAGE__TYPE:
				return getType();
			case ESportPackage.GROUP_STAGE__TOURNAMENT:
				return getTournament();
			case ESportPackage.GROUP_STAGE__MAX_NB_GAMES:
				return getMaxNbGames();
			case ESportPackage.GROUP_STAGE__LEAGUE:
				return getLeague();
			case ESportPackage.GROUP_STAGE__MEETINGS_IN_SAME_GROUP:
				return getMeetingsInSameGroup();
			case ESportPackage.GROUP_STAGE__MEETINGS_WITH_OTHER_GROUPS:
				return getMeetingsWithOtherGroups();
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
			case ESportPackage.GROUP_STAGE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case ESportPackage.GROUP_STAGE__TYPE:
				setType((GroupStageType)newValue);
				return;
			case ESportPackage.GROUP_STAGE__TOURNAMENT:
				setTournament((Tournament)newValue);
				return;
			case ESportPackage.GROUP_STAGE__MAX_NB_GAMES:
				setMaxNbGames((Integer)newValue);
				return;
			case ESportPackage.GROUP_STAGE__LEAGUE:
				setLeague((League)newValue);
				return;
			case ESportPackage.GROUP_STAGE__MEETINGS_IN_SAME_GROUP:
				setMeetingsInSameGroup((Integer)newValue);
				return;
			case ESportPackage.GROUP_STAGE__MEETINGS_WITH_OTHER_GROUPS:
				setMeetingsWithOtherGroups((Integer)newValue);
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
			case ESportPackage.GROUP_STAGE__GROUPS:
				getGroups().clear();
				return;
			case ESportPackage.GROUP_STAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ESportPackage.GROUP_STAGE__TOURNAMENT:
				setTournament((Tournament)null);
				return;
			case ESportPackage.GROUP_STAGE__MAX_NB_GAMES:
				setMaxNbGames(MAX_NB_GAMES_EDEFAULT);
				return;
			case ESportPackage.GROUP_STAGE__LEAGUE:
				setLeague((League)null);
				return;
			case ESportPackage.GROUP_STAGE__MEETINGS_IN_SAME_GROUP:
				setMeetingsInSameGroup(MEETINGS_IN_SAME_GROUP_EDEFAULT);
				return;
			case ESportPackage.GROUP_STAGE__MEETINGS_WITH_OTHER_GROUPS:
				setMeetingsWithOtherGroups(MEETINGS_WITH_OTHER_GROUPS_EDEFAULT);
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
			case ESportPackage.GROUP_STAGE__GROUPS:
				return groups != null && !groups.isEmpty();
			case ESportPackage.GROUP_STAGE__TYPE:
				return type != TYPE_EDEFAULT;
			case ESportPackage.GROUP_STAGE__TOURNAMENT:
				return getTournament() != null;
			case ESportPackage.GROUP_STAGE__MAX_NB_GAMES:
				return maxNbGames != MAX_NB_GAMES_EDEFAULT;
			case ESportPackage.GROUP_STAGE__LEAGUE:
				return getLeague() != null;
			case ESportPackage.GROUP_STAGE__MEETINGS_IN_SAME_GROUP:
				return meetingsInSameGroup != MEETINGS_IN_SAME_GROUP_EDEFAULT;
			case ESportPackage.GROUP_STAGE__MEETINGS_WITH_OTHER_GROUPS:
				return meetingsWithOtherGroups != MEETINGS_WITH_OTHER_GROUPS_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", maxNbGames: ");
		result.append(maxNbGames);
		result.append(", meetingsInSameGroup: ");
		result.append(meetingsInSameGroup);
		result.append(", meetingsWithOtherGroups: ");
		result.append(meetingsWithOtherGroups);
		result.append(')');
		return result.toString();
	}

} //GroupStageImpl
