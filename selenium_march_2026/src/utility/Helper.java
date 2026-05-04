package utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	
	
	
	
	public static void handleSelectDropdown(int index, WebElement dropdown)
	{
		new Select(dropdown).selectByIndex(index);
	}
	
	public static void handleSelectDropdown(String visibleText, WebElement dropdown)
	{
		new Select(dropdown).selectByVisibleText(visibleText);;
	}
	
	public static void handleSelectDropdown( WebElement dropdown,String value)
	{
		new Select(dropdown).selectByValue(value);
	}
	
	
	
	public static String getSelectedOptions(WebElement dropdown)
	{
		return new Select(dropdown).getFirstSelectedOption().getText();
		
	}
	
	
	public static void getSelectDropdownOptions(WebElement dropdown, String value)
	{
		List<WebElement> options = new Select(dropdown).getOptions();
		System.out.println("Total number of options within the dropdown "+options.size());
		for (WebElement option : options) {
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
	
	public static void handleSelectDropdown(List<WebElement> options, String value) {
		
		System.out.println(options.size());
		for (WebElement option : options) {
			
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
	
	
	public static void capturescreen(WebDriver driver, String screenshotName) throws WebDriverException, IOException
	{
		
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Screenshots/"+screenshotName+".png"));
	}
	
	
	public static void capturescreen(WebElement ele, String screenshotName) throws WebDriverException, IOException
	{
		
		FileHandler.copy(ele.getScreenshotAs(OutputType.FILE), new File("./Screenshots/"+screenshotName+".png"));
	}
	
	
	
	public static void handleAlertPopUp(WebDriver driver)
	{
		if(isAlertPresent(driver)) {
			driver.switchTo().alert().accept();
		}
		
	}
	
	public static boolean isAlertPresent(WebDriver driver)
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			System.out.println(e);
			return false;
		}
	}

}
