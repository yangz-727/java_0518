package Day11;

public class Day11_01 {

	// 상속 : 슈퍼클래스(부모)가 서브클래스(자식)에게 메모리 주기
	// 인터페이스 : 메소드를 사용하는데 추상자료형
		//사용 목적 : 여러 클래스들이 동일한 목적하에 메소드를 사용하기 위해
		// 추상 : 메소드를 선언하고 정의하지 않음
		/// ex) 리모콘, 오락실 버튼
			// 1. 추상메소드는 동작에 관련된 메소드를 선언만 정의를 하지않음
			// 2. 추상메소드는 관련되 클래스에서 정의
			
	public static void main(String[] args) {
		Remote  리모컨; //인터페이스 객체 생성	
			// 1. 혼자서 할 수 있는게 없다 => 정의 X
		
		리모컨  = new TV();
		// 2. 인터페이스에 클래스 메모리 할당
		
		리모컨.실행();
		리모컨.사운드설정(5);
		리모컨.종료();
	
		// 2. 리모컨에 작동 클래스 교체
		리모컨 = new Audio(); // 리모컨과 오디오 연결
		리모컨.실행();
		리모컨.사운드설정(6);
		리모컨.종료();
		
		리모컨 = new SmartTV(); // 리모컨과 오디오 연결
		리모컨.실행();
		리모컨.사운드설정(6);
		리모컨.종료();
		
	}
	
}
