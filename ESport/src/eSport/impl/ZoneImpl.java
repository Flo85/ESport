/**
 */
package eSport.impl;

import eSport.Country;
import eSport.ESportPackage;
import eSport.League;
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
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.ZoneImpl#getName <em>Name</em>}</li>
 *   <li>{@link eSport.impl.ZoneImpl#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.impl.ZoneImpl#getLeague <em>League</em>}</li>
 *   <li>{@link eSport.impl.ZoneImpl#getCountries <em>Countries</em>}</li>
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
	 * The cached value of the '{@link #getLeague() <em>League</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeague()
	 * @generated
	 * @ordered
	 */
	protected League league;

	/**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' reference list.
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
	public League getLeague() {
		if (league != null && league.eIsProxy()) {
			InternalEObject oldLeague = (InternalEObject)league;
			league = (League)eResolveProxy(oldLeague);
			if (league != oldLeague) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.ZONE__LEAGUE, oldLeague, league));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.ZONE__LEAGUE, oldLeague, newLeague);
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
				msgs = ((InternalEObject)league).eInverseRemove(this, ESportPackage.LEAGUE__ZONE, League.class, msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, ESportPackage.LEAGUE__ZONE, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.ZONE__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountries() {
		if (countries == null) {
			countries = new EObjectWithInverseResolvingEList<Country>(Country.class, this, ESportPackage.ZONE__COUNTRIES, ESportPackage.COUNTRY__ZONE);
		}
		return countries;
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
			case ESportPackage.ZONE__LEAGUE:
				if (league != null)
					msgs = ((InternalEObject)league).eInverseRemove(this, ESportPackage.LEAGUE__ZONE, League.class, msgs);
				return basicSetLeague((League)otherEnd, msgs);
			case ESportPackage.ZONE__COUNTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCountries()).basicAdd(otherEnd, msgs);
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
			case ESportPackage.ZONE__LEAGUE:
				return basicSetLeague(null, msgs);
			case ESportPackage.ZONE__COUNTRIES:
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
			case ESportPackage.ZONE__NAME:
				return getName();
			case ESportPackage.ZONE__TOURNAMENTS:
				return getTournaments();
			case ESportPackage.ZONE__LEAGUE:
				if (resolve) return getLeague();
				return basicGetLeague();
			case ESportPackage.ZONE__COUNTRIES:
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
			case ESportPackage.ZONE__NAME:
				setName((String)newValue);
				return;
			case ESportPackage.ZONE__TOURNAMENTS:
				getTournaments().clear();
				getTournaments().addAll((Collection<? extends Tournament>)newValue);
				return;
			case ESportPackage.ZONE__LEAGUE:
				setLeague((League)newValue);
				return;
			case ESportPackage.ZONE__COUNTRIES:
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
			case ESportPackage.ZONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESportPackage.ZONE__TOURNAMENTS:
				getTournaments().clear();
				return;
			case ESportPackage.ZONE__LEAGUE:
				setLeague((League)null);
				return;
			case ESportPackage.ZONE__COUNTRIES:
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
			case ESportPackage.ZONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESportPackage.ZONE__TOURNAMENTS:
				return tournaments != null && !tournaments.isEmpty();
			case ESportPackage.ZONE__LEAGUE:
				return league != null;
			case ESportPackage.ZONE__COUNTRIES:
				return countries != null && !countries.isEmpty();
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
