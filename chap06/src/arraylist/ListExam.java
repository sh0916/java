package arraylist;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		
		// 추가된 순서대로 0부터 시작하는 index 로 자료 관리
		ArrayList list = new ArrayList();
		
		// 추가
		list.add("이성현");
		list.add(1);
		
		// 가져오기
		// 변수에 담기 위해서는 형변환을 해줘야 한다
		// 출력은 상관없다
		String name = (String)list.get(0);
		int num = (int)list.get(1);
		
		// 크기 계산
		// 크기를 int 로 돌려준다
		// 배열의 length 와 비슷하다
		int length = list.size();
		
	}

}
