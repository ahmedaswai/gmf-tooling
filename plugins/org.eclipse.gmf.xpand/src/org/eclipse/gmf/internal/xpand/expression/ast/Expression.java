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

import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.Analyzable;
import org.eclipse.gmf.internal.xpand.expression.Evaluatable;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;

public abstract class Expression extends SyntaxElement implements Analyzable, Evaluatable {

    public Expression(final int start, final int end, final int line) {
        super(start, end, line);
    }

    protected EClassifier findType(final Identifier type, final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier toCast = ctx.getTypeForName(type.getValue());
        if (toCast == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, type.getValue(), type));
        }
        return toCast;
    }

    public final Object evaluate(final ExecutionContext ctx) {
        try {
            return evaluateInternal(ctx);
        } catch (final EvaluationException eve) {
            throw eve;
        } catch (final RuntimeException ex) {
            throw new EvaluationException(ex, this);
        }
    }

    protected abstract Object evaluateInternal(ExecutionContext ctx);

}
