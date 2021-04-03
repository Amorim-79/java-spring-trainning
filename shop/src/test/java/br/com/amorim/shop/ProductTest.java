package br.com.amorim.shop;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
		
	Product product = new Product(2, "Tester");
	
	@Test
	public void creatingNewProduct() {	
		Assert.assertEquals(2, product.getId());
		Assert.assertEquals("Tester", product.getUserName());
	}
	
	@Test
	public void changeProductData() {
		product.setId(3);
		product.setUserName("changedTester");
		
		Assert.assertEquals(3, product.getId());
		Assert.assertEquals("changedTester", product.getUserName());
	}
}
