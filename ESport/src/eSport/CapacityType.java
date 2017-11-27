/**
 */
package eSport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Capacity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eSport.ESportPackage#getCapacityType()
 * @model
 * @generated
 */
public enum CapacityType implements Enumerator {
	/**
	 * The '<em><b>Positioning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIONING_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIONING(0, "positioning", "positioning"),

	/**
	 * The '<em><b>Stress Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRESS_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	STRESS_MANAGEMENT(1, "stressManagement", "stressManagement"),

	/**
	 * The '<em><b>Playmaking Mechanics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYMAKING_MECHANICS_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYMAKING_MECHANICS(2, "playmakingMechanics", "playmakingMechanics"),

	/**
	 * The '<em><b>Escape Mechanics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCAPE_MECHANICS_VALUE
	 * @generated
	 * @ordered
	 */
	ESCAPE_MECHANICS(3, "escapeMechanics", "escapeMechanics"),

	/**
	 * The '<em><b>Patience</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENCE_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENCE(4, "patience", "patience"),

	/**
	 * The '<em><b>Farm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FARM_VALUE
	 * @generated
	 * @ordered
	 */
	FARM(5, "farm", "farm"),

	/**
	 * The '<em><b>Steal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEAL_VALUE
	 * @generated
	 * @ordered
	 */
	STEAL(6, "steal", "steal"),

	/**
	 * The '<em><b>Split Push</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLIT_PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	SPLIT_PUSH(7, "splitPush", "splitPush"),

	/**
	 * The '<em><b>Team Play</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAM_PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	TEAM_PLAY(8, "teamPlay", "teamPlay"),

	/**
	 * The '<em><b>Aggressivity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGRESSIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	AGGRESSIVITY(9, "aggressivity", "aggressivity"),

	/**
	 * The '<em><b>Leadership</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEADERSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	LEADERSHIP(10, "leadership", "leadership"),

	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(11, "draft", "draft"),

	/**
	 * The '<em><b>Pathing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATHING_VALUE
	 * @generated
	 * @ordered
	 */
	PATHING(12, "pathing", "pathing"),

	/**
	 * The '<em><b>Awareness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWARENESS_VALUE
	 * @generated
	 * @ordered
	 */
	AWARENESS(13, "awareness", "awareness"),

	/**
	 * The '<em><b>Experience</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERIENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPERIENCE(14, "experience", "experience"),

	/**
	 * The '<em><b>Objective Play</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECTIVE_PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECTIVE_PLAY(15, "objectivePlay", "objectivePlay"),

	/**
	 * The '<em><b>Meta Game</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_GAME_VALUE
	 * @generated
	 * @ordered
	 */
	META_GAME(16, "metaGame", "metaGame");

	/**
	 * The '<em><b>Positioning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Positioning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIONING
	 * @model name="positioning"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIONING_VALUE = 0;

	/**
	 * The '<em><b>Stress Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stress Management</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRESS_MANAGEMENT
	 * @model name="stressManagement"
	 * @generated
	 * @ordered
	 */
	public static final int STRESS_MANAGEMENT_VALUE = 1;

	/**
	 * The '<em><b>Playmaking Mechanics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Playmaking Mechanics</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYMAKING_MECHANICS
	 * @model name="playmakingMechanics"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYMAKING_MECHANICS_VALUE = 2;

	/**
	 * The '<em><b>Escape Mechanics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Escape Mechanics</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESCAPE_MECHANICS
	 * @model name="escapeMechanics"
	 * @generated
	 * @ordered
	 */
	public static final int ESCAPE_MECHANICS_VALUE = 3;

	/**
	 * The '<em><b>Patience</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patience</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENCE
	 * @model name="patience"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENCE_VALUE = 4;

	/**
	 * The '<em><b>Farm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Farm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FARM
	 * @model name="farm"
	 * @generated
	 * @ordered
	 */
	public static final int FARM_VALUE = 5;

	/**
	 * The '<em><b>Steal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Steal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEAL
	 * @model name="steal"
	 * @generated
	 * @ordered
	 */
	public static final int STEAL_VALUE = 6;

