/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * Resource factory for the tooling models.
 * Specifies very small line length value in xml so each attribute is positioned on
 * it's own line thus making merging easier in standard workbench text merger.
 * 
 * @author dstadnik
 */
public class ToolingResourceFactory extends XMIResourceFactoryImpl {
	

	public Resource createResource(URI uri) {
		return new ToolResource(uri);
	}
	
	
	public static class ToolResource extends XMIResourceImpl {

		public ToolResource(URI uri) {
			super(uri);
			setupOptions();
		}
		
		@SuppressWarnings("unchecked")
		private void setupOptions() {
			// This option is necessary for correctly loading cross-references in the model.
			// See https://bugs.eclipse.org/bugs/show_bug.cgi?id=128998
			getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);

			// Format xml so each attribute is positioned on it's own line.
			getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, new Integer(1));
		}		
	}	
}
