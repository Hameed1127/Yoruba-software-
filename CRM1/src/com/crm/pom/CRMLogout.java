package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLogout
{

	@FindBy(xpath="//a[.='Logout [rashmi@dell.com]']") private WebElement logoutBtn;
	public WebElement clicklogoutBtn()
	{
		//logoutBtn.click();
		return logoutBtn;
	}
	public CRMLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
 