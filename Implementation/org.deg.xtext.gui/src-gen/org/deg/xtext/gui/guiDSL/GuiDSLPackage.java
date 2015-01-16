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
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__LAYOUT = 2;

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
   * The feature id for the '<em><b>Structure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION__STRUCTURE = 6;

  /**
   * The number of structural features of the '<em>UI Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_DESCRIPTION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TypeImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ID = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.PropertyImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Properties Files</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PROPERTIES_FILES = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.LayoutImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 4;

  /**
   * The feature id for the '<em><b>Layout Files</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__LAYOUT_FILES = 0;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.UsedDescriptionsImpl <em>Used Descriptions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.UsedDescriptionsImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUsedDescriptions()
   * @generated
   */
  int USED_DESCRIPTIONS = 5;

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
  int DESCRIPTION_TYPE = 6;

  /**
   * The number of structural features of the '<em>Description Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl <em>Complex Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComplexComponent()
   * @generated
   */
  int COMPLEX_COMPONENT = 7;

  /**
   * The number of structural features of the '<em>Complex Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_COMPONENT_FEATURE_COUNT = DESCRIPTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl <em>UI Description Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.UIDescriptionImportImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getUIDescriptionImport()
   * @generated
   */
  int UI_DESCRIPTION_IMPORT = 8;

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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.RefinementImpl <em>Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.RefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getRefinement()
   * @generated
   */
  int REFINEMENT = 9;

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
  int COMPONENT_REFINEMENT = 10;

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
   * The number of structural features of the '<em>Component Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_REFINEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.DefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 11;

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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ComponentDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComponentDefinition()
   * @generated
   */
  int COMPONENT_DEFINITION = 12;

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
   * The number of structural features of the '<em>Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.StructureImpl <em>Structure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.StructureImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getStructure()
   * @generated
   */
  int STRUCTURE = 13;

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
  int ELEMENT = 14;

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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TableRefinementImpl <em>Table Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TableRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTableRefinement()
   * @generated
   */
  int TABLE_REFINEMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFINEMENT__INPUT_TYPE = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TabViewRefinementImpl <em>Tab View Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TabViewRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTabViewRefinement()
   * @generated
   */
  int TAB_VIEW_REFINEMENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_REFINEMENT__TABS = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tab View Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TreeRefinementImpl <em>Tree Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TreeRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTreeRefinement()
   * @generated
   */
  int TREE_REFINEMENT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_REFINEMENT__INPUT_TYPE = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tree Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.InterchangeableRefinementImpl <em>Interchangeable Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.InterchangeableRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getInterchangeableRefinement()
   * @generated
   */
  int INTERCHANGEABLE_REFINEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interchangeable Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TextareaRefinementImpl <em>Textarea Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TextareaRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextareaRefinement()
   * @generated
   */
  int TEXTAREA_REFINEMENT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Textarea Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TextfieldRefinementImpl <em>Textfield Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TextfieldRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextfieldRefinement()
   * @generated
   */
  int TEXTFIELD_REFINEMENT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_REFINEMENT__NAME = COMPONENT_REFINEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_REFINEMENT__ID = COMPONENT_REFINEMENT__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Textfield Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonRefinementImpl <em>Button Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ButtonRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonRefinement()
   * @generated
   */
  int BUTTON_REFINEMENT = 21;

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
  int BUTTON_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelRefinementImpl <em>Label Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.LabelRefinementImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelRefinement()
   * @generated
   */
  int LABEL_REFINEMENT = 22;

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
  int LABEL_REFINEMENT__PROPERTIES = COMPONENT_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_REFINEMENT_FEATURE_COUNT = COMPONENT_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TabViewDefinitionImpl <em>Tab View Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TabViewDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTabViewDefinition()
   * @generated
   */
  int TAB_VIEW_DEFINITION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_DEFINITION__TABS = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tab View Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TabDefinitionImpl <em>Tab Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TabDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTabDefinition()
   * @generated
   */
  int TAB_DEFINITION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Tab Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl <em>Multiselection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.MultiselectionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getMultiselection()
   * @generated
   */
  int MULTISELECTION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTISELECTION__NAME = COMPLEX_COMPONENT_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TextfieldDefinitionImpl <em>Textfield Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TextfieldDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextfieldDefinition()
   * @generated
   */
  int TEXTFIELD_DEFINITION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Textfield Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TextareaDefinitionImpl <em>Textarea Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TextareaDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextareaDefinition()
   * @generated
   */
  int TEXTAREA_DEFINITION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Textarea Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TreeDefinitionImpl <em>Tree Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TreeDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTreeDefinition()
   * @generated
   */
  int TREE_DEFINITION = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION__INPUT_TYPE = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tree Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TableDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTableDefinition()
   * @generated
   */
  int TABLE_DEFINITION = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__INPUT_TYPE = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.InterchangeableDefinitionImpl <em>Interchangeable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.InterchangeableDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getInterchangeableDefinition()
   * @generated
   */
  int INTERCHANGEABLE_DEFINITION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_DEFINITION__NAME = COMPONENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_DEFINITION__ID = COMPONENT_DEFINITION__ID;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_DEFINITION__PROPERTIES = COMPONENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interchangeable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCHANGEABLE_DEFINITION_FEATURE_COUNT = COMPONENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl <em>Button Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ButtonDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonDefinition()
   * @generated
   */
  int BUTTON_DEFINITION = 31;

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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelDefinitionImpl <em>Label Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.LabelDefinitionImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelDefinition()
   * @generated
   */
  int LABEL_DEFINITION = 32;

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
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.InteractiontypeImpl <em>Interactiontype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.InteractiontypeImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getInteractiontype()
   * @generated
   */
  int INTERACTIONTYPE = 33;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTIONTYPE__ID = 0;

  /**
   * The number of structural features of the '<em>Interactiontype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTIONTYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TextareaPropertiesImpl <em>Textarea Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TextareaPropertiesImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextareaProperties()
   * @generated
   */
  int TEXTAREA_PROPERTIES = 34;

  /**
   * The feature id for the '<em><b>Common Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_PROPERTIES__COMMON_PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_PROPERTIES__TEXT = 1;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_PROPERTIES__EDITABLE = 2;

  /**
   * The number of structural features of the '<em>Textarea Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTAREA_PROPERTIES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.TextfieldPropertiesImpl <em>Textfield Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.TextfieldPropertiesImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextfieldProperties()
   * @generated
   */
  int TEXTFIELD_PROPERTIES = 35;

  /**
   * The feature id for the '<em><b>Common Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_PROPERTIES__COMMON_PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_PROPERTIES__TEXT = 1;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_PROPERTIES__EDITABLE = 2;

  /**
   * The number of structural features of the '<em>Textfield Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTFIELD_PROPERTIES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelPropertiesImpl <em>Label Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.LabelPropertiesImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelProperties()
   * @generated
   */
  int LABEL_PROPERTIES = 36;

  /**
   * The feature id for the '<em><b>Common Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__COMMON_PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__TEXT = 1;

  /**
   * The number of structural features of the '<em>Label Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonPropertiesImpl <em>Button Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.ButtonPropertiesImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonProperties()
   * @generated
   */
  int BUTTON_PROPERTIES = 37;

  /**
   * The feature id for the '<em><b>Common Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_PROPERTIES__COMMON_PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_PROPERTIES__TEXT = 1;

  /**
   * The number of structural features of the '<em>Button Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl <em>Common Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl
   * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getCommonProperties()
   * @generated
   */
  int COMMON_PROPERTIES = 38;

  /**
   * The feature id for the '<em><b>Property Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_PROPERTIES__PROPERTY_KEY = 0;

  /**
   * The feature id for the '<em><b>Layout Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_PROPERTIES__LAYOUT_KEY = 1;

  /**
   * The feature id for the '<em><b>Interactiontype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_PROPERTIES__INTERACTIONTYPE = 2;

  /**
   * The number of structural features of the '<em>Common Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_PROPERTIES_FEATURE_COUNT = 3;


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
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.UIDescription#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Layout</em>'.
   * @see org.deg.xtext.gui.guiDSL.UIDescription#getLayout()
   * @see #getUIDescription()
   * @generated
   */
  EReference getUIDescription_Layout();

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
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TypeDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.TypeDefinition#getType()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Type();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Type#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.deg.xtext.gui.guiDSL.Type#getId()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Id();

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
   * Returns the meta object for the attribute list '{@link org.deg.xtext.gui.guiDSL.Property#getPropertiesFiles <em>Properties Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Properties Files</em>'.
   * @see org.deg.xtext.gui.guiDSL.Property#getPropertiesFiles()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_PropertiesFiles();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see org.deg.xtext.gui.guiDSL.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for the attribute list '{@link org.deg.xtext.gui.guiDSL.Layout#getLayoutFiles <em>Layout Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Layout Files</em>'.
   * @see org.deg.xtext.gui.guiDSL.Layout#getLayoutFiles()
   * @see #getLayout()
   * @generated
   */
  EAttribute getLayout_LayoutFiles();

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
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.ComplexComponent <em>Complex Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Component</em>'.
   * @see org.deg.xtext.gui.guiDSL.ComplexComponent
   * @generated
   */
  EClass getComplexComponent();

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
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TableRefinement <em>Table Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.TableRefinement
   * @generated
   */
  EClass getTableRefinement();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TableRefinement#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.TableRefinement#getInputType()
   * @see #getTableRefinement()
   * @generated
   */
  EAttribute getTableRefinement_InputType();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TableRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TableRefinement#getProperties()
   * @see #getTableRefinement()
   * @generated
   */
  EReference getTableRefinement_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TabViewRefinement <em>Tab View Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab View Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabViewRefinement
   * @generated
   */
  EClass getTabViewRefinement();

  /**
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.TabViewRefinement#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabViewRefinement#getTabs()
   * @see #getTabViewRefinement()
   * @generated
   */
  EReference getTabViewRefinement_Tabs();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TabViewRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabViewRefinement#getProperties()
   * @see #getTabViewRefinement()
   * @generated
   */
  EReference getTabViewRefinement_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TreeRefinement <em>Tree Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tree Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.TreeRefinement
   * @generated
   */
  EClass getTreeRefinement();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TreeRefinement#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.TreeRefinement#getInputType()
   * @see #getTreeRefinement()
   * @generated
   */
  EAttribute getTreeRefinement_InputType();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TreeRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TreeRefinement#getProperties()
   * @see #getTreeRefinement()
   * @generated
   */
  EReference getTreeRefinement_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.InterchangeableRefinement <em>Interchangeable Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interchangeable Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.InterchangeableRefinement
   * @generated
   */
  EClass getInterchangeableRefinement();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.InterchangeableRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.InterchangeableRefinement#getProperties()
   * @see #getInterchangeableRefinement()
   * @generated
   */
  EReference getInterchangeableRefinement_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TextareaRefinement <em>Textarea Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textarea Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaRefinement
   * @generated
   */
  EClass getTextareaRefinement();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TextareaRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaRefinement#getProperties()
   * @see #getTextareaRefinement()
   * @generated
   */
  EReference getTextareaRefinement_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TextfieldRefinement <em>Textfield Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textfield Refinement</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldRefinement
   * @generated
   */
  EClass getTextfieldRefinement();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TextfieldRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldRefinement#getProperties()
   * @see #getTextfieldRefinement()
   * @generated
   */
  EReference getTextfieldRefinement_Properties();

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
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.ButtonRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.ButtonRefinement#getProperties()
   * @see #getButtonRefinement()
   * @generated
   */
  EReference getButtonRefinement_Properties();

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
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.LabelRefinement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.LabelRefinement#getProperties()
   * @see #getLabelRefinement()
   * @generated
   */
  EReference getLabelRefinement_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TabViewDefinition <em>Tab View Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab View Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabViewDefinition
   * @generated
   */
  EClass getTabViewDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.TabViewDefinition#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabViewDefinition#getTabs()
   * @see #getTabViewDefinition()
   * @generated
   */
  EReference getTabViewDefinition_Tabs();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TabViewDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabViewDefinition#getProperties()
   * @see #getTabViewDefinition()
   * @generated
   */
  EReference getTabViewDefinition_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TabDefinition <em>Tab Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabDefinition
   * @generated
   */
  EClass getTabDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TabDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.TabDefinition#getName()
   * @see #getTabDefinition()
   * @generated
   */
  EAttribute getTabDefinition_Name();

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
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Multiselection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.deg.xtext.gui.guiDSL.Multiselection#getName()
   * @see #getMultiselection()
   * @generated
   */
  EAttribute getMultiselection_Name();

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
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TextfieldDefinition <em>Textfield Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textfield Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldDefinition
   * @generated
   */
  EClass getTextfieldDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TextfieldDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldDefinition#getProperties()
   * @see #getTextfieldDefinition()
   * @generated
   */
  EReference getTextfieldDefinition_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TextareaDefinition <em>Textarea Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textarea Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaDefinition
   * @generated
   */
  EClass getTextareaDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TextareaDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaDefinition#getProperties()
   * @see #getTextareaDefinition()
   * @generated
   */
  EReference getTextareaDefinition_Properties();

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
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TreeDefinition#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.TreeDefinition#getInputType()
   * @see #getTreeDefinition()
   * @generated
   */
  EAttribute getTreeDefinition_InputType();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TreeDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TreeDefinition#getProperties()
   * @see #getTreeDefinition()
   * @generated
   */
  EReference getTreeDefinition_Properties();

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
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TableDefinition#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Type</em>'.
   * @see org.deg.xtext.gui.guiDSL.TableDefinition#getInputType()
   * @see #getTableDefinition()
   * @generated
   */
  EAttribute getTableDefinition_InputType();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TableDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TableDefinition#getProperties()
   * @see #getTableDefinition()
   * @generated
   */
  EReference getTableDefinition_Properties();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.InterchangeableDefinition <em>Interchangeable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interchangeable Definition</em>'.
   * @see org.deg.xtext.gui.guiDSL.InterchangeableDefinition
   * @generated
   */
  EClass getInterchangeableDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.InterchangeableDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.InterchangeableDefinition#getProperties()
   * @see #getInterchangeableDefinition()
   * @generated
   */
  EReference getInterchangeableDefinition_Properties();

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
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.Interactiontype <em>Interactiontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactiontype</em>'.
   * @see org.deg.xtext.gui.guiDSL.Interactiontype
   * @generated
   */
  EClass getInteractiontype();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.Interactiontype#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.deg.xtext.gui.guiDSL.Interactiontype#getId()
   * @see #getInteractiontype()
   * @generated
   */
  EAttribute getInteractiontype_Id();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TextareaProperties <em>Textarea Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textarea Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaProperties
   * @generated
   */
  EClass getTextareaProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getCommonProperties <em>Common Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaProperties#getCommonProperties()
   * @see #getTextareaProperties()
   * @generated
   */
  EReference getTextareaProperties_CommonProperties();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaProperties#getText()
   * @see #getTextareaProperties()
   * @generated
   */
  EAttribute getTextareaProperties_Text();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TextareaProperties#getEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editable</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextareaProperties#getEditable()
   * @see #getTextareaProperties()
   * @generated
   */
  EAttribute getTextareaProperties_Editable();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.TextfieldProperties <em>Textfield Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textfield Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldProperties
   * @generated
   */
  EClass getTextfieldProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.TextfieldProperties#getCommonProperties <em>Common Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldProperties#getCommonProperties()
   * @see #getTextfieldProperties()
   * @generated
   */
  EReference getTextfieldProperties_CommonProperties();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TextfieldProperties#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldProperties#getText()
   * @see #getTextfieldProperties()
   * @generated
   */
  EAttribute getTextfieldProperties_Text();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.TextfieldProperties#getEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editable</em>'.
   * @see org.deg.xtext.gui.guiDSL.TextfieldProperties#getEditable()
   * @see #getTextfieldProperties()
   * @generated
   */
  EAttribute getTextfieldProperties_Editable();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.LabelProperties <em>Label Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.LabelProperties
   * @generated
   */
  EClass getLabelProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.LabelProperties#getCommonProperties <em>Common Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.LabelProperties#getCommonProperties()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_CommonProperties();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.LabelProperties#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.LabelProperties#getText()
   * @see #getLabelProperties()
   * @generated
   */
  EAttribute getLabelProperties_Text();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.ButtonProperties <em>Button Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.ButtonProperties
   * @generated
   */
  EClass getButtonProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.deg.xtext.gui.guiDSL.ButtonProperties#getCommonProperties <em>Common Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.ButtonProperties#getCommonProperties()
   * @see #getButtonProperties()
   * @generated
   */
  EReference getButtonProperties_CommonProperties();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.ButtonProperties#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.deg.xtext.gui.guiDSL.ButtonProperties#getText()
   * @see #getButtonProperties()
   * @generated
   */
  EAttribute getButtonProperties_Text();

  /**
   * Returns the meta object for class '{@link org.deg.xtext.gui.guiDSL.CommonProperties <em>Common Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Properties</em>'.
   * @see org.deg.xtext.gui.guiDSL.CommonProperties
   * @generated
   */
  EClass getCommonProperties();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.CommonProperties#getPropertyKey <em>Property Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Key</em>'.
   * @see org.deg.xtext.gui.guiDSL.CommonProperties#getPropertyKey()
   * @see #getCommonProperties()
   * @generated
   */
  EAttribute getCommonProperties_PropertyKey();

  /**
   * Returns the meta object for the attribute '{@link org.deg.xtext.gui.guiDSL.CommonProperties#getLayoutKey <em>Layout Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout Key</em>'.
   * @see org.deg.xtext.gui.guiDSL.CommonProperties#getLayoutKey()
   * @see #getCommonProperties()
   * @generated
   */
  EAttribute getCommonProperties_LayoutKey();

  /**
   * Returns the meta object for the containment reference list '{@link org.deg.xtext.gui.guiDSL.CommonProperties#getInteractiontype <em>Interactiontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactiontype</em>'.
   * @see org.deg.xtext.gui.guiDSL.CommonProperties#getInteractiontype()
   * @see #getCommonProperties()
   * @generated
   */
  EReference getCommonProperties_Interactiontype();

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
     * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_DESCRIPTION__LAYOUT = eINSTANCE.getUIDescription_Layout();

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
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TypeDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__TYPE = eINSTANCE.getTypeDefinition_Type();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TypeImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__ID = eINSTANCE.getType_Id();

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
     * The meta object literal for the '<em><b>Properties Files</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__PROPERTIES_FILES = eINSTANCE.getProperty_PropertiesFiles();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.LayoutImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '<em><b>Layout Files</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYOUT__LAYOUT_FILES = eINSTANCE.getLayout_LayoutFiles();

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
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl <em>Complex Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ComplexComponentImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getComplexComponent()
     * @generated
     */
    EClass COMPLEX_COMPONENT = eINSTANCE.getComplexComponent();

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
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TableRefinementImpl <em>Table Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TableRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTableRefinement()
     * @generated
     */
    EClass TABLE_REFINEMENT = eINSTANCE.getTableRefinement();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_REFINEMENT__INPUT_TYPE = eINSTANCE.getTableRefinement_InputType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_REFINEMENT__PROPERTIES = eINSTANCE.getTableRefinement_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TabViewRefinementImpl <em>Tab View Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TabViewRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTabViewRefinement()
     * @generated
     */
    EClass TAB_VIEW_REFINEMENT = eINSTANCE.getTabViewRefinement();

    /**
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_VIEW_REFINEMENT__TABS = eINSTANCE.getTabViewRefinement_Tabs();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_VIEW_REFINEMENT__PROPERTIES = eINSTANCE.getTabViewRefinement_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TreeRefinementImpl <em>Tree Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TreeRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTreeRefinement()
     * @generated
     */
    EClass TREE_REFINEMENT = eINSTANCE.getTreeRefinement();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREE_REFINEMENT__INPUT_TYPE = eINSTANCE.getTreeRefinement_InputType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREE_REFINEMENT__PROPERTIES = eINSTANCE.getTreeRefinement_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.InterchangeableRefinementImpl <em>Interchangeable Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.InterchangeableRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getInterchangeableRefinement()
     * @generated
     */
    EClass INTERCHANGEABLE_REFINEMENT = eINSTANCE.getInterchangeableRefinement();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERCHANGEABLE_REFINEMENT__PROPERTIES = eINSTANCE.getInterchangeableRefinement_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TextareaRefinementImpl <em>Textarea Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TextareaRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextareaRefinement()
     * @generated
     */
    EClass TEXTAREA_REFINEMENT = eINSTANCE.getTextareaRefinement();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXTAREA_REFINEMENT__PROPERTIES = eINSTANCE.getTextareaRefinement_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TextfieldRefinementImpl <em>Textfield Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TextfieldRefinementImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextfieldRefinement()
     * @generated
     */
    EClass TEXTFIELD_REFINEMENT = eINSTANCE.getTextfieldRefinement();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXTFIELD_REFINEMENT__PROPERTIES = eINSTANCE.getTextfieldRefinement_Properties();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_REFINEMENT__PROPERTIES = eINSTANCE.getButtonRefinement_Properties();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_REFINEMENT__PROPERTIES = eINSTANCE.getLabelRefinement_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TabViewDefinitionImpl <em>Tab View Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TabViewDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTabViewDefinition()
     * @generated
     */
    EClass TAB_VIEW_DEFINITION = eINSTANCE.getTabViewDefinition();

    /**
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_VIEW_DEFINITION__TABS = eINSTANCE.getTabViewDefinition_Tabs();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_VIEW_DEFINITION__PROPERTIES = eINSTANCE.getTabViewDefinition_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TabDefinitionImpl <em>Tab Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TabDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTabDefinition()
     * @generated
     */
    EClass TAB_DEFINITION = eINSTANCE.getTabDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB_DEFINITION__NAME = eINSTANCE.getTabDefinition_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTISELECTION__NAME = eINSTANCE.getMultiselection_Name();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTISELECTION__INPUT_TYPE = eINSTANCE.getMultiselection_InputType();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXTFIELD_DEFINITION__PROPERTIES = eINSTANCE.getTextfieldDefinition_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TextareaDefinitionImpl <em>Textarea Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TextareaDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextareaDefinition()
     * @generated
     */
    EClass TEXTAREA_DEFINITION = eINSTANCE.getTextareaDefinition();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXTAREA_DEFINITION__PROPERTIES = eINSTANCE.getTextareaDefinition_Properties();

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
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREE_DEFINITION__INPUT_TYPE = eINSTANCE.getTreeDefinition_InputType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREE_DEFINITION__PROPERTIES = eINSTANCE.getTreeDefinition_Properties();

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
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DEFINITION__INPUT_TYPE = eINSTANCE.getTableDefinition_InputType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_DEFINITION__PROPERTIES = eINSTANCE.getTableDefinition_Properties();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.InterchangeableDefinitionImpl <em>Interchangeable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.InterchangeableDefinitionImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getInterchangeableDefinition()
     * @generated
     */
    EClass INTERCHANGEABLE_DEFINITION = eINSTANCE.getInterchangeableDefinition();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERCHANGEABLE_DEFINITION__PROPERTIES = eINSTANCE.getInterchangeableDefinition_Properties();

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

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.InteractiontypeImpl <em>Interactiontype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.InteractiontypeImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getInteractiontype()
     * @generated
     */
    EClass INTERACTIONTYPE = eINSTANCE.getInteractiontype();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTIONTYPE__ID = eINSTANCE.getInteractiontype_Id();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TextareaPropertiesImpl <em>Textarea Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TextareaPropertiesImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextareaProperties()
     * @generated
     */
    EClass TEXTAREA_PROPERTIES = eINSTANCE.getTextareaProperties();

    /**
     * The meta object literal for the '<em><b>Common Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXTAREA_PROPERTIES__COMMON_PROPERTIES = eINSTANCE.getTextareaProperties_CommonProperties();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTAREA_PROPERTIES__TEXT = eINSTANCE.getTextareaProperties_Text();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTAREA_PROPERTIES__EDITABLE = eINSTANCE.getTextareaProperties_Editable();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.TextfieldPropertiesImpl <em>Textfield Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.TextfieldPropertiesImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getTextfieldProperties()
     * @generated
     */
    EClass TEXTFIELD_PROPERTIES = eINSTANCE.getTextfieldProperties();

    /**
     * The meta object literal for the '<em><b>Common Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXTFIELD_PROPERTIES__COMMON_PROPERTIES = eINSTANCE.getTextfieldProperties_CommonProperties();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTFIELD_PROPERTIES__TEXT = eINSTANCE.getTextfieldProperties_Text();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTFIELD_PROPERTIES__EDITABLE = eINSTANCE.getTextfieldProperties_Editable();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.LabelPropertiesImpl <em>Label Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.LabelPropertiesImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getLabelProperties()
     * @generated
     */
    EClass LABEL_PROPERTIES = eINSTANCE.getLabelProperties();

    /**
     * The meta object literal for the '<em><b>Common Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_PROPERTIES__COMMON_PROPERTIES = eINSTANCE.getLabelProperties_CommonProperties();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_PROPERTIES__TEXT = eINSTANCE.getLabelProperties_Text();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.ButtonPropertiesImpl <em>Button Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.ButtonPropertiesImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getButtonProperties()
     * @generated
     */
    EClass BUTTON_PROPERTIES = eINSTANCE.getButtonProperties();

    /**
     * The meta object literal for the '<em><b>Common Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_PROPERTIES__COMMON_PROPERTIES = eINSTANCE.getButtonProperties_CommonProperties();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_PROPERTIES__TEXT = eINSTANCE.getButtonProperties_Text();

    /**
     * The meta object literal for the '{@link org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl <em>Common Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.deg.xtext.gui.guiDSL.impl.CommonPropertiesImpl
     * @see org.deg.xtext.gui.guiDSL.impl.GuiDSLPackageImpl#getCommonProperties()
     * @generated
     */
    EClass COMMON_PROPERTIES = eINSTANCE.getCommonProperties();

    /**
     * The meta object literal for the '<em><b>Property Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMON_PROPERTIES__PROPERTY_KEY = eINSTANCE.getCommonProperties_PropertyKey();

    /**
     * The meta object literal for the '<em><b>Layout Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMON_PROPERTIES__LAYOUT_KEY = eINSTANCE.getCommonProperties_LayoutKey();

    /**
     * The meta object literal for the '<em><b>Interactiontype</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMON_PROPERTIES__INTERACTIONTYPE = eINSTANCE.getCommonProperties_Interactiontype();

  }

} //GuiDSLPackage
