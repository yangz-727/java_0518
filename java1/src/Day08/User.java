package Day08;

public class User {
	String id;
	String password;
	String name;
	int age;
	
	//������ : ��ü�� �ʱⰪ(��ý�� ������ �� �⺻��)
	
	//�⺻������ : ���� �ڵ� �ۼ����� �ʾƵ� �ڵ����� ������
	public User() {}
	
	// ������2: ���̵� �޴� ������
	public User(String id) {
		this.id = id;
		//�ش� Ŭ������ �ʵ�� �μ��� �ʵ���� �ٸ� ��� this ���� ����
	}
	
	//������3: ��� �ʵ带 �޴� ������
	public User(String id, String password, String name, int age) {
		//this.�ʵ�� : ���� Ŭ�������� ����� �ʵ�
		this.id = id;
		this.password = password;
		this.name=name;
		this.age = age;
	}
	
	//�޼ҵ�(�Լ�)
		//�Լ� : ��[����] ��[����] : ���� �ȿ� ����ִ� �� => �̸� �־�� ��
		//�޼ҵ� : �̸� �ۼ��� �ڵ�
			//1. �ѹ� ���Ǵ� �ڵ� => �޼ҵ� ���� �ʿ� ����
			//2. ��Ȱ��(�ݺ��Ǵ� �ڵ�) => �޼ҵ� ���� ȿ������ ũ��
			//3. ������ �ڵ� ����
			//4. �Ű�����(�μ�)�� ��ȯ�� ����(�޸� ȿ����)
				//1. �μ� : ���� ��(�ڵ�)
				//2. ��ȯ(���ϰ�) : �����ִ� ��(�ڵ�)
			//5. �޼ҵ� {} �ȿ��� ����� ������ ���� �� ����Ǹ� �ʱ�ȭ
				// ���� �����ʹ� ��ȯ�ؼ� ��������
				//return
	
	public void userInfo() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
}
