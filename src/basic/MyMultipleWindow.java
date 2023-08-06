package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyMultipleWindow {

	@Test
	public void Method1() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		String mainWindowTitle = driver.getTitle();
		System.out.println("Main window " + mainWindowTitle);
		String oneWinHandle = driver.getWindowHandle();
		System.out.println("1st Window handle = " + oneWinHandle);

		driver.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']")).click();
		Thread.sleep(5);
		String secondWinHandle = null;
		Set<String> multiwindSet = driver.getWindowHandles();
		for (String window : multiwindSet) {
			if (!oneWinHandle.equals(window)) {
				System.out.println("This is second window");
				driver.switchTo().window(window);
				secondWinHandle = window;
			}
		}
		String SecondWindowTitle = driver.getTitle();
		System.out.println("Second window title = " + SecondWindowTitle);
		driver.findElement(By.xpath("//label[@for='defenceForce']")).click();
		
		driver.switchTo().window(oneWinHandle);
		driver.findElement(By.xpath("//a[@aria-label='Menu Train']//strong[contains(text(),'TRAINS')]")).click();
		driver.quit();
	}
}
