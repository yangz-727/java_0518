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
			System.out.println("1���� 2���� 3���� 4����");
			System.out.print("���� : ");
			int bank = scan.nextInt();
			
			if(bank == 1) {
				System.out.println("----> �������� ����");
				atm = new Sbank();
				atm.menu();
			}
			
			if(bank == 2) {
				System.out.println("----> �������� ����");
				atm = new Kbank();
				atm.menu();
			}
			
			if(bank == 3) {
				System.out.println("----> �������� ����");
				atm = new Nbank();
				atm.menu();
			}
			if(bank == 4) {
				System.out.println("----> ����");
				atm.exit();
				return;
			}
			
			
		}
		
		
	
		
	}
	
}
