package handleselectdropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://orangehrm.com/open-source/register-to-download");
		
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.name("Country"));
		
		Select countryDD = new Select(country);
		// Based on index
		
		countryDD.selectByIndex(1);
		
		Thread.sleep(3000);
		
		// Based on visible text
		countryDD.selectByVisibleText("India");
		Thread.sleep(3000);
		
		
		// Based on value
		
		countryDD.selectByValue("Bahrain");
		
		Thread.sleep(3000);
	
		
		countryDD.selectByContainsVisibleText("Darussalam");
		
		Thread.sleep(3000);
		
		List<WebElement> options = countryDD.getOptions();
		
		System.out.println("Total num of countries "+ (options.size()-1));
		
//		for(int i=0; i< options.size(); i++)
//		{
//			String countryName = options.get(i).getText();
//			System.out.println(countryName);
//			if(countryName.equals("Venezuela"))
//			{
//				options.get(i).click();
//				break;
//			}
//		}
		
		
		for( WebElement ele: options)
		{
			String countryName =ele.getText();
			System.out.println(countryName);
			if(countryName.equals("Cameroon"))
			{
				ele.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
