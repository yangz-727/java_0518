package Day10;

public class Student extends People {

	//�ʵ�
	int grade;
	
	
	
	//������
	public Student(String name, int age, int grade) {
		
		//����� �� Ŭ������ ������ = �θ�Ŭ������ ������
		super(name, age);
		this.grade = grade;
		
	}
	
	//�޼ҵ� ������ : �������̵�
	// ��ӹ��� Ŭ������ �޼ҵ带 ������
	@Override
	public void info() {
		System.out.println("�л��� �̸��� "+this.name);
	}
	
	public void stuInfo() {
		System.out.println(this.name);
	}
	
}
