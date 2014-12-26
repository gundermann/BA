/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Multiselection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiselection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl#getDescriptionName <em>Description Name</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiselectionImpl extends ComplexComponentImpl implements Multiselection
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
   * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected static final String INPUT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected String inputType = INPUT_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiselectionImpl()
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
    return GuiDSLPackage.Literals.MULTISELECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.MULTISELECTION__DESCRIPTION_NAME, oldDescriptionName, descriptionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInputType()
  {
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputType(String newInputType)
  {
    String oldInputType = inputType;
    inputType = newInputType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.MULTISELECTION__INPUT_TYPE, oldInputType, inputType));
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
      case GuiDSLPackage.MULTISELECTION__DESCRIPTION_NAME:
        return getDescriptionName();
      case GuiDSLPackage.MULTISELECTION__INPUT_TYPE:
        return getInputType();
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
      case GuiDSLPackage.MULTISELECTION__DESCRIPTION_NAME:
        setDescriptionName((String)newValue);
        return;
      case GuiDSLPackage.MULTISELECTION__INPUT_TYPE:
        setInputType((String)newValue);
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
      case GuiDSLPackage.MULTISELECTION__DESCRIPTION_NAME:
        setDescriptionName(DESCRIPTION_NAME_EDEFAULT);
        return;
      case GuiDSLPackage.MULTISELECTION__INPUT_TYPE:
        setInputType(INPUT_TYPE_EDEFAULT);
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
      case GuiDSLPackage.MULTISELECTION__DESCRIPTION_NAME:
        return DESCRIPTION_NAME_EDEFAULT == null ? descriptionName != null : !DESCRIPTION_NAME_EDEFAULT.equals(descriptionName);
      case GuiDSLPackage.MULTISELECTION__INPUT_TYPE:
        return INPUT_TYPE_EDEFAULT == null ? inputType != null : !INPUT_TYPE_EDEFAULT.equals(inputType);
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
    result.append(", inputType: ");
    result.append(inputType);
    result.append(')');
    return result.toString();
  }

} //MultiselectionImpl
