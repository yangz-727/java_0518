package Day11;

public class Nbank extends Account {

	int code=03;
	
	public Nbank() {
		// TODO Auto-generated constructor stub
	}
	
	public Nbank(String number, int money) {
		super(number, money);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("----> 丑区篮青 拌谅 殿废");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("----> 丑区篮青 抗陛");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("----> 丑区篮青 免陛");
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("----> 丑蛆篮青 儡绊 : "+this.money);
	}
	
}
