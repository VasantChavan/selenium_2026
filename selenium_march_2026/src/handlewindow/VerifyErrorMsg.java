package handlewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("submit-btn")).click();
		
		//String expErrorMsg="Email and Password is required";
		
		String actErrorMsg =driver.findElement(By.className("subLink")).getText();
		
		//String actErrorMsg =driver.findElement(By.className("subLink")).getAttribute("innerHTML");
		
		
		//<a class="subLink" href="/signup">New user? Signup</a>
		
//		<h2 class="errorMessage">
//			<img src="/static/media/error.42da342b9327a185fee70168db88f147.svg" alt="error" class="errorIcon">
//			Email and Password is required
//		</h2>
		System.out.println(actErrorMsg);
//		if(expErrorMsg.contains(actErrorMsg))
//		{
//			System.out.println("Matched with expected error msg");
//		}
//		else
//		{
//			System.out.println(actErrorMsg);
//		}
		
		driver.close();
	}

}
