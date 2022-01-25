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

import pret.myDsl.Commands;
import pret.myDsl.Expression;
import pret.myDsl.Foreach;
import pret.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.impl.ForeachImpl#getForevar <em>Forevar</em>}</li>
 *   <li>{@link pret.myDsl.impl.ForeachImpl#getForeexp <em>Foreexp</em>}</li>
 *   <li>{@link pret.myDsl.impl.ForeachImpl#getForecom <em>Forecom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachImpl extends MinimalEObjectImpl.Container implements Foreach
{
  /**
   * The default value of the '{@link #getForevar() <em>Forevar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForevar()
   * @generated
   * @ordered
   */
  protected static final String FOREVAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForevar() <em>Forevar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForevar()
   * @generated
   * @ordered
   */
  protected String forevar = FOREVAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getForeexp() <em>Foreexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeexp()
   * @generated
   * @ordered
   */
  protected Expression foreexp;

  /**
   * The cached value of the '{@link #getForecom() <em>Forecom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForecom()
   * @generated
   * @ordered
   */
  protected Commands forecom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeachImpl()
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
    return MyDslPackage.Literals.FOREACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getForevar()
  {
    return forevar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForevar(String newForevar)
  {
    String oldForevar = forevar;
    forevar = newForevar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__FOREVAR, oldForevar, forevar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getForeexp()
  {
    return foreexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeexp(Expression newForeexp, NotificationChain msgs)
  {
    Expression oldForeexp = foreexp;
    foreexp = newForeexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__FOREEXP, oldForeexp, newForeexp);
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
  public void setForeexp(Expression newForeexp)
  {
    if (newForeexp != foreexp)
    {
      NotificationChain msgs = null;
      if (foreexp != null)
        msgs = ((InternalEObject)foreexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__FOREEXP, null, msgs);
      if (newForeexp != null)
        msgs = ((InternalEObject)newForeexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__FOREEXP, null, msgs);
      msgs = basicSetForeexp(newForeexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__FOREEXP, newForeexp, newForeexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Commands getForecom()
  {
    return forecom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForecom(Commands newForecom, NotificationChain msgs)
  {
    Commands oldForecom = forecom;
    forecom = newForecom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__FORECOM, oldForecom, newForecom);
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
  public void setForecom(Commands newForecom)
  {
    if (newForecom != forecom)
    {
      NotificationChain msgs = null;
      if (forecom != null)
        msgs = ((InternalEObject)forecom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__FORECOM, null, msgs);
      if (newForecom != null)
        msgs = ((InternalEObject)newForecom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__FORECOM, null, msgs);
      msgs = basicSetForecom(newForecom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__FORECOM, newForecom, newForecom));
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
      case MyDslPackage.FOREACH__FOREEXP:
        return basicSetForeexp(null, msgs);
      case MyDslPackage.FOREACH__FORECOM:
        return basicSetForecom(null, msgs);
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
      case MyDslPackage.FOREACH__FOREVAR:
        return getForevar();
      case MyDslPackage.FOREACH__FOREEXP:
        return getForeexp();
      case MyDslPackage.FOREACH__FORECOM:
        return getForecom();
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
      case MyDslPackage.FOREACH__FOREVAR:
        setForevar((String)newValue);
        return;
      case MyDslPackage.FOREACH__FOREEXP:
        setForeexp((Expression)newValue);
        return;
      case MyDslPackage.FOREACH__FORECOM:
        setForecom((Commands)newValue);
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
      case MyDslPackage.FOREACH__FOREVAR:
        setForevar(FOREVAR_EDEFAULT);
        return;
      case MyDslPackage.FOREACH__FOREEXP:
        setForeexp((Expression)null);
        return;
      case MyDslPackage.FOREACH__FORECOM:
        setForecom((Commands)null);
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
      case MyDslPackage.FOREACH__FOREVAR:
        return FOREVAR_EDEFAULT == null ? forevar != null : !FOREVAR_EDEFAULT.equals(forevar);
      case MyDslPackage.FOREACH__FOREEXP:
        return foreexp != null;
      case MyDslPackage.FOREACH__FORECOM:
        return forecom != null;
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
    result.append(" (forevar: ");
    result.append(forevar);
    result.append(')');
    return result.toString();
  }

} //ForeachImpl