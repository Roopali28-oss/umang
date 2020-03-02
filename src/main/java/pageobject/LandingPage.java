package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	
 @FindBy(xpath="//a[@class='nav-link page-scroll ng-binding'][contains(text(),'User Login')]")
	  WebElement Userlogin;
 
 @FindBy(xpath="//input[@id='mnoz']")
 WebElement MobileNo;
 
 @FindBy(id="mpinz")
	WebElement mpin;
	
 @FindBy(xpath="//button[@class='btn btn-primary login-white pointer flex-sm-100 flex-100']")
WebElement loginbtn;
 
@FindBy(xpath="//md-content[@class='layout-padding _md layout-column']//div[@class='close_popup']//md-icon[@class='material-icons']")
WebElement Cross;



public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public WebElement getUserLogin()
{
	return Userlogin;
}

public WebElement getMobileNo()
{
return MobileNo;	
}

public WebElement getmpin()
{
	return mpin;
}

public WebElement clicklogin()
{
	return loginbtn;
	
}




}
