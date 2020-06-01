package com.AmazonPFMaster;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPfMaster {

	@FindBy(xpath = "(//*[contains(@class,'nav-icon nav-arrow')])[2]")
	private WebElement SignInArrow;

	@FindBy(xpath = "//*[contains(@id,'ap_email')]")
	private WebElement EmailBox;

	@FindBy(xpath = "//*[contains(@name,'password')]")
	private WebElement PasswordBox;

	@FindBy(xpath = "//*[contains(@id,'signInSubmit')]")
	private WebElement SignInTab;

	@FindBy(xpath = "//*[contains(text(),'Hi, Akija')]")
	private WebElement AmazonLoginTest;

	private String URL = "https://www.amazon.com/";
	private String username = "akijamukit@gmail.com";
	private String password = "Akija123";
	
	@FindBy(xpath = "//*[contains(@id,'twotabsearchtextbox')]")
	private WebElement SearchBox;
	
	@FindBy(xpath = "//*[contains(@name,'sort')]")
	private WebElement SortBox ;
	
	@FindBy(xpath = "//h2[contains(text(),'Apple iPhone')]")
	private List<WebElement> AppleIphone;
	
	@FindBy(xpath = "//*[contains(@class,'pagnDisabled')]")
	private WebElement TtlPageNum ;
	
	@FindBy(xpath = "//*[contains(@class,'sx-price-whole')]")
	private List<WebElement> IphonePrice ;
	
	@FindBy(xpath = "//*[contains(@class,'sx-price-whole')]")
	private List<WebElement> PriceOfLaptop;
	
	@FindBy(xpath = "//*[contains(@class,'a-row a-spacing-none scx-truncate-medium sx-line-clamp-2')]")
	private List<WebElement> AllHPLaptop ;

	@FindBy(xpath = "//*[contains(@id,'add-to-cart-button')]")
	private WebElement AddToCart;
	
	//PopUpMsg =//*[contains(@id,'siNoCoverage-announce')]
	@FindBy(xpath = "//*[contains(@id,'siNoCoverage-announce')]")
	private WebElement PopUpMsg;
	
	//ProceedToCheckOut = (//*[contains(@id,'hlb-ptc-btn-native')])[2]
	@FindBy(xpath = "(//*[contains(@id,'hlb-ptc-btn-native')])[2]")
	private WebElement ProceedToCheckOut ;
	
	//Password
	//SignIn
	//DeliverToThisAddress =(//*[contains(text(),'Deliver to this address')])[2]
	@FindBy(xpath = "(//*[contains(text(),'Deliver to this address')])[2]")
	private WebElement DeliverToThisAddress;
	
	//AddressLine1 =//*[contains(@name,'enterAddressAddressLine1')] sendkey: 3151 Perry Ave Apt 5B
	@FindBy(xpath = "//*[contains(@name,'enterAddressAddressLine1')]")
	private WebElement AddressLine1;
	
	//EnterCity =//*[contains(@name,'enterAddressCity')]
	@FindBy(xpath = "//*[contains(@name,'enterAddressCity')]")
	private WebElement EnterCity ;
		
	//EnterState =//*[contains(@name,'enterAddressStateOrRegion')]
	@FindBy(xpath = "//*[contains(@name,'enterAddressStateOrRegion')]")
	private WebElement EnterState ;
	
	//EnterZip = //*[contains(@name,'enterAddressPostalCode')]
	@FindBy(xpath = "//*[contains(@name,'enterAddressPostalCode')]")
	private WebElement EnterZip ;
	
	//SelectCountry =//*[contains(@name,'enterAddressCountryCode')]
	@FindBy(xpath = "//*[contains(@name,'enterAddressCountryCode')]")
	private WebElement SelectCountry ;
	
	//EnterPhoneNum =//*[contains(@name,'enterAddressPhoneNumber')]
	@FindBy(xpath = "//*[contains(@name,'enterAddressPhoneNumber')]")
	private WebElement  EnterPhoneNum;
	
	//ContinueBtn =//*[contains(@name,'shipToThisAddress')]
	@FindBy(xpath = "//*[contains(@name,'shipToThisAddress')]")
	private WebElement  ContinueBtn;
	
	//FreeShiping = //*[contains(@id,'order_0_ShippingSpeed_sss-us')]
	@FindBy(xpath = "//*[contains(@id,'order_0_ShippingSpeed_sss-us')]")
	private WebElement  FreeShiping;
	
	//FinalContinue = (//*[contains(@class,'a-button-text')])[3]
	@FindBy(xpath = "(//*[contains(@class,'a-button-text')])[3]")
	private WebElement FinalContinue ;
	
	//NameOnCard = //*[contains(@id,'ccName')]
	@FindBy(xpath = "//*[contains(@id,'ccName')]")
	private WebElement NameOnCard;
	
	//CardNumber = //*[contains(@id,'addCreditCardNumber')]
	@FindBy(xpath = "//*[contains(@id,'addCreditCardNumber')]")
	private WebElement CardNumber;
	
	//ExpMonth = (//*[contains(@class,'a-icon a-icon-dropdown')])[1]
	@FindBy(xpath = "(//*[contains(@class,'a-icon a-icon-dropdown')])[1]")
	private WebElement ExpMonth;
	
	//ExpYear = (//*[contains(@class,'a-icon a-icon-dropdown')])[2]
	@FindBy(xpath = "(//*[contains(@class,'a-icon a-icon-dropdown')])[2]")
	private WebElement ExpYear;
	
	//AddYourCard = //*[contains(@id,'ccAddCard')]
	@FindBy(xpath = "//*[contains(@id,'ccAddCard')]")
	private WebElement  AddYourCard;
	
	//ProblemMsg = (//*[contains(text(),'There was a problem')])[1]
	@FindBy(xpath = "(//*[contains(text(),'There was a problem')])[1]")
	private WebElement ProblemMsg;
	
	
	public WebElement getSignInArrow() {
		return SignInArrow;
	}

	public WebElement getEmailBox() {
		return EmailBox;
	}

	public WebElement getPasswordBox() {
		return PasswordBox;
	}

	public WebElement getSignInTab() {
		return SignInTab;
	}

	public WebElement getAmazonLoginTest() {
		return AmazonLoginTest;
	}

	public String getURL() {
		return URL;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getSortBox() {
		return SortBox;
	}

	public List<WebElement> getAppleIphone() {
		return AppleIphone;
	}

	public WebElement getTtlPageNum() {
		return TtlPageNum;
	}

	public List<WebElement> getIphonePrice() {
		return IphonePrice;
	}

	public List<WebElement> getPriceOfLaptop() {
		return PriceOfLaptop;
	}

	public List<WebElement> getAllHPLaptop() {
		return AllHPLaptop;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getPopUpMsg() {
		return PopUpMsg;
	}

	public WebElement getProceedToCheckOut() {
		return ProceedToCheckOut;
	}

	
	public WebElement getDeliverToThisAddress() {
		return DeliverToThisAddress;
	}

	public WebElement getAddressLine1() {
		return AddressLine1;
	}

	public WebElement getEnterCity() {
		return EnterCity;
	}

	public WebElement getEnterState() {
		return EnterState;
	}

	public WebElement getEnterZip() {
		return EnterZip;
	}

	public WebElement getSelectCountry() {
		return SelectCountry;
	}

	public WebElement getEnterPhoneNum() {
		return EnterPhoneNum;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public WebElement getFreeShiping() {
		return FreeShiping;
	}

	public WebElement getFinalContinue() {
		return FinalContinue;
	}

	public WebElement getNameOnCard() {
		return NameOnCard;
	}

	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getAddYourCard() {
		return AddYourCard;
	}

	public WebElement getProblemMsg() {
		return ProblemMsg;
	}
	
	
	
}
