package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day17_03 {

	public static Queue<String> jongjum = new LinkedList<>();
	public static Queue<String> youngsan = new LinkedList<>();
	public static Queue<String> seoul = new LinkedList<>();
	public static Queue<String> guro = new LinkedList<>();
	
	public static ArrayList<Queue<String>> state = new ArrayList<Queue<String>>();
	
	
	public static void main(String[] args) {
		
		
		//Queue ( �������̽� )
			//1. ��ö �о��
			//2. �� : ������ => ��� => ���� => ����
			//3. ������ : ��ö 3���� ��ü
			//4. 3�ʸ��� �ϳ��� �� �̵�
			
			state.add(jongjum);
			state.add(youngsan);
			state.add(seoul);
			state.add(guro);
		
			state.get(0).offer("��ö1");
			state.get(0).offer("��ö2");
			state.get(0).offer("��ö3");
			
			Scanner scan = new Scanner(System.in);
			
			
			while(true) {
				System.out.println("========= ���� ��ö�� ��Ȳ =======");
				getState();
				System.out.println("��ö ��� ��ȣ");
				System.out.println("1���� 2��� 3���� 4����");
				System.out.print("���� : ");
				int select = scan.nextInt();
				
				if(select == 1) jmove();
				if(select == 2) ymove();
				if(select == 3) smove();
				if(select == 4) gmove();
				
				
			}
			
			
	}// main end
	
	
	
	//��ö ��Ȳ �޼ҵ�
	public static void getState() {
		System.out.println("���� �������� ��ö �� : "+state.get(0));
		System.out.println("���� ��꿪�� ��ö �� : "+state.get(1));
		System.out.println("���� ���￪�� ��ö �� : "+state.get(2));
		System.out.println("���� ���ο��� ��ö �� : "+state.get(3));
	}
	
	public static void jmove() {
		try {
			if(state.get(0).isEmpty()) {
				System.out.println("����� ��ö�� �����ϴ�");
				return;
			}
			System.out.println("3�� �� ~~~");
			Thread.sleep(3000); // 3�� ����
			state.get(1).offer(state.get(0).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void ymove() {
		try {
			if(state.get(1).isEmpty()) {
				System.out.println("����� ��ö�� �����ϴ�");
				return;
			}
			System.out.println("3�� �� ~~~");
			Thread.sleep(3000); // 3�� ����
			state.get(2).offer(state.get(1).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void smove() {
		try {
			if(state.get(2).isEmpty()) {
				System.out.println("����� ��ö�� �����ϴ�");
				return;
			}
			System.out.println("3�� �� ~~~");
			Thread.sleep(3000); // 3�� ����
			state.get(3).offer(state.get(2).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void gmove() {
		try {
			if(state.get(3).isEmpty()) {
				System.out.println("����� ��ö�� �����ϴ�");
				return;
			}
			System.out.println("3�� �� ~~~");
			Thread.sleep(2000); // 3�� ����
			state.get(0).offer(state.get(3).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
