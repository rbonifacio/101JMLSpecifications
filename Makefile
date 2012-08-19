######################################################################
# Makefile (GNU make) for 101specifications
#
# Author:          Rodrigo Bonifacio
# Contact:         rbonifacio123@gmail.com
# Created:         20 August 2012
# Last modified:   20 August 2012
#
#######################################################################

include variables.mk

# just checks whether some variables are well set
env:      
	@echo ${JAVA_HOME}
	@echo ${JML4C_HOME}
	@echo ${JML_TESTNG}
	@echo ${CLASSPATH}

# generates all test cases from JML specifications
buildTests: 
	+$(MAKE) -C src buildTests

# compile the JML source code
compileJML:
	+$(MAKE) -C src compileJML

# compile the generated test cases
compileTestCases: buildTests compileJML 
	javac -cp ${CLASSPATH}:./build -d build -sourcepath src-tests src-tests/org/softlang/model/*Test.java

# run all tests using a TestNG ANT task 
runTests: compileTestCases
	ant -f runTestNG.xml