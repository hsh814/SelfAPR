package code.perturbation.remove;

import java.util.HashMap;
import java.util.Random;

import code.output.result.PerturbResult;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;

public class FullyRemove {

	/**
	 * In this function, we remove only the condition 
	 * - if (this.tickMarksVisible != that.tickMarksVisible) {
             return false;
       - }
	 * 
	 * or one line of code insider of condition (type=statement)
	 * @param exp
	 * @param type
	 * @return
	 */
	public static void remove(CtCodeElement exp, String type, int methodStart, int methodEnd) {

		HashMap<String, String> map = new HashMap<String, String>();
		int lineNo1 = exp.getPosition().getLine();
		String groundTruth = "";
		
		int count = 0;
		String lineNo2 = "";

		if(exp == null || exp.getPosition()==null || exp.getPosition().getFile()==null) {
			return;
		}

		String targetFile = exp.getPosition().getFile().getAbsolutePath();
		String[] parent = exp.getParent().toString().split("\\n");
		
		double r = Math.random();

		
		if ("cond".equals(type)) {
			
			//perturbation 1:  remove conditions	
			if (r>0.5 && "cond".equals(type) ) {
			String last = parent[parent.length - 1];
			System.out.println(parent[parent.length - 1]);
			if ("}".equals(last)) {
				count = parent.length - 1;
			}
			lineNo2 = lineNo1 + count + "";
			
			groundTruth = SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1);
			groundTruth = groundTruth.trim();
			String lastChar = groundTruth.substring(groundTruth.length() - 1);

			// remove the last {
			if ("{".equals(lastChar)) {
				groundTruth = groundTruth.substring(0, groundTruth.length() - 2);

				map.put("lineNo1", lineNo1 + "");
				map.put("lineNo2", lineNo2 + "");
				map.put("lineNo3", "");
				map.put("lineNo4", "");
				map.put("lineNo5", "");
				map.put("line1", "");
				map.put("line2", "");
				map.put("line3", "");
				map.put("line4", "");
				map.put("line5", "");
				map.put("groundTruth", groundTruth);
				map.put("methodStart", methodStart + "");
				map.put("methodEnd", methodEnd + "");
				map.put("repairAction", "[ADD]");
				map.put("targetFile", targetFile);

				PerturbResult.getCorruptedResult(map);
			}
			} else if (r>0.1) {
				int statementNo = parent.length;
				Random rand = new Random();
				int randStatementNo = rand.nextInt(statementNo-1);
				lineNo1 = lineNo1+randStatementNo;			
				
				groundTruth = SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1);
				groundTruth = groundTruth.trim();

				map.put("lineNo1", lineNo1 + "");
				map.put("lineNo2", lineNo2 + "");
				map.put("lineNo3", "");
				map.put("lineNo4", "");
				map.put("lineNo5", "");
				map.put("line1", "");
				map.put("line2", "");
				map.put("line3", "");
				map.put("line4", "");
				map.put("line5", "");
				map.put("groundTruth", groundTruth);
				map.put("methodStart", methodStart + "");
				map.put("methodEnd", methodEnd + "");
				map.put("repairAction", "[ADD]");
				map.put("targetFile", targetFile);

				PerturbResult.getCorruptedResult(map);								
			}
		} else if ("statement".equals(type)) {
			
			
			groundTruth = SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1);
			groundTruth = groundTruth.trim();

			map.put("lineNo1", lineNo1 + "");
			map.put("lineNo2", lineNo2 + "");
			map.put("lineNo3", "");
			map.put("lineNo4", "");
			map.put("lineNo5", "");
			map.put("line1", "");
			map.put("line2", "");
			map.put("line3", "");
			map.put("line4", "");
			map.put("line5", "");
			map.put("groundTruth", groundTruth);
			map.put("methodStart", methodStart + "");
			map.put("methodEnd", methodEnd + "");
			map.put("repairAction", "[ADD]");
			map.put("targetFile", targetFile);

			PerturbResult.getCorruptedResult(map);	
			
		}
	}
}