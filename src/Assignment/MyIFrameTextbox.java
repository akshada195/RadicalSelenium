package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyIFrameTextbox {

	@Test
	public void testcase1() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);

//		WebElement element = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing Textbox");
//		driver.quit();
	}

}
