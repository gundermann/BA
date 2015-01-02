/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.AreaAssignment;
import org.deg.xtext.gui.guiDSL.AreaCount;
import org.deg.xtext.gui.guiDSL.ButtonDefinition;
import org.deg.xtext.gui.guiDSL.ButtonRefinement;
import org.deg.xtext.gui.guiDSL.ComplexComponent;
import org.deg.xtext.gui.guiDSL.ComponentDefinition;
import org.deg.xtext.gui.guiDSL.ComponentRefinement;
import org.deg.xtext.gui.guiDSL.Definition;
import org.deg.xtext.gui.guiDSL.DescriptionType;
import org.deg.xtext.gui.guiDSL.GuiDSLFactory;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.LabelDefinition;
import org.deg.xtext.gui.guiDSL.LabelRefinement;
import org.deg.xtext.gui.guiDSL.Multiselection;
import org.deg.xtext.gui.guiDSL.Properties;
import org.deg.xtext.gui.guiDSL.Property;
import org.deg.xtext.gui.guiDSL.Refinement;
import org.deg.xtext.gui.guiDSL.TypeDefinition;
import org.deg.xtext.gui.guiDSL.UIDescription;
import org.deg.xtext.gui.guiDSL.UIDescriptionImport;
import org.deg.xtext.gui.guiDSL.UsedDescriptions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiDSLPackageImpl extends EPackageImpl implements GuiDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usedDescriptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass areaCountEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiDescriptionImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiselectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass areaAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelDefinitionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GuiDSLPackageImpl()
  {
    super(eNS_URI, GuiDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GuiDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GuiDSLPackage init()
  {
    if (isInited) return (GuiDSLPackage)EPackage.Registry.INSTANCE.getEPackage(GuiDSLPackage.eNS_URI);

    // Obtain or create and register package
    GuiDSLPackageImpl theGuiDSLPackage = (GuiDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuiDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuiDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGuiDSLPackage.createPackageContents();

    // Initialize created meta-data
    theGuiDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGuiDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GuiDSLPackage.eNS_URI, theGuiDSLPackage);
    return theGuiDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIDescription()
  {
    return uiDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIDescription_AreaCount()
  {
    return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIDescription_TypeDefinition()
  {
    return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIDescription_Property()
  {
    return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIDescription_UsedDescriptions()
  {
    return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIDescription_Refinements()
  {
    return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIDescription_Definitions()
  {
    return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIDescription_Areas()
  {
    return (EReference)uiDescriptionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefinement()
  {
    return refinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefinement_ConcreteRefinement()
  {
    return (EReference)refinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentRefinement()
  {
    return componentRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefinement_Type()
  {
    return (EAttribute)componentRefinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentRefinement_Name()
  {
    return (EAttribute)componentRefinementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentRefinement_Properties()
  {
    return (EReference)componentRefinementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonRefinement()
  {
    return buttonRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelRefinement()
  {
    return labelRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_PropertiesFile()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsedDescriptions()
  {
    return usedDescriptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsedDescriptions_Description()
  {
    return (EReference)usedDescriptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsedDescriptions_LocalName()
  {
    return (EAttribute)usedDescriptionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescriptionType()
  {
    return descriptionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAreaCount()
  {
    return areaCountEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAreaCount_AreaCount()
  {
    return (EAttribute)areaCountEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_ConcreteDefition()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDefinition()
  {
    return typeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDefinition_Type()
  {
    return (EAttribute)typeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIDescriptionImport()
  {
    return uiDescriptionImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUIDescriptionImport_DescriptionName()
  {
    return (EAttribute)uiDescriptionImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexComponent()
  {
    return complexComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiselection()
  {
    return multiselectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiselection_DescriptionName()
  {
    return (EAttribute)multiselectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiselection_InputType()
  {
    return (EAttribute)multiselectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAreaAssignment()
  {
    return areaAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAreaAssignment_Area()
  {
    return (EAttribute)areaAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAreaAssignment_Elements()
  {
    return (EAttribute)areaAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentDefinition()
  {
    return componentDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDefinition_Type()
  {
    return (EAttribute)componentDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentDefinition_Name()
  {
    return (EAttribute)componentDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDefinition_Properties()
  {
    return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonDefinition()
  {
    return buttonDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperties()
  {
    return propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperties_PropertyKey()
  {
    return (EAttribute)propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperties_Text()
  {
    return (EAttribute)propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperties_Interactiontype()
  {
    return (EAttribute)propertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelDefinition()
  {
    return labelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDSLFactory getGuiDSLFactory()
  {
    return (GuiDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    uiDescriptionEClass = createEClass(UI_DESCRIPTION);
    createEReference(uiDescriptionEClass, UI_DESCRIPTION__AREA_COUNT);
    createEReference(uiDescriptionEClass, UI_DESCRIPTION__TYPE_DEFINITION);
    createEReference(uiDescriptionEClass, UI_DESCRIPTION__PROPERTY);
    createEReference(uiDescriptionEClass, UI_DESCRIPTION__USED_DESCRIPTIONS);
    createEReference(uiDescriptionEClass, UI_DESCRIPTION__REFINEMENTS);
    createEReference(uiDescriptionEClass, UI_DESCRIPTION__DEFINITIONS);
    createEReference(uiDescriptionEClass, UI_DESCRIPTION__AREAS);

    refinementEClass = createEClass(REFINEMENT);
    createEReference(refinementEClass, REFINEMENT__CONCRETE_REFINEMENT);

    componentRefinementEClass = createEClass(COMPONENT_REFINEMENT);
    createEAttribute(componentRefinementEClass, COMPONENT_REFINEMENT__TYPE);
    createEAttribute(componentRefinementEClass, COMPONENT_REFINEMENT__NAME);
    createEReference(componentRefinementEClass, COMPONENT_REFINEMENT__PROPERTIES);

    buttonRefinementEClass = createEClass(BUTTON_REFINEMENT);

    labelRefinementEClass = createEClass(LABEL_REFINEMENT);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__PROPERTIES_FILE);

    usedDescriptionsEClass = createEClass(USED_DESCRIPTIONS);
    createEReference(usedDescriptionsEClass, USED_DESCRIPTIONS__DESCRIPTION);
    createEAttribute(usedDescriptionsEClass, USED_DESCRIPTIONS__LOCAL_NAME);

    descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);

    areaCountEClass = createEClass(AREA_COUNT);
    createEAttribute(areaCountEClass, AREA_COUNT__AREA_COUNT);

    definitionEClass = createEClass(DEFINITION);
    createEReference(definitionEClass, DEFINITION__CONCRETE_DEFITION);

    typeDefinitionEClass = createEClass(TYPE_DEFINITION);
    createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__TYPE);

    uiDescriptionImportEClass = createEClass(UI_DESCRIPTION_IMPORT);
    createEAttribute(uiDescriptionImportEClass, UI_DESCRIPTION_IMPORT__DESCRIPTION_NAME);

    complexComponentEClass = createEClass(COMPLEX_COMPONENT);

    multiselectionEClass = createEClass(MULTISELECTION);
    createEAttribute(multiselectionEClass, MULTISELECTION__DESCRIPTION_NAME);
    createEAttribute(multiselectionEClass, MULTISELECTION__INPUT_TYPE);

    areaAssignmentEClass = createEClass(AREA_ASSIGNMENT);
    createEAttribute(areaAssignmentEClass, AREA_ASSIGNMENT__AREA);
    createEAttribute(areaAssignmentEClass, AREA_ASSIGNMENT__ELEMENTS);

    componentDefinitionEClass = createEClass(COMPONENT_DEFINITION);
    createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__TYPE);
    createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__NAME);
    createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__PROPERTIES);

    buttonDefinitionEClass = createEClass(BUTTON_DEFINITION);

    propertiesEClass = createEClass(PROPERTIES);
    createEAttribute(propertiesEClass, PROPERTIES__PROPERTY_KEY);
    createEAttribute(propertiesEClass, PROPERTIES__TEXT);
    createEAttribute(propertiesEClass, PROPERTIES__INTERACTIONTYPE);

    labelDefinitionEClass = createEClass(LABEL_DEFINITION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    buttonRefinementEClass.getESuperTypes().add(this.getComponentRefinement());
    labelRefinementEClass.getESuperTypes().add(this.getComponentRefinement());
    uiDescriptionImportEClass.getESuperTypes().add(this.getDescriptionType());
    complexComponentEClass.getESuperTypes().add(this.getDescriptionType());
    multiselectionEClass.getESuperTypes().add(this.getComplexComponent());
    buttonDefinitionEClass.getESuperTypes().add(this.getComponentDefinition());
    labelDefinitionEClass.getESuperTypes().add(this.getComponentDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(uiDescriptionEClass, UIDescription.class, "UIDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIDescription_AreaCount(), this.getAreaCount(), null, "areaCount", null, 0, 1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIDescription_TypeDefinition(), this.getTypeDefinition(), null, "typeDefinition", null, 0, 1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIDescription_Property(), this.getProperty(), null, "property", null, 0, 1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIDescription_UsedDescriptions(), this.getUsedDescriptions(), null, "usedDescriptions", null, 0, -1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIDescription_Refinements(), this.getRefinement(), null, "refinements", null, 0, -1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIDescription_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIDescription_Areas(), this.getAreaAssignment(), null, "areas", null, 0, -1, UIDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refinementEClass, Refinement.class, "Refinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefinement_ConcreteRefinement(), this.getComponentRefinement(), null, "concreteRefinement", null, 0, 1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentRefinementEClass, ComponentRefinement.class, "ComponentRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentRefinement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ComponentRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentRefinement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentRefinement_Properties(), this.getProperties(), null, "properties", null, 0, 1, ComponentRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonRefinementEClass, ButtonRefinement.class, "ButtonRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelRefinementEClass, LabelRefinement.class, "LabelRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_PropertiesFile(), ecorePackage.getEString(), "propertiesFile", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usedDescriptionsEClass, UsedDescriptions.class, "UsedDescriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUsedDescriptions_Description(), this.getDescriptionType(), null, "description", null, 0, 1, UsedDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUsedDescriptions_LocalName(), ecorePackage.getEString(), "localName", null, 0, 1, UsedDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(areaCountEClass, AreaCount.class, "AreaCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAreaCount_AreaCount(), ecorePackage.getEInt(), "areaCount", null, 0, 1, AreaCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinition_ConcreteDefition(), this.getComponentDefinition(), null, "concreteDefition", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiDescriptionImportEClass, UIDescriptionImport.class, "UIDescriptionImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUIDescriptionImport_DescriptionName(), ecorePackage.getEString(), "descriptionName", null, 0, 1, UIDescriptionImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexComponentEClass, ComplexComponent.class, "ComplexComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiselectionEClass, Multiselection.class, "Multiselection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiselection_DescriptionName(), ecorePackage.getEString(), "descriptionName", null, 0, 1, Multiselection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiselection_InputType(), ecorePackage.getEString(), "inputType", null, 0, 1, Multiselection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(areaAssignmentEClass, AreaAssignment.class, "AreaAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAreaAssignment_Area(), ecorePackage.getEInt(), "area", null, 0, 1, AreaAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAreaAssignment_Elements(), ecorePackage.getEString(), "elements", null, 0, -1, AreaAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentDefinitionEClass, ComponentDefinition.class, "ComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDefinition_Properties(), this.getProperties(), null, "properties", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonDefinitionEClass, ButtonDefinition.class, "ButtonDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperties_PropertyKey(), ecorePackage.getEString(), "propertyKey", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperties_Text(), ecorePackage.getEString(), "text", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperties_Interactiontype(), ecorePackage.getEString(), "interactiontype", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelDefinitionEClass, LabelDefinition.class, "LabelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GuiDSLPackageImpl
