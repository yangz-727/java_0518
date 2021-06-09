package Day07;

public class Day07_03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 메모리 할당 => 컴퓨터 저장
			//1. 변수 => 자료형 : int num; ( 4byte 메모리 할당 )   
			//2. 배열 : 동일한 자료형의 여러개의 변수 관리
				// int[] arr = new int[3] ( 3*4byte 메모리 할당 )
		
		//회원가입
			//아이디 String
			//비밀번호 String
			//이름 String
			//이메일 String
			//전화번호 int
		
		//클래스(설계) => 서로 다른 자료형을 하나로 묶음
		
		//예1 : 변수만 사용
			String id1 = "asdf";
			String pew1 = "asdf";
			String name1 = "asdf";
			String email1 = "asdf";
			String phone1 = "asdf";
			
		//예2 : 2차원 배열 회원가입 만들기
			String[][] user = new String[100][5];
			user[0][0] = "qwe";
			user[0][1] = "qwe";
			user[0][2] = "qwe";
			user[0][3] = "qwe";
			user[0][4] = "qwe";
			
		//예3 : 클래스 회원가입 만들기
		User user1 = new User();
		user1.id="qer";
		user1.password="asdf";
		user1.name = "asdf";
		user1.email = "afsdfdsa";
		user1.phone=1023143;
		
		//예4 : 게시판
			//1.게시물 번호
			//2. 게시물 제목
			//3. 게시물 내용
			//4. 작성자
			//5. 별점
			//6. 작성일
		//====> 게시판 클래스
	}

}
