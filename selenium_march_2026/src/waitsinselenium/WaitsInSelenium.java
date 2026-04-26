package waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
		
		//static wait 
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@class='oxd-userdropdown-img'])[1]")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
