package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnPartialLinkText {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		
//		driver.findElement(By.linkText("Images")).click();
//		
//		System.out.println(driver.getTitle());
		
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		//driver.findElement(By.partialLinkText("Signup")).click();
		driver.findElement(By.partialLinkText("New user")).click();
		
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		//driver.findElement(By.partialLinkText("Already a ")).click();
		driver.findElement(By.partialLinkText("Login")).click();
		
	}

}
