package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_02 {
			
	//List : �÷��� �����ӿ�ũ(�̸� ������� Ŭ����)
	public static ArrayList<Board> boardList = new ArrayList<Board>();
	// => main �ۿ����� ����ϱ� ���ؼ� ����
	
	
	public static Scanner scan = new Scanner(System.in);
	//static : main �����尡 �ڵ带 �о��ִµ� main ������ �ۿ� ������ �� ����
		//=> static ����� ������ ������ �ڵ� ����� ���� �޸� �Ҵ� (��������?)
	
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("===== �Խ��� Ŀ�´�Ƽ ======");
			System.out.println("1.��� 2.�Խù� ���� 3.�Խù� ����"); 
			System.out.print("���� : "); int select = scan.nextInt();
			
			//��� �Խù� ���
			System.out.println("��ȣ\t����\t\t\t�ۼ���\t��ȸ��");
			for(int i=0;i<boardList.size();i++) {
				Board tmp = boardList.get(i);
				System.out.print(i+"\t");
				tmp.printBoard();
			}
			
			if(select==1) {
				Board temp = new Board();
				temp.boardAdd(); 
			}else if(select==2) {
				System.out.print("----> �Խù� ��ȣ : ");
				int no = scan.nextInt();
				Board temp = new Board();
				temp.getBoard(no);
				
				
			}else if(select==3) {
				System.out.println("----> ������ �Խù� ��ȣ : ");
				int no = scan.nextInt();
				Board temp = new Board();
				temp.boardDelete(no);
			}
		}
		
		
	}
	
	
}
