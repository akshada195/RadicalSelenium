
// Validate values present in dropdown

package Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateValuesInDropdown {

	@Test
	public void TestCase1() {

		String[] arrayName1 = new String[4];
		arrayName1[0] = "C++";
		arrayName1[1] = "Android";
		arrayName1[2] = "SQL";
		arrayName1[3] = "Java";

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		boolean Result = true;
		WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select allValues = new Select(skill);
		List<WebElement> dropdownValues = allValues.getOptions();

		for (WebElement actualValues : dropdownValues) {
			for (int i = 0; i < arrayName1.length; i++) {
				try {
					if (actualValues.getText().contains(arrayName1[i])) {
						Result = true;
					}
				} catch (Exception e) {
					Result = false;
				}
				Assert.assertTrue(Result, "Matched");
			}
		}
		driver.quit();
	}

}
