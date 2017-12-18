/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.Group#getGroupstage <em>Groupstage</em>}</li>
 *   <li>{@link eSport.Group#getMatchs <em>Matchs</em>}</li>
 *   <li>{@link eSport.Group#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Groupstage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.GroupStage#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupstage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupstage</em>' container reference.
	 * @see #setGroupstage(GroupStage)
	 * @see eSport.ESportPackage#getGroup_Groupstage()
	 * @see eSport.GroupStage#getGroups
	 * @model opposite="groups" transient="false"
	 * @generated
	 */
	GroupStage getGroupstage();

	/**
	 * Sets the value of the '{@link eSport.Group#getGroupstage <em>Groupstage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupstage</em>' container reference.
	 * @see #getGroupstage()
	 * @generated
	 */
	void setGroupstage(GroupStage value);

	/**
	 * Returns the value of the '<em><b>Matchs</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Match}.
	 * It is bidirectional and its opposite is '{@link eSport.Match#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs</em>' containment reference list.
	 * @see eSport.ESportPackage#getGroup_Matchs()
	 * @see eSport.Match#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<Match> getMatchs();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link eSport.Team}.
	 * It is bidirectional and its opposite is '{@link eSport.Team#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see eSport.ESportPackage#getGroup_Teams()
	 * @see eSport.Team#getGroups
	 * @model opposite="groups"
	 * @generated
	 */
	EList<Team> getTeams();

} // Group
