package sec03.exam01;

public class CarExam {

	public static void main(String[] args) {
		
		// car와 car2는 같은클래스지만 서로 다른객체이다
//		Car car = new Car();
//		Car car2 = new Car();
//
//		System.out.println("car.gas : " + car.gas);
//		car.gas = 10;
//		System.out.println("car.gas : " + car.gas);
//		System.out.println("car2.gas : " + car2.gas);
		
		// Car생성자가 생성될때 전달인자값이 없으면 
		// 생성이안된다
		Car car = new Car(15);
		Car car2 = new Car(20);
		// 생성자도 오버로딩이 가능하다
		
		System.out.println("car.gas : " + car.gas);
		car.gas = 10;
		System.out.println("car.gas : " + car.gas);
		System.out.println("car2.gas : " + car2.gas);
		
		Car car3 = new Car();
		
	}

}
