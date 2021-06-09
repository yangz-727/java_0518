package Day10;

public class Student extends People {

	//필드
	int grade;
	
	
	
	//생성자
	public Student(String name, int age, int grade) {
		
		//상속을 준 클래스의 생성자 = 부모클래스의 생성자
		super(name, age);
		this.grade = grade;
		
	}
	
	//메소드 재정의 : 오버라이드
	// 상속받은 클래스의 메소드를 재정의
	@Override
	public void info() {
		System.out.println("학생의 이름은 "+this.name);
	}
	
	public void stuInfo() {
		System.out.println(this.name);
	}
	
}
