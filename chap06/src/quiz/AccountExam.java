package quiz;

public class AccountExam {

	public static void main(String[] args) {
		
		Account acc1 = new Account("3333064375");
		acc1.print();
		
		acc1.in(5000);
		acc1.print();
//		acc1.in(-100);
		
		acc1.out(4000);
		acc1.print();
//		acc1.out(4000);
//		acc1.out(-100);

		acc1.printAccInfo();
		
		Account acc2 = new Account("333306864");
		
		acc2.in(1000000);
		
		acc1.print();
		acc2.print();
		
	}

}
