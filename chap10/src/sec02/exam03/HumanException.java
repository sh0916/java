package sec02.exam03;

public class HumanException extends Exception {

	HumanException() {
		
		System.out.println("HumanException 생성자 실행");
	}
	// Exception 메세지를 정할수있음
	HumanException(String message) {
		
		super(message);
		System.out.println("String 생성자 실행");
	}
}
