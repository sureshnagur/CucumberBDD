package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/resources/features",
     glue="stepDefinations",monochrome=true,   tags="@netBanking",
     plugin= {"pretty", "html:target/cucumber.html"})

	//if we add dryRun=true this then script will not run just check whether every steps in feature file are mapped or not
	//if we add this dryRun=true inside CucumberOptions it will check whether every steps in feature file is mapped with the step definition method or not
	public class coreRunner extends AbstractTestNGCucumberTests {

	}

	
	//we can use multiple tags also for single scenario
	//we can use or , and , not conditions in the tags
	//if we use not @tag then all scenario will run this mentioned in front of not.
	//if we use and condition eg @test1 @test2 it will verify where these tags are there in single scenario
	//if we use or then it will check if any one conditions also meet it will run that scenario