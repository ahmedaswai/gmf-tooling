/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.expression;

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public interface Analyzable {
    public abstract EClassifier analyze(ExecutionContext ctx, Set<AnalysationIssue> issues);
}
