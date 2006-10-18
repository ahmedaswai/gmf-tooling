/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Link Model Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.FeatureLinkModelFacetImpl#getMetaFeature <em>Meta Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureLinkModelFacetImpl extends EObjectImpl implements FeatureLinkModelFacet {
	/**
	 * The cached value of the '{@link #getMetaFeature() <em>Meta Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaFeature()
	 * @generated
	 * @ordered
	 */
	protected GenFeature metaFeature = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureLinkModelFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getFeatureLinkModelFacet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getMetaFeature() {
		if (metaFeature != null && metaFeature.eIsProxy()) {
			InternalEObject oldMetaFeature = (InternalEObject)metaFeature;
			metaFeature = (GenFeature)eResolveProxy(oldMetaFeature);
			if (metaFeature != oldMetaFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGenPackage.FEATURE_LINK_MODEL_FACET__META_FEATURE, oldMetaFeature, metaFeature));
			}
		}
		return metaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetMetaFeature() {
		return metaFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaFeature(GenFeature newMetaFeature) {
		GenFeature oldMetaFeature = metaFeature;
		metaFeature = newMetaFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.FEATURE_LINK_MODEL_FACET__META_FEATURE, oldMetaFeature, metaFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSourceTypes() {
		EList sources = new BasicEList();
		if (getMetaFeature() != null) {
			sources.add(getMetaFeature().getGenClass());
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getTargetTypes() {
		EList targets = new BasicEList();
		if (getMetaFeature() != null) {
			targets.add(getMetaFeature().getTypeGenClass());
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET__META_FEATURE:
				if (resolve) return getMetaFeature();
				return basicGetMetaFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET__META_FEATURE:
				setMetaFeature((GenFeature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET__META_FEATURE:
				setMetaFeature((GenFeature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.FEATURE_LINK_MODEL_FACET__META_FEATURE:
				return metaFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureLinkModelFacetImpl
