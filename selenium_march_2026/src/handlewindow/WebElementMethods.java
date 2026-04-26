package handlewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");		
		driver.manage().window().maximize();
		
//		WebElement sqlCheckBox = driver.findElement(By.xpath("//*[@id='69cbbb5b0901a6c697a08fcc']"));		
//		boolean sqlCheckBoxDisplayedStatus =sqlCheckBox.isDisplayed();		
//		System.out.println(sqlCheckBoxDisplayedStatus);
//		
//		boolean sqlCheckboxEnabledStatus = sqlCheckBox.isEnabled();
//		System.out.println(sqlCheckboxEnabledStatus);
//		
//		boolean sqlCheckBoxSelectedStatus = sqlCheckBox.isSelected();
//		System.out.println(sqlCheckBoxSelectedStatus);
//		
//		if(!sqlCheckBoxSelectedStatus) {
//			sqlCheckBox.click();
//		}
//		
//		sqlCheckBoxSelectedStatus=sqlCheckBox.isSelected();
//		System.out.println(sqlCheckBoxSelectedStatus);
		Thread.sleep(2000);
		
		WebElement signupBtn = driver.findElement(By.className("submit-btn"));
		System.out.println(signupBtn.isDisplayed());
		System.out.println(signupBtn.isEnabled());
		
		
		WebElement maleradioBtn = driver.findElement(By.id("gender1"));
		
		System.out.println(maleradioBtn.isDisplayed());
		System.out.println(maleradioBtn.isEnabled());
		System.out.println(maleradioBtn.isSelected());
		
		driver.findElement(By.id("gender2")).click();
		
		System.out.println(maleradioBtn.isDisplayed());
		System.out.println(maleradioBtn.isEnabled());
		System.out.println(maleradioBtn.isSelected());
		
		//driver.close();
	}

}
