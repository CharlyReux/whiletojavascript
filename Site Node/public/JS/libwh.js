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
        if(this == null) return false
        if(this.filsDroit == null & this.filsGauche == null) return false;
        return true;
    }

    equals(arbre) {
        //si les arbres sont différents on revoit un arbre vide
        if (this.isTrue() != arbre.isTrue() | this.symb != arbre.symb) {
            return new ArbreBin()
        } else {
            if (this.isTrue() == false == arbre.isTrue() == false) {
                //si les 2 arbres sont vide alors on renvoie cons nil nil
                return new ArbreBin(null, new ArbreBin(), new ArbreBin())
            } else {
                if (this.filsGauche != null & arbre.filsGauche != null) {
                    if (this.filsDroit != null && arbre.filsDroit != null) {
                        if (this.filsDroit.equals(arbre.filsDroit) & this.filsGauche.equals(arbre.filsGauche)){
                            // si les deux arbres sont égaux on renvoit cons nil nil
                            return new ArbreBin(null, new ArbreBin(), new ArbreBin())
                        }
                    }
                    else {
                        //si un fils droit est null mais pas l'autre on renvoie nil
                        return new ArbreBin()
                    }
                } else {
                    //si un fils gauche est null mais pas l'autre on renvoit nil
                    return new ArbreBin()
                }
            }
        }
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
        return this.#nombreNoeudsDroiteRec(this.filsDroit);
    }
    //Fonction privée pour la récursivité
    #nombreNoeudsDroiteRec(a){
        if (a==null) return 0;
        return a.#nombreNoeudsDroiteRec(a.filsDroit) + 1;
    }

    //Renvoie de noeud (sous-arbre) de l'arbre
    nombreNoeuds(){
        return this.#nombreNoeudsRec(this);
    }
    //Fonction privée pour la récursivité
    #nombreNoeudsRec(a) {
        if (a==null) return 0;
        return a.#nombreNoeudsRec(a.filsGauche) + a.#nombreNoeudsRec(a.filsDroit) + 1;
    }

    //Revoie un string composé des symboles de chaque noeud
    toString() {
        return this.#toStringRec(this);
    }
    //fonction privée pour la récursivité
    #toStringRec(a) {
        var res="";
        if (a == null) {
            return "";
        }
        else {
            res+=a.symbole;
            res+=a.#toStringRec(a.filsGauche) + a.#toStringRec(a.filsDroit);
        }
        return res;
    }
}

/********************************/
/*************Test***************/
/********************************/
/*
var arbre = new ArbreBin(null,null,new ArbreBin(null,null,new ArbreBin()));
var a=new ArbreBin(new ArbreBin(), new ArbreBin(null,new ArbreBin(), new ArbreBin()))
var arbreDeux=new ArbreBin(arbre,new ArbreBin())
//console.log(arbre);
//arbre.ajoutGauche(new ArbreBin("non"));
//arbre.ajoutDroite(new ArbreBin("maybe"));
console.log(a);
console.log(arbreDeux.toString());
console.log(arbreDeux.nombreNoeuds());
console.log(a.nombreNoeudsDroite());
*/