package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilitiyfiles.Waits;

public class FilteringProducts {
	 WebDriver driver;  
public FilteringProducts(WebDriver driver) {
	this.driver=driver;
	 PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//span[@class='puis-label-popover-default']/span")
public List<WebElement> menuItems;



public void filtered() {
	Waits.Wait();
	Iterator<WebElement> i=menuItems.iterator();
	WebElement y=i.next();
	
	if(!(y.getText().equalsIgnoreCase("sponsored"))) {
	System.out.println(y.getText())	;
	
	}
    }
		
}
