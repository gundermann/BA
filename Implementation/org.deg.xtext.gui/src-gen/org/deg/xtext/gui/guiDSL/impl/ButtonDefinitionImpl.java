/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import java.util.Collection;

import org.deg.xtext.gui.guiDSL.ButtonDefinition;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl#getPropertyKey <em>Property Key</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl#getInteractiontype <em>Interactiontype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonDefinitionImpl extends ComponentDefinitionImpl implements ButtonDefinition
{
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
   * The cached value of the '{@link #getInteractiontype() <em>Interactiontype</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractiontype()
   * @generated
   * @ordered
   */
  protected EList<String> interactiontype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonDefinitionImpl()
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
    return GuiDSLPackage.Literals.BUTTON_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.BUTTON_DEFINITION__PROPERTY_KEY, oldPropertyKey, propertyKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInteractiontype()
  {
    if (interactiontype == null)
    {
      interactiontype = new EDataTypeEList<String>(String.class, this, GuiDSLPackage.BUTTON_DEFINITION__INTERACTIONTYPE);
    }
    return interactiontype;
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
      case GuiDSLPackage.BUTTON_DEFINITION__PROPERTY_KEY:
        return getPropertyKey();
      case GuiDSLPackage.BUTTON_DEFINITION__INTERACTIONTYPE:
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
      case GuiDSLPackage.BUTTON_DEFINITION__PROPERTY_KEY:
        setPropertyKey((String)newValue);
        return;
      case GuiDSLPackage.BUTTON_DEFINITION__INTERACTIONTYPE:
        getInteractiontype().clear();
        getInteractiontype().addAll((Collection<? extends String>)newValue);
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
      case GuiDSLPackage.BUTTON_DEFINITION__PROPERTY_KEY:
        setPropertyKey(PROPERTY_KEY_EDEFAULT);
        return;
      case GuiDSLPackage.BUTTON_DEFINITION__INTERACTIONTYPE:
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
      case GuiDSLPackage.BUTTON_DEFINITION__PROPERTY_KEY:
        return PROPERTY_KEY_EDEFAULT == null ? propertyKey != null : !PROPERTY_KEY_EDEFAULT.equals(propertyKey);
      case GuiDSLPackage.BUTTON_DEFINITION__INTERACTIONTYPE:
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
    result.append(" (propertyKey: ");
    result.append(propertyKey);
    result.append(", interactiontype: ");
    result.append(interactiontype);
    result.append(')');
    return result.toString();
  }

} //ButtonDefinitionImpl
