package Pages;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitiyfiles.Waits;


public class ProductSearch {
	 WebDriver driver;  
public ProductSearch(WebDriver driver) {
	this.driver=driver;
	 PageFactory.initElements(driver,this);
}
@FindBy(id="twotabsearchtextbox") WebElement search;
//@FindBy(id="nav-search-submit-button") WebElement searchicon;
public void search(String s) throws InterruptedException {
	search.sendKeys(s);
	Waits.Wait();
	search.sendKeys(Keys.ENTER);
	Waits.Wait();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//searchicon.click();
	
}
}
