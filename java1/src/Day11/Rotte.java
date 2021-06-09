package Day11;

public class Rotte implements Kiosk{

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("----> 롯데리아 메뉴");
	}

	@Override
	public void bascket() {
		// TODO Auto-generated method stub
		System.out.println("----> 현재 구매 상품");
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("----> 결제 예정 상품");
	}
	
}
