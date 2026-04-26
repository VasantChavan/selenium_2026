package handlealertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		// We will get alert interface object/refer by using alert() method
		// first we need to switch to the alert by using driver instance driver.switchTo().alert() commnads
		//Alert is an interface which defines following 4 methods
		/*	alert.accept() --> it will perform click operation on Ok button on the alert pop up
			alert.dismiss() -->  it will perform click operation on Cancel button on the alert pop up
			alert.getText() --> to fetch alert box text
			alert.sendKeys(String charSeq) --> to perform input operation onto alert text box
			
			if you are switching to the alert and the alert pop up is not present on the web page then you may get runtime exception
			Exception in thread "main" org.openqa.selenium.NoAlertPresentException: no such alert
		
			*/
			
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		//alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Welcome to JS Prompt");
		
		//alert.dismiss();
		
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		driver.quit();
		
	}

}
