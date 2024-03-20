package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;	// 선언부	
		score = 90;	// 할당
		
//		int value = 30;	// 선언과 동시에 초기화
		
//		int value;	value값에 아무런 값이 없기때문에
//		int result = value + 10;	 더할수가없어 오류가난다
		
		int var1 = 10;
		
		{
			int var2 = 20;
			System.out.println("var1 :" + var1);
			System.out.println("var2 :" + var2);
		}
//		System.out.println("var2 :" + var2);	var2변수가 선언되어있는 영역을 벗어난후
//												실행이 되었기때문에 오류가난다 (전역,지역변수)
		
		// 정수타입변수
//		byte b = 127;	// byte = -128 ~ 127 까지 담을수있다
		
		long balance = 3000000000L;	// long은 끝에 L을 써줘야 한다
									// Java는 숫자를 그냥쓰면 int라 생각한다
									// 소수점은 그냥쓰면 double이라 생각한다
		
		// JAVA에서는 '' = 한자리 "" = 문자열을 뜻한다
		char c1 = 'A'; // char = 아스키코드
		System.out.println(c1);
		c1 += 2;
		System.out.println(c1);
		
		c1 = 97;
		System.out.println(c1);
		
		String s1 = "문\n자";	// \ = 줄바꿈
		System.out.println(s1);
		
		float f = 0.1234567890123456789f;	// float은 끝에 f를 붙여줘야함
		double d = 0.1234567890123456789;
		
		System.out.println("float :" + f);	// float은 정밀도가 소수점 7자리까지 밖에 못한다
		System.out.println("double :" + d);	// double은 정밀도가 소수점 16자리까지 밖에 못한다
		
		boolean stop = true;	// boolean = 참(true)와 거짓(false)를 담을수있다
		boolean state = false;
		
		int a = 10;
		long b = a;	// long b = (long)a; a를 long으로 바꾼다 생략가능
		System.out.println("b : " + b);	// 큰값에 작은값을 넣을때에는 자동타입변환이 가능하다.
		
		int a2 = 10;
		long b2 = 3000000000L;
		a2 = (int)b2;	// 작은값에 큰값을 넣을때에는 자동타입변환이 불가능하다. 
		System.out.println("a2 : " + a2);
		
		// +값
		double d2 = 3.14;	// double은 실수만 담을수있음
		int i2 = (int)d2;	// int는 정수만 담을수있으므로 소수점 제외하고 나머지 값만 담긴다.	
		System.out.println("i2 : " + i2); // => 3
		
		// -값
		d2 = -3.14;	
		i2 = (int)d2;	
		System.out.println("i2 : " + i2); // => -3
		
		int result = 10;
		int count = 4;
		System.out.println(result / count);	// => 2
		
	//	double n = (double)(result / count) / count;	// result / count 는 int값에 담겨있기때문에 
		double n = result / count;	// result / count 는 int값에 담겨있기때문에 
									// 소수점을 담아주는 double에 담아도 2.0 이다
		System.out.println("n1 :" + n);	// => 2.0
		
		double r2 = 10;
		double c2 = 4;
		n = r2 / c2;	// 소수점 / 소수점의 값은 소수점이다
		System.out.println("n2 :" + n);	// => 2.5
		// byte < short < int < long < float < double				// double > int 더블이 인트보다 크다
	//	n = (double)result / c2;	형태가 다른것들끼리 연산을 할때에는 작은값을 큰값과 같은 타입으로 바꿔준다
		n = result / c2;
		System.out.println("n3 :" + n);	// => 2.5
		
		String str = "15";	// 문자 변수안에 문자 "15"를 넣고
//		String str = "한글";	문자를 숫자로 바꿀때 문자안의 담긴게 숫자가아니면 변환불가
		int val = Integer.parseInt(str);	// 그문자를 숫자형태의 15로 변환 "15" => 15
		System.out.println(val + 1);
		
		int ii = 123;	// 123이라는 숫자를 담음
		String s = "" + ii;	// 숫자를 문자로 바꿀때 여러개의 방법중 쉬운 방법
		System.out.print("a");	 
		System.out.print("b");	// System.out.println(); 에서 ln을 빼면 옆으로출력
		
