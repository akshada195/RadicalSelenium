package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestFormInEdge {

	@Test
	public void TestCase1() {

		System.out.println("Launching browser");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Akshada");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Bhoite");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshada.bhoite19@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9819657653");
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

	}

}
