/**
 * generated by Xtext 2.25.0
 */
package pret.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBcons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.EBcons#getLexpb <em>Lexpb</em>}</li>
 * </ul>
 *
 * @see pret.myDsl.MyDslPackage#getEBcons()
 * @model
 * @generated
 */
public interface EBcons extends EObject
{
  /**
   * Returns the value of the '<em><b>Lexpb</b></em>' containment reference list.
   * The list contents are of type {@link pret.myDsl.ExprBase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lexpb</em>' containment reference list.
   * @see pret.myDsl.MyDslPackage#getEBcons_Lexpb()
   * @model containment="true"
   * @generated
   */
  EList<ExprBase> getLexpb();

} // EBcons