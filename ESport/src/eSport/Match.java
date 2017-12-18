/**
 */
package eSport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Match#getGroup <em>Group</em>}</li>
 *   <li>{@link eSport.Match#getFinalstage <em>Finalstage</em>}</li>
 *   <li>{@link eSport.Match#getTeamWinner <em>Team Winner</em>}</li>
 *   <li>{@link eSport.Match#getTeamLoser <em>Team Loser</em>}</li>
 *   <li>{@link eSport.Match#getLoserWins <em>Loser Wins</em>}</li>
 *   <li>{@link eSport.Match#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.Group#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(Group)
	 * @see eSport.ESportPackage#getMatch_Group()
	 * @see eSport.Group#getMatchs
	 * @model opposite="matchs" transient="false"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link eSport.Match#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Finalstage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.FinalStage#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalstage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalstage</em>' container reference.
	 * @see #setFinalstage(FinalStage)
	 * @see eSport.ESportPackage#getMatch_Finalstage()
	 * @see eSport.FinalStage#getMatchs
	 * @model opposite="matchs" transient="false"
	 * @generated
	 */
	FinalStage getFinalstage();

	/**
	 * Sets the value of the '{@link eSport.Match#getFinalstage <em>Finalstage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalstage</em>' container reference.
	 * @see #getFinalstage()
	 * @generated
	 */
	void setFinalstage(FinalStage value);

	/**
	 * Returns the value of the '<em><b>Team Winner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getMatchsWon <em>Matchs Won</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Winner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Winner</em>' reference.
	 * @see #setTeamWinner(Team)
	 * @see eSport.ESportPackage#getMatch_TeamWinner()
	 * @see eSport.Team#getMatchsWon
	 * @model opposite="matchsWon"
	 * @generated
	 */
	Team getTeamWinner();

	/**
	 * Sets the value of the '{@link eSport.Match#getTeamWinner <em>Team Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Winner</em>' reference.
	 * @see #getTeamWinner()
	 * @generated
	 */
	void setTeamWinner(Team value);

	/**
	 * Returns the value of the '<em><b>Team Loser</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getMatchsLost <em>Matchs Lost</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Loser</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Loser</em>' reference.
	 * @see #setTeamLoser(Team)
	 * @see eSport.ESportPackage#getMatch_TeamLoser()
	 * @see eSport.Team#getMatchsLost
	 * @model opposite="matchsLost"
	 * @generated
	 */
	Team getTeamLoser();

	/**
	 * Sets the value of the '{@link eSport.Match#getTeamLoser <em>Team Loser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Loser</em>' reference.
	 * @see #getTeamLoser()
	 * @generated
	 */
	void setTeamLoser(Team value);

	/**
	 * Returns the value of the '<em><b>Loser Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loser Wins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loser Wins</em>' attribute.
	 * @see #setLoserWins(int)
	 * @see eSport.ESportPackage#getMatch_LoserWins()
	 * @model
	 * @generated
	 */
	int getLoserWins();

	/**
	 * Sets the value of the '{@link eSport.Match#getLoserWins <em>Loser Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loser Wins</em>' attribute.
	 * @see #getLoserWins()
	 * @generated
	 */
	void setLoserWins(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eSport.MatchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eSport.MatchType
	 * @see #setType(MatchType)
	 * @see eSport.ESportPackage#getMatch_Type()
	 * @model
	 * @generated
	 */
	MatchType getType();

	/**
	 * Sets the value of the '{@link eSport.Match#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eSport.MatchType
	 * @see #getType()
	 * @generated
	 */
	void setType(MatchType value);

} // Match
