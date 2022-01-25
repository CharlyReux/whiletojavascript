package paramInterpreter.inter.generator;

import java.util.List;

/**
 * code opérateur des expression simples genre nil, cons, hd ...
 *
 */
class Op {
	String name;

	public Op(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// getters
	public String getName() {
		return name;
	}

}


/**
 * code opérateur des expression <const...
 *
 */
class Opsymb extends Op {

	String numSymb;

	public Opsymb(String name, String numSymb) {
		super(name);
		this.numSymb = numSymb;
	}

	@Override
	public String toString() {
		return super.toString()+" "+numSymb;
	}

	// getters
	public String getNumSymb() {
		return numSymb;
	}

}

/**
 * codes opérateur des expression conditionnelles 
 * pour la traduction voir le cours du prof
 *
 */
class OpIt extends Op {

	List<TAdress> cond;
	List<TAdress> then;
	List<TAdress> els;

	public OpIt(String name, List<TAdress> cond, List<TAdress> then, List<TAdress> els) {
		super(name);
		this.cond = cond;
		this.then = then;
		this.els = els;
	}

	public static String TadlistToString(List<TAdress> Ta) {
		String st ="";
		for(TAdress T:Ta) {
			st+=T.toString()+"\n";
		}
		return st;
	}

	@Override
	public String toString() {
		return super.toString() + " cond:" + TadlistToString(cond) + "then:" + TadlistToString(then)+ (els.isEmpty() ? "" :"else:" + TadlistToString(els));//possibilité d'enlever les cond then else qui servent juste pour la clarté 
	}

	// getters
	public List<TAdress> getCond() {
		return cond;
	}

	public List<TAdress> getThen() {
		return then;
	}

	public List<TAdress> getEls() {
		return els;
	}

}
