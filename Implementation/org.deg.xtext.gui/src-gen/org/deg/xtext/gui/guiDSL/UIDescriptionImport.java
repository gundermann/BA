/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Description Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescriptionImport#getDescriptionName <em>Description Name</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescriptionImport#getLocalName <em>Local Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescriptionImport()
 * @model
 * @generated
 */
public interface UIDescriptionImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Description Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description Name</em>' attribute.
   * @see #setDescriptionName(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescriptionImport_DescriptionName()
   * @model
   * @generated
   */
  String getDescriptionName();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIDescriptionImport#getDescriptionName <em>Description Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description Name</em>' attribute.
   * @see #getDescriptionName()
   * @generated
   */
  void setDescriptionName(String value);

  /**
   * Returns the value of the '<em><b>Local Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Name</em>' attribute.
   * @see #setLocalName(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescriptionImport_LocalName()
   * @model
   * @generated
   */
  String getLocalName();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIDescriptionImport#getLocalName <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Name</em>' attribute.
   * @see #getLocalName()
   * @generated
   */
  void setLocalName(String value);

} // UIDescriptionImport
