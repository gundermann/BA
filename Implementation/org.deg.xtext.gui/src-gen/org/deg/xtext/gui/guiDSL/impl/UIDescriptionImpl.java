/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import java.util.Collection;

import org.deg.xtext.gui.guiDSL.AreaAssignment;
import org.deg.xtext.gui.guiDSL.AreaCount;
import org.deg.xtext.gui.guiDSL.Definition;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.Property;
import org.deg.xtext.gui.guiDSL.TypeDefinition;
import org.deg.xtext.gui.guiDSL.UIDescription;
import org.deg.xtext.gui.guiDSL.UsedDescriptions;

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
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getAreaCount <em>Area Count</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getUsedDescriptions <em>Used Descriptions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UIDescriptionImpl#getAreas <em>Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIDescriptionImpl extends MinimalEObjectImpl.Container implements UIDescription
{
  /**
   * The cached value of the '{@link #getAreaCount() <em>Area Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAreaCount()
   * @generated
   * @ordered
   */
  protected AreaCount areaCount;

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
   * The cached value of the '{@link #getUsedDescriptions() <em>Used Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedDescriptions()
   * @generated
   * @ordered
   */
  protected EList<UsedDescriptions> usedDescriptions;

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
   * The cached value of the '{@link #getAreas() <em>Areas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAreas()
   * @generated
   * @ordered
   */
  protected EList<AreaAssignment> areas;

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
  public AreaCount getAreaCount()
  {
    return areaCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAreaCount(AreaCount newAreaCount, NotificationChain msgs)
  {
    AreaCount oldAreaCount = areaCount;
    areaCount = newAreaCount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT, oldAreaCount, newAreaCount);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAreaCount(AreaCount newAreaCount)
  {
    if (newAreaCount != areaCount)
    {
      NotificationChain msgs = null;
      if (areaCount != null)
        msgs = ((InternalEObject)areaCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT, null, msgs);
      if (newAreaCount != null)
        msgs = ((InternalEObject)newAreaCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT, null, msgs);
      msgs = basicSetAreaCount(newAreaCount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT, newAreaCount, newAreaCount));
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
  public EList<UsedDescriptions> getUsedDescriptions()
  {
    if (usedDescriptions == null)
    {
      usedDescriptions = new EObjectContainmentEList<UsedDescriptions>(UsedDescriptions.class, this, GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS);
    }
    return usedDescriptions;
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
  public EList<AreaAssignment> getAreas()
  {
    if (areas == null)
    {
      areas = new EObjectContainmentEList<AreaAssignment>(AreaAssignment.class, this, GuiDSLPackage.UI_DESCRIPTION__AREAS);
    }
    return areas;
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
      case GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT:
        return basicSetAreaCount(null, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        return basicSetTypeDefinition(null, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        return basicSetProperty(null, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        return ((InternalEList<?>)getUsedDescriptions()).basicRemove(otherEnd, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
      case GuiDSLPackage.UI_DESCRIPTION__AREAS:
        return ((InternalEList<?>)getAreas()).basicRemove(otherEnd, msgs);
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
      case GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT:
        return getAreaCount();
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        return getTypeDefinition();
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        return getProperty();
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        return getUsedDescriptions();
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        return getDefinitions();
      case GuiDSLPackage.UI_DESCRIPTION__AREAS:
        return getAreas();
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
      case GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT:
        setAreaCount((AreaCount)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        setTypeDefinition((TypeDefinition)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        setProperty((Property)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        getUsedDescriptions().clear();
        getUsedDescriptions().addAll((Collection<? extends UsedDescriptions>)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends Definition>)newValue);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__AREAS:
        getAreas().clear();
        getAreas().addAll((Collection<? extends AreaAssignment>)newValue);
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
      case GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT:
        setAreaCount((AreaCount)null);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        setTypeDefinition((TypeDefinition)null);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        setProperty((Property)null);
        return;
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        getUsedDescriptions().clear();
        return;
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        getDefinitions().clear();
        return;
      case GuiDSLPackage.UI_DESCRIPTION__AREAS:
        getAreas().clear();
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
      case GuiDSLPackage.UI_DESCRIPTION__AREA_COUNT:
        return areaCount != null;
      case GuiDSLPackage.UI_DESCRIPTION__TYPE_DEFINITION:
        return typeDefinition != null;
      case GuiDSLPackage.UI_DESCRIPTION__PROPERTY:
        return property != null;
      case GuiDSLPackage.UI_DESCRIPTION__USED_DESCRIPTIONS:
        return usedDescriptions != null && !usedDescriptions.isEmpty();
      case GuiDSLPackage.UI_DESCRIPTION__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
      case GuiDSLPackage.UI_DESCRIPTION__AREAS:
        return areas != null && !areas.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UIDescriptionImpl
