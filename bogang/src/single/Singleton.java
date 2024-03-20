package single;

public class Singleton {
	// Single class 를 외부에서 생성이 불가능하게 
	// 막았기때문에 내부에서 생성을한다
	// private: 외부접근차단
	// static: 미리 메모리에 올려둠
	// final: 뒤에있는 값이 변경이 불가능
	// static 을 이용해 메모리가 할당될때 실행되게 바꿈
	
	// static => 실제 사용이 될때(메모리상에 올라갈때) 할당이 된다
	// => 오직하나만 생성이된다
	// final => 상수로 만들어 줌 => 변경을 못하게 막음
	private static final Singleton INSTANCE = new Singleton();
	
	// 기본생성자를 private 로 외부에서
	// Singleton 클래스의 인스턴스를 만들지못하게 막는다
	private Singleton() {
		
	}
	
	// getter
	// 외부에서 접근이 불가능하기때문에 getter 사용
	// 동시성 문제, 동시에 같은 인스턴스를 접근할때 발생하는 에러
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
}
