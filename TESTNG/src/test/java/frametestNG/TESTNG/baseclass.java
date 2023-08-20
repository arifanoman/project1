package frametestNG.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseclass {
public WebDriver driver;
	
	@BeforeTest
	@Parameters({"brow"})
	  public void beforeTest(String brow) throws InterruptedException { 
String browser = brow;
if (browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12026\\eclipse-workspace\\mavenproject\\drivers\\chromedriver.exe");

			   driver = new ChromeDriver();
}
else if (browser.contains("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\12026\\eclipse-workspace\\mavenproject\\drivers\\geckodriver.exe");
		   driver = new FirefoxDriver();
}
else {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\12026\\eclipse-workspace\\mavenproject\\drivers\\msedgedriver.exe");
		   driver = new EdgeDriver();
}
	   
	  }
	


@AfterTest
public void afterTest() {
	  driver.close();
}

}
