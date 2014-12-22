/**
 */
package org.deg.xtext.gui.guiDSL.util;

import org.deg.xtext.gui.guiDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.deg.xtext.gui.guiDSL.GuiDSLPackage
 * @generated
 */
public class GuiDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GuiDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GuiDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuiDSLSwitch<Adapter> modelSwitch =
    new GuiDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseUIDescription(UIDescription object)
      {
        return createUIDescriptionAdapter();
      }
      @Override
      public Adapter caseinputType(inputType object)
      {
        return createinputTypeAdapter();
      }
      @Override
      public Adapter caseUsedDescriptions(UsedDescriptions object)
      {
        return createUsedDescriptionsAdapter();
      }
      @Override
      public Adapter caseAreaCount(AreaCount object)
      {
        return createAreaCountAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseUIDescriptionImport(UIDescriptionImport object)
      {
        return createUIDescriptionImportAdapter();
      }
      @Override
      public Adapter caseAreaAssignment(AreaAssignment object)
      {
        return createAreaAssignmentAdapter();
      }
      @Override
      public Adapter caseComponentDefinition(ComponentDefinition object)
      {
        return createComponentDefinitionAdapter();
      }
      @Override
      public Adapter caseMultiSelectionDefinition(MultiSelectionDefinition object)
      {
        return createMultiSelectionDefinitionAdapter();
      }
      @Override
      public Adapter caseCheckboxDefinition(CheckboxDefinition object)
      {
        return createCheckboxDefinitionAdapter();
      }
      @Override
      public Adapter caseRadioboxDefinition(RadioboxDefinition object)
      {
        return createRadioboxDefinitionAdapter();
      }
      @Override
      public Adapter caseTableDefinition(TableDefinition object)
      {
        return createTableDefinitionAdapter();
      }
      @Override
      public Adapter caseTreeDefinition(TreeDefinition object)
      {
        return createTreeDefinitionAdapter();
      }
      @Override
      public Adapter caseTextfieldDefinition(TextfieldDefinition object)
      {
        return createTextfieldDefinitionAdapter();
      }
      @Override
      public Adapter caseButtonDefinition(ButtonDefinition object)
      {
        return createButtonDefinitionAdapter();
      }
      @Override
      public Adapter caseInteraction(Interaction object)
      {
        return createInteractionAdapter();
      }
      @Override
      public Adapter caseLabelDefinition(LabelDefinition object)
      {
        return createLabelDefinitionAdapter();
      }
      @Override
      public Adapter caseUIAction(UIAction object)
      {
        return createUIActionAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseCommonProperty(CommonProperty object)
      {
        return createCommonPropertyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.UIDescription <em>UI Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.UIDescription
   * @generated
   */
  public Adapter createUIDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.inputType <em>input Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.inputType
   * @generated
   */
  public Adapter createinputTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.UsedDescriptions <em>Used Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.UsedDescriptions
   * @generated
   */
  public Adapter createUsedDescriptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.AreaCount <em>Area Count</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.AreaCount
   * @generated
   */
  public Adapter createAreaCountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.UIDescriptionImport <em>UI Description Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.UIDescriptionImport
   * @generated
   */
  public Adapter createUIDescriptionImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.AreaAssignment <em>Area Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.AreaAssignment
   * @generated
   */
  public Adapter createAreaAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.ComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.ComponentDefinition
   * @generated
   */
  public Adapter createComponentDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.MultiSelectionDefinition <em>Multi Selection Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.MultiSelectionDefinition
   * @generated
   */
  public Adapter createMultiSelectionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.CheckboxDefinition <em>Checkbox Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.CheckboxDefinition
   * @generated
   */
  public Adapter createCheckboxDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.RadioboxDefinition <em>Radiobox Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.RadioboxDefinition
   * @generated
   */
  public Adapter createRadioboxDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.TableDefinition
   * @generated
   */
  public Adapter createTableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.TreeDefinition <em>Tree Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.TreeDefinition
   * @generated
   */
  public Adapter createTreeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.TextfieldDefinition <em>Textfield Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.TextfieldDefinition
   * @generated
   */
  public Adapter createTextfieldDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.ButtonDefinition <em>Button Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.ButtonDefinition
   * @generated
   */
  public Adapter createButtonDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Interaction
   * @generated
   */
  public Adapter createInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.LabelDefinition <em>Label Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.LabelDefinition
   * @generated
   */
  public Adapter createLabelDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.UIAction <em>UI Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.UIAction
   * @generated
   */
  public Adapter createUIActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.CommonProperty <em>Common Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.CommonProperty
   * @generated
   */
  public Adapter createCommonPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GuiDSLAdapterFactory
