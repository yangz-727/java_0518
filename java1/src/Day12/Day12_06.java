package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Day12_06 {
	
	public static void main(String[] args) {
		
		//����1
			// 1. member Ŭ������ �����ؼ� �ʵ� ����
			// 2. ��� �ʵ带 private ���� : ���̵�, ��й�ȣ, �̸�
			// 3. ���̵�, ��й�ȣ, �̸� �Է¹ޱ�
			// 4. ��ü �����Ͽ� public �޼ҵ带 ���� ����
			// 5. public �޼ҵ� �ʵ� ȣ��
		
		// ����2 : �α���
			// 1. ���̵�� ��й�ȣ�� �Է¹޾� ������ ��� �α��� ���� ���
			// 2. �������� �ʴ� ��� ����ó�� �߻����� �α��� ���� ���
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1ȸ������ 2�α���");
			System.out.print("���� : ");
			int select = scan.nextInt();
			if(select == 1) {
				Member member = new Member();
				System.out.println("----> ȸ������");
				System.out.print("ID : ");
				member.setId(scan.next());
				System.out.print("Password : ");
				member.setPassword(scan.next());
				System.out.print("Name : ");
				member.setName(scan.next());
				
				member.getMember();
				//member.setMember(id, password, name);
			
			}else if(select==2) {
				try {
					System.out.println("----> �α���");
					System.out.print("ID : ");
					String id =scan.next();
					System.out.print("Password : ");
					String password =scan.next();
					Member.login(id, password);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}else {
				System.out.println("----> ���� �޴��Դϴ�");
			}
		}
	
	}
}
