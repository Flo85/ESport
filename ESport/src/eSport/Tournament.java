/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Tournament#getName <em>Name</em>}</li>
 *   <li>{@link eSport.Tournament#getSize <em>Size</em>}</li>
 *   <li>{@link eSport.Tournament#getCountries <em>Countries</em>}</li>
 *   <li>{@link eSport.Tournament#getType <em>Type</em>}</li>
 *   <li>{@link eSport.Tournament#getAllowedZones <em>Allowed Zones</em>}</li>
 *   <li>{@link eSport.Tournament#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
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
	 * @see eSport.ESportPackage#getTournament_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eSport.Tournament#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see eSport.ESportPackage#getTournament_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link eSport.Tournament#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' reference list.
	 * The list contents are of type {@link eSport.Country}.
	 * It is bidirectional and its opposite is '{@link eSport.Country#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' reference list.
	 * @see eSport.ESportPackage#getTournament_Countries()
	 * @see eSport.Country#getTournaments
	 * @model opposite="tournaments"
	 * @generated
	 */
	EList<Country> getCountries();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eSport.EnumTournamentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eSport.EnumTournamentType
	 * @see #setType(EnumTournamentType)
	 * @see eSport.ESportPackage#getTournament_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EnumTournamentType getType();

	/**
	 * Sets the value of the '{@link eSport.Tournament#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eSport.EnumTournamentType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumTournamentType value);

	/**
	 * Returns the value of the '<em><b>Allowed Zones</b></em>' reference list.
	 * The list contents are of type {@link eSport.Zone}.
	 * It is bidirectional and its opposite is '{@link eSport.Zone#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Zones</em>' reference list.
	 * @see eSport.ESportPackage#getTournament_AllowedZones()
	 * @see eSport.Zone#getTournaments
	 * @model opposite="tournaments"
	 * @generated
	 */
	EList<Zone> getAllowedZones();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link eSport.Team}.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see eSport.ESportPackage#getTournament_Teams()
	 * @see eSport.Team#getTournaments
	 * @model opposite="tournaments"
	 * @generated
	 */
	EList<Team> getTeams();

} // Tournament
