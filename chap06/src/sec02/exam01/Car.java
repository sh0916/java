package sec02.exam01;

import sec01.exam01.Student;

public class Car {

	// 필드
	String model = "그랜저";
	
//	필드는 초기화를 안해 놓아도
//	0, false, null로 자동 초기화 됨
	int speed;
	Student s1 = new Student();
	
	int gas = 0;
	
//	설계작업에서는 선언과 동시에 초기화는 가능하지만 선언후 값을 못넣어준다
//	speed = 60;
	
//	gas의 값이 0이면 false
//	그렇지 않으면 true
	boolean isLeftGas() {
		
//		return gas == 0;	// => true
//		gas의 값이 0이면 true기 때문에
//		아래의 조건문은 위처럼 줄일수있다
		
//		boolean result = false;
//		if(gas == 0) => true
		if(gas == 0) {
//			result = true;
			return false;
		} 
//		else if는 이것의 조건까지
//		아닌조건이 있을수도 있기때문에
//		모두 아닐경우의 값을 정해줘야 한다
//		else if(gas != 0) { 
//			return false; 
//		} 	
//		else {
//			return true;
//		}
//		위처럼 else일경우 return true를 줘도 되지만
//		바로아래처럼 기본값을 true로 줘도된다
		return true;
		
//		else { // result의 기본값이 false이기 때문에
////			result = false;	//	else의 값은 안줘도된다
//			return false;
//		}
		
//		return true;
				
		
	}
	
	// 필드 speed의 값을 10 증가
		void speedUp() {
			speed += 10;
		}
		void speedDown() {
			speed -= 10;
		}
	
}
