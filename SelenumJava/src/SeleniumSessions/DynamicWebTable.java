package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//use properties class to intialze
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\JavaTrainingSession\\SelenumJava\\src\\SeleniumSessions\\config.properties");
		
		//load the file
		prop.load(ip);
		
		//Fetch global data from confif sheet
		String usr = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		String url = prop.getProperty("URL");
		String brw = prop.getProperty("Browser");
		String username_xpath = prop.getProperty("Username_xpath");
		String pasword_xpath = prop.getProperty("Password_xpath");
		String signIn_xpath = prop.getProperty("Login_btn_xpath");
		String con_Link = prop.getProperty("contacts_xpath");
		
		System.out.println(url);
		
		
		if(brw.equals("FireFox")){
			
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}
		//get the URL 	
		driver.get(url);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(username_xpath)).sendKeys(usr);
		driver.findElement(By.xpath(pasword_xpath)).sendKeys(pwd);
		driver.findElement(By.xpath(signIn_xpath)).click();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//click on Contacts link 
		
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		//driver.findElement(By.xpath(prop.getProperty("contacts_xpath "))).click();
		driver.findElement(By.xpath(con_Link)).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]/span")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		///html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		
		
		//String before_xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		//String After_xpath = "]/td[2]";
		
		String b_xapth = prop.getProperty("before_xpath");
		String a_xpath = prop.getProperty("After_xpath");
		String tb = prop.getProperty("tabel_xpath_before");
		String ta = prop.getProperty("tabel_xpath_after");
		
		
		//how to get the rows and colums in web table 
		// /html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]
		//No.of Columns
		//.descending
		//html body div#ui div.ui.fluid.container div.ui.fluid.container div.ui.fluid.container div.ui.fluid.container div.ui.fluid.container.main-content table.ui.celled.sortable.striped.table.custom-grid.table-scroll thead.full-width tr th.descending.sorted
        List  col = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/thead/tr"));
        System.out.println("No of cols are : " +col.size()); 
        
        //No.of rows 
        List  rows = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/thead/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());

        // Printing table header of a web table assuming first row as header
        List <WebElement>allHeadersOfTable= driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/thead/tr"));
        System.out.println("Headers in table are below:");
        System.out.println("Total headers found: "+allHeadersOfTable.size());
        
        
        for(WebElement header:allHeadersOfTable)
        {
        	System.out.println(header.getText());
        }
        

		for(int i =1;i<=3;i++) {
			
			String str = driver.findElement(By.xpath(b_xapth+i+a_xpath)).getText();
			//String str = driver.findElement(By.xpath(prop.getProperty("before_xpath")+i+prop.getProperty("After_xpath"))).getText();
			System.out.println(str);
			if (str.equals("naveen kumar")) {
				
				// /html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]
				//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]")).click();
				//driver.findElement(By.xpath(tb+i+"]/td[1]")).click();
				driver.findElement(By.xpath(tb+i+ta)).click();
				
			}
			
			
		}
		
		

	}

}
