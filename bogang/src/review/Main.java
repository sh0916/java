package review;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 2; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.print(i + "x" + j + "=" + i * j + " ");
				
			}
			
			System.out.println();
			
		}
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				
				for(int n = 1; n <= 9; n++) {
					
					System.out.println(i + "x" + j + "x" + n + "x" + "=" + (i * j * n));
					
				}
				
			}
			
		}
		
		// 주사위 2개를 굴려서 나올수 있는 모든 조합
		
		for(int i = 1; i <= 6; i++) {
			
			for(int j = 1; j <= 6; j++) {
				
				if(i + j <= 12) {
					System.out.print("[" + i + "," + j + "]");
					System.out.print(" ");
				}
			}
			
		}
		
		System.out.println();
		
		// 눈금의 합 별로 나올수 있는 조합
		
		int count = 0;
		
		for(int n = 1; n <= 12; n++) {
			
			System.out.println("합이" + n);
			
			for(int i = 1; i <= 6; i++) {
				
				for(int j = 1; j <= 6; j++) {
					
					if(i + j == n) {
						System.out.print("[" + i + "," + j + "]");
						System.out.print(" ");
						
					} else if(i + j > n) {
						
						break;
						
					}				
					
					count++;
					
				}
				
			}
			
			System.out.println();

		}
		System.out.println("총 횟수 : " + count);
		
		System.out.println("--------------------------------------");
		
		// 해쉬맵 사용
		count = 0;
		
		HashMap map = new HashMap();
		

			
		for(int i = 1; i <= 6; i++) {
			
			for(int j = 1; j <= 6; j++) {
				
				int n = i + j;
				
				if(map.get(n) == null) {
					
					ArrayList list = new ArrayList();
					String value = i + "," + j;
					list.add(value);
					
					map.put(n, list);
					
				} else {
					
					ArrayList list = (ArrayList)map.get(n);
					String value = i + "," + j;
					list.add(value);
					
					map.put(n, list);
				}
				
				count++;
				
			}
				
		}
		
		for(int n = 2; n <= 12; n++) {
			System.out.println("합이" + n + ":" + map.get(n));
		}
		System.out.println("총횟수 : " + count);
		

		
		
		
	}

}
