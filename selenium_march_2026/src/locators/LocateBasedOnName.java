package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnName {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@1234%");
		
	}

}
