import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.shoppersstop.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//*[@id='loginId']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(e1).click().build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/main/div[9]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='usernameLogin']")).sendKeys("aakashh92@gmail.com");
		
		

	}

}
