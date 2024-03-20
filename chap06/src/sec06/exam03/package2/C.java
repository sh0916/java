package sec06.exam03.package2;

//import sec06.exam03.package1.A;
import sec06.exam03.package1.B;
// public 은 클래스 메소드 생성자 전부다 붙힐수있다
public class C {
	
	// public, default 접근제한자
	// 클래스, 필드, 생성자, 메소드에서 사용가능
	// private 접근제한자
	// 필드, 생성자, 메소드에서 사용가능(클래스에서는 사용못함)

	// A는 default 접근 제한자를 가지므로 다른패키지에서는
	// 사용이 불가능하다
//	A a = null;
	B b = null;
	
	// B는 default 접근 제한자를 가지므로 다른패키지에서는
	// 사용이 불가능하다
//	B b1 = new B();
	// B(int)는 public 접근 제한자를 가지므로 다른패키지에서도
	// 사용이 가능하다
	B b2 = new B(2);
	
	C() {

	// b2.a1은 default 접근 제한자를 가지므로 다른패키지에서는
	// 사용이 불가능하다
//		b2.a1 = 3;
	// b2.a2은 public 접근 제한자를 가지므로 다른패키지에서도
	// 사용이 가능하다
		b2.a2 = 3;
		// private 접근제한자라 사용이불가능하다
//		b2.a3 = 3;
		
//		b2.test1();
		b2.test2();
		// private 접근제한자라 사용이불가능하다
//		b2.test3();
		
	}
	
}
