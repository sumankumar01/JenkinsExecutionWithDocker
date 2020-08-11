package cucumber;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {
	static byte[] source ;
	public  static byte[] screenshot(WebDriver driver, long ms)
	{

	try {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    source = ts.getScreenshotAs(OutputType.BYTES);
	    //FileUtils.copyFile(source, new File("./ScreenShots/"+ms+"Facebook.png"));
	    System.out.println("ScreenShot Taken");
	    
	} 
	catch (Exception e) 
	{
	    System.out.println("Exception while taking ScreenShot "+e.getMessage());
	}

	return source;
	}

}
