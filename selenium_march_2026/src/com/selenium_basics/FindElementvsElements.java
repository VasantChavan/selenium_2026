package com.selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementvsElements {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement metaLink = driver.findElement(By.partialLinkText("Meta"));
		
		System.out.println(metaLink.getText());
		//metaLink.click();
		
		List<WebElement> metaLinks = driver.findElements(By.partialLinkText("Meta"));
		System.out.println(metaLinks.size());
		
		for (int i = 0; i < metaLinks.size(); i++) {
			
			String linkText=metaLinks.get(i).getText();
			System.out.println(linkText);
			if(linkText.equals("Meta Quest"))
			{
				metaLinks.get(i).click();
				break;
			}
		}
		
		driver.close();
		
	}

}
