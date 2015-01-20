/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.DescriptionType;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.UsedDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UsedDescriptionImpl#getDescriptionType <em>Description Type</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.UsedDescriptionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsedDescriptionImpl extends MinimalEObjectImpl.Container implements UsedDescription
{
  /**
   * The cached value of the '{@link #getDescriptionType() <em>Description Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionType()
   * @generated
   * @ordered
   */
  protected DescriptionType descriptionType;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsedDescriptionImpl()
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
    return GuiDSLPackage.Literals.USED_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionType getDescriptionType()
  {
    return descriptionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescriptionType(DescriptionType newDescriptionType, NotificationChain msgs)
  {
    DescriptionType oldDescriptionType = descriptionType;
    descriptionType = newDescriptionType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE, oldDescriptionType, newDescriptionType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescriptionType(DescriptionType newDescriptionType)
  {
    if (newDescriptionType != descriptionType)
    {
      NotificationChain msgs = null;
      if (descriptionType != null)
        msgs = ((InternalEObject)descriptionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE, null, msgs);
      if (newDescriptionType != null)
        msgs = ((InternalEObject)newDescriptionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE, null, msgs);
      msgs = basicSetDescriptionType(newDescriptionType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE, newDescriptionType, newDescriptionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.USED_DESCRIPTION__ID, oldId, id));
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
      case GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE:
        return basicSetDescriptionType(null, msgs);
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
      case GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE:
        return getDescriptionType();
      case GuiDSLPackage.USED_DESCRIPTION__ID:
        return getId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE:
        setDescriptionType((DescriptionType)newValue);
        return;
      case GuiDSLPackage.USED_DESCRIPTION__ID:
        setId((String)newValue);
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
      case GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE:
        setDescriptionType((DescriptionType)null);
        return;
      case GuiDSLPackage.USED_DESCRIPTION__ID:
        setId(ID_EDEFAULT);
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
      case GuiDSLPackage.USED_DESCRIPTION__DESCRIPTION_TYPE:
        return descriptionType != null;
      case GuiDSLPackage.USED_DESCRIPTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //UsedDescriptionImpl
