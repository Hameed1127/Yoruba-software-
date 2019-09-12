package Com.actiTIME.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage
{

	@FindBy(id="logoutLink") private WebElement logoutLink;
	public void clickLogoutLink()
	{
		logoutLink.click();
	}
	
	@FindBy(xpath="//div[.='TASKS']") private WebElement tasksTab;
	public void clickTasksTab()
	{
		tasksTab.click();
	}
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
