package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodImpl implements IInvokedMethodListener{

	@Override
public void afterInvocation(IInvokedMethod method, ITestResult testResult) 
{
	// TODO Auto-generated method stub
	//IInvokedMethodListener.super.afterInvocation(method, testResult);
	WebDriverFactory.threadStorage.get().quit();
}

@Override
public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	// TODO Auto-generated method stub
	//IInvokedMethodListener.super.beforeInvocation(method, testResult);
//System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59-20210806T064524Z-001\\ChromeDriver\\chromedriver.exe");
	
	System.setProperty("webdriver.gecko.driver","C:\\geckoDriver\\geckodriver.exe");
	WebDriverFactory.threadStorage.set(new FirefoxDriver());
	
	WebDriverFactory.threadStorage.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//.driver=new ChromeDriver();
    WebDriverFactory.threadStorage.get().get("https://opensource-demo.orangehrmlive.com/");	

}
}
