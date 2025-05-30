package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.apache.hc.core5.util.Timeout;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.util.TimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	public static WebDriver driver;
	public static Properties properties;
	public static Logger log = LogManager.getLogger(Baseclass.class);
	public static ChromeOptions chromeOption;
	
	
	public Baseclass(WebDriver driver) throws IOException 
	{
		this.driver=driver;
		properties= new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/Resources/TestData/testdata.properties");
		
		properties.load(ip);
		
		
	}
	public static void initbrowser() 
	{
		String browserName=properties.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("Chrome")) 
		{
			System.out.println(browserName);
			WebDriverManager.chromedriver().setup();
			//chromeOption.addArguments("--start-maximized");
			driver= new ChromeDriver();
		}
		log.info("Browser is launch Successfull");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	@BeforeSuite
	  public void setup() 
	  {
		  initbrowser();
	  }
	
	@AfterSuite
	public static void tearDown() 
	{
		//driver.manage().deleteAllCookies();
		driver.quit();
		
		
		
	}
}
