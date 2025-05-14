package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.Baseclass;
import Utils.common;

public class FooterPage extends Baseclass {

	common commonFunction;
	
	public FooterPage() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(this.driver, this);
		
		
	}
	
	
	@FindBy(xpath="(//*[@class='footer__item']/a)[1]")
	WebElement accessibility;
	
	
	@FindBy(xpath="//*[@class='page-title text-center light-font']")
	WebElement accessibilityTxt;
	

	
	public void verifyAndClickFooterLink() throws IOException {
		commonFunction= new common();
		// TODO Auto-generated method stub
		commonFunction.Navigateurl(properties.getProperty("jlr_url")); 
		commonFunction.scrollDown();
		commonFunction.waitFor();
		boolean flag=accessibility.isDisplayed();
		accessibility.click();
		String text=accessibilityTxt.getText();
		System.out.println(text);
		Assert.assertTrue(flag);
		
		
	}

}
