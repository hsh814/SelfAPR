package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import code.perturbation.PerturbActions;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.declaration.CtFieldImpl;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;

/**
 * Entrance of spoon checker
 * 
 * @author 
 *
 */
public class Main {

	/**
	 * Entrance method of spoon checker
	 * 
	 * @param args
	 *            provides input path of java source files
	 */
	
	public static String path="";
	
	public static void main(String[] args) {		
		
//		sourceReader(args[0]);	
		path = "/Users/sophie/Documents/SUPRE/Bears_Training/Bears-2/src/main/java/com/fasterxml/jackson/databind/node/DecimalNode.java";				
		path = "/Users/sophie/Documents/SUPRE/Bears_Training/Bears-2/src/main/java/com/fasterxml/jackson/databind/ObjectWriter.java";
		
		System.out.println(path);
		sourceReader(path);
	}

	
	
	
	
	public static String getPathDir ( ) {
		return path;
	}
	
	
	
	
	/**
	 * 
	 * @param path
	 *            is the input path of java source files
	 * @return
	 */
	public static  void sourceReader(String path) {
		final SpoonAPI spoon = new Launcher();
		spoon.getEnvironment().setNoClasspath(true);
		
		spoon.addInputResource(path);
		spoon.buildModel ( ) ;
		// Get the root element of spoon elements
		CtElement rootElement = spoon.getModel().getRootPackage()
				.getElements(new TypeFilter<CtElement>(CtElement.class)).get(0);		
		
		//Get variables
		List<CtVariable> variablesList = rootElement.getElements(new TypeFilter<CtVariable>(CtVariable.class));
		List<CtFieldImpl> filedList = rootElement.getElements(new TypeFilter<CtFieldImpl>(CtFieldImpl.class));


		Variables.getVariables (variablesList ) ;		
		
		
		
		//Get executables

		Constructors.analysis ( rootElement ) ;
		StatementAnalysis.analysis(rootElement);
		StatementAnalysis.analysis(rootElement);

		
		
		List<CtConstructor> constructors = rootElement.getElements(new TypeFilter<CtConstructor>(CtConstructor.class));					
		List<CtConstructor> constructorList = rootElement.getElements(new TypeFilter<CtConstructor>(CtConstructor.class));		

				
		
		//Get method signature
		List<CtMethod> methodList = rootElement.getElements(new TypeFilter<CtMethod>(CtMethod.class));		

			
		String methodInfo=MethodSignature.getMethodSignature(methodList);	
		System.out.println( methodInfo );		
		
		
		//Data corruption
		
		
		PerturbActions.perturb(filedList,constructorList,methodList);
		
		
	}		
}
