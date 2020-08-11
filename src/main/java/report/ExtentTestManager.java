package report;

/**
 * Created by AADM107 on 18/04/2016.
 */
public class ExtentTestManager {
    /*static Map extentTestMap = new HashMap();
    static Map extentTestMapgrandchild = new HashMap();
  static ExtentTest test;
  static ExtentTest CHILD;
   //static ExtentReports extent;		
   static ExtentReports extent = new ExtentReports ();
   						static ExtentReports extentgrandchild = new ExtentReports ();
    private static ExtentHtmlReporter htmlReporter = ExtentManager.getReporter();

    public static synchronized ExtentTest grandchildgetTest() {
        return (ExtentTest) extentTestMapgrandchild.get((int) (long) (Thread.currentThread().getId()));
    }
    public static synchronized void grandchildgetTestdelete() {
         extentTestMapgrandchild.clear();
    }
    public static synchronized ExtentTest getTest() {
    	extentTestMap.putAll(extentTestMapgrandchild);
        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
        
    }

    public static synchronized void endTest() {
        extent.flush();//removeTest((ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId())));
    }

    public static synchronized ExtentTest startTest(String testName) {
        return startTest(testName, "");
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
    	extent.attachReporter(htmlReporter);
    	htmlReporter.start();
    	  test = extent.createTest(testName, desc);
    	 CHILD=test.createNode(testName);
         extentTestMap.put((int) (long) (Thread.currentThread().getId()), CHILD);

         return test;
    }
    public static synchronized ExtentTest childstartTest(String step) {  /////forrr step
    	ExtentTest grandchild;
    	 
    	grandchild = CHILD.createNode(step);
    	 // CHILD=test.createNode(testName);
         extentTestMapgrandchild.put((int) (long) (Thread.currentThread().getId()), grandchild);

         return test;
  
}*/
}
