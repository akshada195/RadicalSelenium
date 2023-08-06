package basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyScreenShot {
	
	@Test
	public void testcase1() throws IOException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		MyScreenshotUtility utility = new MyScreenshotUtility();
		utility.takeScreenshot(driver);
		
		driver.quit();
	}

}
