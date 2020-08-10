package runner;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Start {

	@Test
	public  void main()
			throws MalformedURLException, UnknownHostException, SocketException, InterruptedException {
		new DesiredCapabilities();

		DesiredCapabilities dc = DesiredCapabilities.chrome();
		// dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		// dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);

		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), dc);
		driver.get(
				"https://www.flipkart.com/");
		Thread.sleep(5000);
		System.out.printf(driver.getCurrentUrl());

	}

}
