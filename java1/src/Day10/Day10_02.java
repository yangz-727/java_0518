package Day10;

import java.util.ArrayList;

public class Day10_02 {
	
	public static void main(String[] args) {
		
		User user1 = new User("asdf1", "asdf");
		
		Vip user2 = new Vip("user2", "asdf", "���");
		
		Admin  user3 = new Admin("admin","adf","�븮");
		
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
		
		//��� �޾����� ����Ʈ
		//* ����Ʈ�� ���� ����Ŭ������ ����� ����Ʈ�� ����Ŭ������ ��ü�� ���� �� �ִ�.
		//����Ŭ������ ������ ����Ʈ�� ���� Ŭ������ ��ü�� ���� �� �ִ�
		ArrayList<User>  userList = new ArrayList<User>();
		
		//����Ŭ������ ������ ����Ʈ�� ����Ŭ������ ��ü�� ���� �� ����
		ArrayList<Vip> vipList = new ArrayList<Vip>();
		
		//����Ŭ������ ������ �ٸ� ����Ŭ������ ���� �� ����.
		ArrayList<Admin> adminList = new ArrayList<Admin>();
		
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);

		userList.get(0).userInfo();
		userList.get(1).userInfo();
		userList.get(2).userInfo();
		//userList.get(1).grade = "�ǹ�"; // ����Ŭ������ ����Ŭ���� ��� ��� X
		
		vipList.add(user2);
		vipList.get(0).userInfo();
		vipList.get(0).grade = "�ǹ�";
		
		adminList.add(user3);
		adminList.get(0).userInfo();
		
	}
	
}
