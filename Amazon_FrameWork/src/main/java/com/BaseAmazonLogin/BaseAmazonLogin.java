package com.BaseAmazonLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.AmazonPFMaster.AmazonPfMaster;
import com.AmazonUtil.DoHighLight;
import com.AmazonUtil.MyScreenShot;

public class BaseAmazonLogin {
	WebDriver driver;
	AmazonPfMaster obj;
	DoHighLight color;

	public void getURLSetUP() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		obj = PageFactory.initElements(driver, AmazonPfMaster.class);
		color = new DoHighLight(driver);
		driver.navigate().to(obj.getURL());
		driver.manage().window().maximize();
	}

	public void getLogInSetUp() {
		MyScreenShot.captureScreenShot(driver, "LogInShot");
		color.drawBorder(obj.getSignInArrow(),"red");
		obj.getSignInArrow().click();
		color.drawBorder(obj.getEmailBox(),"yellow");
		obj.getEmailBox().sendKeys(obj.getUsername());
		color.drawBorder(obj.getPasswordBox(),"green");
		obj.getPasswordBox().sendKeys(obj.getPassword());
		color.drawBorder(obj.getSignInTab(),"purple");
		obj.getSignInTab().click();
	}

	public void getLogInValidation() {
		
		MyScreenShot.captureScreenShot(driver, "LoginSuccessShot");
		color.drawBorder(obj.getAmazonLoginTest(), "black");
		System.out.println(obj.getAmazonLoginTest().getText());
		if (obj.getAmazonLoginTest().getText().equalsIgnoreCase("Hi, Sukanta")) {
			System.out.println("Amazon LogIn Passed");
		} else {
			System.out.println("Amazon LogIn Failed");
		}
		
		Assert.assertEquals("Hi, Sukanta", obj.getAmazonLoginTest().getText());
	}

	
	public void tearDown() {
		driver.quit();
	}
}
