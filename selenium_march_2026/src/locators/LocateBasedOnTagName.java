package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnTagName {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		int inputTags = driver.findElements(By.tagName("input")).size();
		System.out.println(inputTags);
		//driver.findElement(By.tagName("a")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		// fetch the text of every links on the webpage
		
//		for (int i = 0; i < links.size(); i++) {
//			
//			String linkText = links.get(i).getText();
//			System.out.println(linkText);
//			
//			if(linkText.equals("Forgotten password?"))
//			{
//				links.get(i).click();
//				break;
//			}
//			
//		}
		
//		for(WebElement link:links)
//		{
//			System.out.println(link.getText());
//			
//			if(link.getText().equals("Sign up"))
//			{
//				link.click();
//				break;
//			}
//		}
		
		
		links.stream().forEach(e-> System.out.println(e.getText()));
		System.out.println("Title is :"+driver.getTitle());
		
		
		
		driver.close();
		
		
	}

}
