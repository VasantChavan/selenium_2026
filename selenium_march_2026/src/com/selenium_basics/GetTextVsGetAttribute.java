package com.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {
	
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		
//		WebElement ele =driver.findElement(By.className("xig6vdn"));
//		System.out.println( ele.getText());
//		
//		System.out.println(ele.getAttribute("innerHTML"));
		
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		String text =driver.findElement(By.name("email1")).getText();
		System.out.println(text);
		
		
		
		String attributevalue = driver.findElement(By.name("email1")).getAttribute("placeholder");
		System.out.println(attributevalue);
		
		
		System.out.println(driver.findElement(By.className("submit-btn")).getText());
		System.out.println(driver.findElement(By.className("submit-btn")).getAttribute("innerHTML"));
		
		
		
//		<h2 class="header">Sign In</h2>
//		<input name="email1" type="email" placeholder="Enter Email" id="email1">
//		<input name="password1" type="password" placeholder="Enter Password" id="password1">
//		<button type="submit" class="submit-btn">Sign in</button>
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
