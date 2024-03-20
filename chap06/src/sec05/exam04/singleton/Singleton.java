package sec05.exam04.singleton;

public class Singleton {
	// static에 올려두고 사용하기위해서
	// 필드에 static변수로 선언해둔다
//	static Singleton s = null;
	// java가 부팅될때 static으로 Singleton 타입의
	// 변수 s 에 new Singleton을 넣어준다
//	static Singleton s = new Singleton();
	
	// final이 붙으면 값을바꿀수 없다
	// 아래에서 final을 사용한 이유는
	// 값을 null로 바꾸지못하게 하기위해서다
	private static final Singleton s = new Singleton();
	
	// private로 선언된것은 이안에 클래스에서만
	// 사용이 가능하다
	private Singleton(){
		
	}
	// Singleton 타입의 getInstance메소드를 만듬
	// static을 붙혀 new로생성을 안해도
	// 사용이 가능하게 만듬
	// 같은클래스 안이기때문에 사용이가능하다
	static Singleton getInstance() {
		// 필드에서 null로 선언되었기때문에
		// 조건문실행
//		if(Singleton.s == null) {
//			// Singleton타입의 s변수에
//			// new Singleton을 넣어준다
//			Singleton.s = new Singleton();			
//		}
		return Singleton.s;
	}
	// 하지만 이방법은 스레드에 위험하다
	// static Singleton getInstance() 이메소드로만
	// 실행이 가능하게한다
}
