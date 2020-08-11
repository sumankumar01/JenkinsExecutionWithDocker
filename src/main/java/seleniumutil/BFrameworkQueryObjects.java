package seleniumutil;

import java.io.IOException;

import org.openqa.selenium.WebDriver;



public class BFrameworkQueryObjects
{
  static String Moduel = null;
  static String classname = null;
  static String testdclassnameatarow = null;
  static String TestData;
 
  static StringBuilder htmlBuilder = new StringBuilder();
  static String screenShotPath;
  
  public static void logStatus(WebDriver driver,String str1, String str2, Exception obj)
    throws IOException
  {
   /* try
    {
      Date strDate = new Date();
      Calendar cal = Calendar.getInstance();
      String sDate = new SimpleDateFormat("MMddyyyy").format(cal.getTime());
      String screenShotName = "newtours" + sDate + RandomStringUtils.random(6, true, false) + ".png";
     
        screenShotPath = CaptureScreenshot.capture(driver, screenShotName);
      String stat = status.toString();
      if (stat.equalsIgnoreCase("info"))
      {
        if (obj != null)
        {
         
        	Hooks.cucumberstep.info(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomationScreenshots/"+screenShotName).build());
        }
        else
        {
          Hooks.cucumberstep.info(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomationScreenshots/"+screenShotName).build());
        }
      }
      else if (stat.equalsIgnoreCase("pass")) {
        Hooks.cucumberstep.pass(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomationScreenshots/"+screenShotName).build());
      
      } else if (stat.equalsIgnoreCase("warning")) {
        Hooks.cucumberstep.warning(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomationScreenshots/"+screenShotName).build());
      
      } else if (stat.equalsIgnoreCase("skip")) {
        Hooks.cucumberstep.skip(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomation/Screenshots/"+screenShotName).build());
      
      } else if (stat.equalsIgnoreCase("error")) {
        Hooks.cucumberstep.error(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomation/Screenshots/"+screenShotName).build());
      
      } else if (stat.equalsIgnoreCase("debug")) {
        Hooks.cucumberstep.debug(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomation/Screenshots/"+screenShotName).build());
      
      } else if (stat.equalsIgnoreCase("fatal")) {
        Hooks.cucumberstep.fatal(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomation/Screenshots/"+screenShotName).build());
      
      } else if (stat.equalsIgnoreCase("fail")) {
        if (obj != null)
        {
          Hooks.cucumberstep.log(Status.FAIL, obj);
          
          Hooks.cucumberstep.fail(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomation/Screenshots/"+screenShotName).build());
        }
        else
        {
          Hooks.cucumberstep.fail(str1 + "------>" + str2, MediaEntityBuilder.createScreenCaptureFromPath("/sysroot/home/suman/automation/cucmberautomation/Screenshots/"+screenShotName).build());
        }
      }
    }
    catch (Exception localException) {}
  }*/

}
}