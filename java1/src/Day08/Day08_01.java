package Day08;

import java.util.Scanner;

public class Day08_01 {
	
	public static void main(String[] args) {
		
		//Ŭ���� :�������� ������ ���� => ��üȭ
		
		//����1 : ���̵�, ��й�ȣ, ����,���� �Է¹޾� 3���� ȸ��(��ü) �����
			//Ŭ���� ���� �ʵ�(����), �޼ҵ�(�Լ�), ������
			//Ŭ���� ������� ��ü ����
		
			//���� ���
				//1. ���ٿ����� ��ü.�ʵ��
				//2. new Ŭ������() : ������ ���
		
		User[] user = new User[3];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<user.length;i++) {
			user[i] = new User();
			System.out.print("ID : ");
			user[i].id = scan.next();
			System.out.print("Password : ");
			
			user[i].password = scan.next();
			System.out.print("NAME : ");
			user[i].name = scan.next();
			System.out.print("AGE : ");
			user[i].age = scan.nextInt();
			user[i].userInfo();
		}
		
		User user2 = new User("asd");
		user2.password="adsf";
		user2.name = "adf";
		user2.age=30;
		user2.userInfo();
		
		User user3 = new User("asdf","adsf","adsf",40);
		user3.userInfo();
		
		// 
		
		
	}
	
}
