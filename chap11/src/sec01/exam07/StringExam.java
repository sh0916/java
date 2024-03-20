package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class StringExam {

	public static void main(String[] args) {
		
		String s1 = "영일이삼사오영일이삼사오";
		
		char c = s1.charAt(3);
		System.out.println("c : " + c);
		
		int idx = s1.indexOf("이삼");
		System.out.println("이삼 idx : " + idx);
		
		// 정확히 일치하는게 없으면 -1
		int idx2 = s1.indexOf("이사");
		System.out.println("이사 idx2 : " + idx2);
		
		String blog = "blog.naver.com";
		String cafe = "cafe.naver.com";
		
		if(blog.indexOf("blog") != -1) {
			
			System.out.println("블로그 주소");
		} else {
			
			System.out.println("블로그가 아니네요");
		}
		
		if(cafe.indexOf("blog") != -1) {
			
			System.out.println("블로그 주소");
		} else {
			
			System.out.println("블로그가 아니네요");
		}
		
		if(blog.startsWith("blog")) {
			
			System.out.println("[blog]로 시작합니다");
		}
		
		if(blog.startsWith("og", 2)) {
			
			System.out.println("[blog]로 시작합니다");
		}
		
		if(blog.endsWith(".com")) {
			
			System.out.println("[.com]로 시작합니다");
		}
		
		// 이메일 점검
		// "@" 하나만 있는지
		// "." 이 하나 이상 있는지
		
		// 첫번째 전달인자를 "모두" 두번째 전달인자로 바꿈
		String s2 = s1.replace("삼사", "34");
		System.out.println("replace 결과 s2 : " + s2);
		
		// 첫번째 인덱스부터 두번째 바로 전까지
		String s3 = s1.substring(1, 4);
		System.out.println("substring 1,4 : " + s3);
		
		String s4 = "콩비,순대,제육,선지";
		String[] menus = s4.split(",");
		
		for(int i = 0; i < menus.length; i++) {
			
			System.out.println("menus : " + menus[i]);
		}
		
		// blog.naver.com
//		String[] urls = blog.split("[.]");
		String[] urls = blog.split("\\.");
		for(int i = 0; i < urls.length; i++) {
			
			System.out.println("urls : " + urls[i]);
		}
		
		// indexOf, substring 사용해서
		// "cafe.naver.com"에서 naver 만 추출
		// "blog.daum.net"에서 daum 만 추출
		
		String naver = "cafe.naver.com";
		String daum = "blog.daum.net";
		
		int idxN = naver.indexOf(".");
		String naver2 = naver.substring(idxN + 1);
		int idxN2 = naver2.indexOf(".");
		String naver3 = naver2.substring(0, idxN2);
		
		System.out.println(naver3);
		
		Map map = new HashMap();
		map.put("str", 1);
		int a = (int)map.get("str");
		
		// 제네릭 => 들어갈때 타입을 제한을둔다(70점), 타입을 동적으로 바꾼다(100점)
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("str", 1);
	}

}
