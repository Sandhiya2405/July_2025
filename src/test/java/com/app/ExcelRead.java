package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys(excelRead_Resuse(3,1));
	}

	public static void excelread() {

		try {
			// file locate
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
					+ "\\June_2025_New\\src\\test\\resources\\TestData\\testData.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			// Workbook
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(1);
			System.out.println(cell);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void excelALLRead() {

		try {
			// file locate
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
					+ "\\June_2025_New\\src\\test\\resources\\TestData\\testData.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			// Workbook
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			// System.out.println(physicalNumberOfRows);
			for (int i = 0; i < physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);

				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String excelRead_dataformat() {
		String value = null;
		try {
			// file locate
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
					+ "\\June_2025_New\\src\\test\\resources\\TestData\\testData.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			// Workbook
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			// System.out.println(physicalNumberOfRows);
			for (int i = 0; i < physicalNumberOfRows; i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells; j++) {
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

	public static String excelRead_Resuse(int i, int j) {
		String value = null;
		try {
			// file locate
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
					+ "\\June_2025_New\\src\\test\\resources\\TestData\\testData.xlsx");
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
