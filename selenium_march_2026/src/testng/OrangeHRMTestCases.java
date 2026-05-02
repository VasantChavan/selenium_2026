package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRMTestCases {

	WebDriver driver = null;

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(@Optional(" CHRome ") String brName,@Optional("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") String appURL) {
		String browserName = brName.toLowerCase().trim();

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println(" Browser is not matched please check with expected browser...");

		}
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void loginTest() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/img")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void logoutTest()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/img")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed());
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
