/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import java.util.Collection;

import org.deg.xtext.gui.guiDSL.CommonProperties;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Interactiontype;

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
 * An implementation of the model object '<em><b>Common Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl#getPropertyKey <em>Property Key</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl#getLayoutKey <em>Layout Key</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl#getInteractiontype <em>Interactiontype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonPropertiesImpl extends MinimalEObjectImpl.Container implements CommonProperties
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
   * The default value of the '{@link #getPropertyKey() <em>Property Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyKey()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyKey() <em>Property Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyKey()
   * @generated
   * @ordered
   */
  protected String propertyKey = PROPERTY_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getLayoutKey() <em>Layout Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutKey()
   * @generated
   * @ordered
   */
  protected static final String LAYOUT_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLayoutKey() <em>Layout Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutKey()
   * @generated
   * @ordered
   */
  protected String layoutKey = LAYOUT_KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getInteractiontype() <em>Interactiontype</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractiontype()
   * @generated
   * @ordered
   */
  protected EList<Interactiontype> interactiontype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommonPropertiesImpl()
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
    return GuiDSLPackage.Literals.COMMON_PROPERTIES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.COMMON_PROPERTIES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyKey()
  {
    return propertyKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyKey(String newPropertyKey)
  {
    String oldPropertyKey = propertyKey;
    propertyKey = newPropertyKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.COMMON_PROPERTIES__PROPERTY_KEY, oldPropertyKey, propertyKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLayoutKey()
  {
    return layoutKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutKey(String newLayoutKey)
  {
    String oldLayoutKey = layoutKey;
    layoutKey = newLayoutKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.COMMON_PROPERTIES__LAYOUT_KEY, oldLayoutKey, layoutKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interactiontype> getInteractiontype()
  {
    if (interactiontype == null)
    {
      interactiontype = new EObjectContainmentEList<Interactiontype>(Interactiontype.class, this, GuiDSLPackage.COMMON_PROPERTIES__INTERACTIONTYPE);
    }
    return interactiontype;
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
      case GuiDSLPackage.COMMON_PROPERTIES__INTERACTIONTYPE:
        return ((InternalEList<?>)getInteractiontype()).basicRemove(otherEnd, msgs);
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
      case GuiDSLPackage.COMMON_PROPERTIES__NAME:
        return getName();
      case GuiDSLPackage.COMMON_PROPERTIES__PROPERTY_KEY:
        return getPropertyKey();
      case GuiDSLPackage.COMMON_PROPERTIES__LAYOUT_KEY:
        return getLayoutKey();
      case GuiDSLPackage.COMMON_PROPERTIES__INTERACTIONTYPE:
        return getInteractiontype();
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
      case GuiDSLPackage.COMMON_PROPERTIES__NAME:
        setName((String)newValue);
        return;
      case GuiDSLPackage.COMMON_PROPERTIES__PROPERTY_KEY:
        setPropertyKey((String)newValue);
        return;
      case GuiDSLPackage.COMMON_PROPERTIES__LAYOUT_KEY:
        setLayoutKey((String)newValue);
        return;
      case GuiDSLPackage.COMMON_PROPERTIES__INTERACTIONTYPE:
        getInteractiontype().clear();
        getInteractiontype().addAll((Collection<? extends Interactiontype>)newValue);
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
      case GuiDSLPackage.COMMON_PROPERTIES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GuiDSLPackage.COMMON_PROPERTIES__PROPERTY_KEY:
        setPropertyKey(PROPERTY_KEY_EDEFAULT);
        return;
      case GuiDSLPackage.COMMON_PROPERTIES__LAYOUT_KEY:
        setLayoutKey(LAYOUT_KEY_EDEFAULT);
        return;
      case GuiDSLPackage.COMMON_PROPERTIES__INTERACTIONTYPE:
        getInteractiontype().clear();
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
      case GuiDSLPackage.COMMON_PROPERTIES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GuiDSLPackage.COMMON_PROPERTIES__PROPERTY_KEY:
        return PROPERTY_KEY_EDEFAULT == null ? propertyKey != null : !PROPERTY_KEY_EDEFAULT.equals(propertyKey);
      case GuiDSLPackage.COMMON_PROPERTIES__LAYOUT_KEY:
        return LAYOUT_KEY_EDEFAULT == null ? layoutKey != null : !LAYOUT_KEY_EDEFAULT.equals(layoutKey);
      case GuiDSLPackage.COMMON_PROPERTIES__INTERACTIONTYPE:
        return interactiontype != null && !interactiontype.isEmpty();
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
    result.append(", propertyKey: ");
    result.append(propertyKey);
    result.append(", layoutKey: ");
    result.append(layoutKey);
    result.append(')');
    return result.toString();
  }

} //CommonPropertiesImpl
