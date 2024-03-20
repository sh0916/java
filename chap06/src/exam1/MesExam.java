package exam1;

import java.util.Scanner;

public class MesExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			
			System.out.println("제품 개수 : 1개, 2개");
			int cho = scan.nextInt();
			
			if(cho == 1) {
				
				System.out.println("제품 이름 입력");
				String input = scan.next();
				Product item = new Product();
				item.setProduct(input);
				Mes mes = new Mes();
				mes.run(item);

			} else if(cho == 2) {
				
				System.out.println("첫번째 제품 이름 입력");
				String input1 = scan.next();
				System.out.println("두번째 제품 이름 입력");
				String input2 = scan.next();
				Product item1 = new Product();
				Product item2 = new Product();
				item1.setProduct(input1);
				item2.setProduct(input2);
				Mes mes = new Mes();
				mes.run(item1, item2);

			} else {
				System.out.println("종료");
				break;
			}
			

		}
		

	}

}
