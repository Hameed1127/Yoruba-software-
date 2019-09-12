package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignHomePage {

	@FindBy(xpath="//a[.='Campaigns']") private WebElement campaignsTab;
	public WebElement campaignTab()
	{
		return campaignsTab;
		
	}
	
	public CampaignHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
