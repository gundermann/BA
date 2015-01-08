/**
 */
package org.deg.xtext.gui.guiDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.deg.xtext.gui.guiDSL.GuiDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GuiDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "guiDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.deg.org/xtext/gui/GuiDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "guiDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuiDSLPackage eINSTANCE = org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl <em>UI Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUIDescription()
   * @generated
   */
  int UI_DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__TYPE_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Used Descriptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__USED_DESCRIPTIONS = 2;

  /**
   * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__REFINEMENTS = 3;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__DEFINITIONS = 4;

  /**
   * The feature id for the '<em><b>Structure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__STRUCTURE = 5;

  /**
   * The number of structural features of the '<em>UI Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.StructureImpl <em>Structure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.StructureImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getStructure()
   * @generated
   */
  int STRUCTURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Ordered Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__ORDERED_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Structure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ElementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ID = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.RefinementImpl <em>Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.RefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getRefinement()
   * @generated
   */
  int REFINEMENT = 3;

  /**
   * The feature id for the '<em><b>Concrete Refinement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__CONCRETE_REFINEMENT = 0;

  /**
   * The number of structural features of the '<em>Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ComponentRefinementImpl <em>Component Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ComponentRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComponentRefinement()
   * @generated
   */
  int COMPONENT_REFINEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFINEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFINEMENT__ID = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFINEMENT__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Component Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFINEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonRefinementImpl <em>Button Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ButtonRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonRefinement()
   * @generated
   */
  int BUTTON_REFINEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT__PROPERTIES;

  /**
   * The number of structural features of the '<em>Button Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelRefinementImpl <em>Label Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.LabelRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelRefinement()
   * @generated
   */
  int LABEL_REFINEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT__PROPERTIES;

  /**
   * The number of structural features of the '<em>Label Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.PropertyImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Properties File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PROPERTIES_FILE = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.UsedDescriptionsImpl <em>Used Descriptions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.UsedDescriptionsImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUsedDescriptions()
   * @generated
   */
  int USED_DESCRIPTIONS = 8;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USED_DESCRIPTIONS__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USED_DESCRIPTIONS__ID = 1;

  /**
   * The number of structural features of the '<em>Used Descriptions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USED_DESCRIPTIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.DescriptionTypeImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getDescriptionType()
   * @generated
   */
  int DESCRIPTION_TYPE = 9;

  /**
   * The number of structural features of the '<em>Description Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.DefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Concrete Defition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__CONCRETE_DEFITION = 0;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl <em>UI Description Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUIDescriptionImport()
   * @generated
   */
  int UI_DESCRIPTION_IMPORT = 12;

  /**
   * The feature id for the '<em><b>Description Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME = DESCRIPTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UI Description Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION_IMPORT_FEATURE_COUNT = DESCRIPTION_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl <em>Complex Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComplexComponent()
   * @generated
   */
  int COMPLEX_COMPONENT = 13;

  /**
   * The number of structural features of the '<em>Complex Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_COMPONENT_FEATURE_COUNT = DESCRIPTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl <em>Multiselection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getMultiselection()
   * @generated
   */
  int MULTISELECTION = 14;

  /**
   * The feature id for the '<em><b>Description Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTISELECTION__DESCRIPTION_NAME = COMPLEX_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTISELECTION__INPUT_TYPE = COMPLEX_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiselection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTISELECTION_FEATURE_COUNT = COMPLEX_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComponentDefinition()
   * @generated
   */
  int COMPONENT_DEFINITION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__ID = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl <em>Button Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonDefinition()
   * @generated
   */
  int BUTTON_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION__PROPERTIES = COMPONENT_DEFINITION__PROPERTIES;

  /**
   * The number of structural features of the '<em>Button Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.PropertiesImpl <em>Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.PropertiesImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getProperties()
   * @generated
   */
  int PROPERTIES = 17;

  /**
   * The feature id for the '<em><b>Property Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES__PROPERTY_KEY = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES__TEXT = 1;

  /**
   * The feature id for the '<em><b>Interactiontype</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES__INTERACTIONTYPE = 2;

  /**
   * The number of structural features of the '<em>Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelDefinitionImpl <em>Label Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.LabelDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelDefinition()
   * @generated
   */
  int LABEL_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION__PROPERTIES = COMPONENT_DEFINITION__PROPERTIES;

  /**
   * The number of structural features of the '<em>Label Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.UIDescription <em>UI Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Description</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription
   * @generated
   */
  EClass getUIDescription();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.UIDescription#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getTypeDefinition()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_TypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.UIDescription#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getProperty()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_Property();

  /**
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.UIDescription#getUsedDescriptions <em>Used Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Used Descriptions</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getUsedDescriptions()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_UsedDescriptions();

  /**
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.UIDescription#getRefinements <em>Refinements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refinements</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getRefinements()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_Refinements();

  /**
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.UIDescription#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getDefinitions()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_Definitions();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.UIDescription#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getStructure()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_Structure();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure</em>'.
   * @see org.deg.xtext.gui.guiDSL.Structure
   * @generated
   */
  EClass getStructure();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Structure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.Structure#getName()
   * @see #getStructure()
   * @generated
   */
  EAttribute getStructure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.Structure#getOrderedElements <em>Ordered Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ordered Elements</em>'.
   * @see org.deg.xtext.gui.guiDSL.Structure#getOrderedElements()
   * @see #getStructure()
   * @generated
   */
  EReference getStructure_OrderedElements();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.deg.xtext.gui.guiDSL.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Element#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.deg.xtext.gui.guiDSL.Element#getId()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Id();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Refinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.Refinement
   * @generated
   */
  EClass getRefinement();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.Refinement#getConcreteRefinement <em>Concrete Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.Refinement#getConcreteRefinement()
   * @see #getRefinement()
   * @generated
   */
  EReference getRefinement_ConcreteRefinement();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.ComponentRefinement <em>Component Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentRefinement
   * @generated
   */
  EClass getComponentRefinement();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.ComponentRefinement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentRefinement#getName()
   * @see #getComponentRefinement()
   * @generated
   */
  EAttribute getComponentRefinement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.ComponentRefinement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentRefinement#getId()
   * @see #getComponentRefinement()
   * @generated
   */
  EAttribute getComponentRefinement_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.ComponentRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentRefinement#getProperties()
   * @see #getComponentRefinement()
   * @generated
   */
  EReference getComponentRefinement_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.ButtonRefinement <em>Button Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.ButtonRefinement
   * @generated
   */
  EClass getButtonRefinement();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.LabelRefinement <em>Label Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.LabelRefinement
   * @generated
   */
  EClass getLabelRefinement();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.deg.xtext.gui.guiDSL.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Property#getPropertiesFile <em>Properties File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Properties File</em>'.
   * @see org.deg.xtext.gui.guiDSL.Property#getPropertiesFile()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_PropertiesFile();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.UsedDescriptions <em>Used Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Used Descriptions</em>'.
   * @see org.deg.xtext.gui.guiDSL.UsedDescriptions
   * @generated
   */
  EClass getUsedDescriptions();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.UsedDescriptions#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.deg.xtext.gui.guiDSL.UsedDescriptions#getDescription()
   * @see #getUsedDescriptions()
   * @generated
   */
  EReference getUsedDescriptions_Description();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.UsedDescriptions#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.deg.xtext.gui.guiDSL.UsedDescriptions#getId()
   * @see #getUsedDescriptions()
   * @generated
   */
  EAttribute getUsedDescriptions_Id();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.DescriptionType <em>Description Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.DescriptionType
   * @generated
   */
  EClass getDescriptionType();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.Definition#getConcreteDefition <em>Concrete Defition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Defition</em>'.
   * @see org.deg.xtext.gui.guiDSL.Definition#getConcreteDefition()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_ConcreteDefition();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TypeDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.TypeDefinition#getType()
   * @see #getTypeDefinition()
   * @generated
   */
  EAttribute getTypeDefinition_Type();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.UIDescriptionImport <em>UI Description Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Description Import</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescriptionImport
   * @generated
   */
  EClass getUIDescriptionImport();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.UIDescriptionImport#getDescriptionName <em>Description Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescriptionImport#getDescriptionName()
   * @see #getUIDescriptionImport()
   * @generated
   */
  EAttribute getUIDescriptionImport_DescriptionName();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.ComplexComponent <em>Complex Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Component</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComplexComponent
   * @generated
   */
  EClass getComplexComponent();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Multiselection <em>Multiselection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiselection</em>'.
   * @see org.deg.xtext.gui.guiDSL.Multiselection
   * @generated
   */
  EClass getMultiselection();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Multiselection#getDescriptionName <em>Description Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.Multiselection#getDescriptionName()
   * @see #getMultiselection()
   * @generated
   */
  EAttribute getMultiselection_DescriptionName();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Multiselection#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.Multiselection#getInputType()
   * @see #getMultiselection()
   * @generated
   */
  EAttribute getMultiselection_InputType();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.ComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentDefinition
   * @generated
   */
  EClass getComponentDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.ComponentDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentDefinition#getName()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.ComponentDefinition#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentDefinition#getId()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.ComponentDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentDefinition#getProperties()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.ButtonDefinition <em>Button Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.ButtonDefinition
   * @generated
   */
  EClass getButtonDefinition();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Properties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.Properties
   * @generated
   */
  EClass getProperties();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Properties#getPropertyKey <em>Property Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Key</em>'.
   * @see org.deg.xtext.gui.guiDSL.Properties#getPropertyKey()
   * @see #getProperties()
   * @generated
   */
  EAttribute getProperties_PropertyKey();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Properties#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.Properties#getText()
   * @see #getProperties()
   * @generated
   */
  EAttribute getProperties_Text();

  /**
   * Returns the meta object for the attribute list '{@link org.deg.xtext.gui.guiDSL.Properties#getInteractiontype <em>Interactiontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interactiontype</em>'.
   * @see org.deg.xtext.gui.guiDSL.Properties#getInteractiontype()
   * @see #getProperties()
   * @generated
   */
  EAttribute getProperties_Interactiontype();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.LabelDefinition <em>Label Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.LabelDefinition
   * @generated
   */
  EClass getLabelDefinition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GuiDSLFactory getGuiDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl <em>UI Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUIDescription()
     * @generated
     */
    EClass UI_DESCRIPTION = eINSTANCE.getUIDescription();

    /**
     * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__TYPE_DEFINITION = eINSTANCE.getUIDescription_TypeDefinition();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__PROPERTY = eINSTANCE.getUIDescription_Property();

    /**
     * The meta object literal for the '<em><b>Used Descriptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__USED_DESCRIPTIONS = eINSTANCE.getUIDescription_UsedDescriptions();

    /**
     * The meta object literal for the '<em><b>Refinements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__REFINEMENTS = eINSTANCE.getUIDescription_Refinements();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__DEFINITIONS = eINSTANCE.getUIDescription_Definitions();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__STRUCTURE = eINSTANCE.getUIDescription_Structure();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.StructureImpl <em>Structure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.StructureImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getStructure()
     * @generated
     */
    EClass STRUCTURE = eINSTANCE.getStructure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE__NAME = eINSTANCE.getStructure_Name();

    /**
     * The meta object literal for the '<em><b>Ordered Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE__ORDERED_ELEMENTS = eINSTANCE.getStructure_OrderedElements();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ElementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.RefinementImpl <em>Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.RefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getRefinement()
     * @generated
     */
    EClass REFINEMENT = eINSTANCE.getRefinement();

    /**
     * The meta object literal for the '<em><b>Concrete Refinement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINEMENT__CONCRETE_REFINEMENT = eINSTANCE.getRefinement_ConcreteRefinement();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ComponentRefinementImpl <em>Component Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ComponentRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComponentRefinement()
     * @generated
     */
    EClass COMPONENT_REFINEMENT = eINSTANCE.getComponentRefinement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_REFINEMENT__NAME = eINSTANCE.getComponentRefinement_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_REFINEMENT__ID = eINSTANCE.getComponentRefinement_Id();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_REFINEMENT__PROPERTIES = eINSTANCE.getComponentRefinement_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonRefinementImpl <em>Button Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ButtonRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonRefinement()
     * @generated
     */
    EClass BUTTON_REFINEMENT = eINSTANCE.getButtonRefinement();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelRefinementImpl <em>Label Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.LabelRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelRefinement()
     * @generated
     */
    EClass LABEL_REFINEMENT = eINSTANCE.getLabelRefinement();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.PropertyImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Properties File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__PROPERTIES_FILE = eINSTANCE.getProperty_PropertiesFile();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.UsedDescriptionsImpl <em>Used Descriptions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.UsedDescriptionsImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUsedDescriptions()
     * @generated
     */
    EClass USED_DESCRIPTIONS = eINSTANCE.getUsedDescriptions();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USED_DESCRIPTIONS__DESCRIPTION = eINSTANCE.getUsedDescriptions_Description();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USED_DESCRIPTIONS__ID = eINSTANCE.getUsedDescriptions_Id();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.DescriptionTypeImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getDescriptionType()
     * @generated
     */
    EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.DefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Concrete Defition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__CONCRETE_DEFITION = eINSTANCE.getDefinition_ConcreteDefition();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__TYPE = eINSTANCE.getTypeDefinition_Type();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl <em>UI Description Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUIDescriptionImport()
     * @generated
     */
    EClass UI_DESCRIPTION_IMPORT = eINSTANCE.getUIDescriptionImport();

    /**
     * The meta object literal for the '<em><b>Description Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME = eINSTANCE.getUIDescriptionImport_DescriptionName();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl <em>Complex Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComplexComponent()
     * @generated
     */
    EClass COMPLEX_COMPONENT = eINSTANCE.getComplexComponent();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl <em>Multiselection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getMultiselection()
     * @generated
     */
    EClass MULTISELECTION = eINSTANCE.getMultiselection();

    /**
     * The meta object literal for the '<em><b>Description Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTISELECTION__DESCRIPTION_NAME = eINSTANCE.getMultiselection_DescriptionName();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTISELECTION__INPUT_TYPE = eINSTANCE.getMultiselection_InputType();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComponentDefinition()
     * @generated
     */
    EClass COMPONENT_DEFINITION = eINSTANCE.getComponentDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__NAME = eINSTANCE.getComponentDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__ID = eINSTANCE.getComponentDefinition_Id();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__PROPERTIES = eINSTANCE.getComponentDefinition_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl <em>Button Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonDefinition()
     * @generated
     */
    EClass BUTTON_DEFINITION = eINSTANCE.getButtonDefinition();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.PropertiesImpl <em>Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.PropertiesImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getProperties()
     * @generated
     */
    EClass PROPERTIES = eINSTANCE.getProperties();

    /**
     * The meta object literal for the '<em><b>Property Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTIES__PROPERTY_KEY = eINSTANCE.getProperties_PropertyKey();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTIES__TEXT = eINSTANCE.getProperties_Text();

    /**
     * The meta object literal for the '<em><b>Interactiontype</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTIES__INTERACTIONTYPE = eINSTANCE.getProperties_Interactiontype();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelDefinitionImpl <em>Label Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.LabelDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelDefinition()
     * @generated
     */
    EClass LABEL_DEFINITION = eINSTANCE.getLabelDefinition();

  }

} //GuiDSLPackage
