package Day11;

import java.util.Scanner;

public class Day11_02 {

	// extends : 상속
	// implements : 인터페이스 연결
	
	public static void main(String[] args) {
		//interface 객체 생성 
		Kiosk kiosk = null;
		Scanner  scan = new Scanner(System.in);
		System.out.println("1.롯데리아 2.카페");
		System.out.print("선택 : ");
		int connect = scan.nextInt();
		
		if(connect == 1) kiosk = new Rotte();
		if(connect == 2) kiosk = new Cafe();
		
		while(true) {
			System.out.println("====== 키오스크 =====");
			System.out.println("1메뉴 2장바구니 3결제 4종료");
			System.out.print("선택 : ");
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
