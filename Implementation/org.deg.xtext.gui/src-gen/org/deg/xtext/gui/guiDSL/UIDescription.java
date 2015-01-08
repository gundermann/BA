/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getProperty <em>Property</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getUsedDescriptions <em>Used Descriptions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription()
 * @model
 * @generated
 */
public interface UIDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definition</em>' containment reference.
   * @see #setTypeDefinition(TypeDefinition)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_TypeDefinition()
   * @model containment="true"
   * @generated
   */
  TypeDefinition getTypeDefinition();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIDescription#getTypeDefinition <em>Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Definition</em>' containment reference.
   * @see #getTypeDefinition()
   * @generated
   */
  void setTypeDefinition(TypeDefinition value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(Property)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_Property()
   * @model containment="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIDescription#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Used Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.UsedDescriptions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Used Descriptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Used Descriptions</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_UsedDescriptions()
   * @model containment="true"
   * @generated
   */
  EList<UsedDescriptions> getUsedDescriptions();

  /**
   * Returns the value of the '<em><b>Refinements</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.Refinement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refinements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refinements</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_Refinements()
   * @model containment="true"
   * @generated
   */
  EList<Refinement> getRefinements();

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitions();

  /**
   * Returns the value of the '<em><b>Structure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structure</em>' containment reference.
   * @see #setStructure(Structure)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_Structure()
   * @model containment="true"
   * @generated
   */
  Structure getStructure();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIDescription#getStructure <em>Structure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structure</em>' containment reference.
   * @see #getStructure()
   * @generated
   */
  void setStructure(Structure value);

} // UIDescription
