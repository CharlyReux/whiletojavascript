#!/usr/bin/python


#TODO: changer la génération des fichier qui part en couille de ouf
import os
import subprocess
import sys

dirname = os.path.dirname(__file__)
filename = os.path.join(dirname, '..')
#param1: fichier.wh 
nbIn = subprocess.run(['java', '-jar' ,filename+'/scripts/compilator/whc.jar',sys.argv[1],"compilator/generatedCode/"],capture_output=True,text=True)#nbIn correspond au nombre de parametre du main de la fonction
#nbIn=1# TEST

genScript = "#!/usr/bin/python\nimport subprocess\nimport sys,os\n"

genScript+="dirname = os.path.dirname(__file__)\n"
genScript+="filename = os.path.join(dirname, '../..')\n"



genScript+="tabreq =['java', '-jar' ,filename+'/scripts/paraInterpreter/interpret.jar','"+str(nbIn.stdout)+"','public/paraInterpreter/generatedParams/']+sys.argv[1:]\n"
genScript+="subprocess.run(tabreq)\n"
genScript+="f = open(filename+'/compilator/generatedCode/out.js', 'r')\n"
genScript+="p = open(filename+'/paraInterpreter/generatedParams/listParam.js', 'r')\n"
genScript+="lib = open(filename+'/scripts/JS/libwh.js', 'r')\n"

genScript+="o = open(filename+'/outJS.js', 'w')\n"
genScript+="o.write(lib.read())\n"
genScript+="o.write('/*  Functions  */')\n"
genScript+="o.write('\\n')\n"
genScript+="o.write(f.read())\n"
genScript+="o.write('/*  Parameter interpretation  */\\n')\n"
genScript+="o.write(p.read())\n"
genScript+="o = open(filename+'/outJS.js', 'a')\n"
genScript+="o.write('console.log(ret[0])\\n')\n"
genScript+="o.write('\\n')\n"
genScript+="o.close()\n"



genScript+="result = subprocess.run(['node','./outJS.js'],capture_output=True,text=True)\n"
genScript+="print(str(result.stdout))"


tmp = sys.argv[1].split("/")[-1]
pytexec = tmp.split(".")[0]+".py"
f=open(filename+"/scripts/generatedScripts/"+pytexec, "w")
f.write(genScript)
print(nbIn.stdout)
#print("executable generated:"+pytexec)
