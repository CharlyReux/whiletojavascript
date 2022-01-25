#!/usr/bin/python
import subprocess
import sys,os
dirname = os.path.dirname(__file__)
filename = os.path.join(dirname, '../..')
tabreq =['java', '-jar' ,filename+'/scripts/paraInterpreter/interpret.jar','1','public/paraInterpreter/generatedParams/']+sys.argv[1:]
subprocess.run(tabreq)
f = open(filename+'/compilator/generatedCode/out.js', 'r')
p = open(filename+'/paraInterpreter/generatedParams/listParam.js', 'r')
lib = open(filename+'/scripts/JS/libwh.js', 'r')
o = open(filename+'/outJS.js', 'w')
o.write(lib.read())
o.write('/*  Functions  */')
o.write('\n')
o.write(f.read())
o.write('/*  Parameter interpretation  */\n')
o.write(p.read())
o = open(filename+'/outJS.js', 'a')
o.write('console.log(ret[0])\n')
o.write('\n')
o.close()
result = subprocess.run(['node','./outJS.js'],capture_output=True,text=True)
print(str(result.stdout))