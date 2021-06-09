package Day10;

import java.util.ArrayList;

public class Day10_03 {

	//계좌 클래스에게 상속받아 2개의 은행 클래스 생성
	//각 3개의 객체를 생성
	//모든  계좌를 담을 수 있는 하나의 리스트에 저장
	
	/*
	 * 계좌 클래스 : 계좌, 금액, 생성자, 입출금
	 * 신한은행 클래스 : 은행코드 ,입출금
	 * 국민은행 클래스 : 은행코드 ,입출금
	 */
	
	public static void main(String[] args) {
		Account ac1 = new Account("1111",1000);
		Sbank  ac2 = new Sbank("2222", 2000);
		Kbank ac3 = new Kbank("3333", 3000);
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		
		accountList.add(ac1);
		accountList.add(ac2);
		accountList.add(ac3);
		
		accountList.get(0).input(500);
		accountList.get(1).input(500);
		accountList.get(2).input(500);
		
		accountList.get(0).output(300);
		accountList.get(1).output(300);
		accountList.get(2).output(300);
		
		System.out.println(accountList.get(0).money);
		System.out.println(accountList.get(1).money);
		System.out.println(accountList.get(2).money);
		
	}
	
	
}
