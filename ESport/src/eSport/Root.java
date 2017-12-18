/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Root#getZones <em>Zones</em>}</li>
 *   <li>{@link eSport.Root#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link eSport.Root#getLeagues <em>Leagues</em>}</li>
 *   <li>{@link eSport.Root#getTeams <em>Teams</em>}</li>
 *   <li>{@link eSport.Root#getPersons <em>Persons</em>}</li>
 *   <li>{@link eSport.Root#getQualifications <em>Qualifications</em>}</li>
 *   <li>{@link eSport.Root#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Zones</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Zone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zones</em>' containment reference list.
	 * @see eSport.ESportPackage#getRoot_Zones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Zone> getZones();

	/**
	 * Returns the value of the '<em><b>Leagues</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.League}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leagues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leagues</em>' containment reference list.
	 * @see eSport.ESportPackage#getRoot_Leagues()
	 * @model containment="true"
	 * @generated
	 */
	EList<League> getLeagues();

	/**
	 * Returns the value of the '<em><b>Tournaments</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Tournament}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournaments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournaments</em>' containment reference list.
	 * @see eSport.ESportPackage#getRoot_Tournaments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tournament> getTournaments();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Team}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see eSport.ESportPackage#getRoot_Teams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see eSport.ESportPackage#getRoot_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Qualifications</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifications</em>' containment reference list.
	 * @see eSport.ESportPackage#getRoot_Qualifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Qualification> getQualifications();

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Country}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see eSport.ESportPackage#getRoot_Countries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

} // Root
