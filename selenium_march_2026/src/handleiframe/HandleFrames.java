package handleiframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//Exception in thread "main" org.openqa.selenium.NoSuchFrameException: no such frame
		driver.switchTo().frame(0);
		
		driver.close();
	}
}
