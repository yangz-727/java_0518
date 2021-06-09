package Day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day09_02 {
	
	/*
	 * 클래스 설계 => 객체 생성 => 객체 관리[DB, 파일, 컬렉션, 배열등 등] => CRUD
	 * 1. 회원 설계 : 아이디[식별자] 비밀번호 이름 주소, 
	 * 				생성자: 선택
	 * 				메소드 : 회원가입, 로그인, 아이디 찾기, 비밀번호 찾기, 내 도서목록, 회원수정 등
	 * 
	 * 2. 도서 설계 : ISBN[식별자], 도서명, 저자, 대여유무
	 * 				생성자 : 선택
	 * 				메소드 : 도서등록, 도서삭제, 도서목록, 도서변경, 대여, 반납 등
	 * 
	 * 3. 로그인 성공시 메뉴
	 * 		도서목록, 도서수정, 대여, 반납, 내도서보기, 회원수정 종료
	 * 
	 * 4. 관리자메뉴 아이디 => admin 이면 메소드 별도 사용
	 * 		1. 도서 등록 2.두서수정 3.도서삭제 4.회원목록
	 * 
	 */
	
	//객체 관리 컬렉션 => List 컬렉션
	public static ArrayList<User> userList = new ArrayList<User>();
	public static ArrayList<Book> bookList = new ArrayList<Book>();
	public static Scanner scan = new Scanner(System.in);
	
	//메인 스레드 메소드
	public static void main(String[] args) {
		//도서 관리 프로그램
		//프로그램 실행
		run();
	}

	
	//메소드
	//main이 먼저 실행되기 때문에 static 사용
	//static : 메모리에 고정적으로 우선 할당되어, 프로그램이 종료될 때 해제되는 변수 ( main 메소드 별개로 우선할당)
	// => 전체 프로그램 종료시 초기화
	//static을 너무 많이 사용하면 메모리 사용량 증가]
	// 전체 프로그램에 영향, 사용되는 변수/메소드에 할당
	
	public static void run() {
		while(true) {
			System.out.println("======= 도서 관리 프로그램 =======");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				User temp = new User(); //임시 객체
				temp.addUser();
			}else if(select == 2) {
				User temp = new User(); //임시 객체
				temp.login();
				
			}else if(select ==3) {
				User temp = new User(); //임시 객체
				temp.findId();
			}else if(select == 4){
				User temp = new User(); //임시 객체
				temp.findPassword();
			}else if(select == 5){
				System.out.println("----> 프로그램 종료");
				break;
			}else {
				System.out.println("----> 잘못된 번호입니다.");
			}
			
		}//while
	}//run()
	
}//class


