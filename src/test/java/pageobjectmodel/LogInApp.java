package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogInApp {
	
	WebDriver driver;
	WebElement e1;
	Actions builder;
	
	
	By Signup=By.xpath("//*[@id='loginId']");
	By username=By.xpath("html/body/main/div[9]/ul/li[1]/a");
	By password=By.xpath("//*[@id='passwordLogin']");
	By LoginButton=By.xpath("//*[@id='loginajax']");
	
	public LogInApp(WebDriver driver,WebElement e1,Actions builder) {
		this.driver=driver;
		this.e1=e1;
		this.builder=builder;
		}
	
	public void signup() {
		driver.findElement(Signup);
	}
	
	public void usernamee() {
		driver.findElement(username).sendKeys("aakashh92@gmail.com");
	}

	public void passwrd() {
		driver.findElement(password).sendKeys("chatfacebook1");
	}
	public void click() {
		driver.findElement(LoginButton).click();
	}
}
