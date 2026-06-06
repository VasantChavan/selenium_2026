package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter extentSparkReporter; // ui of the report
	public ExtentReports extentReports; // populate common info on the report
	public ExtentTest extentTest; // create test case entries in the report and update the status of the test
									// method

	public void onStart(ITestContext context) {

		extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir" + "/reports/myReport.html"));
		extentSparkReporter.config().setDocumentTitle("Automation Report"); // title of the report
		extentSparkReporter.config().setReportName("Functional Testing"); // name of the report
		extentSparkReporter.config().setTheme(Theme.DARK);

		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);

		extentReports.setSystemInfo("Computer Name", "Local host");
		extentReports.setSystemInfo("Environment", "Stage");
		extentReports.setSystemInfo("Tester Name", "Vasant");
		extentReports.setSystemInfo("OS", "Window 11");
		extentReports.setSystemInfo("Browser Name", "Chrome");

	}

	public void onTestSuccess(ITestResult result) {
		extentTest =extentReports.createTest(result.getName()); // create new entry in the report
		extentTest.log(Status.PASS, "Test Case Passed is :"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		extentTest =extentReports.createTest(result.getName()); // create new entry in the report
		extentTest.log(Status.FAIL, "Test Case failed is :"+result.getName());
		extentTest.log(Status.FAIL, "Test Case failed cause is :"+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		extentTest =extentReports.createTest(result.getName()); // create new entry in the report
		extentTest.log(Status.SKIP, "Test Case Skipped is :"+result.getName());
		
	}
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}
}
