package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_GoogleTest {

	WebDriver driver; 
	
	@BeforeMethod
	public void SetUP() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test(priority = 1, groups = "Title")
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority = 3, groups = "Logo")
	public void PageLogo() {
	boolean b =	driver.findElement(By.id("hplogo")).isDisplayed();
	}
	@Test (priority = 2, groups = "Link")
	public void MailLinkTest() {
	boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
	
}
