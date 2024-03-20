package developer;

public class Main {

	public static void main(String[] args) {
		
		Survey sur = new Survey();
		
		
		Developer junior = new Junior();
//		sur.survey(junior);
		Developer senior = new Senior();
//		sur.survey(senior);
		Developer leader = new Leader();
		sur.survey(leader);

	}

}
