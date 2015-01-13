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
      public Adapter caseStructure(Structure object)
      {
        return createStructureAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseRefinement(Refinement object)
      {
        return createRefinementAdapter();
      }
      @Override
      public Adapter caseComponentRefinement(ComponentRefinement object)
      {
        return createComponentRefinementAdapter();
      }
      @Override
      public Adapter caseButtonRefinement(ButtonRefinement object)
      {
        return createButtonRefinementAdapter();
      }
      @Override
      public Adapter caseLabelRefinement(LabelRefinement object)
      {
        return createLabelRefinementAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseUsedDescriptions(UsedDescriptions object)
      {
        return createUsedDescriptionsAdapter();
      }
      @Override
      public Adapter caseDescriptionType(DescriptionType object)
      {
        return createDescriptionTypeAdapter();
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
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseUIDescriptionImport(UIDescriptionImport object)
      {
        return createUIDescriptionImportAdapter();
      }
      @Override
      public Adapter caseComplexComponent(ComplexComponent object)
      {
        return createComplexComponentAdapter();
      }
      @Override
      public Adapter caseTabView(TabView object)
      {
        return createTabViewAdapter();
      }
      @Override
      public Adapter caseTabDefinition(TabDefinition object)
      {
        return createTabDefinitionAdapter();
      }
      @Override
      public Adapter caseMultiselection(Multiselection object)
      {
        return createMultiselectionAdapter();
      }
      @Override
      public Adapter caseComponentDefinition(ComponentDefinition object)
      {
        return createComponentDefinitionAdapter();
      }
      @Override
      public Adapter caseButtonDefinition(ButtonDefinition object)
      {
        return createButtonDefinitionAdapter();
      }
      @Override
      public Adapter caseProperties(Properties object)
      {
        return createPropertiesAdapter();
      }
      @Override
      public Adapter casePropertiesDefinition(PropertiesDefinition object)
      {
        return createPropertiesDefinitionAdapter();
      }
      @Override
      public Adapter caseLabelDefinition(LabelDefinition object)
      {
        return createLabelDefinitionAdapter();
      }
      @Override
      public Adapter caseInteractiontype(Interactiontype object)
      {
        return createInteractiontypeAdapter();
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
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Structure
   * @generated
   */
  public Adapter createStructureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Refinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Refinement
   * @generated
   */
  public Adapter createRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.ComponentRefinement <em>Component Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.ComponentRefinement
   * @generated
   */
  public Adapter createComponentRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.ButtonRefinement <em>Button Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.ButtonRefinement
   * @generated
   */
  public Adapter createButtonRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.LabelRefinement <em>Label Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.LabelRefinement
   * @generated
   */
  public Adapter createLabelRefinementAdapter()
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
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.DescriptionType <em>Description Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.DescriptionType
   * @generated
   */
  public Adapter createDescriptionTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Type
   * @generated
   */
  public Adapter createTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.ComplexComponent <em>Complex Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.ComplexComponent
   * @generated
   */
  public Adapter createComplexComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.TabView <em>Tab View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.TabView
   * @generated
   */
  public Adapter createTabViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.TabDefinition <em>Tab Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.TabDefinition
   * @generated
   */
  public Adapter createTabDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Multiselection <em>Multiselection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Multiselection
   * @generated
   */
  public Adapter createMultiselectionAdapter()
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
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Properties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Properties
   * @generated
   */
  public Adapter createPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.PropertiesDefinition <em>Properties Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.PropertiesDefinition
   * @generated
   */
  public Adapter createPropertiesDefinitionAdapter()
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
   * Creates a new adapter for an object of class '{@link org.deg.xtext.gui.guiDSL.Interactiontype <em>Interactiontype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.deg.xtext.gui.guiDSL.Interactiontype
   * @generated
   */
  public Adapter createInteractiontypeAdapter()
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
