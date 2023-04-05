import os
import subprocess

print('**** Starting Alticci Sequence Project ****')

print('**** Compiling backend before initialization ****')
os.chdir("alticci-sequence/")
subprocess.call(["./mvnw package"], shell=True)

print("")
try:
    print('**** Running docker compose ****')
    subprocess.check_call(["docker compose up -d"], shell=True)
    print("")
    print("**** Alticci Sequence system running on http://localhost ****")
except subprocess.CalledProcessError:
    print("**** There was a problem while starting up Alticci Sequence system ****")