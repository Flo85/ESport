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
 *   <li>{@link eSport.Qualification#getLeague <em>League</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getQualification()
 * @model
 * @generated
 */
public interface Qualification extends EObject {
	/**
	 * Returns the value of the '<em><b>Tournament From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getQualificationFrom <em>Qualification From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournament From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament From</em>' reference.
	 * @see #setTournamentFrom(Tournament)
	 * @see eSport.ESportPackage#getQualification_TournamentFrom()
	 * @see eSport.Tournament#getQualificationFrom
	 * @model opposite="qualificationFrom"
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
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getQualificationsTo <em>Qualifications To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournament To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament To</em>' reference.
	 * @see #setTournamentTo(Tournament)
	 * @see eSport.ESportPackage#getQualification_TournamentTo()
	 * @see eSport.Tournament#getQualificationsTo
	 * @model opposite="qualificationsTo"
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
	 * Returns the value of the '<em><b>League</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.League#getQualificationsFrom <em>Qualifications From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>League</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' reference.
	 * @see #setLeague(League)
	 * @see eSport.ESportPackage#getQualification_League()
	 * @see eSport.League#getQualificationsFrom
	 * @model opposite="qualificationsFrom"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link eSport.Qualification#getLeague <em>League</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

} // Qualification
