package Com.actiTIME.login;

import org.testng.annotations.Test;

import Com.actiTIME.genericLib.BaseTest;
import Com.actiTIME.genericLib.WebDriverCommonLib;
import Com.actiTIME.pom.EnterTimeTrackPage;



public class ActiCreateTasksTest extends BaseTest{	

	@Test
	public void createTaskByClickingOnCreateTaskBtn() throws InterruptedException
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.waitForPageLoad();
		Thread.sleep(2000);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.clickTasksTab();
		
		
		
	}
	
}
