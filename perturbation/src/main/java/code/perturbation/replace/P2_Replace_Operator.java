package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.OperatorPerturbation;
import code.perturbation.utils.OperatorUtil;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtOperatorAssignmentImpl;

public class P2_Replace_Operator {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4) {

		/**
		 * operator perturbation
		 */

		// CtBinaryOperatorImpl expression
		List<CtBinaryOperatorImpl> expressions = st
				.getElements(new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class));

		List<CtOperatorAssignmentImpl> assignmentOperators = st
				.getElements(new TypeFilter<CtOperatorAssignmentImpl>(CtOperatorAssignmentImpl.class));

		if (expressions.size() > 0) {

			for (CtBinaryOperatorImpl expression : expressions) {

				String perturbCode = null;

				String origOpKind = expression.getKind().toString();

				String origOpKindValue = OperatorUtil.getOperatorValue(origOpKind);

				if (groundTruth.contains(origOpKindValue)) {

					String perturbOpKindValue = OperatorUtil.getRandomLogicOperator(origOpKindValue, groundTruth);
					perturbCode = groundTruth.replaceFirst(" " + origOpKindValue + " ", " " + perturbOpKindValue + " ");

					if (!groundTruth.equals(perturbCode) && perturbCode != null) {

						HashMap<String, String> map = new HashMap<String, String>();

						map.put("lineNo1", lineNo1 + "");
						map.put("lineNo2", lineNo2 + "");
						map.put("lineNo3", lineNo3 + "");
						map.put("lineNo4", lineNo4);
						map.put("lineNo5", "");
						map.put("perturbCode", perturbCode);
						map.put("groundTruth", groundTruth);
						map.put("methodStart", methStart + "");
						map.put("methodEnd", methEnd + "");
						map.put("repairAction", "[P2]");

						PerturbResult.getCorruptedResult(map);
					}

				}

			}

		}

		if (assignmentOperators.size() > 0) {

			for (CtOperatorAssignmentImpl assignments : assignmentOperators) {

				if (assignments.getKind().toString().equals("PLUS")  || assignments.getKind().toString().equals("MINUS") ) {
					String perturbCode = null;
					String origOpKindValue = "";
					if(assignments.getKind().toString().equals("PLUS")) {
						if(groundTruth.contains("+=")) {
						 origOpKindValue = "+=";
						}else {
							origOpKindValue = "+";
						}
					} else if(assignments.getKind().toString().equals("MINUS")){
						if(groundTruth.contains("-=")) {
							 origOpKindValue = "-=";
							}else {
								origOpKindValue = "-";
							}
					}
					
					
								
					
					

					if (groundTruth.contains(origOpKindValue)) {

						String perturbOpKindValue = OperatorUtil.getRandomLogicOperator(origOpKindValue, groundTruth);
						perturbCode = groundTruth.replaceFirst(" " + origOpKindValue + " ",
								" " + perturbOpKindValue + " ");

						if (!groundTruth.equals(perturbCode) && perturbCode != null) {

							HashMap<String, String> map = new HashMap<String, String>();

							map.put("lineNo1", lineNo1 + "");
							map.put("lineNo2", lineNo2 + "");
							map.put("lineNo3", lineNo3 + "");
							map.put("lineNo4", lineNo4);
							map.put("lineNo5", "");
							map.put("perturbCode", perturbCode);
							map.put("groundTruth", groundTruth);
							map.put("methodStart", methStart + "");
							map.put("methodEnd", methEnd + "");
							map.put("repairAction", "[P2]");

							PerturbResult.getCorruptedResult(map);
						}
					}
				}
			}
		}
	}
}