package listeners;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import utilitiyfiles.ExtentReports1;
import Pages.BaseClass;
import utilitiyfiles.ScreenshotUtil;

public class testlistener implements ITestListener {
	 private static ExtentReports extent = ExtentReports1.getInstance();
	    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	    @Override
	    public void onTestStart(ITestResult result) {
	        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
	        test.set(extentTest);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.get().log(Status.PASS, "Test Passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	 test.get().log(Status.FAIL, result.getThrowable());
	         try {
	             WebDriver driver = BaseClass.getDriver(); // Ensure BaseClass stores driver in ThreadLocal
	             String screenshotPath = ScreenshotUtil.takeScreenshot(driver, result.getName());
	             test.get().addScreenCaptureFromPath(screenshotPath);
	             System.out.println("Screenshot captured for failed test: "+screenshotPath );
	         } catch (Exception e) {
	             e.printStackTrace();
	         }
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }
	}


