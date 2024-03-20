package coffee;

public class Coffee {

	int money = 0;
	int value;
	
	Coffee(int value) {
		this.value = value;
	}
	
	void input(int money) {
		System.out.println(money + "원 입금이 되었습니다.");
		this.money += money;
		System.out.println("현재 잔고 : " + this.money);
	}
	
	void order() {
		
		if(this.value > this.money) {
			System.out.println("잔고가 부족합니다.");
		} else {
			System.out.println("주문이 완료 되었습니다.");
		}
	}
	
	public String toString() {
		String info = "커피 최소가격 = " + this.value + " 입금액 = " + this.money;
		return info;
	}
	
}
