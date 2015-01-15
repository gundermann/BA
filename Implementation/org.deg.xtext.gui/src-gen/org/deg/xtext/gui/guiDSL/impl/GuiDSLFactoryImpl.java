/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiDSLFactoryImpl extends EFactoryImpl implements GuiDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GuiDSLFactory init()
  {
    try
    {
      GuiDSLFactory theGuiDSLFactory = (GuiDSLFactory)EPackage.Registry.INSTANCE.getEFactory(GuiDSLPackage.eNS_URI);
      if (theGuiDSLFactory != null)
      {
        return theGuiDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GuiDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GuiDSLPackage.UI_DESCRIPTION: return createUIDescription();
      case GuiDSLPackage.LAYOUT: return createLayout();
      case GuiDSLPackage.STRUCTURE: return createStructure();
      case GuiDSLPackage.ELEMENT: return createElement();
      case GuiDSLPackage.REFINEMENT: return createRefinement();
      case GuiDSLPackage.COMPONENT_REFINEMENT: return createComponentRefinement();
      case GuiDSLPackage.BUTTON_REFINEMENT: return createButtonRefinement();
      case GuiDSLPackage.LABEL_REFINEMENT: return createLabelRefinement();
      case GuiDSLPackage.PROPERTY: return createProperty();
      case GuiDSLPackage.USED_DESCRIPTIONS: return createUsedDescriptions();
      case GuiDSLPackage.DESCRIPTION_TYPE: return createDescriptionType();
      case GuiDSLPackage.DEFINITION: return createDefinition();
      case GuiDSLPackage.TYPE_DEFINITION: return createTypeDefinition();
      case GuiDSLPackage.TYPE: return createType();
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT: return createUIDescriptionImport();
      case GuiDSLPackage.COMPLEX_COMPONENT: return createComplexComponent();
      case GuiDSLPackage.TAB_VIEW_DEFINITION: return createTabViewDefinition();
      case GuiDSLPackage.TAB_DEFINITION: return createTabDefinition();
      case GuiDSLPackage.MULTISELECTION: return createMultiselection();
      case GuiDSLPackage.COMPONENT_DEFINITION: return createComponentDefinition();
      case GuiDSLPackage.TEXTFIELD_DEFINITION: return createTextfieldDefinition();
      case GuiDSLPackage.TEXTFIELD_PROPERTIES: return createTextfieldProperties();
      case GuiDSLPackage.TEXTAREA_DEFINITION: return createTextareaDefinition();
      case GuiDSLPackage.TEXTAREA_PROPERTIES: return createTextareaProperties();
      case GuiDSLPackage.TREE_DEFINITION: return createTreeDefinition();
      case GuiDSLPackage.TABLE_DEFINITION: return createTableDefinition();
      case GuiDSLPackage.INTERCHANGEABLE_DEFINITION: return createInterchangeableDefinition();
      case GuiDSLPackage.BUTTON_DEFINITION: return createButtonDefinition();
      case GuiDSLPackage.BUTTON_PROPERTIES: return createButtonProperties();
      case GuiDSLPackage.COMMON_PROPERTIES: return createCommonProperties();
      case GuiDSLPackage.LABEL_DEFINITION: return createLabelDefinition();
      case GuiDSLPackage.LABEL_PROPERTIES: return createLabelProperties();
      case GuiDSLPackage.INTERACTIONTYPE: return createInteractiontype();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIDescription createUIDescription()
  {
    UIDescriptionImpl uiDescription = new UIDescriptionImpl();
    return uiDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Structure createStructure()
  {
    StructureImpl structure = new StructureImpl();
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refinement createRefinement()
  {
    RefinementImpl refinement = new RefinementImpl();
    return refinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentRefinement createComponentRefinement()
  {
    ComponentRefinementImpl componentRefinement = new ComponentRefinementImpl();
    return componentRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonRefinement createButtonRefinement()
  {
    ButtonRefinementImpl buttonRefinement = new ButtonRefinementImpl();
    return buttonRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelRefinement createLabelRefinement()
  {
    LabelRefinementImpl labelRefinement = new LabelRefinementImpl();
    return labelRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsedDescriptions createUsedDescriptions()
  {
    UsedDescriptionsImpl usedDescriptions = new UsedDescriptionsImpl();
    return usedDescriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionType createDescriptionType()
  {
    DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
    return descriptionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIDescriptionImport createUIDescriptionImport()
  {
    UIDescriptionImportImpl uiDescriptionImport = new UIDescriptionImportImpl();
    return uiDescriptionImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexComponent createComplexComponent()
  {
    ComplexComponentImpl complexComponent = new ComplexComponentImpl();
    return complexComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabViewDefinition createTabViewDefinition()
  {
    TabViewDefinitionImpl tabViewDefinition = new TabViewDefinitionImpl();
    return tabViewDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabDefinition createTabDefinition()
  {
    TabDefinitionImpl tabDefinition = new TabDefinitionImpl();
    return tabDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiselection createMultiselection()
  {
    MultiselectionImpl multiselection = new MultiselectionImpl();
    return multiselection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition createComponentDefinition()
  {
    ComponentDefinitionImpl componentDefinition = new ComponentDefinitionImpl();
    return componentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextfieldDefinition createTextfieldDefinition()
  {
    TextfieldDefinitionImpl textfieldDefinition = new TextfieldDefinitionImpl();
    return textfieldDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextfieldProperties createTextfieldProperties()
  {
    TextfieldPropertiesImpl textfieldProperties = new TextfieldPropertiesImpl();
    return textfieldProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextareaDefinition createTextareaDefinition()
  {
    TextareaDefinitionImpl textareaDefinition = new TextareaDefinitionImpl();
    return textareaDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextareaProperties createTextareaProperties()
  {
    TextareaPropertiesImpl textareaProperties = new TextareaPropertiesImpl();
    return textareaProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreeDefinition createTreeDefinition()
  {
    TreeDefinitionImpl treeDefinition = new TreeDefinitionImpl();
    return treeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition createTableDefinition()
  {
    TableDefinitionImpl tableDefinition = new TableDefinitionImpl();
    return tableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterchangeableDefinition createInterchangeableDefinition()
  {
    InterchangeableDefinitionImpl interchangeableDefinition = new InterchangeableDefinitionImpl();
    return interchangeableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonDefinition createButtonDefinition()
  {
    ButtonDefinitionImpl buttonDefinition = new ButtonDefinitionImpl();
    return buttonDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonProperties createButtonProperties()
  {
    ButtonPropertiesImpl buttonProperties = new ButtonPropertiesImpl();
    return buttonProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonProperties createCommonProperties()
  {
    CommonPropertiesImpl commonProperties = new CommonPropertiesImpl();
    return commonProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelDefinition createLabelDefinition()
  {
    LabelDefinitionImpl labelDefinition = new LabelDefinitionImpl();
    return labelDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelProperties createLabelProperties()
  {
    LabelPropertiesImpl labelProperties = new LabelPropertiesImpl();
    return labelProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interactiontype createInteractiontype()
  {
    InteractiontypeImpl interactiontype = new InteractiontypeImpl();
    return interactiontype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDSLPackage getGuiDSLPackage()
  {
    return (GuiDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GuiDSLPackage getPackage()
  {
    return GuiDSLPackage.eINSTANCE;
  }

} //GuiDSLFactoryImpl
