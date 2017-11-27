/**
 */
package eSport.impl;

import eSport.Country;
import eSport.ESportPackage;
import eSport.FinalStage;
import eSport.GroupStage;
import eSport.Qualification;
import eSport.Tournament;
import eSport.TournamentType;
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
 *   <li>{@link eSport.impl.TournamentImpl#getYear <em>Year</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getFinalstages <em>Finalstages</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getGroupstages <em>Groupstages</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getQualificationFrom <em>Qualification From</em>}</li>
 *   <li>{@link eSport.impl.TournamentImpl#getQualificationsTo <em>Qualifications To</em>}</li>
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
	protected static final TournamentType TYPE_EDEFAULT = TournamentType.WORLDS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TournamentType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinalstages() <em>Finalstages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalstages()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalStage> finalstages;

	/**
	 * The cached value of the '{@link #getGroupstages() <em>Groupstages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupstages()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupStage> groupstages;

	/**
	 * The cached value of the '{@link #getQualificationFrom() <em>Qualification From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationFrom()
	 * @generated
	 * @ordered
	 */
	protected Qualification qualificationFrom;

	/**
	 * The cached value of the '{@link #getQualificationsTo() <em>Qualifications To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualificationsTo;

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
	public TournamentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TournamentType newType) {
		TournamentType oldType = type;
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
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TOURNAMENT__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalStage> getFinalstages() {
		if (finalstages == null) {
			finalstages = new EObjectContainmentWithInverseEList<FinalStage>(FinalStage.class, this, ESportPackage.TOURNAMENT__FINALSTAGES, ESportPackage.FINAL_STAGE__TOURNAMENT);
		}
		return finalstages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupStage> getGroupstages() {
		if (groupstages == null) {
			groupstages = new EObjectContainmentWithInverseEList<GroupStage>(GroupStage.class, this, ESportPackage.TOURNAMENT__GROUPSTAGES, ESportPackage.GROUP_STAGE__TOURNAMENT);
		}
		return groupstages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualification getQualificationFrom() {
		if (qualificationFrom != null && qualificationFrom.eIsProxy()) {
			InternalEObject oldQualificationFrom = (InternalEObject)qualificationFrom;
			qualificationFrom = (Qualification)eResolveProxy(oldQualificationFrom);
			if (qualificationFrom != oldQualificationFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.TOURNAMENT__QUALIFICATION_FROM, oldQualificationFrom, qualificationFrom));
			}
		}
		return qualificationFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualification basicGetQualificationFrom() {
		return qualificationFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualificationFrom(Qualification newQualificationFrom, NotificationChain msgs) {
		Qualification oldQualificationFrom = qualificationFrom;
		qualificationFrom = newQualificationFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.TOURNAMENT__QUALIFICATION_FROM, oldQualificationFrom, newQualificationFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificationFrom(Qualification newQualificationFrom) {
		if (newQualificationFrom != qualificationFrom) {
			NotificationChain msgs = null;
			if (qualificationFrom != null)
				msgs = ((InternalEObject)qualificationFrom).eInverseRemove(this, ESportPackage.QUALIFICATION__TOURNAMENT_FROM, Qualification.class, msgs);
			if (newQualificationFrom != null)
				msgs = ((InternalEObject)newQualificationFrom).eInverseAdd(this, ESportPackage.QUALIFICATION__TOURNAMENT_FROM, Qualification.class, msgs);
			msgs = basicSetQualificationFrom(newQualificationFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.TOURNAMENT__QUALIFICATION_FROM, newQualificationFrom, newQualificationFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getQualificationsTo() {
		if (qualificationsTo == null) {
			qualificationsTo = new EObjectWithInverseResolvingEList<Qualification>(Qualification.class, this, ESportPackage.TOURNAMENT__QUALIFICATIONS_TO, ESportPackage.QUALIFICATION__TOURNAMENT_TO);
		}
		return qualificationsTo;
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
			case ESportPackage.TOURNAMENT__FINALSTAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFinalstages()).basicAdd(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__GROUPSTAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupstages()).basicAdd(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__QUALIFICATION_FROM:
				if (qualificationFrom != null)
					msgs = ((InternalEObject)qualificationFrom).eInverseRemove(this, ESportPackage.QUALIFICATION__TOURNAMENT_FROM, Qualification.class, msgs);
				return basicSetQualificationFrom((Qualification)otherEnd, msgs);
			case ESportPackage.TOURNAMENT__QUALIFICATIONS_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationsTo()).basicAdd(otherEnd, msgs);
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
			case ESportPackage.TOURNAMENT__FINALSTAGES:
				return ((InternalEList<?>)getFinalstages()).basicRemove(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__GROUPSTAGES:
				return ((InternalEList<?>)getGroupstages()).basicRemove(otherEnd, msgs);
			case ESportPackage.TOURNAMENT__QUALIFICATION_FROM:
				return basicSetQualificationFrom(null, msgs);
			case ESportPackage.TOURNAMENT__QUALIFICATIONS_TO:
				return ((InternalEList<?>)getQualificationsTo()).basicRemove(otherEnd, msgs);
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
			case ESportPackage.TOURNAMENT__YEAR:
				return getYear();
			case ESportPackage.TOURNAMENT__FINALSTAGES:
				return getFinalstages();
			case ESportPackage.TOURNAMENT__GROUPSTAGES:
				return getGroupstages();
			case ESportPackage.TOURNAMENT__QUALIFICATION_FROM:
				if (resolve) return getQualificationFrom();
				return basicGetQualificationFrom();
			case ESportPackage.TOURNAMENT__QUALIFICATIONS_TO:
				return getQualificationsTo();
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
				setType((TournamentType)newValue);
				return;
			case ESportPackage.TOURNAMENT__ALLOWED_ZONES:
				getAllowedZones().clear();
				getAllowedZones().addAll((Collection<? extends Zone>)newValue);
				return;
			case ESportPackage.TOURNAMENT__YEAR:
				setYear((Integer)newValue);
				return;
			case ESportPackage.TOURNAMENT__FINALSTAGES:
				getFinalstages().clear();
				getFinalstages().addAll((Collection<? extends FinalStage>)newValue);
				return;
			case ESportPackage.TOURNAMENT__GROUPSTAGES:
				getGroupstages().clear();
				getGroupstages().addAll((Collection<? extends GroupStage>)newValue);
				return;
			case ESportPackage.TOURNAMENT__QUALIFICATION_FROM:
				setQualificationFrom((Qualification)newValue);
				return;
			case ESportPackage.TOURNAMENT__QUALIFICATIONS_TO:
				getQualificationsTo().clear();
				getQualificationsTo().addAll((Collection<? extends Qualification>)newValue);
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
			case ESportPackage.TOURNAMENT__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case ESportPackage.TOURNAMENT__FINALSTAGES:
				getFinalstages().clear();
				return;
			case ESportPackage.TOURNAMENT__GROUPSTAGES:
				getGroupstages().clear();
				return;
			case ESportPackage.TOURNAMENT__QUALIFICATION_FROM:
				setQualificationFrom((Qualification)null);
				return;
			case ESportPackage.TOURNAMENT__QUALIFICATIONS_TO:
				getQualificationsTo().clear();
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
			case ESportPackage.TOURNAMENT__YEAR:
				return year != YEAR_EDEFAULT;
			case ESportPackage.TOURNAMENT__FINALSTAGES:
				return finalstages != null && !finalstages.isEmpty();
			case ESportPackage.TOURNAMENT__GROUPSTAGES:
				return groupstages != null && !groupstages.isEmpty();
			case ESportPackage.TOURNAMENT__QUALIFICATION_FROM:
				return qualificationFrom != null;
			case ESportPackage.TOURNAMENT__QUALIFICATIONS_TO:
				return qualificationsTo != null && !qualificationsTo.isEmpty();
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
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //TournamentImpl
