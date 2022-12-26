package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features= {".//Features/"},//Runs all the feature files
                //features= {".//Features/Login.feature"},
                //features= {".//Features/LoginDDT.feature"},
                features= {".//Features/LoginDDTExcel.feature"},
                //features= {".//Features/Login.feature",".//Features/AccountRegistration.feature"}, //Runs some of the specified feature files
                //features="@target/rerun.txt",   // Runs only failures
                glue="stepDefinitions",//Specifying the location of steps.java file,glue is a keyword
                plugin= {"pretty",
                        "html:reports/myreport.html",
                        "json:reports/myreport.json",
                        "rerun:target/rerun.txt",    //Mandatory to capture failures
                },
               // dryRun=true,//Just to check if every feature in feature file has a corresponsing method in stepDefinion file 
                  dryRun=false,//For execution of every methods in stepDefinition file
                  monochrome=true//To avoid junk characters in console window after test execution
                //tags = "@sanity"	//Scenarios tagged with @sanity,tagging is similar to grouping in TestNG
                //tags = "@sanity and @regression"	//Scenarios tagged with both @sanity and @regression
                //tags = "@sanity or @regression"	 //Scenarios tagged with either @sanity or @regression
                //tags = "@sanity and not @regression", //Scenarios tagged with @sanity but not tagged with @regression
        // tags are used for group execution.
        )

public class TestRunner {

}

