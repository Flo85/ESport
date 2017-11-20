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
 *   <li>{@link eSport.Team#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.Team#getLeague <em>League</em>}</li>
 *   <li>{@link eSport.Team#getCountry <em>Country</em>}</li>
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
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link eSport.Player}.
	 * It is bidirectional and its opposite is '{@link eSport.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see eSport.ESportPackage#getTeam_Players()
	 * @see eSport.Player#getTeam
	 * @model opposite="team"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Coach#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' reference.
	 * @see #setCoach(Coach)
	 * @see eSport.ESportPackage#getTeam_Coach()
	 * @see eSport.Coach#getTeam
	 * @model opposite="team"
	 * @generated
	 */
	Coach getCoach();

	/**
	 * Sets the value of the '{@link eSport.Team#getCoach <em>Coach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach</em>' reference.
	 * @see #getCoach()
	 * @generated
	 */
	void setCoach(Coach value);

	/**
	 * Returns the value of the '<em><b>Tournaments</b></em>' reference list.
	 * The list contents are of type {@link eSport.Tournament}.
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournaments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournaments</em>' reference list.
	 * @see eSport.ESportPackage#getTeam_Tournaments()
	 * @see eSport.Tournament#getTeams
	 * @model opposite="teams"
	 * @generated
	 */
	EList<Tournament> getTournaments();

	/**
	 * Returns the value of the '<em><b>League</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.League#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>League</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' reference.
	 * @see #setLeague(League)
	 * @see eSport.ESportPackage#getTeam_League()
	 * @see eSport.League#getTeams
	 * @model opposite="teams"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link eSport.Team#getLeague <em>League</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Country#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see eSport.ESportPackage#getTeam_Country()
	 * @see eSport.Country#getTeams
	 * @model opposite="teams"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link eSport.Team#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // Team
