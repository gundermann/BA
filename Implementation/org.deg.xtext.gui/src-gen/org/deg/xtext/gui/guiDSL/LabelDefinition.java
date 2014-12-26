/**
 */
package org.deg.xtext.gui.guiDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.LabelDefinition#getPropertyKey <em>Property Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getLabelDefinition()
 * @model
 * @generated
 */
public interface LabelDefinition extends ComponentDefinition
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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getLabelDefinition_PropertyKey()
   * @model
   * @generated
   */
  String getPropertyKey();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.LabelDefinition#getPropertyKey <em>Property Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Key</em>' attribute.
   * @see #getPropertyKey()
   * @generated
   */
  void setPropertyKey(String value);

} // LabelDefinition
