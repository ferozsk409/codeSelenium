package com.org.selenium.pom.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	String URL = "https://www.saucedemo.com/";
	LoginPage loginpage;

	@BeforeMethod
	public void setUpBroser() {
		System.out.println("1");
		WebDriverManager.chromedriver().setup();
		driver = PageDriver.getDriver();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
