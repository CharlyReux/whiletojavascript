/**
 * generated by Xtext 2.25.0
 */
package pret.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pret.myDsl.EBtl;
import pret.myDsl.ExprBase;
import pret.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBtl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.impl.EBtlImpl#getExpb <em>Expb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBtlImpl extends MinimalEObjectImpl.Container implements EBtl
{
  /**
   * The cached value of the '{@link #getExpb() <em>Expb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpb()
   * @generated
   * @ordered
   */
  protected ExprBase expb;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EBtlImpl()
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
    return MyDslPackage.Literals.EBTL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprBase getExpb()
  {
    return expb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpb(ExprBase newExpb, NotificationChain msgs)
  {
    ExprBase oldExpb = expb;
    expb = newExpb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EBTL__EXPB, oldExpb, newExpb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpb(ExprBase newExpb)
  {
    if (newExpb != expb)
    {
      NotificationChain msgs = null;
      if (expb != null)
        msgs = ((InternalEObject)expb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EBTL__EXPB, null, msgs);
      if (newExpb != null)
        msgs = ((InternalEObject)newExpb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EBTL__EXPB, null, msgs);
      msgs = basicSetExpb(newExpb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EBTL__EXPB, newExpb, newExpb));
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
      case MyDslPackage.EBTL__EXPB:
        return basicSetExpb(null, msgs);
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
      case MyDslPackage.EBTL__EXPB:
        return getExpb();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.EBTL__EXPB:
        setExpb((ExprBase)newValue);
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
      case MyDslPackage.EBTL__EXPB:
        setExpb((ExprBase)null);
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
      case MyDslPackage.EBTL__EXPB:
        return expb != null;
    }
    return super.eIsSet(featureID);
  }

} //EBtlImpl
