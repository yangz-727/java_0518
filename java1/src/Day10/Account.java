package Day10;

public class Account {
	String number;
	int money;
	
	public Account(String number, int money) {
		this.number = number;
		this.money = money;
	}
	
	public void input(int money) {
		this.money += money;
		System.out.println("�ԱݿϷ�");
		
	}
	
	public void output(int money) {
		this.money -= money;
		System.out.println("��ݿϷ�");
	}
	
}
