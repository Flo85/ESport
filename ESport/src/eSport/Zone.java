/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Zone#getName <em>Name</em>}</li>
 *   <li>{@link eSport.Zone#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.Zone#getLeagues <em>Leagues</em>}</li>
 *   <li>{@link eSport.Zone#getCountries <em>Countries</em>}</li>
 *   <li>{@link eSport.Zone#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends EObject {
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
	 * @see eSport.ESportPackage#getZone_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eSport.Zone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tournaments</b></em>' reference list.
	 * The list contents are of type {@link eSport.Tournament}.
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getAllowedZones <em>Allowed Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournaments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournaments</em>' reference list.
	 * @see eSport.ESportPackage#getZone_Tournaments()
	 * @see eSport.Tournament#getAllowedZones
	 * @model opposite="allowedZones"
	 * @generated
	 */
	EList<Tournament> getTournaments();

	/**
	 * Returns the value of the '<em><b>Leagues</b></em>' reference list.
	 * The list contents are of type {@link eSport.League}.
	 * It is bidirectional and its opposite is '{@link eSport.League#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leagues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leagues</em>' reference list.
	 * @see eSport.ESportPackage#getZone_Leagues()
	 * @see eSport.League#getZone
	 * @model opposite="zone"
	 * @generated
	 */
	EList<League> getLeagues();

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Country}.
	 * It is bidirectional and its opposite is '{@link eSport.Country#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see eSport.ESportPackage#getZone_Countries()
	 * @see eSport.Country#getZone
	 * @model opposite="zone" containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Team}.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see eSport.ESportPackage#getZone_Teams()
	 * @see eSport.Team#getZone
	 * @model opposite="zone" containment="true"
	 * @generated
	 */
	EList<Team> getTeams();

} // Zone
