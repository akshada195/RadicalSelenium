package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyScreenshotUtility {
	
	public void takeScreenshot(WebDriver driver ) throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File fi=  screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fi, new File("E:\\AutomationTraining\\Screenshots\\screenshot_Google1.png"));
		
	}

}
