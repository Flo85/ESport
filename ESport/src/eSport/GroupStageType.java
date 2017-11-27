/**
 */
package eSport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Group Stage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eSport.ESportPackage#getGroupStageType()
 * @model
 * @generated
 */
public enum GroupStageType implements Enumerator {
	/**
	 * The '<em><b>League</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAGUE_VALUE
	 * @generated
	 * @ordered
	 */
	LEAGUE(0, "league", "league"),

	/**
	 * The '<em><b>Worlds Play In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLDS_PLAY_IN_VALUE
	 * @generated
	 * @ordered
	 */
	WORLDS_PLAY_IN(1, "worldsPlayIn", "worldsPlayIn"),

	/**
	 * The '<em><b>Worlds Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLDS_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	WORLDS_GROUP(2, "worldsGroup", "worldsGroup"),

	/**
	 * The '<em><b>Rift Rivals Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIFT_RIVALS_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	RIFT_RIVALS_GROUP(3, "riftRivalsGroup", "riftRivalsGroup"),

	/**
	 * The '<em><b>Msi Play In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSI_PLAY_IN_VALUE
	 * @generated
	 * @ordered
	 */
	MSI_PLAY_IN(4, "msiPlayIn", "msiPlayIn"),

	/**
	 * The '<em><b>Msi Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSI_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	MSI_GROUP(5, "msiGroup", "msiGroup"),

	/**
	 * The '<em><b>All Stars Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_STARS_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_STARS_GROUP(6, "allStarsGroup", "allStarsGroup");

	/**
	 * The '<em><b>League</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>League</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAGUE
	 * @model name="league"
	 * @generated
	 * @ordered
	 */
	public static final int LEAGUE_VALUE = 0;

	/**
	 * The '<em><b>Worlds Play In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Worlds Play In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORLDS_PLAY_IN
	 * @model name="worldsPlayIn"
	 * @generated
	 * @ordered
	 */
	public static final int WORLDS_PLAY_IN_VALUE = 1;

	/**
	 * The '<em><b>Worlds Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Worlds Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORLDS_GROUP
	 * @model name="worldsGroup"
	 * @generated
	 * @ordered
	 */
	public static final int WORLDS_GROUP_VALUE = 2;

	/**
	 * The '<em><b>Rift Rivals Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rift Rivals Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIFT_RIVALS_GROUP
	 * @model name="riftRivalsGroup"
	 * @generated
	 * @ordered
	 */
	public static final int RIFT_RIVALS_GROUP_VALUE = 3;

	/**
	 * The '<em><b>Msi Play In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msi Play In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSI_PLAY_IN
	 * @model name="msiPlayIn"
	 * @generated
	 * @ordered
	 */
	public static final int MSI_PLAY_IN_VALUE = 4;

	/**
	 * The '<em><b>Msi Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msi Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSI_GROUP
	 * @model name="msiGroup"
	 * @generated
	 * @ordered
	 */
	public static final int MSI_GROUP_VALUE = 5;

	/**
	 * The '<em><b>All Stars Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Stars Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_STARS_GROUP
	 * @model name="allStarsGroup"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_STARS_GROUP_VALUE = 6;

	/**
	 * An array of all the '<em><b>Group Stage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GroupStageType[] VALUES_ARRAY =
		new GroupStageType[] {
			LEAGUE,
			WORLDS_PLAY_IN,
			WORLDS_GROUP,
			RIFT_RIVALS_GROUP,
			MSI_PLAY_IN,
			MSI_GROUP,
			ALL_STARS_GROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Group Stage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GroupStageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Group Stage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupStageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupStageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Stage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupStageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupStageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Stage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupStageType get(int value) {
		switch (value) {
			case LEAGUE_VALUE: return LEAGUE;
			case WORLDS_PLAY_IN_VALUE: return WORLDS_PLAY_IN;
			case WORLDS_GROUP_VALUE: return WORLDS_GROUP;
			case RIFT_RIVALS_GROUP_VALUE: return RIFT_RIVALS_GROUP;
			case MSI_PLAY_IN_VALUE: return MSI_PLAY_IN;
			case MSI_GROUP_VALUE: return MSI_GROUP;
			case ALL_STARS_GROUP_VALUE: return ALL_STARS_GROUP;
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
	private GroupStageType(int value, String name, String literal) {
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
	
} //GroupStageType
