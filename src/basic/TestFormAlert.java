package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFormAlert {
	
	@Test
	public void TestCase1() throws InterruptedException {
		ChromeDriver obj1 = new ChromeDriver();
		obj1.get("https://demo.automationtesting.in/Alerts.html");
		
		obj1.findElement(By.xpath("//div/button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		
		Alert alert = obj1.switchTo().alert();
		String actualMessageString = alert.getText();
		String expectedMessageString = "I am an alert box!";
		Assert.assertEquals(actualMessageString, expectedMessageString);
		alert.accept();
		
		obj1.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
		obj1.findElement(By.xpath("//div[@id='CancelTab']")).click();
		Thread.sleep(1000);
		Alert confirmation = obj1.switchTo().alert();
		String actualMessageConf = confirmation.getText();
		String expectedMessageConf = "Press a Button !";
		Assert.assertEquals(actualMessageString, expectedMessageString);
		alert.dismiss();
		
		obj1.quit();
	}

}
