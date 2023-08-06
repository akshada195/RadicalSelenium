package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiLanguage {
	
	@Test
	public void TestCase1() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	}

}
