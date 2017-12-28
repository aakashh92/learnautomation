package seleniumconcepts.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	
	WebDriver driver;
	WebElement e1;
	
	@Test
	public void start() throws Exception {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/mens-clothing/tshirts/pr?sid=2oq,s9b,j9y&otracker=nmenu_sub_Men_0_T-Shirts");
		driver.manage().window().maximize();
		e1=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]"));
		int size1=e1.getSize().width;
		
		System.out.println("the size is :"+" "+size1);
		
		Actions build=new Actions(driver);
		
		Thread.sleep(4000);
		
		build.clickAndHold(e1).moveByOffset(-50, 0).build().perform();

}
	
}
