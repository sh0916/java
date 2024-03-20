package sec05.exam04.singleton;

public class SingletonExam {

	public static void main(String[] args) {
	// Singleton은 private을 사용하였기때문에
	// new Singleton 사용이 불가능하다
//		Singleton singleton = new Singleton();
//		Singleton singleton2 = new Singleton();
		
		// Singleton 클래스안에
		// Singleton 타입의 getInstance메소드는
		// static을 주었기때문에 불러올수있다
//		Singleton singleton = Singleton.test();

		// 하지만 이방법은 직접접근으로 null값으로
		// 변경이가능하기때문에 메소드에 넣어둔다
//		Singleton singleton = Singleton.s;
//		singleton = null;

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1 == singleton2);
		// 이둘은 같은객체이다 => true
		
	}

}
