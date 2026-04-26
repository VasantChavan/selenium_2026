package handlealertpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Helper;

public class HandleAlertPopUp2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Helper.handleAlertPopUp(driver);

		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Helper.handleAlertPopUp(driver);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Helper.handleAlertPopUp(driver);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		driver.quit();

	}

}
