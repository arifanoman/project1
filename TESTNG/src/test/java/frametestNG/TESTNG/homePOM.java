package frametestNG.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class homePOM {
	public static WebDriver driver;
	
	@FindBy (xpath = "//*[text()='Back to School']")
	WebElement backtoSchool;

	
	
	@FindBy (xpath = "//*[text()='Off to College']")
	WebElement offtoCollege;

	@FindBy (xpath ="//*[contains(text(),'Connect with')]")
	WebElement fbtext;
	
	public homePOM(WebDriver driver) {
		homePOM.driver=driver;
		PageFactory.initElements(driver, this);
		}
	

	public void backtoSchoolClick() {
		backtoSchool.click();
	}
	
	public void offtoCollegeClick() {
		offtoCollege.click();
	}

	public void getfbtext() {
	
	String Expected_text = "Connect with friends and the world around you on Facebook.";
	String Actual_text = fbtext.getText();
	
//	Assert.assertEquals(Actual_text, Expected_text);
     SoftAssert sa = new SoftAssert();
	 sa.assertEquals(Actual_text, Expected_text);
	
	 System.out.println("this is after assert");
	}
	

}






