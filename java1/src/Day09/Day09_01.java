package Day09;

public class Day09_01 {
	
	// 1. 입출력
	// 2. 변수
	// 3. if, for
	// 4. 배열
	
	// 클래스 : 메모리 설계 = 설계
		// 1. 필드 [ 변수 ]
		// 2. 생성자 [ 객체의 초기값 ]
			// 1. 사용이유 :
			// 2. 있을때 없을때 차이첨 :
			// 3. 메소드(함수 - 반복적으로 사용할 미리 작성된 코드)
				// 1. 사용이유 : 
	
	public static void main(String[] args) {
		
		
		//캐릭터 생성
		Character user1 = new Character();
		//new 연산자 : 메모리(heap) 할당, 인턴스 생성, 참조값 리턴
			// 제외 : 자료형, String
		
		// 필드의 값 넣기
		user1.nick = "asdf";
		user1.level = 1;
		user1.hp = 100;
		user1.power = 10;
		
		Character user2 = new Character("aaa", 1, 100, 10);
		
		user1.levelUp();
		user2.levelUp();
		user1.attack(10);
		user2.attack(10);
		user1.hp -=user1.damage(10);
		user2.hp -= user2.damage(10);
		System.out.println(user1.hpPrint());
		System.out.println(user2.hpPrint());
	}
}
