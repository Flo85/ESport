/**
 */
package eSport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Qualification#getTournamentFrom <em>Tournament From</em>}</li>
 *   <li>{@link eSport.Qualification#getTournamentTo <em>Tournament To</em>}</li>
 *   <li>{@link eSport.Qualification#getLeagueFrom <em>League From</em>}</li>
 *   <li>{@link eSport.Qualification#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getQualification()
 * @model
 * @generated
 */
public interface Qualification extends EObject {
	/**
	 * Returns the value of the '<em><b>Tournament From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getQualifiesFor <em>Qualifies For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournament From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament From</em>' reference.
	 * @see #setTournamentFrom(Tournament)
	 * @see eSport.ESportPackage#getQualification_TournamentFrom()
	 * @see eSport.Tournament#getQualifiesFor
	 * @model opposite="qualifiesFor"
	 * @generated
	 */
	Tournament getTournamentFrom();

	/**
	 * Sets the value of the '{@link eSport.Qualification#getTournamentFrom <em>Tournament From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament From</em>' reference.
	 * @see #getTournamentFrom()
	 * @generated
	 */
	void setTournamentFrom(Tournament value);

	/**
	 * Returns the value of the '<em><b>Tournament To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getQualifiesFrom <em>Qualifies From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournament To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament To</em>' reference.
	 * @see #setTournamentTo(Tournament)
	 * @see eSport.ESportPackage#getQualification_TournamentTo()
	 * @see eSport.Tournament#getQualifiesFrom
	 * @model opposite="qualifiesFrom"
	 * @generated
	 */
	Tournament getTournamentTo();

	/**
	 * Sets the value of the '{@link eSport.Qualification#getTournamentTo <em>Tournament To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament To</em>' reference.
	 * @see #getTournamentTo()
	 * @generated
	 */
	void setTournamentTo(Tournament value);

	/**
	 * Returns the value of the '<em><b>League From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.League#getQualifiesFor <em>Qualifies For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>League From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League From</em>' reference.
	 * @see #setLeagueFrom(League)
	 * @see eSport.ESportPackage#getQualification_LeagueFrom()
	 * @see eSport.League#getQualifiesFor
	 * @model opposite="qualifiesFor"
	 * @generated
	 */
	League getLeagueFrom();

	/**
	 * Sets the value of the '{@link eSport.Qualification#getLeagueFrom <em>League From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League From</em>' reference.
	 * @see #getLeagueFrom()
	 * @generated
	 */
	void setLeagueFrom(League value);

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
	 * @see eSport.ESportPackage#getQualification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eSport.Qualification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Qualification
