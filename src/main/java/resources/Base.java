package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.io.FileUtils;

public class Base {
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initialisedriver() throws IOException
	{
	
		prop=new Properties();
		FileInputStream fin =new FileInputStream("C:\\Users\\Daffolap-698\\Downloads\\UMANGWEB\\src\\main\\java\\resources\\data.properties");
		prop.load(fin);
	String browserName=	prop.getProperty("browser");
	//String url=prop.getProperty("url");
	
	if (browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","Lib/chromedriver.exe");
driver=new ChromeDriver();
	}
	
	else if(browserName.equals("firefox"))
	{
		
		System.setProperty("webdriver.gecko.driver","Lib/geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	
	else if  (browserName.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver","Lib/MicrosoftWebDriver");
		WebDriver driver=new InternetExplorerDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
		}
	public void getScreenshot(String result) throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C://Users//Daffolap-698//Desktop//Screenshots"+result+"screenshot.png"));
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(src, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
}
