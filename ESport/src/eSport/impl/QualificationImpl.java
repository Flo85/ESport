/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.League;
import eSport.Qualification;
import eSport.Tournament;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.QualificationImpl#getTournamentFrom <em>Tournament From</em>}</li>
 *   <li>{@link eSport.impl.QualificationImpl#getTournamentTo <em>Tournament To</em>}</li>
 *   <li>{@link eSport.impl.QualificationImpl#getLeague <em>League</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationImpl extends MinimalEObjectImpl.Container implements Qualification {
	/**
	 * The cached value of the '{@link #getTournamentFrom() <em>Tournament From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentFrom()
	 * @generated
	 * @ordered
	 */
	protected Tournament tournamentFrom;

	/**
	 * The cached value of the '{@link #getTournamentTo() <em>Tournament To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentTo()
	 * @generated
	 * @ordered
	 */
	protected Tournament tournamentTo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.QUALIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament getTournamentFrom() {
		if (tournamentFrom != null && tournamentFrom.eIsProxy()) {
			InternalEObject oldTournamentFrom = (InternalEObject)tournamentFrom;
			tournamentFrom = (Tournament)eResolveProxy(oldTournamentFrom);
			if (tournamentFrom != oldTournamentFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.QUALIFICATION__TOURNAMENT_FROM, oldTournamentFrom, tournamentFrom));
			}
		}
		return tournamentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament basicGetTournamentFrom() {
		return tournamentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournamentFrom(Tournament newTournamentFrom, NotificationChain msgs) {
		Tournament oldTournamentFrom = tournamentFrom;
		tournamentFrom = newTournamentFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.QUALIFICATION__TOURNAMENT_FROM, oldTournamentFrom, newTournamentFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournamentFrom(Tournament newTournamentFrom) {
		if (newTournamentFrom != tournamentFrom) {
			NotificationChain msgs = null;
			if (tournamentFrom != null)
				msgs = ((InternalEObject)tournamentFrom).eInverseRemove(this, ESportPackage.TOURNAMENT__QUALIFICATION_FROM, Tournament.class, msgs);
			if (newTournamentFrom != null)
				msgs = ((InternalEObject)newTournamentFrom).eInverseAdd(this, ESportPackage.TOURNAMENT__QUALIFICATION_FROM, Tournament.class, msgs);
			msgs = basicSetTournamentFrom(newTournamentFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.QUALIFICATION__TOURNAMENT_FROM, newTournamentFrom, newTournamentFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament getTournamentTo() {
		if (tournamentTo != null && tournamentTo.eIsProxy()) {
			InternalEObject oldTournamentTo = (InternalEObject)tournamentTo;
			tournamentTo = (Tournament)eResolveProxy(oldTournamentTo);
			if (tournamentTo != oldTournamentTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.QUALIFICATION__TOURNAMENT_TO, oldTournamentTo, tournamentTo));
			}
		}
		return tournamentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament basicGetTournamentTo() {
		return tournamentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournamentTo(Tournament newTournamentTo, NotificationChain msgs) {
		Tournament oldTournamentTo = tournamentTo;
		tournamentTo = newTournamentTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.QUALIFICATION__TOURNAMENT_TO, oldTournamentTo, newTournamentTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournamentTo(Tournament newTournamentTo) {
		if (newTournamentTo != tournamentTo) {
			NotificationChain msgs = null;
			if (tournamentTo != null)
				msgs = ((InternalEObject)tournamentTo).eInverseRemove(this, ESportPackage.TOURNAMENT__QUALIFICATIONS_TO, Tournament.class, msgs);
			if (newTournamentTo != null)
				msgs = ((InternalEObject)newTournamentTo).eInverseAdd(this, ESportPackage.TOURNAMENT__QUALIFICATIONS_TO, Tournament.class, msgs);
			msgs = basicSetTournamentTo(newTournamentTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.QUALIFICATION__TOURNAMENT_TO, newTournamentTo, newTournamentTo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.QUALIFICATION__LEAGUE, oldLeague, league));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.QUALIFICATION__LEAGUE, oldLeague, newLeague);
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
				msgs = ((InternalEObject)league).eInverseRemove(this, ESportPackage.LEAGUE__QUALIFICATIONS_FROM, League.class, msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, ESportPackage.LEAGUE__QUALIFICATIONS_FROM, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.QUALIFICATION__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESportPackage.QUALIFICATION__TOURNAMENT_FROM:
				if (tournamentFrom != null)
					msgs = ((InternalEObject)tournamentFrom).eInverseRemove(this, ESportPackage.TOURNAMENT__QUALIFICATION_FROM, Tournament.class, msgs);
				return basicSetTournamentFrom((Tournament)otherEnd, msgs);
			case ESportPackage.QUALIFICATION__TOURNAMENT_TO:
				if (tournamentTo != null)
					msgs = ((InternalEObject)tournamentTo).eInverseRemove(this, ESportPackage.TOURNAMENT__QUALIFICATIONS_TO, Tournament.class, msgs);
				return basicSetTournamentTo((Tournament)otherEnd, msgs);
			case ESportPackage.QUALIFICATION__LEAGUE:
				if (league != null)
					msgs = ((InternalEObject)league).eInverseRemove(this, ESportPackage.LEAGUE__QUALIFICATIONS_FROM, League.class, msgs);
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
			case ESportPackage.QUALIFICATION__TOURNAMENT_FROM:
				return basicSetTournamentFrom(null, msgs);
			case ESportPackage.QUALIFICATION__TOURNAMENT_TO:
				return basicSetTournamentTo(null, msgs);
			case ESportPackage.QUALIFICATION__LEAGUE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESportPackage.QUALIFICATION__TOURNAMENT_FROM:
				if (resolve) return getTournamentFrom();
				return basicGetTournamentFrom();
			case ESportPackage.QUALIFICATION__TOURNAMENT_TO:
				if (resolve) return getTournamentTo();
				return basicGetTournamentTo();
			case ESportPackage.QUALIFICATION__LEAGUE:
				if (resolve) return getLeague();
				return basicGetLeague();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ESportPackage.QUALIFICATION__TOURNAMENT_FROM:
				setTournamentFrom((Tournament)newValue);
				return;
			case ESportPackage.QUALIFICATION__TOURNAMENT_TO:
				setTournamentTo((Tournament)newValue);
				return;
			case ESportPackage.QUALIFICATION__LEAGUE:
				setLeague((League)newValue);
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
			case ESportPackage.QUALIFICATION__TOURNAMENT_FROM:
				setTournamentFrom((Tournament)null);
				return;
			case ESportPackage.QUALIFICATION__TOURNAMENT_TO:
				setTournamentTo((Tournament)null);
				return;
			case ESportPackage.QUALIFICATION__LEAGUE:
				setLeague((League)null);
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
			case ESportPackage.QUALIFICATION__TOURNAMENT_FROM:
				return tournamentFrom != null;
			case ESportPackage.QUALIFICATION__TOURNAMENT_TO:
				return tournamentTo != null;
			case ESportPackage.QUALIFICATION__LEAGUE:
				return league != null;
		}
		return super.eIsSet(featureID);
	}

} //QualificationImpl
