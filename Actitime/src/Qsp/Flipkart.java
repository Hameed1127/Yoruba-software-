package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();	
		 driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9493773142");
		 driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("hameed1127");
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click(); 
		 Thread.sleep(1000);
		 driver.close();
		  

		 
	}

}
