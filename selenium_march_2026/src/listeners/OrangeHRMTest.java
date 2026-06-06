package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.ExtentReportManager.class)
public class OrangeHRMTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(3000);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyOrangeHrmLogoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed());
	}

	@Test(dependsOnMethods = "verifyOrangeHrmLogoTest")
	public void verifyOrangeHrmUrlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com");
	}

	@Test(dependsOnMethods = "verifyOrangeHrmUrlTest")
	public void verifyOrangeHrmLoginPageTtitleTest() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
}
