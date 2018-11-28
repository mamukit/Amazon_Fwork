package com.BaseAmazonLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.AmazonPFMaster.AmazonPfMaster;
import com.AmazonUtil.DoHighLight;
import com.AmazonUtil.MyScreenShot;

public class AmazonLogIn {
	WebDriver driver;
	AmazonPfMaster obj;
	DoHighLight color;

	public AmazonLogIn(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getLogIn() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		obj = PageFactory.initElements(driver, AmazonPfMaster.class);
		color = new DoHighLight(driver);
		driver.navigate().to(obj.getURL());
		driver.manage().window().maximize();
		MyScreenShot.captureScreenShot(driver, "LogInShot");
		color.drawBorder(obj.getSignInArrow(), "red");
		obj.getSignInArrow().click();
		color.drawBorder(obj.getEmailBox(), "yellow");
		obj.getEmailBox().sendKeys(obj.getUsername());
		color.drawBorder(obj.getPasswordBox(), "green");
		obj.getPasswordBox().sendKeys(obj.getPassword());
		color.drawBorder(obj.getSignInTab(), "purple");
		obj.getSignInTab().click();
		
		return driver;
	}

}
