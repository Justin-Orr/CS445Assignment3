# CS445Assignment3
TableLamp Project

The purpose of this assignment is to practice implementing the Inversion of Control Principle.
A good example of how this works relative to this assignment is here: 
https://stackoverflow.com/questions/30784215/what-does-decoupling-two-classes-at-the-interface-level-mean

BUILD INSTRUCTIONS: 

Enter into the TableLamp directory that contains the gradle files. 

Once in the directory run the following commands:
$ ./gradlew clean
$ ./gradlew build

Note* To run the following commands you must be in the parent directory where the build.gradle file is located.
Now that the framework is built, to run the Junit tests run:  
$ ./gradlew test

The test results will be an HTML file labeled index.html located in ~/build/reports/tests/test

To run Jacoco for Unit Test Coverage and Cyclomatic Complexity run:
$ ./gradlew jacocoTestReport

The test results will be an HTML file labeled index.html located in ~/build/reports/jacoco/test/html

