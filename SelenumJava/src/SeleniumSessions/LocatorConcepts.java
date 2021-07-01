package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcepts {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		//finding xpath to login to facebook
		// find element using xpath
		//absulute x path should not be used
		//relative xpath should be preferable
		WebElement un = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		un.sendKeys("tswamy2009@gmal.com");
		WebElement pwd = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		pwd.sendKeys("qspider");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		login.click();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		
		//how will select drop down values :
		//SelectByVisibleText() makes use of selection of dropdown item based on the text present in the dropdown. 
		//This has to be the exact text.
		
	//SelectByValue() will select based on the value attribute of the select tag. This value is different for different visible text.	
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")));
		select.selectByVisibleText("Art");
		
		//get the title 
		
		String title = driver.getTitle(); 
		System.out.println(title);
		
		if(title.equals("Log in to Facebook | Facebook")) {
			System.out.println("Facebook Home page");
		}else
		{
			System.out.println("facebook failed redirect to home page");
		}
		
		//close driver 
		driver.quit();
		
	}

}
