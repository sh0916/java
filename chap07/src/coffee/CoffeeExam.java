package coffee;

public class CoffeeExam {

	public static void main(String[] args) {
	
		String ment;
		
		Coffee coffee = new Coffee(2000);
		coffee.input(2000);
		coffee.order();
		ment = coffee.toString();
		System.out.println(ment);
		
		System.out.println("-------------------");
		
		BackDabang backDabang = new BackDabang(3000);
		backDabang.input(3000);
		backDabang.order();
		ment = backDabang.toString();
		System.out.println(ment);
		
		System.out.println("-------------------");
		
		Mega mega = new Mega(4000);
		mega.input(4000);
		mega.order();
		ment = mega.toString();
		System.out.println(ment);
		
		System.out.println("-------------------");
		
		GongCha gongCha = new GongCha(5000);
		gongCha.input(5000);
		gongCha.order();
		ment = gongCha.toString();
		System.out.println(ment);
		
		System.out.println("-------------------");
		
		// 다형성
		System.out.println("---------다형성----------");
		testBack(backDabang);
		testMega(mega);
		
		// 1단계
		System.out.println("---------1단계----------");
		Coffee c = new Coffee(1);
		BackDabang p1 = new BackDabang(1);	
		c = (Coffee)p1;
		
		// 2단계
		System.out.println("---------2단계----------");
		Coffee c1 = (Coffee)new BackDabang(1);
		
		// 3단계
		System.out.println("---------3단계----------");
		Coffee c2 = new BackDabang(1);
		Coffee c3 = new Mega(5000);
		
		System.out.println("-------------------");
		testCoffee(c2);
		System.out.println("-------------------");
		testCoffee(c3);

	}
	
	static void testBack(BackDabang pc) {
		pc.input(20000);
		pc.order();
	}
	
	static void testMega(Mega mc) {
		mc.input(20000);
		mc.order();
	}
	
	static void testCoffee(Coffee c) {
		c.input(2000);
		c.order();
	}

}
