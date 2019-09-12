package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomViewDetailsForCampaignPage
{
	@FindBy(xpath = "//input[@value='New Campaign']") private WebElement newCampaignBtn;

	public WebElement newCampaignBtn()
	{
		return newCampaignBtn;
	}
	
	@FindBy(xpath = "(//td[@class='tableData']/..)[1]/td[3]") private WebElement campaignNameInCampList;

	public WebElement campaignNameInCampList()
	{
		return campaignNameInCampList;
	}

	public DisplayingCustomViewDetailsForCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
