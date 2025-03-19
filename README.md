
Instructions to execute it from maven command prompt or IntelliJ IDE
--------------------------------------------------------------------

1. Open the project setup folder 'TechAssessment_API' in IntelliJ IDE
2. Test Run instructions: 
     - From the command prompt navigate to the folder where you have the project folder setup and run the below command
         eg: C:\Users\User\IdeaProjects\TechAssessment_API 
         mvn clean install test -Dcucumber.options="src/test/resources --tags <@tag>"
                                         (OR)
     - Setup tags = {"@Regression"} in @CucumberOptions and right click on TestRunner and run as --> Run 'TestRunner' option
  
3. The csv input files (InstrumentDetails.csv and PositionDetails.csv) are located under folder "src/test/resources/app/in"
4. The processed generated output file (PositionReport.csv) is generated under folder "src/test/resources/app/out"
5. To run all feature stories use Tag @Regression
6. Sample Cucumber report can be found from the path target/cucumber-reports/index.html, open in Chrome browser

**Technology stack** : Java, Cucumber, Selenium, TestNg, Maven, IDE - IntelliJ Idea
**Framework features** : Page object Model (POM) design pattern, RestAssured for API




