package 과제;

import java.util.Scanner;

public class User {
	
	Scanner scan  = new Scanner(System.in);
	
	String id;
	String password;
	String name;
	String phone;
	
	//기본 생성자
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
	
	//회원가입
	public void addUser() {
		System.out.println("----> 회원가입");
		while(true) {
			int sw=0;
			System.out.print("ID : ");
			String id = scan.next();
			
			for(int i=0;i<EX1.userList.size();i++) {
				User temp = EX1.userList.get(i);
				if(id.equals(temp.id)) {
					System.out.println("----> 동일한 아이디가 있습니다");
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
				System.out.println("----> 회원가입 완료");
				break;
				
			}
			
			
		}
		
	}
	
	//회원탈퇴
	public void deleteUser(String id) {
		//해당 회원 게시물 삭제
		for(int i=0;i<EX1.boardList.size();i++) {
			if(EX1.boardList.get(i).writer.equals(id)) {
				EX1.boardList.remove(i);
			}
		}
		//회원 삭제
		for(int i=0;i<EX1.userList.size();i++) {
			if(EX1.userList.get(i).id.equals(id)) {
				EX1.userList.remove(i);
				break;
			}
		}
		System.out.println("----> 회원탈퇴 완료");
	}
	
	public boolean login(String id, String password) {
		for(int i=0; i<EX1.userList.size();i++) {
			User temp = EX1.userList.get(i);
			if(temp.id.equals(id) && temp.password.equals(password)) {
				System.out.println("----> 로그인 성공");
				return true;
			}
		}
		System.out.println("----> 로그인 실패");
		return false;
	}
	
	public void updateUser(String id) {
		System.out.println("----> 회원정보 수정");
		while(true){
			System.out.println("1.비밀번호 변경 2.이름 변경 3.전화번호 변경 4.수정 끝내기");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			
			if(select==1) {
				for(int i=0;i<EX1.userList.size();i++) {
					if(EX1.userList.get(i).id.equals(id)) {
						System.out.print("PASSWORD : ");
						EX1.userList.get(i).password = scan.next();
						break;
					}
				}
				System.out.println("----> 비밀번호 변경 완료");
			}else if(select == 2) {
				for(int i=0;i<EX1.userList.size();i++) {
					if(EX1.userList.get(i).id.equals(id)) {
						System.out.print("NAME : ");
						EX1.userList.get(i).name = scan.next();
						break;
					}
				}
				System.out.println("----> 이름 변경 완료");
			}else if(select == 3) {
				for(int i=0;i<EX1.userList.size();i++) {
					if(EX1.userList.get(i).id.equals(id)) {
						System.out.print("PHONE : ");
						EX1.userList.get(i).phone = scan.next();
						break;
					}
				}
				System.out.println("----> 전화번호 변경 완료");
			}else {
				break;
			}
		}
	}
	
	
	
}
