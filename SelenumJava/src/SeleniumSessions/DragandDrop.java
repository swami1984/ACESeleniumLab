package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.u
public class DragandDrop {

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
		
		driver.get("http://www.nuware.com/");
		
		//how to perform drag and drop
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("name")))// hold the element from source path
		.moveToElement(driver.findElement(By.xpath("name")))//destination path
		.release()// release to destination
		.build().perform();//perfom action 
	
	}
	
	
	//how to give explicit wait - generic method 
	
	@SuppressWarnings("deprecation")
	public static void ClickOn(WebDriver driver, WebElement locator, int timeout) {
		
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}
	

}
