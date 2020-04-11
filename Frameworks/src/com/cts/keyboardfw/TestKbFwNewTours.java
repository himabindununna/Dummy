package com.cts.keyboardfw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException; 

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKbFwNewTours {

	public static void main(String[] args) {
		FileInputStream fin;
		XSSFWorkbook  wb; 
		XSSFSheet sh;
		WebDriver driver;
		try {
			fin=new FileInputStream("C:/TESTING/work/logincrentialsnewtours.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rows =sh.getLastRowNum();
			for(int i=1;i<=rows;i++) {
				
					String username=sh.getRow(i+1).getCell(0).toString();
					String password=sh.getRow(i+1).getCell(1).toString();
 					System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 			driver=new ChromeDriver();
					driver.get("http://newtours.demoaut.com");
					driver.findElement(By.name("userName")).sendKeys(username);
					driver.findElement(By.name("password")).sendKeys(password);
					driver.findElement(By.name("login")).click();
				
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
