package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePF {
	
	//justchecking
	
	public static WebDriver driver = null;
	public static Select s;
			
	public static void browserLuanch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void waitTime(int time) throws InterruptedException {
		Thread.sleep(1000);
	}
	public static void inputText(WebElement element, String value) {
	element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}

	public static void close() {
		driver.close();

}
	public static void selectvalueMethod(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	public static void selectVisibleMethod(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
}
	public static String hotelReg(int i, int j) {
		String value = null;
		try {
			// file locate
			File f = new File("D:\\Sandhiya\\Project Class\\Programs\\June_2025_New (2)\\June_2025_PF\\src\\test\\resources\\TestData\\testdata_hotel.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			// Workbook
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value= cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					// System.out.println(dateCellValue);
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					value = sim.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value= String.valueOf(l);
					System.out.println(value);

				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	
	}
	
	
}

