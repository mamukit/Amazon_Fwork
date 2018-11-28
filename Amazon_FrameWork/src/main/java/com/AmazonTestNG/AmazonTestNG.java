package com.AmazonTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AmazonPFMaster.AmazonPfMaster;
import com.BaseAmazonLogin.BaseAmazonLogin;

public class AmazonTestNG {

	WebDriver driver;
	AmazonPfMaster obj;
	BaseAmazonLogin testNG = new BaseAmazonLogin();

	@BeforeTest
	public void getURLSetUP() {
		testNG.getURLSetUP();
	}

	@Test
	public void getLogInSetUp() {
		testNG.getLogInSetUp();
	}

	@Test
	public void getLogInValidation() {
		testNG.getLogInValidation();
	}

	@AfterTest
	public void tearDown() {
		testNG.tearDown();
	}

}
