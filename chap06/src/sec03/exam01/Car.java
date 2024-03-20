package sec03.exam01;

public class Car {

	// 필드에 gas의 값선언
	// 필드는 Class전체에서 사용할수있는 변수
	int gas = 0;

	// 기본생성자
	// 전달인자와 실행 내용이 없음
	// 생성자가 없는 경우 자동 생성됨
//	Car(){}
	
	// 리턴타입이 없고 메소드명이 클래스명을 가지는것이
	// 생성자다
	
	
//	Car() {
//		// 필드 초기화
//		// 필드에 있는 값을 변경
//		gas = 5;
//		System.out.println("Car 생성자 실행");
//	}
	
	// 생성자에 전달인자 값을 줄수있다
//	Car(int g) {
//		gas = g;
//		System.out.println("Car(int g) 생성자 실행");
//	}	
	Car() {
		// Car Class 안에 전달인자가 같은 생성자를 호출
		// 생성자를 호출할때에는 맨위에 실행블럭에 있어야한다
		this(7);
		System.out.println("Car 생성자 실행");
	}
	// 생성자에서 다른 생성자(즉 오버로드된 생성자) 호출법
	// 단 생성자의 맨 첫줄에 적어야함
	Car(int gas) {
		// java에서 this는 new가 된 나를(Class) 뜻한다
		// this.gas는 필드에있는 gas를 뜻한다
		this.gas = gas;
		System.out.println("Car(int gas) 생성자 실행");
	}
	
	// 생성자도 오버로딩이 가능하다
	
}
