package Shopping;

public class Member {

	String userId;
	String userName;
	
	Basket basket = new Basket();
	
	void choiGoodsName(String goodsName) {
		basket.userBasket.add(goodsName);
	
	}
	
	void choiGoodsValue(int goodsValue) {
				
	}
	
	
}
