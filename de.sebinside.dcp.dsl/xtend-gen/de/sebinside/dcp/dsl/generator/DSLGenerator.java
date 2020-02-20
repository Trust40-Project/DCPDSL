/**
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.palladiosimulator.supporting.prolog.model.prolog.CompoundTerm;
import org.palladiosimulator.supporting.prolog.model.prolog.Fact;
import org.palladiosimulator.supporting.prolog.model.prolog.Program;
import org.palladiosimulator.supporting.prolog.model.prolog.PrologFactory;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Fact test = DSLGenerator.createFact("Test");
    final Program program = PrologFactory.eINSTANCE.createProgram();
    program.getClauses().add(test);
    fsa.generateFile("test.pl", program.toString());
    InputOutput.<String>println("Done");
  }
  
  public static Fact createFact(final String name) {
    Fact _xblockexpression = null;
    {
      final Fact fact = PrologFactory.eINSTANCE.createFact();
      final CompoundTerm term = PrologFactory.eINSTANCE.createCompoundTerm();
      term.setValue(name);
      term.getArguments();
      fact.setHead(term);
      _xblockexpression = fact;
    }
    return _xblockexpression;
  }
}
