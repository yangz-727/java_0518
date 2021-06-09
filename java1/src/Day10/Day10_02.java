package Day10;

import java.util.ArrayList;

public class Day10_02 {
	
	public static void main(String[] args) {
		
		User user1 = new User("asdf1", "asdf");
		
		Vip user2 = new Vip("user2", "asdf", "골드");
		
		Admin  user3 = new Admin("admin","adf","대리");
		
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
		
		//상속 받았을때 리스트
		//* 리스트를 사용시 슈퍼클래스로 선언된 리스트는 서브클래스의 객체를 담을 수 있다.
		//슈퍼클래스로 생성된 리스트는 하위 클래스의 객체를 담을 수 있다
		ArrayList<User>  userList = new ArrayList<User>();
		
		//서브클래스로 생성된 리스트는 슈퍼클래스의 객체를 담을 수 없다
		ArrayList<Vip> vipList = new ArrayList<Vip>();
		
		//서브클래스로 생성된 다른 서브클래스도 담을 수 없다.
		ArrayList<Admin> adminList = new ArrayList<Admin>();
		
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);

		userList.get(0).userInfo();
		userList.get(1).userInfo();
		userList.get(2).userInfo();
		//userList.get(1).grade = "실버"; // 슈퍼클래스는 서브클래스 멤버 사용 X
		
		vipList.add(user2);
		vipList.get(0).userInfo();
		vipList.get(0).grade = "실버";
		
		adminList.add(user3);
		adminList.get(0).userInfo();
		
	}
	
}
