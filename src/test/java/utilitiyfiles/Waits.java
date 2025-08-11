package utilitiyfiles;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import Pages.BaseClass;

public class Waits {
public static void Wait() {
	WebDriver driver=BaseClass.getDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
}
