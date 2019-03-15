# scb

project strucuture
  --Feature: Cucumber feature files
  --src: source code, include both code and test code
    --main: java code for business
      --resource: test input with properties file, copy to local disk for run the main class
    --test: test code
      --java\scb: Unit Test main class
      --java\stepDefinition: Cucumber test class
  --target: jar file with main class
  pom.xml: maven pom file 
  
  To generate the jar file, please run
    >maven clean package
  Command to execute the rule with input file
    >java -jar scb-0.0.1-snapshot.jar c:\input.properties
    
    
  
