package code.perturbation;

import java.util.HashMap;
import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.StatementAnalysis;
import code.analysis.Variables;
import code.perturbation.add.AddCondition;
import code.perturbation.add.AddStatement;
import code.perturbation.remove.Remove;
import code.perturbation.remove.RemoveTry;
import code.perturbation.replace.Replace;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.cu.position.NoSourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtAssignmentImpl;
import spoon.support.reflect.code.CtForEachImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.code.CtTryImpl;
import spoon.support.reflect.declaration.CtFieldImpl;

public class PerturbActions {

	public static void randomPerturb(CtElement st, String type, int methStart, int methEnd) {

		double r = SUPREUtil.getRandomDouble();

		Object o = st.getPosition();

		if (o instanceof NoSourcePosition) {
			return;
		}

		if (type.contains("declaration") || type.contains("return") ) {
			Replace.replace(st, type, methStart, methEnd);
		}

		else if (type.contains("condition") ) {
			if(r>0.6) {
			Remove.remove(st, type, methStart, methEnd);
			} else if(r>0.1){
			Replace.replace(st, type, methStart, methEnd);
			} else {
			Replace.replace(st, type, methStart, methEnd);
			AddCondition.add(st, type, methStart, methEnd);
			}
		}	
		
		else if( type.contains("statement") ){
			r = SUPREUtil.getRandomDouble();
			if(r>0.25) {
			Replace.replace(st, type, methStart, methEnd);
			} else if (r>0.1) {
			Remove.remove(st, type, methStart, methEnd);
			} else {
			Replace.replace(st, type, methStart, methEnd);
			AddStatement.add(st, type, methStart, methEnd);
			}
		}
		
		
		else if( type.contains("try") ){
			RemoveTry.remove(st, type, methStart, methEnd);
		}
		
		
		else if (r > 0.99) {
			Replace.replace(st, type, methStart, methEnd);
		} else {
			Remove.remove(st, type, methStart, methEnd);
		}

	}

	/**
	 * This is where we start to perturb the code!
	 * 
	 * @param fieldList
	 * @param constructorList
	 * @param methodList
	 */
	public static void perturb(List<CtFieldImpl> fieldList, List<CtConstructor> constructorList,
			List<CtMethod> methodList) {
		 fieldPerturb(fieldList);
		 constructorPerturb(constructorList);
		 methodPerturb(methodList);

	}

	private static void methodPerturb(List<CtMethod> methodList) {
		for (CtMethod method : methodList) {
			List<CtVariable> variablesList = method.getElements(new TypeFilter<CtVariable>(CtVariable.class));
			Variables.getVariables (variablesList ) ;	
			StatementAnalysis.analysis(method);
			MethodSignature.currentMethod(method);

			SourcePosition position = method.getPosition();
			int methStart = position.getLine();
			int methEnd = position.getEndLine();

			CtBlock block = method.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {

					TypeFilter<CtIfImpl> condfilter = new TypeFilter<CtIfImpl>(CtIfImpl.class);
					TypeFilter<CtStatement> statesFilter = new TypeFilter<CtStatement>(CtStatement.class);
					List<CtStatement> states = st.getElements(statesFilter);

					// conditions
					List<CtIfImpl> conditions = st.getElements(condfilter);
					List<CtForEachImpl> fors = st.getElements(new TypeFilter<CtForEachImpl>(CtForEachImpl.class));

					
					 if (fors.size() > 0) {
						for(CtForEachImpl foreach: fors ) {
							if(methEnd - methStart > 15) {
							methStart = foreach.getParent().getPosition().getLine();
							methEnd = foreach.getParent().getPosition().getEndLine();
							}
						PerturbActions.randomPerturb(foreach, "for", methStart, methEnd);
						}
					 }
					
					else if (conditions.size() > 0) {
						for(CtIfImpl cond: conditions ) {
							
							if(methEnd - methStart > 15) {
							int blockStart = cond.getParent().getPosition().getLine();
							int endStart = cond.getParent().getPosition().getEndLine();
							
							if( blockStart != endStart ) {
								methStart = blockStart;
								methEnd = endStart;
							}}
							
							CtStatement statement = cond.getElseStatement();
							if(statement!=null) {
								PerturbActions.randomPerturb(statement, "condition", methStart, methEnd);
							}
							Object con = cond.getCondition();
							PerturbActions.randomPerturb(cond, "condition", methStart, methEnd);

							
						}

					} else if (states.size() > 0) {
						// CtAssignmentImpl
						
						if(methEnd - methStart > 15) {
						int pos= st.getPosition().getLine();
						int blockStart = st.getParent().getPosition().getLine();
						int endStart = st.getParent().getPosition().getEndLine();
						
						if( blockStart <pos && endStart>pos) {
							methStart = blockStart;
							methEnd = endStart;
						}
						}
						
						
						List<CtAssignmentImpl> assignments = st.getElements(new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class));						
						List<CtReturnImpl> returns = st.getElements(new TypeFilter<CtReturnImpl>(CtReturnImpl.class));
						List<CtTryImpl> trys = st.getElements(new TypeFilter<CtTryImpl>(CtTryImpl.class));

						
						
						
						if(assignments.size()>0) {
							PerturbActions.randomPerturb(st, "assignment", methStart, methEnd);
						}
						else if(returns.size()>0) {
							PerturbActions.randomPerturb(st, "return", methStart, methEnd);
						}	
						
						else if(trys.size()>0) {
							PerturbActions.randomPerturb(st, "try", methStart, methEnd);
						}
						
						else {																											
							PerturbActions.randomPerturb(st, "statement", methStart, methEnd);
						}

						

					}

				}}}
			
		
	}

	public static void fieldPerturb(List<CtFieldImpl> fieldList) {
		for (CtFieldImpl variable : fieldList) {
			int start = variable.getPosition().getLine();
			int end = variable.getPosition().getEndLine();
			PerturbActions.randomPerturb(variable, "declaration", start, end);
		}

	}

	public static void constructorPerturb(List<CtConstructor> constructors) {
		for (CtConstructor cons : constructors) {

			SourcePosition position = cons.getPosition();
			int methStart = position.getLine();
			int methEnd = position.getEndLine();

			CtBlock block = cons.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {

					TypeFilter<CtIfImpl> condfilter = new TypeFilter<CtIfImpl>(CtIfImpl.class);
					TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
					TypeFilter<CtStatement> statesFilter = new TypeFilter<CtStatement>(CtStatement.class);
					List<CtStatement> states = st.getElements(statesFilter);

					// conditions
					List<CtIfImpl> conditions = st.getElements(condfilter);
					if (conditions.size() > 0) {
						PerturbActions.randomPerturb(st, "condition", methStart, methEnd);

					} else if (states.size() > 0) {
						// CtAssignmentImpl
						
						TypeFilter<CtAssignmentImpl> assignmentfilter = new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class);
						List<CtAssignmentImpl> assignments = st.getElements(assignmentfilter);
						
						if(assignments.size()>0) {
							PerturbActions.randomPerturb(st, "assignment", methStart, methEnd);
						}else {
							PerturbActions.randomPerturb(st, "statement", methStart, methEnd);

						}

						

					}

				}
			}
		}
	}

}
