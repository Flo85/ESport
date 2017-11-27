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
 *   <li>{@link eSport.Tournament#getYear <em>Year</em>}</li>
 *   <li>{@link eSport.Tournament#getFinalstages <em>Finalstages</em>}</li>
 *   <li>{@link eSport.Tournament#getGroupstages <em>Groupstages</em>}</li>
 *   <li>{@link eSport.Tournament#getQualifiesFor <em>Qualifies For</em>}</li>
 *   <li>{@link eSport.Tournament#getQualifiesFrom <em>Qualifies From</em>}</li>
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
	 * The literals are from the enumeration {@link eSport.TournamentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eSport.TournamentType
	 * @see #setType(TournamentType)
	 * @see eSport.ESportPackage#getTournament_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TournamentType getType();

	/**
	 * Sets the value of the '{@link eSport.Tournament#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eSport.TournamentType
	 * @see #getType()
	 * @generated
	 */
	void setType(TournamentType value);

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
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see eSport.ESportPackage#getTournament_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link eSport.Tournament#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Finalstages</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.FinalStage}.
	 * It is bidirectional and its opposite is '{@link eSport.FinalStage#getTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalstages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalstages</em>' containment reference list.
	 * @see eSport.ESportPackage#getTournament_Finalstages()
	 * @see eSport.FinalStage#getTournament
	 * @model opposite="tournament" containment="true"
	 * @generated
	 */
	EList<FinalStage> getFinalstages();

	/**
	 * Returns the value of the '<em><b>Groupstages</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.GroupStage}.
	 * It is bidirectional and its opposite is '{@link eSport.GroupStage#getTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupstages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupstages</em>' containment reference list.
	 * @see eSport.ESportPackage#getTournament_Groupstages()
	 * @see eSport.GroupStage#getTournament
	 * @model opposite="tournament" containment="true"
	 * @generated
	 */
	EList<GroupStage> getGroupstages();

	/**
	 * Returns the value of the '<em><b>Qualifies From</b></em>' reference list.
	 * The list contents are of type {@link eSport.Qualification}.
	 * It is bidirectional and its opposite is '{@link eSport.Qualification#getTournamentTo <em>Tournament To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifies From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifies From</em>' reference list.
	 * @see eSport.ESportPackage#getTournament_QualifiesFrom()
	 * @see eSport.Qualification#getTournamentTo
	 * @model opposite="tournamentTo"
	 * @generated
	 */
	EList<Qualification> getQualifiesFrom();

	/**
	 * Returns the value of the '<em><b>Qualifies For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Qualification#getTournamentFrom <em>Tournament From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifies For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifies For</em>' reference.
	 * @see #setQualifiesFor(Qualification)
	 * @see eSport.ESportPackage#getTournament_QualifiesFor()
	 * @see eSport.Qualification#getTournamentFrom
	 * @model opposite="tournamentFrom"
	 * @generated
	 */
	Qualification getQualifiesFor();

	/**
	 * Sets the value of the '{@link eSport.Tournament#getQualifiesFor <em>Qualifies For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifies For</em>' reference.
	 * @see #getQualifiesFor()
	 * @generated
	 */
	void setQualifiesFor(Qualification value);

} // Tournament
