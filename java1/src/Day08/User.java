package Day08;

public class User {
	String id;
	String password;
	String name;
	int age;
	
	//생성자 : 객체의 초기값(객첵라 생성될 때 기본값)
	
	//기본생성자 : 직접 코드 작성하지 않아도 자동으로 생성됨
	public User() {}
	
	// 생성자2: 아이디만 받는 생성자
	public User(String id) {
		this.id = id;
		//해당 클래스의 필드와 인수의 필드명이 다를 경우 this 생략 가능
	}
	
	//생성자3: 모든 필드를 받는 생성자
	public User(String id, String password, String name, int age) {
		//this.필드명 : 현재 클래스내에 선언된 필드
		this.id = id;
		this.password = password;
		this.name=name;
		this.age = age;
	}
	
	//메소드(함수)
		//함수 : 함[상자] 수[숫자] : 상자 안에 들어있는 수 => 미리 넣어둔 수
		//메소드 : 미리 작성된 코드
			//1. 한번 사용되는 코드 => 메소드 만들 필요 없음
			//2. 재활성(반복되는 코드) => 메소드 만들 효율성이 크다
			//3. 복잡한 코드 묶음
			//4. 매개변수(인수)와 반환값 존재(메모리 효율성)
				//1. 인수 : 들어가는 수(코드)
				//2. 반환(리턴값) : 돌려주는 수(코드)
			//5. 메소드 {} 안에서 선언된 변수느 실행 후 종료되면 초기화
				// 남길 데이터는 반환해서 꺼내오기
				//return
	
	public void userInfo() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
}
