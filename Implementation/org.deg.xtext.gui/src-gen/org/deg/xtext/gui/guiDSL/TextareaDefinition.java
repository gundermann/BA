/**
 */
package org.deg.xtext.gui.guiDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textarea Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TextareaDefinition#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextareaDefinition()
 * @model
 * @generated
 */
public interface TextareaDefinition extends ComponentDefinition
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(TextareaProperties)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextareaDefinition_Properties()
   * @model containment="true"
   * @generated
   */
  TextareaProperties getProperties();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TextareaDefinition#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(TextareaProperties value);

} // TextareaDefinition