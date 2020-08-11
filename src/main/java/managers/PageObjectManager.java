package managers;



import org.openqa.selenium.WebDriver;

import pageobjects.RegistrationPage;





public class PageObjectManager {

	private WebDriver driver;

	
	private RegistrationPage registrationobjectPage;
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}	

	public RegistrationPage registrationobjectPage(){

		return (registrationobjectPage == null) ? registrationobjectPage = new RegistrationPage(driver) : registrationobjectPage;

	}

	
	
}