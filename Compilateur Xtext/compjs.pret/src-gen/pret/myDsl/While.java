/**
 * generated by Xtext 2.25.0
 */
package pret.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.While#getWhexp <em>Whexp</em>}</li>
 *   <li>{@link pret.myDsl.While#getWhcom <em>Whcom</em>}</li>
 * </ul>
 *
 * @see pret.myDsl.MyDslPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends EObject
{
  /**
   * Returns the value of the '<em><b>Whexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whexp</em>' containment reference.
   * @see #setWhexp(Expression)
   * @see pret.myDsl.MyDslPackage#getWhile_Whexp()
   * @model containment="true"
   * @generated
   */
  Expression getWhexp();

  /**
   * Sets the value of the '{@link pret.myDsl.While#getWhexp <em>Whexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whexp</em>' containment reference.
   * @see #getWhexp()
   * @generated
   */
  void setWhexp(Expression value);

  /**
   * Returns the value of the '<em><b>Whcom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whcom</em>' containment reference.
   * @see #setWhcom(Commands)
   * @see pret.myDsl.MyDslPackage#getWhile_Whcom()
   * @model containment="true"
   * @generated
   */
  Commands getWhcom();

  /**
   * Sets the value of the '{@link pret.myDsl.While#getWhcom <em>Whcom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whcom</em>' containment reference.
   * @see #getWhcom()
   * @generated
   */
  void setWhcom(Commands value);

} // While