//		System.in.read(); 
//		try {
//			System.out.println("아무키나 입력하세요");
//			int read = System.in.read();
//			System.out.println("read : " + read);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Scanner scanner = new Scanner(System.in); inport scanner 컨트롤 시프트 영어o
		System.out.println("또 아무값이나 넣어주세요");	// console로 입력받을 값을 가져온다
		Scanner scan = new Scanner(System.in);
		String inputData = scan.nextLine();
		System.out.println("inputData :" + inputData);
		
		boolean bb = inputData.equals("abc");	// 문자열비교할때는 equals 사용
		System.out.println(bb);
		
		/*
		 * quiz : 답을 저장할 변수의 타입
		 * 
		 * 1. 내가 운전하는 자동차가 있다	=> boolean car = true;
		 * 2. 우리집에 있는 스마트폰의 개수	=> int phone = 4;
		 * 3. 내 이름	=> String name = "이성현"
		 * 4. 1평은 3.3제곱미터입니다. 5평에 대한 제곱미터의 값 => double wid = (double)5 * 3.3;
		 */
		
		/*
		 * quiz2. 167,234원을 현금으로 출금
		 * 
		 * 5만원, 1만원, 5천원, 1천원, 500원, 100원, 50원, 10원, 1원
		 * 각각의 통화권은 몇개씩 필요한지
		 * 
		 * 5만원 => (167,234 / 50,000 = 3)
		 * 1만원 => (17,234 / 10,000 = 1)
		 * 5천원 => (7,234 / 5,000 = 1)
		 * 1천원 => (2,234 / 1,000 = 2)
		 * 500원 => (2,234 / 500 = 4)
		 * 100원 => (234 / 100 = 2)
		 * 50원  => (34 / 50 = 0)
		 * 10원  => (34 / 10 = 3)
		 * 1원   => (4 / 1 = 4)
		 * 
		 * 이돈이 5만원보다 크면
		 * 5만원을 뺀다
		 * 167234 - 50000
		 * 그 돈이 여전히 5만원 보다 큰가?
		 * 167234 - 50000 - 50000
		 * 이걸 몇번 할수있나 
		 * 결국 이게바로 나누기다
		 * 
		 * (167234 % 50000) % 10000 % 5000 % 1000 % 500 % 100
		 */
		
		int money = 167234;
		int m50000 = (money / 50000);
		money = (money % 50000);
		int m10000 = (money / 10000);
		money = (money % 10000);
		int m5000 = (money / 5000);
		money = (money % 5000);
		int m1000 = (money / 1000);
		money = (money % 1000);
		int m500 = (money / 500);
		money = (money % 500);
		int m100 = (money / 100);
		money = (money % 100);
		int m50 = (money / 50);
		money = (money % 50);
		int m10 = (money / 10);
		money = (money % 10);
		int m1 = (money / 1);
		money = (money % 1);
		System.out.printf("5만원: %1$d 1만원: %2$d 5천원: %3$d 천원: %4$d 오백원: %5$d 백원: %6$d 오십원: %7$d  십원: %8$d 일원: %9$d \n",
						  m50000, m10000, m5000, m1000, m500, m100, m50, m10, m1);
		
		
		/*
		 * quiz3. n분의 1 계산기
		 * 비용 : 50,000원
		 * 인원 : 7명
		 * 단, 내가 조금더 냅니다
		 */
		int money2 = 50000;
		int hum = 7;
		int result2 = money2 / hum;
		int result3 = money2 % hum;
		System.out.println("1인당금액 : " + result2);
		System.out.println("내가낼값 : " + (result2 + result3));
		
		
		
		
		
		
		
		
		
		
		double human1;
		int human2 = 0, human3, human4;
		int soju = 128998;
		int sojuResult = soju / 3;
		int sojuResultn = soju % 3;
		human1 = (sojuResult + sojuResultn);
		human3 = sojuResult;
		human4 = sojuResult;
		
		int food = 211854;
		int foodResult = food / 4;
		int foodResultn = food % 4;
		human1 += foodResult + foodResultn;
		human2 += foodResult;
		human3 += foodResult;
		human4 += foodResult;
		
		int oil = 78115;
		int oilResult = oil / 4;
		int oilResultn = oil % 4;
		human1 += oilResult + oilResultn;
		human2 += oilResult;
		human3 += oilResult;
		human4 += oilResult;
		
		int bad = 195657;
		int badResult = bad / 3;
		int badResultn = bad % 3;
		human1 += badResult + badResultn;
		human2 += badResult;
		human3 += badResult;
		
		System.out.println("1번낼돈 :" + human1);
		System.out.println("2번낼돈 :" + human2);
		System.out.println("3번낼돈 :" + human3);
		System.out.println("4번낼돈 :" + human4);
		
		int oilvalue = 1547;
		double carvalue = 7.1;
		int km1 = 423;
		int km2 = 482;
		int km3 = 541;
		double traval1, traval2, traval3, traval4;
		double busan = ((km1 / carvalue) * oilvalue) / 3;
		traval1 = busan;
		traval2 = busan;
		traval3 = busan;
		
		double wondo = ((km2 / carvalue) * oilvalue) / 4;
		traval1 += wondo;
		traval2 += wondo;
		traval3 += wondo;
		traval4 = wondo;
		
		System.out.println("첫멤버중에 먼저내린 3번:" + traval3);
		
		double hanam = ((km3 / carvalue) * oilvalue) / 3;
		traval1 += hanam;
		traval2 += hanam;
		traval4 += hanam;
		
		System.out.printf("1번: %1$f 2번: %2$f 먼저내린 3번: %3$f 4번: %4$f", traval1, traval2, traval3, traval4);
		
		
		
		
		// 변수에 값을 지정해줄때에는 int 쓰고 중첩으로 선언할수있다
		int i3 = 0;
		int i4 = 10;
		
		int i5 = 1,
			i6 = 8;
		// 무한반복문
