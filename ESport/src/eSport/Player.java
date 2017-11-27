/**
 */
package eSport;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Player#getPosition <em>Position</em>}</li>
 *   <li>{@link eSport.Player#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends Person {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link eSport.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see eSport.Position
	 * @see #setPosition(Position)
	 * @see eSport.ESportPackage#getPlayer_Position()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link eSport.Player#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see eSport.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see eSport.ESportPackage#getPlayer_Team()
	 * @see eSport.Team#getPlayers
	 * @model opposite="players"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link eSport.Player#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // Player
