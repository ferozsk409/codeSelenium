package com.org.selenium.pom.framework;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utills.RetryFailedTest;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("test");
		ProductsPage productspage = loginpage.loginWith("standard_user", "secret_sauce");
		productspage.getProductsPageTitle();
		assertEquals(productspage.getProductsPageTitle(), "Swag Labs");
	}

	@Test(retryAnalyzer = RetryFailedTest.class)
	public void dloginTest1() throws InterruptedException {
		System.out.println("test");
		ProductsPage productspage = loginpage.loginWith("standard_user", "secret_sauce");
		productspage.getProductsPageTitle();
		assertEquals(productspage.getProductsPageTitle(), "Swag Labs");
	}

	@Test(dependsOnMethods = {"dloginTest1","loginTest"})
	public void loginTest2() throws InterruptedException {
		System.out.println("test");
		ProductsPage productspage = loginpage.loginWith("standard_user", "secret_sauce");
		productspage.getProductsPageTitle();
		assertEquals(productspage.getProductsPageTitle(), "Swags Labs");
	}
}
