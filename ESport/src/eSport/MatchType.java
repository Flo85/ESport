/**
 */
package eSport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Match Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eSport.ESportPackage#getMatchType()
 * @model
 * @generated
 */
public enum MatchType implements Enumerator {
	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(0, "group", "group"),

	/**
	 * The '<em><b>Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(1, "final", "final"),

	/**
	 * The '<em><b>Semi Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_FINAL(2, "semiFinal", "semiFinal"),

	/**
	 * The '<em><b>Quarter Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER_FINAL(3, "quarterFinal", "quarterFinal");

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUP
	 * @model name="group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 0;

	/**
	 * The '<em><b>Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Final</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINAL
	 * @model name="final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 1;

	/**
	 * The '<em><b>Semi Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semi Final</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMI_FINAL
	 * @model name="semiFinal"
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_FINAL_VALUE = 2;

	/**
	 * The '<em><b>Quarter Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quarter Final</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUARTER_FINAL
	 * @model name="quarterFinal"
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_FINAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Match Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MatchType[] VALUES_ARRAY =
		new MatchType[] {
			GROUP,
			FINAL,
			SEMI_FINAL,
			QUARTER_FINAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Match Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MatchType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Match Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MatchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Match Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MatchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Match Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MatchType get(int value) {
		switch (value) {
			case GROUP_VALUE: return GROUP;
			case FINAL_VALUE: return FINAL;
			case SEMI_FINAL_VALUE: return SEMI_FINAL;
			case QUARTER_FINAL_VALUE: return QUARTER_FINAL;
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
	private MatchType(int value, String name, String literal) {
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
	
} //MatchType
