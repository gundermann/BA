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
   * The feature id for the '<em><b>Area Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__AREA_COUNT = 0;

  /**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__TYPE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Used Descriptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__USED_DESCRIPTIONS = 3;

  /**
   * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__REFINEMENTS = 4;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__DEFINITIONS = 5;

  /**
   * The feature id for the '<em><b>Areas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__AREAS = 6;

  /**
   * The number of structural features of the '<em>UI Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.RefinementImpl <em>Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.RefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getRefinement()
   * @generated
   */
  int REFINEMENT = 1;

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
  int COMPONENT_REFINEMENT = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFINEMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFINEMENT__NAME = 1;

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
  int BUTTON_REFINEMENT = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_REFINEMENT__TYPE = COMPONENT_REFINEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

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
  int LABEL_REFINEMENT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_REFINEMENT__TYPE = COMPONENT_REFINEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

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
  int PROPERTY = 5;

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
  int USED_DESCRIPTIONS = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USED_DESCRIPTIONS__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Local Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USED_DESCRIPTIONS__LOCAL_NAME = 1;

  /**
   * The number of structural features of the '<em>Used Descriptions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USED_DESCRIPTIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.AreaCountImpl <em>Area Count</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.AreaCountImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getAreaCount()
   * @generated
   */
  int AREA_COUNT = 7;

  /**
   * The feature id for the '<em><b>Area Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA_COUNT__AREA_COUNT = 0;

  /**
   * The number of structural features of the '<em>Area Count</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA_COUNT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.DefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 8;

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
  int TYPE_DEFINITION = 9;

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
  int UI_DESCRIPTION_IMPORT = 10;

  /**
   * The feature id for the '<em><b>Description Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME = 0;

  /**
   * The number of structural features of the '<em>UI Description Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl <em>Complex Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComplexComponent()
   * @generated
   */
  int COMPLEX_COMPONENT = 11;

  /**
   * The number of structural features of the '<em>Complex Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_COMPONENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl <em>Multiselection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getMultiselection()
   * @generated
   */
  int MULTISELECTION = 12;

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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.AreaAssignmentImpl <em>Area Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.AreaAssignmentImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getAreaAssignment()
   * @generated
   */
  int AREA_ASSIGNMENT = 13;

  /**
   * The feature id for the '<em><b>Area</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA_ASSIGNMENT__AREA = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA_ASSIGNMENT__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Area Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AREA_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComponentDefinition()
   * @generated
   */
  int COMPONENT_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__NAME = 1;

  /**
   * The number of structural features of the '<em>Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.CheckboxDefinitionImpl <em>Checkbox Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.CheckboxDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getCheckboxDefinition()
   * @generated
   */
  int CHECKBOX_DEFINITION = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_DEFINITION__TYPE = COMPONENT_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_DEFINITION__TEXT = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Checkbox Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECKBOX_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.RadioboxDefinitionImpl <em>Radiobox Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.RadioboxDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getRadioboxDefinition()
   * @generated
   */
  int RADIOBOX_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIOBOX_DEFINITION__TYPE = COMPONENT_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIOBOX_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIOBOX_DEFINITION__TEXT = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Radiobox Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIOBOX_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TableDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTableDefinition()
   * @generated
   */
  int TABLE_DEFINITION = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__TYPE = COMPONENT_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__TEXT = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Table Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TreeDefinitionImpl <em>Tree Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TreeDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTreeDefinition()
   * @generated
   */
  int TREE_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION__TYPE = COMPONENT_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION__TEXT = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tree Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TextfieldDefinitionImpl <em>Textfield Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TextfieldDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextfieldDefinition()
   * @generated
   */
  int TEXTFIELD_DEFINITION = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION__TYPE = COMPONENT_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION__TEXT = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Textfield Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl <em>Button Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonDefinition()
   * @generated
   */
  int BUTTON_DEFINITION = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION__TYPE = COMPONENT_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.PropertiesImpl <em>Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.PropertiesImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getProperties()
   * @generated
   */
  int PROPERTIES = 21;

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
  int LABEL_DEFINITION = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION__TYPE = COMPONENT_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.UIDescription#getAreaCount <em>Area Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Area Count</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getAreaCount()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_AreaCount();

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
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.UIDescription#getAreas <em>Areas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Areas</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getAreas()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_Areas();

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
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.ComponentRefinement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentRefinement#getType()
   * @see #getComponentRefinement()
   * @generated
   */
  EAttribute getComponentRefinement_Type();

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
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.UsedDescriptions#getLocalName <em>Local Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.UsedDescriptions#getLocalName()
   * @see #getUsedDescriptions()
   * @generated
   */
  EAttribute getUsedDescriptions_LocalName();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.AreaCount <em>Area Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Area Count</em>'.
   * @see org.deg.xtext.gui.guiDSL.AreaCount
   * @generated
   */
  EClass getAreaCount();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.AreaCount#getAreaCount <em>Area Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Area Count</em>'.
   * @see org.deg.xtext.gui.guiDSL.AreaCount#getAreaCount()
   * @see #getAreaCount()
   * @generated
   */
  EAttribute getAreaCount_AreaCount();

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
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.AreaAssignment <em>Area Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Area Assignment</em>'.
   * @see org.deg.xtext.gui.guiDSL.AreaAssignment
   * @generated
   */
  EClass getAreaAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.AreaAssignment#getArea <em>Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Area</em>'.
   * @see org.deg.xtext.gui.guiDSL.AreaAssignment#getArea()
   * @see #getAreaAssignment()
   * @generated
   */
  EAttribute getAreaAssignment_Area();

  /**
   * Returns the meta object for the attribute list '{@link org.deg.xtext.gui.guiDSL.AreaAssignment#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see org.deg.xtext.gui.guiDSL.AreaAssignment#getElements()
   * @see #getAreaAssignment()
   * @generated
   */
  EAttribute getAreaAssignment_Elements();

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
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.ComponentDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComponentDefinition#getType()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_Type();

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
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.CheckboxDefinition <em>Checkbox Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Checkbox Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.CheckboxDefinition
   * @generated
   */
  EClass getCheckboxDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.CheckboxDefinition#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.CheckboxDefinition#getText()
   * @see #getCheckboxDefinition()
   * @generated
   */
  EAttribute getCheckboxDefinition_Text();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.RadioboxDefinition <em>Radiobox Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radiobox Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.RadioboxDefinition
   * @generated
   */
  EClass getRadioboxDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.RadioboxDefinition#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.RadioboxDefinition#getText()
   * @see #getRadioboxDefinition()
   * @generated
   */
  EAttribute getRadioboxDefinition_Text();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TableDefinition
   * @generated
   */
  EClass getTableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TableDefinition#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.TableDefinition#getText()
   * @see #getTableDefinition()
   * @generated
   */
  EAttribute getTableDefinition_Text();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TreeDefinition <em>Tree Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tree Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TreeDefinition
   * @generated
   */
  EClass getTreeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TreeDefinition#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.TreeDefinition#getText()
   * @see #getTreeDefinition()
   * @generated
   */
  EAttribute getTreeDefinition_Text();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TextfieldDefinition <em>Textfield Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textfield Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldDefinition
   * @generated
   */
  EClass getTextfieldDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TextfieldDefinition#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldDefinition#getText()
   * @see #getTextfieldDefinition()
   * @generated
   */
  EAttribute getTextfieldDefinition_Text();

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
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.ButtonDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.ButtonDefinition#getProperties()
   * @see #getButtonDefinition()
   * @generated
   */
  EReference getButtonDefinition_Properties();

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
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.LabelDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.LabelDefinition#getProperties()
   * @see #getLabelDefinition()
   * @generated
   */
  EReference getLabelDefinition_Properties();

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
     * The meta object literal for the '<em><b>Area Count</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__AREA_COUNT = eINSTANCE.getUIDescription_AreaCount();

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
     * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__AREAS = eINSTANCE.getUIDescription_Areas();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_REFINEMENT__TYPE = eINSTANCE.getComponentRefinement_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_REFINEMENT__NAME = eINSTANCE.getComponentRefinement_Name();

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
     * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USED_DESCRIPTIONS__LOCAL_NAME = eINSTANCE.getUsedDescriptions_LocalName();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.AreaCountImpl <em>Area Count</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.AreaCountImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getAreaCount()
     * @generated
     */
    EClass AREA_COUNT = eINSTANCE.getAreaCount();

    /**
     * The meta object literal for the '<em><b>Area Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AREA_COUNT__AREA_COUNT = eINSTANCE.getAreaCount_AreaCount();

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
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.AreaAssignmentImpl <em>Area Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.AreaAssignmentImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getAreaAssignment()
     * @generated
     */
    EClass AREA_ASSIGNMENT = eINSTANCE.getAreaAssignment();

    /**
     * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AREA_ASSIGNMENT__AREA = eINSTANCE.getAreaAssignment_Area();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AREA_ASSIGNMENT__ELEMENTS = eINSTANCE.getAreaAssignment_Elements();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__TYPE = eINSTANCE.getComponentDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__NAME = eINSTANCE.getComponentDefinition_Name();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.CheckboxDefinitionImpl <em>Checkbox Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.CheckboxDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getCheckboxDefinition()
     * @generated
     */
    EClass CHECKBOX_DEFINITION = eINSTANCE.getCheckboxDefinition();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECKBOX_DEFINITION__TEXT = eINSTANCE.getCheckboxDefinition_Text();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.RadioboxDefinitionImpl <em>Radiobox Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.RadioboxDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getRadioboxDefinition()
     * @generated
     */
    EClass RADIOBOX_DEFINITION = eINSTANCE.getRadioboxDefinition();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIOBOX_DEFINITION__TEXT = eINSTANCE.getRadioboxDefinition_Text();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TableDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTableDefinition()
     * @generated
     */
    EClass TABLE_DEFINITION = eINSTANCE.getTableDefinition();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DEFINITION__TEXT = eINSTANCE.getTableDefinition_Text();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TreeDefinitionImpl <em>Tree Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TreeDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTreeDefinition()
     * @generated
     */
    EClass TREE_DEFINITION = eINSTANCE.getTreeDefinition();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREE_DEFINITION__TEXT = eINSTANCE.getTreeDefinition_Text();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TextfieldDefinitionImpl <em>Textfield Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TextfieldDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextfieldDefinition()
     * @generated
     */
    EClass TEXTFIELD_DEFINITION = eINSTANCE.getTextfieldDefinition();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTFIELD_DEFINITION__TEXT = eINSTANCE.getTextfieldDefinition_Text();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_DEFINITION__PROPERTIES = eINSTANCE.getButtonDefinition_Properties();

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

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_DEFINITION__PROPERTIES = eINSTANCE.getLabelDefinition_Properties();

  }

} //GuiDSLPackage
