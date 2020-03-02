package umang;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageobject.HomePageObject;
import pageobject.LandingPage;
import resources.Base;

public class HomePageTest extends Base
{
	
	@Test
	public void handlePopup() throws IOException
	{
	
	HomePageObject Home=new HomePageObject(driver);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Home.askmelaterclick().click();

}
}