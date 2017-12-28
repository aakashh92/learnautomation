package seleniumconcepts.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelSheet2 {
	
	
	@Test
	public void start() throws Exception {
		
		
		File src=new File("C:\\Users\\aakas\\Desktop\\username.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook xs=new XSSFWorkbook(fis);
		
		XSSFSheet s1=xs.getSheetAt(0);
		
		int count=s1.getLastRowNum();
		System.out.println(count);
		
		for(int i=0;i<=count;i++) {
			String data=s1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		
	}

}
