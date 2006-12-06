/*
 * Copyright (c) 2006 Borland Software Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.ecore.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.transaction.util.TransactionUtil;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.ecore.edit.parts.EPackageEditPart;

import org.eclipse.gmf.ecore.part.EcoreDiagramEditor;
import org.eclipse.gmf.ecore.part.EcoreDiagramEditorPlugin;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorInput;

import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * @generated
 */
public class OpenDiagramEditPolicy extends OpenEditPolicy {

	/**
	 * @generated
	 */
	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request);
		if (false == targetEditPart.getModel() instanceof View) {
			return null;
		}
		EAnnotation ann = ((View) targetEditPart.getModel()).getEAnnotation("uri://eclipse.org/gmf/openDiagramPolicy");
		if (ann == null) {
			return null;
		}
		return new ICommandProxy(new OpenDiagramCommand(ann));
	}

	/**
	 * @generated
	 */
	private static class OpenDiagramCommand extends AbstractTransactionalCommand {

		/**
		 * @generated
		 */
		private final EAnnotation diagramFacet;

		/**
		 * @generated
		 */
		OpenDiagramCommand(EAnnotation annotation) {
			// editing domain is taken for original diagram, 
			// if we open diagram from another file, we should use another editing domain
			super(TransactionUtil.getEditingDomain(annotation), "Open diagram", null);
			diagramFacet = annotation;
		}

		// FIXME canExecute if  !(readOnly && getDiagramToOpen == null), i.e. open works on ro diagrams only when there's associated diagram already

		/**
		 * @generated
		 */
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			try {
				Diagram diagram = getDiagramToOpen();
				if (diagram == null) {
					diagram = intializeNewDiagram();
				}
				final DiagramEditorInput editorInput = new DiagramEditorInput(diagram);
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				page.openEditor(editorInput, getEditorID());
				return CommandResult.newOKCommandResult();
			} catch (Exception ex) {
				throw new ExecutionException("Can't open diagram", ex);
			}
		}

		/**
		 * @generated
		 */
		protected Diagram getDiagramToOpen() {
			// take first
			for (Iterator it = diagramFacet.getReferences().iterator(); it.hasNext();) {
				Object next = it.next();
				if (next instanceof Diagram) {
					return (Diagram) next;
				}
			}
			return null;
		}

		/**
		 * @generated
		 */
		protected Diagram intializeNewDiagram() throws ExecutionException {
			Diagram d = ViewService.createDiagram(getDiagramDomainElement(), getDiagramKind(), getPreferencesHint());
			if (d == null) {
				throw new ExecutionException("Can't create diagram of '" + getDiagramKind() + "' kind");
			}
			diagramFacet.getReferences().add(d);
			assert diagramFacet.eResource() != null;
			diagramFacet.eResource().getContents().add(d);
			try {
				for (Iterator it = diagramFacet.eResource().getResourceSet().getResources().iterator(); it.hasNext();) {
					((org.eclipse.emf.ecore.resource.Resource) it.next()).save(java.util.Collections.EMPTY_MAP);
				}
			} catch (java.io.IOException ex) {
				throw new ExecutionException("Can't create diagram of '" + getDiagramKind() + "' kind", ex);
			}
			return d;
		}

		/**
		 * @generated
		 */
		protected EObject getDiagramDomainElement() {
			// use same element as associated with EP
			return ((View) diagramFacet.getEModelElement()).getElement();
		}

		/**
		 * @generated
		 */
		protected PreferencesHint getPreferencesHint() {
			// XXX prefhint from target diagram's editor?
			return EcoreDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		 * @generated
		 */
		protected String getDiagramKind() {
			return EPackageEditPart.MODEL_ID;
		}

		/**
		 * @generated
		 */
		protected String getEditorID() {
			return EcoreDiagramEditor.ID;
		}
	}
}
