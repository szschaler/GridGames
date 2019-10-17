package uk.ac.kcl.inf.zschaler.gridgames.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CellContextGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.generator.ModelPreprocessor;

/**
 * Generates the field class.
 */
@SuppressWarnings("all")
public class FieldGenerator extends CommonGenerator {
  private CellContextGenerator ccg;
  
  public FieldGenerator(final ModelPreprocessor mpp) {
    super(mpp);
    CellContextGenerator _cellContextGenerator = new CellContextGenerator(mpp);
    this.ccg = _cellContextGenerator;
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateFieldClassFileName = this.generateFieldClassFileName();
    _builder.append(_generateFieldClassFileName);
    fsa.generateFile(_builder.toString(), this.generateFieldModel());
  }
  
  public CharSequence generateFieldModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field generateImports is undefined"
      + "\nThe method generateFieldInitialisation() is undefined"
      + "\nThe method generateFieldInitialiserFor(FieldSpecification) is undefined");
  }
  
  public CharSequence generateGenerationalContextTriggers() {
    CharSequence _xifexpression = null;
    if ((this.mpp.doGenerateGenerationalContexts() && (!IterableExtensions.isEmpty(this.mpp.getAllStatesWithContextTriggers())))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("private class GenerationUpdater extends Thread {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private boolean doRun = false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private long sleepTime = 1000;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public GenerationUpdater() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("start();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void run() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("while (true) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if (doRun) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("// Compute a new generation");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Cell[][] newGeneration = new Cell[width][height];");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("for (int x = 0; x < width; x++) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("for (int y = 0; y < height; y++) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("CellContext context = getContextAt(x, y);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("newGeneration[x][y] = field[x][y].computeNewGeneration (context);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("// Set the new generation");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("field = newGeneration;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("fireTableDataChanged();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("sleep(sleepTime);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("catch (InterruptedException ie) { }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void doStart() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("doRun = true;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void doStop() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("doRun = false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("private GenerationUpdater updater = new GenerationUpdater();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public void startGenerationComputation() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("updater.doStart();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public void stopGenerationComputation() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("updater.doStop();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence generateIncrementalContextTriggerListener() {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \'states\'"
      + "\nmismatched input \'»\\r\\n\\t\\t\\t\\t\\t\\t\\t«\' expecting \'}\'"
      + "\nextraneous input \'»\\r\\n\\t\\t\\t\\t\\t\\t}\\r\\n\\t\\t\\t\\t\\t});\\r\\n\\t\\t\\t\\t\'\'\'\' expecting \'}\'"
      + "\nThe method or field v is undefined"
      + "\nThe method states(Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>) is undefined"
      + "\nThe method or field states is undefined"
      + "\nThe method or field states is undefined"
      + "\nThe method or field value is undefined for the type Object"
      + "\nThe method or field value is undefined for the type Object"
      + "\nThe method or field trigger is undefined for the type Object"
      + "\nThe method generateCodeForContextTrigger(Object, Object) is undefined for the type Object"
      + "\nThe method or field key is undefined for the type Object"
      + "\nThe method or field value is undefined for the type Object"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nkey cannot be resolved"
      + "\ntransitions cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved");
  }
}
