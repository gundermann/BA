/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.AreaAssignment#getArea <em>Area</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.AreaAssignment#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getAreaAssignment()
 * @model
 * @generated
 */
public interface AreaAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Area</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Area</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Area</em>' attribute.
   * @see #setArea(int)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getAreaAssignment_Area()
   * @model
   * @generated
   */
  int getArea();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.AreaAssignment#getArea <em>Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Area</em>' attribute.
   * @see #getArea()
   * @generated
   */
  void setArea(int value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' attribute list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getAreaAssignment_Elements()
   * @model unique="false"
   * @generated
   */
  EList<String> getElements();

} // AreaAssignment
