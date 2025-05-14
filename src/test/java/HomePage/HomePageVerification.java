package HomePage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Baseclass;
import Utils.common;
import listners.RetryAnalyzer;
import pageObjects.HomePage;

public class HomePageVerification extends Baseclass {
	
	HomePage homepage;
	common comm;
	
	public HomePageVerification() throws IOException 
	{	
		super(driver);
		
	}
	
	@BeforeTest
	public void setup() 
	{
		initbrowser();
	}
  @Test(testName="Home Verified",description = "user will be check home page validation", retryAnalyzer = RetryAnalyzer.class)

  public void homePageVerfied() throws IOException {
	  
	  
	  homepage= new HomePage();
	  comm= new common();
	  comm.Navigateurl(properties.getProperty("jlr_url")); 
	  homepage.titleCheck(properties.getProperty("jlr_Title"));
	  
  }
  
  @Test(testName="Menu Link Verified", groups= {"smoke"})
  public void menuLinkVerfied() 
  {
	  
	  homepage.verifyAndClickCompamyLink();
  }
 
  
  @AfterTest
  public static void close() 
  {
	  tearDown();
  }
  
}
