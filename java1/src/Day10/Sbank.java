package Day10;

public class Sbank extends Account{
	
	int code;
	
	public Sbank(String number, int money) {
		super(number, money);
		this.code = 01;
	}
	@Override
	public void input(int money) {
		// TODO Auto-generated method stub
		System.out.println("----> �������� �Ա�");
		super.input(money);
	}
	@Override
	public void output(int money) {
		// TODO Auto-generated method stub
		System.out.println("----> �������� ���");
		super.output(money);
	}
}
