package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleIFramesinSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		

		 Alert alert = driver.switchTo().alert();
		 Alert alert1 =(Alert) driver.switchTo().frame(0);
		 Alert alert2 = (Alert) driver.switchTo().frame("mainpanel");
		 
		//handling frames - we can do by below methods 
		
		 
		 String str = alert1.getText();
		 System.out.println(str);
		
		alert.accept();// click on ok 
		alert.dismiss();// click on cancel 
		
		
		
		
		
		

	}

}
