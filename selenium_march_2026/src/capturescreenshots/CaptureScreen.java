package capturescreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen {

	public static void main(String[] args) throws IOException {

//	//	WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File scrFile = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File("./Screenshots/google1.png");
		
		ChromeDriver driver = new ChromeDriver();
		

		File scrFile = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/google1.png");

		FileHandler.copy(scrFile, target);

		System.out.println("Screenshots captured....");

		driver.close();

	}

}
