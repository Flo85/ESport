/**
 */
package eSport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eSport.ESportPackage#getPosition()
 * @model
 * @generated
 */
public enum Position implements Enumerator {
	/**
	 * The '<em><b>Attack Damage Carry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACK_DAMAGE_CARRY_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACK_DAMAGE_CARRY(0, "attackDamageCarry", "adc"),

	/**
	 * The '<em><b>Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORT(1, "support", "support"),

	/**
	 * The '<em><b>Mid Lane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_LANE_VALUE
	 * @generated
	 * @ordered
	 */
	MID_LANE(2, "midLane", "midLane"),

	/**
	 * The '<em><b>Top Lane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_LANE_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_LANE(3, "topLane", "topLane"),

	/**
	 * The '<em><b>Jungle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUNGLE_VALUE
	 * @generated
	 * @ordered
	 */
	JUNGLE(4, "jungle", "jungle");

	/**
	 * The '<em><b>Attack Damage Carry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attack Damage Carry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTACK_DAMAGE_CARRY
	 * @model name="attackDamageCarry" literal="adc"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACK_DAMAGE_CARRY_VALUE = 0;

	/**
	 * The '<em><b>Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Support</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPORT
	 * @model name="support"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORT_VALUE = 1;

	/**
	 * The '<em><b>Mid Lane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mid Lane</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MID_LANE
	 * @model name="midLane"
	 * @generated
	 * @ordered
	 */
	public static final int MID_LANE_VALUE = 2;

	/**
	 * The '<em><b>Top Lane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Lane</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_LANE
	 * @model name="topLane"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_LANE_VALUE = 3;

	/**
	 * The '<em><b>Jungle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jungle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JUNGLE
	 * @model name="jungle"
	 * @generated
	 * @ordered
	 */
	public static final int JUNGLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Position[] VALUES_ARRAY =
		new Position[] {
			ATTACK_DAMAGE_CARRY,
			SUPPORT,
			MID_LANE,
			TOP_LANE,
			JUNGLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Position> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Position result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Position result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Position get(int value) {
		switch (value) {
			case ATTACK_DAMAGE_CARRY_VALUE: return ATTACK_DAMAGE_CARRY;
			case SUPPORT_VALUE: return SUPPORT;
			case MID_LANE_VALUE: return MID_LANE;
			case TOP_LANE_VALUE: return TOP_LANE;
			case JUNGLE_VALUE: return JUNGLE;
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
	private Position(int value, String name, String literal) {
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
	
} //Position
