package seleniumconcepts.programs.testcaseslistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    
		
	}

}
