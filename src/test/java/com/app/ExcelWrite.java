package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) {
		excelupdate();
	}
	
	public static void excelwrite() {
		try {
			// file locate
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
					+ "\\June_2025_New\\src\\test\\resources\\TestData\\testData.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			// Workbook
			Workbook wb = new XSSFWorkbook(fis);
			// create a sheet
			Sheet sheet = wb.createSheet("Aiite");
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("Java");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			System.out.println("Excel Write");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void excelupdate() {
		try {
			// file locate
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
					+ "\\June_2025_New\\src\\test\\resources\\TestData\\testData.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			// Workbook
			Workbook wb = new XSSFWorkbook(fis);
			// create a sheet
			Sheet sheet = wb.getSheet("Aiite");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			if(data.equals("Java")) 
				cell.setCellValue("Selenium");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			System.out.println("Excel Write");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
