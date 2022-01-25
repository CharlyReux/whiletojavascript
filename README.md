# WhileToJavascript

## CommandLine Exec
Contient les fichiers necessaire à l'execution de notre programme à partir d'une invite de commande.
### Utilisation:
- Appeler whc.py sur un fichier WHILE(f.wh).
- Appeler f.py avec des expressions while en paramètres.
### Exemple d'execution:
```
CommandLine Exec> py ./scripts/whc.py ./pgrmWh.wh
CommandLine Exec> py ./scripts/generatedScripts/pgrmWh.py "(cons nil)"
```
### Organisation:
- /Scripts: contient tous les .jar du compilateur et de l'interpréteur ainsi que le scripts python whc et le dernier script python généré.
- ouJS.js: dernier programme final généré.
pgrmWh.wh: exemple de programme WHILE simple.
### Notes:
- L'installation de nodejs est requise pour executer le programme.
- En mettant le fichier dans le PATH, il est possible d'exécuter whc sans "py" ni ".py".  

## Compilateur Xtext
Projet éclipse xtext du compilateur.
### Organisation:
Les fichiers que nous avons utilisés/rajoutés sont les suivant.
- MyDelegateGenerator.java : Permet de faire le lien entre le main et MyDslGenerator.xtend.
- MyDsl.xtext              : Contient la grammaire de WHILE avec l'ajout des ID.
- Fonction.java            : Classe pour instancier de nouvelles fonctions.
- main.java                : Classe main permettant d'utiliser le programme en ligne de commande en générant un .jar.
- MyExprBase.java          : Simple classe permettant de creer des ExprBase manuellement.
- Op.java                  : Fichier contenant les différents opérateurs utilisés dans les codes 3@.
- MyDslGenerator.xtend     : Fichier contenant le parcours et l'interprétation du code WHILE en code 3@, ainsi que la génération de la table des symboles.
- TAdress.xtend            : Classe des codes 3@, contenant aussi la fonction de traduction d'un code 3@ en javascript.
