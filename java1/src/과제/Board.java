package 과제;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {
	String title;
	String content;
	String writer;
	Date date;
	int count;
	
	//기본 생성자
	public Board() {}
	
	public Board(String title, String content, String id) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.content = content;
		this.writer = id;
		this.date = new Date();
		this.count = 0;
	}
	
	public void addBoard(String id) {
		//게시물 작성
		Scanner scan = new Scanner(System.in);
		System.out.println("----> 게시물 작성");
		System.out.print("제목 : ");
		String t = scan.nextLine();
		System.out.print("내용 : ");
		String c = scan.nextLine();
		
		Board temp = new Board(t,c,id);
		EX1.boardList.add(temp);
		System.out.println("----> 게시물 등록");
	}
	
	public void getBoard(int no) {
		//상세보기
		Board temp = EX1.boardList.get(no);
		temp.boardCount();
		
		//Date 포맷 설정
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println("[제목] "+temp.title+"\t\t[조회수] "+temp.count);
		System.out.println("[내용] "+temp.content);
		System.out.println("[작성일] "+date.format(temp.date)+"\t[작성자] "+temp.writer);
	}
	
	public void boardCount() {
		//조회수 증가
		this.count++;
	}
	
	public void getBoardList() {
		//게시물 리스트 출력
		System.out.println("================= 게시물 목록 =================");
		for(int i=0;i<EX1.boardList.size();i++) {
			Board temp = EX1.boardList.get(i);
			System.out.println("["+i+"]"+" 제목 : "+temp.title+"\t 작성자 : "+temp.writer+"\t 조회수 : "+temp.count);
		}
	}
	public void deleteBoard(int no) {
		//게시물 삭제
		EX1.boardList.remove(no);
		System.out.println("----> 게시물 삭제 완료");
		
	}
	public void updateBoard(int no) {
		//게시물 수정
		Scanner scan = new Scanner(System.in);
		System.out.println("----> 게시물 수정");
		System.out.print("제목 : ");
		EX1.boardList.get(no).title = scan.nextLine();
		System.out.print("내용 : ");
		EX1.boardList.get(no).title = scan.nextLine();
		EX1.boardList.get(no).date = new Date();
		System.out.println("----> 수정 완료");
	}
	
}
