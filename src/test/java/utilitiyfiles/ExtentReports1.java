package utilitiyfiles;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
public class ExtentReports1 {
	 private static ExtentReports extent;
	    public static ExtentReports getInstance() {
	        if (extent == null) {
	            String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
	            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
	            sparkReporter.config().setDocumentTitle("Automation Test Report");
	            sparkReporter.config().setReportName("Test Execution Report");
	            extent = new ExtentReports();
	            extent.attachReporter(sparkReporter);
	            extent.setSystemInfo("Tester", "Sahithi");
	            extent.setSystemInfo("Environment", "QA");
	        }
	        return extent;
	    }
}