package handleselectdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Helper;

public class HandleSelectDropdownWithoutSelectClass {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/open-source/register-to-download");

		driver.manage().window().maximize();
		
		List<WebElement> country = driver.findElements(By.xpath("//select[@name='Country']/option"));		
		
		
		//System.out.println(country.size());
		
//		for(int i=0; i< country.size();i++)
//		{
//			String option =country.get(i).getText();
//			System.out.println(option);
//			if(option.equals("Sudan"))
//			{
//				country.get(i).click();
//				break;
//			}
//		}
		
		Helper.handleSelectDropdown(country, "Romania");
		Helper.handleSelectDropdown(driver.findElements(By.xpath("//select[@name='NoOfEmployees']/option")), "51 - 200");
	}

}
