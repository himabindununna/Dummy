package com.Excel_Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {

	public  String excel_email(int a) throws IOException {//to return the username from excel to website
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\exceldata\\exceldata.xlsx"));
		  XSSFWorkbook Workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=Workbook.getSheet("Sheet1");
			  String un=sheet.getRow(a).getCell(0).getStringCellValue();
			  
    
		return un;
}
	public  String excel_password(int b) throws IOException {//to return the password from excel to website
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\exceldata\\exceldata.xlsx"));
		  XSSFWorkbook Workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=Workbook.getSheet("Sheet1");
		  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
		  
return pwd;
}
}







