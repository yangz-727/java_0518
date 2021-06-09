package Day11;

public class Cafe implements Kiosk {

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("----> 카페 메뉴");
	}

	@Override
	public void bascket() {
		// TODO Auto-generated method stub
		System.out.println("----> 카페 구매 상품");
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("----> 카페 결제 상품");
	}

}
