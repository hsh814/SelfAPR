package code.perturbation.buglab;

import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.VariablePerturbation;
import code.perturbation.utils.OperatorUtil;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtOperatorAssignmentImpl;

public class WrongOperator {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * Wrong_Operator Perturbation
		 */

		String actionNo = "[BugLab_Wrong_Operator]";
		List<String> perturbCodeList = VariablePerturbation.perturb(st, groundTruth, false);

		List<CtBinaryOperatorImpl> expressions = st
				.getElements(new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class));

		List<CtOperatorAssignmentImpl> assignmentOperators = st
				.getElements(new TypeFilter<CtOperatorAssignmentImpl>(CtOperatorAssignmentImpl.class));


		if (expressions.size() > 0) {

			for (CtBinaryOperatorImpl expression : expressions) {

				String perturbCode = null;

				String origOpKind = expression.getKind().toString();

				String origOpKindValue = OperatorUtil.getOperatorValue(origOpKind);
				
				String simplefyExpression = SelfAPRUtil.simplefyExpression(expression);

		if (groundTruth.contains(origOpKindValue)) {

			String perturbOpKindValue = OperatorUtil.getRandomLogicOperator(origOpKindValue, groundTruth);
			
			if (groundTruth.contains(simplefyExpression)) {
				String perturbExpression = simplefyExpression.replace(origOpKindValue, perturbOpKindValue);
				perturbCode = groundTruth.replace(simplefyExpression, perturbExpression);

			} else {
				origOpKindValue = " " + origOpKindValue + " ";
				if ("OR".equals(origOpKind)) {
					int index =  groundTruth.indexOf("||");
					String before = groundTruth.subSequence(0, index)+"";
					String later = groundTruth.subSequence(index+2,groundTruth.length())+"";

					perturbCode =before+ perturbOpKindValue + later;

				} else {
					perturbCode = groundTruth.replaceFirst(origOpKindValue, " " + perturbOpKindValue + " ");
				}
			}
			if (!groundTruth.equals(perturbCode) && perturbCode != null) {
				
				perturbCode=perturbCode.trim();
				groundTruth=groundTruth.trim();

				String lstP = perturbCode.charAt(perturbCode.length()-1)+"";
				String lstG = groundTruth.charAt(groundTruth.length()-1)+"";
				
				String frsP = perturbCode.charAt(0)+"";
				String ftsG = groundTruth.charAt(0)+"";
				
				if(!lstP.equals(lstG)) {
					break;
				}
				
				if(!frsP.equals(ftsG)) {
					break;
				}
				
				PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);
			}

		}
			}
		
		
		if (perturbCodeList != null) {
			for (String perturbCode : perturbCodeList) {
				if (!groundTruth.equals(perturbCode) && perturbCode != null) {
					PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
							lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
				}
			}
		}
	}
	}
}