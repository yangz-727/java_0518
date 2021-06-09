package Day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Day16_01 {

	public static void main(String[] args) {
		
		
		// 컬렉션 프레임워크
			// 1. List 컬렉션 : 순서가 있는 리스트
				// 1. ArrayList 클래스 : 동기화 X, 검색용이
				// 2. Vector 클래스 : 동기화 O
				// 3. LinkedList 클래스 : 삽입/삭제 용이
			
		
			// 2. Set 컬렉션 : 순서가 없는 저장 (중복허용 X)
				// 1.HashSet 클래스
					//Iterator 인터페이스를 이용한 요소 접근1
			
			// 3. Map 컬렉션 : 키, 값 => 한쌍
				//
		
		
		// 1. 선언
		List<User> list = new Vector<>();
		// 인터페이스 : 추상메소드 [ 정의하지 않는 메소드 ] : 클래스 메모리할당 필요
			// 인터페이스는 혼자서 할 수 있는 기능 X
		Vector<String> vector = new Vector<>();
			// < > 제네릭 : 해당 클래스에 클래스 넣기 
		
		// 2. 메소드
		list.add(new User());
		list.add(new User()); // 중복이 허용됨

		list.remove(0);
		System.out.println(list.size());
		
		for(User temp : list) {
			System.out.println(temp);
		}
		
		//Linked
		List<String> list3 = new ArrayList<>();
		List<String> list4 = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // 현재 시간[나노] 메소드
		for(int i=0;i<10000;i++) {
			list3.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("Arraylist 10000개 삽입시 걸린시간 : "+(end-start));
		
		start = System.nanoTime(); // 현재 시간[나노] 메소드
		for(int i=0;i<10000;i++) {
			list4.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 10000개 삽입시 걸린시간 : "+(end-start));
		
		
		//HashSet 클래스
		// 1. 선언
		Set<String> set = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		set.add("java");
		set.add("java");
		set.add("c");
		set.add("database");
		System.out.println("set의 객체수 : "+set.size());
		
		set.remove("c"); // 직접 객체 삭제
		System.out.println("set의 객체수 : "+set.size());
		
		for(String temp : set) {
			System.out.println(temp);
		}
		
		// get 메소드가 없다 ----> Iterator 인터페이스 사용
		Iterator<String> iterator = set.iterator();
		//Iterator : 순서 없는 컬렉션에 모든 객체 순회 인터페이스
			// null 부터 시작 next() 메소드로 다음으로 이동
		
		while(iterator.hasNext()) {
						//.hashNext(); : 다음 요소 확인
			String temp =iterator.next();
			System.out.println(temp);
		}
		
		set.clear();
		
		
		
		
		
		
	}
	
	
	
}
