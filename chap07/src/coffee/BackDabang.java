package coffee;

public class BackDabang extends Coffee {

	BackDabang(int value) {
		super(value);
	}
	
	@Override
	void order() {
		
		if(this.value > this.money) {
			System.out.println("잔고가 부족합니다.");
		} else {
			System.out.println("빽다방 주문이 완료 되었습니다.");
		}
	}
	
	@Override
	public String toString() {
		String info = "빽다방 커피 최소가격 = " + this.value + " 입금액 = " + this.money;
		return info;
	}
	
}
