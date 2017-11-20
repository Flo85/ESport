/**
 */
package eSport.impl;

import eSport.Country;
import eSport.ESportPackage;
import eSport.EnumTournamentType;
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
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.TournamentImpl#getName <em>Name</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getType <em>Type</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getAllowedZones <em>Allowed Zones</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TournamentImpl extends MinimalEObjectImpl.Container implements Tournament {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTournamentType TYPE_EDEFAULT = EnumTournamentType.WORLDS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnumTournamentType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedZones() <em>Allowed Zones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedZones()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> allowedZones;

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
	protected TournamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.TOURNAMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TOURNAMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TOURNAMENT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountries() {
		if (countries == null) {
			countries = new EObjectWithInverseResolvingEList.ManyInverse<Country>(Country.class, this, ESportPackage.TOURNAMENT__COUNTRIES, ESportPackage.COUNTRY__TOURNAMENTS);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTournamentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumTournamentType newType) {
		EnumTournamentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TOURNAMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getAllowedZones() {
		if (allowedZones == null) {
			allowedZones = new EObjectWithInverseResolvingEList.ManyInverse<Zone>(Zone.class, this, ESportPackage.TOURNAMENT__ALLOWED_ZONES, ESportPackage.ZONE__TOURNAMENTS);
		}
		return allowedZones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectWithInverseResolvingEList.ManyInverse<Team>(Team.class, this, ESportPackage.TOURNAMENT__TEAMS, ESportPackage.TEAM__TOURNAMENTS);
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
			case ESportPackage.TOURNAMENT__COUNTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCountries()).basicAdd(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__ALLOWED_ZONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllowedZones()).basicAdd(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__TEAMS:
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
			case ESportPackage.TOURNAMENT__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__ALLOWED_ZONES:
				return ((InternalEList<?>)getAllowedZones()).basicRemove(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__TEAMS:
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
			case ESportPackage.TOURNAMENT__NAME:
				return getName();
			case ESportPackage.TOURNAMENT__SIZE:
				return getSize();
			case ESportPackage.TOURNAMENT__COUNTRIES:
				return getCountries();
			case ESportPackage.TOURNAMENT__TYPE:
				return getType();
			case ESportPackage.TOURNAMENT__ALLOWED_ZONES:
				return getAllowedZones();
			case ESportPackage.TOURNAMENT__TEAMS:
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
			case ESportPackage.TOURNAMENT__NAME:
				setName((String)newValue);
				return;
			case ESportPackage.TOURNAMENT__SIZE:
				setSize((Integer)newValue);
				return;
			case ESportPackage.TOURNAMENT__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case ESportPackage.TOURNAMENT__TYPE:
				setType((EnumTournamentType)newValue);
				return;
			case ESportPackage.TOURNAMENT__ALLOWED_ZONES:
				getAllowedZones().clear();
				getAllowedZones().addAll((Collection<? extends Zone>)newValue);
				return;
			case ESportPackage.TOURNAMENT__TEAMS:
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
			case ESportPackage.TOURNAMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESportPackage.TOURNAMENT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ESportPackage.TOURNAMENT__COUNTRIES:
				getCountries().clear();
				return;
			case ESportPackage.TOURNAMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ESportPackage.TOURNAMENT__ALLOWED_ZONES:
				getAllowedZones().clear();
				return;
			case ESportPackage.TOURNAMENT__TEAMS:
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
			case ESportPackage.TOURNAMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESportPackage.TOURNAMENT__SIZE:
				return size != SIZE_EDEFAULT;
			case ESportPackage.TOURNAMENT__COUNTRIES:
				return countries != null && !countries.isEmpty();
			case ESportPackage.TOURNAMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case ESportPackage.TOURNAMENT__ALLOWED_ZONES:
				return allowedZones != null && !allowedZones.isEmpty();
			case ESportPackage.TOURNAMENT__TEAMS:
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
		result.append(", size: ");
		result.append(size);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TournamentImpl
