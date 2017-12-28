package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert1 {

	WebDriver driver;
	
	
	@Test
	public void alert() {
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		driver.switchTo().alert();
		String textofalert=driver.switchTo().alert().getText();
		System.out.println(textofalert);
		
	}
}
