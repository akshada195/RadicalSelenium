package basic;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSeleniumWithEdge {

	@Test
	public void testcase1() {
		
		System.out.println("Launching browser");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
	}
	

}
