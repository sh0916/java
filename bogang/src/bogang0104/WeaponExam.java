package bogang0104;

public class WeaponExam {

	public static void main(String[] args) {

		// 무기() => 무기를 생성할수 있게 도와주는 생성자
		// 생성자는 클래스를 생성하는데 도움주는 메소드
		Weapon a = new Weapon();
		
		a.setName("몽둥이");
		
		System.out.println(a.getName());
		
		// 부모요소를 자식요소에 extends 를 상속해주었기
		// 때문에 재사용성, 확장성이 올라간다
		Weapon b = new Lan();
		
		b.setName("창");
		
		System.out.println(b.getName());
		
		// 부모요소에 추가해준 것들을 자식요소도
		// 사용할수있다
		b.dura = 1;
		
		b.attack();
		
		Weapon c = new Bow();
		
		c.attack();

	}

}
