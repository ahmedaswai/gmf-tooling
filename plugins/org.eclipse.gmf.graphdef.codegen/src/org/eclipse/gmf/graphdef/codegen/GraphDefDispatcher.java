/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.codegen;

import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.LayoutData;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.internal.codegen.dispatch.DispatcherImpl;
import org.eclipse.gmf.internal.codegen.dispatch.EmitterFactory;
import org.eclipse.gmf.internal.codegen.dispatch.KeyMap;

/**
 * @author artem
 */
public class GraphDefDispatcher extends DispatcherImpl {
	private ImportAssistant myImportManager;
	private final FigureQualifiedNameSwitch myFqnSwitch;
	private final MapModeCodeGenStrategy myMapModeStrategy;
	private final StaticFieldsManager myStaticFieldsManager;
	
	public GraphDefDispatcher(EmitterFactory factory, KeyMap keyMap, FigureQualifiedNameSwitch fqnSwitch, MapModeCodeGenStrategy mapModeStrategy) {
		super(factory, keyMap);
		assert mapModeStrategy != null;
		myFqnSwitch = fqnSwitch;
		myMapModeStrategy = mapModeStrategy;
		myStaticFieldsManager = new StaticFieldsManager();
	}
	
	public StaticFieldsManager getStaticFieldsManager(){
		return myStaticFieldsManager;
	}
	
	public String DPtoLP(int deviceUnit){
		return myMapModeStrategy.DPtoLP(deviceUnit);
	}
	
	public String LPtoDP(int logicalUnit){
		return myMapModeStrategy.LPtoDP(logicalUnit);
	}
	
	public ImportAssistant getImportManager() {
		return myImportManager;
	}
	
	/**
	 * Not good. Would be better to have importManager as part of Args, perhaps. 
	 */
	/*package-local*/ void resetForNewClass(ImportAssistant assistant) {
		setImportManager(assistant);
		myStaticFieldsManager.reset();
	}

	public FigureQualifiedNameSwitch getFQNSwitch() {
		return myFqnSwitch;
	}
	
	public Args create(Figure figure, String figureVarName) {
		return new Args(this, figure, figureVarName);
	}

	public LayoutArgs getLayoutArgsFor(Args prototype) {
		return prototype instanceof LayoutArgs ? (LayoutArgs)prototype : new LayoutArgs(prototype);
	}

	public LayoutArgs createLayoutArgs(Figure figure, String figureVarName, String managerVarName, String constraintVarName) {
		return new LayoutArgs(this, figure, figureVarName, managerVarName, constraintVarName);
	}

	public LayoutArgs createLayoutArgs(Args inherit, String managerVarName, String constraintVarName) {
		return new LayoutArgs(inherit, managerVarName, constraintVarName);
	}
	
	private void setImportManager(ImportAssistant manager) {
		myImportManager = manager; 
	}

	public static class Args {
		private final Figure myFigure;
		private final String myFigureVarName;
		private final GraphDefDispatcher myOwner;

		public Args(GraphDefDispatcher owner, Figure figure, String figureVarName) {
			myOwner = owner;
			myFigure = figure;
			myFigureVarName = figureVarName;
		}

		protected Args(Args other) {
			this(other.getDispatcher(), other.getFigure(), other.getVariableName());
		}

		public Figure getFigure() {
			return myFigure;
		}

		public String getVariableName() {
			return myFigureVarName;
		}

		public GraphDefDispatcher getDispatcher() {
			return myOwner;
		}
	}

	public static class LayoutArgs extends Args {
		private final String myLayoutVariableName;
		private final String myLayoutDataVariableName;

		/**
		 * @param managerVariableName
		 *            name of layout manager variable defined somewhere in the
		 *            generated code, should not be <code>null</code>
		 * @param constraintVariableName
		 *            optional name of the layout constraint variable, or
		 *            <code>null</code> if current context does not contain
		 *            constraint information.
		 */
		private LayoutArgs(GraphDefDispatcher owner, Figure figure, String figureVarName, String managerVariableName, String constraintVariableName) {
			super(owner, figure, figureVarName);
			myLayoutVariableName = managerVariableName;
			myLayoutDataVariableName = constraintVariableName;
		}

		private LayoutArgs(Args inherit, String managerVariableName, String constraintVariableName) {
			super(inherit);
			myLayoutVariableName = managerVariableName;
			myLayoutDataVariableName = constraintVariableName;
		}

		private LayoutArgs(Args args) {
			this(args, args.getVariableName() + "Layouter", args.getVariableName() + "Constraint");
		}

		public Layout getLayout() {
			return getFigure().getLayout();
		}

		public LayoutData getData() {
			return getFigure().getLayoutData();
		}

		public String getManagerVariableName() {
			return myLayoutVariableName;
		}
		
		public String getConstraintVariableName() {
			return myLayoutDataVariableName;
		}
	}
}
