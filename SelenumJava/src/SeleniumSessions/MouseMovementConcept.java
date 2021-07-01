package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		
		// in order to perform mouse movement in selenium
		//create Actions class 
		
		//js.executeScript(window.s, args)
		//js.executeScript("window.scrollBy(0,1000)");
		
		Actions action = new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.linkText("DEALS"))).build().perform();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[2]")).click();
			
		//select calendar
		String dateVal="12";
		datepicker(driver, dateVal);
	
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);
		//click on continue 
		//button-continue-text
		//button-continue-text
		driver.findElement(By.xpath("//*[@id=\"continue-to-contact-page\"]")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		//
		
		driver.findElement(By.name("CONTROLGROUPPASSENGER$ContactInputPassengerView$TextBoxFirstName")).sendKeys("swamy");
		driver.findElement(By.name("CONTROLGROUPPASSENGER$ContactInputPassengerView$TextBoxLastName")).sendKeys("nathan");
		driver.findElement(By.name("CONTROLGROUPPASSENGER$ContactInputPassengerView$TextBoxHomePhone")).sendKeys("7892247267");
		driver.findElement(By.name("CONTROLGROUPPASSENGER$ContactInputPassengerView$TextBoxEmailAddress")).sendKeys("swamynttdata@gmail.com");
		
		//Select select = new Select(driver.findElement(By.className("cities_india")));
		//select.selectByValue("Bengaluru");
		
		
		driver.findElement(By.name("CONTROLGROUPPASSENGER$PassengerInputViewPassengerView$SJFlyingView$IamFlying")).click();
		
		//Select select = new Select(driver.findElement(By.name("CONTROLGROUPPASSENGER$PassengerInputViewPassengerView$DropDownListTitle_0")));
		//select.selectByValue("Mr");
		
		//driver.findElement(By.name("CONTROLGROUPPASSENGER$PassengerInputViewPassengerView$TextBoxFirstName_0")).sendKeys("swamy");
		//driver.findElement(By.name("CONTROLGROUPPASSENGER$PassengerInputViewPassengerView$TextBoxLastName_0")).sendKeys("ratna");
		//driver.findElement(By.name("CONTROLGROUPPASSENGER$PassengerInputViewPassengerView$TextBoxEmailMobile_0")).sendKeys("9535106096");
		
		
		//driver.findElement(By.xpath("//*[@id=\"continue-to-contact-page\"]")).click();
		driver.findElement(By.cssSelector("#continue-to-addons-page > span:nth-child(1)")).click();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id=\"continue-to-contact-page\"]")).click();
		//driver.findElement(By.cssSelector("#continue-to-payment-page > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#button-continue-text-paynow > span:nth-child(1)")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector(".reviewText")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Set<String>handler = driver.getWindowHandles();
		Iterator<String> itr = handler.iterator();
		//first wiill get the parent window 
		String Patentwindow = itr.next();
		System.out.println("we got parent window id :"+Patentwindow);
		
		
		WebElement secondDialog = driver.findElement(By.cssSelector("#closeButtonReiew > p:nth-child(1)"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",secondDialog);
		
		//driver.findElement(By.xpath("//a[@id='closeButtonReiew']//p[1]")).click();

		//driver.switchTo().alert().dismiss();
		
		
		//driver.findElement(By.cssSelector("#closeButtonReiew > p:nth-child(1)")).click();
		
		//driver.findElement(B//.xpath("(//acronym[text()='4E'])[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"continue-to-contact-page\"]")).click();
		//driver.findElement(By.cssSelector("#continue-to-addons-page > span:nth-child(1)")).click();
		
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//select meals
		//WebElement ele = driver.findElement(By.id("ControlGroupUnitMapView_UnitMapViewControl_HiddenEquipmentConfiguration_0_PassengerNumber_0_MaxMealSSR_ddl"));
	
		//Select select = new Select(driver.findElement(By.xpath("//option[@value='NVML']")));
		//select.selectByValue("Chicken Methi Malai");
		//select.selectByIndex(1);
	
		
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
		

	
		//div[@id='SpiceMaxSeatPassengerTable']//table/tbody[1]/tr[2]/td[2]/select[1]
		//div[@id='SpiceMaxSeatPassengerTable']//table/tbody[1]/tr[2]/td[2]/select[1]
		
		
	
	//}
			public static void datepicker(WebDriver driver ,String dateVal) {
				
				
				List<WebElement> calendarDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				for(WebElement eleDatePicker:calendarDates)
				{
					String date=eleDatePicker.getText();
							if(date.equalsIgnoreCase(dateVal))
							{
								eleDatePicker.click();
									break;
								}

			   }
			}


	
}
