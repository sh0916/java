package sec06.exam03.package1;

class A {

	A() {
		// private 이라서 같은 패키지에서도 못쓴다
		// private은 자기 자신의 클래스에서만 사용가능하다
//		B b = new B("b");
		B b = new B();
		
//		b.a3 = 3;
//		b.test3();
	}

	
}
