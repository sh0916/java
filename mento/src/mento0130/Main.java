package mento0130;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		숫자 1부터 5까지 출력하는 코드를 반복문을 사용하여 출력하세요.
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
//		숫자 1부터 5까지의 합을 출력하는 코드를 작성해주세요.
		
		int j = 0;
		
		for(int i = 1; i <= 5; i++) {
			j += i;
		}

		System.out.println(j);
		
		System.out.println();
		
//		1부터 10까지의 짝수를 차례대로 출력하는 코드를 작성하려고 합니다. 다음과 같이 출력되도록 작성해주세요
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 != 1) {
				System.out.print(i);
			}
			
		}
		
		System.out.println();
		
//		1부터 10까지의 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램을 작성해보아요
		
		j = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 != 1) {
				j++;
			}
			
		}
		
		System.out.println(j);
		
		System.out.println();
		
//		0보다 큰 두 수를 입력 받은 뒤 둘 중 더 높은 값을 출력하는 프로그램을 작성해보아요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자입력");
		int fir = scan.nextInt();
		
		System.out.println("두번째 숫자입력");
		int sec = scan.nextInt();
		
		if(fir > sec) {
			System.out.println("더큰수 : " + fir);
		} else if(sec > fir) {
			System.out.println("더큰수 : " + sec);
		}
		
//		다음과 같은 배열이 있을 때 반복문을 통해 배열의 값들을 출력하는 코드를 작성해보아요.
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
//		숫자를 입력받고, 이 숫자의 각 자리의 합을 구하는 코드를 작성해보아요.
		
		int result = 0;
		
		System.out.println("숫자입력");
		int num = scan.nextInt();
		
		while(num > 0) {
			
			// 입력받은값을 10나누고 남은값을 result 에 더해서 넣어줌
			result += (num % 10);
			// 입력받은 값을 10으로 나눔
			num /= 10;
			
		}
		
		System.out.println(result);
		
//		2x + 4y = 10 의 모든 해를 구하는 코드를 작성해주세요.
//		단, x와 y는 10 이하의 자연수입니다.
//		결과는 다음과 같이 나옵니다.
		
		for(int x = 1; x <= 10; x++) {
			
			for(int y = 1; y <= 10; y++) {
				
				if(( (2 * x) + (4 * y) ) == 10) {
					System.out.println("x = " + x + ", y = " + y);
				}
			}
		}
		
	}

}
