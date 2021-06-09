package Day11;

public class Account implements ATM {
	
	String number;
	int money;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String number, int money) {
		this.number = number;
		this.money = money;
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1���µ�� 2���� 3��� 4�ܰ� 5����");
			int menu = Day11_03.scan.nextInt();
			if(menu == 1) apply();
			if(menu == 2) deposit();
			if(menu == 3) withdraw();
			if(menu == 4) money();
			if(menu == 5) return;
		}
		
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("----> ���µ��");
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("----> ����");
		int result = findAccount();
		System.out.println("----> "+result);
		if(result == -1) return;
		else {
			System.out.print("�ݾ� : ");
			int deposit = Day11_03.scan.nextInt();
			Day11_03.accountList.get(result).money+=deposit;
			System.out.println("-----> �Ա� ����");
			System.out.println("----> �ܰ� : "+Day11_03.accountList.get(result).money);
		}
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("----> ���");
		int result = findAccount();
		if(result == -1) return;
		else {
			System.out.print("�ݾ� : ");
			int deposit = Day11_03.scan.nextInt();
			if(Day11_03.accountList.get(result).money<deposit) {
				System.out.println("----> �ܰ� �����մϴ�");
				return;
			}else {
				Day11_03.accountList.get(result).money-=deposit;
				System.out.println("----> ��� ����");
			}
		}
	}
	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("----> �ܰ�");
		int result = findAccount();
		if(result == -1) return;
		else {
			System.out.println("----> �ܰ� : "+Day11_03.accountList.get(result).money);
		}
	}

	@Override
	public int findAccount() {
		// TODO Auto-generated method stub
		System.out.print("���� : ");
		String num = Day11_03.scan.next();
		
		for(int i=0; i<Day11_03.accountList.size();i++) {
			Account temp = Day11_03.accountList.get(i);
			if(temp.number.equals(num)) {
				return i;
			}
		}
		System.out.println("----> ������ ���°� �����ϴ�.");
		return -1;

	}
}
