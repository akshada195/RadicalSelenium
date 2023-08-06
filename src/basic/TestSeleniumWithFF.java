package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSeleniumWithFF {
	@Test
	public void testcase1() {
		
		System.out.println("Launching browser");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
	}

}
