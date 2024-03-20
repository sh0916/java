package mento0201;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String s = "자바 프로그래밍";
		System.out.println(s.charAt(3));
		
		// substring();
		
		System.out.println(s.substring(0, 2));
		
		System.out.println(s.length());
		
		
		Scanner scan = new Scanner(System.in);
		
////		1부터 10까지 출력 (while문 사용)
//		
//		int i = 1;
//		while(true) {
//			System.out.print(i);
//			i++;
//			if(i == 10) {
//				break;
//			}
//		}
//		System.out.println();
//		
////		키보드로부터 입력 받은 수가 10보다 작은 때만 계속 숫자를 입력할 수 있는 프로그램을 작성(while문 / do-while문 모두 작성)
//		
//		
//		while(true) {
//			
//			System.out.println("숫자 입력 : ");
//			int j = scan.nextInt();
//			
//			if(j <= 10) {
//				System.out.print(j);
//			} else {
//				System.out.println("입력 종료");
//				break;
//			}
//		}
//		
//		System.out.println("숫자 입력do : ");
//		int z = scan.nextInt();
//		
//		do {
//			System.out.println("숫자 입력do : ");
//			z = scan.nextInt();
//		} while(z <= 10);
//		
//		
//		키보드로부터 1이상의 자연수를 입력받고 입력한 숫자를 누적하여 누적 결과를 출력해 주는 프로그램을 작성 (단, 0을 입력한 경우 프로그램 종료) 
//		int result = 0;
//		int h = scan.nextInt();
//		System.out.println("숫자 입력 : ");
//		
//		while(true) {
//			
//			System.out.println("숫자 입력 : ");
//			h = scan.nextInt();
//			result += h;
//			System.out.println("누적 결과 : " + result);
//			
//			if(h == 0) {
//				System.out.println("입력 종료");
//				break;
//			}
//		}
//		
//		result = 0;
//		System.out.println("do숫자 입력 : ");
//		
//		do {
//			
//
//			System.out.println("do숫자 입력 : ");
//			h = scan.nextInt();
//			result += h;
//			System.out.println("do누적 결과 : " + result);
//
//			
//		} while(h == 0);
		
		
//		키보드로부터 입력한 숫자를 입력한 숫자를 입력받아 홀수와 짝수가 각각 몇 개 입력되었는지 출력 
//		(-1 을 입력한 경우 종료)
		
//		int odd = 0;
//		int even = 0;
//		
//		while(true) {
//			
//			System.out.println("숫자입력 : ");
//			h = scan.nextInt();
//			
//			if(h % 2 == 1) {
//				odd++;
//			} else if(h % 2 == 0) {
//				even++;
//			} else if(h == -1) {
//				System.out.println("짝수 개수 : " + even);
//				System.out.println("홀수 개수 : " + odd);
//				break;
//			}
//			
//		}
		
//		정수 2개를 입력받고 연산자를 선택받으면 해당 연산 결과를 출력 
//		( 연산자는 (+ / -) 중에서만 선택 )

		int result = 0;
		
		while(true) {
			
			System.out.println("정수1 : ");
			int num1 = scan.nextInt();
			
			System.out.println("정수2 : ");
			int num2 = scan.nextInt();
			
			System.out.println("연산자 (+/-) : ");
			String sol = scan.next();
			
			if(sol.equals("+")) {
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				
			} else if(sol.equals("-")) {
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				
			}
			
			System.out.println("다시 실행하시겠습니까? (Y / N)");
			String again = scan.next();
			if(again.equals("Y")) {
				continue;
			} else if(again.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
		
		

	}

}
