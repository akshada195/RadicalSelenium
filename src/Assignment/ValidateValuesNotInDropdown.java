package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

// // Validate values not present in dropdown
public class ValidateValuesNotInDropdown {

	@Test
	public void TestCase2() {

		String[] arrayName2 = new String[2];
		arrayName2[0] = "SeleniumAutomation";
		arrayName2[1] = "CucumberAutomation";

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		boolean Result = true;
		WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select allValues = new Select(skill);
		List<WebElement> dropdownValues = allValues.getOptions();

		for (WebElement actualValues : dropdownValues) {
			for (int i = 0; i < arrayName2.length; i++) {
				try {
					if (actualValues.getText().contains(arrayName2[i])) {
						Result = false;
					}
				} catch (Exception e) {
					Result = true;
				}
				Assert.assertTrue(Result, "Matched");
			}
		}
		driver.quit();
			}
		

	}

