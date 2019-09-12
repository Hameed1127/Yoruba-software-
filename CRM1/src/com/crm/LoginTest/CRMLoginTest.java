package com.crm.LoginTest;

 import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericlib.BaseTest;
import com.crm.genericlib.FileLib;
import com.crm.genericlib.WebDriverCommonLib;
import com.crm.pom.CampaignsDetailsPage;
import com.crm.pom.ContactsHomePage;
import com.crm.pom.CreateCampaignPage;
import com.crm.pom.DisplayingCustomViewDetailsForCampaignPage;
import com.crm.pom.DisplayingCustomViewDetailsForContactsPage;
import com.crm.pom.DisplayingCustomViewDetailsForLeadsPage;
import com.crm.pom.LeadHomepage;
import com.crm.pom.CampaignHomePage;

@Listeners(com.crm.genericlib.MyListener.class)
public class CRMLoginTest extends BaseTest {
	//private static final String PROP_PATH = null;
	WebDriverCommonLib wlib;
	FileLib flib;
	CampaignHomePage hp;
	DisplayingCustomViewDetailsForCampaignPage dcp;
	DisplayingCustomViewDetailsForLeadsPage dclp;
	DisplayingCustomViewDetailsForContactsPage dccp;
	CreateCampaignPage ccp;
	CampaignsDetailsPage cdp;
	LeadHomepage lhp;
	ContactsHomePage chp;

	@Test(enabled=false)
	public void verifyCRMValidLoginTest() throws Throwable {
		wlib = new WebDriverCommonLib();
		flib = new FileLib();
		dcp = new DisplayingCustomViewDetailsForCampaignPage(driver);
		ccp = new CreateCampaignPage(driver);
		cdp = new CampaignsDetailsPage(driver);

//		wlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "LoginTitle"));
//		wlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "HomePageTitle"));
		loginToApp();

		hp = new CampaignHomePage(driver);
		if (hp.campaignTab().isDisplayed())
		{
			Reporter.log("Campaign Tab is displayed", true);
			hp.campaignTab().click();
		} 
		else
		{
			Reporter.log("Campaign Tab is not displayed", true); 
		}

		dcp.newCampaignBtn().click();
		ccp.campaignNameTB().sendKeys(flib.getExcelData(EXCEL_PATH, "invaliddata", 1, 0));
		Thread.sleep(2000);
		ccp.saveBtn().click();
		Thread.sleep(3000);
		String actualCampName = cdp.campaignName().getText();
		wlib.verify("Campaign Name ", actualCampName, flib.getExcelData(EXCEL_PATH, "invaliddata", 1, 0));

		hp.campaignTab().click();
		Thread.sleep(2000);
		String actCampNameText = dcp.campaignNameInCampList().getText();
		wlib.verify("Actual Camp Name Text", actCampNameText, flib.getExcelData(EXCEL_PATH, "invaliddata", 1, 0));
		
		//private static final String PROP_PATH = null;
		WebDriverCommonLib wlib;
		FileLib flib;
		LeadHomepage lhp;
		DisplayingCustomViewDetailsForLeadsPage dcp;	
		
	}
	
	@Test
	public void verfiyingCRMLeadtest() throws Throwable
	{
	//wlib = new WebDriverCommonLib();
	//flib = new FileLib();
		dclp = new DisplayingCustomViewDetailsForLeadsPage(driver);
	//ccp = new CreateCampaignPage(driver);
	//cdp = new CampaignsDetailsPage(driver);

	lhp = new LeadHomepage(driver);
	if (lhp.clickLeadTab().isDisplayed())
	{
		Reporter.log("Lead Tab is displayed", true);
		lhp.clickLeadTab().click();
	} 
	else
	{
		Reporter.log("Lead Tab is not displayed", true); 
	}
	Thread.sleep(2000);
	dclp.newLeadBtn().click();

	}
	@Test
		public void vefyingCRMContacttest() throws Throwable
		{
			dccp=new  DisplayingCustomViewDetailsForContactsPage(driver);
		
			chp = new ContactsHomePage (driver);
			if (chp.clickcontactTab().isDisplayed())
			{
				Reporter.log("Contact Tab is displayed", true);
				chp.clickcontactTab().click();
			} 
			else
			{
				Reporter.log("Contact Tab is not displayed", true); 
			}
			Thread.sleep(2000);
			dccp.NewContactBtn().click();
		}
	}
	
