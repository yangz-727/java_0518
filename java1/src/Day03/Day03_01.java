package Day03;

public class Day03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������
		
		int a = 12;
		int b = 24;
		int c = 45;
		
		System.out.println("���ϱ� : "+(a+b));
		System.out.println("���ϱ� : "+(a-b));
		System.out.println("���ϱ� : "+(a*b));
		System.out.println("������ : "+(c/a));
		System.out.println("������ : "+(c%a));
		
		
		//���Կ�����
		a += 5;
		System.out.println("���Կ����� �� :"+a);
		
		//�񱳿����� ===> t/f
		System.out.println("�ʰ� : "+(a>b));
		System.out.println("�̸� : "+(a<b));
		System.out.println("�̻� : "+(a>=b));
		System.out.println("���� : "+(a<=b));
		System.out.println("���� : "+(a==b));
		System.out.println("�����ʴ� : "+(a!=b));
		
		//��������
		System.out.println("AND : "+(a>b && b>c));
		System.out.println("OR : "+(a>b || b<c));
		
		//����������
		System.out.println("�������� : "+a++); // ������ print ���� ���
		System.out.println("Ȯ�� : "+a);
		System.out.println("�������� : "+(++a));
		
		System.out.println("�������� : "+a--);
		System.out.println("Ȯ�� : "+a);
		System.out.println("�������� : "+(--a));
		
		
		
		
		
	}

}
