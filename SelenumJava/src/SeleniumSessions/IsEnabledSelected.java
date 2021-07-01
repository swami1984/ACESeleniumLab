package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabledSelected {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//below two timeout are global time outs :
		//pageaload - will be be max 60 sec to to load the page completly
		//if the page loaded within the timeout - rest of the timeout will be ignored 
		// implicit timeout will be specifivlly for all the webelements i the page 
		//Explicitly wait - for any specific element in page to check before we perform
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//river.manage().timeouts().e
		driver.get("http://www.facebook.com/");
		
		//is displayed 
		boolean b1= driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
		System.out.println(b1);
		//isenabled
		boolean b2= driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
		System.out.println(b2);
		
		//isSelected - checkbox, drop down , radio button
		boolean b3= driver.findElement(By.xpath("//*[@id=\"email\"]")).isEnabled();
		System.out.println(b3);
		
		
	}

}
