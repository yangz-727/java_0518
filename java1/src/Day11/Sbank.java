package Day11;

public class Sbank extends Account {
	

	int code = 01;
	
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		super.menu();
	}
	
	
	public Sbank() {
	
		// TODO Auto-generated constructor stub
	}
	
	public Sbank(String number, int money) {
		super(number, money);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("----> 신한은행 계좌 등록");
		System.out.println("계좌번호 : ");
		String num = Day11_03.scan.next();
		//리스트에 넣기
		Day11_03.accountList.add(new Sbank(num,0));
		System.out.println("----> 계좌등록 완료");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
		
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		super.withdraw();
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		super.money();
	}
	
	
}
