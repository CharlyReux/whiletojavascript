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
import pret.myDsl.Definition;
import pret.myDsl.Input;
import pret.myDsl.MyDslPackage;
import pret.myDsl.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.impl.DefinitionImpl#getDefInput <em>Def Input</em>}</li>
 *   <li>{@link pret.myDsl.impl.DefinitionImpl#getDefCommands <em>Def Commands</em>}</li>
 *   <li>{@link pret.myDsl.impl.DefinitionImpl#getDefOutput <em>Def Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getDefInput() <em>Def Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefInput()
   * @generated
   * @ordered
   */
  protected Input defInput;

  /**
   * The cached value of the '{@link #getDefCommands() <em>Def Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefCommands()
   * @generated
   * @ordered
   */
  protected Commands defCommands;

  /**
   * The cached value of the '{@link #getDefOutput() <em>Def Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefOutput()
   * @generated
   * @ordered
   */
  protected Output defOutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return MyDslPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Input getDefInput()
  {
    return defInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefInput(Input newDefInput, NotificationChain msgs)
  {
    Input oldDefInput = defInput;
    defInput = newDefInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITION__DEF_INPUT, oldDefInput, newDefInput);
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
  public void setDefInput(Input newDefInput)
  {
    if (newDefInput != defInput)
    {
      NotificationChain msgs = null;
      if (defInput != null)
        msgs = ((InternalEObject)defInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITION__DEF_INPUT, null, msgs);
      if (newDefInput != null)
        msgs = ((InternalEObject)newDefInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITION__DEF_INPUT, null, msgs);
      msgs = basicSetDefInput(newDefInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITION__DEF_INPUT, newDefInput, newDefInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Commands getDefCommands()
  {
    return defCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefCommands(Commands newDefCommands, NotificationChain msgs)
  {
    Commands oldDefCommands = defCommands;
    defCommands = newDefCommands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITION__DEF_COMMANDS, oldDefCommands, newDefCommands);
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
  public void setDefCommands(Commands newDefCommands)
  {
    if (newDefCommands != defCommands)
    {
      NotificationChain msgs = null;
      if (defCommands != null)
        msgs = ((InternalEObject)defCommands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITION__DEF_COMMANDS, null, msgs);
      if (newDefCommands != null)
        msgs = ((InternalEObject)newDefCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITION__DEF_COMMANDS, null, msgs);
      msgs = basicSetDefCommands(newDefCommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITION__DEF_COMMANDS, newDefCommands, newDefCommands));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output getDefOutput()
  {
    return defOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefOutput(Output newDefOutput, NotificationChain msgs)
  {
    Output oldDefOutput = defOutput;
    defOutput = newDefOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITION__DEF_OUTPUT, oldDefOutput, newDefOutput);
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
  public void setDefOutput(Output newDefOutput)
  {
    if (newDefOutput != defOutput)
    {
      NotificationChain msgs = null;
      if (defOutput != null)
        msgs = ((InternalEObject)defOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITION__DEF_OUTPUT, null, msgs);
      if (newDefOutput != null)
        msgs = ((InternalEObject)newDefOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DEFINITION__DEF_OUTPUT, null, msgs);
      msgs = basicSetDefOutput(newDefOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DEFINITION__DEF_OUTPUT, newDefOutput, newDefOutput));
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
      case MyDslPackage.DEFINITION__DEF_INPUT:
        return basicSetDefInput(null, msgs);
      case MyDslPackage.DEFINITION__DEF_COMMANDS:
        return basicSetDefCommands(null, msgs);
      case MyDslPackage.DEFINITION__DEF_OUTPUT:
        return basicSetDefOutput(null, msgs);
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
      case MyDslPackage.DEFINITION__DEF_INPUT:
        return getDefInput();
      case MyDslPackage.DEFINITION__DEF_COMMANDS:
        return getDefCommands();
      case MyDslPackage.DEFINITION__DEF_OUTPUT:
        return getDefOutput();
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
      case MyDslPackage.DEFINITION__DEF_INPUT:
        setDefInput((Input)newValue);
        return;
      case MyDslPackage.DEFINITION__DEF_COMMANDS:
        setDefCommands((Commands)newValue);
        return;
      case MyDslPackage.DEFINITION__DEF_OUTPUT:
        setDefOutput((Output)newValue);
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
      case MyDslPackage.DEFINITION__DEF_INPUT:
        setDefInput((Input)null);
        return;
      case MyDslPackage.DEFINITION__DEF_COMMANDS:
        setDefCommands((Commands)null);
        return;
      case MyDslPackage.DEFINITION__DEF_OUTPUT:
        setDefOutput((Output)null);
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
      case MyDslPackage.DEFINITION__DEF_INPUT:
        return defInput != null;
      case MyDslPackage.DEFINITION__DEF_COMMANDS:
        return defCommands != null;
      case MyDslPackage.DEFINITION__DEF_OUTPUT:
        return defOutput != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
