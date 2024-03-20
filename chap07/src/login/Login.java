package login;

// class 앞에 final 을 붙히면 상속이 금지된다
public class Login {

	String id;
	String password;
	
	Login(String id, String password) {
		System.out.println("Login 생성자 실행");
		this.id = id;
		this.password = password;
	}
	
	// method 앞에 final 을 붙히면 Override 가 금지된다
	final void doLogin() {
		System.out.println("로그인 중입니다...");
	}
	
}
