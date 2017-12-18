/**
 */
package eSport.impl;

import eSport.Country;
import eSport.ESportPackage;
import eSport.League;
import eSport.Person;
import eSport.Qualification;
import eSport.Root;
import eSport.Team;
import eSport.Tournament;

import eSport.Zone;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.RootImpl#getZones <em>Zones</em>}</li>
 *   <li>{@link eSport.impl.RootImpl#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.impl.RootImpl#getLeagues <em>Leagues</em>}</li>
 *   <li>{@link eSport.impl.RootImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link eSport.impl.RootImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link eSport.impl.RootImpl#getQualifications <em>Qualifications</em>}</li>
 *   <li>{@link eSport.impl.RootImpl#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getZones() <em>Zones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZones()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> zones;

	/**
	 * The cached value of the '{@link #getTournaments() <em>Tournaments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournaments()
	 * @generated
	 * @ordered
	 */
	protected EList<Tournament> tournaments;

	/**
	 * The cached value of the '{@link #getLeagues() <em>Leagues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeagues()
	 * @generated
	 * @ordered
	 */
	protected EList<League> leagues;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getQualifications() <em>Qualifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualifications;

	/**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> countries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getZones() {
		if (zones == null) {
			zones = new EObjectContainmentEList<Zone>(Zone.class, this, ESportPackage.ROOT__ZONES);
		}
		return zones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<League> getLeagues() {
		if (leagues == null) {
			leagues = new EObjectContainmentEList<League>(League.class, this, ESportPackage.ROOT__LEAGUES);
		}
		return leagues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tournament> getTournaments() {
		if (tournaments == null) {
			tournaments = new EObjectContainmentEList<Tournament>(Tournament.class, this, ESportPackage.ROOT__TOURNAMENTS);
		}
		return tournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList<Team>(Team.class, this, ESportPackage.ROOT__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, ESportPackage.ROOT__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getQualifications() {
		if (qualifications == null) {
			qualifications = new EObjectContainmentEList<Qualification>(Qualification.class, this, ESportPackage.ROOT__QUALIFICATIONS);
		}
		return qualifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentEList<Country>(Country.class, this, ESportPackage.ROOT__COUNTRIES);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESportPackage.ROOT__ZONES:
				return ((InternalEList<?>)getZones()).basicRemove(otherEnd, msgs);
			case ESportPackage.ROOT__TOURNAMENTS:
				return ((InternalEList<?>)getTournaments()).basicRemove(otherEnd, msgs);
			case ESportPackage.ROOT__LEAGUES:
				return ((InternalEList<?>)getLeagues()).basicRemove(otherEnd, msgs);
			case ESportPackage.ROOT__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case ESportPackage.ROOT__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case ESportPackage.ROOT__QUALIFICATIONS:
				return ((InternalEList<?>)getQualifications()).basicRemove(otherEnd, msgs);
			case ESportPackage.ROOT__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
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
			case ESportPackage.ROOT__ZONES:
				return getZones();
			case ESportPackage.ROOT__TOURNAMENTS:
				return getTournaments();
			case ESportPackage.ROOT__LEAGUES:
				return getLeagues();
			case ESportPackage.ROOT__TEAMS:
				return getTeams();
			case ESportPackage.ROOT__PERSONS:
				return getPersons();
			case ESportPackage.ROOT__QUALIFICATIONS:
				return getQualifications();
			case ESportPackage.ROOT__COUNTRIES:
				return getCountries();
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
			case ESportPackage.ROOT__ZONES:
				getZones().clear();
				getZones().addAll((Collection<? extends Zone>)newValue);
				return;
			case ESportPackage.ROOT__TOURNAMENTS:
				getTournaments().clear();
				getTournaments().addAll((Collection<? extends Tournament>)newValue);
				return;
			case ESportPackage.ROOT__LEAGUES:
				getLeagues().clear();
				getLeagues().addAll((Collection<? extends League>)newValue);
				return;
			case ESportPackage.ROOT__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case ESportPackage.ROOT__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case ESportPackage.ROOT__QUALIFICATIONS:
				getQualifications().clear();
				getQualifications().addAll((Collection<? extends Qualification>)newValue);
				return;
			case ESportPackage.ROOT__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
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
			case ESportPackage.ROOT__ZONES:
				getZones().clear();
				return;
			case ESportPackage.ROOT__TOURNAMENTS:
				getTournaments().clear();
				return;
			case ESportPackage.ROOT__LEAGUES:
				getLeagues().clear();
				return;
			case ESportPackage.ROOT__TEAMS:
				getTeams().clear();
				return;
			case ESportPackage.ROOT__PERSONS:
				getPersons().clear();
				return;
			case ESportPackage.ROOT__QUALIFICATIONS:
				getQualifications().clear();
				return;
			case ESportPackage.ROOT__COUNTRIES:
				getCountries().clear();
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
			case ESportPackage.ROOT__ZONES:
				return zones != null && !zones.isEmpty();
			case ESportPackage.ROOT__TOURNAMENTS:
				return tournaments != null && !tournaments.isEmpty();
			case ESportPackage.ROOT__LEAGUES:
				return leagues != null && !leagues.isEmpty();
			case ESportPackage.ROOT__TEAMS:
				return teams != null && !teams.isEmpty();
			case ESportPackage.ROOT__PERSONS:
				return persons != null && !persons.isEmpty();
			case ESportPackage.ROOT__QUALIFICATIONS:
				return qualifications != null && !qualifications.isEmpty();
			case ESportPackage.ROOT__COUNTRIES:
				return countries != null && !countries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
