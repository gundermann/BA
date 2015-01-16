/**
 */
package org.deg.xtext.gui.guiDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TreeRefinement#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TreeRefinement#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTreeRefinement()
 * @model
 * @generated
 */
public interface TreeRefinement extends ComponentRefinement
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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTreeRefinement_InputType()
   * @model
   * @generated
   */
  String getInputType();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TreeRefinement#getInputType <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' attribute.
   * @see #getInputType()
   * @generated
   */
  void setInputType(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(CommonProperties)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTreeRefinement_Properties()
   * @model containment="true"
   * @generated
   */
  CommonProperties getProperties();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TreeRefinement#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(CommonProperties value);

} // TreeRefinement
