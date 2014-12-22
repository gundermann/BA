/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.UIDescriptionImport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Description Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl#getDescriptionName <em>Description Name</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl#getLocalName <em>Local Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIDescriptionImportImpl extends MinimalEObjectImpl.Container implements UIDescriptionImport
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
   * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalName()
   * @generated
   * @ordered
   */
  protected static final String LOCAL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalName()
   * @generated
   * @ordered
   */
  protected String localName = LOCAL_NAME_EDEFAULT;

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
  public String getLocalName()
  {
    return localName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalName(String newLocalName)
  {
    String oldLocalName = localName;
    localName = newLocalName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION_IMPORT__LOCAL_NAME, oldLocalName, localName));
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__LOCAL_NAME:
        return getLocalName();
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__LOCAL_NAME:
        setLocalName((String)newValue);
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__LOCAL_NAME:
        setLocalName(LOCAL_NAME_EDEFAULT);
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
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT__LOCAL_NAME:
        return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
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
    result.append(", localName: ");
    result.append(localName);
    result.append(')');
    return result.toString();
  }

} //UIDescriptionImportImpl
