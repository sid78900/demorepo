package com.tutorialsninja.automation.stepdef;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Headers;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersLocators;
import com.tutorialsninja.automation.pages.LoginPageLocators;
import com.tutorialsninja.automation.pages.MyaccountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {
	
	HeadersLocators headersLocators = new HeadersLocators();
	MyaccountPage myaccountPag = new MyaccountPage();
	
	@And("^Navigate to account login page$")
	public void navigate_to_account_login_page()  {
	   Elements.click(HeadersLocators.MyAccountLink);
	   Elements.click(headersLocators.login);
	}

	@When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_and_Password(String email, String password)  {
	   Elements.TypeText(LoginPageLocators.inputemail,email);
	   Elements.TypeText(LoginPageLocators.inputpassword,password);
	   Elements.click(LoginPageLocators.submit);
	}

	@Then("^I should see that the User is able to successfully login$")
	public void i_should_see_that_the_User_is_able_to_successfully_login(){
		Assert.assertTrue(Elements.isDisplayed(MyaccountPage.RegisterAffaccount));
	 
	}
	@Then("^I should see an error message informing the User about invalid credentials$")
	public void i_should_see_an_error_message_informing_the_User_about_invalid_credentials()  {
	  Assert.assertTrue(Elements.VerifyTextEquals(myaccountPag.mainwarning,"Warning: No match for E-Mail Address and/or Password."));
	}



}
