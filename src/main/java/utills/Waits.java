package utills;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.selenium.pom.framework.BasePage;

public class Waits extends BasePage {

	public Waits(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void implictwait(int seconds) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	public static void explicitWait()
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.)
	}
}
