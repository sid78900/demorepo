package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class LoginPageLocators {
	
	LoginPageLocators(){
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement inputemail;
	
	@FindBy(id="input-password")
	public static WebElement inputpassword;
	
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement submit;

}
