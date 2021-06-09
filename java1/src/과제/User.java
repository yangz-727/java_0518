package ����;

import java.util.Scanner;

public class User {
	
	Scanner scan  = new Scanner(System.in);
	
	String id;
	String password;
	String name;
	String phone;
	
	//�⺻ ������
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String id, String password, String name, String phone) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		
	}
	
	//ȸ������
	public void addUser() {
		System.out.println("----> ȸ������");
		while(true) {
			int sw=0;
			System.out.print("ID : ");
			String id = scan.next();
			
			for(int i=0;i<EX1.userList.size();i++) {
				User temp = EX1.userList.get(i);
				if(id.equals(temp.id)) {
					System.out.println("----> ������ ���̵� �ֽ��ϴ�");
					sw=1;
				}
			}
			
			if(sw==0) {
				System.out.print("password : ");
				String password = scan.next();
				System.out.print("NAME : ");
				String name = scan.next();
				System.out.print("PHONE : ");
				String phone = scan.next();
			
				User temp = new User(id,password,name,phone);
				
				EX1.userList.add(temp);
				System.out.println("----> ȸ������ �Ϸ�");
				break;
				
			}
			
			
		}
		
	}
	
	//ȸ��Ż��
	public void deleteUser(String id) {
		//�ش� ȸ�� �Խù� ����
		for(int i=0;i<EX1.boardList.size();i++) {
			if(EX1.boardList.get(i).writer.equals(id)) {
				EX1.boardList.remove(i);
			}
		}
		//ȸ�� ����
		for(int i=0;i<EX1.userList.size();i++) {
			if(EX1.userList.get(i).id.equals(id)) {
				EX1.userList.remove(i);
				break;
			}
		}
		System.out.println("----> ȸ��Ż�� �Ϸ�");
	}
	
	public boolean login(String id, String password) {
		for(int i=0; i<EX1.userList.size();i++) {
			User temp = EX1.userList.get(i);
			if(temp.id.equals(id) && temp.password.equals(password)) {
				System.out.println("----> �α��� ����");
				return true;
			}
		}
		System.out.println("----> �α��� ����");
		return false;
	}
	
	public void updateUser(String id) {
		System.out.println("----> ȸ������ ����");
		while(true){
			System.out.println("1.��й�ȣ ���� 2.�̸� ���� 3.��ȭ��ȣ ���� 4.���� ������");
			System.out.print("���� : ");
			int select = scan.nextInt();
			
			if(select==1) {
				for(int i=0;i<EX1.userList.size();i++) {
					if(EX1.userList.get(i).id.equals(id)) {
						System.out.print("PASSWORD : ");
						EX1.userList.get(i).password = scan.next();
						break;
					}
				}
				System.out.println("----> ��й�ȣ ���� �Ϸ�");
			}else if(select == 2) {
				for(int i=0;i<EX1.userList.size();i++) {
					if(EX1.userList.get(i).id.equals(id)) {
						System.out.print("NAME : ");
						EX1.userList.get(i).name = scan.next();
						break;
					}
				}
				System.out.println("----> �̸� ���� �Ϸ�");
			}else if(select == 3) {
				for(int i=0;i<EX1.userList.size();i++) {
					if(EX1.userList.get(i).id.equals(id)) {
						System.out.print("PHONE : ");
						EX1.userList.get(i).phone = scan.next();
						break;
					}
				}
				System.out.println("----> ��ȭ��ȣ ���� �Ϸ�");
			}else {
				break;
			}
		}
	}
	
	
	
}
