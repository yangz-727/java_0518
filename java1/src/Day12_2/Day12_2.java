package Day12_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day12_2 {
	
	public static ArrayList<User> userList = new ArrayList<User>();
	// public : 접근제한, static : 메모리 우선 할당 [ 프로그램 종료시 초기화 ]
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		// 파일 클래스 생성
		
		// 예제 : 리스트에 정보를 담고 파일에 저장 / 파일을 읽어와서 리스트에 저장
		
		//파일 불러오기
		userList = FileUtill.readFile(new File("c:/java/","users.txt"));
		

		while(true) {
			System.out.println("1회원가입 2로그인");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			User temp = new User();
			if(select == 1) {
				temp.signup();
			}else if(select == 2) {
				temp.login();
			}else {
				System.out.println("----> 없는 메뉴입니다");
			}
			
		}

	}
}
