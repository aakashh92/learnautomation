package seleniumPractises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radio {
	
	WebDriver driver;
	WebElement radio;
	@Test
	public void automateRadio() {
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
	}
		
		@Test(dependsOnMethods="automateRadio")
		public void start() {
			List<WebElement> r1=driver.findElements(By.name("sex"));
			int c1=r1.size();
			System.out.println(c1);
			for(int i=0;i<c1;i++) {
				
			String radiosnumber=r1.get(i).getAttribute("value");
			System.out.println(radiosnumber);
			}
			
			
			
			
		}
		@Test(dependsOnMethods="start")
		public void start2() {
			radio.findElement(By.xpath("//*[@id='exp-4']"));
			boolean p1=radio.isDisplayed();
			System.out.println(p1);
			boolean p2=radio.isEnabled();
			System.out.println(p2);
			boolean p3=radio.isSelected();
			System.out.println(p3);
			radio.click();
			boolean p4=radio.isSelected();
			System.out.println(p4);
		}
		
		@AfterMethod()
		public void end() throws InterruptedException {
			
			
			driver.close();
		}
		
		
		
		
		
	}


