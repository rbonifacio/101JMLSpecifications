101JMLSpecifications
====================

A hackaton contribution to the SoTeSola summer school. It translates informal constraints on 
Employee, Department and Compmany that are specified at the 101 Wiki into formal JML specifications. 
Based on the JML specifications we use (a) the JML4C compiler to intrument the bytecode with runtime 
checkers of invariants, preconditions, and poscondition; and (b) the JMLUnitNG tool to generate TCs 
that might be used to check whether the constraints are bein checked or not.

Requirements
====================
You need to download the following JAR libraries

* jml4c.jar (http://www.cs.utep.edu/cheon/download/jml4c/jml4c.jar)
* jml4rt.jar (http://www.cs.utep.edu/cheon/download/jml4c/jml4rt.jar)
* jmlunitng-1_3.jar (http://formalmethods.insttech.washington.edu/software/jmlunitng/release_history_assets/jmlunitng-1_3.jar)

JMLUnitNG needs Java 7, so if you are a Mac OS X user (as I am), please follow the instruction available at:

http://formalmethods.insttech.washington.edu/software/openjml.html

USAGE
====================

First, you need to set the correct path of the JARs and JAVA_HOME (that must point to a JDK 7 implementation). The 
path to the jars must be set on two files: variable.mk and runTestNG.properties.

Than, you can run the test suit using:

$ make buildTests # this will generate the test cases

$ make compileJML # this will compile the source code at src directory using the JML4C compiler 

$ make compileTests # this will compile the generated test cases using a standard Java compiler

$ make runTests # this will run the test cases

If you are interested in testing the original source code, you should proceed as:

$ make buildTests 

$ make compileJava 

$ make compileTests 

$ make runTests 

Restources
====================

There is a PDF with some slides available at: 

https://github.com/rbonifacio/101JMLSpecifications/blob/master/slides.pdf

Enjoy!


