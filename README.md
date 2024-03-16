### Mutation Testing Demo

This is a very basic service created using Java Spring boot and Maven to demonstrate Mutation testing. 

This also has JaCoCo reporting integrated to show how only lines of code coverage is not enough. 

Run the application:

```
mvn exec:java
```

Run Mutation test using command:

```
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```