	/**
	 * The '<em><b>Split Push</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Split Push</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPLIT_PUSH
	 * @model name="splitPush"
	 * @generated
	 * @ordered
	 */
	public static final int SPLIT_PUSH_VALUE = 7;

	/**
	 * The '<em><b>Team Play</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Team Play</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEAM_PLAY
	 * @model name="teamPlay"
	 * @generated
	 * @ordered
	 */
	public static final int TEAM_PLAY_VALUE = 8;

	/**
	 * The '<em><b>Aggressivity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggressivity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGRESSIVITY
	 * @model name="aggressivity"
	 * @generated
	 * @ordered
	 */
	public static final int AGGRESSIVITY_VALUE = 9;

	/**
	 * The '<em><b>Leadership</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leadership</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEADERSHIP
	 * @model name="leadership"
	 * @generated
	 * @ordered
	 */
	public static final int LEADERSHIP_VALUE = 10;

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Draft</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAFT
	 * @model name="draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 11;

	/**
	 * The '<em><b>Pathing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pathing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATHING
	 * @model name="pathing"
	 * @generated
	 * @ordered
	 */
	public static final int PATHING_VALUE = 12;

	/**
	 * The '<em><b>Awareness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Awareness</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AWARENESS
	 * @model name="awareness"
	 * @generated
	 * @ordered
	 */
	public static final int AWARENESS_VALUE = 13;

	/**
	 * The '<em><b>Experience</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Experience</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPERIENCE
	 * @model name="experience"
	 * @generated
	 * @ordered
	 */
	public static final int EXPERIENCE_VALUE = 14;

	/**
	 * The '<em><b>Objective Play</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Objective Play</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECTIVE_PLAY
	 * @model name="objectivePlay"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECTIVE_PLAY_VALUE = 15;

	/**
	 * The '<em><b>Meta Game</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meta Game</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #META_GAME
	 * @model name="metaGame"
	 * @generated
	 * @ordered
	 */
	public static final int META_GAME_VALUE = 16;

	/**
	 * An array of all the '<em><b>Capacity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CapacityType[] VALUES_ARRAY =
		new CapacityType[] {
			POSITIONING,
			STRESS_MANAGEMENT,
			PLAYMAKING_MECHANICS,
			ESCAPE_MECHANICS,
			PATIENCE,
			FARM,
			STEAL,
			SPLIT_PUSH,
			TEAM_PLAY,
			AGGRESSIVITY,
			LEADERSHIP,
			DRAFT,
			PATHING,
			AWARENESS,
			EXPERIENCE,
			OBJECTIVE_PLAY,
			META_GAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Capacity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CapacityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Capacity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapacityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapacityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capacity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapacityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapacityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capacity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapacityType get(int value) {
		switch (value) {
			case POSITIONING_VALUE: return POSITIONING;
			case STRESS_MANAGEMENT_VALUE: return STRESS_MANAGEMENT;
			case PLAYMAKING_MECHANICS_VALUE: return PLAYMAKING_MECHANICS;
			case ESCAPE_MECHANICS_VALUE: return ESCAPE_MECHANICS;
			case PATIENCE_VALUE: return PATIENCE;
			case FARM_VALUE: return FARM;
			case STEAL_VALUE: return STEAL;
			case SPLIT_PUSH_VALUE: return SPLIT_PUSH;
			case TEAM_PLAY_VALUE: return TEAM_PLAY;
			case AGGRESSIVITY_VALUE: return AGGRESSIVITY;
			case LEADERSHIP_VALUE: return LEADERSHIP;
			case DRAFT_VALUE: return DRAFT;
			case PATHING_VALUE: return PATHING;
			case AWARENESS_VALUE: return AWARENESS;
			case EXPERIENCE_VALUE: return EXPERIENCE;
			case OBJECTIVE_PLAY_VALUE: return OBJECTIVE_PLAY;
			case META_GAME_VALUE: return META_GAME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CapacityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CapacityType
