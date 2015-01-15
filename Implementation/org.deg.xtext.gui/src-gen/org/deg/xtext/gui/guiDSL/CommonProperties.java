/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.CommonProperties#getName <em>Name</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.CommonProperties#getPropertyKey <em>Property Key</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.CommonProperties#getLayoutKey <em>Layout Key</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.CommonProperties#getInteractiontype <em>Interactiontype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getCommonProperties()
 * @model
 * @generated
 */
public interface CommonProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getCommonProperties_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.CommonProperties#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getCommonProperties_PropertyKey()
   * @model
   * @generated
   */
  String getPropertyKey();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.CommonProperties#getPropertyKey <em>Property Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Key</em>' attribute.
   * @see #getPropertyKey()
   * @generated
   */
  void setPropertyKey(String value);

  /**
   * Returns the value of the '<em><b>Layout Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Key</em>' attribute.
   * @see #setLayoutKey(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getCommonProperties_LayoutKey()
   * @model
   * @generated
   */
  String getLayoutKey();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.CommonProperties#getLayoutKey <em>Layout Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Key</em>' attribute.
   * @see #getLayoutKey()
   * @generated
   */
  void setLayoutKey(String value);

  /**
   * Returns the value of the '<em><b>Interactiontype</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.Interactiontype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactiontype</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactiontype</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getCommonProperties_Interactiontype()
   * @model containment="true"
   * @generated
   */
  EList<Interactiontype> getInteractiontype();

} // CommonProperties
