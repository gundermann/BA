/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.Refinement#getConcreteRefinement <em>Concrete Refinement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getRefinement()
 * @model
 * @generated
 */
public interface Refinement extends EObject
{
  /**
   * Returns the value of the '<em><b>Concrete Refinement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Refinement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Refinement</em>' containment reference.
   * @see #setConcreteRefinement(ComponentRefinement)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getRefinement_ConcreteRefinement()
   * @model containment="true"
   * @generated
   */
  ComponentRefinement getConcreteRefinement();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.Refinement#getConcreteRefinement <em>Concrete Refinement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Refinement</em>' containment reference.
   * @see #getConcreteRefinement()
   * @generated
   */
  void setConcreteRefinement(ComponentRefinement value);

} // Refinement
