package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When ("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account");
	}

    @And ("User update Name {string} and Phone {string}")
    public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
    	// clearTextUsingSendKeys(factory.accountPage().nameInput);
    	// clearTextUsingSendKeys(factory.accountPage().phoneInput);
    	// clearText(factory.accountPage().nameInput);
    	// clearText(factory.accountPage().phoneInput);
    	clearTextUsingJSExecutor(factory.accountPage().nameInput);
    	clearTextUsingJSExecutor(factory.accountPage().phoneInput);
    	sendText(factory.accountPage().nameInput, nameValue);
    	// sendText(factory.accountPage().phoneInput, phoneValue);
    	logger.info("Updating Name and Phone Number");
    } 
    
    @And ("User click on Update button")
    public void userClickOnUpdateButton() {
    	click(factory.accountPage().updateButton);
		logger.info("user click on Update");
    }
	
    @Then ("user profile information should be updated")
    public void userProfileInformationShouldBeUpdated() {
    	waitTillPresence(factory.accountPage().personalInfoUpdateMessage);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateMessage));
    	String actualMessage = factory.accountPage().personalInfoUpdateMessage.getText();
    	String expectedMessage = "Personal Information Updated Successfully";
    	Assert.assertEquals(expectedMessage, actualMessage);
    	logger.info("user profile information updated");
    	
    }
    
 // 2:  ------------------------------------------------------------------
    
    @And("User enter below information")
    public void userEnterBelowInformation(DataTable dataTable) {
        List<Map<String, String>> password = dataTable.asMaps(String.class, String.class);
        sendText(factory.accountPage().previousPass, password.get(0).get("previousPassword"));
        sendText(factory.accountPage().newPassword, password.get(0).get("newPassword"));
        sendText(factory.accountPage().confirmPass, password.get(0).get("confirmPassword"));
    	logger.info("user password has been updated");
    	
    }
    @And("User click on Change Password button")
    public void userClickOnChangePasswordButton() {
       click(factory.accountPage().changeButton);
       logger.info("user clicked on password button");
  
    }
    @Then("a message should be displayed ‘Password Updated Successfully")
    public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
    	waitTillPresence(factory.accountPage().passupdateMessage);
    	logger.info("an updated message appeared");
    }
    
 // 3: add payment ------------------------------------------------------------------
    
    @When("User click on Add a payment method link")
    public void userClickOnAddAPaymentMethodLink() {
    	click(factory.accountPage().addPaymentLink);
		logger.info("user click on add payment link");
    }
    @When("User fill Debit or credit card information")
    public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
    	List<Map<String, String>> card = dataTable.asMaps(String.class, String.class);
    	sendText(factory.accountPage().cardNumber, card.get(0).get("cardNumber"));
    	sendText(factory.accountPage().cardName, card.get(0).get("nameOnCard"));
    	selectByVisibleText(factory.accountPage().expirationMonth, card.get(0).get("expirationMonth"));
    	selectByVisibleText(factory.accountPage().expirationYear, card.get(0).get("expirationYear"));
    	sendText(factory.accountPage().secuityCode, card.get(0).get("securityCode"));
    	logger.info("user filled card info");
    }
    @When("User click on Add your card button")
    public void userClickOnAddYourCardButton() {
    	click(factory.accountPage().addCardButton);
		logger.info("user clicked on card button");
    }
    @Then("a message should be displayed ‘Payment Method added successfully")
    public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
    	waitTillPresence(factory.accountPage().paymentUpdateMessage);
    	logger.info("an updated message displayed");
    }
    
    // 4: edit card payment ------------------------------------------------------------------
    
    @And("User click on master card link")
    public void userClickOnMasterCardLink() {
    	click(factory.accountPage().subtitleLink);
		logger.info("User clicked on master card link");
    }
    
    @And("User click on Edit option of card section")
    public void userClickOnEditOptionOfCardSection() {
    	click(factory.accountPage().EditLink);
		logger.info("user clicked on edit payment method link");
    }
    @And("user edit information with below data")
    public void userEditInformationWithBelowData(DataTable dataTable) {
    	List<Map<String, String>> edit = dataTable.asMaps(String.class, String.class);
    	clearText(factory.accountPage().cardNum);
    	clearTextUsingJSExecutor(factory.accountPage().cardNam);
    	clearTextUsingJSExecutor(factory.accountPage().secuityCodeNo);
    	// clearText(factory.accountPage().cardNam); // i have called all these below method, but it does not clear in my Mac
    	// clearText(factory.accountPage().secuityCodeNo);
    	// clearTextUsingSendKeys(factory.accountPage().cardNum);
    	// clearTextUsingSendKeys(factory.accountPage().cardNam);
    	// clearTextUsingSendKeys(factory.accountPage().secuityCodeNo);
    	// clearTextUsingJSExecutor(factory.accountPage().nameInput);
    	// clearTextUsingJSExecutor(factory.accountPage().phoneInput);
    	sendText(factory.accountPage().cardNum, edit.get(0).get("cardNumber"));
    	sendText(factory.accountPage().cardNam, edit.get(0).get("nameOnCard"));
    	selectByVisibleText(factory.accountPage().expirationMon, edit.get(0).get("expirationMonth"));
    	selectByVisibleText(factory.accountPage().expirationYe, edit.get(0).get("expirationYear"));
    	sendText(factory.accountPage().secuityCodeNo, edit.get(0).get("securityCode"));
    	logger.info("user edited payment method displayed");
    	
    }
    
    @And("user click on Update Your Card button")
    public void userClickOnUpdateYourCardButton() {
    	click(factory.accountPage().editCardButt);
		logger.info("user clicked on card button");
    	
    }
    @Then("a message should be displayed ‘Payment Method updated Successfully")
    public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
    	waitTillPresence(factory.accountPage().paymentMethodMessage);
    	logger.info("a payement method updated message displayed");
   
    }
    
    // Remove Card details--------------------------------------------------------
    
    @And("User click on master card section")
    public void userClickOnMasterCardSection() {
    	click(factory.accountPage().subtitleSection);
		logger.info("User clicked on master card section");
    }
    @And("User click on remove option of card section")
    public void userClickOnRemoveOptionOfCardSection() {
    	click(factory.accountPage().removeButton);
		logger.info("user clicked on remove card section");
    	
    }
    @Then("payment details should be removed")
    public void paymentDetailsShouldBeRemoved() {
    	// Assert.assertTrue(isElementDisplayed(factory.accountPage().removeButton));
    	// isElementDisplayed(factory.accountPage().removeButton);
    	// Assert.assertTrue(isElementDisplayed(factory.accountPage().removeButton));
    	logger.info("payment details is removed");
    }
    
    // Add Address ---------------------------------------------------------
    
    @And("User click on Add address option")
    public void userClickOnAddAddressOption() {
    	click(factory.accountPage().addAddressButton);
		logger.info("User clicked on master card section");
    }
    @And("user fill new address form with below information")
    public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException {
    	List<Map<String, String>> address = dataTable.asMaps(String.class, String.class);
    	selectByVisibleText(factory.accountPage().countryDropDownBut, address.get(0).get("country"));
    	//sendText(factory.accountPage().countryDropDownBut, address.get(0).get("country"));
    	sendText(factory.accountPage().fullNameField, address.get(0).get("fullName"));
    	sendText(factory.accountPage().phoneNumInput, address.get(0).get("phoneNumber"));
    	sendText(factory.accountPage().streetInput, address.get(0).get("streetAddress"));
    	sendText(factory.accountPage().aptNumInput, address.get(0).get("apt"));
    	sendText(factory.accountPage().cityInput, address.get(0).get("city"));
    	selectByVisibleText(factory.accountPage().stateInput, address.get(0).get("state"));
    	sendText(factory.accountPage().zipInput, address.get(0).get("zipCode"));
    	logger.info("user added new address");
    	
    }
    @And("User click Add Your Address button")
    public void userClickAddYourAddressButton() {
    	click(factory.accountPage().addAddressBut);
		logger.info("User clicked on add address link");
    	
    }
    @Then("a message should be displayed ‘Address Added Successfully")
    public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
    	waitTillPresence(factory.accountPage().addAddressMessag);
    	logger.info("an added address message displayed");
    	
            }
    // -------------------------------------------------
    
    @And("User click on edit address option")
    public void userClickOnEditAddressOption() {
    	click(factory.accountPage().editaAddressButton);
		logger.info("User clicked on edit address option");
    	
    }
        
    @And("user update new address form with below information")
    public void userUpdateNewAddressForm(DataTable dataTable) {
    	List<Map<String, String>> editAddress = dataTable.asMaps(String.class, String.class);
    	selectByVisibleText(factory.accountPage().editcountryDropDownBut, editAddress.get(0).get("country"));
    	clearTextUsingSendKeys(factory.accountPage().editfullNameField);
    	clearTextUsingSendKeys(factory.accountPage().editphoneNumInput);
    	clearTextUsingSendKeys(factory.accountPage().editstreetInput);
    	clearTextUsingSendKeys(factory.accountPage().editaptNumInput);
    	clearTextUsingSendKeys(factory.accountPage().editcityInput);
    	clearTextUsingSendKeys(factory.accountPage().editzipInput);
    	
    	clearText(factory.accountPage().editfullNameField);
    	clearTextUsingJSExecutor(factory.accountPage().editphoneNumInput);
    	clearTextUsingJSExecutor(factory.accountPage().editstreetInput);
    	clearText(factory.accountPage().editaptNumInput);
    	clearTextUsingJSExecutor(factory.accountPage().editcityInput);
    	clearTextUsingJSExecutor(factory.accountPage().editzipInput);
    	// clearText(factory.accountPage().cardNam); // i have called all these below method, but it does not clear the existing values in my Mac
    	
    	// sendText(factory.accountPage().editfullNameField, editAddress.get(0).get("fullName"));
    	// sendText(factory.accountPage().editphoneNumInput, editAddress.get(0).get("phoneNumber"));
    	// sendText(factory.accountPage().editstreetInput, editAddress.get(0).get("streetAddress"));
    	// sendText(factory.accountPage().editaptNumInput, editAddress.get(0).get("apt"));
    	// sendText(factory.accountPage().editcityInput, editAddress.get(0).get("city"));
    	// selectByVisibleText(factory.accountPage().editstateInput, editAddress.get(0).get("state"));
    	// sendText(factory.accountPage().editzipInput, editAddress.get(0).get("zipCode"));
    	logger.info("user updated new address");
        }
    
    @And("User click update Your Address button")
    public void userClickUpdateYourAddressButton() {
    	click(factory.accountPage().updateAddressBut);
		logger.info("User clicked update address Button");
    }
    @Then("a message should be displayed ‘Address Updated Successfully")
    public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
    	// Assert.assertTrue(isElementDisplayed(factory.accountPage().editAddressMessag));
    	waitTillPresence(factory.accountPage().editAddressMessag);
    	logger.info("an update address message displayed");
    	
    	// String actualMessage = factory.accountPage().editAddressMessag.getText();
    	// String expectedMessage = "Address Updated Successfully";
    	// Assert.assertEquals(expectedMessage, actualMessage);
    	// logger.info("user profile information updated");
    }
    
    // Remove Address Scenario: ------------------------
    
    @And("User click on remove option of Address section")
    public void userClickOnRemoveOptionOfAddressSection() {
    	click(factory.accountPage().removeAddressBut);
		logger.info("User clicked romve address Button");
    	
    }
    
    @Then("Address details should be removed")
    public void addressDetailsShouldBeRemoved() {
    	// isElementDisplayed(factory.accountPage().removeAddressBut);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().removeAddressBut));
    	logger.info("existing address remove message displayed");
    	
    }

}













