package waitsinselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Helper;

public class ExplicitWaitsInSelenium {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
//		
	//	WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		@Nullable
//		WebElement ele = waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='selenium']"))));
//		
//		if(ele.isDisplayed())
//		{
//			ele.click();
//			
//		}
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		Alert alert = waits.until(ExpectedConditions.alertIsPresent());
//		
//		System.out.println(alert.getText());
//		alert.accept();
		 
		
		}

}
