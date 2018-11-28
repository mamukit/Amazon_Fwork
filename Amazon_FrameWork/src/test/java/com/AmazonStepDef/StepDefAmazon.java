package com.AmazonStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.AmazonPFMaster.AmazonPfMaster;
import com.AmazonUtil.DoHighLight;
import com.AmazonUtil.MyScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefAmazon {
	WebDriver driver;
	AmazonPfMaster obj;
	DoHighLight color;

	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		obj = PageFactory.initElements(driver, AmazonPfMaster.class);
		color = new DoHighLight(driver);

	}

	@Given("^Put URL and go to login page$")
	public void put_URL_and_go_to_login_page() throws Throwable {
		driver.navigate().to(obj.getURL());

	}

	@When("^User able to click my account$")
	public void user_able_to_click_my_account() throws Throwable {
		MyScreenShot.captureScreenShot(driver, "LogInShot");
		color.drawBorder(obj.getSignInArrow(), "red");
		obj.getSignInArrow().click();

	}

	@When("^User able to use valid user name \"([^\"]*)\"$")
	public void user_able_to_use_valid_user_name(String userName) throws Throwable {
		color.drawBorder(obj.getEmailBox(), "yellow");
		obj.getEmailBox().sendKeys(userName);
		
	}

	@When("^User able to put valid password \"([^\"]*)\"$")
	public void user_able_to_put_valid_password(String password) throws Throwable {
		color.drawBorder(obj.getPasswordBox(), "green");
		obj.getPasswordBox().sendKeys(password);

	}

	@When("^User able to click submit button$")
	public void user_able_to_click_submit_button() throws Throwable {
		color.drawBorder(obj.getSignInTab(), "purple");
		obj.getSignInTab().click();

	}

	@Then("^User able to validate Login status$")
	public void user_able_to_validate_Login_status() throws Throwable {
		MyScreenShot.captureScreenShot(driver, "LoginSuccessShot");
		color.drawBorder(obj.getAmazonLoginTest(), "black");
		
		System.out.println(obj.getAmazonLoginTest().getText());
		
		if (obj.getAmazonLoginTest().getText().equalsIgnoreCase("Hi, Sukanta")) {
			System.out.println("Amazon LogIn Passed");
		} else {
			System.out.println("Amazon LogIn Failed");
		}

	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();

	}

}
