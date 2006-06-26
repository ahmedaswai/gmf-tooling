package org.eclipse.gmf.graphdef.codegen.templates;

import org.eclipse.gmf.gmfgraph.*;
import org.eclipse.gmf.gmfgraph.util.*;
import org.eclipse.gmf.common.codegen.*;
import org.eclipse.gmf.graphdef.codegen.*;
import java.util.Iterator;

public class TopConnectionGenerator
{
  protected static String nl;
  public static synchronized TopConnectionGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    TopConnectionGenerator result = new TopConnectionGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_3 = " extends ";
  protected final String TEXT_4 = " {" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_5 = "() {";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "\t\tsetSourceDecoration(createSourceDecoration());";
  protected final String TEXT_8 = NL + "\t\tsetTargetDecoration(createTargetDecoration());";
  protected final String TEXT_9 = NL + "\t}" + NL;
  protected final String TEXT_10 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_11 = " createSourceDecoration() {";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL + "\t\treturn df;" + NL + "\t}";
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_16 = " createTargetDecoration() {";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL + "\t\treturn df;" + NL + "\t}";
  protected final String TEXT_19 = NL;
  protected final String TEXT_20 = NL + "}" + NL + "\t";
  protected final String TEXT_21 = NL + "\t" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = " = ";
  protected final String TEXT_24 = ";";
  protected final String TEXT_25 = NL + "\t";
  protected final String TEXT_26 = NL + "\t" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = " = ";
  protected final String TEXT_29 = ";";
  protected final String TEXT_30 = NL + "}";
  protected final String TEXT_31 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Object[] args = (Object[]) argument;
PolylineConnection figure = (PolylineConnection) args[0];
final ImportAssistant importManager = (ImportAssistant) args[1];
final FigureQualifiedNameSwitch fqnSwitch = (FigureQualifiedNameSwitch) args[2];
final GraphDefDispatcher dispatcher = (GraphDefDispatcher) args[3];
final boolean isInnerClass = ((Boolean) args[4]).booleanValue();

    importManager.emitPackageStatement(stringBuffer);
    stringBuffer.append(TEXT_1);
    importManager.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(fqnSwitch.get(figure, importManager));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(figure.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(dispatcher.dispatch("Shape", dispatcher.create(figure, "this")));
    if (figure.getSourceDecoration() != null) {
    stringBuffer.append(TEXT_7);
    }
if (figure.getTargetDecoration() != null) {
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    if (figure.getSourceDecoration() != null) {
	final String className = fqnSwitch.get(figure.getSourceDecoration(), importManager);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(dispatcher.dispatch("instantiate", dispatcher.create(figure.getSourceDecoration(), "df")));
    stringBuffer.append(TEXT_13);
    } /*if sourceDecoration != null */ 
    stringBuffer.append(TEXT_14);
    if (figure.getTargetDecoration() != null) {
	final String className = fqnSwitch.get(figure.getTargetDecoration(), importManager);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(dispatcher.dispatch("instantiate", dispatcher.create(figure.getTargetDecoration(), "df")));
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_19);
    
//input: [oeg].graphdef.codegen GraphDefDispatcher dispatcher
//input: boolean isInnerClass
if (isInnerClass){ /*put fields out of inner class body*/ 
    stringBuffer.append(TEXT_20);
    
//input: [oeg].graphdef.codegen GraphDefDispatcher dispatcher
for (Iterator allFields = dispatcher.getStaticFieldsManager().allFields(); allFields.hasNext();) {
	StaticFieldsManager.StaticField next = (StaticFieldsManager.StaticField)allFields.next(); 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(next.getType());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(next.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(next.getValue());
    stringBuffer.append(TEXT_24);
    
}

     } else { 
    stringBuffer.append(TEXT_25);
    
//input: [oeg].graphdef.codegen GraphDefDispatcher dispatcher
for (Iterator allFields = dispatcher.getStaticFieldsManager().allFields(); allFields.hasNext();) {
	StaticFieldsManager.StaticField next = (StaticFieldsManager.StaticField)allFields.next(); 
    stringBuffer.append(TEXT_26);
    stringBuffer.append(next.getType());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(next.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(next.getValue());
    stringBuffer.append(TEXT_29);
    
}

    stringBuffer.append(TEXT_30);
    }
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_31);
    return stringBuffer.toString();
  }
}
