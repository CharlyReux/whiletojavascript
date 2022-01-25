/**
 * generated by Xtext 2.25.0
 */
package paramInterpreter.inter.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import paramInterpreter.inter.myDsl.EBsy;
import paramInterpreter.inter.myDsl.ExprBase;
import paramInterpreter.inter.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBsy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paramInterpreter.inter.myDsl.impl.EBsyImpl#getSy <em>Sy</em>}</li>
 *   <li>{@link paramInterpreter.inter.myDsl.impl.EBsyImpl#getLexpb <em>Lexpb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBsyImpl extends MinimalEObjectImpl.Container implements EBsy
{
  /**
   * The default value of the '{@link #getSy() <em>Sy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSy()
   * @generated
   * @ordered
   */
  protected static final String SY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSy() <em>Sy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSy()
   * @generated
   * @ordered
   */
  protected String sy = SY_EDEFAULT;

  /**
   * The cached value of the '{@link #getLexpb() <em>Lexpb</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexpb()
   * @generated
   * @ordered
   */
  protected EList<ExprBase> lexpb;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EBsyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.EBSY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSy()
  {
    return sy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSy(String newSy)
  {
    String oldSy = sy;
    sy = newSy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EBSY__SY, oldSy, sy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExprBase> getLexpb()
  {
    if (lexpb == null)
    {
      lexpb = new EObjectContainmentEList<ExprBase>(ExprBase.class, this, MyDslPackage.EBSY__LEXPB);
    }
    return lexpb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.EBSY__LEXPB:
        return ((InternalEList<?>)getLexpb()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.EBSY__SY:
        return getSy();
      case MyDslPackage.EBSY__LEXPB:
        return getLexpb();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.EBSY__SY:
        setSy((String)newValue);
        return;
      case MyDslPackage.EBSY__LEXPB:
        getLexpb().clear();
        getLexpb().addAll((Collection<? extends ExprBase>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.EBSY__SY:
        setSy(SY_EDEFAULT);
        return;
      case MyDslPackage.EBSY__LEXPB:
        getLexpb().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.EBSY__SY:
        return SY_EDEFAULT == null ? sy != null : !SY_EDEFAULT.equals(sy);
      case MyDslPackage.EBSY__LEXPB:
        return lexpb != null && !lexpb.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (sy: ");
    result.append(sy);
    result.append(')');
    return result.toString();
  }

} //EBsyImpl
