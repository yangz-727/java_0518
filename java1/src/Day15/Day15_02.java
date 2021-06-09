package Day15;

import java.util.ArrayList;
import java.util.List;

public class Day15_02 {

	
	public static void main(String[] args) {
		
		// 컬렉션 프레임워크 : 메모리 관리 클래스 집합
			// 컬렉션 : 수집
			// 프레임워크 : 미리 만들어진 프로그램
		
		// 1. List 컬렉션
			// 1. ArrayList
				// 1. 배열과 차이점 : 배열(고정 메모리), ArrayList(가변 메모리)
					// 배열 : int[] 배열명 = new int[10] => 크기가 고정적, 효율성이 떨어짐
				// 2. 인덱스 사용 : 저장 순서 0~(n-1)까지
				// 3. 추가, 삭제시 : 인덱스 자동 변경
		
		// 예1) ArrayList 클래스
			// 1. 선언
			List<String> list = new ArrayList<>(); //인터페이스	
			ArrayList<String> list2 = new ArrayList<String>(); //클래스
			//인터페이스/클래스명 < 리스트에 넣을 클래스명 > 리스트명 = new ArrayList<생략가능>();
			
			// 2. 메소드
				//1. 리스트에 객체 넣기
				list.add("java"); 
				list.add("python"); 
				list.add("database"); 
				list.add("c++"); 
				
				//2. 리스트 객체 호출하기
				System.out.println(list.get(0));
				
				//3. 리스트 객체 삭제
				list.remove(0); // 인덱스가 한칸씩 당겨짐
				System.out.println(list.get(0));
				
				//4. 리스트의 객체수
				System.out.println(list.size());
				
				//5. 반복문 활용1
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
				
				//6. 반복문 활용2
				for(String temp : list) {
					System.out.println(temp);
				}
				
				//7. 객체 모두 삭제
				list.clear();
			
			// 2. Vactor
				// 1. ArrayList와 차이점 : 동기화 지원 여부
				
			// 3. LinkedList
				// 연결 방식의 차이 ()
		
		// 2. Set 컬렉션
		// 3. Map 컬렉션
		
		
		
		
	}
	
	
}
