package handleselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Helper;

public class SelectDropdownHandle2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/open-source/register-to-download");

		driver.manage().window().maximize();

		WebElement country = driver.findElement(By.name("Country"));

		Helper.handleSelectDropdown(1, country);
		
		System.out.println(Helper.getSelectedOptions(country));

		Thread.sleep(3000);

		Helper.handleSelectDropdown("Armenia", country);
		System.out.println(Helper.getSelectedOptions(country));

		Thread.sleep(3000);

		Helper.handleSelectDropdown(country,"Algeria");
		Thread.sleep(3000);
		System.out.println(Helper.getSelectedOptions(country));
		
		
		WebElement NoOfEmployees = driver.findElement(By.name("NoOfEmployees"));
		
		Helper.handleSelectDropdown(3, NoOfEmployees);
		System.out.println(Helper.getSelectedOptions(NoOfEmployees));

		Thread.sleep(3000);

		Helper.handleSelectDropdown("200 - 1,000", NoOfEmployees);

		Thread.sleep(3000);
		System.out.println(Helper.getSelectedOptions(NoOfEmployees));

		Helper.handleSelectDropdown(NoOfEmployees,">1,000");
		
		Thread.sleep(3000);
		System.out.println(Helper.getSelectedOptions(NoOfEmployees));

		driver.quit();

	}

}
