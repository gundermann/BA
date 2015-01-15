/**
 */
package org.deg.xtext.gui.guiDSL.impl;

import org.deg.xtext.gui.guiDSL.CommonProperties;
import org.deg.xtext.gui.guiDSL.GuiDSLPackage;
import org.deg.xtext.gui.guiDSL.TextfieldProperties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textfield Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.TextfieldPropertiesImpl#getCommonProperties <em>Common Properties</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.TextfieldPropertiesImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.deg.xtext.gui.guiDSL.impl.TextfieldPropertiesImpl#getEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextfieldPropertiesImpl extends MinimalEObjectImpl.Container implements TextfieldProperties
{
  /**
   * The cached value of the '{@link #getCommonProperties() <em>Common Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommonProperties()
   * @generated
   * @ordered
   */
  protected CommonProperties commonProperties;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getEditable() <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditable()
   * @generated
   * @ordered
   */
  protected static final String EDITABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEditable() <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditable()
   * @generated
   * @ordered
   */
  protected String editable = EDITABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextfieldPropertiesImpl()
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
    return GuiDSLPackage.Literals.TEXTFIELD_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonProperties getCommonProperties()
  {
    return commonProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommonProperties(CommonProperties newCommonProperties, NotificationChain msgs)
  {
    CommonProperties oldCommonProperties = commonProperties;
    commonProperties = newCommonProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES, oldCommonProperties, newCommonProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommonProperties(CommonProperties newCommonProperties)
  {
    if (newCommonProperties != commonProperties)
    {
      NotificationChain msgs = null;
      if (commonProperties != null)
        msgs = ((InternalEObject)commonProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES, null, msgs);
      if (newCommonProperties != null)
        msgs = ((InternalEObject)newCommonProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES, null, msgs);
      msgs = basicSetCommonProperties(newCommonProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES, newCommonProperties, newCommonProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.TEXTFIELD_PROPERTIES__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEditable()
  {
    return editable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditable(String newEditable)
  {
    String oldEditable = editable;
    editable = newEditable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiDSLPackage.TEXTFIELD_PROPERTIES__EDITABLE, oldEditable, editable));
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
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES:
        return basicSetCommonProperties(null, msgs);
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
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES:
        return getCommonProperties();
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__TEXT:
        return getText();
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__EDITABLE:
        return getEditable();
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
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES:
        setCommonProperties((CommonProperties)newValue);
        return;
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__TEXT:
        setText((String)newValue);
        return;
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__EDITABLE:
        setEditable((String)newValue);
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
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES:
        setCommonProperties((CommonProperties)null);
        return;
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__EDITABLE:
        setEditable(EDITABLE_EDEFAULT);
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
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__COMMON_PROPERTIES:
        return commonProperties != null;
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case GuiDSLPackage.TEXTFIELD_PROPERTIES__EDITABLE:
        return EDITABLE_EDEFAULT == null ? editable != null : !EDITABLE_EDEFAULT.equals(editable);
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
    result.append(" (text: ");
    result.append(text);
    result.append(", editable: ");
    result.append(editable);
    result.append(')');
    return result.toString();
  }

} //TextfieldPropertiesImpl
