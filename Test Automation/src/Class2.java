package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_Amazon {
WebDriver driver;

@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test
public void pageTitle() {
String title = driver.getTitle();
System.out.println(title);
Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}
@Test
public void serachTest() {
	driver.findElement(By.id("twotabsearchtextbox"));
}
@Test
public void logo() {
	driver.findElement(By.className("product-image"));
}









}

