package com.app.pageexe;

import com.app.base.BasePF;
import com.app.locators.BookAHotel_LocatorsPF;
import com.app.locators.LoginPageLocatorsPF;
import com.app.locators.SearchHotel_LocatorsPF;

public class BookAHotelPageExe extends SelectHotelPageExePF {
	public static void firstname () {
		BasePF.inputText(new BookAHotel_LocatorsPF().getFirst_name(), hotelReg(10,1));
		}
	public static void lastname() {
		BasePF.inputText(new BookAHotel_LocatorsPF().getLast_name(), hotelReg(11,1));
		}
	public static void address() {
		BasePF.inputText(new BookAHotel_LocatorsPF().getAddress(), hotelReg(12,1));
		}
	public static void ccNum() {
		BasePF.inputText(new BookAHotel_LocatorsPF().getCc_num(), hotelReg(13,1));
		}
	public static void ccType() {
		BasePF.selectvalueMethod(new BookAHotel_LocatorsPF().getCc_type(), hotelReg(14,1));
	}
	public static void ccExpMonth() {
		BasePF.selectVisibleMethod(new BookAHotel_LocatorsPF().getCc_exp_month(), hotelReg(15,1));
	}
	public static void ccExpYear() {
		BasePF.selectVisibleMethod(new BookAHotel_LocatorsPF().getCc_exp_year(), hotelReg(15,2));
	}
	public static void cvv() {
		BasePF.inputText(new BookAHotel_LocatorsPF().getCc_cvv(), hotelReg(16,1));
		}
	public static void book() {
		BasePF.click(new BookAHotel_LocatorsPF().getBook_now());
	}
}
