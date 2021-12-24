package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;

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

	public static void main(String[] args) {		
		sourceReader("/Users/sophie/Documents/d4jtest-specification/chart26b/source/org/jfree/chart/axis/Axis.java");
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
		spoon.buildModel();
		// Get the root element of spoon elements
		CtElement rootElement = spoon.getModel().getRootPackage()
				.getElements(new TypeFilter<CtElement>(CtElement.class)).get(0);		
		
		//Get variables
		List<CtVariable> variablesList = rootElement.getElements(new TypeFilter<CtVariable>(CtVariable.class));

		String variableInfo = Variables.getVariables(variablesList);		
		System.out.println(variableInfo);
		
		//Get method signature
		List<CtMethod> methodList = rootElement.getElements(new TypeFilter<CtMethod>(CtMethod.class));					
			
		String methodInfo=MethodSignature.getMethodSignature(methodList);	
		System.out.println(methodInfo);		
		
		//Data corruption
		MethodAnalysis.analysis(methodList,variableInfo,methodInfo);
		
		

		
		
	}		
}
