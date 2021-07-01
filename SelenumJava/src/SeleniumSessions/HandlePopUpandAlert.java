package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePopUpandAlert {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//without entering anything clicked on sign in button
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		//handling java alerts or pop up 
		 Alert alert = driver.switchTo().alert();
		 String str = alert.getText();
		 System.out.println(str);
		 
		 if(str.equals("Please enter a valid user name - dialog came")) {
			 System.out.println("Valid correct message");			 
		 }else
			 System.out.println("In correct message ");
		 
		 //click on ok button on alert 
		 alert.accept();
		 
		 //alert.dismiss();// to handle cancel btb
	
		 //how to handle brower option 
		 //get xpath and do sendkeys to upload the file thats it - simple
		 //but make sure file upload type should be file 
		driver.quit(); 
		 
		 
	}
}
