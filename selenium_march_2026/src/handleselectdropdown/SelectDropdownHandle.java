package handleselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://orangehrm.com/open-source/register-to-download");
		
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.name("Country"));
		
		Select countryDD = new Select(country);
		
		WebElement beforeSelection = countryDD.getFirstSelectedOption();
		System.out.println(beforeSelection.getText());
		
		
		countryDD.selectByIndex(5);
		
		WebElement afterSelection = countryDD.getFirstSelectedOption();
		System.out.println(afterSelection.getText());
		
		boolean status=countryDD.isMultiple();
		System.out.println(status);		
		
		WebElement NoOfEmployees=driver.findElement(By.name("NoOfEmployees"));
		Select empDD =new Select(NoOfEmployees);
		
		System.out.println(empDD.getFirstSelectedOption().getText());
		
		empDD.selectByIndex(2);
		
		System.out.println(empDD.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
