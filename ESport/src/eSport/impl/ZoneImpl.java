/**
 */
package eSport.impl;

import eSport.Country;
import eSport.ESportPackage;
import eSport.League;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.ZoneImpl#getName <em>Name</em>}</li>
 *   <li>{@link eSport.impl.ZoneImpl#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.impl.ZoneImpl#getLeagues <em>Leagues</em>}</li>
 *   <li>{@link eSport.impl.ZoneImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link eSport.impl.ZoneImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends MinimalEObjectImpl.Container implements Zone {
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
	 * The cached value of the '{@link #getLeagues() <em>Leagues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeagues()
	 * @generated
	 * @ordered
	 */
	protected EList<League> leagues;

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
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
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
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.ZONE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.ZONE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tournament> getTournaments() {
		if (tournaments == null) {
			tournaments = new EObjectWithInverseResolvingEList.ManyInverse<Tournament>(Tournament.class, this, ESportPackage.ZONE__TOURNAMENTS, ESportPackage.TOURNAMENT__ALLOWED_ZONES);
		}
		return tournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<League> getLeagues() {
		if (leagues == null) {
			leagues = new EObjectWithInverseResolvingEList<League>(League.class, this, ESportPackage.ZONE__LEAGUES, ESportPackage.LEAGUE__ZONE);
		}
		return leagues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentWithInverseEList<Country>(Country.class, this, ESportPackage.ZONE__COUNTRIES, ESportPackage.COUNTRY__ZONE);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentWithInverseEList<Team>(Team.class, this, ESportPackage.ZONE__TEAMS, ESportPackage.TEAM__ZONE);
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
			case ESportPackage.ZONE__TOURNAMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTournaments()).basicAdd(otherEnd, msgs);
			case ESportPackage.ZONE__LEAGUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLeagues()).basicAdd(otherEnd, msgs);
			case ESportPackage.ZONE__COUNTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCountries()).basicAdd(otherEnd, msgs);
			case ESportPackage.ZONE__TEAMS:
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
			case ESportPackage.ZONE__TOURNAMENTS:
				return ((InternalEList<?>)getTournaments()).basicRemove(otherEnd, msgs);
			case ESportPackage.ZONE__LEAGUES:
				return ((InternalEList<?>)getLeagues()).basicRemove(otherEnd, msgs);
			case ESportPackage.ZONE__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case ESportPackage.ZONE__TEAMS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESportPackage.ZONE__NAME:
				return getName();
			case ESportPackage.ZONE__TOURNAMENTS:
				return getTournaments();
			case ESportPackage.ZONE__LEAGUES:
				return getLeagues();
			case ESportPackage.ZONE__COUNTRIES:
				return getCountries();
			case ESportPackage.ZONE__TEAMS:
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
			case ESportPackage.ZONE__NAME:
				setName((String)newValue);
				return;
			case ESportPackage.ZONE__TOURNAMENTS:
				getTournaments().clear();
				getTournaments().addAll((Collection<? extends Tournament>)newValue);
				return;
			case ESportPackage.ZONE__LEAGUES:
				getLeagues().clear();
				getLeagues().addAll((Collection<? extends League>)newValue);
				return;
			case ESportPackage.ZONE__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case ESportPackage.ZONE__TEAMS:
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
			case ESportPackage.ZONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESportPackage.ZONE__TOURNAMENTS:
				getTournaments().clear();
				return;
			case ESportPackage.ZONE__LEAGUES:
				getLeagues().clear();
				return;
			case ESportPackage.ZONE__COUNTRIES:
				getCountries().clear();
				return;
			case ESportPackage.ZONE__TEAMS:
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
			case ESportPackage.ZONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESportPackage.ZONE__TOURNAMENTS:
				return tournaments != null && !tournaments.isEmpty();
			case ESportPackage.ZONE__LEAGUES:
				return leagues != null && !leagues.isEmpty();
			case ESportPackage.ZONE__COUNTRIES:
				return countries != null && !countries.isEmpty();
			case ESportPackage.ZONE__TEAMS:
				return teams != null && !teams.isEmpty();
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

} //ZoneImpl
