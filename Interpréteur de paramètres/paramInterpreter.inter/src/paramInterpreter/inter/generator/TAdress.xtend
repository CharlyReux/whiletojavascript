package paramInterpreter.inter.generator

import java.util.List
import java.util.LinkedList

class TAdress {
	Op op
	String X
	String Y
	String Z
	private static val consTmp1 = "";
	private static val consTmp2 = "";

	new(Op op, String x, String y, String Z) {
		this.op = op
		this.X = x
		this.Y = y
		this.Z = Z
	}

	def Op getOp() {
		return op
	}

	def String getX() {
		return X
	}

	def String getY() {
		return Y
	}

	def String getZ() {
		return Z
	}

	override String toString() {
		var String res = "<" + op + "," + X + "," + Y + "," + Z + ">\n"

		return res;
	}

// Fonction de génération de code JS a partie d'un code 3 adresses
	def translate(MyDslGenerator gen) {
		var String rt = ""
		var String operateur = op.toString().split(' ').get(0);

		switch (operateur) {
			case "nop":
				rt += "//nop\n"
			case "boolEq":
				rt += gen.getSymb(x) + " = Boolean(" + gen.getSymb(y) + " == " + gen.getSymb(z) + ");\n"
			case "tl":
				rt += gen.getSymb(x) + " = " + gen.getSymb(y) + ".filsDroit();\n"
			case "hd":
				rt += gen.getSymb(x) + " = " + gen.getSymb(y) + ".filsGauche();\n"
			case "const":
				rt += gen.getSymb(x) + " = " + gen.getSymb(op.toString().split(' ').get(1)) + ";\n"
			case "nil":
				rt += gen.getSymb(x) + " = new ArbreBin();\n"
			default:
				if (operateur == "cons") {
					if (y == "_") {
						rt += gen.getSymb(x) + " = new ArbreBin();\n"
					} else if (z == "_") {
						rt += gen.getSymb(x) + " = new ArbreBin(null," + gen.getSymb(y) + ");\n"
					} else {
						rt += gen.getSymb(x) + " = new ArbreBin(null," + gen.getSymb(y) + ", " + gen.getSymb(z) + ");\n"
					}
				} else if (operateur == "ifnn") {
					rt += tradStructControl(gen, "if", false);
				} else if (operateur == "ifenn") {
					rt += tradStructControl(gen, "if", true);
				} else if (operateur == "whnn") {
					rt += tradStructControl(gen, "while", false);
				} else if (operateur == "for") {
					rt += tradStructControl(gen, "for", false);
				} else if (operateur == "foreach") {
					var List<TAdress> co = new LinkedList<TAdress>();
					var List<TAdress> th = new LinkedList<TAdress>();
					co = (op as OpIt).getCond();
					th = (op as OpIt).getThen();
					rt += "for("
					var String tmp = "";
					for (var int i = 0; i < co.length(); i++) {
						if (!(co.get(i).op.toString().contains("const"))) {
							tmp += gen.getSymb(X) + " in (" + co.get(i).translateCond(gen);
						}
					}
					rt += tmp + ")){\n";
					tmp = "";
					for (var int i = 0; i < th.length(); i++) {
						tmp += "\t" + th.get(i).translate(gen);
					}
					rt += tmp + "}\n";
					tmp = "";
				} else {
					rt += "//Erreur code non trouve\n"
				}
		}
		return rt;
	}

	/*
	 * Contruit le code traduit pour les Structures de controle (if, while, for, etc.)
	 * @param els : si il y a un else ou non
	 * @param operateur le String indiquant l'op�rateur de Structure de controle
	 */
	def tradStructControl(MyDslGenerator gen, String operateur, Boolean els) {
		var String rt = ""
		var List<TAdress> co = new LinkedList<TAdress>();
		var List<TAdress> th = new LinkedList<TAdress>();
		var List<TAdress> el = new LinkedList<TAdress>();
		co = (op as OpIt).getCond();
		th = (op as OpIt).getThen();
		if (els) {
			el = (op as OpIt).getThen();
		}
		rt += operateur + "("
		var String tmp = "";
		for (var int i = 0; i < co.length(); i++) {
			tmp += co.get(i).translateCond(gen);
		}
		rt += tmp + "){\n";
		tmp = "";
		for (var int i = 0; i < th.length(); i++) {
			tmp += "\t" + th.get(i).translate(gen);
		}
		rt += tmp + "}\n";
		tmp = "";
		if (els) {
			rt += "\nelse {\n";
			tmp = "";
			for (var int i = 0; i < el.length(); i++) {
				tmp += "\t" + el.get(i).translate(gen);
			}
			rt += tmp + "}\n";
			tmp = "";
		}
		rt += tmp
		return rt
	}

	def translateCond(MyDslGenerator gen) {
		var String operateur = op.toString().split(' ').get(0);
		var String rt = "";
		switch (operateur) {
			case "boolEq":
				rt += "Boolean(" + gen.getSymb(y) + " == " + gen.getSymb(z) + ")"
			case "tl":
				rt += gen.getSymb(Y) + ".filsDroit()"
			case "hd":
				rt += gen.getSymb(Y) + ".filsGauche()"
//			case "const":
//				rt += gen.getSymb(op.toString().split(' ').get(1))
			case "nil":
				rt += "new ArbreBin()"
			default:
				rt += ""
		}
		return rt;
	}
}
