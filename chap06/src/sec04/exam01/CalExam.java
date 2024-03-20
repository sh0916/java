package sec04.exam01;

import java.util.Scanner;

public class CalExam {

	public static void main(String[] args) {
		
		Cal calcu = new Cal();
		
		System.out.println("+, -, *, /, %");
		
		Scanner scan = new Scanner(System.in);
		
		String cho = scan.nextLine();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		
		if(cho.equals("+")) {
			
			int result = calcu.plus(num1, num2);
			System.out.println(result);
			
		} else if(cho.equals("-")) {
			
			int result = calcu.minus(num1, num2);
			System.out.println(result);
			
		} else if(cho.equals("*")) {
			
			int result = calcu.multi(num1, num2);
			System.out.println(result);
			
		} else if(cho.equals("/")) {
			
			double result = calcu.divide(num1, num2);
			System.out.println(result);
			
		} else if(cho.equals("%")) {
			
			double result = calcu.remain(num1, num2);
			System.out.println(result);
			
		}
		
		

	}

}
