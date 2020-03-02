package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	public WebDriver driver;
	//@FindBy(xpath="//md-content[@class='layout-padding _md layout-column']//div[@class='close_popup']//md-icon[@class='material-icons']")
	@FindBy(xpath="//span[contains(text(),'Ask me later')]")
	WebElement Later;
	  
	
	public HomePageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement askmelaterclick()
	{
		return Later;
	}

}
