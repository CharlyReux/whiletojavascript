package pret.generator;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class Fonction {
	private String FormerName;// ancien nom de la fonction
	private String fName;// nouveau nom généré
	private List<TAdress> lt;// liste des 3@

	private List<String> input;
	private List<String> output;

	private int nbVar;
	private int nbSymb;

	// Table des syboles et variables
	private Hashtable<String, String> tableSymb = new Hashtable<String, String>();
	private Hashtable<String, String> tableVar = new Hashtable<String, String>();

	static int counter;// compteur du nombre de fonction pour l'assignation

	public Fonction(String Name, List<TAdress> lt) {
		FormerName = Name;
		this.lt = lt;

		if (Name == "main") {
			fName = "main";
		} else {
			fName = "f" + counter;
			counter++;
		}
		nbVar = 0;
		nbSymb = 0;
		this.input = new LinkedList<String>();
		this.output = new LinkedList<String>();
	}

	public Fonction(String Name) {
		FormerName = Name;
		if (Name.equals("main")) {
			fName = "main";
		} else {
			fName = "f" + counter;
			counter++;
		}
		nbVar = 0;
		nbSymb = 0;
		this.lt = new LinkedList<TAdress>();
		this.input = new LinkedList<String>();
		this.output = new LinkedList<String>();
	}

	public void addAddress(TAdress a) {
		lt.add(a);
	}

	public void addAddress(List<TAdress> lt) {
		this.lt.addAll(lt);
	}

	public void setSymb(String s) {
		if (!s.matches("R[0-9]*")) {
			if (verifCharMin(s.charAt(0))) {
				if (!tableSymb.containsKey(s)) {
					tableSymb.put(s, 's' + String.valueOf(nbSymb));
					nbSymb++;
				}
			} else if (!tableVar.containsKey(s)) {
				tableVar.put(s, 'v' + String.valueOf(nbVar));
				nbVar++;
			}
		} else {
			if (!tableVar.containsKey(s)) {
				tableVar.put(s, 'v' + String.valueOf(nbVar));
				nbVar++;
			}
		}
	}

	private boolean verifCharMin(char c) {
		boolean res = (int) c >= 97 && (int) c <= 122;
		return res;
	}

	public String generateCode() {
		String rt = "function " + fName + "(" + String.join(",", input) + "){\n";
		for (String s : tableVar.values()) {
			if (!s.matches("In[0-9]*")) {
				rt += "\tvar " + s + ";\n";
			}
		}
		for (String s : tableSymb.values()) {
			rt += "\tvar " + s + " = new ArbreBin(\"" + s + "\");\n";
		}
		rt += "\n";
		for (TAdress code : lt) {
			rt += code.translate(this);
		}
		rt += "\n";
		rt += "\treturn [" + String.join(",", output) + "]\n}\n";
		//System.out.println(tableSymb.toString());
		//System.out.println(tableVar.toString());

		return rt;
	}

	public String getSymb(String s) {
		return verifCharMin(s.charAt(0)) ? tableSymb.get(s) : tableVar.get(s);
	}

	public void addInput(String s) {
		tableVar.put(s, "In" + String.valueOf(input.size()));
		input.add("In" + String.valueOf(input.size()));
	}

	public void addOutput(String s) {
		output.add(getSymb(s));
	}

	public String outList() {
		String s = "";
		for (TAdress TA : lt) {
			s += TA.toString();
		}
		return s;
	}

	public String getFormerName() {
		return FormerName;
	}

	public String getfName() {
		return fName;
	}

	public List<TAdress> getLt() {
		return lt;
	}

	public int getLgIn() {
		return input.size();

	}
	
	public int getLgOut() {
		return output.size();
	}
	
	
	public static void resetCounter() {
		counter = 0;
	}
	
	public String getTables() {
		return fName + " : symboles " + tableSymb + "; variables" + tableVar;
	}

}
