package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Day11_03 {

	public static ArrayList<Account> accountList = new ArrayList<Account>();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ATM atm = null;
		atm = new Account();
		
		while(true) {
			System.out.println("1신한 2국민 3농협 4종료");
			System.out.print("선택 : ");
			int bank = scan.nextInt();
			
			if(bank == 1) {
				System.out.println("----> 신한은행 연결");
				atm = new Sbank();
				atm.menu();
			}
			
			if(bank == 2) {
				System.out.println("----> 신한은행 연결");
				atm = new Kbank();
				atm.menu();
			}
			
			if(bank == 3) {
				System.out.println("----> 신한은행 연결");
				atm = new Nbank();
				atm.menu();
			}
			if(bank == 4) {
				System.out.println("----> 종료");
				atm.exit();
				return;
			}
			
			
		}
		
		
	
		
	}
	
}
