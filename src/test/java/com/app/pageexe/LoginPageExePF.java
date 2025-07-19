package com.app.pageexe;


import com.app.base.BasePF;
import com.app.locators.BookAHotel_LocatorsPF;
import com.app.locators.LoginPageLocatorsPF;

public class LoginPageExePF extends BookAHotel_LocatorsPF{
	
	public static void loadUrl() {
		loadUrl(hotelReg(17,1));
	}
	public static void username () {
		BasePF.inputText(new LoginPageLocatorsPF().getUsername(), hotelReg(0,1));
				
	}
	public static void password() {
		BasePF.inputText(new LoginPageLocatorsPF().getPassword(), hotelReg(1,1));
	}
	public static void login() {
		BasePF.click(new LoginPageLocatorsPF().getLogin());
	}
}


