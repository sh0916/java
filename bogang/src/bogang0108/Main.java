package bogang0108;

import java.util.LinkedList;
import java.util.List;

public class Main {

	/**
	 * 자바는 객체지향 언어 => 실존 사물을 객체로 표현하고자 함
	 * 
	 * 클래스 => 객체
	 * 
	 * 객체지향언어의 4가지 특징
	 * 1. 캡슐화: 정보를 캡슐안에 담아서 은닉화함 => 접근제어자를 통해서 구현
	 * 2. 상속화: extends, implements 부모 자식간의 정보 상속을 할수있음
	 * 3. 추상화: 자식 클래스들의 공통적인 특징을 추출해서 부모 클래스로 만듬
	 * 4. 다형성: 다양한 형상을 가질수있음 => 오버라이딩, 오버로드
	 */
	
	/**
	 * 인터페이스
	 * - 특정 구현을 미리 정의해놓음
	 * - 다중 상속이 가능
	 * - 구현 객체가 같은 동작을 한다는 것을 보장하기 위해 사용하는 것해 초점
	 * 
	 * 추상클래스
	 * - 미리 논리적인 상속 구조를 만들어 놓음
	 * - 단일 상속이 가능
	 * - 클래스 간의 연관 관계를 구축하는 것에 초점
	 */
	public static void main(String[] args) {
		
		iphone a = new iphone();
		
		a.call();
		
		// 부모타입안에있는 아이폰을 생성함
		smartPhone b = new iphone();
		smartPhone c = new galaxy();
		
//		smartPhone b = new smartPhone();	// 추상적인 녀석은 인스턴스 생성불가

		// java 컬렉션
		List<String> list = new LinkedList();
		
	}
	
}


//인터페이스
interface flyTrue {
	
	void fly();

}

interface eatTrue {
	
	void eat();
	
}

// implements 로 상속해온다
class bird implements flyTrue, eatTrue{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

// 원하는 인터페이스만 가져올수있다(다중가능)
class dog implements eatTrue {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}





//추상클래스
abstract class smartPhone {
		
	abstract void call();
	
	abstract void setting();
	
}

// iphone 클래스에는 부모클래스인 smartPhone 의 메소드나 변수값이 상속이된다
class iphone extends smartPhone {

	@Override
	void call() {
		System.out.println("아이폰 전화");
		
	}

	@Override
	void setting() {
		System.out.println("아이폰 설정");
		
	}
	
}

class galaxy extends smartPhone {

	@Override
	void call() {
		System.out.println("갤럭시 전화");
		
	}

	@Override
	void setting() {
		System.out.println("갤럭시 설정");
		
	}
	
}
	

