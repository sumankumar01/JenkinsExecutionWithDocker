package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
	public static WebDriver driver;
	public Search(WebDriver driver)
	{
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
		
	}
	
	public List<WebElement> lselectedflightnoXpath;
	
	@FindBy(how=How.XPATH,using="//button[@aria-label='quote']")
	public WebElement QuoteButtonXpath;
	

}
