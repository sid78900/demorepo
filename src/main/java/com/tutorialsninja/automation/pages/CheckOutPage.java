package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class CheckOutPage {
	CheckOutPage(){
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement continuebilling;

	@FindBy(id="button-shipping-address")
	public static WebElement continueDeliveryDetail;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueDeliveryMethod;
	
	@FindBy(name="agree")
	public static WebElement termsandcondition;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continuePayment;
	

	@FindBy(id="button-confirm")
	public static WebElement ConfirmOrdert;
}
