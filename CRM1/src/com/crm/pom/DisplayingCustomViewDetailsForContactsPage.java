package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomViewDetailsForContactsPage 
{
	@FindBy(xpath="//a[@id='Contactstab']") private WebElement NewContactbtn;
	public WebElement NewContactBtn()
	{
		return NewContactbtn;
	}
	public DisplayingCustomViewDetailsForContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
