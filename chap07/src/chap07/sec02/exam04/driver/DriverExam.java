package chap07.sec02.exam04.driver;

public class DriverExam {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		
		Vehicle v1 = new Bus();
		Vehicle v2 = new Taxi();

		driver.drive(bus);
		driver.drive(v2);
		
		Taxi t1 = (Taxi)v2;
		
		// v2 는 Taxi 에서 왔기 때문에 Bus 가 될수 없음
		// 문법적으로 문제가 없어서 빨간줄(컴파일 오류)은 없지만
		// 실행할때 예외 발생 : ClassCastException
//		Bus b1 = (Bus)v2;
		
		// 서로 관계가 없기 때문에 불가능하다
//		Bus b1 = (Taxi)v2;
		
	}

}
