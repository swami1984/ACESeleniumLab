package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleBrowserPopup {

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
		//driver.get("http://www.nuware.com/");

		
		//In Java, Iterator is an interface available in Collection framework in java. util package. 
		//It is a Java Cursor used to iterate a collection of objects. 
		//It is used to traverse a collection object elements one by one
		
		//how to get window ID , by using below code will get the total window ID's 
		
		
		Set<String>handler = driver.getWindowHandles();
		
		//loop window id using iterator
		Iterator<String> itr = handler.iterator();
		//first wiill get the parent window 
		String Patentwindow = itr.next();
		System.out.println("we got parent window id :"+Patentwindow);
		//second will get child window 
		String Childwindow = itr.next();
		System.out.println("we got child window id :"+Childwindow);
		
		//once you get the child window switch to tat window 
		driver.switchTo().window(Childwindow);
		
		
				
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		//intervirew
	driver.close();//close specific browser
	driver.quit();//close all opened browsers
		
		
		
		
	}

}
