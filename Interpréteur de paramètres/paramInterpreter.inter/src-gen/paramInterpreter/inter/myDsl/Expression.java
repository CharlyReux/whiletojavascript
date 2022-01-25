/**
 * generated by Xtext 2.25.0
 */
package paramInterpreter.inter.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paramInterpreter.inter.myDsl.Expression#getExpbg <em>Expbg</em>}</li>
 *   <li>{@link paramInterpreter.inter.myDsl.Expression#getExpbd <em>Expbd</em>}</li>
 * </ul>
 *
 * @see paramInterpreter.inter.myDsl.MyDslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expbg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expbg</em>' containment reference.
   * @see #setExpbg(ExprBase)
   * @see paramInterpreter.inter.myDsl.MyDslPackage#getExpression_Expbg()
   * @model containment="true"
   * @generated
   */
  ExprBase getExpbg();

  /**
   * Sets the value of the '{@link paramInterpreter.inter.myDsl.Expression#getExpbg <em>Expbg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expbg</em>' containment reference.
   * @see #getExpbg()
   * @generated
   */
  void setExpbg(ExprBase value);

  /**
   * Returns the value of the '<em><b>Expbd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expbd</em>' containment reference.
   * @see #setExpbd(ExprBase)
   * @see paramInterpreter.inter.myDsl.MyDslPackage#getExpression_Expbd()
   * @model containment="true"
   * @generated
   */
  ExprBase getExpbd();

  /**
   * Sets the value of the '{@link paramInterpreter.inter.myDsl.Expression#getExpbd <em>Expbd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expbd</em>' containment reference.
   * @see #getExpbd()
   * @generated
   */
  void setExpbd(ExprBase value);

} // Expression
