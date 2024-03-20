package chap07.sec03.exam02.추상화;

//추상 클래스는 단독으로 사용할 수 없다
//즉, new 할 수 없다
//즉, 부모 전용 클래스이다
//즉, 상속된 이후에나 쓸 수 있다
//final 이나 abstract 는 하나만 쓸 수 있다
public abstract class Animal {

	public String kind;
	String name;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound();
	
}
