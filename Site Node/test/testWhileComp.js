class ArbreBin {
    // constructeur d'arbre
    //@param value : la valeur du noeud
    constructor(symbP, gaucheP, droiteP) {

        if(symbP === undefined & gaucheP === undefined & droiteP === undefined){
            this.symb = null;
            this.gauche = null;
            this.droite = null;
        }       
        else if(gaucheP === undefined & droiteP === undefined) {
            this.symb = symbP;
            this.gauche = null;
            this.droite = null;
        }
        else if(gaucheP === undefined){
            this.symb = symbP;
            this.gauche = null;
            this.droite = droiteP;
        }
        
        else {
            this.symb = symbP;
            this.gauche = gaucheP;
            this.droite = droiteP;
        }
    }

    //Retourne le fils gauche de la racine
    get filsGauche() {
        return this.gauche;
    }

    //Retourne le fils droit de la racine
    get filsDroit() {
        return this.droite;
    }

    //Renvoie le symbole du noeud
    get symbole() {
        return this.symb;
    }

    //Renvoie la représentation booléenne du noeud
    isTrue() {
        if(this.filsDroit == null & this.filsGauche == null) return false;
        return true;
    }

    //Renvoie si l'arbre actuel est équivalent à l'arbre 'arbre'
    equals(arbre) {
        if(this.nombreNoeuds != arbre.nombreNoeuds) return false;
        return (this == null & arbre == null) | ( this.symb == arbre.symb & this.filsGauche.equals(arbre.filsGauche) & this.filsDroit.equals(arbre.filsDroit));
    }

    //Ajoute un fils gauche
    ajoutGauche(val) {
        this.gauche = new ArbreBin(val);
    }

    //Ajoute un fils droit
    ajoutDroite(val) {
        this.droite = new ArbreBin(val);
    }

    //Renvoie le nombre de noeuds à droite
    nombreNoeudsDroite(){
        return this.nombreNoeudsDroiteRec(this.filsDroit);
    }
    //Fonction privée pour la récursivité
    nombreNoeudsDroiteRec(a){
        if (a==null) return 0;
        return a.nombreNoeudsRec(a.filsDroit) + 1;
    }

    //Renvoie de noeud (sous-arbre) de l'arbre
    nombreNoeuds(){
        return this.nombreNoeudsRec(this);
    }
    //Fonction privée pour la récursivité
    nombreNoeudsRec(a) {
        if (a==null) return 0;
        return a.nombreNoeudsRec(a.filsGauche) + a.nombreNoeudsRec(a.filsDroit) + 1;
    }

    //Revoie un string composé des symboles de chaque noeud
    toString() {
        return this.toStringRec(this);
    }
    //fonction privée pour la récursivité
    toStringRec(a) {
        var res="";
        if (a == null) {
            return "";
        }
        else {
            res+=a.symbole;
            res+=a.toStringRec(a.filsGauche) + a.toStringRec(a.filsDroit);
        }
        return res;
    }
}


function f0(In0){
	var v8;
	var v7;
	var v1;
	var v6;
	var v4;
	var v5;
	var v2;
	var v0;
	var v3;

	v0 = new ArbreBin();
	v1 = v0;
	v2 = new ArbreBin();
	v3 = v2;

	v4 = new ArbreBin();
	v5 = Boolean(v1 == v4);

	while(v5){
		v6 = new ArbreBin();
		v6 = new ArbreBin(v6, v3);
		v3 = v6;

		v8 = Boolean(v3 == In0);

		if(v8.isTrue()){
			v1 = In0;
		}
	}

	return [v3]
}

/********************************/
/*************Test***************/
/********************************/

var arbre = new ArbreBin("",new ArbreBin("",new ArbreBin("")));

console.log(arbre);

console.log(f0(arbre)[0].nombreNoeudsDroite())


