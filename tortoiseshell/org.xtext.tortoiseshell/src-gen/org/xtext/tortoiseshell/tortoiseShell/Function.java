/**
 */
package org.xtext.tortoiseshell.tortoiseShell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.Function#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.tortoiseshell.tortoiseShell.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getFunction_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XBlockExpression)
   * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getFunction_Body()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getBody();

  /**
   * Sets the value of the '{@link org.xtext.tortoiseshell.tortoiseShell.Function#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XBlockExpression value);

} // Function