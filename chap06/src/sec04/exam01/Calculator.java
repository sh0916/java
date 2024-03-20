package sec04.exam01;

public class Calculator {

//	메소드
	/*
	 * 전원이 켜졌다는 내용을 출력함
	 * 
	 * 메소드명: powerOn
	 * 전달인자: 없음
	 * 리턴타입: 없음
	 */
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	/**
	 * 전달인자를 받아서
	 * 그두값을 더해준뒤
	 * 더한값을 리턴해준다
	 * 
	 * 메소드명: plus
	 * 전달인자: int, int
	 * 리턴타입: int 두전달인자를 더한값
	 * 
	 * @author: email.gmail.com
	 */
	int plus(int x, int y) {
		int result = x + y;
		System.out.println("int, int");
		return result;
	}
	
//	오버로딩
//	전달인자 타입의 개수와 순서를 다르게해서
//	메소드 명을 동일하게 만들수 있는것
	
//	메소드명을 같게 선언할경우
//	확실한 구분이 필요하다
//	예를들어 리턴타입과 메소드명이 동일하고
//	매개변수로 받는 타입도 동일하다면
//	전달받는 매개변수 값을 하나만 받는등의
//	명확한 차이점이 필요하다
	int plus(int x) {
		int result = x + x;
		return result;
	}
	
//	오버로딩 심화
//	오버로딩의 우선순위는 전달받는 매개변수의
//	타입이 같은것을 우선으로 인식된다
	double plus(double x, double y) {
		double result = x + y;
		System.out.println("double, double");
		return result;
	}
	
	

	
	void join(String name, int age, int a, int b) {
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	void join(String name, int age) {
//		필수요소가 name age일경우 두값만 받아도
//		실행을시킬수있다
		int a = -1;
		int b = -1;
		join(name, age, a, b);
//		그값을 받아서 같은이름의 매개변수를 담아서
//		그메소드를 실행시킬수있다
	}
	

	
	/*
	 * 전달인자를 받아서
	 * 그두값을 더블로 형변환후
	 * 두값을 나눠준뒤
	 * 나눈값을 리턴해준다
	 * 
	 * 메소드명: divide
	 * 전달인자: int, int
	 * 리턴타입: double 두전달인자를 나눈값
	 * double로 하는이유는 소수점까지 나누기 위해서다
	 */
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
//		return
//		return이 필요없을경우 리턴타입을 
//		void를 사용하는데
//		이경우에는 return값을 생략할수있다
//		하지만 필요한경우 return을 사용해 
//		메소드를 종료할수있다
	}
	
}
