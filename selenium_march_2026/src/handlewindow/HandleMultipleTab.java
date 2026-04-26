package handlewindow;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleTab {
	
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String parentWinID = driver.getWindowHandle();
		System.out.println("Parent window "+parentWinID);
		System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl());
		
	//	driver.findElement(By.xpath("//div[@class='social-btns']/a[2]")).click();
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Meta"));
		
		for(WebElement ele:links)
		{
			ele.click();
		}
		
		
		Set<String> winIds = driver.getWindowHandles();
		for(String win:winIds)
		{
			//System.out.println(win);
			if(!parentWinID.equals(win)) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl());
				driver.close();
			}
		}
		
		//System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl());
		//Exception in thread "main" org.openqa.selenium.NoSuchWindowException: no such window: target window already closed
		
		
		driver.switchTo().window(parentWinID);
		
		System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl());
		driver.close();
		//driver.close();
		
		//driver.quit();
		
	}

}
