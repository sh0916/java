package exam1;

public class Mes {
	
//	String product1;
//	String product2;
	

	
	void run(Product product1) {
		String item = product1.getProduct();
		if(item != null) {
			
			System.out.println(item + "생산완료");			
		} else {
//			System.out.println(regi.product1 + "생산완료");
		}
	}
	
	void run(Product product1, Product product2) {
		String item1 = product1.getProduct();
		String item2 = product2.getProduct();
		if(item1 != null && item2 != null) {
			System.out.println(item1 + "생산완료");
			System.out.println(item2 + "생산완료");			
		} else {
//			System.out.println(regi.product1 + "생산완료");
		}
	}
	
//	void run(Product product) {
//		
//		String item = product.getProduct();
//		System.out.println(item);
//	}
	
}
