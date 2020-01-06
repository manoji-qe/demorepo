package com.seleniumIntegration.jenkins;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelDemoTest {
	//*[@id="gb"]/div[2]/div[3]/div[1]/div/div[1]/a*//
	
	WebDriver driver;
	
	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver","E:/Selenium/chromedriver_win32_79/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https:\\www.gmail.com");
		//driver.findElement(By.xpath("//*[contains(text(),'Gmail']"));
	}
	@Test
	public void printSelenium()
	{
		System.out.println("This is a selenium demo");
		System.out.println("selenium tools integration");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
