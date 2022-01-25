package pret.generator;

import pret.myDsl.impl.ExprBaseImpl;

public class MyExprBase extends ExprBaseImpl {

	/**
	 * ExprBase constructor
	 * @author charly
	 * 
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
