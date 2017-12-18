/**
 */
package eSport.impl;

import eSport.Coach;
import eSport.ESportPackage;
import eSport.FinalStage;
import eSport.Group;
import eSport.Match;
import eSport.Player;
import eSport.Team;
import eSport.Zone;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getCoach <em>Coach</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getChampionshipPoints <em>Championship Points</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getMatchsWon <em>Matchs Won</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getMatchsLost <em>Matchs Lost</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getFinalstages <em>Finalstages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getCoach() <em>Coach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoach()
	 * @generated
	 * @ordered
	 */
	protected Coach coach;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The default value of the '{@link #getChampionshipPoints() <em>Championship Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionshipPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAMPIONSHIP_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChampionshipPoints() <em>Championship Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampionshipPoints()
	 * @generated
	 * @ordered
	 */
	protected int championshipPoints = CHAMPIONSHIP_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatchsWon() <em>Matchs Won</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchsWon()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchsWon;

	/**
	 * The cached value of the '{@link #getMatchsLost() <em>Matchs Lost</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchsLost()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchsLost;

	/**
	 * The cached value of the '{@link #getFinalstages() <em>Finalstages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalstages()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalStage> finalstages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentWithInverseEList<Player>(Player.class, this, ESportPackage.TEAM__PLAYERS, ESportPackage.PLAYER__TEAM);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach getCoach() {
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoach(Coach newCoach, NotificationChain msgs) {
		Coach oldCoach = coach;
		coach = newCoach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__COACH, oldCoach, newCoach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoach(Coach newCoach) {
		if (newCoach != coach) {
			NotificationChain msgs = null;
			if (coach != null)
				msgs = ((InternalEObject)coach).eInverseRemove(this, ESportPackage.COACH__TEAM, Coach.class, msgs);
			if (newCoach != null)
				msgs = ((InternalEObject)newCoach).eInverseAdd(this, ESportPackage.COACH__TEAM, Coach.class, msgs);
			msgs = basicSetCoach(newCoach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__COACH, newCoach, newCoach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone getZone() {
		if (eContainerFeatureID() != ESportPackage.TEAM__ZONE) return null;
		return (Zone)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZone(Zone newZone, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newZone, ESportPackage.TEAM__ZONE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(Zone newZone) {
		if (newZone != eInternalContainer() || (eContainerFeatureID() != ESportPackage.TEAM__ZONE && newZone != null)) {
			if (EcoreUtil.isAncestor(this, newZone))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, ESportPackage.ZONE__TEAMS, Zone.class, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__ZONE, newZone, newZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectWithInverseResolvingEList.ManyInverse<Group>(Group.class, this, ESportPackage.TEAM__GROUPS, ESportPackage.GROUP__TEAMS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChampionshipPoints() {
		return championshipPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChampionshipPoints(int newChampionshipPoints) {
		int oldChampionshipPoints = championshipPoints;
		championshipPoints = newChampionshipPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__CHAMPIONSHIP_POINTS, oldChampionshipPoints, championshipPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalStage> getFinalstages() {
		if (finalstages == null) {
			finalstages = new EObjectWithInverseResolvingEList.ManyInverse<FinalStage>(FinalStage.class, this, ESportPackage.TEAM__FINALSTAGES, ESportPackage.FINAL_STAGE__TEAMS);
		}
		return finalstages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchsWon() {
		if (matchsWon == null) {
			matchsWon = new EObjectWithInverseResolvingEList<Match>(Match.class, this, ESportPackage.TEAM__MATCHS_WON, ESportPackage.MATCH__TEAM_WINNER);
		}
		return matchsWon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchsLost() {
		if (matchsLost == null) {
			matchsLost = new EObjectWithInverseResolvingEList<Match>(Match.class, this, ESportPackage.TEAM__MATCHS_LOST, ESportPackage.MATCH__TEAM_LOSER);
		}
		return matchsLost;
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
			case ESportPackage.TEAM__PLAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayers()).basicAdd(otherEnd, msgs);
			case ESportPackage.TEAM__COACH:
				if (coach != null)
					msgs = ((InternalEObject)coach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESportPackage.TEAM__COACH, null, msgs);
				return basicSetCoach((Coach)otherEnd, msgs);
			case ESportPackage.TEAM__ZONE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetZone((Zone)otherEnd, msgs);
			case ESportPackage.TEAM__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
			case ESportPackage.TEAM__MATCHS_WON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatchsWon()).basicAdd(otherEnd, msgs);
			case ESportPackage.TEAM__MATCHS_LOST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatchsLost()).basicAdd(otherEnd, msgs);
			case ESportPackage.TEAM__FINALSTAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFinalstages()).basicAdd(otherEnd, msgs);
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
			case ESportPackage.TEAM__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case ESportPackage.TEAM__COACH:
				return basicSetCoach(null, msgs);
			case ESportPackage.TEAM__ZONE:
				return basicSetZone(null, msgs);
			case ESportPackage.TEAM__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case ESportPackage.TEAM__MATCHS_WON:
				return ((InternalEList<?>)getMatchsWon()).basicRemove(otherEnd, msgs);
			case ESportPackage.TEAM__MATCHS_LOST:
				return ((InternalEList<?>)getMatchsLost()).basicRemove(otherEnd, msgs);
			case ESportPackage.TEAM__FINALSTAGES:
				return ((InternalEList<?>)getFinalstages()).basicRemove(otherEnd, msgs);
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
			case ESportPackage.TEAM__ZONE:
				return eInternalContainer().eInverseRemove(this, ESportPackage.ZONE__TEAMS, Zone.class, msgs);
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
			case ESportPackage.TEAM__NAME:
				return getName();
			case ESportPackage.TEAM__PLAYERS:
				return getPlayers();
			case ESportPackage.TEAM__COACH:
				return getCoach();
			case ESportPackage.TEAM__ZONE:
				return getZone();
			case ESportPackage.TEAM__GROUPS:
				return getGroups();
			case ESportPackage.TEAM__CHAMPIONSHIP_POINTS:
				return getChampionshipPoints();
			case ESportPackage.TEAM__MATCHS_WON:
				return getMatchsWon();
			case ESportPackage.TEAM__MATCHS_LOST:
				return getMatchsLost();
			case ESportPackage.TEAM__FINALSTAGES:
				return getFinalstages();
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
			case ESportPackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case ESportPackage.TEAM__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case ESportPackage.TEAM__COACH:
				setCoach((Coach)newValue);
				return;
			case ESportPackage.TEAM__ZONE:
				setZone((Zone)newValue);
				return;
			case ESportPackage.TEAM__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case ESportPackage.TEAM__CHAMPIONSHIP_POINTS:
				setChampionshipPoints((Integer)newValue);
				return;
			case ESportPackage.TEAM__MATCHS_WON:
				getMatchsWon().clear();
				getMatchsWon().addAll((Collection<? extends Match>)newValue);
				return;
			case ESportPackage.TEAM__MATCHS_LOST:
				getMatchsLost().clear();
				getMatchsLost().addAll((Collection<? extends Match>)newValue);
				return;
			case ESportPackage.TEAM__FINALSTAGES:
				getFinalstages().clear();
				getFinalstages().addAll((Collection<? extends FinalStage>)newValue);
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
			case ESportPackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESportPackage.TEAM__PLAYERS:
				getPlayers().clear();
				return;
			case ESportPackage.TEAM__COACH:
				setCoach((Coach)null);
				return;
			case ESportPackage.TEAM__ZONE:
				setZone((Zone)null);
				return;
			case ESportPackage.TEAM__GROUPS:
				getGroups().clear();
				return;
			case ESportPackage.TEAM__CHAMPIONSHIP_POINTS:
				setChampionshipPoints(CHAMPIONSHIP_POINTS_EDEFAULT);
				return;
			case ESportPackage.TEAM__MATCHS_WON:
				getMatchsWon().clear();
				return;
			case ESportPackage.TEAM__MATCHS_LOST:
				getMatchsLost().clear();
				return;
			case ESportPackage.TEAM__FINALSTAGES:
				getFinalstages().clear();
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
			case ESportPackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESportPackage.TEAM__PLAYERS:
				return players != null && !players.isEmpty();
			case ESportPackage.TEAM__COACH:
				return coach != null;
			case ESportPackage.TEAM__ZONE:
				return getZone() != null;
			case ESportPackage.TEAM__GROUPS:
				return groups != null && !groups.isEmpty();
			case ESportPackage.TEAM__CHAMPIONSHIP_POINTS:
				return championshipPoints != CHAMPIONSHIP_POINTS_EDEFAULT;
			case ESportPackage.TEAM__MATCHS_WON:
				return matchsWon != null && !matchsWon.isEmpty();
			case ESportPackage.TEAM__MATCHS_LOST:
				return matchsLost != null && !matchsLost.isEmpty();
			case ESportPackage.TEAM__FINALSTAGES:
				return finalstages != null && !finalstages.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", championshipPoints: ");
		result.append(championshipPoints);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
