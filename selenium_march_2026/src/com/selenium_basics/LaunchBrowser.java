package com.selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	
	public static void main(String[] args) {
		
		
		
		/*
			WebDriver --> It is an interface			
			FirefoxDriver SafariDriver InternetExplorerDriver EdgeDriver OperaDriver ChromeDriver		
		*/
		
		ChromeDriver chrome_driver = new ChromeDriver(); // it will launch the browser
		chrome_driver.get("https://www.google.com"); // it wll navigate to google.com
		//chrome_driver.get("www.google.com");
		//Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument
		
		FirefoxDriver firefox_driver = new FirefoxDriver();
		firefox_driver.get("https://facebook.com/");
		
		EdgeDriver edgeDriver=new EdgeDriver();
		edgeDriver.get("http://youtube.com");
		
		
		//Parent p = new Child();
		
		WebDriver driver=null;
		
		driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
				
		
		driver = new FirefoxDriver();
		driver.get("https://www.teachmint.com/teacher/class/9091707541/study-material");
		
		
		
	}

}
