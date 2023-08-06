package basic;

import org.testng.annotations.Test;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFileDownload {

	@Test
	public void myDownload() throws InterruptedException {
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "D:\\TestBatch24");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions"); // to disable browser extension popup
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");

		driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]")).click();// Download Text File
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Download PDF File']")).click();// Download PDF File
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Download CSV File']")).click();// Download CSV File
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Download Excel File']")).click();// Download Excel File
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Download Doc File']")).click();// Download Doc File
		Thread.sleep(5000);

		driver.quit();
	}

}
