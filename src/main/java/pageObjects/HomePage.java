package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Baseclass;
import Utils.common;
import dev.failsafe.internal.util.Assert;

public class HomePage extends Baseclass {
	
	common commonFunction;
	
	public HomePage() throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
		commonFunction= new common();
	}
	
	@FindBy(xpath = "//*[@class='nav-2024__item'][contains(text(),'Company')]")
	WebElement companyLink;
	
	@FindBy(xpath="//*[@class='nav-2024__dropdown-item--first' and text()='Leadership']")
	WebElement leadership;
	
	@FindBy(xpath="//*[@class='nav-2024__dropdown-item--first' and text()='Governance']")
	WebElement goverance;

	
	
	public void titleCheck(String actual) 
	{
		String expected=commonFunction.getTitle();
		System.out.println(expected);
		assertEquals(actual, expected);	
	}
	

	public void verifyAndClickCompamyLink() {
		// TODO Auto-generated method stub
		common.ActionElemnetHandle(companyLink);
		leadership.click();
		assertEquals(common.getCurrentUrl(), properties.getProperty("LeaderShip_url"));
		common.pageNavigation("back");
		common.waitFor();
		common.ActionElemnetHandle(companyLink);
		goverance.click();
		assertEquals(common.getCurrentUrl(), properties.getProperty("Governance_url"));
		
	}
	

}
