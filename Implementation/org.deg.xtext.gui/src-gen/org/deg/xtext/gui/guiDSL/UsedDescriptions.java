/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UsedDescriptions#getDescription <em>Description</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UsedDescriptions#getLocalName <em>Local Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUsedDescriptions()
 * @model
 * @generated
 */
public interface UsedDescriptions extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(EObject)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUsedDescriptions_Description()
   * @model containment="true"
   * @generated
   */
  EObject getDescription();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UsedDescriptions#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(EObject value);

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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUsedDescriptions_LocalName()
   * @model
   * @generated
   */
  String getLocalName();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UsedDescriptions#getLocalName <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Name</em>' attribute.
   * @see #getLocalName()
   * @generated
   */
  void setLocalName(String value);

} // UsedDescriptions
