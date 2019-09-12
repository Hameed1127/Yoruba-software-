package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadHomepage 
{
	@FindBy(xpath="(//a[@class='menuOff'])[1]") WebElement LeadTab;
	public WebElement clickLeadTab()
	{
		//LeadTab.click();
		return LeadTab;
	}
	public LeadHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
