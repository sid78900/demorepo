package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import com.tutorialsninja.automation.pages.HeadersLocators;
import com.tutorialsninja.automation.pages.RegisterInputs;
import com.tutorialsninja.automation.pages.SuccessPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;




public class Register {
	
	HeadersLocators headers = new HeadersLocators();
	Register Register = new Register();
	SuccessPage successPage = new SuccessPage();
	
	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
	    Base.driver.get(Base.reader.getBrowser());
	}

	@And("^navigate to registrtion page$")
	public void navigate_to_registrtion_page() throws Throwable {
	   Elements.click(HeadersLocators.MyAccountLink);
	   Elements.click(HeadersLocators.register);
	}

	@When("^when i fill below all valid details$")
	public void when_i_fill_below_all_valid_details(DataTable datatable) throws Throwable {
		Map<String,String> map = datatable.asMap(String.class,String.class);
		Elements.TypeText(RegisterInputs.firstname, map.get("FirstName"));
		Elements.TypeText(RegisterInputs.lastname, map.get("LastName"));
		Elements.TypeText(RegisterInputs.email,System.currentTimeMillis() +  map.get("Email"));//to run many times
		Elements.TypeText(RegisterInputs.telephone, map.get("telephone"));
		Elements.TypeText(RegisterInputs.password, map.get("password"));
		Elements.TypeText(RegisterInputs.confirm, map.get("password"));
	}

	@And("^select privacy policy$")
	public void select_privacy_policy() throws Throwable {
		Elements.click(RegisterInputs.policy);
	   
	}

	@And("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
		Elements.click(RegisterInputs.continu);
	   
	}

	@Then("^I should see that the user account has been create succesfully$")
	public void i_should_see_that_the_user_account_has_been_create_succesfully()  {
		Assert.assertTrue( Elements.isDisplayed(successPage.sucesss));
	   
	}
	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created() throws Throwable {
	    Assert.assertTrue(Elements.isDisplayed(RegisterInputs.registerbreadcrumb));
	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() throws Throwable {
		Assert.assertTrue(Elements.isDisplayed(RegisterInputs.mainWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterInputs.firstnameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterInputs.laastnameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterInputs.emailWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterInputs.passwordWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterInputs.telepWarning));
		
		
	}
    
	@And("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() throws Throwable {
	    Elements.click(RegisterInputs.subscribe);
}
}
