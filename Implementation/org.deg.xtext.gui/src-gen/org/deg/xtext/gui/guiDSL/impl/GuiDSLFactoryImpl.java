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
      case GuiDSLPackage.PROPERTY: return createProperty();
      case GuiDSLPackage.USED_DESCRIPTIONS: return createUsedDescriptions();
      case GuiDSLPackage.AREA_COUNT: return createAreaCount();
      case GuiDSLPackage.DEFINITION: return createDefinition();
      case GuiDSLPackage.TYPE_DEFINITION: return createTypeDefinition();
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT: return createUIDescriptionImport();
      case GuiDSLPackage.COMPLEX_COMPONENT: return createcomplexComponent();
      case GuiDSLPackage.MULTISELECTION: return createMultiselection();
      case GuiDSLPackage.AREA_ASSIGNMENT: return createAreaAssignment();
      case GuiDSLPackage.COMPONENT_DEFINITION: return createComponentDefinition();
      case GuiDSLPackage.CHECKBOX_DEFINITION: return createCheckboxDefinition();
      case GuiDSLPackage.RADIOBOX_DEFINITION: return createRadioboxDefinition();
      case GuiDSLPackage.TABLE_DEFINITION: return createTableDefinition();
      case GuiDSLPackage.TREE_DEFINITION: return createTreeDefinition();
      case GuiDSLPackage.TEXTFIELD_DEFINITION: return createTextfieldDefinition();
      case GuiDSLPackage.BUTTON_DEFINITION: return createButtonDefinition();
      case GuiDSLPackage.INTERACTION: return createInteraction();
      case GuiDSLPackage.LABEL_DEFINITION: return createLabelDefinition();
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
  public AreaCount createAreaCount()
  {
    AreaCountImpl areaCount = new AreaCountImpl();
    return areaCount;
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
  public complexComponent createcomplexComponent()
  {
    complexComponentImpl complexComponent = new complexComponentImpl();
    return complexComponent;
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
  public AreaAssignment createAreaAssignment()
  {
    AreaAssignmentImpl areaAssignment = new AreaAssignmentImpl();
    return areaAssignment;
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
  public CheckboxDefinition createCheckboxDefinition()
  {
    CheckboxDefinitionImpl checkboxDefinition = new CheckboxDefinitionImpl();
    return checkboxDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadioboxDefinition createRadioboxDefinition()
  {
    RadioboxDefinitionImpl radioboxDefinition = new RadioboxDefinitionImpl();
    return radioboxDefinition;
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
  public Interaction createInteraction()
  {
    InteractionImpl interaction = new InteractionImpl();
    return interaction;
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
