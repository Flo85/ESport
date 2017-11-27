/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.League#getName <em>Name</em>}</li>
 *   <li>{@link eSport.League#getSize <em>Size</em>}</li>
 *   <li>{@link eSport.League#getZone <em>Zone</em>}</li>
 *   <li>{@link eSport.League#getYear <em>Year</em>}</li>
 *   <li>{@link eSport.League#getSeason <em>Season</em>}</li>
 *   <li>{@link eSport.League#getGroupstage <em>Groupstage</em>}</li>
 *   <li>{@link eSport.League#getQualificationsFrom <em>Qualifications From</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getLeague()
 * @model
 * @generated
 */
public interface League extends EObject {
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
	 * @see eSport.ESportPackage#getLeague_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eSport.League#getName <em>Name</em>}' attribute.
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
	 * @see eSport.ESportPackage#getLeague_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link eSport.League#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eSport.Zone#getLeagues <em>Leagues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see eSport.ESportPackage#getLeague_Zone()
	 * @see eSport.Zone#getLeagues
	 * @model opposite="leagues"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link eSport.League#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

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
	 * @see eSport.ESportPackage#getLeague_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link eSport.League#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see #setSeason(String)
	 * @see eSport.ESportPackage#getLeague_Season()
	 * @model
	 * @generated
	 */
	String getSeason();

	/**
	 * Sets the value of the '{@link eSport.League#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(String value);

	/**
	 * Returns the value of the '<em><b>Groupstage</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eSport.GroupStage#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupstage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupstage</em>' containment reference.
	 * @see #setGroupstage(GroupStage)
	 * @see eSport.ESportPackage#getLeague_Groupstage()
	 * @see eSport.GroupStage#getLeague
	 * @model opposite="league" containment="true"
	 * @generated
	 */
	GroupStage getGroupstage();

	/**
	 * Sets the value of the '{@link eSport.League#getGroupstage <em>Groupstage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupstage</em>' containment reference.
	 * @see #getGroupstage()
	 * @generated
	 */
	void setGroupstage(GroupStage value);

	/**
	 * Returns the value of the '<em><b>Qualifications From</b></em>' reference list.
	 * The list contents are of type {@link eSport.Qualification}.
	 * It is bidirectional and its opposite is '{@link eSport.Qualification#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifications From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifications From</em>' reference list.
	 * @see eSport.ESportPackage#getLeague_QualificationsFrom()
	 * @see eSport.Qualification#getLeague
	 * @model opposite="league"
	 * @generated
	 */
	EList<Qualification> getQualificationsFrom();

} // League
