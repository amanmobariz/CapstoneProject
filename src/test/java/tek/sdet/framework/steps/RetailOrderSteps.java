package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
		
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderSection); 
		logger.info("user clicked on section");
		
	}
	
	// @And("User click on first order in list") // this code was not needed, as the order was already open
	// public void userClickOnFirstOrderInList() {
		// click(factory.orderPage().showDetailButtn);
		// logger.info("user clicked on first order in list");
		
	// }
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelOrderButtn); 
		logger.info("user clicked on Cancel The Order button");
		
	}
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String reason) {
		click(factory.orderPage().returnDropDown);
		selectByVisibleText(factory.orderPage().returnDropDown, reason); 
		logger.info("user selected the cancelation Reason ‘Bought wrong item'");
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrder); 
		logger.info("user clicked on Cancel order");
		
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String finalMessage) {
		String actualMessage = finalMessage;
		String expectedMessage = "Your Order Has Been Cancelled";
		Assert.assertEquals(actualMessage, expectedMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().finalMessage));
    	logger.info("a cancelation message is displayed ‘Your Order Has Been Cancelled'");
	
	}
	
	// Return order --------------------------------
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().showDetailButtn);
		logger.info("user clicked on first order in list");
	}
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnButtn); 
		logger.info("user clicked on the Return Items button");
		
	}
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returnReasons) {
		click(factory.orderPage().returnReason);
		selectByVisibleText(factory.orderPage().returnReason, returnReasons); 
		logger.info("user selected the Reason as ‘Item damaged'");
	}
	
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String service) {
		click(factory.orderPage().dropOff);
		selectByVisibleText(factory.orderPage().dropOff, service); 
		logger.info("user selected the drop service as ‘FedEx'");
		
	}
	
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderLink); 
		logger.info("user clicked on the Return Order link");
		
	}
	
	@Then("a cancelation message should be displayed as {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String successeMessage) {
		String actualMessage = successeMessage;
		String expectedMessage = "Return was successful";
		Assert.assertEquals(actualMessage, expectedMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().successeMessage));
    	logger.info("a cancelation message is displayed as ‘Return was successful'");	
	}
	
	// Write Order Review Scenario ---------------------------------------------------------------
    
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButt); 
		logger.info("user clicked on the Review button");
		
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadline(String headlineValue, String reviewText) {
		sendText(factory.orderPage().addReview, headlineValue);
		sendText(factory.orderPage().AddText, reviewText);
		logger.info("user write Review headline 'headline value’ and ‘review text'");
		
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().AddReviewButt); 
		logger.info("user clicked on the Review button");
		
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewMessage) {
		String actualMessage = reviewMessage;
		String expectedMessage = "Your review was added successfully";
		Assert.assertEquals(actualMessage, expectedMessage);
		// Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewMessage));
    	logger.info("this message should be displayed ‘Your review was added successfully");
	    
	}
	
}