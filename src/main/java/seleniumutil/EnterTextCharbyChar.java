package seleniumutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterTextCharbyChar {
	
	public static void charbychar(WebDriver driver,String str,WebElement webelement)
	{
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String s=new StringBuilder().append(ch).toString();
			webelement.sendKeys(s);
		}
	}

}
