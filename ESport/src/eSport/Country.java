/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Country#getName <em>Name</em>}</li>
 *   <li>{@link eSport.Country#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.Country#getZone <em>Zone</em>}</li>
 *   <li>{@link eSport.Country#getTeams <em>Teams</em>}</li>
 *   <li>{@link eSport.Country#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
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
	 * @see eSport.ESportPackage#getCountry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eSport.Country#getName <em>Name</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournaments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournaments</em>' reference list.
	 * @see eSport.ESportPackage#getCountry_Tournaments()
	 * @see eSport.Tournament#getCountries
	 * @model opposite="countries"
	 * @generated
	 */
	EList<Tournament> getTournaments();

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Zone#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see eSport.ESportPackage#getCountry_Zone()
	 * @see eSport.Zone#getCountries
	 * @model opposite="countries"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link eSport.Country#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link eSport.Team}.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see eSport.ESportPackage#getCountry_Teams()
	 * @see eSport.Team#getCountry
	 * @model opposite="country"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link eSport.Person}.
	 * It is bidirectional and its opposite is '{@link eSport.Person#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see eSport.ESportPackage#getCountry_Persons()
	 * @see eSport.Person#getCountry
	 * @model opposite="country"
	 * @generated
	 */
	EList<Person> getPersons();

} // Country
