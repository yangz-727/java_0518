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
			System.out.println("1계좌등록 2예금 3출금 4잔고 5종료");
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
		System.out.println("----> 계좌등록");
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("----> 예금");
		int result = findAccount();
		System.out.println("----> "+result);
		if(result == -1) return;
		else {
			System.out.print("금액 : ");
			int deposit = Day11_03.scan.nextInt();
			Day11_03.accountList.get(result).money+=deposit;
			System.out.println("-----> 입금 성공");
			System.out.println("----> 잔고 : "+Day11_03.accountList.get(result).money);
		}
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("----> 출금");
		int result = findAccount();
		if(result == -1) return;
		else {
			System.out.print("금액 : ");
			int deposit = Day11_03.scan.nextInt();
			if(Day11_03.accountList.get(result).money<deposit) {
				System.out.println("----> 잔고가 부족합니다");
				return;
			}else {
				Day11_03.accountList.get(result).money-=deposit;
				System.out.println("----> 출금 성공");
			}
		}
	}
	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("----> 잔고");
		int result = findAccount();
		if(result == -1) return;
		else {
			System.out.println("----> 잔고 : "+Day11_03.accountList.get(result).money);
		}
	}

	@Override
	public int findAccount() {
		// TODO Auto-generated method stub
		System.out.print("계좌 : ");
		String num = Day11_03.scan.next();
		
		for(int i=0; i<Day11_03.accountList.size();i++) {
			Account temp = Day11_03.accountList.get(i);
			if(temp.number.equals(num)) {
				return i;
			}
		}
		System.out.println("----> 동일한 계좌가 없습니다.");
		return -1;

	}
}
