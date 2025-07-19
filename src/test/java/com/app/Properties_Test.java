package com.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_Test {

	public static void main(String[] args) {
		prop_read();
	}
	public static void prop_read() {
	try {
		FileReader read = new FileReader( new File("D:\\Sandhiya\\Project Class\\Programs\\June_2025_New (2)\\June_2025_PF\\src\\test\\resources\\TestData\\config.properties"));
		Properties prop = new Properties();
		prop.load(read);
		String url = prop.getProperty("url");
		System.out.println(url);
		String username = prop.getProperty("username");
		System.out.println(username);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static String prop_reuse(String data) {
		String value = null;
		try {
			FileReader read = new FileReader( new File("D:\\Sandhiya\\Project Class\\Programs\\June_2025_New (2)\\June_2025_PF\\src\\test\\resources\\TestData\\config.properties"));
			Properties prop = new Properties();
			prop.load(read);
			value= prop.getProperty(data);
			System.out.println(value);
			
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
