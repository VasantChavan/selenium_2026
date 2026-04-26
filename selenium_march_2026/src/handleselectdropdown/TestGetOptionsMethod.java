package handleselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Helper;

public class TestGetOptionsMethod {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/open-source/register-to-download");

		driver.manage().window().maximize();

		WebElement country = driver.findElement(By.name("Country"));
		
		Helper.getSelectDropdownOptions(country, "Bahamas");
		
		WebElement empDD = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		
		
		Helper.getSelectDropdownOptions(empDD, "51 - 200");
	}

}
