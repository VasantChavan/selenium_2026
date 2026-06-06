package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("Test execution started ..."+context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test execution ended ..."+context.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started ..."+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed ..."+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed ..."+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped ..."+result.getName());
	}
}
