package com.selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CrossBrowserTesting {

	static WebDriver driver;

	static void launchBrowser(String browsername) {
		String brName = browsername.trim().toLowerCase();
		if (brName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (brName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (brName.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("http:www.facebook.com");
	}
	
	public static void main(String[] args) {
		
		launchBrowser(" CHRome ");
		launchBrowser("firefox");
	}
}
