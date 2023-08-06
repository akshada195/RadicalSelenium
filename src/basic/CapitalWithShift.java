package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class CapitalWithShift {

	@Test
	public void testcase1() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String text = "tom";

		Actions myAction = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//input[@id='email']"));
		myAction.moveToElement(source);
		myAction.keyDown(Keys.SHIFT);
		myAction.sendKeys(text);
		myAction.keyUp(Keys.SHIFT);
		myAction.build().perform();

	}

}
