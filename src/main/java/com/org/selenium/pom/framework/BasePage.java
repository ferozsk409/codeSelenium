package com.org.selenium.pom.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utills.Waits;

public abstract class BasePage {

	protected static WebDriver driver;

	public BasePage(WebDriver driver) {
		System.out.println("3");
		this.driver = driver;
	}

	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}

	protected void enter(By locator, String txt) throws InterruptedException {
		Waits.implictwait(5);
		find(locator).clear();
		find(locator).sendKeys(txt);
	}

	protected void click(By locator) {

		find(locator).click();
	}

	protected Boolean isDisplayed(By locator) {
		try {
			return find(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}

	}

	protected String getPageTitle() {
		String s = driver.getTitle();
		System.out.println(s);
		return s;
	}
}
