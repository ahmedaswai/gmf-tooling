/**
 * Copyright (c) 2010-2012 ISBAN S.L
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 		Ruben De Dios (ISBAN S.L)
 * 		Andrez Alvarez Mattos (ISBAN S.L)
 */
package org.eclipse.gmf.tooling.simplemap.diagram.properties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleCompartment;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleLabelNode;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleSubNode;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleTopNode;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public abstract class AbstractExtendedPropertiesSection extends AbstractModelerPropertySection implements IFilter {

	protected Composite composite;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse
	 * .swt.widgets.Composite,
	 * org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		initializeControls(parent);
	}

	/**
	 * Provides a level of indirection for subclasses which want 'jump' over
	 * some control creation/initilialization steps and/or chnage thier order
	 * 
	 * @param parent - parent composite
	 */
	protected void initializeControls(Composite parent) {
		composite = getWidgetFactory().createFlatFormComposite(parent);
		FormLayout layout = (FormLayout) composite.getLayout();
		layout.spacing = 3;
	}

	/**
	 * Determines if the page is displaying properties for this element The
	 * element being passed to us is the style ie UMLConnectorStyle or
	 * UMLShapeStype. The element which we are holding will be an association,
	 * class etc. Comparing these 2 eobjects will always result in false being
	 * returned and no refresh. We are unable to analytically, consistantly
	 * trave from the eobject representing the style to the eobject representing
	 * the shape so we are stuck returning true in all cases.
	 * 
	 * @param notification
	 *            The notification
	 * @param element
	 *            The element to be tested
	 * @return 'true' if the page is displaying properties for this element
	 * 
	 */
	protected boolean isCurrentSelection(Notification notification, EObject element) {

		return true;
	}

	/**
	 * Adapt the object to an EObject - if possible
	 * 
	 * @param object
	 *            object from a diagram or ME
	 * @return EObject
	 */
	protected EObject adapt(Object object) {

		EObject adapted = super.adapt(object);

		if (adapted instanceof View)
			return ((View) adapted).getElement();

		return adapted;
	}

	@Override
	public boolean select(Object toTest) {

		EObject unwraped = unwrap(toTest);

		if (unwraped instanceof SimpleTopNode || unwraped instanceof SimpleCompartment || unwraped instanceof SimpleSubNode || unwraped instanceof SimpleLabelNode)
			return true;

		return false;
	}

}