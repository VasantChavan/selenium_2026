package com.selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//System.out.println(driver.getTitle());
		
		//driver.close();
		
		//driver.findElement(By.partialLinkText("Meta")).click();
		
		//System.out.println(driver.getTitle());
		
	//	driver.close();
		
		List<WebElement> metaLinks = driver.findElements(By.partialLinkText("Meta"));
		for(WebElement metaLink:metaLinks)
		{
			metaLink.click();
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
		//driver.close();
		
		
	}

}
