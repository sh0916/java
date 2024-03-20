package exam1;

public class Product {

	private String product;
//	String product2;
	
	
//	Product(String product) {
//		this.product = product;
//	}
	
	String getProduct() {
		return this.product;
	}
	
	void setProduct(String product) {
		if(product != null) {
			this.product = product;
		}
	}
	
//	Product(String product1, String product2) {
//		this.product1 = product1;
//		this.product2 = product2;
//	}
	

	
}
