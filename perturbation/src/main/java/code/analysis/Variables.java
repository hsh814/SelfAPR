package code.analysis;

import java.util.List;

import spoon.reflect.declaration.CtVariable;

public class Variables {

	static String getVariables(List<CtVariable> variablesList) {
		String variableInfo = "";
		for (CtVariable variable : variablesList) {
			String variableType = variable.getType().getSimpleName();
			String variableName = variable.getSimpleName();
			String defaultValue = "";
			if (variable.getDefaultExpression() != null) {
				String expression = variable.getDefaultExpression().toString();
				if (expression.contains("new")) {
					defaultValue = "";
				} else {
					defaultValue = expression;
				}

			}

			if ("".equals(defaultValue)) {
				variableInfo += " [VTYPE] " + variableType + " [VNAME] " + variableName;
			} else {
				// variableInfo+= " [TYPE] " + variableType +" [VNAME] "+ variableName + "
				// [VVALUE] " + defaultValue;
				variableInfo += " [VTYPE] " + variableType + " [VNAME] " + variableName;

			}
		}

		return variableInfo;
	}
}
