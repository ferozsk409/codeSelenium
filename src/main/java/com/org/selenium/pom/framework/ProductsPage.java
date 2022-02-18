package com.org.selenium.pom.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);

	}

	private By adToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

	public void clickAddToCart(By adToCart) {
		click(adToCart);
	}

	public void clickaddtoCart() {

	}

	public String getProductsPageTitle() {

		return getPageTitle();

	}
}
