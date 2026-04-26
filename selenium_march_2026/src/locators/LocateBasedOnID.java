package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnID {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
			
//		driver.get("https://www.google.com/");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.id("APjFqb")).sendKeys("java tutorial from basic");
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email1")).sendKeys("automation@email.com");
		driver.findElement(By.id("password1")).sendKeys("automation@email.com");
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
