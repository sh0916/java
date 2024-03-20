package sec04.exam01;

public class CalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculator 클래스를 Calculator 타입의 변수에 넣어줌
		Calculator myCalc = new Calculator();	
		
		myCalc.powerOn();	// myCalc안에 powerOn()메소드 실행
		
//		myCalc안에 plus메소드의 전달인자에 값을 넣고 
//		그값을 변수안에 담는다
		int result1 = myCalc.plus(10, 20);
		System.out.println("plus : " + result1);
		
//		선언되어있는 전달인자의 변수명과
//		사용자가 정한 변수명이 다를라도 관계없다
//		값만 이동하기 때문에(stack영역의 값)
		int a = result1;
		int b = 25;
		int result1_1 = myCalc.plus(a, b);	// => 55
		System.out.println("plus : " + result1_1);
		
//		전달인자로 함수를 넣을수있다
//		함수의 결과는 변수로 담을수있고
//		전달인자는 변수를 사용할수있으니까
//		int result1_1 = myCalc.plus(myCalc.plus(a, b), b);
		
//		자바는 문제가생기면 실행이 안되기때문에 신뢰도가높다
//		무결성

		byte x = 10;	// byte가 매개변수로 전달이되어도
		byte y = 4;		// 필드에 매개변수는 int로 정해두었기 때문에
//		java에서는 자동으로 byte < int 형변환을 시켜준다
		double result2 = myCalc.divide(x, y);
		System.out.println("divide : " + result2);
		System.out.println(1);
		
		myCalc.powerOff();
		
//		매개변수를 배열로 줄수가있다
		
	}

}
