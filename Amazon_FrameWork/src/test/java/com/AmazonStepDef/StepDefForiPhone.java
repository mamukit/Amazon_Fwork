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

public class StepDefForiPhone {
	WebDriver driver;
	AmazonPfMaster apf;
	DoHighLight color;
	Select select;
	int ttlNum;
	int pricesiphone;
	Object maximun;
	Object minimun;
	ArrayList<String> NameOfiphone;
	ArrayList<String> AppleIphone;
	ArrayList<Double> PricesOfiphone;
	ArrayList<String> NameOflaptop;
	ArrayList<Double> PricesOflaptop;

	@Given("^User able to Signin successfully with valid credential$")
	public void user_able_to_Signin_successfully_with_valid_credential() throws Throwable {
		AmazonLogIn obj = new AmazonLogIn(driver);
		driver = obj.getLogIn();
		apf = PageFactory.initElements(driver, AmazonPfMaster.class);
		color = new DoHighLight(driver);
	}

	@Then("^Validate Amazon homepage and take screenshot of the homepage$")
	public void validate_Amazon_homepage_and_take_screenshot_of_the_homepage() throws Throwable {
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

	@Given("^User able to search for 'iphone'$")
	public void user_able_to_search_for_iphone() throws Throwable {
		color.drawBorder(apf.getSearchBox(), "Green");
		apf.getSearchBox().sendKeys("iPhone");
		apf.getSearchBox().submit();

	}

	@Given("^sort the price from high to low$")
	public void sort_the_price_from_high_to_low() throws Throwable {
		color.drawBorder(apf.getSortBox(), "red");
		Select select = new Select(apf.getSortBox());
		select.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("^Find out the number of 'iphone' and 'iphone' names on the first page$")
	public void find_out_the_number_of_iphone_and_iphone_names_on_the_first_page() throws Throwable {
		for (int i=0; i<apf.getAppleIphone().size(); i++) {
			System.out.println("*************Apple_iPhone********************");
			System.out.println(apf.getAppleIphone().get(i).getText());
			
		}
		 System.out.println("Total number of iPhone on First Page:" +apf.getAppleIphone().size());
		/*ttlNum = apf.getAppleIphone().size();
		NameOfiphone = new ArrayList<String>();
		AppleIphone = new ArrayList<String>();
		for (WebElement names : apf.getAppleIphone()) {
			NameOfiphone.add(names.getText().toString());
			if (names.getText().contains("iPhone")) {
				AppleIphone.add(names.getText().toString());
			}
		}
		System.out.println(AppleIphone);
		System.out.println("Number of Apple iphone is: " + AppleIphone.size());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	}

	@Then("^Find out the total number of pages$")
	public void find_out_the_total_number_of_pages() throws Throwable {
		System.out.println("The Total Page Number is: " + apf.getTtlPageNum());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^User able to search for 'iphone x'$")
	public void user_able_to_search_for_iphone_x() throws Throwable {
		apf.getSearchBox().clear();
		apf.getSearchBox().sendKeys("iPhone x");
		apf.getSearchBox().submit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^sort the price from low to high$")
	public void sort_the_price_from_low_to_high() throws Throwable {
		select = new Select(apf.getSortBox());
		select.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("^User able to find out the highest and lowest 'iphone x' prices on the first page$")
	public void user_able_to_find_out_the_highest_and_lowest_iphone_x_prices_on_the_first_page() throws Throwable {

		pricesiphone = apf.getIphonePrice().size();
		PricesOfiphone = new ArrayList<Double>();
		System.out.println(pricesiphone);
		for (int i = 0; i < pricesiphone; i++) {
			String A = apf.getIphonePrice().get(i).getText().replace(",", "");
			PricesOfiphone.add(Double.parseDouble(A));
		}

		System.out.println(PricesOfiphone);
		maximun = Collections.max(PricesOfiphone);
		minimun = Collections.min(PricesOfiphone);
		System.out.println("Maximum iPhone X price is = " + maximun);
		System.out.println("Minimum iPhone X price is = " + minimun);

	}

	@When("^User able to click on one 'iphone'$")
	public void user_able_to_click_on_one_iphone() throws Throwable {
		apf.getAppleIphone().get(1).click();

	}

	@Then("^User able to add the item to cart$")
	public void user_able_to_add_the_item_to_cart() throws Throwable {
		apf.getAddToCart().click();

	}

}
