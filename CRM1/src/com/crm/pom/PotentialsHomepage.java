package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PotentialsHomepage 
{
	@FindBy(id="Potentialstab") WebElement potentialTab;
	public WebElement clickPotentialTab()
	{
		//potentialTab.click();
		return potentialTab;
	}
	public PotentialsHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
