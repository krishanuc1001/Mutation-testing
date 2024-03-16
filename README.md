### Mutation Testing Demo

This is a very basic service created using Spring boot Java to demonstrate Mutation testing. 
This also has JaCoCo reporting integrated to show how only lines of code coverage is not enough. 

Run the application by running the c

Run Mutation test using command:

```
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```