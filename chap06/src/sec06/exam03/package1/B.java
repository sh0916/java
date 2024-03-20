package sec06.exam03.package1;


// 클래스의 public은 파일명과 동일한 클래스만 허용된다
//public class D
//같은 패키지에  다른클래스를 생성할수있다	
class D {
		
}


public class B {
	
	A a = null;
	
	int a1 = 0;
	public int a2 = 10;
	private int a3 = 10;
	
	// 생성자
	B() {
		this.a1 = 1;
		this.a2 = 10;
		this.a3 = 100;
		
		test1();
		test2();
		test3();
	}
	public B(int a1) {
		
	}
	private B(String s1) {
		
	}
	
	// 메소드
	void test1() {
		
	}
	public void test2() {
		
	}
	private void test3() {
		
	}
	
}
