/**
 */
package org.deg.xtext.gui.guiDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textfield Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TextfieldRefinement#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextfieldRefinement()
 * @model
 * @generated
 */
public interface TextfieldRefinement extends ComponentRefinement
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
   * @see #setProperties(TextfieldProperties)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextfieldRefinement_Properties()
   * @model containment="true"
   * @generated
   */
  TextfieldProperties getProperties();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TextfieldRefinement#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(TextfieldProperties value);

} // TextfieldRefinement
