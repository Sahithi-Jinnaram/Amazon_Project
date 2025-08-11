package tests;
import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.FilteringProducts;
import utilitiyfiles.Waits;

public class FilteringProductsTests {

	@Test
	public void filter() {
		FilteringProducts f=new FilteringProducts(BaseClass.driver);
		System.out.println("Selecting first non sponsored product");
		Waits.Wait();
		f.filtered();
	}
}

