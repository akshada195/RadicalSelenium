package Assignment;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleScreenshot {

	@Test
	public void TestCase1() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Tom");

		MultipleScreenshotUtility utility1 = new MultipleScreenshotUtility();
		utility1.takeScreenshot(driver);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Jerry");

		utility1.takeScreenshot(driver);

	}

}
