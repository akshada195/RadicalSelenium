package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFileAttachment {

	@Test
	public void testcase1() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.freefileconvert.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='first_file']")).sendKeys("E:\\AutomationTraining\\impLinks.txt");

	}

}
