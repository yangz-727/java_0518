package Day12;

import Day12_2.Day12_03;

public class Day12_01 {

	public static void main(String[] args) {
		
		
		// 1. 상속 : 
			// 1. 슈퍼클래스의 멤버를 상속받아 그대로 사용 가능 혹은 재정의 가능(오버라이딩)
			// 2. extends 뒤에는 하나의 클래스만 가능하다
			// super.멤버 : 슈퍼클래스 멤버에 접근 
			// @Override : 슈퍼클래스 멤버 재정의
		// 2. 인터페이스 : implements
			// 1. 동일한 목적하에 동일한 메소드[기능]을 처리하기 위해 사용
			// 2. implements 뒤에는 여러개의 인터페이스 가능
			// 특징 : 추상메소드를 선언만 하고 실제 정의는 연결된 클래스에서 정의
		    // @Override : 슈퍼클래스 멤버 재정의
		
		/*
		 * 
		 * 접근제한자 : 필드, 생성자, 메소드가 외부로부터 호출 제한
		 * 	1. 선언시  맨 앞에 작성
		 * 	2. 종류
		 *  - public : 모든 곳에서 접근 가능
		 *  - protected : 동일한 패키지에서 접근 가능, 상속받은 클래스는 다른 패키지 접근 가능
		 *  - default : 동일한 패키지 내에서 접근 가능 (생략시 default)
		 *  - private : 현재 클래스에서만 접근 가능
		 *  
		 */
		
		
		//동일 패키지
		Day12_2 day = new Day12_2();
		day.id = "qee";
		day.se = "남자";
		day.phone = "123548587";
		// day.name = "dsaf";
				
		//다른 패키지
		Day12_03 day3 = new Day12_03();
		day3.id = "adsf";
		day3.se = "여자";
		//day3.phone = "213425";
		//day3.name = "sdfa";
		
		day3.field("ads");
		
		// => public을 제외한 나머지 접근제한자는 다른 패키지에서 접근 불가
		
		
		
	}

}
