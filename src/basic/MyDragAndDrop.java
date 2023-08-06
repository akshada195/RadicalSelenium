package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyDragAndDrop {

	@Test
	public void testcase1() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));

		WebElement target = driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));

		Actions myAction = new Actions(driver);
		myAction.dragAndDrop(source, target).build().perform();

	}

}
