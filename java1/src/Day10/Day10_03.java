package Day10;

import java.util.ArrayList;

public class Day10_03 {

	//���� Ŭ�������� ��ӹ޾� 2���� ���� Ŭ���� ����
	//�� 3���� ��ü�� ����
	//���  ���¸� ���� �� �ִ� �ϳ��� ����Ʈ�� ����
	
	/*
	 * ���� Ŭ���� : ����, �ݾ�, ������, �����
	 * �������� Ŭ���� : �����ڵ� ,�����
	 * �������� Ŭ���� : �����ڵ� ,�����
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
