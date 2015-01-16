/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import java.util.Collection;

import org.deg.xtext.gui.guiDSL.CommonProperties;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.TabDefinition;
import org.deg.xtext.gui.guiDSL.TabViewRefinement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab View Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.TabViewRefinementImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.TabViewRefinementImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabViewRefinementImpl extends ComponentRefinementImpl implements TabViewRefinement
{
  /**
   * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabs()
   * @generated
   * @ordered
   */
  protected EList<TabDefinition> tabs;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected CommonProperties properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabViewRefinementImpl()
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
    return GuiDSLPackage.Literals.TAB_VIEW_REFINEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TabDefinition> getTabs()
  {
    if (tabs == null)
    {
      tabs = new EObjectContainmentEList<TabDefinition>(TabDefinition.class, this, GuiDSLPackage.TAB_VIEW_REFINEMENT__TABS);
    }
    return tabs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonProperties getProperties()
  {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(CommonProperties newProperties, NotificationChain msgs)
  {
    CommonProperties oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES, oldProperties, newProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperties(CommonProperties newProperties)
  {
    if (newProperties != properties)
    {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES, newProperties, newProperties));
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
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__TABS:
        return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES:
        return basicSetProperties(null, msgs);
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
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__TABS:
        return getTabs();
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES:
        return getProperties();
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
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__TABS:
        getTabs().clear();
        getTabs().addAll((Collection<? extends TabDefinition>)newValue);
        return;
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES:
        setProperties((CommonProperties)newValue);
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
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__TABS:
        getTabs().clear();
        return;
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES:
        setProperties((CommonProperties)null);
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
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__TABS:
        return tabs != null && !tabs.isEmpty();
      case GuiDSLPackage.TAB_VIEW_REFINEMENT__PROPERTIES:
        return properties != null;
    }
    return super.eIsSet(featureID);
  }

} //TabViewRefinementImpl
