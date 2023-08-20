package frametestNG.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomdominos {

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@class='css-0'][1]")
	WebElement orderonline;
	
	@FindBy(xpath="//*[@id='tab-Delivery']")
	WebElement delivery;	
	
	@FindBy(xpath="//*[@data-quid='address-type-select']")
	WebElement Address_type;
	
	@FindBy(xpath="//*[@id='LocationName']")
	WebElement apartment_name;
	
	@FindBy(xpath="//*[@id='Street']")
	WebElement street_address;
	
	@FindBy(xpath="//*[@id='UnitNumber']")
	WebElement apartment_num;
	
	
	public Pomdominos(WebDriver driver) {
		
	Pomdominos.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
		
	public void	orderonlineclick() {
		orderonline.click();
	}
		
	public void deliveryclick() {	
		delivery.click();
	}
		
		
	public void Address_type(String add) {
		Address_type.clear();
		Address_type.sendKeys("add");
	}
	
	public void Select_list() {
		
		Select ob = new Select(Address_type);
		ob.selectByValue("Apartment");	
	}
		
	public void apartment_namesendkeys() {	
		
		apartment_name.sendKeys("add");
		
	}
	
	public void street_addresssendkeys() {
		street_address.sendKeys();
	}


		
		
		
		
		
		
		
	}
	

