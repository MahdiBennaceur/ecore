/**
 */
package hypervisor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FEATURES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hypervisor.HypervisorPackage#getFEATURES()
 * @model
 * @generated
 */
public enum FEATURES implements Enumerator {
	/**
	 * The '<em><b>Acpi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACPI_VALUE
	 * @generated
	 * @ordered
	 */
	ACPI(0, "acpi", "acpi"),

	/**
	 * The '<em><b>Pae</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAE_VALUE
	 * @generated
	 * @ordered
	 */
	PAE(0, "pae", "pae"),

	/**
	 * The '<em><b>Apic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APIC_VALUE
	 * @generated
	 * @ordered
	 */
	APIC(0, "apic", "apic");

	/**
	 * The '<em><b>Acpi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acpi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACPI
	 * @model name="acpi"
	 * @generated
	 * @ordered
	 */
	public static final int ACPI_VALUE = 0;

	/**
	 * The '<em><b>Pae</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pae</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAE
	 * @model name="pae"
	 * @generated
	 * @ordered
	 */
	public static final int PAE_VALUE = 0;

	/**
	 * The '<em><b>Apic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APIC
	 * @model name="apic"
	 * @generated
	 * @ordered
	 */
	public static final int APIC_VALUE = 0;

	/**
	 * An array of all the '<em><b>FEATURES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FEATURES[] VALUES_ARRAY =
		new FEATURES[] {
			ACPI,
			PAE,
			APIC,
		};

	/**
	 * A public read-only list of all the '<em><b>FEATURES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FEATURES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FEATURES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FEATURES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FEATURES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FEATURES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FEATURES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FEATURES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FEATURES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FEATURES get(int value) {
		switch (value) {
			case ACPI_VALUE: return ACPI;
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
	private FEATURES(int value, String name, String literal) {
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
	
} //FEATURES