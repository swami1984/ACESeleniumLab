package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class finditemsamazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.cssSelector(".ic-close-quickview")).click();
		
		//WebElement ele=driver.findElement(By.cssSelector(".ic-close-quickview"));
		//ele.click();
		
		//Select  select = (Select) driver.findElement(By.cssSelector(".exehdJ"));
		//select.selectByValue("Advertise");
		
		
		//fvrt.click();
		
	//	#searchDropdownBox
		
		///html/body/div/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div
		//.exehdJ
		
		
		/*WebElement key = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		key.sendKeys("books");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		search.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
		//Select  select = (Select) driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		//select.selectByValue("Books");*/
				
	
		
		

	}

}
