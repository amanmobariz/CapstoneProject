package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		// we are implementing PageFactory Class to initialize the UI elements 
		// using @FindBy annotation of PageFactory. 
		PageFactory.initElements(getDriver(), this);
	}

	// syntax for storing UI elements using @FindBy annotations
	// @FindBy(locatorType = "locator Value")
	// public WebElement nameOfElement
	
	@FindBy(linkText = "TEKSCHOOL") // this is same as driver.findElement() 
	public WebElement tekschoolLogo;
	
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[contains(@alt,'Pokemon')]")
	public WebElement pokemonImage;
	
	// _________________________________________
	
	@FindBy(id ="signinLink")
	public WebElement signInOption;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(xpath ="//span[contains(text(),'All')]")
	public WebElement AllElements;
	
	@FindBy(id ="sidebar")
	public List<WebElement> sideBar;
	
	
	// add to cart__________________________
	
	
	@FindBy(xpath = "//select[@id='search']")
	public WebElement dropDownList;
		
	@FindBy(id = "//button[@id='searchBtn']")
	public WebElement searchBtn;
	
	@FindBy(xpath ="//img[contains(@alt,'Kasa Outdoor Smart Plug')]")
	public WebElement kasaOutdoorSmartPlugImage;
	
	@FindBy(xpath ="//select[contains(@class, 'product__select')] ")
	public WebElement quantity;
	
	@FindBy(xpath ="//span[contains(text(),'Add to Cart')]")
	public WebElement addToCartButton;
	
	@FindBy(xpath ="//span[@id='cartQuantity']")
	public WebElement cartQuantity;
	
	// place order ---------------------------------------
	
	@FindBy(xpath = "//p[contains(text(),'Cart')]")
	public WebElement cartOption;
		
	@FindBy(css = "#proceedBtn")
	public WebElement proceedButton;
	
	@FindBy(xpath ="//button[@id='addAddressBtn']")
	public WebElement addNewAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement countryDropDownBut;
		
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement fullNameField;
		
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumInput;
		
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement streetInput;
		
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement aptNumInput;
		
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement cityInput;
		
	@FindBy(xpath = "//select[contains(@name, 'state')]")
	public WebElement stateInput;
		
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipInput;  
		
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addAddressBut;
	
	@FindBy(xpath ="//button[@id='placeOrderBtn']") 
	public WebElement placeOrderButton;
	
	@FindBy(xpath ="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderMessage;
	
	@FindBy(css = "#addPaymentBtn")
	public WebElement addPaymentLink;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumber;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement cardName;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement expirationMonth;
	
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationYear;
	
	@FindBy(css = "#securityCodeInput")
	public WebElement secuityCode;
	
	@FindBy(css = "#paymentSubmitBtn")
	public WebElement addCardButton;
	
	@FindBy(css = "#placeOrderBtn")
	public WebElement placeOrderButt;
	
	// order without address and card payment ------------------------------
	
	@FindBy(xpath = "//img[contains(@alt, 'Apex Legends - 1,000 Apex Coins')]")
	public WebElement clickAtImg;
}























