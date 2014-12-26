/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.Property#getPropertiesFile <em>Properties File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties File</em>' attribute.
   * @see #setPropertiesFile(String)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getProperty_PropertiesFile()
   * @model
   * @generated
   */
  String getPropertiesFile();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.Property#getPropertiesFile <em>Properties File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties File</em>' attribute.
   * @see #getPropertiesFile()
   * @generated
   */
  void setPropertiesFile(String value);

} // Property
