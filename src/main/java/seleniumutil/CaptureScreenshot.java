package seleniumutil;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {

	public static String capture(WebDriver driver,String screenShotName) throws IOException
    {   
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest ="C:/Users/skumar856/Desktop/cucmberautomation/Screenshots/"+screenShotName;
        File destination = new File(dest);
       // FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
	
}