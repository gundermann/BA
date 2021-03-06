/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import java.util.Collection;

import org.deg.xtext.gui.guiDSL.Definition;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Layout;
import org.deg.xtext.gui.guiDSL.Property;
import org.deg.xtext.gui.guiDSL.Refinement;
import org.deg.xtext.gui.guiDSL.Structure;
import org.deg.xtext.gui.guiDSL.TypeDefinition;
import org.deg.xtext.gui.guiDSL.UIDescription;
import org.deg.xtext.gui.guiDSL.UsedDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getUsedDescriptions <em>Used Descriptions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIDescriptionImpl extends MinimalEObjectImpl.Container implements UIDescription
{
  /**
   * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinition()
   * @generated
   * @ordered
   */
  protected TypeDefinition typeDefinition;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected Layout layout;

  /**
   * The cached value of the '{@link #getUsedDescriptions() <em>Used Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedDescriptions()
   * @generated
   * @ordered
   */
  protected EList<UsedDescription> usedDescriptions;

  /**
   * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinements()
   * @generated
   * @ordered
   */
  protected EList<Refinement> refinements;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<Definition> definitions;

  /**
   * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructure()
   * @generated
   * @ordered
   */
  protected Structure structure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UIDescriptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GuiDSLPackage.Literals.UI_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition getTypeDefinition()
  {
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeDefinition(TypeDefinition newTypeDefinition, NotificationChain msgs)
  {
    TypeDefinition oldTypeDefinition = typeDefinition;
    typeDefinition = newTypeDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION, oldTypeDefinition, newTypeDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDefinition(TypeDefinition newTypeDefinition)
  {
    if (newTypeDefinition != typeDefinition)
    {
      NotificationChain msgs = null;
      if (typeDefinition != null)
        msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION, null, msgs);
      if (newTypeDefinition != null)
        msgs = ((InternalEObject)newTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION, null, msgs);
      msgs = basicSetTypeDefinition(newTypeDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION, newTypeDefinition, newTypeDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout getLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs)
  {
    Layout oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__LAYOUT, oldLayout, newLayout);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(Layout newLayout)
  {
    if (newLayout != layout)
    {
      NotificationChain msgs = null;
      if (layout != null)
        msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__LAYOUT, null, msgs);
      if (newLayout != null)
        msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__LAYOUT, null, msgs);
      msgs = basicSetLayout(newLayout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__LAYOUT, newLayout, newLayout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UsedDescription> getUsedDescriptions()
  {
    if (usedDescriptions == null)
    {
      usedDescriptions = new EObjectContainmentEList<UsedDescription>(UsedDescription.class, this, GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS);
    }
    return usedDescriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Refinement> getRefinements()
  {
    if (refinements == null)
    {
      refinements = new EObjectContainmentEList<Refinement>(Refinement.class, this, GuiDSLPackage.UI_DESCRIPTION__REFINEMENTS);
    }
    return refinements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Definition> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<Definition>(Definition.class, this, GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS);
    }
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Structure getStructure()
  {
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructure(Structure newStructure, NotificationChain msgs)
  {
    Structure oldStructure = structure;
    structure = newStructure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__STRUCTURE, oldStructure, newStructure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructure(Structure newStructure)
  {
    if (newStructure != structure)
    {
      NotificationChain msgs = null;
      if (structure != null)
        msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__STRUCTURE, null, msgs);
      if (newStructure != null)
        msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__STRUCTURE, null, msgs);
      msgs = basicSetStructure(newStructure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__STRUCTURE, newStructure, newStructure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        return basicSetTypeDefinition(null, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        return basicSetProperty(null, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__LAYOUT:
        return basicSetLayout(null, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        return ((InternalEList<?>)getUsedDescriptions()).basicRemove(otherEnd, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__REFINEMENTS:
        return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__STRUCTURE:
        return basicSetStructure(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        return getTypeDefinition();
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        return getProperty();
      case GuiDSLPackage.UI_DESCRIPTION__LAYOUT:
        return getLayout();
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        return getUsedDescriptions();
      case GuiDSLPackage.UI_DESCRIPTION__REFINEMENTS:
        return getRefinements();
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        return getDefinitions();
      case GuiDSLPackage.UI_DESCRIPTION__STRUCTURE:
        return getStructure();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        setTypeDefinition((TypeDefinition)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        setProperty((Property)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__LAYOUT:
        setLayout((Layout)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        getUsedDescriptions().clear();
        getUsedDescriptions().addAll((Collection<? extends UsedDescription>)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__REFINEMENTS:
        getRefinements().clear();
        getRefinements().addAll((Collection<? extends Refinement>)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends Definition>)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__STRUCTURE:
        setStructure((Structure)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        setTypeDefinition((TypeDefinition)null);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        setProperty((Property)null);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__LAYOUT:
        setLayout((Layout)null);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        getUsedDescriptions().clear();
        return;
      case GuiDSLPackage.UI_DESCRIPTION__REFINEMENTS:
        getRefinements().clear();
        return;
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        getDefinitions().clear();
        return;
      case GuiDSLPackage.UI_DESCRIPTION__STRUCTURE:
        setStructure((Structure)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        return typeDefinition != null;
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        return property != null;
      case GuiDSLPackage.UI_DESCRIPTION__LAYOUT:
        return layout != null;
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        return usedDescriptions != null && !usedDescriptions.isEmpty();
      case GuiDSLPackage.UI_DESCRIPTION__REFINEMENTS:
        return refinements != null && !refinements.isEmpty();
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
      case GuiDSLPackage.UI_DESCRIPTION__STRUCTURE:
        return structure != null;
    }
    return super.eIsSet(featureID);
  }

} //UIDescriptionImpl
