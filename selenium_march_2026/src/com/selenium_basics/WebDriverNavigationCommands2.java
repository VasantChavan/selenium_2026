package com.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigationCommands2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.facebook.com");

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.findElement(By.linkText("Sign up")).click();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.navigate().back();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.navigate().forward();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.navigate().refresh();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.navigate().back();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.navigate().refresh();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.close();

	}

}
