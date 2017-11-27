/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.GroupStage;
import eSport.League;
import eSport.Qualification;
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
 * An implementation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.LeagueImpl#getName <em>Name</em>}</li>
 *   <li>{@link eSport.impl.LeagueImpl#getSize <em>Size</em>}</li>
 *   <li>{@link eSport.impl.LeagueImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link eSport.impl.LeagueImpl#getYear <em>Year</em>}</li>
 *   <li>{@link eSport.impl.LeagueImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link eSport.impl.LeagueImpl#getGroupstage <em>Groupstage</em>}</li>
 *   <li>{@link eSport.impl.LeagueImpl#getQualificationsFrom <em>Qualifications From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueImpl extends MinimalEObjectImpl.Container implements League {
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
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected Zone zone;

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
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected String season = SEASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupstage() <em>Groupstage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupstage()
	 * @generated
	 * @ordered
	 */
	protected GroupStage groupstage;

	/**
	 * The cached value of the '{@link #getQualificationsFrom() <em>Qualifications From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationsFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> qualificationsFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.LEAGUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__SIZE, oldSize, size));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.LEAGUE__ZONE, oldZone, zone));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__ZONE, oldZone, newZone);
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
				msgs = ((InternalEObject)zone).eInverseRemove(this, ESportPackage.ZONE__LEAGUES, Zone.class, msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, ESportPackage.ZONE__LEAGUES, Zone.class, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__ZONE, newZone, newZone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(String newSeason) {
		String oldSeason = season;
		season = newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupStage getGroupstage() {
		return groupstage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupstage(GroupStage newGroupstage, NotificationChain msgs) {
		GroupStage oldGroupstage = groupstage;
		groupstage = newGroupstage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__GROUPSTAGE, oldGroupstage, newGroupstage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupstage(GroupStage newGroupstage) {
		if (newGroupstage != groupstage) {
			NotificationChain msgs = null;
			if (groupstage != null)
				msgs = ((InternalEObject)groupstage).eInverseRemove(this, ESportPackage.GROUP_STAGE__LEAGUE, GroupStage.class, msgs);
			if (newGroupstage != null)
				msgs = ((InternalEObject)newGroupstage).eInverseAdd(this, ESportPackage.GROUP_STAGE__LEAGUE, GroupStage.class, msgs);
			msgs = basicSetGroupstage(newGroupstage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.LEAGUE__GROUPSTAGE, newGroupstage, newGroupstage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getQualificationsFrom() {
		if (qualificationsFrom == null) {
			qualificationsFrom = new EObjectWithInverseResolvingEList<Qualification>(Qualification.class, this, ESportPackage.LEAGUE__QUALIFICATIONS_FROM, ESportPackage.QUALIFICATION__LEAGUE);
		}
		return qualificationsFrom;
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
			case ESportPackage.LEAGUE__ZONE:
				if (zone != null)
					msgs = ((InternalEObject)zone).eInverseRemove(this, ESportPackage.ZONE__LEAGUES, Zone.class, msgs);
				return basicSetZone((Zone)otherEnd, msgs);
			case ESportPackage.LEAGUE__GROUPSTAGE:
				if (groupstage != null)
					msgs = ((InternalEObject)groupstage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESportPackage.LEAGUE__GROUPSTAGE, null, msgs);
				return basicSetGroupstage((GroupStage)otherEnd, msgs);
			case ESportPackage.LEAGUE__QUALIFICATIONS_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationsFrom()).basicAdd(otherEnd, msgs);
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
			case ESportPackage.LEAGUE__ZONE:
				return basicSetZone(null, msgs);
			case ESportPackage.LEAGUE__GROUPSTAGE:
				return basicSetGroupstage(null, msgs);
			case ESportPackage.LEAGUE__QUALIFICATIONS_FROM:
				return ((InternalEList<?>)getQualificationsFrom()).basicRemove(otherEnd, msgs);
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
			case ESportPackage.LEAGUE__NAME:
				return getName();
			case ESportPackage.LEAGUE__SIZE:
				return getSize();
			case ESportPackage.LEAGUE__ZONE:
				if (resolve) return getZone();
				return basicGetZone();
			case ESportPackage.LEAGUE__YEAR:
				return getYear();
			case ESportPackage.LEAGUE__SEASON:
				return getSeason();
			case ESportPackage.LEAGUE__GROUPSTAGE:
				return getGroupstage();
			case ESportPackage.LEAGUE__QUALIFICATIONS_FROM:
				return getQualificationsFrom();
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
			case ESportPackage.LEAGUE__NAME:
				setName((String)newValue);
				return;
			case ESportPackage.LEAGUE__SIZE:
				setSize((Integer)newValue);
				return;
			case ESportPackage.LEAGUE__ZONE:
				setZone((Zone)newValue);
				return;
			case ESportPackage.LEAGUE__YEAR:
				setYear((Integer)newValue);
				return;
			case ESportPackage.LEAGUE__SEASON:
				setSeason((String)newValue);
				return;
			case ESportPackage.LEAGUE__GROUPSTAGE:
				setGroupstage((GroupStage)newValue);
				return;
			case ESportPackage.LEAGUE__QUALIFICATIONS_FROM:
				getQualificationsFrom().clear();
				getQualificationsFrom().addAll((Collection<? extends Qualification>)newValue);
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
			case ESportPackage.LEAGUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESportPackage.LEAGUE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ESportPackage.LEAGUE__ZONE:
				setZone((Zone)null);
				return;
			case ESportPackage.LEAGUE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case ESportPackage.LEAGUE__SEASON:
				setSeason(SEASON_EDEFAULT);
				return;
			case ESportPackage.LEAGUE__GROUPSTAGE:
				setGroupstage((GroupStage)null);
				return;
			case ESportPackage.LEAGUE__QUALIFICATIONS_FROM:
				getQualificationsFrom().clear();
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
			case ESportPackage.LEAGUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESportPackage.LEAGUE__SIZE:
				return size != SIZE_EDEFAULT;
			case ESportPackage.LEAGUE__ZONE:
				return zone != null;
			case ESportPackage.LEAGUE__YEAR:
				return year != YEAR_EDEFAULT;
			case ESportPackage.LEAGUE__SEASON:
				return SEASON_EDEFAULT == null ? season != null : !SEASON_EDEFAULT.equals(season);
			case ESportPackage.LEAGUE__GROUPSTAGE:
				return groupstage != null;
			case ESportPackage.LEAGUE__QUALIFICATIONS_FROM:
				return qualificationsFrom != null && !qualificationsFrom.isEmpty();
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
		result.append(", year: ");
		result.append(year);
		result.append(", season: ");
		result.append(season);
		result.append(')');
		return result.toString();
	}

} //LeagueImpl
