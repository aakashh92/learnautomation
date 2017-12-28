package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjectmodel.LogInApp;

public class Base {
	
	
	Actions builder;
	WebElement e1;
	@Test
	public void start() throws Exception {
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.shoppersstop.com/");
		driver.manage().window().maximize();
	
	    		
		
		LogInApp l1=new LogInApp(driver, e1, builder);
		l1.signup();
		Actions builder=new Actions(driver);
		builder.moveToElement(e1).click().build().perform();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='loginId']"));
		l1.usernamee();
		l1.passwrd();
		l1.click();
		
	}

}
