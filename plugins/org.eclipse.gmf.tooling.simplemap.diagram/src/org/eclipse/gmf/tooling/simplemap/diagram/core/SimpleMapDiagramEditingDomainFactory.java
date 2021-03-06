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
package org.eclipse.gmf.tooling.simplemap.diagram.core;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;
import org.eclipse.gmf.tooling.simplemap.model.triggers.compartment.CompartmentTriggerListener;
import org.eclipse.gmf.tooling.simplemap.model.triggers.compartment.SimpleCompartmentTriggerListener;
import org.eclipse.gmf.tooling.simplemap.model.triggers.graph.FigureDescriptorTriggerListener;
import org.eclipse.gmf.tooling.simplemap.model.triggers.graph.RealFigureTriggerListener;
import org.eclipse.gmf.tooling.simplemap.model.triggers.link.SimpleLinkMappingTriggerListener;
import org.eclipse.gmf.tooling.simplemap.model.triggers.mapping.MappingEntryTriggerListener;
import org.eclipse.gmf.tooling.simplemap.model.triggers.parent.ParentNodeTriggerListener;
import org.eclipse.gmf.tooling.simplemap.model.triggers.references.SimpleChildReferenceTriggerListener;

public class SimpleMapDiagramEditingDomainFactory extends DiagramEditingDomainFactory {

	/**
	 * The single shared instance of the GMF diagram editing domain factory.
	 */
	private static SimpleMapDiagramEditingDomainFactory instance = new SimpleMapDiagramEditingDomainFactory();

	/**
	 * Gets the single shared instance of the GMF diagram editing domain factory.
	 * 
	 * @return the editing domain factory
	 */
	public static WorkspaceEditingDomainFactory getInstance() {
		return instance;
	}

	@Override
	protected void configure(TransactionalEditingDomain domain) {
		// TODO Auto-generated method stub
		super.configure(domain);

		domain.addResourceSetListener(new SimpleCompartmentTriggerListener());
		domain.addResourceSetListener(new ParentNodeTriggerListener());
		domain.addResourceSetListener(new SimpleLinkMappingTriggerListener());
		domain.addResourceSetListener(new MappingEntryTriggerListener());
		domain.addResourceSetListener(new CompartmentTriggerListener());
		domain.addResourceSetListener(new FigureDescriptorTriggerListener());
		domain.addResourceSetListener(new RealFigureTriggerListener());
		domain.addResourceSetListener(new SimpleChildReferenceTriggerListener());
	}

}
