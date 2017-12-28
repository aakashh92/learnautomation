package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven1 {
	
	WebDriver driver;
	@Test(dataProvider="datadriven")
	public void start(String user,String pass) {
		
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
		//driver.switchTo().frame("myframe");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(user);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(pass);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@DataProvider(name="datadriven")
	public Object[][] login(){
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="aakashh92@gmai.com";
		data[0][1]="abc";
		
		data[1][0]="aakashh92@gmail.com";
		data[1][1]="chatfacebook1";
		
		return data;
		
	}

}
