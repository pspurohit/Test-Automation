package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T6_Parameters {
	 
	WebDriver driver;
	
	@Test
	@Parameters({"browser","URL","emailid"})
	public void yahooLogin(String browser, String URL, String emailid) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		else if(browser.equals("Firefox")) {
		System.setProperty("webdriver.grcko.driver", "C:\\Selenium\\chromedriver_win32\\geckodriver.exe");
		driver = new geckoDriver();
		}
		driver.get(URL);
		
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailid);
		driver.findElement(By.id("login-signin")).click();
		
		
	}
	
	

}
