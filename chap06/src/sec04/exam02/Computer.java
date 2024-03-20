package sec04.exam02;

public class Computer {
	
	//	"..." : 가변인자, 가변길이 파라메터
	//	int[] values 매개변수 값이 정해지지 않은경우
	//	매개변수를 배열로 처리한다
	
//	int sum2(int[] values)
	int sum2(int ... values) {	// 배열로 매개변수를 받아서
		System.out.println("values" + values);
		
		int sum = 0;
		
//		for(int val : values) {
//			향상된 반복문
//		}
		for(int i = 0; i < values.length; i++) {	// 배열의 크기만큼
			int val = values[i];	// values의[i]번째를 변수에 담아서
			sum += val;	// 값이 0인 변수에 더해준뒤
		}
		return sum;	// 그값을 리턴해준다
		
//		return이 실행되면 메소드가 끝나기때문에
//		return밑에는 실행되지않는다
//		System.out.println(sum);
	}
	
}
