package handleiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameElement {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
		//{"method":"xpath","selector":"//body[@id='tinymce']"}
		
		/*
		 * If any element appears within the frame then mandatory to switch to that frame to handle that elemet else you may get
		 *  org.openqa.selenium.NoSuchElementException
		 *  
		 *  There are 3 ways to switch to the iframe
		 *  i. By using frame index
		 *  		driver.switchTo().frame(int index)
		 *  ii. By using frame name or id
		 *  		driver.switchTo().frame(String nameorId)
		 *  iii. By using frame web-element
		 *  			driver.switchTo().frame(WebElemet ele)
		 *  
		 *  to switch to the frame we will use driver.switchto()
		 *  
		 *  
		 * */
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		int frameCount =driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of frames on the web page "+frameCount);
		System.out.println(driver.getTitle()+ "--- "+driver.getCurrentUrl());
		
		// by using index
		//driver.switchTo().frame(0);
		
		// By using id or name
		//driver.switchTo().frame("mce_0_ifr");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));
		
		WebElement txtArea = driver.findElement(By.xpath("//body[@id='tinymce']"));
		System.out.println(txtArea.getText());
		
		
	//	driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		
		WebElement elementSeleLink =driver.findElement(By.linkText("Elemental Selenium"));
		System.out.println(elementSeleLink.isDisplayed());
		
		elementSeleLink.click();
		
		System.out.println(driver.getTitle()+ "--- "+driver.getCurrentUrl());
		
		driver.quit();
	}

}
