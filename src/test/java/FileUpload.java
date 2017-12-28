import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FileUpload {
	

	WebDriver driver;
	
	@Test
	public void upload() throws Exception {
		Syty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
		 driver=new FirefoxDriver();stem.setProper
		driver.get("http://www.bridgestone.co.in/submitresume_new.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Robot r1=new Robot();
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_fil_resume']")).click();
		r1.setAutoDelay(3000);
		
		StringSelection s1=new StringSelection("C:\\Users\\aakas\\Desktop\\Akash Sarkar CV.odt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		r1.keyRelease(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		r1.setAutoDelay(3500);
		
		driver.findElement(By.xpath("//*[@id='basicSubmit']")).click();
		}
	
	
	@AfterTest
	public void submit() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
	Thread.sleep(5000);
	driver.close();
	
	}
}
