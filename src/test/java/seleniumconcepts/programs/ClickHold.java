package seleniumconcepts.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickHold {

	
	WebDriver driver;
	WebElement e1;
	
	@Test
	public void start() throws Exception {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
		
	e1=driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
	Actions builder=new Actions(driver);
	Thread.sleep(4000);
	builder.clickAndHold(e1).click().build().perform();
	
		
		
		
	}
}
