/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.ComponentDefinition;
import org.deg.xtext.gui.guiDSL.Definition;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.DefinitionImpl#getConcreteDefition <em>Concrete Defition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getConcreteDefition() <em>Concrete Defition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteDefition()
   * @generated
   * @ordered
   */
  protected ComponentDefinition concreteDefition;

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
    return GuiDSLPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition getConcreteDefition()
  {
    return concreteDefition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcreteDefition(ComponentDefinition newConcreteDefition, NotificationChain msgs)
  {
    ComponentDefinition oldConcreteDefition = concreteDefition;
    concreteDefition = newConcreteDefition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.DEFINITION__CONCRETE_DEFITION, oldConcreteDefition, newConcreteDefition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteDefition(ComponentDefinition newConcreteDefition)
  {
    if (newConcreteDefition != concreteDefition)
    {
      NotificationChain msgs = null;
      if (concreteDefition != null)
        msgs = ((InternalEObject)concreteDefition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.DEFINITION__CONCRETE_DEFITION, null, msgs);
      if (newConcreteDefition != null)
        msgs = ((InternalEObject)newConcreteDefition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.DEFINITION__CONCRETE_DEFITION, null, msgs);
      msgs = basicSetConcreteDefition(newConcreteDefition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.DEFINITION__CONCRETE_DEFITION, newConcreteDefition, newConcreteDefition));
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
      case GuiDSLPackage.DEFINITION__CONCRETE_DEFITION:
        return basicSetConcreteDefition(null, msgs);
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
      case GuiDSLPackage.DEFINITION__CONCRETE_DEFITION:
        return getConcreteDefition();
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
      case GuiDSLPackage.DEFINITION__CONCRETE_DEFITION:
        setConcreteDefition((ComponentDefinition)newValue);
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
      case GuiDSLPackage.DEFINITION__CONCRETE_DEFITION:
        setConcreteDefition((ComponentDefinition)null);
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
      case GuiDSLPackage.DEFINITION__CONCRETE_DEFITION:
        return concreteDefition != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
