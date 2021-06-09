package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Day12_06 {
	
	public static void main(String[] args) {
		
		//문제1
			// 1. member 클래스를 생성해서 필드 정의
			// 2. 모든 필드를 private 선언 : 아이디, 비밀번호, 이름
			// 3. 아이디, 비밀번호, 이름 입력받기
			// 4. 객체 생성하여 public 메소드를 통한 저장
			// 5. public 메소드 필드 호출
		
		// 문제2 : 로그인
			// 1. 아이디와 비밀번호를 입력받아 동일한 경우 로그인 성공 출력
			// 2. 동일하지 않는 경우 예외처리 발생시켜 로그인 실패 출력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1회원가입 2로그인");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			if(select == 1) {
				Member member = new Member();
				System.out.println("----> 회원가입");
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
					System.out.println("----> 로그인");
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
				System.out.println("----> 없는 메뉴입니다");
			}
		}
	
	}
}
