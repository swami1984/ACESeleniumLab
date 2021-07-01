package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationSimulation {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//below two timeout are global time outs 
		//pageaload - will be be max 60 sec to to load the page completly
		//if the page loaded within the timeout - rest of the timeout will be ignored 
		// implicit timeout will be specifivlly for all the webelements i the page 
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.nuware.com/");
		
		//navigateto other page
		//driver.get used to launch URL 
		driver.navigate().to("http://www.amazon.com");// navigate to external url 
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();// how to refresh
		
	}

}
