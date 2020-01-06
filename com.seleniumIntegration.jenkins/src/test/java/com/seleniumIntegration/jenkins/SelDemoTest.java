package com.seleniumIntegration.jenkins;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelDemoTest {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver","E:/Selenium/chromedriver_win32_79/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https:\\www.gmail.com");
		
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
