/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UsedDescription#getDescriptionType <em>Description Type</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UsedDescription#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUsedDescription()
 * @model
 * @generated
 */
public interface UsedDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Description Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description Type</em>' containment reference.
   * @see #setDescriptionType(DescriptionType)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUsedDescription_DescriptionType()
   * @model containment="true"
   * @generated
   */
  DescriptionType getDescriptionType();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UsedDescription#getDescriptionType <em>Description Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description Type</em>' containment reference.
   * @see #getDescriptionType()
   * @generated
   */
  void setDescriptionType(DescriptionType value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUsedDescription_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UsedDescription#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // UsedDescription
