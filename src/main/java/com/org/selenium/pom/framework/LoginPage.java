package com.org.selenium.pom.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {

		super(driver);
		System.out.println("4");
	}

	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//input[@id='login-button']");

	public static int test;

	public void setUserName(String usernameTxt) throws Exception {
		enter(username, usernameTxt);
	}

	public void setPassword(String passwordTxt) throws InterruptedException {
		enter(password, passwordTxt);
	}

	public ProductsPage clickOnLoginButton() {

		click(loginButton);
		return new ProductsPage(driver);

	}

	public ProductsPage loginWith(String username, String password) throws InterruptedException {

		try {
			setUserName(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setPassword(password);
		return clickOnLoginButton();
	}
}
