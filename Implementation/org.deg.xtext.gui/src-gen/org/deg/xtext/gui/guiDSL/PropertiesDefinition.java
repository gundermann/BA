/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.PropertiesDefinition#getPropertyKey <em>Property Key</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.PropertiesDefinition#getText <em>Text</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.PropertiesDefinition#getInteractiontype <em>Interactiontype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getPropertiesDefinition()
 * @model
 * @generated
 */
public interface PropertiesDefinition extends EObject
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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getPropertiesDefinition_PropertyKey()
   * @model
   * @generated
   */
  String getPropertyKey();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.PropertiesDefinition#getPropertyKey <em>Property Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Key</em>' attribute.
   * @see #getPropertyKey()
   * @generated
   */
  void setPropertyKey(String value);

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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getPropertiesDefinition_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.PropertiesDefinition#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getPropertiesDefinition_Interactiontype()
   * @model containment="true"
   * @generated
   */
  EList<Interactiontype> getInteractiontype();

} // PropertiesDefinition
