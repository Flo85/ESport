/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.FinalStage;
import eSport.Match;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.FinalStageImpl#getMatchs <em>Matchs</em>}</li>
 *   <li>{@link eSport.impl.FinalStageImpl#getTournament <em>Tournament</em>}</li>
 *   <li>{@link eSport.impl.FinalStageImpl#getMaxNbGames <em>Max Nb Games</em>}</li>
 *   <li>{@link eSport.impl.FinalStageImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalStageImpl extends MinimalEObjectImpl.Container implements FinalStage {
	/**
	 * The cached value of the '{@link #getMatchs() <em>Matchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchs;

	/**
	 * The default value of the '{@link #getMaxNbGames() <em>Max Nb Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbGames()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NB_GAMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNbGames() <em>Max Nb Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbGames()
	 * @generated
	 * @ordered
	 */
	protected int maxNbGames = MAX_NB_GAMES_EDEFAULT;

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
	protected FinalStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.FINAL_STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchs() {
		if (matchs == null) {
			matchs = new EObjectContainmentWithInverseEList<Match>(Match.class, this, ESportPackage.FINAL_STAGE__MATCHS, ESportPackage.MATCH__FINALSTAGE);
		}
		return matchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectWithInverseResolvingEList.ManyInverse<Team>(Team.class, this, ESportPackage.FINAL_STAGE__TEAMS, ESportPackage.TEAM__FINALSTAGES);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament getTournament() {
		if (eContainerFeatureID() != ESportPackage.FINAL_STAGE__TOURNAMENT) return null;
		return (Tournament)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournament(Tournament newTournament, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTournament, ESportPackage.FINAL_STAGE__TOURNAMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournament(Tournament newTournament) {
		if (newTournament != eInternalContainer() || (eContainerFeatureID() != ESportPackage.FINAL_STAGE__TOURNAMENT && newTournament != null)) {
			if (EcoreUtil.isAncestor(this, newTournament))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTournament != null)
				msgs = ((InternalEObject)newTournament).eInverseAdd(this, ESportPackage.TOURNAMENT__FINALSTAGES, Tournament.class, msgs);
			msgs = basicSetTournament(newTournament, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.FINAL_STAGE__TOURNAMENT, newTournament, newTournament));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNbGames() {
		return maxNbGames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNbGames(int newMaxNbGames) {
		int oldMaxNbGames = maxNbGames;
		maxNbGames = newMaxNbGames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.FINAL_STAGE__MAX_NB_GAMES, oldMaxNbGames, maxNbGames));
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
			case ESportPackage.FINAL_STAGE__MATCHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatchs()).basicAdd(otherEnd, msgs);
			case ESportPackage.FINAL_STAGE__TOURNAMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTournament((Tournament)otherEnd, msgs);
			case ESportPackage.FINAL_STAGE__TEAMS:
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
			case ESportPackage.FINAL_STAGE__MATCHS:
				return ((InternalEList<?>)getMatchs()).basicRemove(otherEnd, msgs);
			case ESportPackage.FINAL_STAGE__TOURNAMENT:
				return basicSetTournament(null, msgs);
			case ESportPackage.FINAL_STAGE__TEAMS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ESportPackage.FINAL_STAGE__TOURNAMENT:
				return eInternalContainer().eInverseRemove(this, ESportPackage.TOURNAMENT__FINALSTAGES, Tournament.class, msgs);
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
			case ESportPackage.FINAL_STAGE__MATCHS:
				return getMatchs();
			case ESportPackage.FINAL_STAGE__TOURNAMENT:
				return getTournament();
			case ESportPackage.FINAL_STAGE__MAX_NB_GAMES:
				return getMaxNbGames();
			case ESportPackage.FINAL_STAGE__TEAMS:
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
			case ESportPackage.FINAL_STAGE__MATCHS:
				getMatchs().clear();
				getMatchs().addAll((Collection<? extends Match>)newValue);
				return;
			case ESportPackage.FINAL_STAGE__TOURNAMENT:
				setTournament((Tournament)newValue);
				return;
			case ESportPackage.FINAL_STAGE__MAX_NB_GAMES:
				setMaxNbGames((Integer)newValue);
				return;
			case ESportPackage.FINAL_STAGE__TEAMS:
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
			case ESportPackage.FINAL_STAGE__MATCHS:
				getMatchs().clear();
				return;
			case ESportPackage.FINAL_STAGE__TOURNAMENT:
				setTournament((Tournament)null);
				return;
			case ESportPackage.FINAL_STAGE__MAX_NB_GAMES:
				setMaxNbGames(MAX_NB_GAMES_EDEFAULT);
				return;
			case ESportPackage.FINAL_STAGE__TEAMS:
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
			case ESportPackage.FINAL_STAGE__MATCHS:
				return matchs != null && !matchs.isEmpty();
			case ESportPackage.FINAL_STAGE__TOURNAMENT:
				return getTournament() != null;
			case ESportPackage.FINAL_STAGE__MAX_NB_GAMES:
				return maxNbGames != MAX_NB_GAMES_EDEFAULT;
			case ESportPackage.FINAL_STAGE__TEAMS:
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
		result.append(" (maxNbGames: ");
		result.append(maxNbGames);
		result.append(')');
		return result.toString();
	}

} //FinalStageImpl
