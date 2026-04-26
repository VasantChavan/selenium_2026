package handleiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNestedFrames {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()+" --- "+driver.getCurrentUrl());
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		//driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
		driver.switchTo().frame(0).switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
		driver.switchTo().frame(0).switchTo().frame(2);
		
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().defaultContent();
		
	//	driver.switchTo().frame("frame-bottom");
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.quit();
		
		
		
		
	}

}
