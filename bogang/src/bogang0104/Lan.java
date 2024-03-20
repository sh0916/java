package bogang0104;

// 자식 Lan 안에 부모 Weapon 안에있는걸 상속해서 가져와줌
public class Lan extends Weapon {

	// 오버라이딩
	// 부모에 있는 메소드를 자식요소에 재정의를 해준다
	// @Override 오버라이딩을 할때 붙혀줘야했지만
	// java 버전업 이후 자동으로 됬다
	public void attack() {
		System.out.println(this.damage + "의 데미지로 창 공격을 했습니다");
	}
	
}
