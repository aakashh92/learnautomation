package seleniumconcepts.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestXpath1 {
	
	WebDriver driver;
	WebElement e1;
	
	@Test
	public void start() throws Exception {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://www.cardekho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		e1=driver.findElement(By.xpath("//div[contains(text(),'Get On Road Price')]"));
		e1.click();

}
	
}
