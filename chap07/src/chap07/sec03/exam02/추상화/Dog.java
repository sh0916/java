package chap07.sec03.exam02.추상화;

public class Dog extends Animal {
	
	String name;

	Dog() {
		this.kind = "포유류";
	}
	
	Dog(String name) {
		this.name = name;
		super.name = "부모꺼";
	}
	
	@Override
	public void sound() {
		
		System.out.println("멍멍");
		
	}

}
