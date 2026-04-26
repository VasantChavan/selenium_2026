package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasedOnClassName {
	
	public static void main(String[] args) {
		
		// WebElement -- Locators
		/*
		  There are 8 types of locators available in selenium
		  classname
		  name
		  id
		  cssSelector
		  linkText
		  partialLinkText
		  xpath
		  tagName
		 * 
		 * */
		
		// Locate the web element based of classname
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		// to intract with webelemnt in selenium there are 2 methods
		//1. findElement() --> it will 
		//2. findElements()
		
		System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
		
//		driver.findElement(By.className("gLFyf")).sendKeys("Selenium ");
//		driver.findElement(By.className("gb_Z")).click();
//		
//		System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
		
//		driver.get("https://www.facebook.com/");
//		
//		driver.findElement(By.className("classsname")).click();
		
		WebElement googleSearch = driver.findElement(By.className("gLFyf"));
		WebElement gmailLink = driver.findElement(By.className("gb_Z"));
		
		googleSearch.sendKeys("Selenium");
		
		googleSearch.clear();
		
		googleSearch.sendKeys("Playwright with java");
		
		gmailLink.click();
		
		System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
		
		driver.close();
	}

}
