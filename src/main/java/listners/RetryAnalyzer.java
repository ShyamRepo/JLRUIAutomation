package listners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import Utils.Baseclass;

public class RetryAnalyzer implements IRetryAnalyzer {

	
	 private int retryCount = 0;
	 private static final int maxRetryCount = 3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(retryCount<maxRetryCount) 
		{
			retryCount++;
			return true;
			
		}
		return false;
	}
	
	

}
