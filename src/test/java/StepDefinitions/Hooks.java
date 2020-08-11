package StepDefinitions;

import java.util.List;

import cucumber.Shareobjects;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;





public class Hooks
{

	Shareobjects testContext;
	
	/*
	 private ExtentReports report;
	 public static ExtentTest logger;
	 public static ExtentTest cucumberstep;*/
	  
	    private String scenarioName;
	    private String scenarioDesc;
	    private String errorMessage;
	    public static String abc="";
	    public static String def="";
	    /**
	     * These are static members required for keeping the same tate when used in the Formatter/Reporter methods
	     * This is because when these methods are invoked, it's actually a different instance of the Hooks class
	     */
	    private static List<String> steps;
	    private static List<String> scenarioOutlineExamples;
	    private static int stepi;
	    private static int examplei;
	    private static String featureName;
	    private static boolean isScenarioOutline;
	    
	    public Hooks() {
	        System.out.println("_____________ INITIALIZE HOOKS _____________");
	    }
/*	public Hooks(Shareobjects context) {
		testContext = context;
	}*/
	//public static abc="";
	//private static boolean skipFlag = true;
	@Before
	public void beforescanario(Scenario  scenario)
	{   
		System.out.println(scenario.getName().toString());
		System.out.println(scenario.getId());
		
		     featureName = "Feature ";
		    String rawFeatureName = scenario.getId().split(":")[0].replace("-"," ");
		    featureName =  rawFeatureName.substring(0, 23);
		    String[] feat=rawFeatureName.split(featureName);
		   abc=feat[1];
		   /* if(skipFlag)
		    {*/
		    def=feat[1];
		   /* logger = ExtentTestManager.startTest(feat[1], scenario.getName().toString());
	        logger.assignCategory("Feature: " + rawFeatureName);*/
		   // }
		    
		   // return featureName;
	       // cucumberstep= ExtentTestManager.grandchildgetTest();
		}
	
	@After
	public void Aftercanario(Scenario  scanario)
	{
	
		//skipFlag=true;
		System.out.println(scanario.getName().toString());
		 String status = scanario.getStatus().toString();
	        System.out.println("SCENARIO STATUS: " + status);

	        //Reset step count and clear org.stag.runner.steps list
	       /* steps.clear();
	        stepi = 0;*/

	        //End the logger test for each scenario
	        //ExtentTestManager.grandchildgetTest();
	      // ExtentTestManager.endTest();
	    //  testContext.getWebDriverManager().closeDriver();
	}
	
	/*@BeforeStep
	public void BeforeStep(Scenario scanario)
	{   
		
		//System.out.println(scanario.getId().);
		
		String rawFeatureName = scanario.getId().split(";")[0].replace("-"," ");
		System.out.println(scanario.getId());
		//System.out.println(step.toString());
		
	}
	
	@AfterStep
	public void AfterStep(Scenario  scanario)
	{
		
		final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		System.out.println(ste[2].getMethodName());
		System.out.println(scanario.getId());
	}
	
	public String text(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEventPublisher(EventPublisher publisher) {
		// TODO Auto-generated method stub
*/		
	}
	
	




