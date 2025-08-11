package Pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import utilitiyfiles.BrowserTypeCall;
import utilitiyfiles.ConfigFileReader;

public class BaseClass {
	public static WebDriver driver;
	//protected  WebDriver driver;
	public static void driverinialize() {

	ConfigFileReader config = new ConfigFileReader();
	String url=config.getURL();
	String browser=config.getbrowser();
	BrowserTypeCall b=new BrowserTypeCall();
	driver=b.startApp(driver, url, browser);

	}
	public static WebDriver getDriver() {
		return driver;
}
}

