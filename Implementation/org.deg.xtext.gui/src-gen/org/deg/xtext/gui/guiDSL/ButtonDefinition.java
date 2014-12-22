/**
 */
package org.deg.xtext.gui.guiDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getText <em>Text</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getInteraction <em>Interaction</em>}</li>
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
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getButtonDefinition_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction</em>' containment reference.
   * @see #setInteraction(Interaction)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getButtonDefinition_Interaction()
   * @model containment="true"
   * @generated
   */
  Interaction getInteraction();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getInteraction <em>Interaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction</em>' containment reference.
   * @see #getInteraction()
   * @generated
   */
  void setInteraction(Interaction value);

} // ButtonDefinition
