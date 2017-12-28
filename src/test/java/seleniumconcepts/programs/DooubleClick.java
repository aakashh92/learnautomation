package seleniumconcepts.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DooubleClick {

	
	WebDriver driver;
	WebElement e1;
	
	@Test
	public void start() throws Exception {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		e1=driver.findElement(By.xpath(".//*[@id='dblClkBtn']"));
		
		
		Actions builder=new Actions(driver);
		Thread.sleep(4000);
		builder.doubleClick(e1).build().perform();
		
		
		
	}
	
}
