package chap07.sec03.exam02.추상화;

public class Cat extends Animal {

	Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		
		System.out.println("야옹");

	}

}
