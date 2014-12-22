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
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getAreaCount <em>Area Count</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getUsedDescriptions <em>Used Descriptions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getInputTypes <em>Input Types</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.UIDescription#getAreas <em>Areas</em>}</li>
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
   * Returns the value of the '<em><b>Area Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Area Count</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Area Count</em>' containment reference.
   * @see #setAreaCount(AreaCount)
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_AreaCount()
   * @model containment="true"
   * @generated
   */
  AreaCount getAreaCount();

  /**
   * Sets the value of the '{@link org.deg.xtext.gui.guiDSL.UIDescription#getAreaCount <em>Area Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Area Count</em>' containment reference.
   * @see #getAreaCount()
   * @generated
   */
  void setAreaCount(AreaCount value);

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
   * Returns the value of the '<em><b>Input Types</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.inputType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Types</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_InputTypes()
   * @model containment="true"
   * @generated
   */
  EList<inputType> getInputTypes();

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
   * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
   * The list contents are of type {@link org.deg.xtext.gui.guiDSL.AreaAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Areas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Areas</em>' containment reference list.
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#getUIDescription_Areas()
   * @model containment="true"
   * @generated
   */
  EList<AreaAssignment> getAreas();

} // UIDescription
