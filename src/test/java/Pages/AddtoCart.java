package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilitiyfiles.Waits;

public class AddtoCart {
	WebDriver driver;
	public AddtoCart(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	@FindBy(id="add-to-cart-button") WebElement add;
	@FindBy(xpath="//div/*[text()='Added to cart']") WebElement added;
public void add() {
	Waits.Wait();
	add.click();
	//Assert.assertEquals(added.getText(), "Added to cart");
}
}
