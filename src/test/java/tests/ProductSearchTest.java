package tests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.BaseClass;
import Pages.ProductSearch;

public class ProductSearchTest  {
 @BeforeClass
	public void driverini() {
	 BaseClass.driverinialize();
	}
	
    @Test
	public void search() throws InterruptedException {
		ProductSearch s=new ProductSearch(BaseClass.driver);
		s.search("wireless mouse");
	    
	
	}
}
