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
	
	@FindBy(id ="signinLink")
	public WebElement signInOption;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(xpath ="//span[contains(text(),'All')]")
	public WebElement AllElements;
	
	@FindBy(id ="sidebar")
	public List<WebElement> sideBar;
	
	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement smartHomeOption;
		
	@FindBy(xpath ="//img[contains(@alt,'Kasa Outdoor Smart Plug ')]")
	public WebElement kasaOutdoorSmartPlugImage;
	
	@FindBy(id = "//button[@id='searchBtn']")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement clickImage;
	
	@FindBy(xpath ="//option[contains(text(),'2')]")
	public WebElement quantityButton;
	
	@FindBy(xpath ="//span[contains(text(),'Add to Cart')]")
	public WebElement addToCartButton;
	
	
	
	
}






















