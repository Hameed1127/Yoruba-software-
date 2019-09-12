package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsHomePage 
{
	@FindBy(id="Contactstab") WebElement contactsTab;
	public WebElement clickcontactTab()
	{
		//contactsTab.click();
		return contactsTab;
	}
	public ContactsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}