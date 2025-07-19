package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.locators.SearchHotel_LocatorsPF;
public class SelectHotel_LocatorsPF extends SearchHotel_LocatorsPF{
	public SelectHotel_LocatorsPF() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id = "continue")
	private WebElement continu;
	
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	public WebElement getContinu() {
		return continu;
	}
}
