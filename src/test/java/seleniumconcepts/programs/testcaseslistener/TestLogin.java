package seleniumconcepts.programs.testcaseslistener;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {
	
	@Test
	public void listeners() throws InterruptedException{
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("aakashh92@gmail.com");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("chatfacebook1");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}
	
	@AfterTest
	public void quit() throws Exception {
		Thread.sleep(7000);
		driver.close();
	}

}