//		for(;;) {
//			
//		}
		// 조건은 ,를 이용해서 두개이상을 걸수있다 증감식도 마찬가지다
		for(int i = 0, j = 0; i < 10; i++) {
			
		}
		
//		boolean mData = true;
//		
//		System.out.println("1. 예금 2.출금 3.조회 4.종료");
//		Scanner moneyScan = new Scanner(System.in);
//			
//		while(mData) {
//			String moneyData = moneyScan.nextLine();
//			int moneyData2 = Integer.parseInt(moneyData);
//			if(moneyData2 == 1) {
//				System.out.println("예금 : 10000원");
//			} else if(moneyData2 == 2) {
//				System.out.println("출금 : 5000원");
//			} else if(moneyData2 == 3) {
//				System.out.println("잔액 : 200000원");
//			} else if(moneyData2 == 4) {
//				System.out.println("종료");
//				break;
//			}
//			
//			
//		}
		
		boolean run = true;
		int balace = 0;
		
		Scanner moneyScan2 = new Scanner(System.in);
		
		while(run) {
			System.out.println("1. 예금 2.출금 3.조회 4.종료");
			
			int menu = scan.nextInt();	// nextInt() => 입력된 값을 숫자로 바꿔준다
			if(menu == 1) {
				System.out.println("예금할 금액은 ?");
				int bankMoney = scan.nextInt();
				if(bankMoney <= 1) {
					System.out.println("입금할수있는금액은 1원이상입니다");
				} else {
						balace += bankMoney;
				}
			} else if(menu == 2) {
				System.out.println("출금할 금액은 ?");
				int bankMoney = scan.nextInt();
				if(bankMoney > balace) {
					System.out.println("잔고가 부족합니다");
				} else {
					balace -= bankMoney;
				}
			} else if(menu == 3) {
				System.out.println("잔액 : " + balace);				
			} else if(menu == 4) {
				run = false;				
			} else {
				System.out.println("메뉴를 확인하세요");	
			}
		}
		System.out.println("프로그램 종료");	
		
		// class 안에있는 함수를 method라고 부른다
		
		/*
		 * 스택영역(쌓인것)			힙영역
		 * stack					heap
		 * 
		 * int a = 10
		 * int b = 20
		 * String name(번지수1001) =>		이성현(번지수1001) 
		 * String school(번지수2003) =>	휴먼(번지수2003)
		 * 
		 * String str(번지수300) => "10"(번지수300)
		 * 
		 * 
		 * 스택영역은 원시타입만 기록된다(기본타입)
		 * 숫자타입은 변수와 값이 스택영역에 저장된다
		 * 문자타입은 변수는 스택영역 값은 힙영역으로 번지수와 같이 저장된다
		 * 예( a == str => 10 == 번지수300 와 같다 )
		 * 기본타입에서 == 은 스택영역값을 비교한다
		 * 참조타입에서 == 은 번지수를 비교한다(스택영역의 번지수를 비교)
		 * 
		 * String d = null
		 * null은 참조하는 주소가(번지수) 없는것이다
		 * 
		 * 원시타입은 값이없는경우 사용이 불가능하다
		 */
		
//		System.out.println(); 출력시 엔터가 들어간다
//		System.out.print(); 출력시 엔터가 안들어간다
//		System.out.printf("내 나이는  %d살 입니다", 20); 자바스크립트 빽틱이랑 비슷하다
//		%s(문자) %d(정수) %f(실수)
		
		
	}

}
