package seleniumutil;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {
	
	public static void fluentwait(WebDriver driver,final WebElement webelement, Class exception)
	{ 
		try
		{
		@SuppressWarnings("unchecked")
		FluentWait<WebDriver> wait2 = new FluentWait(driver)
			       .withTimeout(300, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(exception);
		
				WebElement element = wait2.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						WebElement element = webelement;
						//String getTextOnPage = element.getText();
						if(element.isDisplayed() || element.isEnabled()){
						//	System.out.println(getTextOnPage);
							System.out.println("FluentWait passed");
							return element;
						}else{
						//	System.out.println(getTextOnPage);
							System.out.println("FluentWait Failed");
							return null;
						}
					}
	
				});
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
