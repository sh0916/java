package exam1;

import java.util.Scanner;

public class CalcExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 계산기를 생성 [10, 20]
		// 연산 테스트 결과 출력
		System.out.println("첫번째 숫자");
		int num1 = scan.nextInt();
		System.out.println("덧셈+, 뺄셈-, 곱셈*, 나눗셈/, 나머지%");
		String sign = scan.next();
		System.out.println("두번째 숫자");
		int num2 = scan.nextInt();
		
		Calc cal1 = new Calc(num1, sign, num2);
		
		// 두번째 계산기를 생성 [10 + 20, 50]
		// 단, 10 + 20은 계산기 1을 사용한 결과만 쓴다
		// 연산 테스트 출력
		int result = cal1.result;
		num2 = 0;
		
		System.out.println("첫번째 숫자 : " + result);
		System.out.println("덧셈+, 뺄셈-, 곱셈*, 나눗셈/, 나머지%");
		sign = scan.next();
		System.out.println("두번째 숫자");
		num2 = scan.nextInt();
		
		Calc cal2 = new Calc(result, sign, num2);

	}

}
