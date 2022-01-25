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
        else if(droiteP === undefined){
            this.symb = symbP;
            this.gauche = gaucheP;
            this.droite = null;
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
        return this.nombreNoeudsRec(a.filsDroit) + 1;
    }

    //Renvoie de noeud (sous-arbre) de l'arbre
    nombreNoeuds(){
        return this.nombreNoeudsRec(this);
    }
    //Fonction privée pour la récursivité
    nombreNoeudsRec(a) {
        if (a==null) return 0;
        return this.nombreNoeudsRec(a.filsGauche) + this.nombreNoeudsRec(a.filsDroit) + 1;
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
            res+=this.toStringRec(a.filsGauche) + this.toStringRec(a.filsDroit);
        }
        return res;
    }
}

/********************************/
/*************Test***************/
/********************************/

/* var arbre = new ArbreBin("oui");
console.log(arbre);
arbre.ajoutGauche(new ArbreBin("non"));
arbre.ajoutDroite(new ArbreBin("maybe"));
console.log(arbre);
console.log(arbre.toString());
console.log(arbre.nombreNoeuds());
console.log(arbre.nombreNoeudsDroite()); */

