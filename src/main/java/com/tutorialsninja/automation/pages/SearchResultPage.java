package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SearchResultPage {//CONSTRUCTOR FOR INITIALISING WEBELEMENT
	 public SearchResultPage() {
		 PageFactory.initElements(Base.driver, this);
	 }
	@FindBy(linkText="Samsung SyncMaster 941BW")
public static WebElement samsungproduct; 
	
	@FindBy(css="input[id='input-search']+h2+p")
	public static WebElement noproduct;
	
	@FindBy(xpath ="//span[text()='Add to Cart']")
	public static WebElement addToCart;
}
