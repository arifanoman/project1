package frametestNG.TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest extends baseclass {

	  @Test
public void f() throws InterruptedException {
	  driver.get("https://www.facebook.com");
	    Thread.sleep(5000);
}


}
