package Day11;

import java.util.Scanner;

public class Day11_02 {

	// extends : ���
	// implements : �������̽� ����
	
	public static void main(String[] args) {
		//interface ��ü ���� 
		Kiosk kiosk = null;
		Scanner  scan = new Scanner(System.in);
		System.out.println("1.�Ե����� 2.ī��");
		System.out.print("���� : ");
		int connect = scan.nextInt();
		
		if(connect == 1) kiosk = new Rotte();
		if(connect == 2) kiosk = new Cafe();
		
		while(true) {
			System.out.println("====== Ű����ũ =====");
			System.out.println("1�޴� 2��ٱ��� 3���� 4����");
			System.out.print("���� : ");
			int select = scan.nextInt();
			if(select == 1) kiosk.menu();
			if(select == 2) kiosk.bascket();
			if(select == 3) kiosk.pay();
			if(select == 4) {
				kiosk.exit();	
				break;
			}
		}
	}
	
	
}
