package umang;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import resources.Base;

public class Homepage extends Base {
 @BeforeTest
 
 public void initilise() throws IOException
 {
	 
	 driver=initialisedriver();
	 driver.get(prop.getProperty("url"));
	 
	
 }
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		 driver.manage().window().maximize();
	LandingPage l=new LandingPage(driver);
	l.getUserLogin().click();
	
 }
	
	/*@AfterTest
	
	public void TearDown()
	{
	
	driver.close();	
	driver=null;
	}*/
	}

