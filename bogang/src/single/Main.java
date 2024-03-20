package single;

public class Main {

	public static void main(String[] args) {

		// 3개의 객체를 생성함
		// 객체는 인스턴스
		// 객체를 생성하는건 인스턴스화
		
		// Spring => 싱글톤
		/**
		 * 1. 메모리 측면의 이점
			  싱글톤 패턴을 사용하게 된다면 
			  한개의 인스턴스만을 고정 
			  메모리 영역에 생성하고 추후 
			  해당 객체를 접근할 때 메모리 낭비를 
			  방지할 수 있다.

		   2. 속도 측면의 이점
			  생성된 인스턴스를 사용할 때는 
			  이미 생성된 인스턴스를 활용하여 
			  속도 측면에 이점이 있다.

		   3. 데이터 공유가 쉽다
			  전역으로 사용하는 인스턴스이기 때문에 
			  다른 여러 클래스에서 데이터를 공유하며 
			  사용할 수 있다. 하지만 동시성 
			  문제가 발생할 수 있어 이 점은 유의하여 
			  설계하여야 한다.
		 */
		
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		
		// 하나의 인스턴스만 생성이된다
		// 두개의 주소값이 동일하다
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		
		// 싱글톤은 여러명이 접속해도
		// 하나의 객체만 공유하여 사용하도록 막는것

	}

}
