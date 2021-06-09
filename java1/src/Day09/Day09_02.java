package Day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day09_02 {
	
	/*
	 * Ŭ���� ���� => ��ü ���� => ��ü ����[DB, ����, �÷���, �迭�� ��] => CRUD
	 * 1. ȸ�� ���� : ���̵�[�ĺ���] ��й�ȣ �̸� �ּ�, 
	 * 				������: ����
	 * 				�޼ҵ� : ȸ������, �α���, ���̵� ã��, ��й�ȣ ã��, �� �������, ȸ������ ��
	 * 
	 * 2. ���� ���� : ISBN[�ĺ���], ������, ����, �뿩����
	 * 				������ : ����
	 * 				�޼ҵ� : �������, ��������, �������, ��������, �뿩, �ݳ� ��
	 * 
	 * 3. �α��� ������ �޴�
	 * 		�������, ��������, �뿩, �ݳ�, ����������, ȸ������ ����
	 * 
	 * 4. �����ڸ޴� ���̵� => admin �̸� �޼ҵ� ���� ���
	 * 		1. ���� ��� 2.�μ����� 3.�������� 4.ȸ�����
	 * 
	 */
	
	//��ü ���� �÷��� => List �÷���
	public static ArrayList<User> userList = new ArrayList<User>();
	public static ArrayList<Book> bookList = new ArrayList<Book>();
	public static Scanner scan = new Scanner(System.in);
	
	//���� ������ �޼ҵ�
	public static void main(String[] args) {
		//���� ���� ���α׷�
		//���α׷� ����
		run();
	}

	
	//�޼ҵ�
	//main�� ���� ����Ǳ� ������ static ���
	//static : �޸𸮿� ���������� �켱 �Ҵ�Ǿ�, ���α׷��� ����� �� �����Ǵ� ���� ( main �޼ҵ� ������ �켱�Ҵ�)
	// => ��ü ���α׷� ����� �ʱ�ȭ
	//static�� �ʹ� ���� ����ϸ� �޸� ��뷮 ����]
	// ��ü ���α׷��� ����, ���Ǵ� ����/�޼ҵ忡 �Ҵ�
	
	public static void run() {
		while(true) {
			System.out.println("======= ���� ���� ���α׷� =======");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����");
			System.out.print("���� : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				User temp = new User(); //�ӽ� ��ü
				temp.addUser();
			}else if(select == 2) {
				User temp = new User(); //�ӽ� ��ü
				temp.login();
				
			}else if(select ==3) {
				User temp = new User(); //�ӽ� ��ü
				temp.findId();
			}else if(select == 4){
				User temp = new User(); //�ӽ� ��ü
				temp.findPassword();
			}else if(select == 5){
				System.out.println("----> ���α׷� ����");
				break;
			}else {
				System.out.println("----> �߸��� ��ȣ�Դϴ�.");
			}
			
		}//while
	}//run()
	
}//class


