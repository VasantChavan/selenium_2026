package com.selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverBrowserCommands {
	
	public static void main(String[] args) {
		
		//ChromeDriver driver =new ChromeDriver(); // it will launch the chrome browser
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/"); // navigate to application under test
		
		// maximize or minimize the browser window
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		String title = driver.getTitle();
		System.out.println("Page title is -- > "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current url is -- > "+url);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		
		
		driver.close(); // it will close the browser window
		//driver.quit();
	}

}
