package CucumberOptions;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "html:target/cucumber-html-report",
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		    "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml",
		       },
			
		
		 features= {"@target/rerun.txt"},
		glue={"StepDefinitions"}
		
		)



public class failedScanario {
	
	
	
	
	@BeforeClass
	public static void startDebugCukesTest() {
	    System.out.println(">> Starting run all cucumber test suite");
	   //ExtentManager.getReporter("/sysroot/home/suman/automation/cucmberautomation/extentreportcucumber.html");
	  // ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	// extentProperties.setExtentXServerUrl("http://localhost:1337");
	// extentProperties.setProjectName("MyProject");
	 //extentProperties.setReportPath("output/myreport.html");
	}

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

		//Reporter.loadXMLConfig("sysroot/home/suman/automation/cucmberautomation/extent-config.xml");
		 
	    System.out.println(">> Finished run all cucumber test suite");
	   //ExtentManager.closeReporter();
	}

}
