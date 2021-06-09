package Day08;

import java.util.Scanner;

public class Board {
	

	Scanner scan  = new Scanner(System.in);
	
	// int no; ==> 리스트의 인덱스
	String title;
	String content;
	String name;
	int count;
	
	//매개변수를 가지는 생성자를 하나라도 정의했다면, 기본 생성자는 자동으로 추가되지 않는다
	// 생성자가 하나도 없는 경우 기본 생성자 자동 생성 
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	//모든 필드를 받은 생성자
	public Board(String title, String content, String name, int count) {
		this.title = title;
		this.content = content;
		this.name = name;
		this.count = count;
	}
	
	//메소드
	public void boardAdd() {
		System.out.println("-----> 게시물 등록");
		System.out.print("제목 : ");
		String t =scan.next();
		System.out.print("내용 : ");
		String c =scan.next();
		System.out.print("작성자 : ");
		String a =scan.next();
		
		//객체 생성 : 입력값을 생성자의 인수로 넣어주기
			//게시물 번호 : 리스트의 저장된 총 객체수의 +1
		Board temp = new Board( t, c, a, 0);
		
		//여러 게시물 관리해주는 리스트에 저장
		Day08_02.boardList.add(temp);
		System.out.println("등록이 되었습니다.");
		
	}
	public void boardDelete(int no){
		Day08_02.boardList.remove(no);
		System.out.println("------>"+(no)+"번 게시물이 삭제되었습니다");
	}
	public void boardCount() {
		this.count++;
	}
	public void printBoard() {
		System.out.println(this.title+"\t"+this.name+"\t"+this.count+"\t");
	}
	public void getBoard(int no) {
		Board temp = Day08_02.boardList.get(no);
		temp.boardCount();
		System.out.println("-------> 게시물 상세페이지");
		System.out.println("제목 : "+temp.title+"\t조회수 : "+temp.count);
		System.out.println("내용 : "+temp.count);
		
	}
	
	
}
