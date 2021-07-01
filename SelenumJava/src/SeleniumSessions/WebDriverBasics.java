package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		
		//check if any opened browser , if yes close browser
		
		/*WebDriver driver1 = new FirefoxDriver();
        String wnd = driver1.getWindowHandle();
		driver1.manage().window();
		driver1.close();*/
		
		//String homeWindow = driver.getWindowHandle();
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		
		
		//WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//verfy the expected title 
		
	
		
		if(title.equals("Google")) {
			System.out.println("Expected title");
		}
		else {
			System.out.println("Expected title is wrong ");
			
			
		}
		
		//Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//List <WebElement> links= driver.findElement(By.tagName("a"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links found in googlw page :" +links.size());
		Iterator<WebElement> itr = links.iterator();
		
		
		while(itr.hasNext()) {
			String str = itr.next().getText();
			System.out.println(str);
		}
		
		
		//WebElement link = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
		//link.click();
	//	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
		
//how to get the current url 
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
	
		//close the browser or quit the browser
		//driver.quit();
	}
	

}
