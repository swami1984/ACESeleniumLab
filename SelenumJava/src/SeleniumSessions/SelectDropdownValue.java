package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownValue {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://in.ebay.com/");
		
		//how will select drop down values :
			//SelectByVisibleText() makes use of selection of dropdown item based on the text present in the dropdown. 
			//This has to be the exact text.
			
		//SelectByValue() will select based on the value attribute of the select tag. This value is different for different visible text.	
		//	select value by index - not recomended - if values are dynamic
		//Select class in Selenium WebDriver. The Select class is a Webdriver class which basically provides the 
		//implementation of the HTML SELECT tag.
			Select select = new Select(driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")));
			select.selectByVisibleText("Art");
			select.selectByValue("");
			
	
			WebElement Seachbtn = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
			Seachbtn.click();		
			String str = driver.getTitle();
			System.out.println(str);
			
			if(str.equals("Art for sale | eBay")) {
				System.out.println("Expected Art for sale | eBay page is opened");
			}else {
				System.out.println("Wrong page opened ");
			}
				
		driver.quit();

	}

}
