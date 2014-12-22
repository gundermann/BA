/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.MultiSelectionDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Selection Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.MultiSelectionDefinitionImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.MultiSelectionDefinitionImpl#getSelectableValuesLocation <em>Selectable Values Location</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.MultiSelectionDefinitionImpl#getSelectedValuesLocation <em>Selected Values Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiSelectionDefinitionImpl extends ComponentDefinitionImpl implements MultiSelectionDefinition
{
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
   * The default value of the '{@link #getSelectableValuesLocation() <em>Selectable Values Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectableValuesLocation()
   * @generated
   * @ordered
   */
  protected static final String SELECTABLE_VALUES_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelectableValuesLocation() <em>Selectable Values Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectableValuesLocation()
   * @generated
   * @ordered
   */
  protected String selectableValuesLocation = SELECTABLE_VALUES_LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getSelectedValuesLocation() <em>Selected Values Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedValuesLocation()
   * @generated
   * @ordered
   */
  protected static final String SELECTED_VALUES_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelectedValuesLocation() <em>Selected Values Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedValuesLocation()
   * @generated
   * @ordered
   */
  protected String selectedValuesLocation = SELECTED_VALUES_LOCATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiSelectionDefinitionImpl()
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
    return GuiDSLPackage.Literals.MULTI_SELECTION_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.MULTI_SELECTION_DEFINITION__INPUT_TYPE, oldInputType, inputType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelectableValuesLocation()
  {
    return selectableValuesLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectableValuesLocation(String newSelectableValuesLocation)
  {
    String oldSelectableValuesLocation = selectableValuesLocation;
    selectableValuesLocation = newSelectableValuesLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTABLE_VALUES_LOCATION, oldSelectableValuesLocation, selectableValuesLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelectedValuesLocation()
  {
    return selectedValuesLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectedValuesLocation(String newSelectedValuesLocation)
  {
    String oldSelectedValuesLocation = selectedValuesLocation;
    selectedValuesLocation = newSelectedValuesLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTED_VALUES_LOCATION, oldSelectedValuesLocation, selectedValuesLocation));
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
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__INPUT_TYPE:
        return getInputType();
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTABLE_VALUES_LOCATION:
        return getSelectableValuesLocation();
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTED_VALUES_LOCATION:
        return getSelectedValuesLocation();
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
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__INPUT_TYPE:
        setInputType((String)newValue);
        return;
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTABLE_VALUES_LOCATION:
        setSelectableValuesLocation((String)newValue);
        return;
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTED_VALUES_LOCATION:
        setSelectedValuesLocation((String)newValue);
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
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__INPUT_TYPE:
        setInputType(INPUT_TYPE_EDEFAULT);
        return;
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTABLE_VALUES_LOCATION:
        setSelectableValuesLocation(SELECTABLE_VALUES_LOCATION_EDEFAULT);
        return;
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTED_VALUES_LOCATION:
        setSelectedValuesLocation(SELECTED_VALUES_LOCATION_EDEFAULT);
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
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__INPUT_TYPE:
        return INPUT_TYPE_EDEFAULT == null ? inputType != null : !INPUT_TYPE_EDEFAULT.equals(inputType);
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTABLE_VALUES_LOCATION:
        return SELECTABLE_VALUES_LOCATION_EDEFAULT == null ? selectableValuesLocation != null : !SELECTABLE_VALUES_LOCATION_EDEFAULT.equals(selectableValuesLocation);
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION__SELECTED_VALUES_LOCATION:
        return SELECTED_VALUES_LOCATION_EDEFAULT == null ? selectedValuesLocation != null : !SELECTED_VALUES_LOCATION_EDEFAULT.equals(selectedValuesLocation);
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
    result.append(" (inputType: ");
    result.append(inputType);
    result.append(", selectableValuesLocation: ");
    result.append(selectableValuesLocation);
    result.append(", selectedValuesLocation: ");
    result.append(selectedValuesLocation);
    result.append(')');
    return result.toString();
  }

} //MultiSelectionDefinitionImpl
