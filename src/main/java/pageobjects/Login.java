package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataproviders.ConfigFileReader;

public class Login {
	public static WebDriver driver;
	ConfigFileReader configFileReader;
	public Login(WebDriver driver)
	{     this.driver=driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
	public void navigateTo_Login() {
		
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
	
	@FindBy(how=How.CSS,using="input[name='USER']")
	public WebElement UsrName;
	
	
	
}
