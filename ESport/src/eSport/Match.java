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
 *   <li>{@link eSport.Match#getMaxNbGames <em>Max Nb Games</em>}</li>
 *   <li>{@link eSport.Match#getGroup <em>Group</em>}</li>
 *   <li>{@link eSport.Match#getFinalstage <em>Finalstage</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
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
	 * @see eSport.ESportPackage#getMatch_MaxNbGames()
	 * @model
	 * @generated
	 */
	int getMaxNbGames();

	/**
	 * Sets the value of the '{@link eSport.Match#getMaxNbGames <em>Max Nb Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nb Games</em>' attribute.
	 * @see #getMaxNbGames()
	 * @generated
	 */
	void setMaxNbGames(int value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Group#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see eSport.ESportPackage#getMatch_Group()
	 * @see eSport.Group#getMatchs
	 * @model opposite="matchs"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link eSport.Match#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Finalstage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.FinalStage#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalstage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalstage</em>' reference.
	 * @see #setFinalstage(FinalStage)
	 * @see eSport.ESportPackage#getMatch_Finalstage()
	 * @see eSport.FinalStage#getMatchs
	 * @model opposite="matchs"
	 * @generated
	 */
	FinalStage getFinalstage();

	/**
	 * Sets the value of the '{@link eSport.Match#getFinalstage <em>Finalstage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalstage</em>' reference.
	 * @see #getFinalstage()
	 * @generated
	 */
	void setFinalstage(FinalStage value);

} // Match
