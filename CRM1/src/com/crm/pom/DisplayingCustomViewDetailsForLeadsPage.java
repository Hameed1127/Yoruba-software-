package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomViewDetailsForLeadsPage 
{
		@FindBy(xpath="//input[@value='New Lead']") private  WebElement newLeadBtn;
		public WebElement newLeadBtn()
		{
			return newLeadBtn;
		}
		
		public DisplayingCustomViewDetailsForLeadsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
}
