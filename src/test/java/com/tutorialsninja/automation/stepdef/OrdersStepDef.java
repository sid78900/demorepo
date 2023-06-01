package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeadersLocators;
import com.tutorialsninja.automation.pages.LoginPageLocators;
import com.tutorialsninja.automation.pages.OrderConfirmed;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCart;

import cucumber.api.java.en.*;


public class OrdersStepDef {
	HeadersLocators headersLocators = new HeadersLocators();
	OrderConfirmed orderConfirmed = new OrderConfirmed();
	
	
	@Given("^I login to the application$")
	public void i_login_to_the_application() throws Throwable {
Browser.openbrowser();
Elements.click(HeadersLocators.MyAccountLink);
Elements.click(HeadersLocators.login);
Elements.TypeText(LoginPageLocators.inputemail, Base.reader.getUsername());
Elements.TypeText(LoginPageLocators.inputpassword, Base.reader.getPassword());
Elements.click(LoginPageLocators.submit);
	}

	@When("^I add a product to bag and checkout$")
	public void i_add_a_product_to_bag_and_checkout() throws Throwable {
		Elements.TypeText(HeadersLocators.searchh, Base.reader.getProduct());
		Elements.click(HeadersLocators.searchClick);
	   
	}

	@And("^I place order$")
	public void i_place_order() throws Throwable {
		Elements.click(SearchResultPage.addToCart);
		Elements.click(HeadersLocators.shoppingCart);
		Elements.click(ShoppingCart.CheckButton);
		Elements.click(CheckOutPage.continuebilling);
		Elements.click(CheckOutPage.continueDeliveryDetail);
		Elements.click(CheckOutPage.continueDeliveryMethod);
		Elements.click(CheckOutPage.ConfirmOrdert);
	}

	@Then("^I should see order placed succesully$")
	public void i_should_see_order_placed_succesully() throws Throwable {
		Assert.assertTrue(Elements.isDisplayed(OrderConfirmed.orderedddd));
	   
	}


}
