package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyImplicitWait {

	@Test
	public void testcase1() throws InterruptedException {

		// Timeout
		System.out.println("Launching browser");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
	
		
//		driver.navigate().back();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
//		driver.navigate().forward();
		
		driver.quit();
}
}
