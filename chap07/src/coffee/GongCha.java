package coffee;

public class GongCha extends Coffee {

	GongCha(int value) {
		super(value);
	}
	
	@Override
	void order() {
		
		if(this.value > this.money) {
			System.out.println("잔고가 부족합니다.");
		} else {
			System.out.println("공차 커피 주문이 완료 되었습니다.");
		}
	}
	
	@Override
	public String toString() {
		String info = "공차 커피 최소가격 = " + this.value + " 입금액 = " + this.money;
		return info;
	}
	
}
