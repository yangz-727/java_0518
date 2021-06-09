package Day08;

import java.util.Scanner;

public class Day08_01 {
	
	public static void main(String[] args) {
		
		//클래스 :여러개의 변수를 묶음 => 객체화
		
		//예제1 : 아이디, 비밀번호, 성명,나이 입력받아 3명의 회원(객체) 만들기
			//클래스 설계 필드(변수), 메소드(함수), 생성자
			//클래스 기반으로 객체 생성
		
			//내용 담기
				//1. 접근연산자 객체.필드명
				//2. new 클래스명() : 생성자 사용
		
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
