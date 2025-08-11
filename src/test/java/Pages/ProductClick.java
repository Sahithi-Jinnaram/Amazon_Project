package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilitiyfiles.Waits;

public class ProductClick {
	 WebDriver driver;  
	 public ProductClick(WebDriver driver) {
	 	this.driver=driver;
	 	 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(xpath="//span[@class='puis-label-popover-default']/span/parent :: span/parent:: a/parent :: span/parent :: div/following-sibling::a" )
     WebElement product; 

@FindBy(css="h1 span[id=\"productTitle\"]") WebElement title;
@FindBy(css="span[class=\"a-price-whole\"]") WebElement price;

public void productclick() {
product.click();
System.out.println("clicked");}
public void product_title_amount_verify() {
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
Waits.Wait();
System.out.println(title.getText());
System.out.println(price.getText());
}

}
