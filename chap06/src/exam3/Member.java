package exam3;

public class Member {

	String id;
	String name;
	
	Cart cart = new Cart();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 내 장바구니의 add 메소드 호출
	void add(Goods goods) {
		
		System.out.println("장바구니 담는중...");
		
		boolean result = this.cart.add(goods);
		
		if(result) {
			System.out.println("담기 성공");
		} else {
			System.out.println("담기 실패");
		}
	}
	
	// 내 장바구니의 print 메소드 호출
	void print() {
		this.cart.print();
	}
	
}
