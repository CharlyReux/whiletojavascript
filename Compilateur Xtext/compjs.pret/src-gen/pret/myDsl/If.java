/**
 * generated by Xtext 2.25.0
 */
package pret.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.If#getIfexp <em>Ifexp</em>}</li>
 *   <li>{@link pret.myDsl.If#getIflc <em>Iflc</em>}</li>
 *   <li>{@link pret.myDsl.If#getEllc <em>Ellc</em>}</li>
 * </ul>
 *
 * @see pret.myDsl.MyDslPackage#getIf()
 * @model
 * @generated
 */
public interface If extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifexp</em>' containment reference.
   * @see #setIfexp(Expression)
   * @see pret.myDsl.MyDslPackage#getIf_Ifexp()
   * @model containment="true"
   * @generated
   */
  Expression getIfexp();

  /**
   * Sets the value of the '{@link pret.myDsl.If#getIfexp <em>Ifexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifexp</em>' containment reference.
   * @see #getIfexp()
   * @generated
   */
  void setIfexp(Expression value);

  /**
   * Returns the value of the '<em><b>Iflc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iflc</em>' containment reference.
   * @see #setIflc(Commands)
   * @see pret.myDsl.MyDslPackage#getIf_Iflc()
   * @model containment="true"
   * @generated
   */
  Commands getIflc();

  /**
   * Sets the value of the '{@link pret.myDsl.If#getIflc <em>Iflc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iflc</em>' containment reference.
   * @see #getIflc()
   * @generated
   */
  void setIflc(Commands value);

  /**
   * Returns the value of the '<em><b>Ellc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ellc</em>' containment reference.
   * @see #setEllc(Commands)
   * @see pret.myDsl.MyDslPackage#getIf_Ellc()
   * @model containment="true"
   * @generated
   */
  Commands getEllc();

  /**
   * Sets the value of the '{@link pret.myDsl.If#getEllc <em>Ellc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ellc</em>' containment reference.
   * @see #getEllc()
   * @generated
   */
  void setEllc(Commands value);

} // If
