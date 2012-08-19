include ../variables.mk

buildTests: 
	java -jar ${JML_TESTNG}/jmlunitng-1_3.jar -d ../src-tests org/softlang/model/Employee.java
	java -jar ${JML_TESTNG}/jmlunitng-1_3.jar -d ../src-tests org/softlang/model/Department.java	

compileJML:
	java -jar ${JML4C_HOME}/jml4c.jar -d ../build . 