package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
public class OrderConfirmed {
	
	public OrderConfirmed(){
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="  //a[text()='Success']")
	public static WebElement orderedddd;
}
