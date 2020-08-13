package CucumberOptions;	

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	 //features={"\\src\\test\\resources\\Features\\"},
				 features={"src//test//resources//features//"},
		plugin = { "html:target/cucumber-html-report",
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		    "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml",
		"rerun:target/rerun.txt"
		       },
			tags={"@Registartion"},
		
		
		glue={"src//test//java//StepDefinitions"}
		
		)
public class TestRunner {
	
		

	 public static void main(String[] args) throws Throwable {
	        cucumber.api.cli.Main.main(args );
	    }


}