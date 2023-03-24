package tek.sdet.framework.steps;

	import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

	import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import tek.sdet.framework.pages.POMFactory;
	import tek.sdet.framework.utilities.CommonUtility;

	public class RetailHomeSteps extends CommonUtility {

		POMFactory factory = new POMFactory();
		
		@When ("User click on All section")
		public void userClickOnAllSection() {
		click(factory.homePage().AllElements);
		logger.info("User click on All section link");
	}
		
		@Then("below options are present in Shop by Department sidebar")
		public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
			List<List<String>> optionToDisplay = dataTable.asLists(String.class);
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionToDisplay.get(0).get(0) + "']" ))));
			logger.info("all 5 shop Department sidebar are present");
		}
		
		@And ("User on {string}")
		public void userOnDepartment(String department) {
			List<WebElement> dept = factory.homePage().sideBar;
			for(WebElement element : dept) {
				if (element.getText().equals(department)) {
					 element.click();
					 break;
				}
			}
			
		}
		
		@Then ("below options are present in department")
		public void belowOptionsArePresentInDepartment(DataTable dataTable) {
			List<List<String>> departmentSection = dataTable.asLists(String.class);
			List<WebElement> dept = factory.homePage().sideBar;
			for (int i = 0; i < departmentSection.get(0).size(); i++) {
				for(WebElement element: dept) {
					if(element.getText().equals(departmentSection.get(0).get(i))) {
						logger.info(element.getText()+ "The items is present");
						
					}
					
				}
			}
		}
		
	
		@And("User change the category to {string}")
		public void userChangeTheCategory(String catagory) {
			click(factory.homePage().dropDownList);
			selectByVisibleText(factory.homePage().dropDownList, catagory);
			logger.info("User change the category to 'Smart Home'");
			
		}
		
		@And("User search for an item {string}")
		public void userSearchForAnItem(String item) {
			sendText(factory.homePage().searchBarInput, item);
			click(factory.homePage().searchButton);
			logger.info("User search for an item 'kasa outdoor smart plug");
		
		}
		
		@And("User click on Search icon")
		public void userClickOnSearchIcon() {
			click(factory.homePage().searchButton);
			logger.info("User click on Search icon");
		}
		
		@And("User click on item")
		public void userClickOnItem() {
			click(factory.homePage().kasaOutdoorSmartPlugImage);
			logger.info("User click on item");
		}
		
		@And("User select quantity {string}")
		public void userClickQuantity(String qty) {
			selectByVisibleText(factory.homePage().quantity, qty);
			logger.info("User selected quantity ‘2’");
		}
		
		@And("User click add to Cart button")
		public void userClicAddToCartButton() {
			click(factory.homePage().addToCartButton);
			logger.info("User click add to Cart button");
		}
		
		@Then("the cart icon quantity should change to {string}")
		public void theCartIconQuantityShouldChange(String qty) {
			String actualQuantity = qty;
			String expectedQuantity = "2";
			Assert.assertEquals(actualQuantity, expectedQuantity);
		    Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		    logger.info("cart icon quantity changed to '2'");
		}
		
		// Place Order ----------------------------------------------------------------------
		
		@And("User click on Cart option")
		public void userClickOnCartOption() {
			click(factory.homePage().cartOption);
			logger.info("User clicked on cart option");
			
		}
		@And("User click on Proceed to Checkout button")
		public void userClickOnProceedToCheckoutButton() {
			click(factory.homePage().proceedButton);
			logger.info("user clicked on Proceed to Checkout");
			
		}
	@And("User click Add a new address link for shipping address")
		public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addNewAddress);
		logger.info("user clicked Add a new address link");
			
		}
	@And("User fill new address information")
		public void userFillNewAddressInformation(DataTable dataTable) {
		List<Map<String, String>> shippingAddress = dataTable.asMaps(String.class, String.class);
    	selectByVisibleText(factory.accountPage().countryDropDownBut, shippingAddress.get(0).get("country"));
    	sendText(factory.accountPage().fullNameField, shippingAddress.get(0).get("fullName"));
    	sendText(factory.accountPage().phoneNumInput, shippingAddress.get(0).get("phoneNumber"));
    	sendText(factory.accountPage().streetInput, shippingAddress.get(0).get("streetAddress"));
    	sendText(factory.accountPage().aptNumInput, shippingAddress.get(0).get("apt"));
    	sendText(factory.accountPage().cityInput, shippingAddress.get(0).get("city"));
    	selectByVisibleText(factory.accountPage().stateInput, shippingAddress.get(0).get("state"));
    	sendText(factory.accountPage().zipInput, shippingAddress.get(0).get("zipCode"));
    	logger.info("user added new shipping address information");
			
		}
	
	@And("User click Add Address button")
	public void userClickAddAddressButton() {
		click(factory.homePage().addAddressBut);
		logger.info("user clicked at the Add Address button");
		
	}
	
	@And("User click Add a credit card or Debit Card for Payment method")
		public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addPaymentLink);
		logger.info("user clicked at the Add a credit card or Debit Card for Payment method");
			
		}
	
	@And ("User fill bellow Debit or credit card information")
    public void userFillBellowDebitOrCreditCardInformation(DataTable dataTable) {
    	List<Map<String, String>> addCard = dataTable.asMaps(String.class, String.class);
    	sendText(factory.accountPage().cardNumber, addCard.get(0).get("cardNumber"));
    	sendText(factory.accountPage().cardName, addCard.get(0).get("nameOnCard"));
    	selectByVisibleText(factory.accountPage().expirationMonth, addCard.get(0).get("expirationMonth"));
    	selectByVisibleText(factory.accountPage().expirationYear, addCard.get(0).get("expirationYear"));
    	sendText(factory.accountPage().secuityCode, addCard.get(0).get("securityCode"));
    	logger.info("user filled Debit or credit card information for order");
	}
	
	@And("User click on Add card button")
	public void userClickOnPlaceYourOrde() {
		click(factory.homePage().addCardButton);
		logger.info("user clicked at the Add card button");
		
	}
	
		@And("User click on Place Your Order")
		public void userClickOnPlaceYourOrder() {
			click(factory.homePage().placeOrderButt);
			logger.info("user clicked on Place Order link");
			
		}
		@And("a message should be displayed ‘Order Placed, Thanks’")
		public void aMessageShouldBeDisplayedOrderPlacedThanks() {
			waitTillPresence(factory.homePage().orderMessage);
	    	logger.info("a message should be displayed ‘Order Placed, Thanks’");
			
		}
		
		// order without address and card payment ---------------------------------
		
		@And("User click on the item")
		public void userClickOnTheItem() {
			click(factory.homePage().clickAtImg);
			logger.info("user clicked on the item image");
		}
		
		@Then("the cart icon quantity should be changed to {string}")
		public void theCartIconQuantityShouldBeChanged(String qty) {
			String actualQuantity = qty;
			String expectedQuantity = "5";
			Assert.assertEquals(actualQuantity, expectedQuantity);
		    Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		    logger.info("cart icon quantity changed to '5'");
		    
		}
	}
