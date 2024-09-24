package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.SearchPage;

public class SearchSteps {
	WebDriver driver;
	SearchPage sp;
	MyAccountPage mp;
	HomePage hp;
	
	@Then("Enter any existing Product name {string} into the Search text box field")
	public void enter_any_existing_product_name_into_the_search_text_box_field(String ProductName) {
		BaseClass.getLogger().info("Search Page ");
    	
    	mp = new MyAccountPage(BaseClass.getDriver());
    	mp.clickHome();
    	
    	hp = new HomePage(BaseClass.getDriver());
    	hp.enterProductName(ProductName);
    	BaseClass.getLogger().info("Entered ProductName ");
    	
	}

	@Then("Click on the button having search icon")
	public void click_on_the_button_having_search_icon() {
		sp=new SearchPage(BaseClass.getDriver());
		hp.clickSearch(); 
		BaseClass.getLogger().info("Clicked on Search button");
	}

	@Then("Searched product  {string} should be displayed in the search results")
	public void searched_product_should_be_displayed_in_the_search_results(String ProductName) {
		sp=new SearchPage(BaseClass.getDriver());
		boolean status =sp.isProductExist(ProductName);
		Assert.assertEquals(status, true);
		BaseClass.getLogger().info("Product exist");
	}
	@Then("Searched product {string} should not be displayed in the search results")
	public void searched_product_should_not_be_displayed_in_the_search_results(String ProductName) {
		sp=new SearchPage(BaseClass.getDriver());
		boolean status =sp.isProductExist(ProductName);
		Assert.assertEquals(status, false);
		BaseClass.getLogger().info("Product does not exist");
	}


}
