/**
 * generated by Xtext 2.25.0
 */
package pret.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.Output#getVao <em>Vao</em>}</li>
 * </ul>
 *
 * @see pret.myDsl.MyDslPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject
{
  /**
   * Returns the value of the '<em><b>Vao</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vao</em>' attribute list.
   * @see pret.myDsl.MyDslPackage#getOutput_Vao()
   * @model unique="false"
   * @generated
   */
  EList<String> getVao();

} // Output
