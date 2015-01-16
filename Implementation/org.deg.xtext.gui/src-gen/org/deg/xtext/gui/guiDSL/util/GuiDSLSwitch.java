/**
 */
package org.deg.xtext.gui.guiDSL.util;

import org.deg.xtext.gui.guiDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage
 * @generated
 */
public class GuiDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GuiDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GuiDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GuiDSLPackage.UI_DESCRIPTION:
      {
        UIDescription uiDescription = (UIDescription)theEObject;
        T result = caseUIDescription(uiDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.USED_DESCRIPTIONS:
      {
        UsedDescriptions usedDescriptions = (UsedDescriptions)theEObject;
        T result = caseUsedDescriptions(usedDescriptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.DESCRIPTION_TYPE:
      {
        DescriptionType descriptionType = (DescriptionType)theEObject;
        T result = caseDescriptionType(descriptionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.COMPLEX_COMPONENT:
      {
        ComplexComponent complexComponent = (ComplexComponent)theEObject;
        T result = caseComplexComponent(complexComponent);
        if (result == null) result = caseDescriptionType(complexComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT:
      {
        UIDescriptionImport uiDescriptionImport = (UIDescriptionImport)theEObject;
        T result = caseUIDescriptionImport(uiDescriptionImport);
        if (result == null) result = caseDescriptionType(uiDescriptionImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.REFINEMENT:
      {
        Refinement refinement = (Refinement)theEObject;
        T result = caseRefinement(refinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.COMPONENT_REFINEMENT:
      {
        ComponentRefinement componentRefinement = (ComponentRefinement)theEObject;
        T result = caseComponentRefinement(componentRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.COMPONENT_DEFINITION:
      {
        ComponentDefinition componentDefinition = (ComponentDefinition)theEObject;
        T result = caseComponentDefinition(componentDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.STRUCTURE:
      {
        Structure structure = (Structure)theEObject;
        T result = caseStructure(structure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TABLE_REFINEMENT:
      {
        TableRefinement tableRefinement = (TableRefinement)theEObject;
        T result = caseTableRefinement(tableRefinement);
        if (result == null) result = caseComponentRefinement(tableRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TAB_VIEW_REFINEMENT:
      {
        TabViewRefinement tabViewRefinement = (TabViewRefinement)theEObject;
        T result = caseTabViewRefinement(tabViewRefinement);
        if (result == null) result = caseComponentRefinement(tabViewRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TREE_REFINEMENT:
      {
        TreeRefinement treeRefinement = (TreeRefinement)theEObject;
        T result = caseTreeRefinement(treeRefinement);
        if (result == null) result = caseComponentRefinement(treeRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.INTERCHANGEABLE_REFINEMENT:
      {
        InterchangeableRefinement interchangeableRefinement = (InterchangeableRefinement)theEObject;
        T result = caseInterchangeableRefinement(interchangeableRefinement);
        if (result == null) result = caseComponentRefinement(interchangeableRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TEXTAREA_REFINEMENT:
      {
        TextareaRefinement textareaRefinement = (TextareaRefinement)theEObject;
        T result = caseTextareaRefinement(textareaRefinement);
        if (result == null) result = caseComponentRefinement(textareaRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TEXTFIELD_REFINEMENT:
      {
        TextfieldRefinement textfieldRefinement = (TextfieldRefinement)theEObject;
        T result = caseTextfieldRefinement(textfieldRefinement);
        if (result == null) result = caseComponentRefinement(textfieldRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.BUTTON_REFINEMENT:
      {
        ButtonRefinement buttonRefinement = (ButtonRefinement)theEObject;
        T result = caseButtonRefinement(buttonRefinement);
        if (result == null) result = caseComponentRefinement(buttonRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.LABEL_REFINEMENT:
      {
        LabelRefinement labelRefinement = (LabelRefinement)theEObject;
        T result = caseLabelRefinement(labelRefinement);
        if (result == null) result = caseComponentRefinement(labelRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TAB_VIEW_DEFINITION:
      {
        TabViewDefinition tabViewDefinition = (TabViewDefinition)theEObject;
        T result = caseTabViewDefinition(tabViewDefinition);
        if (result == null) result = caseComponentDefinition(tabViewDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TAB_DEFINITION:
      {
        TabDefinition tabDefinition = (TabDefinition)theEObject;
        T result = caseTabDefinition(tabDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.MULTISELECTION:
      {
        Multiselection multiselection = (Multiselection)theEObject;
        T result = caseMultiselection(multiselection);
        if (result == null) result = caseComplexComponent(multiselection);
        if (result == null) result = caseDescriptionType(multiselection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TEXTFIELD_DEFINITION:
      {
        TextfieldDefinition textfieldDefinition = (TextfieldDefinition)theEObject;
        T result = caseTextfieldDefinition(textfieldDefinition);
        if (result == null) result = caseComponentDefinition(textfieldDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TEXTAREA_DEFINITION:
      {
        TextareaDefinition textareaDefinition = (TextareaDefinition)theEObject;
        T result = caseTextareaDefinition(textareaDefinition);
        if (result == null) result = caseComponentDefinition(textareaDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TREE_DEFINITION:
      {
        TreeDefinition treeDefinition = (TreeDefinition)theEObject;
        T result = caseTreeDefinition(treeDefinition);
        if (result == null) result = caseComponentDefinition(treeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TABLE_DEFINITION:
      {
        TableDefinition tableDefinition = (TableDefinition)theEObject;
        T result = caseTableDefinition(tableDefinition);
        if (result == null) result = caseComponentDefinition(tableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.INTERCHANGEABLE_DEFINITION:
      {
        InterchangeableDefinition interchangeableDefinition = (InterchangeableDefinition)theEObject;
        T result = caseInterchangeableDefinition(interchangeableDefinition);
        if (result == null) result = caseComponentDefinition(interchangeableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.BUTTON_DEFINITION:
      {
        ButtonDefinition buttonDefinition = (ButtonDefinition)theEObject;
        T result = caseButtonDefinition(buttonDefinition);
        if (result == null) result = caseComponentDefinition(buttonDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.LABEL_DEFINITION:
      {
        LabelDefinition labelDefinition = (LabelDefinition)theEObject;
        T result = caseLabelDefinition(labelDefinition);
        if (result == null) result = caseComponentDefinition(labelDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.INTERACTIONTYPE:
      {
        Interactiontype interactiontype = (Interactiontype)theEObject;
        T result = caseInteractiontype(interactiontype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TEXTAREA_PROPERTIES:
      {
        TextareaProperties textareaProperties = (TextareaProperties)theEObject;
        T result = caseTextareaProperties(textareaProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.TEXTFIELD_PROPERTIES:
      {
        TextfieldProperties textfieldProperties = (TextfieldProperties)theEObject;
        T result = caseTextfieldProperties(textfieldProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.LABEL_PROPERTIES:
      {
        LabelProperties labelProperties = (LabelProperties)theEObject;
        T result = caseLabelProperties(labelProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.BUTTON_PROPERTIES:
      {
        ButtonProperties buttonProperties = (ButtonProperties)theEObject;
        T result = caseButtonProperties(buttonProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.COMMON_PROPERTIES:
      {
        CommonProperties commonProperties = (CommonProperties)theEObject;
        T result = caseCommonProperties(commonProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIDescription(UIDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Used Descriptions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Used Descriptions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsedDescriptions(UsedDescriptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescriptionType(DescriptionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexComponent(ComplexComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Description Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Description Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIDescriptionImport(UIDescriptionImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefinement(Refinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentRefinement(ComponentRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentDefinition(ComponentDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructure(Structure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableRefinement(TableRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab View Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab View Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabViewRefinement(TabViewRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreeRefinement(TreeRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interchangeable Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interchangeable Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterchangeableRefinement(InterchangeableRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Textarea Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Textarea Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextareaRefinement(TextareaRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Textfield Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Textfield Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextfieldRefinement(TextfieldRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonRefinement(ButtonRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelRefinement(LabelRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab View Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab View Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabViewDefinition(TabViewDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabDefinition(TabDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiselection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiselection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiselection(Multiselection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Textfield Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Textfield Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextfieldDefinition(TextfieldDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Textarea Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Textarea Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextareaDefinition(TextareaDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreeDefinition(TreeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableDefinition(TableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interchangeable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interchangeable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterchangeableDefinition(InterchangeableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonDefinition(ButtonDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelDefinition(LabelDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactiontype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactiontype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractiontype(Interactiontype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Textarea Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Textarea Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextareaProperties(TextareaProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Textfield Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Textfield Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextfieldProperties(TextfieldProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelProperties(LabelProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonProperties(ButtonProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Common Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonProperties(CommonProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GuiDSLSwitch
