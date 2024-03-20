package exam1;

import java.util.Scanner;

public class Calc {

	// 필드
	//			숫자 1
	//			숫자 2
	int num1;
	int num2;
	String sign;
	int result;
	
	// 생성자
	//			숫자 1과 2를 받았을 경우에만 생성
	Calc(int num1, String sign, int num2) {
		this.num1 = num1;
		this.sign = sign;
		this.num2 = num2;
		

			
//		System.out.println("덧셈+, 뺄셈-, 곱셈*, 나눗셈/, 나머지%");
//		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();
		
		switch(sign) {
			case "+" :
					plus();
					break;
			case "-" :
					minus();
					break;
			case "*" :
					multi();
					break;
			case "/" :
					division();
					break;
			case "%" :
					remain();
					break;
			default:
					break;
		}
			
			
//			if(input == 1) {
//				plus();
//			} else if(input == 2) {
//				minus();
//			} else if(input == 3) {
//				multi();
//			} else if(input == 4) {
//				division();
//			} else if(input == 5) {
//				remain();
//			} else if(input == 6) {
//				System.out.println("종료");
//				break;
//			}
			
			

		
	}
	
	
	// 메소드
	// - 결과 값만 돌려줌
	//			덧셈
	//			뺄셈
	//			곱셈
	//			나눗셈
	//			나머지
	void plus() {
		this.result = this.num1 + this.num2;
		System.out.println(num1 + " + " + num2 + " = " + this.result);
	}
	
	void minus() {
		this.result = this.num1 - this.num2;
		System.out.println(num1 + " - " + num2 + " = " + this.result);
	}
	
	void multi() {
		this.result = this.num1 * this.num2;
		System.out.println(num1 + " x " + num2 + " = " + this.result);
	}
	
	void division() {
		this.result = this.num1 / this.num2;
		System.out.println(num1 + " / " + num2 + " = " + this.result);
	}
	
	void remain() {
		this.result = this.num1 % this.num2;
		System.out.println(num1 + " % " + num2 + " = " + this.result);
	}
	
}
