/**
 */
package eSport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eSport.GroupStage#getGroups <em>Groups</em>}</li>
 *   <li>{@link eSport.GroupStage#getType <em>Type</em>}</li>
 *   <li>{@link eSport.GroupStage#getTournament <em>Tournament</em>}</li>
 *   <li>{@link eSport.GroupStage#getMaxNbGames <em>Max Nb Games</em>}</li>
 *   <li>{@link eSport.GroupStage#getLeague <em>League</em>}</li>
 *   <li>{@link eSport.GroupStage#getMeetingsInSameGroup <em>Meetings In Same Group</em>}</li>
 *   <li>{@link eSport.GroupStage#getMeetingsWithOtherGroups <em>Meetings With Other Groups</em>}</li>
 * </ul>
 *
 * @see eSport.ESportPackage#getGroupStage()
 * @model
 * @generated
 */
public interface GroupStage extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link eSport.Group}.
	 * It is bidirectional and its opposite is '{@link eSport.Group#getGroupstage <em>Groupstage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see eSport.ESportPackage#getGroupStage_Groups()
	 * @see eSport.Group#getGroupstage
	 * @model opposite="groupstage" containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eSport.GroupStageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eSport.GroupStageType
	 * @see #setType(GroupStageType)
	 * @see eSport.ESportPackage#getGroupStage_Type()
	 * @model
	 * @generated
	 */
	GroupStageType getType();

	/**
	 * Sets the value of the '{@link eSport.GroupStage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eSport.GroupStageType
	 * @see #getType()
	 * @generated
	 */
	void setType(GroupStageType value);

	/**
	 * Returns the value of the '<em><b>Tournament</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.Tournament#getGroupstages <em>Groupstages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournament</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament</em>' container reference.
	 * @see #setTournament(Tournament)
	 * @see eSport.ESportPackage#getGroupStage_Tournament()
	 * @see eSport.Tournament#getGroupstages
	 * @model opposite="groupstages" transient="false"
	 * @generated
	 */
	Tournament getTournament();

	/**
	 * Sets the value of the '{@link eSport.GroupStage#getTournament <em>Tournament</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament</em>' container reference.
	 * @see #getTournament()
	 * @generated
	 */
	void setTournament(Tournament value);

	/**
	 * Returns the value of the '<em><b>Max Nb Games</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nb Games</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nb Games</em>' attribute.
	 * @see #setMaxNbGames(int)
	 * @see eSport.ESportPackage#getGroupStage_MaxNbGames()
	 * @model
	 * @generated
	 */
	int getMaxNbGames();

	/**
	 * Sets the value of the '{@link eSport.GroupStage#getMaxNbGames <em>Max Nb Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nb Games</em>' attribute.
	 * @see #getMaxNbGames()
	 * @generated
	 */
	void setMaxNbGames(int value);

	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eSport.League#getGroupstage <em>Groupstage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>League</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see eSport.ESportPackage#getGroupStage_League()
	 * @see eSport.League#getGroupstage
	 * @model opposite="groupstage" transient="false"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link eSport.GroupStage#getLeague <em>League</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' container reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Meetings In Same Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meetings In Same Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meetings In Same Group</em>' attribute.
	 * @see #setMeetingsInSameGroup(int)
	 * @see eSport.ESportPackage#getGroupStage_MeetingsInSameGroup()
	 * @model
	 * @generated
	 */
	int getMeetingsInSameGroup();

	/**
	 * Sets the value of the '{@link eSport.GroupStage#getMeetingsInSameGroup <em>Meetings In Same Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meetings In Same Group</em>' attribute.
	 * @see #getMeetingsInSameGroup()
	 * @generated
	 */
	void setMeetingsInSameGroup(int value);

	/**
	 * Returns the value of the '<em><b>Meetings With Other Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meetings With Other Groups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meetings With Other Groups</em>' attribute.
	 * @see #setMeetingsWithOtherGroups(int)
	 * @see eSport.ESportPackage#getGroupStage_MeetingsWithOtherGroups()
	 * @model
	 * @generated
	 */
	int getMeetingsWithOtherGroups();

	/**
	 * Sets the value of the '{@link eSport.GroupStage#getMeetingsWithOtherGroups <em>Meetings With Other Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meetings With Other Groups</em>' attribute.
	 * @see #getMeetingsWithOtherGroups()
	 * @generated
	 */
	void setMeetingsWithOtherGroups(int value);

} // GroupStage
