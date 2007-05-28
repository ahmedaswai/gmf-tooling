/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Borland - initial API and implementation
 */
package org.eclipse.gmf.internal.graphdef.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.internal.common.ToolingResourceFactory;
import org.eclipse.gmf.internal.common.migrate.MigrationResource;

public class GMFGraphResource extends MigrationResource {
	public static class Factory extends ToolingResourceFactory {
		@Override
		public Resource createResource(URI uri) {
			return new GMFGraphResource(uri);
		}
	}

	private GMFGraphResource(URI uri) {
		super(uri);
	}

	@Override
	public String getID(EObject object) {
		// TODO Auto-generated method stub
		return super.getID(object);
	}

	@Override
	protected org.eclipse.gmf.internal.common.migrate.MigrationDelegate createDelegate() {
		MigrationDelegate migrationHelper = new MigrationDelegate();
		migrationHelper.init();
		return migrationHelper;
	}
}
