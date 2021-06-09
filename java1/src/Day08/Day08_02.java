package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_02 {
			
	//List : 컬렉션 프레임워크(미리 만들어진 클래스)
	public static ArrayList<Board> boardList = new ArrayList<Board>();
	// => main 밖에서도 사용하기 위해서 선언
	
	
	public static Scanner scan = new Scanner(System.in);
	//static : main 스레드가 코드를 읽어주는데 main 스레드 밖에 있으면 못 읽음
		//=> static 선언시 스레드 별개로 코드 실행시 먼저 메모리 할당 (전역변수?)
	
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("===== 게시판 커뮤니티 ======");
			System.out.println("1.등록 2.게시물 보기 3.게시물 삭제"); 
			System.out.print("선택 : "); int select = scan.nextInt();
			
			//모든 게시물 출력
			System.out.println("번호\t제목\t\t\t작성자\t조회수");
			for(int i=0;i<boardList.size();i++) {
				Board tmp = boardList.get(i);
				System.out.print(i+"\t");
				tmp.printBoard();
			}
			
			if(select==1) {
				Board temp = new Board();
				temp.boardAdd(); 
			}else if(select==2) {
				System.out.print("----> 게시물 번호 : ");
				int no = scan.nextInt();
				Board temp = new Board();
				temp.getBoard(no);
				
				
			}else if(select==3) {
				System.out.println("----> 삭제할 게시물 번호 : ");
				int no = scan.nextInt();
				Board temp = new Board();
				temp.boardDelete(no);
			}
		}
		
		
	}
	
	
}
