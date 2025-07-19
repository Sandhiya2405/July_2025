package com.app.pageexe;

import com.app.base.BasePF;
import com.app.locators.LoginPageLocatorsPF;
import com.app.locators.SearchHotel_LocatorsPF;

public class SearchHotelPageExePF extends LoginPageExePF {
public static void location() {
	
	BasePF.selectvalueMethod(new SearchHotel_LocatorsPF().getLocation(), hotelReg(2,1));
}
public static void hotel() {
	
	BasePF.selectvalueMethod(new SearchHotel_LocatorsPF().getHotels(), hotelReg(3,1));
}
public static void roomType() {
	
	BasePF.selectvalueMethod(new SearchHotel_LocatorsPF().getRoom_type(), hotelReg(4,1));
}
public static void roomNo() {
	
	BasePF.selectVisibleMethod(new SearchHotel_LocatorsPF().getRoom_nos(), hotelReg(5,1));
}
public static void datePickIn() {
	BasePF.clear(new SearchHotel_LocatorsPF().getDatepick_in());
	BasePF.inputText(new SearchHotel_LocatorsPF().getDatepick_in(), hotelReg(6,1));
}
public static void datePickOut() {
	BasePF.clear(new SearchHotel_LocatorsPF().getDatepick_out());
	BasePF.inputText(new SearchHotel_LocatorsPF().getDatepick_out(), hotelReg(7,1));
}
public static void adultRoom() {
	BasePF.selectVisibleMethod(new SearchHotel_LocatorsPF().getAdult_room(), hotelReg(8,1));
}
public static void childRoom() {
	BasePF.selectVisibleMethod(new SearchHotel_LocatorsPF().getChild_room(), hotelReg(9,1));
}
public static void search() {
	BasePF.click(new SearchHotel_LocatorsPF().getSubmit());
}
}
