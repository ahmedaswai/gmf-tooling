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
package org.eclipse.gmf.internal.xpand.expression.ast;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class Case extends SyntaxElement {
    private Expression condition;

    private Expression thenPart;

    public Case(final int start, final int end, final int line, final int startOffset, final int endOffset, final Expression condition, final Expression part) {
        super(start, end, line, startOffset, endOffset);
        this.condition = condition;
        thenPart = part;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getThenPart() {
        return thenPart;
    }

}
