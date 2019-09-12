package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCutsomViewDetailsForPotentialPage 
{
@FindBy(id="Potentialstab") private WebElement NewPotentialTab;
public WebElement NewpotentialBtn()
{
	return NewPotentialTab;
}
public DisplayingCutsomViewDetailsForPotentialPage(WebDriver driver )
{
	PageFactory.initElements(driver, this);
}
}
