package chap09;

import java.util.Comparator;

public class OrderBy implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		MemberDTO m1 = (MemberDTO)o1;
		MemberDTO m2 = (MemberDTO)o2;
		
		// m1 이 앞이면 오름차순 정렬
		// m2 가 앞이면 내림차순 정렬
		return m2.getAge() - m1.getAge();
	}

}
