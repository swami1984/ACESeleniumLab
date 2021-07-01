package PracticeSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","‪‪D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
		
		// get the url....
		driver.get("http://www.facebook.com");
		
		String strGetTitle = driver.getTitle();
		
		if(strGetTitle.equals("Google")) {
			System.out.println("Expected title");
		}
		else {
			System.out.println("Expected title is wrong ");
		}
		

	}

}
