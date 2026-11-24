package org.mapp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mavbas.Baseclass;
public class Mappgm   {
	public static void main(String[] args) throws IOException {
		File fl = new File("D:\\Eclipse Workspace\\MavenPro\\Excel\\LoginSheet (3).xlsx");
		FileInputStream fis = new FileInputStream(fl);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		HashMap<String,String> m = new HashMap<String,String>();
		for (int i = 0; i <=3; i++) {
			Row r=sheet.getRow(i);
			
                Cell c1= r.getCell(1);
			    Cell c2 = r.getCell(2);
			 	
			String s1 = c1.getStringCellValue();
		    String  s2 = c2.getStringCellValue();
					
				
				m.put(s1, s2);
					
			}
		System.out.println(m);	
				
			
		
		}
}







//sheet.getPhysicalNumberOfRows()
//if (r==null) {
//	continue;
//	}
//if (c1==null|| c2==null) {
//	  continue;}	