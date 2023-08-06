package basic;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestFormInChrome {
	
	/**
	 * Test case - enter fname,mname, lname, gender and uncheck Cricket box, and check Cycling box and validate its unchecked 
	 * 
	 */
	@Test
	public void testcase1() throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--disable-notifications");
		
		System.out.println("Launching browser");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		boolean TestResult = true;
		String errorMessageString = null;

		try {
			driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys("Tom");
		}catch (Exception e) {
			TestResult = false;
			System.out.println("First Name field missing");
			errorMessageString = errorMessageString + " First Name field missing";
		}
		try {

			driver.findElement(By.xpath("//div/input[@placeholder='Middle Name']")).sendKeys("Jerry");
		}catch (Exception e) {
			TestResult = false;
			System.out.println("Middle Name field missing");
			errorMessageString = errorMessageString + " Middle Name field missing";
		}
		try {

			driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys("Disney");
		}catch (Exception e) {
			TestResult = false;
			System.out.println("Last Name field missing");
			errorMessageString = errorMessageString + " Last Name field missing";
		}
		try {

			
		}catch (Exception e) {
			TestResult = false;driver.findElement(By.xpath("//input[@value='Cycling']")).click();
			System.out.println("Cycling  field missing");
			errorMessageString = errorMessageString + " Cycling  field missing";
		}
		
		//1st way to select option from drowdown
//		driver.findElement(By.xpath("//select[@id='Skills']")).click();

//		driver.findElement(By.xpath("//select[@id='Skills']/option[text()='Android']")).click();
		
		//2nd way to select option from drowdown
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(element);
		select.selectByVisibleText("Android");
		
		System.out.println("Test Execution complete and resutl is  "+TestResult);
		Assert.assertTrue(TestResult,errorMessageString);
		
		//driver.close(); // always closes current window/browser
		//driver.quit(); // close all windows launch during this test case.
	}
}