package Assignment;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MultipleScreenshotUtility {
	
public void takeScreenshot(WebDriver driver ) throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File fi=  screenshot.getScreenshotAs(OutputType.FILE);
		DateFormat timestamp;
		timestamp = SimpleDateFormat.getTimeInstance();
		FileUtils.copyFile(fi, new File("E:\\AutomationTraining\\Screenshots\\screenshot_" + timestamp + ".png"));
		
	}

}
