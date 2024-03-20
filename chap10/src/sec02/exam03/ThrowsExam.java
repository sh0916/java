package sec02.exam03;

public class ThrowsExam {

	public int getAge() throws Exception {
		
		String strAge = "20a";
		
		int age = Integer.parseInt(strAge);
		
		System.out.println(age);
		return age;
	}
	
	void test() {
		
		System.out.println(1);
		// throw : 예외가 발생되게 만듬
		throw new NumberFormatException();
//		System.out.println(2);
	}
	
	void customException(int i) throws HumanException {
		
		System.out.println("customException 실행 i : " + i);
		
		if(i < 5) {
			
			throw new HumanException("E05");
		} else if(i > 10) {
			
			throw new HumanException("E10");			
		} else {
			
			System.out.println("5이상 10미만으로 정상임");
		}
	}

}
