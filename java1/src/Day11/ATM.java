package Day11;

public interface ATM {
	
	//추상메소드
	public void apply();
	public void deposit();
	public void withdraw();
	public void money();
	public void menu();
	public int findAccount();
	
	//디폴트메소드
	public default void exit() {
		System.out.println("----> ATM 종료");
	}
	
	
	
}
