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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.EvaluationException;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.SyntaxConstants;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class StaticFeatureCall extends Expression {
    private Identifier type;

    private Identifier feature;

    public StaticFeatureCall(final int start, final int end, final int line, final Identifier type,
            final Identifier feature) {
        super(start, end, line);
        this.type = type;
        this.feature = feature;
    }

    public Identifier getFeature() {
        return feature;
    }

    public Identifier getEClassifier() {
        return type;
    }

    @Override
    public Object evaluateInternal(final ExecutionContext ctx) {
        final EClassifier targetEClassifier = ctx.getTypeForName(type.getValue());
        if (targetEClassifier == null) {
			throw new EvaluationException("Unknown type : " + type.getValue(), type);
		}
        if (false == (targetEClassifier instanceof EEnum)) {
        	throw new EvaluationException("Enum type expected instead of " + type.getValue(), type);
        }
        final EEnumLiteral sp = ((EEnum) targetEClassifier).getEEnumLiteral(getFeature().getValue());
        if (sp == null) {
			throw new EvaluationException("Unknown enumeration literal : " + toString(), type);
		}
        return sp.getValue();
    }

    public EClassifier analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final EClassifier targetEClassifier = ctx.getTypeForName(type.getValue());
        if (targetEClassifier == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Unknown type : " + type.getValue(), type));
            return null;
        }
        if (false == (targetEClassifier instanceof EEnum)) {
        	issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "Enum type expected instead of " + type.getValue(), type));
            return null;
        }
        
        final EEnumLiteral sp = ((EEnum) targetEClassifier).getEEnumLiteral(getFeature().getValue());
        if (sp == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND, "Unknown enumeration literal : " + toString(), type));
            return null;
        }
        return BuiltinMetaModel.getReturnType(sp);
    }

    @Override
    public String toString() {
        return type + SyntaxConstants.NS_DELIM + feature;
    }

}
