/**
 */
package eSport;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eSport.ESportFactory
 * @model kind="package"
 * @generated
 */
public interface ESportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eSport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eSport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eSport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ESportPackage eINSTANCE = eSport.impl.ESportPackageImpl.init();

	/**
	 * The meta object id for the '{@link eSport.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.PersonImpl
	 * @see eSport.impl.ESportPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Capacities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CAPACITIES = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COUNTRY = 4;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.PlayerImpl
	 * @see eSport.impl.ESportPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__DESCRIPTION = PERSON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Capacities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CAPACITIES = PERSON__CAPACITIES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eSport.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.CoachImpl
	 * @see eSport.impl.ESportPackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__DESCRIPTION = PERSON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Capacities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__CAPACITIES = PERSON__CAPACITIES;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__TEAM = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eSport.impl.TournamentImpl <em>Tournament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.TournamentImpl
	 * @see eSport.impl.ESportPackageImpl#getTournament()
	 * @generated
	 */
	int TOURNAMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__COUNTRIES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Allowed Zones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__ALLOWED_ZONES = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__YEAR = 5;

	/**
	 * The feature id for the '<em><b>Finalstages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__FINALSTAGES = 6;

	/**
	 * The feature id for the '<em><b>Groupstages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__GROUPSTAGES = 7;

	/**
	 * The number of structural features of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.LeagueImpl <em>League</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.LeagueImpl
	 * @see eSport.impl.ESportPackageImpl#getLeague()
	 * @generated
	 */
	int LEAGUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__ZONE = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__YEAR = 3;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__SEASON = 4;

	/**
	 * The feature id for the '<em><b>Groupstage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__GROUPSTAGE = 5;

	/**
	 * The number of structural features of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.CapacityImpl <em>Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.CapacityImpl
	 * @see eSport.impl.ESportPackageImpl#getCapacity()
	 * @generated
	 */
	int CAPACITY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.CountryImpl
	 * @see eSport.impl.ESportPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tournaments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__TOURNAMENTS = 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ZONE = 2;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__PERSONS = 3;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.ZoneImpl
	 * @see eSport.impl.ESportPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tournaments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TOURNAMENTS = 1;

	/**
	 * The feature id for the '<em><b>League</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__LEAGUE = 2;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__COUNTRIES = 3;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TEAMS = 4;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.TeamImpl
	 * @see eSport.impl.ESportPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = 1;

	/**
	 * The feature id for the '<em><b>Coach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__COACH = 2;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ZONE = 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GROUPS = 4;

	/**
	 * The feature id for the '<em><b>Championship Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CHAMPIONSHIP_POINTS = 5;

	/**
	 * The feature id for the '<em><b>Finalstages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__FINALSTAGES = 6;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.MatchImpl
	 * @see eSport.impl.ESportPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 9;

	/**
	 * The feature id for the '<em><b>Max Nb Games</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MAX_NB_GAMES = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Finalstage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__FINALSTAGE = 2;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.GroupImpl
	 * @see eSport.impl.ESportPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 10;

	/**
	 * The feature id for the '<em><b>Groupstage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPSTAGE = 0;

	/**
	 * The feature id for the '<em><b>Matchs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MATCHS = 1;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TEAMS = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.GroupStageImpl <em>Group Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.GroupStageImpl
	 * @see eSport.impl.ESportPackageImpl#getGroupStage()
	 * @generated
	 */
	int GROUP_STAGE = 11;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Tournament</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__TOURNAMENT = 2;

	/**
	 * The feature id for the '<em><b>Max Nb Games</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__MAX_NB_GAMES = 3;

	/**
	 * The feature id for the '<em><b>League</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__LEAGUE = 4;

	/**
	 * The feature id for the '<em><b>Meetings In Same Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__MEETINGS_IN_SAME_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Meetings With Other Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__MEETINGS_WITH_OTHER_GROUPS = 6;

	/**
	 * The number of structural features of the '<em>Group Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Group Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.impl.FinalStageImpl <em>Final Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.impl.FinalStageImpl
	 * @see eSport.impl.ESportPackageImpl#getFinalStage()
	 * @generated
	 */
	int FINAL_STAGE = 12;

	/**
	 * The feature id for the '<em><b>Matchs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STAGE__MATCHS = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STAGE__TEAMS = 1;

	/**
	 * The feature id for the '<em><b>Tournament</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STAGE__TOURNAMENT = 2;

	/**
	 * The feature id for the '<em><b>Max Nb Games</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STAGE__MAX_NB_GAMES = 3;

	/**
	 * The number of structural features of the '<em>Final Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Final Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eSport.CapacityType <em>Capacity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.CapacityType
	 * @see eSport.impl.ESportPackageImpl#getCapacityType()
	 * @generated
	 */
	int CAPACITY_TYPE = 13;

	/**
	 * The meta object id for the '{@link eSport.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.Position
	 * @see eSport.impl.ESportPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 14;

	/**
	 * The meta object id for the '{@link eSport.TournamentType <em>Tournament Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.TournamentType
	 * @see eSport.impl.ESportPackageImpl#getTournamentType()
	 * @generated
	 */
	int TOURNAMENT_TYPE = 15;

	/**
	 * The meta object id for the '{@link eSport.GroupStageType <em>Group Stage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eSport.GroupStageType
	 * @see eSport.impl.ESportPackageImpl#getGroupStageType()
	 * @generated
	 */
	int GROUP_STAGE_TYPE = 16;

	/**
	 * Returns the meta object for class '{@link eSport.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see eSport.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see eSport.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the reference '{@link eSport.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see eSport.Player#getTeam()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Team();

	/**
	 * Returns the meta object for class '{@link eSport.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see eSport.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for the reference '{@link eSport.Coach#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see eSport.Coach#getTeam()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Team();

	/**
	 * Returns the meta object for class '{@link eSport.Tournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournament</em>'.
	 * @see eSport.Tournament
	 * @generated
	 */
	EClass getTournament();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Tournament#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eSport.Tournament#getName()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Name();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Tournament#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eSport.Tournament#getSize()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Size();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Tournament#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Countries</em>'.
	 * @see eSport.Tournament#getCountries()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Countries();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Tournament#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eSport.Tournament#getType()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Type();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Tournament#getAllowedZones <em>Allowed Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Zones</em>'.
	 * @see eSport.Tournament#getAllowedZones()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_AllowedZones();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Tournament#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see eSport.Tournament#getYear()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Year();

	/**
	 * Returns the meta object for the containment reference list '{@link eSport.Tournament#getFinalstages <em>Finalstages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finalstages</em>'.
	 * @see eSport.Tournament#getFinalstages()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Finalstages();

	/**
	 * Returns the meta object for the containment reference list '{@link eSport.Tournament#getGroupstages <em>Groupstages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groupstages</em>'.
	 * @see eSport.Tournament#getGroupstages()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Groupstages();

	/**
	 * Returns the meta object for class '{@link eSport.League <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>League</em>'.
	 * @see eSport.League
	 * @generated
	 */
	EClass getLeague();

	/**
	 * Returns the meta object for the attribute '{@link eSport.League#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eSport.League#getName()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Name();

	/**
	 * Returns the meta object for the attribute '{@link eSport.League#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eSport.League#getSize()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Size();

	/**
	 * Returns the meta object for the reference '{@link eSport.League#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see eSport.League#getZone()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Zone();

	/**
	 * Returns the meta object for the attribute '{@link eSport.League#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see eSport.League#getYear()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Year();

	/**
	 * Returns the meta object for the attribute '{@link eSport.League#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see eSport.League#getSeason()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Season();

	/**
	 * Returns the meta object for the containment reference '{@link eSport.League#getGroupstage <em>Groupstage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Groupstage</em>'.
	 * @see eSport.League#getGroupstage()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Groupstage();

	/**
	 * Returns the meta object for class '{@link eSport.Capacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity</em>'.
	 * @see eSport.Capacity
	 * @generated
	 */
	EClass getCapacity();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Capacity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eSport.Capacity#getType()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Type();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Capacity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eSport.Capacity#getValue()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Value();

	/**
	 * Returns the meta object for class '{@link eSport.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see eSport.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eSport.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see eSport.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Person#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eSport.Person#getDescription()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Description();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Person#getCapacities <em>Capacities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capacities</em>'.
	 * @see eSport.Person#getCapacities()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Capacities();

	/**
	 * Returns the meta object for the reference '{@link eSport.Person#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see eSport.Person#getCountry()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Country();

	/**
	 * Returns the meta object for class '{@link eSport.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see eSport.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eSport.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Country#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tournaments</em>'.
	 * @see eSport.Country#getTournaments()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Tournaments();

	/**
	 * Returns the meta object for the container reference '{@link eSport.Country#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Zone</em>'.
	 * @see eSport.Country#getZone()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Zone();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Country#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see eSport.Country#getPersons()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Persons();

	/**
	 * Returns the meta object for class '{@link eSport.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see eSport.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Zone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eSport.Zone#getName()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_Name();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Zone#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tournaments</em>'.
	 * @see eSport.Zone#getTournaments()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Tournaments();

	/**
	 * Returns the meta object for the reference '{@link eSport.Zone#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>League</em>'.
	 * @see eSport.Zone#getLeague()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_League();

	/**
	 * Returns the meta object for the containment reference list '{@link eSport.Zone#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see eSport.Zone#getCountries()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Countries();

	/**
	 * Returns the meta object for the containment reference list '{@link eSport.Zone#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see eSport.Zone#getTeams()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Teams();

	/**
	 * Returns the meta object for class '{@link eSport.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see eSport.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eSport.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see eSport.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

	/**
	 * Returns the meta object for the reference '{@link eSport.Team#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coach</em>'.
	 * @see eSport.Team#getCoach()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Coach();

	/**
	 * Returns the meta object for the container reference '{@link eSport.Team#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Zone</em>'.
	 * @see eSport.Team#getZone()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Zone();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Team#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see eSport.Team#getGroups()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Groups();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Team#getChampionshipPoints <em>Championship Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Championship Points</em>'.
	 * @see eSport.Team#getChampionshipPoints()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_ChampionshipPoints();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Team#getFinalstages <em>Finalstages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finalstages</em>'.
	 * @see eSport.Team#getFinalstages()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Finalstages();

	/**
	 * Returns the meta object for class '{@link eSport.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see eSport.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link eSport.Match#getMaxNbGames <em>Max Nb Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nb Games</em>'.
	 * @see eSport.Match#getMaxNbGames()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_MaxNbGames();

	/**
	 * Returns the meta object for the reference '{@link eSport.Match#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see eSport.Match#getGroup()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Group();

	/**
	 * Returns the meta object for the reference '{@link eSport.Match#getFinalstage <em>Finalstage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finalstage</em>'.
	 * @see eSport.Match#getFinalstage()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Finalstage();

	/**
	 * Returns the meta object for class '{@link eSport.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see eSport.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the container reference '{@link eSport.Group#getGroupstage <em>Groupstage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Groupstage</em>'.
	 * @see eSport.Group#getGroupstage()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Groupstage();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Group#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matchs</em>'.
	 * @see eSport.Group#getMatchs()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Matchs();

	/**
	 * Returns the meta object for the reference list '{@link eSport.Group#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teams</em>'.
	 * @see eSport.Group#getTeams()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Teams();

	/**
	 * Returns the meta object for class '{@link eSport.GroupStage <em>Group Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Stage</em>'.
	 * @see eSport.GroupStage
	 * @generated
	 */
	EClass getGroupStage();

	/**
	 * Returns the meta object for the containment reference list '{@link eSport.GroupStage#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see eSport.GroupStage#getGroups()
	 * @see #getGroupStage()
	 * @generated
	 */
	EReference getGroupStage_Groups();

	/**
	 * Returns the meta object for the attribute '{@link eSport.GroupStage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eSport.GroupStage#getType()
	 * @see #getGroupStage()
	 * @generated
	 */
	EAttribute getGroupStage_Type();

	/**
	 * Returns the meta object for the container reference '{@link eSport.GroupStage#getTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tournament</em>'.
	 * @see eSport.GroupStage#getTournament()
	 * @see #getGroupStage()
	 * @generated
	 */
	EReference getGroupStage_Tournament();

	/**
	 * Returns the meta object for the attribute '{@link eSport.GroupStage#getMaxNbGames <em>Max Nb Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nb Games</em>'.
	 * @see eSport.GroupStage#getMaxNbGames()
	 * @see #getGroupStage()
	 * @generated
	 */
	EAttribute getGroupStage_MaxNbGames();

	/**
	 * Returns the meta object for the container reference '{@link eSport.GroupStage#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>League</em>'.
	 * @see eSport.GroupStage#getLeague()
	 * @see #getGroupStage()
	 * @generated
	 */
	EReference getGroupStage_League();

	/**
	 * Returns the meta object for the attribute '{@link eSport.GroupStage#getMeetingsInSameGroup <em>Meetings In Same Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meetings In Same Group</em>'.
	 * @see eSport.GroupStage#getMeetingsInSameGroup()
	 * @see #getGroupStage()
	 * @generated
	 */
	EAttribute getGroupStage_MeetingsInSameGroup();

	/**
	 * Returns the meta object for the attribute '{@link eSport.GroupStage#getMeetingsWithOtherGroups <em>Meetings With Other Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meetings With Other Groups</em>'.
	 * @see eSport.GroupStage#getMeetingsWithOtherGroups()
	 * @see #getGroupStage()
	 * @generated
	 */
	EAttribute getGroupStage_MeetingsWithOtherGroups();

	/**
	 * Returns the meta object for class '{@link eSport.FinalStage <em>Final Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Stage</em>'.
	 * @see eSport.FinalStage
	 * @generated
	 */
	EClass getFinalStage();

	/**
	 * Returns the meta object for the reference list '{@link eSport.FinalStage#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matchs</em>'.
	 * @see eSport.FinalStage#getMatchs()
	 * @see #getFinalStage()
	 * @generated
	 */
	EReference getFinalStage_Matchs();

	/**
	 * Returns the meta object for the reference list '{@link eSport.FinalStage#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teams</em>'.
	 * @see eSport.FinalStage#getTeams()
	 * @see #getFinalStage()
	 * @generated
	 */
	EReference getFinalStage_Teams();

	/**
	 * Returns the meta object for the container reference '{@link eSport.FinalStage#getTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tournament</em>'.
	 * @see eSport.FinalStage#getTournament()
	 * @see #getFinalStage()
	 * @generated
	 */
	EReference getFinalStage_Tournament();

	/**
	 * Returns the meta object for the attribute '{@link eSport.FinalStage#getMaxNbGames <em>Max Nb Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nb Games</em>'.
	 * @see eSport.FinalStage#getMaxNbGames()
	 * @see #getFinalStage()
	 * @generated
	 */
	EAttribute getFinalStage_MaxNbGames();

	/**
	 * Returns the meta object for enum '{@link eSport.CapacityType <em>Capacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capacity Type</em>'.
	 * @see eSport.CapacityType
	 * @generated
	 */
	EEnum getCapacityType();

	/**
	 * Returns the meta object for enum '{@link eSport.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see eSport.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link eSport.TournamentType <em>Tournament Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tournament Type</em>'.
	 * @see eSport.TournamentType
	 * @generated
	 */
	EEnum getTournamentType();

	/**
	 * Returns the meta object for enum '{@link eSport.GroupStageType <em>Group Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Stage Type</em>'.
	 * @see eSport.GroupStageType
	 * @generated
	 */
	EEnum getGroupStageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ESportFactory getESportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eSport.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.PlayerImpl
		 * @see eSport.impl.ESportPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TEAM = eINSTANCE.getPlayer_Team();

		/**
		 * The meta object literal for the '{@link eSport.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.CoachImpl
		 * @see eSport.impl.ESportPackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COACH__TEAM = eINSTANCE.getCoach_Team();

		/**
		 * The meta object literal for the '{@link eSport.impl.TournamentImpl <em>Tournament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.TournamentImpl
		 * @see eSport.impl.ESportPackageImpl#getTournament()
		 * @generated
		 */
		EClass TOURNAMENT = eINSTANCE.getTournament();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__NAME = eINSTANCE.getTournament_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__SIZE = eINSTANCE.getTournament_Size();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__COUNTRIES = eINSTANCE.getTournament_Countries();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__TYPE = eINSTANCE.getTournament_Type();

		/**
		 * The meta object literal for the '<em><b>Allowed Zones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__ALLOWED_ZONES = eINSTANCE.getTournament_AllowedZones();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__YEAR = eINSTANCE.getTournament_Year();

		/**
		 * The meta object literal for the '<em><b>Finalstages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__FINALSTAGES = eINSTANCE.getTournament_Finalstages();

		/**
		 * The meta object literal for the '<em><b>Groupstages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__GROUPSTAGES = eINSTANCE.getTournament_Groupstages();

		/**
		 * The meta object literal for the '{@link eSport.impl.LeagueImpl <em>League</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.LeagueImpl
		 * @see eSport.impl.ESportPackageImpl#getLeague()
		 * @generated
		 */
		EClass LEAGUE = eINSTANCE.getLeague();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__NAME = eINSTANCE.getLeague_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__SIZE = eINSTANCE.getLeague_Size();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__ZONE = eINSTANCE.getLeague_Zone();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__YEAR = eINSTANCE.getLeague_Year();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__SEASON = eINSTANCE.getLeague_Season();

		/**
		 * The meta object literal for the '<em><b>Groupstage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__GROUPSTAGE = eINSTANCE.getLeague_Groupstage();

		/**
		 * The meta object literal for the '{@link eSport.impl.CapacityImpl <em>Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.CapacityImpl
		 * @see eSport.impl.ESportPackageImpl#getCapacity()
		 * @generated
		 */
		EClass CAPACITY = eINSTANCE.getCapacity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__TYPE = eINSTANCE.getCapacity_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__VALUE = eINSTANCE.getCapacity_Value();

		/**
		 * The meta object literal for the '{@link eSport.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.PersonImpl
		 * @see eSport.impl.ESportPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DESCRIPTION = eINSTANCE.getPerson_Description();

		/**
		 * The meta object literal for the '<em><b>Capacities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CAPACITIES = eINSTANCE.getPerson_Capacities();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__COUNTRY = eINSTANCE.getPerson_Country();

		/**
		 * The meta object literal for the '{@link eSport.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.CountryImpl
		 * @see eSport.impl.ESportPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>Tournaments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__TOURNAMENTS = eINSTANCE.getCountry_Tournaments();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__ZONE = eINSTANCE.getCountry_Zone();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__PERSONS = eINSTANCE.getCountry_Persons();

		/**
		 * The meta object literal for the '{@link eSport.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.ZoneImpl
		 * @see eSport.impl.ESportPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__NAME = eINSTANCE.getZone_Name();

		/**
		 * The meta object literal for the '<em><b>Tournaments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__TOURNAMENTS = eINSTANCE.getZone_Tournaments();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__LEAGUE = eINSTANCE.getZone_League();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__COUNTRIES = eINSTANCE.getZone_Countries();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__TEAMS = eINSTANCE.getZone_Teams();

		/**
		 * The meta object literal for the '{@link eSport.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.TeamImpl
		 * @see eSport.impl.ESportPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

		/**
		 * The meta object literal for the '<em><b>Coach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__COACH = eINSTANCE.getTeam_Coach();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__ZONE = eINSTANCE.getTeam_Zone();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__GROUPS = eINSTANCE.getTeam_Groups();

		/**
		 * The meta object literal for the '<em><b>Championship Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__CHAMPIONSHIP_POINTS = eINSTANCE.getTeam_ChampionshipPoints();

		/**
		 * The meta object literal for the '<em><b>Finalstages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__FINALSTAGES = eINSTANCE.getTeam_Finalstages();

		/**
		 * The meta object literal for the '{@link eSport.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.MatchImpl
		 * @see eSport.impl.ESportPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Max Nb Games</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__MAX_NB_GAMES = eINSTANCE.getMatch_MaxNbGames();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__GROUP = eINSTANCE.getMatch_Group();

		/**
		 * The meta object literal for the '<em><b>Finalstage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__FINALSTAGE = eINSTANCE.getMatch_Finalstage();

		/**
		 * The meta object literal for the '{@link eSport.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.GroupImpl
		 * @see eSport.impl.ESportPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Groupstage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPSTAGE = eINSTANCE.getGroup_Groupstage();

		/**
		 * The meta object literal for the '<em><b>Matchs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MATCHS = eINSTANCE.getGroup_Matchs();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__TEAMS = eINSTANCE.getGroup_Teams();

		/**
		 * The meta object literal for the '{@link eSport.impl.GroupStageImpl <em>Group Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.GroupStageImpl
		 * @see eSport.impl.ESportPackageImpl#getGroupStage()
		 * @generated
		 */
		EClass GROUP_STAGE = eINSTANCE.getGroupStage();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_STAGE__GROUPS = eINSTANCE.getGroupStage_Groups();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_STAGE__TYPE = eINSTANCE.getGroupStage_Type();

		/**
		 * The meta object literal for the '<em><b>Tournament</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_STAGE__TOURNAMENT = eINSTANCE.getGroupStage_Tournament();

		/**
		 * The meta object literal for the '<em><b>Max Nb Games</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_STAGE__MAX_NB_GAMES = eINSTANCE.getGroupStage_MaxNbGames();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_STAGE__LEAGUE = eINSTANCE.getGroupStage_League();

		/**
		 * The meta object literal for the '<em><b>Meetings In Same Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_STAGE__MEETINGS_IN_SAME_GROUP = eINSTANCE.getGroupStage_MeetingsInSameGroup();

		/**
		 * The meta object literal for the '<em><b>Meetings With Other Groups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_STAGE__MEETINGS_WITH_OTHER_GROUPS = eINSTANCE.getGroupStage_MeetingsWithOtherGroups();

		/**
		 * The meta object literal for the '{@link eSport.impl.FinalStageImpl <em>Final Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.impl.FinalStageImpl
		 * @see eSport.impl.ESportPackageImpl#getFinalStage()
		 * @generated
		 */
		EClass FINAL_STAGE = eINSTANCE.getFinalStage();

		/**
		 * The meta object literal for the '<em><b>Matchs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STAGE__MATCHS = eINSTANCE.getFinalStage_Matchs();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STAGE__TEAMS = eINSTANCE.getFinalStage_Teams();

		/**
		 * The meta object literal for the '<em><b>Tournament</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STAGE__TOURNAMENT = eINSTANCE.getFinalStage_Tournament();

		/**
		 * The meta object literal for the '<em><b>Max Nb Games</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_STAGE__MAX_NB_GAMES = eINSTANCE.getFinalStage_MaxNbGames();

		/**
		 * The meta object literal for the '{@link eSport.CapacityType <em>Capacity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.CapacityType
		 * @see eSport.impl.ESportPackageImpl#getCapacityType()
		 * @generated
		 */
		EEnum CAPACITY_TYPE = eINSTANCE.getCapacityType();

		/**
		 * The meta object literal for the '{@link eSport.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.Position
		 * @see eSport.impl.ESportPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link eSport.TournamentType <em>Tournament Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.TournamentType
		 * @see eSport.impl.ESportPackageImpl#getTournamentType()
		 * @generated
		 */
		EEnum TOURNAMENT_TYPE = eINSTANCE.getTournamentType();

		/**
		 * The meta object literal for the '{@link eSport.GroupStageType <em>Group Stage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eSport.GroupStageType
		 * @see eSport.impl.ESportPackageImpl#getGroupStageType()
		 * @generated
		 */
		EEnum GROUP_STAGE_TYPE = eINSTANCE.getGroupStageType();

	}

} //ESportPackage
