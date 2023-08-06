package basic;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyExplicitWait {

	
		@Test
		public void testcase1() throws InterruptedException {

			// Timeout
			System.out.println("Launching browser");
			ChromeDriver driver = new ChromeDriver();
	
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath ("//textarea[@id='APjFqb']")));
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		

			driver.quit();
	}
	}
