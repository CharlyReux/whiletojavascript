package paramInterpreter.inter.generator;

import paramInterpreter.inter.myDsl.impl.ExprBaseImpl;

public class MyExprBase extends ExprBaseImpl {

	/**
	 * @author charly
	 * function to generator our own ExprBase
	 * 
	 * @param n : the type of exprBase (ex:"nil"/"var" or "symb")
	 * @param in : whats inside the ExprBase (ex:"nil"/"X" or "x")
	 */
	public MyExprBase(String n,String in) {
		switch(n) {
		case "nil":
			this.setNi("nil");
			break;
		case "symb":
			this.setSy(in);
			break;
		}
	}
}
