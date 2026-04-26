package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnXpath {

	// relative xpath/ partial xpath
	
	//tagnemae[@attributename='atributevalue']
	
	//*[@id="input"]
	//*[@id="gb"]/div[2]/div[3]/div[1]/div/div[1]/a
	//*[@id="gb"]/div[2]/div[3]/div[1]/div/div[2]/a
	
	//* ---> * any tagname
	
	//Complate xpath/ absolute xpath
	/*
		/html/body/ntp-app//div/div[2]/cr-searchbox//div/div/input
	 * 
	 //*[@id="email1"]
	 ////html/body/div/div/div[2]/div/div[2]/form/div/input[1]
	  
	
	 <input name="email1" type="email" placeholder="Enter Email" id="email1">
	  //input[@id='email1']
	  //input[@type='email']
	  //input[@placeholder='Enter Email']
	   //input[@name='email1']
	   */
	  
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		// absolute xpath
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div/input[1]")).sendKeys("admin@email.com");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div/input[2]")).sendKeys("admin@123");		
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div/button")).click();
		
		
		// relative xpath
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");
		
		//<button type="submit" class="submit-btn">Sign in</button>
		//button[@type='submit']
		//button[@class='submit-btn']
		//button[text()='Sign in']
		
	//	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		//div[@class='social-btns']/a
		
//		WebElement link = driver.findElement(By.xpath("//div[@class='social-btns']/a"));
//		link.click();
		//driver.findElement(By.xpath("//div[@class='social-btns']/a")).click();
		
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='social-btns']/a"));
		System.out.println(links.size());
		
//		for (int i = 0; i < links.size(); i++) {
//			
//			String hrefLinksTarget = links.get(i).getAttribute("href");
//			System.out.println(hrefLinksTarget);			
//		}
		
//		for(WebElement ele: links)
//		{
//			String value =ele.getAttribute("href");
//			System.out.println(value);
//		}
		
		links.stream().forEach(e->System.out.println(e.getAttribute("href")));
		
	}
	
}
