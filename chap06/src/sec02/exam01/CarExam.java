package sec02.exam01;

public class CarExam {

//		필드는 클레스 안에 들어가있는 변수(전역변수개념)
//	int speed = 0;
//	Car myCar;
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
//		myCar 안에 model 출력
		System.out.println("myCar.model : " + myCar.model);
		String m = myCar.model;
		
		int s = myCar.speed;
		System.out.println("myCar.speed : " + s);

		myCar.speed = 200;
		System.out.println("myCar.speed : " + myCar.speed);
		
		
		Car myCar2 = new Car();
		myCar2.speed = 60;
		System.out.println("myCar.speed : " + myCar.speed);
		System.out.println("myCar.speed2 : " + myCar2.speed);
		
		Car[] car = new Car[3];
		car[0] = new Car();
		
		Car[] car2 = new Car[] {null, new Car(), new Car()};
		
//		괄호앞에는 무조건 메소드가 온다
//		메소드앞에는 리턴타입이 온다
//		괄호안에는 전달인자가 들어간다(매개변수타입 매개변수)
//		리턴타입이 없을경우 void로 설정할수있다
//		void는 리턴값이 없다
//		리턴타입은 하나만 설정이 가능하다
		
	}

}
