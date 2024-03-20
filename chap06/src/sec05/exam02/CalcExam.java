package sec05.exam02;

//import sec05.exam04.singleton.Singleton;
// 다른패키지에 있는 클래스를 위한 임포트선언
// 이패키지안에있는 모든 클래스
// 단 하위패키지는 포함하지 않음
import sec05.exam04.singleton.Singleton;
import sec05.exam04.singleton.SingletonExam;

//단 하위패키지는 포함하지 않음
import sec04.*;
import sec04.exam02.Computer;

public class CalcExam {

	public static void main(String[] args) {
		
		// 다른패키지에 있는 클래스를 불러올때에는
		// 임포트 선언을 해줘야한다
		Singleton s = null;
		SingletonExam se = null;
		
		Computer c = null;
		
		// 패키지의 정보를 직접 적을수있다
		sec04.exam01.Calculator c2 = new sec04.exam01.Calculator();

		System.out.println("Calc.pi : " + Calc.pi);
		Calc.pi = 3.1;
		
		Calc c1 = new Calc();
		c1.a = 20;
		
//		Calc c2 = new Calc();
//		c2.a = 40;
		
		System.out.println("c1.a : " + c1.a);
//		System.out.println("c2.a : " + c2.a);
		
		// static을 사용할경우 직접사용하는게 좋다
		// Calc.pi
		// c1.pi이런식으로 c1을 거쳐갈경우 비효율적이다
		System.out.println("c1.pi : " + c1.pi);
//		System.out.println("c2.pi : " + c2.pi);
//		c2.pi = 3.62;
		System.out.println("c1.pi : " + c1.pi);
//		System.out.println("c2.pi : " + c2.pi);
		
		// plus는 static선언했기때문에 new를 선언하지
		// 않아도 바로 사용가능하다
		int a = Calc.plus(2, 3);
		System.out.println("a : " + a);
		
		test();
		
//		double p = Math.PI;
		
		c1 = new Calc();	// c1에 있던 Calc를 버리고
		// 새로운 Calc를 선언하면 기존에 연결되있던
		// 클래스를 메모리에서 소멸되고 다시 새로운
		// 클래스가 메모리에 잡힌다
		
	}
	// 메인메소드는 static이고
	// 메인메소드 밖에서 선언한것이기 때문에
	// test를 메인안에서 사용하기위해서는
	// test를 static으로 메소드영역에 올리면
	// 사용가능하다
	static void test() {
		System.out.println("테스트");
	}

	
	
}
