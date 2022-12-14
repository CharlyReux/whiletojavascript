/**
 * generated by Xtext 2.25.0
 */
package paramInterpreter.inter.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import paramInterpreter.inter.myDsl.Expression;
import paramInterpreter.inter.myDsl.Exprs;
import paramInterpreter.inter.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paramInterpreter.inter.myDsl.impl.ExprsImpl#getLexpr <em>Lexpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprsImpl extends MinimalEObjectImpl.Container implements Exprs
{
  /**
   * The cached value of the '{@link #getLexpr() <em>Lexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexpr()
   * @generated
   * @ordered
   */
  protected Expression lexpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprsImpl()
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
    return MyDslPackage.Literals.EXPRS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLexpr()
  {
    return lexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLexpr(Expression newLexpr, NotificationChain msgs)
  {
    Expression oldLexpr = lexpr;
    lexpr = newLexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__LEXPR, oldLexpr, newLexpr);
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
  public void setLexpr(Expression newLexpr)
  {
    if (newLexpr != lexpr)
    {
      NotificationChain msgs = null;
      if (lexpr != null)
        msgs = ((InternalEObject)lexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__LEXPR, null, msgs);
      if (newLexpr != null)
        msgs = ((InternalEObject)newLexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__LEXPR, null, msgs);
      msgs = basicSetLexpr(newLexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__LEXPR, newLexpr, newLexpr));
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
      case MyDslPackage.EXPRS__LEXPR:
        return basicSetLexpr(null, msgs);
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
      case MyDslPackage.EXPRS__LEXPR:
        return getLexpr();
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
      case MyDslPackage.EXPRS__LEXPR:
        setLexpr((Expression)newValue);
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
      case MyDslPackage.EXPRS__LEXPR:
        setLexpr((Expression)null);
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
      case MyDslPackage.EXPRS__LEXPR:
        return lexpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprsImpl
