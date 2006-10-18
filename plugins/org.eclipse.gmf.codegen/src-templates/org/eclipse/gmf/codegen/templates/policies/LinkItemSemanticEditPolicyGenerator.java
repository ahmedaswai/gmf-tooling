package org.eclipse.gmf.codegen.templates.policies;

import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.gmf.common.codegen.*;

public class LinkItemSemanticEditPolicyGenerator
{
  protected static String nl;
  public static synchronized LinkItemSemanticEditPolicyGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    LinkItemSemanticEditPolicyGenerator result = new LinkItemSemanticEditPolicyGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "/*" + NL + " *";
  protected final String TEXT_3 = NL + " */";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_6 = " extends ";
  protected final String TEXT_7 = " {";
  protected final String TEXT_8 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_9 = " getDestroyReferenceCommand(";
  protected final String TEXT_10 = " req) {" + NL + "\t\treturn getMSLWrapper(new ";
  protected final String TEXT_11 = "(req)";
  protected final String TEXT_12 = " {" + NL + "\t\t" + NL + "\t\t\tprotected ";
  protected final String TEXT_13 = " doExecuteWithResult(";
  protected final String TEXT_14 = " progressMonitor, ";
  protected final String TEXT_15 = " info) throws ";
  protected final String TEXT_16 = " {" + NL + "\t\t\t\t";
  protected final String TEXT_17 = " referencedObject = getReferencedObject();" + NL + "\t\t\t\t";
  protected final String TEXT_18 = " resource = referencedObject.eResource();" + NL + "\t\t\t\t";
  protected final String TEXT_19 = " result = super.doExecuteWithResult(progressMonitor, info);" + NL + "\t\t\t\tresource.getContents().add(referencedObject);" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_20 = ");" + NL + "\t}";
  protected final String TEXT_21 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_22 = " getDestroyElementCommand(";
  protected final String TEXT_23 = " req) {" + NL + "\t\treturn getMSLWrapper(new ";
  protected final String TEXT_24 = "(req));" + NL + "\t}";
  protected final String TEXT_25 = NL + "}";
  protected final String TEXT_26 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
final GenLink genLink = (GenLink) ((Object[]) argument)[0];
final ImportAssistant importManager = (ImportAssistant) ((Object[]) argument)[1];
GenDiagram genDiagram = genLink.getDiagram();

    stringBuffer.append(TEXT_1);
    
String copyrightText = genDiagram.getEditorGen().getCopyrightText();
if (copyrightText != null && copyrightText.trim().length() > 0) {

    stringBuffer.append(TEXT_2);
    stringBuffer.append(copyrightText.replaceAll("\n", "\n *"));
    stringBuffer.append(TEXT_3);
    }
    importManager.emitPackageStatement(stringBuffer);
    stringBuffer.append(TEXT_4);
    importManager.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genLink.getItemSemanticEditPolicyClassName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(importManager.getImportedName(genDiagram.getBaseItemSemanticEditPolicyQualifiedClassName()));
    stringBuffer.append(TEXT_7);
    if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.commands.Command"));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest"));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand"));
    stringBuffer.append(TEXT_11);
    
	FeatureLinkModelFacet modelFacet = (FeatureLinkModelFacet) genLink.getModelFacet();
	if (modelFacet.getMetaFeature().isContains()) {
// Processing "phantom" objects

    stringBuffer.append(TEXT_12);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.core.command.CommandResult"));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(importManager.getImportedName("org.eclipse.core.runtime.IProgressMonitor"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(importManager.getImportedName("org.eclipse.core.runtime.IAdaptable"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(importManager.getImportedName("org.eclipse.core.commands.ExecutionException"));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.common.core.command.CommandResult"));
    stringBuffer.append(TEXT_19);
    
	}

    stringBuffer.append(TEXT_20);
    } else if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.commands.Command"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand"));
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_26);
    return stringBuffer.toString();
  }
}
