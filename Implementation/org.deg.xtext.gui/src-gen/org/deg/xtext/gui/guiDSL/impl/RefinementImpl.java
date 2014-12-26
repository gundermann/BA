/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.ComponentRefinement;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Refinement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.RefinementImpl#getConcreteRefinement <em>Concrete Refinement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinementImpl extends MinimalEObjectImpl.Container implements Refinement
{
  /**
   * The cached value of the '{@link #getConcreteRefinement() <em>Concrete Refinement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteRefinement()
   * @generated
   * @ordered
   */
  protected ComponentRefinement concreteRefinement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefinementImpl()
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
    return GuiDSLPackage.Literals.REFINEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRefinement getConcreteRefinement()
  {
    return concreteRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcreteRefinement(ComponentRefinement newConcreteRefinement, NotificationChain msgs)
  {
    ComponentRefinement oldConcreteRefinement = concreteRefinement;
    concreteRefinement = newConcreteRefinement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT, oldConcreteRefinement, newConcreteRefinement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteRefinement(ComponentRefinement newConcreteRefinement)
  {
    if (newConcreteRefinement != concreteRefinement)
    {
      NotificationChain msgs = null;
      if (concreteRefinement != null)
        msgs = ((InternalEObject)concreteRefinement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT, null, msgs);
      if (newConcreteRefinement != null)
        msgs = ((InternalEObject)newConcreteRefinement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT, null, msgs);
      msgs = basicSetConcreteRefinement(newConcreteRefinement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT, newConcreteRefinement, newConcreteRefinement));
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
      case GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT:
        return basicSetConcreteRefinement(null, msgs);
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
      case GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT:
        return getConcreteRefinement();
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
      case GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT:
        setConcreteRefinement((ComponentRefinement)newValue);
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
      case GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT:
        setConcreteRefinement((ComponentRefinement)null);
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
      case GuiDSLPackage.REFINEMENT__CONCRETE_REFINEMENT:
        return concreteRefinement != null;
    }
    return super.eIsSet(featureID);
  }

} //RefinementImpl
