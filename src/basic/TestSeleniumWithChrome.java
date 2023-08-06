package basic;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSeleniumWithChrome {

	@Test
	public void testcase1() {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		System.out.println("Launching browser");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}
	

}
