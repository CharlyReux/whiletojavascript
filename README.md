# WhileToJavascript

## CommandLine Exec
Contient les fichiers necessaire à l'execution de notre programme à partir d'une invite de commande.
Utilisation:
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
