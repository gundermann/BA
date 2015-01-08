/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import java.util.Collection;

import org.deg.xtext.gui.guiDSL.Element;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Structure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.StructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.StructureImpl#getOrderedElements <em>Ordered Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureImpl extends MinimalEObjectImpl.Container implements Structure
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrderedElements() <em>Ordered Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderedElements()
   * @generated
   * @ordered
   */
  protected EList<Element> orderedElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureImpl()
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
    return GuiDSLPackage.Literals.STRUCTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.STRUCTURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getOrderedElements()
  {
    if (orderedElements == null)
    {
      orderedElements = new EObjectContainmentEList<Element>(Element.class, this, GuiDSLPackage.STRUCTURE__ORDERED_ELEMENTS);
    }
    return orderedElements;
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
      case GuiDSLPackage.STRUCTURE__ORDERED_ELEMENTS:
        return ((InternalEList<?>)getOrderedElements()).basicRemove(otherEnd, msgs);
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
      case GuiDSLPackage.STRUCTURE__NAME:
        return getName();
      case GuiDSLPackage.STRUCTURE__ORDERED_ELEMENTS:
        return getOrderedElements();
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
      case GuiDSLPackage.STRUCTURE__NAME:
        setName((String)newValue);
        return;
      case GuiDSLPackage.STRUCTURE__ORDERED_ELEMENTS:
        getOrderedElements().clear();
        getOrderedElements().addAll((Collection<? extends Element>)newValue);
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
      case GuiDSLPackage.STRUCTURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GuiDSLPackage.STRUCTURE__ORDERED_ELEMENTS:
        getOrderedElements().clear();
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
      case GuiDSLPackage.STRUCTURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GuiDSLPackage.STRUCTURE__ORDERED_ELEMENTS:
        return orderedElements != null && !orderedElements.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StructureImpl
