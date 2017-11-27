/**
 */
package eSport.impl;

import eSport.ESportPackage;
import eSport.FinalStage;
import eSport.Group;
import eSport.Match;

import eSport.MatchType;
import eSport.Team;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eSport.impl.MatchImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eSport.impl.MatchImpl#getFinalstage <em>Finalstage</em>}</li>
 *   <li>{@link eSport.impl.MatchImpl#getTeamWinner <em>Team Winner</em>}</li>
 *   <li>{@link eSport.impl.MatchImpl#getTeamLoser <em>Team Loser</em>}</li>
 *   <li>{@link eSport.impl.MatchImpl#getLoserWins <em>Loser Wins</em>}</li>
 *   <li>{@link eSport.impl.MatchImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getFinalstage() <em>Finalstage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalstage()
	 * @generated
	 * @ordered
	 */
	protected FinalStage finalstage;

	/**
	 * The cached value of the '{@link #getTeamWinner() <em>Team Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamWinner()
	 * @generated
	 * @ordered
	 */
	protected Team teamWinner;

	/**
	 * The cached value of the '{@link #getTeamLoser() <em>Team Loser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamLoser()
	 * @generated
	 * @ordered
	 */
	protected Team teamLoser;

	/**
	 * The default value of the '{@link #getLoserWins() <em>Loser Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoserWins()
	 * @generated
	 * @ordered
	 */
	protected static final int LOSER_WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoserWins() <em>Loser Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoserWins()
	 * @generated
	 * @ordered
	 */
	protected int loserWins = LOSER_WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MatchType TYPE_EDEFAULT = MatchType.GROUP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MatchType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESportPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (Group)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.MATCH__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, ESportPackage.GROUP__MATCHS, Group.class, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, ESportPackage.GROUP__MATCHS, Group.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStage getFinalstage() {
		if (finalstage != null && finalstage.eIsProxy()) {
			InternalEObject oldFinalstage = (InternalEObject)finalstage;
			finalstage = (FinalStage)eResolveProxy(oldFinalstage);
			if (finalstage != oldFinalstage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.MATCH__FINALSTAGE, oldFinalstage, finalstage));
			}
		}
		return finalstage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStage basicGetFinalstage() {
		return finalstage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalstage(FinalStage newFinalstage, NotificationChain msgs) {
		FinalStage oldFinalstage = finalstage;
		finalstage = newFinalstage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__FINALSTAGE, oldFinalstage, newFinalstage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalstage(FinalStage newFinalstage) {
		if (newFinalstage != finalstage) {
			NotificationChain msgs = null;
			if (finalstage != null)
				msgs = ((InternalEObject)finalstage).eInverseRemove(this, ESportPackage.FINAL_STAGE__MATCHS, FinalStage.class, msgs);
			if (newFinalstage != null)
				msgs = ((InternalEObject)newFinalstage).eInverseAdd(this, ESportPackage.FINAL_STAGE__MATCHS, FinalStage.class, msgs);
			msgs = basicSetFinalstage(newFinalstage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__FINALSTAGE, newFinalstage, newFinalstage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeamWinner() {
		if (teamWinner != null && teamWinner.eIsProxy()) {
			InternalEObject oldTeamWinner = (InternalEObject)teamWinner;
			teamWinner = (Team)eResolveProxy(oldTeamWinner);
			if (teamWinner != oldTeamWinner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.MATCH__TEAM_WINNER, oldTeamWinner, teamWinner));
			}
		}
		return teamWinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeamWinner() {
		return teamWinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeamWinner(Team newTeamWinner, NotificationChain msgs) {
		Team oldTeamWinner = teamWinner;
		teamWinner = newTeamWinner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__TEAM_WINNER, oldTeamWinner, newTeamWinner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamWinner(Team newTeamWinner) {
		if (newTeamWinner != teamWinner) {
			NotificationChain msgs = null;
			if (teamWinner != null)
				msgs = ((InternalEObject)teamWinner).eInverseRemove(this, ESportPackage.TEAM__MATCHS_WON, Team.class, msgs);
			if (newTeamWinner != null)
				msgs = ((InternalEObject)newTeamWinner).eInverseAdd(this, ESportPackage.TEAM__MATCHS_WON, Team.class, msgs);
			msgs = basicSetTeamWinner(newTeamWinner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__TEAM_WINNER, newTeamWinner, newTeamWinner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeamLoser() {
		if (teamLoser != null && teamLoser.eIsProxy()) {
			InternalEObject oldTeamLoser = (InternalEObject)teamLoser;
			teamLoser = (Team)eResolveProxy(oldTeamLoser);
			if (teamLoser != oldTeamLoser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESportPackage.MATCH__TEAM_LOSER, oldTeamLoser, teamLoser));
			}
		}
		return teamLoser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeamLoser() {
		return teamLoser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeamLoser(Team newTeamLoser, NotificationChain msgs) {
		Team oldTeamLoser = teamLoser;
		teamLoser = newTeamLoser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__TEAM_LOSER, oldTeamLoser, newTeamLoser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamLoser(Team newTeamLoser) {
		if (newTeamLoser != teamLoser) {
			NotificationChain msgs = null;
			if (teamLoser != null)
				msgs = ((InternalEObject)teamLoser).eInverseRemove(this, ESportPackage.TEAM__MATCHS_LOST, Team.class, msgs);
			if (newTeamLoser != null)
				msgs = ((InternalEObject)newTeamLoser).eInverseAdd(this, ESportPackage.TEAM__MATCHS_LOST, Team.class, msgs);
			msgs = basicSetTeamLoser(newTeamLoser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__TEAM_LOSER, newTeamLoser, newTeamLoser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoserWins() {
		return loserWins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoserWins(int newLoserWins) {
		int oldLoserWins = loserWins;
		loserWins = newLoserWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__LOSER_WINS, oldLoserWins, loserWins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MatchType newType) {
		MatchType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESportPackage.MATCH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESportPackage.MATCH__GROUP:
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, ESportPackage.GROUP__MATCHS, Group.class, msgs);
				return basicSetGroup((Group)otherEnd, msgs);
			case ESportPackage.MATCH__FINALSTAGE:
				if (finalstage != null)
					msgs = ((InternalEObject)finalstage).eInverseRemove(this, ESportPackage.FINAL_STAGE__MATCHS, FinalStage.class, msgs);
				return basicSetFinalstage((FinalStage)otherEnd, msgs);
			case ESportPackage.MATCH__TEAM_WINNER:
				if (teamWinner != null)
					msgs = ((InternalEObject)teamWinner).eInverseRemove(this, ESportPackage.TEAM__MATCHS_WON, Team.class, msgs);
				return basicSetTeamWinner((Team)otherEnd, msgs);
			case ESportPackage.MATCH__TEAM_LOSER:
				if (teamLoser != null)
					msgs = ((InternalEObject)teamLoser).eInverseRemove(this, ESportPackage.TEAM__MATCHS_LOST, Team.class, msgs);
				return basicSetTeamLoser((Team)otherEnd, msgs);
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
			case ESportPackage.MATCH__GROUP:
				return basicSetGroup(null, msgs);
			case ESportPackage.MATCH__FINALSTAGE:
				return basicSetFinalstage(null, msgs);
			case ESportPackage.MATCH__TEAM_WINNER:
				return basicSetTeamWinner(null, msgs);
			case ESportPackage.MATCH__TEAM_LOSER:
				return basicSetTeamLoser(null, msgs);
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
			case ESportPackage.MATCH__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case ESportPackage.MATCH__FINALSTAGE:
				if (resolve) return getFinalstage();
				return basicGetFinalstage();
			case ESportPackage.MATCH__TEAM_WINNER:
				if (resolve) return getTeamWinner();
				return basicGetTeamWinner();
			case ESportPackage.MATCH__TEAM_LOSER:
				if (resolve) return getTeamLoser();
				return basicGetTeamLoser();
			case ESportPackage.MATCH__LOSER_WINS:
				return getLoserWins();
			case ESportPackage.MATCH__TYPE:
				return getType();
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
			case ESportPackage.MATCH__GROUP:
				setGroup((Group)newValue);
				return;
			case ESportPackage.MATCH__FINALSTAGE:
				setFinalstage((FinalStage)newValue);
				return;
			case ESportPackage.MATCH__TEAM_WINNER:
				setTeamWinner((Team)newValue);
				return;
			case ESportPackage.MATCH__TEAM_LOSER:
				setTeamLoser((Team)newValue);
				return;
			case ESportPackage.MATCH__LOSER_WINS:
				setLoserWins((Integer)newValue);
				return;
			case ESportPackage.MATCH__TYPE:
				setType((MatchType)newValue);
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
			case ESportPackage.MATCH__GROUP:
				setGroup((Group)null);
				return;
			case ESportPackage.MATCH__FINALSTAGE:
				setFinalstage((FinalStage)null);
				return;
			case ESportPackage.MATCH__TEAM_WINNER:
				setTeamWinner((Team)null);
				return;
			case ESportPackage.MATCH__TEAM_LOSER:
				setTeamLoser((Team)null);
				return;
			case ESportPackage.MATCH__LOSER_WINS:
				setLoserWins(LOSER_WINS_EDEFAULT);
				return;
			case ESportPackage.MATCH__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ESportPackage.MATCH__GROUP:
				return group != null;
			case ESportPackage.MATCH__FINALSTAGE:
				return finalstage != null;
			case ESportPackage.MATCH__TEAM_WINNER:
				return teamWinner != null;
			case ESportPackage.MATCH__TEAM_LOSER:
				return teamLoser != null;
			case ESportPackage.MATCH__LOSER_WINS:
				return loserWins != LOSER_WINS_EDEFAULT;
			case ESportPackage.MATCH__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (loserWins: ");
		result.append(loserWins);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
