package seleniumPractises;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		WebElement e1;
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\aakas\\Downloads\\selenium\\selenium latest 1\\firefox\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://shopping.rediff.com/");
		driver.manage().window().maximize();
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int c=l1.size();
		System.out.println(c);
		for(int i=0;i<c;i++) {
			
			e1=l1.get(i);
			String url=e1.getAttribute("href");
		    System.out.println(url);
		    verifyLinkActive(url);
		}
	
	
	
}



public  void verifyLinkActive(String linkUrl)
{
try 
{
   URL url = new URL(linkUrl);
   
   HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
   
   httpURLConnect.setConnectTimeout(3000);
   
   httpURLConnect.connect();
   
   if(httpURLConnect.getResponseCode()==200)
   {
       System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
    }
  if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
   {
       System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
    }
} catch (Exception e) {
   
}
} 

}
