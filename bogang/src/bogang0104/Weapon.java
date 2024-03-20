package bogang0104;

public class Weapon {

	// 클래스의 필드
	// private 라는 접근 제한자를 추가
	// 외부에서 접근하지 못하게 막아줌
	private String name;
	
	// protected 는 자식요소도 접근할수 있게 해준다
	protected int damage;
	
	private int cri;
	
	int dura;
	
	// getter 로 접근이 제한된 요소에 접근하게 하자
	// 타입이 같아야하고 전달인자가 없어야함
	public String getName() {
		return this.name;
	}
	
	// setter 는 접근이 제한된 요소를 수정할수 있게함
	// void 타입으로 하고 전달인자를 받아야함
	public void setName(String name) {
		this.name = name;
	}
	
	// setter 로 원하는 값을 바꿔주고
	// getter 로 호출된곳에 리턴해줌
	
	public void attack() {
		System.out.println(this.damage + "의 데미지로 공격을 했습니다");
	}
	
}
