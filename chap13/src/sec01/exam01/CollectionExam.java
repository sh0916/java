package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		
		// isEmpty() => list 안이 비어있으면 true 값이 저장되어 있으면 false
		list.add(1);
		System.out.println(list.isEmpty());

		int a = (int)list.get(0);
		System.out.println(a);
		
		// IndexOutOfBoundsException => 범위를 벗어났다
//		System.out.println(list.get(10));
		
		// 초기화
		list = new ArrayList();
		
		
		Map map = new HashMap();
		map.put("key", "value");
		
		String key = (String)map.get("key");
		
		// 키가 없으면 null
		// 반대로 null 이면
		//		진짜 null 을 넣었거나
		//		키를 put 하지 않았다
		System.out.println(map.get("key3"));
		
		String title;
		String artist;
		String pt;
		String content;
		
		map.put("title", 1);
		map.put("artist", 1);
		map.put("pt", 1);
		map.put("content", 1);
		list.add(map);
	
		Map map2 = new HashMap();
		map2.put("title", 11);
		map2.put("artist", 11);
		map2.put("pt", 11);
		map2.put("content", 11);
		list.add(map2);
		
		// 제네릭은 전달인자, 리턴타입을 동적으로 바꿀수있다
		// 같은 get 메소드여도 전달인자와 리턴타입이 정해진대로 바꿀수있다
		List<String> list2 = new ArrayList<String>();
		list2.add("abcd");
		String a2 = list2.get(0);
		
		Map<String, Integer> map3 = new HashMap<String, Integer>();
		map3.put("a", 1);
		int b2 = map3.get(a);
	}

}
