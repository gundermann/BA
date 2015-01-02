/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.UIDescriptionImport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Description Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl#getDescriptionName <em>Description Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIDescriptionImportImpl extends DescriptionTypeImpl implements UIDescriptionImport
{
  /**
   * The default value of the '{@link #getDescriptionName() <em>Description Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionName()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescriptionName() <em>Description Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionName()
   * @generated
   * @ordered
   */
  protected String descriptionName = DESCRIPTION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UIDescriptionImportImpl()
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
    return GuiDSLPackage.Literals.UI_DESCRIPTION_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescriptionName()
  {
    return descriptionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescriptionName(String newDescriptionName)
  {
    String oldDescriptionName = descriptionName;
    descriptionName = newDescriptionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME, oldDescriptionName, descriptionName));
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME:
        return getDescriptionName();
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME:
        setDescriptionName((String)newValue);
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME:
        setDescriptionName(DESCRIPTION_NAME_EDEFAULT);
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME:
        return DESCRIPTION_NAME_EDEFAULT == null ? descriptionName != null : !DESCRIPTION_NAME_EDEFAULT.equals(descriptionName);
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
    result.append(" (descriptionName: ");
    result.append(descriptionName);
    result.append(')');
    return result.toString();
  }

} //UIDescriptionImportImpl
