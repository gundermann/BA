/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getPropertyKey <em>Property Key</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getInteractiontype <em>Interactiontype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getButtonDefinition()
 * @model
 * @generated
 */
public interface ButtonDefinition extends ComponentDefinition
{
  /**
   * Returns the value of the '<em><b>Property Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Key</em>' attribute.
   * @see #setPropertyKey(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getButtonDefinition_PropertyKey()
   * @model
   * @generated
   */
  String getPropertyKey();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getPropertyKey <em>Property Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Key</em>' attribute.
   * @see #getPropertyKey()
   * @generated
   */
  void setPropertyKey(String value);

  /**
   * Returns the value of the '<em><b>Interactiontype</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactiontype</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactiontype</em>' attribute list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getButtonDefinition_Interactiontype()
   * @model unique="false"
   * @generated
   */
  EList<String> getInteractiontype();

} // ButtonDefinition
