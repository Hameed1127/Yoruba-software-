package Com.actiTIME.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * This generic class contains all the common controls
 * of webdriver Interface
 * @author BTM-Faculty
 *
 */
public class WebDriverCommonLib extends BaseTest{

	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElement()
	{
		
	}
	
	/**
	 * This method is used to select an option 
	 * by giving index of the option
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
		
	}
	
	/**
	 * This method is used to select an option 
	 * by giving text of the option
	 * @param element
	 * @param text
	 */
	public void select(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	
	
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	
	
	
}
