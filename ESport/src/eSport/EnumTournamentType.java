/**
 */
package eSport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Tournament Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eSport.ESportPackage#getEnumTournamentType()
 * @model
 * @generated
 */
public enum EnumTournamentType implements Enumerator {
	/**
	 * The '<em><b>Worlds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORLDS_VALUE
	 * @generated
	 * @ordered
	 */
	WORLDS(0, "worlds", "worlds"),

	/**
	 * The '<em><b>Regionals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONALS_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONALS(1, "regionals", "regionals"),

	/**
	 * The '<em><b>All Stars</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_STARS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_STARS(2, "allStars", "allStars"),

	/**
	 * The '<em><b>Promotion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMOTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROMOTION(3, "promotion", "promotion"),

	/**
	 * The '<em><b>Mid Season Invitational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_SEASON_INVITATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	MID_SEASON_INVITATIONAL(4, "midSeasonInvitational", "midSeasonInvitational"),

	/**
	 * The '<em><b>Rift Rivals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIFT_RIVALS_VALUE
	 * @generated
	 * @ordered
	 */
	RIFT_RIVALS(5, "riftRivals", "riftRivals"),

	/**
	 * The '<em><b>Play Off</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAY_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	PLAY_OFF(6, "playOff", "playOff");

	/**
	 * The '<em><b>Worlds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Worlds</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORLDS
	 * @model name="worlds"
	 * @generated
	 * @ordered
	 */
	public static final int WORLDS_VALUE = 0;

	/**
	 * The '<em><b>Regionals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regionals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGIONALS
	 * @model name="regionals"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONALS_VALUE = 1;

	/**
	 * The '<em><b>All Stars</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Stars</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_STARS
	 * @model name="allStars"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_STARS_VALUE = 2;

	/**
	 * The '<em><b>Promotion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Promotion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROMOTION
	 * @model name="promotion"
	 * @generated
	 * @ordered
	 */
	public static final int PROMOTION_VALUE = 3;

	/**
	 * The '<em><b>Mid Season Invitational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mid Season Invitational</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MID_SEASON_INVITATIONAL
	 * @model name="midSeasonInvitational"
	 * @generated
	 * @ordered
	 */
	public static final int MID_SEASON_INVITATIONAL_VALUE = 4;

	/**
	 * The '<em><b>Rift Rivals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rift Rivals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIFT_RIVALS
	 * @model name="riftRivals"
	 * @generated
	 * @ordered
	 */
	public static final int RIFT_RIVALS_VALUE = 5;

	/**
	 * The '<em><b>Play Off</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Play Off</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAY_OFF
	 * @model name="playOff"
	 * @generated
	 * @ordered
	 */
	public static final int PLAY_OFF_VALUE = 6;

	/**
	 * An array of all the '<em><b>Enum Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumTournamentType[] VALUES_ARRAY =
		new EnumTournamentType[] {
			WORLDS,
			REGIONALS,
			ALL_STARS,
			PROMOTION,
			MID_SEASON_INVITATIONAL,
			RIFT_RIVALS,
			PLAY_OFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumTournamentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Tournament Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumTournamentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumTournamentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Tournament Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumTournamentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumTournamentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Tournament Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumTournamentType get(int value) {
		switch (value) {
			case WORLDS_VALUE: return WORLDS;
			case REGIONALS_VALUE: return REGIONALS;
			case ALL_STARS_VALUE: return ALL_STARS;
			case PROMOTION_VALUE: return PROMOTION;
			case MID_SEASON_INVITATIONAL_VALUE: return MID_SEASON_INVITATIONAL;
			case RIFT_RIVALS_VALUE: return RIFT_RIVALS;
			case PLAY_OFF_VALUE: return PLAY_OFF;
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
	private EnumTournamentType(int value, String name, String literal) {
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
	
} //EnumTournamentType
