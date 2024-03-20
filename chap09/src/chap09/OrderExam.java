package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {
		
		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		m1.setName("이성현");
		m1.setAge(25);
		
		m2.setName("성현");
		m2.setAge(22);
		
		m3.setName("휴먼");
		m2.setAge(20);
		
		System.out.println( compareMemaberDTO(m1, m2) );;
		
		List<MemberDTO> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
//		OrderBy ob = new OrderBy();
//		OrderBy ob = new OrderBy();		
		// 이름이 없는 클래스를 new 하고
		// 뭔가 클래스명을 적어야 하는 곳에
//		Comparator ob = new Comparator() {
		// interface 명을 적음
		// 단 하나의 인터페이스만 익명구현 객체에 사용할 수 있다
		Comparator<MemberDTO> ob = new Comparator<MemberDTO>() {
			
			@Override
			public int compare(MemberDTO m1, MemberDTO m2) {
				
				// m1 이 앞이면 오름차순 정렬
				// m2 가 앞이면 내림차순 정렬
				return m2.getAge() - m1.getAge();
			}
		};
		// 파괴함수 : 원본을 바꾼다
		Collections.sort(list, ob);
		
		System.out.println(list);
	}
	
	/*
	 * 전달인자 : MemberDTO 2개
	 * 리턴타입 : MemberDTO
	 * 기능 : 둘중에 나이가 큰 MemberDTO 를 돌려줌
	 * 이름 : compareMemaberDTO
	 */
	
	static MemberDTO compareMemaberDTO(MemberDTO m1, MemberDTO m2) {
		
		if(m1.getAge() > m2.getAge()) {
			
			return m1;
		} else if(m1.getAge() > m2.getAge()) {
			
			return m2;
		} else {
			
			System.out.println("나이가 같음");
			return m1;
		}
	}
}
