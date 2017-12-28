package seleniumconcepts.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	WebDriver driver;
	WebElement e1;
	XSSFWorkbook xs;
	XSSFSheet s1;
	@Test
	public void start() throws Exception {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
	    driver=new FirefoxDriver();
		
		File src=new File("C:\\Users\\aakas\\Desktop\\username.xlsx");
		FileInputStream fis=new FileInputStream(src);
		xs=new XSSFWorkbook(fis);
		 s1=xs.getSheetAt(0);
		 int count=s1.getLastRowNum();
		 System.out.println(count);
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 for(int i=1;i<=count;i++) {
			String username= s1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			e1=driver.findElement(By.xpath("//*[@id='email']"));
			e1.sendKeys(username);
			
			Thread.sleep(3000);
			
			String password=s1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			e1=driver.findElement(By.xpath("//*[@id='pass']"));
			e1.sendKeys(password);
			
			e1=driver.findElement(By.xpath("//input[contains(text(),'Log In')]"));
			e1.click();
		 }
		
		
		
	}

}
