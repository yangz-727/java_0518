package Day10;

public class Kbank extends Account{

	int code;
	
	public Kbank(String number, int money) {
		super(number, money);
		this.code = 02;
		// TODO Auto-generated constructor stub
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
