package chap07.sec02.exam01;

public class Exam {

	public static void main(String[] args) {
		
		P3_1 p3_1 = new P3_1();
		
		// 부모 타입으로 형변환 가능
//		P2_1 p2_1 = (P2_1)p3_1;
		// 이 경우 형변환 연산자 생략 가능
		P2_1 p2_1 = p3_1;
		
//		P1 p1 = (P1)p2_1;
		P1 p1 = p2_1;
		p1 = p3_1;
		
		P1 p11 = (P1) ( (P2_1) new P3_1() );
		P1 p12 = new P3_1();
		
		
		//////////////////////////////////////
		
		
		
	}

}
