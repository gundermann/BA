/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textarea Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getCommonProperties <em>Common Properties</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getText <em>Text</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextareaProperties()
 * @model
 * @generated
 */
public interface TextareaProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Common Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Common Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Common Properties</em>' containment reference.
   * @see #setCommonProperties(CommonProperties)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextareaProperties_CommonProperties()
   * @model containment="true"
   * @generated
   */
  CommonProperties getCommonProperties();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getCommonProperties <em>Common Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Common Properties</em>' containment reference.
   * @see #getCommonProperties()
   * @generated
   */
  void setCommonProperties(CommonProperties value);

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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextareaProperties_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editable</em>' attribute.
   * @see #setEditable(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTextareaProperties_Editable()
   * @model
   * @generated
   */
  String getEditable();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getEditable <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editable</em>' attribute.
   * @see #getEditable()
   * @generated
   */
  void setEditable(String value);

} // TextareaProperties
