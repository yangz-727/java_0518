package 과제;

import java.util.ArrayList;
import java.util.Scanner;

public class EX1 {

	public static ArrayList<User> userList = new ArrayList<User>();
	public static ArrayList<Board> boardList = new ArrayList<Board>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//메뉴 선택
			System.out.println("1.회원가입 2.로그인 3.종료");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				//회원가입
				User user = new User();
				user.addUser();
			}else if(select == 2) {
				//로그인
				while(true) {
					System.out.println("----> 로그인");
					System.out.print("ID : ");
					String id = scan.next();
					System.out.print("PASSWORD : ");
					String password = scan.next();
					
					User user = new User();
					boolean login = user.login(id,password);
					
					//로그인 성공
					while(login) {
						Board temp = new Board();
						System.out.println();
						temp.getBoardList();
						System.out.println();
						
						System.out.println("1.회원목록 2.게시물 작성 3.상세보기 4.회원수정 5.회원탈퇴 6.로그아웃");
						System.out.print("선택 : ");
						int select2 = scan.nextInt();
						
						if(select2 == 1) {
							//회원목록 출력
							System.out.println("~ 회원 목록 ~");
							for(int i=0;i<userList.size();i++) {
								System.out.println(i+") "+userList.get(i).id);
							}
						}else if(select2 == 2) {
							//게시물 작성
							temp.addBoard(id);
						}else if(select2 == 3) {
							System.out.println("----> 상세보기");
							System.out.print("게시물 번호 : ");
							int no = scan.nextInt();
							temp.getBoard(no);
							if(boardList.get(no).writer.equals(id)) {
								while(true) {
									System.out.println("1.게시물 삭제 2.게시물 수정 3.뒤로가기");
									System.out.print("선택 : ");
									int select3 = scan.nextInt();
									
									if(select3 == 1) {
										temp.deleteBoard(no);
									}else if(select3 == 2){
										temp.updateBoard(no);
									}else if(select3==3) {
										break;
									}else {
										System.out.println("----> 없는 메뉴입니다");
									}
								}
							}
						}else if(select2 == 4) {
							//회원수정
							user.updateUser(id);
						}else if(select2 == 5) {
							//회원탈퇴
							user.deleteUser(id);
							login = false;
						}else if(select2 == 6) {
							//로그아웃
							login = false;
						}else {
							System.out.println("----> 없는 메뉴입니다");
						}
					}
					
					//로그아웃
					if(login == false) {
						break;
					}
					
					
				}
				
			}else if(select==3){
				//종료
				System.out.println("----> 종료");
				break;
			}else {
				System.out.println("----> 없는 메뉴입니다");
			}
			
			
		} //while 1
		
		
	}//main
}//class
