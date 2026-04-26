package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnCssSelector {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver(); //new FirefoxDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email1")).sendKeys("admin@email.com");
		driver.findElement(By.cssSelector("#password1")).sendKeys("admin@123");
		
		driver.findElement(By.cssSelector(".submit-btn")).click();
		
		//img[@alt='menu'] --> img[alt='menu']
		driver.findElement(By.cssSelector("img[alt='menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		
		
	}

}
