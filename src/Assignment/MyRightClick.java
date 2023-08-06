package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyRightClick {

	@Test
	public void RightClick() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions myAction = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//input[@id='email']"));
		myAction.contextClick(source);
		myAction.build().perform();

	}

}
