package Day11;

public interface ATM {
	
	//�߻�޼ҵ�
	public void apply();
	public void deposit();
	public void withdraw();
	public void money();
	public void menu();
	public int findAccount();
	
	//����Ʈ�޼ҵ�
	public default void exit() {
		System.out.println("----> ATM ����");
	}
	
	
	
}
