package com.selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigationCommands {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		Navigation navigate = driver.navigate();

		navigate.to("http://www.facebook.com");

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.findElement(By.linkText("Sign up")).click();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		navigate.back();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		navigate.forward();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		navigate.refresh();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		navigate.back();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		navigate.refresh();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		driver.close();

	}

}
