package Day11;

public interface Remote {

	int max =10;
	int min = 0;
	
	//�߻� �޼ҵ� ���� X
	public void ����();
	public void ����();
	public void ���弳��(int sound);
	
	
	// ����Ʈ �޼ҵ�
	public default void ä�κ���() {
		System.out.println("ä�κ���");
	}
	
}
