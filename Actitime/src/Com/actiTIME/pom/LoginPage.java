package Com.actiTIME.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy (name="username")
	private WebElement usTb;
	public void setUsername(String un)
	{
		usTb.sendKeys(un);
	}
	
	@FindBy (name="pwd")
	private WebElement pwdTb;
	public void setpassword(String pwd)
	{
		pwdTb.sendKeys(pwd);
	}
	
	@FindBy (id="loginButton")
	private WebElement loginBtn;
	public void clickBtn() 
	{
		loginBtn.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}


}
