package Com.actiTIME.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.actiTIME.pom.LoginPage;

public class BaseTest implements AutoConts {
	 public static WebDriver driver;
	FileLib flib=new FileLib();
	
	public void openBrowser() throws Throwable
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		String browser=flib.getKeyPropertyValue(PROP_PATH, "browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get(flib.getKeyPropertyValue(PROP_PATH, "url"));
		
	}
	
	public void loginToApp() throws Throwable
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(flib.getKeyPropertyValue(PROP_PATH, "username"));
		lp.setpassword(flib.getKeyPropertyValue(PROP_PATH, "password"));
		lp.clickBtn();
		
	}
	public void logoutFromApp()
	{
		
		
	}
	public void closeBrowse() 
	{
		driver.quit();
	}

}
