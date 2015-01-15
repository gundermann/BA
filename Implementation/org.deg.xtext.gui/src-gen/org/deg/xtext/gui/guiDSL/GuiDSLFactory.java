/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage
 * @generated
 */
public interface GuiDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuiDSLFactory eINSTANCE = org.deg.xtext.gui.guiDSL.impl.GuiDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>UI Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Description</em>'.
   * @generated
   */
  UIDescription createUIDescription();

  /**
   * Returns a new object of class '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layout</em>'.
   * @generated
   */
  Layout createLayout();

  /**
   * Returns a new object of class '<em>Structure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure</em>'.
   * @generated
   */
  Structure createStructure();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refinement</em>'.
   * @generated
   */
  Refinement createRefinement();

  /**
   * Returns a new object of class '<em>Component Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Refinement</em>'.
   * @generated
   */
  ComponentRefinement createComponentRefinement();

  /**
   * Returns a new object of class '<em>Button Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button Refinement</em>'.
   * @generated
   */
  ButtonRefinement createButtonRefinement();

  /**
   * Returns a new object of class '<em>Label Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Refinement</em>'.
   * @generated
   */
  LabelRefinement createLabelRefinement();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Used Descriptions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Used Descriptions</em>'.
   * @generated
   */
  UsedDescriptions createUsedDescriptions();

  /**
   * Returns a new object of class '<em>Description Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description Type</em>'.
   * @generated
   */
  DescriptionType createDescriptionType();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Definition</em>'.
   * @generated
   */
  TypeDefinition createTypeDefinition();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>UI Description Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Description Import</em>'.
   * @generated
   */
  UIDescriptionImport createUIDescriptionImport();

  /**
   * Returns a new object of class '<em>Complex Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Component</em>'.
   * @generated
   */
  ComplexComponent createComplexComponent();

  /**
   * Returns a new object of class '<em>Tab View Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tab View Definition</em>'.
   * @generated
   */
  TabViewDefinition createTabViewDefinition();

  /**
   * Returns a new object of class '<em>Tab Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tab Definition</em>'.
   * @generated
   */
  TabDefinition createTabDefinition();

  /**
   * Returns a new object of class '<em>Multiselection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiselection</em>'.
   * @generated
   */
  Multiselection createMultiselection();

  /**
   * Returns a new object of class '<em>Component Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Definition</em>'.
   * @generated
   */
  ComponentDefinition createComponentDefinition();

  /**
   * Returns a new object of class '<em>Textfield Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Textfield Definition</em>'.
   * @generated
   */
  TextfieldDefinition createTextfieldDefinition();

  /**
   * Returns a new object of class '<em>Textfield Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Textfield Properties</em>'.
   * @generated
   */
  TextfieldProperties createTextfieldProperties();

  /**
   * Returns a new object of class '<em>Textarea Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Textarea Definition</em>'.
   * @generated
   */
  TextareaDefinition createTextareaDefinition();

  /**
   * Returns a new object of class '<em>Textarea Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Textarea Properties</em>'.
   * @generated
   */
  TextareaProperties createTextareaProperties();

  /**
   * Returns a new object of class '<em>Tree Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tree Definition</em>'.
   * @generated
   */
  TreeDefinition createTreeDefinition();

  /**
   * Returns a new object of class '<em>Table Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Definition</em>'.
   * @generated
   */
  TableDefinition createTableDefinition();

  /**
   * Returns a new object of class '<em>Interchangeable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interchangeable Definition</em>'.
   * @generated
   */
  InterchangeableDefinition createInterchangeableDefinition();

  /**
   * Returns a new object of class '<em>Button Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button Definition</em>'.
   * @generated
   */
  ButtonDefinition createButtonDefinition();

  /**
   * Returns a new object of class '<em>Button Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button Properties</em>'.
   * @generated
   */
  ButtonProperties createButtonProperties();

  /**
   * Returns a new object of class '<em>Common Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Properties</em>'.
   * @generated
   */
  CommonProperties createCommonProperties();

  /**
   * Returns a new object of class '<em>Label Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Definition</em>'.
   * @generated
   */
  LabelDefinition createLabelDefinition();

  /**
   * Returns a new object of class '<em>Label Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Properties</em>'.
   * @generated
   */
  LabelProperties createLabelProperties();

  /**
   * Returns a new object of class '<em>Interactiontype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactiontype</em>'.
   * @generated
   */
  Interactiontype createInteractiontype();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GuiDSLPackage getGuiDSLPackage();

} //GuiDSLFactory
