package SeleniumSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TakeScreenshotConcept {

	

	public static void main(String[] args) {
		
		String copyFile;
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//below two timeout are global time outs 
		//pageaload - will be be max 60 sec to to load the page completly
		//if the page loaded within the timeout - rest of the timeout will be ignored 
		// implicit timeout will be specifivlly for all the webelements i the page 
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.nuware.com/");
		
		//how to take screenshot 
		
		File src = ((TakeScreenshotConcept)driver).GetScreenshotAs(OutputType.FILE);
		//Files.copyFile(src, new File("/SelenumJava/src/SeleniumSessions"));
		
		

	}

	private File GetScreenshotAs(OutputType<File> file) {
		// TODO Auto-generated method stub
		return null;
	}

}
