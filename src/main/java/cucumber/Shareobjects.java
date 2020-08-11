package cucumber;


import managers.PageObjectManager;
import managers.WebDriverManager;

public class Shareobjects {
	
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public Shareobjects(){
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	

}
