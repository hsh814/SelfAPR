package code.perturbation;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import code.analysis.ConditionAnalysis;
import code.analysis.MethodSignature;
import code.analysis.StatementAnalysis;
import code.analysis.Variables;
import code.perturbation.add.AddCondition;
import code.perturbation.add.AddStatement;
import code.perturbation.remove.Remove;
import code.perturbation.remove.RemoveTry;
import code.perturbation.replace.Replace;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCatch;
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
import spoon.support.reflect.code.CtBlockImpl;
import spoon.support.reflect.code.CtCatchImpl;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtForEachImpl;
import spoon.support.reflect.code.CtForImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.code.CtThrowImpl;
import spoon.support.reflect.code.CtTryImpl;
import spoon.support.reflect.code.CtWhileImpl;
import spoon.support.reflect.declaration.CtFieldImpl;

public class PerturbActions {

	public static void randomPerturb(CtElement st, StatementType type, int methStart, int methEnd) {
		try {
					
		String stStr = st.toString().replace("\r", " ").replace("\n", " ");
		System.out.println( " ==== type =====" + type+ "===== st: ====" + stStr );
		double r = SelfAPRUtil.getRandomDouble();

		Object o = st.getPosition();

		if (o instanceof NoSourcePosition) {
			return;
		}
			
		Replace.replace(st, type, methStart, methEnd);
		
//
//			else if (type==StatementType.Condition) {
//				Replace.replace(st, type, methStart, methEnd);
//				if (r > 0.5) {
//					Remove.remove(st, type, methStart, methEnd);
//				} else if (r > 0.2) {
//					AddCondition.add(st, type, methStart, methEnd);
//				}
//			}
//
//			else if (type==StatementType.Statement) {
//				r = SUPREUtil.getRandomDouble();
//				Replace.replace(st, type, methStart, methEnd);
//				if (r > 0.5) {
//					Remove.remove(st, type, methStart, methEnd);
//				} else if (r > 0.2) {
//					AddStatement.add(st, type, methStart, methEnd);
//				}
//			}
//
//			else if (type==StatementType.Try) {
//				Replace.replace(st, type, methStart, methEnd);
//				RemoveTry.remove(st, type, methStart, methEnd);
//			}
//
//			else {
//				Replace.replace(st, type, methStart, methEnd);
//				Replace.replace(st, type, methStart, methEnd);
//				Remove.remove(st, type, methStart, methEnd);
//			}

		} 
		catch (Exception e) {
			System.out.println("=============exception=========" + e.getLocalizedMessage());
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
			Variables.getVariables(variablesList);
			StatementAnalysis.analysis(method);
			MethodSignature.currentMethod(method);
			ConditionAnalysis.currentConditions(method);

			SourcePosition position = method.getPosition();
			int methStart = position.getLine();
			int methEnd = position.getEndLine();

			CtBlock block = method.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {
					processStatement(st, methStart, methEnd);
				}

			}
		}
	}

	private static void processStatement(CtStatement st, int methStart, int methEnd) {

		if (methEnd - methStart > 25) {
			int pos = st.getPosition().getLine();
			int blockStart = st.getParent().getPosition().getLine();
			int endStart = st.getParent().getPosition().getEndLine();

			if (blockStart < pos && endStart > pos && endStart-blockStart<methEnd - methStart) {
				methStart = blockStart;
				methEnd = endStart;
			}			
			
		}
			List<CtAssignmentImpl> assignments = st
					.getElements(new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class));
			List<CtReturnImpl> returns = st.getElements(new TypeFilter<CtReturnImpl>(CtReturnImpl.class));

			List<CtConstructorCallImpl> constructorCall = st
					.getElements(new TypeFilter<CtConstructorCallImpl>(CtConstructorCallImpl.class));

			List<CtLocalVariableImpl> localVariableImpl = st
					.getElements(new TypeFilter<CtLocalVariableImpl>(CtLocalVariableImpl.class));

			List<CtCatchImpl> catchs = st.getElements(new TypeFilter<CtCatchImpl>(CtCatchImpl.class));

			List<CtThrowImpl> throwss = st.getElements(new TypeFilter<CtThrowImpl>(CtThrowImpl.class));

			List<CtIfImpl> conditions = st.getElements(new TypeFilter<CtIfImpl>(CtIfImpl.class));

			List<CtInvocationImpl> invocations = st
					.getElements(new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class));
			List<CtTryImpl> trys = st.getElements(new TypeFilter<CtTryImpl>(CtTryImpl.class));
			List<CtForImpl> fors = st.getElements(new TypeFilter<CtForImpl>(CtForImpl.class));
			List<CtWhileImpl> whiles = st.getElements(new TypeFilter<CtWhileImpl>(CtWhileImpl.class));

			if (whiles.size() > 0) {
				System.out.println();
				for (CtWhileImpl w : whiles) {
					PerturbActions.randomPerturb(w, StatementType.Whiles, methStart, methEnd);
					CtStatement s = w.getBody();
					if(s!=null) {
						processStatement(s, methStart, methEnd);
					}					
					
				}
			}

			if (conditions.size() > 0) {
				for (CtIfImpl cond : conditions) {
					PerturbActions.randomPerturb(cond, StatementType.Condition, methStart, methEnd);
					CtStatement elseStatement = cond.getElseStatement();
					CtStatement thenStatement = cond.getThenStatement();
					if (elseStatement != null) {
						processStatement(elseStatement, methStart, methEnd);
					}
					if (thenStatement != null) {
						processStatement(thenStatement, methStart, methEnd);
					}
				}
			}

			if (fors.size() > 0) {
				for (CtForImpl foreach : fors) {
					
					PerturbActions.randomPerturb(foreach, StatementType.For, methStart, methEnd);

					CtStatement forbody = foreach.getBody();

					if (forbody != null) {
						System.out.println();
						processStatement(forbody, methStart, methEnd);
					}

				}
			}

			if (trys.size() > 0) {
				for (CtTryImpl t : trys) {
					PerturbActions.randomPerturb(t, StatementType.Try, methStart, methEnd);
					List<CtCatch> catchers = t.getCatchers();
					CtBlock<?> b = t.getBody();
					processStatement(b, methStart, methEnd);
				}
			}

			if (assignments.size() > 0) {
				for (CtAssignmentImpl a : assignments) {
					PerturbActions.randomPerturb(a, StatementType.Assignment, methStart, methEnd);
				}
			}

			if (returns.size() > 0) {
				for (CtReturnImpl r : returns) {
					PerturbActions.randomPerturb(r, StatementType.Return, methStart, methEnd);
				}
			}

			if (constructorCall.size() > 0) {
				for (CtConstructorCallImpl c : constructorCall) {
					PerturbActions.randomPerturb(c, StatementType.Constructor, methStart, methEnd);
				}
			}

			if (localVariableImpl.size() > 0) {
				for (CtLocalVariableImpl l : localVariableImpl) {
					PerturbActions.randomPerturb(l, StatementType.LocalVariable, methStart, methEnd);
				}
			}

			if (throwss.size() > 0) {
				for (CtThrowImpl t : throwss) {
					PerturbActions.randomPerturb(t, StatementType.Throw, methStart, methEnd);
				}
			}

			if (catchs.size() > 0) {
				for (CtCatchImpl c : catchs) {
					PerturbActions.randomPerturb(c, StatementType.Catch, methStart, methEnd);
				}
			}

			if (invocations.size() > 0 && localVariableImpl.size()==0 && returns.size() ==0
					&& assignments.size()==0 &&trys.size()==0 && fors.size()==0 &&  conditions.size()==0 && whiles.size()==0) {
				for (CtInvocationImpl i : invocations) {
					PerturbActions.randomPerturb(i, StatementType.Statement, methStart, methEnd);
				}
			}
		
	}

	public static void fieldPerturb(List<CtFieldImpl> fieldList) {
		for (CtFieldImpl variable : fieldList) {
			int start = variable.getPosition().getLine();
			int end = variable.getPosition().getEndLine();
			PerturbActions.randomPerturb(variable, StatementType.Declaration, start, end);
		}
	}

	public static void constructorPerturb(List<CtConstructor> constructors) {
		for (CtConstructor cons : constructors) {

			List<CtVariable> variablesList = cons.getElements(new TypeFilter<CtVariable>(CtVariable.class));
			Variables.getVariables(variablesList);
			StatementAnalysis.analysis(cons);
			MethodSignature.currentMethod(cons);

			SourcePosition position = cons.getPosition();
			int methStart = position.getLine();
			int methEnd = position.getEndLine();

			CtBlock block = cons.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {

					processStatement(st, methStart, methEnd);

				}

			}
		}
	}

}
