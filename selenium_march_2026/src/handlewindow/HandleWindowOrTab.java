package handlewindow;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowOrTab {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		String parentWIndow = driver.getWindowHandle();
		System.out.println(parentWIndow);
		
		System.out.println(driver.getTitle()+"  :  "+driver.getCurrentUrl());
		
		//driver.switchTo().newWindow(WindowType.TAB); 
		// it will open a new tab/ window with that driver instance will be switched to new tab/window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> winId = driver.getWindowHandles();
		System.out.println(winId.size());
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle()+"  :  "+driver.getCurrentUrl());
		
		driver.close(); // with this driver instance will be lost
		
				
//		System.out.println(driver.getTitle()+"  :  "+driver.getCurrentUrl()); 
//		Exception in thread "main" org.openqa.selenium.NoSuchWindowException: no such window: target window already closed
		
		driver.switchTo().window(parentWIndow);
		
		System.out.println(driver.getTitle()+"  :  "+driver.getCurrentUrl());
		
		driver.close();
	}


	
	// utility method wo switch to correct window
	// utility method to closee all window/ tab opened by driver instance
	// utility method to open newTab or Window at runtime
	// utility method to switch back to parent window
}
