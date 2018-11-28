package com.AmazonLoginFunction;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.BaseAmazonLogin.AmazonLogIn;

public class AmazonLoginFunction {
	WebDriver driver;

	@Test
	public void getLogInTest() {

		AmazonLogIn obj = new AmazonLogIn(driver);
		driver = obj.getLogIn();
		driver.quit();

	}

}