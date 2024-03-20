package sec05.exam02;

public class Calc {
	// static은 new 선언하지 않아도 가져다 쓸수있다
	// 메소드영역에 올라가있음
	static double pi = 3.14159;
	int a = 10;
	
	// final은 값을 바꾸지못한다
	// 값을 줄수있는건 한번만 가능하다
		
	// 선언만 되어있고 값을 초기화 하지않은경우
	// 생성자에서 딱한번 값을 초기화할수있다
	final int d;
	
	
	Calc() {
		this.a = 20;
		
		this.d = 300;
	}
	
	static int plus(int x, int y) {
		// static은 new로 생성하지않아도 사용가능하지만
		// 필드변수인 a는 new로 생성한후에 메모리에
		// 올라가기때문에 static 안에서는 사용이가능하다
//		this.a =20;
//		x += (int)pi;
		// 하지만 pi는 같은 static타입이기 때문에
		// 메소드영역에 올라가있기때문에
		// 함께 사용이 가능하다
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	
	
	// 원의 둘레 : 2 * 파이 * 반
	double circle(int r) {
		// circle은 new로 생성된후 사용이 가능하기 때문에
		// pi가 메소드영역에 먼저 올라가있어서
		// 사용하는데 문제가없다
		
		int[] a = new int[3];
//		a.length = 4;
//		length는 파이널필드기 때문에 값을 변경할수 없다
				
		
		return 2 * r * pi;
	}
	
	// static은 static만 가져다 쓸수있지만
	// new로 생성된뒤 올라오는 타입은
	// static을 가져다 쓸수없다
	// 이유는 static은 먼저 메소드영역에 올라가기 때문에
	// 생성되기전에 존재하지 않는것은 메소드 영역에
	// 올릴수없기 때문
	
	// static은 java가 시작되고 생성이되고
	// java가 종료할때 사라진다
	
}
