package ����;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {
	String title;
	String content;
	String writer;
	Date date;
	int count;
	
	//�⺻ ������
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
		//�Խù� �ۼ�
		Scanner scan = new Scanner(System.in);
		System.out.println("----> �Խù� �ۼ�");
		System.out.print("���� : ");
		String t = scan.nextLine();
		System.out.print("���� : ");
		String c = scan.nextLine();
		
		Board temp = new Board(t,c,id);
		EX1.boardList.add(temp);
		System.out.println("----> �Խù� ���");
	}
	
	public void getBoard(int no) {
		//�󼼺���
		Board temp = EX1.boardList.get(no);
		temp.boardCount();
		
		//Date ���� ����
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println("[����] "+temp.title+"\t\t[��ȸ��] "+temp.count);
		System.out.println("[����] "+temp.content);
		System.out.println("[�ۼ���] "+date.format(temp.date)+"\t[�ۼ���] "+temp.writer);
	}
	
	public void boardCount() {
		//��ȸ�� ����
		this.count++;
	}
	
	public void getBoardList() {
		//�Խù� ����Ʈ ���
		System.out.println("================= �Խù� ��� =================");
		for(int i=0;i<EX1.boardList.size();i++) {
			Board temp = EX1.boardList.get(i);
			System.out.println("["+i+"]"+" ���� : "+temp.title+"\t �ۼ��� : "+temp.writer+"\t ��ȸ�� : "+temp.count);
		}
	}
	public void deleteBoard(int no) {
		//�Խù� ����
		EX1.boardList.remove(no);
		System.out.println("----> �Խù� ���� �Ϸ�");
		
	}
	public void updateBoard(int no) {
		//�Խù� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("----> �Խù� ����");
		System.out.print("���� : ");
		EX1.boardList.get(no).title = scan.nextLine();
		System.out.print("���� : ");
		EX1.boardList.get(no).title = scan.nextLine();
		EX1.boardList.get(no).date = new Date();
		System.out.println("----> ���� �Ϸ�");
	}
	
}
