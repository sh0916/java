package mento0213;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i <5; i++) {
			
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0; i <= 5; i++) {
			
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0; i <= 5; i++) {
			
			for(int n = 1; n <= i; n++) {
				System.out.print(" ");
			}
			
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1; i <= 5; i++) {
				
			for(int x = 4; x >= i; x--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1; i <= 5; i++) {
				
			for(int x = 1; x < i; x++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 11 - 2 * i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				System.out.print(i);			
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);			
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------");

		char a = 96;
		int num = 1;
		
		for(int i = 1; i <= 4; i++) {
			
			for(int j = 1; j <= i; j++) {
				a++;
				System.out.print(a);
			}
			
			for(int n = 4; n >= i; n--) {
				System.out.print(num);
				num++;
			}
			
			System.out.println();
			
		}
		
	}

}
