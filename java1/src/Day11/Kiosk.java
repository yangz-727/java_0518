package Day11;

public interface Kiosk {
	public void menu();
	public void bascket();
	public void pay();
	
	public default void exit() {
		
		System.out.println("키오스크 종료");
	}
}
