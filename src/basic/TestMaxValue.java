package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMaxValue {

	@Test
	public void TestCase1() {
		
		ChromeDriver objCD = new ChromeDriver();
		objCD.get("https://demo.automationtesting.in/Register.html");
		
		objCD.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Tom");
		
		String flength = objCD.findElement(By.xpath("//input[@ng-model='FirstName']")).getAttribute("value");
		int size = flength.length();
		System.out.println("First name length = " + size);
		
	
		
	}
}
