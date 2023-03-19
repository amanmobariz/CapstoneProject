package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailPage extends BaseSetup {

	public RetailPage() {
		// we are implementing PageFactory Class to initialize the UI elements 
		// using @FindBy annotation of PageFactory. 
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(linkText = "TEKSCHOOL") // this is same as driver.findElement() 
	public WebElement tekschoolLogo;
	
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[contains(@alt,'Pokemon')]")
	public WebElement pokemonImage;
	
}
