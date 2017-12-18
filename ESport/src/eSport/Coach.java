/**
 */
package eSport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Coach#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getCoach()
 * @model
 * @generated
 */
public interface Coach extends Person {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' container reference.
	 * @see #setTeam(Team)
	 * @see eSport.ESportPackage#getCoach_Team()
	 * @see eSport.Team#getCoach
	 * @model opposite="coach" transient="false"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link eSport.Coach#getTeam <em>Team</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' container reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // Coach
