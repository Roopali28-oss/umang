package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By Userlogin=By.xpath("//a[@class='nav-link page-scroll ng-binding'][contains(text(),'User Login')]");




public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
	
}

public WebElement getUserLogin()
{
	return driver.findElement(Userlogin);
}
}
