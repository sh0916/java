package mento0215;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 50, 3, 60 };
		
		int sum = 0;
		for(int i = 0; i <= arr.length -1; i++) {
			sum += arr[i];
		}
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (sum / arr.length));
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("변경할 인덱스 번호");
//		int cho = scan.nextInt();
//		arr[cho] = 1000;
//		System.out.println(arr[cho]);
		
		int max = 0;
		for(int i = 0; i <= arr.length -1; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			} else {
				continue;
			}
		}
		System.out.println("최대값 : " + max);
		
		int min = arr[0];
		for(int i = 0; i <= arr.length -1; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			} else {
				continue;
			}
		}
		System.out.println("최소값 : " + min);
		
		int[] ten = new int[10];
		int count = 1;
		for(int i = 0; i <= ten.length -1; i++) {
			
			ten[i] = count;
			count++;
			System.out.print(ten[i] + " ");
		}
		System.out.println();
		
		System.out.println("배열 크기 입력");
		int num = scan.nextInt();
		int[] numArr = new int[num];
		
		count = 1;
		for(int i = 0; i <= numArr.length -1; i++) {
			numArr[i] = count;
			count++;
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		System.out.println("금액 입력");
		int value = scan.nextInt();
		count = 0;
		
		for(int i = 0; i <= unit.length -1; i++) {
			
			int result = value / unit[i];
			value = value % unit[i];
//			System.out.println(result);
//			System.out.println(value);
			System.out.println(unit[i] + "원 짜리 : " + result + "개");
		}
		


	}

}
