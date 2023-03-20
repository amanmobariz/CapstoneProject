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
	
	// @FindBy(xpath ="//button[@id='addAddressBtn']")
	// public WebElement addNewAddress;
	
	@FindBy(xpath ="//div[contains(@class, 'checkout__address-item-selected checkout__address-item')]")
	public WebElement addExistingAddress;
	
	@FindBy(xpath ="//div[contains(@class,'checkout__payment-item-selected checkout__payment-item')]")
	public WebElement useExistingPayment;
	
	
	@FindBy(xpath ="//button[@id='placeOrderBtn']") 
	public WebElement placeOrderButton;
	
	@FindBy(xpath ="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderMessage;
	
	// @FindBy(xpath ="//div[contains(text(),'Order Placed Successfully')]")
	// public WebElement orderSuccessMessage;
}






















