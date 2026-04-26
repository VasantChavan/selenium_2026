package capturescreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshotsCapture {
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//form[@class='login-form']"));
		
		File srcFile = ele.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/freelance.jpg");
		
		FileHandler.copy(srcFile, target);
		
		System.out.println("Screenshots captured...");
		
		driver.close();
		
		
	}

}
