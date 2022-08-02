# WhileToJavascript
In one of our courses, called "Compilation", we had a project of making a compiler and an
interpreter. Our teacher gave us
a personnalized programming language as an input and we had to choose the output language. We chose
to translate to
javascript. The project was in a group of 6 and I was the programming lead.<br><br>
In terms of technical aspects we used Xtext to make the compiler and the parameter interpreter,
for the rest of it it consisted of python scripts and some NodeJS.
The final goal was to make a web version of the compiler, so that's why we used Node.<br><br>
The project had to be done using the AGILE methodology, so it was divided into 3 "sprints". First,
we made a pretty-printer,
then we programmed the translation of a part of the input language and for the last part we had to
make the entire translation.<br><br>

## CommandLine Exec
Contient les fichiers necessaire à l'execution de notre programme à partir d'une invite de commande.
### Utilisation
- Appeler whc.py sur un fichier WHILE(f.wh).
- Appeler f.py avec des expressions while en paramètres.
### Exemple d'execution
```
CommandLine Exec> py ./scripts/whc.py ./pgrmWh.wh
CommandLine Exec> py ./scripts/generatedScripts/pgrmWh.py "(cons nil)"
```
### Organisation
- /Scripts: contient tous les .jar du compilateur et de l'interpréteur ainsi que le scripts python whc et le dernier script python généré.
- ouJS.js: dernier programme final généré.
pgrmWh.wh: exemple de programme WHILE simple.
### Notes
- L'installation de nodejs est requise pour executer le programme.
- En mettant le fichier dans le PATH, il est possible d'exécuter whc sans "py" ni ".py".  

## Compilateur Xtext
Projet éclipse xtext du compilateur.
### Organisation
Les fichiers que nous avons utilisés/rajoutés sont les suivant.
- MyDelegateGenerator.java : Permet de faire le lien entre le main et MyDslGenerator.xtend.
- MyDsl.xtext              : Contient la grammaire de WHILE avec l'ajout des ID.
- Fonction.java            : Classe pour instancier de nouvelles fonctions.
- main.java                : Classe main permettant d'utiliser le programme en ligne de commande en générant un .jar.
- MyExprBase.java          : Simple classe permettant de creer des ExprBase manuellement.
- Op.java                  : Fichier contenant les différents opérateurs utilisés dans les codes 3@.
- MyDslGenerator.xtend     : Fichier contenant le parcours et l'interprétation du code WHILE en code 3@, ainsi que la génération de la table des symboles.
- TAdress.xtend            : Classe des codes 3@, contenant aussi la fonction de traduction d'un code 3@ en javascript.

## Interpréteur de paramètres
Projet éclipse xtext pour la lecture et l'interprétation des paramètres.

## Site Node
Tous les fichiers necessaire au lancement du site internet.
### Utilisation
- Lancer le server : >node server.js
- Acceder au site sur http://localhost:8000
### Organisation
- /public: contient tous les fichiers accessibles par le client, dont les fichier javascript libwh.js et client.js.
- /ReceivedFile: contient le dernier fichier .wh recu par le client.
- /Scripts: contient tous les .jar du compilateur et de l'interpréteur ainsi que le scripts python whc et le dernier script python généré
- /test: contient des exemple de programmes while utilisés pour faire des tests.
- CompJS.html: fichier html du site.
- server.js: fichier javascript du server.
### Notes
- Le programme rentré sur le site internet doit avoir une fonction nommée "main" pour pouvoir être exécuté par la suite.
