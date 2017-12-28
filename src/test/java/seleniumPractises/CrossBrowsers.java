package seleniumPractises;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class CrossBrowsers {
	
	
	
	WebDriver driver;
	@Test
	@Parameters("browsers")
	public void crossbrowser(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\chrome\\chromedriver.exe");	
		}
	
		
	
		
		
		
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
			driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("aakashh92@gmail.com");
			driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("chatfacebook1");
			driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
			
		}
		
	}


