package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

public class RegisterInputs {

	@FindBy(id="input-firstname")
	public static WebElement firstname;
	
	@FindBy(id="input-lastname")
	public static WebElement lastname;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-conirm")
	public static WebElement confirm;
	
	@FindBy(name = "agree")
	public static WebElement policy;
	
	@FindBy(css="input[type='submit'][value='continue]")
	public static WebElement continu;
	
	@FindBy(linkText="Rejister")
	public static WebElement registerbreadcrumb;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstnameWarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement laastnameWarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailWarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telepWarning;
	

	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordWarning;
	

	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(name="newsletter")
	public static WebElement subscribe;
}
