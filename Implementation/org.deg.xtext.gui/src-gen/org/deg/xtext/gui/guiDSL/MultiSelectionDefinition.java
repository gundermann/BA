/**
 */
package org.deg.xtext.gui.guiDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Selection Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.MultiSelectionDefinition#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.MultiSelectionDefinition#getSelectableValuesLocation <em>Selectable Values Location</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.MultiSelectionDefinition#getSelectedValuesLocation <em>Selected Values Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getMultiSelectionDefinition()
 * @model
 * @generated
 */
public interface MultiSelectionDefinition extends ComponentDefinition
{
  /**
   * Returns the value of the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Type</em>' attribute.
   * @see #setInputType(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getMultiSelectionDefinition_InputType()
   * @model
   * @generated
   */
  String getInputType();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.MultiSelectionDefinition#getInputType <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' attribute.
   * @see #getInputType()
   * @generated
   */
  void setInputType(String value);

  /**
   * Returns the value of the '<em><b>Selectable Values Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectable Values Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectable Values Location</em>' attribute.
   * @see #setSelectableValuesLocation(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getMultiSelectionDefinition_SelectableValuesLocation()
   * @model
   * @generated
   */
  String getSelectableValuesLocation();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.MultiSelectionDefinition#getSelectableValuesLocation <em>Selectable Values Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selectable Values Location</em>' attribute.
   * @see #getSelectableValuesLocation()
   * @generated
   */
  void setSelectableValuesLocation(String value);

  /**
   * Returns the value of the '<em><b>Selected Values Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected Values Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Values Location</em>' attribute.
   * @see #setSelectedValuesLocation(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getMultiSelectionDefinition_SelectedValuesLocation()
   * @model
   * @generated
   */
  String getSelectedValuesLocation();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.MultiSelectionDefinition#getSelectedValuesLocation <em>Selected Values Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected Values Location</em>' attribute.
   * @see #getSelectedValuesLocation()
   * @generated
   */
  void setSelectedValuesLocation(String value);

} // MultiSelectionDefinition
