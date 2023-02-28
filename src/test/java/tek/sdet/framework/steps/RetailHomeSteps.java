package tek.sdet.framework.steps;

	import java.util.List;

	import org.junit.Assert;
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
		
		@When("User enter email {string} and password {string}")
		public void userEnterEmailAndPassword(String emailValue, String passValue) {
			sendText(factory.signInPage().emailField, emailValue);
			sendText(factory.signInPage().passwordField, passValue);
			logger.info("user entered email and password");
		}

		
		@And("User change the category to 'Smart Home'")
		public void userChangeTheCategory() {
			click(factory.homePage().smartHomeOption);
			logger.info("User change the category to 'Smart Home'");
			
		}
		
		@And("User search for an item 'kasa outdoor smart plug'")
		public void userSearchForAnItem() {
			Assert.assertTrue(isElementDisplayed(factory.homePage().kasaOutdoorSmartPlugImage));
			logger.info("User search for an item 'kasa outdoor smart plug");
		
		}
		
		@And("User click on Search icon")
		public void userClickOnSearchIcon() {
			click(factory.homePage().searchButton);
			logger.info("User click on Search icon");
		}
		
		@And("User click on item")
		public void userClickOnItem() {
			click(factory.homePage().clickImage);
			logger.info("User click on item");
		}
		
		@And("User select quantity ‘2’")
		public void userClickQuantity() {
			click(factory.homePage().quantityButton);
			logger.info("User select quantity ‘2’");
		}
		
		@And("User click add to Cart button")
		public void userClicAddToCartButton() {
			click(factory.homePage().addToCartButton);
			logger.info("User click add to Cart button");
		}
		
		@Then("the cart icon quantity should change to ‘2’")
		public void theCartIconQuantityShouldChange() {
		    Assert.assertTrue(isElementDisplayed(factory.homePage().kasaOutdoorSmartPlugImage));
		    logger.info("user is logged into account page");
		}
		
	}
