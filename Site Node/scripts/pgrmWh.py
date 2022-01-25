#!/usr/bin/python
import subprocess
import sys
tabreq =['java', '-jar' ,'./scripts/paraInterpreter/interpret.jar','1','public/paraInterpreter/generatedParams/']+sys.argv[1:]
subprocess.run(tabreq)
