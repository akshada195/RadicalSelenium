package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyIFrame {

	@Test
	public void testcase1() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.xpath("//body[contains(text(), 'Parent frame')]")).getText();
		System.out.println("1st frame " + text);
		
		
		WebElement element = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(element);
//		driver.switchTo().frame(0);
		String text1 = driver.findElement(By.xpath("//p[normalize-space()='Child Iframe']")).getText();
		System.out.println("2nd frame " + text1);
		
		driver.switchTo().parentFrame();
		String text3 = driver.findElement(By.xpath("//body[contains(text(), 'Parent frame')]")).getText();
		System.out.println("again 1st frame " + text3);
		
		
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		
		
		//driver.quit();

	}
}
