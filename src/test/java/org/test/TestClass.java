package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass {
	public static String readFromExcel(String st, int rw, int cl) throws IOException {
		File fl = new File("D:\\Eclipse Workspace\\MavenPro\\Excel\\mavenproject.xlsx");

		FileInputStream fis = new FileInputStream(fl);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(st);
		Row r = sheet.getRow(rw);
		Cell c = r.getCell(cl);

		int type = c.getCellType(); 
		String value = "";
		if (type == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue(); 
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
			value = sdf.format(dd);
		} else {
			double num = c.getNumericCellValue();
			long l = (long) num;
			value = String.valueOf(l);	
		}
		
		return value;
	}

}