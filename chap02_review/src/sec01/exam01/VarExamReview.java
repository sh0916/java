package sec01.exam01;

import java.util.Scanner;

public class VarExamReview {
	public static void main(String[] args) {
		
		byte by1 = 10;
		byte by2 = 20;
//		byte by3 = by1 + by2; 컴파일 에러
		int in1 = by1 + by2;	// => 30
		System.out.println(in1);
		
		char ch1 = 'A';	// 문자가 하나일경우 ''를 쓴다 문자열일경우 ""를 쓴다
		char ch2 = 1;
		int in2 = ch1 + ch2;
		System.out.println(in2);
		System.out.printf("이름 : %1$s , 나이 : %2$d", "홍길동", 24);
		System.out.printf("숫자1 : %1$d, 숫자2 : %2$d, 숫자3 : %3$d", 3, 2, 1);
		System.out.printf("문자1 : %1$s, 문자2 : %2$s, 문자3 : %3$s", "문", "자", "열");
		System.out.println("--");
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		double area = 3.14159 * 10 * 10;	// => 314.159
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넗이:%10.2f \n", 10, area);
		
		
		System.out.println("1.이름");
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		System.out.printf("이름 : %s \n", data);
		
		System.out.println("2.주민번호 앞자리");
		String data2 = scan.nextLine();
		System.out.printf("주민번호 : %s \n", data2);
		
		System.out.println("3.전화번호");		
		String data3 = scan.nextLine();
		System.out.printf("전화번호 : %1$s", data3);
	}
}
