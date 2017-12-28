package seleniumconcepts.programs.customListenerstestng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



import seleniumconcepts.programs.testcaseslistener.TestBase;

public class CustomListeners extends TestBase implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		if(!arg0.isSuccess())
		{
		Calendar calaender=Calendar.getInstance();
		SimpleDateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		String methodname=arg0.getName();
		System.out.println(methodname);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String reportdirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/test/java/";
		File destfile=new File(reportdirectory+"/failure_screenshots/"+methodname+"_"+formatter.format(calaender.getTime())+".png");
		try {
			FileUtils.copyFile(src, destfile);
			Reporter.log("<a href="+destfile.getAbsolutePath()+"'> img src="+destfile.getAbsolutePath()+"'height ='100' width='100'/> </a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	 
		
			
			
			
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
	Reporter.log(ITestResult.class.getSimpleName()+"test started");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		if(arg0.isSuccess())
		{
		Calendar calaender=Calendar.getInstance();
		SimpleDateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		String methodname=arg0.getName();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String reportdirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/test/java/";
		File destfile=new File(reportdirectory+"/success_screenshots/"+methodname+"_"+formatter.format(calaender.getTime())+".png");
		try {
			FileUtils.copyFile(src, destfile);
			Reporter.log("<a href="+destfile.getAbsolutePath()+"'>img src="+destfile.getAbsolutePath()+"'height ='100' width='100'/> </a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}}
