package Day11;

public class Kbank extends Account{

	int code = 02;
	
	public Kbank() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		super.menu();
	}
	
	public Kbank(String number, int money) {
		super(number, money);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("----> �������� ���� ���");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("----> �������� ����");
	}

	
	
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("----> �������� ���");
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("----> �������� �ܰ� : "+this.money);
	}

}
