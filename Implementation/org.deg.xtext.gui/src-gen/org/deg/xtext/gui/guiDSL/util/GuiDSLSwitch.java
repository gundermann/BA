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
      case GuiDSLPackage.INPUT_TYPE:
      {
        inputType inputType = (inputType)theEObject;
        T result = caseinputType(inputType);
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
      case GuiDSLPackage.AREA_COUNT:
      {
        AreaCount areaCount = (AreaCount)theEObject;
        T result = caseAreaCount(areaCount);
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
      case GuiDSLPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.UI_DESCRIPTION_IMPORT:
      {
        UIDescriptionImport uiDescriptionImport = (UIDescriptionImport)theEObject;
        T result = caseUIDescriptionImport(uiDescriptionImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.AREA_ASSIGNMENT:
      {
        AreaAssignment areaAssignment = (AreaAssignment)theEObject;
        T result = caseAreaAssignment(areaAssignment);
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
      case GuiDSLPackage.MULTI_SELECTION_DEFINITION:
      {
        MultiSelectionDefinition multiSelectionDefinition = (MultiSelectionDefinition)theEObject;
        T result = caseMultiSelectionDefinition(multiSelectionDefinition);
        if (result == null) result = caseComponentDefinition(multiSelectionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.CHECKBOX_DEFINITION:
      {
        CheckboxDefinition checkboxDefinition = (CheckboxDefinition)theEObject;
        T result = caseCheckboxDefinition(checkboxDefinition);
        if (result == null) result = caseComponentDefinition(checkboxDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.RADIOBOX_DEFINITION:
      {
        RadioboxDefinition radioboxDefinition = (RadioboxDefinition)theEObject;
        T result = caseRadioboxDefinition(radioboxDefinition);
        if (result == null) result = caseComponentDefinition(radioboxDefinition);
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
      case GuiDSLPackage.TREE_DEFINITION:
      {
        TreeDefinition treeDefinition = (TreeDefinition)theEObject;
        T result = caseTreeDefinition(treeDefinition);
        if (result == null) result = caseComponentDefinition(treeDefinition);
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
      case GuiDSLPackage.BUTTON_DEFINITION:
      {
        ButtonDefinition buttonDefinition = (ButtonDefinition)theEObject;
        T result = caseButtonDefinition(buttonDefinition);
        if (result == null) result = caseComponentDefinition(buttonDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GuiDSLPackage.INTERACTION:
      {
        Interaction interaction = (Interaction)theEObject;
        T result = caseInteraction(interaction);
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
      case GuiDSLPackage.UI_ACTION:
      {
        UIAction uiAction = (UIAction)theEObject;
        T result = caseUIAction(uiAction);
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
      case GuiDSLPackage.COMMON_PROPERTY:
      {
        CommonProperty commonProperty = (CommonProperty)theEObject;
        T result = caseCommonProperty(commonProperty);
        if (result == null) result = caseProperty(commonProperty);
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
   * Returns the result of interpreting the object as an instance of '<em>input Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>input Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinputType(inputType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Area Count</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Area Count</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAreaCount(AreaCount object)
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
   * Returns the result of interpreting the object as an instance of '<em>Area Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Area Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAreaAssignment(AreaAssignment object)
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
   * Returns the result of interpreting the object as an instance of '<em>Multi Selection Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Selection Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiSelectionDefinition(MultiSelectionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkbox Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkbox Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckboxDefinition(CheckboxDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radiobox Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radiobox Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioboxDefinition(RadioboxDefinition object)
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
   * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteraction(Interaction object)
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
   * Returns the result of interpreting the object as an instance of '<em>UI Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIAction(UIAction object)
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
   * Returns the result of interpreting the object as an instance of '<em>Common Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonProperty(CommonProperty object)
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
