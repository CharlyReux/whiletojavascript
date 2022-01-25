#!/usr/bin/python


#TODO: changer la génération des fichier qui part en couille de ouf

import subprocess
import sys

#TODO: faire l'utilisation des In0,In1.. dans le compilateur
#param1: fichier.wh 
nbIn = subprocess.run(['java', '-jar' ,'./scripts/compilator/whc.jar',sys.argv[1],"public/compilator/generatedCode/"],capture_output=True,text=True)#nbIn correspond au nombre de parametre du main de la fonction
#nbIn=1# TEST
#public/compilator/generatedCode/
genScript = "#!/usr/bin/python\nimport subprocess\nimport sys\n"

#TODO:faire le "TODO" dans l'interpréteur Xtext
genScript+="tabreq =['java', '-jar' ,'./scripts/paraInterpreter/interpret.jar','"+str(nbIn.stdout)+"','public/paraInterpreter/generatedParams/']+sys.argv[1:]\n"
genScript+="subprocess.run(tabreq)\n"



tmp = sys.argv[1].split("/")[-1]
pytexec = tmp.split(".")[0]+".py"
f=open("./scripts/"+pytexec, "w")
f.write(genScript)
print(nbIn.stdout)
#print("executable generated:"+pytexec)
