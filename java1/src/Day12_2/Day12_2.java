package Day12_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day12_2 {
	
	public static ArrayList<User> userList = new ArrayList<User>();
	// public : ��������, static : �޸� �켱 �Ҵ� [ ���α׷� ����� �ʱ�ȭ ]
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		// ���� Ŭ���� ����
		
		// ���� : ����Ʈ�� ������ ��� ���Ͽ� ���� / ������ �о�ͼ� ����Ʈ�� ����
		
		//���� �ҷ�����
		userList = FileUtill.readFile(new File("c:/java/","users.txt"));
		

		while(true) {
			System.out.println("1ȸ������ 2�α���");
			System.out.print("���� : ");
			int select = scan.nextInt();
			User temp = new User();
			if(select == 1) {
				temp.signup();
			}else if(select == 2) {
				temp.login();
			}else {
				System.out.println("----> ���� �޴��Դϴ�");
			}
			
		}

	}
}
