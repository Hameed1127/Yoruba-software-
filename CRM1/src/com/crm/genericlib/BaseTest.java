package com.crm.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.pom.CRMLogout;
import com.crm.pom.LoginPage;

public abstract class BaseTest implements Autoconsts {
	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() throws Throwable {
		FileLib flib = new FileLib();
		String browser = flib.getKeyPropertyValue(PROP_PATH, "browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		}

		driver.get(flib.getKeyPropertyValue(PROP_PATH, "url"));
		Thread.sleep(2000);
	}
	

	//@BeforeMethod
	public void loginToApp() throws Throwable {
		Thread.sleep(4000);
		FileLib flib = new FileLib();
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(flib.getKeyPropertyValue(PROP_PATH, "username"));
		lp.setPassword(flib.getKeyPropertyValue(PROP_PATH, "password"));
		lp.clickSignInBtn();
		Thread.sleep(2000);
	}

	@AfterMethod()
	public void logoutFromApp()
	{
		CRMLogout lo = new CRMLogout(driver);
		lo.clicklogoutBtn();
		
	}

	@AfterClass()
	public void closeBrowser() throws Throwable
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
