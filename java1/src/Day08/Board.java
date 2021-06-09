package Day08;

import java.util.Scanner;

public class Board {
	

	Scanner scan  = new Scanner(System.in);
	
	// int no; ==> ����Ʈ�� �ε���
	String title;
	String content;
	String name;
	int count;
	
	//�Ű������� ������ �����ڸ� �ϳ��� �����ߴٸ�, �⺻ �����ڴ� �ڵ����� �߰����� �ʴ´�
	// �����ڰ� �ϳ��� ���� ��� �⺻ ������ �ڵ� ���� 
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	//��� �ʵ带 ���� ������
	public Board(String title, String content, String name, int count) {
		this.title = title;
		this.content = content;
		this.name = name;
		this.count = count;
	}
	
	//�޼ҵ�
	public void boardAdd() {
		System.out.println("-----> �Խù� ���");
		System.out.print("���� : ");
		String t =scan.next();
		System.out.print("���� : ");
		String c =scan.next();
		System.out.print("�ۼ��� : ");
		String a =scan.next();
		
		//��ü ���� : �Է°��� �������� �μ��� �־��ֱ�
			//�Խù� ��ȣ : ����Ʈ�� ����� �� ��ü���� +1
		Board temp = new Board( t, c, a, 0);
		
		//���� �Խù� �������ִ� ����Ʈ�� ����
		Day08_02.boardList.add(temp);
		System.out.println("����� �Ǿ����ϴ�.");
		
	}
	public void boardDelete(int no){
		Day08_02.boardList.remove(no);
		System.out.println("------>"+(no)+"�� �Խù��� �����Ǿ����ϴ�");
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
		System.out.println("-------> �Խù� ��������");
		System.out.println("���� : "+temp.title+"\t��ȸ�� : "+temp.count);
		System.out.println("���� : "+temp.count);
		
	}
	
	
}
