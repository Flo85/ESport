/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.FinalStage#getMatchs <em>Matchs</em>}</li>
 *   <li>{@link eSport.FinalStage#getTeams <em>Teams</em>}</li>
 *   <li>{@link eSport.FinalStage#getTournament <em>Tournament</em>}</li>
 *   <li>{@link eSport.FinalStage#getMaxNbGames <em>Max Nb Games</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getFinalStage()
 * @model
 * @generated
 */
public interface FinalStage extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchs</b></em>' reference list.
	 * The list contents are of type {@link eSport.Match}.
	 * It is bidirectional and its opposite is '{@link eSport.Match#getFinalstage <em>Finalstage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs</em>' reference list.
	 * @see eSport.ESportPackage#getFinalStage_Matchs()
	 * @see eSport.Match#getFinalstage
	 * @model opposite="finalstage"
	 * @generated
	 */
	EList<Match> getMatchs();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link eSport.Team}.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getFinalstages <em>Finalstages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see eSport.ESportPackage#getFinalStage_Teams()
	 * @see eSport.Team#getFinalstages
	 * @model opposite="finalstages"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Tournament</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getFinalstages <em>Finalstages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournament</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament</em>' container reference.
	 * @see #setTournament(Tournament)
	 * @see eSport.ESportPackage#getFinalStage_Tournament()
	 * @see eSport.Tournament#getFinalstages
	 * @model opposite="finalstages" transient="false"
	 * @generated
	 */
	Tournament getTournament();

	/**
	 * Sets the value of the '{@link eSport.FinalStage#getTournament <em>Tournament</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament</em>' container reference.
	 * @see #getTournament()
	 * @generated
	 */
	void setTournament(Tournament value);

	/**
	 * Returns the value of the '<em><b>Max Nb Games</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nb Games</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nb Games</em>' attribute.
	 * @see #setMaxNbGames(int)
	 * @see eSport.ESportPackage#getFinalStage_MaxNbGames()
	 * @model
	 * @generated
	 */
	int getMaxNbGames();

	/**
	 * Sets the value of the '{@link eSport.FinalStage#getMaxNbGames <em>Max Nb Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nb Games</em>' attribute.
	 * @see #getMaxNbGames()
	 * @generated
	 */
	void setMaxNbGames(int value);

} // FinalStage
