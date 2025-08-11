package tests;

import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.ProductClick;

public class ProductClickTest {
	@Test
public void productselect() {
	ProductClick t=new ProductClick(BaseClass.driver);
	t.productclick();
	t.product_title_amount_verify();

}
}
