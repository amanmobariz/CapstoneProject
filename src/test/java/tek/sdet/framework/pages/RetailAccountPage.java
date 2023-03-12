package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// @FindBy(xpath = "//a[@id='accountLink']")
	// public WebElement accountLink;

	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInput;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneInput;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement personalInfoUpdateMessage;
	
	// ------------------------------------------------------------------
	
	@FindBy(xpath = "//input[@id='previousPasswordInput']")
	public WebElement previousPass;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement newPassword;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement confirmPass;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changeButton;
	
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passupdateMessage;
	
	// ------------------------------------------------------------------
	
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
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
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addCardButton;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentUpdateMessage;
	
	// ------------------------------------------------------------------
	
	@FindBy(xpath = "//p[contains(@class, 'account')]")
	public WebElement subtitleLink;
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement EditLink;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNum;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement cardNam;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMon;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYe;
	
	@FindBy(css = "#securityCodeInput")
	public WebElement secuityCodeNo;
	
	@FindBy(css = "#paymentSubmitBtn")
	public WebElement editCardButt;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully)]")
	public WebElement paymentMethodMessage;
	
	// remove card------------------------------------------------------------------
	

	@FindBy(xpath = "//p[contains(@class,'account__payment__sub-text')]")
	public WebElement subtitleSection;
	
	@FindBy(xpath = "//button[contains(@class,'text-blue-800 cursor-pointer hover:underline')]")
	public WebElement removeButton;
	
	// Add address -------------------------------------------------------------------
	
	@FindBy(xpath = "//p[contains(text(),'Add Address')]")
	public WebElement addAddressButton;
	
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
	
	//@FindBy(xpath = "//div[contains(text(),'Address Added Successfully)]")
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addAddressMessag;   
	
	// Edit Address ---------------------------------------
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editaAddressButton;
	
	@FindBy(id = "countryDropdown")
	public WebElement editcountryDropDownBut;
	
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement editfullNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement editphoneNumInput;
	
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement editstreetInput;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement editaptNumInput;
	
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement editcityInput;
	
	@FindBy(xpath = "//select[contains(@name, 'state')]")
	public WebElement editstateInput;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement editzipInput;  
	
	@FindBy(id = "addressBtn")
	public WebElement updateAddressBut; 
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement editAddressMessag;
}   
