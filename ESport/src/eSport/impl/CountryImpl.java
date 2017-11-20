/**
 */
package eSport.impl;

import eSport.Country;
import eSport.ESportPackage;
import eSport.Person;
import eSport.Team;
import eSport.Tournament;
import eSport.Zone;

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
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.CountryImpl#getName <em>Name</em>}</li>
 *   <li>{@link eSport.impl.CountryImpl#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.impl.CountryImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link eSport.impl.CountryImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link eSport.impl.CountryImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends MinimalEObjectImpl.Container implements Country {
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
	 * The cached value of the '{@link #getTournaments() <em>Tournaments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournaments()
	 * @generated
	 * @ordered
	 */
	protected EList<Tournament> tournaments;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected Zone zone;

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
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.COUNTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.COUNTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tournament> getTournaments() {
		if (tournaments == null) {
			tournaments = new EObjectWithInverseResolvingEList.ManyInverse<Tournament>(Tournament.class, this, ESportPackage.COUNTRY__TOURNAMENTS, ESportPackage.TOURNAMENT__COUNTRIES);
		}
		return tournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone getZone() {
		if (zone != null && zone.eIsProxy()) {
			InternalEObject oldZone = (InternalEObject)zone;
			zone = (Zone)eResolveProxy(oldZone);
			if (zone != oldZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.COUNTRY__ZONE, oldZone, zone));
			}
		}
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone basicGetZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZone(Zone newZone, NotificationChain msgs) {
		Zone oldZone = zone;
		zone = newZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.COUNTRY__ZONE, oldZone, newZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(Zone newZone) {
		if (newZone != zone) {
			NotificationChain msgs = null;
			if (zone != null)
				msgs = ((InternalEObject)zone).eInverseRemove(this, ESportPackage.ZONE__COUNTRIES, Zone.class, msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, ESportPackage.ZONE__COUNTRIES, Zone.class, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.COUNTRY__ZONE, newZone, newZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectWithInverseResolvingEList<Team>(Team.class, this, ESportPackage.COUNTRY__TEAMS, ESportPackage.TEAM__COUNTRY);
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
			persons = new EObjectWithInverseResolvingEList<Person>(Person.class, this, ESportPackage.COUNTRY__PERSONS, ESportPackage.PERSON__COUNTRY);
		}
		return persons;
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
			case ESportPackage.COUNTRY__TOURNAMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTournaments()).basicAdd(otherEnd, msgs);
			case ESportPackage.COUNTRY__ZONE:
				if (zone != null)
					msgs = ((InternalEObject)zone).eInverseRemove(this, ESportPackage.ZONE__COUNTRIES, Zone.class, msgs);
				return basicSetZone((Zone)otherEnd, msgs);
			case ESportPackage.COUNTRY__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
			case ESportPackage.COUNTRY__PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersons()).basicAdd(otherEnd, msgs);
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
			case ESportPackage.COUNTRY__TOURNAMENTS:
				return ((InternalEList<?>)getTournaments()).basicRemove(otherEnd, msgs);
			case ESportPackage.COUNTRY__ZONE:
				return basicSetZone(null, msgs);
			case ESportPackage.COUNTRY__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case ESportPackage.COUNTRY__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
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
			case ESportPackage.COUNTRY__NAME:
				return getName();
			case ESportPackage.COUNTRY__TOURNAMENTS:
				return getTournaments();
			case ESportPackage.COUNTRY__ZONE:
				if (resolve) return getZone();
				return basicGetZone();
			case ESportPackage.COUNTRY__TEAMS:
				return getTeams();
			case ESportPackage.COUNTRY__PERSONS:
				return getPersons();
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
			case ESportPackage.COUNTRY__NAME:
				setName((String)newValue);
				return;
			case ESportPackage.COUNTRY__TOURNAMENTS:
				getTournaments().clear();
				getTournaments().addAll((Collection<? extends Tournament>)newValue);
				return;
			case ESportPackage.COUNTRY__ZONE:
				setZone((Zone)newValue);
				return;
			case ESportPackage.COUNTRY__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case ESportPackage.COUNTRY__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
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
			case ESportPackage.COUNTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESportPackage.COUNTRY__TOURNAMENTS:
				getTournaments().clear();
				return;
			case ESportPackage.COUNTRY__ZONE:
				setZone((Zone)null);
				return;
			case ESportPackage.COUNTRY__TEAMS:
				getTeams().clear();
				return;
			case ESportPackage.COUNTRY__PERSONS:
				getPersons().clear();
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
			case ESportPackage.COUNTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESportPackage.COUNTRY__TOURNAMENTS:
				return tournaments != null && !tournaments.isEmpty();
			case ESportPackage.COUNTRY__ZONE:
				return zone != null;
			case ESportPackage.COUNTRY__TEAMS:
				return teams != null && !teams.isEmpty();
			case ESportPackage.COUNTRY__PERSONS:
				return persons != null && !persons.isEmpty();
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

} //CountryImpl
