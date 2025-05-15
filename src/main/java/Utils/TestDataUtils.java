package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestDataUtils extends Baseclass {

	
	public TestDataUtils() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public static final long waitfor=10;
	private static final String PROJECT_PATH = System.getProperty("user.dir");
	  public static final String RESOURCES_FOLDER_PATH = PROJECT_PATH + File.separator + "src" + File.separator
			    + "main" + File.separator + "java"+File.separator + "Resources";
	
	
	public static void takeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

}
