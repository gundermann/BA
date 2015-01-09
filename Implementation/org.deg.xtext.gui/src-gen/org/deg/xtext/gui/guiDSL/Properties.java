/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.Properties#getPropertiesDefinitions <em>Properties Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.PropertiesDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties Definitions</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getProperties_PropertiesDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<PropertiesDefinition> getPropertiesDefinitions();

} // Properties
