/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIAction#getType <em>Type</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIAction#getUiElementName <em>Ui Element Name</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIAction#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIAction()
 * @model
 * @generated
 */
public interface UIAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIAction_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIAction#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Ui Element Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Element Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Element Name</em>' attribute.
   * @see #setUiElementName(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIAction_UiElementName()
   * @model
   * @generated
   */
  String getUiElementName();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIAction#getUiElementName <em>Ui Element Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Element Name</em>' attribute.
   * @see #getUiElementName()
   * @generated
   */
  void setUiElementName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIAction_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // UIAction
