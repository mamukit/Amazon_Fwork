package com.AmazonStepDef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.AmazonPFMaster.AmazonPfMaster;
import com.AmazonUtil.DoHighLight;
import com.AmazonUtil.MyScreenShot;
import com.BaseAmazonLogin.AmazonLogIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefForLaptopAndPayment {

	WebDriver driver;
	AmazonPfMaster apf;
	DoHighLight color;
	Select select;
	int LaptopPrices;
	int maximun;
	int minimun;
	ArrayList<Integer> PriceOfLaptop;

	@Given("^User Signin successfully with valid credential$")
	public void user_Signin_successfully_with_valid_credential() throws Throwable {
		AmazonLogIn obj = new AmazonLogIn(driver);
		driver = obj.getLogIn();
		apf = PageFactory.initElements(driver, AmazonPfMaster.class);
		color = new DoHighLight(driver);

	}

	@Then("^Amazon homepage Validation and catch screenshot of the homepage$")
	public void amazon_homepage_Validation_and_catch_screenshot_of_the_homepage() throws Throwable {

		MyScreenShot.captureScreenShot(driver, "LoginSuccessShot");
		color.drawBorder(apf.getAmazonLoginTest(), "black");
		System.out.println(apf.getAmazonLoginTest().getText());
		if (apf.getAmazonLoginTest().getText().equalsIgnoreCase("Hi, Sukanta")) {
			System.out.println("Amazon LogIn Passed");
		} else {
			System.out.println("Amazon LogIn Failed");
		}
		Assert.assertEquals("Hi, Sukanta", apf.getAmazonLoginTest().getText());

	}

	@Given("^User able to search for 'HP laptop'$")
	public void user_able_to_search_for_HP_laptop() throws Throwable {
		apf.getSearchBox().clear();
		apf.getSearchBox().sendKeys("HP Laptop");
		apf.getSearchBox().submit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^sort the price of HP laptops from high to low$")
	public void sort_the_price_of_HP_laptops_from_high_to_low() throws Throwable {
		select = new Select(apf.getSortBox());
		select.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("^User able to find out the total number of 'HP laptop' and 'HP laptop' names on the first page$")
	public void user_able_to_find_out_the_total_number_of_HP_laptop_and_HP_laptop_names_on_the_first_page()
			throws Throwable {

		for (int i = 0; i < apf.getAllHPLaptop().size(); i++) {

			System.out.println(apf.getAllHPLaptop().get(i).getText());
		}
		System.out.println(apf.getAllHPLaptop().size());
	}

	@Then("^find out the total page number$")
	public void find_out_the_total_page_number() throws Throwable {

		System.out.println("The Total Page Number is : " + apf.getTtlPageNum());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^User sort the price from low to high$")
	public void user_sort_the_price_from_low_to_high() throws Throwable {
		select = new Select(apf.getSortBox());
		select.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("^User able to find the highest and lowest 'HP laptop' price on the first page$")
	public void user_able_to_find_the_highest_and_lowest_HP_laptop_price_on_the_first_page() throws Throwable {
		LaptopPrices = apf.getPriceOfLaptop().size();
		PriceOfLaptop = new ArrayList<Integer>();
		System.out.println(LaptopPrices);
		for (int i = 0; i < LaptopPrices; i++) {
			String X = apf.getPriceOfLaptop().get(i).getText().replace(",", "");
			PriceOfLaptop.add(Integer.parseInt(X));
		}

		System.out.println(PriceOfLaptop);

		maximun = Collections.max(PriceOfLaptop);
		minimun = Collections.min(PriceOfLaptop);
		System.out.println("Maximum HP Laptop price is = " + maximun);
		System.out.println("Minimum HP Laptop price is = " + minimun);

	}

	@When("^User able to select one 'HP laptop'$")
	public void user_able_to_select_one_HP_laptop() throws Throwable {
		apf.getAllHPLaptop().get(2).click();
	}

	@Then("^User able to add the new item to cart$")
	public void user_able_to_add_the_new_item_to_cart() throws Throwable {
		apf.getAddToCart().clear();
		apf.getAddToCart().click();
	}

	@When("^User able to proceed to cart$")
	public void user_able_to_proceed_to_cart() throws Throwable {
		apf.getPopUpMsg().click();
		apf.getProceedToCheckOut().click();
	}

	@When("^User enters his email and password$")
	public void user_enters_his_email_and_password() throws Throwable {
		apf.getPasswordBox().sendKeys(apf.getPassword());
		apf.getSignInTab().click();
	}

	@When("^click on the 'Deliver' button$")
	public void click_on_the_Deliver_button() throws Throwable {
		apf.getDeliverToThisAddress().click();
		apf.getFreeShiping().click();
	}

	@When("^click on the 'Continue' button$")
	public void click_on_the_Continue_button() throws Throwable {
		apf.getContinueBtn().click();
	}

	@When("^User enter invalid name on card as \"([^\"]*)\" and card number as \"([^\"]*)\"$")
	public void user_enter_invalid_name_on_card_as_and_card_number_as(String arg1, String arg2) throws Throwable {
		apf.getNameOnCard().sendKeys("Barak Obama");
		apf.getCardNumber().sendKeys("234365875623");
	}

	@When("^select expired month and year$")
	public void select_expired_month_and_year() throws Throwable {
		select = new Select(apf.getExpMonth());
		select.selectByIndex(4);
		select = new Select(apf.getExpYear());
		select.selectByIndex(1);
	}

	@When("^User click on the 'Add your card' button$")
	public void user_click_on_the_Add_your_card_button() throws Throwable {
		apf.getAddYourCard().click();
	}

	@Then("^User not able to proceed and payment fails$")
	public void user_not_able_to_proceed_and_payment_fails() throws Throwable {
		System.out.println(apf.getProblemMsg());
		
	}

	@Then("^take screenshot of the failed payment$")
	public void take_screenshot_of_the_failed_payment() throws Throwable {
		MyScreenShot.captureScreenShot(driver, "PaymentFail ScreenShot");
	}

	@Then("^Shut the browser$")
	public void shut_the_browser() throws Throwable {
		driver.quit();
	}

}
