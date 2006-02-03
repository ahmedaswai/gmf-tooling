/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Label on diagram
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLabel#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenLabel#getModelFacet <em>Model Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLabel()
 * @model abstract="true"
 * @generated
 */
public interface GenLabel extends GenCommonBase {
	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLabel_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLabel#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Model Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If model facet is not specified then custom parser should be provided for the label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Facet</em>' containment reference.
	 * @see #setModelFacet(LabelModelFacet)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenLabel_ModelFacet()
	 * @model containment="true"
	 * @generated
	 */
	LabelModelFacet getModelFacet();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenLabel#getModelFacet <em>Model Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Facet</em>' containment reference.
	 * @see #getModelFacet()
	 * @generated
	 */
	void setModelFacet(LabelModelFacet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSemanticHintFieldName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns structural features that provide label content
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="org.eclipse.emf.codegen.ecore.genmodel.GenFeature"
	 * @generated
	 */
	EList getMetaFeatures();

} // GenLabel
