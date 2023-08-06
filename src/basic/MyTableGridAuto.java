package basic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTableGridAuto {
	
	@Test
	public void testcase1() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/mutual-funds/liquid");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String col1 = "Company";
		String col2 = "Returns(%)";
		String col1_Item = "Tata Asset Management Ltd.";
		
		MyTableUtility tableUtility = new MyTableUtility();
		String value1 = tableUtility.getTableCellText(driver, col1, col2, col1_Item);
		Assert.assertEquals("7.06", value1);
		
	}
	

}
