package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.util.concurrent.Service.State;

public class ReadConfigFile {
	
	static  WebDriver driver;
	static WebElement un;
	static WebElement pwd;
	static WebElement sgn;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\JavaTrainingSession\\SelenumJava\\src\\SeleniumSessions\\config.properties");
		
         // how to load file 
		
		prop.load(ip);
		//how to print config values 
		
		System.out.println(prop.getProperty("username"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		String browsername = prop.getProperty("Browser");
		String ntlogin = prop.getProperty("username");
		String ntpwd = prop.getProperty("password");
		
		if (browsername.equals("FireFox")) {
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		}else if(browsername.equals("Chrome"))	{
			
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\Chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		//driver pre -requisite 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//.manage().deleteAllCookies();
		
		//load the url 
		//driver.get(url);
		driver.get(prop.getProperty("URL"));
		
	
		 driver.findElement(By.xpath(prop.getProperty("Username_xpath"))).sendKeys(prop.getProperty("username"));
		 driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("password"));
	
		//driver.findElement(By.xpath(prop.getProperty("Login_btn_xpath "))).click();
		driver.findElement(By.id(prop.getProperty("Login_btn_xpath"))).click();
	
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		System.out.println("Execution completed ");
	
		
		
	}

}
