	package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	
	public RetailOrderPage() { 
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath ="//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(css ="#orderLink")
	public WebElement orderSection;
	
	// @FindBy(xpath = "//p[contains(@class, 'order__header-btn')]") 
	// public WebElement showDetailButtn;
	
	@FindBy(xpath ="//button[@id='cancelBtn']")
	public WebElement cancelOrderButtn; 
	
	@FindBy(xpath ="//select[@id='reasonInput']")
	public WebElement returnDropDown;
	
	@FindBy(css = "#orderSubmitBtn")
	public WebElement cancelOrder;
	
	@FindBy(xpath ="//p[contains(text(),'Your Order Has Been Cancelled')]") 
	public WebElement finalMessage;

	// Return Order Scenario --------------------------------------------------
	
	@FindBy(xpath = "//div[contains(@data-id, '4384')]") 
	public WebElement showDetailButtn;
	
	@FindBy(css ="#returnBtn")
	public WebElement returnButtn; 
	
	@FindBy(xpath ="//select[@id='reasonInput']")
	public WebElement returnReason;
	
	@FindBy(css = "#dropOffInput")
	public WebElement dropOff;    
	
	@FindBy(css = "#orderSubmitBtn")
	public WebElement returnOrderLink;
	
	@FindBy(xpath ="//p[contains(text(),'Return was successfull')]")
	public WebElement successeMessage;
	
	// Write Order Review ----------------------------------------------------
	
	@FindBy(css ="#reviewBtn")
	public WebElement reviewButt; 
	
	@FindBy(xpath ="//input[@id='headlineInput']")
	public WebElement addReview;
	
	@FindBy(css ="#descriptionInput")
	public WebElement AddText;    
	
	@FindBy(css = "#reviewSubmitBtn")
	public WebElement AddReviewButt;
	
	@FindBy(xpath ="//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewMessage;
	
}





































