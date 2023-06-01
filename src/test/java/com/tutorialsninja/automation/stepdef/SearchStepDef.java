package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersLocators;
import com.tutorialsninja.automation.pages.SearchResultPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchStepDef {
	HeadersLocators headersLocators = new HeadersLocators();
	SearchResultPage searchResultPage = new SearchResultPage();
	
	
	@Given("^I launch the the application$")
	public void i_launch_the_the_application()  {
	  Base.driver.get(Base.reader.getBrowser());
	}

	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product) {
		Elements.TypeText(HeadersLocators.searchh, product);
		Elements.click(HeadersLocators.searchClick);
	
	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results()  {
		Assert.assertTrue( Elements.isDisplayed(SearchResultPage.samsungproduct	));
	
	}
	
	@Then("^I should see a message informing \"([^\"]*)\"$")
	public void i_should_see_a_message_informing(String message) throws Throwable {
	   Assert.assertTrue(Elements.VerifyTextEquals(searchResultPage.noproduct, message));
	}




}
