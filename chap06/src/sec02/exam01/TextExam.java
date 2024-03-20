package sec02.exam01;

import java.util.Scanner;

public class TextExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		
		
		int num1 = 50;
		int num2 = 30;
		Scanner result = new Scanner(System.in);
		
		System.out.printf("%1$d + %2$d = %3$d \n", num1, num2, test.plus(num1, num2));
		
		System.out.printf("%1$d - %2$d = %3$d \n", num1, num2, test.minus(num1, num2));

		System.out.printf("%1$d * %2$d = %3$d \n", num1, num2, test.multi(num1, num2));

		System.out.println(test.str("he"));
	}

}
