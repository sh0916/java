package exam3;

public class MallExam {

	public static void main(String[] args) {

		Goods g1 = new Goods();
		Goods g2 = new Goods();
		
		g1.setName("알리오 올리오 파스타");
		g1.setPrice(8000);
		
		g2.setName("로제 치킨 파스타");
		g2.setPrice(9000);
		
		Member m1 = new Member();
		m1.add(g1);
		m1.add(g2);
		m1.add(null);
		m1.print();

	}

}
