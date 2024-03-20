package chap07;

public class Parent {
	
	String name = "Parent 의 name";
	
//	Parent() {
//		System.out.println("부모 생성자 실행");
//	}
	
	Parent(String name) {
		System.out.println("부모 생성자(String name) 실행");
		this.name = name;
	}
	
	String getName() {
		System.out.println("Parent 의 getName 실행");
		return this.name;
	}
	
	int echo() {
		System.out.println("Parent 의 echo 실행");
		return -1;
	}

}
