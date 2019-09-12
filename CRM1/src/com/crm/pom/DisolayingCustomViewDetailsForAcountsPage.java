package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisolayingCustomViewDetailsForAcountsPage
{
@FindBy(id="Accountstab") private WebElement NewAcountBtn;
public WebElement NewAcountBtn()
{
	return NewAcountBtn;
	
}
public DisolayingCustomViewDetailsForAcountsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
}
