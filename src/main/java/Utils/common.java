package Utils;

import java.io.IOException;
import java.time.Duration;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.PageFactory;

public class common extends Baseclass {
	
	WebElement element;
	
	public common() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(this.driver, this);
	}

	public static String getTitle() 
	{
		String title=driver.getTitle();
		log.info(title+"Title of Page");
		return title;
		
	}
	
	
	public static void ActionElemnetHandle(WebElement element) 
	{
		
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		
	}
	
	public static String getCurrentUrl() 
	{
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static void pageNavigation(String navigation) 
	{
		switch(navigation) 
		{
		case "back":
			driver.navigate().back();
		case "forword":
			driver.navigate().forward();
		case "refresh":
			driver.navigate().refresh();
		
		}
		
	}
	
	public static void waitFor() 
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataUtils.waitfor));
		
	}
	
	public static void scrollDown() 
	{
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void Navigateurl(String url) {
		
		driver.get(url);
	}

	public void waitForVisbility() {
		// TODO Auto-generated method stub
		
	}
	
	public static JSONObject getValuefromjson(String bodyvalue) 
	{
		
		JSONObject json = new JSONObject(bodyvalue);
		return json;
		
		
		
	}
}
