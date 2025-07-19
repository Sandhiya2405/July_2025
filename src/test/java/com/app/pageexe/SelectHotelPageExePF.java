package com.app.pageexe;

import com.app.base.BasePF;
import com.app.locators.SearchHotel_LocatorsPF;
import com.app.locators.SelectHotel_LocatorsPF;

public class SelectHotelPageExePF extends SearchHotelPageExePF {
	public static void radio() {
		BasePF.click(new SelectHotel_LocatorsPF().getRadiobutton_0());
	}
	public static void continu() {
		BasePF.click(new SelectHotel_LocatorsPF().getContinu());
	}
}
