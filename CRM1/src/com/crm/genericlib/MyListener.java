package com.crm.genericlib;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" Test Started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" Test Passed",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" Test Failed",true);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshot/image.jpg");
try {
	Files.copy(src, dest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" Test Skipped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" Excecution Started",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" Excecution Finished",true);
		
	}

}
