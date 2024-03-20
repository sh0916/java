package sec04.exam02;

public class ComputerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com = new Computer();
//		전달인자가 null이면 오류가난다
//		필드 기본값은 0이기 때문에 값이없으면 0이 출력된다
//		배열매개변수기때문에 숫자를 배열형태로 넣어줄수있다
		int[] arr = {1, 2, 3, 4};
//		int result = com.sum2(1, 4);
		int result = com.sum2(arr);		
		System.out.println("result : " + result);
		
	}

}
