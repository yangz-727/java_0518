package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_01 {

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Member> memberList = new ArrayList<Member>();
	public static void main(String[] args) {
		Member temp = new Member();
		while(true) {
			System.out.println("========= 로그인 =========");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			if(select==1) {
				Member.signup();
			}else if(select==2) {
				System.out.println("----> 로그인");
				
			}else if(select==3) {
				temp.findId();
			}else if(select==4) {
				temp.findPassword();
			}else if(select==5) {
				System.out.println("----> 종료");
				break;
			}else System.out.println("----> 다시 입력해주세요");
		}
		
		
	}
	
	

}
