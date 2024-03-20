package chap07.sec03.exam02.추상화;

public class AnimalExam {

	public static void main(String[] args) {
		
		//추상 클래스는 단독으로 사용할 수 없다 (new 생성안됨)
//		Animal animal = new Animal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();

	}

}
