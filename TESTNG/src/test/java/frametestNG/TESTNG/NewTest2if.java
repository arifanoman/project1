package frametestNG.TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class NewTest2if {
	public static WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() throws InterruptedException, IOException {
		 System.out.println("This is before test, we will open browser here");
		 
		 String browser= "Firefox";
		 
		 if(browser.contains("Chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\12026\\eclipse-workspace\\mavenproject\\drivers\\chromedriver.exe");
		   driver = new ChromeDriver();}
		 
		 
		 else if (browser.contains("Firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\12026\\eclipse-workspace\\mavenproject\\drivers\\geckodriver.exe");
	   driver = new FirefoxDriver();
		 }
		 
		 else
		 {
			 System.setProperty("webdriver.edge.driver", "C:\\Users\\12026\\eclipse-workspace\\mavenproject\\drivers\\msedgedriver.exe");
			   driver = new EdgeDriver();
		 }
			 
			 	 
		 driver.get("https:www.facebook.com");	
		 driver.manage().window().maximize();
		 shots_withdate();
		 Thread.sleep(5000);
		 
		 
		 
		 
	  }
	
  @Test
  public void f() {
  }
 

  @AfterTest
  public void afterTest() {
  }

  
  
  
  
 // public void shots() throws IOException {
// File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// FileHandler.copy(cap,new File("C:\\Users\\12026\\eclipse-workspace\\mavenproject\\Pictures\\1.png"));
//  }
  
  public void shots_withdate() throws IOException {
  Date dt = new Date ();
	String name_dt=  dt.toString().replace(" ", "_").replace(":", "_");
 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(cap, new File("C:\\Users\\12026\\eclipse-workspace\\mavenproject\\Pictures\\"+name_dt+".png"));
  }

  
  
  
  
  
  
}
