package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcountsHomePage
{
@FindBy(id="Accountstab") WebElement AcountsTab;
public WebElement clickAcountsTab()
{
	//AcountsTab.click();
	return AcountsTab;
}
public AcountsHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
