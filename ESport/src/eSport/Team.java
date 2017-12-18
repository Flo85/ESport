/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Team#getName <em>Name</em>}</li>
 *   <li>{@link eSport.Team#getPlayers <em>Players</em>}</li>
 *   <li>{@link eSport.Team#getCoach <em>Coach</em>}</li>
 *   <li>{@link eSport.Team#getZone <em>Zone</em>}</li>
 *   <li>{@link eSport.Team#getGroups <em>Groups</em>}</li>
 *   <li>{@link eSport.Team#getChampionshipPoints <em>Championship Points</em>}</li>
 *   <li>{@link eSport.Team#getMatchsWon <em>Matchs Won</em>}</li>
 *   <li>{@link eSport.Team#getMatchsLost <em>Matchs Lost</em>}</li>
 *   <li>{@link eSport.Team#getFinalstages <em>Finalstages</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eSport.ESportPackage#getTeam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eSport.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Player}.
	 * It is bidirectional and its opposite is '{@link eSport.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see eSport.ESportPackage#getTeam_Players()
	 * @see eSport.Player#getTeam
	 * @model opposite="team" containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eSport.Coach#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' containment reference.
	 * @see #setCoach(Coach)
	 * @see eSport.ESportPackage#getTeam_Coach()
	 * @see eSport.Coach#getTeam
	 * @model opposite="team" containment="true"
	 * @generated
	 */
	Coach getCoach();

	/**
	 * Sets the value of the '{@link eSport.Team#getCoach <em>Coach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach</em>' containment reference.
	 * @see #getCoach()
	 * @generated
	 */
	void setCoach(Coach value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.Zone#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' container reference.
	 * @see #setZone(Zone)
	 * @see eSport.ESportPackage#getTeam_Zone()
	 * @see eSport.Zone#getTeams
	 * @model opposite="teams" transient="false"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link eSport.Team#getZone <em>Zone</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' container reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link eSport.Group}.
	 * It is bidirectional and its opposite is '{@link eSport.Group#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see eSport.ESportPackage#getTeam_Groups()
	 * @see eSport.Group#getTeams
	 * @model opposite="teams"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Championship Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Championship Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Championship Points</em>' attribute.
	 * @see #setChampionshipPoints(int)
	 * @see eSport.ESportPackage#getTeam_ChampionshipPoints()
	 * @model
	 * @generated
	 */
	int getChampionshipPoints();

	/**
	 * Sets the value of the '{@link eSport.Team#getChampionshipPoints <em>Championship Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Championship Points</em>' attribute.
	 * @see #getChampionshipPoints()
	 * @generated
	 */
	void setChampionshipPoints(int value);

	/**
	 * Returns the value of the '<em><b>Finalstages</b></em>' reference list.
	 * The list contents are of type {@link eSport.FinalStage}.
	 * It is bidirectional and its opposite is '{@link eSport.FinalStage#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalstages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalstages</em>' reference list.
	 * @see eSport.ESportPackage#getTeam_Finalstages()
	 * @see eSport.FinalStage#getTeams
	 * @model opposite="teams"
	 * @generated
	 */
	EList<FinalStage> getFinalstages();

	/**
	 * Returns the value of the '<em><b>Matchs Won</b></em>' reference list.
	 * The list contents are of type {@link eSport.Match}.
	 * It is bidirectional and its opposite is '{@link eSport.Match#getTeamWinner <em>Team Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchs Won</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs Won</em>' reference list.
	 * @see eSport.ESportPackage#getTeam_MatchsWon()
	 * @see eSport.Match#getTeamWinner
	 * @model opposite="teamWinner"
	 * @generated
	 */
	EList<Match> getMatchsWon();

	/**
	 * Returns the value of the '<em><b>Matchs Lost</b></em>' reference list.
	 * The list contents are of type {@link eSport.Match}.
	 * It is bidirectional and its opposite is '{@link eSport.Match#getTeamLoser <em>Team Loser</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchs Lost</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs Lost</em>' reference list.
	 * @see eSport.ESportPackage#getTeam_MatchsLost()
	 * @see eSport.Match#getTeamLoser
	 * @model opposite="teamLoser"
	 * @generated
	 */
	EList<Match> getMatchsLost();

} // Team
