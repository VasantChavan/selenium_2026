package capturescreenshots;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Helper;

public class FreeHrmLogin {
	
	public static void main(String[] args) throws WebDriverException, Exception {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();		
		Helper.capturescreen(driver, "orangehrm");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		Helper.capturescreen(driver.findElement(By.className("oxd-form")), "orm_login_form");
		
		
		driver.close();
		
		
	}

}
