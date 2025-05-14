package Footer;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePage.HomePageVerification;
import Utils.Baseclass;
import pageObjects.FooterPage;

public class FooterLinkVerification extends Baseclass {
	
	FooterPage footerpage;

	
	
  protected FooterLinkVerification() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
  

  
  @BeforeTest
  public void setup() 
  {
	  initbrowser();
  }
  
 
  
  
@Test
 public void verifiedFooterLink() throws IOException {
	
	 footerpage= new FooterPage();
	 footerpage.verifyAndClickFooterLink();
	
  }
}
