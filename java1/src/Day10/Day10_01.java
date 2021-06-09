package Day10;

public class Day10_01 {
	
	public static void main(String[] args) {
		
		//상속 : 클래스가 다른 클래스에게 메모리 주기
			// extend : 연장 = 설계 이어하기
				//여러 클래스에 공통멤버를 미리 설계하면 빠른 설계 가능
		
			// 1. 서브클래스 extends 슈퍼클래스
				// 1. 상속은 하나의 클래스로부터 받음
		
			// 2. 서브클래스는 슈퍼클래스 멤버(필드, 메소드, 생성자) 메모리 할당 받음
				// 1. 서브클래스 -> 슈퍼클래스 멤버 사용 가능
				// 2. 슈퍼클래스 -> 서브클래스 멤버 사용 불가
		
			// 3. super() : 슈퍼클래스의 생성자 
		
			// 4. @Override : 슈퍼클래스의 메소드를 재정의
	
	//객체
	 People people1 = new People("유재석",30);
	 Student stu1 = new Student("강호동", 20,3);
	 
	 people1.info();
	 stu1.info();
	 
	 stu1.stuInfo();
	 
	 // 상속 받은 클래스의 객체 만들기
	 
		
		
	} // main

}// class
