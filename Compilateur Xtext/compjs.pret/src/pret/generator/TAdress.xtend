package pret.generator

import java.util.List
import java.util.LinkedList

class TAdress {
	Op op
	String X
	String Y
	String Z
	private static int nbTab = 1;

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

	private def repeat(String s, int n) {
		var String rt = "";
		for (var int i = 0; i < n; i++) {
			rt += s
		}
		return rt;
	}

// Fonction de génération de code JS a partie d'un code 3 adresses
	def translate(Fonction f) {
		var String rt = ""
		var String operateur = op.toString().split(' ').get(0);
		switch (operateur) {
			case "nop":
				rt += repeat("\t", nbTab) + "//nop\n"
			case "boolEq":
				
				rt += repeat("\t", nbTab) + f.getSymb(x) + " = " + f.getSymb(y) +  ".equals(" + f.getSymb(z) + ");\n"
			case "tl":
				rt += repeat("\t", nbTab) + f.getSymb(x) + " = " + f.getSymb(y) + ".filsDroit;\n"
			case "hd":
				rt += repeat("\t", nbTab) + f.getSymb(x) + " = " + f.getSymb(y) + ".filsGauche;\n"
			case "const":
				rt += repeat("\t", nbTab) + f.getSymb(x) + " = " + f.getSymb(op.toString().split(' ').get(1)) + ";\n"
			case "nil":
				rt += repeat("\t", nbTab) + f.getSymb(x) + " = new ArbreBin();\n"
			default:
				if (operateur == "cons") {
					if (y == "_") {
						rt += repeat("\t", nbTab) + f.getSymb(x) + " = new ArbreBin();\n"
					} else if (z == "_") {
						rt += repeat("\t", nbTab) + f.getSymb(x) + " = new ArbreBin(null," + f.getSymb(y) + ");\n"
					} else {
						rt += repeat("\t", nbTab) + f.getSymb(x) + " = new ArbreBin(null," + f.getSymb(y) + ", " + f.getSymb(z) + ");\n"
					}
				} else if (operateur == "ifnn") {
					rt += "\n" + tradStructControl(f, "if", false);
				} else if (operateur == "ifenn") {
					rt += "\n" + tradStructControl(f, "if", true);
				} else if (operateur == "whnn") {
					rt += "\n" + tradStructControl(f, "while", false);
				} else if (operateur == "for") {
					rt += "\n" + tradStructControl(f, "for", false);
				} else if (operateur == "foreach") {
					var List<TAdress> co = new LinkedList<TAdress>();
					var List<TAdress> th = new LinkedList<TAdress>();
					co = (op as OpIt).getCond();
					th = (op as OpIt).getThen();
					var String rcond = ""
					var String tmp = "";
					for (var int i = 0; i < co.length(); i++) {
						tmp += co.get(i).translateCond(f);
						if (i == co.length() - 1) {
							rcond = f.getSymb(co.get(i).X);
						}
					}
					rt += "\n" + tmp + "\n" + repeat("\t", nbTab) + "while(" + rcond + ".nombreNoeudsDroite() != 0"
					rt += "){\n";
					nbTab++;
					rt+=repeat("\t", nbTab) + f.getSymb(X) + " = " + rcond + ".filsGauche;\n"
					rt+=repeat("\t", nbTab) + rcond + " = " + rcond + ".filDroit;\n"
					tmp = "";
					for (var int i = 0; i < th.length(); i++) {
						tmp += th.get(i).translate(f);
					}
					nbTab--;
					rt += tmp + repeat("\t", nbTab) + "}\n";
					tmp = "";
				} 
				else if(operateur == "call"){
					var List<String> input = (this.op as OpCall).getParamList();
					var String funName = (this.op as OpCall).getFc().getfName();
					var List<String> in = new LinkedList<String>();
					in = (op as OpCall).getoutputList;
					
					rt += repeat("\t", nbTab) + "tmp" + " = " + funName + "(" + f.getSymb(input.get(0));
					for(var int i = 1; i<input.length(); i++){
						rt+=", " + f.getSymb(input.get(i));
					}
					rt+=")\n"
					
					for(var i = 0; i< in.length; i++){
						rt+= repeat('\t',nbTab) + f.getSymb(in.get(i)) + " = tmp[" + i + "];\n" 
					}
				}
				else {
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
	def tradStructControl(Fonction f, String operateur, Boolean els) {
		var String rt = ""
		var List<TAdress> co = new LinkedList<TAdress>();
		var List<TAdress> th = new LinkedList<TAdress>();
		var List<TAdress> el = new LinkedList<TAdress>();
		co = (op as OpIt).getCond();
		th = (op as OpIt).getThen();
		if (els) {
			el = (op as OpIt).getThen();
		}

		var String rcond = ""
		var String tmp = "";
		for (var int i = 0; i < co.length(); i++) {
			tmp += co.get(i).translateCond(f);
			if (i == co.length() - 1) {
				rcond = f.getSymb(co.get(i).X);
			}
		}
		rt += tmp + "\n" + repeat("\t", nbTab) + operateur + "(" 
		if(operateur == "for"){
			rt += "let i"+ nbTab + " = 0; i" + nbTab + "<" + rcond + ".nombreNoeudsDroite(); i" + nbTab + "++"
		}
		else{
			rt += rcond+".isTrue()"
		}

		rt += "){\n";
		nbTab++;
		tmp = "";
		for (var int i = 0; i < th.length(); i++) {
			tmp += th.get(i).translate(f);
		}

		nbTab--;
		rt += tmp + repeat("\t", nbTab) + "}\n";
		tmp = "";
		if (els) {
			rt += "\n" + repeat("\t", nbTab) + "else {\n";
			tmp = "";
			for (var int i = 0; i < el.length(); i++) {
				tmp += repeat("\t", nbTab) + el.get(i).translate(f);
			}

			nbTab--;
			rt += tmp + repeat("\t", nbTab) + "}\n";
			tmp = "";
		}
		rt += tmp
		return rt
	}

	def translateCond(Fonction f) {
		var String operateur = op.toString().split(' ').get(0);
		var String rt = repeat("\t", nbTab);
		switch (operateur) {
			case "boolEq":
				rt += f.getSymb(x) + " = " + f.getSymb(y) +  ".equals(" + f.getSymb(z) + ");\n"
			case "tl":
				rt += f.getSymb(x) + " = " + f.getSymb(y) + ".filsDroit;\n"
			case "hd":
				rt += f.getSymb(x) + " = " + f.getSymb(y) + ".filsGauche;\n"
			case "const":
				rt += f.getSymb(x) + " = " + f.getSymb(op.toString().split(' ').get(1)) + ";\n"
			case "nil":
				rt += f.getSymb(x) + " = new ArbreBin();\n"
			default:
				if (operateur == "cons") {
					if (y == "_") {
						rt += f.getSymb(x) + " = new ArbreBin();\n"
					} else if (z == "_") {
						rt += f.getSymb(x) + " = new ArbreBin(null," + f.getSymb(y) + ");\n"
					} else {
						rt += f.getSymb(x) + " = new ArbreBin(null," + f.getSymb(y) + ", " + f.getSymb(z) + ");\n"
					}
				} 
		}
		return rt;
	}
}
