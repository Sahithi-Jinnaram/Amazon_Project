package tests;

import org.testng.annotations.Test;

import Pages.AddtoCart;
import Pages.BaseClass;

public class AddtoCartTest {
	@Test
public void add() throws InterruptedException {
	AddtoCart a=new AddtoCart(BaseClass.driver);
	a.add();
	System.out.println("Product added successfully to cart");
} 
}
