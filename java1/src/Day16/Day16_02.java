package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day16_02 {

	
	public static void main(String[] args) {
		
		//Map 컬렉션
		//1. HashMap : 동기화 X
			//1. map.put(키,값) 키 값 중복 불가
			//2. map.get(키) => 키에 대응하는 값 호출
		
		//2. HashTable : 동기화 O
		
		
		// 1. 선언
		Map<String, Integer> map = new HashMap<>();
		
		map.put("유재석", 80);
		map.put("강호동", 70);
		map.put("신동엽", 60);
		
		
		System.out.println("map 객체 수 : "+map.size());
		System.out.println("강호동 검색 : "+map.get("강호동"));
		
		map.remove("강호동");
		System.out.println("삭제 후 객체 수 : "+map.size());
		
		for(String key : map.keySet()) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		Set<String> setKey = map.keySet(); // 모든 키 호출 => set에 저장
		Iterator<String> iterator = setKey.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		
		map.clear();
		
		
		//HashTable
		
		Map<String, String> map2 = new Hashtable<>();
		map2.put("qwe", "123");
		map2.put("qwe", "1234");
		map2.put("qwee", "123");
		map2.put("qwe", "123");
		// 키값 중복 허용 X / 값은 중복 허용 O
		System.out.println("객체 수 : "+map2.size());
	
		//Map
		
		Map<String, Integer> map3 = new HashMap<>();
		
		ArrayList<Map<String, Integer>> list = new ArrayList<Map<String,Integer>>();
		list.add(map);
		list.add(map3);
		
		
		
		
	}
	
	
	
}
