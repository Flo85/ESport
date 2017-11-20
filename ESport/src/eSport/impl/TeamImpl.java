/**
 */
package eSport.impl;

import eSport.Coach;
import eSport.Country;
import eSport.ESportPackage;
import eSport.League;
import eSport.Player;
import eSport.Team;
import eSport.Tournament;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link eSport.impl.TeamImpl#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getLeague <em>League</em>}</li>
 *   <li>{@link eSport.impl.TeamImpl#getCountry <em>Country</em>}</li>
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
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getCoach() <em>Coach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoach()
	 * @generated
	 * @ordered
	 */
	protected Coach coach;

	/**
	 * The cached value of the '{@link #getTournaments() <em>Tournaments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournaments()
	 * @generated
	 * @ordered
	 */
	protected EList<Tournament> tournaments;

	/**
	 * The cached value of the '{@link #getLeague() <em>League</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeague()
	 * @generated
	 * @ordered
	 */
	protected League league;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

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
			players = new EObjectWithInverseResolvingEList<Player>(Player.class, this, ESportPackage.TEAM__PLAYERS, ESportPackage.PLAYER__TEAM);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach getCoach() {
		if (coach != null && coach.eIsProxy()) {
			InternalEObject oldCoach = (InternalEObject)coach;
			coach = (Coach)eResolveProxy(oldCoach);
			if (coach != oldCoach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.TEAM__COACH, oldCoach, coach));
			}
		}
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach basicGetCoach() {
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
	public EList<Tournament> getTournaments() {
		if (tournaments == null) {
			tournaments = new EObjectWithInverseResolvingEList.ManyInverse<Tournament>(Tournament.class, this, ESportPackage.TEAM__TOURNAMENTS, ESportPackage.TOURNAMENT__TEAMS);
		}
		return tournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League getLeague() {
		if (league != null && league.eIsProxy()) {
			InternalEObject oldLeague = (InternalEObject)league;
			league = (League)eResolveProxy(oldLeague);
			if (league != oldLeague) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.TEAM__LEAGUE, oldLeague, league));
			}
		}
		return league;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League basicGetLeague() {
		return league;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
		League oldLeague = league;
		league = newLeague;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__LEAGUE, oldLeague, newLeague);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeague(League newLeague) {
		if (newLeague != league) {
			NotificationChain msgs = null;
			if (league != null)
				msgs = ((InternalEObject)league).eInverseRemove(this, ESportPackage.LEAGUE__TEAMS, League.class, msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, ESportPackage.LEAGUE__TEAMS, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.TEAM__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(Country newCountry, NotificationChain msgs) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__COUNTRY, oldCountry, newCountry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, ESportPackage.COUNTRY__TEAMS, Country.class, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, ESportPackage.COUNTRY__TEAMS, Country.class, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TEAM__COUNTRY, newCountry, newCountry));
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
					msgs = ((InternalEObject)coach).eInverseRemove(this, ESportPackage.COACH__TEAM, Coach.class, msgs);
				return basicSetCoach((Coach)otherEnd, msgs);
			case ESportPackage.TEAM__TOURNAMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTournaments()).basicAdd(otherEnd, msgs);
			case ESportPackage.TEAM__LEAGUE:
				if (league != null)
					msgs = ((InternalEObject)league).eInverseRemove(this, ESportPackage.LEAGUE__TEAMS, League.class, msgs);
				return basicSetLeague((League)otherEnd, msgs);
			case ESportPackage.TEAM__COUNTRY:
				if (country != null)
					msgs = ((InternalEObject)country).eInverseRemove(this, ESportPackage.COUNTRY__TEAMS, Country.class, msgs);
				return basicSetCountry((Country)otherEnd, msgs);
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
			case ESportPackage.TEAM__TOURNAMENTS:
				return ((InternalEList<?>)getTournaments()).basicRemove(otherEnd, msgs);
			case ESportPackage.TEAM__LEAGUE:
				return basicSetLeague(null, msgs);
			case ESportPackage.TEAM__COUNTRY:
				return basicSetCountry(null, msgs);
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
			case ESportPackage.TEAM__NAME:
				return getName();
			case ESportPackage.TEAM__PLAYERS:
				return getPlayers();
			case ESportPackage.TEAM__COACH:
				if (resolve) return getCoach();
				return basicGetCoach();
			case ESportPackage.TEAM__TOURNAMENTS:
				return getTournaments();
			case ESportPackage.TEAM__LEAGUE:
				if (resolve) return getLeague();
				return basicGetLeague();
			case ESportPackage.TEAM__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
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
			case ESportPackage.TEAM__TOURNAMENTS:
				getTournaments().clear();
				getTournaments().addAll((Collection<? extends Tournament>)newValue);
				return;
			case ESportPackage.TEAM__LEAGUE:
				setLeague((League)newValue);
				return;
			case ESportPackage.TEAM__COUNTRY:
				setCountry((Country)newValue);
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
			case ESportPackage.TEAM__TOURNAMENTS:
				getTournaments().clear();
				return;
			case ESportPackage.TEAM__LEAGUE:
				setLeague((League)null);
				return;
			case ESportPackage.TEAM__COUNTRY:
				setCountry((Country)null);
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
			case ESportPackage.TEAM__TOURNAMENTS:
				return tournaments != null && !tournaments.isEmpty();
			case ESportPackage.TEAM__LEAGUE:
				return league != null;
			case ESportPackage.TEAM__COUNTRY:
				return country != null;
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
		result.append(')');
		return result.toString();
	}

} //TeamImpl
