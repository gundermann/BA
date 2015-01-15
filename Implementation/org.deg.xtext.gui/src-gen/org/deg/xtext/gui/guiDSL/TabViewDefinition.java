/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab View Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TabViewDefinition#getTabs <em>Tabs</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.TabViewDefinition#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTabViewDefinition()
 * @model
 * @generated
 */
public interface TabViewDefinition extends ComponentDefinition
{
  /**
   * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.TabDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tabs</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTabViewDefinition_Tabs()
   * @model containment="true"
   * @generated
   */
  EList<TabDefinition> getTabs();

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
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getTabViewDefinition_Properties()
   * @model containment="true"
   * @generated
   */
  CommonProperties getProperties();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.TabViewDefinition#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(CommonProperties value);

} // TabViewDefinition
