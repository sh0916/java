package Shopping;

public class Goods {

	private String goodsName;
	private int goodsValue;
	
	String getGoodsName() {
		return this.goodsName;
	}
	
	void setGoodsName(String goodsName) {
		if(goodsName != null) {
			this.goodsName = goodsName;
		}
	}
	
	int getGoodsValue() {
		return this.goodsValue;
	}
	
	void setGoodsValue(int goodsValue) {
		this.goodsValue = goodsValue;
	}
	
	
	
}
